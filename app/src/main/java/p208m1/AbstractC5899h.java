package p208m1;

import android.os.Messenger;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:m1/h.class
 */
/* renamed from: m1.h */
/* loaded from: combined.jar:classes1.jar:m1/h.class */
public abstract class AbstractC5899h {
    /* renamed from: a */
    public static boolean m28851a(Messenger messenger) {
        boolean z10 = false;
        if (messenger != null) {
            try {
                z10 = false;
                if (messenger.getBinder() != null) {
                    z10 = true;
                }
            } catch (NullPointerException e10) {
                z10 = false;
            }
        }
        return z10;
    }
}
