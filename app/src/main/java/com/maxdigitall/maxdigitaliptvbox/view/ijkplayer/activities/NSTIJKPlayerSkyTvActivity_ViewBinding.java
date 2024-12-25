package com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.activities;

import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import p316s2.C8522c;
import p440z8.C10105q;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerSkyTvActivity_ViewBinding.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerSkyTvActivity_ViewBinding.class */
public class NSTIJKPlayerSkyTvActivity_ViewBinding implements Unbinder {

    /* renamed from: b */
    public NSTIJKPlayerSkyTvActivity f23347b;

    public NSTIJKPlayerSkyTvActivity_ViewBinding(NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity, View view) {
        this.f23347b = nSTIJKPlayerSkyTvActivity;
        nSTIJKPlayerSkyTvActivity.rg_subtitle = (RadioGroup) C8522c.m36739c(view, 2131429240, "field 'rg_subtitle'", RadioGroup.class);
        nSTIJKPlayerSkyTvActivity.rg_audio = (RadioGroup) C8522c.m36739c(view, 2131427552, "field 'rg_audio'", RadioGroup.class);
        nSTIJKPlayerSkyTvActivity.rg_video = (RadioGroup) C8522c.m36739c(view, 2131429668, "field 'rg_video'", RadioGroup.class);
        nSTIJKPlayerSkyTvActivity.tv_sub_font_size = (TextView) C8522c.m36739c(view, 2131429621, "field 'tv_sub_font_size'", TextView.class);
        nSTIJKPlayerSkyTvActivity.fl_sub_font_size = (FrameLayout) C8522c.m36739c(view, 2131428031, "field 'fl_sub_font_size'", FrameLayout.class);
        nSTIJKPlayerSkyTvActivity.sb_volume = (SeekBar) C8522c.m36739c(view, 2131429100, "field 'sb_volume'", SeekBar.class);
        nSTIJKPlayerSkyTvActivity.sb_brightness = (SeekBar) C8522c.m36739c(view, 2131429099, "field 'sb_brightness'", SeekBar.class);
        nSTIJKPlayerSkyTvActivity.ll_brightness = (LinearLayout) C8522c.m36739c(view, 2131428339, "field 'll_brightness'", LinearLayout.class);
        nSTIJKPlayerSkyTvActivity.ll_volume = (LinearLayout) C8522c.m36739c(view, 2131428536, "field 'll_volume'", LinearLayout.class);
        nSTIJKPlayerSkyTvActivity.tv_brightness = (TextView) C8522c.m36739c(view, 2131429366, "field 'tv_brightness'", TextView.class);
        nSTIJKPlayerSkyTvActivity.tv_volume = (TextView) C8522c.m36739c(view, 2131429637, "field 'tv_volume'", TextView.class);
        nSTIJKPlayerSkyTvActivity.ll_pause_play = (LinearLayout) C8522c.m36739c(view, 2131428460, "field 'll_pause_play'", LinearLayout.class);
        nSTIJKPlayerSkyTvActivity.rl_settings_box = (RelativeLayout) C8522c.m36739c(view, 2131429053, "field 'rl_settings_box'", RelativeLayout.class);
        nSTIJKPlayerSkyTvActivity.rl_episodes_box = (RelativeLayout) C8522c.m36739c(view, 2131428981, "field 'rl_episodes_box'", RelativeLayout.class);
        nSTIJKPlayerSkyTvActivity.rl_episodes_box_player = (RelativeLayout) C8522c.m36739c(view, 2131428982, "field 'rl_episodes_box_player'", RelativeLayout.class);
        nSTIJKPlayerSkyTvActivity.no_audio_track = (TextView) C8522c.m36739c(view, 2131429537, "field 'no_audio_track'", TextView.class);
        nSTIJKPlayerSkyTvActivity.no_subtitle_track = (TextView) C8522c.m36739c(view, 2131429542, "field 'no_subtitle_track'", TextView.class);
        nSTIJKPlayerSkyTvActivity.no_video_track = (TextView) C8522c.m36739c(view, 2131429544, "field 'no_video_track'", TextView.class);
        nSTIJKPlayerSkyTvActivity.ll_player_header_footer = (LinearLayout) C8522c.m36739c(view, 2131428472, "field 'll_player_header_footer'", LinearLayout.class);
        nSTIJKPlayerSkyTvActivity.iv_play = (ImageView) C8522c.m36739c(view, 2131428208, "field 'iv_play'", ImageView.class);
        nSTIJKPlayerSkyTvActivity.iv_pause = (ImageView) C8522c.m36739c(view, 2131428207, "field 'iv_pause'", ImageView.class);
        nSTIJKPlayerSkyTvActivity.ll_back = (LinearLayout) C8522c.m36739c(view, 2131428332, "field 'll_back'", LinearLayout.class);
        nSTIJKPlayerSkyTvActivity.iv_back_episodes = (ImageView) C8522c.m36739c(view, 2131428148, "field 'iv_back_episodes'", ImageView.class);
        nSTIJKPlayerSkyTvActivity.iv_back_settings = (ImageView) C8522c.m36739c(view, 2131428150, "field 'iv_back_settings'", ImageView.class);
        nSTIJKPlayerSkyTvActivity.iv_back = (ImageView) C8522c.m36739c(view, 2131428144, "field 'iv_back'", ImageView.class);
        nSTIJKPlayerSkyTvActivity.ll_back_click = (LinearLayout) C8522c.m36739c(view, 2131428333, "field 'll_back_click'", LinearLayout.class);
        nSTIJKPlayerSkyTvActivity.iv_audio_subtitle_track = (ImageView) C8522c.m36739c(view, 2131428142, "field 'iv_audio_subtitle_track'", ImageView.class);
        nSTIJKPlayerSkyTvActivity.ll_crop = (LinearLayout) C8522c.m36739c(view, 2131428363, "field 'll_crop'", LinearLayout.class);
        nSTIJKPlayerSkyTvActivity.ll_audio_subtitle_settings = (LinearLayout) C8522c.m36739c(view, 2131428329, "field 'll_audio_subtitle_settings'", LinearLayout.class);
        nSTIJKPlayerSkyTvActivity.ll_multi_screen = (LinearLayout) C8522c.m36739c(view, 2131428445, "field 'll_multi_screen'", LinearLayout.class);
        nSTIJKPlayerSkyTvActivity.ll_channels_list = (LinearLayout) C8522c.m36739c(view, 2131428358, "field 'll_channels_list'", LinearLayout.class);
        nSTIJKPlayerSkyTvActivity.ll_previous_channel = (LinearLayout) C8522c.m36739c(view, 2131428477, "field 'll_previous_channel'", LinearLayout.class);
        nSTIJKPlayerSkyTvActivity.ll_next_channel = (LinearLayout) C8522c.m36739c(view, 2131428446, "field 'll_next_channel'", LinearLayout.class);
        nSTIJKPlayerSkyTvActivity.tv_episode_name = (TextView) C8522c.m36739c(view, C10105q.f46321V, "field 'tv_episode_name'", TextView.class);
        nSTIJKPlayerSkyTvActivity.ll_toolbar = (LinearLayout) C8522c.m36739c(view, 2131428527, "field 'll_toolbar'", LinearLayout.class);
        nSTIJKPlayerSkyTvActivity.ll_top_right_setting = (LinearLayout) C8522c.m36739c(view, 2131428529, "field 'll_top_right_setting'", LinearLayout.class);
        nSTIJKPlayerSkyTvActivity.ll_top_left_back = (LinearLayout) C8522c.m36739c(view, 2131428528, "field 'll_top_left_back'", LinearLayout.class);
        nSTIJKPlayerSkyTvActivity.ll_bottom_footer_icons = (LinearLayout) C8522c.m36739c(view, 2131428338, "field 'll_bottom_footer_icons'", LinearLayout.class);
        nSTIJKPlayerSkyTvActivity.recycler_view_left_sidebar = (RecyclerView) C8522c.m36739c(view, 2131428923, "field 'recycler_view_left_sidebar'", RecyclerView.class);
        nSTIJKPlayerSkyTvActivity.recycler_view_left_sidebar_player = (RecyclerView) C8522c.m36739c(view, 2131428924, "field 'recycler_view_left_sidebar_player'", RecyclerView.class);
        nSTIJKPlayerSkyTvActivity.et_search_left_side = (EditText) C8522c.m36739c(view, 2131427919, "field 'et_search_left_side'", EditText.class);
        nSTIJKPlayerSkyTvActivity.ll_no_cat_found = (LinearLayout) C8522c.m36739c(view, 2131428449, "field 'll_no_cat_found'", LinearLayout.class);
        nSTIJKPlayerSkyTvActivity.ll_no_cat_found_player = (LinearLayout) C8522c.m36739c(view, 2131428450, "field 'll_no_cat_found_player'", LinearLayout.class);
        nSTIJKPlayerSkyTvActivity.rl_search_cat = (RelativeLayout) C8522c.m36739c(view, 2131429049, "field 'rl_search_cat'", RelativeLayout.class);
        nSTIJKPlayerSkyTvActivity.ll_click_to_play = (LinearLayout) C8522c.m36739c(view, 2131428360, "field 'll_click_to_play'", LinearLayout.class);
        nSTIJKPlayerSkyTvActivity.iv_radio = (ImageView) C8522c.m36739c(view, 2131428219, "field 'iv_radio'", ImageView.class);
        nSTIJKPlayerSkyTvActivity.header_page_title = (TextView) C8522c.m36739c(view, 2131429290, "field 'header_page_title'", TextView.class);
        nSTIJKPlayerSkyTvActivity.ll_audio_subtitle_settings_click = (LinearLayout) C8522c.m36739c(view, 2131428330, "field 'll_audio_subtitle_settings_click'", LinearLayout.class);
    }

