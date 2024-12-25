package p406xd;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import java.util.EnumMap;
import java.util.Map;
import java.util.regex.Pattern;
import td.EnumC8690e;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:xd/g.class
 */
/* renamed from: xd.g */
/* loaded from: combined.jar:classes2.jar:xd/g.class */
public final class C9730g {

    /* renamed from: a */
    public static final String f44397a = "g";

    /* renamed from: b */
    public static final Pattern f44398b = Pattern.compile(",");

    /* renamed from: a */
    public static Map<EnumC8690e, Object> m41017a(Intent intent) {
        Object obj;
        Bundle extras = intent.getExtras();
        if (extras == null || extras.isEmpty()) {
            return null;
        }
        EnumMap enumMap = new EnumMap(EnumC8690e.class);
        for (EnumC8690e enumC8690e : EnumC8690e.values()) {
            if (enumC8690e != EnumC8690e.CHARACTER_SET && enumC8690e != EnumC8690e.NEED_RESULT_POINT_CALLBACK && enumC8690e != EnumC8690e.POSSIBLE_FORMATS) {
                String name = enumC8690e.name();
                if (extras.containsKey(name)) {
                    if (enumC8690e.getValueType().equals(Void.class)) {
                        obj = Boolean.TRUE;
                    } else {
                        obj = extras.get(name);
                        if (!enumC8690e.getValueType().isInstance(obj)) {
                            Log.w(f44397a, "Ignoring hint " + enumC8690e + " because it is not assignable from " + obj);
                        }
                    }
                    enumMap.put((EnumMap) enumC8690e, (EnumC8690e) obj);
                }
            }
        }
        Log.i(f44397a, "Hints from the Intent: " + enumMap);
        return enumMap;
    }
}
