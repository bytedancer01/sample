package p073e4;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.util.Log;
import p416y3.InterfaceC9817c;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:e4/n.class
 */
/* renamed from: e4.n */
/* loaded from: combined.jar:classes1.jar:e4/n.class */
public class C4619n<T> implements InterfaceC4617l<Integer, T> {

    /* renamed from: a */
    public final InterfaceC4617l<Uri, T> f27317a;

    /* renamed from: b */
    public final Resources f27318b;

    public C4619n(Context context, InterfaceC4617l<Uri, T> interfaceC4617l) {
        this(context.getResources(), interfaceC4617l);
    }

    public C4619n(Resources resources, InterfaceC4617l<Uri, T> interfaceC4617l) {
        this.f27318b = resources;
        this.f27317a = interfaceC4617l;
    }

    @Override // p073e4.InterfaceC4617l
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public InterfaceC9817c<T> mo23227a(Integer num, int i10, int i11) {
        Uri uri;
        try {
            uri = Uri.parse("android.resource://" + this.f27318b.getResourcePackageName(num.intValue()) + '/' + this.f27318b.getResourceTypeName(num.intValue()) + '/' + this.f27318b.getResourceEntryName(num.intValue()));
        } catch (Resources.NotFoundException e10) {
            if (Log.isLoggable("ResourceLoader", 5)) {
                Log.w("ResourceLoader", "Received invalid resource id: " + num, e10);
            }
            uri = null;
        }
        if (uri != null) {
            return this.f27317a.mo23227a(uri, i10, i11);
        }
        return null;
    }
}
