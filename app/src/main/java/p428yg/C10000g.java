package p428yg;

import android.content.Context;
import java.io.InputStream;
import p428yg.AbstractC10019y;
import p428yg.C10014t;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:yg/g.class
 */
/* renamed from: yg.g */
/* loaded from: combined.jar:classes2.jar:yg/g.class */
public class C10000g extends AbstractC10019y {

    /* renamed from: a */
    public final Context f45835a;

    public C10000g(Context context) {
        this.f45835a = context;
    }

    @Override // p428yg.AbstractC10019y
    /* renamed from: c */
    public boolean mo41998c(C10017w c10017w) {
        return "content".equals(c10017w.f45928d.getScheme());
    }

    @Override // p428yg.AbstractC10019y
    /* renamed from: f */
    public AbstractC10019y.a mo41999f(C10017w c10017w, int i10) {
        return new AbstractC10019y.a(m42036j(c10017w), C10014t.e.DISK);
    }

    /* renamed from: j */
    public InputStream m42036j(C10017w c10017w) {
        return this.f45835a.getContentResolver().openInputStream(c10017w.f45928d);
    }
}
