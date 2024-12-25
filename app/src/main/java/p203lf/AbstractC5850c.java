package p203lf;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.AbstractC0674e0;
import java.util.ArrayList;
import java.util.List;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:lf/c.class
 */
/* renamed from: lf.c */
/* loaded from: combined.jar:classes2.jar:lf/c.class */
public abstract class AbstractC5850c<T, VH extends RecyclerView.AbstractC0674e0> extends RecyclerView.AbstractC0677h<VH> {

    /* renamed from: e */
    public Context f32526e;

    /* renamed from: f */
    public ArrayList<T> f32527f;

    /* renamed from: g */
    public InterfaceC5862o<T> f32528g;

    public AbstractC5850c(Context context, ArrayList<T> arrayList) {
        this.f32526e = context;
        this.f32527f = arrayList;
    }

    /* renamed from: d0 */
    public void m28485d0(List<T> list) {
        this.f32527f.clear();
        this.f32527f.addAll(list);
        m4099w();
    }

    /* renamed from: e0 */
    public void m28486e0(InterfaceC5862o interfaceC5862o) {
        this.f32528g = interfaceC5862o;
    }
}
