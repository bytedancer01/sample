package androidx.appcompat.view.menu;

import android.content.DialogInterface;
import android.os.IBinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.appcompat.app.DialogC0242a;
import androidx.appcompat.view.menu.InterfaceC0254i;
import p029c.C0926g;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/appcompat/view/menu/f.class
 */
/* renamed from: androidx.appcompat.view.menu.f */
/* loaded from: combined.jar:classes1.jar:androidx/appcompat/view/menu/f.class */
public class DialogInterfaceOnKeyListenerC0251f implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, InterfaceC0254i.a {

    /* renamed from: b */
    public C0250e f1607b;

    /* renamed from: c */
    public DialogC0242a f1608c;

    /* renamed from: d */
    public C0248c f1609d;

    /* renamed from: e */
    public InterfaceC0254i.a f1610e;

    public DialogInterfaceOnKeyListenerC0251f(C0250e c0250e) {
        this.f1607b = c0250e;
    }

    /* renamed from: a */
    public void m1005a() {
        DialogC0242a dialogC0242a = this.f1608c;
        if (dialogC0242a != null) {
            dialogC0242a.dismiss();
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0254i.a
    /* renamed from: b */
    public void mo1006b(C0250e c0250e, boolean z10) {
        if (z10 || c0250e == this.f1607b) {
            m1005a();
        }
        InterfaceC0254i.a aVar = this.f1610e;
        if (aVar != null) {
            aVar.mo1006b(c0250e, z10);
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0254i.a
    /* renamed from: c */
    public boolean mo1007c(C0250e c0250e) {
        InterfaceC0254i.a aVar = this.f1610e;
        if (aVar != null) {
            return aVar.mo1007c(c0250e);
        }
        return false;
    }

    /* renamed from: d */
    public void m1008d(IBinder iBinder) {
        C0250e c0250e = this.f1607b;
        DialogC0242a.a aVar = new DialogC0242a.a(c0250e.m997u());
        C0248c c0248c = new C0248c(aVar.getContext(), C0926g.f6252j);
        this.f1609d = c0248c;
        c0248c.mo904d(this);
        this.f1607b.m976b(this.f1609d);
        aVar.m853a(this.f1609d.m939a(), this);
        View m1001y = c0250e.m1001y();
        if (m1001y != null) {
            aVar.m854b(m1001y);
        } else {
            aVar.m856d(c0250e.m999w()).setTitle(c0250e.m1000x());
        }
        aVar.m860h(this);
        DialogC0242a create = aVar.create();
        this.f1608c = create;
        create.setOnDismissListener(this);
        WindowManager.LayoutParams attributes = this.f1608c.getWindow().getAttributes();
        attributes.type = 1003;
        if (iBinder != null) {
            attributes.token = iBinder;
        }
        attributes.flags |= 131072;
        this.f1608c.show();
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i10) {
        this.f1607b.m959L((C0252g) this.f1609d.m939a().getItem(i10), 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        this.f1609d.mo902b(this.f1607b, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public boolean onKey(DialogInterface dialogInterface, int i10, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i10 == 82 || i10 == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f1608c.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f1608c.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.f1607b.m982e(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.f1607b.performShortcut(i10, keyEvent, 0);
    }
}
