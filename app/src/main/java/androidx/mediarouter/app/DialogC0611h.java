package androidx.mediarouter.app;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaControllerCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.Interpolator;
import android.view.animation.Transformation;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.amazonaws.mobileconnectors.p044s3.transferutility.TransferTable;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p049d.DialogC4281g;
import p192l1.C5648d;
import p192l1.C5650f;
import p192l1.C5651g;
import p192l1.C5653i;
import p192l1.C5654j;
import p208m1.AbstractC5897f;
import p208m1.C5900i;
import p208m1.C5901j;
import p221n0.C6611c;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/mediarouter/app/h.class
 */
/* renamed from: androidx.mediarouter.app.h */
/* loaded from: combined.jar:classes1.jar:androidx/mediarouter/app/h.class */
public class DialogC0611h extends DialogC4281g {

    /* renamed from: S */
    public static final boolean f4043S = Log.isLoggable("MediaRouteCtrlDialog", 3);

    /* renamed from: A */
    public ImageButton f4044A;

    /* renamed from: B */
    public Button f4045B;

    /* renamed from: C */
    public ImageView f4046C;

    /* renamed from: D */
    public View f4047D;

    /* renamed from: E */
    public ImageView f4048E;

    /* renamed from: F */
    public TextView f4049F;

    /* renamed from: G */
    public TextView f4050G;

    /* renamed from: H */
    public String f4051H;

    /* renamed from: I */
    public MediaControllerCompat f4052I;

    /* renamed from: J */
    public e f4053J;

    /* renamed from: K */
    public MediaDescriptionCompat f4054K;

    /* renamed from: L */
    public d f4055L;

    /* renamed from: M */
    public Bitmap f4056M;

    /* renamed from: N */
    public Uri f4057N;

    /* renamed from: O */
    public boolean f4058O;

    /* renamed from: P */
    public Bitmap f4059P;

    /* renamed from: Q */
    public int f4060Q;

    /* renamed from: R */
    public final boolean f4061R;

    /* renamed from: d */
    public final C5901j f4062d;

    /* renamed from: e */
    public final g f4063e;

    /* renamed from: f */
    public C5900i f4064f;

    /* renamed from: g */
    public C5901j.h f4065g;

    /* renamed from: h */
    public final List<C5901j.h> f4066h;

    /* renamed from: i */
    public final List<C5901j.h> f4067i;

    /* renamed from: j */
    public final List<C5901j.h> f4068j;

    /* renamed from: k */
    public final List<C5901j.h> f4069k;

    /* renamed from: l */
    public Context f4070l;

    /* renamed from: m */
    public boolean f4071m;

    /* renamed from: n */
    public boolean f4072n;

    /* renamed from: o */
    public long f4073o;

    /* renamed from: p */
    public final Handler f4074p;

    /* renamed from: q */
    public RecyclerView f4075q;

    /* renamed from: r */
    public h f4076r;

    /* renamed from: s */
    public j f4077s;

    /* renamed from: t */
    public Map<String, f> f4078t;

    /* renamed from: u */
    public C5901j.h f4079u;

    /* renamed from: v */
    public Map<String, Integer> f4080v;

    /* renamed from: w */
    public boolean f4081w;

    /* renamed from: x */
    public boolean f4082x;

    /* renamed from: y */
    public boolean f4083y;

    /* renamed from: z */
    public boolean f4084z;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/mediarouter/app/h$a.class
     */
    /* renamed from: androidx.mediarouter.app.h$a */
    /* loaded from: combined.jar:classes1.jar:androidx/mediarouter/app/h$a.class */
    public class a extends Handler {

        /* renamed from: a */
        public final DialogC0611h f4085a;

