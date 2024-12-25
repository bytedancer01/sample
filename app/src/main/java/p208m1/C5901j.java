package p208m1;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.IntentFilter;
import android.content.IntentSender;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.support.v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
import android.util.Log;
import android.view.Display;
import com.amazonaws.services.p045s3.model.InstructionFileId;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import lc.InterfaceFutureC5838a;
import org.apache.commons.net.bsd.RCommandClient;
import org.apache.commons.net.bsd.RLoginClient;
import org.apache.commons.net.ftp.FTPReply;
import p030c0.C0938e;
import p050d0.C4290b;
import p139i1.AbstractC5153g;
import p208m1.AbstractC5897f;
import p208m1.AbstractC5916y;
import p208m1.AbstractC5917z;
import p208m1.C5893b;
import p208m1.C5900i;
import p208m1.C5901j;
import p208m1.C5915x;
import p221n0.C6611c;
import p221n0.C6612d;
import p294r.C7928a;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:m1/j.class
 */
/* renamed from: m1.j */
/* loaded from: combined.jar:classes1.jar:m1/j.class */
public final class C5901j {

    /* renamed from: c */
    public static final boolean f33085c = Log.isLoggable("MediaRouter", 3);

    /* renamed from: d */
    public static d f33086d;

    /* renamed from: a */
    public final Context f33087a;

    /* renamed from: b */
    public final ArrayList<b> f33088b = new ArrayList<>();

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:m1/j$a.class
     */
    /* renamed from: m1.j$a */
    /* loaded from: combined.jar:classes1.jar:m1/j$a.class */
    public static abstract class a {
        /* renamed from: a */
        public void mo3231a(C5901j c5901j, g gVar) {
        }

        /* renamed from: b */
        public void mo3232b(C5901j c5901j, g gVar) {
        }

        /* renamed from: c */
        public void mo3233c(C5901j c5901j, g gVar) {
        }

        /* renamed from: d */
        public void mo3234d(C5901j c5901j, h hVar) {
        }

        /* renamed from: e */
        public void mo3235e(C5901j c5901j, h hVar) {
        }

        /* renamed from: f */
        public void m28890f(C5901j c5901j, h hVar) {
        }

        /* renamed from: g */
        public void mo3236g(C5901j c5901j, h hVar) {
        }

        @Deprecated
        /* renamed from: h */
        public void mo3250h(C5901j c5901j, h hVar) {
        }

        /* renamed from: i */
        public void mo28891i(C5901j c5901j, h hVar, int i10) {
            mo3250h(c5901j, hVar);
        }

        /* renamed from: j */
        public void m28892j(C5901j c5901j, h hVar, int i10, h hVar2) {
            mo28891i(c5901j, hVar, i10);
        }

        @Deprecated
        /* renamed from: k */
        public void mo3251k(C5901j c5901j, h hVar) {
        }

        /* renamed from: l */
        public void mo28893l(C5901j c5901j, h hVar, int i10) {
            mo3251k(c5901j, hVar);
        }

        /* renamed from: m */
        public void mo3329m(C5901j c5901j, h hVar) {
        }

