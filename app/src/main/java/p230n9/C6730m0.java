package p230n9;

import com.google.android.gms.cast.MediaError;
import com.google.android.gms.cast.MediaInfo;
import java.util.Iterator;
import java.util.List;
import p200l9.C5746b;
import p200l9.C5791o;
import p200l9.C5797q;
import p230n9.C6721i;
import p304r9.InterfaceC8043p;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:n9/m0.class
 */
/* renamed from: n9.m0 */
/* loaded from: combined.jar:classes2.jar:n9/m0.class */
public final class C6730m0 implements InterfaceC8043p {

    /* renamed from: a */
    public final C6721i f35189a;

    public /* synthetic */ C6730m0(C6721i c6721i, C6728l0 c6728l0) {
        this.f35189a = c6721i;
    }

    @Override // p304r9.InterfaceC8043p
    /* renamed from: a */
    public final void mo31050a(int[] iArr, int i10) {
        Iterator it = this.f35189a.f35169i.iterator();
        while (it.hasNext()) {
            ((C6721i.a) it.next()).mo30916i(iArr, i10);
        }
    }

    @Override // p304r9.InterfaceC8043p
    /* renamed from: b */
    public final void mo31051b(int[] iArr) {
        Iterator it = this.f35189a.f35169i.iterator();
        while (it.hasNext()) {
            ((C6721i.a) it.next()).mo30918k(iArr);
        }
    }

    @Override // p304r9.InterfaceC8043p
    /* renamed from: c */
    public final void mo31052c(int[] iArr) {
        Iterator it = this.f35189a.f35169i.iterator();
        while (it.hasNext()) {
            ((C6721i.a) it.next()).mo30915h(iArr);
        }
    }

    @Override // p304r9.InterfaceC8043p
    /* renamed from: d */
    public final void mo31053d(C5791o[] c5791oArr) {
        Iterator it = this.f35189a.f35169i.iterator();
        while (it.hasNext()) {
            ((C6721i.a) it.next()).mo30917j(c5791oArr);
        }
    }

    @Override // p304r9.InterfaceC8043p
    /* renamed from: e */
    public final void mo31054e(MediaError mediaError) {
        Iterator it = this.f35189a.f35169i.iterator();
        while (it.hasNext()) {
            ((C6721i.a) it.next()).m31036b(mediaError);
        }
    }

    @Override // p304r9.InterfaceC8043p
    /* renamed from: f */
    public final void mo31055f() {
        Iterator it = this.f35189a.f35169i.iterator();
        while (it.hasNext()) {
            ((C6721i.a) it.next()).mo30921n();
        }
    }

    @Override // p304r9.InterfaceC8043p
    /* renamed from: g */
    public final void mo31056g() {
        List list;
        m31060k();
        C6721i.m30971i0(this.f35189a);
        list = this.f35189a.f35168h;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((C6721i.b) it.next()).mo23750m();
        }
        Iterator it2 = this.f35189a.f35169i.iterator();
        while (it2.hasNext()) {
            ((C6721i.a) it2.next()).mo14733g();
        }
    }

    @Override // p304r9.InterfaceC8043p
    /* renamed from: h */
    public final void mo31057h() {
        List list;
        list = this.f35189a.f35168h;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((C6721i.b) it.next()).mo23747h();
        }
        Iterator it2 = this.f35189a.f35169i.iterator();
        while (it2.hasNext()) {
            ((C6721i.a) it2.next()).mo14732e();
        }
    }

    @Override // p304r9.InterfaceC8043p
    /* renamed from: i */
    public final void mo31058i(int[] iArr) {
        Iterator it = this.f35189a.f35169i.iterator();
        while (it.hasNext()) {
            ((C6721i.a) it.next()).mo30920m(iArr);
        }
    }

    @Override // p304r9.InterfaceC8043p
    /* renamed from: j */
    public final void mo31059j(List list, List list2, int i10) {
        Iterator it = this.f35189a.f35169i.iterator();
        while (it.hasNext()) {
            ((C6721i.a) it.next()).mo30919l(list, list2, i10);
        }
    }

    /* renamed from: k */
    public final void m31060k() {
        C6721i.d dVar;
        C5797q m31012l;
        C6721i.d dVar2;
        C6721i.d dVar3;
        C6721i c6721i = this.f35189a;
        dVar = c6721i.f35172l;
        if (dVar == null || (m31012l = c6721i.m31012l()) == null) {
            return;
        }
        C5797q.a m28328n0 = m31012l.m28328n0();
        dVar2 = this.f35189a.f35172l;
        m28328n0.m28336a(dVar2.m31040b(m31012l));
        dVar3 = this.f35189a.f35172l;
        List<C5746b> m31039a = dVar3.m31039a(m31012l);
        MediaInfo m31009j = this.f35189a.m31009j();
        if (m31009j != null) {
            m31009j.m13071e0().m13079a(m31039a);
        }
    }

    @Override // p304r9.InterfaceC8043p
    /* renamed from: l */
    public final void mo31061l() {
        List list;
        m31060k();
        list = this.f35189a.f35168h;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((C6721i.b) it.next()).mo23746g();
        }
        Iterator it2 = this.f35189a.f35169i.iterator();
        while (it2.hasNext()) {
            ((C6721i.a) it2.next()).mo31037c();
        }
    }

    @Override // p304r9.InterfaceC8043p
    /* renamed from: o */
    public final void mo31062o() {
        List list;
        list = this.f35189a.f35168h;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((C6721i.b) it.next()).mo23749k();
        }
        Iterator it2 = this.f35189a.f35169i.iterator();
        while (it2.hasNext()) {
            ((C6721i.a) it2.next()).mo23778d();
        }
    }

    @Override // p304r9.InterfaceC8043p
    public final void zza() {
        List list;
        list = this.f35189a.f35168h;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((C6721i.b) it.next()).mo23745c();
        }
        Iterator it2 = this.f35189a.f35169i.iterator();
        while (it2.hasNext()) {
            ((C6721i.a) it2.next()).mo31035a();
        }
    }
}
