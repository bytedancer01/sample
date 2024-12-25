package com.maxdigitall.maxdigitaliptvbox.view.activity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.appcompat.app.ActivityC0243b;
import androidx.appcompat.widget.AppCompatImageView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.pierfrancescosoffritti.youtubeplayer.player.YouTubePlayerView;
import mg.AbstractC6598a;
import mg.InterfaceC6600c;
import mg.InterfaceC6603f;
import nf.C6783a;
import p151if.C5251a;
import p440z8.C10105q;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/YouTubePlayerActivity.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/YouTubePlayerActivity.class */
public class YouTubePlayerActivity extends ActivityC0243b implements View.OnClickListener {

    /* renamed from: d */
    public YouTubePlayerView f19611d;

    /* renamed from: f */
    public InterfaceC6600c f19613f;

    /* renamed from: i */
    public Handler f19616i;

    @BindView
    public RelativeLayout llcontrol;

    @BindView
    public AppCompatImageView pauseBT;

    @BindView
    public AppCompatImageView playBT;

    /* renamed from: e */
    public String f19612e = "";

    /* renamed from: g */
    public boolean f19614g = false;

    /* renamed from: h */
    public boolean f19615h = false;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/YouTubePlayerActivity$a.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.YouTubePlayerActivity$a */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/YouTubePlayerActivity$a.class */
    public class C3357a implements InterfaceC6603f {

        /* renamed from: a */
        public final YouTubePlayerActivity f19617a;

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/YouTubePlayerActivity$a$a.class
         */
        /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.YouTubePlayerActivity$a$a */
        /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/YouTubePlayerActivity$a$a.class */
        public class a extends AbstractC6598a {

            /* renamed from: b */
            public final InterfaceC6600c f19618b;

            /* renamed from: c */
            public final C3357a f19619c;

            public a(C3357a c3357a, InterfaceC6600c interfaceC6600c) {
                this.f19619c = c3357a;
                this.f19618b = interfaceC6600c;
            }

            @Override // mg.AbstractC6598a, mg.InterfaceC6604g
            /* renamed from: h */
            public void mo17044h(int i10) {
                if (i10 == 0) {
                    this.f19619c.f19617a.finish();
                }
                if (i10 == 1) {
                    this.f19619c.f19617a.f19614g = true;
                    this.f19619c.f19617a.f19615h = false;
                }
                if (i10 == 2) {
                    this.f19619c.f19617a.f19615h = false;
                    this.f19619c.f19617a.f19614g = false;
                }
            }

            @Override // mg.AbstractC6598a, mg.InterfaceC6604g
            /* renamed from: l */
            public void mo17045l() {
                String str = this.f19619c.f19617a.f19612e;
                this.f19619c.f19617a.f19613f = this.f19618b;
                if (str == null || str.isEmpty()) {
                    return;
                }
                this.f19619c.f19617a.findViewById(C10105q.f46302C).setVisibility(4);
                this.f19619c.f19617a.findViewById(C10105q.f46301B).setVisibility(0);
                this.f19618b.mo30486e(str, 0.0f);
                this.f19619c.f19617a.f19614g = true;
            }

            @Override // mg.AbstractC6598a, mg.InterfaceC6604g
            public void onError(int i10) {
            }
        }

        public C3357a(YouTubePlayerActivity youTubePlayerActivity) {
            this.f19617a = youTubePlayerActivity;
        }

