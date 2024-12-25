package p003a2;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:a2/s.class
 */
/* renamed from: a2.s */
/* loaded from: combined.jar:classes1.jar:a2/s.class */
public class C0039s {

    /* renamed from: b */
    public View f170b;

    /* renamed from: a */
    public final Map<String, Object> f169a = new HashMap();

    /* renamed from: c */
    public final ArrayList<AbstractC0027l> f171c = new ArrayList<>();

    @Deprecated
    public C0039s() {
    }

    public C0039s(View view) {
        this.f170b = view;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0039s)) {
            return false;
        }
        C0039s c0039s = (C0039s) obj;
        return this.f170b == c0039s.f170b && this.f169a.equals(c0039s.f169a);
    }

    public int hashCode() {
        return (this.f170b.hashCode() * 31) + this.f169a.hashCode();
    }

    public String toString() {
        String str = (("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.f170b + "\n") + "    values:";
        for (String str2 : this.f169a.keySet()) {
            str = str + "    " + str2 + ": " + this.f169a.get(str2) + "\n";
        }
        return str;
    }
}
