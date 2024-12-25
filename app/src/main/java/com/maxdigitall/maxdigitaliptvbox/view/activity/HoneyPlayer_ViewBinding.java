package com.maxdigitall.maxdigitaliptvbox.view.activity;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TableLayout;
import android.widget.TextView;
import androidx.mediarouter.app.MediaRouteButton;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerEpisodes;
import p316s2.C8522c;
import p440z8.C10105q;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/HoneyPlayer_ViewBinding.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/HoneyPlayer_ViewBinding.class */
public class HoneyPlayer_ViewBinding implements Unbinder {

    /* renamed from: b */
    public HoneyPlayer f17384b;

    public HoneyPlayer_ViewBinding(HoneyPlayer honeyPlayer, View view) {
        this.f17384b = honeyPlayer;
        honeyPlayer.ll_player_header = (LinearLayout) C8522c.m36739c(view, 2131428471, "field 'll_player_header'", LinearLayout.class);
        honeyPlayer.ll_player_footer = (LinearLayout) C8522c.m36739c(view, 2131428470, "field 'll_player_footer'", LinearLayout.class);
        honeyPlayer.mVideoView = (NSTIJKPlayerEpisodes) C8522c.m36739c(view, 2131428535, "field 'mVideoView'", NSTIJKPlayerEpisodes.class);
        honeyPlayer.iv_back = (ImageView) C8522c.m36739c(view, 2131428144, "field 'iv_back'", ImageView.class);
        honeyPlayer.ll_back_click = (LinearLayout) C8522c.m36739c(view, 2131428333, "field 'll_back_click'", LinearLayout.class);
        honeyPlayer.ll_audio_subtitle_settings_click = (LinearLayout) C8522c.m36739c(view, 2131428330, "field 'll_audio_subtitle_settings_click'", LinearLayout.class);
        honeyPlayer.iv_audio_subtitle_track = (ImageView) C8522c.m36739c(view, 2131428142, "field 'iv_audio_subtitle_track'", ImageView.class);
        honeyPlayer.iv_play = (ImageView) C8522c.m36739c(view, 2131428208, "field 'iv_play'", ImageView.class);
        honeyPlayer.iv_pause = (ImageView) C8522c.m36739c(view, 2131428207, "field 'iv_pause'", ImageView.class);
        honeyPlayer.hp_seekbar = (SeekBar) C8522c.m36739c(view, 2131428102, "field 'hp_seekbar'", SeekBar.class);
        honeyPlayer.ll_episodes = (LinearLayout) C8522c.m36739c(view, 2131428402, "field 'll_episodes'", LinearLayout.class);
        honeyPlayer.ll_crop = (LinearLayout) C8522c.m36739c(view, 2131428363, "field 'll_crop'", LinearLayout.class);
        honeyPlayer.ll_playback_speed = (LinearLayout) C8522c.m36739c(view, 2131428469, "field 'll_playback_speed'", LinearLayout.class);
        honeyPlayer.iv_playback = (ImageView) C8522c.m36739c(view, 2131428214, "field 'iv_playback'", ImageView.class);
        honeyPlayer.ll_next_episode = (LinearLayout) C8522c.m36739c(view, 2131428447, "field 'll_next_episode'", LinearLayout.class);
        honeyPlayer.ll_audio_subtitle_settings = (LinearLayout) C8522c.m36739c(view, 2131428329, "field 'll_audio_subtitle_settings'", LinearLayout.class);
        honeyPlayer.ll_back = (LinearLayout) C8522c.m36739c(view, 2131428332, "field 'll_back'", LinearLayout.class);
        honeyPlayer.iv_back_episodes = (ImageView) C8522c.m36739c(view, 2131428148, "field 'iv_back_episodes'", ImageView.class);
        honeyPlayer.iv_back_settings = (ImageView) C8522c.m36739c(view, 2131428150, "field 'iv_back_settings'", ImageView.class);
        honeyPlayer.tv_start_time = (TextView) C8522c.m36739c(view, 2131429615, "field 'tv_start_time'", TextView.class);
        honeyPlayer.tv_end_time = (TextView) C8522c.m36739c(view, 2131429430, "field 'tv_end_time'", TextView.class);
        honeyPlayer.ll_aspect_ratio = (LinearLayout) C8522c.m36739c(view, 2131428325, "field 'll_aspect_ratio'", LinearLayout.class);
        honeyPlayer.rg_subtitle = (RadioGroup) C8522c.m36739c(view, 2131429240, "field 'rg_subtitle'", RadioGroup.class);
        honeyPlayer.rg_audio = (RadioGroup) C8522c.m36739c(view, 2131427552, "field 'rg_audio'", RadioGroup.class);
        honeyPlayer.rg_video = (RadioGroup) C8522c.m36739c(view, 2131429668, "field 'rg_video'", RadioGroup.class);
        honeyPlayer.no_audio_track = (TextView) C8522c.m36739c(view, 2131429537, "field 'no_audio_track'", TextView.class);
        honeyPlayer.no_subtitle_track = (TextView) C8522c.m36739c(view, 2131429542, "field 'no_subtitle_track'", TextView.class);
        honeyPlayer.no_video_track = (TextView) C8522c.m36739c(view, 2131429544, "field 'no_video_track'", TextView.class);
        honeyPlayer.tv_sub_font_size = (TextView) C8522c.m36739c(view, 2131429621, "field 'tv_sub_font_size'", TextView.class);
        honeyPlayer.fl_sub_font_size = (FrameLayout) C8522c.m36739c(view, 2131428031, "field 'fl_sub_font_size'", FrameLayout.class);
        honeyPlayer.tv_speed = (TextView) C8522c.m36739c(view, 2131429613, "field 'tv_speed'", TextView.class);
        honeyPlayer.rl_episodes_box = (RelativeLayout) C8522c.m36739c(view, 2131428981, "field 'rl_episodes_box'", RelativeLayout.class);
        honeyPlayer.rl_settings_box = (RelativeLayout) C8522c.m36739c(view, 2131429053, "field 'rl_settings_box'", RelativeLayout.class);
        honeyPlayer.myRecyclerView = (RecyclerView) C8522c.m36739c(view, 2131428747, "field 'myRecyclerView'", RecyclerView.class);
        honeyPlayer.tv_seek_left = (TextView) C8522c.m36739c(view, 2131429598, "field 'tv_seek_left'", TextView.class);
        honeyPlayer.tv_seek_right = (TextView) C8522c.m36739c(view, 2131429600, "field 'tv_seek_right'", TextView.class);
        honeyPlayer.tv_seek_count_right = (TextView) C8522c.m36739c(view, 2131429597, "field 'tv_seek_count_right'", TextView.class);
        honeyPlayer.tv_seek_count_left = (TextView) C8522c.m36739c(view, 2131429596, "field 'tv_seek_count_left'", TextView.class);
        honeyPlayer.fl_seek_right = (FrameLayout) C8522c.m36739c(view, 2131428030, "field 'fl_seek_right'", FrameLayout.class);
        honeyPlayer.fl_seek_left = (FrameLayout) C8522c.m36739c(view, 2131428029, "field 'fl_seek_left'", FrameLayout.class);
        honeyPlayer.sb_volume = (SeekBar) C8522c.m36739c(view, 2131429100, "field 'sb_volume'", SeekBar.class);
        honeyPlayer.sb_brightness = (SeekBar) C8522c.m36739c(view, 2131429099, "field 'sb_brightness'", SeekBar.class);
        honeyPlayer.ll_brightness = (LinearLayout) C8522c.m36739c(view, 2131428339, "field 'll_brightness'", LinearLayout.class);
        honeyPlayer.ll_volume = (LinearLayout) C8522c.m36739c(view, 2131428536, "field 'll_volume'", LinearLayout.class);
        honeyPlayer.tv_brightness = (TextView) C8522c.m36739c(view, 2131429366, "field 'tv_brightness'", TextView.class);
        honeyPlayer.tv_volume = (TextView) C8522c.m36739c(view, 2131429637, "field 'tv_volume'", TextView.class);
        honeyPlayer.ll_pause_play = (LinearLayout) C8522c.m36739c(view, 2131428460, "field 'll_pause_play'", LinearLayout.class);
        honeyPlayer.tv_episode_name = (TextView) C8522c.m36739c(view, C10105q.f46321V, "field 'tv_episode_name'", TextView.class);
        honeyPlayer.tv_current_season = (TextView) C8522c.m36739c(view, 2131429401, "field 'tv_current_season'", TextView.class);
        honeyPlayer.iv_hp_lock = (ImageView) C8522c.m36739c(view, 2131428185, "field 'iv_hp_lock'", ImageView.class);
        honeyPlayer.ll_hp_lock_click = (LinearLayout) C8522c.m36739c(view, 2131428418, "field 'll_hp_lock_click'", LinearLayout.class);
        honeyPlayer.ll_screen_locked = (LinearLayout) C8522c.m36739c(view, 2131428494, "field 'll_screen_locked'", LinearLayout.class);
        honeyPlayer.iv_unlock_button = (ImageView) C8522c.m36739c(view, 2131428238, "field 'iv_unlock_button'", ImageView.class);
        honeyPlayer.rl_next_episode = (RelativeLayout) C8522c.m36739c(view, 2131429020, "field 'rl_next_episode'", RelativeLayout.class);
        honeyPlayer.iv_next_episode = (ImageView) C8522c.m36739c(view, 2131428204, "field 'iv_next_episode'", ImageView.class);
        honeyPlayer.cancel_autoplay = (TextView) C8522c.m36739c(view, 2131427693, "field 'cancel_autoplay'", TextView.class);
        honeyPlayer.tv_seconds_left = (TextView) C8522c.m36739c(view, 2131429595, "field 'tv_seconds_left'", TextView.class);
        honeyPlayer.tv_autoplay_next_episode_button = (TextView) C8522c.m36739c(view, 2131429362, "field 'tv_autoplay_next_episode_button'", TextView.class);
        honeyPlayer.ll_auto_play_next_episode = (LinearLayout) C8522c.m36739c(view, 2131428331, "field 'll_auto_play_next_episode'", LinearLayout.class);
        honeyPlayer.mHudView = (TableLayout) C8522c.m36739c(view, 2131428103, "field 'mHudView'", TableLayout.class);
        honeyPlayer.ll_chromecast_click = (LinearLayout) C8522c.m36739c(view, 2131428359, "field 'll_chromecast_click'", LinearLayout.class);
        honeyPlayer.cast_button = (MediaRouteButton) C8522c.m36739c(view, 2131427704, "field 'cast_button'", MediaRouteButton.class);
        honeyPlayer.ll_casting_to_tv = (LinearLayout) C8522c.m36739c(view, 2131428347, "field 'll_casting_to_tv'", LinearLayout.class);
        honeyPlayer.tv_casting_status_text = (TextView) C8522c.m36739c(view, 2131429375, "field 'tv_casting_status_text'", TextView.class);
        honeyPlayer.rl_movie_poster_box = (RelativeLayout) C8522c.m36739c(view, 2131429016, "field 'rl_movie_poster_box'", RelativeLayout.class);
        honeyPlayer.iv_movie_poster_box = (ImageView) C8522c.m36739c(view, 2131428201, "field 'iv_movie_poster_box'", ImageView.class);
        honeyPlayer.iv_hp_play_from_beginning = (ImageView) C8522c.m36739c(view, 2131428186, "field 'iv_hp_play_from_beginning'", ImageView.class);
        honeyPlayer.ll_restart = (LinearLayout) C8522c.m36739c(view, 2131428490, "field 'll_restart'", LinearLayout.class);
        honeyPlayer.ll_play_button_main_layout = (LinearLayout) C8522c.m36739c(view, 2131428468, "field 'll_play_button_main_layout'", LinearLayout.class);
        honeyPlayer.ll_season_button_main_layout = (LinearLayout) C8522c.m36739c(view, 2131428497, "field 'll_season_button_main_layout'", LinearLayout.class);
    }

