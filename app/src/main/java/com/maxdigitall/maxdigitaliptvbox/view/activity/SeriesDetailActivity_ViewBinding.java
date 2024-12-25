package com.maxdigitall.maxdigitaliptvbox.view.activity;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RatingBar;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import com.google.android.material.appbar.AppBarLayout;
import p316s2.AbstractViewOnClickListenerC8521b;
import p316s2.C8522c;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesDetailActivity_ViewBinding.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesDetailActivity_ViewBinding.class */
public class SeriesDetailActivity_ViewBinding implements Unbinder {

    /* renamed from: b */
    public SeriesDetailActivity f18568b;

    /* renamed from: c */
    public View f18569c;

    /* renamed from: d */
    public View f18570d;

    /* renamed from: e */
    public View f18571e;

    /* renamed from: f */
    public View f18572f;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesDetailActivity_ViewBinding$a.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.SeriesDetailActivity_ViewBinding$a */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesDetailActivity_ViewBinding$a.class */
    public class C3091a extends AbstractViewOnClickListenerC8521b {

        /* renamed from: d */
        public final SeriesDetailActivity f18573d;

        /* renamed from: e */
        public final SeriesDetailActivity_ViewBinding f18574e;

        public C3091a(SeriesDetailActivity_ViewBinding seriesDetailActivity_ViewBinding, SeriesDetailActivity seriesDetailActivity) {
            this.f18574e = seriesDetailActivity_ViewBinding;
            this.f18573d = seriesDetailActivity;
        }

