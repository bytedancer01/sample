package p395x2;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:x2/e.class
 */
/* renamed from: x2.e */
/* loaded from: combined.jar:classes1.jar:x2/e.class */
public class C9626e implements InterfaceC9639r {

    /* renamed from: a */
    public int f43963a;

    /* renamed from: b */
    public int f43964b;

    /* renamed from: c */
    public final int f43965c;

    /* renamed from: d */
    public final float f43966d;

    public C9626e() {
        this(2500, 1, 1.0f);
    }

    public C9626e(int i10, int i11, float f10) {
        this.f43963a = i10;
        this.f43965c = i11;
        this.f43966d = f10;
    }

    @Override // p395x2.InterfaceC9639r
    /* renamed from: a */
    public int mo40511a() {
        return this.f43964b;
    }

    @Override // p395x2.InterfaceC9639r
    /* renamed from: b */
    public int mo40512b() {
        return this.f43963a;
    }

    @Override // p395x2.InterfaceC9639r
    /* renamed from: c */
    public void mo40513c(C9642u c9642u) {
        this.f43964b++;
        int i10 = this.f43963a;
        this.f43963a = i10 + ((int) (i10 * this.f43966d));
        if (!m40514d()) {
            throw c9642u;
        }
    }

    /* renamed from: d */
    public boolean m40514d() {
        return this.f43964b <= this.f43965c;
    }
}
