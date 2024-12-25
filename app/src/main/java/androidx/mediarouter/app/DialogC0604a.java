package androidx.mediarouter.app;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import p049d.DialogC4281g;
import p068e.C4561b;
import p192l1.C5645a;
import p192l1.C5650f;
import p192l1.C5653i;
import p208m1.C5900i;
import p208m1.C5901j;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/mediarouter/app/a.class
 */
/* renamed from: androidx.mediarouter.app.a */
/* loaded from: combined.jar:classes1.jar:androidx/mediarouter/app/a.class */
public class DialogC0604a extends DialogC4281g {

    /* renamed from: d */
    public final C5901j f3883d;

    /* renamed from: e */
    public final b f3884e;

    /* renamed from: f */
    public TextView f3885f;

    /* renamed from: g */
    public C5900i f3886g;

    /* renamed from: h */
    public ArrayList<C5901j.h> f3887h;

    /* renamed from: i */
    public c f3888i;

    /* renamed from: j */
    public ListView f3889j;

    /* renamed from: k */
    public boolean f3890k;

    /* renamed from: l */
    public long f3891l;

    /* renamed from: m */
    public final Handler f3892m;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/mediarouter/app/a$a.class
     */
    /* renamed from: androidx.mediarouter.app.a$a */
    /* loaded from: combined.jar:classes1.jar:androidx/mediarouter/app/a$a.class */
    public class a extends Handler {

        /* renamed from: a */
        public final DialogC0604a f3893a;

        public a(DialogC0604a dialogC0604a) {
            this.f3893a = dialogC0604a;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what != 1) {
                return;
            }
            this.f3893a.m3279k((List) message.obj);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/mediarouter/app/a$b.class
     */
    /* renamed from: androidx.mediarouter.app.a$b */
    /* loaded from: combined.jar:classes1.jar:androidx/mediarouter/app/a$b.class */
    public final class b extends C5901j.a {

        /* renamed from: a */
        public final DialogC0604a f3894a;

        public b(DialogC0604a dialogC0604a) {
            this.f3894a = dialogC0604a;
        }

        @Override // p208m1.C5901j.a
        /* renamed from: d */
        public void mo3234d(C5901j c5901j, C5901j.h hVar) {
            this.f3894a.mo3276h();
        }

        @Override // p208m1.C5901j.a
        /* renamed from: e */
        public void mo3235e(C5901j c5901j, C5901j.h hVar) {
            this.f3894a.mo3276h();
        }

        @Override // p208m1.C5901j.a
        /* renamed from: g */
        public void mo3236g(C5901j c5901j, C5901j.h hVar) {
            this.f3894a.mo3276h();
        }

