package se;

import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.AbstractC0674e0;
import java.util.ArrayList;
import java.util.List;
import se.InterfaceC8559a;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:se/b.class
 */
/* renamed from: se.b */
/* loaded from: combined.jar:classes2.jar:se/b.class */
public abstract class AbstractC8560b<S extends InterfaceC8559a<C>, C, SVH extends RecyclerView.AbstractC0674e0, CVH extends RecyclerView.AbstractC0674e0> extends RecyclerView.AbstractC0677h<RecyclerView.AbstractC0674e0> {

    /* renamed from: e */
    public List<S> f39990e;

    /* renamed from: f */
    public int f39991f = 1;

    /* renamed from: g */
    public int f39992g = 2;

    /* renamed from: h */
    public List<C8561c<S, C>> f39993h;

    public AbstractC8560b(Context context, List<S> list) {
        this.f39990e = list;
        this.f39993h = m36823d0(list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0677h
    /* renamed from: G */
    public void mo2996G(RecyclerView.AbstractC0674e0 abstractC0674e0, int i10) {
        if (i10 <= this.f39993h.size()) {
            C8561c<S, C> c8561c = this.f39993h.get(i10);
            if (c8561c.m36830e()) {
                mo6327h0(abstractC0674e0, c8561c.m36829d(), c8561c.m36828c());
                return;
            } else {
                mo6326g0(abstractC0674e0, c8561c.m36829d(), c8561c.m36827b(), c8561c.m36826a());
                return;
            }
        }
        throw new IllegalStateException("Trying to bind item out of bounds, size " + this.f39993h.size() + " flatPosition " + i10 + ". Was the data changed without a call to notify...()?");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0677h
    /* renamed from: J */
    public RecyclerView.AbstractC0674e0 mo2998J(ViewGroup viewGroup, int i10) {
        return m36825f0(i10) ? mo6329j0(viewGroup, i10) : mo6328i0(viewGroup, i10);
    }

    /* renamed from: d0 */
    public final List<C8561c<S, C>> m36823d0(List<S> list) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            m36824e0(arrayList, list.get(i10), i10);
        }
        return arrayList;
    }

    /* renamed from: e0 */
    public final void m36824e0(List<C8561c<S, C>> list, S s10, int i10) {
        list.add(new C8561c<>(s10, i10));
        List<C> mo6474a = s10.mo6474a();
        for (int i11 = 0; i11 < mo6474a.size(); i11++) {
            list.add(new C8561c<>(mo6474a.get(i11), i10, i11));
        }
    }

    /* renamed from: f0 */
    public boolean m36825f0(int i10) {
        return i10 == this.f39991f;
    }

    /* renamed from: g0 */
    public abstract void mo6326g0(CVH cvh, int i10, int i11, C c10);

    /* renamed from: h0 */
    public abstract void mo6327h0(SVH svh, int i10, S s10);

    /* renamed from: i0 */
    public abstract CVH mo6328i0(ViewGroup viewGroup, int i10);

    /* renamed from: j0 */
    public abstract SVH mo6329j0(ViewGroup viewGroup, int i10);

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0677h
    /* renamed from: n */
    public int mo3013n() {
        return this.f39993h.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0677h
    /* renamed from: q */
    public int mo3018q(int i10) {
        return this.f39993h.get(i10).m36830e() ? this.f39991f : this.f39992g;
    }
}
