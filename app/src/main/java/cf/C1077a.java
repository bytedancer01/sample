package cf;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.maxdigitall.maxdigitaliptvbox.model.LiveStreamsDBModel;
import com.maxdigitall.maxdigitaliptvbox.view.adapter.SubCategoriesChildAdapter;
import java.util.ArrayList;
import java.util.List;
import se.AbstractC8560b;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:cf/a.class
 */
/* renamed from: cf.a */
/* loaded from: combined.jar:classes2.jar:cf/a.class */
public class C1077a extends AbstractC8560b<C1085i, C1078b, C1086j, C1079c> {

    /* renamed from: i */
    public Context f7112i;

    /* renamed from: j */
    public ArrayList<LiveStreamsDBModel> f7113j;

    /* renamed from: k */
    public List<C1085i> f7114k;

    public C1077a(Context context, List<C1085i> list, ArrayList<LiveStreamsDBModel> arrayList, RecyclerView recyclerView) {
        super(context, list);
        this.f7112i = context;
        this.f7113j = arrayList;
        this.f7114k = list;
    }

    @Override // se.AbstractC8560b
    /* renamed from: k0, reason: merged with bridge method [inline-methods] */
    public void mo6326g0(C1079c c1079c, int i10, int i11, C1078b c1078b) {
        this.f7113j = (ArrayList) this.f7114k.get(i10).m6475b();
        c1079c.f7116u.setLayoutManager(new LinearLayoutManager(this.f7112i, 0, false));
        c1079c.f7116u.setAdapter(new SubCategoriesChildAdapter(this.f7113j, this.f7112i));
    }

    @Override // se.AbstractC8560b
    /* renamed from: l0, reason: merged with bridge method [inline-methods] */
    public void mo6327h0(C1086j c1086j, int i10, C1085i c1085i) {
        c1086j.f7259u.setText(c1085i.f7255b);
    }

    @Override // se.AbstractC8560b
    /* renamed from: m0, reason: merged with bridge method [inline-methods] */
    public C1079c mo6328i0(ViewGroup viewGroup, int i10) {
        return new C1079c(LayoutInflater.from(this.f7112i).inflate(2131624247, viewGroup, false));
    }

    @Override // se.AbstractC8560b
    /* renamed from: n0, reason: merged with bridge method [inline-methods] */
    public C1086j mo6329j0(ViewGroup viewGroup, int i10) {
        return new C1086j(LayoutInflater.from(this.f7112i).inflate(2131624248, viewGroup, false));
    }
}