        @Override // p316s2.AbstractViewOnClickListenerC8521b
        /* renamed from: b */
        public void mo14535b(View view) {
            this.f18573d.onViewClicked(view);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesDetailActivity_ViewBinding$b.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.SeriesDetailActivity_ViewBinding$b */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesDetailActivity_ViewBinding$b.class */
    public class C3092b extends AbstractViewOnClickListenerC8521b {

        /* renamed from: d */
        public final SeriesDetailActivity f18575d;

        /* renamed from: e */
        public final SeriesDetailActivity_ViewBinding f18576e;

        public C3092b(SeriesDetailActivity_ViewBinding seriesDetailActivity_ViewBinding, SeriesDetailActivity seriesDetailActivity) {
            this.f18576e = seriesDetailActivity_ViewBinding;
            this.f18575d = seriesDetailActivity;
        }

        @Override // p316s2.AbstractViewOnClickListenerC8521b
        /* renamed from: b */
        public void mo14535b(View view) {
            this.f18575d.onViewClicked(view);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesDetailActivity_ViewBinding$c.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.SeriesDetailActivity_ViewBinding$c */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesDetailActivity_ViewBinding$c.class */
    public class C3093c extends AbstractViewOnClickListenerC8521b {

        /* renamed from: d */
        public final SeriesDetailActivity f18577d;

        /* renamed from: e */
        public final SeriesDetailActivity_ViewBinding f18578e;

        public C3093c(SeriesDetailActivity_ViewBinding seriesDetailActivity_ViewBinding, SeriesDetailActivity seriesDetailActivity) {
            this.f18578e = seriesDetailActivity_ViewBinding;
            this.f18577d = seriesDetailActivity;
        }

        @Override // p316s2.AbstractViewOnClickListenerC8521b
        /* renamed from: b */
        public void mo14535b(View view) {
            this.f18577d.onViewClicked(view);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesDetailActivity_ViewBinding$d.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.SeriesDetailActivity_ViewBinding$d */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesDetailActivity_ViewBinding$d.class */
    public class C3094d extends AbstractViewOnClickListenerC8521b {

        /* renamed from: d */
        public final SeriesDetailActivity f18579d;

        /* renamed from: e */
        public final SeriesDetailActivity_ViewBinding f18580e;

        public C3094d(SeriesDetailActivity_ViewBinding seriesDetailActivity_ViewBinding, SeriesDetailActivity seriesDetailActivity) {
            this.f18580e = seriesDetailActivity_ViewBinding;
            this.f18579d = seriesDetailActivity;
        }

        @Override // p316s2.AbstractViewOnClickListenerC8521b
        /* renamed from: b */
        public void mo14535b(View view) {
            this.f18579d.onViewClicked(view);
        }
    }

    public SeriesDetailActivity_ViewBinding(SeriesDetailActivity seriesDetailActivity, View view) {
        this.f18568b = seriesDetailActivity;
        seriesDetailActivity.toolbar = (Toolbar) C8522c.m36739c(view, 2131429320, "field 'toolbar'", Toolbar.class);
        seriesDetailActivity.appbarToolbar = (AppBarLayout) C8522c.m36739c(view, 2131427548, "field 'appbarToolbar'", AppBarLayout.class);
        seriesDetailActivity.rlAccountInfo = (RelativeLayout) C8522c.m36739c(view, 2131428944, "field 'rlAccountInfo'", RelativeLayout.class);
        seriesDetailActivity.ivMovieImage = (ImageView) C8522c.m36739c(view, 2131428200, "field 'ivMovieImage'", ImageView.class);
        View m36738b = C8522c.m36738b(view, 2131429594, "field 'tvSeasonButton' and method 'onViewClicked'");
        seriesDetailActivity.tvSeasonButton = (TextView) C8522c.m36737a(m36738b, 2131429594, "field 'tvSeasonButton'", TextView.class);
        this.f18569c = m36738b;
        m36738b.setOnClickListener(new C3091a(this, seriesDetailActivity));
        seriesDetailActivity.tvMovieName = (TextView) C8522c.m36739c(view, 2131429519, "field 'tvMovieName'", TextView.class);
        View m36738b2 = C8522c.m36738b(view, 2131429558, "field 'tvPlay' and method 'onViewClicked'");
        seriesDetailActivity.tvPlay = (TextView) C8522c.m36737a(m36738b2, 2131429558, "field 'tvPlay'", TextView.class);
        this.f18570d = m36738b2;
        m36738b2.setOnClickListener(new C3092b(this, seriesDetailActivity));
        seriesDetailActivity.tvDirector = (TextView) C8522c.m36739c(view, 2131429419, "field 'tvDirector'", TextView.class);
        seriesDetailActivity.tvDirectorInfo = (TextView) C8522c.m36739c(view, 2131429420, "field 'tvDirectorInfo'", TextView.class);
        seriesDetailActivity.tvCast = (TextView) C8522c.m36739c(view, 2131429371, "field 'tvCast'", TextView.class);
        seriesDetailActivity.tvCastInfo = (TextView) C8522c.m36739c(view, 2131429373, "field 'tvCastInfo'", TextView.class);
        seriesDetailActivity.tvReleaseDate = (TextView) C8522c.m36739c(view, 2131429590, "field 'tvReleaseDate'", TextView.class);
        seriesDetailActivity.tvReleaseDateInfo = (TextView) C8522c.m36739c(view, 2131429591, "field 'tvReleaseDateInfo'", TextView.class);
        seriesDetailActivity.ratingBar = (RatingBar) C8522c.m36739c(view, 2131428891, "field 'ratingBar'", RatingBar.class);
        seriesDetailActivity.ivFavourite = (ImageView) C8522c.m36739c(view, 2131428179, "field 'ivFavourite'", ImageView.class);
        seriesDetailActivity.tvMovieGenere = (TextView) C8522c.m36739c(view, 2131429516, "field 'tvMovieGenere'", TextView.class);
        seriesDetailActivity.tv_genre_info = (TextView) C8522c.m36739c(view, 2131429466, "field 'tv_genre_info'", TextView.class);
        seriesDetailActivity.tvMovieDuration = (TextView) C8522c.m36739c(view, 2131429514, "field 'tvMovieDuration'", TextView.class);
        seriesDetailActivity.tvMovieDurationInfo = (TextView) C8522c.m36739c(view, 2131429515, "field 'tvMovieDurationInfo'", TextView.class);
        seriesDetailActivity.llMovieInfoBox = (LinearLayout) C8522c.m36739c(view, 2131428444, "field 'llMovieInfoBox'", LinearLayout.class);
        seriesDetailActivity.scrollView = (ScrollView) C8522c.m36739c(view, 2131429115, "field 'scrollView'", ScrollView.class);
        seriesDetailActivity.nestedScrollView = (NestedScrollView) C8522c.m36739c(view, 2131428779, "field 'nestedScrollView'", NestedScrollView.class);
        seriesDetailActivity.llDirectorBox = (LinearLayout) C8522c.m36739c(view, 2131428372, "field 'llDirectorBox'", LinearLayout.class);
        seriesDetailActivity.llReleasedBox = (LinearLayout) C8522c.m36739c(view, 2131428486, "field 'llReleasedBox'", LinearLayout.class);
        seriesDetailActivity.llDurationBox = (LinearLayout) C8522c.m36739c(view, 2131428381, "field 'llDurationBox'", LinearLayout.class);
        seriesDetailActivity.llGenreBox = (LinearLayout) C8522c.m36739c(view, 2131428412, "field 'llGenreBox'", LinearLayout.class);
        seriesDetailActivity.llCastBox = (LinearLayout) C8522c.m36739c(view, 2131428345, "field 'llCastBox'", LinearLayout.class);
        seriesDetailActivity.llDirectorBoxInfo = (LinearLayout) C8522c.m36739c(view, 2131428373, "field 'llDirectorBoxInfo'", LinearLayout.class);
        seriesDetailActivity.llReleasedBoxInfo = (LinearLayout) C8522c.m36739c(view, 2131428487, "field 'llReleasedBoxInfo'", LinearLayout.class);
        seriesDetailActivity.llDurationBoxInfo = (LinearLayout) C8522c.m36739c(view, 2131428382, "field 'llDurationBoxInfo'", LinearLayout.class);
        seriesDetailActivity.llGenreBoxInfo = (LinearLayout) C8522c.m36739c(view, 2131428413, "field 'llGenreBoxInfo'", LinearLayout.class);
        seriesDetailActivity.llCastBoxInfo = (LinearLayout) C8522c.m36739c(view, 2131428346, "field 'llCastBoxInfo'", LinearLayout.class);
        View m36738b3 = C8522c.m36738b(view, 2131429581, "field 'tvReadMore' and method 'onViewClicked'");
        seriesDetailActivity.tvReadMore = (TextView) C8522c.m36737a(m36738b3, 2131429581, "field 'tvReadMore'", TextView.class);
        this.f18571e = m36738b3;
        m36738b3.setOnClickListener(new C3093c(this, seriesDetailActivity));
        seriesDetailActivity.ll_watch_trailer = (LinearLayout) C8522c.m36739c(view, 2131428539, "field 'll_watch_trailer'", LinearLayout.class);
        View m36738b4 = C8522c.m36738b(view, 2131429642, "field 'tvWatchTrailer' and method 'onViewClicked'");
        seriesDetailActivity.tvWatchTrailer = (TextView) C8522c.m36737a(m36738b4, 2131429642, "field 'tvWatchTrailer'", TextView.class);
        this.f18572f = m36738b4;
        m36738b4.setOnClickListener(new C3094d(this, seriesDetailActivity));
        seriesDetailActivity.logo = (ImageView) C8522c.m36739c(view, 2131428555, "field 'logo'", ImageView.class);
        seriesDetailActivity.rvCast = (RecyclerView) C8522c.m36739c(view, 2131429087, "field 'rvCast'", RecyclerView.class);
        seriesDetailActivity.pb_button_recent_watch = (ProgressBar) C8522c.m36739c(view, 2131428824, "field 'pb_button_recent_watch'", ProgressBar.class);
        seriesDetailActivity.ll_play_button_main_layout = (LinearLayout) C8522c.m36739c(view, 2131428468, "field 'll_play_button_main_layout'", LinearLayout.class);
        seriesDetailActivity.ll_season_button_main_layout = (LinearLayout) C8522c.m36739c(view, 2131428497, "field 'll_season_button_main_layout'", LinearLayout.class);
        seriesDetailActivity.ll_watch_trailer_button_main_layout = (LinearLayout) C8522c.m36739c(view, 2131428540, "field 'll_watch_trailer_button_main_layout'", LinearLayout.class);
        seriesDetailActivity.rlTransparent = (RelativeLayout) C8522c.m36739c(view, 2131429067, "field 'rlTransparent'", RelativeLayout.class);
        seriesDetailActivity.myRecyclerView = (RecyclerView) C8522c.m36739c(view, 2131428747, "field 'myRecyclerView'", RecyclerView.class);
        seriesDetailActivity.episode_tab = (TextView) C8522c.m36739c(view, 2131427900, "field 'episode_tab'", TextView.class);
        seriesDetailActivity.cast_tab = (TextView) C8522c.m36739c(view, 2131427730, "field 'cast_tab'", TextView.class);
        seriesDetailActivity.iv_back_button = (ImageView) C8522c.m36739c(view, 2131428145, "field 'iv_back_button'", ImageView.class);
    }

    @Override // butterknife.Unbinder
    /* renamed from: a */
    public void mo5629a() {
        SeriesDetailActivity seriesDetailActivity = this.f18568b;
        if (seriesDetailActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f18568b = null;
        seriesDetailActivity.toolbar = null;
        seriesDetailActivity.appbarToolbar = null;
        seriesDetailActivity.rlAccountInfo = null;
        seriesDetailActivity.ivMovieImage = null;
        seriesDetailActivity.tvSeasonButton = null;
        seriesDetailActivity.tvMovieName = null;
        seriesDetailActivity.tvPlay = null;
        seriesDetailActivity.tvDirector = null;
        seriesDetailActivity.tvDirectorInfo = null;
        seriesDetailActivity.tvCast = null;
        seriesDetailActivity.tvCastInfo = null;
        seriesDetailActivity.tvReleaseDate = null;
        seriesDetailActivity.tvReleaseDateInfo = null;
        seriesDetailActivity.ratingBar = null;
        seriesDetailActivity.ivFavourite = null;
        seriesDetailActivity.tvMovieGenere = null;
        seriesDetailActivity.tv_genre_info = null;
        seriesDetailActivity.tvMovieDuration = null;
        seriesDetailActivity.tvMovieDurationInfo = null;
        seriesDetailActivity.llMovieInfoBox = null;
        seriesDetailActivity.scrollView = null;
        seriesDetailActivity.nestedScrollView = null;
        seriesDetailActivity.llDirectorBox = null;
        seriesDetailActivity.llReleasedBox = null;
        seriesDetailActivity.llDurationBox = null;
        seriesDetailActivity.llGenreBox = null;
        seriesDetailActivity.llCastBox = null;
        seriesDetailActivity.llDirectorBoxInfo = null;
        seriesDetailActivity.llReleasedBoxInfo = null;
        seriesDetailActivity.llDurationBoxInfo = null;
        seriesDetailActivity.llGenreBoxInfo = null;
        seriesDetailActivity.llCastBoxInfo = null;
        seriesDetailActivity.tvReadMore = null;
        seriesDetailActivity.ll_watch_trailer = null;
        seriesDetailActivity.tvWatchTrailer = null;
        seriesDetailActivity.logo = null;
        seriesDetailActivity.rvCast = null;
        seriesDetailActivity.pb_button_recent_watch = null;
        seriesDetailActivity.ll_play_button_main_layout = null;
        seriesDetailActivity.ll_season_button_main_layout = null;
        seriesDetailActivity.ll_watch_trailer_button_main_layout = null;
        seriesDetailActivity.rlTransparent = null;
        seriesDetailActivity.myRecyclerView = null;
        seriesDetailActivity.episode_tab = null;
        seriesDetailActivity.cast_tab = null;
        seriesDetailActivity.iv_back_button = null;
        this.f18569c.setOnClickListener(null);
        this.f18569c = null;
        this.f18570d.setOnClickListener(null);
        this.f18570d = null;
        this.f18571e.setOnClickListener(null);
        this.f18571e = null;
        this.f18572f.setOnClickListener(null);
        this.f18572f = null;
    }
}
