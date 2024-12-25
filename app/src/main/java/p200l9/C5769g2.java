package p200l9;

import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;
import p304r9.C8013a;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:l9/g2.class
 */
/* renamed from: l9.g2 */
/* loaded from: combined.jar:classes2.jar:l9/g2.class */
public final class C5769g2 {

    /* renamed from: a */
    public final String f32238a;

    /* renamed from: b */
    public final String f32239b;

    /* renamed from: c */
    public final Collection f32240c;

    public /* synthetic */ C5769g2(String str, String str2, Collection collection, boolean z10, boolean z11, C5765f2 c5765f2) {
        this.f32238a = str;
        this.f32239b = str2;
        this.f32240c = collection;
    }

    /* renamed from: a */
    public static /* bridge */ /* synthetic */ String m28198a(C5769g2 c5769g2) {
        StringBuilder sb2 = new StringBuilder(c5769g2.f32238a);
        String str = c5769g2.f32239b;
        if (str != null) {
            String upperCase = str.toUpperCase(Locale.ROOT);
            if (!upperCase.matches("[A-F0-9]+")) {
                throw new IllegalArgumentException("Invalid application ID: ".concat(String.valueOf(c5769g2.f32239b)));
            }
            sb2.append("/");
            sb2.append(upperCase);
        }
        Collection collection = c5769g2.f32240c;
        if (collection != null) {
            if (!collection.isEmpty()) {
                if (c5769g2.f32239b == null) {
                    sb2.append("/");
                }
                sb2.append("/");
                Iterator it = c5769g2.f32240c.iterator();
                boolean z10 = true;
                while (true) {
                    boolean z11 = z10;
                    if (!it.hasNext()) {
                        break;
                    }
                    String str2 = (String) it.next();
                    C8013a.m34865f(str2);
                    if (!z11) {
                        sb2.append(",");
                    }
                    sb2.append(C8013a.m34868i(str2));
                    z10 = false;
                }
            } else {
                throw new IllegalArgumentException("Must specify at least one namespace");
            }
        }
        if (c5769g2.f32239b == null && c5769g2.f32240c == null) {
            sb2.append("/");
        }
        if (c5769g2.f32240c == null) {
            sb2.append("/");
        }
        sb2.append("//ALLOW_IPV6");
        return sb2.toString();
    }
}
