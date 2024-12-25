package p334t8;

import android.text.TextUtils;
import ec.C4699b;
import p059d9.C4349a;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:t8/b.class
 */
/* renamed from: t8.b */
/* loaded from: combined.jar:classes2.jar:t8/b.class */
public final class C8643b {

    /* renamed from: a */
    public final int f40362a;

    /* renamed from: b */
    public final int f40363b;

    /* renamed from: c */
    public final int f40364c;

    /* renamed from: d */
    public final int f40365d;

    /* renamed from: e */
    public final int f40366e;

    public C8643b(int i10, int i11, int i12, int i13, int i14) {
        this.f40362a = i10;
        this.f40363b = i11;
        this.f40364c = i12;
        this.f40365d = i13;
        this.f40366e = i14;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a */
    public static C8643b m37111a(String str) {
        boolean z10;
        C4349a.m21878a(str.startsWith("Format:"));
        String[] split = TextUtils.split(str.substring(7), ",");
        int i10 = -1;
        int i11 = -1;
        int i12 = -1;
        int i13 = -1;
        for (int i14 = 0; i14 < split.length; i14++) {
            String m23638e = C4699b.m23638e(split[i14].trim());
            m23638e.hashCode();
            switch (m23638e.hashCode()) {
                case 100571:
                    if (m23638e.equals("end")) {
                        z10 = false;
                        break;
                    }
                    z10 = -1;
                    break;
                case 3556653:
                    if (m23638e.equals("text")) {
                        z10 = true;
                        break;
                    }
                    z10 = -1;
                    break;
                case 109757538:
                    if (m23638e.equals("start")) {
                        z10 = 2;
                        break;
                    }
                    z10 = -1;
                    break;
                case 109780401:
                    if (m23638e.equals("style")) {
                        z10 = 3;
                        break;
                    }
                    z10 = -1;
                    break;
                default:
                    z10 = -1;
                    break;
            }
            switch (z10) {
                case false:
                    i11 = i14;
                    break;
                case true:
                    i13 = i14;
                    break;
                case true:
                    i10 = i14;
                    break;
                case true:
                    i12 = i14;
                    break;
            }
        }
        return (i10 == -1 || i11 == -1 || i13 == -1) ? null : new C8643b(i10, i11, i12, i13, split.length);
    }
}
