package p283q7;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import p059d9.C4349a;
import p059d9.C4401z0;
import p267p6.AbstractC7575f;
import p267p6.C7629w0;
import p267p6.C7630w1;
import p267p6.C7632x0;
import p283q7.C7839a;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:q7/g.class
 */
/* renamed from: q7.g */
/* loaded from: combined.jar:classes2.jar:q7/g.class */
public final class C7845g extends AbstractC7575f implements Handler.Callback {

    /* renamed from: n */
    public final InterfaceC7842d f37807n;

    /* renamed from: o */
    public final InterfaceC7844f f37808o;

    /* renamed from: p */
    public final Handler f37809p;

    /* renamed from: q */
    public final C7843e f37810q;

    /* renamed from: r */
    public InterfaceC7841c f37811r;

    /* renamed from: s */
    public boolean f37812s;

    /* renamed from: t */
    public boolean f37813t;

    /* renamed from: u */
    public long f37814u;

    /* renamed from: v */
    public long f37815v;

    /* renamed from: w */
    public C7839a f37816w;

    public C7845g(InterfaceC7844f interfaceC7844f, Looper looper) {
        this(interfaceC7844f, looper, InterfaceC7842d.f37805a);
    }

    public C7845g(InterfaceC7844f interfaceC7844f, Looper looper, InterfaceC7842d interfaceC7842d) {
        super(5);
        this.f37808o = (InterfaceC7844f) C4349a.m21882e(interfaceC7844f);
        this.f37809p = looper == null ? null : C4401z0.m22419x(looper, this);
        this.f37807n = (InterfaceC7842d) C4349a.m21882e(interfaceC7842d);
        this.f37810q = new C7843e();
        this.f37815v = -9223372036854775807L;
    }

    @Override // p267p6.AbstractC7575f
    /* renamed from: C */
    public void mo23405C() {
        this.f37816w = null;
        this.f37815v = -9223372036854775807L;
        this.f37811r = null;
    }

    @Override // p267p6.AbstractC7575f
    /* renamed from: E */
    public void mo23407E(long j10, boolean z10) {
        this.f37816w = null;
        this.f37815v = -9223372036854775807L;
        this.f37812s = false;
        this.f37813t = false;
    }

    @Override // p267p6.AbstractC7575f
    /* renamed from: I */
    public void mo23410I(C7629w0[] c7629w0Arr, long j10, long j11) {
        this.f37811r = this.f37807n.mo34095b(c7629w0Arr[0]);
    }

    /* renamed from: L */
    public final void m34096L(C7839a c7839a, List<C7839a.b> list) {
        for (int i10 = 0; i10 < c7839a.m34087k(); i10++) {
            C7629w0 wrappedMetadataFormat = c7839a.m34086j(i10).getWrappedMetadataFormat();
            if (wrappedMetadataFormat == null || !this.f37807n.mo34094a(wrappedMetadataFormat)) {
                list.add(c7839a.m34086j(i10));
            } else {
                InterfaceC7841c mo34095b = this.f37807n.mo34095b(wrappedMetadataFormat);
                byte[] bArr = (byte[]) C4349a.m21882e(c7839a.m34086j(i10).getWrappedMetadataBytes());
                this.f37810q.clear();
                this.f37810q.m37081f(bArr.length);
                ((ByteBuffer) C4401z0.m22391j(this.f37810q.f40327c)).put(bArr);
                this.f37810q.m37082g();
                C7839a mo34093a = mo34095b.mo34093a(this.f37810q);
                if (mo34093a != null) {
                    m34096L(mo34093a, list);
                }
            }
        }
    }

    /* renamed from: M */
    public final void m34097M(C7839a c7839a) {
        Handler handler = this.f37809p;
        if (handler != null) {
            handler.obtainMessage(0, c7839a).sendToTarget();
        } else {
            m34098N(c7839a);
        }
    }

    /* renamed from: N */
    public final void m34098N(C7839a c7839a) {
        this.f37808o.mo12519L(c7839a);
    }

    /* renamed from: O */
    public final boolean m34099O(long j10) {
        boolean z10;
        C7839a c7839a = this.f37816w;
        if (c7839a == null || this.f37815v > j10) {
            z10 = false;
        } else {
            m34097M(c7839a);
            this.f37816w = null;
            this.f37815v = -9223372036854775807L;
            z10 = true;
        }
        if (this.f37812s && this.f37816w == null) {
            this.f37813t = true;
        }
        return z10;
    }

    /* renamed from: P */
    public final void m34100P() {
        if (this.f37812s || this.f37816w != null) {
            return;
        }
        this.f37810q.clear();
        C7632x0 m32714y = m32714y();
        int m32698J = m32698J(m32714y, this.f37810q, 0);
        if (m32698J != -4) {
            if (m32698J == -5) {
                this.f37814u = ((C7629w0) C4349a.m21882e(m32714y.f37132b)).f37090q;
                return;
            }
            return;
        }
        if (this.f37810q.isEndOfStream()) {
            this.f37812s = true;
            return;
        }
        C7843e c7843e = this.f37810q;
        c7843e.f37806i = this.f37814u;
        c7843e.m37082g();
        C7839a mo34093a = ((InterfaceC7841c) C4401z0.m22391j(this.f37811r)).mo34093a(this.f37810q);
        if (mo34093a != null) {
            ArrayList arrayList = new ArrayList(mo34093a.m34087k());
            m34096L(mo34093a, arrayList);
            if (arrayList.isEmpty()) {
                return;
            }
            this.f37816w = new C7839a(arrayList);
            this.f37815v = this.f37810q.f40329e;
        }
    }

    @Override // p267p6.InterfaceC7633x1
    /* renamed from: a */
    public int mo5981a(C7629w0 c7629w0) {
        if (this.f37807n.mo34094a(c7629w0)) {
            return C7630w1.m33226a(c7629w0.f37073F == null ? 4 : 2);
        }
        return C7630w1.m33226a(0);
    }

    @Override // p267p6.InterfaceC7627v1
    /* renamed from: d */
    public boolean mo23425d() {
        return this.f37813t;
    }

    @Override // p267p6.InterfaceC7627v1
    /* renamed from: e */
    public boolean mo23427e() {
        return true;
    }

    @Override // p267p6.InterfaceC7627v1, p267p6.InterfaceC7633x1
    public String getName() {
        return "MetadataRenderer";
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what != 0) {
            throw new IllegalStateException();
        }
        m34098N((C7839a) message.obj);
        return true;
    }

    @Override // p267p6.InterfaceC7627v1
    /* renamed from: q */
    public void mo23439q(long j10, long j11) {
        boolean z10 = true;
        while (z10) {
            m34100P();
            z10 = m34099O(j10);
        }
    }
}
