package ma;

import android.R;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.mediarouter.app.DialogC0604a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p192l1.C5650f;
import p208m1.C5900i;
import p208m1.C5901j;
import p216m9.C5938b;
import p216m9.C5974n;
import p216m9.C5977o;
import p216m9.C5980p;
import p304r9.C8015b;
import p422y9.C9935o;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ma/sj.class
 */
/* renamed from: ma.sj */
/* loaded from: combined.jar:classes2.jar:ma/sj.class */
public final class ViewTreeObserverOnGlobalLayoutListenerC6403sj extends DialogC0604a implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: F */
    public static final C8015b f34037F = new C8015b("DeviceChooserDialog");

    /* renamed from: A */
    public View f34038A;

    /* renamed from: B */
    public LinearLayout f34039B;

    /* renamed from: C */
    public LinearLayout f34040C;

    /* renamed from: D */
    public LinearLayout f34041D;

    /* renamed from: E */
    public RelativeLayout f34042E;

    /* renamed from: n */
    public final C6361qj f34043n;

    /* renamed from: o */
    public final List f34044o;

    /* renamed from: p */
    public final long f34045p;

    /* renamed from: q */
    public final boolean f34046q;

    /* renamed from: r */
    public C5901j f34047r;

    /* renamed from: s */
    public HandlerC6385s1 f34048s;

    /* renamed from: t */
    public C5900i f34049t;

    /* renamed from: u */
    public ArrayAdapter f34050u;

    /* renamed from: v */
    public boolean f34051v;

    /* renamed from: w */
    public Runnable f34052w;

    /* renamed from: x */
    public C5901j.h f34053x;

    /* renamed from: y */
    public TextView f34054y;

    /* renamed from: z */
    public ListView f34055z;

    public ViewTreeObserverOnGlobalLayoutListenerC6403sj(Context context, int i10) {
        super(context, 0);
        this.f34044o = new CopyOnWriteArrayList();
        this.f34049t = C5900i.f33081c;
        this.f34043n = new C6361qj(this);
        this.f34045p = C6068d.m29514a();
        this.f34046q = C6068d.m29516c();
    }

    @Override // p049d.DialogC4281g, android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        HandlerC6385s1 handlerC6385s1 = this.f34048s;
        if (handlerC6385s1 != null) {
            handlerC6385s1.removeCallbacks(this.f34052w);
        }
        View view = this.f34038A;
        if (view != null) {
            view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
        Iterator it = this.f34044o.iterator();
        while (it.hasNext()) {
            ((C6151gj) it.next()).mo29651b(this.f34053x);
        }
        this.f34044o.clear();
    }

    @Override // androidx.mediarouter.app.DialogC0604a
    /* renamed from: h */
    public final void mo3276h() {
        super.mo3276h();
        m30028q();
    }

    @Override // androidx.mediarouter.app.DialogC0604a
    /* renamed from: i */
    public final void mo3277i(C5900i c5900i) {
        if (c5900i == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        super.mo3277i(c5900i);
        if (this.f34049t.equals(c5900i)) {
            return;
        }
        this.f34049t = c5900i;
        m30030t();
        if (this.f34051v) {
            m30029r();
        }
        m30028q();
    }

    /* renamed from: o */
    public final /* synthetic */ void m30026o() {
        m30031u(2);
        for (C6151gj c6151gj : this.f34044o) {
        }
    }

    @Override // androidx.mediarouter.app.DialogC0604a, android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f34051v = true;
        m30029r();
        m30028q();
    }

    @Override // androidx.mediarouter.app.DialogC0604a, p049d.DialogC4281g, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ListView listView = (ListView) super.findViewById(C5650f.f31855u);
        if (listView == null) {
            return;
        }
        setContentView(C5977o.f33538a);
        this.f34050u = (ArrayAdapter) listView.getAdapter();
        ListView listView2 = (ListView) findViewById(C5974n.f33480A);
        this.f34055z = listView2;
        if (listView2 != null) {
            listView2.setAdapter((ListAdapter) this.f34050u);
            this.f34055z.setOnItemClickListener(listView.getOnItemClickListener());
        }
        this.f34054y = (TextView) findViewById(C5974n.f33482C);
        this.f34039B = (LinearLayout) findViewById(C5974n.f33481B);
        this.f34040C = (LinearLayout) findViewById(C5974n.f33485F);
        this.f34041D = (LinearLayout) findViewById(C5974n.f33483D);
        this.f34042E = (RelativeLayout) findViewById(C5974n.f33493N);
        TextView textView = (TextView) findViewById(C5974n.f33537z);
        TextView textView2 = (TextView) findViewById(C5974n.f33484E);
        ViewOnClickListenerC6107eh viewOnClickListenerC6107eh = new ViewOnClickListenerC6107eh(this);
        if (textView != null) {
            textView.setMovementMethod(LinkMovementMethod.getInstance());
            textView.setOnClickListener(viewOnClickListenerC6107eh);
        }
        if (textView2 != null) {
            textView2.setMovementMethod(LinkMovementMethod.getInstance());
            textView2.setOnClickListener(viewOnClickListenerC6107eh);
        }
        Button button = (Button) findViewById(C5974n.f33490K);
        if (button != null) {
            button.setOnClickListener(new ViewOnClickListenerC6129fi(this));
        }
        View findViewById = findViewById(R.id.empty);
        this.f34038A = findViewById;
        if (this.f34055z != null && findViewById != null) {
            ((View) C9935o.m41850j(findViewById)).getViewTreeObserver().addOnGlobalLayoutListener(this);
            ((ListView) C9935o.m41850j(this.f34055z)).setEmptyView((View) C9935o.m41850j(this.f34038A));
        }
        this.f34052w = new Runnable(this) { // from class: ma.gg

            /* renamed from: b */
            public final ViewTreeObserverOnGlobalLayoutListenerC6403sj f33791b;

            {
                this.f33791b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f33791b.m30026o();
            }
        };
    }

    @Override // androidx.mediarouter.app.DialogC0604a, android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.f34051v = false;
        super.onDetachedFromWindow();
        m30030t();
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        View view = this.f34038A;
        if (view == null) {
            return;
        }
        Object tag = view.getTag();
        int visibility = this.f34038A.getVisibility();
        if (tag == null || ((Integer) tag).intValue() != visibility) {
            if (visibility == 0) {
                m30031u(1);
                HandlerC6385s1 handlerC6385s1 = this.f34048s;
                if (handlerC6385s1 != null) {
                    handlerC6385s1.removeCallbacks(this.f34052w);
                    this.f34048s.postDelayed(this.f34052w, this.f34045p);
                }
            } else {
                setTitle(C5980p.f33553e);
            }
            ((View) C9935o.m41850j(this.f34038A)).setTag(Integer.valueOf(visibility));
        }
    }

    /* renamed from: p */
    public final void m30027p() {
        this.f34047r = C5901j.m28867j(getContext());
        this.f34048s = new HandlerC6385s1(Looper.getMainLooper());
        C6151gj m30005a = C6396sc.m30005a();
        if (m30005a != null) {
            this.f34044o.add(m30005a);
        }
    }

    /* renamed from: q */
    public final void m30028q() {
        C5901j c5901j = this.f34047r;
        if (c5901j != null) {
            ArrayList arrayList = new ArrayList(c5901j.m28879m());
            m3275f(arrayList);
            Collections.sort(arrayList, C6382rj.f34002b);
            Iterator it = this.f34044o.iterator();
            while (it.hasNext()) {
                ((C6151gj) it.next()).mo29650a(arrayList);
            }
        }
    }

    /* renamed from: r */
    public final void m30029r() {
        C8015b c8015b = f34037F;
        c8015b.m34873a("startDiscovery", new Object[0]);
        C5901j c5901j = this.f34047r;
        if (c5901j == null) {
            c8015b.m34873a("Can't start discovery. setUpMediaRouter needs to be called first", new Object[0]);
            return;
        }
        c5901j.m28872b(this.f34049t, this.f34043n, 1);
        Iterator it = this.f34044o.iterator();
        while (it.hasNext()) {
            ((C6151gj) it.next()).mo29652c(1);
        }
    }

    @Override // androidx.mediarouter.app.DialogC0604a, p049d.DialogC4281g, android.app.Dialog
    public final void setTitle(int i10) {
        TextView textView = this.f34054y;
        if (textView != null) {
            textView.setText(i10);
        }
    }

    @Override // androidx.mediarouter.app.DialogC0604a, p049d.DialogC4281g, android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        TextView textView = this.f34054y;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* renamed from: t */
    public final void m30030t() {
        C8015b c8015b = f34037F;
        c8015b.m34873a("stopDiscovery", new Object[0]);
        C5901j c5901j = this.f34047r;
        if (c5901j == null) {
            c8015b.m34873a("Can't stop discovery. setUpMediaRouter needs to be called first", new Object[0]);
            return;
        }
        c5901j.m28882s(this.f34043n);
        this.f34047r.m28872b(this.f34049t, this.f34043n, 0);
        Iterator it = this.f34044o.iterator();
        while (it.hasNext()) {
            ((C6151gj) it.next()).mo29653d();
        }
    }

    /* renamed from: u */
    public final void m30031u(int i10) {
        if (this.f34039B == null || this.f34040C == null || this.f34041D == null || this.f34042E == null) {
            return;
        }
        C5938b m29234d = C5938b.m29234d();
        int i11 = i10;
        if (this.f34046q) {
            i11 = i10;
            if (m29234d != null) {
                i11 = i10;
                if (!m29234d.m29246k().m29770a()) {
                    i11 = 3;
                }
            }
        }
        int i12 = i11 - 1;
        if (i12 == 0) {
            setTitle(C5980p.f33553e);
            ((LinearLayout) C9935o.m41850j(this.f34039B)).setVisibility(0);
            ((LinearLayout) C9935o.m41850j(this.f34040C)).setVisibility(8);
            ((LinearLayout) C9935o.m41850j(this.f34041D)).setVisibility(8);
            ((RelativeLayout) C9935o.m41850j(this.f34042E)).setVisibility(8);
            return;
        }
        if (i12 != 1) {
            setTitle(C5980p.f33547E);
            ((LinearLayout) C9935o.m41850j(this.f34039B)).setVisibility(8);
            ((LinearLayout) C9935o.m41850j(this.f34040C)).setVisibility(8);
            ((LinearLayout) C9935o.m41850j(this.f34041D)).setVisibility(0);
            ((RelativeLayout) C9935o.m41850j(this.f34042E)).setVisibility(0);
            return;
        }
        setTitle(C5980p.f33553e);
        ((LinearLayout) C9935o.m41850j(this.f34039B)).setVisibility(8);
        ((LinearLayout) C9935o.m41850j(this.f34040C)).setVisibility(0);
        ((LinearLayout) C9935o.m41850j(this.f34041D)).setVisibility(8);
        ((RelativeLayout) C9935o.m41850j(this.f34042E)).setVisibility(0);
    }
}
