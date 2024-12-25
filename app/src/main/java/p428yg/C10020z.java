package p428yg;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import p428yg.AbstractC10019y;
import p428yg.C10014t;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:yg/z.class
 */
/* renamed from: yg.z */
/* loaded from: combined.jar:classes2.jar:yg/z.class */
public class C10020z extends AbstractC10019y {

    /* renamed from: a */
    public final Context f45975a;

    public C10020z(Context context) {
        this.f45975a = context;
    }

    /* renamed from: j */
    public static Bitmap m42165j(Resources resources, int i10, C10017w c10017w) {
        BitmapFactory.Options m42159d = AbstractC10019y.m42159d(c10017w);
        if (AbstractC10019y.m42160g(m42159d)) {
            BitmapFactory.decodeResource(resources, i10, m42159d);
            AbstractC10019y.m42158b(c10017w.f45932h, c10017w.f45933i, m42159d, c10017w);
        }
        return BitmapFactory.decodeResource(resources, i10, m42159d);
    }

    @Override // p428yg.AbstractC10019y
    /* renamed from: c */
    public boolean mo41998c(C10017w c10017w) {
        if (c10017w.f45929e != 0) {
            return true;
        }
        return "android.resource".equals(c10017w.f45928d.getScheme());
    }

    @Override // p428yg.AbstractC10019y
    /* renamed from: f */
    public AbstractC10019y.a mo41999f(C10017w c10017w, int i10) {
        Resources m42051o = C10001g0.m42051o(this.f45975a, c10017w);
        return new AbstractC10019y.a(m42165j(m42051o, C10001g0.m42050n(m42051o, c10017w), c10017w), C10014t.e.DISK);
    }
}
