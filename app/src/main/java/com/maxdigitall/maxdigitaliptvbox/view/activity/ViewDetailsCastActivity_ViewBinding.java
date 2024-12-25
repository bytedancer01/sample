package com.maxdigitall.maxdigitaliptvbox.view.activity;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import com.google.android.material.appbar.AppBarLayout;
import p316s2.C8522c;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/ViewDetailsCastActivity_ViewBinding.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/ViewDetailsCastActivity_ViewBinding.class */
public class ViewDetailsCastActivity_ViewBinding implements Unbinder {

    /* renamed from: b */
    public ViewDetailsCastActivity f19261b;

    public ViewDetailsCastActivity_ViewBinding(ViewDetailsCastActivity viewDetailsCastActivity, View view) {
        this.f19261b = viewDetailsCastActivity;
        viewDetailsCastActivity.toolbar = (Toolbar) C8522c.m36739c(view, 2131429320, "field 'toolbar'", Toolbar.class);
        viewDetailsCastActivity.appbarToolbar = (AppBarLayout) C8522c.m36739c(view, 2131427548, "field 'appbarToolbar'", AppBarLayout.class);
        viewDetailsCastActivity.rlAccountInfo = (RelativeLayout) C8522c.m36739c(view, 2131428944, "field 'rlAccountInfo'", RelativeLayout.class);
        viewDetailsCastActivity.ivMovieImage = (ImageView) C8522c.m36739c(view, 2131428200, "field 'ivMovieImage'", ImageView.class);
        viewDetailsCastActivity.tvDODInfo = (TextView) C8522c.m36739c(view, 2131429422, "field 'tvDODInfo'", TextView.class);
        viewDetailsCastActivity.tvdetailprogressbar = (ProgressBar) C8522c.m36739c(view, 2131429416, "field 'tvdetailprogressbar'", ProgressBar.class);
        viewDetailsCastActivity.llPersonInfoBox = (LinearLayout) C8522c.m36739c(view, 2131428466, "field 'llPersonInfoBox'", LinearLayout.class);
        viewDetailsCastActivity.scrollView = (ScrollView) C8522c.m36739c(view, 2131429115, "field 'scrollView'", ScrollView.class);
        viewDetailsCastActivity.llDobBox = (LinearLayout) C8522c.m36739c(view, 2131428374, "field 'llDobBox'", LinearLayout.class);
        viewDetailsCastActivity.llPobBox = (LinearLayout) C8522c.m36739c(view, 2131428475, "field 'llPobBox'", LinearLayout.class);
        viewDetailsCastActivity.llGenderBox = (LinearLayout) C8522c.m36739c(view, 2131428410, "field 'llGenderBox'", LinearLayout.class);
        viewDetailsCastActivity.llKnownForBox = (LinearLayout) C8522c.m36739c(view, 2131428424, "field 'llKnownForBox'", LinearLayout.class);
        viewDetailsCastActivity.llDodBox = (LinearLayout) C8522c.m36739c(view, 2131428376, "field 'llDodBox'", LinearLayout.class);
        viewDetailsCastActivity.llDobBoxInfo = (LinearLayout) C8522c.m36739c(view, 2131428375, "field 'llDobBoxInfo'", LinearLayout.class);
        viewDetailsCastActivity.llPobBoxInfo = (LinearLayout) C8522c.m36739c(view, 2131428476, "field 'llPobBoxInfo'", LinearLayout.class);
        viewDetailsCastActivity.llGenderBoxInfo = (LinearLayout) C8522c.m36739c(view, 2131428411, "field 'llGenderBoxInfo'", LinearLayout.class);
        viewDetailsCastActivity.llKnownForBoxInfo = (LinearLayout) C8522c.m36739c(view, 2131428423, "field 'llKnownForBoxInfo'", LinearLayout.class);
        viewDetailsCastActivity.llDODBoxInfo = (LinearLayout) C8522c.m36739c(view, 2131428377, "field 'llDODBoxInfo'", LinearLayout.class);
        viewDetailsCastActivity.logo = (ImageView) C8522c.m36739c(view, 2131428555, "field 'logo'", ImageView.class);
        viewDetailsCastActivity.rlTransparent = (RelativeLayout) C8522c.m36739c(view, 2131429067, "field 'rlTransparent'", RelativeLayout.class);
        viewDetailsCastActivity.llDetailProgressBar = (LinearLayout) C8522c.m36739c(view, 2131428368, "field 'llDetailProgressBar'", LinearLayout.class);
        viewDetailsCastActivity.llDetailLeftSide = (LinearLayout) C8522c.m36739c(view, 2131428369, "field 'llDetailLeftSide'", LinearLayout.class);
        viewDetailsCastActivity.llDetailRightSide = (LinearLayout) C8522c.m36739c(view, 2131428370, "field 'llDetailRightSide'", LinearLayout.class);
        viewDetailsCastActivity.rvCast = (RecyclerView) C8522c.m36739c(view, 2131429087, "field 'rvCast'", RecyclerView.class);
        viewDetailsCastActivity.tvCastName = (TextView) C8522c.m36739c(view, 2131429374, "field 'tvCastName'", TextView.class);
        viewDetailsCastActivity.tvPlaceOfBirth = (TextView) C8522c.m36739c(view, 2131429556, "field 'tvPlaceOfBirth'", TextView.class);
        viewDetailsCastActivity.tvGender = (TextView) C8522c.m36739c(view, 2131429464, "field 'tvGender'", TextView.class);
        viewDetailsCastActivity.tvKnownFor = (TextView) C8522c.m36739c(view, 2131429483, "field 'tvKnownFor'", TextView.class);
        viewDetailsCastActivity.tvCastDesc = (TextView) C8522c.m36739c(view, 2131429372, "field 'tvCastDesc'", TextView.class);
        viewDetailsCastActivity.tvDateOfBirth = (TextView) C8522c.m36739c(view, 2131429408, "field 'tvDateOfBirth'", TextView.class);
        viewDetailsCastActivity.iv_back_button = (ImageView) C8522c.m36739c(view, 2131428145, "field 'iv_back_button'", ImageView.class);
    }

