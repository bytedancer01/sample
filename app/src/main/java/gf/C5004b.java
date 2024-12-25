package gf;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.android.volley.toolbox.C1507a;
import com.android.volley.toolbox.NetworkImageView;
import gf.C5003a;
import p082ef.C4719b;
import p133hf.C5076a;
import p200l9.C5782l;
import p200l9.C5791o;
import p216m9.C5938b;
import p216m9.C5947e;
import p230n9.C6721i;
import p235o0.C6847q;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:gf/b.class
 */
/* renamed from: gf.b */
/* loaded from: combined.jar:classes2.jar:gf/b.class */
public class C5004b extends RecyclerView.AbstractC0677h<g> implements C5003a.a {

    /* renamed from: e */
    public final C4719b f29013e;

    /* renamed from: f */
    public final Context f29014f;

    /* renamed from: g */
    public final f f29015g;

    /* renamed from: h */
    public View.OnClickListener f29016h;

    /* renamed from: i */
    public d f29017i;

    /* renamed from: j */
    public C1507a f29018j;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:gf/b$a.class
     */
    /* renamed from: gf.b$a */
    /* loaded from: combined.jar:classes2.jar:gf/b$a.class */
    public class a implements C4719b.d {

        /* renamed from: a */
        public final C5004b f29019a;

        public a(C5004b c5004b) {
            this.f29019a = c5004b;
        }

