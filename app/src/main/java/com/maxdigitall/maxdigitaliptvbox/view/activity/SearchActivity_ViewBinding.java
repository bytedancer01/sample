package com.maxdigitall.maxdigitaliptvbox.view.activity;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import p316s2.C8522c;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SearchActivity_ViewBinding.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SearchActivity_ViewBinding.class */
public class SearchActivity_ViewBinding implements Unbinder {

    /* renamed from: b */
    public SearchActivity f18190b;

    public SearchActivity_ViewBinding(SearchActivity searchActivity, View view) {
        this.f18190b = searchActivity;
        searchActivity.liveRecyclerView = (RecyclerView) C8522c.m36739c(view, 2131428311, "field 'liveRecyclerView'", RecyclerView.class);
        searchActivity.movieRecyclerView = (RecyclerView) C8522c.m36739c(view, 2131428666, "field 'movieRecyclerView'", RecyclerView.class);
        searchActivity.seriesRecyclerView = (RecyclerView) C8522c.m36739c(view, 2131429146, "field 'seriesRecyclerView'", RecyclerView.class);
        searchActivity.llProgramBox = (LinearLayout) C8522c.m36739c(view, 2131428479, "field 'llProgramBox'", LinearLayout.class);
        searchActivity.channelRecyclerView = (RecyclerView) C8522c.m36739c(view, 2131427744, "field 'channelRecyclerView'", RecyclerView.class);
        searchActivity.programRecyclerView = (RecyclerView) C8522c.m36739c(view, 2131428869, "field 'programRecyclerView'", RecyclerView.class);
        searchActivity.tabs_layout = (LinearLayout) C8522c.m36739c(view, 2131429257, "field 'tabs_layout'", LinearLayout.class);
        searchActivity.live_channels_tab = (TextView) C8522c.m36739c(view, 2131428307, "field 'live_channels_tab'", TextView.class);
        searchActivity.movies_tab = (TextView) C8522c.m36739c(view, 2131428667, "field 'movies_tab'", TextView.class);
        searchActivity.series_tab = (TextView) C8522c.m36739c(view, 2131429147, "field 'series_tab'", TextView.class);
        searchActivity.program_tab = (TextView) C8522c.m36739c(view, 2131428870, "field 'program_tab'", TextView.class);
        searchActivity.tv_program_name_right_side = (TextView) C8522c.m36739c(view, 2131429572, "field 'tv_program_name_right_side'", TextView.class);
        searchActivity.tv_program_start_date_right = (TextView) C8522c.m36739c(view, 2131429574, "field 'tv_program_start_date_right'", TextView.class);
        searchActivity.tv_program_stop_date_right = (TextView) C8522c.m36739c(view, 2131429576, "field 'tv_program_stop_date_right'", TextView.class);
        searchActivity.tv_description = (TextView) C8522c.m36739c(view, 2131429415, "field 'tv_description'", TextView.class);
        searchActivity.tv_no_record_found = (TextView) C8522c.m36739c(view, 2131429538, "field 'tv_no_record_found'", TextView.class);
        searchActivity.ll_pb_recent_watch = (LinearLayout) C8522c.m36739c(view, 2131428464, "field 'll_pb_recent_watch'", LinearLayout.class);
        searchActivity.pb_recent_watch = (ProgressBar) C8522c.m36739c(view, 2131428841, "field 'pb_recent_watch'", ProgressBar.class);
        searchActivity.iv_back_button = (ImageView) C8522c.m36739c(view, 2131428145, "field 'iv_back_button'", ImageView.class);
    }

    @Override // butterknife.Unbinder
    /* renamed from: a */
    public void mo5629a() {
        SearchActivity searchActivity = this.f18190b;
        if (searchActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f18190b = null;
        searchActivity.liveRecyclerView = null;
        searchActivity.movieRecyclerView = null;
        searchActivity.seriesRecyclerView = null;
        searchActivity.llProgramBox = null;
        searchActivity.channelRecyclerView = null;
        searchActivity.programRecyclerView = null;
        searchActivity.tabs_layout = null;
        searchActivity.live_channels_tab = null;
        searchActivity.movies_tab = null;
        searchActivity.series_tab = null;
        searchActivity.program_tab = null;
        searchActivity.tv_program_name_right_side = null;
        searchActivity.tv_program_start_date_right = null;
        searchActivity.tv_program_stop_date_right = null;
        searchActivity.tv_description = null;
        searchActivity.tv_no_record_found = null;
        searchActivity.ll_pb_recent_watch = null;
        searchActivity.pb_recent_watch = null;
        searchActivity.iv_back_button = null;
    }
}
