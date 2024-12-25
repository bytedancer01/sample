package org.apache.commons.net.ftp.parser;

import java.util.Calendar;
import org.apache.commons.net.ftp.Configurable;
import org.apache.commons.net.ftp.FTPClientConfig;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/apache/commons/net/ftp/parser/ConfigurableFTPFileEntryParserImpl.class
 */
/* loaded from: combined.jar:classes2.jar:org/apache/commons/net/ftp/parser/ConfigurableFTPFileEntryParserImpl.class */
public abstract class ConfigurableFTPFileEntryParserImpl extends RegexFTPFileEntryParserImpl implements Configurable {
    private final FTPTimestampParser timestampParser;

    public ConfigurableFTPFileEntryParserImpl(String str) {
        super(str);
        this.timestampParser = new FTPTimestampParserImpl();
    }

    public ConfigurableFTPFileEntryParserImpl(String str, int i10) {
        super(str, i10);
        this.timestampParser = new FTPTimestampParserImpl();
    }

    @Override // org.apache.commons.net.ftp.Configurable
    public void configure(FTPClientConfig fTPClientConfig) {
        if (this.timestampParser instanceof Configurable) {
            FTPClientConfig defaultConfiguration = getDefaultConfiguration();
            if (fTPClientConfig == null) {
                ((Configurable) this.timestampParser).configure(defaultConfiguration);
                return;
            }
            if (fTPClientConfig.getDefaultDateFormatStr() == null) {
                fTPClientConfig.setDefaultDateFormatStr(defaultConfiguration.getDefaultDateFormatStr());
            }
            if (fTPClientConfig.getRecentDateFormatStr() == null) {
                fTPClientConfig.setRecentDateFormatStr(defaultConfiguration.getRecentDateFormatStr());
            }
            ((Configurable) this.timestampParser).configure(fTPClientConfig);
        }
    }

    public abstract FTPClientConfig getDefaultConfiguration();

    public Calendar parseTimestamp(String str) {
        return this.timestampParser.parseTimestamp(str);
    }
}
