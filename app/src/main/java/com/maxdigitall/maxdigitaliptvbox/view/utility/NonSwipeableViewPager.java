package com.maxdigitall.maxdigitaliptvbox.view.utility;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.viewpager.widget.ViewPager;
import java.lang.reflect.Field;
import org.apache.commons.net.ftp.FTPReply;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/utility/NonSwipeableViewPager.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/utility/NonSwipeableViewPager.class */
public class NonSwipeableViewPager extends ViewPager {

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/utility/NonSwipeableViewPager$a.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.utility.NonSwipeableViewPager$a */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/utility/NonSwipeableViewPager$a.class */
    public class C4045a extends Scroller {

        /* renamed from: a */
        public final NonSwipeableViewPager f24921a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4045a(NonSwipeableViewPager nonSwipeableViewPager, Context context) {
            super(context, new DecelerateInterpolator());
            this.f24921a = nonSwipeableViewPager;
        }

        @Override // android.widget.Scroller
        public void startScroll(int i10, int i11, int i12, int i13, int i14) {
            super.startScroll(i10, i11, i12, i13, FTPReply.FILE_ACTION_PENDING);
        }
    }

    public NonSwipeableViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m19723S();
    }

    /* renamed from: S */
    public final void m19723S() {
        try {
            Field declaredField = ViewPager.class.getDeclaredField("k");
            declaredField.setAccessible(true);
            declaredField.set(this, new C4045a(this, getContext()));
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // androidx.viewpager.widget.ViewPager
    /* renamed from: p */
    public boolean mo4781p(KeyEvent keyEvent) {
        return false;
    }
}
