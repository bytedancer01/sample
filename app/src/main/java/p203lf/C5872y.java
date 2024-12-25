package p203lf;

import android.content.Context;
import android.view.ViewGroup;
import androidx.fragment.app.AbstractC0428n;
import androidx.fragment.app.AbstractC0433s;
import androidx.fragment.app.Fragment;
import com.maxdigitall.maxdigitaliptvbox.model.LiveStreamCategoryIdDBModel;
import com.maxdigitall.maxdigitaliptvbox.view.fragment.TVArchiveFragment;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:lf/y.class
 */
/* renamed from: lf.y */
/* loaded from: combined.jar:classes2.jar:lf/y.class */
public class C5872y extends AbstractC0433s {

    /* renamed from: h */
    public Context f32908h;

    /* renamed from: i */
    public final int f32909i;

    /* renamed from: j */
    public String[] f32910j;

    /* renamed from: k */
    public String[] f32911k;

    /* renamed from: l */
    public Map<Integer, String> f32912l;

    /* renamed from: m */
    public AbstractC0428n f32913m;

    public C5872y(List<LiveStreamCategoryIdDBModel> list, AbstractC0428n abstractC0428n, Context context) {
        super(abstractC0428n);
        this.f32913m = abstractC0428n;
        this.f32912l = new HashMap();
        int size = list.size();
        this.f32909i = size;
        this.f32910j = new String[size];
        this.f32911k = new String[size];
        this.f32908h = context;
        for (int i10 = 0; i10 < this.f32909i; i10++) {
            String m14788c = list.get(i10).m14788c();
            String m14787b = list.get(i10).m14787b();
            this.f32910j[i10] = m14788c;
            this.f32911k[i10] = m14787b;
        }
    }

    @Override // p052d2.AbstractC4300a
    /* renamed from: c */
    public int mo21760c() {
        return this.f32909i;
    }

    @Override // p052d2.AbstractC4300a
    /* renamed from: e */
    public CharSequence mo21762e(int i10) {
        return this.f32910j[i10];
    }

    @Override // androidx.fragment.app.AbstractC0433s, p052d2.AbstractC4300a
    /* renamed from: g */
    public Object mo2302g(ViewGroup viewGroup, int i10) {
        Object mo2302g = super.mo2302g(viewGroup, i10);
        if (mo2302g instanceof Fragment) {
            this.f32912l.put(Integer.valueOf(i10), ((Fragment) mo2302g).getTag());
        }
        return mo2302g;
    }

    @Override // androidx.fragment.app.AbstractC0433s
    /* renamed from: p */
    public Fragment mo2308p(int i10) {
        return TVArchiveFragment.m18182F(this.f32911k[i10]);
    }
}
