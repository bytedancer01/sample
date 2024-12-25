package ve;

import af.C0160c;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import p203lf.C5856i;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ve/a.class
 */
/* renamed from: ve.a */
/* loaded from: combined.jar:classes2.jar:ve/a.class */
public class C9340a {

    /* renamed from: a */
    public PopupWindow f42561a;

    /* renamed from: b */
    public View f42562b;

    /* renamed from: c */
    public RecyclerView f42563c;

    /* renamed from: d */
    public C5856i f42564d;

    /* renamed from: a */
    public void m39373a(List<C0160c> list) {
        this.f42564d.m28485d0(list);
    }

    /* renamed from: b */
    public void m39374b(Context context) {
        if (this.f42561a == null) {
            View inflate = LayoutInflater.from(context).inflate(2131624564, (ViewGroup) null);
            this.f42562b = inflate;
            this.f42563c = (RecyclerView) inflate.findViewById(2131429089);
            C5856i c5856i = new C5856i(context, new ArrayList());
            this.f42564d = c5856i;
            this.f42563c.setAdapter(c5856i);
            this.f42563c.setLayoutManager(new LinearLayoutManager(context));
            this.f42562b.setFocusable(true);
            this.f42562b.setFocusableInTouchMode(true);
            PopupWindow popupWindow = new PopupWindow(this.f42562b);
            this.f42561a = popupWindow;
            popupWindow.setBackgroundDrawable(new ColorDrawable(0));
            this.f42561a.setFocusable(true);
            this.f42561a.setOutsideTouchable(false);
            this.f42561a.setTouchable(true);
        }
    }

    /* renamed from: c */
    public void m39375c(C5856i.b bVar) {
        this.f42564d.m28518i0(bVar);
    }

    /* renamed from: d */
    public void m39376d(View view) {
        if (this.f42561a.isShowing()) {
            this.f42561a.dismiss();
            return;
        }
        this.f42562b.measure(0, 0);
        this.f42561a.showAsDropDown(view, (view.getMeasuredWidth() - this.f42562b.getMeasuredWidth()) / 2, 0);
        this.f42561a.update(view, this.f42562b.getMeasuredWidth(), this.f42562b.getMeasuredHeight());
    }
}
