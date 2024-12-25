package p422y9;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:y9/n.class
 */
/* renamed from: y9.n */
/* loaded from: combined.jar:classes2.jar:y9/n.class */
public final class C9932n {

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:y9/n$a.class
     */
    /* renamed from: y9.n$a */
    /* loaded from: combined.jar:classes2.jar:y9/n$a.class */
    public static final class a {

        /* renamed from: a */
        public final List<String> f45615a;

        /* renamed from: b */
        public final Object f45616b;

        public /* synthetic */ a(Object obj, C9957v0 c9957v0) {
            C9935o.m41850j(obj);
            this.f45616b = obj;
            this.f45615a = new ArrayList();
        }

        /* renamed from: a */
        public a m41835a(String str, Object obj) {
            List<String> list = this.f45615a;
            C9935o.m41850j(str);
            String valueOf = String.valueOf(obj);
            StringBuilder sb2 = new StringBuilder(str.length() + 1 + valueOf.length());
            sb2.append(str);
            sb2.append("=");
            sb2.append(valueOf);
            list.add(sb2.toString());
            return this;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder(100);
            sb2.append(this.f45616b.getClass().getSimpleName());
            sb2.append('{');
            int size = this.f45615a.size();
            for (int i10 = 0; i10 < size; i10++) {
                sb2.append(this.f45615a.get(i10));
                if (i10 < size - 1) {
                    sb2.append(", ");
                }
            }
            sb2.append('}');
            return sb2.toString();
        }
    }

    /* renamed from: a */
    public static boolean m41831a(Bundle bundle, Bundle bundle2) {
        if (bundle == null || bundle2 == null) {
            return bundle == bundle2;
        }
        if (bundle.size() != bundle2.size()) {
            return false;
        }
        Set<String> keySet = bundle.keySet();
        if (!keySet.containsAll(bundle2.keySet())) {
            return false;
        }
        for (String str : keySet) {
            if (!m41832b(bundle.get(str), bundle2.get(str))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public static boolean m41832b(Object obj, Object obj2) {
        boolean z10 = false;
        if (obj != obj2) {
            if (obj != null) {
                if (!obj.equals(obj2)) {
                    return false;
                }
            }
            return z10;
        }
        z10 = true;
        return z10;
    }

    /* renamed from: c */
    public static int m41833c(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    /* renamed from: d */
    public static a m41834d(Object obj) {
        return new a(obj, null);
    }
}
