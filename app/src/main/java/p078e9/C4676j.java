package p078e9;

import android.content.Context;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;
import com.google.android.exoplayer2.video.VideoDecoderOutputBuffer;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.util.concurrent.atomic.AtomicReference;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import p059d9.C4349a;
import p059d9.C4378o;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:e9/j.class
 */
/* renamed from: e9.j */
/* loaded from: combined.jar:classes2.jar:e9/j.class */
public final class C4676j extends GLSurfaceView implements InterfaceC4678l {

    /* renamed from: b */
    public final a f27635b;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:e9/j$a.class
     */
    /* renamed from: e9.j$a */
    /* loaded from: combined.jar:classes2.jar:e9/j$a.class */
    public static final class a implements GLSurfaceView.Renderer {

        /* renamed from: l */
        public static final float[] f27636l = {1.164f, 1.164f, 1.164f, 0.0f, -0.392f, 2.017f, 1.596f, -0.813f, 0.0f};

        /* renamed from: m */
        public static final float[] f27637m = {1.164f, 1.164f, 1.164f, 0.0f, -0.213f, 2.112f, 1.793f, -0.533f, 0.0f};

        /* renamed from: n */
        public static final float[] f27638n = {1.168f, 1.168f, 1.168f, 0.0f, -0.188f, 2.148f, 1.683f, -0.652f, 0.0f};

        /* renamed from: o */
        public static final String[] f27639o = {"y_tex", "u_tex", "v_tex"};

        /* renamed from: p */
        public static final FloatBuffer f27640p = C4378o.m22175f(new float[]{-1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f, -1.0f});

        /* renamed from: b */
        public final GLSurfaceView f27641b;

        /* renamed from: c */
        public final int[] f27642c = new int[3];

        /* renamed from: d */
        public final int[] f27643d = new int[3];

        /* renamed from: e */
        public final int[] f27644e = new int[3];

        /* renamed from: f */
        public final int[] f27645f = new int[3];

        /* renamed from: g */
        public final AtomicReference<VideoDecoderOutputBuffer> f27646g = new AtomicReference<>();

        /* renamed from: h */
        public final FloatBuffer[] f27647h = new FloatBuffer[3];

        /* renamed from: i */
        public int f27648i;

        /* renamed from: j */
        public int f27649j;

        /* renamed from: k */
        public VideoDecoderOutputBuffer f27650k;

        public a(GLSurfaceView gLSurfaceView) {
            this.f27641b = gLSurfaceView;
            for (int i10 = 0; i10 < 3; i10++) {
                int[] iArr = this.f27644e;
                this.f27645f[i10] = -1;
                iArr[i10] = -1;
            }
        }

        /* renamed from: a */
        public void m23574a(VideoDecoderOutputBuffer videoDecoderOutputBuffer) {
            VideoDecoderOutputBuffer andSet = this.f27646g.getAndSet(videoDecoderOutputBuffer);
            if (andSet != null) {
                andSet.release();
            }
            this.f27641b.requestRender();
        }

