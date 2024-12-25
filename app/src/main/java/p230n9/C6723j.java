package p230n9;

import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TabHost;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC0414d;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaTrack;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import p200l9.C5797q;
import p216m9.C5938b;
import p216m9.C5947e;
import p216m9.C5974n;
import p216m9.C5977o;
import p216m9.C5980p;
import p422y9.C9935o;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:n9/j.class
 */
/* renamed from: n9.j */
/* loaded from: combined.jar:classes2.jar:n9/j.class */
public class C6723j extends DialogInterfaceOnCancelListenerC0414d {

    /* renamed from: r */
    public boolean f35174r;

    /* renamed from: s */
    public List f35175s;

    /* renamed from: t */
    public List f35176t;

    /* renamed from: u */
    public long[] f35177u;

    /* renamed from: v */
    public Dialog f35178v;

    /* renamed from: w */
    public C6721i f35179w;

    /* renamed from: x */
    public MediaInfo f35180x;

    /* renamed from: y */
    public long[] f35181y;

    @Deprecated
    public C6723j() {
    }

    /* renamed from: N */
    public static C6723j m31041N() {
        return new C6723j();
    }

    /* renamed from: T */
    public static /* bridge */ /* synthetic */ void m31044T(C6723j c6723j, ViewOnClickListenerC6744t0 viewOnClickListenerC6744t0, ViewOnClickListenerC6744t0 viewOnClickListenerC6744t02) {
        if (!c6723j.f35174r) {
            c6723j.m31047Y();
            return;
        }
        C6721i c6721i = (C6721i) C9935o.m41850j(c6723j.f35179w);
        if (!c6721i.m31020p()) {
            c6723j.m31047Y();
            return;
        }
        ArrayList arrayList = new ArrayList();
        MediaTrack m31072a = viewOnClickListenerC6744t0.m31072a();
        if (m31072a != null && m31072a.m13082R() != -1) {
            arrayList.add(Long.valueOf(m31072a.m13082R()));
        }
        MediaTrack m31072a2 = viewOnClickListenerC6744t02.m31072a();
        if (m31072a2 != null) {
            arrayList.add(Long.valueOf(m31072a2.m13082R()));
        }
        long[] jArr = c6723j.f35177u;
        if (jArr != null && jArr.length > 0) {
            HashSet hashSet = new HashSet();
            Iterator it = c6723j.f35176t.iterator();
            while (it.hasNext()) {
                hashSet.add(Long.valueOf(((MediaTrack) it.next()).m13082R()));
            }
            Iterator it2 = c6723j.f35175s.iterator();
            while (it2.hasNext()) {
                hashSet.add(Long.valueOf(((MediaTrack) it2.next()).m13082R()));
            }
            for (long j10 : jArr) {
                Long valueOf = Long.valueOf(j10);
                if (!hashSet.contains(valueOf)) {
                    arrayList.add(valueOf);
                }
            }
        }
        long[] jArr2 = new long[arrayList.size()];
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            jArr2[i10] = ((Long) arrayList.get(i10)).longValue();
        }
        Arrays.sort(jArr2);
        c6721i.m30993T(jArr2);
        c6723j.m31047Y();
    }

    /* renamed from: U */
    public static int m31045U(List list, long[] jArr, int i10) {
        if (jArr != null && list != null) {
            for (int i11 = 0; i11 < list.size(); i11++) {
                for (long j10 : jArr) {
                    if (j10 == ((MediaTrack) list.get(i11)).m13082R()) {
                        return i11;
                    }
                }
            }
        }
        return i10;
    }

    /* renamed from: X */
    public static ArrayList m31046X(List list, int i10) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MediaTrack mediaTrack = (MediaTrack) it.next();
            if (mediaTrack.m13087W() == i10) {
                arrayList.add(mediaTrack);
            }
        }
        return arrayList;
    }

    /* renamed from: Y */
    public final void m31047Y() {
        Dialog dialog = this.f35178v;
        if (dialog != null) {
            dialog.cancel();
            this.f35178v = null;
        }
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0414d, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f35174r = true;
        this.f35176t = new ArrayList();
        this.f35175s = new ArrayList();
        this.f35177u = new long[0];
        C5947e m29358c = C5938b.m29235e(getContext()).m29243c().m29358c();
        if (m29358c == null || !m29358c.m29348c()) {
            this.f35174r = false;
            return;
        }
        C6721i m29290r = m29358c.m29290r();
        this.f35179w = m29290r;
        if (m29290r == null || !m29290r.m31020p() || this.f35179w.m31009j() == null) {
            this.f35174r = false;
            return;
        }
        C6721i c6721i = this.f35179w;
        long[] jArr = this.f35181y;
        if (jArr != null) {
            this.f35177u = jArr;
        } else {
            C5797q m31012l = c6721i.m31012l();
            if (m31012l != null) {
                this.f35177u = m31012l.m28304P();
            }
        }
        MediaInfo mediaInfo = this.f35180x;
        if (mediaInfo == null) {
            mediaInfo = c6721i.m31009j();
        }
        if (mediaInfo == null) {
            this.f35174r = false;
            return;
        }
        List<MediaTrack> m13064X = mediaInfo.m13064X();
        if (m13064X == null) {
            this.f35174r = false;
            return;
        }
        this.f35176t = m31046X(m13064X, 2);
        ArrayList m31046X = m31046X(m13064X, 1);
        this.f35175s = m31046X;
        if (m31046X.isEmpty()) {
            return;
        }
        List list = this.f35175s;
        MediaTrack.C2410a c2410a = new MediaTrack.C2410a(-1L, 1);
        c2410a.m13091c(getActivity().getString(C5980p.f33543A));
        c2410a.m13092d(2);
        c2410a.m13090b("");
        list.add(0, c2410a.m13089a());
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0414d, androidx.fragment.app.Fragment
    public void onDestroyView() {
        Dialog m2027u = m2027u();
        if (m2027u != null && getRetainInstance()) {
            m2027u.setDismissMessage(null);
        }
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0414d
    /* renamed from: x */
    public Dialog mo2029x(Bundle bundle) {
        int m31045U = m31045U(this.f35175s, this.f35177u, 0);
        int m31045U2 = m31045U(this.f35176t, this.f35177u, -1);
        ViewOnClickListenerC6744t0 viewOnClickListenerC6744t0 = new ViewOnClickListenerC6744t0(getActivity(), this.f35175s, m31045U);
        ViewOnClickListenerC6744t0 viewOnClickListenerC6744t02 = new ViewOnClickListenerC6744t0(getActivity(), this.f35176t, m31045U2);
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        View inflate = getActivity().getLayoutInflater().inflate(C5977o.f33541d, (ViewGroup) null);
        int i10 = C5974n.f33509b0;
        ListView listView = (ListView) inflate.findViewById(i10);
        int i11 = C5974n.f33519h;
        ListView listView2 = (ListView) inflate.findViewById(i11);
        TabHost tabHost = (TabHost) inflate.findViewById(C5974n.f33505Z);
        tabHost.setup();
        if (viewOnClickListenerC6744t0.getCount() == 0) {
            listView.setVisibility(4);
        } else {
            listView.setAdapter((ListAdapter) viewOnClickListenerC6744t0);
            TabHost.TabSpec newTabSpec = tabHost.newTabSpec("textTab");
            newTabSpec.setContent(i10);
            newTabSpec.setIndicator(getActivity().getString(C5980p.f33545C));
            tabHost.addTab(newTabSpec);
        }
        if (viewOnClickListenerC6744t02.getCount() <= 1) {
            listView2.setVisibility(4);
        } else {
            listView2.setAdapter((ListAdapter) viewOnClickListenerC6744t02);
            TabHost.TabSpec newTabSpec2 = tabHost.newTabSpec("audioTab");
            newTabSpec2.setContent(i11);
            newTabSpec2.setIndicator(getActivity().getString(C5980p.f33571w));
            tabHost.addTab(newTabSpec2);
        }
        builder.setView(inflate).setPositiveButton(getActivity().getString(C5980p.f33544B), new DialogInterfaceOnClickListenerC6738q0(this, viewOnClickListenerC6744t0, viewOnClickListenerC6744t02)).setNegativeButton(C5980p.f33572x, new DialogInterfaceOnClickListenerC6736p0(this));
        Dialog dialog = this.f35178v;
        if (dialog != null) {
            dialog.cancel();
            this.f35178v = null;
        }
        AlertDialog create = builder.create();
        this.f35178v = create;
        return create;
    }
}
