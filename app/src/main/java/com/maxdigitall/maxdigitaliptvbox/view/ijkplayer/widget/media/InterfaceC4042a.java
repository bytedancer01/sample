package com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media;

import android.view.SurfaceHolder;
import android.view.View;
import tv.danmaku.ijk.media.player.IMediaPlayer;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/a.class
 */
/* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.a */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/a.class */
public interface InterfaceC4042a {

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/a$a.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.a$a */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/a$a.class */
    public interface a {
        /* renamed from: a */
        void mo18794a(b bVar, int i10, int i11, int i12);

        /* renamed from: b */
        void mo18795b(b bVar);

        /* renamed from: c */
        void mo18796c(b bVar, int i10, int i11);
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/a$b.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.a$b */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/a$b.class */
    public interface b {
        /* renamed from: a */
        InterfaceC4042a mo19699a();

        /* renamed from: b */
        void mo19700b(IMediaPlayer iMediaPlayer);

        /* renamed from: c */
        SurfaceHolder mo19701c();
    }

    /* renamed from: a */
    void mo19694a(int i10, int i11);

    /* renamed from: b */
    void mo19695b(a aVar);

    /* renamed from: c */
    void mo19696c(int i10, int i11);

    /* renamed from: d */
    boolean mo19697d();

    /* renamed from: e */
    void mo19698e(a aVar);

    View getView();

    void setAspectRatio(int i10);

    void setVideoRotation(int i10);
}
