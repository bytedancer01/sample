package ma;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ma/ei.class
 */
/* renamed from: ma.ei */
/* loaded from: combined.jar:classes2.jar:ma/ei.class */
public final class C6108ei implements InterfaceC6380rh {

    /* renamed from: a */
    public final InterfaceC6443uh f33751a;

    /* renamed from: b */
    public final String f33752b;

    /* renamed from: c */
    public final Object[] f33753c;

    /* renamed from: d */
    public final int f33754d;

    public C6108ei(InterfaceC6443uh interfaceC6443uh, String str, Object[] objArr) {
        this.f33751a = interfaceC6443uh;
        this.f33752b = str;
        this.f33753c = objArr;
        int charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f33754d = charAt;
            return;
        }
        int i10 = charAt & 8191;
        int i11 = 1;
        int i12 = 13;
        while (true) {
            int charAt2 = str.charAt(i11);
            if (charAt2 < 55296) {
                this.f33754d = i10 | (charAt2 << i12);
                return;
            } else {
                i10 |= (charAt2 & 8191) << i12;
                i11++;
                i12 += 13;
            }
        }
    }

    /* renamed from: a */
    public final String m29570a() {
        return this.f33752b;
    }

    /* renamed from: b */
    public final Object[] m29571b() {
        return this.f33753c;
    }

    @Override // ma.InterfaceC6380rh
    /* renamed from: k */
    public final boolean mo29572k() {
        return (this.f33754d & 2) == 2;
    }

    @Override // ma.InterfaceC6380rh
    /* renamed from: l */
    public final int mo29573l() {
        return (this.f33754d & 1) == 1 ? 1 : 2;
    }

    @Override // ma.InterfaceC6380rh
    public final InterfaceC6443uh zza() {
        return this.f33751a;
    }
}
