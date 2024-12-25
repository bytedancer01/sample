package p203lf;

import android.content.Context;
import androidx.fragment.app.AbstractC0428n;
import androidx.fragment.app.AbstractC0433s;
import androidx.fragment.app.Fragment;
import com.maxdigitall.maxdigitaliptvbox.model.pojo.XMLTVProgrammePojo;
import com.maxdigitall.maxdigitaliptvbox.view.fragment.SubTVArchiveFragment;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:lf/w.class
 */
/* renamed from: lf.w */
/* loaded from: combined.jar:classes2.jar:lf/w.class */
public class C5870w extends AbstractC0433s {

    /* renamed from: h */
    public final ArrayList<XMLTVProgrammePojo> f32864h;

    /* renamed from: i */
    public final String f32865i;

    /* renamed from: j */
    public final String f32866j;

    /* renamed from: k */
    public final String f32867k;

    /* renamed from: l */
    public final String f32868l;

    /* renamed from: m */
    public final String f32869m;

    /* renamed from: n */
    public final String f32870n;

    /* renamed from: o */
    public Context f32871o;

    /* renamed from: p */
    public final int f32872p;

    /* renamed from: q */
    public List<String> f32873q;

    /* renamed from: r */
    public Map<Integer, String> f32874r;

    /* renamed from: s */
    public AbstractC0428n f32875s;

    public C5870w(List<String> list, ArrayList<XMLTVProgrammePojo> arrayList, String str, String str2, String str3, String str4, String str5, String str6, AbstractC0428n abstractC0428n, Context context) {
        super(abstractC0428n);
        this.f32875s = abstractC0428n;
        this.f32874r = new HashMap();
        this.f32872p = list.size();
        this.f32873q = list;
        this.f32864h = arrayList;
        this.f32865i = str;
        this.f32866j = str2;
        this.f32867k = str3;
        this.f32868l = str4;
        this.f32869m = str5;
        this.f32870n = str6;
        this.f32871o = context;
    }

    @Override // p052d2.AbstractC4300a
    /* renamed from: c */
    public int mo21760c() {
        return this.f32872p;
    }

    @Override // p052d2.AbstractC4300a
    /* renamed from: e */
    public CharSequence mo21762e(int i10) {
        return this.f32873q.get(i10);
    }

    @Override // androidx.fragment.app.AbstractC0433s
    /* renamed from: p */
    public Fragment mo2308p(int i10) {
        return SubTVArchiveFragment.m18178n(this.f32873q.get(i10), this.f32864h, this.f32865i, this.f32866j, this.f32867k, this.f32868l, this.f32869m, this.f32870n);
    }
}
