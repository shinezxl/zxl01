package com.tiger.demo.learn.geexLogRecord;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

public class RequestLoggerELKBody implements Serializable{
    private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss,SSS");
    private String funcName;
    private String serviceName;
    private Long processMillis;
    private String params;
    private String result;
    private String create;
    private String traceId;
    private String type;
    private String message;
    private String exception;
    private String originIP;
    private String serviceIP;
    private String adAccount;
    private String logLevel;
    private Long depth = 0L;

    public RequestLoggerELKBody() {
        this.create = sdf.format(new Date());
    }

    public static SimpleDateFormat getSdf() {
        return sdf;
    }

    public void setCreate(String create) {
        this.create = create;
    }

    public String getTraceId() {
        return this.traceId;
    }

    public void setTraceId(String traceId) {
        this.traceId = traceId;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getException() {
        return this.exception;
    }

    public void setException(String exception) {
        this.exception = exception;
    }

    public String getCreate() {
        return this.create;
    }

    public String getFuncName() {
        return this.funcName;
    }

    public void setFuncName(String funcName) {
        this.funcName = funcName;
    }

    public Long getProcessMillis() {
        return this.processMillis;
    }

    public void setProcessMillis(Long processMillis) {
        this.processMillis = processMillis;
    }

    public String getParams() {
        return this.params;
    }

    public void setParams(String params) {
        this.params = params;
    }

    public String getResult() {
        return this.result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getServiceName() {
        return this.serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getOriginIP() {
        return this.originIP;
    }

    public void setOriginIp(String originIp) {
        this.originIP = originIp;
    }

    public String getServiceIp() {
        return this.serviceIP;
    }

    public void setServiceIp(String serviceIp) {
        this.serviceIP = serviceIp;
    }

    public String getAdAccount() {
        return this.adAccount;
    }

    public void setAdAccount(String adAccount) {
        this.adAccount = adAccount;
    }

    public String getLogLevel() {
        return this.logLevel;
    }

    public void setLogLevel(String logLevel) {
        this.logLevel = logLevel;
    }

    public Long getDepth() {
        return this.depth;
    }

    public void setDepth(Long depth) {
        this.depth = depth;
    }

    public String toString() {
        return "RequestLoggerELKBody{funcName='" + this.funcName + '\'' + ", serviceName='" + this.serviceName + '\'' + ", processMillis=" + this.processMillis + ", params='" + this.params + '\'' + ", result='" + this.result + '\'' + ", create='" + this.create + '\'' + ", traceId='" + this.traceId + '\'' + ", type='" + this.type + '\'' + ", message='" + this.message + '\'' + ", exception='" + this.exception + '\'' + ", originIP='" + this.originIP + '\'' + ", serviceIP='" + this.serviceIP + '\'' + ", adAccount='" + this.adAccount + '\'' + ", logLevel='" + this.logLevel + '\'' + ", depth='" + this.depth + '\'' + '}';
    }
}
