package p291qg;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import p050d0.C4290b;
import p204lg.C5876c;
import p204lg.C5877d;
import pg.C7712a;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:qg/b.class
 */
/* renamed from: qg.b */
/* loaded from: combined.jar:classes2.jar:qg/b.class */
public class C7922b extends RecyclerView.AbstractC0677h<a> {

    /* renamed from: e */
    public final Context f38102e;

    /* renamed from: f */
    public final List<C7712a> f38103f;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:qg/b$a.class
     */
    /* renamed from: qg.b$a */
    /* loaded from: combined.jar:classes2.jar:qg/b$a.class */
    public class a extends RecyclerView.AbstractC0674e0 {

        /* renamed from: u */
        public final View f38104u;

        /* renamed from: v */
        public final TextView f38105v;

        /* renamed from: w */
        public final C7922b f38106w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C7922b c7922b, View view) {
            super(view);
            this.f38106w = c7922b;
            this.f38104u = view;
            this.f38105v = (TextView) view.findViewById(C5876c.f32949m);
        }
    }

    public C7922b(Context context, List<C7712a> list) {
        this.f38102e = context;
        this.f38103f = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0677h
    /* renamed from: d0, reason: merged with bridge method [inline-methods] */
    public void mo2996G(a aVar, int i10) {
        aVar.f38104u.setOnClickListener(this.f38103f.get(i10).m33701b());
        aVar.f38105v.setText(this.f38103f.get(i10).m33702c());
        aVar.f38105v.setCompoundDrawablesWithIntrinsicBounds(C4290b.m21726e(this.f38102e, this.f38103f.get(i10).m33700a()), (Drawable) null, (Drawable) null, (Drawable) null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0677h
    /* renamed from: e0, reason: merged with bridge method [inline-methods] */
    public a mo2998J(ViewGroup viewGroup, int i10) {
        return new a(this, LayoutInflater.from(viewGroup.getContext()).inflate(C5877d.f32955b, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0677h
    /* renamed from: n */
    public int mo3013n() {
        return this.f38103f.size();
    }
}
