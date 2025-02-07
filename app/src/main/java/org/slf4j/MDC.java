package org.slf4j;

import java.io.Closeable;
import java.util.Map;
import org.slf4j.helpers.NOPMDCAdapter;
import org.slf4j.helpers.Util;
import org.slf4j.impl.StaticMDCBinder;
import org.slf4j.spi.MDCAdapter;

/* loaded from: combined.jar:classes3.jar:org/slf4j/MDC.class */
public class MDC {
    public static final String NO_STATIC_MDC_BINDER_URL = "http://www.slf4j.org/codes.html#no_static_mdc_binder";
    public static final String NULL_MDCA_URL = "http://www.slf4j.org/codes.html#null_MDCA";
    public static MDCAdapter mdcAdapter;

    /* loaded from: combined.jar:classes3.jar:org/slf4j/MDC$MDCCloseable.class */
    public static class MDCCloseable implements Closeable {
        private final String key;

        private MDCCloseable(String str) {
            this.key = str;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            MDC.remove(this.key);
        }
    }

    static {
        try {
            mdcAdapter = bwCompatibleGetMDCAdapterFromBinder();
        } catch (Exception e10) {
            Util.report("MDC binding unsuccessful.", e10);
        } catch (NoClassDefFoundError e11) {
            mdcAdapter = new NOPMDCAdapter();
            String message = e11.getMessage();
            if (message == null || !message.contains("StaticMDCBinder")) {
                throw e11;
            }
            Util.report("Failed to load class \"org.slf4j.impl.StaticMDCBinder\".");
            Util.report("Defaulting to no-operation MDCAdapter implementation.");
            Util.report("See http://www.slf4j.org/codes.html#no_static_mdc_binder for further details.");
        }
    }

    private MDC() {
    }

    private static MDCAdapter bwCompatibleGetMDCAdapterFromBinder() {
        try {
            return StaticMDCBinder.getSingleton().getMDCA();
        } catch (NoSuchMethodError e10) {
            return StaticMDCBinder.SINGLETON.getMDCA();
        }
    }

    public static void clear() {
        MDCAdapter mDCAdapter = mdcAdapter;
        if (mDCAdapter == null) {
            throw new IllegalStateException("MDCAdapter cannot be null. See also http://www.slf4j.org/codes.html#null_MDCA");
        }
        mDCAdapter.clear();
    }

    public static String get(String str) {
        if (str == null) {
            throw new IllegalArgumentException("key parameter cannot be null");
        }
        MDCAdapter mDCAdapter = mdcAdapter;
        if (mDCAdapter != null) {
            return mDCAdapter.get(str);
        }
        throw new IllegalStateException("MDCAdapter cannot be null. See also http://www.slf4j.org/codes.html#null_MDCA");
    }

    public static Map<String, String> getCopyOfContextMap() {
        MDCAdapter mDCAdapter = mdcAdapter;
        if (mDCAdapter != null) {
            return mDCAdapter.getCopyOfContextMap();
        }
        throw new IllegalStateException("MDCAdapter cannot be null. See also http://www.slf4j.org/codes.html#null_MDCA");
    }

    public static MDCAdapter getMDCAdapter() {
        return mdcAdapter;
    }

    public static void put(String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("key parameter cannot be null");
        }
        MDCAdapter mDCAdapter = mdcAdapter;
        if (mDCAdapter == null) {
            throw new IllegalStateException("MDCAdapter cannot be null. See also http://www.slf4j.org/codes.html#null_MDCA");
        }
        mDCAdapter.put(str, str2);
    }

    public static MDCCloseable putCloseable(String str, String str2) {
        put(str, str2);
        return new MDCCloseable(str);
    }

    public static void remove(String str) {
        if (str == null) {
            throw new IllegalArgumentException("key parameter cannot be null");
        }
        MDCAdapter mDCAdapter = mdcAdapter;
        if (mDCAdapter == null) {
            throw new IllegalStateException("MDCAdapter cannot be null. See also http://www.slf4j.org/codes.html#null_MDCA");
        }
        mDCAdapter.remove(str);
    }

    public static void setContextMap(Map<String, String> map) {
        MDCAdapter mDCAdapter = mdcAdapter;
        if (mDCAdapter == null) {
            throw new IllegalStateException("MDCAdapter cannot be null. See also http://www.slf4j.org/codes.html#null_MDCA");
        }
        mDCAdapter.setContextMap(map);
    }
}
