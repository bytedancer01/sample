package p305ra;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ra/z6.class
 */
/* renamed from: ra.z6 */
/* loaded from: combined.jar:classes2.jar:ra/z6.class */
public final class C8441z6 extends AbstractC8364u4<String> implements RandomAccess, InterfaceC8067a7 {

    /* renamed from: d */
    public static final C8441z6 f39437d;

    /* renamed from: e */
    public static final InterfaceC8067a7 f39438e;

    /* renamed from: c */
    public final List<Object> f39439c;

    static {
        C8441z6 c8441z6 = new C8441z6(10);
        f39437d = c8441z6;
        c8441z6.mo35827k();
        f39438e = c8441z6;
    }

    public C8441z6() {
        this(10);
    }

    public C8441z6(int i10) {
        this.f39439c = new ArrayList(i10);
    }

    public C8441z6(ArrayList<Object> arrayList) {
        this.f39439c = arrayList;
    }

    /* renamed from: f */
    public static String m36240f(Object obj) {
        return obj instanceof String ? (String) obj : obj instanceof AbstractC8230l5 ? ((AbstractC8230l5) obj).m35572w(C8366u6.f39298a) : C8366u6.m35905d((byte[]) obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i10, Object obj) {
        m35864d();
        this.f39439c.add(i10, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // p305ra.AbstractC8364u4, java.util.AbstractList, java.util.List
    public final boolean addAll(int i10, Collection<? extends String> collection) {
        m35864d();
        Collection<? extends String> collection2 = collection;
        if (collection instanceof InterfaceC8067a7) {
            collection2 = ((InterfaceC8067a7) collection).mo35001p();
        }
        boolean addAll = this.f39439c.addAll(i10, collection2);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // p305ra.AbstractC8364u4, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    @Override // p305ra.AbstractC8364u4, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        m35864d();
        this.f39439c.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final String get(int i10) {
        Object obj = this.f39439c.get(i10);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof AbstractC8230l5) {
            AbstractC8230l5 abstractC8230l5 = (AbstractC8230l5) obj;
            String m35572w = abstractC8230l5.m35572w(C8366u6.f39298a);
            if (abstractC8230l5.mo35513i()) {
                this.f39439c.set(i10, m35572w);
            }
            return m35572w;
        }
        byte[] bArr = (byte[]) obj;
        String m35905d = C8366u6.m35905d(bArr);
        if (C8366u6.m35904c(bArr)) {
            this.f39439c.set(i10, m35905d);
        }
        return m35905d;
    }

    @Override // p305ra.InterfaceC8067a7
    /* renamed from: j */
    public final InterfaceC8067a7 mo34999j() {
        return zza() ? new C8398w8(this) : this;
    }

    @Override // p305ra.InterfaceC8067a7
    /* renamed from: m */
    public final Object mo35000m(int i10) {
        return this.f39439c.get(i10);
    }

    @Override // p305ra.InterfaceC8351t6
    /* renamed from: n */
    public final /* bridge */ /* synthetic */ InterfaceC8351t6 mo35006n(int i10) {
        if (i10 < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i10);
        arrayList.addAll(this.f39439c);
        return new C8441z6((ArrayList<Object>) arrayList);
    }

    @Override // p305ra.InterfaceC8067a7
    /* renamed from: p */
    public final List<?> mo35001p() {
        return Collections.unmodifiableList(this.f39439c);
    }

    @Override // p305ra.InterfaceC8067a7
    /* renamed from: r */
    public final void mo35002r(AbstractC8230l5 abstractC8230l5) {
        m35864d();
        this.f39439c.add(abstractC8230l5);
        ((AbstractList) this).modCount++;
    }

    @Override // p305ra.AbstractC8364u4, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        m35864d();
        Object remove = this.f39439c.remove(i10);
        ((AbstractList) this).modCount++;
        return m36240f(remove);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        m35864d();
        return m36240f(this.f39439c.set(i10, (String) obj));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f39439c.size();
    }
}
