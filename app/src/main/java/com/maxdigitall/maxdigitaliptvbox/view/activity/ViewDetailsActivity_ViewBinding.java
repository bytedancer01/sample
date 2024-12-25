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
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/ViewDetailsActivity_ViewBinding.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/ViewDetailsActivity_ViewBinding.class */
public class ViewDetailsActivity_ViewBinding implements Unbinder {

    /* renamed from: b */
    public ViewDetailsActivity f19216b;

    /* renamed from: c */
    public View f19217c;

    /* renamed from: d */
    public View f19218d;

    /* renamed from: e */
    public View f19219e;

    /* renamed from: f */
    public View f19220f;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/ViewDetailsActivity_ViewBinding$a.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.ViewDetailsActivity_ViewBinding$a */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/ViewDetailsActivity_ViewBinding$a.class */
    public class C3259a extends AbstractViewOnClickListenerC8521b {

        /* renamed from: d */
        public final ViewDetailsActivity f19221d;

        /* renamed from: e */
        public final ViewDetailsActivity_ViewBinding f19222e;

        public C3259a(ViewDetailsActivity_ViewBinding viewDetailsActivity_ViewBinding, ViewDetailsActivity viewDetailsActivity) {
            this.f19222e = viewDetailsActivity_ViewBinding;
            this.f19221d = viewDetailsActivity;
        }