        @Override // p208m1.C5901j.a
        /* renamed from: h */
        public void mo3250h(C5901j c5901j, C5901j.h hVar) {
            this.f3894a.dismiss();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/mediarouter/app/a$c.class
     */
    /* renamed from: androidx.mediarouter.app.a$c */
    /* loaded from: combined.jar:classes1.jar:androidx/mediarouter/app/a$c.class */
    public static final class c extends ArrayAdapter<C5901j.h> implements AdapterView.OnItemClickListener {

        /* renamed from: b */
        public final LayoutInflater f3895b;

        /* renamed from: c */
        public final Drawable f3896c;

        /* renamed from: d */
        public final Drawable f3897d;

        /* renamed from: e */
        public final Drawable f3898e;

        /* renamed from: f */
        public final Drawable f3899f;

        public c(Context context, List<C5901j.h> list) {
            super(context, 0, list);
            this.f3895b = LayoutInflater.from(context);
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{C5645a.f31780b, C5645a.f31787i, C5645a.f31784f, C5645a.f31783e});
            this.f3896c = C4561b.m22999d(context, obtainStyledAttributes.getResourceId(0, 0));
            this.f3897d = C4561b.m22999d(context, obtainStyledAttributes.getResourceId(1, 0));
            this.f3898e = C4561b.m22999d(context, obtainStyledAttributes.getResourceId(2, 0));
            this.f3899f = C4561b.m22999d(context, obtainStyledAttributes.getResourceId(3, 0));
            obtainStyledAttributes.recycle();
        }

        /* renamed from: a */
        public final Drawable m3280a(C5901j.h hVar) {
            int m28990f = hVar.m28990f();
            return m28990f != 1 ? m28990f != 2 ? hVar.m29009y() ? this.f3899f : this.f3896c : this.f3898e : this.f3897d;
        }

        @Override // android.widget.BaseAdapter, android.widget.ListAdapter
        public boolean areAllItemsEnabled() {
            return false;
        }

        /* renamed from: b */
        public final Drawable m3281b(C5901j.h hVar) {
            Uri m28994j = hVar.m28994j();
            if (m28994j != null) {
                try {
                    Drawable createFromStream = Drawable.createFromStream(getContext().getContentResolver().openInputStream(m28994j), null);
                    if (createFromStream != null) {
                        return createFromStream;
                    }
                } catch (IOException e10) {
                    Log.w("MediaRouteChooserDialog", "Failed to load " + m28994j, e10);
                }
            }
            return m3280a(hVar);
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public View getView(int i10, View view, ViewGroup viewGroup) {
            View view2 = view;
            if (view == null) {
                view2 = this.f3895b.inflate(C5653i.f31874g, viewGroup, false);
            }
            C5901j.h hVar = (C5901j.h) getItem(i10);
            TextView textView = (TextView) view2.findViewById(C5650f.f31858x);
            TextView textView2 = (TextView) view2.findViewById(C5650f.f31856v);
            textView.setText(hVar.m28997m());
            String m28988d = hVar.m28988d();
            boolean z10 = true;
            if (hVar.m28987c() != 2) {
                z10 = hVar.m28987c() == 1;
            }
            if (!z10 || TextUtils.isEmpty(m28988d)) {
                textView.setGravity(16);
                textView2.setVisibility(8);
                textView2.setText("");
            } else {
                textView.setGravity(80);
                textView2.setVisibility(0);
                textView2.setText(m28988d);
            }
            view2.setEnabled(hVar.m29008x());
            ImageView imageView = (ImageView) view2.findViewById(C5650f.f31857w);
            if (imageView != null) {
                imageView.setImageDrawable(m3281b(hVar));
            }
            return view2;
        }

        @Override // android.widget.BaseAdapter, android.widget.ListAdapter
        public boolean isEnabled(int i10) {
            return ((C5901j.h) getItem(i10)).m29008x();
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
            C5901j.h hVar = (C5901j.h) getItem(i10);
            if (hVar.m29008x()) {
                ImageView imageView = (ImageView) view.findViewById(C5650f.f31857w);
                ProgressBar progressBar = (ProgressBar) view.findViewById(C5650f.f31859y);
                if (imageView != null && progressBar != null) {
                    imageView.setVisibility(8);
                    progressBar.setVisibility(0);
                }
                hVar.m28981I();
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/mediarouter/app/a$d.class
     */
    /* renamed from: androidx.mediarouter.app.a$d */
    /* loaded from: combined.jar:classes1.jar:androidx/mediarouter/app/a$d.class */
    public static final class d implements Comparator<C5901j.h> {

        /* renamed from: b */
        public static final d f3900b = new d();

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(C5901j.h hVar, C5901j.h hVar2) {
            return hVar.m28997m().compareToIgnoreCase(hVar2.m28997m());
        }
    }

    public DialogC0604a(Context context) {
        this(context, 0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public DialogC0604a(android.content.Context r6, int r7) {
        /*
            r5 = this;
            r0 = r6
            r1 = r7
            r2 = 0
            android.content.Context r0 = androidx.mediarouter.app.C0612i.m3408b(r0, r1, r2)
            r6 = r0
            r0 = r5
            r1 = r6
            r2 = r6
            int r2 = androidx.mediarouter.app.C0612i.m3409c(r2)
            r0.<init>(r1, r2)
            r0 = r5
            m1.i r1 = p208m1.C5900i.f33081c
            r0.f3886g = r1
            r0 = r5
            androidx.mediarouter.app.a$a r1 = new androidx.mediarouter.app.a$a
            r2 = r1
            r3 = r5
            r2.<init>(r3)
            r0.f3892m = r1
            r0 = r5
            r1 = r5
            android.content.Context r1 = r1.getContext()
            m1.j r1 = p208m1.C5901j.m28867j(r1)
            r0.f3883d = r1
            r0 = r5
            androidx.mediarouter.app.a$b r1 = new androidx.mediarouter.app.a$b
            r2 = r1
            r3 = r5
            r2.<init>(r3)
            r0.f3884e = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.mediarouter.app.DialogC0604a.<init>(android.content.Context, int):void");
    }

    /* renamed from: e */
    public boolean m3274e(C5901j.h hVar) {
        return !hVar.m29007w() && hVar.m29008x() && hVar.m28977E(this.f3886g);
    }

    /* renamed from: f */
    public void m3275f(List<C5901j.h> list) {
        int size = list.size();
        while (true) {
            int i10 = size;
            int i11 = i10 - 1;
            if (i10 <= 0) {
                return;
            }
            if (!m3274e(list.get(i11))) {
                list.remove(i11);
            }
            size = i11;
        }
    }

    /* renamed from: h */
    public void mo3276h() {
        if (this.f3890k) {
            ArrayList arrayList = new ArrayList(this.f3883d.m28879m());
            m3275f(arrayList);
            Collections.sort(arrayList, d.f3900b);
            if (SystemClock.uptimeMillis() - this.f3891l >= 300) {
                m3279k(arrayList);
                return;
            }
            this.f3892m.removeMessages(1);
            Handler handler = this.f3892m;
            handler.sendMessageAtTime(handler.obtainMessage(1, arrayList), this.f3891l + 300);
        }
    }

    /* renamed from: i */
    public void mo3277i(C5900i c5900i) {
        if (c5900i == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        if (this.f3886g.equals(c5900i)) {
            return;
        }
        this.f3886g = c5900i;
        if (this.f3890k) {
            this.f3883d.m28882s(this.f3884e);
            this.f3883d.m28872b(c5900i, this.f3884e, 1);
        }
        mo3276h();
    }

    /* renamed from: j */
    public void m3278j() {
        getWindow().setLayout(C0609f.m3339b(getContext()), -2);
    }

    /* renamed from: k */
    public void m3279k(List<C5901j.h> list) {
        this.f3891l = SystemClock.uptimeMillis();
        this.f3887h.clear();
        this.f3887h.addAll(list);
        this.f3888i.notifyDataSetChanged();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f3890k = true;
        this.f3883d.m28872b(this.f3886g, this.f3884e, 1);
        mo3276h();
    }

    @Override // p049d.DialogC4281g, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C5653i.f31873f);
        this.f3887h = new ArrayList<>();
        this.f3888i = new c(getContext(), this.f3887h);
        ListView listView = (ListView) findViewById(C5650f.f31855u);
        this.f3889j = listView;
        listView.setAdapter((ListAdapter) this.f3888i);
        this.f3889j.setOnItemClickListener(this.f3888i);
        this.f3889j.setEmptyView(findViewById(R.id.empty));
        this.f3885f = (TextView) findViewById(C5650f.f31860z);
        m3278j();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onDetachedFromWindow() {
        this.f3890k = false;
        this.f3883d.m28882s(this.f3884e);
        this.f3892m.removeMessages(1);
        super.onDetachedFromWindow();
    }

    @Override // p049d.DialogC4281g, android.app.Dialog
    public void setTitle(int i10) {
        this.f3885f.setText(i10);
    }

    @Override // p049d.DialogC4281g, android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        this.f3885f.setText(charSequence);
    }
}
