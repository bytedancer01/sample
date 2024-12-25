package p059d9;

import android.os.SystemClock;
import com.amazonaws.services.p045s3.internal.Constants;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import p027b9.C0839e0;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:d9/o0.class
 */
/* renamed from: d9.o0 */
/* loaded from: combined.jar:classes2.jar:d9/o0.class */
public final class C4379o0 {

    /* renamed from: a */
    public static final Object f26621a = new Object();

    /* renamed from: b */
    public static final Object f26622b = new Object();

    /* renamed from: c */
    public static boolean f26623c = false;

    /* renamed from: d */
    public static long f26624d = 0;

    /* renamed from: e */
    public static String f26625e = "time.android.com";

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:d9/o0$b.class
     */
    /* renamed from: d9.o0$b */
    /* loaded from: combined.jar:classes2.jar:d9/o0$b.class */
    public interface b {
        /* renamed from: a */
        void mo12160a(IOException iOException);

        /* renamed from: b */
        void mo12161b();
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:d9/o0$c.class
     */
    /* renamed from: d9.o0$c */
    /* loaded from: combined.jar:classes2.jar:d9/o0$c.class */
    public static final class c implements C0839e0.b<C0839e0.e> {

        /* renamed from: b */
        public final b f26626b;

        public c(b bVar) {
            this.f26626b = bVar;
        }

        @Override // p027b9.C0839e0.b
        /* renamed from: k */
        public void mo485k(C0839e0.e eVar, long j10, long j11, boolean z10) {
        }

        @Override // p027b9.C0839e0.b
        /* renamed from: o */
        public C0839e0.c mo486o(C0839e0.e eVar, long j10, long j11, IOException iOException, int i10) {
            b bVar = this.f26626b;
            if (bVar != null) {
                bVar.mo12160a(iOException);
            }
            return C0839e0.f5770f;
        }

