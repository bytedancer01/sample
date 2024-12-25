package mg;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.amazonaws.services.p045s3.util.Mimetypes;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import mg.C6601d;
import p204lg.C5878e;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:mg/b.class
 */
/* renamed from: mg.b */
/* loaded from: combined.jar:classes2.jar:mg/b.class */
public class C6599b extends WebView implements InterfaceC6600c, C6601d.k {

    /* renamed from: b */
    public final Set<InterfaceC6604g> f34468b;

    /* renamed from: c */
    public final Handler f34469c;

    /* renamed from: d */
    public InterfaceC6603f f34470d;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:mg/b$a.class
     */
    /* renamed from: mg.b$a */
    /* loaded from: combined.jar:classes2.jar:mg/b$a.class */
    public class a implements Runnable {

        /* renamed from: b */
        public final String f34471b;

        /* renamed from: c */
        public final float f34472c;

        /* renamed from: d */
        public final C6599b f34473d;

        public a(C6599b c6599b, String str, float f10) {
            this.f34473d = c6599b;
            this.f34471b = str;
            this.f34472c = f10;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f34473d.loadUrl("javascript:loadVideo('" + this.f34471b + "', " + this.f34472c + ")");
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:mg/b$b.class
     */
    /* renamed from: mg.b$b */
    /* loaded from: combined.jar:classes2.jar:mg/b$b.class */
    public class b implements Runnable {

        /* renamed from: b */
        public final String f34474b;

        /* renamed from: c */
        public final float f34475c;

        /* renamed from: d */
        public final C6599b f34476d;

        public b(C6599b c6599b, String str, float f10) {
            this.f34476d = c6599b;
            this.f34474b = str;
            this.f34475c = f10;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f34476d.loadUrl("javascript:cueVideo('" + this.f34474b + "', " + this.f34475c + ")");
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:mg/b$c.class
     */
    /* renamed from: mg.b$c */
    /* loaded from: combined.jar:classes2.jar:mg/b$c.class */
    public class c implements Runnable {

        /* renamed from: b */
        public final C6599b f34477b;

        public c(C6599b c6599b) {
            this.f34477b = c6599b;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f34477b.loadUrl("javascript:playVideo()");
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:mg/b$d.class
     */
    /* renamed from: mg.b$d */
    /* loaded from: combined.jar:classes2.jar:mg/b$d.class */
    public class d implements Runnable {

        /* renamed from: b */
        public final C6599b f34478b;

        public d(C6599b c6599b) {
            this.f34478b = c6599b;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f34478b.loadUrl("javascript:pauseVideo()");
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:mg/b$e.class
     */
    /* renamed from: mg.b$e */
    /* loaded from: combined.jar:classes2.jar:mg/b$e.class */
    public class e implements Runnable {

        /* renamed from: b */
        public final float f34479b;

        /* renamed from: c */
        public final C6599b f34480c;

        public e(C6599b c6599b, float f10) {
            this.f34480c = c6599b;
            this.f34479b = f10;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f34480c.loadUrl("javascript:seekTo(" + this.f34479b + ")");
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:mg/b$f.class
     */
    /* renamed from: mg.b$f */
    /* loaded from: combined.jar:classes2.jar:mg/b$f.class */
    public class f extends WebChromeClient {

        /* renamed from: a */
        public final C6599b f34481a;

        public f(C6599b c6599b) {
            this.f34481a = c6599b;
        }

        @Override // android.webkit.WebChromeClient
        public Bitmap getDefaultVideoPoster() {
            Bitmap defaultVideoPoster = super.getDefaultVideoPoster();
            Bitmap bitmap = defaultVideoPoster;
            if (defaultVideoPoster == null) {
                bitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.RGB_565);
            }
            return bitmap;
        }
    }

    public C6599b(Context context) {
        this(context, null);
    }

    public C6599b(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C6599b(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f34469c = new Handler(Looper.getMainLooper());
        this.f34468b = new HashSet();
    }

    @Override // mg.InterfaceC6600c
    /* renamed from: a */
    public void mo30482a(String str, float f10) {
        this.f34469c.post(new b(this, str, f10));
    }

    @Override // mg.C6601d.k
    /* renamed from: b */
    public Collection<InterfaceC6604g> mo30483b() {
        return Collections.unmodifiableCollection(new HashSet(this.f34468b));
    }

    @Override // mg.C6601d.k
    /* renamed from: c */
    public void mo30484c() {
        this.f34470d.mo17043a(this);
    }

    @Override // mg.InterfaceC6600c
    /* renamed from: d */
    public boolean mo30485d(InterfaceC6604g interfaceC6604g) {
        if (interfaceC6604g != null) {
            return this.f34468b.add(interfaceC6604g);
        }
        Log.e("YouTubePlayer", "null YouTubePlayerListener not allowed.");
        return false;
    }

    @Override // android.webkit.WebView
    public void destroy() {
        this.f34468b.clear();
        this.f34469c.removeCallbacksAndMessages(null);
        super.destroy();
    }

    @Override // mg.InterfaceC6600c
    /* renamed from: e */
    public void mo30486e(String str, float f10) {
        this.f34469c.post(new a(this, str, f10));
    }

    @Override // mg.InterfaceC6600c
    /* renamed from: f */
    public void mo30487f(float f10) {
        this.f34469c.post(new e(this, f10));
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    /* renamed from: g */
    public final void m30488g() {
        WebSettings settings = getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setCacheMode(2);
        settings.setMediaPlaybackRequiresUserGesture(false);
        addJavascriptInterface(new C6601d(this), "YouTubePlayerBridge");
        loadDataWithBaseURL("https://www.youtube.com", m30490i(), Mimetypes.MIMETYPE_HTML, "utf-8", null);
        setWebChromeClient(new f(this));
    }

    /* renamed from: h */
    public void m30489h(InterfaceC6603f interfaceC6603f) {
        this.f34470d = interfaceC6603f;
        m30488g();
    }

    /* renamed from: i */
    public final String m30490i() {
        try {
            InputStream openRawResource = getResources().openRawResource(C5878e.f32957a);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(openRawResource, "utf-8"));
            StringBuilder sb2 = new StringBuilder();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    openRawResource.close();
                    return sb2.toString();
                }
                sb2.append(readLine);
                sb2.append("\n");
            }
        } catch (Exception e10) {
            throw new RuntimeException("Can't parse HTML file containing the player.");
        }
    }

    @Override // mg.InterfaceC6600c
    public void pause() {
        this.f34469c.post(new d(this));
    }

    @Override // mg.InterfaceC6600c
    public void play() {
        this.f34469c.post(new c(this));
    }
}
