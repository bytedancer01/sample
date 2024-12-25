package ph;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p233nh.InterfaceC6789d;
import p233nh.InterfaceC6790e;
import p233nh.InterfaceC6792g;
import p372vh.C9367f;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ph/c.class
 */
/* renamed from: ph.c */
/* loaded from: combined.jar:classes2.jar:ph/c.class */
public abstract class AbstractC7716c extends AbstractC7714a {

    /* renamed from: c */
    @Nullable
    public final InterfaceC6792g f37481c;

    /* renamed from: d */
    @Nullable
    public transient InterfaceC6789d<Object> f37482d;

    public AbstractC7716c(@Nullable InterfaceC6789d<Object> interfaceC6789d) {
        this(interfaceC6789d, interfaceC6789d != null ? interfaceC6789d.mo22619b() : null);
    }

    public AbstractC7716c(@Nullable InterfaceC6789d<Object> interfaceC6789d, @Nullable InterfaceC6792g interfaceC6792g) {
        super(interfaceC6789d);
        this.f37481c = interfaceC6792g;
    }

    @Override // p233nh.InterfaceC6789d
    @NotNull
    /* renamed from: b */
    public InterfaceC6792g mo22619b() {
        InterfaceC6792g interfaceC6792g = this.f37481c;
        C9367f.m39524c(interfaceC6792g);
        return interfaceC6792g;
    }

    @Override // ph.AbstractC7714a
    /* renamed from: n */
    public void mo33707n() {
        InterfaceC6789d<?> interfaceC6789d = this.f37482d;
        if (interfaceC6789d != null && interfaceC6789d != this) {
            InterfaceC6792g.b bVar = mo22619b().get(InterfaceC6790e.f35415d0);
            C9367f.m39524c(bVar);
            ((InterfaceC6790e) bVar).mo22634v0(interfaceC6789d);
        }
        this.f37482d = C7715b.f37480b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x002a, code lost:
    
        if (r0 == null) goto L8;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @org.jetbrains.annotations.NotNull
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final p233nh.InterfaceC6789d<java.lang.Object> m33708o() {
        /*
            r3 = this;
            r0 = r3
            nh.d<java.lang.Object> r0 = r0.f37482d
            r5 = r0
            r0 = r5
            r4 = r0
            r0 = r5
            if (r0 != 0) goto L34
            r0 = r3
            nh.g r0 = r0.mo22619b()
            nh.e$b r1 = p233nh.InterfaceC6790e.f35415d0
            nh.g$b r0 = r0.get(r1)
            nh.e r0 = (p233nh.InterfaceC6790e) r0
            r4 = r0
            r0 = r4
            if (r0 == 0) goto L2d
            r0 = r4
            r1 = r3
            nh.d r0 = r0.mo22635y(r1)
            r5 = r0
            r0 = r5
            r4 = r0
            r0 = r5
            if (r0 != 0) goto L2f
        L2d:
            r0 = r3
            r4 = r0
        L2f:
            r0 = r3
            r1 = r4
            r0.f37482d = r1
        L34:
            r0 = r4
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ph.AbstractC7716c.m33708o():nh.d");
    }
}
