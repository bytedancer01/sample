package mg;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import java.util.Collection;
import java.util.Iterator;
import org.apache.http.client.config.CookieSpecs;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:mg/d.class
 */
/* renamed from: mg.d */
/* loaded from: combined.jar:classes2.jar:mg/d.class */
public class C6601d {

    /* renamed from: a */
    public final k f34482a;

    /* renamed from: b */
    public final Handler f34483b = new Handler(Looper.getMainLooper());

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:mg/d$a.class
     */
    /* renamed from: mg.d$a */
    /* loaded from: combined.jar:classes2.jar:mg/d$a.class */
    public class a implements Runnable {

        /* renamed from: b */
        public final String f34484b;

        /* renamed from: c */
        public final C6601d f34485c;

        public a(C6601d c6601d, String str) {
            this.f34485c = c6601d;
            this.f34484b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator<InterfaceC6604g> it = this.f34485c.f34482a.mo30483b().iterator();
            while (it.hasNext()) {
                it.next().mo30475c(this.f34484b);
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:mg/d$b.class
     */
    /* renamed from: mg.d$b */
    /* loaded from: combined.jar:classes2.jar:mg/d$b.class */
    public class b implements Runnable {

        /* renamed from: b */
        public final C6601d f34486b;

        public b(C6601d c6601d) {
            this.f34486b = c6601d;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator<InterfaceC6604g> it = this.f34486b.f34482a.mo30483b().iterator();
            while (it.hasNext()) {
                it.next().mo17045l();
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:mg/d$c.class
     */
    /* renamed from: mg.d$c */
    /* loaded from: combined.jar:classes2.jar:mg/d$c.class */
    public class c implements Runnable {

        /* renamed from: b */
        public final int f34487b;

        /* renamed from: c */
        public final C6601d f34488c;

        public c(C6601d c6601d, int i10) {
            this.f34488c = c6601d;
            this.f34487b = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator<InterfaceC6604g> it = this.f34488c.f34482a.mo30483b().iterator();
            while (it.hasNext()) {
                it.next().mo17044h(this.f34487b);
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:mg/d$d.class
     */
    /* renamed from: mg.d$d */
    /* loaded from: combined.jar:classes2.jar:mg/d$d.class */
    public class d implements Runnable {

        /* renamed from: b */
        public final String f34489b;

        /* renamed from: c */
        public final C6601d f34490c;

        public d(C6601d c6601d, String str) {
            this.f34490c = c6601d;
            this.f34489b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator<InterfaceC6604g> it = this.f34490c.f34482a.mo30483b().iterator();
            while (it.hasNext()) {
                it.next().mo30479j(this.f34489b);
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:mg/d$e.class
     */
    /* renamed from: mg.d$e */
    /* loaded from: combined.jar:classes2.jar:mg/d$e.class */
    public class e implements Runnable {

        /* renamed from: b */
        public final String f34491b;

        /* renamed from: c */
        public final C6601d f34492c;

        public e(C6601d c6601d, String str) {
            this.f34492c = c6601d;
            this.f34491b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator<InterfaceC6604g> it = this.f34492c.f34482a.mo30483b().iterator();
            while (it.hasNext()) {
                it.next().mo30478i(this.f34491b);
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:mg/d$f.class
     */
    /* renamed from: mg.d$f */
    /* loaded from: combined.jar:classes2.jar:mg/d$f.class */
    public class f implements Runnable {

        /* renamed from: b */
        public final int f34493b;

        /* renamed from: c */
        public final C6601d f34494c;

        public f(C6601d c6601d, int i10) {
            this.f34494c = c6601d;
            this.f34493b = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator<InterfaceC6604g> it = this.f34494c.f34482a.mo30483b().iterator();
            while (it.hasNext()) {
                it.next().onError(this.f34493b);
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:mg/d$g.class
     */
    /* renamed from: mg.d$g */
    /* loaded from: combined.jar:classes2.jar:mg/d$g.class */
    public class g implements Runnable {

        /* renamed from: b */
        public final C6601d f34495b;

        public g(C6601d c6601d) {
            this.f34495b = c6601d;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator<InterfaceC6604g> it = this.f34495b.f34482a.mo30483b().iterator();
            while (it.hasNext()) {
                it.next().mo30477f();
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:mg/d$h.class
     */
    /* renamed from: mg.d$h */
    /* loaded from: combined.jar:classes2.jar:mg/d$h.class */
    public class h implements Runnable {

        /* renamed from: b */
        public final float f34496b;

        /* renamed from: c */
        public final C6601d f34497c;

        public h(C6601d c6601d, float f10) {
            this.f34497c = c6601d;
            this.f34496b = f10;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator<InterfaceC6604g> it = this.f34497c.f34482a.mo30483b().iterator();
            while (it.hasNext()) {
                it.next().mo30481n(this.f34496b);
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:mg/d$i.class
     */
    /* renamed from: mg.d$i */
    /* loaded from: combined.jar:classes2.jar:mg/d$i.class */
    public class i implements Runnable {

        /* renamed from: b */
        public final float f34498b;

        /* renamed from: c */
        public final C6601d f34499c;

        public i(C6601d c6601d, float f10) {
            this.f34499c = c6601d;
            this.f34498b = f10;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator<InterfaceC6604g> it = this.f34499c.f34482a.mo30483b().iterator();
            while (it.hasNext()) {
                it.next().mo30476e(this.f34498b);
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:mg/d$j.class
     */
    /* renamed from: mg.d$j */
    /* loaded from: combined.jar:classes2.jar:mg/d$j.class */
    public class j implements Runnable {

        /* renamed from: b */
        public final float f34500b;

        /* renamed from: c */
        public final C6601d f34501c;

        public j(C6601d c6601d, float f10) {
            this.f34501c = c6601d;
            this.f34500b = f10;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator<InterfaceC6604g> it = this.f34501c.f34482a.mo30483b().iterator();
            while (it.hasNext()) {
                it.next().mo30480k(this.f34500b);
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:mg/d$k.class
     */
    /* renamed from: mg.d$k */
    /* loaded from: combined.jar:classes2.jar:mg/d$k.class */
    public interface k {
        /* renamed from: b */
        Collection<InterfaceC6604g> mo30483b();

        /* renamed from: c */
        void mo30484c();
    }

    public C6601d(k kVar) {
        this.f34482a = kVar;
    }

    /* renamed from: b */
    public final String m30492b(String str) {
        return str.equalsIgnoreCase("small") ? "small" : str.equalsIgnoreCase("medium") ? "medium" : str.equalsIgnoreCase("large") ? "large" : str.equalsIgnoreCase("hd720") ? "hd720" : str.equalsIgnoreCase("hd1080") ? "hd1080" : str.equalsIgnoreCase("highres") ? "highres" : str.equalsIgnoreCase(CookieSpecs.DEFAULT) ? CookieSpecs.DEFAULT : "unknown";
    }

    /* renamed from: c */
    public final String m30493c(String str) {
        return str.equalsIgnoreCase("0.25") ? "0.25" : str.equalsIgnoreCase("0.5") ? "0.5" : str.equalsIgnoreCase("1") ? "1" : str.equalsIgnoreCase("1.5") ? "1.5" : str.equalsIgnoreCase("2") ? "2" : "-10";
    }

    /* renamed from: d */
    public final int m30494d(String str) {
        int i10 = 3;
        if (str.equalsIgnoreCase("2")) {
            i10 = 0;
        } else if (str.equalsIgnoreCase("5")) {
            i10 = 1;
        } else if (str.equalsIgnoreCase("100")) {
            i10 = 2;
        } else if (!str.equalsIgnoreCase("101") && !str.equalsIgnoreCase("150")) {
            i10 = -10;
        }
        return i10;
    }

    /* renamed from: e */
    public final int m30495e(String str) {
        return str.equalsIgnoreCase("UNSTARTED") ? -1 : str.equalsIgnoreCase("ENDED") ? 0 : str.equalsIgnoreCase("PLAYING") ? 1 : str.equalsIgnoreCase("PAUSED") ? 2 : str.equalsIgnoreCase("BUFFERING") ? 3 : str.equalsIgnoreCase("CUED") ? 5 : -10;
    }

    @JavascriptInterface
    public void sendApiChange() {
        this.f34483b.post(new g(this));
    }

    @JavascriptInterface
    public void sendError(String str) {
        this.f34483b.post(new f(this, m30494d(str)));
    }

    @JavascriptInterface
    public void sendPlaybackQualityChange(String str) {
        this.f34483b.post(new d(this, m30492b(str)));
    }

    @JavascriptInterface
    public void sendPlaybackRateChange(String str) {
        this.f34483b.post(new e(this, m30493c(str)));
    }

    @JavascriptInterface
    public void sendReady() {
        this.f34483b.post(new b(this));
    }

    @JavascriptInterface
    public void sendStateChange(String str) {
        this.f34483b.post(new c(this, m30495e(str)));
    }

    @JavascriptInterface
    public void sendVideoCurrentTime(String str) {
        try {
            this.f34483b.post(new h(this, Float.parseFloat(str)));
        } catch (NumberFormatException e10) {
            e10.printStackTrace();
        }
    }

    @JavascriptInterface
    public void sendVideoDuration(String str) {
        String str2 = str;
        try {
            if (TextUtils.isEmpty(str)) {
                str2 = "0";
            }
            this.f34483b.post(new i(this, Float.parseFloat(str2)));
        } catch (NumberFormatException e10) {
            e10.printStackTrace();
        }
    }

    @JavascriptInterface
    public void sendVideoId(String str) {
        this.f34483b.post(new a(this, str));
    }

    @JavascriptInterface
    public void sendVideoLoadedFraction(String str) {
        try {
            this.f34483b.post(new j(this, Float.parseFloat(str)));
        } catch (NumberFormatException e10) {
            e10.printStackTrace();
        }
    }

    @JavascriptInterface
    public void sendYouTubeIframeAPIReady() {
        this.f34482a.mo30484c();
    }
}
