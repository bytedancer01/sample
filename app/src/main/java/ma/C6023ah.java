package ma;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ma/ah.class
 */
/* renamed from: ma.ah */
/* loaded from: combined.jar:classes2.jar:ma/ah.class */
public final class C6023ah extends AbstractC6147gf implements RandomAccess, InterfaceC6044bh {

    /* renamed from: d */
    public static final C6023ah f33664d;

    /* renamed from: e */
    @Deprecated
    public static final InterfaceC6044bh f33665e;

    /* renamed from: c */
    public final List f33666c;

    static {
        C6023ah c6023ah = new C6023ah(false);
        f33664d = c6023ah;
        f33665e = c6023ah;
    }

    public C6023ah() {
        this(10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6023ah(int i10) {
        super(true);
        ArrayList arrayList = new ArrayList(i10);
        this.f33666c = arrayList;
    }

    public C6023ah(ArrayList arrayList) {
        super(true);
        this.f33666c = arrayList;
    }

    public C6023ah(boolean z10) {
        super(false);
        this.f33666c = Collections.emptyList();
    }

    /* renamed from: f */
    public static String m29427f(Object obj) {
        return obj instanceof String ? (String) obj : obj instanceof AbstractC6399sf ? ((AbstractC6399sf) obj).m30022v(C6482wg.f34131b) : C6482wg.m30097d((byte[]) obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i10, Object obj) {
        m29639d();
        this.f33666c.add(i10, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // ma.AbstractC6147gf, java.util.AbstractList, java.util.List
    public final boolean addAll(int i10, Collection collection) {
        m29639d();
        Collection collection2 = collection;
        if (collection instanceof InterfaceC6044bh) {
            collection2 = ((InterfaceC6044bh) collection).mo29432p();
        }
        boolean addAll = this.f33666c.addAll(i10, collection2);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // ma.AbstractC6147gf, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }

    @Override // ma.AbstractC6147gf, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        m29639d();
        this.f33666c.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final String get(int i10) {
        Object obj = this.f33666c.get(i10);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof AbstractC6399sf) {
            AbstractC6399sf abstractC6399sf = (AbstractC6399sf) obj;
            String m30022v = abstractC6399sf.m30022v(C6482wg.f34131b);
            if (abstractC6399sf.mo29967i()) {
                this.f33666c.set(i10, m30022v);
            }
            return m30022v;
        }
        byte[] bArr = (byte[]) obj;
        String m30097d = C6482wg.m30097d(bArr);
        if (C6277mj.m29858d(bArr)) {
            this.f33666c.set(i10, m30097d);
        }
        return m30097d;
    }

    @Override // ma.InterfaceC6462vg
    /* renamed from: m */
    public final /* bridge */ /* synthetic */ InterfaceC6462vg mo29429m(int i10) {
        if (i10 < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i10);
        arrayList.addAll(this.f33666c);
        return new C6023ah(arrayList);
    }

    @Override // ma.InterfaceC6044bh
    /* renamed from: n */
    public final Object mo29430n(int i10) {
        return this.f33666c.get(i10);
    }

    @Override // ma.InterfaceC6044bh
    /* renamed from: o */
    public final InterfaceC6044bh mo29431o() {
        return mo29641l() ? new C6067cj(this) : this;
    }

    @Override // ma.InterfaceC6044bh
    /* renamed from: p */
    public final List mo29432p() {
        return Collections.unmodifiableList(this.f33666c);
    }

    @Override // ma.AbstractC6147gf, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        m29639d();
        Object remove = this.f33666c.remove(i10);
        ((AbstractList) this).modCount++;
        return m29427f(remove);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        m29639d();
        return m29427f(this.f33666c.set(i10, (String) obj));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f33666c.size();
    }
}
