package p096f9;

import android.opengl.GLES20;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import p059d9.C4378o;
import p096f9.C4781e;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:f9/g.class
 */
/* renamed from: f9.g */
/* loaded from: combined.jar:classes2.jar:f9/g.class */
public final class C4783g {

    /* renamed from: j */
    public static final String[] f28167j = {"uniform mat4 uMvpMatrix;", "uniform mat3 uTexMatrix;", "attribute vec4 aPosition;", "attribute vec2 aTexCoords;", "varying vec2 vTexCoords;", "void main() {", "  gl_Position = uMvpMatrix * aPosition;", "  vTexCoords = (uTexMatrix * vec3(aTexCoords, 1)).xy;", "}"};

    /* renamed from: k */
    public static final String[] f28168k = {"#extension GL_OES_EGL_image_external : require", "precision mediump float;", "uniform samplerExternalOES uTexture;", "varying vec2 vTexCoords;", "void main() {", "  gl_FragColor = texture2D(uTexture, vTexCoords);", "}"};

    /* renamed from: l */
    public static final float[] f28169l = {1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* renamed from: m */
    public static final float[] f28170m = {1.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.5f, 1.0f};

    /* renamed from: n */
    public static final float[] f28171n = {1.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* renamed from: o */
    public static final float[] f28172o = {0.5f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* renamed from: p */
    public static final float[] f28173p = {0.5f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.5f, 1.0f, 1.0f};

    /* renamed from: a */
    public int f28174a;

    /* renamed from: b */
    public a f28175b;

    /* renamed from: c */
    public a f28176c;

    /* renamed from: d */
    public int f28177d;

    /* renamed from: e */
    public int f28178e;

    /* renamed from: f */
    public int f28179f;

    /* renamed from: g */
    public int f28180g;

    /* renamed from: h */
    public int f28181h;

    /* renamed from: i */
    public int f28182i;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:f9/g$a.class
     */
    /* renamed from: f9.g$a */
    /* loaded from: combined.jar:classes2.jar:f9/g$a.class */
    public static class a {

        /* renamed from: a */
        public final int f28183a;

        /* renamed from: b */
        public final FloatBuffer f28184b;

        /* renamed from: c */
        public final FloatBuffer f28185c;

        /* renamed from: d */
        public final int f28186d;

        public a(C4781e.b bVar) {
            this.f28183a = bVar.m24203a();
            this.f28184b = C4378o.m22175f(bVar.f28165c);
            this.f28185c = C4378o.m22175f(bVar.f28166d);
            int i10 = bVar.f28164b;
            this.f28186d = i10 != 1 ? i10 != 2 ? 4 : 6 : 5;
        }
    }

    /* renamed from: c */
    public static boolean m24211c(C4781e c4781e) {
        C4781e.a aVar = c4781e.f28158a;
        C4781e.a aVar2 = c4781e.f28159b;
        boolean z10 = false;
        if (aVar.m24202b() == 1) {
            z10 = false;
            if (aVar.m24201a(0).f28163a == 0) {
                z10 = false;
                if (aVar2.m24202b() == 1) {
                    z10 = false;
                    if (aVar2.m24201a(0).f28163a == 0) {
                        z10 = true;
                    }
                }
            }
        }
        return z10;
    }

    /* renamed from: a */
    public void m24212a(int i10, float[] fArr, boolean z10) {
        a aVar = z10 ? this.f28176c : this.f28175b;
        if (aVar == null) {
            return;
        }
        GLES20.glUseProgram(this.f28177d);
        C4378o.m22171b();
        GLES20.glEnableVertexAttribArray(this.f28180g);
        GLES20.glEnableVertexAttribArray(this.f28181h);
        C4378o.m22171b();
        int i11 = this.f28174a;
        GLES20.glUniformMatrix3fv(this.f28179f, 1, false, i11 == 1 ? z10 ? f28171n : f28170m : i11 == 2 ? z10 ? f28173p : f28172o : f28169l, 0);
        GLES20.glUniformMatrix4fv(this.f28178e, 1, false, fArr, 0);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, i10);
        GLES20.glUniform1i(this.f28182i, 0);
        C4378o.m22171b();
        GLES20.glVertexAttribPointer(this.f28180g, 3, 5126, false, 12, (Buffer) aVar.f28184b);
        C4378o.m22171b();
        GLES20.glVertexAttribPointer(this.f28181h, 2, 5126, false, 8, (Buffer) aVar.f28185c);
        C4378o.m22171b();
        GLES20.glDrawArrays(aVar.f28186d, 0, aVar.f28183a);
        C4378o.m22171b();
        GLES20.glDisableVertexAttribArray(this.f28180g);
        GLES20.glDisableVertexAttribArray(this.f28181h);
    }

    /* renamed from: b */
    public void m24213b() {
        int m22173d = C4378o.m22173d(f28167j, f28168k);
        this.f28177d = m22173d;
        this.f28178e = GLES20.glGetUniformLocation(m22173d, "uMvpMatrix");
        this.f28179f = GLES20.glGetUniformLocation(this.f28177d, "uTexMatrix");
        this.f28180g = GLES20.glGetAttribLocation(this.f28177d, "aPosition");
        this.f28181h = GLES20.glGetAttribLocation(this.f28177d, "aTexCoords");
        this.f28182i = GLES20.glGetUniformLocation(this.f28177d, "uTexture");
    }

    /* renamed from: d */
    public void m24214d(C4781e c4781e) {
        if (m24211c(c4781e)) {
            this.f28174a = c4781e.f28160c;
            a aVar = new a(c4781e.f28158a.m24201a(0));
            this.f28175b = aVar;
            this.f28176c = c4781e.f28161d ? aVar : new a(c4781e.f28159b.m24201a(0));
        }
    }
}
