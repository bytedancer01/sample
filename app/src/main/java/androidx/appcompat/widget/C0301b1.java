package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.transition.Transition;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.C0249d;
import androidx.appcompat.view.menu.C0250e;
import androidx.appcompat.view.menu.C0252g;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.lang.reflect.Method;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/appcompat/widget/b1.class
 */
/* renamed from: androidx.appcompat.widget.b1 */
/* loaded from: combined.jar:classes1.jar:androidx/appcompat/widget/b1.class */
public class C0301b1 extends C0363w0 implements InterfaceC0365x0 {

    /* renamed from: L */
    public static Method f1970L;

    /* renamed from: K */
    public InterfaceC0365x0 f1971K;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/appcompat/widget/b1$a.class
     */
    /* renamed from: androidx.appcompat.widget.b1$a */
    /* loaded from: combined.jar:classes1.jar:androidx/appcompat/widget/b1$a.class */
    public static class a extends C0342p0 {

        /* renamed from: p */
        public final int f1972p;

        /* renamed from: q */
        public final int f1973q;

        /* renamed from: r */
        public InterfaceC0365x0 f1974r;

        /* renamed from: s */
        public MenuItem f1975s;

        public a(Context context, boolean z10) {
            super(context, z10);
            if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
                this.f1972p = 21;
                this.f1973q = 22;
            } else {
                this.f1972p = 22;
                this.f1973q = 21;
            }
        }

        @Override // androidx.appcompat.widget.C0342p0
        /* renamed from: d */
        public /* bridge */ /* synthetic */ int mo1250d(int i10, int i11, int i12, int i13, int i14) {
            return super.mo1250d(i10, i11, i12, i13, i14);
        }

        @Override // androidx.appcompat.widget.C0342p0
        /* renamed from: e */
        public /* bridge */ /* synthetic */ boolean mo1251e(MotionEvent motionEvent, int i10) {
            return super.mo1251e(motionEvent, i10);
        }

        @Override // androidx.appcompat.widget.C0342p0, android.view.ViewGroup, android.view.View
        public /* bridge */ /* synthetic */ boolean hasFocus() {
            return super.hasFocus();
        }

        @Override // androidx.appcompat.widget.C0342p0, android.view.View
        public /* bridge */ /* synthetic */ boolean hasWindowFocus() {
            return super.hasWindowFocus();
        }

        @Override // androidx.appcompat.widget.C0342p0, android.view.View
        public /* bridge */ /* synthetic */ boolean isFocused() {
            return super.isFocused();
        }

        @Override // androidx.appcompat.widget.C0342p0, android.view.View
        public /* bridge */ /* synthetic */ boolean isInTouchMode() {
            return super.isInTouchMode();
        }

        @Override // androidx.appcompat.widget.C0342p0, android.view.View
        public boolean onHoverEvent(MotionEvent motionEvent) {
            int i10;
            if (this.f1974r != null) {
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i10 = headerViewListAdapter.getHeadersCount();
                    adapter = headerViewListAdapter.getWrappedAdapter();
                } else {
                    i10 = 0;
                }
                C0249d c0249d = (C0249d) adapter;
                C0252g c0252g = null;
                if (motionEvent.getAction() != 10) {
                    int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
                    c0252g = null;
                    if (pointToPosition != -1) {
                        int i11 = pointToPosition - i10;
                        c0252g = null;
                        if (i11 >= 0) {
                            c0252g = null;
                            if (i11 < c0249d.getCount()) {
                                c0252g = c0249d.getItem(i11);
                            }
                        }
                    }
                }
                MenuItem menuItem = this.f1975s;
                if (menuItem != c0252g) {
                    C0250e m944b = c0249d.m944b();
                    if (menuItem != null) {
                        this.f1974r.mo937n(m944b, menuItem);
                    }
                    this.f1975s = c0252g;
                    if (c0252g != null) {
                        this.f1974r.mo936d(m944b, c0252g);
                    }
                }
            }
            return super.onHoverEvent(motionEvent);
        }

        @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
        public boolean onKeyDown(int i10, KeyEvent keyEvent) {
            ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
            if (listMenuItemView != null && i10 == this.f1972p) {
                if (!listMenuItemView.isEnabled() || !listMenuItemView.getItemData().hasSubMenu()) {
                    return true;
                }
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                return true;
            }
            if (listMenuItemView == null || i10 != this.f1973q) {
                return super.onKeyDown(i10, keyEvent);
            }
            setSelection(-1);
            ListAdapter adapter = getAdapter();
            ListAdapter listAdapter = adapter;
            if (adapter instanceof HeaderViewListAdapter) {
                listAdapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((C0249d) listAdapter).m944b().m982e(false);
            return true;
        }

        @Override // androidx.appcompat.widget.C0342p0, android.widget.AbsListView, android.view.View
        public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
            return super.onTouchEvent(motionEvent);
        }

        public void setHoverListener(InterfaceC0365x0 interfaceC0365x0) {
            this.f1974r = interfaceC0365x0;
        }

        @Override // androidx.appcompat.widget.C0342p0, android.widget.AbsListView
        public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
            super.setSelector(drawable);
        }
    }

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                f1970L = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException e10) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    public C0301b1(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
    }

    /* renamed from: Q */
    public void m1245Q(Object obj) {
        if (Build.VERSION.SDK_INT >= 23) {
            this.f2314G.setEnterTransition((Transition) obj);
        }
    }

    /* renamed from: R */
    public void m1246R(Object obj) {
        if (Build.VERSION.SDK_INT >= 23) {
            this.f2314G.setExitTransition((Transition) obj);
        }
    }

    /* renamed from: S */
    public void m1247S(InterfaceC0365x0 interfaceC0365x0) {
        this.f1971K = interfaceC0365x0;
    }

    /* renamed from: T */
    public void m1248T(boolean z10) {
        if (Build.VERSION.SDK_INT > 28) {
            this.f2314G.setTouchModal(z10);
            return;
        }
        Method method = f1970L;
        if (method != null) {
            try {
                method.invoke(this.f2314G, Boolean.valueOf(z10));
            } catch (Exception e10) {
                Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
            }
        }
    }

    @Override // androidx.appcompat.widget.InterfaceC0365x0
    /* renamed from: d */
    public void mo936d(C0250e c0250e, MenuItem menuItem) {
        InterfaceC0365x0 interfaceC0365x0 = this.f1971K;
        if (interfaceC0365x0 != null) {
            interfaceC0365x0.mo936d(c0250e, menuItem);
        }
    }

    @Override // androidx.appcompat.widget.InterfaceC0365x0
    /* renamed from: n */
    public void mo937n(C0250e c0250e, MenuItem menuItem) {
        InterfaceC0365x0 interfaceC0365x0 = this.f1971K;
        if (interfaceC0365x0 != null) {
            interfaceC0365x0.mo937n(c0250e, menuItem);
        }
    }

    @Override // androidx.appcompat.widget.C0363w0
    /* renamed from: r */
    public C0342p0 mo1249r(Context context, boolean z10) {
        a aVar = new a(context, z10);
        aVar.setHoverListener(this);
        return aVar;
    }
}
