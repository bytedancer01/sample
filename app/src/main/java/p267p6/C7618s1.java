package p267p6;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import p009a8.InterfaceC0124u0;
import p059d9.C4401z0;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:p6/s1.class
 */
/* renamed from: p6.s1 */
/* loaded from: combined.jar:classes2.jar:p6/s1.class */
public final class C7618s1 extends AbstractC7555a {

    /* renamed from: f */
    public final int f36982f;

    /* renamed from: g */
    public final int f36983g;

    /* renamed from: h */
    public final int[] f36984h;

    /* renamed from: i */
    public final int[] f36985i;

    /* renamed from: j */
    public final AbstractC7574e2[] f36986j;

    /* renamed from: k */
    public final Object[] f36987k;

    /* renamed from: l */
    public final HashMap<Object, Integer> f36988l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7618s1(Collection<? extends InterfaceC7585h1> collection, InterfaceC0124u0 interfaceC0124u0) {
        super(false, interfaceC0124u0);
        int i10 = 0;
        int size = collection.size();
        this.f36984h = new int[size];
        this.f36985i = new int[size];
        this.f36986j = new AbstractC7574e2[size];
        this.f36987k = new Object[size];
        this.f36988l = new HashMap<>();
        int i11 = 0;
        int i12 = 0;
        for (InterfaceC7585h1 interfaceC7585h1 : collection) {
            this.f36986j[i12] = interfaceC7585h1.mo32763b();
            this.f36985i[i12] = i10;
            this.f36984h[i12] = i11;
            i10 += this.f36986j[i12].mo512p();
            i11 += this.f36986j[i12].mo509i();
            this.f36987k[i12] = interfaceC7585h1.mo32762a();
            this.f36988l.put(this.f36987k[i12], Integer.valueOf(i12));
            i12++;
        }
        this.f36982f = i10;
        this.f36983g = i11;
    }

    @Override // p267p6.AbstractC7555a
    /* renamed from: A */
    public int mo32322A(int i10) {
        return this.f36985i[i10];
    }

    @Override // p267p6.AbstractC7555a
    /* renamed from: D */
    public AbstractC7574e2 mo32325D(int i10) {
        return this.f36986j[i10];
    }

    /* renamed from: E */
    public List<AbstractC7574e2> m33023E() {
        return Arrays.asList(this.f36986j);
    }

    @Override // p267p6.AbstractC7574e2
    /* renamed from: i */
    public int mo509i() {
        return this.f36983g;
    }

    @Override // p267p6.AbstractC7574e2
    /* renamed from: p */
    public int mo512p() {
        return this.f36982f;
    }

    @Override // p267p6.AbstractC7555a
    /* renamed from: s */
    public int mo32327s(Object obj) {
        Integer num = this.f36988l.get(obj);
        return num == null ? -1 : num.intValue();
    }

    @Override // p267p6.AbstractC7555a
    /* renamed from: t */
    public int mo32328t(int i10) {
        return C4401z0.m22386h(this.f36984h, i10 + 1, false, false);
    }

    @Override // p267p6.AbstractC7555a
    /* renamed from: u */
    public int mo32329u(int i10) {
        return C4401z0.m22386h(this.f36985i, i10 + 1, false, false);
    }

    @Override // p267p6.AbstractC7555a
    /* renamed from: x */
    public Object mo32330x(int i10) {
        return this.f36987k[i10];
    }

    @Override // p267p6.AbstractC7555a
    /* renamed from: z */
    public int mo32331z(int i10) {
        return this.f36984h[i10];
    }
}
