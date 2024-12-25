package tv.danmaku.ijk.media.player.pragma;

import android.util.Log;
import java.util.Locale;

/* loaded from: combined.jar:classes3.jar:tv/danmaku/ijk/media/player/pragma/DebugLog.class */
public class DebugLog {
    public static final boolean ENABLE_DEBUG = true;
    public static final boolean ENABLE_ERROR = true;
    public static final boolean ENABLE_INFO = true;
    public static final boolean ENABLE_VERBOSE = true;
    public static final boolean ENABLE_WARN = true;

    /* renamed from: d */
    public static void m37575d(String str, String str2) {
        Log.d(str, str2);
    }

    /* renamed from: d */
    public static void m37576d(String str, String str2, Throwable th2) {
        Log.d(str, str2, th2);
    }

    public static void dfmt(String str, String str2, Object... objArr) {
        Log.d(str, String.format(Locale.US, str2, objArr));
    }

    /* renamed from: e */
    public static void m37577e(String str, String str2) {
        Log.e(str, str2);
    }

    /* renamed from: e */
    public static void m37578e(String str, String str2, Throwable th2) {
        Log.e(str, str2, th2);
    }

    public static void efmt(String str, String str2, Object... objArr) {
        Log.e(str, String.format(Locale.US, str2, objArr));
    }

    /* renamed from: i */
    public static void m37579i(String str, String str2) {
        Log.i(str, str2);
    }

    /* renamed from: i */
    public static void m37580i(String str, String str2, Throwable th2) {
        Log.i(str, str2, th2);
    }

    public static void ifmt(String str, String str2, Object... objArr) {
        Log.i(str, String.format(Locale.US, str2, objArr));
    }

    public static void printCause(Throwable th2) {
        Throwable cause = th2.getCause();
        if (cause != null) {
            th2 = cause;
        }
        printStackTrace(th2);
    }

    public static void printStackTrace(Throwable th2) {
        th2.printStackTrace();
    }

    /* renamed from: v */
    public static void m37581v(String str, String str2) {
        Log.v(str, str2);
    }

    /* renamed from: v */
    public static void m37582v(String str, String str2, Throwable th2) {
        Log.v(str, str2, th2);
    }

    public static void vfmt(String str, String str2, Object... objArr) {
        Log.v(str, String.format(Locale.US, str2, objArr));
    }

    /* renamed from: w */
    public static void m37583w(String str, String str2) {
        Log.w(str, str2);
    }

    /* renamed from: w */
    public static void m37584w(String str, String str2, Throwable th2) {
        Log.w(str, str2, th2);
    }

    public static void wfmt(String str, String str2, Object... objArr) {
        Log.w(str, String.format(Locale.US, str2, objArr));
    }
}
