package p449zi;

import android.annotation.SuppressLint;
import android.content.Context;
import bj.C0915c;

/* renamed from: zi.e */
/* loaded from: combined.jar:classes3.jar:zi/e.class */
public class C10245e {

    /* renamed from: a */
    @SuppressLint({"StaticFieldLeak"})
    public static Context f46844a;

    /* renamed from: a */
    public static Context m42845a() {
        if (f46844a == null) {
            try {
                f46844a = (Context) Class.forName("android.app.ActivityThread").getDeclaredMethod("currentApplication", new Class[0]).invoke(null, new Object[0]);
            } catch (Exception e10) {
                throw new IllegalStateException("LibraryLoader not initialized. Call LibraryLoader.initialize() before using library classes.", e10);
            }
        }
        return f46844a;
    }

    /* renamed from: b */
    public static void m42846b() {
        try {
            System.loadLibrary("pl_droidsonroids_gif");
        } catch (UnsatisfiedLinkError e10) {
            C0915c.m5607a(m42845a(), "pl_droidsonroids_gif");
        }
    }
}
