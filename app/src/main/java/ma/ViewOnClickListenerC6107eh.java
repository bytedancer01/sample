package ma;

import android.view.View;
import java.util.Iterator;
import java.util.List;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ma/eh.class
 */
/* renamed from: ma.eh */
/* loaded from: combined.jar:classes2.jar:ma/eh.class */
public final class ViewOnClickListenerC6107eh implements View.OnClickListener {

    /* renamed from: b */
    public final ViewTreeObserverOnGlobalLayoutListenerC6403sj f33750b;

    public ViewOnClickListenerC6107eh(ViewTreeObserverOnGlobalLayoutListenerC6403sj viewTreeObserverOnGlobalLayoutListenerC6403sj) {
        this.f33750b = viewTreeObserverOnGlobalLayoutListenerC6403sj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        List list;
        list = this.f33750b.f34044o;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((C6151gj) it.next()).mo29654e();
        }
    }
}
