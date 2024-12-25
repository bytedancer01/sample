package p404xb;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:xb/e.class
 */
/* renamed from: xb.e */
/* loaded from: combined.jar:classes2.jar:xb/e.class */
public class C9710e extends C9709d {

    /* renamed from: a */
    public float f44253a = -1.0f;

    @Override // p404xb.C9709d
    /* renamed from: a */
    public void mo40810a(C9718m c9718m, float f10, float f11, float f12) {
        c9718m.m40966o(0.0f, f12 * f11, 180.0f, 180.0f - f10);
        double d10 = f12;
        double d11 = f11;
        c9718m.m40964m((float) (Math.sin(Math.toRadians(f10)) * d10 * d11), (float) (Math.sin(Math.toRadians(90.0f - f10)) * d10 * d11));
    }
}
