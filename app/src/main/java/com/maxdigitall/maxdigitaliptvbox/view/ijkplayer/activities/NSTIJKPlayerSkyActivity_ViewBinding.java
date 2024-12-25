package com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.activities;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.mediarouter.app.MediaRouteButton;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import p316s2.C8522c;
import p440z8.C10105q;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerSkyActivity_ViewBinding.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerSkyActivity_ViewBinding.class */
public class NSTIJKPlayerSkyActivity_ViewBinding implements Unbinder {

    /* renamed from: b */
    public NSTIJKPlayerSkyActivity f23024b;

    public NSTIJKPlayerSkyActivity_ViewBinding(NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity, View view) {
        this.f23024b = nSTIJKPlayerSkyActivity;
        nSTIJKPlayerSkyActivity.logo = (ImageView) C8522c.m36739c(view, 2131428555, "field 'logo'", ImageView.class);
        nSTIJKPlayerSkyActivity.rg_subtitle = (RadioGroup) C8522c.m36739c(view, 2131429240, "field 'rg_subtitle'", RadioGroup.class);
        nSTIJKPlayerSkyActivity.rg_audio = (RadioGroup) C8522c.m36739c(view, 2131427552, "field 'rg_audio'", RadioGroup.class);
        nSTIJKPlayerSkyActivity.rg_video = (RadioGroup) C8522c.m36739c(view, 2131429668, "field 'rg_video'", RadioGroup.class);
        nSTIJKPlayerSkyActivity.tv_sub_font_size = (TextView) C8522c.m36739c(view, 2131429621, "field 'tv_sub_font_size'", TextView.class);
        nSTIJKPlayerSkyActivity.fl_sub_font_size = (FrameLayout) C8522c.m36739c(view, 2131428031, "field 'fl_sub_font_size'", FrameLayout.class);
        nSTIJKPlayerSkyActivity.sb_volume = (SeekBar) C8522c.m36739c(view, 2131429100, "field 'sb_volume'", SeekBar.class);
        nSTIJKPlayerSkyActivity.sb_brightness = (SeekBar) C8522c.m36739c(view, 2131429099, "field 'sb_brightness'", SeekBar.class);
        nSTIJKPlayerSkyActivity.ll_brightness = (LinearLayout) C8522c.m36739c(view, 2131428339, "field 'll_brightness'", LinearLayout.class);
        nSTIJKPlayerSkyActivity.ll_volume = (LinearLayout) C8522c.m36739c(view, 2131428536, "field 'll_volume'", LinearLayout.class);
        nSTIJKPlayerSkyActivity.tv_brightness = (TextView) C8522c.m36739c(view, 2131429366, "field 'tv_brightness'", TextView.class);
        nSTIJKPlayerSkyActivity.tv_volume = (TextView) C8522c.m36739c(view, 2131429637, "field 'tv_volume'", TextView.class);
        nSTIJKPlayerSkyActivity.ll_pause_play = (LinearLayout) C8522c.m36739c(view, 2131428460, "field 'll_pause_play'", LinearLayout.class);
        nSTIJKPlayerSkyActivity.rl_settings_box = (RelativeLayout) C8522c.m36739c(view, 2131429053, "field 'rl_settings_box'", RelativeLayout.class);
        nSTIJKPlayerSkyActivity.rl_episodes_box = (RelativeLayout) C8522c.m36739c(view, 2131428981, "field 'rl_episodes_box'", RelativeLayout.class);
        nSTIJKPlayerSkyActivity.iv_hp_lock = (ImageView) C8522c.m36739c(view, 2131428185, "field 'iv_hp_lock'", ImageView.class);
        nSTIJKPlayerSkyActivity.ll_hp_lock_click = (LinearLayout) C8522c.m36739c(view, 2131428418, "field 'll_hp_lock_click'", LinearLayout.class);
        nSTIJKPlayerSkyActivity.ll_screen_locked = (LinearLayout) C8522c.m36739c(view, 2131428494, "field 'll_screen_locked'", LinearLayout.class);
        nSTIJKPlayerSkyActivity.iv_unlock_button = (ImageView) C8522c.m36739c(view, 2131428238, "field 'iv_unlock_button'", ImageView.class);
        nSTIJKPlayerSkyActivity.no_audio_track = (TextView) C8522c.m36739c(view, 2131429537, "field 'no_audio_track'", TextView.class);
        nSTIJKPlayerSkyActivity.no_subtitle_track = (TextView) C8522c.m36739c(view, 2131429542, "field 'no_subtitle_track'", TextView.class);
        nSTIJKPlayerSkyActivity.no_video_track = (TextView) C8522c.m36739c(view, 2131429544, "field 'no_video_track'", TextView.class);
        nSTIJKPlayerSkyActivity.ll_player_header_footer = (LinearLayout) C8522c.m36739c(view, 2131428472, "field 'll_player_header_footer'", LinearLayout.class);
        nSTIJKPlayerSkyActivity.iv_play = (ImageView) C8522c.m36739c(view, 2131428208, "field 'iv_play'", ImageView.class);
        nSTIJKPlayerSkyActivity.iv_pause = (ImageView) C8522c.m36739c(view, 2131428207, "field 'iv_pause'", ImageView.class);
        nSTIJKPlayerSkyActivity.tv_seek_left = (ImageView) C8522c.m36739c(view, 2131429598, "field 'tv_seek_left'", ImageView.class);
        nSTIJKPlayerSkyActivity.tv_seek_right = (ImageView) C8522c.m36739c(view, 2131429600, "field 'tv_seek_right'", ImageView.class);
        nSTIJKPlayerSkyActivity.ll_back = (LinearLayout) C8522c.m36739c(view, 2131428332, "field 'll_back'", LinearLayout.class);
        nSTIJKPlayerSkyActivity.iv_back_episodes = (ImageView) C8522c.m36739c(view, 2131428148, "field 'iv_back_episodes'", ImageView.class);
        nSTIJKPlayerSkyActivity.iv_back_settings = (ImageView) C8522c.m36739c(view, 2131428150, "field 'iv_back_settings'", ImageView.class);
        nSTIJKPlayerSkyActivity.iv_back = (ImageView) C8522c.m36739c(view, 2131428144, "field 'iv_back'", ImageView.class);
        nSTIJKPlayerSkyActivity.ll_back_click = (LinearLayout) C8522c.m36739c(view, 2131428333, "field 'll_back_click'", LinearLayout.class);
        nSTIJKPlayerSkyActivity.iv_audio_subtitle_track = (ImageView) C8522c.m36739c(view, 2131428142, "field 'iv_audio_subtitle_track'", ImageView.class);
        nSTIJKPlayerSkyActivity.ll_crop = (LinearLayout) C8522c.m36739c(view, 2131428363, "field 'll_crop'", LinearLayout.class);
        nSTIJKPlayerSkyActivity.iv_hp_play_from_beginning = (ImageView) C8522c.m36739c(view, 2131428186, "field 'iv_hp_play_from_beginning'", ImageView.class);
        nSTIJKPlayerSkyActivity.ll_audio_subtitle_settings = (LinearLayout) C8522c.m36739c(view, 2131428329, "field 'll_audio_subtitle_settings'", LinearLayout.class);
        nSTIJKPlayerSkyActivity.ll_restart = (LinearLayout) C8522c.m36739c(view, 2131428490, "field 'll_restart'", LinearLayout.class);
        nSTIJKPlayerSkyActivity.ll_multi_screen = (LinearLayout) C8522c.m36739c(view, 2131428445, "field 'll_multi_screen'", LinearLayout.class);
        nSTIJKPlayerSkyActivity.ll_channels_list = (LinearLayout) C8522c.m36739c(view, 2131428358, "field 'll_channels_list'", LinearLayout.class);
        nSTIJKPlayerSkyActivity.tv_episode_name = (TextView) C8522c.m36739c(view, C10105q.f46321V, "field 'tv_episode_name'", TextView.class);
        nSTIJKPlayerSkyActivity.tv_channel_name = (TextView) C8522c.m36739c(view, 2131429384, "field 'tv_channel_name'", TextView.class);
        nSTIJKPlayerSkyActivity.tv_program_name = (TextView) C8522c.m36739c(view, 2131429571, "field 'tv_program_name'", TextView.class);
        nSTIJKPlayerSkyActivity.tv_start_stop = (TextView) C8522c.m36739c(view, 2131429614, "field 'tv_start_stop'", TextView.class);
        nSTIJKPlayerSkyActivity.recycler_view_left_sidebar = (RecyclerView) C8522c.m36739c(view, 2131428923, "field 'recycler_view_left_sidebar'", RecyclerView.class);
        nSTIJKPlayerSkyActivity.ll_pb_left_categories = (LinearLayout) C8522c.m36739c(view, 2131428461, "field 'll_pb_left_categories'", LinearLayout.class);
        nSTIJKPlayerSkyActivity.ll_no_cat_found = (LinearLayout) C8522c.m36739c(view, 2131428449, "field 'll_no_cat_found'", LinearLayout.class);
        nSTIJKPlayerSkyActivity.ll_casting_to_tv = (LinearLayout) C8522c.m36739c(view, 2131428347, "field 'll_casting_to_tv'", LinearLayout.class);
        nSTIJKPlayerSkyActivity.tv_casting_status_text = (TextView) C8522c.m36739c(view, 2131429375, "field 'tv_casting_status_text'", TextView.class);
        nSTIJKPlayerSkyActivity.ll_chromecast_click = (LinearLayout) C8522c.m36739c(view, 2131428359, "field 'll_chromecast_click'", LinearLayout.class);
        nSTIJKPlayerSkyActivity.cast_button = (MediaRouteButton) C8522c.m36739c(view, 2131427704, "field 'cast_button'", MediaRouteButton.class);
        nSTIJKPlayerSkyActivity.iv_radio = (ImageView) C8522c.m36739c(view, 2131428219, "field 'iv_radio'", ImageView.class);
        nSTIJKPlayerSkyActivity.ll_bottom_1 = (LinearLayout) C8522c.m36739c(view, 2131428336, "field 'll_bottom_1'", LinearLayout.class);
        nSTIJKPlayerSkyActivity.ll_bottom_2 = (LinearLayout) C8522c.m36739c(view, 2131428337, "field 'll_bottom_2'", LinearLayout.class);
        nSTIJKPlayerSkyActivity.header_page_title = (TextView) C8522c.m36739c(view, 2131429290, "field 'header_page_title'", TextView.class);
        nSTIJKPlayerSkyActivity.tv_page_name_right_side = (TextView) C8522c.m36739c(view, 2131429549, "field 'tv_page_name_right_side'", TextView.class);
        nSTIJKPlayerSkyActivity.iv_back_button = (ImageView) C8522c.m36739c(view, 2131428145, "field 'iv_back_button'", ImageView.class);
        nSTIJKPlayerSkyActivity.ll_audio_subtitle_settings_click = (LinearLayout) C8522c.m36739c(view, 2131428330, "field 'll_audio_subtitle_settings_click'", LinearLayout.class);
    }

