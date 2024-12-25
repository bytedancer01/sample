package p164j8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p059d9.C4349a;
import p164j8.C5314a;
import p164j8.C5340z;
import p267p6.C7594k1;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:j8/a0.class
 */
/* renamed from: j8.a0 */
/* loaded from: combined.jar:classes2.jar:j8/a0.class */
public final class C5315a0 {

    /* renamed from: a */
    public static final Pattern f30534a = Pattern.compile("([a-z])=\\s?(.+)");

    /* renamed from: b */
    public static final Pattern f30535b = Pattern.compile("([0-9A-Za-z-]+)(?::(.*))?");

    /* renamed from: c */
    public static final Pattern f30536c = Pattern.compile("(\\S+)\\s(\\S+)\\s(\\S+)\\s(\\S+)");

    /* renamed from: a */
    public static void m26540a(C5340z.b bVar, C5314a.b bVar2) {
        try {
            bVar.m26606n(bVar2.m26534j());
        } catch (IllegalArgumentException | IllegalStateException e10) {
            throw C7594k1.m32824c(null, e10);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:121:0x0376, code lost:
    
        continue;
     */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static p164j8.C5340z m26541b(java.lang.String r6) {
        /*
            Method dump skipped, instructions count: 952
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p164j8.C5315a0.m26541b(java.lang.String):j8.z");
    }

    /* renamed from: c */
    public static C5314a.b m26542c(String str) {
        Matcher matcher = f30536c.matcher(str);
        if (!matcher.matches()) {
            throw C7594k1.m32824c("Malformed SDP media description line: " + str, null);
        }
        try {
            return new C5314a.b((String) C4349a.m21882e(matcher.group(1)), Integer.parseInt((String) C4349a.m21882e(matcher.group(2))), (String) C4349a.m21882e(matcher.group(3)), Integer.parseInt((String) C4349a.m21882e(matcher.group(4))));
        } catch (NumberFormatException e10) {
            throw C7594k1.m32824c("Malformed SDP media description line: " + str, e10);
        }
    }
}
