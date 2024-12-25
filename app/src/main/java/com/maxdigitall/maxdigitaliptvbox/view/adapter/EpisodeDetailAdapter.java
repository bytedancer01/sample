package com.maxdigitall.maxdigitaliptvbox.view.adapter;

import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RatingBar;
import android.widget.TextView;
import androidx.appcompat.widget.C0304c1;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.amazonaws.services.p045s3.model.InstructionFileId;
import com.maxdigitall.maxdigitaliptvbox.miscelleneious.chromecastfeature.ExpandedControlsActivity;
import com.maxdigitall.maxdigitaliptvbox.model.EpisodesUsingSinglton;
import com.maxdigitall.maxdigitaliptvbox.model.callback.GetEpisdoeDetailsCallback;
import com.maxdigitall.maxdigitaliptvbox.model.callback.SeriesDBModel;
import com.maxdigitall.maxdigitaliptvbox.model.database.DatabaseHandler;
import com.maxdigitall.maxdigitaliptvbox.model.database.ExternalPlayerDataBase;
import com.maxdigitall.maxdigitaliptvbox.model.database.LiveStreamDBHandler;
import com.maxdigitall.maxdigitaliptvbox.model.pojo.ExternalPlayerModelClass;
import com.maxdigitall.maxdigitaliptvbox.view.activity.HoneyPlayer;
import com.maxdigitall.maxdigitaliptvbox.view.activity.PlayExternalPlayerActivity;
import com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerSeriesThumbnail;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p082ef.C4718a;
import p151if.C5251a;
import p151if.C5255e;
import p216m9.C5947e;
import p230n9.C6721i;
import p316s2.C8522c;
import pf.C7705a;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/EpisodeDetailAdapter.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/EpisodeDetailAdapter.class */
public class EpisodeDetailAdapter extends RecyclerView.AbstractC0677h<MyViewHolder> {

    /* renamed from: M */
    public static String f19667M;

    /* renamed from: N */
    public static String f19668N;

    /* renamed from: A */
    public String f19669A;

    /* renamed from: B */
    public SharedPreferences f19670B;

    /* renamed from: C */
    public String f19671C;

    /* renamed from: D */
    public String f19672D;

    /* renamed from: E */
    public String f19673E;

    /* renamed from: G */
    public NSTIJKPlayerSeriesThumbnail f19675G;

    /* renamed from: J */
    public String f19678J;

    /* renamed from: K */
    public String f19679K;

    /* renamed from: e */
    public Context f19681e;

    /* renamed from: g */
    public SharedPreferences f19683g;

    /* renamed from: h */
    public DatabaseHandler f19684h;

    /* renamed from: i */
    public LiveStreamDBHandler f19685i;

    /* renamed from: j */
    public MyViewHolder f19686j;

    /* renamed from: k */
    public Boolean f19687k;

    /* renamed from: l */
    public Date f19688l;

    /* renamed from: m */
    public String f19689m;

    /* renamed from: n */
    public DateFormat f19690n;

    /* renamed from: o */
    public SimpleDateFormat f19691o;

    /* renamed from: r */
    public String f19694r;

    /* renamed from: t */
    public C5947e f19696t;

    /* renamed from: v */
    public boolean f19698v;

    /* renamed from: w */
    public String f19699w;

    /* renamed from: x */
    public List<SeriesDBModel> f19700x;

    /* renamed from: y */
    public String f19701y;

    /* renamed from: z */
    public String f19702z;

    /* renamed from: p */
    public int f19692p = 0;

    /* renamed from: q */
    public String f19693q = "mp4";

    /* renamed from: s */
    public String f19695s = "";

    /* renamed from: F */
    public Handler f19674F = new Handler();

    /* renamed from: H */
    public String f19676H = "";

    /* renamed from: I */
    public int f19677I = 0;

    /* renamed from: L */
    public C6721i.a f19680L = new C3371a(this);

    /* renamed from: f */
    public List<GetEpisdoeDetailsCallback> f19682f = EpisodesUsingSinglton.m14753c().m14754a();

    /* renamed from: u */
    public String f19697u = C5255e.m26247n0(C7705a.m33651a());

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/EpisodeDetailAdapter$MyViewHolder.class
     */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/EpisodeDetailAdapter$MyViewHolder.class */
    public static class MyViewHolder extends RecyclerView.AbstractC0674e0 {