    @Override // butterknife.Unbinder
    /* renamed from: a */
    public void mo5629a() {
        NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity = this.f23024b;
        if (nSTIJKPlayerSkyActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f23024b = null;
        nSTIJKPlayerSkyActivity.logo = null;
        nSTIJKPlayerSkyActivity.rg_subtitle = null;
        nSTIJKPlayerSkyActivity.rg_audio = null;
        nSTIJKPlayerSkyActivity.rg_video = null;
        nSTIJKPlayerSkyActivity.tv_sub_font_size = null;
        nSTIJKPlayerSkyActivity.fl_sub_font_size = null;
        nSTIJKPlayerSkyActivity.sb_volume = null;
        nSTIJKPlayerSkyActivity.sb_brightness = null;
        nSTIJKPlayerSkyActivity.ll_brightness = null;
        nSTIJKPlayerSkyActivity.ll_volume = null;
        nSTIJKPlayerSkyActivity.tv_brightness = null;
        nSTIJKPlayerSkyActivity.tv_volume = null;
        nSTIJKPlayerSkyActivity.ll_pause_play = null;
        nSTIJKPlayerSkyActivity.rl_settings_box = null;
        nSTIJKPlayerSkyActivity.rl_episodes_box = null;
        nSTIJKPlayerSkyActivity.iv_hp_lock = null;
        nSTIJKPlayerSkyActivity.ll_hp_lock_click = null;
        nSTIJKPlayerSkyActivity.ll_screen_locked = null;
        nSTIJKPlayerSkyActivity.iv_unlock_button = null;
        nSTIJKPlayerSkyActivity.no_audio_track = null;
        nSTIJKPlayerSkyActivity.no_subtitle_track = null;
        nSTIJKPlayerSkyActivity.no_video_track = null;
        nSTIJKPlayerSkyActivity.ll_player_header_footer = null;
        nSTIJKPlayerSkyActivity.iv_play = null;
        nSTIJKPlayerSkyActivity.iv_pause = null;
        nSTIJKPlayerSkyActivity.tv_seek_left = null;
        nSTIJKPlayerSkyActivity.tv_seek_right = null;
        nSTIJKPlayerSkyActivity.ll_back = null;
        nSTIJKPlayerSkyActivity.iv_back_episodes = null;
        nSTIJKPlayerSkyActivity.iv_back_settings = null;
        nSTIJKPlayerSkyActivity.iv_back = null;
        nSTIJKPlayerSkyActivity.ll_back_click = null;
        nSTIJKPlayerSkyActivity.iv_audio_subtitle_track = null;
        nSTIJKPlayerSkyActivity.ll_crop = null;
        nSTIJKPlayerSkyActivity.iv_hp_play_from_beginning = null;
        nSTIJKPlayerSkyActivity.ll_audio_subtitle_settings = null;
        nSTIJKPlayerSkyActivity.ll_restart = null;
        nSTIJKPlayerSkyActivity.ll_multi_screen = null;
        nSTIJKPlayerSkyActivity.ll_channels_list = null;
        nSTIJKPlayerSkyActivity.tv_episode_name = null;
        nSTIJKPlayerSkyActivity.tv_channel_name = null;
        nSTIJKPlayerSkyActivity.tv_program_name = null;
        nSTIJKPlayerSkyActivity.tv_start_stop = null;
        nSTIJKPlayerSkyActivity.recycler_view_left_sidebar = null;
        nSTIJKPlayerSkyActivity.ll_pb_left_categories = null;
        nSTIJKPlayerSkyActivity.ll_no_cat_found = null;
        nSTIJKPlayerSkyActivity.ll_casting_to_tv = null;
        nSTIJKPlayerSkyActivity.tv_casting_status_text = null;
        nSTIJKPlayerSkyActivity.ll_chromecast_click = null;
        nSTIJKPlayerSkyActivity.cast_button = null;
        nSTIJKPlayerSkyActivity.iv_radio = null;
        nSTIJKPlayerSkyActivity.ll_bottom_1 = null;
        nSTIJKPlayerSkyActivity.ll_bottom_2 = null;
        nSTIJKPlayerSkyActivity.header_page_title = null;
        nSTIJKPlayerSkyActivity.tv_page_name_right_side = null;
        nSTIJKPlayerSkyActivity.iv_back_button = null;
        nSTIJKPlayerSkyActivity.ll_audio_subtitle_settings_click = null;
    }
}
