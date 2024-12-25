package com.maxdigitall.maxdigitaliptvbox.view.activity;

import android.R;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.ProgressBar;
import android.widget.RatingBar;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.app.ActivityC0243b;
import androidx.appcompat.app.DialogC0242a;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.amazonaws.mobile.auth.userpools.CognitoUserPoolsSignInProvider;
import com.google.android.material.appbar.AppBarLayout;
import com.maxdigitall.maxdigitaliptvbox.model.FavouriteM3UModel;
import com.maxdigitall.maxdigitaliptvbox.model.callback.SearchTMDBTVShowsCallback;
import com.maxdigitall.maxdigitaliptvbox.model.callback.TMDBCastsCallback;
import com.maxdigitall.maxdigitaliptvbox.model.callback.TMDBTrailerCallback;
import com.maxdigitall.maxdigitaliptvbox.model.database.DatabaseHandler;
import com.maxdigitall.maxdigitaliptvbox.model.database.DatabaseUpdatedStatusDBModel;
import com.maxdigitall.maxdigitaliptvbox.model.database.LiveStreamDBHandler;
import com.maxdigitall.maxdigitaliptvbox.model.database.SharepreferenceDBHandler;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import nf.C6783a;
import org.apache.http.HttpHeaders;
import org.apache.http.impl.auth.NTLMEngineImpl;
import p050d0.C4290b;
import p151if.C5251a;
import p151if.C5255e;
import p170jf.C5374f;
import p318s4.InterfaceC8527c;
import p324sf.InterfaceC8571j;
import p329t3.C8617g;
import p330t4.AbstractC8627g;
import pf.C7705a;
import pf.C7707c;
import pf.C7708d;
import pf.C7709e;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesDetailM3UActivity.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesDetailM3UActivity.class */
public class SeriesDetailM3UActivity extends ActivityC0243b implements View.OnClickListener, InterfaceC8571j {

    /* renamed from: i0 */
    public static String f18581i0;

    /* renamed from: j0 */
    public static String f18582j0;

    /* renamed from: K */
    public DatabaseHandler f18593K;

    /* renamed from: L */
    public PopupWindow f18594L;

    /* renamed from: M */
    public Button f18595M;

    /* renamed from: N */
    public String f18596N;

    /* renamed from: O */
    public String f18597O;

    /* renamed from: P */
    public TextView f18598P;

    /* renamed from: Q */
    public TextView f18599Q;

    /* renamed from: R */
    public TextView f18600R;

    /* renamed from: S */
    public MenuItem f18601S;

    /* renamed from: T */
    public Menu f18602T;

    /* renamed from: U */
    public Button f18603U;

    /* renamed from: W */
    public C5374f f18605W;

    /* renamed from: X */
    public String f18606X;

    /* renamed from: Y */
    public SimpleDateFormat f18607Y;

    /* renamed from: Z */
    public DateFormat f18608Z;

    @BindView
    public AppBarLayout appbarToolbar;

    /* renamed from: f0 */
    public Date f18612f0;

    /* renamed from: g0 */
    public String f18614g0;

    @BindView
    public ImageView ivFavourite;

    @BindView
    public ImageView ivMovieImage;

    @BindView
    public LinearLayout llCastBox;

    @BindView
    public LinearLayout llCastBoxInfo;

    @BindView
    public LinearLayout llDetailLeftSide;

    @BindView
    public LinearLayout llDetailProgressBar;

    @BindView
    public LinearLayout llDetailRightSide;

    @BindView
    public LinearLayout llDirectorBox;

    @BindView
    public LinearLayout llDirectorBoxInfo;

    @BindView
    public LinearLayout llDurationBox;

    @BindView
    public LinearLayout llDurationBoxInfo;

    @BindView
    public LinearLayout llGenreBox;

    @BindView
    public LinearLayout llGenreBoxInfo;

    @BindView
    public LinearLayout llMovieInfoBox;

    @BindView
    public LinearLayout llReleasedBox;

    @BindView
    public LinearLayout llReleasedBoxInfo;

    @BindView
    public ImageView logo;

    @BindView
    public RatingBar ratingBar;

    @BindView
    public RelativeLayout rlAccountInfo;

    @BindView
    public RelativeLayout rlTransparent;

    @BindView
    public ScrollView scrollView;

    /* renamed from: t */
    public ImageView f18628t;

    @BindView
    public Toolbar toolbar;

    @BindView
    public TextView tvAccountInfo;

    @BindView
    public TextView tvAddToFav;

    @BindView
    public TextView tvCast;

    @BindView
    public TextView tvCastInfo;

    @BindView
    public TextView tvDirector;

    @BindView
    public TextView tvDirectorInfo;

    @BindView
    public TextView tvMovieDuration;

    @BindView
    public TextView tvMovieDurationInfo;

    @BindView
    public TextView tvMovieGenere;

    @BindView
    public TextView tvMovieInfo;

    @BindView
    public TextView tvMovieName;

    @BindView
    public TextView tvPlay;

    @BindView
    public TextView tvReadMore;

    @BindView
    public TextView tvReadMoreGenre;

    @BindView
    public TextView tvReleaseDate;