        @BindView
        public TextView EpisodeDesc;

        @BindView
        public TextView EpisodeTime;

        @BindView
        public LinearLayout Movie;

        @BindView
        public ImageView MovieImage;

        @BindView
        public TextView MovieName;

        @BindView
        public LinearLayout cardView;

        @BindView
        public ImageView iv_play_icon;

        @BindView
        public LinearLayout ll_buffering;

        @BindView
        public LinearLayout ll_episode_thumbnail;

        @BindView
        public LinearLayout ll_hover;

        @BindView
        public LinearLayout ll_now_paused;

        @BindView
        public LinearLayout ll_now_playing;

        @BindView
        public LinearLayout ll_now_playing_paused;

        @BindView
        public LinearLayout ll_pb_recent_watch;

        @BindView
        public LinearLayout ll_video_player;

        @BindView
        public NSTIJKPlayerSeriesThumbnail mVideoView;

        @BindView
        public ProgressBar pb_recent_watch;

        @BindView
        public RatingBar ratingBar;

        public MyViewHolder(View view) {
            super(view);
            ButterKnife.m5627b(this, view);
            m4048L(false);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/EpisodeDetailAdapter$MyViewHolder_ViewBinding.class
     */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/EpisodeDetailAdapter$MyViewHolder_ViewBinding.class */
    public class MyViewHolder_ViewBinding implements Unbinder {

        /* renamed from: b */
        public MyViewHolder f19703b;

        public MyViewHolder_ViewBinding(MyViewHolder myViewHolder, View view) {
            this.f19703b = myViewHolder;
            myViewHolder.MovieName = (TextView) C8522c.m36739c(view, 2131429519, "field 'MovieName'", TextView.class);
            myViewHolder.EpisodeTime = (TextView) C8522c.m36739c(view, 2131429451, "field 'EpisodeTime'", TextView.class);
            myViewHolder.EpisodeDesc = (TextView) C8522c.m36739c(view, 2131429449, "field 'EpisodeDesc'", TextView.class);
            myViewHolder.ratingBar = (RatingBar) C8522c.m36739c(view, 2131428891, "field 'ratingBar'", RatingBar.class);
            myViewHolder.Movie = (LinearLayout) C8522c.m36739c(view, 2131429012, "field 'Movie'", LinearLayout.class);
            myViewHolder.MovieImage = (ImageView) C8522c.m36739c(view, 2131428200, "field 'MovieImage'", ImageView.class);
            myViewHolder.cardView = (LinearLayout) C8522c.m36739c(view, 2131427703, "field 'cardView'", LinearLayout.class);
            myViewHolder.ll_hover = (LinearLayout) C8522c.m36739c(view, 2131428417, "field 'll_hover'", LinearLayout.class);
            myViewHolder.pb_recent_watch = (ProgressBar) C8522c.m36739c(view, 2131428841, "field 'pb_recent_watch'", ProgressBar.class);
            myViewHolder.ll_pb_recent_watch = (LinearLayout) C8522c.m36739c(view, 2131428464, "field 'll_pb_recent_watch'", LinearLayout.class);
            myViewHolder.ll_episode_thumbnail = (LinearLayout) C8522c.m36739c(view, 2131428401, "field 'll_episode_thumbnail'", LinearLayout.class);
            myViewHolder.mVideoView = (NSTIJKPlayerSeriesThumbnail) C8522c.m36739c(view, 2131429674, "field 'mVideoView'", NSTIJKPlayerSeriesThumbnail.class);
            myViewHolder.ll_video_player = (LinearLayout) C8522c.m36739c(view, 2131428534, "field 'll_video_player'", LinearLayout.class);
            myViewHolder.iv_play_icon = (ImageView) C8522c.m36739c(view, 2131428211, "field 'iv_play_icon'", ImageView.class);
            myViewHolder.ll_now_playing_paused = (LinearLayout) C8522c.m36739c(view, 2131428457, "field 'll_now_playing_paused'", LinearLayout.class);
            myViewHolder.ll_now_playing = (LinearLayout) C8522c.m36739c(view, 2131428456, "field 'll_now_playing'", LinearLayout.class);
            myViewHolder.ll_now_paused = (LinearLayout) C8522c.m36739c(view, 2131428455, "field 'll_now_paused'", LinearLayout.class);
            myViewHolder.ll_buffering = (LinearLayout) C8522c.m36739c(view, 2131428340, "field 'll_buffering'", LinearLayout.class);
        }

        @Override // butterknife.Unbinder
        /* renamed from: a */
        public void mo5629a() {
            MyViewHolder myViewHolder = this.f19703b;
            if (myViewHolder == null) {
                throw new IllegalStateException("Bindings already cleared.");
            }
            this.f19703b = null;
            myViewHolder.MovieName = null;
            myViewHolder.EpisodeTime = null;
            myViewHolder.EpisodeDesc = null;
            myViewHolder.ratingBar = null;
            myViewHolder.Movie = null;
            myViewHolder.MovieImage = null;
            myViewHolder.cardView = null;
            myViewHolder.ll_hover = null;
            myViewHolder.pb_recent_watch = null;
            myViewHolder.ll_pb_recent_watch = null;
            myViewHolder.ll_episode_thumbnail = null;
            myViewHolder.mVideoView = null;
            myViewHolder.ll_video_player = null;
            myViewHolder.iv_play_icon = null;
            myViewHolder.ll_now_playing_paused = null;
            myViewHolder.ll_now_playing = null;
            myViewHolder.ll_now_paused = null;
            myViewHolder.ll_buffering = null;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/EpisodeDetailAdapter$a.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.EpisodeDetailAdapter$a */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/EpisodeDetailAdapter$a.class */
    public class C3371a extends C6721i.a {

        /* renamed from: a */
        public final EpisodeDetailAdapter f19704a;

        public C3371a(EpisodeDetailAdapter episodeDetailAdapter) {
            this.f19704a = episodeDetailAdapter;
        }

        @Override // p230n9.C6721i.a
        /* renamed from: g */
        public void mo14733g() {
            int m31016n;
            try {
                if (this.f19704a.f19696t == null || (m31016n = this.f19704a.f19696t.m29290r().m31016n()) == this.f19704a.f19677I) {
                    return;
                }
                if (m31016n == 2 || m31016n == 3) {
                    this.f19704a.m4099w();
                }
            } catch (Exception e10) {
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/EpisodeDetailAdapter$b.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.EpisodeDetailAdapter$b */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/EpisodeDetailAdapter$b.class */
    public class ViewOnClickListenerC3372b implements View.OnClickListener {

        /* renamed from: b */
        public final int f19705b;

        /* renamed from: c */
        public final int f19706c;

        /* renamed from: d */
        public final String f19707d;

        /* renamed from: e */
        public final String f19708e;

        /* renamed from: f */
        public final String f19709f;

        /* renamed from: g */
        public final String f19710g;

        /* renamed from: h */
        public final String f19711h;

        /* renamed from: i */
        public final EpisodeDetailAdapter f19712i;

        public ViewOnClickListenerC3372b(EpisodeDetailAdapter episodeDetailAdapter, int i10, int i11, String str, String str2, String str3, String str4, String str5) {
            this.f19712i = episodeDetailAdapter;
            this.f19705b = i10;
            this.f19706c = i11;
            this.f19707d = str;
            this.f19708e = str2;
            this.f19709f = str3;
            this.f19710g = str4;
            this.f19711h = str5;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f19712i.m17087u0(this.f19705b, this.f19706c, this.f19707d, this.f19708e, this.f19709f, this.f19710g, this.f19711h, view);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/EpisodeDetailAdapter$c.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.EpisodeDetailAdapter$c */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/EpisodeDetailAdapter$c.class */
    public class ViewOnClickListenerC3373c implements View.OnClickListener {

        /* renamed from: b */
        public final int f19713b;

        /* renamed from: c */
        public final int f19714c;

        /* renamed from: d */
        public final String f19715d;

        /* renamed from: e */
        public final String f19716e;

        /* renamed from: f */
        public final String f19717f;

        /* renamed from: g */
        public final String f19718g;

        /* renamed from: h */
        public final String f19719h;

        /* renamed from: i */
        public final EpisodeDetailAdapter f19720i;

        public ViewOnClickListenerC3373c(EpisodeDetailAdapter episodeDetailAdapter, int i10, int i11, String str, String str2, String str3, String str4, String str5) {
            this.f19720i = episodeDetailAdapter;
            this.f19713b = i10;
            this.f19714c = i11;
            this.f19715d = str;
            this.f19716e = str2;
            this.f19717f = str3;
            this.f19718g = str4;
            this.f19719h = str5;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f19720i.m17087u0(this.f19713b, this.f19714c, this.f19715d, this.f19716e, this.f19717f, this.f19718g, this.f19719h, view);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/EpisodeDetailAdapter$d.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.EpisodeDetailAdapter$d */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/EpisodeDetailAdapter$d.class */
    public class ViewOnClickListenerC3374d implements View.OnClickListener {

        /* renamed from: b */
        public final int f19721b;

        /* renamed from: c */
        public final int f19722c;

        /* renamed from: d */
        public final String f19723d;

        /* renamed from: e */
        public final String f19724e;

        /* renamed from: f */
        public final String f19725f;

        /* renamed from: g */
        public final String f19726g;

        /* renamed from: h */
        public final String f19727h;

        /* renamed from: i */
        public final EpisodeDetailAdapter f19728i;

        public ViewOnClickListenerC3374d(EpisodeDetailAdapter episodeDetailAdapter, int i10, int i11, String str, String str2, String str3, String str4, String str5) {
            this.f19728i = episodeDetailAdapter;
            this.f19721b = i10;
            this.f19722c = i11;
            this.f19723d = str;
            this.f19724e = str2;
            this.f19725f = str3;
            this.f19726g = str4;
            this.f19727h = str5;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f19728i.m17087u0(this.f19721b, this.f19722c, this.f19723d, this.f19724e, this.f19725f, this.f19726g, this.f19727h, view);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/EpisodeDetailAdapter$e.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.EpisodeDetailAdapter$e */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/EpisodeDetailAdapter$e.class */
    public class C3375e implements C0304c1.d {

        /* renamed from: a */
        public final ArrayList f19729a;

        /* renamed from: b */
        public final int f19730b;

        /* renamed from: c */
        public final String f19731c;

        /* renamed from: d */
        public final String f19732d;

        /* renamed from: e */
        public final EpisodeDetailAdapter f19733e;

        public C3375e(EpisodeDetailAdapter episodeDetailAdapter, ArrayList arrayList, int i10, String str, String str2) {
            this.f19733e = episodeDetailAdapter;
            this.f19729a = arrayList;
            this.f19730b = i10;
            this.f19731c = str;
            this.f19732d = str2;
        }

        @Override // androidx.appcompat.widget.C0304c1.d
        public boolean onMenuItemClick(MenuItem menuItem) {
            try {
                ArrayList arrayList = this.f19729a;
                if (arrayList != null && arrayList.size() > 0) {
                    for (int i10 = 0; i10 < this.f19729a.size(); i10++) {
                        if (menuItem.getItemId() == i10) {
                            if (menuItem.getItemId() == 0) {
                                C5255e.m26219V(this.f19733e.f19681e, this.f19733e.f19701y, this.f19730b, "series", this.f19731c, "0", this.f19732d, null, "");
                            } else {
                                String m26202E = C5255e.m26202E(this.f19733e.f19681e, this.f19730b, this.f19731c, "series");
                                Intent intent = new Intent(this.f19733e.f19681e, (Class<?>) PlayExternalPlayerActivity.class);
                                intent.putExtra("url", m26202E);
                                intent.putExtra("app_name", ((ExternalPlayerModelClass) this.f19729a.get(i10)).m15415a());
                                intent.putExtra("packagename", ((ExternalPlayerModelClass) this.f19729a.get(i10)).m15416b());
                                this.f19733e.f19681e.startActivity(intent);
                            }
                        }
                    }
                }
                return false;
            } catch (Exception e10) {
                return false;
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/EpisodeDetailAdapter$f.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.EpisodeDetailAdapter$f */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/EpisodeDetailAdapter$f.class */
    public class C3376f implements C0304c1.c {

        /* renamed from: a */
        public final EpisodeDetailAdapter f19734a;

        public C3376f(EpisodeDetailAdapter episodeDetailAdapter) {
            this.f19734a = episodeDetailAdapter;
        }

        @Override // androidx.appcompat.widget.C0304c1.c
        /* renamed from: a */
        public void mo1281a(C0304c1 c0304c1) {
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/EpisodeDetailAdapter$g.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.EpisodeDetailAdapter$g */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/EpisodeDetailAdapter$g.class */
    public class ViewOnFocusChangeListenerC3377g implements View.OnFocusChangeListener {

        /* renamed from: b */
        public final View f19735b;

        /* renamed from: c */
        public final View f19736c;

        /* renamed from: d */
        public final MyViewHolder f19737d;

        /* renamed from: e */
        public final int f19738e;

        /* renamed from: f */
        public final String f19739f;

        /* renamed from: g */
        public final int f19740g;

        /* renamed from: h */
        public final EpisodeDetailAdapter f19741h;

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/EpisodeDetailAdapter$g$a.class
         */
        /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.EpisodeDetailAdapter$g$a */
        /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/EpisodeDetailAdapter$g$a.class */
        public class a implements Runnable {

            /* renamed from: b */
            public final ViewOnFocusChangeListenerC3377g f19742b;

            public a(ViewOnFocusChangeListenerC3377g viewOnFocusChangeListenerC3377g) {
                this.f19742b = viewOnFocusChangeListenerC3377g;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (this.f19742b.f19737d != null && this.f19742b.f19737d.ll_video_player != null) {
                    this.f19742b.f19737d.ll_video_player.setVisibility(4);
                }
                if (this.f19742b.f19737d == null || this.f19742b.f19737d.mVideoView == null) {
                    return;
                }
                this.f19742b.f19737d.mVideoView.setVisibility(0);
                this.f19742b.f19737d.mVideoView.m19254Y((Activity) this.f19742b.f19741h.f19681e, this.f19742b.f19737d.mVideoView);
                this.f19742b.f19741h.f19673E = this.f19742b.f19741h.f19702z + ":" + this.f19742b.f19741h.f19669A + "/series/" + this.f19742b.f19741h.f19671C + "/" + this.f19742b.f19741h.f19672D + "/";
                NSTIJKPlayerSeriesThumbnail nSTIJKPlayerSeriesThumbnail = this.f19742b.f19737d.mVideoView;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this.f19742b.f19741h.f19673E);
                sb2.append(this.f19742b.f19738e);
                sb2.append(InstructionFileId.DOT);
                sb2.append(this.f19742b.f19739f);
                nSTIJKPlayerSeriesThumbnail.m19256a0(Uri.parse(sb2.toString()), true, "");
                this.f19742b.f19737d.mVideoView.f24172I = 0;
                this.f19742b.f19737d.mVideoView.f24176K = false;
                this.f19742b.f19737d.mVideoView.m19242M(this.f19742b.f19737d.mVideoView, this.f19742b.f19737d.ll_hover, this.f19742b.f19737d.ll_video_player, this.f19742b.f19737d.MovieImage, this.f19742b.f19737d.ll_pb_recent_watch, this.f19742b.f19737d.ll_episode_thumbnail, this.f19742b.f19737d.pb_recent_watch, ((GetEpisdoeDetailsCallback) this.f19742b.f19741h.f19682f.get(this.f19742b.f19740g)).m14957i());
                this.f19742b.f19737d.mVideoView.start();
                ViewOnFocusChangeListenerC3377g viewOnFocusChangeListenerC3377g = this.f19742b;
                viewOnFocusChangeListenerC3377g.f19741h.f19675G = viewOnFocusChangeListenerC3377g.f19737d.mVideoView;
            }
        }

        public ViewOnFocusChangeListenerC3377g(EpisodeDetailAdapter episodeDetailAdapter, View view, LinearLayout linearLayout, MyViewHolder myViewHolder, int i10, String str, int i11) {
            this.f19741h = episodeDetailAdapter;
            this.f19735b = view;
            this.f19736c = linearLayout;
            this.f19737d = myViewHolder;
            this.f19738e = i10;
            this.f19739f = str;
            this.f19740g = i11;
        }

        /* renamed from: e */
        public final void m17094e(boolean z10) {
            if (z10) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f19735b, "alpha", z10 ? 0.6f : 0.5f);
                ofFloat.setDuration(150L);
                ofFloat.start();
            }
        }

        /* renamed from: f */
        public final void m17095f(float f10) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f19735b, "scaleX", f10);
            ofFloat.setDuration(150L);
            ofFloat.start();
        }

        /* renamed from: g */
        public final void m17096g(float f10) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f19735b, "scaleY", f10);
            ofFloat.setDuration(150L);
            ofFloat.start();
        }

        @Override // android.view.View.OnFocusChangeListener
        @SuppressLint({"ResourceType"})
        public void onFocusChange(View view, boolean z10) {
            ImageView imageView;
            NSTIJKPlayerSeriesThumbnail nSTIJKPlayerSeriesThumbnail;
            LinearLayout linearLayout;
            TextView textView;
            ImageView imageView2;
            NSTIJKPlayerSeriesThumbnail nSTIJKPlayerSeriesThumbnail2;
            ImageView imageView3;
            TextView textView2;
            View view2;
            int i10;
            float f10 = 1.0f;
            try {
                if (z10) {
                    if (z10) {
                        f10 = 1.1f;
                    }
                    View view3 = this.f19735b;
                    if (view3 == null || view3.getTag() == null || !this.f19735b.getTag().equals("1")) {
                        View view4 = this.f19735b;
                        if (view4 == null || view4.getTag() == null || !this.f19735b.getTag().equals("2")) {
                            View view5 = this.f19735b;
                            if (view5 == null || view5.getTag() == null || !this.f19735b.getTag().equals("20")) {
                                m17095f(f10);
                                return;
                            }
                            View view6 = this.f19736c;
                            if (view6 != null) {
                                view6.setVisibility(0);
                            }
                            MyViewHolder myViewHolder = this.f19737d;
                            if (myViewHolder != null && (textView2 = myViewHolder.MovieName) != null) {
                                textView2.setTextColor(this.f19741h.f19681e.getResources().getColor(2131100097));
                            }
                            MyViewHolder myViewHolder2 = this.f19737d;
                            if (myViewHolder2 != null && (imageView3 = myViewHolder2.iv_play_icon) != null) {
                                imageView3.setVisibility(0);
                            }
                            this.f19741h.f19674F.removeCallbacksAndMessages(null);
                            this.f19741h.f19674F.postDelayed(new a(this), 5000L);
                            return;
                        }
                        m17095f(f10);
                        view2 = this.f19735b;
                        i10 = 2131231576;
                    } else {
                        m17095f(f10);
                        view2 = this.f19735b;
                        i10 = 2131230828;
                    }
                    view2.setBackgroundResource(i10);
                    return;
                }
                if (z10) {
                    return;
                }
                if (z10) {
                    f10 = 1.09f;
                }
                this.f19741h.f19674F.removeCallbacksAndMessages(null);
                MyViewHolder myViewHolder3 = this.f19737d;
                if (myViewHolder3 != null && (nSTIJKPlayerSeriesThumbnail2 = myViewHolder3.mVideoView) != null) {
                    try {
                        if (nSTIJKPlayerSeriesThumbnail2.m19247R()) {
                            this.f19737d.mVideoView.m19240K();
                        } else {
                            this.f19737d.mVideoView.m19260e0();
                            this.f19737d.mVideoView.m19251V(true);
                            this.f19737d.mVideoView.m19259d0();
                        }
                        IjkMediaPlayer.native_profileEnd();
                    } catch (Exception e10) {
                    }
                }
                MyViewHolder myViewHolder4 = this.f19737d;
                if (myViewHolder4 != null && (imageView2 = myViewHolder4.iv_play_icon) != null) {
                    imageView2.setVisibility(8);
                }
                View view7 = this.f19736c;
                if (view7 != null) {
                    view7.setVisibility(8);
                }
                MyViewHolder myViewHolder5 = this.f19737d;
                if (myViewHolder5 != null && (textView = myViewHolder5.MovieName) != null) {
                    textView.setTextColor(-1);
                }
                MyViewHolder myViewHolder6 = this.f19737d;
                if (myViewHolder6 != null && (linearLayout = myViewHolder6.ll_video_player) != null) {
                    linearLayout.setVisibility(8);
                }
                MyViewHolder myViewHolder7 = this.f19737d;
                if (myViewHolder7 != null && (nSTIJKPlayerSeriesThumbnail = myViewHolder7.mVideoView) != null) {
                    nSTIJKPlayerSeriesThumbnail.setVisibility(8);
                }
                MyViewHolder myViewHolder8 = this.f19737d;
                if (myViewHolder8 != null && (imageView = myViewHolder8.MovieImage) != null) {
                    imageView.setVisibility(0);
                }
                if (this.f19737d != null && this.f19741h.f19682f != null && this.f19741h.f19682f.size() > 0) {
                    try {
                        if (this.f19741h.f19682f.get(this.f19740g) == null || ((GetEpisdoeDetailsCallback) this.f19741h.f19682f.get(this.f19740g)).m14957i() == 0) {
                            this.f19737d.ll_pb_recent_watch.setVisibility(8);
                        } else {
                            this.f19737d.ll_pb_recent_watch.setVisibility(0);
                            this.f19737d.pb_recent_watch.setProgress(((GetEpisdoeDetailsCallback) this.f19741h.f19682f.get(this.f19740g)).m14957i());
                        }
                    } catch (Exception e11) {
                        this.f19737d.ll_pb_recent_watch.setVisibility(8);
                    }
                }
                m17094e(z10);
                View view8 = this.f19735b;
                if (view8 == null || view8.getTag() == null || !this.f19735b.getTag().equals("1")) {
                    View view9 = this.f19735b;
                    if (view9 == null || view9.getTag() == null || !this.f19735b.getTag().equals("2")) {
                        m17095f(f10);
                        m17096g(f10);
                        return;
                    } else {
                        m17095f(f10);
                        m17096g(f10);
                    }
                } else {
                    m17095f(f10);
                    m17096g(f10);
                }
                this.f19735b.setBackgroundResource(2131230845);
            } catch (Exception e12) {
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0233, code lost:
    
        if (r0.equals(org.apache.http.HttpHost.DEFAULT_SCHEME_NAME) == false) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public EpisodeDetailAdapter(android.content.Context r8, java.lang.String r9, java.lang.String r10, java.util.List<com.maxdigitall.maxdigitaliptvbox.model.callback.SeriesDBModel> r11, java.lang.String r12, java.lang.String r13) {
        /*
            Method dump skipped, instructions count: 913
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.maxdigitall.maxdigitaliptvbox.view.adapter.EpisodeDetailAdapter.<init>(android.content.Context, java.lang.String, java.lang.String, java.util.List, java.lang.String, java.lang.String):void");
    }

    /* renamed from: r0 */
    public static long m17084r0(SimpleDateFormat simpleDateFormat, String str, String str2) {
        try {
            return TimeUnit.DAYS.convert(simpleDateFormat.parse(str2).getTime() - simpleDateFormat.parse(str).getTime(), TimeUnit.MILLISECONDS);
        } catch (Exception e10) {
            e10.printStackTrace();
            return 0L;
        }
    }

    /* renamed from: s0 */
    public static String m17085s0(Context context) {
        return String.valueOf(context.getApplicationInfo().loadLabel(context.getPackageManager()));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0677h
    /* renamed from: n */
    public int mo3013n() {
        int i10;
        try {
            List<GetEpisdoeDetailsCallback> list = this.f19682f;
            i10 = 0;
            if (list != null) {
                i10 = list.size();
            }
        } catch (Exception e10) {
            i10 = 0;
        }
        return i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:87:0x0407, code lost:
    
        if (r0 != 4) goto L105;
     */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0677h
    @android.annotation.SuppressLint({"SetTextI18n"})
    /* renamed from: t0, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo2996G(com.maxdigitall.maxdigitaliptvbox.view.adapter.EpisodeDetailAdapter.MyViewHolder r11, int r12) {
        /*
            Method dump skipped, instructions count: 1324
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.maxdigitall.maxdigitaliptvbox.view.adapter.EpisodeDetailAdapter.mo2996G(com.maxdigitall.maxdigitaliptvbox.view.adapter.EpisodeDetailAdapter$MyViewHolder, int):void");
    }

    /* renamed from: u0 */
    public final void m17087u0(int i10, int i11, String str, String str2, String str3, String str4, String str5, View view) {
        try {
            Handler handler = this.f19674F;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
            C5251a.f30025X = true;
            C5251a.f30024W = i10;
            m17089w0();
            C5947e c5947e = this.f19696t;
            if (c5947e != null && c5947e.m29348c()) {
                if (this.f19687k.booleanValue()) {
                    String str6 = this.f19681e.getResources().getString(2132018529) + " - " + str4;
                    String m26202E = C5255e.m26202E(this.f19681e, i11, str, "series");
                    C5947e c5947e2 = this.f19696t;
                    if (c5947e2 != null && c5947e2.m29290r() != null && this.f19696t.m29290r().m31009j() != null && this.f19696t.m29290r().m31009j().m13058R() != null) {
                        this.f19676H = this.f19696t.m29290r().m31009j().m13058R();
                    }
                    if (this.f19676H.equals(m26202E)) {
                        this.f19681e.startActivity(new Intent(this.f19681e, (Class<?>) ExpandedControlsActivity.class));
                        return;
                    } else {
                        C4718a.m23743c(C5255e.m26215R(str5), true, C4718a.m23741a(str2, str6, "", 0, m26202E, "videos/mp4", str3, "", null), this.f19696t, this.f19681e);
                        return;
                    }
                }
                return;
            }
            if (!this.f19687k.booleanValue()) {
                return;
            }
            if (this.f19678J.equals("from_player")) {
                Context context = this.f19681e;
                if (context instanceof HoneyPlayer) {
                    ((HoneyPlayer) context).m15827f1(this.f19701y, i11, str2, "series");
                    return;
                }
                return;
            }
            new ArrayList();
            ArrayList arrayList = new ArrayList();
            C0304c1 c0304c1 = new C0304c1(this.f19681e, view);
            c0304c1.m1276c().inflate(2131689489, c0304c1.m1275b());
            ArrayList<ExternalPlayerModelClass> m15132o = new ExternalPlayerDataBase(this.f19681e).m15132o();
            if (m15132o == null || m15132o.size() <= 0) {
                C5255e.m26219V(this.f19681e, this.f19701y, i11, "series", str, String.valueOf(i10), str2, null, "");
                return;
            }
            c0304c1.m1275b().add(0, 0, 0, this.f19681e.getResources().getString(2132018170));
            ExternalPlayerModelClass externalPlayerModelClass = new ExternalPlayerModelClass();
            externalPlayerModelClass.m15419e(0);
            externalPlayerModelClass.m15418d(this.f19681e.getResources().getString(2132018328));
            arrayList.add(externalPlayerModelClass);
            int i12 = 0;
            while (true) {
                int i13 = i12;
                if (i13 >= m15132o.size()) {
                    c0304c1.m1279f(new C3375e(this, arrayList, i11, str, str2));
                    c0304c1.m1278e(new C3376f(this));
                    c0304c1.m1280g();
                    return;
                }
                Menu m1275b = c0304c1.m1275b();
                int i14 = i13 + 1;
                m1275b.add(0, i14, 0, this.f19681e.getResources().getString(2132018328) + " " + m15132o.get(i13).m15415a());
                arrayList.add(m15132o.get(i13));
                i12 = i14;
            }
        } catch (Exception e10) {
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0677h
    /* renamed from: v0, reason: merged with bridge method [inline-methods] */
    public MyViewHolder mo2998J(ViewGroup viewGroup, int i10) {
        LayoutInflater from;
        int i11;
        if (this.f19679K.equals("mobile")) {
            from = LayoutInflater.from(viewGroup.getContext());
            i11 = 2131624192;
        } else {
            from = LayoutInflater.from(viewGroup.getContext());
            i11 = 2131624193;
        }
        MyViewHolder myViewHolder = new MyViewHolder(from.inflate(i11, viewGroup, false));
        this.f19686j = myViewHolder;
        return myViewHolder;
    }

    /* renamed from: w0 */
    public void m17089w0() {
        NSTIJKPlayerSeriesThumbnail nSTIJKPlayerSeriesThumbnail = this.f19675G;
        if (nSTIJKPlayerSeriesThumbnail != null) {
            try {
                if (nSTIJKPlayerSeriesThumbnail.m19247R()) {
                    this.f19675G.m19240K();
                } else {
                    this.f19675G.m19260e0();
                    this.f19675G.m19251V(true);
                    this.f19675G.m19259d0();
                }
                IjkMediaPlayer.native_profileEnd();
            } catch (Exception e10) {
            }
        }
    }
}