        /* renamed from: n */
        public void mo3252n(C5901j c5901j, C5911t c5911t) {
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:m1/j$b.class
     */
    /* renamed from: m1.j$b */
    /* loaded from: combined.jar:classes1.jar:m1/j$b.class */
    public static final class b {

        /* renamed from: a */
        public final C5901j f33089a;

        /* renamed from: b */
        public final a f33090b;

        /* renamed from: c */
        public C5900i f33091c = C5900i.f33081c;

        /* renamed from: d */
        public int f33092d;

        /* renamed from: e */
        public long f33093e;

        public b(C5901j c5901j, a aVar) {
            this.f33089a = c5901j;
            this.f33090b = aVar;
        }

        /* renamed from: a */
        public boolean m28894a(h hVar, int i10, h hVar2, int i11) {
            if ((this.f33092d & 2) != 0 || hVar.m28977E(this.f33091c)) {
                return true;
            }
            if (C5901j.m28870r() && hVar.m29007w() && i10 == 262 && i11 == 3 && hVar2 != null) {
                return !hVar2.m29007w();
            }
            return false;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:m1/j$c.class
     */
    /* renamed from: m1.j$c */
    /* loaded from: combined.jar:classes1.jar:m1/j$c.class */
    public static abstract class c {
        /* renamed from: a */
        public void mo28895a(String str, Bundle bundle) {
        }

        /* renamed from: b */
        public void mo28896b(Bundle bundle) {
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:m1/j$d.class
     */
    /* renamed from: m1.j$d */
    /* loaded from: combined.jar:classes1.jar:m1/j$d.class */
    public static final class d implements AbstractC5917z.e, C5915x.c {

        /* renamed from: A */
        public int f33094A;

        /* renamed from: B */
        public e f33095B;

        /* renamed from: C */
        public f f33096C;

        /* renamed from: D */
        public e f33097D;

        /* renamed from: E */
        public MediaSessionCompat f33098E;

        /* renamed from: F */
        public MediaSessionCompat f33099F;

        /* renamed from: a */
        public final Context f33102a;

        /* renamed from: b */
        public boolean f33103b;

        /* renamed from: c */
        public AbstractC5917z f33104c;

        /* renamed from: d */
        public C5915x f33105d;

        /* renamed from: e */
        public boolean f33106e;

        /* renamed from: f */
        public C5893b f33107f;

        /* renamed from: o */
        public final boolean f33116o;

        /* renamed from: p */
        public C5905n f33117p;

        /* renamed from: q */
        public C5911t f33118q;

        /* renamed from: r */
        public h f33119r;

        /* renamed from: s */
        public h f33120s;

        /* renamed from: t */
        public h f33121t;

        /* renamed from: u */
        public AbstractC5897f.e f33122u;

        /* renamed from: v */
        public h f33123v;

        /* renamed from: w */
        public AbstractC5897f.e f33124w;

        /* renamed from: y */
        public C5896e f33126y;

        /* renamed from: z */
        public C5896e f33127z;

        /* renamed from: g */
        public final ArrayList<WeakReference<C5901j>> f33108g = new ArrayList<>();

        /* renamed from: h */
        public final ArrayList<h> f33109h = new ArrayList<>();

        /* renamed from: i */
        public final Map<C6612d<String, String>, String> f33110i = new HashMap();

        /* renamed from: j */
        public final ArrayList<g> f33111j = new ArrayList<>();

        /* renamed from: k */
        public final ArrayList<h> f33112k = new ArrayList<>();

        /* renamed from: l */
        public final AbstractC5916y.b f33113l = new AbstractC5916y.b();

        /* renamed from: m */
        public final g f33114m = new g(this);

        /* renamed from: n */
        public final HandlerC10317d f33115n = new HandlerC10317d(this);

        /* renamed from: x */
        public final Map<String, AbstractC5897f.e> f33125x = new HashMap();

        /* renamed from: G */
        public final MediaSessionCompat.OnActiveChangeListener f33100G = new a(this);

        /* renamed from: H */
        public AbstractC5897f.b.d f33101H = new c(this);

        /* JADX WARN: Classes with same name are omitted:
          classes1.jar:m1/j$d$a.class
         */
        /* renamed from: m1.j$d$a */
        /* loaded from: combined.jar:classes1.jar:m1/j$d$a.class */
        public class a implements MediaSessionCompat.OnActiveChangeListener {

            /* renamed from: a */
            public final d f33128a;

            public a(d dVar) {
                this.f33128a = dVar;
            }

            @Override // android.support.v4.media.session.MediaSessionCompat.OnActiveChangeListener
            public void onActiveChanged() {
                MediaSessionCompat mediaSessionCompat = this.f33128a.f33098E;
                if (mediaSessionCompat != null) {
                    if (mediaSessionCompat.isActive()) {
                        d dVar = this.f33128a;
                        dVar.m28925f(dVar.f33098E.getRemoteControlClient());
                    } else {
                        d dVar2 = this.f33128a;
                        dVar2.m28903G(dVar2.f33098E.getRemoteControlClient());
                    }
                }
            }
        }

        /* JADX WARN: Classes with same name are omitted:
          classes1.jar:m1/j$d$b.class
         */
        /* renamed from: m1.j$d$b */
        /* loaded from: combined.jar:classes1.jar:m1/j$d$b.class */
        public class b implements Runnable {

            /* renamed from: b */
            public final d f33129b;

            public b(d dVar) {
                this.f33129b = dVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f33129b.m28913Q();
            }
        }

        /* JADX WARN: Classes with same name are omitted:
          classes1.jar:m1/j$d$c.class
         */
        /* renamed from: m1.j$d$c */
        /* loaded from: combined.jar:classes1.jar:m1/j$d$c.class */
        public class c implements AbstractC5897f.b.d {

            /* renamed from: a */
            public final d f33130a;

            public c(d dVar) {
                this.f33130a = dVar;
            }

            @Override // p208m1.AbstractC5897f.b.d
            /* renamed from: a */
            public void mo28837a(AbstractC5897f.b bVar, C5895d c5895d, Collection<AbstractC5897f.b.c> collection) {
                d dVar = this.f33130a;
                if (bVar != dVar.f33124w || c5895d == null) {
                    if (bVar == dVar.f33122u) {
                        if (c5895d != null) {
                            dVar.m28918V(dVar.f33121t, c5895d);
                        }
                        this.f33130a.f33121t.m28984L(collection);
                        return;
                    }
                    return;
                }
                g m29001q = dVar.f33123v.m29001q();
                String m28773l = c5895d.m28773l();
                h hVar = new h(m29001q, m28773l, this.f33130a.m28926g(m29001q, m28773l));
                hVar.m28978F(c5895d);
                d dVar2 = this.f33130a;
                if (dVar2.f33121t == hVar) {
                    return;
                }
                dVar2.m28901E(dVar2, hVar, dVar2.f33124w, 3, dVar2.f33123v, collection);
                d dVar3 = this.f33130a;
                dVar3.f33123v = null;
                dVar3.f33124w = null;
            }
        }

        /* JADX WARN: Classes with same name are omitted:
          classes1.jar:m1/j$d$d.class
         */
        /* renamed from: m1.j$d$d, reason: collision with other inner class name */
        /* loaded from: combined.jar:classes1.jar:m1/j$d$d.class */
        public final class HandlerC10317d extends Handler {

            /* renamed from: a */
            public final ArrayList<b> f33131a = new ArrayList<>();

            /* renamed from: b */
            public final List<h> f33132b = new ArrayList();

            /* renamed from: c */
            public final d f33133c;

            public HandlerC10317d(d dVar) {
                this.f33133c = dVar;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* renamed from: a */
            public final void m28946a(b bVar, int i10, Object obj, int i11) {
                C5901j c5901j = bVar.f33089a;
                a aVar = bVar.f33090b;
                int i12 = 65280 & i10;
                if (i12 != 256) {
                    if (i12 != 512) {
                        if (i12 == 768 && i10 == 769) {
                            aVar.mo3252n(c5901j, (C5911t) obj);
                            return;
                        }
                        return;
                    }
                    g gVar = (g) obj;
                    switch (i10) {
                        case RLoginClient.DEFAULT_PORT /* 513 */:
                            aVar.mo3231a(c5901j, gVar);
                            break;
                        case RCommandClient.DEFAULT_PORT /* 514 */:
                            aVar.mo3233c(c5901j, gVar);
                            break;
                        case 515:
                            aVar.mo3232b(c5901j, gVar);
                            break;
                    }
                }
                h hVar = (i10 == 264 || i10 == 262) ? (h) ((C6612d) obj).f34522b : (h) obj;
                h hVar2 = (i10 == 264 || i10 == 262) ? (h) ((C6612d) obj).f34521a : null;
                if (hVar == null || !bVar.m28894a(hVar, i10, hVar2, i11)) {
                    return;
                }
                switch (i10) {
                    case FTPReply.PATHNAME_CREATED /* 257 */:
                        aVar.mo3234d(c5901j, hVar);
                        break;
                    case 258:
                        aVar.mo3236g(c5901j, hVar);
                        break;
                    case 259:
                        aVar.mo3235e(c5901j, hVar);
                        break;
                    case 260:
                        aVar.mo3329m(c5901j, hVar);
                        break;
                    case 261:
                        aVar.m28890f(c5901j, hVar);
                        break;
                    case 262:
                        aVar.m28892j(c5901j, hVar, i11, hVar);
                        break;
                    case 263:
                        aVar.mo28893l(c5901j, hVar, i11);
                        break;
                    case 264:
                        aVar.m28892j(c5901j, hVar, i11, hVar2);
                        break;
                }
            }

            /* renamed from: b */
            public void m28947b(int i10, Object obj) {
                obtainMessage(i10, obj).sendToTarget();
            }

            /* renamed from: c */
            public void m28948c(int i10, Object obj, int i11) {
                Message obtainMessage = obtainMessage(i10, obj);
                obtainMessage.arg1 = i11;
                obtainMessage.sendToTarget();
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* renamed from: d */
            public final void m28949d(int i10, Object obj) {
                if (i10 == 262) {
                    h hVar = (h) ((C6612d) obj).f34522b;
                    this.f33133c.f33104c.mo29151D(hVar);
                    if (this.f33133c.f33119r == null || !hVar.m29007w()) {
                        return;
                    }
                    Iterator<h> it = this.f33132b.iterator();
                    while (it.hasNext()) {
                        this.f33133c.f33104c.mo29150C(it.next());
                    }
                    this.f33132b.clear();
                }
                if (i10 == 264) {
                    h hVar2 = (h) ((C6612d) obj).f34522b;
                    this.f33132b.add(hVar2);
                    this.f33133c.f33104c.mo29148A(hVar2);
                    this.f33133c.f33104c.mo29151D(hVar2);
                    return;
                }
                switch (i10) {
                    case FTPReply.PATHNAME_CREATED /* 257 */:
                        this.f33133c.f33104c.mo29148A((h) obj);
                        break;
                    case 258:
                        this.f33133c.f33104c.mo29150C((h) obj);
                        break;
                    case 259:
                        this.f33133c.f33104c.mo29149B((h) obj);
                        break;
                }
            }

            @Override // android.os.Handler
            public void handleMessage(Message message) {
                int i10 = message.what;
                Object obj = message.obj;
                int i11 = message.arg1;
                if (i10 == 259 && this.f33133c.m28941v().m28995k().equals(((h) obj).m28995k())) {
                    this.f33133c.m28919W(true);
                }
                m28949d(i10, obj);
                try {
                    int size = this.f33133c.f33108g.size();
                    while (true) {
                        size--;
                        if (size < 0) {
                            break;
                        }
                        C5901j c5901j = this.f33133c.f33108g.get(size).get();
                        if (c5901j == null) {
                            this.f33133c.f33108g.remove(size);
                        } else {
                            this.f33131a.addAll(c5901j.f33088b);
                        }
                    }
                    int size2 = this.f33131a.size();
                    for (int i12 = 0; i12 < size2; i12++) {
                        m28946a(this.f33131a.get(i12), i10, obj, i11);
                    }
                } finally {
                    this.f33131a.clear();
                }
            }
        }

        /* JADX WARN: Classes with same name are omitted:
          classes1.jar:m1/j$d$e.class
         */
        /* renamed from: m1.j$d$e */
        /* loaded from: combined.jar:classes1.jar:m1/j$d$e.class */
        public final class e {

            /* renamed from: a */
            public final MediaSessionCompat f33134a;

            /* renamed from: b */
            public int f33135b;

            /* renamed from: c */
            public int f33136c;

            /* renamed from: d */
            public AbstractC5153g f33137d;

            /* renamed from: e */
            public final d f33138e;

            /* JADX WARN: Classes with same name are omitted:
              classes1.jar:m1/j$d$e$a.class
             */
            /* renamed from: m1.j$d$e$a */
            /* loaded from: combined.jar:classes1.jar:m1/j$d$e$a.class */
            public class a extends AbstractC5153g {

                /* renamed from: g */
                public final e f33139g;

                /* JADX WARN: Classes with same name are omitted:
                  classes1.jar:m1/j$d$e$a$a.class
                 */
                /* renamed from: m1.j$d$e$a$a, reason: collision with other inner class name */
                /* loaded from: combined.jar:classes1.jar:m1/j$d$e$a$a.class */
                public class RunnableC10318a implements Runnable {

                    /* renamed from: b */
                    public final int f33140b;

                    /* renamed from: c */
                    public final a f33141c;

                    public RunnableC10318a(a aVar, int i10) {
                        this.f33141c = aVar;
                        this.f33140b = i10;
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        h hVar = this.f33141c.f33139g.f33138e.f33121t;
                        if (hVar != null) {
                            hVar.m28979G(this.f33140b);
                        }
                    }
                }

                /* JADX WARN: Classes with same name are omitted:
                  classes1.jar:m1/j$d$e$a$b.class
                 */
                /* renamed from: m1.j$d$e$a$b */
                /* loaded from: combined.jar:classes1.jar:m1/j$d$e$a$b.class */
                public class b implements Runnable {

                    /* renamed from: b */
                    public final int f33142b;

                    /* renamed from: c */
                    public final a f33143c;

                    public b(a aVar, int i10) {
                        this.f33143c = aVar;
                        this.f33142b = i10;
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        h hVar = this.f33143c.f33139g.f33138e.f33121t;
                        if (hVar != null) {
                            hVar.m28980H(this.f33142b);
                        }
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(e eVar, int i10, int i11, int i12, String str) {
                    super(i10, i11, i12, str);
                    this.f33139g = eVar;
                }

                @Override // p139i1.AbstractC5153g
                /* renamed from: e */
                public void mo25786e(int i10) {
                    this.f33139g.f33138e.f33115n.post(new b(this, i10));
                }

                @Override // p139i1.AbstractC5153g
                /* renamed from: f */
                public void mo25787f(int i10) {
                    this.f33139g.f33138e.f33115n.post(new RunnableC10318a(this, i10));
                }
            }

            public e(d dVar, MediaSessionCompat mediaSessionCompat) {
                this.f33138e = dVar;
                this.f33134a = mediaSessionCompat;
            }

            /* renamed from: a */
            public void m28950a() {
                MediaSessionCompat mediaSessionCompat = this.f33134a;
                if (mediaSessionCompat != null) {
                    mediaSessionCompat.setPlaybackToLocal(this.f33138e.f33113l.f33268d);
                    this.f33137d = null;
                }
            }

            /* renamed from: b */
            public void m28951b(int i10, int i11, int i12, String str) {
                if (this.f33134a != null) {
                    AbstractC5153g abstractC5153g = this.f33137d;
                    if (abstractC5153g != null && i10 == this.f33135b && i11 == this.f33136c) {
                        abstractC5153g.m25789h(i12);
                        return;
                    }
                    a aVar = new a(this, i10, i11, i12, str);
                    this.f33137d = aVar;
                    this.f33134a.setPlaybackToRemote(aVar);
                }
            }

            /* renamed from: c */
            public MediaSessionCompat.Token m28952c() {
                MediaSessionCompat mediaSessionCompat = this.f33134a;
                if (mediaSessionCompat != null) {
                    return mediaSessionCompat.getSessionToken();
                }
                return null;
            }
        }

        /* JADX WARN: Classes with same name are omitted:
          classes1.jar:m1/j$d$f.class
         */
        /* renamed from: m1.j$d$f */
        /* loaded from: combined.jar:classes1.jar:m1/j$d$f.class */
        public final class f extends C5893b.a {

            /* renamed from: a */
            public final d f33144a;

            public f(d dVar) {
                this.f33144a = dVar;
            }

            @Override // p208m1.C5893b.a
            /* renamed from: a */
            public void mo28746a(AbstractC5897f.e eVar) {
                if (eVar == this.f33144a.f33122u) {
                    m28953d(2);
                } else if (C5901j.f33085c) {
                    Log.d("MediaRouter", "A RouteController unrelated to the selected route is released. controller=" + eVar);
                }
            }

            @Override // p208m1.C5893b.a
            /* renamed from: b */
            public void mo28747b(int i10) {
                m28953d(i10);
            }

            @Override // p208m1.C5893b.a
            /* renamed from: c */
            public void mo28748c(String str, int i10) {
                h hVar;
                Iterator<h> it = this.f33144a.m28940u().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        hVar = null;
                        break;
                    }
                    hVar = it.next();
                    if (hVar.m29002r() == this.f33144a.f33107f && TextUtils.equals(str, hVar.m28989e())) {
                        break;
                    }
                }
                if (hVar != null) {
                    this.f33144a.m28907K(hVar, i10);
                    return;
                }
                Log.w("MediaRouter", "onSelectRoute: The target RouteInfo is not found for descriptorId=" + str);
            }

            /* renamed from: d */
            public void m28953d(int i10) {
                h m28927h = this.f33144a.m28927h();
                if (this.f33144a.m28941v() != m28927h) {
                    this.f33144a.m28907K(m28927h, i10);
                }
            }
        }

        /* JADX WARN: Classes with same name are omitted:
          classes1.jar:m1/j$d$g.class
         */
        /* renamed from: m1.j$d$g */
        /* loaded from: combined.jar:classes1.jar:m1/j$d$g.class */
        public final class g extends AbstractC5897f.a {

            /* renamed from: a */
            public final d f33145a;

            public g(d dVar) {
                this.f33145a = dVar;
            }

            @Override // p208m1.AbstractC5897f.a
            /* renamed from: a */
            public void mo28821a(AbstractC5897f abstractC5897f, C5898g c5898g) {
                this.f33145a.m28917U(abstractC5897f, c5898g);
            }
        }

        /* JADX WARN: Classes with same name are omitted:
          classes1.jar:m1/j$d$h.class
         */
        /* renamed from: m1.j$d$h */
        /* loaded from: combined.jar:classes1.jar:m1/j$d$h.class */
        public final class h implements AbstractC5916y.c {

            /* renamed from: a */
            public final AbstractC5916y f33146a;

            /* renamed from: b */
            public boolean f33147b;

            /* renamed from: c */
            public final d f33148c;

            public h(d dVar, Object obj) {
                this.f33148c = dVar;
                AbstractC5916y m29143b = AbstractC5916y.m29143b(dVar.f33102a, obj);
                this.f33146a = m29143b;
                m29143b.m29146d(this);
                m28958e();
            }

            @Override // p208m1.AbstractC5916y.c
            /* renamed from: a */
            public void mo28954a(int i10) {
                h hVar;
                if (this.f33147b || (hVar = this.f33148c.f33121t) == null) {
                    return;
                }
                hVar.m28979G(i10);
            }

            @Override // p208m1.AbstractC5916y.c
            /* renamed from: b */
            public void mo28955b(int i10) {
                h hVar;
                if (this.f33147b || (hVar = this.f33148c.f33121t) == null) {
                    return;
                }
                hVar.m28980H(i10);
            }

            /* renamed from: c */
            public void m28956c() {
                this.f33147b = true;
                this.f33146a.m29146d(null);
            }

            /* renamed from: d */
            public Object m28957d() {
                return this.f33146a.m29144a();
            }

            /* renamed from: e */
            public void m28958e() {
                this.f33146a.mo29145c(this.f33148c.f33113l);
            }
        }

        public d(Context context) {
            this.f33102a = context;
            this.f33116o = C0938e.m5651a((ActivityManager) context.getSystemService("activity"));
        }

        /* renamed from: A */
        public final boolean m28897A(h hVar) {
            return hVar.m29002r() == this.f33104c && hVar.f33164b.equals("DEFAULT_ROUTE");
        }

        /* renamed from: B */
        public final boolean m28898B(h hVar) {
            return hVar.m29002r() == this.f33104c && hVar.m28982J("android.media.intent.category.LIVE_AUDIO") && !hVar.m28982J("android.media.intent.category.LIVE_VIDEO");
        }

        /* renamed from: C */
        public boolean m28899C() {
            C5911t c5911t = this.f33118q;
            if (c5911t == null) {
                return false;
            }
            return c5911t.m29076e();
        }

        /* renamed from: D */
        public void m28900D() {
            if (this.f33121t.m29009y()) {
                List<h> m28996l = this.f33121t.m28996l();
                HashSet hashSet = new HashSet();
                Iterator<h> it = m28996l.iterator();
                while (it.hasNext()) {
                    hashSet.add(it.next().f33165c);
                }
                Iterator<Map.Entry<String, AbstractC5897f.e>> it2 = this.f33125x.entrySet().iterator();
                while (it2.hasNext()) {
                    Map.Entry<String, AbstractC5897f.e> next = it2.next();
                    if (!hashSet.contains(next.getKey())) {
                        AbstractC5897f.e value = next.getValue();
                        value.mo28842h(0);
                        value.mo28751d();
                        it2.remove();
                    }
                }
                for (h hVar : m28996l) {
                    if (!this.f33125x.containsKey(hVar.f33165c)) {
                        AbstractC5897f.e mo28744t = hVar.m29002r().mo28744t(hVar.f33164b, this.f33121t.f33164b);
                        mo28744t.mo28840e();
                        this.f33125x.put(hVar.f33165c, mo28744t);
                    }
                }
            }
        }

        /* renamed from: E */
        public void m28901E(d dVar, h hVar, AbstractC5897f.e eVar, int i10, h hVar2, Collection<AbstractC5897f.b.c> collection) {
            e eVar2;
            f fVar = this.f33096C;
            if (fVar != null) {
                fVar.m28960a();
                this.f33096C = null;
            }
            f fVar2 = new f(dVar, hVar, eVar, i10, hVar2, collection);
            this.f33096C = fVar2;
            if (fVar2.f33150b != 3 || (eVar2 = this.f33095B) == null) {
                fVar2.m28961b();
                return;
            }
            InterfaceFutureC5838a<Void> mo28959a = eVar2.mo28959a(this.f33121t, fVar2.f33152d);
            if (mo28959a == null) {
                this.f33096C.m28961b();
            } else {
                this.f33096C.m28963d(mo28959a);
            }
        }

        /* renamed from: F */
        public void m28902F(h hVar) {
            if (!(this.f33122u instanceof AbstractC5897f.b)) {
                throw new IllegalStateException("There is no currently selected dynamic group route.");
            }
            h.a m28935p = m28935p(hVar);
            if (this.f33121t.m28996l().contains(hVar) && m28935p != null && m28935p.m29014d()) {
                if (this.f33121t.m28996l().size() <= 1) {
                    Log.w("MediaRouter", "Ignoring attempt to remove the last member route.");
                    return;
                } else {
                    ((AbstractC5897f.b) this.f33122u).mo28755n(hVar.m28989e());
                    return;
                }
            }
            Log.w("MediaRouter", "Ignoring attempt to remove a non-unselectable member route : " + hVar);
        }

        /* renamed from: G */
        public void m28903G(Object obj) {
            int m28930k = m28930k(obj);
            if (m28930k >= 0) {
                this.f33112k.remove(m28930k).m28956c();
            }
        }

        /* renamed from: H */
        public void m28904H(h hVar, int i10) {
            AbstractC5897f.e eVar;
            AbstractC5897f.e eVar2;
            if (hVar == this.f33121t && (eVar2 = this.f33122u) != null) {
                eVar2.mo28752f(i10);
            } else {
                if (this.f33125x.isEmpty() || (eVar = this.f33125x.get(hVar.f33165c)) == null) {
                    return;
                }
                eVar.mo28752f(i10);
            }
        }

        /* renamed from: I */
        public void m28905I(h hVar, int i10) {
            AbstractC5897f.e eVar;
            AbstractC5897f.e eVar2;
            if (hVar == this.f33121t && (eVar2 = this.f33122u) != null) {
                eVar2.mo28753i(i10);
            } else {
                if (this.f33125x.isEmpty() || (eVar = this.f33125x.get(hVar.f33165c)) == null) {
                    return;
                }
                eVar.mo28753i(i10);
            }
        }

        /* renamed from: J */
        public void m28906J(h hVar, int i10) {
            if (!this.f33109h.contains(hVar)) {
                Log.w("MediaRouter", "Ignoring attempt to select removed route: " + hVar);
                return;
            }
            if (!hVar.f33169g) {
                Log.w("MediaRouter", "Ignoring attempt to select disabled route: " + hVar);
                return;
            }
            if (Build.VERSION.SDK_INT >= 30) {
                AbstractC5897f m29002r = hVar.m29002r();
                C5893b c5893b = this.f33107f;
                if (m29002r == c5893b && this.f33121t != hVar) {
                    c5893b.m28740E(hVar.m28989e());
                    return;
                }
            }
            m28907K(hVar, i10);
        }

        /* renamed from: K */
        public void m28907K(h hVar, int i10) {
            StringBuilder sb2;
            String str;
            if (C5901j.f33086d == null || (this.f33120s != null && hVar.m29006v())) {
                StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
                StringBuilder sb3 = new StringBuilder();
                for (int i11 = 3; i11 < stackTrace.length; i11++) {
                    StackTraceElement stackTraceElement = stackTrace[i11];
                    sb3.append(stackTraceElement.getClassName());
                    sb3.append(InstructionFileId.DOT);
                    sb3.append(stackTraceElement.getMethodName());
                    sb3.append(":");
                    sb3.append(stackTraceElement.getLineNumber());
                    sb3.append("  ");
                }
                if (C5901j.f33086d == null) {
                    sb2 = new StringBuilder();
                    str = "setSelectedRouteInternal is called while sGlobal is null: pkgName=";
                } else {
                    sb2 = new StringBuilder();
                    str = "Default route is selected while a BT route is available: pkgName=";
                }
                sb2.append(str);
                sb2.append(this.f33102a.getPackageName());
                sb2.append(", callers=");
                sb2.append(sb3.toString());
                Log.w("MediaRouter", sb2.toString());
            }
            if (this.f33121t == hVar) {
                return;
            }
            if (this.f33123v != null) {
                this.f33123v = null;
                AbstractC5897f.e eVar = this.f33124w;
                if (eVar != null) {
                    eVar.mo28842h(3);
                    this.f33124w.mo28751d();
                    this.f33124w = null;
                }
            }
            if (m28944y() && hVar.m29001q().m28971g()) {
                AbstractC5897f.b mo28742r = hVar.m29002r().mo28742r(hVar.f33164b);
                if (mo28742r != null) {
                    mo28742r.m28825p(C4290b.m21729h(this.f33102a), this.f33101H);
                    this.f33123v = hVar;
                    this.f33124w = mo28742r;
                    mo28742r.mo28840e();
                    return;
                }
                Log.w("MediaRouter", "setSelectedRouteInternal: Failed to create dynamic group route controller. route=" + hVar);
            }
            AbstractC5897f.e mo28743s = hVar.m29002r().mo28743s(hVar.f33164b);
            if (mo28743s != null) {
                mo28743s.mo28840e();
            }
            if (C5901j.f33085c) {
                Log.d("MediaRouter", "Route selected: " + hVar);
            }
            if (this.f33121t != null) {
                m28901E(this, hVar, mo28743s, i10, null, null);
                return;
            }
            this.f33121t = hVar;
            this.f33122u = mo28743s;
            this.f33115n.m28948c(262, new C6612d(null, hVar), i10);
        }

        /* renamed from: L */
        public void m28908L(MediaSessionCompat mediaSessionCompat) {
            this.f33099F = mediaSessionCompat;
            m28909M(mediaSessionCompat != null ? new e(this, mediaSessionCompat) : null);
        }

        /* renamed from: M */
        public final void m28909M(e eVar) {
            e eVar2 = this.f33097D;
            if (eVar2 != null) {
                eVar2.m28950a();
            }
            this.f33097D = eVar;
            if (eVar != null) {
                m28915S();
            }
        }

        @SuppressLint({"NewApi"})
        /* renamed from: N */
        public void m28910N(C5911t c5911t) {
            C5911t c5911t2 = this.f33118q;
            this.f33118q = c5911t;
            if (m28944y()) {
                if (this.f33107f == null) {
                    C5893b c5893b = new C5893b(this.f33102a, new f(this));
                    this.f33107f = c5893b;
                    mo28923d(c5893b);
                    m28913Q();
                    this.f33105d.m29140f();
                }
                boolean z10 = false;
                boolean m29076e = c5911t2 == null ? false : c5911t2.m29076e();
                if (c5911t != null) {
                    z10 = c5911t.m29076e();
                }
                if (m29076e != z10) {
                    this.f33107f.m28820y(this.f33127z);
                }
            } else {
                AbstractC5897f abstractC5897f = this.f33107f;
                if (abstractC5897f != null) {
                    mo28922c(abstractC5897f);
                    this.f33107f = null;
                    this.f33105d.m29140f();
                }
            }
            this.f33115n.m28947b(769, c5911t);
        }

        /* renamed from: O */
        public final void m28911O() {
            this.f33117p = new C5905n(new b(this));
            mo28923d(this.f33104c);
            C5893b c5893b = this.f33107f;
            if (c5893b != null) {
                mo28923d(c5893b);
            }
            C5915x c5915x = new C5915x(this.f33102a, this);
            this.f33105d = c5915x;
            c5915x.m29142h();
        }

        /* renamed from: P */
        public void m28912P(h hVar) {
            if (!(this.f33122u instanceof AbstractC5897f.b)) {
                throw new IllegalStateException("There is no currently selected dynamic group route.");
            }
            h.a m28935p = m28935p(hVar);
            if (m28935p == null || !m28935p.m29013c()) {
                Log.w("MediaRouter", "Ignoring attempt to transfer to a non-transferable route.");
            } else {
                ((AbstractC5897f.b) this.f33122u).mo28756o(Collections.singletonList(hVar.m28989e()));
            }
        }

        /* renamed from: Q */
        public void m28913Q() {
            C5896e c5896e;
            C5900i.a aVar = new C5900i.a();
            this.f33117p.m29021c();
            int size = this.f33108g.size();
            int i10 = 0;
            boolean z10 = false;
            while (true) {
                int i11 = size - 1;
                if (i11 < 0) {
                    break;
                }
                C5901j c5901j = this.f33108g.get(i11).get();
                if (c5901j == null) {
                    this.f33108g.remove(i11);
                    size = i11;
                } else {
                    int size2 = c5901j.f33088b.size();
                    int i12 = i10 + size2;
                    int i13 = 0;
                    boolean z11 = z10;
                    while (true) {
                        size = i11;
                        i10 = i12;
                        z10 = z11;
                        if (i13 < size2) {
                            b bVar = c5901j.f33088b.get(i13);
                            aVar.m28862c(bVar.f33091c);
                            boolean z12 = (bVar.f33092d & 1) != 0;
                            this.f33117p.m29020b(z12, bVar.f33093e);
                            if (z12) {
                                z11 = true;
                            }
                            int i14 = bVar.f33092d;
                            boolean z13 = z11;
                            if ((i14 & 4) != 0) {
                                z13 = z11;
                                if (!this.f33116o) {
                                    z13 = true;
                                }
                            }
                            z11 = z13;
                            if ((i14 & 8) != 0) {
                                z11 = true;
                            }
                            i13++;
                        }
                    }
                }
            }
            boolean m29019a = this.f33117p.m29019a();
            this.f33094A = i10;
            C5900i m28863d = z10 ? aVar.m28863d() : C5900i.f33081c;
            m28914R(aVar.m28863d(), m29019a);
            C5896e c5896e2 = this.f33126y;
            if (c5896e2 != null && c5896e2.m28808c().equals(m28863d) && this.f33126y.m28809d() == m29019a) {
                return;
            }
            if (!m28863d.m28857f() || m29019a) {
                c5896e = new C5896e(m28863d, m29019a);
            } else if (this.f33126y == null) {
                return;
            } else {
                c5896e = null;
            }
            this.f33126y = c5896e;
            if (C5901j.f33085c) {
                Log.d("MediaRouter", "Updated discovery request: " + this.f33126y);
            }
            if (z10 && !m29019a && this.f33116o) {
                Log.i("MediaRouter", "Forcing passive route discovery on a low-RAM device, system performance may be affected.  Please consider using CALLBACK_FLAG_REQUEST_DISCOVERY instead of CALLBACK_FLAG_FORCE_DISCOVERY.");
            }
            int size3 = this.f33111j.size();
            for (int i15 = 0; i15 < size3; i15++) {
                AbstractC5897f abstractC5897f = this.f33111j.get(i15).f33159a;
                if (abstractC5897f != this.f33107f) {
                    abstractC5897f.m28819x(this.f33126y);
                }
            }
        }

        /* renamed from: R */
        public final void m28914R(C5900i c5900i, boolean z10) {
            if (m28944y()) {
                C5896e c5896e = this.f33127z;
                if (c5896e != null && c5896e.m28808c().equals(c5900i) && this.f33127z.m28809d() == z10) {
                    return;
                }
                if (!c5900i.m28857f() || z10) {
                    this.f33127z = new C5896e(c5900i, z10);
                } else if (this.f33127z == null) {
                    return;
                } else {
                    this.f33127z = null;
                }
                if (C5901j.f33085c) {
                    Log.d("MediaRouter", "Updated MediaRoute2Provider's discovery request: " + this.f33127z);
                }
                this.f33107f.m28819x(this.f33127z);
            }
        }

        @SuppressLint({"NewApi"})
        /* renamed from: S */
        public void m28915S() {
            e eVar;
            AbstractC5916y.b bVar;
            String str;
            h hVar = this.f33121t;
            if (hVar != null) {
                this.f33113l.f33265a = hVar.m29003s();
                this.f33113l.f33266b = this.f33121t.m29005u();
                this.f33113l.f33267c = this.f33121t.m29004t();
                this.f33113l.f33268d = this.f33121t.m28998n();
                this.f33113l.f33269e = this.f33121t.m28999o();
                if (m28944y() && this.f33121t.m29002r() == this.f33107f) {
                    bVar = this.f33113l;
                    str = C5893b.m28735B(this.f33122u);
                } else {
                    bVar = this.f33113l;
                    str = null;
                }
                bVar.f33270f = str;
                int size = this.f33112k.size();
                for (int i10 = 0; i10 < size; i10++) {
                    this.f33112k.get(i10).m28958e();
                }
                if (this.f33097D == null) {
                    return;
                }
                if (this.f33121t != m28934o() && this.f33121t != m28932m()) {
                    AbstractC5916y.b bVar2 = this.f33113l;
                    this.f33097D.m28951b(bVar2.f33267c == 1 ? 2 : 0, bVar2.f33266b, bVar2.f33265a, bVar2.f33270f);
                    return;
                }
                eVar = this.f33097D;
            } else {
                eVar = this.f33097D;
                if (eVar == null) {
                    return;
                }
            }
            eVar.m28950a();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: T */
        public final void m28916T(g gVar, C5898g c5898g) {
            boolean z10;
            StringBuilder sb2;
            String str;
            if (gVar.m28972h(c5898g)) {
                int i10 = 0;
                int i11 = 0;
                if (c5898g != null && (c5898g.m28845c() || c5898g == this.f33104c.m28814o())) {
                    List<C5895d> m28844b = c5898g.m28844b();
                    ArrayList<C6612d> arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    boolean z11 = false;
                    for (C5895d c5895d : m28844b) {
                        if (c5895d == null || !c5895d.m28785x()) {
                            sb2 = new StringBuilder();
                            str = "Ignoring invalid system route descriptor: ";
                        } else {
                            String m28773l = c5895d.m28773l();
                            int m28966b = gVar.m28966b(m28773l);
                            if (m28966b < 0) {
                                h hVar = new h(gVar, m28773l, m28926g(gVar, m28773l));
                                gVar.f33160b.add(i11, hVar);
                                this.f33109h.add(hVar);
                                if (c5895d.m28771j().size() > 0) {
                                    arrayList.add(new C6612d(hVar, c5895d));
                                } else {
                                    hVar.m28978F(c5895d);
                                    if (C5901j.f33085c) {
                                        Log.d("MediaRouter", "Route added: " + hVar);
                                    }
                                    this.f33115n.m28947b(FTPReply.PATHNAME_CREATED, hVar);
                                }
                                i11++;
                            } else if (m28966b < i11) {
                                sb2 = new StringBuilder();
                                str = "Ignoring route descriptor with duplicate id: ";
                            } else {
                                h hVar2 = gVar.f33160b.get(m28966b);
                                int i12 = i11 + 1;
                                Collections.swap(gVar.f33160b, m28966b, i11);
                                if (c5895d.m28771j().size() > 0) {
                                    arrayList2.add(new C6612d(hVar2, c5895d));
                                } else if (m28918V(hVar2, c5895d) != 0 && hVar2 == this.f33121t) {
                                    i11 = i12;
                                    z11 = true;
                                }
                                i11 = i12;
                            }
                        }
                        sb2.append(str);
                        sb2.append(c5895d);
                        Log.w("MediaRouter", sb2.toString());
                    }
                    for (C6612d c6612d : arrayList) {
                        h hVar3 = (h) c6612d.f34521a;
                        hVar3.m28978F((C5895d) c6612d.f34522b);
                        if (C5901j.f33085c) {
                            Log.d("MediaRouter", "Route added: " + hVar3);
                        }
                        this.f33115n.m28947b(FTPReply.PATHNAME_CREATED, hVar3);
                    }
                    Iterator it = arrayList2.iterator();
                    while (true) {
                        i10 = i11;
                        z10 = z11;
                        if (!it.hasNext()) {
                            break;
                        }
                        C6612d c6612d2 = (C6612d) it.next();
                        h hVar4 = (h) c6612d2.f34521a;
                        if (m28918V(hVar4, (C5895d) c6612d2.f34522b) != 0 && hVar4 == this.f33121t) {
                            z11 = true;
                        }
                    }
                } else {
                    Log.w("MediaRouter", "Ignoring invalid provider descriptor: " + c5898g);
                    z10 = false;
                }
                for (int size = gVar.f33160b.size() - 1; size >= i10; size--) {
                    h hVar5 = gVar.f33160b.get(size);
                    hVar5.m28978F(null);
                    this.f33109h.remove(hVar5);
                }
                m28919W(z10);
                for (int size2 = gVar.f33160b.size() - 1; size2 >= i10; size2--) {
                    h remove = gVar.f33160b.remove(size2);
                    if (C5901j.f33085c) {
                        Log.d("MediaRouter", "Route removed: " + remove);
                    }
                    this.f33115n.m28947b(258, remove);
                }
                if (C5901j.f33085c) {
                    Log.d("MediaRouter", "Provider changed: " + gVar);
                }
                this.f33115n.m28947b(515, gVar);
            }
        }

        /* renamed from: U */
        public void m28917U(AbstractC5897f abstractC5897f, C5898g c5898g) {
            g m28929j = m28929j(abstractC5897f);
            if (m28929j != null) {
                m28916T(m28929j, c5898g);
            }
        }

        /* renamed from: V */
        public int m28918V(h hVar, C5895d c5895d) {
            int m28978F = hVar.m28978F(c5895d);
            if (m28978F != 0) {
                if ((m28978F & 1) != 0) {
                    if (C5901j.f33085c) {
                        Log.d("MediaRouter", "Route changed: " + hVar);
                    }
                    this.f33115n.m28947b(259, hVar);
                }
                if ((m28978F & 2) != 0) {
                    if (C5901j.f33085c) {
                        Log.d("MediaRouter", "Route volume changed: " + hVar);
                    }
                    this.f33115n.m28947b(260, hVar);
                }
                if ((m28978F & 4) != 0) {
                    if (C5901j.f33085c) {
                        Log.d("MediaRouter", "Route presentation display changed: " + hVar);
                    }
                    this.f33115n.m28947b(261, hVar);
                }
            }
            return m28978F;
        }

        /* renamed from: W */
        public void m28919W(boolean z10) {
            h hVar = this.f33119r;
            if (hVar != null && !hVar.m28975B()) {
                Log.i("MediaRouter", "Clearing the default route because it is no longer selectable: " + this.f33119r);
                this.f33119r = null;
            }
            if (this.f33119r == null && !this.f33109h.isEmpty()) {
                Iterator<h> it = this.f33109h.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    h next = it.next();
                    if (m28897A(next) && next.m28975B()) {
                        this.f33119r = next;
                        Log.i("MediaRouter", "Found default route: " + this.f33119r);
                        break;
                    }
                }
            }
            h hVar2 = this.f33120s;
            if (hVar2 != null && !hVar2.m28975B()) {
                Log.i("MediaRouter", "Clearing the bluetooth route because it is no longer selectable: " + this.f33120s);
                this.f33120s = null;
            }
            if (this.f33120s == null && !this.f33109h.isEmpty()) {
                Iterator<h> it2 = this.f33109h.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    h next2 = it2.next();
                    if (m28898B(next2) && next2.m28975B()) {
                        this.f33120s = next2;
                        Log.i("MediaRouter", "Found bluetooth route: " + this.f33120s);
                        break;
                    }
                }
            }
            h hVar3 = this.f33121t;
            if (hVar3 != null && hVar3.m29008x()) {
                if (z10) {
                    m28900D();
                    m28915S();
                    return;
                }
                return;
            }
            Log.i("MediaRouter", "Unselecting the current route because it is no longer selectable: " + this.f33121t);
            m28907K(m28927h(), 0);
        }

        @Override // p208m1.AbstractC5917z.e
        /* renamed from: a */
        public void mo28920a(String str) {
            h m28965a;
            this.f33115n.removeMessages(262);
            g m28929j = m28929j(this.f33104c);
            if (m28929j == null || (m28965a = m28929j.m28965a(str)) == null) {
                return;
            }
            m28965a.m28981I();
        }

        @Override // p208m1.C5915x.c
        /* renamed from: b */
        public void mo28921b(ServiceConnectionC5913v serviceConnectionC5913v, AbstractC5897f.e eVar) {
            if (this.f33122u == eVar) {
                m28906J(m28927h(), 2);
            }
        }

        @Override // p208m1.C5915x.c
        /* renamed from: c */
        public void mo28922c(AbstractC5897f abstractC5897f) {
            g m28929j = m28929j(abstractC5897f);
            if (m28929j != null) {
                abstractC5897f.m28817v(null);
                abstractC5897f.m28819x(null);
                m28916T(m28929j, null);
                if (C5901j.f33085c) {
                    Log.d("MediaRouter", "Provider removed: " + m28929j);
                }
                this.f33115n.m28947b(RCommandClient.DEFAULT_PORT, m28929j);
                this.f33111j.remove(m28929j);
            }
        }

        @Override // p208m1.C5915x.c
        /* renamed from: d */
        public void mo28923d(AbstractC5897f abstractC5897f) {
            if (m28929j(abstractC5897f) == null) {
                g gVar = new g(abstractC5897f);
                this.f33111j.add(gVar);
                if (C5901j.f33085c) {
                    Log.d("MediaRouter", "Provider added: " + gVar);
                }
                this.f33115n.m28947b(RLoginClient.DEFAULT_PORT, gVar);
                m28916T(gVar, abstractC5897f.m28814o());
                abstractC5897f.m28817v(this.f33114m);
                abstractC5897f.m28819x(this.f33126y);
            }
        }

        /* renamed from: e */
        public void m28924e(h hVar) {
            if (!(this.f33122u instanceof AbstractC5897f.b)) {
                throw new IllegalStateException("There is no currently selected dynamic group route.");
            }
            h.a m28935p = m28935p(hVar);
            if (!this.f33121t.m28996l().contains(hVar) && m28935p != null && m28935p.m29012b()) {
                ((AbstractC5897f.b) this.f33122u).mo28754m(hVar.m28989e());
                return;
            }
            Log.w("MediaRouter", "Ignoring attempt to add a non-groupable route to dynamic group : " + hVar);
        }

        /* renamed from: f */
        public void m28925f(Object obj) {
            if (m28930k(obj) < 0) {
                this.f33112k.add(new h(this, obj));
            }
        }

        /* renamed from: g */
        public String m28926g(g gVar, String str) {
            String flattenToShortString = gVar.m28967c().flattenToShortString();
            String str2 = flattenToShortString + ":" + str;
            if (m28931l(str2) < 0) {
                this.f33110i.put(new C6612d<>(flattenToShortString, str), str2);
                return str2;
            }
            Log.w("MediaRouter", "Either " + str + " isn't unique in " + flattenToShortString + " or we're trying to assign a unique ID for an already added route");
            int i10 = 2;
            while (true) {
                String format = String.format(Locale.US, "%s_%d", str2, Integer.valueOf(i10));
                if (m28931l(format) < 0) {
                    this.f33110i.put(new C6612d<>(flattenToShortString, str), format);
                    return format;
                }
                i10++;
            }
        }

        /* renamed from: h */
        public h m28927h() {
            Iterator<h> it = this.f33109h.iterator();
            while (it.hasNext()) {
                h next = it.next();
                if (next != this.f33119r && m28898B(next) && next.m28975B()) {
                    return next;
                }
            }
            return this.f33119r;
        }

        @SuppressLint({"NewApi", "SyntheticAccessor"})
        /* renamed from: i */
        public void m28928i() {
            if (this.f33103b) {
                return;
            }
            this.f33103b = true;
            this.f33106e = Build.VERSION.SDK_INT >= 30 ? C5912u.m29081a(this.f33102a) : false;
            this.f33107f = this.f33106e ? new C5893b(this.f33102a, new f(this)) : null;
            this.f33104c = AbstractC5917z.m29147z(this.f33102a, this);
            m28911O();
        }

        /* renamed from: j */
        public final g m28929j(AbstractC5897f abstractC5897f) {
            int size = this.f33111j.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (this.f33111j.get(i10).f33159a == abstractC5897f) {
                    return this.f33111j.get(i10);
                }
            }
            return null;
        }

        /* renamed from: k */
        public final int m28930k(Object obj) {
            int size = this.f33112k.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (this.f33112k.get(i10).m28957d() == obj) {
                    return i10;
                }
            }
            return -1;
        }

        /* renamed from: l */
        public final int m28931l(String str) {
            int size = this.f33109h.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (this.f33109h.get(i10).f33165c.equals(str)) {
                    return i10;
                }
            }
            return -1;
        }

        /* renamed from: m */
        public h m28932m() {
            return this.f33120s;
        }

        /* renamed from: n */
        public int m28933n() {
            return this.f33094A;
        }

        /* renamed from: o */
        public h m28934o() {
            h hVar = this.f33119r;
            if (hVar != null) {
                return hVar;
            }
            throw new IllegalStateException("There is no default route.  The media router has not yet been fully initialized.");
        }

        /* renamed from: p */
        public h.a m28935p(h hVar) {
            return this.f33121t.m28992h(hVar);
        }

        /* renamed from: q */
        public MediaSessionCompat.Token m28936q() {
            e eVar = this.f33097D;
            if (eVar != null) {
                return eVar.m28952c();
            }
            MediaSessionCompat mediaSessionCompat = this.f33099F;
            if (mediaSessionCompat != null) {
                return mediaSessionCompat.getSessionToken();
            }
            return null;
        }

        /* renamed from: r */
        public h m28937r(String str) {
            Iterator<h> it = this.f33109h.iterator();
            while (it.hasNext()) {
                h next = it.next();
                if (next.f33165c.equals(str)) {
                    return next;
                }
            }
            return null;
        }

        /* renamed from: s */
        public C5901j m28938s(Context context) {
            int size = this.f33108g.size();
            while (true) {
                size--;
                if (size < 0) {
                    C5901j c5901j = new C5901j(context);
                    this.f33108g.add(new WeakReference<>(c5901j));
                    return c5901j;
                }
                C5901j c5901j2 = this.f33108g.get(size).get();
                if (c5901j2 == null) {
                    this.f33108g.remove(size);
                } else if (c5901j2.f33087a == context) {
                    return c5901j2;
                }
            }
        }

        /* renamed from: t */
        public C5911t m28939t() {
            return this.f33118q;
        }

        /* renamed from: u */
        public List<h> m28940u() {
            return this.f33109h;
        }

        /* renamed from: v */
        public h m28941v() {
            h hVar = this.f33121t;
            if (hVar != null) {
                return hVar;
            }
            throw new IllegalStateException("There is no currently selected route.  The media router has not yet been fully initialized.");
        }

        /* renamed from: w */
        public String m28942w(g gVar, String str) {
            return this.f33110i.get(new C6612d(gVar.m28967c().flattenToShortString(), str));
        }

        /* renamed from: x */
        public boolean m28943x() {
            C5911t c5911t = this.f33118q;
            boolean z10 = true;
            if (c5911t != null) {
                Bundle bundle = c5911t.f33200e;
                z10 = true;
                if (bundle != null) {
                    z10 = bundle.getBoolean("androidx.mediarouter.media.MediaRouterParams.ENABLE_GROUP_VOLUME_UX", true);
                }
            }
            return z10;
        }

        /* renamed from: y */
        public boolean m28944y() {
            C5911t c5911t;
            return this.f33106e && ((c5911t = this.f33118q) == null || c5911t.m29074c());
        }

        /* renamed from: z */
        public boolean m28945z(C5900i c5900i, int i10) {
            if (c5900i.m28857f()) {
                return false;
            }
            if ((i10 & 2) == 0 && this.f33116o) {
                return true;
            }
            C5911t c5911t = this.f33118q;
            boolean z10 = c5911t != null && c5911t.m29075d() && m28944y();
            int size = this.f33109h.size();
            for (int i11 = 0; i11 < size; i11++) {
                h hVar = this.f33109h.get(i11);
                if (((i10 & 1) == 0 || !hVar.m29007w()) && ((!z10 || hVar.m29007w() || hVar.m29002r() == this.f33107f) && hVar.m28977E(c5900i))) {
                    return true;
                }
            }
            return false;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:m1/j$e.class
     */
    /* renamed from: m1.j$e */
    /* loaded from: combined.jar:classes1.jar:m1/j$e.class */
    public interface e {
        /* renamed from: a */
        InterfaceFutureC5838a<Void> mo28959a(h hVar, h hVar2);
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:m1/j$f.class
     */
    /* renamed from: m1.j$f */
    /* loaded from: combined.jar:classes1.jar:m1/j$f.class */
    public static final class f {

        /* renamed from: a */
        public final AbstractC5897f.e f33149a;

        /* renamed from: b */
        public final int f33150b;

        /* renamed from: c */
        public final h f33151c;

        /* renamed from: d */
        public final h f33152d;

        /* renamed from: e */
        public final h f33153e;

        /* renamed from: f */
        public final List<AbstractC5897f.b.c> f33154f;

        /* renamed from: g */
        public final WeakReference<d> f33155g;

        /* renamed from: h */
        public InterfaceFutureC5838a<Void> f33156h = null;

        /* renamed from: i */
        public boolean f33157i = false;

        /* renamed from: j */
        public boolean f33158j = false;

        public f(d dVar, h hVar, AbstractC5897f.e eVar, int i10, h hVar2, Collection<AbstractC5897f.b.c> collection) {
            this.f33155g = new WeakReference<>(dVar);
            this.f33152d = hVar;
            this.f33149a = eVar;
            this.f33150b = i10;
            this.f33151c = dVar.f33121t;
            this.f33153e = hVar2;
            this.f33154f = collection == null ? null : new ArrayList(collection);
            dVar.f33115n.postDelayed(new RunnableC5902k(this), 15000L);
        }

        /* renamed from: a */
        public void m28960a() {
            if (this.f33157i || this.f33158j) {
                return;
            }
            this.f33158j = true;
            AbstractC5897f.e eVar = this.f33149a;
            if (eVar != null) {
                eVar.mo28842h(0);
                this.f33149a.mo28751d();
            }
        }

        /* renamed from: b */
        public void m28961b() {
            InterfaceFutureC5838a<Void> interfaceFutureC5838a;
            C5901j.m28864d();
            if (this.f33157i || this.f33158j) {
                return;
            }
            d dVar = this.f33155g.get();
            if (dVar == null || dVar.f33096C != this || ((interfaceFutureC5838a = this.f33156h) != null && interfaceFutureC5838a.isCancelled())) {
                m28960a();
                return;
            }
            this.f33157i = true;
            dVar.f33096C = null;
            m28964e();
            m28962c();
        }

        /* renamed from: c */
        public final void m28962c() {
            d dVar = this.f33155g.get();
            if (dVar == null) {
                return;
            }
            h hVar = this.f33152d;
            dVar.f33121t = hVar;
            dVar.f33122u = this.f33149a;
            h hVar2 = this.f33153e;
            if (hVar2 == null) {
                dVar.f33115n.m28948c(262, new C6612d(this.f33151c, hVar), this.f33150b);
            } else {
                dVar.f33115n.m28948c(264, new C6612d(hVar2, hVar), this.f33150b);
            }
            dVar.f33125x.clear();
            dVar.m28900D();
            dVar.m28915S();
            List<AbstractC5897f.b.c> list = this.f33154f;
            if (list != null) {
                dVar.f33121t.m28984L(list);
            }
        }

        /* renamed from: d */
        public void m28963d(InterfaceFutureC5838a<Void> interfaceFutureC5838a) {
            d dVar = this.f33155g.get();
            if (dVar == null || dVar.f33096C != this) {
                Log.w("MediaRouter", "Router is released. Cancel transfer");
                m28960a();
            } else {
                if (this.f33156h != null) {
                    throw new IllegalStateException("future is already set");
                }
                this.f33156h = interfaceFutureC5838a;
                RunnableC5902k runnableC5902k = new RunnableC5902k(this);
                final d.HandlerC10317d handlerC10317d = dVar.f33115n;
                Objects.requireNonNull(handlerC10317d);
                interfaceFutureC5838a.mo23123a(runnableC5902k, new Executor(handlerC10317d) { // from class: m1.l

                    /* renamed from: b */
                    public final C5901j.d.HandlerC10317d f33188b;

                    {
                        this.f33188b = handlerC10317d;
                    }

                    @Override // java.util.concurrent.Executor
                    public final void execute(Runnable runnable) {
                        this.f33188b.post(runnable);
                    }
                });
            }
        }

        /* renamed from: e */
        public final void m28964e() {
            d dVar = this.f33155g.get();
            if (dVar != null) {
                h hVar = dVar.f33121t;
                h hVar2 = this.f33151c;
                if (hVar != hVar2) {
                    return;
                }
                dVar.f33115n.m28948c(263, hVar2, this.f33150b);
                AbstractC5897f.e eVar = dVar.f33122u;
                if (eVar != null) {
                    eVar.mo28842h(this.f33150b);
                    dVar.f33122u.mo28751d();
                }
                if (!dVar.f33125x.isEmpty()) {
                    for (AbstractC5897f.e eVar2 : dVar.f33125x.values()) {
                        eVar2.mo28842h(this.f33150b);
                        eVar2.mo28751d();
                    }
                    dVar.f33125x.clear();
                }
                dVar.f33122u = null;
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:m1/j$g.class
     */
    /* renamed from: m1.j$g */
    /* loaded from: combined.jar:classes1.jar:m1/j$g.class */
    public static final class g {

        /* renamed from: a */
        public final AbstractC5897f f33159a;

        /* renamed from: b */
        public final List<h> f33160b = new ArrayList();

        /* renamed from: c */
        public final AbstractC5897f.d f33161c;

        /* renamed from: d */
        public C5898g f33162d;

        public g(AbstractC5897f abstractC5897f) {
            this.f33159a = abstractC5897f;
            this.f33161c = abstractC5897f.m28816q();
        }

        /* renamed from: a */
        public h m28965a(String str) {
            int size = this.f33160b.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (this.f33160b.get(i10).f33164b.equals(str)) {
                    return this.f33160b.get(i10);
                }
            }
            return null;
        }

        /* renamed from: b */
        public int m28966b(String str) {
            int size = this.f33160b.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (this.f33160b.get(i10).f33164b.equals(str)) {
                    return i10;
                }
            }
            return -1;
        }

        /* renamed from: c */
        public ComponentName m28967c() {
            return this.f33161c.m28838a();
        }

        /* renamed from: d */
        public String m28968d() {
            return this.f33161c.m28839b();
        }

        /* renamed from: e */
        public AbstractC5897f m28969e() {
            C5901j.m28864d();
            return this.f33159a;
        }

        /* renamed from: f */
        public List<h> m28970f() {
            C5901j.m28864d();
            return Collections.unmodifiableList(this.f33160b);
        }

        /* renamed from: g */
        public boolean m28971g() {
            C5898g c5898g = this.f33162d;
            return c5898g != null && c5898g.m28846d();
        }

        /* renamed from: h */
        public boolean m28972h(C5898g c5898g) {
            if (this.f33162d == c5898g) {
                return false;
            }
            this.f33162d = c5898g;
            return true;
        }

        public String toString() {
            return "MediaRouter.RouteProviderInfo{ packageName=" + m28968d() + " }";
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:m1/j$h.class
     */
    /* renamed from: m1.j$h */
    /* loaded from: combined.jar:classes1.jar:m1/j$h.class */
    public static class h {

        /* renamed from: a */
        public final g f33163a;

        /* renamed from: b */
        public final String f33164b;

        /* renamed from: c */
        public final String f33165c;

        /* renamed from: d */
        public String f33166d;

        /* renamed from: e */
        public String f33167e;

        /* renamed from: f */
        public Uri f33168f;

        /* renamed from: g */
        public boolean f33169g;

        /* renamed from: h */
        public int f33170h;

        /* renamed from: i */
        public boolean f33171i;

        /* renamed from: k */
        public int f33173k;

        /* renamed from: l */
        public int f33174l;

        /* renamed from: m */
        public int f33175m;

        /* renamed from: n */
        public int f33176n;

        /* renamed from: o */
        public int f33177o;

        /* renamed from: p */
        public int f33178p;

        /* renamed from: q */
        public Display f33179q;

        /* renamed from: s */
        public Bundle f33181s;

        /* renamed from: t */
        public IntentSender f33182t;

        /* renamed from: u */
        public C5895d f33183u;

        /* renamed from: w */
        public Map<String, AbstractC5897f.b.c> f33185w;

        /* renamed from: j */
        public final ArrayList<IntentFilter> f33172j = new ArrayList<>();

        /* renamed from: r */
        public int f33180r = -1;

        /* renamed from: v */
        public List<h> f33184v = new ArrayList();

        /* JADX WARN: Classes with same name are omitted:
          classes1.jar:m1/j$h$a.class
         */
        /* renamed from: m1.j$h$a */
        /* loaded from: combined.jar:classes1.jar:m1/j$h$a.class */
        public static final class a {

            /* renamed from: a */
            public final AbstractC5897f.b.c f33186a;

            public a(AbstractC5897f.b.c cVar) {
                this.f33186a = cVar;
            }

            /* renamed from: a */
            public int m29011a() {
                AbstractC5897f.b.c cVar = this.f33186a;
                return cVar != null ? cVar.m28828c() : 1;
            }

            /* renamed from: b */
            public boolean m29012b() {
                AbstractC5897f.b.c cVar = this.f33186a;
                return cVar != null && cVar.m28829d();
            }

            /* renamed from: c */
            public boolean m29013c() {
                AbstractC5897f.b.c cVar = this.f33186a;
                return cVar != null && cVar.m28830e();
            }

            /* renamed from: d */
            public boolean m29014d() {
                AbstractC5897f.b.c cVar = this.f33186a;
                return cVar == null || cVar.m28831f();
            }
        }

        public h(g gVar, String str, String str2) {
            this.f33163a = gVar;
            this.f33164b = str;
            this.f33165c = str2;
        }

        /* renamed from: D */
        public static boolean m28973D(h hVar) {
            return TextUtils.equals(hVar.m29002r().m28816q().m28839b(), "android");
        }

        /* renamed from: A */
        public final boolean m28974A(List<IntentFilter> list, List<IntentFilter> list2) {
            boolean z10 = true;
            if (list == list2) {
                return true;
            }
            if (list == null || list2 == null) {
                return false;
            }
            ListIterator<IntentFilter> listIterator = list.listIterator();
            ListIterator<IntentFilter> listIterator2 = list2.listIterator();
            while (listIterator.hasNext() && listIterator2.hasNext()) {
                if (!m29010z(listIterator.next(), listIterator2.next())) {
                    return false;
                }
            }
            if (listIterator.hasNext() || listIterator2.hasNext()) {
                z10 = false;
            }
            return z10;
        }

        /* renamed from: B */
        public boolean m28975B() {
            return this.f33183u != null && this.f33169g;
        }

        /* renamed from: C */
        public boolean m28976C() {
            C5901j.m28864d();
            return C5901j.m28866i().m28941v() == this;
        }

        /* renamed from: E */
        public boolean m28977E(C5900i c5900i) {
            if (c5900i == null) {
                throw new IllegalArgumentException("selector must not be null");
            }
            C5901j.m28864d();
            return c5900i.m28859h(this.f33172j);
        }

        /* renamed from: F */
        public int m28978F(C5895d c5895d) {
            return this.f33183u != c5895d ? m28983K(c5895d) : 0;
        }

        /* renamed from: G */
        public void m28979G(int i10) {
            C5901j.m28864d();
            C5901j.m28866i().m28904H(this, Math.min(this.f33178p, Math.max(0, i10)));
        }

        /* renamed from: H */
        public void m28980H(int i10) {
            C5901j.m28864d();
            if (i10 != 0) {
                C5901j.m28866i().m28905I(this, i10);
            }
        }

        /* renamed from: I */
        public void m28981I() {
            C5901j.m28864d();
            C5901j.m28866i().m28906J(this, 3);
        }

        /* renamed from: J */
        public boolean m28982J(String str) {
            if (str == null) {
                throw new IllegalArgumentException("category must not be null");
            }
            C5901j.m28864d();
            int size = this.f33172j.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (this.f33172j.get(i10).hasCategory(str)) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: K */
        public int m28983K(C5895d c5895d) {
            int i10;
            this.f33183u = c5895d;
            int i11 = 0;
            if (c5895d != null) {
                if (C6611c.m30516a(this.f33166d, c5895d.m28776o())) {
                    i10 = 0;
                } else {
                    this.f33166d = c5895d.m28776o();
                    i10 = 1;
                }
                int i12 = i10;
                if (!C6611c.m30516a(this.f33167e, c5895d.m28768g())) {
                    this.f33167e = c5895d.m28768g();
                    i12 = i10 | 1;
                }
                int i13 = i12;
                if (!C6611c.m30516a(this.f33168f, c5895d.m28772k())) {
                    this.f33168f = c5895d.m28772k();
                    i13 = i12 | 1;
                }
                int i14 = i13;
                if (this.f33169g != c5895d.m28784w()) {
                    this.f33169g = c5895d.m28784w();
                    i14 = i13 | 1;
                }
                int i15 = i14;
                if (this.f33170h != c5895d.m28766e()) {
                    this.f33170h = c5895d.m28766e();
                    i15 = i14 | 1;
                }
                int i16 = i15;
                if (!m28974A(this.f33172j, c5895d.m28767f())) {
                    this.f33172j.clear();
                    this.f33172j.addAll(c5895d.m28767f());
                    i16 = i15 | 1;
                }
                int i17 = i16;
                if (this.f33173k != c5895d.m28778q()) {
                    this.f33173k = c5895d.m28778q();
                    i17 = i16 | 1;
                }
                int i18 = i17;
                if (this.f33174l != c5895d.m28777p()) {
                    this.f33174l = c5895d.m28777p();
                    i18 = i17 | 1;
                }
                int i19 = i18;
                if (this.f33175m != c5895d.m28769h()) {
                    this.f33175m = c5895d.m28769h();
                    i19 = i18 | 1;
                }
                int i20 = i19;
                if (this.f33176n != c5895d.m28782u()) {
                    this.f33176n = c5895d.m28782u();
                    i20 = i19 | 3;
                }
                int i21 = i20;
                if (this.f33177o != c5895d.m28781t()) {
                    this.f33177o = c5895d.m28781t();
                    i21 = i20 | 3;
                }
                int i22 = i21;
                if (this.f33178p != c5895d.m28783v()) {
                    this.f33178p = c5895d.m28783v();
                    i22 = i21 | 3;
                }
                int i23 = i22;
                if (this.f33180r != c5895d.m28779r()) {
                    this.f33180r = c5895d.m28779r();
                    this.f33179q = null;
                    i23 = i22 | 5;
                }
                int i24 = i23;
                if (!C6611c.m30516a(this.f33181s, c5895d.m28770i())) {
                    this.f33181s = c5895d.m28770i();
                    i24 = i23 | 1;
                }
                int i25 = i24;
                if (!C6611c.m30516a(this.f33182t, c5895d.m28780s())) {
                    this.f33182t = c5895d.m28780s();
                    i25 = i24 | 1;
                }
                int i26 = i25;
                if (this.f33171i != c5895d.m28763a()) {
                    this.f33171i = c5895d.m28763a();
                    i26 = i25 | 5;
                }
                List<String> m28771j = c5895d.m28771j();
                ArrayList arrayList = new ArrayList();
                boolean z10 = false;
                if (m28771j.size() != this.f33184v.size()) {
                    z10 = true;
                }
                boolean z11 = z10;
                if (!m28771j.isEmpty()) {
                    d m28866i = C5901j.m28866i();
                    Iterator<String> it = m28771j.iterator();
                    while (true) {
                        z11 = z10;
                        if (!it.hasNext()) {
                            break;
                        }
                        h m28937r = m28866i.m28937r(m28866i.m28942w(m29001q(), it.next()));
                        if (m28937r != null) {
                            arrayList.add(m28937r);
                            if (!z10 && !this.f33184v.contains(m28937r)) {
                                z10 = true;
                            }
                        }
                    }
                }
                if (z11) {
                    this.f33184v = arrayList;
                    i11 = i26 | 1;
                } else {
                    i11 = i26;
                }
            }
            return i11;
        }

        /* renamed from: L */
        public void m28984L(Collection<AbstractC5897f.b.c> collection) {
            this.f33184v.clear();
            if (this.f33185w == null) {
                this.f33185w = new C7928a();
            }
            this.f33185w.clear();
            for (AbstractC5897f.b.c cVar : collection) {
                h m28986b = m28986b(cVar);
                if (m28986b != null) {
                    this.f33185w.put(m28986b.f33165c, cVar);
                    if (cVar.m28828c() == 2 || cVar.m28828c() == 3) {
                        this.f33184v.add(m28986b);
                    }
                }
            }
            C5901j.m28866i().f33115n.m28947b(259, this);
        }

        /* renamed from: a */
        public boolean m28985a() {
            return this.f33171i;
        }

        /* renamed from: b */
        public h m28986b(AbstractC5897f.b.c cVar) {
            return m29001q().m28965a(cVar.m28827b().m28773l());
        }

        /* renamed from: c */
        public int m28987c() {
            return this.f33170h;
        }

        /* renamed from: d */
        public String m28988d() {
            return this.f33167e;
        }

        /* renamed from: e */
        public String m28989e() {
            return this.f33164b;
        }

        /* renamed from: f */
        public int m28990f() {
            return this.f33175m;
        }

        /* renamed from: g */
        public AbstractC5897f.b m28991g() {
            C5901j.m28864d();
            AbstractC5897f.e eVar = C5901j.m28866i().f33122u;
            if (eVar instanceof AbstractC5897f.b) {
                return (AbstractC5897f.b) eVar;
            }
            return null;
        }

        /* renamed from: h */
        public a m28992h(h hVar) {
            if (hVar == null) {
                throw new NullPointerException("route must not be null");
            }
            Map<String, AbstractC5897f.b.c> map = this.f33185w;
            if (map == null || !map.containsKey(hVar.f33165c)) {
                return null;
            }
            return new a(this.f33185w.get(hVar.f33165c));
        }

        /* renamed from: i */
        public Bundle m28993i() {
            return this.f33181s;
        }

        /* renamed from: j */
        public Uri m28994j() {
            return this.f33168f;
        }

        /* renamed from: k */
        public String m28995k() {
            return this.f33165c;
        }

        /* renamed from: l */
        public List<h> m28996l() {
            return Collections.unmodifiableList(this.f33184v);
        }

        /* renamed from: m */
        public String m28997m() {
            return this.f33166d;
        }

        /* renamed from: n */
        public int m28998n() {
            return this.f33174l;
        }

        /* renamed from: o */
        public int m28999o() {
            return this.f33173k;
        }

        /* renamed from: p */
        public int m29000p() {
            return this.f33180r;
        }

        /* renamed from: q */
        public g m29001q() {
            return this.f33163a;
        }

        /* renamed from: r */
        public AbstractC5897f m29002r() {
            return this.f33163a.m28969e();
        }

        /* renamed from: s */
        public int m29003s() {
            return this.f33177o;
        }

        /* renamed from: t */
        public int m29004t() {
            if (!m29009y() || C5901j.m28868o()) {
                return this.f33176n;
            }
            return 0;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("MediaRouter.RouteInfo{ uniqueId=" + this.f33165c + ", name=" + this.f33166d + ", description=" + this.f33167e + ", iconUri=" + this.f33168f + ", enabled=" + this.f33169g + ", connectionState=" + this.f33170h + ", canDisconnect=" + this.f33171i + ", playbackType=" + this.f33173k + ", playbackStream=" + this.f33174l + ", deviceType=" + this.f33175m + ", volumeHandling=" + this.f33176n + ", volume=" + this.f33177o + ", volumeMax=" + this.f33178p + ", presentationDisplayId=" + this.f33180r + ", extras=" + this.f33181s + ", settingsIntent=" + this.f33182t + ", providerPackageName=" + this.f33163a.m28968d());
            if (m29009y()) {
                sb2.append(", members=[");
                int size = this.f33184v.size();
                for (int i10 = 0; i10 < size; i10++) {
                    if (i10 > 0) {
                        sb2.append(", ");
                    }
                    if (this.f33184v.get(i10) != this) {
                        sb2.append(this.f33184v.get(i10).m28995k());
                    }
                }
                sb2.append(']');
            }
            sb2.append(" }");
            return sb2.toString();
        }

        /* renamed from: u */
        public int m29005u() {
            return this.f33178p;
        }

        /* renamed from: v */
        public boolean m29006v() {
            C5901j.m28864d();
            return C5901j.m28866i().m28934o() == this;
        }

        /* renamed from: w */
        public boolean m29007w() {
            boolean z10 = true;
            if (!m29006v()) {
                z10 = this.f33175m == 3 ? true : m28973D(this) && m28982J("android.media.intent.category.LIVE_AUDIO") && !m28982J("android.media.intent.category.LIVE_VIDEO");
            }
            return z10;
        }

        /* renamed from: x */
        public boolean m29008x() {
            return this.f33169g;
        }

        /* renamed from: y */
        public boolean m29009y() {
            boolean z10 = true;
            if (m28996l().size() < 1) {
                z10 = false;
            }
            return z10;
        }

        /* renamed from: z */
        public final boolean m29010z(IntentFilter intentFilter, IntentFilter intentFilter2) {
            int countActions;
            if (intentFilter == intentFilter2) {
                return true;
            }
            if (intentFilter == null || intentFilter2 == null || (countActions = intentFilter.countActions()) != intentFilter2.countActions()) {
                return false;
            }
            for (int i10 = 0; i10 < countActions; i10++) {
                if (!intentFilter.getAction(i10).equals(intentFilter2.getAction(i10))) {
                    return false;
                }
            }
            int countCategories = intentFilter.countCategories();
            if (countCategories != intentFilter2.countCategories()) {
                return false;
            }
            for (int i11 = 0; i11 < countCategories; i11++) {
                if (!intentFilter.getCategory(i11).equals(intentFilter2.getCategory(i11))) {
                    return false;
                }
            }
            return true;
        }
    }

    public C5901j(Context context) {
        this.f33087a = context;
    }

    /* renamed from: d */
    public static void m28864d() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("The media router service must only be accessed on the application's main thread.");
        }
    }

    /* renamed from: h */
    public static int m28865h() {
        if (f33086d == null) {
            return 0;
        }
        return m28866i().m28933n();
    }

    /* renamed from: i */
    public static d m28866i() {
        d dVar = f33086d;
        if (dVar == null) {
            return null;
        }
        dVar.m28928i();
        return f33086d;
    }

    /* renamed from: j */
    public static C5901j m28867j(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("context must not be null");
        }
        m28864d();
        if (f33086d == null) {
            f33086d = new d(context.getApplicationContext());
        }
        return f33086d.m28938s(context);
    }

    /* renamed from: o */
    public static boolean m28868o() {
        if (f33086d == null) {
            return false;
        }
        return m28866i().m28943x();
    }

    /* renamed from: p */
    public static boolean m28869p() {
        if (f33086d == null) {
            return false;
        }
        return m28866i().m28944y();
    }

    /* renamed from: r */
    public static boolean m28870r() {
        d m28866i = m28866i();
        return m28866i == null ? false : m28866i.m28899C();
    }

    /* renamed from: a */
    public void m28871a(C5900i c5900i, a aVar) {
        m28872b(c5900i, aVar, 0);
    }

    /* renamed from: b */
    public void m28872b(C5900i c5900i, a aVar, int i10) {
        b bVar;
        if (c5900i == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        if (aVar == null) {
            throw new IllegalArgumentException("callback must not be null");
        }
        m28864d();
        if (f33085c) {
            Log.d("MediaRouter", "addCallback: selector=" + c5900i + ", callback=" + aVar + ", flags=" + Integer.toHexString(i10));
        }
        int m28874e = m28874e(aVar);
        if (m28874e < 0) {
            bVar = new b(this, aVar);
            this.f33088b.add(bVar);
        } else {
            bVar = this.f33088b.get(m28874e);
        }
        boolean z10 = false;
        if (i10 != bVar.f33092d) {
            bVar.f33092d = i10;
            z10 = true;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        bVar.f33093e = elapsedRealtime;
        if (!bVar.f33091c.m28854b(c5900i)) {
            bVar.f33091c = new C5900i.a(bVar.f33091c).m28862c(c5900i).m28863d();
            z10 = true;
        }
        if (z10) {
            m28866i().m28913Q();
        }
    }

    /* renamed from: c */
    public void m28873c(h hVar) {
        if (hVar == null) {
            throw new NullPointerException("route must not be null");
        }
        m28864d();
        m28866i().m28924e(hVar);
    }

    /* renamed from: e */
    public final int m28874e(a aVar) {
        int size = this.f33088b.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f33088b.get(i10).f33090b == aVar) {
                return i10;
            }
        }
        return -1;
    }

    /* renamed from: f */
    public h m28875f() {
        m28864d();
        d m28866i = m28866i();
        return m28866i == null ? null : m28866i.m28932m();
    }

    /* renamed from: g */
    public h m28876g() {
        m28864d();
        return m28866i().m28934o();
    }

    /* renamed from: k */
    public MediaSessionCompat.Token m28877k() {
        d dVar = f33086d;
        return dVar == null ? null : dVar.m28936q();
    }

    /* renamed from: l */
    public C5911t m28878l() {
        m28864d();
        d m28866i = m28866i();
        return m28866i == null ? null : m28866i.m28939t();
    }

    /* renamed from: m */
    public List<h> m28879m() {
        m28864d();
        d m28866i = m28866i();
        return m28866i == null ? Collections.emptyList() : m28866i.m28940u();
    }

    /* renamed from: n */
    public h m28880n() {
        m28864d();
        return m28866i().m28941v();
    }

    /* renamed from: q */
    public boolean m28881q(C5900i c5900i, int i10) {
        if (c5900i == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        m28864d();
        return m28866i().m28945z(c5900i, i10);
    }

    /* renamed from: s */
    public void m28882s(a aVar) {
        if (aVar == null) {
            throw new IllegalArgumentException("callback must not be null");
        }
        m28864d();
        if (f33085c) {
            Log.d("MediaRouter", "removeCallback: callback=" + aVar);
        }
        int m28874e = m28874e(aVar);
        if (m28874e >= 0) {
            this.f33088b.remove(m28874e);
            m28866i().m28913Q();
        }
    }

    /* renamed from: t */
    public void m28883t(h hVar) {
        if (hVar == null) {
            throw new NullPointerException("route must not be null");
        }
        m28864d();
        m28866i().m28902F(hVar);
    }

    /* renamed from: u */
    public void m28884u(h hVar) {
        if (hVar == null) {
            throw new IllegalArgumentException("route must not be null");
        }
        m28864d();
        if (f33085c) {
            Log.d("MediaRouter", "selectRoute: " + hVar);
        }
        m28866i().m28906J(hVar, 3);
    }

    /* renamed from: v */
    public void m28885v(MediaSessionCompat mediaSessionCompat) {
        m28864d();
        if (f33085c) {
            Log.d("MediaRouter", "setMediaSessionCompat: " + mediaSessionCompat);
        }
        m28866i().m28908L(mediaSessionCompat);
    }

    /* renamed from: w */
    public void m28886w(e eVar) {
        m28864d();
        m28866i().f33095B = eVar;
    }

    /* renamed from: x */
    public void m28887x(C5911t c5911t) {
        m28864d();
        m28866i().m28910N(c5911t);
    }

    /* renamed from: y */
    public void m28888y(h hVar) {
        if (hVar == null) {
            throw new NullPointerException("route must not be null");
        }
        m28864d();
        m28866i().m28912P(hVar);
    }

    /* renamed from: z */
    public void m28889z(int i10) {
        if (i10 < 0 || i10 > 3) {
            throw new IllegalArgumentException("Unsupported reason to unselect route");
        }
        m28864d();
        d m28866i = m28866i();
        h m28927h = m28866i.m28927h();
        if (m28866i.m28941v() != m28927h) {
            m28866i.m28906J(m28927h, i10);
        }
    }
}
