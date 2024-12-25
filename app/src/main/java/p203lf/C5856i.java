package p203lf;

import af.C0160c;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:lf/i.class
 */
/* renamed from: lf.i */
/* loaded from: combined.jar:classes2.jar:lf/i.class */
public class C5856i extends AbstractC5850c<C0160c, c> {

    /* renamed from: h */
    public b f32625h;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:lf/i$a.class
     */
    /* renamed from: lf.i$a */
    /* loaded from: combined.jar:classes2.jar:lf/i$a.class */
    public class a implements View.OnClickListener {

        /* renamed from: b */
        public final c f32626b;

        /* renamed from: c */
        public final C5856i f32627c;

        public a(C5856i c5856i, c cVar) {
            this.f32627c = c5856i;
            this.f32626b = cVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (this.f32627c.f32625h != null) {
                this.f32627c.f32625h.mo15596a((C0160c) this.f32627c.f32527f.get(this.f32626b.m4064n()));
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:lf/i$b.class
     */
    /* renamed from: lf.i$b */
    /* loaded from: combined.jar:classes2.jar:lf/i$b.class */
    public interface b {
        /* renamed from: a */
        void mo15596a(C0160c c0160c);
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:lf/i$c.class
     */
    /* renamed from: lf.i$c */
    /* loaded from: combined.jar:classes2.jar:lf/i$c.class */
    public class c extends RecyclerView.AbstractC0674e0 {

        /* renamed from: u */
        public TextView f32628u;

        /* renamed from: v */
        public final C5856i f32629v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C5856i c5856i, View view) {
            super(view);
            this.f32629v = c5856i;
            this.f32628u = (TextView) view.findViewById(2131429460);
        }
    }

    public C5856i(Context context, ArrayList<C0160c> arrayList) {
        super(context, arrayList);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0677h
    /* renamed from: g0, reason: merged with bridge method [inline-methods] */
    public void mo2996G(c cVar, int i10) {
        cVar.f32628u.setText(((C0160c) this.f32527f.get(i10)).m715c());
        cVar.f4620a.setOnClickListener(new a(this, cVar));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0677h
    /* renamed from: h0, reason: merged with bridge method [inline-methods] */
    public c mo2998J(ViewGroup viewGroup, int i10) {
        return new c(this, LayoutInflater.from(this.f32526e).inflate(2131624566, viewGroup, false));
    }

    /* renamed from: i0 */
    public void m28518i0(b bVar) {
        this.f32625h = bVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0677h
    /* renamed from: n */
    public int mo3013n() {
        return this.f32527f.size();
    }
}
