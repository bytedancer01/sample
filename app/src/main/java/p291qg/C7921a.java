package p291qg;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import p204lg.C5874a;
import p204lg.C5876c;
import p204lg.C5877d;
import pg.C7712a;
import pg.InterfaceC7713b;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:qg/a.class
 */
/* renamed from: qg.a */
/* loaded from: combined.jar:classes2.jar:qg/a.class */
public class C7921a implements InterfaceC7713b {

    /* renamed from: a */
    public final Context f38099a;

    /* renamed from: b */
    public final List<C7712a> f38100b = new ArrayList();

    /* renamed from: c */
    public PopupWindow f38101c;

    public C7921a(Context context) {
        this.f38099a = context;
    }

    @Override // pg.InterfaceC7713b
    /* renamed from: a */
    public void mo33703a(View view) {
        PopupWindow m34320b = m34320b();
        this.f38101c = m34320b;
        m34320b.showAsDropDown(view, 0, (-this.f38099a.getResources().getDimensionPixelSize(C5874a.f32932a)) * 4);
        if (this.f38100b.size() == 0) {
            Log.e(InterfaceC7713b.class.getName(), "The menu is empty");
        }
    }

    /* renamed from: b */
    public final PopupWindow m34320b() {
        LayoutInflater layoutInflater = (LayoutInflater) this.f38099a.getSystemService("layout_inflater");
        if (layoutInflater == null) {
            throw new RuntimeException("can't access LAYOUT_INFLATER_SERVICE");
        }
        View inflate = layoutInflater.inflate(C5877d.f32956c, (ViewGroup) null);
        m34321c((RecyclerView) inflate.findViewById(C5876c.f32947k));
        PopupWindow popupWindow = new PopupWindow(inflate, -2, -2);
        popupWindow.setFocusable(true);
        popupWindow.setWidth(-2);
        popupWindow.setHeight(-2);
        popupWindow.setContentView(inflate);
        return popupWindow;
    }

    /* renamed from: c */
    public final void m34321c(RecyclerView recyclerView) {
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this.f38099a));
        recyclerView.setAdapter(new C7922b(this.f38099a, this.f38100b));
    }
}
