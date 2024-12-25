package p057d7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p059d9.C4401z0;
import p283q7.C7839a;
import p366v7.C9297e;
import p366v7.C9302j;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:d7/o.class
 */
/* renamed from: d7.o */
/* loaded from: combined.jar:classes2.jar:d7/o.class */
public final class C4332o {

    /* renamed from: c */
    public static final Pattern f26487c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* renamed from: a */
    public int f26488a = -1;

    /* renamed from: b */
    public int f26489b = -1;

    /* renamed from: a */
    public boolean m21836a() {
        return (this.f26488a == -1 || this.f26489b == -1) ? false : true;
    }

    /* renamed from: b */
    public final boolean m21837b(String str) {
        Matcher matcher = f26487c.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            int parseInt = Integer.parseInt((String) C4401z0.m22391j(matcher.group(1)), 16);
            int parseInt2 = Integer.parseInt((String) C4401z0.m22391j(matcher.group(2)), 16);
            if (parseInt <= 0 && parseInt2 <= 0) {
                return false;
            }
            this.f26488a = parseInt;
            this.f26489b = parseInt2;
            return true;
        } catch (NumberFormatException e10) {
            return false;
        }
    }

    /* renamed from: c */
    public boolean m21838c(C7839a c7839a) {
        for (int i10 = 0; i10 < c7839a.m34087k(); i10++) {
            C7839a.b m34086j = c7839a.m34086j(i10);
            if (m34086j instanceof C9297e) {
                C9297e c9297e = (C9297e) m34086j;
                if ("iTunSMPB".equals(c9297e.f42416d) && m21837b(c9297e.f42417e)) {
                    return true;
                }
            } else if (m34086j instanceof C9302j) {
                C9302j c9302j = (C9302j) m34086j;
                if ("com.apple.iTunes".equals(c9302j.f42428c) && "iTunSMPB".equals(c9302j.f42429d) && m21837b(c9302j.f42430e)) {
                    return true;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    /* renamed from: d */
    public boolean m21839d(int i10) {
        int i11 = i10 >> 12;
        int i12 = i10 & 4095;
        if (i11 <= 0 && i12 <= 0) {
            return false;
        }
        this.f26488a = i11;
        this.f26489b = i12;
        return true;
    }
}