        /* renamed from: b */
        public final void m23575b() {
            GLES20.glGenTextures(3, this.f27642c, 0);
            for (int i10 = 0; i10 < 3; i10++) {
                GLES20.glUniform1i(GLES20.glGetUniformLocation(this.f27648i, f27639o[i10]), i10);
                GLES20.glActiveTexture(33984 + i10);
                GLES20.glBindTexture(3553, this.f27642c[i10]);
                GLES20.glTexParameterf(3553, 10241, 9729.0f);
                GLES20.glTexParameterf(3553, 10240, 9729.0f);
                GLES20.glTexParameterf(3553, 10242, 33071.0f);
                GLES20.glTexParameterf(3553, 10243, 33071.0f);
            }
            C4378o.m22171b();
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onDrawFrame(GL10 gl10) {
            VideoDecoderOutputBuffer andSet = this.f27646g.getAndSet(null);
            if (andSet == null && this.f27650k == null) {
                return;
            }
            if (andSet != null) {
                VideoDecoderOutputBuffer videoDecoderOutputBuffer = this.f27650k;
                if (videoDecoderOutputBuffer != null) {
                    videoDecoderOutputBuffer.release();
                }
                this.f27650k = andSet;
            }
            VideoDecoderOutputBuffer videoDecoderOutputBuffer2 = (VideoDecoderOutputBuffer) C4349a.m21882e(this.f27650k);
            float[] fArr = f27637m;
            int i10 = videoDecoderOutputBuffer2.colorspace;
            if (i10 == 1) {
                fArr = f27636l;
            } else if (i10 == 3) {
                fArr = f27638n;
            }
            GLES20.glUniformMatrix3fv(this.f27649j, 1, false, fArr, 0);
            int[] iArr = (int[]) C4349a.m21882e(videoDecoderOutputBuffer2.yuvStrides);
            ByteBuffer[] byteBufferArr = (ByteBuffer[]) C4349a.m21882e(videoDecoderOutputBuffer2.yuvPlanes);
            int i11 = 0;
            while (i11 < 3) {
                int i12 = i11 == 0 ? videoDecoderOutputBuffer2.height : (videoDecoderOutputBuffer2.height + 1) / 2;
                GLES20.glActiveTexture(33984 + i11);
                GLES20.glBindTexture(3553, this.f27642c[i11]);
                GLES20.glPixelStorei(3317, 1);
                GLES20.glTexImage2D(3553, 0, 6409, iArr[i11], i12, 0, 6409, 5121, byteBufferArr[i11]);
                i11++;
            }
            int i13 = videoDecoderOutputBuffer2.width;
            int i14 = (i13 + 1) / 2;
            int[] iArr2 = {i13, i14, i14};
            for (int i15 = 0; i15 < 3; i15++) {
                if (this.f27644e[i15] != iArr2[i15] || this.f27645f[i15] != iArr[i15]) {
                    C4349a.m21884g(iArr[i15] != 0);
                    float f10 = iArr2[i15] / iArr[i15];
                    this.f27647h[i15] = C4378o.m22175f(new float[]{0.0f, 0.0f, 0.0f, 1.0f, f10, 0.0f, f10, 1.0f});
                    GLES20.glVertexAttribPointer(this.f27643d[i15], 2, 5126, false, 0, (Buffer) this.f27647h[i15]);
                    this.f27644e[i15] = iArr2[i15];
                    this.f27645f[i15] = iArr[i15];
                }
            }
            GLES20.glClear(16384);
            GLES20.glDrawArrays(5, 0, 4);
            C4378o.m22171b();
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onSurfaceChanged(GL10 gl10, int i10, int i11) {
            GLES20.glViewport(0, 0, i10, i11);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
            int m22172c = C4378o.m22172c("varying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nattribute vec4 in_pos;\nattribute vec2 in_tc_y;\nattribute vec2 in_tc_u;\nattribute vec2 in_tc_v;\nvoid main() {\n  gl_Position = in_pos;\n  interp_tc_y = in_tc_y;\n  interp_tc_u = in_tc_u;\n  interp_tc_v = in_tc_v;\n}\n", "precision mediump float;\nvarying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nuniform sampler2D y_tex;\nuniform sampler2D u_tex;\nuniform sampler2D v_tex;\nuniform mat3 mColorConversion;\nvoid main() {\n  vec3 yuv;\n  yuv.x = texture2D(y_tex, interp_tc_y).r - 0.0625;\n  yuv.y = texture2D(u_tex, interp_tc_u).r - 0.5;\n  yuv.z = texture2D(v_tex, interp_tc_v).r - 0.5;\n  gl_FragColor = vec4(mColorConversion * yuv, 1.0);\n}\n");
            this.f27648i = m22172c;
            GLES20.glUseProgram(m22172c);
            int glGetAttribLocation = GLES20.glGetAttribLocation(this.f27648i, "in_pos");
            GLES20.glEnableVertexAttribArray(glGetAttribLocation);
            GLES20.glVertexAttribPointer(glGetAttribLocation, 2, 5126, false, 0, (Buffer) f27640p);
            this.f27643d[0] = GLES20.glGetAttribLocation(this.f27648i, "in_tc_y");
            GLES20.glEnableVertexAttribArray(this.f27643d[0]);
            this.f27643d[1] = GLES20.glGetAttribLocation(this.f27648i, "in_tc_u");
            GLES20.glEnableVertexAttribArray(this.f27643d[1]);
            this.f27643d[2] = GLES20.glGetAttribLocation(this.f27648i, "in_tc_v");
            GLES20.glEnableVertexAttribArray(this.f27643d[2]);
            C4378o.m22171b();
            this.f27649j = GLES20.glGetUniformLocation(this.f27648i, "mColorConversion");
            C4378o.m22171b();
            m23575b();
            C4378o.m22171b();
        }
    }

    public C4676j(Context context) {
        this(context, null);
    }

    public C4676j(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a aVar = new a(this);
        this.f27635b = aVar;
        setPreserveEGLContextOnPause(true);
        setEGLContextClientVersion(2);
        setRenderer(aVar);
        setRenderMode(0);
    }

    @Deprecated
    public InterfaceC4678l getVideoDecoderOutputBufferRenderer() {
        return this;
    }

    @Override // p078e9.InterfaceC4678l
    public void setOutputBuffer(VideoDecoderOutputBuffer videoDecoderOutputBuffer) {
        this.f27635b.m23574a(videoDecoderOutputBuffer);
    }
}
