package p267p6;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.exoplayer2.ext.ffmpeg.C2330b;
import com.google.android.exoplayer2.ext.flac.C2340i;
import java.util.ArrayList;
import p008a7.C0078a;
import p037c7.C1012a;
import p059d9.C4392v;
import p078e9.C4675i;
import p078e9.InterfaceC4668c0;
import p096f9.C4778b;
import p243o8.C6930l;
import p243o8.InterfaceC6929k;
import p268p7.InterfaceC7656q;
import p283q7.C7845g;
import p283q7.InterfaceC7844f;
import p301r6.C7976f;
import p301r6.C7977f0;
import p301r6.C7983i0;
import p301r6.InterfaceC7980h;
import p301r6.InterfaceC8002t;
import p301r6.InterfaceC8003u;
import p380w6.C9424d;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:p6/n.class
 */
/* renamed from: p6.n */
/* loaded from: combined.jar:classes2.jar:p6/n.class */
public class C7601n implements InterfaceC7639z1 {

    /* renamed from: a */
    public final Context f36883a;

    /* renamed from: d */
    public boolean f36886d;

    /* renamed from: f */
    public boolean f36888f;

    /* renamed from: g */
    public boolean f36889g;

    /* renamed from: h */
    public boolean f36890h;

    /* renamed from: i */
    public boolean f36891i;

    /* renamed from: j */
    public boolean f36892j;

    /* renamed from: k */
    public boolean f36893k;

    /* renamed from: b */
    public int f36884b = 0;

    /* renamed from: c */
    public long f36885c = 5000;

    /* renamed from: e */
    public InterfaceC7656q f36887e = InterfaceC7656q.f37291a;

    public C7601n(Context context) {
        this.f36883a = context;
    }

    @Override // p267p6.InterfaceC7639z1
    /* renamed from: a */
    public InterfaceC7627v1[] mo32854a(Handler handler, InterfaceC4668c0 interfaceC4668c0, InterfaceC8002t interfaceC8002t, InterfaceC6929k interfaceC6929k, InterfaceC7844f interfaceC7844f) {
        ArrayList<InterfaceC7627v1> arrayList = new ArrayList<>();
        m32861h(this.f36883a, this.f36884b, this.f36887e, this.f36886d, handler, interfaceC4668c0, this.f36885c, arrayList);
        InterfaceC8003u m32856c = m32856c(this.f36883a, this.f36891i, this.f36892j, this.f36893k);
        if (m32856c != null) {
            m32855b(this.f36883a, this.f36884b, this.f36887e, this.f36886d, m32856c, handler, interfaceC8002t, arrayList);
        }
        m32860g(this.f36883a, interfaceC6929k, handler.getLooper(), this.f36884b, arrayList);
        m32858e(this.f36883a, interfaceC7844f, handler.getLooper(), this.f36884b, arrayList);
        m32857d(this.f36883a, this.f36884b, arrayList);
        m32859f(this.f36883a, handler, this.f36884b, arrayList);
        return (InterfaceC7627v1[]) arrayList.toArray(new InterfaceC7627v1[0]);
    }

    /* renamed from: b */
    public void m32855b(Context context, int i10, InterfaceC7656q interfaceC7656q, boolean z10, InterfaceC8003u interfaceC8003u, Handler handler, InterfaceC8002t interfaceC8002t, ArrayList<InterfaceC7627v1> arrayList) {
        int i11;
        int i12;
        C7983i0 c7983i0 = new C7983i0(context, interfaceC7656q, z10, handler, interfaceC8002t, interfaceC8003u);
        c7983i0.m33378e0(this.f36888f);
        c7983i0.m33380f0(this.f36889g);
        c7983i0.m33381g0(this.f36890h);
        arrayList.add(c7983i0);
        if (i10 == 0) {
            return;
        }
        int size = arrayList.size();
        int i13 = size;
        if (i10 == 2) {
            i13 = size - 1;
        }
        try {
            try {
                i11 = i13 + 1;
                try {
                    arrayList.add(i13, (InterfaceC7627v1) C0078a.class.getConstructor(Handler.class, InterfaceC8002t.class, InterfaceC8003u.class).newInstance(handler, interfaceC8002t, interfaceC8003u));
                    C4392v.m22273g("DefaultRenderersFactory", "Loaded LibopusAudioRenderer.");
                } catch (ClassNotFoundException e10) {
                    i13 = i11;
                    i11 = i13;
                    try {
                        i12 = i11 + 1;
                        arrayList.add(i11, (InterfaceC7627v1) C2340i.class.getConstructor(Handler.class, InterfaceC8002t.class, InterfaceC8003u.class).newInstance(handler, interfaceC8002t, interfaceC8003u));
                        C4392v.m22273g("DefaultRenderersFactory", "Loaded LibflacAudioRenderer.");
                        i11 = i12;
                    } catch (ClassNotFoundException e11) {
                    }
                    try {
                        arrayList.add(i11, (InterfaceC7627v1) C2330b.class.getConstructor(Handler.class, InterfaceC8002t.class, InterfaceC8003u.class).newInstance(handler, interfaceC8002t, interfaceC8003u));
                        C4392v.m22273g("DefaultRenderersFactory", "Loaded FfmpegAudioRenderer.");
                    } catch (ClassNotFoundException e12) {
                        return;
                    } catch (Exception e13) {
                        throw new RuntimeException("Error instantiating FFmpeg extension", e13);
                    }
                }
            } catch (Exception e14) {
                throw new RuntimeException("Error instantiating Opus extension", e14);
            }
        } catch (ClassNotFoundException e15) {
        }
        try {
            i12 = i11 + 1;
            try {
                arrayList.add(i11, (InterfaceC7627v1) C2340i.class.getConstructor(Handler.class, InterfaceC8002t.class, InterfaceC8003u.class).newInstance(handler, interfaceC8002t, interfaceC8003u));
                C4392v.m22273g("DefaultRenderersFactory", "Loaded LibflacAudioRenderer.");
                i11 = i12;
            } catch (ClassNotFoundException e16) {
                i11 = i12;
            }
            arrayList.add(i11, (InterfaceC7627v1) C2330b.class.getConstructor(Handler.class, InterfaceC8002t.class, InterfaceC8003u.class).newInstance(handler, interfaceC8002t, interfaceC8003u));
            C4392v.m22273g("DefaultRenderersFactory", "Loaded FfmpegAudioRenderer.");
        } catch (Exception e17) {
            throw new RuntimeException("Error instantiating FLAC extension", e17);
        }
    }

