package gf;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.C0707f;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.maxdigitall.maxdigitaliptvbox.miscelleneious.chromecastfeature.ExpandedControlsActivity;
import gf.C5004b;
import p082ef.C4719b;
import p133hf.C5077b;
import p200l9.C5791o;
import p204lg.C5876c;
import p216m9.C5938b;
import p216m9.C5947e;
import p230n9.C6721i;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:gf/c.class
 */
/* renamed from: gf.c */
/* loaded from: combined.jar:classes2.jar:gf/c.class */
public class C5005c extends Fragment implements C5004b.f {

    /* renamed from: b */
    public C4719b f29034b;

    /* renamed from: c */
    public C0707f f29035c;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:gf/c$a.class
     */
    /* renamed from: gf.c$a */
    /* loaded from: combined.jar:classes2.jar:gf/c$a.class */
    public class a implements C5004b.d {

        /* renamed from: a */
        public final C5005c f29036a;

        public a(C5005c c5005c) {
            this.f29036a = c5005c;
        }

        @Override // gf.C5004b.d
        /* renamed from: a */
        public void mo25186a(View view) {
            switch (view.getId()) {
                case 2131427772:
                    Log.d("QueueListViewFragment", "onItemViewClicked() container " + view.getTag(2132018429));
                    this.f29036a.m25199s(view);
                    break;
                case 2131428851:
                    Log.d("QueueListViewFragment", "onItemViewClicked() play-pause " + view.getTag(2132018429));
                    this.f29036a.m25200u(view);
                    break;
                case 2131428853:
                    this.f29036a.f29034b.m23773v(view, (C5791o) view.getTag(2132018429));
                    break;
                case 2131429231:
                    this.f29036a.f29034b.m23774w(view, (C5791o) view.getTag(2132018429));
                    break;
            }
        }
    }

    @Override // gf.C5004b.f
    /* renamed from: j */
    public void mo25189j(RecyclerView.AbstractC0674e0 abstractC0674e0) {
        this.f29035c.m4536H(abstractC0674e0);
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        setRetainInstance(true);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(2131624218, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        RecyclerView recyclerView = (RecyclerView) getView().findViewById(C5876c.f32947k);
        this.f29034b = C4719b.m23760n(getContext());
        C5004b c5004b = new C5004b(getActivity(), this);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(c5004b);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        C0707f c0707f = new C0707f(new C5003a(c5004b));
        this.f29035c = c0707f;
        c0707f.m4542m(recyclerView);
        c5004b.m25184i0(new a(this));
    }

    /* renamed from: q */
    public final C6721i m25198q() {
        C5947e m29358c = C5938b.m29235e(getContext()).m29243c().m29358c();
        if (m29358c == null || !m29358c.m29348c()) {
            return null;
        }
        return m29358c.m29290r();
    }

    /* renamed from: s */
    public final void m25199s(View view) {
        C6721i m25198q = m25198q();
        if (m25198q == null) {
            return;
        }
        C5791o c5791o = (C5791o) view.getTag(2132018429);
        if (this.f29034b.m23771t()) {
            Log.d("QueueListViewFragment", "Is detached: itemId = " + c5791o.m28282S());
            m25198q.m30980G(C5077b.m25357a(this.f29034b.m23767p()), this.f29034b.m23768q(c5791o.m28282S()), 0, null);
            return;
        }
        if (this.f29034b.m23765m() != c5791o.m28282S()) {
            m25198q.m30978E(c5791o.m28282S(), null);
        } else if (C5938b.m29235e(getContext().getApplicationContext()).m29243c().m29358c() != null) {
            startActivity(new Intent(getActivity(), (Class<?>) ExpandedControlsActivity.class));
        }
    }

    /* renamed from: u */
    public final void m25200u(View view) {
        C6721i m25198q = m25198q();
        if (m25198q != null) {
            m25198q.m30995V();
        }
    }
}