    @Override // butterknife.Unbinder
    /* renamed from: a */
    public void mo5629a() {
        NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity = this.f23347b;
        if (nSTIJKPlayerSkyTvActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f23347b = null;
        nSTIJKPlayerSkyTvActivity.rg_subtitle = null;
        nSTIJKPlayerSkyTvActivity.rg_audio = null;
        nSTIJKPlayerSkyTvActivity.rg_video = null;
        nSTIJKPlayerSkyTvActivity.tv_sub_font_size = null;
        nSTIJKPlayerSkyTvActivity.fl_sub_font_size = null;
        nSTIJKPlayerSkyTvActivity.sb_volume = null;
        nSTIJKPlayerSkyTvActivity.sb_brightness = null;
        nSTIJKPlayerSkyTvActivity.ll_brightness = null;
        nSTIJKPlayerSkyTvActivity.ll_volume = null;
        nSTIJKPlayerSkyTvActivity.tv_brightness = null;
        nSTIJKPlayerSkyTvActivity.tv_volume = null;
        nSTIJKPlayerSkyTvActivity.ll_pause_play = null;
        nSTIJKPlayerSkyTvActivity.rl_settings_box = null;
        nSTIJKPlayerSkyTvActivity.rl_episodes_box = null;
        nSTIJKPlayerSkyTvActivity.rl_episodes_box_player = null;
        nSTIJKPlayerSkyTvActivity.no_audio_track = null;
        nSTIJKPlayerSkyTvActivity.no_subtitle_track = null;
        nSTIJKPlayerSkyTvActivity.no_video_track = null;
        nSTIJKPlayerSkyTvActivity.ll_player_header_footer = null;
        nSTIJKPlayerSkyTvActivity.iv_play = null;
        nSTIJKPlayerSkyTvActivity.iv_pause = null;
        nSTIJKPlayerSkyTvActivity.ll_back = null;
        nSTIJKPlayerSkyTvActivity.iv_back_episodes = null;
        nSTIJKPlayerSkyTvActivity.iv_back_settings = null;
        nSTIJKPlayerSkyTvActivity.iv_back = null;
        nSTIJKPlayerSkyTvActivity.ll_back_click = null;
        nSTIJKPlayerSkyTvActivity.iv_audio_subtitle_track = null;
        nSTIJKPlayerSkyTvActivity.ll_crop = null;
        nSTIJKPlayerSkyTvActivity.ll_audio_subtitle_settings = null;
        nSTIJKPlayerSkyTvActivity.ll_multi_screen = null;
        nSTIJKPlayerSkyTvActivity.ll_channels_list = null;
        nSTIJKPlayerSkyTvActivity.ll_previous_channel = null;
        nSTIJKPlayerSkyTvActivity.ll_next_channel = null;
        nSTIJKPlayerSkyTvActivity.tv_episode_name = null;
        nSTIJKPlayerSkyTvActivity.ll_toolbar = null;
        nSTIJKPlayerSkyTvActivity.ll_top_right_setting = null;
        nSTIJKPlayerSkyTvActivity.ll_top_left_back = null;
        nSTIJKPlayerSkyTvActivity.ll_bottom_footer_icons = null;
        nSTIJKPlayerSkyTvActivity.recycler_view_left_sidebar = null;
        nSTIJKPlayerSkyTvActivity.recycler_view_left_sidebar_player = null;
        nSTIJKPlayerSkyTvActivity.et_search_left_side = null;
        nSTIJKPlayerSkyTvActivity.ll_no_cat_found = null;
        nSTIJKPlayerSkyTvActivity.ll_no_cat_found_player = null;
        nSTIJKPlayerSkyTvActivity.rl_search_cat = null;
        nSTIJKPlayerSkyTvActivity.ll_click_to_play = null;
        nSTIJKPlayerSkyTvActivity.iv_radio = null;
        nSTIJKPlayerSkyTvActivity.header_page_title = null;
        nSTIJKPlayerSkyTvActivity.ll_audio_subtitle_settings_click = null;
    }
}
