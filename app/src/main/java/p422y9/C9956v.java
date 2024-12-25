package p422y9;

import android.os.Bundle;
import com.google.android.gms.common.api.C2414a;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:y9/v.class
 */
/* renamed from: y9.v */
/* loaded from: combined.jar:classes2.jar:y9/v.class */
public class C9956v implements C2414a.d {

    /* renamed from: c */
    public static final C9956v f45650c = m41886c().m41888a();

    /* renamed from: b */
    public final String f45651b;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:y9/v$a.class
     */
    /* renamed from: y9.v$a */
    /* loaded from: combined.jar:classes2.jar:y9/v$a.class */
    public static class a {

        /* renamed from: a */
        public String f45652a;

        public /* synthetic */ a(C9960x c9960x) {
        }

        /* renamed from: a */
        public C9956v m41888a() {
            return new C9956v(this.f45652a, null);
        }
    }

    public /* synthetic */ C9956v(String str, C9962y c9962y) {
        this.f45651b = str;
    }

    /* renamed from: c */
    public static a m41886c() {
        return new a(null);
    }

    /* renamed from: d */
    public final Bundle m41887d() {
        Bundle bundle = new Bundle();
        String str = this.f45651b;
        if (str != null) {
            bundle.putString("api", str);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C9956v) {
            return C9932n.m41832b(this.f45651b, ((C9956v) obj).f45651b);
        }
        return false;
    }

    public final int hashCode() {
        return C9932n.m41833c(this.f45651b);
    }
}
