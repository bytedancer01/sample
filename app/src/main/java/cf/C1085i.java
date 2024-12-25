package cf;

import androidx.recyclerview.widget.RecyclerView;
import com.maxdigitall.maxdigitaliptvbox.model.LiveStreamsDBModel;
import com.maxdigitall.maxdigitaliptvbox.view.adapter.SubCategoriesChildAdapter;
import java.util.ArrayList;
import java.util.List;
import se.InterfaceC8559a;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:cf/i.class
 */
/* renamed from: cf.i */
/* loaded from: combined.jar:classes2.jar:cf/i.class */
public class C1085i implements InterfaceC8559a<C1078b> {

    /* renamed from: a */
    public RecyclerView f7254a;

    /* renamed from: b */
    public String f7255b;

    /* renamed from: c */
    public ArrayList<LiveStreamsDBModel> f7256c;

    /* renamed from: d */
    public SubCategoriesChildAdapter f7257d;

    /* renamed from: e */
    public List<C1078b> f7258e;

    public C1085i(RecyclerView recyclerView, String str, ArrayList<LiveStreamsDBModel> arrayList, SubCategoriesChildAdapter subCategoriesChildAdapter, List<C1078b> list) {
        this.f7254a = recyclerView;
        this.f7255b = str;
        this.f7256c = arrayList;
        this.f7257d = subCategoriesChildAdapter;
        this.f7258e = list;
    }

    @Override // se.InterfaceC8559a
    /* renamed from: a */
    public List<C1078b> mo6474a() {
        return this.f7258e;
    }

    /* renamed from: b */
    public List<LiveStreamsDBModel> m6475b() {
        return this.f7256c;
    }
}
