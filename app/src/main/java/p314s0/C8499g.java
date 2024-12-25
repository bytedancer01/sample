package p314s0;

import android.widget.ListView;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:s0/g.class
 */
/* renamed from: s0.g */
/* loaded from: combined.jar:classes1.jar:s0/g.class */
public class C8499g extends AbstractViewOnTouchListenerC8493a {

    /* renamed from: t */
    public final ListView f39860t;

    public C8499g(ListView listView) {
        super(listView);
        this.f39860t = listView;
    }

    @Override // p314s0.AbstractViewOnTouchListenerC8493a
    /* renamed from: a */
    public boolean mo36651a(int i10) {
        return false;
    }

    @Override // p314s0.AbstractViewOnTouchListenerC8493a
    /* renamed from: b */
    public boolean mo36652b(int i10) {
        ListView listView = this.f39860t;
        int count = listView.getCount();
        if (count == 0) {
            return false;
        }
        int childCount = listView.getChildCount();
        int firstVisiblePosition = listView.getFirstVisiblePosition();
        if (i10 > 0) {
            return firstVisiblePosition + childCount < count || listView.getChildAt(childCount - 1).getBottom() > listView.getHeight();
        }
        if (i10 < 0) {
            return firstVisiblePosition > 0 || listView.getChildAt(0).getTop() < 0;
        }
        return false;
    }

    @Override // p314s0.AbstractViewOnTouchListenerC8493a
    /* renamed from: j */
    public void mo36658j(int i10, int i11) {
        C8500h.m36694a(this.f39860t, i11);
    }
}
