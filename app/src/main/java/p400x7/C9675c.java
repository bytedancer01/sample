package p400x7;

import android.os.Parcelable;
import java.nio.ByteBuffer;
import p059d9.C4359e0;
import p059d9.C4361f0;
import p059d9.C4389t0;
import p283q7.AbstractC7846h;
import p283q7.C7839a;
import p283q7.C7843e;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:x7/c.class
 */
/* renamed from: x7.c */
/* loaded from: combined.jar:classes2.jar:x7/c.class */
public final class C9675c extends AbstractC7846h {

    /* renamed from: a */
    public final C4361f0 f44140a = new C4361f0();

    /* renamed from: b */
    public final C4359e0 f44141b = new C4359e0();

    /* renamed from: c */
    public C4389t0 f44142c;

    @Override // p283q7.AbstractC7846h
    /* renamed from: b */
    public C7839a mo34101b(C7843e c7843e, ByteBuffer byteBuffer) {
        C4389t0 c4389t0 = this.f44142c;
        if (c4389t0 == null || c7843e.f37806i != c4389t0.m22244e()) {
            C4389t0 c4389t02 = new C4389t0(c7843e.f40329e);
            this.f44142c = c4389t02;
            c4389t02.m22240a(c7843e.f40329e - c7843e.f37806i);
        }
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        this.f44140a.m21981N(array, limit);
        this.f44141b.m21957o(array, limit);
        this.f44141b.m21960r(39);
        long m21950h = (this.f44141b.m21950h(1) << 32) | this.f44141b.m21950h(32);
        this.f44141b.m21960r(20);
        int m21950h2 = this.f44141b.m21950h(12);
        int m21950h3 = this.f44141b.m21950h(8);
        Parcelable parcelable = null;
        this.f44140a.m21984Q(14);
        if (m21950h3 == 0) {
            parcelable = new C9677e();
        } else if (m21950h3 == 255) {
            parcelable = C9673a.m40684b(this.f44140a, m21950h2, m21950h);
        } else if (m21950h3 == 4) {
            parcelable = C9678f.m40694b(this.f44140a);
        } else if (m21950h3 == 5) {
            parcelable = C9676d.m40687b(this.f44140a, m21950h, this.f44142c);
        } else if (m21950h3 == 6) {
            parcelable = C9679g.m40707b(this.f44140a, m21950h, this.f44142c);
        }
        return parcelable == null ? new C7839a(new C7839a.b[0]) : new C7839a(parcelable);
    }
}
