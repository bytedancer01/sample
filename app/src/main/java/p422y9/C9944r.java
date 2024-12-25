package p422y9;

import android.content.Context;
import android.content.res.Resources;
import p350u9.C8826m;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:y9/r.class
 */
/* renamed from: y9.r */
/* loaded from: combined.jar:classes2.jar:y9/r.class */
public class C9944r {

    /* renamed from: a */
    public final Resources f45642a;

    /* renamed from: b */
    public final String f45643b;

    public C9944r(Context context) {
        C9935o.m41850j(context);
        Resources resources = context.getResources();
        this.f45642a = resources;
        this.f45643b = resources.getResourcePackageName(C8826m.f40870a);
    }

    /* renamed from: a */
    public String m41873a(String str) {
        int identifier = this.f45642a.getIdentifier(str, "string", this.f45643b);
        if (identifier == 0) {
            return null;
        }
        return this.f45642a.getString(identifier);
    }
}