        @Override // p082ef.C4719b.d
        /* renamed from: a */
        public void mo23789a() {
            this.f29019a.m4099w();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:gf/b$b.class
     */
    /* renamed from: gf.b$b */
    /* loaded from: combined.jar:classes2.jar:gf/b$b.class */
    public class b implements View.OnClickListener {

        /* renamed from: b */
        public final C5004b f29020b;

        public b(C5004b c5004b) {
            this.f29020b = c5004b;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (view.getTag(2132018429) != null) {
                Log.d("QueueListAdapter", String.valueOf(((C5791o) view.getTag(2132018429)).m28282S()));
            }
            this.f29020b.m25183h0(view);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:gf/b$c.class
     */
    /* renamed from: gf.b$c */
    /* loaded from: combined.jar:classes2.jar:gf/b$c.class */
    public class c implements View.OnTouchListener {

        /* renamed from: b */
        public final g f29021b;

        /* renamed from: c */
        public final C5004b f29022c;

        public c(C5004b c5004b, g gVar) {
            this.f29022c = c5004b;
            this.f29021b = gVar;
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (C6847q.m31628a(motionEvent) != 0) {
                return false;
            }
            this.f29022c.f29015g.mo25189j(this.f29021b);
            return false;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:gf/b$d.class
     */
    /* renamed from: gf.b$d */
    /* loaded from: combined.jar:classes2.jar:gf/b$d.class */
    public interface d {
        /* renamed from: a */
        void mo25186a(View view);
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:gf/b$e.class
     */
    /* renamed from: gf.b$e */
    /* loaded from: combined.jar:classes2.jar:gf/b$e.class */
    public interface e {
        /* renamed from: a */
        void mo25187a();

        /* renamed from: b */
        void mo25188b();
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:gf/b$f.class
     */
    /* renamed from: gf.b$f */
    /* loaded from: combined.jar:classes2.jar:gf/b$f.class */
    public interface f {
        /* renamed from: j */
        void mo25189j(RecyclerView.AbstractC0674e0 abstractC0674e0);
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:gf/b$g.class
     */
    /* renamed from: gf.b$g */
    /* loaded from: combined.jar:classes2.jar:gf/b$g.class */
    public static class g extends RecyclerView.AbstractC0674e0 implements e {

        /* renamed from: A */
        public NetworkImageView f29023A;

        /* renamed from: B */
        public ViewGroup f29024B;

        /* renamed from: C */
        public ImageView f29025C;

        /* renamed from: D */
        public TextView f29026D;

        /* renamed from: E */
        public TextView f29027E;

        /* renamed from: u */
        public Context f29028u;

        /* renamed from: v */
        public final ImageButton f29029v;

        /* renamed from: w */
        public View f29030w;

        /* renamed from: x */
        public View f29031x;

        /* renamed from: y */
        public ImageButton f29032y;

        /* renamed from: z */
        public ImageButton f29033z;

        public g(View view) {
            super(view);
            this.f29028u = view.getContext();
            this.f29024B = (ViewGroup) view.findViewById(2131427772);
            this.f29025C = (ImageView) view.findViewById(2131427873);
            this.f29026D = (TextView) view.findViewById(2131429291);
            this.f29027E = (TextView) view.findViewById(2131429292);
            this.f29023A = (NetworkImageView) view.findViewById(2131428116);
            this.f29029v = (ImageButton) view.findViewById(2131428851);
            this.f29030w = view.findViewById(2131427785);
            this.f29031x = view.findViewById(2131427794);
            this.f29032y = (ImageButton) view.findViewById(2131428853);
            this.f29033z = (ImageButton) view.findViewById(2131429231);
        }

        /* renamed from: V */
        public final void m25194V(int i10) {
            int i11;
            this.f29026D.setTextAppearance(this.f29028u, 2132082739);
            this.f29027E.setTextAppearance(this.f29028u, 2132082720);
            if (i10 == 0) {
                this.f29030w.setVisibility(0);
                this.f29029v.setVisibility(0);
            } else {
                if (i10 == 1) {
                    this.f29030w.setVisibility(0);
                    this.f29029v.setVisibility(8);
                    this.f29031x.setVisibility(0);
                    this.f29025C.setImageResource(2131231202);
                    i11 = 2131230840;
                    this.f29026D.setTextAppearance(this.f29028u, 2132083184);
                    TextView textView = this.f29026D;
                    textView.setTextAppearance(textView.getContext(), 2132082740);
                    this.f29027E.setTextAppearance(this.f29028u, 2132082720);
                    this.f29024B.setBackgroundResource(i11);
                }
                this.f29030w.setVisibility(8);
                this.f29029v.setVisibility(8);
            }
            this.f29031x.setVisibility(8);
            this.f29025C.setImageResource(2131231201);
            i11 = 2131230837;
            this.f29024B.setBackgroundResource(i11);
        }

        @Override // gf.C5004b.e
        /* renamed from: a */
        public void mo25187a() {
            this.f4620a.setBackgroundColor(0);
        }

        @Override // gf.C5004b.e
        /* renamed from: b */
        public void mo25188b() {
        }
    }

    public C5004b(Context context, f fVar) {
        this.f29014f = context.getApplicationContext();
        this.f29015g = fVar;
        C4719b m23760n = C4719b.m23760n(context);
        this.f29013e = m23760n;
        m23760n.m23777z(new a(this));
        this.f29016h = new b(this);
        m4091X(true);
    }

    @Override // gf.C5003a.a
    /* renamed from: d */
    public void mo25177d(int i10) {
        this.f29013e.m23776y(i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0677h
    /* renamed from: f0, reason: merged with bridge method [inline-methods] */
    public void mo2996G(g gVar, int i10) {
        try {
            Log.d("QueueListAdapter", "[upcoming] onBindViewHolder() for position: " + i10);
            C5791o m23766o = this.f29013e.m23766o(i10);
            gVar.f29024B.setTag(2132018429, m23766o);
            gVar.f29029v.setTag(2132018429, m23766o);
            gVar.f29032y.setTag(2132018429, m23766o);
            gVar.f29033z.setTag(2132018429, m23766o);
            gVar.f29024B.setOnClickListener(this.f29016h);
            gVar.f29029v.setOnClickListener(this.f29016h);
            gVar.f29032y.setOnClickListener(this.f29016h);
            gVar.f29033z.setOnClickListener(this.f29016h);
            C5782l m13065Y = m23766o.m28283T().m13065Y();
            gVar.f29026D.setText(m13065Y.m28246S("com.google.android.gms.cast.metadata.TITLE"));
            gVar.f29027E.setText(m13065Y.m28246S("com.google.android.gms.cast.metadata.SUBTITLE"));
            if (!m13065Y.m28244Q().isEmpty()) {
                String uri = m13065Y.m28244Q().get(0).m40801P().toString();
                C1507a m25355a = C5076a.m25354b(this.f29014f).m25355a();
                this.f29018j = m25355a;
                m25355a.m6903e(uri, C1507a.m6901i(gVar.f29023A, 0, 0));
                gVar.f29023A.m6894e(uri, this.f29018j);
            }
            gVar.f29025C.setOnTouchListener(new c(this, gVar));
            if (m23766o == this.f29013e.m23764l()) {
                gVar.m25194V(0);
                m25185j0(gVar.f29029v);
            } else if (m23766o == this.f29013e.m23770s()) {
                gVar.m25194V(1);
            } else {
                gVar.m25194V(2);
                gVar.f29029v.setVisibility(8);
            }
        } catch (Exception e10) {
        }
    }

    @Override // gf.C5003a.a
    /* renamed from: g */
    public boolean mo25178g(int i10, int i11) {
        if (i10 == i11) {
            return false;
        }
        this.f29013e.m23772u(i10, i11);
        m4101y(i10, i11);
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0677h
    /* renamed from: g0, reason: merged with bridge method [inline-methods] */
    public g mo2998J(ViewGroup viewGroup, int i10) {
        return new g(LayoutInflater.from(viewGroup.getContext()).inflate(2131624488, viewGroup, false));
    }

    /* renamed from: h0 */
    public final void m25183h0(View view) {
        d dVar = this.f29017i;
        if (dVar != null) {
            dVar.mo25186a(view);
        }
    }

    /* renamed from: i0 */
    public void m25184i0(d dVar) {
        this.f29017i = dVar;
    }

    /* renamed from: j0 */
    public final void m25185j0(ImageButton imageButton) {
        int i10;
        C5947e m29358c = C5938b.m29235e(this.f29014f).m29243c().m29358c();
        C6721i m29290r = m29358c == null ? null : m29358c.m29290r();
        if (m29290r == null) {
            imageButton.setVisibility(8);
            return;
        }
        int m31016n = m29290r.m31016n();
        if (m31016n == 2) {
            i10 = 2131231165;
        } else {
            if (m31016n != 3) {
                imageButton.setVisibility(8);
                return;
            }
            i10 = 2131231136;
        }
        imageButton.setImageResource(i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0677h
    /* renamed from: n */
    public int mo3013n() {
        return C4719b.m23760n(this.f29014f).m23763k();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0677h
    /* renamed from: p */
    public long mo3016p(int i10) {
        return this.f29013e.m23766o(i10).m28282S();
    }
}
