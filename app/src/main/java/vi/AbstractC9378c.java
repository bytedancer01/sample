package vi;

import java.security.cert.Certificate;
import java.util.List;
import javax.net.ssl.X509TrustManager;
import org.jetbrains.annotations.NotNull;
import p372vh.C9365d;
import p372vh.C9367f;
import si.C8588j;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:vi/c.class
 */
/* renamed from: vi.c */
/* loaded from: combined.jar:classes2.jar:vi/c.class */
public abstract class AbstractC9378c {

    /* renamed from: a */
    public static final a f42911a = new a(null);

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:vi/c$a.class
     */
    /* renamed from: vi.c$a */
    /* loaded from: combined.jar:classes2.jar:vi/c$a.class */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(C9365d c9365d) {
            this();
        }

        @NotNull
        /* renamed from: a */
        public final AbstractC9378c m39553a(@NotNull X509TrustManager x509TrustManager) {
            C9367f.m39526e(x509TrustManager, "trustManager");
            return C8588j.f40042c.m36880g().mo36835c(x509TrustManager);
        }
    }

    @NotNull
    /* renamed from: a */
    public abstract List<Certificate> mo37549a(@NotNull List<? extends Certificate> list, @NotNull String str);
}
