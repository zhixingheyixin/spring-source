package com.liang.util;


import org.apache.log4j.MDC;

import java.util.UUID;

public class LogUtil {

    private static final String LOG_UUID = "requestId";

    /**
     * 更新日志跟踪id
     *
     * @param logID 日志跟踪id(为空时创建新日志跟踪id)
     */
    public static void updateLogId(String logID) {
        MDC.put(LOG_UUID, logID);
    }

    /**
     * 创建日志跟踪id
     *
     * @return 日志跟踪id
     */
    public static String createLogId() {
        return UUID.randomUUID().toString();
    }

    /**
     * 获取日志跟踪id
     *
     * @return 日志跟踪id
     */
    public static String getLogId() {
        Object object = MDC.get(LOG_UUID);
        if (object == null) {
            return null;
        } else {
            return object.toString();
        }
    }
}
