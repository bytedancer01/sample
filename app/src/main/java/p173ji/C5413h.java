package p173ji;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p372vh.C9367f;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ji/h.class
 */
/* renamed from: ji.h */
/* loaded from: combined.jar:classes2.jar:ji/h.class */
public final class C5413h {

    /* renamed from: a */
    @NotNull
    public final Map<String, String> f30957a;

    /* renamed from: b */
    @NotNull
    public final String f30958b;

    public C5413h(@NotNull String str, @NotNull Map<String, String> map) {
        String str2;
        C9367f.m39526e(str, "scheme");
        C9367f.m39526e(map, "authParams");
        this.f30958b = str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (key != null) {
                Locale locale = Locale.US;
                C9367f.m39525d(locale, "US");
                str2 = key.toLowerCase(locale);
                C9367f.m39525d(str2, "(this as java.lang.String).toLowerCase(locale)");
            } else {
                str2 = null;
            }
            linkedHashMap.put(str2, value);
        }
        Map<String, String> unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        C9367f.m39525d(unmodifiableMap, "unmodifiableMap<String?, String>(newAuthParams)");
        this.f30957a = unmodifiableMap;
    }

    @NotNull
    /* renamed from: a */
    public final Charset m26974a() {
        String str = this.f30957a.get("charset");
        if (str != null) {
            try {
                Charset forName = Charset.forName(str);
                C9367f.m39525d(forName, "Charset.forName(charset)");
                return forName;
            } catch (Exception e10) {
            }
        }
        Charset charset = StandardCharsets.ISO_8859_1;
        C9367f.m39525d(charset, "ISO_8859_1");
        return charset;
    }

    @Nullable
    /* renamed from: b */
    public final String m26975b() {
        return this.f30957a.get("realm");
    }

    @NotNull
    /* renamed from: c */
    public final String m26976c() {
        return this.f30958b;
    }

    public boolean equals(@Nullable Object obj) {
        boolean z10;
        if (obj instanceof C5413h) {
            C5413h c5413h = (C5413h) obj;
            if (C9367f.m39522a(c5413h.f30958b, this.f30958b) && C9367f.m39522a(c5413h.f30957a, this.f30957a)) {
                z10 = true;
                return z10;
            }
        }
        z10 = false;
        return z10;
    }

    public int hashCode() {
        return ((899 + this.f30958b.hashCode()) * 31) + this.f30957a.hashCode();
    }

    @NotNull
    public String toString() {
        return this.f30958b + " authParams=" + this.f30957a;
    }
}