        @Override // p027b9.C0839e0.b
        /* renamed from: r */
        public void mo489r(C0839e0.e eVar, long j10, long j11) {
            if (this.f26626b != null) {
                if (C4379o0.m22190k()) {
                    this.f26626b.mo12161b();
                } else {
                    this.f26626b.mo12160a(new IOException(new ConcurrentModificationException()));
                }
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:d9/o0$d.class
     */
    /* renamed from: d9.o0$d */
    /* loaded from: combined.jar:classes2.jar:d9/o0$d.class */
    public static final class d implements C0839e0.e {
        public d() {
        }

        @Override // p027b9.C0839e0.e
        /* renamed from: a */
        public void mo498a() {
            synchronized (C4379o0.f26621a) {
                synchronized (C4379o0.f26622b) {
                    if (C4379o0.f26623c) {
                        return;
                    }
                    long m22191l = C4379o0.m22191l();
                    synchronized (C4379o0.f26622b) {
                        long unused = C4379o0.f26624d = m22191l;
                        boolean unused2 = C4379o0.f26623c = true;
                    }
                }
            }
        }

        @Override // p027b9.C0839e0.e
        /* renamed from: c */
        public void mo500c() {
        }
    }

    /* renamed from: g */
    public static void m22186g(byte b10, byte b11, int i10, long j10) {
        if (b10 == 3) {
            throw new IOException("SNTP: Unsynchronized server");
        }
        if (b11 != 4 && b11 != 5) {
            throw new IOException("SNTP: Untrusted mode: " + ((int) b11));
        }
        if (i10 != 0 && i10 <= 15) {
            if (j10 == 0) {
                throw new IOException("SNTP: Zero transmitTime");
            }
        } else {
            throw new IOException("SNTP: Untrusted stratum: " + i10);
        }
    }

    /* renamed from: h */
    public static long m22187h() {
        long j10;
        synchronized (f26622b) {
            j10 = f26623c ? f26624d : -9223372036854775807L;
        }
        return j10;
    }

    /* renamed from: i */
    public static String m22188i() {
        String str;
        synchronized (f26622b) {
            str = f26625e;
        }
        return str;
    }

    /* renamed from: j */
    public static void m22189j(C0839e0 c0839e0, b bVar) {
        if (m22190k()) {
            if (bVar != null) {
                bVar.mo12161b();
            }
        } else {
            C0839e0 c0839e02 = c0839e0;
            if (c0839e0 == null) {
                c0839e02 = new C0839e0("SntpClient");
            }
            c0839e02.m5328n(new d(), new c(bVar), 1);
        }
    }

    /* renamed from: k */
    public static boolean m22190k() {
        boolean z10;
        synchronized (f26622b) {
            z10 = f26623c;
        }
        return z10;
    }

    /* renamed from: l */
    public static long m22191l() {
        InetAddress byName = InetAddress.getByName(m22188i());
        DatagramSocket datagramSocket = new DatagramSocket();
        try {
            datagramSocket.setSoTimeout(Constants.MAXIMUM_UPLOAD_PARTS);
            byte[] bArr = new byte[48];
            DatagramPacket datagramPacket = new DatagramPacket(bArr, 48, byName, 123);
            bArr[0] = 27;
            long currentTimeMillis = System.currentTimeMillis();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            m22194o(bArr, 40, currentTimeMillis);
            datagramSocket.send(datagramPacket);
            datagramSocket.receive(new DatagramPacket(bArr, 48));
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            long j10 = currentTimeMillis + (elapsedRealtime2 - elapsedRealtime);
            byte b10 = bArr[0];
            byte b11 = (byte) ((b10 >> 6) & 3);
            byte b12 = (byte) (b10 & 7);
            byte b13 = bArr[1];
            long m22193n = m22193n(bArr, 24);
            long m22193n2 = m22193n(bArr, 32);
            long m22193n3 = m22193n(bArr, 40);
            m22186g(b11, b12, b13 & 255, m22193n3);
            long j11 = ((m22193n2 - m22193n) + (m22193n3 - j10)) / 2;
            datagramSocket.close();
            return (j10 + j11) - elapsedRealtime2;
        } catch (Throwable th2) {
            try {
                datagramSocket.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v28, types: [int] */
    /* JADX WARN: Type inference failed for: r0v31, types: [int] */
    /* JADX WARN: Type inference failed for: r0v34, types: [int] */
    /* JADX WARN: Type inference failed for: r0v37, types: [int] */
    /* renamed from: m */
    public static long m22192m(byte[] bArr, int i10) {
        byte b10 = bArr[i10];
        byte b11 = bArr[i10 + 1];
        byte b12 = bArr[i10 + 2];
        byte b13 = bArr[i10 + 3];
        byte b14 = b10;
        if ((b10 & 128) == 128) {
            b14 = (b10 & Byte.MAX_VALUE) + 128;
        }
        byte b15 = b11;
        if ((b11 & 128) == 128) {
            b15 = (b11 & Byte.MAX_VALUE) + 128;
        }
        byte b16 = b12;
        if ((b12 & 128) == 128) {
            b16 = (b12 & Byte.MAX_VALUE) + 128;
        }
        byte b17 = b13;
        if ((b13 & 128) == 128) {
            b17 = (b13 & Byte.MAX_VALUE) + 128;
        }
        return (b14 << 24) + (b15 << 16) + (b16 << 8) + b17;
    }

    /* renamed from: n */
    public static long m22193n(byte[] bArr, int i10) {
        long m22192m = m22192m(bArr, i10);
        long m22192m2 = m22192m(bArr, i10 + 4);
        if (m22192m == 0 && m22192m2 == 0) {
            return 0L;
        }
        return ((m22192m - 2208988800L) * 1000) + ((m22192m2 * 1000) / IjkMediaMeta.AV_CH_WIDE_RIGHT);
    }

    /* renamed from: o */
    public static void m22194o(byte[] bArr, int i10, long j10) {
        if (j10 == 0) {
            Arrays.fill(bArr, i10, i10 + 8, (byte) 0);
            return;
        }
        long j11 = j10 / 1000;
        long j12 = j11 + 2208988800L;
        int i11 = i10 + 1;
        bArr[i10] = (byte) (j12 >> 24);
        int i12 = i11 + 1;
        bArr[i11] = (byte) (j12 >> 16);
        int i13 = i12 + 1;
        bArr[i12] = (byte) (j12 >> 8);
        int i14 = i13 + 1;
        bArr[i13] = (byte) (j12 >> 0);
        long j13 = ((j10 - (j11 * 1000)) * IjkMediaMeta.AV_CH_WIDE_RIGHT) / 1000;
        int i15 = i14 + 1;
        bArr[i14] = (byte) (j13 >> 24);
        int i16 = i15 + 1;
        bArr[i15] = (byte) (j13 >> 16);
        bArr[i16] = (byte) (j13 >> 8);
        bArr[i16 + 1] = (byte) (Math.random() * 255.0d);
    }
}
