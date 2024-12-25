package androidx.mediarouter.app;

import android.R;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaControllerCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Interpolator;
import android.view.animation.Transformation;
import android.view.animation.TranslateAnimation;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.appcompat.app.DialogC0242a;
import androidx.mediarouter.app.OverlayListView;
import com.amazonaws.mobileconnectors.p044s3.transferutility.TransferTable;
import java.io.BufferedInputStream;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.apache.http.impl.auth.NTLMEngineImpl;
import p192l1.C5648d;
import p192l1.C5650f;
import p192l1.C5651g;
import p192l1.C5653i;
import p192l1.C5654j;
import p208m1.C5900i;
import p208m1.C5901j;
import p221n0.C6611c;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/mediarouter/app/c.class
 */
/* renamed from: androidx.mediarouter.app.c */
/* loaded from: combined.jar:classes1.jar:androidx/mediarouter/app/c.class */
public class DialogC0606c extends DialogC0242a {

    /* renamed from: w0 */
    public static final boolean f3904w0 = Log.isLoggable("MediaRouteCtrlDialog", 3);

    /* renamed from: x0 */
    public static final int f3905x0 = (int) TimeUnit.SECONDS.toMillis(30);

    /* renamed from: A */
    public final boolean f3906A;

    /* renamed from: B */
    public LinearLayout f3907B;

    /* renamed from: C */
    public RelativeLayout f3908C;

    /* renamed from: D */
    public LinearLayout f3909D;

    /* renamed from: E */
    public View f3910E;

    /* renamed from: F */
    public OverlayListView f3911F;

    /* renamed from: G */
    public r f3912G;

    /* renamed from: H */
    public List<C5901j.h> f3913H;

    /* renamed from: I */
    public Set<C5901j.h> f3914I;

    /* renamed from: J */
    public Set<C5901j.h> f3915J;

    /* renamed from: K */
    public Set<C5901j.h> f3916K;

    /* renamed from: L */
    public SeekBar f3917L;

    /* renamed from: M */
    public q f3918M;

    /* renamed from: N */
    public C5901j.h f3919N;

    /* renamed from: O */
    public int f3920O;

    /* renamed from: P */
    public int f3921P;

    /* renamed from: Q */
    public int f3922Q;

    /* renamed from: R */
    public final int f3923R;

    /* renamed from: S */
    public Map<C5901j.h, SeekBar> f3924S;

    /* renamed from: T */
    public MediaControllerCompat f3925T;

    /* renamed from: U */
    public o f3926U;

    /* renamed from: V */
    public PlaybackStateCompat f3927V;

    /* renamed from: W */
    public MediaDescriptionCompat f3928W;

    /* renamed from: X */
    public n f3929X;

    /* renamed from: Y */
    public Bitmap f3930Y;

    /* renamed from: Z */
    public Uri f3931Z;

    /* renamed from: e */
    public final C5901j f3932e;

    /* renamed from: f */
    public final p f3933f;

    /* renamed from: f0 */
    public boolean f3934f0;

    /* renamed from: g */
    public final C5901j.h f3935g;

    /* renamed from: g0 */
    public Bitmap f3936g0;

    /* renamed from: h */
    public Context f3937h;

    /* renamed from: h0 */
    public int f3938h0;

    /* renamed from: i */
    public boolean f3939i;

    /* renamed from: i0 */
    public boolean f3940i0;

    /* renamed from: j */
    public boolean f3941j;

    /* renamed from: j0 */
    public boolean f3942j0;

    /* renamed from: k */
    public int f3943k;

    /* renamed from: k0 */
    public boolean f3944k0;

    /* renamed from: l */
    public View f3945l;

    /* renamed from: l0 */
    public boolean f3946l0;

    /* renamed from: m */
    public Button f3947m;

    /* renamed from: m0 */
    public boolean f3948m0;

    /* renamed from: n */
    public Button f3949n;

    /* renamed from: n0 */
    public int f3950n0;

    /* renamed from: o */
    public ImageButton f3951o;

    /* renamed from: o0 */
    public int f3952o0;

    /* renamed from: p */
    public ImageButton f3953p;

    /* renamed from: p0 */
    public int f3954p0;

    /* renamed from: q */
    public MediaRouteExpandCollapseButton f3955q;

    /* renamed from: q0 */
    public Interpolator f3956q0;

    /* renamed from: r */
    public FrameLayout f3957r;

    /* renamed from: r0 */
    public Interpolator f3958r0;

    /* renamed from: s */
    public LinearLayout f3959s;

    /* renamed from: s0 */
    public Interpolator f3960s0;

    /* renamed from: t */
    public FrameLayout f3961t;

    /* renamed from: t0 */
    public Interpolator f3962t0;

    /* renamed from: u */
    public FrameLayout f3963u;

    /* renamed from: u0 */
    public final AccessibilityManager f3964u0;

    /* renamed from: v */
    public ImageView f3965v;

    /* renamed from: v0 */
    public Runnable f3966v0;

    /* renamed from: w */
    public TextView f3967w;

    /* renamed from: x */
    public TextView f3968x;

    /* renamed from: y */
    public TextView f3969y;

    /* renamed from: z */
    public boolean f3970z;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/mediarouter/app/c$a.class
     */
    /* renamed from: androidx.mediarouter.app.c$a */
    /* loaded from: combined.jar:classes1.jar:androidx/mediarouter/app/c$a.class */
    public class a implements OverlayListView.C0603a.a {

        /* renamed from: a */
        public final C5901j.h f3971a;

        /* renamed from: b */
        public final DialogC0606c f3972b;

        public a(DialogC0606c dialogC0606c, C5901j.h hVar) {
            this.f3972b = dialogC0606c;
            this.f3971a = hVar;
        }

