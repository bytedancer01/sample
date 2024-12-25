package p203lf;

import android.content.Context;
import android.view.ViewGroup;
import androidx.fragment.app.AbstractC0428n;
import androidx.fragment.app.AbstractC0433s;
import androidx.fragment.app.Fragment;
import com.maxdigitall.maxdigitaliptvbox.model.LiveStreamCategoryIdDBModel;
import com.maxdigitall.maxdigitaliptvbox.view.fragment.NewEPGFragment;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:lf/n.class
 */
/* renamed from: lf.n */
/* loaded from: combined.jar:classes2.jar:lf/n.class */
public class C5861n extends AbstractC0433s {

    /* renamed from: h */
    public Context f32697h;

    /* renamed from: i */
    public final int f32698i;

    /* renamed from: j */
    public String[] f32699j;

    /* renamed from: k */
    public String[] f32700k;

    /* renamed from: l */
    public Map<Integer, String> f32701l;

    /* renamed from: m */
    public AbstractC0428n f32702m;

    public C5861n(List<LiveStreamCategoryIdDBModel> list, AbstractC0428n abstractC0428n, Context context) {
        super(abstractC0428n);
        this.f32702m = abstractC0428n;
        this.f32701l = new HashMap();
        int size = list.size();
        this.f32698i = size;
        this.f32699j = new String[size];
        this.f32700k = new String[size];
        this.f32697h = context;
        for (int i10 = 0; i10 < this.f32698i; i10++) {
            String m14788c = list.get(i10).m14788c();
            String m14787b = list.get(i10).m14787b();
            this.f32699j[i10] = m14788c;
            this.f32700k[i10] = m14787b;
        }
    }

    @Override // p052d2.AbstractC4300a
    /* renamed from: c */
    public int mo21760c() {
        return this.f32698i;
    }

    @Override // p052d2.AbstractC4300a
    /* renamed from: e */
    public CharSequence mo21762e(int i10) {
        return this.f32699j[i10];
    }

    @Override // androidx.fragment.app.AbstractC0433s, p052d2.AbstractC4300a
    /* renamed from: g */
    public Object mo2302g(ViewGroup viewGroup, int i10) {
        Object mo2302g = super.mo2302g(viewGroup, i10);
        if (mo2302g instanceof Fragment) {
            this.f32701l.put(Integer.valueOf(i10), ((Fragment) mo2302g).getTag());
        }
        return mo2302g;
    }

    @Override // androidx.fragment.app.AbstractC0433s
    /* renamed from: p */
    public Fragment mo2308p(int i10) {
        return NewEPGFragment.m18071s(this.f32700k[i10], this.f32699j[i10]);
    }
}
