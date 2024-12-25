package p350u9;

import java.lang.ref.WeakReference;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:u9/z.class
 */
/* renamed from: u9.z */
/* loaded from: combined.jar:classes2.jar:u9/z.class */
public abstract class AbstractBinderC8839z extends AbstractBinderC8837x {

    /* renamed from: d */
    public static final WeakReference<byte[]> f40882d = new WeakReference<>(null);

    /* renamed from: c */
    public WeakReference<byte[]> f40883c;

    public AbstractBinderC8839z(byte[] bArr) {
        super(bArr);
        this.f40883c = f40882d;
    }

    @Override // p350u9.AbstractBinderC8837x
    /* renamed from: B1 */
    public final byte[] mo37733B1() {
        byte[] bArr;
        synchronized (this) {
            byte[] bArr2 = this.f40883c.get();
            bArr = bArr2;
            if (bArr2 == null) {
                bArr = mo37731C1();
                this.f40883c = new WeakReference<>(bArr);
            }
        }
        return bArr;
    }

    /* renamed from: C1 */
    public abstract byte[] mo37731C1();
}
