package vg;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpHead;
import org.apache.http.client.methods.HttpOptions;
import org.apache.http.client.methods.HttpPatch;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.methods.HttpTrace;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:vg/h.class
 */
/* renamed from: vg.h */
/* loaded from: combined.jar:classes2.jar:vg/h.class */
public final class C9353h {

    /* renamed from: a */
    public static final Set<String> f42855a = new LinkedHashSet(Arrays.asList(HttpOptions.METHOD_NAME, HttpGet.METHOD_NAME, HttpHead.METHOD_NAME, "POST", HttpPut.METHOD_NAME, HttpDelete.METHOD_NAME, HttpTrace.METHOD_NAME, HttpPatch.METHOD_NAME));

    /* renamed from: a */
    public static boolean m39464a(String str) {
        return str.equals("POST") || str.equals(HttpPatch.METHOD_NAME) || str.equals(HttpPut.METHOD_NAME) || str.equals(HttpDelete.METHOD_NAME);
    }

    /* renamed from: b */
    public static boolean m39465b(String str) {
        return m39466c(str) || str.equals(HttpDelete.METHOD_NAME);
    }

    /* renamed from: c */
    public static boolean m39466c(String str) {
        return str.equals("POST") || str.equals(HttpPut.METHOD_NAME) || str.equals(HttpPatch.METHOD_NAME);
    }
}