        @Override // androidx.mediarouter.app.OverlayListView.C0603a.a
        /* renamed from: a */
        public void mo3273a() {
            this.f3972b.f3916K.remove(this.f3971a);
            this.f3972b.f3912G.notifyDataSetChanged();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/mediarouter/app/c$b.class
     */
    /* renamed from: androidx.mediarouter.app.c$b */
    /* loaded from: combined.jar:classes1.jar:androidx/mediarouter/app/c$b.class */
    public class b implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: b */
        public final DialogC0606c f3973b;

        public b(DialogC0606c dialogC0606c) {
            this.f3973b = dialogC0606c;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            this.f3973b.f3911F.getViewTreeObserver().removeGlobalOnLayoutListener(this);
            this.f3973b.m3299I();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/mediarouter/app/c$c.class
     */
    /* renamed from: androidx.mediarouter.app.c$c */
    /* loaded from: combined.jar:classes1.jar:androidx/mediarouter/app/c$c.class */
    public class c implements Animation.AnimationListener {

        /* renamed from: a */
        public final DialogC0606c f3974a;

        public c(DialogC0606c dialogC0606c) {
            this.f3974a = dialogC0606c;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            this.f3974a.m3316p(true);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/mediarouter/app/c$d.class
     */
    /* renamed from: androidx.mediarouter.app.c$d */
    /* loaded from: combined.jar:classes1.jar:androidx/mediarouter/app/c$d.class */
    public class d implements Runnable {

        /* renamed from: b */
        public final DialogC0606c f3975b;

        public d(DialogC0606c dialogC0606c) {
            this.f3975b = dialogC0606c;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f3975b.m3298H();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/mediarouter/app/c$e.class
     */
    /* renamed from: androidx.mediarouter.app.c$e */
    /* loaded from: combined.jar:classes1.jar:androidx/mediarouter/app/c$e.class */
    public class e implements View.OnClickListener {

        /* renamed from: b */
        public final DialogC0606c f3976b;

        public e(DialogC0606c dialogC0606c) {
            this.f3976b = dialogC0606c;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f3976b.dismiss();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/mediarouter/app/c$f.class
     */
    /* renamed from: androidx.mediarouter.app.c$f */
    /* loaded from: combined.jar:classes1.jar:androidx/mediarouter/app/c$f.class */
    public class f implements View.OnClickListener {

        /* renamed from: b */
        public final DialogC0606c f3977b;

        public f(DialogC0606c dialogC0606c) {
            this.f3977b = dialogC0606c;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/mediarouter/app/c$g.class
     */
    /* renamed from: androidx.mediarouter.app.c$g */
    /* loaded from: combined.jar:classes1.jar:androidx/mediarouter/app/c$g.class */
    public class g implements View.OnClickListener {

        /* renamed from: b */
        public final DialogC0606c f3978b;

        public g(DialogC0606c dialogC0606c) {
            this.f3978b = dialogC0606c;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            PendingIntent sessionActivity;
            MediaControllerCompat mediaControllerCompat = this.f3978b.f3925T;
            if (mediaControllerCompat == null || (sessionActivity = mediaControllerCompat.getSessionActivity()) == null) {
                return;
            }
            try {
                sessionActivity.send();
                this.f3978b.dismiss();
            } catch (PendingIntent.CanceledException e10) {
                Log.e("MediaRouteCtrlDialog", sessionActivity + " was not sent, it had been canceled.");
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/mediarouter/app/c$h.class
     */
    /* renamed from: androidx.mediarouter.app.c$h */
    /* loaded from: combined.jar:classes1.jar:androidx/mediarouter/app/c$h.class */
    public class h implements View.OnClickListener {

        /* renamed from: b */
        public final DialogC0606c f3979b;

        public h(DialogC0606c dialogC0606c) {
            this.f3979b = dialogC0606c;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DialogC0606c dialogC0606c = this.f3979b;
            boolean z10 = !dialogC0606c.f3944k0;
            dialogC0606c.f3944k0 = z10;
            if (z10) {
                dialogC0606c.f3911F.setVisibility(0);
            }
            this.f3979b.m3294B();
            this.f3979b.m3303M(true);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/mediarouter/app/c$i.class
     */
    /* renamed from: androidx.mediarouter.app.c$i */
    /* loaded from: combined.jar:classes1.jar:androidx/mediarouter/app/c$i.class */
    public class i implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: b */
        public final boolean f3980b;

        /* renamed from: c */
        public final DialogC0606c f3981c;

        public i(DialogC0606c dialogC0606c, boolean z10) {
            this.f3981c = dialogC0606c;
            this.f3980b = z10;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            this.f3981c.f3961t.getViewTreeObserver().removeGlobalOnLayoutListener(this);
            DialogC0606c dialogC0606c = this.f3981c;
            if (dialogC0606c.f3946l0) {
                dialogC0606c.f3948m0 = true;
            } else {
                dialogC0606c.m3304N(this.f3980b);
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/mediarouter/app/c$j.class
     */
    /* renamed from: androidx.mediarouter.app.c$j */
    /* loaded from: combined.jar:classes1.jar:androidx/mediarouter/app/c$j.class */
    public class j extends Animation {

        /* renamed from: b */
        public final int f3982b;

        /* renamed from: c */
        public final int f3983c;

        /* renamed from: d */
        public final View f3984d;

        /* renamed from: e */
        public final DialogC0606c f3985e;

        public j(DialogC0606c dialogC0606c, int i10, int i11, View view) {
            this.f3985e = dialogC0606c;
            this.f3982b = i10;
            this.f3983c = i11;
            this.f3984d = view;
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f10, Transformation transformation) {
            DialogC0606c.m3289E(this.f3984d, this.f3982b - ((int) ((r0 - this.f3983c) * f10)));
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/mediarouter/app/c$k.class
     */
    /* renamed from: androidx.mediarouter.app.c$k */
    /* loaded from: combined.jar:classes1.jar:androidx/mediarouter/app/c$k.class */
    public class k implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: b */
        public final Map f3986b;

        /* renamed from: c */
        public final Map f3987c;

        /* renamed from: d */
        public final DialogC0606c f3988d;

        public k(DialogC0606c dialogC0606c, Map map, Map map2) {
            this.f3988d = dialogC0606c;
            this.f3986b = map;
            this.f3987c = map2;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            this.f3988d.f3911F.getViewTreeObserver().removeGlobalOnLayoutListener(this);
            this.f3988d.m3310j(this.f3986b, this.f3987c);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/mediarouter/app/c$l.class
     */
    /* renamed from: androidx.mediarouter.app.c$l */
    /* loaded from: combined.jar:classes1.jar:androidx/mediarouter/app/c$l.class */
    public class l implements Animation.AnimationListener {

        /* renamed from: a */
        public final DialogC0606c f3989a;

        public l(DialogC0606c dialogC0606c) {
            this.f3989a = dialogC0606c;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            this.f3989a.f3911F.m3261b();
            DialogC0606c dialogC0606c = this.f3989a;
            dialogC0606c.f3911F.postDelayed(dialogC0606c.f3966v0, dialogC0606c.f3950n0);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/mediarouter/app/c$m.class
     */
    /* renamed from: androidx.mediarouter.app.c$m */
    /* loaded from: combined.jar:classes1.jar:androidx/mediarouter/app/c$m.class */
    public final class m implements View.OnClickListener {

        /* renamed from: b */
        public final DialogC0606c f3990b;

        public m(DialogC0606c dialogC0606c) {
            this.f3990b = dialogC0606c;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            PlaybackStateCompat playbackStateCompat;
            int i10;
            int id2 = view.getId();
            int i11 = 1;
            boolean z10 = true;
            if (id2 == 16908313 || id2 == 16908314) {
                if (this.f3990b.f3935g.m28976C()) {
                    C5901j c5901j = this.f3990b.f3932e;
                    if (id2 == 16908313) {
                        i11 = 2;
                    }
                    c5901j.m28889z(i11);
                }
            } else {
                if (id2 == C5650f.f31811C) {
                    DialogC0606c dialogC0606c = this.f3990b;
                    if (dialogC0606c.f3925T == null || (playbackStateCompat = dialogC0606c.f3927V) == null) {
                        return;
                    }
                    if (playbackStateCompat.getState() != 3) {
                        z10 = false;
                    }
                    if (z10 && this.f3990b.m3321x()) {
                        this.f3990b.f3925T.getTransportControls().pause();
                        i10 = C5654j.f31891l;
                    } else if (z10 && this.f3990b.m3323z()) {
                        this.f3990b.f3925T.getTransportControls().stop();
                        i10 = C5654j.f31893n;
                    } else {
                        i10 = 0;
                        if (!z10) {
                            i10 = 0;
                            if (this.f3990b.m3322y()) {
                                this.f3990b.f3925T.getTransportControls().play();
                                i10 = C5654j.f31892m;
                            }
                        }
                    }
                    AccessibilityManager accessibilityManager = this.f3990b.f3964u0;
                    if (accessibilityManager == null || !accessibilityManager.isEnabled() || i10 == 0) {
                        return;
                    }
                    AccessibilityEvent obtain = AccessibilityEvent.obtain(16384);
                    obtain.setPackageName(this.f3990b.f3937h.getPackageName());
                    obtain.setClassName(m.class.getName());
                    obtain.getText().add(this.f3990b.f3937h.getString(i10));
                    this.f3990b.f3964u0.sendAccessibilityEvent(obtain);
                    return;
                }
                if (id2 != C5650f.f31809A) {
                    return;
                }
            }
            this.f3990b.dismiss();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/mediarouter/app/c$n.class
     */
    /* renamed from: androidx.mediarouter.app.c$n */
    /* loaded from: combined.jar:classes1.jar:androidx/mediarouter/app/c$n.class */
    public class n extends AsyncTask<Void, Void, Bitmap> {

        /* renamed from: a */
        public final Bitmap f3991a;

        /* renamed from: b */
        public final Uri f3992b;

        /* renamed from: c */
        public int f3993c;

        /* renamed from: d */
        public long f3994d;

        /* renamed from: e */
        public final DialogC0606c f3995e;

        public n(DialogC0606c dialogC0606c) {
            this.f3995e = dialogC0606c;
            MediaDescriptionCompat mediaDescriptionCompat = dialogC0606c.f3928W;
            Bitmap iconBitmap = mediaDescriptionCompat == null ? null : mediaDescriptionCompat.getIconBitmap();
            Bitmap bitmap = iconBitmap;
            if (DialogC0606c.m3292u(iconBitmap)) {
                Log.w("MediaRouteCtrlDialog", "Can't fetch the given art bitmap because it's already recycled.");
                bitmap = null;
            }
            this.f3991a = bitmap;
            MediaDescriptionCompat mediaDescriptionCompat2 = dialogC0606c.f3928W;
            this.f3992b = mediaDescriptionCompat2 == null ? null : mediaDescriptionCompat2.getIconUri();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:135:0x0250  */
        /* JADX WARN: Removed duplicated region for block: B:137:0x0275  */
        /* JADX WARN: Type inference failed for: r0v37, types: [java.io.InputStream] */
        /* JADX WARN: Type inference failed for: r0v54, types: [java.io.InputStream] */
        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public android.graphics.Bitmap doInBackground(java.lang.Void... r6) {
            /*
                Method dump skipped, instructions count: 723
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.mediarouter.app.DialogC0606c.n.doInBackground(java.lang.Void[]):android.graphics.Bitmap");
        }

        /* renamed from: b */
        public Bitmap m3325b() {
            return this.f3991a;
        }

        /* renamed from: c */
        public Uri m3326c() {
            return this.f3992b;
        }

        @Override // android.os.AsyncTask
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Bitmap bitmap) {
            DialogC0606c dialogC0606c = this.f3995e;
            dialogC0606c.f3929X = null;
            if (C6611c.m30516a(dialogC0606c.f3930Y, this.f3991a) && C6611c.m30516a(this.f3995e.f3931Z, this.f3992b)) {
                return;
            }
            DialogC0606c dialogC0606c2 = this.f3995e;
            dialogC0606c2.f3930Y = this.f3991a;
            dialogC0606c2.f3936g0 = bitmap;
            dialogC0606c2.f3931Z = this.f3992b;
            dialogC0606c2.f3938h0 = this.f3993c;
            boolean z10 = true;
            dialogC0606c2.f3934f0 = true;
            long uptimeMillis = SystemClock.uptimeMillis();
            long j10 = this.f3994d;
            DialogC0606c dialogC0606c3 = this.f3995e;
            if (uptimeMillis - j10 <= 120) {
                z10 = false;
            }
            dialogC0606c3.m3300J(z10);
        }

        /* renamed from: e */
        public final InputStream m3328e(Uri uri) {
            InputStream openInputStream;
            String lowerCase = uri.getScheme().toLowerCase();
            if ("android.resource".equals(lowerCase) || "content".equals(lowerCase) || TransferTable.COLUMN_FILE.equals(lowerCase)) {
                openInputStream = this.f3995e.f3937h.getContentResolver().openInputStream(uri);
            } else {
                URLConnection openConnection = new URL(uri.toString()).openConnection();
                int i10 = DialogC0606c.f3905x0;
                openConnection.setConnectTimeout(i10);
                openConnection.setReadTimeout(i10);
                openInputStream = openConnection.getInputStream();
            }
            return openInputStream == null ? null : new BufferedInputStream(openInputStream);
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            this.f3994d = SystemClock.uptimeMillis();
            this.f3995e.m3314n();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/mediarouter/app/c$o.class
     */
    /* renamed from: androidx.mediarouter.app.c$o */
    /* loaded from: combined.jar:classes1.jar:androidx/mediarouter/app/c$o.class */
    public final class o extends MediaControllerCompat.Callback {

        /* renamed from: a */
        public final DialogC0606c f3996a;

        public o(DialogC0606c dialogC0606c) {
            this.f3996a = dialogC0606c;
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.Callback
        public void onMetadataChanged(MediaMetadataCompat mediaMetadataCompat) {
            this.f3996a.f3928W = mediaMetadataCompat == null ? null : mediaMetadataCompat.getDescription();
            this.f3996a.m3301K();
            this.f3996a.m3300J(false);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.Callback
        public void onPlaybackStateChanged(PlaybackStateCompat playbackStateCompat) {
            DialogC0606c dialogC0606c = this.f3996a;
            dialogC0606c.f3927V = playbackStateCompat;
            dialogC0606c.m3300J(false);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.Callback
        public void onSessionDestroyed() {
            DialogC0606c dialogC0606c = this.f3996a;
            MediaControllerCompat mediaControllerCompat = dialogC0606c.f3925T;
            if (mediaControllerCompat != null) {
                mediaControllerCompat.unregisterCallback(dialogC0606c.f3926U);
                this.f3996a.f3925T = null;
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/mediarouter/app/c$p.class
     */
    /* renamed from: androidx.mediarouter.app.c$p */
    /* loaded from: combined.jar:classes1.jar:androidx/mediarouter/app/c$p.class */
    public final class p extends C5901j.a {

        /* renamed from: a */
        public final DialogC0606c f3997a;

        public p(DialogC0606c dialogC0606c) {
            this.f3997a = dialogC0606c;
        }

        @Override // p208m1.C5901j.a
        /* renamed from: e */
        public void mo3235e(C5901j c5901j, C5901j.h hVar) {
            this.f3997a.m3300J(true);
        }

        @Override // p208m1.C5901j.a
        /* renamed from: k */
        public void mo3251k(C5901j c5901j, C5901j.h hVar) {
            this.f3997a.m3300J(false);
        }

        @Override // p208m1.C5901j.a
        /* renamed from: m */
        public void mo3329m(C5901j c5901j, C5901j.h hVar) {
            SeekBar seekBar = this.f3997a.f3924S.get(hVar);
            int m29003s = hVar.m29003s();
            if (DialogC0606c.f3904w0) {
                Log.d("MediaRouteCtrlDialog", "onRouteVolumeChanged(), route.getVolume:" + m29003s);
            }
            if (seekBar == null || this.f3997a.f3919N == hVar) {
                return;
            }
            seekBar.setProgress(m29003s);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/mediarouter/app/c$q.class
     */
    /* renamed from: androidx.mediarouter.app.c$q */
    /* loaded from: combined.jar:classes1.jar:androidx/mediarouter/app/c$q.class */
    public class q implements SeekBar.OnSeekBarChangeListener {

        /* renamed from: b */
        public final Runnable f3998b = new a(this);

        /* renamed from: c */
        public final DialogC0606c f3999c;

        /* JADX WARN: Classes with same name are omitted:
          classes1.jar:androidx/mediarouter/app/c$q$a.class
         */
        /* renamed from: androidx.mediarouter.app.c$q$a */
        /* loaded from: combined.jar:classes1.jar:androidx/mediarouter/app/c$q$a.class */
        public class a implements Runnable {

            /* renamed from: b */
            public final q f4000b;

            public a(q qVar) {
                this.f4000b = qVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                DialogC0606c dialogC0606c = this.f4000b.f3999c;
                if (dialogC0606c.f3919N != null) {
                    dialogC0606c.f3919N = null;
                    if (dialogC0606c.f3940i0) {
                        dialogC0606c.m3300J(dialogC0606c.f3942j0);
                    }
                }
            }
        }

        public q(DialogC0606c dialogC0606c) {
            this.f3999c = dialogC0606c;
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i10, boolean z10) {
            if (z10) {
                C5901j.h hVar = (C5901j.h) seekBar.getTag();
                if (DialogC0606c.f3904w0) {
                    Log.d("MediaRouteCtrlDialog", "onProgressChanged(): calling MediaRouter.RouteInfo.requestSetVolume(" + i10 + ")");
                }
                hVar.m28979G(i10);
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
            DialogC0606c dialogC0606c = this.f3999c;
            if (dialogC0606c.f3919N != null) {
                dialogC0606c.f3917L.removeCallbacks(this.f3998b);
            }
            this.f3999c.f3919N = (C5901j.h) seekBar.getTag();
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            this.f3999c.f3917L.postDelayed(this.f3998b, 500L);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/mediarouter/app/c$r.class
     */
    /* renamed from: androidx.mediarouter.app.c$r */
    /* loaded from: combined.jar:classes1.jar:androidx/mediarouter/app/c$r.class */
    public class r extends ArrayAdapter<C5901j.h> {

        /* renamed from: b */
        public final float f4001b;

        /* renamed from: c */
        public final DialogC0606c f4002c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(DialogC0606c dialogC0606c, Context context, List<C5901j.h> list) {
            super(context, 0, list);
            this.f4002c = dialogC0606c;
            this.f4001b = C0612i.m3414h(context);
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public View getView(int i10, View view, ViewGroup viewGroup) {
            if (view == null) {
                view = LayoutInflater.from(viewGroup.getContext()).inflate(C5653i.f31876i, viewGroup, false);
            } else {
                this.f4002c.m3308R(view);
            }
            C5901j.h hVar = (C5901j.h) getItem(i10);
            if (hVar != null) {
                boolean m29008x = hVar.m29008x();
                TextView textView = (TextView) view.findViewById(C5650f.f31822N);
                textView.setEnabled(m29008x);
                textView.setText(hVar.m28997m());
                MediaRouteVolumeSlider mediaRouteVolumeSlider = (MediaRouteVolumeSlider) view.findViewById(C5650f.f31833Y);
                C0612i.m3429w(viewGroup.getContext(), mediaRouteVolumeSlider, this.f4002c.f3911F);
                mediaRouteVolumeSlider.setTag(hVar);
                this.f4002c.f3924S.put(hVar, mediaRouteVolumeSlider);
                mediaRouteVolumeSlider.m3259c(!m29008x);
                mediaRouteVolumeSlider.setEnabled(m29008x);
                if (m29008x) {
                    if (this.f4002c.m3293A(hVar)) {
                        mediaRouteVolumeSlider.setMax(hVar.m29005u());
                        mediaRouteVolumeSlider.setProgress(hVar.m29003s());
                        mediaRouteVolumeSlider.setOnSeekBarChangeListener(this.f4002c.f3918M);
                    } else {
                        mediaRouteVolumeSlider.setMax(100);
                        mediaRouteVolumeSlider.setProgress(100);
                        mediaRouteVolumeSlider.setEnabled(false);
                    }
                }
                ((ImageView) view.findViewById(C5650f.f31832X)).setAlpha(m29008x ? 255 : (int) (this.f4001b * 255.0f));
                LinearLayout linearLayout = (LinearLayout) view.findViewById(C5650f.f31834Z);
                int i11 = 0;
                if (this.f4002c.f3916K.contains(hVar)) {
                    i11 = 4;
                }
                linearLayout.setVisibility(i11);
                Set<C5901j.h> set = this.f4002c.f3914I;
                if (set != null && set.contains(hVar)) {
                    AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 0.0f);
                    alphaAnimation.setDuration(0L);
                    alphaAnimation.setFillEnabled(true);
                    alphaAnimation.setFillAfter(true);
                    view.clearAnimation();
                    view.startAnimation(alphaAnimation);
                }
            }
            return view;
        }

        @Override // android.widget.BaseAdapter, android.widget.ListAdapter
        public boolean isEnabled(int i10) {
            return false;
        }
    }

    public DialogC0606c(Context context) {
        this(context, 0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public DialogC0606c(android.content.Context r6, int r7) {
        /*
            r5 = this;
            r0 = r6
            r1 = r7
            r2 = 1
            android.content.Context r0 = androidx.mediarouter.app.C0612i.m3408b(r0, r1, r2)
            r6 = r0
            r0 = r5
            r1 = r6
            r2 = r6
            int r2 = androidx.mediarouter.app.C0612i.m3409c(r2)
            r0.<init>(r1, r2)
            r0 = r5
            r1 = 1
            r0.f3970z = r1
            r0 = r5
            androidx.mediarouter.app.c$d r1 = new androidx.mediarouter.app.c$d
            r2 = r1
            r3 = r5
            r2.<init>(r3)
            r0.f3966v0 = r1
            r0 = r5
            r1 = r5
            android.content.Context r1 = r1.getContext()
            r0.f3937h = r1
            r0 = r5
            androidx.mediarouter.app.c$o r1 = new androidx.mediarouter.app.c$o
            r2 = r1
            r3 = r5
            r2.<init>(r3)
            r0.f3926U = r1
            r0 = r5
            android.content.Context r0 = r0.f3937h
            m1.j r0 = p208m1.C5901j.m28867j(r0)
            r8 = r0
            r0 = r5
            r1 = r8
            r0.f3932e = r1
            r0 = r5
            boolean r1 = p208m1.C5901j.m28868o()
            r0.f3906A = r1
            r0 = r5
            androidx.mediarouter.app.c$p r1 = new androidx.mediarouter.app.c$p
            r2 = r1
            r3 = r5
            r2.<init>(r3)
            r0.f3933f = r1
            r0 = r5
            r1 = r8
            m1.j$h r1 = r1.m28880n()
            r0.f3935g = r1
            r0 = r5
            r1 = r8
            android.support.v4.media.session.MediaSessionCompat$Token r1 = r1.m28877k()
            r0.m3297F(r1)
            r0 = r5
            r1 = r5
            android.content.Context r1 = r1.f3937h
            android.content.res.Resources r1 = r1.getResources()
            int r2 = p192l1.C5648d.f31800e
            int r1 = r1.getDimensionPixelSize(r2)
            r0.f3923R = r1
            r0 = r5
            r1 = r5
            android.content.Context r1 = r1.f3937h
            java.lang.String r2 = "accessibility"
            java.lang.Object r1 = r1.getSystemService(r2)
            android.view.accessibility.AccessibilityManager r1 = (android.view.accessibility.AccessibilityManager) r1
            r0.f3964u0 = r1
            r0 = r5
            r1 = r6
            int r2 = p192l1.C5652h.f31867b
            android.view.animation.Interpolator r1 = android.view.animation.AnimationUtils.loadInterpolator(r1, r2)
            r0.f3958r0 = r1
            r0 = r5
            r1 = r6
            int r2 = p192l1.C5652h.f31866a
            android.view.animation.Interpolator r1 = android.view.animation.AnimationUtils.loadInterpolator(r1, r2)
            r0.f3960s0 = r1
            r0 = r5
            android.view.animation.AccelerateDecelerateInterpolator r1 = new android.view.animation.AccelerateDecelerateInterpolator
            r2 = r1
            r2.<init>()
            r0.f3962t0 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.mediarouter.app.DialogC0606c.<init>(android.content.Context, int):void");
    }

    /* renamed from: E */
    public static void m3289E(View view, int i10) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = i10;
        view.setLayoutParams(layoutParams);
    }

    /* renamed from: S */
    public static boolean m3290S(Uri uri, Uri uri2) {
        if (uri == null || !uri.equals(uri2)) {
            return uri == null && uri2 == null;
        }
        return true;
    }

    /* renamed from: r */
    public static int m3291r(View view) {
        return view.getLayoutParams().height;
    }

    /* renamed from: u */
    public static boolean m3292u(Bitmap bitmap) {
        return bitmap != null && bitmap.isRecycled();
    }

    /* renamed from: A */
    public boolean m3293A(C5901j.h hVar) {
        boolean z10 = true;
        if (!this.f3970z || hVar.m29004t() != 1) {
            z10 = false;
        }
        return z10;
    }

    /* renamed from: B */
    public void m3294B() {
        this.f3956q0 = this.f3944k0 ? this.f3958r0 : this.f3960s0;
    }

    /* renamed from: C */
    public View m3295C(Bundle bundle) {
        return null;
    }

    /* renamed from: D */
    public final void m3296D(boolean z10) {
        List<C5901j.h> m28996l = this.f3935g.m28996l();
        if (m28996l.isEmpty()) {
            this.f3913H.clear();
        } else if (!C0609f.m3346i(this.f3913H, m28996l)) {
            HashMap m3342e = z10 ? C0609f.m3342e(this.f3911F, this.f3912G) : null;
            HashMap m3341d = z10 ? C0609f.m3341d(this.f3937h, this.f3911F, this.f3912G) : null;
            this.f3914I = C0609f.m3343f(this.f3913H, m28996l);
            this.f3915J = C0609f.m3344g(this.f3913H, m28996l);
            this.f3913H.addAll(0, this.f3914I);
            this.f3913H.removeAll(this.f3915J);
            this.f3912G.notifyDataSetChanged();
            if (z10 && this.f3944k0 && this.f3914I.size() + this.f3915J.size() > 0) {
                m3309i(m3342e, m3341d);
                return;
            } else {
                this.f3914I = null;
                this.f3915J = null;
                return;
            }
        }
        this.f3912G.notifyDataSetChanged();
    }

    /* renamed from: F */
    public final void m3297F(MediaSessionCompat.Token token) {
        MediaControllerCompat mediaControllerCompat = this.f3925T;
        if (mediaControllerCompat != null) {
            mediaControllerCompat.unregisterCallback(this.f3926U);
            this.f3925T = null;
        }
        if (token != null && this.f3941j) {
            MediaControllerCompat mediaControllerCompat2 = new MediaControllerCompat(this.f3937h, token);
            this.f3925T = mediaControllerCompat2;
            mediaControllerCompat2.registerCallback(this.f3926U);
            MediaMetadataCompat metadata = this.f3925T.getMetadata();
            this.f3928W = metadata == null ? null : metadata.getDescription();
            this.f3927V = this.f3925T.getPlaybackState();
            m3301K();
            m3300J(false);
        }
    }

    /* renamed from: H */
    public void m3298H() {
        m3313m(true);
        this.f3911F.requestLayout();
        this.f3911F.getViewTreeObserver().addOnGlobalLayoutListener(new b(this));
    }

    /* renamed from: I */
    public void m3299I() {
        Set<C5901j.h> set = this.f3914I;
        if (set == null || set.size() == 0) {
            m3316p(true);
        } else {
            m3315o();
        }
    }

    /* renamed from: J */
    public void m3300J(boolean z10) {
        if (this.f3919N != null) {
            this.f3940i0 = true;
            this.f3942j0 = z10 | this.f3942j0;
            return;
        }
        int i10 = 0;
        this.f3940i0 = false;
        this.f3942j0 = false;
        if (!this.f3935g.m28976C() || this.f3935g.m29007w()) {
            dismiss();
            return;
        }
        if (this.f3939i) {
            this.f3969y.setText(this.f3935g.m28997m());
            Button button = this.f3947m;
            if (!this.f3935g.m28985a()) {
                i10 = 8;
            }
            button.setVisibility(i10);
            if (this.f3945l == null && this.f3934f0) {
                if (m3292u(this.f3936g0)) {
                    Log.w("MediaRouteCtrlDialog", "Can't set artwork image with recycled bitmap: " + this.f3936g0);
                } else {
                    this.f3965v.setImageBitmap(this.f3936g0);
                    this.f3965v.setBackgroundColor(this.f3938h0);
                }
                m3314n();
            }
            m3307Q();
            m3306P();
            m3303M(z10);
        }
    }

    /* renamed from: K */
    public void m3301K() {
        if (this.f3945l == null && m3320w()) {
            if (!m3319v() || this.f3906A) {
                n nVar = this.f3929X;
                if (nVar != null) {
                    nVar.cancel(true);
                }
                n nVar2 = new n(this);
                this.f3929X = nVar2;
                nVar2.execute(new Void[0]);
            }
        }
    }

    /* renamed from: L */
    public void m3302L() {
        int m3339b = C0609f.m3339b(this.f3937h);
        getWindow().setLayout(m3339b, -2);
        View decorView = getWindow().getDecorView();
        this.f3943k = (m3339b - decorView.getPaddingLeft()) - decorView.getPaddingRight();
        Resources resources = this.f3937h.getResources();
        this.f3920O = resources.getDimensionPixelSize(C5648d.f31798c);
        this.f3921P = resources.getDimensionPixelSize(C5648d.f31797b);
        this.f3922Q = resources.getDimensionPixelSize(C5648d.f31799d);
        this.f3930Y = null;
        this.f3931Z = null;
        m3301K();
        m3300J(false);
    }

    /* renamed from: M */
    public void m3303M(boolean z10) {
        this.f3961t.requestLayout();
        this.f3961t.getViewTreeObserver().addOnGlobalLayoutListener(new i(this, z10));
    }

    /* renamed from: N */
    public void m3304N(boolean z10) {
        int i10;
        Bitmap bitmap;
        int m3291r = m3291r(this.f3907B);
        m3289E(this.f3907B, -1);
        m3305O(m3312l());
        View decorView = getWindow().getDecorView();
        decorView.measure(View.MeasureSpec.makeMeasureSpec(getWindow().getAttributes().width, NTLMEngineImpl.FLAG_REQUEST_EXPLICIT_KEY_EXCH), 0);
        m3289E(this.f3907B, m3291r);
        if (this.f3945l == null && (this.f3965v.getDrawable() instanceof BitmapDrawable) && (bitmap = ((BitmapDrawable) this.f3965v.getDrawable()).getBitmap()) != null) {
            i10 = m3317q(bitmap.getWidth(), bitmap.getHeight());
            this.f3965v.setScaleType(bitmap.getWidth() >= bitmap.getHeight() ? ImageView.ScaleType.FIT_XY : ImageView.ScaleType.FIT_CENTER);
        } else {
            i10 = 0;
        }
        int m3318t = m3318t(m3312l());
        int size = this.f3913H.size();
        int size2 = m3319v() ? this.f3921P * this.f3935g.m28996l().size() : 0;
        int i11 = size2;
        if (size > 0) {
            i11 = size2 + this.f3923R;
        }
        int min = Math.min(i11, this.f3922Q);
        if (!this.f3944k0) {
            min = 0;
        }
        int max = Math.max(i10, min) + m3318t;
        Rect rect = new Rect();
        decorView.getWindowVisibleDisplayFrame(rect);
        int height = rect.height() - (this.f3959s.getMeasuredHeight() - this.f3961t.getMeasuredHeight());
        if (this.f3945l != null || i10 <= 0 || max > height) {
            if (m3291r(this.f3911F) + this.f3907B.getMeasuredHeight() >= this.f3961t.getMeasuredHeight()) {
                this.f3965v.setVisibility(8);
            }
            max = min + m3318t;
            i10 = 0;
        } else {
            this.f3965v.setVisibility(0);
            m3289E(this.f3965v, i10);
        }
        if (!m3312l() || max > height) {
            this.f3908C.setVisibility(8);
        } else {
            this.f3908C.setVisibility(0);
        }
        m3305O(this.f3908C.getVisibility() == 0);
        boolean z11 = false;
        if (this.f3908C.getVisibility() == 0) {
            z11 = true;
        }
        int m3318t2 = m3318t(z11);
        int max2 = Math.max(i10, min) + m3318t2;
        if (max2 > height) {
            min -= max2 - height;
            max2 = height;
        }
        this.f3907B.clearAnimation();
        this.f3911F.clearAnimation();
        this.f3961t.clearAnimation();
        LinearLayout linearLayout = this.f3907B;
        if (z10) {
            m3311k(linearLayout, m3318t2);
            m3311k(this.f3911F, min);
            m3311k(this.f3961t, max2);
        } else {
            m3289E(linearLayout, m3318t2);
            m3289E(this.f3911F, min);
            m3289E(this.f3961t, max2);
        }
        m3289E(this.f3957r, rect.height());
        m3296D(z10);
    }

    /* renamed from: O */
    public final void m3305O(boolean z10) {
        this.f3910E.setVisibility((this.f3909D.getVisibility() == 0 && z10) ? 0 : 8);
        LinearLayout linearLayout = this.f3907B;
        int i10 = 0;
        if (this.f3909D.getVisibility() == 8) {
            i10 = 0;
            if (!z10) {
                i10 = 8;
            }
        }
        linearLayout.setVisibility(i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ec  */
    /* renamed from: P */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m3306P() {
        /*
            Method dump skipped, instructions count: 450
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.mediarouter.app.DialogC0606c.m3306P():void");
    }

    /* renamed from: Q */
    public final void m3307Q() {
        int i10 = 0;
        if (!this.f3906A && m3319v()) {
            this.f3909D.setVisibility(8);
            this.f3944k0 = true;
            this.f3911F.setVisibility(0);
            m3294B();
            m3303M(false);
            return;
        }
        if ((this.f3944k0 && !this.f3906A) || !m3293A(this.f3935g)) {
            this.f3909D.setVisibility(8);
            return;
        }
        if (this.f3909D.getVisibility() == 8) {
            this.f3909D.setVisibility(0);
            this.f3917L.setMax(this.f3935g.m29005u());
            this.f3917L.setProgress(this.f3935g.m29003s());
            MediaRouteExpandCollapseButton mediaRouteExpandCollapseButton = this.f3955q;
            if (!m3319v()) {
                i10 = 8;
            }
            mediaRouteExpandCollapseButton.setVisibility(i10);
        }
    }

    /* renamed from: R */
    public void m3308R(View view) {
        m3289E((LinearLayout) view.findViewById(C5650f.f31834Z), this.f3921P);
        View findViewById = view.findViewById(C5650f.f31832X);
        ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
        int i10 = this.f3920O;
        layoutParams.width = i10;
        layoutParams.height = i10;
        findViewById.setLayoutParams(layoutParams);
    }

    /* renamed from: i */
    public final void m3309i(Map<C5901j.h, Rect> map, Map<C5901j.h, BitmapDrawable> map2) {
        this.f3911F.setEnabled(false);
        this.f3911F.requestLayout();
        this.f3946l0 = true;
        this.f3911F.getViewTreeObserver().addOnGlobalLayoutListener(new k(this, map, map2));
    }

    /* renamed from: j */
    public void m3310j(Map<C5901j.h, Rect> map, Map<C5901j.h, BitmapDrawable> map2) {
        OverlayListView.C0603a m3266d;
        Set<C5901j.h> set = this.f3914I;
        if (set == null || this.f3915J == null) {
            return;
        }
        int size = set.size() - this.f3915J.size();
        l lVar = new l(this);
        int firstVisiblePosition = this.f3911F.getFirstVisiblePosition();
        int i10 = 0;
        boolean z10 = false;
        while (true) {
            boolean z11 = z10;
            if (i10 >= this.f3911F.getChildCount()) {
                break;
            }
            View childAt = this.f3911F.getChildAt(i10);
            C5901j.h hVar = (C5901j.h) this.f3912G.getItem(firstVisiblePosition + i10);
            Rect rect = map.get(hVar);
            int top = childAt.getTop();
            int i11 = rect != null ? rect.top : (this.f3921P * size) + top;
            AnimationSet animationSet = new AnimationSet(true);
            Set<C5901j.h> set2 = this.f3914I;
            int i12 = i11;
            if (set2 != null) {
                i12 = i11;
                if (set2.contains(hVar)) {
                    AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 0.0f);
                    alphaAnimation.setDuration(this.f3952o0);
                    animationSet.addAnimation(alphaAnimation);
                    i12 = top;
                }
            }
            TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, i12 - top, 0.0f);
            translateAnimation.setDuration(this.f3950n0);
            animationSet.addAnimation(translateAnimation);
            animationSet.setFillAfter(true);
            animationSet.setFillEnabled(true);
            animationSet.setInterpolator(this.f3956q0);
            boolean z12 = z11;
            if (!z11) {
                animationSet.setAnimationListener(lVar);
                z12 = true;
            }
            childAt.clearAnimation();
            childAt.startAnimation(animationSet);
            map.remove(hVar);
            map2.remove(hVar);
            i10++;
            z10 = z12;
        }
        for (Map.Entry<C5901j.h, BitmapDrawable> entry : map2.entrySet()) {
            C5901j.h key = entry.getKey();
            BitmapDrawable value = entry.getValue();
            Rect rect2 = map.get(key);
            if (this.f3915J.contains(key)) {
                m3266d = new OverlayListView.C0603a(value, rect2).m3265c(1.0f, 0.0f).m3267e(this.f3954p0).m3268f(this.f3956q0);
            } else {
                m3266d = new OverlayListView.C0603a(value, rect2).m3269g(this.f3921P * size).m3267e(this.f3950n0).m3268f(this.f3956q0).m3266d(new a(this, key));
                this.f3916K.add(key);
            }
            this.f3911F.m3260a(m3266d);
        }
    }

    /* renamed from: k */
    public final void m3311k(View view, int i10) {
        j jVar = new j(this, m3291r(view), i10, view);
        jVar.setDuration(this.f3950n0);
        jVar.setInterpolator(this.f3956q0);
        view.startAnimation(jVar);
    }

    /* renamed from: l */
    public final boolean m3312l() {
        return this.f3945l == null && !(this.f3928W == null && this.f3927V == null);
    }

    /* renamed from: m */
    public void m3313m(boolean z10) {
        Set<C5901j.h> set;
        int firstVisiblePosition = this.f3911F.getFirstVisiblePosition();
        for (int i10 = 0; i10 < this.f3911F.getChildCount(); i10++) {
            View childAt = this.f3911F.getChildAt(i10);
            C5901j.h hVar = (C5901j.h) this.f3912G.getItem(firstVisiblePosition + i10);
            if (!z10 || (set = this.f3914I) == null || !set.contains(hVar)) {
                ((LinearLayout) childAt.findViewById(C5650f.f31834Z)).setVisibility(0);
                AnimationSet animationSet = new AnimationSet(true);
                AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 1.0f);
                alphaAnimation.setDuration(0L);
                animationSet.addAnimation(alphaAnimation);
                new TranslateAnimation(0.0f, 0.0f, 0.0f, 0.0f).setDuration(0L);
                animationSet.setFillAfter(true);
                animationSet.setFillEnabled(true);
                childAt.clearAnimation();
                childAt.startAnimation(animationSet);
            }
        }
        this.f3911F.m3262c();
        if (z10) {
            return;
        }
        m3316p(false);
    }

    /* renamed from: n */
    public void m3314n() {
        this.f3934f0 = false;
        this.f3936g0 = null;
        this.f3938h0 = 0;
    }

    /* renamed from: o */
    public final void m3315o() {
        c cVar = new c(this);
        int firstVisiblePosition = this.f3911F.getFirstVisiblePosition();
        int i10 = 0;
        boolean z10 = false;
        while (true) {
            boolean z11 = z10;
            if (i10 >= this.f3911F.getChildCount()) {
                return;
            }
            View childAt = this.f3911F.getChildAt(i10);
            boolean z12 = z11;
            if (this.f3914I.contains((C5901j.h) this.f3912G.getItem(firstVisiblePosition + i10))) {
                AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                alphaAnimation.setDuration(this.f3952o0);
                alphaAnimation.setFillEnabled(true);
                alphaAnimation.setFillAfter(true);
                z12 = z11;
                if (!z11) {
                    alphaAnimation.setAnimationListener(cVar);
                    z12 = true;
                }
                childAt.clearAnimation();
                childAt.startAnimation(alphaAnimation);
            }
            i10++;
            z10 = z12;
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f3941j = true;
        this.f3932e.m28872b(C5900i.f33081c, this.f3933f, 2);
        m3297F(this.f3932e.m28877k());
    }

    @Override // androidx.appcompat.app.DialogC0242a, p049d.DialogC4281g, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setBackgroundDrawableResource(R.color.transparent);
        setContentView(C5653i.f31875h);
        findViewById(R.id.button3).setVisibility(8);
        m mVar = new m(this);
        FrameLayout frameLayout = (FrameLayout) findViewById(C5650f.f31818J);
        this.f3957r = frameLayout;
        frameLayout.setOnClickListener(new e(this));
        LinearLayout linearLayout = (LinearLayout) findViewById(C5650f.f31817I);
        this.f3959s = linearLayout;
        linearLayout.setOnClickListener(new f(this));
        int m3410d = C0612i.m3410d(this.f3937h);
        Button button = (Button) findViewById(R.id.button2);
        this.f3947m = button;
        button.setText(C5654j.f31887h);
        this.f3947m.setTextColor(m3410d);
        this.f3947m.setOnClickListener(mVar);
        Button button2 = (Button) findViewById(R.id.button1);
        this.f3949n = button2;
        button2.setText(C5654j.f31894o);
        this.f3949n.setTextColor(m3410d);
        this.f3949n.setOnClickListener(mVar);
        this.f3969y = (TextView) findViewById(C5650f.f31822N);
        ImageButton imageButton = (ImageButton) findViewById(C5650f.f31809A);
        this.f3953p = imageButton;
        imageButton.setOnClickListener(mVar);
        this.f3963u = (FrameLayout) findViewById(C5650f.f31815G);
        this.f3961t = (FrameLayout) findViewById(C5650f.f31816H);
        g gVar = new g(this);
        ImageView imageView = (ImageView) findViewById(C5650f.f31835a);
        this.f3965v = imageView;
        imageView.setOnClickListener(gVar);
        findViewById(C5650f.f31814F).setOnClickListener(gVar);
        this.f3907B = (LinearLayout) findViewById(C5650f.f31821M);
        this.f3910E = findViewById(C5650f.f31810B);
        this.f3908C = (RelativeLayout) findViewById(C5650f.f31829U);
        this.f3967w = (TextView) findViewById(C5650f.f31813E);
        this.f3968x = (TextView) findViewById(C5650f.f31812D);
        ImageButton imageButton2 = (ImageButton) findViewById(C5650f.f31811C);
        this.f3951o = imageButton2;
        imageButton2.setOnClickListener(mVar);
        LinearLayout linearLayout2 = (LinearLayout) findViewById(C5650f.f31830V);
        this.f3909D = linearLayout2;
        linearLayout2.setVisibility(8);
        SeekBar seekBar = (SeekBar) findViewById(C5650f.f31833Y);
        this.f3917L = seekBar;
        seekBar.setTag(this.f3935g);
        q qVar = new q(this);
        this.f3918M = qVar;
        this.f3917L.setOnSeekBarChangeListener(qVar);
        this.f3911F = (OverlayListView) findViewById(C5650f.f31831W);
        this.f3913H = new ArrayList();
        r rVar = new r(this, this.f3911F.getContext(), this.f3913H);
        this.f3912G = rVar;
        this.f3911F.setAdapter((ListAdapter) rVar);
        this.f3916K = new HashSet();
        C0612i.m3427u(this.f3937h, this.f3907B, this.f3911F, m3319v());
        C0612i.m3429w(this.f3937h, (MediaRouteVolumeSlider) this.f3917L, this.f3907B);
        HashMap hashMap = new HashMap();
        this.f3924S = hashMap;
        hashMap.put(this.f3935g, this.f3917L);
        MediaRouteExpandCollapseButton mediaRouteExpandCollapseButton = (MediaRouteExpandCollapseButton) findViewById(C5650f.f31819K);
        this.f3955q = mediaRouteExpandCollapseButton;
        mediaRouteExpandCollapseButton.setOnClickListener(new h(this));
        m3294B();
        this.f3950n0 = this.f3937h.getResources().getInteger(C5651g.f31862b);
        this.f3952o0 = this.f3937h.getResources().getInteger(C5651g.f31863c);
        this.f3954p0 = this.f3937h.getResources().getInteger(C5651g.f31864d);
        View m3295C = m3295C(bundle);
        this.f3945l = m3295C;
        if (m3295C != null) {
            this.f3963u.addView(m3295C);
            this.f3963u.setVisibility(0);
        }
        this.f3939i = true;
        m3302L();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onDetachedFromWindow() {
        this.f3932e.m28882s(this.f3933f);
        m3297F(null);
        this.f3941j = false;
        super.onDetachedFromWindow();
    }

    @Override // androidx.appcompat.app.DialogC0242a, android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (i10 != 25 && i10 != 24) {
            return super.onKeyDown(i10, keyEvent);
        }
        if (!this.f3906A && this.f3944k0) {
            return true;
        }
        this.f3935g.m28980H(i10 == 25 ? -1 : 1);
        return true;
    }

    @Override // androidx.appcompat.app.DialogC0242a, android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i10, KeyEvent keyEvent) {
        if (i10 == 25 || i10 == 24) {
            return true;
        }
        return super.onKeyUp(i10, keyEvent);
    }

    /* renamed from: p */
    public void m3316p(boolean z10) {
        this.f3914I = null;
        this.f3915J = null;
        this.f3946l0 = false;
        if (this.f3948m0) {
            this.f3948m0 = false;
            m3303M(z10);
        }
        this.f3911F.setEnabled(true);
    }

    /* renamed from: q */
    public int m3317q(int i10, int i11) {
        return i10 >= i11 ? (int) (((this.f3943k * i11) / i10) + 0.5f) : (int) (((this.f3943k * 9.0f) / 16.0f) + 0.5f);
    }

    /* renamed from: t */
    public final int m3318t(boolean z10) {
        int i10 = 0;
        if (z10 || this.f3909D.getVisibility() == 0) {
            int paddingTop = 0 + this.f3907B.getPaddingTop() + this.f3907B.getPaddingBottom();
            int i11 = paddingTop;
            if (z10) {
                i11 = paddingTop + this.f3908C.getMeasuredHeight();
            }
            int i12 = i11;
            if (this.f3909D.getVisibility() == 0) {
                i12 = i11 + this.f3909D.getMeasuredHeight();
            }
            i10 = i12;
            if (z10) {
                i10 = i12;
                if (this.f3909D.getVisibility() == 0) {
                    i10 = i12 + this.f3910E.getMeasuredHeight();
                }
            }
        }
        return i10;
    }

    /* renamed from: v */
    public final boolean m3319v() {
        boolean z10 = true;
        if (!this.f3935g.m29009y() || this.f3935g.m28996l().size() <= 1) {
            z10 = false;
        }
        return z10;
    }

    /* renamed from: w */
    public final boolean m3320w() {
        MediaDescriptionCompat mediaDescriptionCompat = this.f3928W;
        Uri uri = null;
        Bitmap iconBitmap = mediaDescriptionCompat == null ? null : mediaDescriptionCompat.getIconBitmap();
        MediaDescriptionCompat mediaDescriptionCompat2 = this.f3928W;
        if (mediaDescriptionCompat2 != null) {
            uri = mediaDescriptionCompat2.getIconUri();
        }
        n nVar = this.f3929X;
        Bitmap m3325b = nVar == null ? this.f3930Y : nVar.m3325b();
        n nVar2 = this.f3929X;
        Uri m3326c = nVar2 == null ? this.f3931Z : nVar2.m3326c();
        if (m3325b != iconBitmap) {
            return true;
        }
        return m3325b == null && !m3290S(m3326c, uri);
    }

    /* renamed from: x */
    public boolean m3321x() {
        return (this.f3927V.getActions() & 514) != 0;
    }

    /* renamed from: y */
    public boolean m3322y() {
        return (this.f3927V.getActions() & 516) != 0;
    }

    /* renamed from: z */
    public boolean m3323z() {
        return (this.f3927V.getActions() & 1) != 0;
    }
}
