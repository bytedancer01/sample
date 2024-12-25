package com.maxdigitall.maxdigitaliptvbox.view.utility.epg;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.GestureDetector;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.Scroller;
import android.widget.TextView;
import com.maxdigitall.maxdigitaliptvbox.model.FavouriteDBModel;
import com.maxdigitall.maxdigitaliptvbox.model.FavouriteM3UModel;
import com.maxdigitall.maxdigitaliptvbox.model.database.DatabaseHandler;
import com.maxdigitall.maxdigitaliptvbox.model.database.LiveStreamDBHandler;
import com.maxdigitall.maxdigitaliptvbox.model.database.SharepreferenceDBHandler;
import com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerSmallEPG;
import java.net.CookieManager;
import java.net.CookiePolicy;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import nf.C6783a;
import org.joda.time.DateTimeConstants;
import org.joda.time.LocalDateTime;
import p099fc.C4803d0;
import p151if.C5251a;
import p151if.C5255e;
import p371vf.InterfaceC9344a;
import p371vf.InterfaceC9345b;
import p408xf.C9746a;
import p408xf.C9747b;
import p428yg.C10014t;
import p428yg.InterfaceC9993c0;
import pf.C7705a;
import pf.C7707c;
import pf.C7708d;
import pf.C7709e;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;
import wf.C9571a;
import wf.C9572b;
import wf.C9573c;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/utility/epg/EPG.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/utility/epg/EPG.class */
public class EPG extends ViewGroup {

    /* renamed from: e1 */
    public static int f24922e1 = 3600000;

    /* renamed from: f1 */
    public static int f24923f1 = 14400000;

    /* renamed from: g1 */
    public static int f24924g1 = 7200000;

    /* renamed from: h1 */
    public static int f24925h1;

    /* renamed from: i1 */
    public static int f24926i1;

    /* renamed from: j1 */
    public static final CookieManager f24927j1;

    /* renamed from: k1 */
    public static String f24928k1;

    /* renamed from: l1 */
    public static String f24929l1;

    /* renamed from: A */
    public final int f24930A;

    /* renamed from: A0 */
    public boolean f24931A0;

    /* renamed from: B */
    public final int f24932B;

    /* renamed from: B0 */
    public LinearLayout f24933B0;

    /* renamed from: C */
    public final int f24934C;

    /* renamed from: C0 */
    public TextView f24935C0;

    /* renamed from: D */
    public int f24936D;

    /* renamed from: D0 */
    public long f24937D0;

    /* renamed from: E */
    public final int f24938E;

    /* renamed from: E0 */
    public String f24939E0;

    /* renamed from: F */
    public final int f24940F;

    /* renamed from: F0 */
    public int f24941F0;

    /* renamed from: G */
    public final Bitmap f24942G;

    /* renamed from: G0 */
    public int f24943G0;

    /* renamed from: H */
    public final int f24944H;

    /* renamed from: H0 */
    public SharedPreferences f24945H0;

    /* renamed from: I */
    public final Map<String, Bitmap> f24946I;

    /* renamed from: I0 */
    public boolean f24947I0;

    /* renamed from: J */
    public final Map<String, InterfaceC9993c0> f24948J;

    /* renamed from: J0 */
    public Handler f24949J0;

    /* renamed from: K */
    public InterfaceC9344a f24950K;

    /* renamed from: K0 */
    public Handler f24951K0;

    /* renamed from: L */
    public int f24952L;

    /* renamed from: L0 */
    public SurfaceView f24953L0;

    /* renamed from: M */
    public int f24954M;

    /* renamed from: M0 */
    public int f24955M0;

    /* renamed from: N */
    public long f24956N;

    /* renamed from: N0 */
    public NSTIJKPlayerSmallEPG f24957N0;

    /* renamed from: O */
    public long f24958O;

    /* renamed from: O0 */
    public Activity f24959O0;

    /* renamed from: P */
    public long f24960P;

    /* renamed from: P0 */
    public Boolean f24961P0;

    /* renamed from: Q */
    public long f24962Q;

    /* renamed from: Q0 */
    public int f24963Q0;

    /* renamed from: R */
    public boolean f24964R;

    /* renamed from: R0 */
    public boolean f24965R0;

    /* renamed from: S */
    public SharedPreferences f24966S;

    /* renamed from: S0 */
    public int f24967S0;

    /* renamed from: T */
    public long f24968T;

    /* renamed from: T0 */
    public ProgressDialog f24969T0;

    /* renamed from: U */
    public InterfaceC9345b f24970U;

    /* renamed from: U0 */
    public C6783a f24971U0;

    /* renamed from: V */
    public C9571a f24972V;

    /* renamed from: V0 */
    public Uri f24973V0;

    /* renamed from: W */
    public C9571a f24974W;

    /* renamed from: W0 */
    public boolean f24975W0;

    /* renamed from: X0 */
    public boolean f24976X0;

    /* renamed from: Y0 */
    public Boolean f24977Y0;

    /* renamed from: Z0 */
    public Date f24978Z0;

    /* renamed from: a1 */
    public DateFormat f24979a1;

    /* renamed from: b */
    public DatabaseHandler f24980b;

    /* renamed from: b1 */
    public SimpleDateFormat f24981b1;

    /* renamed from: c */
    public LiveStreamDBHandler f24982c;

    /* renamed from: c1 */
    public String f24983c1;

    /* renamed from: d */
    public final String f24984d;

    /* renamed from: d1 */
    public String f24985d1;

    /* renamed from: e */
    public SimpleDateFormat f24986e;

    /* renamed from: f */
    public SimpleDateFormat f24987f;

    /* renamed from: f0 */
    public C9572b f24988f0;

    /* renamed from: g */
    public SharedPreferences f24989g;

    /* renamed from: g0 */
    public TextView f24990g0;

    /* renamed from: h */
    public final Rect f24991h;

    /* renamed from: h0 */
    public TextView f24992h0;

    /* renamed from: i */
    public final Rect f24993i;

    /* renamed from: i0 */
    public TextView f24994i0;

    /* renamed from: j */
    public final Rect f24995j;

    /* renamed from: j0 */
    public int f24996j0;

    /* renamed from: k */
    public final Paint f24997k;

    /* renamed from: k0 */
    public SharedPreferences f24998k0;

    /* renamed from: l */
    public final Scroller f24999l;

    /* renamed from: l0 */
    public SharedPreferences f25000l0;

    /* renamed from: m */
    public final GestureDetector f25001m;

    /* renamed from: m0 */
    public PopupWindow f25002m0;

    /* renamed from: n */
    public int f25003n;

    /* renamed from: n0 */
    public Context f25004n0;

    /* renamed from: o */
    public final int f25005o;

    /* renamed from: o0 */
    public ProgressBar f25006o0;

    /* renamed from: p */
    public final int f25007p;

    /* renamed from: p0 */
    public int f25008p0;

    /* renamed from: q */
    public final int f25009q;

    /* renamed from: q0 */
    public String f25010q0;

    /* renamed from: r */
    public int f25011r;

    /* renamed from: r0 */
    public String f25012r0;

    /* renamed from: s */
    public int f25013s;

    /* renamed from: s0 */
    public int f25014s0;

    /* renamed from: t */
    public final int f25015t;

    /* renamed from: t0 */
    public int f25016t0;

    /* renamed from: u */
    public final int f25017u;

    /* renamed from: u0 */
    public int f25018u0;

    /* renamed from: v */
    public final int f25019v;

    /* renamed from: v0 */
    public int f25020v0;

    /* renamed from: w */
    public final int f25021w;

    /* renamed from: w0 */
    public int f25022w0;

    /* renamed from: x */
    public final int f25023x;

    /* renamed from: x0 */
    public int f25024x0;

    /* renamed from: y */
    public final int f25025y;

    /* renamed from: y0 */
    public int f25026y0;

    /* renamed from: z */
    public final int f25027z;

    /* renamed from: z0 */
    public int f25028z0;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/utility/epg/EPG$a.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.utility.epg.EPG$a */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/utility/epg/EPG$a.class */
    public class C4046a implements InterfaceC9993c0 {

        /* renamed from: a */
        public final String f25029a;

        /* renamed from: b */
        public final EPG f25030b;

        public C4046a(EPG epg, String str) {
            this.f25030b = epg;
            this.f25029a = str;
        }