        @Override // p316s2.AbstractViewOnClickListenerC8521b
        /* renamed from: b */
        public void mo14535b(View view) {
            this.f19221d.onViewClicked(view);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/ViewDetailsActivity_ViewBinding$b.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.ViewDetailsActivity_ViewBinding$b */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/ViewDetailsActivity_ViewBinding$b.class */
    public class C3260b extends AbstractViewOnClickListenerC8521b {

        /* renamed from: d */
        public final ViewDetailsActivity f19223d;

        /* renamed from: e */
        public final ViewDetailsActivity_ViewBinding f19224e;

        public C3260b(ViewDetailsActivity_ViewBinding viewDetailsActivity_ViewBinding, ViewDetailsActivity viewDetailsActivity) {
            this.f19224e = viewDetailsActivity_ViewBinding;
            this.f19223d = viewDetailsActivity;
        }

        @Override // p316s2.AbstractViewOnClickListenerC8521b
        /* renamed from: b */
        public void mo14535b(View view) {
            this.f19223d.onViewClicked(view);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/ViewDetailsActivity_ViewBinding$c.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.ViewDetailsActivity_ViewBinding$c */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/ViewDetailsActivity_ViewBinding$c.class */
    public class C3261c extends AbstractViewOnClickListenerC8521b {

        /* renamed from: d */
        public final ViewDetailsActivity f19225d;

        /* renamed from: e */
        public final ViewDetailsActivity_ViewBinding f19226e;

        public C3261c(ViewDetailsActivity_ViewBinding viewDetailsActivity_ViewBinding, ViewDetailsActivity viewDetailsActivity) {
            this.f19226e = viewDetailsActivity_ViewBinding;
            this.f19225d = viewDetailsActivity;
        }

        @Override // p316s2.AbstractViewOnClickListenerC8521b
        /* renamed from: b */
        public void mo14535b(View view) {
            this.f19225d.onViewClicked(view);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/ViewDetailsActivity_ViewBinding$d.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.ViewDetailsActivity_ViewBinding$d */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/ViewDetailsActivity_ViewBinding$d.class */
    public class C3262d extends AbstractViewOnClickListenerC8521b {

        /* renamed from: d */
        public final ViewDetailsActivity f19227d;

        /* renamed from: e */
        public final ViewDetailsActivity_ViewBinding f19228e;

        public C3262d(ViewDetailsActivity_ViewBinding viewDetailsActivity_ViewBinding, ViewDetailsActivity viewDetailsActivity) {
            this.f19228e = viewDetailsActivity_ViewBinding;
            this.f19227d = viewDetailsActivity;
        }

        @Override // p316s2.AbstractViewOnClickListenerC8521b
        /* renamed from: b */
        public void mo14535b(View view) {
            this.f19227d.onViewClicked(view);
        }
    }

    public ViewDetailsActivity_ViewBinding(ViewDetailsActivity viewDetailsActivity, View view) {
        this.f19216b = viewDetailsActivity;
        viewDetailsActivity.toolbar = (Toolbar) C8522c.m36739c(view, 2131429320, "field 'toolbar'", Toolbar.class);
        viewDetailsActivity.appbarToolbar = (AppBarLayout) C8522c.m36739c(view, 2131427548, "field 'appbarToolbar'", AppBarLayout.class);
        viewDetailsActivity.rlAccountInfo = (RelativeLayout) C8522c.m36739c(view, 2131428944, "field 'rlAccountInfo'", RelativeLayout.class);
        View m36738b = C8522c.m36738b(view, 2131428200, "field 'ivMovieImage' and method 'onViewClicked'");
        viewDetailsActivity.ivMovieImage = (ImageView) C8522c.m36737a(m36738b, 2131428200, "field 'ivMovieImage'", ImageView.class);
        this.f19217c = m36738b;
        m36738b.setOnClickListener(new C3259a(this, viewDetailsActivity));
        viewDetailsActivity.tvMovieName = (TextView) C8522c.m36739c(view, 2131429519, "field 'tvMovieName'", TextView.class);
        View m36738b2 = C8522c.m36738b(view, 2131429558, "field 'tvPlay' and method 'onViewClicked'");
        viewDetailsActivity.tvPlay = (TextView) C8522c.m36737a(m36738b2, 2131429558, "field 'tvPlay'", TextView.class);
        this.f19218d = m36738b2;
        m36738b2.setOnClickListener(new C3260b(this, viewDetailsActivity));
        viewDetailsActivity.tvMovieInfo = (TextView) C8522c.m36739c(view, 2131429518, "field 'tvMovieInfo'", TextView.class);
        viewDetailsActivity.tvDirector = (TextView) C8522c.m36739c(view, 2131429419, "field 'tvDirector'", TextView.class);
        viewDetailsActivity.tvDirectorInfo = (TextView) C8522c.m36739c(view, 2131429420, "field 'tvDirectorInfo'", TextView.class);
        viewDetailsActivity.tvCast = (TextView) C8522c.m36739c(view, 2131429371, "field 'tvCast'", TextView.class);
        viewDetailsActivity.tvCastInfo = (TextView) C8522c.m36739c(view, 2131429373, "field 'tvCastInfo'", TextView.class);
        viewDetailsActivity.tvReleaseDate = (TextView) C8522c.m36739c(view, 2131429590, "field 'tvReleaseDate'", TextView.class);
        viewDetailsActivity.tvReleaseDateInfo = (TextView) C8522c.m36739c(view, 2131429591, "field 'tvReleaseDateInfo'", TextView.class);
        viewDetailsActivity.ratingBar = (RatingBar) C8522c.m36739c(view, 2131428891, "field 'ratingBar'", RatingBar.class);
        viewDetailsActivity.ivFavourite = (ImageView) C8522c.m36739c(view, 2131428179, "field 'ivFavourite'", ImageView.class);
        viewDetailsActivity.tvMovieGenere = (TextView) C8522c.m36739c(view, 2131429516, "field 'tvMovieGenere'", TextView.class);
        viewDetailsActivity.tv_genre_info = (TextView) C8522c.m36739c(view, 2131429466, "field 'tv_genre_info'", TextView.class);
        viewDetailsActivity.tvMovieDuration = (TextView) C8522c.m36739c(view, 2131429514, "field 'tvMovieDuration'", TextView.class);
        viewDetailsActivity.tvMovieDurationInfo = (TextView) C8522c.m36739c(view, 2131429515, "field 'tvMovieDurationInfo'", TextView.class);
        viewDetailsActivity.llMovieInfoBox = (LinearLayout) C8522c.m36739c(view, 2131428444, "field 'llMovieInfoBox'", LinearLayout.class);
        viewDetailsActivity.scrollView = (ScrollView) C8522c.m36739c(view, 2131429115, "field 'scrollView'", ScrollView.class);
        viewDetailsActivity.nestedScrollView = (NestedScrollView) C8522c.m36739c(view, 2131428779, "field 'nestedScrollView'", NestedScrollView.class);
        viewDetailsActivity.llDirectorBox = (LinearLayout) C8522c.m36739c(view, 2131428372, "field 'llDirectorBox'", LinearLayout.class);
        viewDetailsActivity.llReleasedBox = (LinearLayout) C8522c.m36739c(view, 2131428486, "field 'llReleasedBox'", LinearLayout.class);
        viewDetailsActivity.llDurationBox = (LinearLayout) C8522c.m36739c(view, 2131428381, "field 'llDurationBox'", LinearLayout.class);
        viewDetailsActivity.llGenreBox = (LinearLayout) C8522c.m36739c(view, 2131428412, "field 'llGenreBox'", LinearLayout.class);
        viewDetailsActivity.llCastBox = (LinearLayout) C8522c.m36739c(view, 2131428345, "field 'llCastBox'", LinearLayout.class);
        viewDetailsActivity.llDirectorBoxInfo = (LinearLayout) C8522c.m36739c(view, 2131428373, "field 'llDirectorBoxInfo'", LinearLayout.class);
        viewDetailsActivity.llReleasedBoxInfo = (LinearLayout) C8522c.m36739c(view, 2131428487, "field 'llReleasedBoxInfo'", LinearLayout.class);
        viewDetailsActivity.llDurationBoxInfo = (LinearLayout) C8522c.m36739c(view, 2131428382, "field 'llDurationBoxInfo'", LinearLayout.class);
        viewDetailsActivity.llGenreBoxInfo = (LinearLayout) C8522c.m36739c(view, 2131428413, "field 'llGenreBoxInfo'", LinearLayout.class);
        viewDetailsActivity.llCastBoxInfo = (LinearLayout) C8522c.m36739c(view, 2131428346, "field 'llCastBoxInfo'", LinearLayout.class);
        View m36738b3 = C8522c.m36738b(view, 2131429581, "field 'tvReadMore' and method 'onViewClicked'");
        viewDetailsActivity.tvReadMore = (TextView) C8522c.m36737a(m36738b3, 2131429581, "field 'tvReadMore'", TextView.class);
        this.f19219e = m36738b3;
        m36738b3.setOnClickListener(new C3261c(this, viewDetailsActivity));
        viewDetailsActivity.ll_watch_trailer = (LinearLayout) C8522c.m36739c(view, 2131428539, "field 'll_watch_trailer'", LinearLayout.class);
        View m36738b4 = C8522c.m36738b(view, 2131429642, "field 'tvWatchTrailer' and method 'onViewClicked'");
        viewDetailsActivity.tvWatchTrailer = (TextView) C8522c.m36737a(m36738b4, 2131429642, "field 'tvWatchTrailer'", TextView.class);
        this.f19220f = m36738b4;
        m36738b4.setOnClickListener(new C3262d(this, viewDetailsActivity));
        viewDetailsActivity.logo = (ImageView) C8522c.m36739c(view, 2131428555, "field 'logo'", ImageView.class);
        viewDetailsActivity.rlTransparent = (RelativeLayout) C8522c.m36739c(view, 2131429067, "field 'rlTransparent'", RelativeLayout.class);
        viewDetailsActivity.ll_play_button_main_layout = (LinearLayout) C8522c.m36739c(view, 2131428468, "field 'll_play_button_main_layout'", LinearLayout.class);
        viewDetailsActivity.ll_watch_trailer_button_main_layout = (LinearLayout) C8522c.m36739c(view, 2131428540, "field 'll_watch_trailer_button_main_layout'", LinearLayout.class);
        viewDetailsActivity.pb_button_recent_watch = (ProgressBar) C8522c.m36739c(view, 2131428824, "field 'pb_button_recent_watch'", ProgressBar.class);
        viewDetailsActivity.rvCast = (RecyclerView) C8522c.m36739c(view, 2131429087, "field 'rvCast'", RecyclerView.class);
        viewDetailsActivity.iv_back_button = (ImageView) C8522c.m36739c(view, 2131428145, "field 'iv_back_button'", ImageView.class);
    }

    @Override // butterknife.Unbinder
    /* renamed from: a */
    public void mo5629a() {
        ViewDetailsActivity viewDetailsActivity = this.f19216b;
        if (viewDetailsActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f19216b = null;
        viewDetailsActivity.toolbar = null;
        viewDetailsActivity.appbarToolbar = null;
        viewDetailsActivity.rlAccountInfo = null;
        viewDetailsActivity.ivMovieImage = null;
        viewDetailsActivity.tvMovieName = null;
        viewDetailsActivity.tvPlay = null;
        viewDetailsActivity.tvMovieInfo = null;
        viewDetailsActivity.tvDirector = null;
        viewDetailsActivity.tvDirectorInfo = null;
        viewDetailsActivity.tvCast = null;
        viewDetailsActivity.tvCastInfo = null;
        viewDetailsActivity.tvReleaseDate = null;
        viewDetailsActivity.tvReleaseDateInfo = null;
        viewDetailsActivity.ratingBar = null;
        viewDetailsActivity.ivFavourite = null;
        viewDetailsActivity.tvMovieGenere = null;
        viewDetailsActivity.tv_genre_info = null;
        viewDetailsActivity.tvMovieDuration = null;
        viewDetailsActivity.tvMovieDurationInfo = null;
        viewDetailsActivity.llMovieInfoBox = null;
        viewDetailsActivity.scrollView = null;
        viewDetailsActivity.nestedScrollView = null;
        viewDetailsActivity.llDirectorBox = null;
        viewDetailsActivity.llReleasedBox = null;
        viewDetailsActivity.llDurationBox = null;
        viewDetailsActivity.llGenreBox = null;
        viewDetailsActivity.llCastBox = null;
        viewDetailsActivity.llDirectorBoxInfo = null;
        viewDetailsActivity.llReleasedBoxInfo = null;
        viewDetailsActivity.llDurationBoxInfo = null;
        viewDetailsActivity.llGenreBoxInfo = null;
        viewDetailsActivity.llCastBoxInfo = null;
        viewDetailsActivity.tvReadMore = null;
        viewDetailsActivity.ll_watch_trailer = null;
        viewDetailsActivity.tvWatchTrailer = null;
        viewDetailsActivity.logo = null;
        viewDetailsActivity.rlTransparent = null;
        viewDetailsActivity.ll_play_button_main_layout = null;
        viewDetailsActivity.ll_watch_trailer_button_main_layout = null;
        viewDetailsActivity.pb_button_recent_watch = null;
        viewDetailsActivity.rvCast = null;
        viewDetailsActivity.iv_back_button = null;
        this.f19217c.setOnClickListener(null);
        this.f19217c = null;
        this.f19218d.setOnClickListener(null);
        this.f19218d = null;
        this.f19219e.setOnClickListener(null);
        this.f19219e = null;
        this.f19220f.setOnClickListener(null);
        this.f19220f = null;
    }
}
