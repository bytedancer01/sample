package ke;

import com.amazonaws.services.p045s3.internal.Constants;
import p444zd.C10193a;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ke/b.class
 */
/* renamed from: ke.b */
/* loaded from: combined.jar:classes2.jar:ke/b.class */
public final class C5572b extends AbstractC5576f {
    public C5572b(C10193a c10193a) {
        super(c10193a);
    }

    @Override // ke.AbstractC5579i
    /* renamed from: h */
    public void mo27599h(StringBuilder sb2, int i10) {
        sb2.append(i10 < 10000 ? "(3202)" : "(3203)");
    }

    @Override // ke.AbstractC5579i
    /* renamed from: i */
    public int mo27600i(int i10) {
        return i10 < 10000 ? i10 : i10 - Constants.MAXIMUM_UPLOAD_PARTS;
    }
}
