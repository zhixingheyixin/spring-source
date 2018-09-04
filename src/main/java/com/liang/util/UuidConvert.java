package com.liang.util;

import ch.qos.logback.classic.pattern.ClassicConverter;
import ch.qos.logback.classic.spi.ILoggingEvent;

public class UuidConvert extends ClassicConverter {

    @Override
    public String convert(ILoggingEvent event) {
        return LogUtil.getLogId();
    }
}
