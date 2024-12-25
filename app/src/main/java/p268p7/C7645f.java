package p268p7;

import android.media.MediaCodec;
import android.media.MediaCodec$CryptoInfo$Pattern;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import ec.C4699b;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import p059d9.C4349a;
import p059d9.C4360f;
import p059d9.C4401z0;
import p332t6.C8634b;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:p7/f.class
 */
/* renamed from: p7.f */
/* loaded from: combined.jar:classes2.jar:p7/f.class */
public class C7645f {

    /* renamed from: h */
    public static final ArrayDeque<b> f37155h = new ArrayDeque<>();

    /* renamed from: i */
    public static final Object f37156i = new Object();

    /* renamed from: a */
    public final MediaCodec f37157a;

    /* renamed from: b */
    public final HandlerThread f37158b;

    /* renamed from: c */
    public Handler f37159c;

    /* renamed from: d */
    public final AtomicReference<RuntimeException> f37160d;

    /* renamed from: e */
    public final C4360f f37161e;

    /* renamed from: f */
    public final boolean f37162f;

    /* renamed from: g */
    public boolean f37163g;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:p7/f$a.class
     */
    /* renamed from: p7.f$a */
    /* loaded from: combined.jar:classes2.jar:p7/f$a.class */
    public class a extends Handler {

