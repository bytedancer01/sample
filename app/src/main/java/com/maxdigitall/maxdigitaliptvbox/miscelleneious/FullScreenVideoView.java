package com.maxdigitall.maxdigitaliptvbox.miscelleneious;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.VideoView;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/miscelleneious/FullScreenVideoView.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/miscelleneious/FullScreenVideoView.class */
public class FullScreenVideoView extends VideoView {
    public FullScreenVideoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.widget.VideoView, android.view.SurfaceView, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        setMeasuredDimension(i10, i11);
    }
}