    @Override // butterknife.Unbinder
    /* renamed from: a */
    public void mo5629a() {
        HoneyPlayer honeyPlayer = this.f17384b;
        if (honeyPlayer == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f17384b = null;
        honeyPlayer.ll_player_header = null;
        honeyPlayer.ll_player_footer = null;
        honeyPlayer.mVideoView = null;
        honeyPlayer.iv_back = null;
        honeyPlayer.ll_back_click = null;
        honeyPlayer.ll_audio_subtitle_settings_click = null;
        honeyPlayer.iv_audio_subtitle_track = null;
        honeyPlayer.iv_play = null;
        honeyPlayer.iv_pause = null;
        honeyPlayer.hp_seekbar = null;
        honeyPlayer.ll_episodes = null;
        honeyPlayer.ll_crop = null;
        honeyPlayer.ll_playback_speed = null;
        honeyPlayer.iv_playback = null;
        honeyPlayer.ll_next_episode = null;
        honeyPlayer.ll_audio_subtitle_settings = null;
        honeyPlayer.ll_back = null;
        honeyPlayer.iv_back_episodes = null;
        honeyPlayer.iv_back_settings = null;
        honeyPlayer.tv_start_time = null;
        honeyPlayer.tv_end_time = null;
        honeyPlayer.ll_aspect_ratio = null;
        honeyPlayer.rg_subtitle = null;
        honeyPlayer.rg_audio = null;
        honeyPlayer.rg_video = null;
        honeyPlayer.no_audio_track = null;
        honeyPlayer.no_subtitle_track = null;
        honeyPlayer.no_video_track = null;
        honeyPlayer.tv_sub_font_size = null;
        honeyPlayer.fl_sub_font_size = null;
        honeyPlayer.tv_speed = null;
        honeyPlayer.rl_episodes_box = null;
        honeyPlayer.rl_settings_box = null;
        honeyPlayer.myRecyclerView = null;
        honeyPlayer.tv_seek_left = null;
        honeyPlayer.tv_seek_right = null;
        honeyPlayer.tv_seek_count_right = null;
        honeyPlayer.tv_seek_count_left = null;
        honeyPlayer.fl_seek_right = null;
        honeyPlayer.fl_seek_left = null;
        honeyPlayer.sb_volume = null;
        honeyPlayer.sb_brightness = null;
        honeyPlayer.ll_brightness = null;
        honeyPlayer.ll_volume = null;
        honeyPlayer.tv_brightness = null;
        honeyPlayer.tv_volume = null;
        honeyPlayer.ll_pause_play = null;
        honeyPlayer.tv_episode_name = null;
        honeyPlayer.tv_current_season = null;
        honeyPlayer.iv_hp_lock = null;
        honeyPlayer.ll_hp_lock_click = null;
        honeyPlayer.ll_screen_locked = null;
        honeyPlayer.iv_unlock_button = null;
        honeyPlayer.rl_next_episode = null;
        honeyPlayer.iv_next_episode = null;
        honeyPlayer.cancel_autoplay = null;
        honeyPlayer.tv_seconds_left = null;
        honeyPlayer.tv_autoplay_next_episode_button = null;
        honeyPlayer.ll_auto_play_next_episode = null;
        honeyPlayer.mHudView = null;
        honeyPlayer.ll_chromecast_click = null;
        honeyPlayer.cast_button = null;
        honeyPlayer.ll_casting_to_tv = null;
        honeyPlayer.tv_casting_status_text = null;
        honeyPlayer.rl_movie_poster_box = null;
        honeyPlayer.iv_movie_poster_box = null;
        honeyPlayer.iv_hp_play_from_beginning = null;
        honeyPlayer.ll_restart = null;
        honeyPlayer.ll_play_button_main_layout = null;
        honeyPlayer.ll_season_button_main_layout = null;
    }
}
