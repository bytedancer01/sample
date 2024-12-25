package p183k8;

import p059d9.C4349a;
import p164j8.C5322h;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:k8/a.class
 */
/* renamed from: k8.a */
/* loaded from: combined.jar:classes2.jar:k8/a.class */
public final class C5528a {
    /* renamed from: a */
    public InterfaceC5532e m27502a(C5322h c5322h) {
        String str = (String) C4349a.m21882e(c5322h.f30581c.f37086m);
        str.hashCode();
        switch (str) {
            case "audio/mp4a-latm":
                return new C5529b(c5322h);
            case "audio/ac3":
                return new C5530c(c5322h);
            case "video/avc":
                return new C5531d(c5322h);
            default:
                return null;
        }
    }
}
