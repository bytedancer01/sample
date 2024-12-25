package p406xd;

import android.content.Intent;
import java.util.Arrays;
import java.util.Collection;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import td.EnumC8686a;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:xd/f.class
 */
/* renamed from: xd.f */
/* loaded from: combined.jar:classes2.jar:xd/f.class */
public final class C9729f {

    /* renamed from: a */
    public static final Pattern f44388a = Pattern.compile(",");

    /* renamed from: b */
    public static final Set<EnumC8686a> f44389b;

    /* renamed from: c */
    public static final Set<EnumC8686a> f44390c;

    /* renamed from: d */
    public static final Set<EnumC8686a> f44391d;

    /* renamed from: e */
    public static final Set<EnumC8686a> f44392e;

    /* renamed from: f */
    public static final Set<EnumC8686a> f44393f;

    /* renamed from: g */
    public static final Set<EnumC8686a> f44394g;

    /* renamed from: h */
    public static final Set<EnumC8686a> f44395h;

    /* renamed from: i */
    public static final Map<String, Set<EnumC8686a>> f44396i;

    static {
        EnumSet of2 = EnumSet.of(EnumC8686a.QR_CODE);
        f44392e = of2;
        EnumSet of3 = EnumSet.of(EnumC8686a.DATA_MATRIX);
        f44393f = of3;
        EnumSet of4 = EnumSet.of(EnumC8686a.AZTEC);
        f44394g = of4;
        EnumSet of5 = EnumSet.of(EnumC8686a.PDF_417);
        f44395h = of5;
        EnumSet of6 = EnumSet.of(EnumC8686a.UPC_A, EnumC8686a.UPC_E, EnumC8686a.EAN_13, EnumC8686a.EAN_8, EnumC8686a.RSS_14, EnumC8686a.RSS_EXPANDED);
        f44389b = of6;
        EnumSet of7 = EnumSet.of(EnumC8686a.CODE_39, EnumC8686a.CODE_93, EnumC8686a.CODE_128, EnumC8686a.ITF, EnumC8686a.CODABAR);
        f44390c = of7;
        EnumSet copyOf = EnumSet.copyOf((Collection) of6);
        f44391d = copyOf;
        copyOf.addAll(of7);
        HashMap hashMap = new HashMap();
        f44396i = hashMap;
        hashMap.put("ONE_D_MODE", copyOf);
        hashMap.put("PRODUCT_MODE", of6);
        hashMap.put("QR_CODE_MODE", of2);
        hashMap.put("DATA_MATRIX_MODE", of3);
        hashMap.put("AZTEC_MODE", of4);
        hashMap.put("PDF417_MODE", of5);
    }

    /* renamed from: a */
    public static Set<EnumC8686a> m41015a(Intent intent) {
        String stringExtra = intent.getStringExtra("SCAN_FORMATS");
        return m41016b(stringExtra != null ? Arrays.asList(f44388a.split(stringExtra)) : null, intent.getStringExtra("SCAN_MODE"));
    }

    /* renamed from: b */
    public static Set<EnumC8686a> m41016b(Iterable<String> iterable, String str) {
        if (iterable != null) {
            EnumSet noneOf = EnumSet.noneOf(EnumC8686a.class);
            try {
                Iterator<String> it = iterable.iterator();
                while (it.hasNext()) {
                    noneOf.add(EnumC8686a.valueOf(it.next()));
                }
                return noneOf;
            } catch (IllegalArgumentException e10) {
            }
        }
        if (str != null) {
            return f44396i.get(str);
        }
        return null;
    }
}