        @Override // p428yg.InterfaceC9993c0
        /* renamed from: a */
        public void mo16616a(Drawable drawable) {
            this.f25030b.f24946I.put(this.f25029a, BitmapFactory.decodeResource(this.f25030b.getResources(), 2131231571));
            this.f25030b.m19781j0();
            this.f25030b.f24948J.remove(this.f25029a);
        }

        @Override // p428yg.InterfaceC9993c0
        /* renamed from: b */
        public void mo16617b(Bitmap bitmap, C10014t.e eVar) {
            this.f25030b.f24946I.put(this.f25029a, bitmap);
            this.f25030b.m19781j0();
            this.f25030b.f24948J.remove(this.f25029a);
        }

        @Override // p428yg.InterfaceC9993c0
        /* renamed from: c */
        public void mo16618c(Drawable drawable) {
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/utility/epg/EPG$b.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.utility.epg.EPG$b */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/utility/epg/EPG$b.class */
    public class ViewOnClickListenerC4047b implements View.OnClickListener {

        /* renamed from: b */
        public final String f25031b;

        /* renamed from: c */
        public final int f25032c;

        /* renamed from: d */
        public final String f25033d;

        /* renamed from: e */
        public final String f25034e;

        /* renamed from: f */
        public final String f25035f;

        /* renamed from: g */
        public final String f25036g;

        /* renamed from: h */
        public final String f25037h;

        /* renamed from: i */
        public final String f25038i;

        /* renamed from: j */
        public final EPG f25039j;

        public ViewOnClickListenerC4047b(EPG epg, String str, int i10, String str2, String str3, String str4, String str5, String str6, String str7) {
            this.f25039j = epg;
            this.f25031b = str;
            this.f25032c = i10;
            this.f25033d = str2;
            this.f25034e = str3;
            this.f25035f = str4;
            this.f25036g = str5;
            this.f25037h = str6;
            this.f25038i = str7;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f25039j.f25002m0.dismiss();
            if (this.f25039j.f24977Y0.booleanValue()) {
                C5255e.m26222Y(this.f25039j.getContext(), this.f25031b, this.f25032c, "live", this.f25033d, this.f25034e, this.f25035f, this.f25036g, this.f25037h, this.f25038i);
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/utility/epg/EPG$c.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.utility.epg.EPG$c */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/utility/epg/EPG$c.class */
    public class ViewOnClickListenerC4048c implements View.OnClickListener {

        /* renamed from: b */
        public final Context f25040b;

        /* renamed from: c */
        public final String f25041c;

        /* renamed from: d */
        public final String f25042d;

        /* renamed from: e */
        public final String f25043e;

        /* renamed from: f */
        public final int f25044f;

        /* renamed from: g */
        public final String f25045g;

        /* renamed from: h */
        public final EPG f25046h;

        public ViewOnClickListenerC4048c(EPG epg, Context context, String str, String str2, String str3, int i10, String str4) {
            this.f25046h = epg;
            this.f25040b = context;
            this.f25041c = str;
            this.f25042d = str2;
            this.f25043e = str3;
            this.f25044f = i10;
            this.f25045g = str4;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (SharepreferenceDBHandler.m15373f(this.f25040b).equals("m3u")) {
                this.f25046h.m19791x(this.f25040b, this.f25041c, this.f25042d, this.f25043e);
            } else {
                this.f25046h.m19790w(this.f25040b, this.f25041c, this.f25044f, this.f25043e, this.f25045g);
            }
            this.f25046h.f25002m0.dismiss();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/utility/epg/EPG$d.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.utility.epg.EPG$d */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/utility/epg/EPG$d.class */
    public class ViewOnClickListenerC4049d implements View.OnClickListener {

        /* renamed from: b */
        public final Context f25047b;

        /* renamed from: c */
        public final String f25048c;

        /* renamed from: d */
        public final String f25049d;

        /* renamed from: e */
        public final String f25050e;

        /* renamed from: f */
        public final int f25051f;

        /* renamed from: g */
        public final EPG f25052g;

        public ViewOnClickListenerC4049d(EPG epg, Context context, String str, String str2, String str3, int i10) {
            this.f25052g = epg;
            this.f25047b = context;
            this.f25048c = str;
            this.f25049d = str2;
            this.f25050e = str3;
            this.f25051f = i10;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (SharepreferenceDBHandler.m15373f(this.f25047b).equals("m3u")) {
                this.f25052g.m19783l0(this.f25047b, this.f25048c, this.f25049d);
            } else {
                this.f25052g.m19782k0(this.f25047b, this.f25050e, this.f25051f, this.f25049d);
            }
            this.f25052g.f25002m0.dismiss();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/utility/epg/EPG$e.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.utility.epg.EPG$e */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/utility/epg/EPG$e.class */
    public class ViewOnClickListenerC4050e implements View.OnClickListener {

        /* renamed from: b */
        public final EPG f25053b;

        public ViewOnClickListenerC4050e(EPG epg) {
            this.f25053b = epg;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f25053b.f25002m0.dismiss();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/utility/epg/EPG$f.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.utility.epg.EPG$f */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/utility/epg/EPG$f.class */
    public class C4051f extends GestureDetector.SimpleOnGestureListener {

        /* renamed from: b */
        public final EPG f25054b;

        public C4051f(EPG epg) {
            this.f25054b = epg;
        }

        public /* synthetic */ C4051f(EPG epg, C4046a c4046a) {
            this(epg);
        }

        /* renamed from: c */
        public final void m19796c() {
            if (this.f25054b.f24959O0 == null || this.f25054b.f24969T0 == null) {
                return;
            }
            this.f25054b.f24969T0.dismiss();
        }

        /* renamed from: d */
        public final void m19797d() {
            if (this.f25054b.f24959O0 != null) {
                if (this.f25054b.f24969T0 == null || !this.f25054b.f24969T0.isShowing()) {
                    this.f25054b.f24969T0 = new ProgressDialog(this.f25054b.f24959O0);
                    this.f25054b.f24969T0.setMessage(this.f25054b.f24959O0.getResources().getString(2132018352));
                    this.f25054b.f24969T0.setCanceledOnTouchOutside(false);
                    this.f25054b.f24969T0.setCancelable(false);
                    this.f25054b.f24969T0.setProgressStyle(0);
                    this.f25054b.f24969T0.show();
                }
            }
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent motionEvent) {
            if (this.f25054b.f24999l.isFinished()) {
                return true;
            }
            this.f25054b.f24999l.forceFinished(true);
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
            this.f25054b.f24999l.fling(this.f25054b.getScrollX(), this.f25054b.getScrollY(), -((int) f10), -((int) f11), 0, this.f25054b.f24952L, 0, this.f25054b.f24954M);
            this.f25054b.m19781j0();
            if (this.f25054b.f24999l.getFinalY() != this.f25054b.f24954M || this.f25054b.f24967S0 != 1) {
                return true;
            }
            m19797d();
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
            int i10 = (int) f10;
            int i11 = (int) f11;
            int scrollX = this.f25054b.getScrollX();
            int scrollY = this.f25054b.getScrollY();
            int i12 = i10;
            if (scrollX + i10 < 0) {
                i12 = 0 - scrollX;
            }
            int i13 = i11;
            if (scrollY + i11 < 0) {
                i13 = 0 - scrollY;
            }
            int i14 = i12;
            if (scrollX + i12 > this.f25054b.f24952L) {
                i14 = this.f25054b.f24952L - scrollX;
            }
            int i15 = i13;
            if (scrollY + i13 > this.f25054b.f24954M) {
                i15 = this.f25054b.f24954M - scrollY;
            }
            this.f25054b.scrollBy(i14, i15);
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            int m19767W;
            InterfaceC9344a interfaceC9344a;
            C9572b mo39384a;
            C9572b c9572b;
            try {
                int x10 = (int) motionEvent.getX();
                int y10 = (int) motionEvent.getY();
                int scrollX = this.f25054b.getScrollX();
                int scrollY = this.f25054b.getScrollY() + y10;
                int m19764T = this.f25054b.m19764T(scrollY);
                if (m19764T == -1 || this.f25054b.f24950K == null) {
                    return true;
                }
                if (this.f25054b.m19750D().contains(scrollX + x10, scrollY)) {
                    this.f25054b.f24950K.mo18092c();
                    return true;
                }
                if (this.f25054b.m19792y().contains(x10, y10)) {
                    this.f25054b.f24950K.mo18092c();
                    Iterator<C9572b> it = this.f25054b.f24970U.mo39386c(m19764T).m40156e().iterator();
                    do {
                        c9572b = null;
                        if (!it.hasNext()) {
                            break;
                        }
                        c9572b = it.next();
                    } while (!c9572b.m40174h(this.f25054b.getTimeShiftMilliSeconds()));
                    if (c9572b == null) {
                        this.f25054b.f24950K.mo18091b(m19764T, this.f25054b.f24970U.mo39386c(m19764T));
                        return true;
                    }
                    EPG epg = this.f25054b;
                    m19767W = epg.m19767W(m19764T, epg.m19768X((epg.getScrollX() + x10) - this.f25054b.m19749C().left));
                    if (m19767W == -1) {
                        return true;
                    }
                    mo39384a = c9572b;
                    interfaceC9344a = this.f25054b.f24950K;
                } else {
                    if (!this.f25054b.m19749C().contains(x10, y10)) {
                        return true;
                    }
                    EPG epg2 = this.f25054b;
                    m19767W = epg2.m19767W(m19764T, epg2.m19768X((epg2.getScrollX() + x10) - this.f25054b.m19749C().left));
                    if (m19767W == -1) {
                        return true;
                    }
                    interfaceC9344a = this.f25054b.f24950K;
                    mo39384a = this.f25054b.f24970U.mo39384a(m19764T, m19767W);
                }
                interfaceC9344a.mo18090a(m19764T, m19767W, mo39384a);
                return true;
            } catch (Exception e10) {
                return true;
            }
        }
    }

    static {
        CookieManager cookieManager = new CookieManager();
        f24927j1 = cookieManager;
        cookieManager.setCookiePolicy(CookiePolicy.ACCEPT_ORIGINAL_SERVER);
    }

    public EPG(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        String str;
        String str2;
        this.f25004n0 = context;
        this.f24949J0 = new Handler();
        this.f24951K0 = new Handler();
        this.f24971U0 = new C6783a(context);
        this.f24945H0 = context.getSharedPreferences("loginPrefs", 0);
        this.f24983c1 = C5255e.m26247n0(C7705a.m33651a());
        f24928k1 = context.getApplicationContext().getPackageName();
        f24929l1 = m19725S(context);
        this.f24985d1 = C5255e.m26247n0(C7708d.m33672d());
        Locale locale = Locale.US;
        this.f24981b1 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss", locale);
        this.f24979a1 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss", locale);
        this.f24978Z0 = new Date();
        SimpleDateFormat simpleDateFormat = this.f24981b1;
        if (m19724I(simpleDateFormat, simpleDateFormat.format(new Date(C7709e.m33680a(context))), this.f24979a1.format(this.f24978Z0)) < C7707c.m33667p() || (str = this.f24983c1) == null || this.f24985d1 == null) {
            return;
        }
        if (f24929l1.equals(str) && (this.f24983c1 == null || (str2 = this.f24985d1) == null || f24928k1.equals(str2))) {
            return;
        }
        this.f24977Y0 = Boolean.FALSE;
    }

    public EPG(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        String str;
        String str2;
        this.f24984d = getClass().getSimpleName();
        this.f24968T = 200000L;
        this.f24970U = null;
        this.f24972V = null;
        this.f24974W = null;
        this.f24988f0 = null;
        this.f25010q0 = "";
        this.f25014s0 = -1;
        this.f25016t0 = 0;
        this.f25018u0 = 1;
        this.f25020v0 = 2;
        this.f25022w0 = 3;
        this.f25024x0 = 4;
        this.f25026y0 = 5;
        this.f25028z0 = 0;
        this.f24931A0 = false;
        this.f24937D0 = 5000L;
        this.f24941F0 = 0;
        this.f24943G0 = 5;
        this.f24947I0 = false;
        this.f24955M0 = 3;
        Boolean bool = Boolean.FALSE;
        this.f24961P0 = bool;
        this.f24963Q0 = 0;
        this.f24965R0 = false;
        this.f24975W0 = false;
        this.f24976X0 = false;
        this.f24977Y0 = Boolean.TRUE;
        this.f25004n0 = context;
        this.f24949J0 = new Handler();
        this.f24951K0 = new Handler();
        this.f24971U0 = new C6783a(context);
        this.f24945H0 = context.getSharedPreferences("loginPrefs", 0);
        setWillNotDraw(false);
        m19784m0();
        this.f25003n = getResources().getDimensionPixelSize(2131166135);
        this.f25013s = getResources().getDimensionPixelSize(2131166138);
        this.f25011r = getResources().getDimensionPixelSize(2131166139);
        this.f24936D = getResources().getDimensionPixelSize(2131166145);
        if (this.f24971U0.m31288z().equals(C5251a.f30065s0)) {
            f24924g1 = 14400000;
            this.f25013s += 125;
            this.f25011r += 95;
        }
        this.f24993i = new Rect();
        this.f24991h = new Rect();
        this.f24995j = new Rect();
        this.f24997k = new Paint(1);
        this.f25001m = new GestureDetector(context, new C4051f(this, null));
        this.f24946I = C4803d0.m24362e();
        this.f24948J = C4803d0.m24362e();
        this.f24999l = new Scroller(context);
        this.f24944H = getResources().getColor(2131099842);
        this.f25005o = getResources().getDimensionPixelSize(2131166137);
        this.f25007p = getResources().getDimensionPixelSize(2131166133);
        this.f25009q = getResources().getDimensionPixelSize(2131166136);
        this.f25015t = getResources().getColor(2131099844);
        this.f25017u = getResources().getColor(2131099844);
        this.f25019v = getResources().getColor(2131099843);
        this.f25021w = getResources().getColor(2131099869);
        this.f25023x = getResources().getColor(2131099844);
        this.f25025y = getResources().getColor(2131099848);
        this.f25027z = getResources().getDimensionPixelSize(2131166140);
        this.f24934C = getResources().getDimensionPixelSize(2131166143);
        this.f24930A = getResources().getDimensionPixelSize(2131166144);
        this.f24932B = getResources().getColor(2131099869);
        int dimensionPixelSize = getResources().getDimensionPixelSize(2131166142);
        this.f24938E = dimensionPixelSize;
        this.f24940F = getResources().getDimensionPixelSize(2131166141);
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.outWidth = dimensionPixelSize;
        options.outHeight = dimensionPixelSize;
        this.f24942G = BitmapFactory.decodeResource(getResources(), 2131231748, options);
        BitmapFactory.Options options2 = new BitmapFactory.Options();
        options2.outWidth = dimensionPixelSize;
        options2.outHeight = dimensionPixelSize;
        this.f24983c1 = C5255e.m26247n0(C7705a.m33651a());
        f24928k1 = context.getApplicationContext().getPackageName();
        f24929l1 = m19725S(context);
        this.f24985d1 = C5255e.m26247n0(C7708d.m33672d());
        Locale locale = Locale.US;
        this.f24981b1 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss", locale);
        this.f24979a1 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss", locale);
        this.f24978Z0 = new Date();
        SimpleDateFormat simpleDateFormat = this.f24981b1;
        if (m19724I(simpleDateFormat, simpleDateFormat.format(new Date(C7709e.m33680a(context))), this.f24979a1.format(this.f24978Z0)) < C7707c.m33667p() || (str = this.f24983c1) == null || this.f24985d1 == null) {
            return;
        }
        if (f24929l1.equals(str) && (this.f24983c1 == null || (str2 = this.f24985d1) == null || f24928k1.equals(str2))) {
            return;
        }
        this.f24977Y0 = bool;
    }

    /* renamed from: I */
    public static long m19724I(SimpleDateFormat simpleDateFormat, String str, String str2) {
        try {
            return TimeUnit.DAYS.convert(simpleDateFormat.parse(str2).getTime() - simpleDateFormat.parse(str).getTime(), TimeUnit.MILLISECONDS);
        } catch (Exception e10) {
            e10.printStackTrace();
            return 0L;
        }
    }

    /* renamed from: S */
    public static String m19725S(Context context) {
        return String.valueOf(context.getApplicationInfo().loadLabel(context.getPackageManager()));
    }

    private int getChannelAreaWidth() {
        return this.f25013s + this.f25005o + this.f25003n;
    }

    private C9571a getFirstChannelData() {
        return this.f24972V;
    }

    private C9571a getFirstLastChannelData() {
        return this.f24974W;
    }

    private int getFirstVisibleChannelPosition() {
        int scrollY = getScrollY();
        int i10 = this.f25003n;
        int i11 = ((scrollY - i10) - this.f24934C) / (this.f25007p + i10);
        int i12 = i11;
        if (i11 < 0) {
            i12 = 0;
        }
        return i12;
    }

    private int getLastVisibleChannelPosition() {
        int scrollY = getScrollY();
        int mo39389f = this.f24970U.mo39389f();
        int height = scrollY + getHeight();
        int i10 = this.f24934C;
        int i11 = this.f25003n;
        int i12 = this.f25007p;
        int i13 = ((i10 + height) - i11) / (i11 + i12);
        int i14 = mo39389f - 1;
        int i15 = i13;
        if (i13 > i14) {
            i15 = i14;
        }
        int i16 = i15;
        if (height > i12 * i15) {
            i16 = i15;
            if (i15 < i14) {
                i16 = i15 + 1;
            }
        }
        return i16;
    }

    private int getProgramAreaWidth() {
        return getWidth() - getChannelAreaWidth();
    }

    private int getXPositionStart() {
        return m19770Z((System.currentTimeMillis() + getTimeShiftMilliSeconds()) - (f24924g1 / 2));
    }

    /* renamed from: A */
    public final void m19747A() {
        int m19769Y = m19769Y(this.f24970U.mo39389f() - 1) + this.f25007p;
        this.f24954M = m19769Y < getHeight() ? 0 : m19769Y - getHeight();
    }

    /* renamed from: B */
    public final long m19748B() {
        return f24924g1 / ((getResources().getDisplayMetrics().widthPixels - this.f25013s) - this.f25003n);
    }

    /* renamed from: C */
    public final Rect m19749C() {
        this.f24995j.top = this.f24934C;
        int mo39389f = this.f24970U.mo39389f() * (this.f25007p + this.f25003n);
        Rect rect = this.f24995j;
        if (mo39389f >= getHeight()) {
            mo39389f = getHeight();
        }
        rect.bottom = mo39389f;
        Rect rect2 = this.f24995j;
        rect2.left = this.f25013s;
        rect2.right = getWidth();
        return this.f24995j;
    }

    /* renamed from: D */
    public final Rect m19750D() {
        this.f24995j.left = ((getScrollX() + getWidth()) - this.f24938E) - this.f24940F;
        Rect rect = this.f24995j;
        int scrollY = getScrollY();
        int height = getHeight();
        int i10 = this.f24938E;
        rect.top = ((scrollY + height) - i10) - this.f24940F;
        Rect rect2 = this.f24995j;
        rect2.right = rect2.left + i10;
        rect2.bottom = rect2.top + i10;
        return rect2;
    }

    /* renamed from: E */
    public final long m19751E() {
        SharedPreferences sharedPreferences = this.f25004n0.getSharedPreferences("auto_start", 0);
        this.f24966S = sharedPreferences;
        boolean z10 = sharedPreferences.getBoolean("full_epg", false);
        this.f24964R = z10;
        f24922e1 = z10 ? 86400000 : 3600000;
        return LocalDateTime.now().toDateTime().minusMillis(f24922e1).getMillis();
    }

    /* renamed from: F */
    public final void m19752F(int i10, long j10) {
        int i11 = i10 - 1;
        if (i11 < 0) {
            super.requestFocus();
            return;
        }
        C9572b m19766V = m19766V(i11, j10);
        if (m19766V == null) {
            m19752F(i11, j10);
            return;
        }
        this.f24988f0.f43599i = false;
        this.f24988f0 = m19766V;
        m19766V.f43599i = true;
    }

    /* renamed from: G */
    public void m19753G() {
        this.f24946I.clear();
    }

    /* renamed from: H */
    public void m19754H() {
        if (this.f24971U0.m31285w() == 3) {
            return;
        }
        try {
            NSTIJKPlayerSmallEPG nSTIJKPlayerSmallEPG = this.f24957N0;
            if (nSTIJKPlayerSmallEPG != null) {
                if (nSTIJKPlayerSmallEPG.m19525T()) {
                    this.f24957N0.m19518M();
                } else {
                    this.f24957N0.m19539h0();
                    this.f24957N0.m19528W(true);
                    this.f24957N0.m19538g0();
                }
                IjkMediaPlayer.native_profileEnd();
            }
        } catch (Exception e10) {
        }
    }

    /* renamed from: J */
    public final void m19755J(Canvas canvas, int i10, Rect rect) {
        Rect rect2;
        Paint paint;
        int i11;
        Rect rect3;
        try {
            rect.left = getScrollX();
            int m19769Y = m19769Y(i10);
            rect.top = m19769Y;
            rect.right = rect.left + this.f25009q;
            rect.bottom = m19769Y + this.f25007p;
            String m40157f = this.f24970U.mo39386c(i10).m40157f();
            String m40158g = this.f24970U.mo39386c(i10).m40158g();
            if (i10 == this.f24963Q0) {
                this.f24997k.setColor(this.f25025y);
                int scrollX = getScrollX();
                int i12 = rect.top;
                rect2 = new Rect(scrollX, i12, rect.left + this.f25013s, this.f25007p + i12);
                paint = new Paint();
                paint.setStyle(Paint.Style.FILL_AND_STROKE);
                i11 = this.f25021w;
            } else {
                this.f24997k.setColor(this.f25025y);
                int i13 = rect.left;
                int i14 = rect.top;
                rect2 = new Rect(i13, i14, this.f25013s + i13, this.f25007p + i14);
                paint = new Paint();
                paint.setStyle(Paint.Style.FILL_AND_STROKE);
                i11 = this.f25015t;
            }
            paint.setColor(i11);
            canvas.drawRect(rect2, paint);
            if (this.f24946I.containsKey(m40157f)) {
                Bitmap bitmap = this.f24946I.get(m40157f);
                rect3 = m19765U(rect, bitmap);
                canvas.drawBitmap(bitmap, (Rect) null, rect3, (Paint) null);
            } else {
                int min = Math.min(this.f25007p, this.f25013s);
                rect3 = rect;
                if (!this.f24948J.containsKey(m40157f)) {
                    this.f24948J.put(m40157f, new C4046a(this, m40157f));
                    C9747b.m41055d(getContext(), m40157f, min, min, this.f24948J.get(m40157f));
                    rect3 = rect;
                }
            }
            this.f24997k.setColor(this.f25025y);
            int length = m40158g.length();
            String substring = m40158g.substring(0, this.f24997k.breakText(m40158g, true, this.f25011r, null));
            canvas.drawText(substring + (substring.length() < length ? ".." : ""), rect3.right + 10, rect3.centerY() + 10, this.f24997k);
        } catch (Exception e10) {
        }
    }

    /* renamed from: K */
    public final void m19756K(Canvas canvas, Rect rect) {
        int lastVisibleChannelPosition = getLastVisibleChannelPosition();
        for (int firstVisibleChannelPosition = getFirstVisibleChannelPosition(); firstVisibleChannelPosition <= lastVisibleChannelPosition; firstVisibleChannelPosition++) {
            m19755J(canvas, firstVisibleChannelPosition, rect);
        }
    }

    /* renamed from: L */
    public final void m19757L(Canvas canvas, int i10, C9572b c9572b, Rect rect) {
        Paint paint;
        int i11;
        Paint paint2;
        int i12;
        m19788q0(i10, c9572b.m40172f(), c9572b.m40169c(), rect);
        String m40173g = c9572b.m40173g();
        if (c9572b.m40175i()) {
            this.f24997k.setColor(this.f25021w);
            this.f24963Q0 = i10;
        } else {
            if (c9572b.m40174h(getTimeShiftMilliSeconds())) {
                paint = this.f24997k;
                i11 = this.f25019v;
            } else if (m40173g == null || m40173g.isEmpty() || !m40173g.equals(getContext().getResources().getString(2132018208))) {
                paint = this.f24997k;
                i11 = this.f25017u;
            } else {
                paint = this.f24997k;
                i11 = this.f25023x;
            }
            paint.setColor(i11);
        }
        canvas.drawRect(rect, this.f24997k);
        int i13 = rect.left;
        int i14 = this.f25005o;
        rect.left = i13 + i14 + 16;
        rect.right -= i14;
        this.f24997k.setColor(this.f25025y);
        if (this.f24971U0.m31288z().equals(C5251a.f30065s0)) {
            paint2 = this.f24997k;
            i12 = this.f25027z + 6;
        } else {
            paint2 = this.f24997k;
            i12 = this.f25027z;
        }
        paint2.setTextSize(i12);
        this.f24997k.getTextBounds(c9572b.m40173g(), 0, c9572b.m40173g().length(), this.f24995j);
        int i15 = rect.top;
        rect.top = i15 + ((rect.bottom - i15) / 2) + (this.f24995j.height() / 2);
        canvas.drawText(m40173g.substring(0, this.f24997k.breakText(m40173g, true, rect.right - rect.left, null)), rect.left, rect.top, this.f24997k);
    }

    /* renamed from: M */
    public final void m19758M(Canvas canvas, Rect rect) {
        int lastVisibleChannelPosition = getLastVisibleChannelPosition();
        for (int firstVisibleChannelPosition = getFirstVisibleChannelPosition(); firstVisibleChannelPosition <= lastVisibleChannelPosition; firstVisibleChannelPosition++) {
            this.f24991h.left = getScrollX() + this.f25013s + this.f25003n;
            this.f24991h.top = m19769Y(firstVisibleChannelPosition);
            this.f24991h.right = getScrollX() + getWidth();
            Rect rect2 = this.f24991h;
            rect2.bottom = rect2.top + this.f25007p;
            canvas.save();
            canvas.clipRect(this.f24991h);
            boolean z10 = false;
            for (C9572b c9572b : this.f24970U.mo39387d(firstVisibleChannelPosition)) {
                if (!m19775d0(c9572b.m40172f(), c9572b.m40169c())) {
                    if (z10) {
                        break;
                    }
                } else {
                    m19757L(canvas, firstVisibleChannelPosition, c9572b, rect);
                    z10 = true;
                }
            }
            canvas.restore();
        }
    }

    /* renamed from: N */
    public final void m19759N(Canvas canvas, Rect rect) {
        if (Math.abs(getXPositionStart() - getScrollX()) > getWidth() / 3) {
            Rect m19750D = m19750D();
            this.f24997k.setColor(this.f24932B);
            int i10 = m19750D.right;
            int i11 = this.f24938E;
            canvas.drawCircle(i10 - (i11 / 2), m19750D.bottom - (i11 / 2), Math.min(m19750D.width(), m19750D.height()) / 2, this.f24997k);
            int i12 = m19750D.left;
            int i13 = this.f24940F;
            m19750D.left = i12 + i13;
            m19750D.right -= i13;
            m19750D.top += i13;
            m19750D.bottom -= i13;
            canvas.drawBitmap(this.f24942G, (Rect) null, m19750D, this.f24997k);
        }
    }

    /* renamed from: O */
    public final void m19760O(Canvas canvas, Rect rect) {
        long currentTimeMillis = System.currentTimeMillis() + getTimeShiftMilliSeconds();
        if (m19789r0(currentTimeMillis)) {
            rect.left = m19770Z(currentTimeMillis);
            int scrollY = getScrollY();
            rect.top = scrollY;
            rect.right = rect.left + this.f24930A;
            rect.bottom = scrollY + getHeight();
            this.f24997k.setColor(this.f24932B);
            canvas.drawRect(rect, this.f24997k);
            if (this.f24965R0) {
                return;
            }
            this.f24965R0 = true;
            scrollTo(this.f24971U0.m31288z().equals(C5251a.f30065s0) ? ((m19770Z(currentTimeMillis) - this.f25013s) + this.f25003n) - 200 : ((m19770Z(currentTimeMillis) - this.f25013s) + this.f25003n) - 100, 0);
        }
    }

    /* renamed from: P */
    public final void m19761P(Canvas canvas, Rect rect) {
        rect.left = getScrollX() + this.f25013s + this.f25003n;
        rect.top = getScrollY();
        rect.right = rect.left + getWidth();
        rect.bottom = rect.top + this.f24934C;
        this.f24991h.left = getScrollX() + this.f25013s + this.f25003n;
        this.f24991h.top = getScrollY();
        this.f24991h.right = getScrollX() + getWidth();
        Rect rect2 = this.f24991h;
        rect2.bottom = rect2.top + this.f24934C;
        canvas.save();
        canvas.clipRect(this.f24991h);
        this.f24997k.setColor(this.f25015t);
        canvas.drawRect(rect, this.f24997k);
        this.f24997k.setColor(this.f25025y);
        this.f24997k.setTextSize(this.f24936D);
        for (int i10 = 0; i10 < f24924g1 / 1800000; i10++) {
            long j10 = (((this.f24960P + (1800000 * i10)) + 900000) / 1800000) * 1800000;
            String m41053b = C9747b.m41053b(this.f25004n0, j10);
            float m19770Z = m19770Z(j10);
            int i11 = rect.top;
            canvas.drawText(m41053b, m19770Z, i11 + ((rect.bottom - i11) / 2) + (this.f24936D / 2), this.f24997k);
        }
        canvas.restore();
        m19763R(canvas, rect);
        m19762Q(canvas, rect);
    }

    /* renamed from: Q */
    public final void m19762Q(Canvas canvas, Rect rect) {
        rect.left = getScrollX();
        rect.top = getScrollY() + this.f24934C;
        rect.right = rect.left + getWidth();
        rect.bottom = rect.top + this.f25003n;
        this.f24997k.setColor(this.f24944H);
        canvas.drawRect(rect, this.f24997k);
    }

    /* renamed from: R */
    public final void m19763R(Canvas canvas, Rect rect) {
        rect.left = getScrollX();
        int scrollY = getScrollY();
        rect.top = scrollY;
        rect.right = rect.left + this.f25013s;
        rect.bottom = scrollY + this.f24934C;
        this.f24997k.setColor(this.f25015t);
        this.f24997k.setTextAlign(Paint.Align.CENTER);
        canvas.drawRect(rect, this.f24997k);
        this.f24997k.setColor(this.f25025y);
        this.f24997k.setTextSize(this.f24936D);
        String m41052a = C9747b.m41052a(this.f24960P);
        int i10 = rect.left;
        float f10 = i10 + ((rect.right - i10) / 2);
        int i11 = rect.top;
        canvas.drawText(m41052a, f10, i11 + ((rect.bottom - i11) / 2) + (this.f24936D / 2), this.f24997k);
        this.f24997k.setTextAlign(Paint.Align.LEFT);
    }

    /* renamed from: T */
    public final int m19764T(int i10) {
        int i11 = this.f24934C;
        int i12 = this.f25003n;
        int i13 = ((i10 - i11) + i12) / (this.f25007p + i12);
        if (this.f24970U.mo39389f() == 0) {
            i13 = -1;
        }
        return i13;
    }

    /* renamed from: U */
    public final Rect m19765U(Rect rect, Bitmap bitmap) {
        int i10 = rect.left;
        int i11 = this.f25005o;
        rect.left = i10 + i11;
        rect.top += i11;
        rect.right -= i11;
        rect.bottom -= i11;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        float f10 = height / width;
        int i12 = rect.right;
        int i13 = rect.left;
        int i14 = i12 - i13;
        int i15 = rect.bottom;
        int i16 = rect.top;
        int i17 = i15 - i16;
        if (width > height) {
            int i18 = ((int) (i17 - (i14 * f10))) / 2;
            rect.top = i16 + i18;
            rect.bottom = i15 - i18;
        } else if (width <= height) {
            int i19 = ((int) (i14 - (i17 / f10))) / 2;
            rect.left = i13 + i19;
            rect.right = i12 - i19;
        }
        return rect;
    }

    /* renamed from: V */
    public final C9572b m19766V(int i10, long j10) {
        List<C9572b> mo39387d = this.f24970U.mo39387d(i10);
        if (mo39387d == null) {
            return null;
        }
        for (int i11 = 0; i11 < mo39387d.size(); i11++) {
            C9572b c9572b = mo39387d.get(i11);
            if (c9572b.m40172f() <= j10 && c9572b.m40169c() >= j10) {
                return c9572b;
            }
        }
        return null;
    }

    /* renamed from: W */
    public final int m19767W(int i10, long j10) {
        List<C9572b> mo39387d = this.f24970U.mo39387d(i10);
        if (mo39387d == null) {
            return -1;
        }
        for (int i11 = 0; i11 < mo39387d.size(); i11++) {
            C9572b c9572b = mo39387d.get(i11);
            if (c9572b.m40172f() <= j10 && c9572b.m40169c() >= j10) {
                return i11;
            }
        }
        return -1;
    }

    /* renamed from: X */
    public final long m19768X(int i10) {
        return (i10 * this.f24956N) + this.f24958O;
    }

    /* renamed from: Y */
    public final int m19769Y(int i10) {
        int i11 = this.f25007p;
        int i12 = this.f25003n;
        return (i10 * (i11 + i12)) + i12 + this.f24934C;
    }

    /* renamed from: Z */
    public final int m19770Z(long j10) {
        int i10 = (int) ((j10 - this.f24958O) / this.f24956N);
        int i11 = this.f25003n;
        return i10 + i11 + this.f25013s + i11;
    }

    /* renamed from: a */
    public void m19771a(Context context, String str, int i10, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        try {
            this.f24980b = new DatabaseHandler(context);
            this.f24982c = new LiveStreamDBHandler(context);
            View inflate = ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(2131624189, (RelativeLayout) findViewById(2131428976));
            PopupWindow popupWindow = new PopupWindow(context);
            this.f25002m0 = popupWindow;
            popupWindow.setContentView(inflate);
            this.f25002m0.setWidth(-1);
            this.f25002m0.setHeight(-1);
            this.f25002m0.setFocusable(true);
            this.f25002m0.setBackgroundDrawable(new BitmapDrawable());
            this.f25002m0.showAtLocation(inflate, 17, 0, 0);
            RelativeLayout relativeLayout = (RelativeLayout) inflate.findViewById(2131428467);
            RelativeLayout relativeLayout2 = (RelativeLayout) inflate.findViewById(2131428442);
            RelativeLayout relativeLayout3 = (RelativeLayout) inflate.findViewById(2131428443);
            RelativeLayout relativeLayout4 = (RelativeLayout) inflate.findViewById(2131428361);
            if (SharepreferenceDBHandler.m15373f(context).equals("m3u")) {
                ArrayList<FavouriteM3UModel> m15159E0 = this.f24982c.m15159E0(str7, SharepreferenceDBHandler.m15337A(context));
                if (m15159E0 == null || m15159E0.size() <= 0) {
                    relativeLayout2.setVisibility(0);
                } else {
                    relativeLayout3.setVisibility(0);
                }
            } else {
                ArrayList<FavouriteDBModel> m15112o = this.f24980b.m15112o(i10, str8, "live", SharepreferenceDBHandler.m15337A(context));
                if (m15112o == null || m15112o.size() <= 0) {
                    relativeLayout2.setVisibility(0);
                } else {
                    relativeLayout3.setVisibility(0);
                }
            }
            relativeLayout.setOnClickListener(new ViewOnClickListenerC4047b(this, str, i10, str2, str3, str4, str5, str6, str7));
            relativeLayout2.setOnClickListener(new ViewOnClickListenerC4048c(this, context, str8, str7, str3, i10, str2));
            relativeLayout3.setOnClickListener(new ViewOnClickListenerC4049d(this, context, str7, str3, str8, i10));
            relativeLayout4.setOnClickListener(new ViewOnClickListenerC4050e(this));
        } catch (Exception e10) {
        }
    }

    /* renamed from: a0 */
    public final void m19772a0(C9572b c9572b) {
    }

    /* renamed from: b0 */
    public final void m19773b0(C9572b c9572b) {
    }

    /* renamed from: c0 */
    public void m19774c0() {
        new C4051f(this, null).m19796c();
    }

    /* renamed from: d0 */
    public final boolean m19775d0(long j10, long j11) {
        long j12 = this.f24960P;
        return (j10 >= j12 && j10 <= this.f24962Q) || (j11 >= j12 && j11 <= this.f24962Q) || (j10 <= j12 && j11 >= this.f24962Q);
    }

    @Override // android.view.View
    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return false;
    }

    /* renamed from: e0 */
    public final void m19776e0(C9572b c9572b) {
        SharedPreferences sharedPreferences = this.f25004n0.getSharedPreferences("timeFormat", 0);
        this.f24989g = sharedPreferences;
        String string = sharedPreferences.getString("timeFormat", C5251a.f30053m0);
        Locale locale = Locale.US;
        this.f24986e = new SimpleDateFormat(string, locale);
        this.f24987f = new SimpleDateFormat(string, locale);
        this.f24990g0.setText(c9572b.m40173g());
        this.f24994i0.setText(this.f24986e.format(Long.valueOf(c9572b.m40172f())) + " - " + this.f24987f.format(Long.valueOf(c9572b.m40169c())));
        this.f24992h0.setText(c9572b.m40168b());
        m19779h0(c9572b);
    }

    /* renamed from: f0 */
    public final InterfaceC9345b m19777f0(InterfaceC9345b interfaceC9345b, InterfaceC9345b interfaceC9345b2) {
        InterfaceC9345b interfaceC9345b3 = interfaceC9345b;
        if (interfaceC9345b == null) {
            try {
                interfaceC9345b3 = new C9746a(C4803d0.m24364g());
            } catch (Throwable th2) {
                throw new RuntimeException("Could not merge EPG data: " + th2.getClass().getSimpleName() + " " + th2.getMessage(), th2);
            }
        }
        if (interfaceC9345b2 != null) {
            for (int i10 = 0; i10 < interfaceC9345b2.mo39389f(); i10++) {
                C9571a mo39386c = interfaceC9345b2.mo39386c(i10);
                C9571a mo39388e = interfaceC9345b3.mo39388e(mo39386c.m40158g(), mo39386c.m40157f(), mo39386c.m40163l(), mo39386c.m40160i(), mo39386c.m40155d(), mo39386c.m40153b(), mo39386c.m40164m());
                for (int i11 = 0; i11 < mo39386c.m40156e().size(); i11++) {
                    mo39388e.m40152a(mo39386c.m40156e().get(i11));
                }
            }
        }
        return interfaceC9345b3;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0097  */
    /* renamed from: g0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m19778g0(wf.C9572b r8, boolean r9, java.lang.String r10) {
        /*
            Method dump skipped, instructions count: 556
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.maxdigitall.maxdigitaliptvbox.view.utility.epg.EPG.m19778g0(wf.b, boolean, java.lang.String):void");
    }

    public String getExtensionType() {
        return this.f25012r0;
    }

    public int getOpenedStreamID() {
        return this.f25008p0;
    }

    public String getOpenedVideoUrl() {
        return this.f25010q0;
    }

    public C9572b getSelectedEvent() {
        return this.f24988f0;
    }

    public int getTimeShiftMilliSeconds() {
        SharedPreferences sharedPreferences = getContext().getSharedPreferences("loginPrefs", 0);
        this.f25000l0 = sharedPreferences;
        return C5255e.m26255v(sharedPreferences.getString("selectedEPGShift", C5251a.f30049k0));
    }

    public String getVideoPathUrl() {
        return this.f24939E0;
    }

    /* renamed from: h0 */
    public final void m19779h0(C9572b c9572b) {
        int i10;
        NSTIJKPlayerSmallEPG nSTIJKPlayerSmallEPG;
        NSTIJKPlayerSmallEPG nSTIJKPlayerSmallEPG2;
        NSTIJKPlayerSmallEPG nSTIJKPlayerSmallEPG3;
        try {
            if (c9572b.m40167a() == null || c9572b.m40167a().m40164m() == null || c9572b.m40167a().m40164m().equals("")) {
                if (c9572b.m40167a() == null || c9572b.m40167a().m40163l() == null) {
                    return;
                }
                try {
                    i10 = Integer.parseInt(c9572b.m40167a().m40163l());
                } catch (NumberFormatException e10) {
                    i10 = -1;
                }
                if (getOpenedStreamID() != 0) {
                    return;
                }
                m19754H();
                setOpenedStreamID(i10);
                if (this.f24971U0.m31285w() == 3 || (nSTIJKPlayerSmallEPG = this.f24957N0) == null) {
                    return;
                }
                nSTIJKPlayerSmallEPG.m19533b0(Uri.parse(getVideoPathUrl() + i10 + getExtensionType()), true, "");
                nSTIJKPlayerSmallEPG2 = this.f24957N0;
                nSTIJKPlayerSmallEPG2.f24636K = 0;
            } else {
                if (getOpenedVideoUrl() == null || !getOpenedVideoUrl().equals("")) {
                    return;
                }
                m19754H();
                setOpenedVideoUrl(c9572b.m40167a().m40164m());
                if (this.f24971U0.m31285w() == 3 || (nSTIJKPlayerSmallEPG3 = this.f24957N0) == null) {
                    return;
                }
                nSTIJKPlayerSmallEPG3.m19533b0(Uri.parse(c9572b.m40167a().m40164m()), true, "");
                nSTIJKPlayerSmallEPG2 = this.f24957N0;
                nSTIJKPlayerSmallEPG2.f24636K = 0;
            }
            nSTIJKPlayerSmallEPG2.f24640M = false;
            nSTIJKPlayerSmallEPG2.start();
        } catch (Exception e11) {
        }
    }

    /* renamed from: i0 */
    public void m19780i0(C9572b c9572b, boolean z10, RelativeLayout relativeLayout, EPG epg) {
        Boolean bool;
        C9572b mo39384a;
        InterfaceC9345b interfaceC9345b = this.f24970U;
        if (interfaceC9345b == null || !interfaceC9345b.mo39385b()) {
            return;
        }
        m19784m0();
        m19747A();
        m19793z();
        Boolean bool2 = Boolean.FALSE;
        Boolean bool3 = bool2;
        if (!this.f24961P0.booleanValue()) {
            if (c9572b != null) {
                this.f24961P0 = Boolean.TRUE;
                mo39384a = c9572b;
                bool = bool2;
            } else {
                int i10 = 0;
                if (m19767W(0, m19768X(getXPositionStart() + (getWidth() / 2))) != -1) {
                    bool = Boolean.TRUE;
                    this.f24961P0 = bool;
                    mo39384a = this.f24970U.mo39384a(0, m19767W(0, System.currentTimeMillis() + getTimeShiftMilliSeconds()));
                } else {
                    bool3 = bool2;
                    if (this.f24970U != null) {
                        while (true) {
                            bool3 = bool2;
                            if (i10 >= this.f24970U.mo39389f()) {
                                break;
                            }
                            List<C9572b> m40156e = this.f24970U.mo39386c(i10).m40156e();
                            if (m40156e == null || m40156e.size() == 0) {
                                i10++;
                            } else {
                                bool = Boolean.TRUE;
                                int m40154c = this.f24970U.mo39386c(i10).m40154c();
                                int m19767W = m19767W(m40154c, m19768X(getXPositionStart() + (getWidth() / 2)));
                                bool3 = bool;
                                if (m19767W != -1) {
                                    this.f24961P0 = bool;
                                    mo39384a = this.f24970U.mo39384a(m40154c, m19767W);
                                }
                            }
                        }
                    }
                }
            }
            m19786o0(mo39384a, z10);
            bool3 = bool;
        }
        if (bool3.equals(Boolean.TRUE) && relativeLayout != null) {
            relativeLayout.setFocusable(true);
            relativeLayout.setNextFocusDownId(2131427898);
        }
        m19781j0();
    }

    /* renamed from: j0 */
    public void m19781j0() {
        invalidate();
        requestLayout();
    }

    /* renamed from: k0 */
    public final void m19782k0(Context context, String str, int i10, String str2) {
        DatabaseHandler databaseHandler;
        if (context == null || (databaseHandler = this.f24980b) == null) {
            return;
        }
        databaseHandler.m15115t(i10, str, "live", str2, SharepreferenceDBHandler.m15337A(context));
        C5255e.m26241k0(context, str2 + context.getResources().getString(2132018465));
    }

    /* renamed from: l0 */
    public final void m19783l0(Context context, String str, String str2) {
        LiveStreamDBHandler liveStreamDBHandler;
        if (context == null || (liveStreamDBHandler = this.f24982c) == null) {
            return;
        }
        liveStreamDBHandler.m15188R0(str, SharepreferenceDBHandler.m15337A(context));
        C5255e.m26241k0(context, str2 + context.getResources().getString(2132018465));
    }

    /* renamed from: m0 */
    public final void m19784m0() {
        this.f24956N = m19748B();
        this.f24958O = m19751E();
        this.f24960P = m19768X(getWidth());
        this.f24962Q = m19768X(getWidth());
    }

    /* renamed from: n0 */
    public void m19785n0() {
        long currentTimeMillis = System.currentTimeMillis();
        long timeShiftMilliSeconds = getTimeShiftMilliSeconds();
        boolean equals = this.f24971U0.m31288z().equals(C5251a.f30065s0);
        int m19770Z = (m19770Z(currentTimeMillis + timeShiftMilliSeconds) - this.f25013s) + this.f25003n;
        scrollTo(equals ? m19770Z - 200 : m19770Z - 100, getScrollY());
    }

    /* renamed from: o0 */
    public void m19786o0(C9572b c9572b, boolean z10) {
        C9572b c9572b2 = this.f24988f0;
        if (c9572b2 != null) {
            c9572b2.f43599i = false;
        }
        c9572b.f43599i = true;
        this.f24988f0 = c9572b;
        m19778g0(c9572b, z10, "vertical");
        m19776e0(c9572b);
        m19781j0();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        InterfaceC9345b interfaceC9345b = this.f24970U;
        if (interfaceC9345b == null || !interfaceC9345b.mo39385b()) {
            return;
        }
        this.f24960P = m19768X(getScrollX());
        this.f24962Q = m19768X(getScrollX() + getWidth());
        Rect rect = this.f24993i;
        rect.left = getScrollX();
        rect.top = getScrollY();
        rect.right = rect.left + getWidth();
        rect.bottom = rect.top + getHeight();
        m19758M(canvas, rect);
        m19756K(canvas, rect);
        m19761P(canvas, rect);
        m19760O(canvas, rect);
        m19759N(canvas, rect);
        if (this.f24999l.computeScrollOffset()) {
            scrollTo(this.f24999l.getCurrX(), this.f24999l.getCurrY());
            if (this.f24965R0) {
                return;
            }
            this.f24965R0 = true;
            long currentTimeMillis = System.currentTimeMillis() + getTimeShiftMilliSeconds();
            scrollTo(this.f24971U0.m31288z().equals(C5251a.f30065s0) ? ((m19770Z(currentTimeMillis) - this.f25013s) + this.f25003n) - 200 : ((m19770Z(currentTimeMillis) - this.f25013s) + this.f25003n) - 100, 0);
        }
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        int i11;
        C9572b m19766V;
        this.f24960P = m19768X(getScrollX());
        this.f24962Q = m19768X(getScrollX() + getWidth());
        if (keyEvent.getKeyCode() == 4 || this.f24988f0 == null) {
            return true;
        }
        String str = "horizontal";
        if (keyEvent.getKeyCode() == 22) {
            if (this.f24988f0.m40170d() != null) {
                C9572b c9572b = this.f24988f0;
                c9572b.f43599i = false;
                m19766V = c9572b.m40170d();
                this.f24988f0 = m19766V;
                m19766V.f43599i = true;
            }
            m19776e0(this.f24988f0);
            m19781j0();
            return true;
        }
        if (keyEvent.getKeyCode() == 21) {
            if (this.f24988f0.m40171e() != null) {
                C9572b c9572b2 = this.f24988f0;
                c9572b2.f43599i = false;
                m19766V = c9572b2.m40171e();
                this.f24988f0 = m19766V;
                m19766V.f43599i = true;
            }
            m19776e0(this.f24988f0);
            m19781j0();
            return true;
        }
        str = "vertical";
        if (keyEvent.getKeyCode() == 19) {
            if (this.f24988f0.m40167a().m40162k() == null || this.f24988f0.m40167a().m40162k().m40154c() == this.f24974W.m40154c()) {
                super.requestFocus();
                super.requestFocusFromTouch();
            } else {
                long max = (Math.max(this.f24960P, this.f24988f0.m40172f()) + Math.min(this.f24962Q, this.f24988f0.m40169c())) / 2;
                C9572b m19766V2 = m19766V(this.f24988f0.m40167a().m40162k().m40154c(), max);
                if (m19766V2 != null) {
                    this.f24988f0.f43599i = false;
                    this.f24988f0 = m19766V2;
                    m19766V2.f43599i = true;
                } else {
                    m19752F(this.f24988f0.m40167a().m40162k().m40154c(), max);
                }
                m19766V = this.f24988f0;
            }
        } else if (keyEvent.getKeyCode() == 20) {
            if (this.f24988f0.m40167a().m40159h() != null) {
                m19766V = m19766V(this.f24988f0.m40167a().m40159h().m40154c(), (Math.max(this.f24960P, this.f24988f0.m40172f()) + Math.min(this.f24962Q, this.f24988f0.m40169c())) / 2);
                if (m19766V == null) {
                    if (this.f24967S0 != 1) {
                        return true;
                    }
                    new C4051f(this, null).m19797d();
                    return true;
                }
                this.f24988f0.f43599i = false;
                this.f24988f0 = m19766V;
                m19766V.f43599i = true;
            }
        } else if (keyEvent.getKeyCode() == 103 || keyEvent.getKeyCode() == 90) {
            m19772a0(this.f24988f0);
        } else if (keyEvent.getKeyCode() == 102 || keyEvent.getKeyCode() == 89) {
            m19773b0(this.f24988f0);
        } else if (keyEvent.getKeyCode() == 66 || keyEvent.getKeyCode() == 23) {
            Context context = getContext();
            getContext();
            SharedPreferences sharedPreferences = context.getSharedPreferences("selectedPlayer", 0);
            this.f24998k0 = sharedPreferences;
            String string = sharedPreferences.getString("selectedPlayer", "");
            String m40161j = this.f24988f0.m40167a().m40161j();
            String m40153b = this.f24988f0.m40167a().m40153b();
            try {
                i11 = Integer.parseInt(this.f24988f0.m40167a().m40163l());
            } catch (NumberFormatException e10) {
                i11 = -1;
            }
            m19771a(getContext(), string, i11, this.f24988f0.m40167a().m40160i(), this.f24988f0.m40167a().m40158g(), this.f24988f0.m40167a().m40155d(), this.f24988f0.m40167a().m40157f(), m40161j, this.f24988f0.m40167a().m40164m(), m40153b);
        }
        m19776e0(this.f24988f0);
        m19781j0();
        return true;
        m19778g0(m19766V, true, str);
        m19776e0(this.f24988f0);
        m19781j0();
        return true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i10, KeyEvent keyEvent) {
        return super.onKeyUp(i10, keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C9573c)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C9573c c9573c = (C9573c) parcelable;
        super.onRestoreInstanceState(c9573c.getSuperState());
        this.f24988f0 = c9573c.m40178b();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        C9573c c9573c = new C9573c(super.onSaveInstanceState());
        c9573c.m40179c(this.f24988f0);
        return c9573c;
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        m19780i0(this.f24988f0, false, null, null);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f25001m.onTouchEvent(motionEvent);
    }

    /* renamed from: p0 */
    public void m19787p0(Activity activity, NSTIJKPlayerSmallEPG nSTIJKPlayerSmallEPG) {
        this.f24959O0 = activity;
        this.f24957N0 = nSTIJKPlayerSmallEPG;
    }

    /* renamed from: q0 */
    public final void m19788q0(int i10, long j10, long j11, Rect rect) {
        rect.left = m19770Z(j10);
        rect.top = m19769Y(i10);
        rect.right = m19770Z(j11) - this.f25003n;
        rect.bottom = rect.top + this.f25007p;
    }

    /* renamed from: r0 */
    public final boolean m19789r0(long j10) {
        return j10 >= this.f24960P && j10 < this.f24962Q;
    }

    public void setActivity(Activity activity) {
        this.f24959O0 = activity;
    }

    public void setCurrentEventDescriptionTextView(TextView textView) {
        this.f24992h0 = textView;
    }

    public void setCurrentEventTextView(TextView textView) {
        this.f24990g0 = textView;
    }

    public void setCurrentEventTimeTextView(TextView textView) {
        this.f24994i0 = textView;
    }

    public void setEPGClickListener(InterfaceC9344a interfaceC9344a) {
        this.f24950K = interfaceC9344a;
    }

    public void setEPGData(InterfaceC9345b interfaceC9345b) {
        try {
            InterfaceC9345b m19777f0 = m19777f0(this.f24970U, interfaceC9345b);
            this.f24970U = m19777f0;
            if (m19777f0 == null || m19777f0.mo39389f() <= 0) {
                return;
            }
            this.f24972V = this.f24970U.mo39386c(0);
            InterfaceC9345b interfaceC9345b2 = this.f24970U;
            this.f24974W = interfaceC9345b2.mo39386c(interfaceC9345b2.mo39389f() - 1);
        } catch (Exception e10) {
        }
    }

    public void setExtensionType(String str) {
        this.f25012r0 = str;
    }

    public void setLoader(ProgressBar progressBar) {
        this.f25006o0 = progressBar;
    }

    public void setOpenedStreamID(int i10) {
        this.f25008p0 = i10;
    }

    public void setOpenedVideoUrl(String str) {
        this.f25010q0 = str;
    }

    public void setOrientation(int i10) {
        this.f24996j0 = i10;
        DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
        f24925h1 = displayMetrics.widthPixels;
        f24926i1 = displayMetrics.heightPixels;
    }

    public void setVideoPathUrl(String str) {
        this.f24939E0 = str;
    }

    public void setVideoStatus(LinearLayout linearLayout) {
        this.f24933B0 = linearLayout;
    }

    public void setVideoStatusText(TextView textView) {
        this.f24935C0 = textView;
    }

    public void setVideoView(SurfaceView surfaceView) {
        this.f24953L0 = surfaceView;
    }

    /* renamed from: w */
    public void m19790w(Context context, String str, int i10, String str2, String str3) {
        if (context == null || this.f24980b == null) {
            return;
        }
        FavouriteDBModel favouriteDBModel = new FavouriteDBModel();
        favouriteDBModel.m14767h(str);
        favouriteDBModel.m14772m(i10);
        favouriteDBModel.m14771l(str3);
        favouriteDBModel.m14770k(str2);
        favouriteDBModel.m14774o(SharepreferenceDBHandler.m15337A(context));
        this.f24980b.m15111l(favouriteDBModel, "live");
        C5255e.m26241k0(context, str2 + context.getResources().getString(2132017271));
    }

    /* renamed from: x */
    public final void m19791x(Context context, String str, String str2, String str3) {
        if (context == null || this.f24982c == null) {
            return;
        }
        FavouriteM3UModel favouriteM3UModel = new FavouriteM3UModel();
        favouriteM3UModel.m14782h(str2);
        favouriteM3UModel.m14783i(SharepreferenceDBHandler.m15337A(context));
        favouriteM3UModel.m14781g(str3);
        favouriteM3UModel.m14779e(str);
        this.f24982c.m15156D0(favouriteM3UModel);
        C5255e.m26241k0(context, str3 + context.getResources().getString(2132017271));
    }

    /* renamed from: y */
    public final Rect m19792y() {
        this.f24995j.top = this.f24934C;
        int mo39389f = this.f24970U.mo39389f() * (this.f25007p + this.f25003n);
        Rect rect = this.f24995j;
        if (mo39389f >= getHeight()) {
            mo39389f = getHeight();
        }
        rect.bottom = mo39389f;
        Rect rect2 = this.f24995j;
        rect2.left = 0;
        rect2.right = this.f25013s;
        return rect2;
    }

    /* renamed from: z */
    public final void m19793z() {
        int i10;
        SharedPreferences sharedPreferences = this.f25004n0.getSharedPreferences("auto_start", 0);
        this.f24966S = sharedPreferences;
        boolean z10 = sharedPreferences.getBoolean("full_epg", false);
        this.f24964R = z10;
        if (z10) {
            i10 = 86400000;
            f24923f1 = DateTimeConstants.MILLIS_PER_DAY;
        } else {
            f24923f1 = 14400000;
            i10 = 3600000;
        }
        f24922e1 = i10;
        this.f24952L = (int) (((f24922e1 + f24923f1) - f24924g1) / this.f24956N);
    }
}
