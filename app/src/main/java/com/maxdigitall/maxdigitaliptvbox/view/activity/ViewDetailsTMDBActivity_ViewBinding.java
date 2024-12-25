package com.maxdigitall.maxdigitaliptvbox.view.activity;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
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
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/ViewDetailsTMDBActivity_ViewBinding.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/ViewDetailsTMDBActivity_ViewBinding.class */
public class ViewDetailsTMDBActivity_ViewBinding implements Unbinder {

    /* renamed from: b */
    public ViewDetailsTMDBActivity f19326b;

    /* renamed from: c */
    public View f19327c;

    /* renamed from: d */
    public View f19328d;

    /* renamed from: e */
    public View f19329e;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/ViewDetailsTMDBActivity_ViewBinding$a.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.ViewDetailsTMDBActivity_ViewBinding$a */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/ViewDetailsTMDBActivity_ViewBinding$a.class */
    public class C3291a extends AbstractViewOnClickListenerC8521b {

        /* renamed from: d */
        public final ViewDetailsTMDBActivity f19330d;

        /* renamed from: e */
        public final ViewDetailsTMDBActivity_ViewBinding f19331e;

        public C3291a(ViewDetailsTMDBActivity_ViewBinding viewDetailsTMDBActivity_ViewBinding, ViewDetailsTMDBActivity viewDetailsTMDBActivity) {
            this.f19331e = viewDetailsTMDBActivity_ViewBinding;
            this.f19330d = viewDetailsTMDBActivity;
        }

