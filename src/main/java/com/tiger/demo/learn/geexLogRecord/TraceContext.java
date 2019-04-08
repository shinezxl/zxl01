package com.tiger.demo.learn.geexLogRecord;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class TraceContext implements Serializable{

    private static ThreadLocal<String> TRACE_ID = new InheritableThreadLocal();
    private static ThreadLocal<String> ORIGIN_IP = new InheritableThreadLocal();
    private static ThreadLocal<String> SERVICE_IP = new InheritableThreadLocal();
    private static ThreadLocal<String> SERVICE_NAME = new InheritableThreadLocal();
    private static ThreadLocal<String> AD_ACCOUNT = new InheritableThreadLocal();
    private static ThreadLocal<String> LOG_LEVEL = new InheritableThreadLocal();
    private static ThreadLocal<Long> DEPTH = new InheritableThreadLocal();
    private static ThreadLocal<List<RequestLoggerELKBody>> SPANS = new InheritableThreadLocal();

    private TraceContext() {
    }

    public static void setTraceId(String traceId) {
        TRACE_ID.set(traceId);
    }

    public static String getTraceId() {
        return (String)TRACE_ID.get();
    }

    public static void setOriginIP(String originIP) {
        ORIGIN_IP.set(originIP);
    }

    public static String getOriginIP() {
        return (String)ORIGIN_IP.get();
    }

    public static void setServiceIP(String serviceIP) {
        SERVICE_IP.set(serviceIP);
    }

    public static String getServiceIP() {
        return (String)SERVICE_IP.get();
    }

    public static void setServiceName(String serviceName) {
        SERVICE_NAME.set(serviceName);
    }

    public static String getServiceName() {
        return (String)SERVICE_NAME.get();
    }

    public static String getLogLevel() {
        return (String)LOG_LEVEL.get();
    }

    public static void setLogLevel(String logLevel) {
        LOG_LEVEL.set(logLevel);
    }

    public static Long getDepth() {
        return (Long)DEPTH.get();
    }

    public static void setDepth(Long depth) {
        DEPTH.set(depth);
    }

    public static void increaseDepth() {
        if (DEPTH.get() == null) {
            DEPTH.set(0L);
        } else {
            DEPTH.set(((Long)DEPTH.get()).longValue() + 1L);
        }
    }

    public static void addSpan(RequestLoggerELKBody span) {
        ((List)SPANS.get()).add(span);
    }

    public static List<RequestLoggerELKBody> getSpans() {
        return (List)SPANS.get();
    }

    public static void clear() {
        TRACE_ID.remove();
        ORIGIN_IP.remove();
        SERVICE_IP.remove();
        AD_ACCOUNT.remove();
        SPANS.remove();
        SERVICE_NAME.remove();
        LOG_LEVEL.remove();
        DEPTH.remove();
    }

    public static String getAdAccount() {
        return (String)AD_ACCOUNT.get();
    }

    public static void setAdAccount(String adAccount) {
        AD_ACCOUNT.set(adAccount);
    }

    public static void start() {
        SPANS.set(new ArrayList());
    }

}
