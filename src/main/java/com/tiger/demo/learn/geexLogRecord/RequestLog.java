//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.tiger.demo.learn.geexLogRecord;

import net.sf.json.JSONArray;
import net.sf.json.JSONException;
import net.sf.json.JSONObject;
import org.apache.commons.lang.StringUtils;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.AmqpTemplate;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class RequestLog {
    private static Logger logger = LoggerFactory.getLogger(RequestLog.class);
    private AmqpTemplate amqpTemplate;
    private Boolean isElkInUse;
    private Boolean isLocalLogInUse;
    private String serviceName;

    public RequestLog() {
        this.isLocalLogInUse = true;
        this.isElkInUse = false;
    }

    public RequestLog(Boolean isLocalLogInUse, Boolean isElkInUse, AmqpTemplate amqpTemplate, String serviceName) {
        this.isLocalLogInUse = isLocalLogInUse;
        this.isElkInUse = isElkInUse;
        this.amqpTemplate = amqpTemplate;
        this.serviceName = serviceName;
        TraceContext.setServiceName(this.serviceName);
    }

    public Object writeRequestLog(ProceedingJoinPoint pjp) throws Throwable {
        String methodName = "";
        long start = System.currentTimeMillis();
        RequestLoggerELKBody RequestLogELKBody = new RequestLoggerELKBody();
        if (this.isElkInUse.booleanValue()) {
            RequestLogELKBody.setTraceId(TraceContext.getTraceId());
            RequestLogELKBody.setOriginIp(TraceContext.getOriginIP());
            RequestLogELKBody.setServiceIp(TraceContext.getServiceIP());
            RequestLogELKBody.setServiceName(this.serviceName);
            RequestLogELKBody.setAdAccount(TraceContext.getAdAccount());
            RequestLogELKBody.setLogLevel(TraceContext.getLogLevel());
            TraceContext.increaseDepth();
            RequestLogELKBody.setDepth(TraceContext.getDepth());
            RequestLogELKBody.setLogLevel("DEBUG");
        }

        try {
            Signature sig = pjp.getSignature();
            Object[] args = pjp.getArgs();
            if (sig instanceof MethodSignature) {
                MethodSignature msig = (MethodSignature)sig;
                String[] paramNames = msig.getParameterNames();
                methodName = msig.getName();
                int i;
                String arg;
                if (this.isLocalLogInUse.booleanValue()) {
                    String params = StringUtils.join(paramNames, ", ");
                    logger.info(String.format("Call Method %s(%s)", methodName, params));

                    for(i = 0; i < args.length; ++i) {
                        if (paramNames != null) {
                            arg = this.convertParam(args[i]);
                            logger.info(String.format("%s:%s", paramNames[i], arg));
                        }
                    }
                }

                if (this.isElkInUse.booleanValue()) {
                    RequestLogELKBody.setFuncName(methodName);
                    List<String> paramsList = new ArrayList();

                    for(i = 0; i < args.length; ++i) {
                        if (paramNames != null) {
                            arg = this.convertParam(args[i]);
                            paramsList.add(String.format("%s:%s", paramNames[i], arg));
                        }
                    }

                    RequestLogELKBody.setParams(paramsList.toString());
                }
            }
        } catch (JSONException var29) {
            logger.error("param can not convert to json!");
        } catch (Throwable var30) {
            logger.error("Write Log Error", var30);
        }

        boolean var23 = false;

        Object var34;
        try {
            var23 = true;
            Object retVal = pjp.proceed();

            try {
                String response;
                if (retVal != null) {
                    response = this.convertParam(retVal);
                } else {
                    response = null;
                }

                if (this.isLocalLogInUse.booleanValue()) {
                    logger.info(String.format("Call Method %s Result:%s", methodName, response));
                }

                if (this.isElkInUse.booleanValue()) {
                    RequestLogELKBody.setResult(response);
                }
            } catch (Exception var26) {
                logger.error("Log Error", var26);
            }

            var34 = retVal;
            var23 = false;
        } catch (Throwable var27) {
            logger.error("JoinPoint Process Error", var27);
            throw var27;
        } finally {
            if (var23) {
                try {
                    long time = System.currentTimeMillis() - start;
                    if (this.isLocalLogInUse.booleanValue()) {
                        logger.info(String.format("Call Method %s Process Time:%s", methodName, String.valueOf(time)));
                    }
                } catch (Exception var24) {
                    logger.error(var24.getMessage());
                }

            }
        }

        try {
            long time = System.currentTimeMillis() - start;
            if (this.isLocalLogInUse.booleanValue()) {
                logger.info(String.format("Call Method %s Process Time:%s", methodName, String.valueOf(time)));
            }
        } catch (Exception var25) {
            logger.error(var25.getMessage());
        }

        return var34;
    }

    public void writeExceptionLog(JoinPoint pjp, Throwable e) {
        logger.error(e.getMessage(), e);
    }

    private String convertParam(Object var1) throws JSONException {
        if (var1 == null) {
            return "null";
        } else {
            String res = "";
            if (!var1.getClass().isArray() && !(var1 instanceof List)) {
                if (!(var1 instanceof String) && !(var1 instanceof Boolean) && !(var1 instanceof Integer) && !(var1 instanceof Double) && !var1.getClass().isEnum()) {
                    if (var1 instanceof Serializable) {
                        res = JSONObject.fromObject(var1).toString();
                    }
                } else {
                    res = String.valueOf(var1);
                }
            } else {
                res = JSONArray.fromObject(var1).toString();
            }

            return res;
        }
    }
}