        @Override // p316s2.AbstractViewOnClickListenerC8521b
        /* renamed from: b */
        public void mo14535b(View view) {
            this.f19330d.onViewClicked(view);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/ViewDetailsTMDBActivity_ViewBinding$b.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.ViewDetailsTMDBActivity_ViewBinding$b */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/ViewDetailsTMDBActivity_ViewBinding$b.class */
    public class C3292b extends AbstractViewOnClickListenerC8521b {

        /* renamed from: d */
        public final ViewDetailsTMDBActivity f19332d;

        /* renamed from: e */
        public final ViewDetailsTMDBActivity_ViewBinding f19333e;

        public C3292b(ViewDetailsTMDBActivity_ViewBinding viewDetailsTMDBActivity_ViewBinding, ViewDetailsTMDBActivity viewDetailsTMDBActivity) {
            this.f19333e = viewDetailsTMDBActivity_ViewBinding;
            this.f19332d = viewDetailsTMDBActivity;
        }

        @Override // p316s2.AbstractViewOnClickListenerC8521b
        /* renamed from: b */
        public void mo14535b(View view) {
            this.f19332d.onViewClicked(view);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/ViewDetailsTMDBActivity_ViewBinding$c.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.ViewDetailsTMDBActivity_ViewBinding$c */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/ViewDetailsTMDBActivity_ViewBinding$c.class */
    public class C3293c extends AbstractViewOnClickListenerC8521b {

        /* renamed from: d */
        public final ViewDetailsTMDBActivity f19334d;

        /* renamed from: e */
        public final ViewDetailsTMDBActivity_ViewBinding f19335e;

        public C3293c(ViewDetailsTMDBActivity_ViewBinding viewDetailsTMDBActivity_ViewBinding, ViewDetailsTMDBActivity viewDetailsTMDBActivity) {
            this.f19335e = viewDetailsTMDBActivity_ViewBinding;
            this.f19334d = viewDetailsTMDBActivity;
        }

        @Override // p316s2.AbstractViewOnClickListenerC8521b
        /* renamed from: b */
        public void mo14535b(View view) {
            this.f19334d.onViewClicked(view);
        }
    }

    public ViewDetailsTMDBActivity_ViewBinding(ViewDetailsTMDBActivity viewDetailsTMDBActivity, View view) {
        this.f19326b = viewDetailsTMDBActivity;
        viewDetailsTMDBActivity.toolbar = (Toolbar) C8522c.m36739c(view, 2131429320, "field 'toolbar'", Toolbar.class);
        viewDetailsTMDBActivity.appbarToolbar = (AppBarLayout) C8522c.m36739c(view, 2131427548, "field 'appbarToolbar'", AppBarLayout.class);
        viewDetailsTMDBActivity.rlAccountInfo = (RelativeLayout) C8522c.m36739c(view, 2131428944, "field 'rlAccountInfo'", RelativeLayout.class);
        viewDetailsTMDBActivity.ivMovieImage = (ImageView) C8522c.m36739c(view, 2131428200, "field 'ivMovieImage'", ImageView.class);
        viewDetailsTMDBActivity.tvMovieName = (TextView) C8522c.m36739c(view, 2131429519, "field 'tvMovieName'", TextView.class);
        View m36738b = C8522c.m36738b(view, 2131429558, "field 'tvPlay' and method 'onViewClicked'");
        viewDetailsTMDBActivity.tvPlay = (TextView) C8522c.m36737a(m36738b, 2131429558, "field 'tvPlay'", TextView.class);
        this.f19327c = m36738b;
        m36738b.setOnClickListener(new C3291a(this, viewDetailsTMDBActivity));
        viewDetailsTMDBActivity.tvMovieInfo = (TextView) C8522c.m36739c(view, 2131429518, "field 'tvMovieInfo'", TextView.class);
        viewDetailsTMDBActivity.tvDirector = (TextView) C8522c.m36739c(view, 2131429419, "field 'tvDirector'", TextView.class);
        viewDetailsTMDBActivity.tvDirectorInfo = (TextView) C8522c.m36739c(view, 2131429420, "field 'tvDirectorInfo'", TextView.class);
        viewDetailsTMDBActivity.tvCast = (TextView) C8522c.m36739c(view, 2131429371, "field 'tvCast'", TextView.class);
        viewDetailsTMDBActivity.tvCastInfo = (TextView) C8522c.m36739c(view, 2131429373, "field 'tvCastInfo'", TextView.class);
        viewDetailsTMDBActivity.tvReleaseDate = (TextView) C8522c.m36739c(view, 2131429590, "field 'tvReleaseDate'", TextView.class);
        viewDetailsTMDBActivity.tvReleaseDateInfo = (TextView) C8522c.m36739c(view, 2131429591, "field 'tvReleaseDateInfo'", TextView.class);
        viewDetailsTMDBActivity.logo = (ImageView) C8522c.m36739c(view, 2131428555, "field 'logo'", ImageView.class);
        viewDetailsTMDBActivity.ratingBar = (RatingBar) C8522c.m36739c(view, 2131428891, "field 'ratingBar'", RatingBar.class);
        viewDetailsTMDBActivity.ivFavourite = (ImageView) C8522c.m36739c(view, 2131428179, "field 'ivFavourite'", ImageView.class);
        viewDetailsTMDBActivity.tvMovieGenere = (TextView) C8522c.m36739c(view, 2131429516, "field 'tvMovieGenere'", TextView.class);
        viewDetailsTMDBActivity.tv_genre_info = (TextView) C8522c.m36739c(view, 2131429466, "field 'tv_genre_info'", TextView.class);
        viewDetailsTMDBActivity.tvMovieDuration = (TextView) C8522c.m36739c(view, 2131429514, "field 'tvMovieDuration'", TextView.class);
        viewDetailsTMDBActivity.tvMovieDurationInfo = (TextView) C8522c.m36739c(view, 2131429515, "field 'tvMovieDurationInfo'", TextView.class);
        viewDetailsTMDBActivity.llMovieInfoBox = (LinearLayout) C8522c.m36739c(view, 2131428444, "field 'llMovieInfoBox'", LinearLayout.class);
        viewDetailsTMDBActivity.llDirectorBox = (LinearLayout) C8522c.m36739c(view, 2131428372, "field 'llDirectorBox'", LinearLayout.class);
        viewDetailsTMDBActivity.llReleasedBox = (LinearLayout) C8522c.m36739c(view, 2131428486, "field 'llReleasedBox'", LinearLayout.class);
        viewDetailsTMDBActivity.llDurationBox = (LinearLayout) C8522c.m36739c(view, 2131428381, "field 'llDurationBox'", LinearLayout.class);
        viewDetailsTMDBActivity.llGenreBox = (LinearLayout) C8522c.m36739c(view, 2131428412, "field 'llGenreBox'", LinearLayout.class);
        viewDetailsTMDBActivity.llCastBox = (LinearLayout) C8522c.m36739c(view, 2131428345, "field 'llCastBox'", LinearLayout.class);
        viewDetailsTMDBActivity.llDirectorBoxInfo = (LinearLayout) C8522c.m36739c(view, 2131428373, "field 'llDirectorBoxInfo'", LinearLayout.class);
        viewDetailsTMDBActivity.llReleasedBoxInfo = (LinearLayout) C8522c.m36739c(view, 2131428487, "field 'llReleasedBoxInfo'", LinearLayout.class);
        viewDetailsTMDBActivity.llDurationBoxInfo = (LinearLayout) C8522c.m36739c(view, 2131428382, "field 'llDurationBoxInfo'", LinearLayout.class);
        viewDetailsTMDBActivity.llGenreBoxInfo = (LinearLayout) C8522c.m36739c(view, 2131428413, "field 'llGenreBoxInfo'", LinearLayout.class);
        viewDetailsTMDBActivity.llCastBoxInfo = (LinearLayout) C8522c.m36739c(view, 2131428346, "field 'llCastBoxInfo'", LinearLayout.class);
        View m36738b2 = C8522c.m36738b(view, 2131429581, "field 'tvReadMore' and method 'onViewClicked'");
        viewDetailsTMDBActivity.tvReadMore = (TextView) C8522c.m36737a(m36738b2, 2131429581, "field 'tvReadMore'", TextView.class);
        this.f19328d = m36738b2;
        m36738b2.setOnClickListener(new C3292b(this, viewDetailsTMDBActivity));
        viewDetailsTMDBActivity.ll_watch_trailer = (LinearLayout) C8522c.m36739c(view, 2131428539, "field 'll_watch_trailer'", LinearLayout.class);
        View m36738b3 = C8522c.m36738b(view, 2131429642, "field 'tvWatchTrailer' and method 'onViewClicked'");
        viewDetailsTMDBActivity.tvWatchTrailer = (TextView) C8522c.m36737a(m36738b3, 2131429642, "field 'tvWatchTrailer'", TextView.class);
        this.f19329e = m36738b3;
        m36738b3.setOnClickListener(new C3293c(this, viewDetailsTMDBActivity));
        viewDetailsTMDBActivity.rlTransparent = (RelativeLayout) C8522c.m36739c(view, 2131429067, "field 'rlTransparent'", RelativeLayout.class);
        viewDetailsTMDBActivity.scrollView = (ScrollView) C8522c.m36739c(view, 2131429115, "field 'scrollView'", ScrollView.class);
        viewDetailsTMDBActivity.nestedScrollView = (NestedScrollView) C8522c.m36739c(view, 2131428779, "field 'nestedScrollView'", NestedScrollView.class);
        viewDetailsTMDBActivity.rvCast = (RecyclerView) C8522c.m36739c(view, 2131429087, "field 'rvCast'", RecyclerView.class);
        viewDetailsTMDBActivity.iv_back_button = (ImageView) C8522c.m36739c(view, 2131428145, "field 'iv_back_button'", ImageView.class);
        viewDetailsTMDBActivity.ll_play_button_main_layout = (LinearLayout) C8522c.m36739c(view, 2131428468, "field 'll_play_button_main_layout'", LinearLayout.class);
        viewDetailsTMDBActivity.ll_watch_trailer_button_main_layout = (LinearLayout) C8522c.m36739c(view, 2131428540, "field 'll_watch_trailer_button_main_layout'", LinearLayout.class);
    }

    @Override // butterknife.Unbinder
    /* renamed from: a */
    public void mo5629a() {
        ViewDetailsTMDBActivity viewDetailsTMDBActivity = this.f19326b;
        if (viewDetailsTMDBActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f19326b = null;
        viewDetailsTMDBActivity.toolbar = null;
        viewDetailsTMDBActivity.appbarToolbar = null;
        viewDetailsTMDBActivity.rlAccountInfo = null;
        viewDetailsTMDBActivity.ivMovieImage = null;
        viewDetailsTMDBActivity.tvMovieName = null;
        viewDetailsTMDBActivity.tvPlay = null;
        viewDetailsTMDBActivity.tvMovieInfo = null;
        viewDetailsTMDBActivity.tvDirector = null;
        viewDetailsTMDBActivity.tvDirectorInfo = null;
        viewDetailsTMDBActivity.tvCast = null;
        viewDetailsTMDBActivity.tvCastInfo = null;
        viewDetailsTMDBActivity.tvReleaseDate = null;
        viewDetailsTMDBActivity.tvReleaseDateInfo = null;
        viewDetailsTMDBActivity.logo = null;
        viewDetailsTMDBActivity.ratingBar = null;
        viewDetailsTMDBActivity.ivFavourite = null;
        viewDetailsTMDBActivity.tvMovieGenere = null;
        viewDetailsTMDBActivity.tv_genre_info = null;
        viewDetailsTMDBActivity.tvMovieDuration = null;
        viewDetailsTMDBActivity.tvMovieDurationInfo = null;
        viewDetailsTMDBActivity.llMovieInfoBox = null;
        viewDetailsTMDBActivity.llDirectorBox = null;
        viewDetailsTMDBActivity.llReleasedBox = null;
        viewDetailsTMDBActivity.llDurationBox = null;
        viewDetailsTMDBActivity.llGenreBox = null;
        viewDetailsTMDBActivity.llCastBox = null;
        viewDetailsTMDBActivity.llDirectorBoxInfo = null;
        viewDetailsTMDBActivity.llReleasedBoxInfo = null;
        viewDetailsTMDBActivity.llDurationBoxInfo = null;
        viewDetailsTMDBActivity.llGenreBoxInfo = null;
        viewDetailsTMDBActivity.llCastBoxInfo = null;
        viewDetailsTMDBActivity.tvReadMore = null;
        viewDetailsTMDBActivity.ll_watch_trailer = null;
        viewDetailsTMDBActivity.tvWatchTrailer = null;
        viewDetailsTMDBActivity.rlTransparent = null;
        viewDetailsTMDBActivity.scrollView = null;
        viewDetailsTMDBActivity.nestedScrollView = null;
        viewDetailsTMDBActivity.rvCast = null;
        viewDetailsTMDBActivity.iv_back_button = null;
        viewDetailsTMDBActivity.ll_play_button_main_layout = null;
        viewDetailsTMDBActivity.ll_watch_trailer_button_main_layout = null;
        this.f19327c.setOnClickListener(null);
        this.f19327c = null;
        this.f19328d.setOnClickListener(null);
        this.f19328d = null;
        this.f19329e.setOnClickListener(null);
        this.f19329e = null;
    }
}