    @BindView
    public TextView tvReleaseDateInfo;

    @BindView
    public TextView tvWatchTrailer;

    @BindView
    public TextView tv_genre_info;

    @BindView
    public TextView tvdetailbackbutton;

    @BindView
    public ProgressBar tvdetailprogressbar;

    /* renamed from: u */
    public Context f18629u;

    /* renamed from: v */
    public ProgressDialog f18630v;

    /* renamed from: w */
    public SharedPreferences f18631w;

    /* renamed from: x */
    public SharedPreferences f18632x;

    /* renamed from: y */
    public LiveStreamDBHandler f18633y;

    /* renamed from: d */
    public String f18609d = "";

    /* renamed from: e */
    public String f18610e = "";

    /* renamed from: f */
    public String f18611f = "";

    /* renamed from: g */
    public String f18613g = "";

    /* renamed from: h */
    public String f18615h = "";

    /* renamed from: i */
    public String f18617i = "";

    /* renamed from: j */
    public String f18618j = "";

    /* renamed from: k */
    public String f18619k = "";

    /* renamed from: l */
    public String f18620l = "";

    /* renamed from: m */
    public String f18621m = "";

    /* renamed from: n */
    public String f18622n = "";

    /* renamed from: o */
    public String f18623o = "";

    /* renamed from: p */
    public String f18624p = "";

    /* renamed from: q */
    public String f18625q = "";

    /* renamed from: r */
    public String f18626r = "";

    /* renamed from: s */
    public String f18627s = "";

    /* renamed from: z */
    public DatabaseUpdatedStatusDBModel f18634z = new DatabaseUpdatedStatusDBModel();

    /* renamed from: A */
    public DatabaseUpdatedStatusDBModel f18583A = new DatabaseUpdatedStatusDBModel();

    /* renamed from: B */
    public String f18584B = "";

    /* renamed from: C */
    public String f18585C = "";

    /* renamed from: D */
    public String f18586D = "";

    /* renamed from: E */
    public String f18587E = "";

    /* renamed from: F */
    public String f18588F = "";

    /* renamed from: G */
    public String f18589G = "";

    /* renamed from: H */
    public String f18590H = "";

    /* renamed from: I */
    public int f18591I = -1;

    /* renamed from: J */
    public String f18592J = "";

    /* renamed from: V */
    public String f18604V = "";

    /* renamed from: h0 */
    public Boolean f18616h0 = Boolean.TRUE;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesDetailM3UActivity$a.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.SeriesDetailM3UActivity$a */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesDetailM3UActivity$a.class */
    public class ViewOnClickListenerC3095a implements View.OnClickListener {

        /* renamed from: b */
        public final SeriesDetailM3UActivity f18635b;

