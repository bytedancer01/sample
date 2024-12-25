package org.apache.http.conn.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Arrays;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.Consts;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.util.Args;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:org/apache/http/conn/util/PublicSuffixMatcherLoader.class
 */
@Contract(threading = ThreadingBehavior.SAFE)
/* loaded from: combined.jar:classes1.jar:org/apache/http/conn/util/PublicSuffixMatcherLoader.class */
public final class PublicSuffixMatcherLoader {
    private static volatile PublicSuffixMatcher DEFAULT_INSTANCE;

    public static PublicSuffixMatcher getDefault() {
        if (DEFAULT_INSTANCE == null) {
            synchronized (PublicSuffixMatcherLoader.class) {
                try {
                    if (DEFAULT_INSTANCE == null) {
                        URL resource = PublicSuffixMatcherLoader.class.getResource("/mozilla/public-suffix-list.txt");
                        if (resource != null) {
                            try {
                                DEFAULT_INSTANCE = load(resource);
                            } catch (IOException e10) {
                                Log log = LogFactory.getLog(PublicSuffixMatcherLoader.class);
                                if (log.isWarnEnabled()) {
                                    log.warn("Failure loading public suffix list from default resource", e10);
                                }
                            }
                        } else {
                            DEFAULT_INSTANCE = new PublicSuffixMatcher(Arrays.asList("com"), null);
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return DEFAULT_INSTANCE;
    }

    public static PublicSuffixMatcher load(File file) {
        Args.notNull(file, "File");
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            return load(fileInputStream);
        } finally {
            fileInputStream.close();
        }
    }

    private static PublicSuffixMatcher load(InputStream inputStream) {
        return new PublicSuffixMatcher(new PublicSuffixListParser().parseByType(new InputStreamReader(inputStream, Consts.UTF_8)));
    }

    public static PublicSuffixMatcher load(URL url) {
        Args.notNull(url, "URL");
        InputStream openStream = url.openStream();
        try {
            return load(openStream);
        } finally {
            openStream.close();
        }
    }
}
