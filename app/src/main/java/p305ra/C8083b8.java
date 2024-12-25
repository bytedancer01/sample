package p305ra;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ra/b8.class
 */
/* renamed from: ra.b8 */
/* loaded from: combined.jar:classes2.jar:ra/b8.class */
public final class C8083b8 implements InterfaceC8262n7 {

    /* renamed from: a */
    public final InterfaceC8307q7 f38947a;

    /* renamed from: b */
    public final String f38948b;

    /* renamed from: c */
    public final Object[] f38949c;

    /* renamed from: d */
    public final int f38950d;

    public C8083b8(InterfaceC8307q7 interfaceC8307q7, String str, Object[] objArr) {
        this.f38947a = interfaceC8307q7;
        this.f38948b = str;
        this.f38949c = objArr;
        int charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f38950d = charAt;
            return;
        }
        int i10 = charAt & 8191;
        int i11 = 13;
        int i12 = 1;
        while (true) {
            int charAt2 = str.charAt(i12);
            if (charAt2 < 55296) {
                this.f38950d = i10 | (charAt2 << i11);
                return;
            } else {
                i10 |= (charAt2 & 8191) << i11;
                i12++;
                i11 += 13;
            }
        }
    }

    /* renamed from: a */
    public final String m35037a() {
        return this.f38948b;
    }

    /* renamed from: b */
    public final Object[] m35038b() {
        return this.f38949c;
    }

    @Override // p305ra.InterfaceC8262n7
    /* renamed from: k */
    public final InterfaceC8307q7 mo35039k() {
        return this.f38947a;
    }

    @Override // p305ra.InterfaceC8262n7
    /* renamed from: l */
    public final int mo35040l() {
        return (this.f38950d & 1) == 1 ? 1 : 2;
    }

    @Override // p305ra.InterfaceC8262n7
    public final boolean zza() {
        return (this.f38950d & 2) == 2;
    }
}
