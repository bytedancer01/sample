package p067di;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p136hi.C5120b;
import p233nh.InterfaceC6789d;
import p233nh.InterfaceC6790e;
import p233nh.InterfaceC6792g;
import ph.InterfaceC7717d;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:di/a0.class
 */
/* renamed from: di.a0 */
/* loaded from: combined.jar:classes2.jar:di/a0.class */
public final class C4459a0 {

    /* renamed from: a */
    public static final boolean f26872a;

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0034, code lost:
    
        if (r0.equals("on") != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0040, code lost:
    
        if (r0.equals("") != false) goto L21;
     */
    static {
        /*
            java.lang.String r0 = "kotlinx.coroutines.scheduler"
            java.lang.String r0 = fi.C4882u.m24805d(r0)
            r7 = r0
            r0 = r7
            if (r0 == 0) goto L71
            r0 = r7
            int r0 = r0.hashCode()
            r4 = r0
            r0 = r4
            if (r0 == 0) goto L3a
            r0 = r4
            r1 = 3551(0xddf, float:4.976E-42)
            if (r0 == r1) goto L2e
            r0 = r4
            r1 = 109935(0x1ad6f, float:1.54052E-40)
            if (r0 != r1) goto L46
            r0 = r7
            java.lang.String r1 = "off"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L46
            r0 = 0
            r5 = r0
            goto L73
        L2e:
            r0 = r7
            java.lang.String r1 = "on"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L46
            goto L71
        L3a:
            r0 = r7
            java.lang.String r1 = ""
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L46
            goto L71
        L46:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r6 = r0
            r0 = r6
            java.lang.String r1 = "System property 'kotlinx.coroutines.scheduler' has unrecognized value '"
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r6
            r1 = r7
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r6
            r1 = 39
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            r2 = r6
            java.lang.String r2 = r2.toString()
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        L71:
            r0 = 1
            r5 = r0
        L73:
            r0 = r5
            p067di.C4459a0.f26872a = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p067di.C4459a0.m44366clinit():void");
    }

    @NotNull
    /* renamed from: a */
    public static final AbstractC4462b0 m22626a() {
        return f26872a ? C5120b.f29411i : C4512s.f26932d;
    }

    @Nullable
    /* renamed from: b */
    public static final String m22627b(@NotNull InterfaceC6792g interfaceC6792g) {
        return null;
    }

    @NotNull
    /* renamed from: c */
    public static final InterfaceC6792g m22628c(@NotNull InterfaceC4471e0 interfaceC4471e0, @NotNull InterfaceC6792g interfaceC6792g) {
        InterfaceC6792g plus = interfaceC4471e0.mo3093i().plus(interfaceC6792g);
        InterfaceC6792g interfaceC6792g2 = plus;
        if (plus != C4498n0.m22791a()) {
            interfaceC6792g2 = plus;
            if (plus.get(InterfaceC6790e.f35415d0) == null) {
                interfaceC6792g2 = plus.plus(C4498n0.m22791a());
            }
        }
        return interfaceC6792g2;
    }

    @Nullable
    /* renamed from: d */
    public static final C4523v1<?> m22629d(@NotNull InterfaceC7717d interfaceC7717d) {
        InterfaceC7717d mo22751a;
        while (!(interfaceC7717d instanceof C4489k0) && (mo22751a = interfaceC7717d.mo22751a()) != null) {
            interfaceC7717d = mo22751a;
            if (mo22751a instanceof C4523v1) {
                return (C4523v1) mo22751a;
            }
        }
        return null;
    }

    @Nullable
    /* renamed from: e */
    public static final C4523v1<?> m22630e(@NotNull InterfaceC6789d<?> interfaceC6789d, @NotNull InterfaceC6792g interfaceC6792g, @Nullable Object obj) {
        if (!(interfaceC6789d instanceof InterfaceC7717d)) {
            return null;
        }
        if (!(interfaceC6792g.get(C4526w1.f26954b) != null)) {
            return null;
        }
        C4523v1<?> m22629d = m22629d((InterfaceC7717d) interfaceC6789d);
        if (m22629d != null) {
            m22629d.m22848u0(interfaceC6792g, obj);
        }
        return m22629d;
    }
}
