package p073e4;

import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import p416y3.InterfaceC9817c;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:e4/p.class
 */
/* renamed from: e4.p */
/* loaded from: combined.jar:classes1.jar:e4/p.class */
public class C4621p<T> implements InterfaceC4617l<String, T> {

    /* renamed from: a */
    public final InterfaceC4617l<Uri, T> f27319a;

    public C4621p(InterfaceC4617l<Uri, T> interfaceC4617l) {
        this.f27319a = interfaceC4617l;
    }

    /* renamed from: c */
    public static Uri m23260c(String str) {
        return Uri.fromFile(new File(str));
    }

    @Override // p073e4.InterfaceC4617l
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public InterfaceC9817c<T> mo23227a(String str, int i10, int i11) {
        Uri uri;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (!str.startsWith("/")) {
            Uri parse = Uri.parse(str);
            if (parse.getScheme() != null) {
                uri = parse;
                return this.f27319a.mo23227a(uri, i10, i11);
            }
        }
        uri = m23260c(str);
        return this.f27319a.mo23227a(uri, i10, i11);
    }
}
