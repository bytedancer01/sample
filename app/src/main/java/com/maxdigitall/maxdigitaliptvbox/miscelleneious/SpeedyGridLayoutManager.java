package com.maxdigitall.maxdigitaliptvbox.miscelleneious;

import android.content.Context;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.C0711j;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/miscelleneious/SpeedyGridLayoutManager.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/miscelleneious/SpeedyGridLayoutManager.class */
public class SpeedyGridLayoutManager extends GridLayoutManager {

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/miscelleneious/SpeedyGridLayoutManager$a.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.miscelleneious.SpeedyGridLayoutManager$a */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/miscelleneious/SpeedyGridLayoutManager$a.class */
    public class C2654a extends C0711j {

        /* renamed from: q */
        public final SpeedyGridLayoutManager f16342q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2654a(SpeedyGridLayoutManager speedyGridLayoutManager, Context context) {
            super(context);
            this.f16342q = speedyGridLayoutManager;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0666a0
        /* renamed from: a */
        public PointF mo2879a(int i10) {
            return super.mo2879a(i10);
        }

        @Override // androidx.recyclerview.widget.C0711j
        /* renamed from: v */
        public float mo4601v(DisplayMetrics displayMetrics) {
            return 150.0f / displayMetrics.densityDpi;
        }
    }

    public SpeedyGridLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0685p
    /* renamed from: g2 */
    public void mo2800g2(RecyclerView recyclerView, RecyclerView.C0668b0 c0668b0, int i10) {
        C2654a c2654a = new C2654a(this, recyclerView.getContext());
        c2654a.m3999p(i10);
        mo2803h2(c2654a);
    }
}
