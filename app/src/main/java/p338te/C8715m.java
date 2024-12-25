package p338te;

import java.util.Collection;
import java.util.EnumMap;
import java.util.Map;
import td.C8694i;
import td.EnumC8686a;
import td.EnumC8690e;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:te/m.class
 */
/* renamed from: te.m */
/* loaded from: combined.jar:classes2.jar:te/m.class */
public class C8715m implements InterfaceC8712j {

    /* renamed from: a */
    public Collection<EnumC8686a> f40513a;

    /* renamed from: b */
    public Map<EnumC8690e, ?> f40514b;

    /* renamed from: c */
    public String f40515c;

    /* renamed from: d */
    public int f40516d;

    public C8715m() {
    }

    public C8715m(Collection<EnumC8686a> collection, Map<EnumC8690e, ?> map, String str, int i10) {
        this.f40513a = collection;
        this.f40514b = map;
        this.f40515c = str;
        this.f40516d = i10;
    }

    @Override // p338te.InterfaceC8712j
    /* renamed from: a */
    public C8711i mo37234a(Map<EnumC8690e, ?> map) {
        EnumMap enumMap = new EnumMap(EnumC8690e.class);
        enumMap.putAll(map);
        Map<EnumC8690e, ?> map2 = this.f40514b;
        if (map2 != null) {
            enumMap.putAll(map2);
        }
        Collection<EnumC8686a> collection = this.f40513a;
        if (collection != null) {
            enumMap.put((EnumMap) EnumC8690e.POSSIBLE_FORMATS, (EnumC8690e) collection);
        }
        String str = this.f40515c;
        if (str != null) {
            enumMap.put((EnumMap) EnumC8690e.CHARACTER_SET, (EnumC8690e) str);
        }
        C8694i c8694i = new C8694i();
        c8694i.m37208e(enumMap);
        int i10 = this.f40516d;
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? new C8711i(c8694i) : new C8717o(c8694i) : new C8716n(c8694i) : new C8711i(c8694i);
    }
}
