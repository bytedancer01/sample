package p218mf;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.content.Context;
import java.util.List;
import p059d9.C4357d0;
import p059d9.C4401z0;
import p420y7.AbstractServiceC9875y;
import p420y7.C9849e;
import p420y7.C9870t;
import p420y7.C9872v;
import p439z7.C10065a;
import p439z7.C10067c;
import p440z8.C10085g;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:mf/a.class
 */
/* renamed from: mf.a */
/* loaded from: combined.jar:classes2.jar:mf/a.class */
public class ServiceC6587a extends AbstractServiceC9875y {

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:mf/a$a.class
     */
    /* renamed from: mf.a$a */
    /* loaded from: combined.jar:classes2.jar:mf/a$a.class */
    public static final class a implements C9870t.d {

        /* renamed from: a */
        public final Context f34434a;

        /* renamed from: b */
        public final C10085g f34435b;

        /* renamed from: c */
        public int f34436c;

        public a(Context context, C10085g c10085g, int i10) {
            this.f34434a = context.getApplicationContext();
            this.f34435b = c10085g;
            this.f34436c = i10;
        }

        @Override // p420y7.C9870t.d
        /* renamed from: a */
        public void mo18030a(C9870t c9870t, C9849e c9849e, Exception exc) {
            Notification m42409b;
            int i10 = c9849e.f45183b;
            if (i10 == 3) {
                m42409b = this.f34435b.m42408a(this.f34434a, 2131231131, null, C4401z0.m22323F(c9849e.f45182a.f45315h));
            } else if (i10 != 4) {
                return;
            } else {
                m42409b = this.f34435b.m42409b(this.f34434a, 2131231131, null, C4401z0.m22323F(c9849e.f45182a.f45315h));
            }
            Context context = this.f34434a;
            int i11 = this.f34436c;
            this.f34436c = i11 + 1;
            C4357d0.m21939b(context, i11, m42409b);
        }

        @Override // p420y7.C9870t.d
        /* renamed from: b */
        public /* synthetic */ void mo18031b(C9870t c9870t, C10067c c10067c, int i10) {
            C9872v.m41532e(this, c9870t, c10067c, i10);
        }

        @Override // p420y7.C9870t.d
        /* renamed from: c */
        public /* synthetic */ void mo18032c(C9870t c9870t, boolean z10) {
            C9872v.m41533f(this, c9870t, z10);
        }

        @Override // p420y7.C9870t.d
        /* renamed from: d */
        public /* synthetic */ void mo18033d(C9870t c9870t, C9849e c9849e) {
            C9872v.m41528a(this, c9870t, c9849e);
        }

        @Override // p420y7.C9870t.d
        /* renamed from: e */
        public /* synthetic */ void mo18034e(C9870t c9870t, boolean z10) {
            C9872v.m41529b(this, c9870t, z10);
        }

        @Override // p420y7.C9870t.d
        /* renamed from: f */
        public /* synthetic */ void mo18035f(C9870t c9870t) {
            C9872v.m41530c(this, c9870t);
        }

        @Override // p420y7.C9870t.d
        /* renamed from: g */
        public /* synthetic */ void mo18036g(C9870t c9870t) {
            C9872v.m41531d(this, c9870t);
        }
    }

    public ServiceC6587a() {
        super(1, 1000L, "download_channel", 2132017730, 0);
    }

    @Override // p420y7.AbstractServiceC9875y
    @SuppressLint({"MissingPermission"})
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public C10065a mo30435p() {
        return C4401z0.f26679a >= 21 ? new C10065a(this, 1) : null;
    }

    @Override // p420y7.AbstractServiceC9875y
    /* renamed from: l */
    public C9870t mo30433l() {
        C9870t m30443h = C6588b.m30443h(this);
        m30443h.m41471d(new a(this, C6588b.m30444i(this), 2));
        return m30443h;
    }

    @Override // p420y7.AbstractServiceC9875y
    /* renamed from: m */
    public Notification mo30434m(List<C9849e> list) {
        return C6588b.m30444i(this).m42412e(this, 2131231199, null, null, list);
    }
}
