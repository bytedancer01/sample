package p428yg;

import android.graphics.Bitmap;
import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:yg/j.class
 */
/* renamed from: yg.j */
/* loaded from: combined.jar:classes2.jar:yg/j.class */
public interface InterfaceC10004j {

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:yg/j$a.class
     */
    /* renamed from: yg.j$a */
    /* loaded from: combined.jar:classes2.jar:yg/j$a.class */
    public static class a {

        /* renamed from: a */
        public final InputStream f45860a;

        /* renamed from: b */
        public final Bitmap f45861b;

        /* renamed from: c */
        public final boolean f45862c;

        /* renamed from: d */
        public final long f45863d;

        public a(InputStream inputStream, boolean z10, long j10) {
            if (inputStream == null) {
                throw new IllegalArgumentException("Stream may not be null.");
            }
            this.f45860a = inputStream;
            this.f45861b = null;
            this.f45862c = z10;
            this.f45863d = j10;
        }

        @Deprecated
        /* renamed from: a */
        public Bitmap m42089a() {
            return this.f45861b;
        }

        /* renamed from: b */
        public long m42090b() {
            return this.f45863d;
        }

        /* renamed from: c */
        public InputStream m42091c() {
            return this.f45860a;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:yg/j$b.class
     */
    /* renamed from: yg.j$b */
    /* loaded from: combined.jar:classes2.jar:yg/j$b.class */
    public static class b extends IOException {

        /* renamed from: b */
        public final boolean f45864b;

        /* renamed from: c */
        public final int f45865c;

        public b(String str, int i10, int i11) {
            super(str);
            this.f45864b = EnumC10011q.isOfflineOnly(i10);
            this.f45865c = i11;
        }
    }

    /* renamed from: a */
    a mo42032a(Uri uri, int i10);
}
