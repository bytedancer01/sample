package p027b9;

import android.net.Uri;
import com.facebook.ads.AdError;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:b9/m0.class
 */
/* renamed from: b9.m0 */
/* loaded from: combined.jar:classes2.jar:b9/m0.class */
public final class C0855m0 extends AbstractC0842g {

    /* renamed from: e */
    public final int f5830e;

    /* renamed from: f */
    public final byte[] f5831f;

    /* renamed from: g */
    public final DatagramPacket f5832g;

    /* renamed from: h */
    public Uri f5833h;

    /* renamed from: i */
    public DatagramSocket f5834i;

    /* renamed from: j */
    public MulticastSocket f5835j;

    /* renamed from: k */
    public InetAddress f5836k;

    /* renamed from: l */
    public InetSocketAddress f5837l;

    /* renamed from: m */
    public boolean f5838m;

    /* renamed from: n */
    public int f5839n;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:b9/m0$a.class
     */
    /* renamed from: b9.m0$a */
    /* loaded from: combined.jar:classes2.jar:b9/m0$a.class */
    public static final class a extends C0856n {
        public a(Throwable th2, int i10) {
            super(th2, i10);
        }
    }

    public C0855m0() {
        this(2000);
    }

    public C0855m0(int i10) {
        this(i10, 8000);
    }

    public C0855m0(int i10, int i11) {
        super(true);
        this.f5830e = i11;
        byte[] bArr = new byte[i10];
        this.f5831f = bArr;
        this.f5832g = new DatagramPacket(bArr, 0, i10);
    }

    @Override // p027b9.InterfaceC0854m
    /* renamed from: a */
    public long mo521a(C0858p c0858p) {
        DatagramSocket datagramSocket;
        Uri uri = c0858p.f5847a;
        this.f5833h = uri;
        String host = uri.getHost();
        int port = this.f5833h.getPort();
        m5355t(c0858p);
        try {
            this.f5836k = InetAddress.getByName(host);
            this.f5837l = new InetSocketAddress(this.f5836k, port);
            if (this.f5836k.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(this.f5837l);
                this.f5835j = multicastSocket;
                multicastSocket.joinGroup(this.f5836k);
                datagramSocket = this.f5835j;
            } else {
                datagramSocket = new DatagramSocket(this.f5837l);
            }
            this.f5834i = datagramSocket;
            this.f5834i.setSoTimeout(this.f5830e);
            this.f5838m = true;
            m5356u(c0858p);
            return -1L;
        } catch (IOException e10) {
            throw new a(e10, AdError.INTERNAL_ERROR_CODE);
        } catch (SecurityException e11) {
            throw new a(e11, AdError.INTERNAL_ERROR_2006);
        }
    }

    @Override // p027b9.InterfaceC0854m
    public void close() {
        this.f5833h = null;
        MulticastSocket multicastSocket = this.f5835j;
        if (multicastSocket != null) {
            try {
                multicastSocket.leaveGroup(this.f5836k);
            } catch (IOException e10) {
            }
            this.f5835j = null;
        }
        DatagramSocket datagramSocket = this.f5834i;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.f5834i = null;
        }
        this.f5836k = null;
        this.f5837l = null;
        this.f5839n = 0;
        if (this.f5838m) {
            this.f5838m = false;
            m5354s();
        }
    }

    public int getLocalPort() {
        DatagramSocket datagramSocket = this.f5834i;
        if (datagramSocket == null) {
            return -1;
        }
        return datagramSocket.getLocalPort();
    }

    @Override // p027b9.InterfaceC0854m
    public Uri getUri() {
        return this.f5833h;
    }

    @Override // p027b9.InterfaceC0846i
    public int read(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        if (this.f5839n == 0) {
            try {
                this.f5834i.receive(this.f5832g);
                int length = this.f5832g.getLength();
                this.f5839n = length;
                m5353r(length);
            } catch (SocketTimeoutException e10) {
                throw new a(e10, AdError.CACHE_ERROR_CODE);
            } catch (IOException e11) {
                throw new a(e11, AdError.INTERNAL_ERROR_CODE);
            }
        }
        int length2 = this.f5832g.getLength();
        int i12 = this.f5839n;
        int min = Math.min(i12, i11);
        System.arraycopy(this.f5831f, length2 - i12, bArr, i10, min);
        this.f5839n -= min;
        return min;
    }
}
