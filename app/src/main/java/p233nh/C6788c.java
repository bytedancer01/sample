package p233nh;

import java.io.Serializable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p233nh.InterfaceC6792g;
import p356uh.InterfaceC9200p;
import p372vh.AbstractC9368g;
import p372vh.C9367f;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:nh/c.class
 */
/* renamed from: nh.c */
/* loaded from: combined.jar:classes2.jar:nh/c.class */
public final class C6788c implements InterfaceC6792g, Serializable {

    /* renamed from: b */
    @NotNull
    public final InterfaceC6792g f35412b;

    /* renamed from: c */
    @NotNull
    public final InterfaceC6792g.b f35413c;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:nh/c$a.class
     */
    /* renamed from: nh.c$a */
    /* loaded from: combined.jar:classes2.jar:nh/c$a.class */
    public static final class a extends AbstractC9368g implements InterfaceC9200p<String, InterfaceC6792g.b, String> {

        /* renamed from: c */
        public static final a f35414c = new a();

        public a() {
            super(2);
        }

        @Override // p356uh.InterfaceC9200p
        @NotNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo4818m(@NotNull String str, @NotNull InterfaceC6792g.b bVar) {
            String str2;
            C9367f.m39526e(str, "acc");
            C9367f.m39526e(bVar, "element");
            if (str.length() == 0) {
                str2 = bVar.toString();
            } else {
                str2 = str + ", " + bVar;
            }
            return str2;
        }
    }

    public C6788c(@NotNull InterfaceC6792g interfaceC6792g, @NotNull InterfaceC6792g.b bVar) {
        C9367f.m39526e(interfaceC6792g, "left");
        C9367f.m39526e(bVar, "element");
        this.f35412b = interfaceC6792g;
        this.f35413c = bVar;
    }

    /* renamed from: a */
    public final boolean m31296a(InterfaceC6792g.b bVar) {
        return C9367f.m39522a(get(bVar.getKey()), bVar);
    }

    /* renamed from: b */
    public final boolean m31297b(C6788c c6788c) {
        while (m31296a(c6788c.f35413c)) {
            InterfaceC6792g interfaceC6792g = c6788c.f35412b;
            if (!(interfaceC6792g instanceof C6788c)) {
                return m31296a((InterfaceC6792g.b) interfaceC6792g);
            }
            c6788c = (C6788c) interfaceC6792g;
        }
        return false;
    }

    /* renamed from: c */
    public final int m31298c() {
        int i10 = 2;
        C6788c c6788c = this;
        while (true) {
            InterfaceC6792g interfaceC6792g = c6788c.f35412b;
            c6788c = interfaceC6792g instanceof C6788c ? (C6788c) interfaceC6792g : null;
            if (c6788c == null) {
                return i10;
            }
            i10++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
    
        if (r0.m31297b(r3) != false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r4) {
        /*
            r3 = this;
            r0 = r3
            r1 = r4
            if (r0 == r1) goto L2c
            r0 = r4
            boolean r0 = r0 instanceof p233nh.C6788c
            if (r0 == 0) goto L27
            r0 = r4
            nh.c r0 = (p233nh.C6788c) r0
            r4 = r0
            r0 = r4
            int r0 = r0.m31298c()
            r1 = r3
            int r1 = r1.m31298c()
            if (r0 != r1) goto L27
            r0 = r4
            r1 = r3
            boolean r0 = r0.m31297b(r1)
            if (r0 == 0) goto L27
            goto L2c
        L27:
            r0 = 0
            r5 = r0
            goto L2e
        L2c:
            r0 = 1
            r5 = r0
        L2e:
            r0 = r5
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p233nh.C6788c.equals(java.lang.Object):boolean");
    }

    @Override // p233nh.InterfaceC6792g
    public <R> R fold(R r10, @NotNull InterfaceC9200p<? super R, ? super InterfaceC6792g.b, ? extends R> interfaceC9200p) {
        C9367f.m39526e(interfaceC9200p, "operation");
        return interfaceC9200p.mo4818m((Object) this.f35412b.fold(r10, interfaceC9200p), this.f35413c);
    }

    @Override // p233nh.InterfaceC6792g
    @Nullable
    public <E extends InterfaceC6792g.b> E get(@NotNull InterfaceC6792g.c<E> cVar) {
        C9367f.m39526e(cVar, "key");
        C6788c c6788c = this;
        while (true) {
            C6788c c6788c2 = c6788c;
            E e10 = (E) c6788c2.f35413c.get(cVar);
            if (e10 != null) {
                return e10;
            }
            InterfaceC6792g interfaceC6792g = c6788c2.f35412b;
            if (!(interfaceC6792g instanceof C6788c)) {
                return (E) interfaceC6792g.get(cVar);
            }
            c6788c = (C6788c) interfaceC6792g;
        }
    }

    public int hashCode() {
        return this.f35412b.hashCode() + this.f35413c.hashCode();
    }

    @Override // p233nh.InterfaceC6792g
    @NotNull
    public InterfaceC6792g minusKey(@NotNull InterfaceC6792g.c<?> cVar) {
        C9367f.m39526e(cVar, "key");
        if (this.f35413c.get(cVar) != null) {
            return this.f35412b;
        }
        InterfaceC6792g minusKey = this.f35412b.minusKey(cVar);
        return minusKey == this.f35412b ? this : minusKey == C6793h.f35418b ? this.f35413c : new C6788c(minusKey, this.f35413c);
    }

    @Override // p233nh.InterfaceC6792g
    @NotNull
    public InterfaceC6792g plus(@NotNull InterfaceC6792g interfaceC6792g) {
        return InterfaceC6792g.a.m31304a(this, interfaceC6792g);
    }

    @NotNull
    public String toString() {
        return '[' + ((String) fold("", a.f35414c)) + ']';
    }
}
