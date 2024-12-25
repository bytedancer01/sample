package p135hh;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import android.security.KeyChainException;
import gh.InterfaceC5012c;
import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.UnsupportedEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.Collection;
import java.util.Vector;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:hh/g.class
 */
/* renamed from: hh.g */
/* loaded from: combined.jar:classes2.jar:hh/g.class */
public class C5099g {

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:hh/g$a.class
     */
    /* renamed from: hh.g$a */
    /* loaded from: combined.jar:classes2.jar:hh/g$a.class */
    public class a implements ServiceConnection {

        /* renamed from: b */
        public volatile boolean f29279b = false;

        /* renamed from: c */
        public final BlockingQueue f29280c;

        public a(BlockingQueue blockingQueue) {
            this.f29280c = blockingQueue;
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (this.f29279b) {
                return;
            }
            this.f29279b = true;
            try {
                this.f29280c.put(InterfaceC5012c.a.m25212Z(iBinder));
            } catch (InterruptedException e10) {
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:hh/g$b.class
     */
    /* renamed from: hh.g$b */
    /* loaded from: combined.jar:classes2.jar:hh/g$b.class */
    public static class b implements Closeable {

        /* renamed from: b */
        public final Context f29281b;

        /* renamed from: c */
        public final ServiceConnection f29282c;

        /* renamed from: d */
        public final InterfaceC5012c f29283d;

        public b(Context context, ServiceConnection serviceConnection, InterfaceC5012c interfaceC5012c) {
            this.f29281b = context;
            this.f29282c = serviceConnection;
            this.f29283d = interfaceC5012c;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f29281b.unbindService(this.f29282c);
        }

        /* renamed from: f */
        public InterfaceC5012c m25504f() {
            return this.f29283d;
        }
    }

    /* renamed from: a */
    public static b m25499a(Context context, String str) {
        m25500b(context);
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue(1);
        a aVar = new a(linkedBlockingQueue);
        Intent intent = new Intent("de.blinkt.openvpn.api.ExternalCertificateProvider");
        intent.setPackage(str);
        if (context.bindService(intent, aVar, 1)) {
            return new b(context, aVar, (InterfaceC5012c) linkedBlockingQueue.take());
        }
        throw new KeyChainException("could not bind to external authticator app: " + str);
    }

    /* renamed from: b */
    public static void m25500b(Context context) {
        Looper myLooper = Looper.myLooper();
        if (myLooper != null && myLooper == context.getMainLooper()) {
            throw new IllegalStateException("calling this from your main thread can lead to deadlock");
        }
    }

    /* renamed from: c */
    public static X509Certificate[] m25501c(Context context, String str, String str2) {
        try {
            b m25499a = m25499a(context.getApplicationContext(), str);
            try {
                byte[] certificateChain = m25499a.m25504f().getCertificateChain(str2);
                if (certificateChain == null) {
                    m25499a.close();
                    return null;
                }
                Collection<X509Certificate> m25503e = m25503e(certificateChain);
                X509Certificate[] x509CertificateArr = (X509Certificate[]) m25503e.toArray(new X509Certificate[m25503e.size()]);
                m25499a.close();
                return x509CertificateArr;
            } catch (Throwable th2) {
                if (m25499a != null) {
                    try {
                        m25499a.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        } catch (RemoteException | InterruptedException | RuntimeException e10) {
            throw new KeyChainException(e10);
        }
    }

    /* renamed from: d */
    public static byte[] m25502d(Context context, String str, String str2, byte[] bArr, Bundle bundle) {
        try {
            b m25499a = m25499a(context.getApplicationContext(), str);
            try {
                InterfaceC5012c m25504f = m25499a.m25504f();
                byte[] mo25211l1 = m25504f.mo25211l1(str2, bArr, bundle);
                byte[] bArr2 = mo25211l1;
                if (mo25211l1 == null) {
                    bArr2 = m25504f.mo25210V(str2, bArr);
                }
                m25499a.close();
                return bArr2;
            } finally {
            }
        } catch (RemoteException e10) {
            throw new KeyChainException(e10);
        }
    }

    /* renamed from: e */
    public static Collection<X509Certificate> m25503e(byte[] bArr) {
        try {
            Vector vector = new Vector();
            for (String str : new String(bArr, "iso8859-1").split("-----BEGIN CERTIFICATE-----")) {
                vector.addAll(CertificateFactory.getInstance("X.509").generateCertificates(new ByteArrayInputStream(("-----BEGIN CERTIFICATE-----" + str).getBytes("iso8859-1"))));
            }
            return vector;
        } catch (UnsupportedEncodingException e10) {
            throw new AssertionError(e10);
        } catch (CertificateException e11) {
            throw new AssertionError(e11);
        }
    }
}
