package p114g8;

import android.net.Uri;
import java.util.LinkedHashMap;
import java.util.Map;
import p059d9.C4349a;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:g8/e.class
 */
/* renamed from: g8.e */
/* loaded from: combined.jar:classes2.jar:g8/e.class */
public final class C4972e {

    /* renamed from: a */
    public final LinkedHashMap<Uri, byte[]> f28816a;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:g8/e$a.class
     */
    /* renamed from: g8.e$a */
    /* loaded from: combined.jar:classes2.jar:g8/e$a.class */
    public class a extends LinkedHashMap<Uri, byte[]> {

        /* renamed from: b */
        public final int f28817b;

        /* renamed from: c */
        public final C4972e f28818c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C4972e c4972e, int i10, float f10, boolean z10, int i11) {
            super(i10, f10, z10);
            this.f28818c = c4972e;
            this.f28817b = i11;
        }

        @Override // java.util.LinkedHashMap
        public boolean removeEldestEntry(Map.Entry<Uri, byte[]> entry) {
            return size() > this.f28817b;
        }
    }

    public C4972e(int i10) {
        this.f28816a = new a(this, i10 + 1, 1.0f, false, i10);
    }

    /* renamed from: a */
    public byte[] m25024a(Uri uri) {
        if (uri == null) {
            return null;
        }
        return this.f28816a.get(uri);
    }

    /* renamed from: b */
    public byte[] m25025b(Uri uri, byte[] bArr) {
        return this.f28816a.put((Uri) C4349a.m21882e(uri), (byte[]) C4349a.m21882e(bArr));
    }

    /* renamed from: c */
    public byte[] m25026c(Uri uri) {
        return this.f28816a.remove(C4349a.m21882e(uri));
    }
}