    /* renamed from: c */
    public InterfaceC8003u m32856c(Context context, boolean z10, boolean z11, boolean z12) {
        return new C7977f0(C7976f.m34582c(context), new C7977f0.d(new InterfaceC7980h[0]), z10, z11, z12 ? 1 : 0);
    }

    /* renamed from: d */
    public void m32857d(Context context, int i10, ArrayList<InterfaceC7627v1> arrayList) {
        arrayList.add(new C4778b());
    }

    /* renamed from: e */
    public void m32858e(Context context, InterfaceC7844f interfaceC7844f, Looper looper, int i10, ArrayList<InterfaceC7627v1> arrayList) {
        arrayList.add(new C7845g(interfaceC7844f, looper));
    }

    /* renamed from: f */
    public void m32859f(Context context, Handler handler, int i10, ArrayList<InterfaceC7627v1> arrayList) {
    }

    /* renamed from: g */
    public void m32860g(Context context, InterfaceC6929k interfaceC6929k, Looper looper, int i10, ArrayList<InterfaceC7627v1> arrayList) {
        arrayList.add(new C6930l(interfaceC6929k, looper));
    }

    /* renamed from: h */
    public void m32861h(Context context, int i10, InterfaceC7656q interfaceC7656q, boolean z10, Handler handler, InterfaceC4668c0 interfaceC4668c0, long j10, ArrayList<InterfaceC7627v1> arrayList) {
        int i11;
        C4675i c4675i = new C4675i(context, interfaceC7656q, j10, z10, handler, interfaceC4668c0, 50);
        c4675i.m33378e0(this.f36888f);
        c4675i.m33380f0(this.f36889g);
        c4675i.m33381g0(this.f36890h);
        arrayList.add(c4675i);
        if (i10 == 0) {
            return;
        }
        int size = arrayList.size();
        int i12 = size;
        if (i10 == 2) {
            i12 = size - 1;
        }
        try {
            try {
                i11 = i12 + 1;
            } catch (ClassNotFoundException e10) {
            }
            try {
                try {
                    arrayList.add(i12, (InterfaceC7627v1) C1012a.class.getConstructor(Long.TYPE, Handler.class, InterfaceC4668c0.class, Integer.TYPE).newInstance(Long.valueOf(j10), handler, interfaceC4668c0, 50));
                    C4392v.m22273g("DefaultRenderersFactory", "Loaded LibvpxVideoRenderer.");
                } catch (ClassNotFoundException e11) {
                    i12 = i11;
                    i11 = i12;
                    int i13 = C9424d.f43174f0;
                    arrayList.add(i11, (InterfaceC7627v1) C9424d.class.getConstructor(Long.TYPE, Handler.class, InterfaceC4668c0.class, Integer.TYPE).newInstance(Long.valueOf(j10), handler, interfaceC4668c0, 50));
                    C4392v.m22273g("DefaultRenderersFactory", "Loaded Libgav1VideoRenderer.");
                }
                int i132 = C9424d.f43174f0;
                arrayList.add(i11, (InterfaceC7627v1) C9424d.class.getConstructor(Long.TYPE, Handler.class, InterfaceC4668c0.class, Integer.TYPE).newInstance(Long.valueOf(j10), handler, interfaceC4668c0, 50));
                C4392v.m22273g("DefaultRenderersFactory", "Loaded Libgav1VideoRenderer.");
            } catch (ClassNotFoundException e12) {
            } catch (Exception e13) {
                throw new RuntimeException("Error instantiating AV1 extension", e13);
            }
        } catch (Exception e14) {
            throw new RuntimeException("Error instantiating VP9 extension", e14);
        }
    }

    /* renamed from: i */
    public C7601n m32862i(int i10) {
        this.f36884b = i10;
        return this;
    }
}
