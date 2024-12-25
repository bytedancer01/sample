package androidx.mediarouter.app;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.AnimationDrawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.C0329l;
import p050d0.C4290b;
import p192l1.C5649e;
import p192l1.C5654j;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/mediarouter/app/MediaRouteExpandCollapseButton.class
 */
/* loaded from: combined.jar:classes1.jar:androidx/mediarouter/app/MediaRouteExpandCollapseButton.class */
class MediaRouteExpandCollapseButton extends C0329l {

    /* renamed from: d */
    public final AnimationDrawable f3857d;

    /* renamed from: e */
    public final AnimationDrawable f3858e;

    /* renamed from: f */
    public final String f3859f;

    /* renamed from: g */
    public final String f3860g;

    /* renamed from: h */
    public boolean f3861h;

    /* renamed from: i */
    public View.OnClickListener f3862i;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/mediarouter/app/MediaRouteExpandCollapseButton$a.class
     */
    /* renamed from: androidx.mediarouter.app.MediaRouteExpandCollapseButton$a */
    /* loaded from: combined.jar:classes1.jar:androidx/mediarouter/app/MediaRouteExpandCollapseButton$a.class */
    public class ViewOnClickListenerC0602a implements View.OnClickListener {

        /* renamed from: b */
        public final MediaRouteExpandCollapseButton f3863b;

        public ViewOnClickListenerC0602a(MediaRouteExpandCollapseButton mediaRouteExpandCollapseButton) {
            this.f3863b = mediaRouteExpandCollapseButton;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MediaRouteExpandCollapseButton mediaRouteExpandCollapseButton;
            String str;
            MediaRouteExpandCollapseButton mediaRouteExpandCollapseButton2 = this.f3863b;
            boolean z10 = !mediaRouteExpandCollapseButton2.f3861h;
            mediaRouteExpandCollapseButton2.f3861h = z10;
            if (z10) {
                mediaRouteExpandCollapseButton2.setImageDrawable(mediaRouteExpandCollapseButton2.f3857d);
                this.f3863b.f3857d.start();
                mediaRouteExpandCollapseButton = this.f3863b;
                str = mediaRouteExpandCollapseButton.f3860g;
            } else {
                mediaRouteExpandCollapseButton2.setImageDrawable(mediaRouteExpandCollapseButton2.f3858e);
                this.f3863b.f3858e.start();
                mediaRouteExpandCollapseButton = this.f3863b;
                str = mediaRouteExpandCollapseButton.f3859f;
            }
            mediaRouteExpandCollapseButton.setContentDescription(str);
            View.OnClickListener onClickListener = this.f3863b.f3862i;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
        }
    }

    public MediaRouteExpandCollapseButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MediaRouteExpandCollapseButton(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        AnimationDrawable animationDrawable = (AnimationDrawable) C4290b.m21726e(context, C5649e.f31808d);
        this.f3857d = animationDrawable;
        AnimationDrawable animationDrawable2 = (AnimationDrawable) C4290b.m21726e(context, C5649e.f31807c);
        this.f3858e = animationDrawable2;
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(C0612i.m3412f(context, i10), PorterDuff.Mode.SRC_IN);
        animationDrawable.setColorFilter(porterDuffColorFilter);
        animationDrawable2.setColorFilter(porterDuffColorFilter);
        String string = context.getString(C5654j.f31888i);
        this.f3859f = string;
        this.f3860g = context.getString(C5654j.f31886g);
        setImageDrawable(animationDrawable.getFrame(0));
        setContentDescription(string);
        super.setOnClickListener(new ViewOnClickListenerC0602a(this));
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f3862i = onClickListener;
    }
}
