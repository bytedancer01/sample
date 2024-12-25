package p059d9;

import android.content.Context;
import android.opengl.EGL14;
import android.opengl.GLES20;
import android.opengl.GLU;
import android.text.TextUtils;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:d9/o.class
 */
/* renamed from: d9.o */
/* loaded from: combined.jar:classes2.jar:d9/o.class */
public final class C4378o {
    /* renamed from: a */
    public static void m22170a(int i10, String str, int i11) {
        int glCreateShader = GLES20.glCreateShader(i10);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = {0};
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] != 1) {
            m22179j(GLES20.glGetShaderInfoLog(glCreateShader) + ", source: " + str);
        }
        GLES20.glAttachShader(i11, glCreateShader);
        GLES20.glDeleteShader(glCreateShader);
        m22171b();
    }

    /* renamed from: b */
    public static void m22171b() {
        while (true) {
            int glGetError = GLES20.glGetError();
            if (glGetError == 0) {
                return;
            }
            C4392v.m22270d("GlUtil", "glError " + GLU.gluErrorString(glGetError));
        }
    }

    /* renamed from: c */
    public static int m22172c(String str, String str2) {
        int glCreateProgram = GLES20.glCreateProgram();
        m22171b();
        m22170a(35633, str, glCreateProgram);
        m22170a(35632, str2, glCreateProgram);
        GLES20.glLinkProgram(glCreateProgram);
        int[] iArr = {0};
        GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
        if (iArr[0] != 1) {
            m22179j("Unable to link shader program: \n" + GLES20.glGetProgramInfoLog(glCreateProgram));
        }
        m22171b();
        return glCreateProgram;
    }

    /* renamed from: d */
    public static int m22173d(String[] strArr, String[] strArr2) {
        return m22172c(TextUtils.join("\n", strArr), TextUtils.join("\n", strArr2));
    }

    /* renamed from: e */
    public static FloatBuffer m22174e(int i10) {
        return ByteBuffer.allocateDirect(i10 * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
    }

    /* renamed from: f */
    public static FloatBuffer m22175f(float[] fArr) {
        return (FloatBuffer) m22174e(fArr.length).put(fArr).flip();
    }

    /* renamed from: g */
    public static int m22176g() {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, IntBuffer.wrap(iArr));
        GLES20.glBindTexture(36197, iArr[0]);
        GLES20.glTexParameteri(36197, 10241, 9729);
        GLES20.glTexParameteri(36197, 10240, 9729);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        m22171b();
        return iArr[0];
    }

    /* renamed from: h */
    public static boolean m22177h(Context context) {
        int i10 = C4401z0.f26679a;
        if (i10 < 24) {
            return false;
        }
        if (i10 < 26 && ("samsung".equals(C4401z0.f26681c) || "XT1650".equals(C4401z0.f26682d))) {
            return false;
        }
        if (i10 < 26 && !context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) {
            return false;
        }
        String eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373);
        boolean z10 = false;
        if (eglQueryString != null) {
            z10 = false;
            if (eglQueryString.contains("EGL_EXT_protected_content")) {
                z10 = true;
            }
        }
        return z10;
    }

    /* renamed from: i */
    public static boolean m22178i() {
        if (C4401z0.f26679a < 17) {
            return false;
        }
        String eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373);
        boolean z10 = false;
        if (eglQueryString != null) {
            z10 = false;
            if (eglQueryString.contains("EGL_KHR_surfaceless_context")) {
                z10 = true;
            }
        }
        return z10;
    }

    /* renamed from: j */
    public static void m22179j(String str) {
        C4392v.m22270d("GlUtil", str);
    }
}