        public ViewOnClickListenerC3095a(SeriesDetailM3UActivity seriesDetailM3UActivity) {
            this.f18635b = seriesDetailM3UActivity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f18635b.f18594L.dismiss();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesDetailM3UActivity$b.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.SeriesDetailM3UActivity$b */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesDetailM3UActivity$b.class */
    public class ViewOnClickListenerC3096b implements View.OnClickListener {

        /* renamed from: b */
        public final SeriesDetailM3UActivity f18636b;

        public ViewOnClickListenerC3096b(SeriesDetailM3UActivity seriesDetailM3UActivity) {
            this.f18636b = seriesDetailM3UActivity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f18636b.f18594L.dismiss();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesDetailM3UActivity$c.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.SeriesDetailM3UActivity$c */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesDetailM3UActivity$c.class */
    public class ViewOnClickListenerC3097c implements View.OnClickListener {

        /* renamed from: b */
        public final SeriesDetailM3UActivity f18637b;

        public ViewOnClickListenerC3097c(SeriesDetailM3UActivity seriesDetailM3UActivity) {
            this.f18637b = seriesDetailM3UActivity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f18637b.f18594L.dismiss();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesDetailM3UActivity$d.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.SeriesDetailM3UActivity$d */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesDetailM3UActivity$d.class */
    public class ViewOnClickListenerC3098d implements View.OnClickListener {

        /* renamed from: b */
        public final SeriesDetailM3UActivity f18638b;

        public ViewOnClickListenerC3098d(SeriesDetailM3UActivity seriesDetailM3UActivity) {
            this.f18638b = seriesDetailM3UActivity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f18638b.f18594L.dismiss();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesDetailM3UActivity$e.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.SeriesDetailM3UActivity$e */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesDetailM3UActivity$e.class */
    public class ViewOnClickListenerC3099e implements View.OnClickListener {

        /* renamed from: b */
        public final SeriesDetailM3UActivity f18639b;

        public ViewOnClickListenerC3099e(SeriesDetailM3UActivity seriesDetailM3UActivity) {
            this.f18639b = seriesDetailM3UActivity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C5255e.m26224a(this.f18639b.f18629u);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesDetailM3UActivity$f.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.SeriesDetailM3UActivity$f */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesDetailM3UActivity$f.class */
    public class C3100f extends AbstractC8627g<Bitmap> {

        /* renamed from: d */
        public final SeriesDetailM3UActivity f18640d;

        public C3100f(SeriesDetailM3UActivity seriesDetailM3UActivity) {
            this.f18640d = seriesDetailM3UActivity;
        }

        @Override // p330t4.InterfaceC8630j
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public void mo16635c(Bitmap bitmap, InterfaceC8527c interfaceC8527c) {
            this.f18640d.appbarToolbar.setBackground(new BitmapDrawable(bitmap));
            SeriesDetailM3UActivity seriesDetailM3UActivity = this.f18640d;
            seriesDetailM3UActivity.rlTransparent.setBackgroundColor(seriesDetailM3UActivity.getResources().getColor(2131100139));
            SeriesDetailM3UActivity seriesDetailM3UActivity2 = this.f18640d;
            seriesDetailM3UActivity2.toolbar.setBackgroundColor(seriesDetailM3UActivity2.getResources().getColor(2131100139));
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesDetailM3UActivity$g.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.SeriesDetailM3UActivity$g */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesDetailM3UActivity$g.class */
    public class C3101g extends AbstractC8627g<Bitmap> {

        /* renamed from: d */
        public final SeriesDetailM3UActivity f18641d;

        public C3101g(SeriesDetailM3UActivity seriesDetailM3UActivity) {
            this.f18641d = seriesDetailM3UActivity;
        }

        @Override // p330t4.InterfaceC8630j
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public void mo16635c(Bitmap bitmap, InterfaceC8527c interfaceC8527c) {
            this.f18641d.ivMovieImage.setBackground(new BitmapDrawable(bitmap));
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesDetailM3UActivity$h.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.SeriesDetailM3UActivity$h */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesDetailM3UActivity$h.class */
    public class DialogInterfaceOnClickListenerC3102h implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final SeriesDetailM3UActivity f18642b;

        public DialogInterfaceOnClickListenerC3102h(SeriesDetailM3UActivity seriesDetailM3UActivity) {
            this.f18642b = seriesDetailM3UActivity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            dialogInterface.dismiss();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesDetailM3UActivity$i.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.SeriesDetailM3UActivity$i */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesDetailM3UActivity$i.class */
    public class DialogInterfaceOnClickListenerC3103i implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final SeriesDetailM3UActivity f18643b;

        public DialogInterfaceOnClickListenerC3103i(SeriesDetailM3UActivity seriesDetailM3UActivity) {
            this.f18643b = seriesDetailM3UActivity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            C5255e.m26211N(this.f18643b.f18629u);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesDetailM3UActivity$j.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.SeriesDetailM3UActivity$j */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesDetailM3UActivity$j.class */
    public class DialogInterfaceOnClickListenerC3104j implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final SeriesDetailM3UActivity f18644b;

        public DialogInterfaceOnClickListenerC3104j(SeriesDetailM3UActivity seriesDetailM3UActivity) {
            this.f18644b = seriesDetailM3UActivity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            C5255e.m26210M(this.f18644b.f18629u);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesDetailM3UActivity$k.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.SeriesDetailM3UActivity$k */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesDetailM3UActivity$k.class */
    public class DialogInterfaceOnClickListenerC3105k implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final SeriesDetailM3UActivity f18645b;

        public DialogInterfaceOnClickListenerC3105k(SeriesDetailM3UActivity seriesDetailM3UActivity) {
            this.f18645b = seriesDetailM3UActivity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            dialogInterface.cancel();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesDetailM3UActivity$l.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.SeriesDetailM3UActivity$l */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesDetailM3UActivity$l.class */
    public class DialogInterfaceOnClickListenerC3106l implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final SeriesDetailM3UActivity f18646b;

        public DialogInterfaceOnClickListenerC3106l(SeriesDetailM3UActivity seriesDetailM3UActivity) {
            this.f18646b = seriesDetailM3UActivity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesDetailM3UActivity$m.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.SeriesDetailM3UActivity$m */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesDetailM3UActivity$m.class */
    public class DialogInterfaceOnClickListenerC3107m implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final SeriesDetailM3UActivity f18647b;

        public DialogInterfaceOnClickListenerC3107m(SeriesDetailM3UActivity seriesDetailM3UActivity) {
            this.f18647b = seriesDetailM3UActivity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            dialogInterface.cancel();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesDetailM3UActivity$n.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.SeriesDetailM3UActivity$n */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesDetailM3UActivity$n.class */
    public class ViewOnFocusChangeListenerC3108n implements View.OnFocusChangeListener {

        /* renamed from: b */
        public final View f18648b;

        /* renamed from: c */
        public final SeriesDetailM3UActivity f18649c;

        public ViewOnFocusChangeListenerC3108n(SeriesDetailM3UActivity seriesDetailM3UActivity, View view) {
            this.f18649c = seriesDetailM3UActivity;
            this.f18648b = view;
        }

        /* renamed from: a */
        public final void m16638a(float f10) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f18648b, "scaleX", f10);
            ofFloat.setDuration(150L);
            ofFloat.start();
        }

        /* renamed from: b */
        public final void m16639b(float f10) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f18648b, "scaleY", f10);
            ofFloat.setDuration(150L);
            ofFloat.start();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v37, types: [android.view.View] */
        @Override // android.view.View.OnFocusChangeListener
        @SuppressLint({"ResourceType"})
        public void onFocusChange(View view, boolean z10) {
            int i10;
            Button button;
            float f10 = 1.0f;
            if (z10) {
                if (z10) {
                    f10 = 1.05f;
                }
                Log.e("id is", "" + this.f18648b.getTag());
                i10 = 2131230828;
                if (this.f18648b.getTag().equals("1")) {
                    m16638a(f10);
                    m16639b(f10);
                    button = this.f18648b;
                } else {
                    if (this.f18648b.getTag().equals("2")) {
                        m16638a(f10);
                        m16639b(f10);
                        this.f18648b.setBackgroundResource(2131231576);
                        return;
                    }
                    if (this.f18648b.getTag().equals("3") || this.f18648b.getTag().equals("5")) {
                        m16638a(f10);
                        m16639b(f10);
                        this.f18648b.setBackgroundResource(2131230846);
                        return;
                    }
                    View view2 = this.f18648b;
                    if (view2 == null || view2.getTag() == null || !this.f18648b.getTag().equals("8")) {
                        m16638a(1.15f);
                        m16639b(1.15f);
                        return;
                    } else {
                        m16638a(f10);
                        m16639b(f10);
                        button = this.f18649c.f18603U;
                    }
                }
            } else {
                if (z10) {
                    return;
                }
                if (z10) {
                    f10 = 1.09f;
                }
                m16638a(f10);
                m16639b(f10);
                i10 = 2131230845;
                if (!this.f18648b.getTag().equals("1") && !this.f18648b.getTag().equals("2") && !this.f18648b.getTag().equals("3") && !this.f18648b.getTag().equals("5")) {
                    if (this.f18648b.getTag() == null || !this.f18648b.getTag().equals("8")) {
                        return;
                    }
                    button = this.f18649c.f18603U;
                }
                button = this.f18648b;
            }
            button.setBackgroundResource(i10);
        }
    }

    /* renamed from: u0 */
    public static long m16625u0(SimpleDateFormat simpleDateFormat, String str, String str2) {
        try {
            return TimeUnit.DAYS.convert(simpleDateFormat.parse(str2).getTime() - simpleDateFormat.parse(str).getTime(), TimeUnit.MILLISECONDS);
        } catch (Exception e10) {
            e10.printStackTrace();
            return 0L;
        }
    }

    /* renamed from: v0 */
    public static String m16626v0(Context context) {
        return String.valueOf(context.getApplicationInfo().loadLabel(context.getPackageManager()));
    }

    /* renamed from: A0 */
    public final void m16627A0(SeriesDetailM3UActivity seriesDetailM3UActivity) {
        View inflate = ((LayoutInflater) seriesDetailM3UActivity.getSystemService("layout_inflater")).inflate(2131624235, (RelativeLayout) seriesDetailM3UActivity.findViewById(2131429033));
        this.f18598P = (TextView) inflate.findViewById(2131429376);
        TextView textView = (TextView) inflate.findViewById(2131429550);
        this.f18600R = textView;
        textView.setText(getResources().getString(2132018358));
        this.f18598P.setText(this.f18596N);
        PopupWindow popupWindow = new PopupWindow(seriesDetailM3UActivity);
        this.f18594L = popupWindow;
        popupWindow.setContentView(inflate);
        this.f18594L.setWidth(-1);
        this.f18594L.setHeight(-1);
        this.f18594L.setFocusable(true);
        this.f18594L.showAtLocation(inflate, 17, 0, 0);
        Button button = (Button) inflate.findViewById(2131427605);
        this.f18595M = button;
        if (button != null) {
            button.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3108n(this, button));
        }
        this.f18595M.setOnClickListener(new ViewOnClickListenerC3095a(this));
    }

    /* renamed from: B0 */
    public final void m16628B0(SeriesDetailM3UActivity seriesDetailM3UActivity) {
        View inflate = ((LayoutInflater) seriesDetailM3UActivity.getSystemService("layout_inflater")).inflate(2131624237, (RelativeLayout) seriesDetailM3UActivity.findViewById(2131429033));
        TextView textView = (TextView) inflate.findViewById(2131429467);
        this.f18599Q = textView;
        textView.setText(this.f18597O);
        PopupWindow popupWindow = new PopupWindow(seriesDetailM3UActivity);
        this.f18594L = popupWindow;
        popupWindow.setContentView(inflate);
        this.f18594L.setWidth(-1);
        this.f18594L.setHeight(-1);
        this.f18594L.setFocusable(true);
        this.f18594L.showAtLocation(inflate, 17, 0, 0);
        Button button = (Button) inflate.findViewById(2131427605);
        this.f18595M = button;
        if (button != null) {
            button.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3108n(this, button));
        }
        this.f18595M.setOnClickListener(new ViewOnClickListenerC3096b(this));
    }

    /* renamed from: C0 */
    public final void m16629C0(Context context, String str, String str2) {
        ImageView imageView;
        TextView textView;
        String str3;
        this.f18605W = new C5374f(this, context);
        int i10 = 0;
        this.scrollView.setVisibility(0);
        Intent intent = getIntent();
        if (intent != null) {
            this.f18609d = intent.getStringExtra("episode_name");
            this.f18625q = intent.getStringExtra("series_name");
            this.f18626r = intent.getStringExtra("series_icon");
            this.f18627s = intent.getStringExtra("episode_url");
            this.f18590H = intent.getStringExtra("series_num");
            this.f18619k = intent.getStringExtra("series_categoryId");
            if (this.f18633y.m15159E0(this.f18627s, SharepreferenceDBHandler.m15337A(context)).size() > 0) {
                this.tvAddToFav.setText(getResources().getString(2132018473));
                imageView = this.ivFavourite;
            } else {
                this.tvAddToFav.setText(getResources().getString(2132017280));
                imageView = this.ivFavourite;
                i10 = 4;
            }
            imageView.setVisibility(i10);
            if (context != null && (str3 = this.f18626r) != null && !str3.isEmpty()) {
                C8617g.m37004u(context).m37029q(this.f18626r).m36988K().m36993l(new C3101g(this));
            }
            if (this.f18586D != null && (textView = this.tvMovieName) != null) {
                textView.setText(this.f18609d);
            }
            this.f18605W.m26722d(this.f18625q);
        }
    }

    @Override // p324sf.InterfaceC8563b
    /* renamed from: a */
    public void mo15996a() {
    }

    @Override // p324sf.InterfaceC8563b
    /* renamed from: b */
    public void mo15997b() {
        ProgressDialog progressDialog = this.f18630v;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
    }

    @Override // p324sf.InterfaceC8563b
    /* renamed from: c */
    public void mo15998c(String str) {
        this.llDetailProgressBar.setVisibility(8);
        this.llDetailRightSide.setVisibility(0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x01e8, code lost:
    
        if (r6 != null) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0222, code lost:
    
        r6.setText("N/A");
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x021f, code lost:
    
        if (r6 != null) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x00b9, code lost:
    
        if (r8 != null) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x00e4, code lost:
    
        r8.setText("N/A");
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x00e1, code lost:
    
        if (r8 != null) goto L38;
     */
    @Override // p324sf.InterfaceC8571j
    /* renamed from: c0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo16612c0(com.maxdigitall.maxdigitaliptvbox.model.callback.TMDBTVShowsInfoCallback r6) {
        /*
            Method dump skipped, instructions count: 571
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.maxdigitall.maxdigitaliptvbox.view.activity.SeriesDetailM3UActivity.mo16612c0(com.maxdigitall.maxdigitaliptvbox.model.callback.TMDBTVShowsInfoCallback):void");
    }

    @Override // androidx.appcompat.app.ActivityC0243b, p030c0.ActivityC0952l, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        boolean z10 = keyEvent.getAction() == 0;
        if (keyCode == 82) {
            return z10 ? onKeyDown(keyCode, keyEvent) : onKeyUp(keyCode, keyEvent);
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // p324sf.InterfaceC8571j
    /* renamed from: k */
    public void mo16613k(TMDBTrailerCallback tMDBTrailerCallback) {
        if (tMDBTrailerCallback == null || tMDBTrailerCallback.m15081a() == null || tMDBTrailerCallback.m15081a().size() <= 0) {
            return;
        }
        for (int i10 = 0; i10 < tMDBTrailerCallback.m15081a().size(); i10++) {
            if (tMDBTrailerCallback.m15081a().get(i10).m15489b().equals(HttpHeaders.TRAILER)) {
                this.f18621m = tMDBTrailerCallback.m15081a().get(i10).m15488a();
                TextView textView = this.tvWatchTrailer;
                if (textView != null) {
                    textView.setVisibility(0);
                    return;
                }
                return;
            }
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(2130772003, 2130772000);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() != 2131429468) {
            return;
        }
        startActivity(new Intent(this, (Class<?>) NewDashboardActivity.class));
    }

    @Override // androidx.fragment.app.ActivityC0416e, androidx.activity.ComponentActivity, p030c0.ActivityC0952l, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2131624053);
        ButterKnife.m5626a(this);
        overridePendingTransition(2130772003, 2130772000);
        this.f18629u = this;
        AppBarLayout appBarLayout = this.appbarToolbar;
        if (appBarLayout != null) {
            appBarLayout.setBackground(getResources().getDrawable(2131230975));
        }
        TextView textView = this.tvPlay;
        if (textView != null) {
            textView.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3108n(this, textView));
            this.tvPlay.requestFocus();
            this.tvPlay.setFocusable(true);
        }
        TextView textView2 = this.tvAddToFav;
        if (textView2 != null) {
            textView2.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3108n(this, textView2));
        }
        TextView textView3 = this.tvdetailbackbutton;
        if (textView3 != null) {
            textView3.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3108n(this, textView3));
        }
        TextView textView4 = this.tvReadMore;
        if (textView4 != null) {
            textView4.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3108n(this, textView4));
        }
        TextView textView5 = this.tvReadMoreGenre;
        if (textView5 != null) {
            textView5.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3108n(this, textView5));
        }
        TextView textView6 = this.tvWatchTrailer;
        if (textView6 != null) {
            textView6.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3108n(this, textView6));
        }
        this.f18606X = C5255e.m26247n0(C7705a.m33651a());
        Locale locale = Locale.US;
        this.f18607Y = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss", locale);
        this.f18612f0 = new Date();
        this.f18608Z = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss", locale);
        f18581i0 = getApplicationContext().getPackageName();
        this.f18614g0 = C5255e.m26247n0(C7708d.m33672d());
        f18582j0 = m16626v0(this.f18629u);
        getWindow().setFlags(1024, 1024);
        m878n0((Toolbar) findViewById(2131429320));
        m16631t0();
        SharepreferenceDBHandler.m15351O("m3u", this.f18629u);
        this.f18633y = new LiveStreamDBHandler(this.f18629u);
        this.logo.setOnClickListener(new ViewOnClickListenerC3099e(this));
        m16632w0();
        SharedPreferences sharedPreferences = this.f18629u.getSharedPreferences("selectedPlayer", 0);
        this.f18632x = sharedPreferences;
        this.f18587E = sharedPreferences.getString("selectedPlayer", "");
        ImageView imageView = this.f18628t;
        if (imageView != null) {
            imageView.setOnClickListener(this);
        }
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        this.toolbar.m1224x(2131689500);
        this.f18602T = menu;
        this.f18601S = menu.getItem(1).getSubMenu().findItem(2131427886);
        TypedValue typedValue = new TypedValue();
        if (getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true)) {
            TypedValue.complexToDimensionPixelSize(typedValue.data, getResources().getDisplayMetrics());
        }
        for (int i10 = 0; i10 < this.toolbar.getChildCount(); i10++) {
            if (this.toolbar.getChildAt(i10) instanceof ActionMenuView) {
                ((Toolbar.C0292e) this.toolbar.getChildAt(i10).getLayoutParams()).f26228a = 16;
            }
        }
        return true;
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i10, KeyEvent keyEvent) {
        if (i10 != 82) {
            return super.onKeyUp(i10, keyEvent);
        }
        Menu menu = this.f18602T;
        if (menu == null) {
            return true;
        }
        menu.performIdentifierAction(2131427886, 0);
        return true;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        Context context;
        this.f18601S = menuItem;
        int itemId = menuItem.getItemId();
        if (itemId == 2131428761) {
            startActivity(new Intent(this, (Class<?>) NewDashboardActivity.class));
            finish();
        }
        if (itemId == 2131428776) {
            startActivity(new Intent(this, (Class<?>) SettingsActivity.class));
        }
        if (itemId == 2131427416 && (context = this.f18629u) != null) {
            new DialogC0242a.a(context, 2132082693).setTitle(getResources().getString(2132017988)).m857e(getResources().getString(2132017987)).m861i(getResources().getString(2132018825), new DialogInterfaceOnClickListenerC3103i(this)).m858f(getResources().getString(2132018187), new DialogInterfaceOnClickListenerC3102h(this)).m865m();
        }
        if (itemId == 2131428637) {
            DialogC0242a.a aVar = new DialogC0242a.a(this);
            aVar.setTitle(this.f18629u.getResources().getString(2132017514));
            aVar.m857e(this.f18629u.getResources().getString(2132017585));
            aVar.m855c(2131231731);
            aVar.m861i(this.f18629u.getResources().getString(2132018825), new DialogInterfaceOnClickListenerC3104j(this));
            aVar.m858f(this.f18629u.getResources().getString(2132018187), new DialogInterfaceOnClickListenerC3105k(this));
            aVar.m865m();
        }
        if (itemId == 2131428639) {
            DialogC0242a.a aVar2 = new DialogC0242a.a(this);
            aVar2.setTitle(this.f18629u.getResources().getString(2132017514));
            aVar2.m857e(this.f18629u.getResources().getString(2132017585));
            aVar2.m855c(2131231731);
            aVar2.m861i(this.f18629u.getResources().getString(2132018825), new DialogInterfaceOnClickListenerC3106l(this));
            aVar2.m858f(this.f18629u.getResources().getString(2132018187), new DialogInterfaceOnClickListenerC3107m(this));
            aVar2.m865m();
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // androidx.fragment.app.ActivityC0416e, android.app.Activity
    public void onResume() {
        super.onResume();
        C5255e.m26233f(this.f18629u);
        SharedPreferences sharedPreferences = getSharedPreferences("loginPrefs", 0);
        this.f18631w = sharedPreferences;
        if (sharedPreferences.getString(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME, "").equals("") && this.f18631w.getString(CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD, "").equals("")) {
            startActivity(new Intent(this, (Class<?>) LoginActivity.class));
        } else if (this.f18629u != null) {
            mo15997b();
        }
    }

    @OnClick
    public void onViewClicked(View view) {
        String str;
        String str2;
        switch (view.getId()) {
            case 2131429351:
                if (this.f18633y.m15159E0(this.f18627s, SharepreferenceDBHandler.m15337A(this.f18629u)).size() <= 0) {
                    m16630s0();
                    break;
                } else {
                    m16634z0();
                    break;
                }
            case 2131429417:
            case 2131429642:
                String str3 = this.f18621m;
                if (str3 != null && !str3.isEmpty()) {
                    startActivity(new Intent(this, (Class<?>) YouTubePlayerActivity.class).putExtra("you_tube_trailer", this.f18621m));
                    break;
                } else {
                    m16633x0(this);
                    break;
                }
                break;
            case 2131429558:
                SharedPreferences sharedPreferences = this.f18629u.getSharedPreferences("selectedPlayer", 0);
                this.f18632x = sharedPreferences;
                String string = sharedPreferences.getString("selectedPlayer", "");
                SimpleDateFormat simpleDateFormat = this.f18607Y;
                if (m16625u0(simpleDateFormat, simpleDateFormat.format(new Date(C7709e.m33680a(this.f18629u))), this.f18608Z.format(this.f18612f0)) >= C7707c.m33667p() && (str = this.f18606X) != null && this.f18614g0 != null && (!f18582j0.equals(str) || (this.f18606X != null && (str2 = this.f18614g0) != null && !f18581i0.equals(str2)))) {
                    this.f18616h0 = Boolean.FALSE;
                }
                if (this.f18616h0.booleanValue()) {
                    try {
                        C5255e.m26219V(this.f18629u, string, 0, "series", "", this.f18590H, this.f18609d, null, this.f18627s);
                        break;
                    } catch (Exception e10) {
                        return;
                    }
                }
                break;
            case 2131429581:
                m16627A0(this);
                break;
            case 2131429582:
                m16628B0(this);
                break;
        }
    }

    @Override // p324sf.InterfaceC8571j
    /* renamed from: r */
    public void mo16614r(TMDBCastsCallback tMDBCastsCallback) {
    }

    /* renamed from: s0 */
    public final void m16630s0() {
        FavouriteM3UModel favouriteM3UModel = new FavouriteM3UModel();
        favouriteM3UModel.m14782h(this.f18627s);
        favouriteM3UModel.m14783i(SharepreferenceDBHandler.m15337A(this.f18629u));
        favouriteM3UModel.m14781g(this.f18609d);
        favouriteM3UModel.m14779e(this.f18619k);
        this.f18633y.m15156D0(favouriteM3UModel);
        this.tvAddToFav.setText(getResources().getString(2132018473));
        this.ivFavourite.setVisibility(0);
    }

    /* renamed from: t0 */
    public final void m16631t0() {
        Window window = getWindow();
        window.clearFlags(67108864);
        window.addFlags(NTLMEngineImpl.FLAG_REQUEST_56BIT_ENCRYPTION);
        window.setStatusBarColor(C4290b.m21724c(this, 2131099776));
    }

    /* renamed from: w0 */
    public final void m16632w0() {
        this.f18629u = this;
        this.f18593K = new DatabaseHandler(this.f18629u);
        SharedPreferences sharedPreferences = getSharedPreferences("loginPrefs", 0);
        this.f18631w = sharedPreferences;
        String string = sharedPreferences.getString(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME, "");
        String string2 = this.f18631w.getString(CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD, "");
        if (string == null || string2 == null || string.isEmpty() || string2.isEmpty()) {
            startActivity(new Intent(this, (Class<?>) LoginActivity.class));
        } else {
            m16629C0(this.f18629u, string, string2);
        }
    }

    /* renamed from: x0 */
    public final void m16633x0(SeriesDetailM3UActivity seriesDetailM3UActivity) {
        View inflate = ((LayoutInflater) seriesDetailM3UActivity.getSystemService("layout_inflater")).inflate(2131624241, (RelativeLayout) seriesDetailM3UActivity.findViewById(2131429033));
        PopupWindow popupWindow = new PopupWindow(seriesDetailM3UActivity);
        this.f18594L = popupWindow;
        popupWindow.setContentView(inflate);
        this.f18594L.setWidth(-1);
        this.f18594L.setHeight(-1);
        this.f18594L.setFocusable(true);
        this.f18594L.setBackgroundDrawable(new BitmapDrawable());
        this.f18594L.showAtLocation(inflate, 17, 0, 0);
        this.f18603U = (Button) inflate.findViewById(2131427623);
        TextView textView = (TextView) inflate.findViewById(2131427916);
        this.f18595M = (Button) inflate.findViewById(2131427605);
        textView.setText("Series trailer is not available");
        Button button = this.f18603U;
        if (button != null) {
            button.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3108n(this, button));
        }
        Button button2 = this.f18595M;
        if (button2 != null) {
            button2.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3108n(this, button2));
        }
        this.f18595M.setOnClickListener(new ViewOnClickListenerC3097c(this));
        this.f18603U.setOnClickListener(new ViewOnClickListenerC3098d(this));
    }

    @Override // p324sf.InterfaceC8571j
    /* renamed from: z */
    public void mo16615z(SearchTMDBTVShowsCallback searchTMDBTVShowsCallback) {
        View view;
        TextView textView;
        StringBuilder sb2;
        String str;
        if (searchTMDBTVShowsCallback != null && searchTMDBTVShowsCallback.m15013b() != null) {
            boolean z10 = true;
            if (searchTMDBTVShowsCallback.m15013b().equals(1) && searchTMDBTVShowsCallback.m15012a() != null && searchTMDBTVShowsCallback.m15012a().get(0) != null) {
                int intValue = searchTMDBTVShowsCallback.m15012a().get(0).m15474c().intValue();
                this.f18605W.m26721c(intValue);
                this.f18605W.m26723e(intValue);
                String m15473b = searchTMDBTVShowsCallback.m15012a().get(0).m15473b();
                Double m15478g = searchTMDBTVShowsCallback.m15012a().get(0).m15478g();
                this.f18610e = searchTMDBTVShowsCallback.m15012a().get(0).m15477f();
                String m15472a = searchTMDBTVShowsCallback.m15012a().get(0).m15472a();
                if (new C6783a(this.f18629u).m31288z().equals(C5251a.f30065s0)) {
                    sb2 = new StringBuilder();
                    str = "https://image.tmdb.org/t/p/w1280/";
                } else {
                    sb2 = new StringBuilder();
                    str = "https://image.tmdb.org/t/p/w500/";
                }
                sb2.append(str);
                sb2.append(m15472a);
                String sb3 = sb2.toString();
                if (this.appbarToolbar != null && m15472a != null) {
                    C8617g.m37004u(getApplicationContext()).m37029q(sb3).m36988K().m36993l(new C3100f(this));
                }
                if (this.llReleasedBox == null || this.llReleasedBoxInfo == null || this.tvReleaseDateInfo == null || m15473b == null || m15473b.isEmpty() || m15473b.equals("n/A")) {
                    LinearLayout linearLayout = this.llReleasedBox;
                    if (linearLayout != null) {
                        linearLayout.setVisibility(0);
                    }
                    LinearLayout linearLayout2 = this.llReleasedBoxInfo;
                    if (linearLayout2 != null) {
                        linearLayout2.setVisibility(0);
                    }
                    TextView textView2 = this.tvReleaseDateInfo;
                    if (textView2 != null) {
                        textView2.setText("N/A");
                    }
                } else {
                    this.llReleasedBox.setVisibility(0);
                    this.llReleasedBoxInfo.setVisibility(0);
                    this.tvReleaseDateInfo.setText(m15473b);
                }
                if (this.ratingBar != null && m15478g != null && !m15478g.equals("n/A")) {
                    this.ratingBar.setVisibility(0);
                    try {
                        this.ratingBar.setRating(Float.parseFloat(String.valueOf(m15478g)) / 2.0f);
                    } catch (NumberFormatException e10) {
                        this.ratingBar.setRating(0.0f);
                    }
                }
                String str2 = this.f18610e;
                this.f18596N = str2;
                if (this.llCastBox != null && this.llCastBoxInfo != null && this.tvCastInfo != null && str2 != null && !str2.isEmpty()) {
                    this.llCastBox.setVisibility(0);
                    this.llCastBoxInfo.setVisibility(0);
                    if (this.f18610e.length() <= 150) {
                        z10 = false;
                    }
                    TextView textView3 = this.tvCastInfo;
                    if (!z10) {
                        textView3.setText(this.f18610e);
                        this.tvReadMore.setVisibility(8);
                        return;
                    } else {
                        textView3.setText(this.f18610e);
                        view = this.tvReadMore;
                        view.setVisibility(0);
                    }
                }
                LinearLayout linearLayout3 = this.llCastBox;
                if (linearLayout3 != null) {
                    linearLayout3.setVisibility(0);
                }
                LinearLayout linearLayout4 = this.llCastBoxInfo;
                if (linearLayout4 != null) {
                    linearLayout4.setVisibility(0);
                }
                TextView textView4 = this.tvReadMore;
                if (textView4 != null) {
                    textView4.setVisibility(8);
                }
                TextView textView5 = this.tvCastInfo;
                if (textView5 != null) {
                    textView5.setText("N/A");
                    return;
                }
                return;
            }
        }
        String str3 = this.f18609d;
        if (str3 != null && (textView = this.tvMovieName) != null) {
            textView.setText(str3);
        }
        TextView textView6 = this.tvMovieDurationInfo;
        if (textView6 != null) {
            textView6.setText("N/A");
        }
        TextView textView7 = this.tvCastInfo;
        if (textView7 != null) {
            textView7.setText("N/A");
        }
        TextView textView8 = this.tvDirectorInfo;
        if (textView8 != null) {
            textView8.setText("N/A");
        }
        TextView textView9 = this.tvReleaseDateInfo;
        if (textView9 != null) {
            textView9.setText("N/A");
        }
        TextView textView10 = this.tvReadMoreGenre;
        if (textView10 != null) {
            textView10.setVisibility(8);
        }
        TextView textView11 = this.tv_genre_info;
        if (textView11 != null) {
            textView11.setText("N/A");
        }
        TextView textView12 = this.tvReadMore;
        if (textView12 != null) {
            textView12.setVisibility(8);
        }
        this.llDetailProgressBar.setVisibility(8);
        view = this.llDetailRightSide;
        view.setVisibility(0);
    }

    /* renamed from: z0 */
    public final void m16634z0() {
        this.f18633y.m15188R0(this.f18627s, SharepreferenceDBHandler.m15337A(this.f18629u));
        this.tvAddToFav.setText(getResources().getString(2132017280));
        this.ivFavourite.setVisibility(4);
    }
}
