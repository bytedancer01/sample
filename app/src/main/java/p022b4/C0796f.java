package p022b4;

import android.content.Context;
import java.io.File;
import p022b4.C0794d;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:b4/f.class
 */
/* renamed from: b4.f */
/* loaded from: combined.jar:classes1.jar:b4/f.class */
public final class C0796f extends C0794d {

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:b4/f$a.class
     */
    /* renamed from: b4.f$a */
    /* loaded from: combined.jar:classes1.jar:b4/f$a.class */
    public class a implements C0794d.a {

        /* renamed from: a */
        public final Context f5541a;

        /* renamed from: b */
        public final String f5542b;

        public a(Context context, String str) {
            this.f5541a = context;
            this.f5542b = str;
        }

        @Override // p022b4.C0794d.a
        /* renamed from: a */
        public File mo5097a() {
            File cacheDir = this.f5541a.getCacheDir();
            if (cacheDir == null) {
                return null;
            }
            return this.f5542b != null ? new File(cacheDir, this.f5542b) : cacheDir;
        }
    }

    public C0796f(Context context) {
        this(context, "image_manager_disk_cache", 262144000);
    }

    public C0796f(Context context, String str, int i10) {
        super(new a(context, str), i10);
    }
}
