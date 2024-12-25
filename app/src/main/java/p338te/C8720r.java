package p338te;

import android.content.Context;
import android.view.OrientationEventListener;
import android.view.WindowManager;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:te/r.class
 */
/* renamed from: te.r */
/* loaded from: combined.jar:classes2.jar:te/r.class */
public class C8720r {

    /* renamed from: a */
    public int f40521a;

    /* renamed from: b */
    public WindowManager f40522b;

    /* renamed from: c */
    public OrientationEventListener f40523c;

    /* renamed from: d */
    public InterfaceC8719q f40524d;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:te/r$a.class
     */
    /* renamed from: te.r$a */
    /* loaded from: combined.jar:classes2.jar:te/r$a.class */
    public class a extends OrientationEventListener {

        /* renamed from: a */
        public final C8720r f40525a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C8720r c8720r, Context context, int i10) {
            super(context, i10);
            this.f40525a = c8720r;
        }

        @Override // android.view.OrientationEventListener
        public void onOrientationChanged(int i10) {
            int rotation;
            WindowManager windowManager = this.f40525a.f40522b;
            InterfaceC8719q interfaceC8719q = this.f40525a.f40524d;
            if (this.f40525a.f40522b == null || interfaceC8719q == null || (rotation = windowManager.getDefaultDisplay().getRotation()) == this.f40525a.f40521a) {
                return;
            }
            this.f40525a.f40521a = rotation;
            interfaceC8719q.mo14449a(rotation);
        }
    }

    /* renamed from: e */
    public void m37262e(Context context, InterfaceC8719q interfaceC8719q) {
        m37263f();
        Context applicationContext = context.getApplicationContext();
        this.f40524d = interfaceC8719q;
        this.f40522b = (WindowManager) applicationContext.getSystemService("window");
        a aVar = new a(this, applicationContext, 3);
        this.f40523c = aVar;
        aVar.enable();
        this.f40521a = this.f40522b.getDefaultDisplay().getRotation();
    }

    /* renamed from: f */
    public void m37263f() {
        OrientationEventListener orientationEventListener = this.f40523c;
        if (orientationEventListener != null) {
            orientationEventListener.disable();
        }
        this.f40523c = null;
        this.f40522b = null;
        this.f40524d = null;
    }
}
