package p340u;

import android.view.View;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:u/a.class
 */
/* renamed from: u.a */
/* loaded from: combined.jar:classes1.jar:u/a.class */
public class C8782a {
    /* renamed from: a */
    public static String m37585a(View view) {
        try {
            return view.getContext().getResources().getResourceEntryName(view.getId());
        } catch (Exception e10) {
            return "UNKNOWN";
        }
    }
}
