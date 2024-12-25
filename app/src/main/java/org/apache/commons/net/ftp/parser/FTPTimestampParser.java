package org.apache.commons.net.ftp.parser;

import java.util.Calendar;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/apache/commons/net/ftp/parser/FTPTimestampParser.class
 */
/* loaded from: combined.jar:classes2.jar:org/apache/commons/net/ftp/parser/FTPTimestampParser.class */
public interface FTPTimestampParser {
    public static final String DEFAULT_RECENT_SDF = "MMM d HH:mm";
    public static final String DEFAULT_SDF = "MMM d yyyy";

    Calendar parseTimestamp(String str);
}
