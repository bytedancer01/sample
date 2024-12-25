package p416y3;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import p329t3.EnumC8619i;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:y3/b.class
 */
/* renamed from: y3.b */
/* loaded from: combined.jar:classes1.jar:y3/b.class */
public class C9816b implements InterfaceC9817c<InputStream> {

    /* renamed from: a */
    public final byte[] f45145a;

    /* renamed from: b */
    public final String f45146b;

    public C9816b(byte[] bArr, String str) {
        this.f45145a = bArr;
        this.f45146b = str;
    }

    @Override // p416y3.InterfaceC9817c
    /* renamed from: a */
    public void mo23240a() {
    }

    @Override // p416y3.InterfaceC9817c
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InputStream mo23241b(EnumC8619i enumC8619i) {
        return new ByteArrayInputStream(this.f45145a);
    }

    @Override // p416y3.InterfaceC9817c
    public void cancel() {
    }

    @Override // p416y3.InterfaceC9817c
    public String getId() {
        return this.f45146b;
    }
}
