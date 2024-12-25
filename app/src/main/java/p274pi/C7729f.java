package p274pi;

import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpHead;
import org.apache.http.client.methods.HttpPatch;
import org.apache.http.client.methods.HttpPut;
import org.jetbrains.annotations.NotNull;
import p372vh.C9367f;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:pi/f.class
 */
/* renamed from: pi.f */
/* loaded from: combined.jar:classes2.jar:pi/f.class */
public final class C7729f {

    /* renamed from: a */
    public static final C7729f f37497a = new C7729f();

    /* renamed from: a */
    public static final boolean m33744a(@NotNull String str) {
        C9367f.m39526e(str, "method");
        return (C9367f.m39522a(str, HttpGet.METHOD_NAME) || C9367f.m39522a(str, HttpHead.METHOD_NAME)) ? false : true;
    }

    /* renamed from: d */
    public static final boolean m33745d(@NotNull String str) {
        C9367f.m39526e(str, "method");
        return C9367f.m39522a(str, "POST") || C9367f.m39522a(str, HttpPut.METHOD_NAME) || C9367f.m39522a(str, HttpPatch.METHOD_NAME) || C9367f.m39522a(str, "PROPPATCH") || C9367f.m39522a(str, "REPORT");
    }

    /* renamed from: b */
    public final boolean m33746b(@NotNull String str) {
        C9367f.m39526e(str, "method");
        return !C9367f.m39522a(str, "PROPFIND");
    }

    /* renamed from: c */
    public final boolean m33747c(@NotNull String str) {
        C9367f.m39526e(str, "method");
        return C9367f.m39522a(str, "PROPFIND");
    }
}
