package p157j1;

import android.support.v4.media.session.MediaSessionCompat;
import android.widget.RemoteViews;
import p030c0.C0964r;
import p030c0.InterfaceC0962q;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:j1/b.class
 */
/* renamed from: j1.b */
/* loaded from: combined.jar:classes1.jar:j1/b.class */
public class C5278b extends C0964r.h {

    /* renamed from: e */
    public int[] f30318e = null;

    /* renamed from: f */
    public MediaSessionCompat.Token f30319f;

    @Override // p030c0.C0964r.h
    /* renamed from: b */
    public void mo5749b(InterfaceC0962q interfaceC0962q) {
        C5277a.m26357d(interfaceC0962q.getBuilder(), C5277a.m26355b(C5277a.m26354a(), this.f30318e, this.f30319f));
    }

    @Override // p030c0.C0964r.h
    /* renamed from: d */
    public RemoteViews mo5799d(InterfaceC0962q interfaceC0962q) {
        return null;
    }

    @Override // p030c0.C0964r.h
    /* renamed from: e */
    public RemoteViews mo5800e(InterfaceC0962q interfaceC0962q) {
        return null;
    }

    /* renamed from: h */
    public C5278b m26359h(MediaSessionCompat.Token token) {
        this.f30319f = token;
        return this;
    }

    /* renamed from: i */
    public C5278b m26360i(int... iArr) {
        this.f30318e = iArr;
        return this;
    }
}