        public a(DialogC0611h dialogC0611h) {
            this.f4085a = dialogC0611h;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 1) {
                this.f4085a.m3376u();
                return;
            }
            if (i10 != 2) {
                return;
            }
            DialogC0611h dialogC0611h = this.f4085a;
            if (dialogC0611h.f4079u != null) {
                dialogC0611h.f4079u = null;
                dialogC0611h.m3377v();
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/mediarouter/app/h$b.class
     */
    /* renamed from: androidx.mediarouter.app.h$b */
    /* loaded from: combined.jar:classes1.jar:androidx/mediarouter/app/h$b.class */
    public class b implements View.OnClickListener {

        /* renamed from: b */
        public final DialogC0611h f4086b;

        public b(DialogC0611h dialogC0611h) {
            this.f4086b = dialogC0611h;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f4086b.dismiss();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/mediarouter/app/h$c.class
     */
    /* renamed from: androidx.mediarouter.app.h$c */
    /* loaded from: combined.jar:classes1.jar:androidx/mediarouter/app/h$c.class */
    public class c implements View.OnClickListener {

        /* renamed from: b */
        public final DialogC0611h f4087b;

        public c(DialogC0611h dialogC0611h) {
            this.f4087b = dialogC0611h;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (this.f4087b.f4065g.m28976C()) {
                this.f4087b.f4062d.m28889z(2);
            }
            this.f4087b.dismiss();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/mediarouter/app/h$d.class
     */
    /* renamed from: androidx.mediarouter.app.h$d */
    /* loaded from: combined.jar:classes1.jar:androidx/mediarouter/app/h$d.class */
    public class d extends AsyncTask<Void, Void, Bitmap> {

        /* renamed from: a */
        public final Bitmap f4088a;

        /* renamed from: b */
        public final Uri f4089b;

        /* renamed from: c */
        public int f4090c;

        /* renamed from: d */
        public final DialogC0611h f4091d;

        public d(DialogC0611h dialogC0611h) {
            this.f4091d = dialogC0611h;
            MediaDescriptionCompat mediaDescriptionCompat = dialogC0611h.f4054K;
            Bitmap iconBitmap = mediaDescriptionCompat == null ? null : mediaDescriptionCompat.getIconBitmap();
            Bitmap bitmap = iconBitmap;
            if (DialogC0611h.m3363i(iconBitmap)) {
                Log.w("MediaRouteCtrlDialog", "Can't fetch the given art bitmap because it's already recycled.");
                bitmap = null;
            }
            this.f4088a = bitmap;
            MediaDescriptionCompat mediaDescriptionCompat2 = dialogC0611h.f4054K;
            this.f4089b = mediaDescriptionCompat2 == null ? null : mediaDescriptionCompat2.getIconUri();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:136:0x0253  */
        /* JADX WARN: Removed duplicated region for block: B:138:0x0278  */
        /* JADX WARN: Type inference failed for: r0v37, types: [java.io.InputStream] */
        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public android.graphics.Bitmap doInBackground(java.lang.Void... r6) {
            /*
                Method dump skipped, instructions count: 726
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.mediarouter.app.DialogC0611h.d.doInBackground(java.lang.Void[]):android.graphics.Bitmap");
        }

        /* renamed from: b */
        public Bitmap m3379b() {
            return this.f4088a;
        }

        /* renamed from: c */
        public Uri m3380c() {
            return this.f4089b;
        }

        @Override // android.os.AsyncTask
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Bitmap bitmap) {
            DialogC0611h dialogC0611h = this.f4091d;
            dialogC0611h.f4055L = null;
            if (C6611c.m30516a(dialogC0611h.f4056M, this.f4088a) && C6611c.m30516a(this.f4091d.f4057N, this.f4089b)) {
                return;
            }
            DialogC0611h dialogC0611h2 = this.f4091d;
            dialogC0611h2.f4056M = this.f4088a;
            dialogC0611h2.f4059P = bitmap;
            dialogC0611h2.f4057N = this.f4089b;
            dialogC0611h2.f4060Q = this.f4090c;
            dialogC0611h2.f4058O = true;
            dialogC0611h2.m3374r();
        }

        /* renamed from: e */
        public final InputStream m3382e(Uri uri) {
            InputStream openInputStream;
            String lowerCase = uri.getScheme().toLowerCase();
            if ("android.resource".equals(lowerCase) || "content".equals(lowerCase) || TransferTable.COLUMN_FILE.equals(lowerCase)) {
                openInputStream = this.f4091d.f4070l.getContentResolver().openInputStream(uri);
            } else {
                URLConnection openConnection = new URL(uri.toString()).openConnection();
                openConnection.setConnectTimeout(30000);
                openConnection.setReadTimeout(30000);
                openInputStream = openConnection.getInputStream();
            }
            return openInputStream == null ? null : new BufferedInputStream(openInputStream);
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            this.f4091d.m3365f();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/mediarouter/app/h$e.class
     */
    /* renamed from: androidx.mediarouter.app.h$e */
    /* loaded from: combined.jar:classes1.jar:androidx/mediarouter/app/h$e.class */
    public final class e extends MediaControllerCompat.Callback {

        /* renamed from: a */
        public final DialogC0611h f4092a;

        public e(DialogC0611h dialogC0611h) {
            this.f4092a = dialogC0611h;
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.Callback
        public void onMetadataChanged(MediaMetadataCompat mediaMetadataCompat) {
            this.f4092a.f4054K = mediaMetadataCompat == null ? null : mediaMetadataCompat.getDescription();
            this.f4092a.m3369l();
            this.f4092a.m3374r();
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.Callback
        public void onSessionDestroyed() {
            DialogC0611h dialogC0611h = this.f4092a;
            MediaControllerCompat mediaControllerCompat = dialogC0611h.f4052I;
            if (mediaControllerCompat != null) {
                mediaControllerCompat.unregisterCallback(dialogC0611h.f4053J);
                this.f4092a.f4052I = null;
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/mediarouter/app/h$f.class
     */
    /* renamed from: androidx.mediarouter.app.h$f */
    /* loaded from: combined.jar:classes1.jar:androidx/mediarouter/app/h$f.class */
    public abstract class f extends RecyclerView.AbstractC0674e0 {

        /* renamed from: u */
        public C5901j.h f4093u;

        /* renamed from: v */
        public final ImageButton f4094v;

        /* renamed from: w */
        public final MediaRouteVolumeSlider f4095w;

        /* renamed from: x */
        public final DialogC0611h f4096x;

        /* JADX WARN: Classes with same name are omitted:
          classes1.jar:androidx/mediarouter/app/h$f$a.class
         */
        /* renamed from: androidx.mediarouter.app.h$f$a */
        /* loaded from: combined.jar:classes1.jar:androidx/mediarouter/app/h$f$a.class */
        public class a implements View.OnClickListener {

            /* renamed from: b */
            public final f f4097b;

            public a(f fVar) {
                this.f4097b = fVar;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                DialogC0611h dialogC0611h = this.f4097b.f4096x;
                if (dialogC0611h.f4079u != null) {
                    dialogC0611h.f4074p.removeMessages(2);
                }
                f fVar = this.f4097b;
                fVar.f4096x.f4079u = fVar.f4093u;
                boolean z10 = !view.isActivated();
                int m3384S = z10 ? 0 : this.f4097b.m3384S();
                this.f4097b.m3385T(z10);
                this.f4097b.f4095w.setProgress(m3384S);
                this.f4097b.f4093u.m28979G(m3384S);
                this.f4097b.f4096x.f4074p.sendEmptyMessageDelayed(2, 500L);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(DialogC0611h dialogC0611h, View view, ImageButton imageButton, MediaRouteVolumeSlider mediaRouteVolumeSlider) {
            super(view);
            this.f4096x = dialogC0611h;
            this.f4094v = imageButton;
            this.f4095w = mediaRouteVolumeSlider;
            imageButton.setImageDrawable(C0612i.m3417k(dialogC0611h.f4070l));
            C0612i.m3428v(dialogC0611h.f4070l, mediaRouteVolumeSlider);
        }

        /* renamed from: R */
        public void m3383R(C5901j.h hVar) {
            this.f4093u = hVar;
            int m29003s = hVar.m29003s();
            this.f4094v.setActivated(m29003s == 0);
            this.f4094v.setOnClickListener(new a(this));
            this.f4095w.setTag(this.f4093u);
            this.f4095w.setMax(hVar.m29005u());
            this.f4095w.setProgress(m29003s);
            this.f4095w.setOnSeekBarChangeListener(this.f4096x.f4077s);
        }

        /* renamed from: S */
        public int m3384S() {
            Integer num = this.f4096x.f4080v.get(this.f4093u.m28995k());
            int i10 = 1;
            if (num != null) {
                i10 = Math.max(1, num.intValue());
            }
            return i10;
        }

        /* renamed from: T */
        public void m3385T(boolean z10) {
            if (this.f4094v.isActivated() == z10) {
                return;
            }
            this.f4094v.setActivated(z10);
            if (z10) {
                this.f4096x.f4080v.put(this.f4093u.m28995k(), Integer.valueOf(this.f4095w.getProgress()));
            } else {
                this.f4096x.f4080v.remove(this.f4093u.m28995k());
            }
        }

        /* renamed from: U */
        public void m3386U() {
            int m29003s = this.f4093u.m29003s();
            m3385T(m29003s == 0);
            this.f4095w.setProgress(m29003s);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/mediarouter/app/h$g.class
     */
    /* renamed from: androidx.mediarouter.app.h$g */
    /* loaded from: combined.jar:classes1.jar:androidx/mediarouter/app/h$g.class */
    public final class g extends C5901j.a {

        /* renamed from: a */
        public final DialogC0611h f4098a;

        public g(DialogC0611h dialogC0611h) {
            this.f4098a = dialogC0611h;
        }

        @Override // p208m1.C5901j.a
        /* renamed from: d */
        public void mo3234d(C5901j c5901j, C5901j.h hVar) {
            this.f4098a.m3376u();
        }

        @Override // p208m1.C5901j.a
        /* renamed from: e */
        public void mo3235e(C5901j c5901j, C5901j.h hVar) {
            boolean z10;
            C5901j.h.a m28992h;
            if (hVar == this.f4098a.f4065g && hVar.m28991g() != null) {
                for (C5901j.h hVar2 : hVar.m29001q().m28970f()) {
                    if (!this.f4098a.f4065g.m28996l().contains(hVar2) && (m28992h = this.f4098a.f4065g.m28992h(hVar2)) != null && m28992h.m29012b() && !this.f4098a.f4067i.contains(hVar2)) {
                        z10 = true;
                        break;
                    }
                }
            }
            z10 = false;
            if (!z10) {
                this.f4098a.m3376u();
            } else {
                this.f4098a.m3377v();
                this.f4098a.m3375t();
            }
        }

        @Override // p208m1.C5901j.a
        /* renamed from: g */
        public void mo3236g(C5901j c5901j, C5901j.h hVar) {
            this.f4098a.m3376u();
        }

        @Override // p208m1.C5901j.a
        /* renamed from: h */
        public void mo3250h(C5901j c5901j, C5901j.h hVar) {
            DialogC0611h dialogC0611h = this.f4098a;
            dialogC0611h.f4065g = hVar;
            dialogC0611h.f4081w = false;
            dialogC0611h.m3377v();
            this.f4098a.m3375t();
        }

        @Override // p208m1.C5901j.a
        /* renamed from: k */
        public void mo3251k(C5901j c5901j, C5901j.h hVar) {
            this.f4098a.m3376u();
        }

        @Override // p208m1.C5901j.a
        /* renamed from: m */
        public void mo3329m(C5901j c5901j, C5901j.h hVar) {
            f fVar;
            int m29003s = hVar.m29003s();
            if (DialogC0611h.f4043S) {
                Log.d("MediaRouteCtrlDialog", "onRouteVolumeChanged(), route.getVolume:" + m29003s);
            }
            DialogC0611h dialogC0611h = this.f4098a;
            if (dialogC0611h.f4079u == hVar || (fVar = dialogC0611h.f4078t.get(hVar.m28995k())) == null) {
                return;
            }
            fVar.m3386U();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/mediarouter/app/h$h.class
     */
    /* renamed from: androidx.mediarouter.app.h$h */
    /* loaded from: combined.jar:classes1.jar:androidx/mediarouter/app/h$h.class */
    public final class h extends RecyclerView.AbstractC0677h<RecyclerView.AbstractC0674e0> {

        /* renamed from: f */
        public final LayoutInflater f4100f;

        /* renamed from: g */
        public final Drawable f4101g;

        /* renamed from: h */
        public final Drawable f4102h;

        /* renamed from: i */
        public final Drawable f4103i;

        /* renamed from: j */
        public final Drawable f4104j;

        /* renamed from: k */
        public f f4105k;

        /* renamed from: l */
        public final int f4106l;

        /* renamed from: n */
        public final DialogC0611h f4108n;

        /* renamed from: e */
        public final ArrayList<f> f4099e = new ArrayList<>();

        /* renamed from: m */
        public final Interpolator f4107m = new AccelerateDecelerateInterpolator();

        /* JADX WARN: Classes with same name are omitted:
          classes1.jar:androidx/mediarouter/app/h$h$a.class
         */
        /* renamed from: androidx.mediarouter.app.h$h$a */
        /* loaded from: combined.jar:classes1.jar:androidx/mediarouter/app/h$h$a.class */
        public class a extends Animation {

            /* renamed from: b */
            public final int f4109b;

            /* renamed from: c */
            public final int f4110c;

            /* renamed from: d */
            public final View f4111d;

            /* renamed from: e */
            public final h f4112e;

            public a(h hVar, int i10, int i11, View view) {
                this.f4112e = hVar;
                this.f4109b = i10;
                this.f4110c = i11;
                this.f4111d = view;
            }

            @Override // android.view.animation.Animation
            public void applyTransformation(float f10, Transformation transformation) {
                int i10 = this.f4109b;
                DialogC0611h.m3364m(this.f4111d, this.f4110c + ((int) ((i10 - r0) * f10)));
            }
        }

        /* JADX WARN: Classes with same name are omitted:
          classes1.jar:androidx/mediarouter/app/h$h$b.class
         */
        /* renamed from: androidx.mediarouter.app.h$h$b */
        /* loaded from: combined.jar:classes1.jar:androidx/mediarouter/app/h$h$b.class */
        public class b implements Animation.AnimationListener {

            /* renamed from: a */
            public final h f4113a;

            public b(h hVar) {
                this.f4113a = hVar;
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                DialogC0611h dialogC0611h = this.f4113a.f4108n;
                dialogC0611h.f4082x = false;
                dialogC0611h.m3377v();
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
                this.f4113a.f4108n.f4082x = true;
            }
        }

        /* JADX WARN: Classes with same name are omitted:
          classes1.jar:androidx/mediarouter/app/h$h$c.class
         */
        /* renamed from: androidx.mediarouter.app.h$h$c */
        /* loaded from: combined.jar:classes1.jar:androidx/mediarouter/app/h$h$c.class */
        public class c extends RecyclerView.AbstractC0674e0 {

            /* renamed from: A */
            public final h f4114A;

            /* renamed from: u */
            public final View f4115u;

            /* renamed from: v */
            public final ImageView f4116v;

            /* renamed from: w */
            public final ProgressBar f4117w;

            /* renamed from: x */
            public final TextView f4118x;

            /* renamed from: y */
            public final float f4119y;

            /* renamed from: z */
            public C5901j.h f4120z;

            /* JADX WARN: Classes with same name are omitted:
              classes1.jar:androidx/mediarouter/app/h$h$c$a.class
             */
            /* renamed from: androidx.mediarouter.app.h$h$c$a */
            /* loaded from: combined.jar:classes1.jar:androidx/mediarouter/app/h$h$c$a.class */
            public class a implements View.OnClickListener {

                /* renamed from: b */
                public final c f4121b;

                public a(c cVar) {
                    this.f4121b = cVar;
                }

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    c cVar = this.f4121b;
                    cVar.f4114A.f4108n.f4062d.m28888y(cVar.f4120z);
                    this.f4121b.f4116v.setVisibility(4);
                    this.f4121b.f4117w.setVisibility(0);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(h hVar, View view) {
                super(view);
                this.f4114A = hVar;
                this.f4115u = view;
                this.f4116v = (ImageView) view.findViewById(C5650f.f31838d);
                ProgressBar progressBar = (ProgressBar) view.findViewById(C5650f.f31840f);
                this.f4117w = progressBar;
                this.f4118x = (TextView) view.findViewById(C5650f.f31839e);
                this.f4119y = C0612i.m3414h(hVar.f4108n.f4070l);
                C0612i.m3426t(hVar.f4108n.f4070l, progressBar);
            }

            /* renamed from: R */
            public void m3395R(f fVar) {
                C5901j.h hVar = (C5901j.h) fVar.m3400a();
                this.f4120z = hVar;
                this.f4116v.setVisibility(0);
                this.f4117w.setVisibility(4);
                this.f4115u.setAlpha(m3396S(hVar) ? 1.0f : this.f4119y);
                this.f4115u.setOnClickListener(new a(this));
                this.f4116v.setImageDrawable(this.f4114A.m3389f0(hVar));
                this.f4118x.setText(hVar.m28997m());
            }

            /* renamed from: S */
            public final boolean m3396S(C5901j.h hVar) {
                List<C5901j.h> m28996l = this.f4114A.f4108n.f4065g.m28996l();
                return (m28996l.size() == 1 && m28996l.get(0) == hVar) ? false : true;
            }
        }

        /* JADX WARN: Classes with same name are omitted:
          classes1.jar:androidx/mediarouter/app/h$h$d.class
         */
        /* renamed from: androidx.mediarouter.app.h$h$d */
        /* loaded from: combined.jar:classes1.jar:androidx/mediarouter/app/h$h$d.class */
        public class d extends f {

            /* renamed from: A */
            public final h f4122A;

            /* renamed from: y */
            public final TextView f4123y;

            /* renamed from: z */
            public final int f4124z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(h hVar, View view) {
                super(hVar.f4108n, view, (ImageButton) view.findViewById(C5650f.f31848n), (MediaRouteVolumeSlider) view.findViewById(C5650f.f31854t));
                this.f4122A = hVar;
                this.f4123y = (TextView) view.findViewById(C5650f.f31820L);
                Resources resources = hVar.f4108n.f4070l.getResources();
                DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                TypedValue typedValue = new TypedValue();
                resources.getValue(C5648d.f31804i, typedValue, true);
                this.f4124z = (int) typedValue.getDimension(displayMetrics);
            }

            /* renamed from: V */
            public void m3397V(f fVar) {
                DialogC0611h.m3364m(this.f4620a, this.f4122A.m3391h0() ? this.f4124z : 0);
                C5901j.h hVar = (C5901j.h) fVar.m3400a();
                super.m3383R(hVar);
                this.f4123y.setText(hVar.m28997m());
            }

            /* renamed from: W */
            public int m3398W() {
                return this.f4124z;
            }
        }

        /* JADX WARN: Classes with same name are omitted:
          classes1.jar:androidx/mediarouter/app/h$h$e.class
         */
        /* renamed from: androidx.mediarouter.app.h$h$e */
        /* loaded from: combined.jar:classes1.jar:androidx/mediarouter/app/h$h$e.class */
        public class e extends RecyclerView.AbstractC0674e0 {

            /* renamed from: u */
            public final TextView f4125u;

            /* renamed from: v */
            public final h f4126v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(h hVar, View view) {
                super(view);
                this.f4126v = hVar;
                this.f4125u = (TextView) view.findViewById(C5650f.f31841g);
            }

            /* renamed from: R */
            public void m3399R(f fVar) {
                this.f4125u.setText(fVar.m3400a().toString());
            }
        }

        /* JADX WARN: Classes with same name are omitted:
          classes1.jar:androidx/mediarouter/app/h$h$f.class
         */
        /* renamed from: androidx.mediarouter.app.h$h$f */
        /* loaded from: combined.jar:classes1.jar:androidx/mediarouter/app/h$h$f.class */
        public class f {

            /* renamed from: a */
            public final Object f4127a;

            /* renamed from: b */
            public final int f4128b;

            /* renamed from: c */
            public final h f4129c;

            public f(h hVar, Object obj, int i10) {
                this.f4129c = hVar;
                this.f4127a = obj;
                this.f4128b = i10;
            }

            /* renamed from: a */
            public Object m3400a() {
                return this.f4127a;
            }

            /* renamed from: b */
            public int m3401b() {
                return this.f4128b;
            }
        }

        /* JADX WARN: Classes with same name are omitted:
          classes1.jar:androidx/mediarouter/app/h$h$g.class
         */
        /* renamed from: androidx.mediarouter.app.h$h$g */
        /* loaded from: combined.jar:classes1.jar:androidx/mediarouter/app/h$h$g.class */
        public class g extends f {

            /* renamed from: A */
            public final ProgressBar f4130A;

            /* renamed from: B */
            public final TextView f4131B;

            /* renamed from: C */
            public final RelativeLayout f4132C;

            /* renamed from: D */
            public final CheckBox f4133D;

            /* renamed from: E */
            public final float f4134E;

            /* renamed from: F */
            public final int f4135F;

            /* renamed from: G */
            public final int f4136G;

            /* renamed from: H */
            public final View.OnClickListener f4137H;

            /* renamed from: I */
            public final h f4138I;

            /* renamed from: y */
            public final View f4139y;

            /* renamed from: z */
            public final ImageView f4140z;

            /* JADX WARN: Classes with same name are omitted:
              classes1.jar:androidx/mediarouter/app/h$h$g$a.class
             */
            /* renamed from: androidx.mediarouter.app.h$h$g$a */
            /* loaded from: combined.jar:classes1.jar:androidx/mediarouter/app/h$h$g$a.class */
            public class a implements View.OnClickListener {

                /* renamed from: b */
                public final g f4141b;

                public a(g gVar) {
                    this.f4141b = gVar;
                }

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    g gVar = this.f4141b;
                    boolean z10 = !gVar.m3404X(gVar.f4093u);
                    boolean m29009y = this.f4141b.f4093u.m29009y();
                    g gVar2 = this.f4141b;
                    C5901j c5901j = gVar2.f4138I.f4108n.f4062d;
                    C5901j.h hVar = gVar2.f4093u;
                    if (z10) {
                        c5901j.m28873c(hVar);
                    } else {
                        c5901j.m28883t(hVar);
                    }
                    this.f4141b.m3405Y(z10, !m29009y);
                    if (m29009y) {
                        List<C5901j.h> m28996l = this.f4141b.f4138I.f4108n.f4065g.m28996l();
                        for (C5901j.h hVar2 : this.f4141b.f4093u.m28996l()) {
                            if (m28996l.contains(hVar2) != z10) {
                                f fVar = this.f4141b.f4138I.f4108n.f4078t.get(hVar2.m28995k());
                                if (fVar instanceof g) {
                                    ((g) fVar).m3405Y(z10, true);
                                }
                            }
                        }
                    }
                    g gVar3 = this.f4141b;
                    gVar3.f4138I.m3392i0(gVar3.f4093u, z10);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public g(h hVar, View view) {
                super(hVar.f4108n, view, (ImageButton) view.findViewById(C5650f.f31848n), (MediaRouteVolumeSlider) view.findViewById(C5650f.f31854t));
                this.f4138I = hVar;
                this.f4137H = new a(this);
                this.f4139y = view;
                this.f4140z = (ImageView) view.findViewById(C5650f.f31849o);
                ProgressBar progressBar = (ProgressBar) view.findViewById(C5650f.f31851q);
                this.f4130A = progressBar;
                this.f4131B = (TextView) view.findViewById(C5650f.f31850p);
                this.f4132C = (RelativeLayout) view.findViewById(C5650f.f31853s);
                CheckBox checkBox = (CheckBox) view.findViewById(C5650f.f31836b);
                this.f4133D = checkBox;
                checkBox.setButtonDrawable(C0612i.m3411e(hVar.f4108n.f4070l));
                C0612i.m3426t(hVar.f4108n.f4070l, progressBar);
                this.f4134E = C0612i.m3414h(hVar.f4108n.f4070l);
                Resources resources = hVar.f4108n.f4070l.getResources();
                DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                TypedValue typedValue = new TypedValue();
                resources.getValue(C5648d.f31803h, typedValue, true);
                this.f4135F = (int) typedValue.getDimension(displayMetrics);
                this.f4136G = 0;
            }

            /* JADX WARN: Code restructure failed: missing block: B:21:0x00fa, code lost:
            
                if (r0 != false) goto L22;
             */
            /* renamed from: V */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public void m3402V(androidx.mediarouter.app.DialogC0611h.h.f r5) {
                /*
                    Method dump skipped, instructions count: 393
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.mediarouter.app.DialogC0611h.h.g.m3402V(androidx.mediarouter.app.h$h$f):void");
            }

            /* renamed from: W */
            public final boolean m3403W(C5901j.h hVar) {
                if (this.f4138I.f4108n.f4069k.contains(hVar)) {
                    return false;
                }
                if (m3404X(hVar) && this.f4138I.f4108n.f4065g.m28996l().size() < 2) {
                    return false;
                }
                if (!m3404X(hVar)) {
                    return true;
                }
                C5901j.h.a m28992h = this.f4138I.f4108n.f4065g.m28992h(hVar);
                boolean z10 = false;
                if (m28992h != null) {
                    z10 = false;
                    if (m28992h.m29014d()) {
                        z10 = true;
                    }
                }
                return z10;
            }

            /* renamed from: X */
            public boolean m3404X(C5901j.h hVar) {
                boolean z10 = true;
                if (hVar.m28976C()) {
                    return true;
                }
                C5901j.h.a m28992h = this.f4138I.f4108n.f4065g.m28992h(hVar);
                if (m28992h == null || m28992h.m29011a() != 3) {
                    z10 = false;
                }
                return z10;
            }

            /* renamed from: Y */
            public void m3405Y(boolean z10, boolean z11) {
                this.f4133D.setEnabled(false);
                this.f4139y.setEnabled(false);
                this.f4133D.setChecked(z10);
                if (z10) {
                    this.f4140z.setVisibility(4);
                    this.f4130A.setVisibility(0);
                }
                if (z11) {
                    this.f4138I.m3387d0(this.f4132C, z10 ? this.f4135F : this.f4136G);
                }
            }
        }

        public h(DialogC0611h dialogC0611h) {
            this.f4108n = dialogC0611h;
            this.f4100f = LayoutInflater.from(dialogC0611h.f4070l);
            this.f4101g = C0612i.m3413g(dialogC0611h.f4070l);
            this.f4102h = C0612i.m3423q(dialogC0611h.f4070l);
            this.f4103i = C0612i.m3419m(dialogC0611h.f4070l);
            this.f4104j = C0612i.m3420n(dialogC0611h.f4070l);
            this.f4106l = dialogC0611h.f4070l.getResources().getInteger(C5651g.f31861a);
            m3394k0();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0677h
        /* renamed from: G */
        public void mo2996G(RecyclerView.AbstractC0674e0 abstractC0674e0, int i10) {
            int mo3018q = mo3018q(i10);
            f m3390g0 = m3390g0(i10);
            if (mo3018q == 1) {
                this.f4108n.f4078t.put(((C5901j.h) m3390g0.m3400a()).m28995k(), (f) abstractC0674e0);
                ((d) abstractC0674e0).m3397V(m3390g0);
            } else {
                if (mo3018q == 2) {
                    ((e) abstractC0674e0).m3399R(m3390g0);
                    return;
                }
                if (mo3018q == 3) {
                    this.f4108n.f4078t.put(((C5901j.h) m3390g0.m3400a()).m28995k(), (f) abstractC0674e0);
                    ((g) abstractC0674e0).m3402V(m3390g0);
                } else if (mo3018q != 4) {
                    Log.w("MediaRouteCtrlDialog", "Cannot bind item to ViewHolder because of wrong view type");
                } else {
                    ((c) abstractC0674e0).m3395R(m3390g0);
                }
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0677h
        /* renamed from: J */
        public RecyclerView.AbstractC0674e0 mo2998J(ViewGroup viewGroup, int i10) {
            if (i10 == 1) {
                return new d(this, this.f4100f.inflate(C5653i.f31870c, viewGroup, false));
            }
            if (i10 == 2) {
                return new e(this, this.f4100f.inflate(C5653i.f31871d, viewGroup, false));
            }
            if (i10 == 3) {
                return new g(this, this.f4100f.inflate(C5653i.f31872e, viewGroup, false));
            }
            if (i10 == 4) {
                return new c(this, this.f4100f.inflate(C5653i.f31869b, viewGroup, false));
            }
            Log.w("MediaRouteCtrlDialog", "Cannot create ViewHolder because of wrong view type");
            return null;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0677h
        /* renamed from: T */
        public void mo3002T(RecyclerView.AbstractC0674e0 abstractC0674e0) {
            super.mo3002T(abstractC0674e0);
            this.f4108n.f4078t.values().remove(abstractC0674e0);
        }

        /* renamed from: d0 */
        public void m3387d0(View view, int i10) {
            a aVar = new a(this, i10, view.getLayoutParams().height, view);
            aVar.setAnimationListener(new b(this));
            aVar.setDuration(this.f4106l);
            aVar.setInterpolator(this.f4107m);
            view.startAnimation(aVar);
        }

        /* renamed from: e0 */
        public final Drawable m3388e0(C5901j.h hVar) {
            int m28990f = hVar.m28990f();
            return m28990f != 1 ? m28990f != 2 ? hVar.m29009y() ? this.f4104j : this.f4101g : this.f4103i : this.f4102h;
        }

        /* renamed from: f0 */
        public Drawable m3389f0(C5901j.h hVar) {
            Uri m28994j = hVar.m28994j();
            if (m28994j != null) {
                try {
                    Drawable createFromStream = Drawable.createFromStream(this.f4108n.f4070l.getContentResolver().openInputStream(m28994j), null);
                    if (createFromStream != null) {
                        return createFromStream;
                    }
                } catch (IOException e10) {
                    Log.w("MediaRouteCtrlDialog", "Failed to load " + m28994j, e10);
                }
            }
            return m3388e0(hVar);
        }

        /* renamed from: g0 */
        public f m3390g0(int i10) {
            return i10 == 0 ? this.f4105k : this.f4099e.get(i10 - 1);
        }

        /* renamed from: h0 */
        public boolean m3391h0() {
            DialogC0611h dialogC0611h = this.f4108n;
            boolean z10 = true;
            if (!dialogC0611h.f4061R || dialogC0611h.f4065g.m28996l().size() <= 1) {
                z10 = false;
            }
            return z10;
        }

        /* renamed from: i0 */
        public void m3392i0(C5901j.h hVar, boolean z10) {
            int i10;
            List<C5901j.h> m28996l = this.f4108n.f4065g.m28996l();
            int max = Math.max(1, m28996l.size());
            int i11 = -1;
            if (hVar.m29009y()) {
                Iterator<C5901j.h> it = hVar.m28996l().iterator();
                int i12 = max;
                while (true) {
                    i10 = i12;
                    if (!it.hasNext()) {
                        break;
                    } else if (m28996l.contains(it.next()) != z10) {
                        i12 += z10 ? 1 : -1;
                    }
                }
            } else {
                if (z10) {
                    i11 = 1;
                }
                i10 = max + i11;
            }
            boolean m3391h0 = m3391h0();
            DialogC0611h dialogC0611h = this.f4108n;
            int i13 = 0;
            boolean z11 = dialogC0611h.f4061R && i10 >= 2;
            if (m3391h0 != z11) {
                RecyclerView.AbstractC0674e0 m3917Z = dialogC0611h.f4075q.m3917Z(0);
                if (m3917Z instanceof d) {
                    d dVar = (d) m3917Z;
                    View view = dVar.f4620a;
                    if (z11) {
                        i13 = dVar.m3398W();
                    }
                    m3387d0(view, i13);
                }
            }
        }

        /* renamed from: j0 */
        public void m3393j0() {
            this.f4108n.f4069k.clear();
            DialogC0611h dialogC0611h = this.f4108n;
            dialogC0611h.f4069k.addAll(C0609f.m3344g(dialogC0611h.f4067i, dialogC0611h.m3366h()));
            m4099w();
        }

        /* renamed from: k0 */
        public void m3394k0() {
            this.f4099e.clear();
            this.f4105k = new f(this, this.f4108n.f4065g, 1);
            if (this.f4108n.f4066h.isEmpty()) {
                this.f4099e.add(new f(this, this.f4108n.f4065g, 3));
            } else {
                Iterator<C5901j.h> it = this.f4108n.f4066h.iterator();
                while (it.hasNext()) {
                    this.f4099e.add(new f(this, it.next(), 3));
                }
            }
            if (!this.f4108n.f4067i.isEmpty()) {
                boolean z10 = false;
                for (C5901j.h hVar : this.f4108n.f4067i) {
                    if (!this.f4108n.f4066h.contains(hVar)) {
                        boolean z11 = z10;
                        if (!z10) {
                            AbstractC5897f.b m28991g = this.f4108n.f4065g.m28991g();
                            String mo28822j = m28991g != null ? m28991g.mo28822j() : null;
                            String str = mo28822j;
                            if (TextUtils.isEmpty(mo28822j)) {
                                str = this.f4108n.f4070l.getString(C5654j.f31896q);
                            }
                            this.f4099e.add(new f(this, str, 2));
                            z11 = true;
                        }
                        this.f4099e.add(new f(this, hVar, 3));
                        z10 = z11;
                    }
                }
            }
            if (!this.f4108n.f4068j.isEmpty()) {
                boolean z12 = false;
                for (C5901j.h hVar2 : this.f4108n.f4068j) {
                    C5901j.h hVar3 = this.f4108n.f4065g;
                    if (hVar3 != hVar2) {
                        boolean z13 = z12;
                        if (!z12) {
                            AbstractC5897f.b m28991g2 = hVar3.m28991g();
                            String mo28823k = m28991g2 != null ? m28991g2.mo28823k() : null;
                            String str2 = mo28823k;
                            if (TextUtils.isEmpty(mo28823k)) {
                                str2 = this.f4108n.f4070l.getString(C5654j.f31897r);
                            }
                            this.f4099e.add(new f(this, str2, 2));
                            z13 = true;
                        }
                        this.f4099e.add(new f(this, hVar2, 4));
                        z12 = z13;
                    }
                }
            }
            m3393j0();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0677h
        /* renamed from: n */
        public int mo3013n() {
            return this.f4099e.size() + 1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0677h
        /* renamed from: q */
        public int mo3018q(int i10) {
            return m3390g0(i10).m3401b();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/mediarouter/app/h$i.class
     */
    /* renamed from: androidx.mediarouter.app.h$i */
    /* loaded from: combined.jar:classes1.jar:androidx/mediarouter/app/h$i.class */
    public static final class i implements Comparator<C5901j.h> {

        /* renamed from: b */
        public static final i f4142b = new i();

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(C5901j.h hVar, C5901j.h hVar2) {
            return hVar.m28997m().compareToIgnoreCase(hVar2.m28997m());
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/mediarouter/app/h$j.class
     */
    /* renamed from: androidx.mediarouter.app.h$j */
    /* loaded from: combined.jar:classes1.jar:androidx/mediarouter/app/h$j.class */
    public class j implements SeekBar.OnSeekBarChangeListener {

        /* renamed from: b */
        public final DialogC0611h f4143b;

        public j(DialogC0611h dialogC0611h) {
            this.f4143b = dialogC0611h;
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i10, boolean z10) {
            if (z10) {
                C5901j.h hVar = (C5901j.h) seekBar.getTag();
                f fVar = this.f4143b.f4078t.get(hVar.m28995k());
                if (fVar != null) {
                    fVar.m3385T(i10 == 0);
                }
                hVar.m28979G(i10);
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
            DialogC0611h dialogC0611h = this.f4143b;
            if (dialogC0611h.f4079u != null) {
                dialogC0611h.f4074p.removeMessages(2);
            }
            this.f4143b.f4079u = (C5901j.h) seekBar.getTag();
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            this.f4143b.f4074p.sendEmptyMessageDelayed(2, 500L);
        }
    }

    public DialogC0611h(Context context) {
        this(context, 0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public DialogC0611h(android.content.Context r6, int r7) {
        /*
            r5 = this;
            r0 = r6
            r1 = r7
            r2 = 0
            android.content.Context r0 = androidx.mediarouter.app.C0612i.m3408b(r0, r1, r2)
            r6 = r0
            r0 = r5
            r1 = r6
            r2 = r6
            int r2 = androidx.mediarouter.app.C0612i.m3409c(r2)
            r0.<init>(r1, r2)
            r0 = r5
            m1.i r1 = p208m1.C5900i.f33081c
            r0.f4064f = r1
            r0 = r5
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = r1
            r2.<init>()
            r0.f4066h = r1
            r0 = r5
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = r1
            r2.<init>()
            r0.f4067i = r1
            r0 = r5
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = r1
            r2.<init>()
            r0.f4068j = r1
            r0 = r5
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = r1
            r2.<init>()
            r0.f4069k = r1
            r0 = r5
            androidx.mediarouter.app.h$a r1 = new androidx.mediarouter.app.h$a
            r2 = r1
            r3 = r5
            r2.<init>(r3)
            r0.f4074p = r1
            r0 = r5
            android.content.Context r0 = r0.getContext()
            r6 = r0
            r0 = r5
            r1 = r6
            r0.f4070l = r1
            r0 = r6
            m1.j r0 = p208m1.C5901j.m28867j(r0)
            r6 = r0
            r0 = r5
            r1 = r6
            r0.f4062d = r1
            r0 = r5
            boolean r1 = p208m1.C5901j.m28868o()
            r0.f4061R = r1
            r0 = r5
            androidx.mediarouter.app.h$g r1 = new androidx.mediarouter.app.h$g
            r2 = r1
            r3 = r5
            r2.<init>(r3)
            r0.f4063e = r1
            r0 = r5
            r1 = r6
            m1.j$h r1 = r1.m28880n()
            r0.f4065g = r1
            r0 = r5
            androidx.mediarouter.app.h$e r1 = new androidx.mediarouter.app.h$e
            r2 = r1
            r3 = r5
            r2.<init>(r3)
            r0.f4053J = r1
            r0 = r5
            r1 = r6
            android.support.v4.media.session.MediaSessionCompat$Token r1 = r1.m28877k()
            r0.m3370n(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.mediarouter.app.DialogC0611h.<init>(android.content.Context, int):void");
    }

    /* renamed from: e */
    public static Bitmap m3362e(Bitmap bitmap, float f10, Context context) {
        RenderScript create = RenderScript.create(context);
        Allocation createFromBitmap = Allocation.createFromBitmap(create, bitmap);
        Allocation createTyped = Allocation.createTyped(create, createFromBitmap.getType());
        ScriptIntrinsicBlur create2 = ScriptIntrinsicBlur.create(create, Element.U8_4(create));
        create2.setRadius(f10);
        create2.setInput(createFromBitmap);
        create2.forEach(createTyped);
        Bitmap copy = bitmap.copy(bitmap.getConfig(), true);
        createTyped.copyTo(copy);
        createFromBitmap.destroy();
        createTyped.destroy();
        create2.destroy();
        create.destroy();
        return copy;
    }

    /* renamed from: i */
    public static boolean m3363i(Bitmap bitmap) {
        return bitmap != null && bitmap.isRecycled();
    }

    /* renamed from: m */
    public static void m3364m(View view, int i10) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = i10;
        view.setLayoutParams(layoutParams);
    }

    /* renamed from: f */
    public void m3365f() {
        this.f4058O = false;
        this.f4059P = null;
        this.f4060Q = 0;
    }

    /* renamed from: h */
    public List<C5901j.h> m3366h() {
        ArrayList arrayList = new ArrayList();
        for (C5901j.h hVar : this.f4065g.m29001q().m28970f()) {
            C5901j.h.a m28992h = this.f4065g.m28992h(hVar);
            if (m28992h != null && m28992h.m29012b()) {
                arrayList.add(hVar);
            }
        }
        return arrayList;
    }

    /* renamed from: j */
    public boolean m3367j(C5901j.h hVar) {
        return !hVar.m29007w() && hVar.m29008x() && hVar.m28977E(this.f4064f) && this.f4065g != hVar;
    }

    /* renamed from: k */
    public void m3368k(List<C5901j.h> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            if (!m3367j(list.get(size))) {
                list.remove(size);
            }
        }
    }

    /* renamed from: l */
    public void m3369l() {
        MediaDescriptionCompat mediaDescriptionCompat = this.f4054K;
        Uri uri = null;
        Bitmap iconBitmap = mediaDescriptionCompat == null ? null : mediaDescriptionCompat.getIconBitmap();
        MediaDescriptionCompat mediaDescriptionCompat2 = this.f4054K;
        if (mediaDescriptionCompat2 != null) {
            uri = mediaDescriptionCompat2.getIconUri();
        }
        d dVar = this.f4055L;
        Bitmap m3379b = dVar == null ? this.f4056M : dVar.m3379b();
        d dVar2 = this.f4055L;
        Uri m3380c = dVar2 == null ? this.f4057N : dVar2.m3380c();
        if (m3379b != iconBitmap || (m3379b == null && !C6611c.m30516a(m3380c, uri))) {
            d dVar3 = this.f4055L;
            if (dVar3 != null) {
                dVar3.cancel(true);
            }
            d dVar4 = new d(this);
            this.f4055L = dVar4;
            dVar4.execute(new Void[0]);
        }
    }

    /* renamed from: n */
    public final void m3370n(MediaSessionCompat.Token token) {
        MediaControllerCompat mediaControllerCompat = this.f4052I;
        if (mediaControllerCompat != null) {
            mediaControllerCompat.unregisterCallback(this.f4053J);
            this.f4052I = null;
        }
        if (token != null && this.f4072n) {
            MediaControllerCompat mediaControllerCompat2 = new MediaControllerCompat(this.f4070l, token);
            this.f4052I = mediaControllerCompat2;
            mediaControllerCompat2.registerCallback(this.f4053J);
            MediaMetadataCompat metadata = this.f4052I.getMetadata();
            this.f4054K = metadata == null ? null : metadata.getDescription();
            m3369l();
            m3374r();
        }
    }

    /* renamed from: o */
    public void m3371o(C5900i c5900i) {
        if (c5900i == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        if (this.f4064f.equals(c5900i)) {
            return;
        }
        this.f4064f = c5900i;
        if (this.f4072n) {
            this.f4062d.m28882s(this.f4063e);
            this.f4062d.m28872b(c5900i, this.f4063e, 1);
            m3375t();
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f4072n = true;
        this.f4062d.m28872b(this.f4064f, this.f4063e, 1);
        m3375t();
        m3370n(this.f4062d.m28877k());
    }

    @Override // p049d.DialogC4281g, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C5653i.f31868a);
        C0612i.m3425s(this.f4070l, this);
        ImageButton imageButton = (ImageButton) findViewById(C5650f.f31837c);
        this.f4044A = imageButton;
        imageButton.setColorFilter(-1);
        this.f4044A.setOnClickListener(new b(this));
        Button button = (Button) findViewById(C5650f.f31852r);
        this.f4045B = button;
        button.setTextColor(-1);
        this.f4045B.setOnClickListener(new c(this));
        this.f4076r = new h(this);
        RecyclerView recyclerView = (RecyclerView) findViewById(C5650f.f31842h);
        this.f4075q = recyclerView;
        recyclerView.setAdapter(this.f4076r);
        this.f4075q.setLayoutManager(new LinearLayoutManager(this.f4070l));
        this.f4077s = new j(this);
        this.f4078t = new HashMap();
        this.f4080v = new HashMap();
        this.f4046C = (ImageView) findViewById(C5650f.f31844j);
        this.f4047D = findViewById(C5650f.f31845k);
        this.f4048E = (ImageView) findViewById(C5650f.f31843i);
        TextView textView = (TextView) findViewById(C5650f.f31847m);
        this.f4049F = textView;
        textView.setTextColor(-1);
        TextView textView2 = (TextView) findViewById(C5650f.f31846l);
        this.f4050G = textView2;
        textView2.setTextColor(-1);
        this.f4051H = this.f4070l.getResources().getString(C5654j.f31883d);
        this.f4071m = true;
        m3373q();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f4072n = false;
        this.f4062d.m28882s(this.f4063e);
        this.f4074p.removeCallbacksAndMessages(null);
        m3370n(null);
    }

    /* renamed from: p */
    public final boolean m3372p() {
        if (this.f4079u != null || this.f4081w || this.f4082x) {
            return true;
        }
        return !this.f4071m;
    }

    /* renamed from: q */
    public void m3373q() {
        getWindow().setLayout(C0609f.m3340c(this.f4070l), C0609f.m3338a(this.f4070l));
        this.f4056M = null;
        this.f4057N = null;
        m3369l();
        m3374r();
        m3376u();
    }

    /* renamed from: r */
    public void m3374r() {
        if (m3372p()) {
            this.f4084z = true;
            return;
        }
        this.f4084z = false;
        if (!this.f4065g.m28976C() || this.f4065g.m29007w()) {
            dismiss();
        }
        CharSequence charSequence = null;
        if (!this.f4058O || m3363i(this.f4059P) || this.f4059P == null) {
            if (m3363i(this.f4059P)) {
                Log.w("MediaRouteCtrlDialog", "Can't set artwork image with recycled bitmap: " + this.f4059P);
            }
            this.f4048E.setVisibility(8);
            this.f4047D.setVisibility(8);
            this.f4046C.setImageBitmap(null);
        } else {
            this.f4048E.setVisibility(0);
            this.f4048E.setImageBitmap(this.f4059P);
            this.f4048E.setBackgroundColor(this.f4060Q);
            this.f4047D.setVisibility(0);
            this.f4046C.setImageBitmap(m3362e(this.f4059P, 10.0f, this.f4070l));
        }
        m3365f();
        MediaDescriptionCompat mediaDescriptionCompat = this.f4054K;
        CharSequence title = mediaDescriptionCompat == null ? null : mediaDescriptionCompat.getTitle();
        boolean isEmpty = TextUtils.isEmpty(title);
        MediaDescriptionCompat mediaDescriptionCompat2 = this.f4054K;
        if (mediaDescriptionCompat2 != null) {
            charSequence = mediaDescriptionCompat2.getSubtitle();
        }
        boolean isEmpty2 = TextUtils.isEmpty(charSequence);
        if (!isEmpty) {
            this.f4049F.setText(title);
        } else {
            this.f4049F.setText(this.f4051H);
        }
        if (!(true ^ isEmpty2)) {
            this.f4050G.setVisibility(8);
        } else {
            this.f4050G.setText(charSequence);
            this.f4050G.setVisibility(0);
        }
    }

    /* renamed from: t */
    public void m3375t() {
        this.f4066h.clear();
        this.f4067i.clear();
        this.f4068j.clear();
        this.f4066h.addAll(this.f4065g.m28996l());
        for (C5901j.h hVar : this.f4065g.m29001q().m28970f()) {
            C5901j.h.a m28992h = this.f4065g.m28992h(hVar);
            if (m28992h != null) {
                if (m28992h.m29012b()) {
                    this.f4067i.add(hVar);
                }
                if (m28992h.m29013c()) {
                    this.f4068j.add(hVar);
                }
            }
        }
        m3368k(this.f4067i);
        m3368k(this.f4068j);
        List<C5901j.h> list = this.f4066h;
        i iVar = i.f4142b;
        Collections.sort(list, iVar);
        Collections.sort(this.f4067i, iVar);
        Collections.sort(this.f4068j, iVar);
        this.f4076r.m3394k0();
    }

    /* renamed from: u */
    public void m3376u() {
        if (this.f4072n) {
            if (SystemClock.uptimeMillis() - this.f4073o < 300) {
                this.f4074p.removeMessages(1);
                this.f4074p.sendEmptyMessageAtTime(1, this.f4073o + 300);
            } else {
                if (m3372p()) {
                    this.f4083y = true;
                    return;
                }
                this.f4083y = false;
                if (!this.f4065g.m28976C() || this.f4065g.m29007w()) {
                    dismiss();
                }
                this.f4073o = SystemClock.uptimeMillis();
                this.f4076r.m3393j0();
            }
        }
    }

    /* renamed from: v */
    public void m3377v() {
        if (this.f4083y) {
            m3376u();
        }
        if (this.f4084z) {
            m3374r();
        }
    }
}
