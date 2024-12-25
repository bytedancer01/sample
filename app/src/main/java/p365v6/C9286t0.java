package p365v6;

import android.util.Pair;
import java.util.Map;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:v6/t0.class
 */
/* renamed from: v6.t0 */
/* loaded from: combined.jar:classes2.jar:v6/t0.class */
public final class C9286t0 {
    /* renamed from: a */
    public static long m39159a(Map<String, String> map, String str) {
        if (map == null) {
            return -9223372036854775807L;
        }
        try {
            String str2 = map.get(str);
            if (str2 != null) {
                return Long.parseLong(str2);
            }
            return -9223372036854775807L;
        } catch (NumberFormatException e10) {
            return -9223372036854775807L;
        }
    }

    /* renamed from: b */
    public static Pair<Long, Long> m39160b(InterfaceC9277p interfaceC9277p) {
        Map<String, String> mo39029g = interfaceC9277p.mo39029g();
        if (mo39029g == null) {
            return null;
        }
        return new Pair<>(Long.valueOf(m39159a(mo39029g, "LicenseDurationRemaining")), Long.valueOf(m39159a(mo39029g, "PlaybackDurationRemaining")));
    }
}