        /* renamed from: a */
        public final C7645f f37164a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C7645f c7645f, Looper looper) {
            super(looper);
            this.f37164a = c7645f;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            this.f37164a.m33270f(message);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:p7/f$b.class
     */
    /* renamed from: p7.f$b */
    /* loaded from: combined.jar:classes2.jar:p7/f$b.class */
    public static class b {

        /* renamed from: a */
        public int f37165a;

        /* renamed from: b */
        public int f37166b;

        /* renamed from: c */
        public int f37167c;

        /* renamed from: d */
        public final MediaCodec.CryptoInfo f37168d = new MediaCodec.CryptoInfo();

        /* renamed from: e */
        public long f37169e;

        /* renamed from: f */
        public int f37170f;

        /* renamed from: a */
        public void m33282a(int i10, int i11, int i12, long j10, int i13) {
            this.f37165a = i10;
            this.f37166b = i11;
            this.f37167c = i12;
            this.f37169e = j10;
            this.f37170f = i13;
        }
    }

    public C7645f(MediaCodec mediaCodec, HandlerThread handlerThread, boolean z10) {
        this(mediaCodec, handlerThread, z10, new C4360f());
    }

    public C7645f(MediaCodec mediaCodec, HandlerThread handlerThread, boolean z10, C4360f c4360f) {
        this.f37157a = mediaCodec;
        this.f37158b = handlerThread;
        this.f37161e = c4360f;
        this.f37160d = new AtomicReference<>();
        this.f37162f = z10 || m33267m();
    }

    /* renamed from: c */
    public static void m33263c(C8634b c8634b, MediaCodec.CryptoInfo cryptoInfo) {
        cryptoInfo.numSubSamples = c8634b.f40308f;
        cryptoInfo.numBytesOfClearData = m33265e(c8634b.f40306d, cryptoInfo.numBytesOfClearData);
        cryptoInfo.numBytesOfEncryptedData = m33265e(c8634b.f40307e, cryptoInfo.numBytesOfEncryptedData);
        cryptoInfo.key = (byte[]) C4349a.m21882e(m33264d(c8634b.f40304b, cryptoInfo.key));
        cryptoInfo.iv = (byte[]) C4349a.m21882e(m33264d(c8634b.f40303a, cryptoInfo.iv));
        cryptoInfo.mode = c8634b.f40305c;
        if (C4401z0.f26679a >= 24) {
            cryptoInfo.setPattern(new MediaCodec$CryptoInfo$Pattern(c8634b.f40309g, c8634b.f40310h));
        }
    }

    /* renamed from: d */
    public static byte[] m33264d(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            return bArr2;
        }
        if (bArr2 == null || bArr2.length < bArr.length) {
            return Arrays.copyOf(bArr, bArr.length);
        }
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    /* renamed from: e */
    public static int[] m33265e(int[] iArr, int[] iArr2) {
        if (iArr == null) {
            return iArr2;
        }
        if (iArr2 == null || iArr2.length < iArr.length) {
            return Arrays.copyOf(iArr, iArr.length);
        }
        System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
        return iArr2;
    }

    /* renamed from: k */
    public static b m33266k() {
        ArrayDeque<b> arrayDeque = f37155h;
        synchronized (arrayDeque) {
            if (arrayDeque.isEmpty()) {
                return new b();
            }
            return arrayDeque.removeFirst();
        }
    }

    /* renamed from: m */
    public static boolean m33267m() {
        String m23638e = C4699b.m23638e(C4401z0.f26681c);
        return m23638e.contains("samsung") || m23638e.contains("motorola");
    }

    /* renamed from: p */
    public static void m33268p(b bVar) {
        ArrayDeque<b> arrayDeque = f37155h;
        synchronized (arrayDeque) {
            arrayDeque.add(bVar);
        }
    }

    /* renamed from: b */
    public final void m33269b() {
        this.f37161e.m21965d();
        ((Handler) C4401z0.m22391j(this.f37159c)).obtainMessage(2).sendToTarget();
        this.f37161e.m21962a();
    }

    /* renamed from: f */
    public final void m33270f(Message message) {
        b bVar;
        int i10 = message.what;
        if (i10 == 0) {
            bVar = (b) message.obj;
            m33271g(bVar.f37165a, bVar.f37166b, bVar.f37167c, bVar.f37169e, bVar.f37170f);
        } else if (i10 != 1) {
            if (i10 != 2) {
                m33278q(new IllegalStateException(String.valueOf(message.what)));
            } else {
                this.f37161e.m21967f();
            }
            bVar = null;
        } else {
            bVar = (b) message.obj;
            m33272h(bVar.f37165a, bVar.f37166b, bVar.f37168d, bVar.f37169e, bVar.f37170f);
        }
        if (bVar != null) {
            m33268p(bVar);
        }
    }

    /* renamed from: g */
    public final void m33271g(int i10, int i11, int i12, long j10, int i13) {
        try {
            this.f37157a.queueInputBuffer(i10, i11, i12, j10, i13);
        } catch (RuntimeException e10) {
            m33278q(e10);
        }
    }

    /* renamed from: h */
    public final void m33272h(int i10, int i11, MediaCodec.CryptoInfo cryptoInfo, long j10, int i12) {
        try {
            if (!this.f37162f) {
                this.f37157a.queueSecureInputBuffer(i10, i11, cryptoInfo, j10, i12);
                return;
            }
            synchronized (f37156i) {
                this.f37157a.queueSecureInputBuffer(i10, i11, cryptoInfo, j10, i12);
            }
        } catch (RuntimeException e10) {
            m33278q(e10);
        }
    }

    /* renamed from: i */
    public void m33273i() {
        if (this.f37163g) {
            try {
                m33274j();
            } catch (InterruptedException e10) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e10);
            }
        }
    }

    /* renamed from: j */
    public final void m33274j() {
        ((Handler) C4401z0.m22391j(this.f37159c)).removeCallbacksAndMessages(null);
        m33269b();
        m33275l();
    }

    /* renamed from: l */
    public final void m33275l() {
        RuntimeException andSet = this.f37160d.getAndSet(null);
        if (andSet != null) {
            throw andSet;
        }
    }

    /* renamed from: n */
    public void m33276n(int i10, int i11, int i12, long j10, int i13) {
        m33275l();
        b m33266k = m33266k();
        m33266k.m33282a(i10, i11, i12, j10, i13);
        ((Handler) C4401z0.m22391j(this.f37159c)).obtainMessage(0, m33266k).sendToTarget();
    }

    /* renamed from: o */
    public void m33277o(int i10, int i11, C8634b c8634b, long j10, int i12) {
        m33275l();
        b m33266k = m33266k();
        m33266k.m33282a(i10, i11, 0, j10, i12);
        m33263c(c8634b, m33266k.f37168d);
        ((Handler) C4401z0.m22391j(this.f37159c)).obtainMessage(1, m33266k).sendToTarget();
    }

    /* renamed from: q */
    public void m33278q(RuntimeException runtimeException) {
        this.f37160d.set(runtimeException);
    }

    /* renamed from: r */
    public void m33279r() {
        if (this.f37163g) {
            m33273i();
            this.f37158b.quit();
        }
        this.f37163g = false;
    }

    /* renamed from: s */
    public void m33280s() {
        if (this.f37163g) {
            return;
        }
        this.f37158b.start();
        this.f37159c = new a(this, this.f37158b.getLooper());
        this.f37163g = true;
    }

    /* renamed from: t */
    public void m33281t() {
        m33269b();
    }
}