        @Override // mg.InterfaceC6603f
        /* renamed from: a */
        public void mo17043a(InterfaceC6600c interfaceC6600c) {
            interfaceC6600c.mo30485d(new a(this, interfaceC6600c));
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/YouTubePlayerActivity$b.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.YouTubePlayerActivity$b */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/YouTubePlayerActivity$b.class */
    public class RunnableC3358b implements Runnable {

        /* renamed from: b */
        public final YouTubePlayerActivity f19620b;

        public RunnableC3358b(YouTubePlayerActivity youTubePlayerActivity) {
            this.f19620b = youTubePlayerActivity;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f19620b.findViewById(2131427785).setVisibility(4);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/YouTubePlayerActivity$c.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.YouTubePlayerActivity$c */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/YouTubePlayerActivity$c.class */
    public class RunnableC3359c implements Runnable {

        /* renamed from: b */
        public final YouTubePlayerActivity f19621b;

        public RunnableC3359c(YouTubePlayerActivity youTubePlayerActivity) {
            this.f19621b = youTubePlayerActivity;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f19621b.findViewById(2131427785).setVisibility(4);
        }
    }

    @Override // androidx.appcompat.app.ActivityC0243b, p030c0.ActivityC0952l, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        boolean z10 = keyEvent.getAction() == 0;
        if (keyCode == 23) {
            return z10 ? onKeyDown(keyCode, keyEvent) : onKeyUp(keyCode, keyEvent);
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        AppCompatImageView appCompatImageView;
        switch (view.getId()) {
            case C10105q.f46301B /* 2131427964 */:
                InterfaceC6600c interfaceC6600c = this.f19613f;
                if (interfaceC6600c != null) {
                    interfaceC6600c.pause();
                    findViewById(C10105q.f46302C).setVisibility(0);
                    findViewById(C10105q.f46301B).setVisibility(4);
                    this.pauseBT.clearFocus();
                    appCompatImageView = this.playBT;
                    break;
                } else {
                    return;
                }
            case C10105q.f46302C /* 2131427965 */:
                InterfaceC6600c interfaceC6600c2 = this.f19613f;
                if (interfaceC6600c2 != null) {
                    interfaceC6600c2.play();
                    findViewById(C10105q.f46302C).setVisibility(4);
                    findViewById(C10105q.f46301B).setVisibility(0);
                    this.playBT.clearFocus();
                    appCompatImageView = this.pauseBT;
                    break;
                } else {
                    return;
                }
            default:
                return;
        }
        appCompatImageView.requestFocus();
    }

    @Override // androidx.fragment.app.ActivityC0416e, androidx.activity.ComponentActivity, p030c0.ActivityC0952l, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2131624104);
        ButterKnife.m5626a(this);
        this.f19611d = (YouTubePlayerView) findViewById(2131429705);
        this.f19611d.addView(getLayoutInflater().inflate(2131624571, (ViewGroup) null));
        this.playBT = (AppCompatImageView) findViewById(C10105q.f46302C);
        this.pauseBT = (AppCompatImageView) findViewById(C10105q.f46301B);
        findViewById(C10105q.f46302C).setOnClickListener(this);
        findViewById(C10105q.f46301B).setOnClickListener(this);
        m17042u0();
    }

    @Override // androidx.appcompat.app.ActivityC0243b, androidx.fragment.app.ActivityC0416e, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        YouTubePlayerView youTubePlayerView = this.f19611d;
        if (youTubePlayerView != null) {
            youTubePlayerView.release();
        }
    }

    @Override // androidx.appcompat.app.ActivityC0243b, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        keyEvent.getRepeatCount();
        keyEvent.getAction();
        if (i10 == 23 || i10 == 66 || i10 == 166 || i10 == 167) {
            return true;
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i10, KeyEvent keyEvent) {
        AppCompatImageView appCompatImageView;
        InterfaceC6600c interfaceC6600c;
        keyEvent.getRepeatCount();
        if (i10 != 23 && i10 != 66) {
            return super.onKeyUp(i10, keyEvent);
        }
        findViewById(2131427785).setVisibility(0);
        if (findViewById(2131427785).getVisibility() == 0) {
            if (!this.f19614g || (interfaceC6600c = this.f19613f) == null) {
                InterfaceC6600c interfaceC6600c2 = this.f19613f;
                if (interfaceC6600c2 != null) {
                    this.f19614g = true;
                    interfaceC6600c2.play();
                    findViewById(C10105q.f46302C).setVisibility(4);
                    findViewById(C10105q.f46301B).setVisibility(0);
                    this.pauseBT.requestFocus();
                    appCompatImageView = this.playBT;
                }
            } else {
                this.f19614g = false;
                interfaceC6600c.pause();
                findViewById(C10105q.f46302C).setVisibility(0);
                findViewById(C10105q.f46301B).setVisibility(4);
                this.playBT.requestFocus();
                appCompatImageView = this.pauseBT;
            }
            appCompatImageView.clearFocus();
        }
        this.f19616i.removeCallbacksAndMessages(null);
        this.f19616i.postDelayed(new RunnableC3359c(this), 2000L);
        return true;
    }

    @Override // androidx.fragment.app.ActivityC0416e, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @SuppressLint({"ResourceType"})
    /* renamed from: u0 */
    public final void m17042u0() {
        this.f19616i = new Handler();
        this.f19611d.getPlayerUIController();
        Intent intent = getIntent();
        if (intent != null) {
            this.f19612e = intent.getStringExtra("you_tube_trailer");
        }
        this.f19611d.getPlayerUIController().mo31990a(false);
        if (new C6783a(this).m31288z().equals(C5251a.f30065s0)) {
            this.f19611d.getPlayerUIController().mo31993o(false);
        } else {
            this.f19611d.getPlayerUIController().mo31993o(true);
        }
        this.f19611d.getPlayerUIController().mo31991b(false);
        this.f19611d.getPlayerUIController().mo31992m(true);
        this.f19611d.m21320m(new C3357a(this), true);
        this.f19616i.removeCallbacksAndMessages(null);
        this.f19616i.postDelayed(new RunnableC3358b(this), 2000L);
    }
}
