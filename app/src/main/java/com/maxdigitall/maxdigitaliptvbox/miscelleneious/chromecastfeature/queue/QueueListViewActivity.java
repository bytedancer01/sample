package com.maxdigitall.maxdigitaliptvbox.miscelleneious.chromecastfeature.queue;

import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.app.ActivityC0243b;
import androidx.appcompat.widget.Toolbar;
import gf.C5005c;
import java.util.List;
import p082ef.C4719b;
import p200l9.C5791o;
import p200l9.C5797q;
import p216m9.C5935a;
import p216m9.C5938b;
import p216m9.C5947e;
import p216m9.InterfaceC5993u;
import p230n9.C6721i;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/miscelleneious/chromecastfeature/queue/QueueListViewActivity.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/miscelleneious/chromecastfeature/queue/QueueListViewActivity.class */
public class QueueListViewActivity extends ActivityC0243b {

    /* renamed from: d */
    public final C6721i.a f16344d = new C2656b();

    /* renamed from: e */
    public final InterfaceC5993u<C5947e> f16345e = new C2657c();

    /* renamed from: f */
    public C5938b f16346f;

    /* renamed from: g */
    public C6721i f16347g;

    /* renamed from: h */
    public View f16348h;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/miscelleneious/chromecastfeature/queue/QueueListViewActivity$b.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.miscelleneious.chromecastfeature.queue.QueueListViewActivity$b */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/miscelleneious/chromecastfeature/queue/QueueListViewActivity$b.class */
    public class C2656b extends C6721i.a {

        /* renamed from: a */
        public final QueueListViewActivity f16349a;

        public C2656b(QueueListViewActivity queueListViewActivity) {
            this.f16349a = queueListViewActivity;
        }

        @Override // p230n9.C6721i.a
        /* renamed from: e */
        public void mo14732e() {
            m14734o();
        }

        @Override // p230n9.C6721i.a
        /* renamed from: g */
        public void mo14733g() {
            m14734o();
        }

        /* renamed from: o */
        public final void m14734o() {
            View view;
            int i10;
            C5797q m31012l = this.f16349a.f16347g.m31012l();
            List<C5791o> m28323i0 = m31012l == null ? null : m31012l.m28323i0();
            if (m28323i0 == null || m28323i0.isEmpty()) {
                view = this.f16349a.f16348h;
                i10 = 0;
            } else {
                view = this.f16349a.f16348h;
                i10 = 8;
            }
            view.setVisibility(i10);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/miscelleneious/chromecastfeature/queue/QueueListViewActivity$c.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.miscelleneious.chromecastfeature.queue.QueueListViewActivity$c */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/miscelleneious/chromecastfeature/queue/QueueListViewActivity$c.class */
    public class C2657c implements InterfaceC5993u<C5947e> {

        /* renamed from: a */
        public final QueueListViewActivity f16350a;

        public C2657c(QueueListViewActivity queueListViewActivity) {
            this.f16350a = queueListViewActivity;
        }

        @Override // p216m9.InterfaceC5993u
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void mo14735a(C5947e c5947e, int i10) {
            if (this.f16350a.f16347g != null) {
                this.f16350a.f16347g.m30986M(this.f16350a.f16344d);
            }
            this.f16350a.f16347g = null;
            this.f16350a.f16348h.setVisibility(0);
        }

        @Override // p216m9.InterfaceC5993u
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public void mo14736b(C5947e c5947e) {
        }

        @Override // p216m9.InterfaceC5993u
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public void mo14740f(C5947e c5947e, int i10) {
        }

        @Override // p216m9.InterfaceC5993u
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public void mo14744j(C5947e c5947e, boolean z10) {
            QueueListViewActivity queueListViewActivity = this.f16350a;
            queueListViewActivity.f16347g = queueListViewActivity.m14730v0();
            if (this.f16350a.f16347g != null) {
                this.f16350a.f16347g.m30986M(this.f16350a.f16344d);
            }
        }

        @Override // p216m9.InterfaceC5993u
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public void mo14746l(C5947e c5947e, String str) {
        }

        @Override // p216m9.InterfaceC5993u
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public void mo14748n(C5947e c5947e, int i10) {
        }

        @Override // p216m9.InterfaceC5993u
        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public void mo14738d(C5947e c5947e, String str) {
            QueueListViewActivity queueListViewActivity = this.f16350a;
            queueListViewActivity.f16347g = queueListViewActivity.m14730v0();
            if (this.f16350a.f16347g != null) {
                this.f16350a.f16347g.m30986M(this.f16350a.f16344d);
            }
        }

        @Override // p216m9.InterfaceC5993u
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public void mo14749o(C5947e c5947e) {
        }

        @Override // p216m9.InterfaceC5993u
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public void mo14739e(C5947e c5947e, int i10) {
            if (this.f16350a.f16347g != null) {
                this.f16350a.f16347g.m30996W(this.f16350a.f16344d);
            }
            this.f16350a.f16347g = null;
        }
    }

    @Override // androidx.appcompat.app.ActivityC0243b, p030c0.ActivityC0952l, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.f16346f.m29244f(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // androidx.fragment.app.ActivityC0416e, androidx.activity.ComponentActivity, p030c0.ActivityC0952l, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2131624487);
        Log.d("QueueListViewActivity", "onCreate() was called");
        C4719b.m23760n(this);
        C5938b.m29235e(this).m29243c().m29358c();
        if (bundle == null) {
            getSupportFragmentManager().m2216m().m2362c(2131427772, new C5005c(), "list view").mo1964j();
        }
        m14731w0();
        this.f16348h = findViewById(2131427886);
        this.f16346f = C5938b.m29235e(this);
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(2131689502, menu);
        C5935a.m29218a(getApplicationContext(), menu, 2131428635);
        return true;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == 16908332) {
            finish();
            return true;
        }
        if (itemId != 2131427408) {
            return true;
        }
        C4719b.m23760n(getApplicationContext()).m23775x();
        return true;
    }

    @Override // androidx.fragment.app.ActivityC0416e, android.app.Activity
    public void onPause() {
        C6721i c6721i = this.f16347g;
        if (c6721i != null) {
            c6721i.m30996W(this.f16344d);
        }
        this.f16346f.m29243c().m29360e(this.f16345e, C5947e.class);
        super.onPause();
    }

    @Override // androidx.fragment.app.ActivityC0416e, android.app.Activity
    public void onResume() {
        this.f16346f.m29243c().m29356a(this.f16345e, C5947e.class);
        if (this.f16347g == null) {
            this.f16347g = m14730v0();
        }
        C6721i c6721i = this.f16347g;
        if (c6721i != null) {
            c6721i.m30986M(this.f16344d);
            C5797q m31012l = this.f16347g.m31012l();
            List<C5791o> m28323i0 = m31012l == null ? null : m31012l.m28323i0();
            if (m28323i0 != null && !m28323i0.isEmpty()) {
                this.f16348h.setVisibility(8);
            }
        }
        super.onResume();
    }

    /* renamed from: v0 */
    public final C6721i m14730v0() {
        C5947e m29358c = this.f16346f.m29243c().m29358c();
        return (m29358c == null || !m29358c.m29348c()) ? null : m29358c.m29290r();
    }

    /* renamed from: w0 */
    public final void m14731w0() {
        Toolbar toolbar = (Toolbar) findViewById(2131429320);
        toolbar.setTitle(2132018428);
        m878n0(toolbar);
        m868f0().mo21521r(true);
    }
}
