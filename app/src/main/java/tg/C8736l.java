package tg;

import java.io.UnsupportedEncodingException;
import p411xi.C9764h;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:tg/l.class
 */
/* renamed from: tg.l */
/* loaded from: combined.jar:classes2.jar:tg/l.class */
public final class C8736l {
    /* renamed from: a */
    public static String m37388a(String str, String str2) {
        try {
            return "Basic " + C9764h.m41184t((str + ":" + str2).getBytes("ISO-8859-1")).mo41190d();
        } catch (UnsupportedEncodingException e10) {
            throw new AssertionError();
        }
    }
}
