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
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SearchActivityLowerSDK_ViewBinding.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SearchActivityLowerSDK_ViewBinding.class */
public class SearchActivityLowerSDK_ViewBinding implements Unbinder {

    /* renamed from: b */
    public SearchActivityLowerSDK f18189b;

    public SearchActivityLowerSDK_ViewBinding(SearchActivityLowerSDK searchActivityLowerSDK, View view) {
        this.f18189b = searchActivityLowerSDK;
        searchActivityLowerSDK.liveRecyclerView = (RecyclerView) C8522c.m36739c(view, 2131428311, "field 'liveRecyclerView'", RecyclerView.class);
        searchActivityLowerSDK.movieRecyclerView = (RecyclerView) C8522c.m36739c(view, 2131428666, "field 'movieRecyclerView'", RecyclerView.class);
        searchActivityLowerSDK.seriesRecyclerView = (RecyclerView) C8522c.m36739c(view, 2131429146, "field 'seriesRecyclerView'", RecyclerView.class);
        searchActivityLowerSDK.llProgramBox = (LinearLayout) C8522c.m36739c(view, 2131428479, "field 'llProgramBox'", LinearLayout.class);
        searchActivityLowerSDK.channelRecyclerView = (RecyclerView) C8522c.m36739c(view, 2131427744, "field 'channelRecyclerView'", RecyclerView.class);
        searchActivityLowerSDK.programRecyclerView = (RecyclerView) C8522c.m36739c(view, 2131428869, "field 'programRecyclerView'", RecyclerView.class);
        searchActivityLowerSDK.tabs_layout = (LinearLayout) C8522c.m36739c(view, 2131429257, "field 'tabs_layout'", LinearLayout.class);
        searchActivityLowerSDK.live_channels_tab = (TextView) C8522c.m36739c(view, 2131428307, "field 'live_channels_tab'", TextView.class);
        searchActivityLowerSDK.movies_tab = (TextView) C8522c.m36739c(view, 2131428667, "field 'movies_tab'", TextView.class);
        searchActivityLowerSDK.series_tab = (TextView) C8522c.m36739c(view, 2131429147, "field 'series_tab'", TextView.class);
        searchActivityLowerSDK.program_tab = (TextView) C8522c.m36739c(view, 2131428870, "field 'program_tab'", TextView.class);
        searchActivityLowerSDK.tv_program_name_right_side = (TextView) C8522c.m36739c(view, 2131429572, "field 'tv_program_name_right_side'", TextView.class);
        searchActivityLowerSDK.tv_program_start_date_right = (TextView) C8522c.m36739c(view, 2131429574, "field 'tv_program_start_date_right'", TextView.class);
        searchActivityLowerSDK.tv_program_stop_date_right = (TextView) C8522c.m36739c(view, 2131429576, "field 'tv_program_stop_date_right'", TextView.class);
        searchActivityLowerSDK.tv_description = (TextView) C8522c.m36739c(view, 2131429415, "field 'tv_description'", TextView.class);
        searchActivityLowerSDK.tv_no_record_found = (TextView) C8522c.m36739c(view, 2131429538, "field 'tv_no_record_found'", TextView.class);
        searchActivityLowerSDK.ll_pb_recent_watch = (LinearLayout) C8522c.m36739c(view, 2131428464, "field 'll_pb_recent_watch'", LinearLayout.class);
        searchActivityLowerSDK.pb_recent_watch = (ProgressBar) C8522c.m36739c(view, 2131428841, "field 'pb_recent_watch'", ProgressBar.class);
        searchActivityLowerSDK.iv_back_button = (ImageView) C8522c.m36739c(view, 2131428145, "field 'iv_back_button'", ImageView.class);
    }

    @Override // butterknife.Unbinder
    /* renamed from: a */
    public void mo5629a() {
        SearchActivityLowerSDK searchActivityLowerSDK = this.f18189b;
        if (searchActivityLowerSDK == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f18189b = null;
        searchActivityLowerSDK.liveRecyclerView = null;
        searchActivityLowerSDK.movieRecyclerView = null;
        searchActivityLowerSDK.seriesRecyclerView = null;
        searchActivityLowerSDK.llProgramBox = null;
        searchActivityLowerSDK.channelRecyclerView = null;
        searchActivityLowerSDK.programRecyclerView = null;
        searchActivityLowerSDK.tabs_layout = null;
        searchActivityLowerSDK.live_channels_tab = null;
        searchActivityLowerSDK.movies_tab = null;
        searchActivityLowerSDK.series_tab = null;
        searchActivityLowerSDK.program_tab = null;
        searchActivityLowerSDK.tv_program_name_right_side = null;
        searchActivityLowerSDK.tv_program_start_date_right = null;
        searchActivityLowerSDK.tv_program_stop_date_right = null;
        searchActivityLowerSDK.tv_description = null;
        searchActivityLowerSDK.tv_no_record_found = null;
        searchActivityLowerSDK.ll_pb_recent_watch = null;
        searchActivityLowerSDK.pb_recent_watch = null;
        searchActivityLowerSDK.iv_back_button = null;
    }
}
