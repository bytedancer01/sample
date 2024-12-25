package ma;

import java.util.AbstractMap;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ma/y2.class
 */
/* renamed from: ma.y2 */
/* loaded from: combined.jar:classes2.jar:ma/y2.class */
public final class C6508y2 extends AbstractC6344q2 {

    /* renamed from: d */
    public final C6528z2 f34177d;

    public C6508y2(C6528z2 c6528z2) {
        this.f34177d = c6528z2;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i10) {
        int i11;
        Object[] objArr;
        Object[] objArr2;
        i11 = this.f34177d.f34200f;
        C6050c2.m29478a(i10, i11, "index");
        C6528z2 c6528z2 = this.f34177d;
        objArr = c6528z2.f34199e;
        int i12 = i10 + i10;
        Object obj = objArr[i12];
        obj.getClass();
        objArr2 = c6528z2.f34199e;
        Object obj2 = objArr2[i12 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        int i10;
        i10 = this.f34177d.f34200f;
        return i10;
    }
}
