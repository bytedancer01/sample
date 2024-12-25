package p395x2;

import android.content.Intent;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:x2/a.class
 */
/* renamed from: x2.a */
/* loaded from: combined.jar:classes1.jar:x2/a.class */
public class C9622a extends C9642u {

    /* renamed from: d */
    public Intent f43943d;

    public C9622a(C9632k c9632k) {
        super(c9632k);
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.f43943d != null ? "User needs to (re)enter credentials." : super.getMessage();
    }
}
