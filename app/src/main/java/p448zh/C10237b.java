package p448zh;

import java.util.NoSuchElementException;
import kh.AbstractC5629w;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:zh/b.class
 */
/* renamed from: zh.b */
/* loaded from: combined.jar:classes2.jar:zh/b.class */
public final class C10237b extends AbstractC5629w {

    /* renamed from: b */
    public final int f46836b;

    /* renamed from: c */
    public final int f46837c;

    /* renamed from: d */
    public boolean f46838d;

    /* renamed from: e */
    public int f46839e;

    public C10237b(int i10, int i11, int i12) {
        this.f46836b = i12;
        this.f46837c = i11;
        boolean z10 = true;
        if (i12 <= 0 ? i10 < i11 : i10 > i11) {
            z10 = false;
        }
        this.f46838d = z10;
        this.f46839e = z10 ? i10 : i11;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f46838d;
    }

    @Override // kh.AbstractC5629w
    public int nextInt() {
        int i10 = this.f46839e;
        if (i10 != this.f46837c) {
            this.f46839e = this.f46836b + i10;
        } else {
            if (!this.f46838d) {
                throw new NoSuchElementException();
            }
            this.f46838d = false;
        }
        return i10;
    }
}
