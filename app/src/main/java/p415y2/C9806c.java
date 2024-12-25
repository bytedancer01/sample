package p415y2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:y2/c.class
 */
/* renamed from: y2.c */
/* loaded from: combined.jar:classes1.jar:y2/c.class */
public class C9806c {

    /* renamed from: e */
    public static final Comparator<byte[]> f45108e = new a();

    /* renamed from: a */
    public final List<byte[]> f45109a = new ArrayList();

    /* renamed from: b */
    public final List<byte[]> f45110b = new ArrayList(64);

    /* renamed from: c */
    public int f45111c = 0;

    /* renamed from: d */
    public final int f45112d;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:y2/c$a.class
     */
    /* renamed from: y2.c$a */
    /* loaded from: combined.jar:classes1.jar:y2/c$a.class */
    public class a implements Comparator<byte[]> {
        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(byte[] bArr, byte[] bArr2) {
            return bArr.length - bArr2.length;
        }
    }

    public C9806c(int i10) {
        this.f45112d = i10;
    }

    /* renamed from: a */
    public byte[] m41293a(int i10) {
        synchronized (this) {
            for (int i11 = 0; i11 < this.f45110b.size(); i11++) {
                byte[] bArr = this.f45110b.get(i11);
                if (bArr.length >= i10) {
                    this.f45111c -= bArr.length;
                    this.f45110b.remove(i11);
                    this.f45109a.remove(bArr);
                    return bArr;
                }
            }
            return new byte[i10];
        }
    }

    /* renamed from: b */
    public void m41294b(byte[] bArr) {
        synchronized (this) {
            if (bArr != null) {
                if (bArr.length <= this.f45112d) {
                    this.f45109a.add(bArr);
                    int binarySearch = Collections.binarySearch(this.f45110b, bArr, f45108e);
                    int i10 = binarySearch;
                    if (binarySearch < 0) {
                        i10 = (-binarySearch) - 1;
                    }
                    this.f45110b.add(i10, bArr);
                    this.f45111c += bArr.length;
                    m41295c();
                }
            }
        }
    }

    /* renamed from: c */
    public final void m41295c() {
        synchronized (this) {
            while (this.f45111c > this.f45112d) {
                byte[] remove = this.f45109a.remove(0);
                this.f45110b.remove(remove);
                this.f45111c -= remove.length;
            }
        }
    }
}
