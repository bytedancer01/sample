package p009a8;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import p009a8.InterfaceC0090d0;
import p009a8.InterfaceC0127w;
import p027b9.InterfaceC0853l0;
import p059d9.C4349a;
import p267p6.AbstractC7574e2;
import p365v6.InterfaceC9290x;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:a8/a.class
 */
/* renamed from: a8.a */
/* loaded from: combined.jar:classes2.jar:a8/a.class */
public abstract class AbstractC0081a implements InterfaceC0127w {

    /* renamed from: b */
    public final ArrayList<InterfaceC0127w.b> f250b = new ArrayList<>(1);

    /* renamed from: c */
    public final HashSet<InterfaceC0127w.b> f251c = new HashSet<>(1);

    /* renamed from: d */
    public final InterfaceC0090d0.a f252d = new InterfaceC0090d0.a();

    /* renamed from: e */
    public final InterfaceC9290x.a f253e = new InterfaceC9290x.a();

    /* renamed from: f */
    public Looper f254f;

    /* renamed from: g */
    public AbstractC7574e2 f255g;

    /* renamed from: A */
    public final boolean m302A() {
        return !this.f251c.isEmpty();
    }

    /* renamed from: B */
    public abstract void mo303B(InterfaceC0853l0 interfaceC0853l0);

    /* renamed from: C */
    public final void m304C(AbstractC7574e2 abstractC7574e2) {
        this.f255g = abstractC7574e2;
        Iterator<InterfaceC0127w.b> it = this.f250b.iterator();
        while (it.hasNext()) {
            it.next().mo410b(this, abstractC7574e2);
        }
    }

    /* renamed from: D */
    public abstract void mo305D();

    @Override // p009a8.InterfaceC0127w
    /* renamed from: a */
    public final void mo306a(InterfaceC0127w.b bVar, InterfaceC0853l0 interfaceC0853l0) {
        Looper myLooper = Looper.myLooper();
        Looper looper = this.f254f;
        C4349a.m21878a(looper == null || looper == myLooper);
        AbstractC7574e2 abstractC7574e2 = this.f255g;
        this.f250b.add(bVar);
        if (this.f254f == null) {
            this.f254f = myLooper;
            this.f251c.add(bVar);
            mo303B(interfaceC0853l0);
        } else if (abstractC7574e2 != null) {
            mo315s(bVar);
            bVar.mo410b(this, abstractC7574e2);
        }
    }

    @Override // p009a8.InterfaceC0127w
    /* renamed from: c */
    public final void mo307c(InterfaceC9290x interfaceC9290x) {
        this.f253e.m39180t(interfaceC9290x);
    }

    @Override // p009a8.InterfaceC0127w
    /* renamed from: e */
    public final void mo308e(InterfaceC0127w.b bVar) {
        boolean isEmpty = this.f251c.isEmpty();
        this.f251c.remove(bVar);
        if ((!isEmpty) && this.f251c.isEmpty()) {
            mo321y();
        }
    }

    @Override // p009a8.InterfaceC0127w
    /* renamed from: f */
    public final void mo309f(Handler handler, InterfaceC0090d0 interfaceC0090d0) {
        C4349a.m21882e(handler);
        C4349a.m21882e(interfaceC0090d0);
        this.f252d.m383g(handler, interfaceC0090d0);
    }

    @Override // p009a8.InterfaceC0127w
    /* renamed from: g */
    public final void mo310g(InterfaceC0090d0 interfaceC0090d0) {
        this.f252d.m379C(interfaceC0090d0);
    }

    @Override // p009a8.InterfaceC0127w
    /* renamed from: i */
    public final void mo311i(InterfaceC0127w.b bVar) {
        this.f250b.remove(bVar);
        if (!this.f250b.isEmpty()) {
            mo308e(bVar);
            return;
        }
        this.f254f = null;
        this.f255g = null;
        this.f251c.clear();
        mo305D();
    }

    @Override // p009a8.InterfaceC0127w
    /* renamed from: l */
    public final void mo312l(Handler handler, InterfaceC9290x interfaceC9290x) {
        C4349a.m21882e(handler);
        C4349a.m21882e(interfaceC9290x);
        this.f253e.m39173g(handler, interfaceC9290x);
    }

    @Override // p009a8.InterfaceC0127w
    /* renamed from: n */
    public /* synthetic */ boolean mo313n() {
        return C0125v.m640b(this);
    }

    @Override // p009a8.InterfaceC0127w
    /* renamed from: p */
    public /* synthetic */ AbstractC7574e2 mo314p() {
        return C0125v.m639a(this);
    }

    @Override // p009a8.InterfaceC0127w
    /* renamed from: s */
    public final void mo315s(InterfaceC0127w.b bVar) {
        C4349a.m21882e(this.f254f);
        boolean isEmpty = this.f251c.isEmpty();
        this.f251c.add(bVar);
        if (isEmpty) {
            mo322z();
        }
    }

    /* renamed from: t */
    public final InterfaceC9290x.a m316t(int i10, InterfaceC0127w.a aVar) {
        return this.f253e.m39181u(i10, aVar);
    }

    /* renamed from: u */
    public final InterfaceC9290x.a m317u(InterfaceC0127w.a aVar) {
        return this.f253e.m39181u(0, aVar);
    }

    /* renamed from: v */
    public final InterfaceC0090d0.a m318v(int i10, InterfaceC0127w.a aVar, long j10) {
        return this.f252d.m382F(i10, aVar, j10);
    }

    /* renamed from: w */
    public final InterfaceC0090d0.a m319w(InterfaceC0127w.a aVar) {
        return this.f252d.m382F(0, aVar, 0L);
    }

    /* renamed from: x */
    public final InterfaceC0090d0.a m320x(InterfaceC0127w.a aVar, long j10) {
        C4349a.m21882e(aVar);
        return this.f252d.m382F(0, aVar, j10);
    }

    /* renamed from: y */
    public void mo321y() {
    }

    /* renamed from: z */
    public void mo322z() {
    }
}