    @Override // butterknife.Unbinder
    /* renamed from: a */
    public void mo5629a() {
        ViewDetailsCastActivity viewDetailsCastActivity = this.f19261b;
        if (viewDetailsCastActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f19261b = null;
        viewDetailsCastActivity.toolbar = null;
        viewDetailsCastActivity.appbarToolbar = null;
        viewDetailsCastActivity.rlAccountInfo = null;
        viewDetailsCastActivity.ivMovieImage = null;
        viewDetailsCastActivity.tvDODInfo = null;
        viewDetailsCastActivity.tvdetailprogressbar = null;
        viewDetailsCastActivity.llPersonInfoBox = null;
        viewDetailsCastActivity.scrollView = null;
        viewDetailsCastActivity.llDobBox = null;
        viewDetailsCastActivity.llPobBox = null;
        viewDetailsCastActivity.llGenderBox = null;
        viewDetailsCastActivity.llKnownForBox = null;
        viewDetailsCastActivity.llDodBox = null;
        viewDetailsCastActivity.llDobBoxInfo = null;
        viewDetailsCastActivity.llPobBoxInfo = null;
        viewDetailsCastActivity.llGenderBoxInfo = null;
        viewDetailsCastActivity.llKnownForBoxInfo = null;
        viewDetailsCastActivity.llDODBoxInfo = null;
        viewDetailsCastActivity.logo = null;
        viewDetailsCastActivity.rlTransparent = null;
        viewDetailsCastActivity.llDetailProgressBar = null;
        viewDetailsCastActivity.llDetailLeftSide = null;
        viewDetailsCastActivity.llDetailRightSide = null;
        viewDetailsCastActivity.rvCast = null;
        viewDetailsCastActivity.tvCastName = null;
        viewDetailsCastActivity.tvPlaceOfBirth = null;
        viewDetailsCastActivity.tvGender = null;
        viewDetailsCastActivity.tvKnownFor = null;
        viewDetailsCastActivity.tvCastDesc = null;
        viewDetailsCastActivity.tvDateOfBirth = null;
        viewDetailsCastActivity.iv_back_button = null;
    }
}
