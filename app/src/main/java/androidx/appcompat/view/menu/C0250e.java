package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.jsoup.parser.CharacterReader;
import p050d0.C4290b;
import p118h0.InterfaceMenuC5016a;
import p235o0.AbstractC6808b;
import p235o0.C6858v0;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/appcompat/view/menu/e.class
 */
/* renamed from: androidx.appcompat.view.menu.e */
/* loaded from: combined.jar:classes1.jar:androidx/appcompat/view/menu/e.class */
public class C0250e implements InterfaceMenuC5016a {

    /* renamed from: A */
    public static final int[] f1580A = {1, 4, 5, 3, 2, 0};

    /* renamed from: a */
    public final Context f1581a;

    /* renamed from: b */
    public final Resources f1582b;

    /* renamed from: c */
    public boolean f1583c;

    /* renamed from: d */
    public boolean f1584d;

    /* renamed from: e */
    public a f1585e;

    /* renamed from: m */
    public ContextMenu.ContextMenuInfo f1593m;

    /* renamed from: n */
    public CharSequence f1594n;

    /* renamed from: o */
    public Drawable f1595o;

    /* renamed from: p */
    public View f1596p;

    /* renamed from: x */
    public C0252g f1604x;

    /* renamed from: z */
    public boolean f1606z;

    /* renamed from: l */
    public int f1592l = 0;

    /* renamed from: q */
    public boolean f1597q = false;

    /* renamed from: r */
    public boolean f1598r = false;

    /* renamed from: s */
    public boolean f1599s = false;

    /* renamed from: t */
    public boolean f1600t = false;

    /* renamed from: u */
    public boolean f1601u = false;

    /* renamed from: v */
    public ArrayList<C0252g> f1602v = new ArrayList<>();

    /* renamed from: w */
    public CopyOnWriteArrayList<WeakReference<InterfaceC0254i>> f1603w = new CopyOnWriteArrayList<>();

    /* renamed from: y */
    public boolean f1605y = false;

    /* renamed from: f */
    public ArrayList<C0252g> f1586f = new ArrayList<>();

    /* renamed from: g */
    public ArrayList<C0252g> f1587g = new ArrayList<>();

    /* renamed from: h */
    public boolean f1588h = true;

    /* renamed from: i */
    public ArrayList<C0252g> f1589i = new ArrayList<>();

    /* renamed from: j */
    public ArrayList<C0252g> f1590j = new ArrayList<>();

    /* renamed from: k */
    public boolean f1591k = true;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/appcompat/view/menu/e$a.class
     */
    /* renamed from: androidx.appcompat.view.menu.e$a */
    /* loaded from: combined.jar:classes1.jar:androidx/appcompat/view/menu/e$a.class */
    public interface a {
        /* renamed from: a */
        boolean mo1003a(C0250e c0250e, MenuItem menuItem);

        /* renamed from: b */
        void mo1004b(C0250e c0250e);
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/appcompat/view/menu/e$b.class
     */
    /* renamed from: androidx.appcompat.view.menu.e$b */
    /* loaded from: combined.jar:classes1.jar:androidx/appcompat/view/menu/e$b.class */
    public interface b {
        /* renamed from: b */
        boolean mo894b(C0252g c0252g);
    }

    public C0250e(Context context) {
        this.f1581a = context;
        this.f1582b = context.getResources();
        m977b0(true);
    }

    /* renamed from: B */
    public static int m947B(int i10) {
        int i11 = ((-65536) & i10) >> 16;
        if (i11 >= 0) {
            int[] iArr = f1580A;
            if (i11 < iArr.length) {
                return (i10 & CharacterReader.EOF) | (iArr[i11] << 16);
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    /* renamed from: n */
    public static int m948n(ArrayList<C0252g> arrayList, int i10) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size).m1016f() <= i10) {
                return size + 1;
            }
        }
        return 0;
    }

    /* renamed from: A */
    public boolean m949A() {
        return this.f1600t;
    }

    /* renamed from: C */
    public Resources m950C() {
        return this.f1582b;
    }

    /* renamed from: D */
    public C0250e mo951D() {
        return this;
    }

    /* renamed from: E */
    public ArrayList<C0252g> m952E() {
        if (!this.f1588h) {
            return this.f1587g;
        }
        this.f1587g.clear();
        int size = this.f1586f.size();
        for (int i10 = 0; i10 < size; i10++) {
            C0252g c0252g = this.f1586f.get(i10);
            if (c0252g.isVisible()) {
                this.f1587g.add(c0252g);
            }
        }
        this.f1588h = false;
        this.f1591k = true;
        return this.f1587g;
    }

    /* renamed from: F */
    public boolean mo953F() {
        return this.f1605y;
    }

    /* renamed from: G */
    public boolean mo954G() {
        return this.f1583c;
    }

    /* renamed from: H */
    public boolean mo955H() {
        return this.f1584d;
    }

    /* renamed from: I */
    public void m956I(C0252g c0252g) {
        this.f1591k = true;
        m958K(true);
    }

    /* renamed from: J */
    public void m957J(C0252g c0252g) {
        this.f1588h = true;
        m958K(true);
    }

    /* renamed from: K */
    public void m958K(boolean z10) {
        if (this.f1597q) {
            this.f1598r = true;
            if (z10) {
                this.f1599s = true;
                return;
            }
            return;
        }
        if (z10) {
            this.f1588h = true;
            this.f1591k = true;
        }
        m986i(z10);
    }

    /* renamed from: L */
    public boolean m959L(MenuItem menuItem, int i10) {
        return m960M(menuItem, null, i10);
    }

    /* renamed from: M */
    public boolean m960M(MenuItem menuItem, InterfaceC0254i interfaceC0254i, int i10) {
        boolean z10;
        C0252g c0252g = (C0252g) menuItem;
        if (c0252g == null || !c0252g.isEnabled()) {
            return false;
        }
        boolean m1021k = c0252g.m1021k();
        AbstractC6808b mo1012a = c0252g.mo1012a();
        boolean z11 = mo1012a != null && mo1012a.mo26343b();
        if (c0252g.m1020j()) {
            boolean expandActionView = m1021k | c0252g.expandActionView();
            z10 = expandActionView;
            if (expandActionView) {
                z10 = expandActionView;
                m982e(true);
            }
            return z10;
        }
        if (!c0252g.hasSubMenu() && !z11) {
            z10 = m1021k;
            if ((i10 & 1) == 0) {
                z10 = m1021k;
                m982e(true);
            }
            return z10;
        }
        if ((i10 & 4) == 0) {
            m982e(false);
        }
        if (!c0252g.hasSubMenu()) {
            c0252g.m1034x(new SubMenuC0257l(m997u(), this, c0252g));
        }
        SubMenuC0257l subMenuC0257l = (SubMenuC0257l) c0252g.getSubMenu();
        if (z11) {
            mo1012a.mo26344g(subMenuC0257l);
        }
        boolean m987j = m1021k | m987j(subMenuC0257l, interfaceC0254i);
        z10 = m987j;
        if (!m987j) {
            z10 = m987j;
            m982e(true);
        }
        return z10;
    }

    /* renamed from: N */
    public final void m961N(int i10, boolean z10) {
        if (i10 < 0 || i10 >= this.f1586f.size()) {
            return;
        }
        this.f1586f.remove(i10);
        if (z10) {
            m958K(true);
        }
    }

    /* renamed from: O */
    public void m962O(InterfaceC0254i interfaceC0254i) {
        Iterator<WeakReference<InterfaceC0254i>> it = this.f1603w.iterator();
        while (it.hasNext()) {
            WeakReference<InterfaceC0254i> next = it.next();
            InterfaceC0254i interfaceC0254i2 = next.get();
            if (interfaceC0254i2 == null || interfaceC0254i2 == interfaceC0254i) {
                this.f1603w.remove(next);
            }
        }
    }

    /* renamed from: P */
    public void m963P(Bundle bundle) {
        MenuItem findItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(mo996t());
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            MenuItem item = getItem(i10);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((SubMenuC0257l) item.getSubMenu()).m963P(bundle);
            }
        }
        int i11 = bundle.getInt("android:menu:expandedactionview");
        if (i11 <= 0 || (findItem = findItem(i11)) == null) {
            return;
        }
        findItem.expandActionView();
    }

    /* renamed from: Q */
    public void m964Q(Bundle bundle) {
        int size = size();
        SparseArray<? extends Parcelable> sparseArray = null;
        int i10 = 0;
        while (i10 < size) {
            MenuItem item = getItem(i10);
            View actionView = item.getActionView();
            SparseArray<? extends Parcelable> sparseArray2 = sparseArray;
            if (actionView != null) {
                sparseArray2 = sparseArray;
                if (actionView.getId() != -1) {
                    SparseArray<? extends Parcelable> sparseArray3 = sparseArray;
                    if (sparseArray == null) {
                        sparseArray3 = new SparseArray<>();
                    }
                    actionView.saveHierarchyState(sparseArray3);
                    sparseArray2 = sparseArray3;
                    if (item.isActionViewExpanded()) {
                        bundle.putInt("android:menu:expandedactionview", item.getItemId());
                        sparseArray2 = sparseArray3;
                    }
                }
            }
            if (item.hasSubMenu()) {
                ((SubMenuC0257l) item.getSubMenu()).m964Q(bundle);
            }
            i10++;
            sparseArray = sparseArray2;
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(mo996t(), sparseArray);
        }
    }

    /* renamed from: R */
    public void mo965R(a aVar) {
        this.f1585e = aVar;
    }

    /* renamed from: S */
    public C0250e m966S(int i10) {
        this.f1592l = i10;
        return this;
    }

    /* renamed from: T */
    public void m967T(MenuItem menuItem) {
        int groupId = menuItem.getGroupId();
        int size = this.f1586f.size();
        m981d0();
        for (int i10 = 0; i10 < size; i10++) {
            C0252g c0252g = this.f1586f.get(i10);
            if (c0252g.getGroupId() == groupId && c0252g.m1023m() && c0252g.isCheckable()) {
                c0252g.m1029s(c0252g == menuItem);
            }
        }
        m979c0();
    }

    /* renamed from: U */
    public C0250e m968U(int i10) {
        m970W(0, null, i10, null, null);
        return this;
    }

    /* renamed from: V */
    public C0250e m969V(Drawable drawable) {
        m970W(0, null, 0, drawable, null);
        return this;
    }

    /* renamed from: W */
    public final void m970W(int i10, CharSequence charSequence, int i11, Drawable drawable, View view) {
        Resources m950C = m950C();
        if (view != null) {
            this.f1596p = view;
            this.f1594n = null;
            this.f1595o = null;
        } else {
            if (i10 > 0) {
                this.f1594n = m950C.getText(i10);
            } else if (charSequence != null) {
                this.f1594n = charSequence;
            }
            if (i11 > 0) {
                this.f1595o = C4290b.m21726e(m997u(), i11);
            } else if (drawable != null) {
                this.f1595o = drawable;
            }
            this.f1596p = null;
        }
        m958K(false);
    }

    /* renamed from: X */
    public C0250e m971X(int i10) {
        m970W(i10, null, 0, null, null);
        return this;
    }

    /* renamed from: Y */
    public C0250e m972Y(CharSequence charSequence) {
        m970W(0, charSequence, 0, null, null);
        return this;
    }

    /* renamed from: Z */
    public C0250e m973Z(View view) {
        m970W(0, null, 0, null, view);
        return this;
    }

    /* renamed from: a */
    public MenuItem m974a(int i10, int i11, int i12, CharSequence charSequence) {
        int m947B = m947B(i12);
        C0252g m984g = m984g(i10, i11, i12, m947B, charSequence, this.f1592l);
        ContextMenu.ContextMenuInfo contextMenuInfo = this.f1593m;
        if (contextMenuInfo != null) {
            m984g.m1032v(contextMenuInfo);
        }
        ArrayList<C0252g> arrayList = this.f1586f;
        arrayList.add(m948n(arrayList, m947B), m984g);
        m958K(true);
        return m984g;
    }

    /* renamed from: a0 */
    public void m975a0(boolean z10) {
        this.f1606z = z10;
    }

    @Override // android.view.Menu
    public MenuItem add(int i10) {
        return m974a(0, 0, 0, this.f1582b.getString(i10));
    }

    @Override // android.view.Menu
    public MenuItem add(int i10, int i11, int i12, int i13) {
        return m974a(i10, i11, i12, this.f1582b.getString(i13));
    }

    @Override // android.view.Menu
    public MenuItem add(int i10, int i11, int i12, CharSequence charSequence) {
        return m974a(i10, i11, i12, charSequence);
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return m974a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i10, int i11, int i12, ComponentName componentName, Intent[] intentArr, Intent intent, int i13, MenuItem[] menuItemArr) {
        int i14;
        PackageManager packageManager = this.f1581a.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = queryIntentActivityOptions != null ? queryIntentActivityOptions.size() : 0;
        int i15 = 0;
        if ((i13 & 1) == 0) {
            removeGroup(i10);
            i15 = 0;
        }
        while (i15 < size) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i15);
            int i16 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i16 < 0 ? intent : intentArr[i16]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            MenuItem intent3 = add(i10, i11, i12, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent2);
            if (menuItemArr != null && (i14 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i14] = intent3;
            }
            i15++;
        }
        return size;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i10) {
        return addSubMenu(0, 0, 0, this.f1582b.getString(i10));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i10, int i11, int i12, int i13) {
        return addSubMenu(i10, i11, i12, this.f1582b.getString(i13));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i10, int i11, int i12, CharSequence charSequence) {
        C0252g c0252g = (C0252g) m974a(i10, i11, i12, charSequence);
        SubMenuC0257l subMenuC0257l = new SubMenuC0257l(this.f1581a, this, c0252g);
        c0252g.m1034x(subMenuC0257l);
        return subMenuC0257l;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    /* renamed from: b */
    public void m976b(InterfaceC0254i interfaceC0254i) {
        m978c(interfaceC0254i, this.f1581a);
    }

    /* renamed from: b0 */
    public final void m977b0(boolean z10) {
        this.f1584d = z10 && this.f1582b.getConfiguration().keyboard != 1 && C6858v0.m31661e(ViewConfiguration.get(this.f1581a), this.f1581a);
    }

    /* renamed from: c */
    public void m978c(InterfaceC0254i interfaceC0254i, Context context) {
        this.f1603w.add(new WeakReference<>(interfaceC0254i));
        interfaceC0254i.mo908i(context, this);
        this.f1591k = true;
    }

    /* renamed from: c0 */
    public void m979c0() {
        this.f1597q = false;
        if (this.f1598r) {
            this.f1598r = false;
            m958K(this.f1599s);
        }
    }

    @Override // android.view.Menu
    public void clear() {
        C0252g c0252g = this.f1604x;
        if (c0252g != null) {
            mo983f(c0252g);
        }
        this.f1586f.clear();
        m958K(true);
    }

    public void clearHeader() {
        this.f1595o = null;
        this.f1594n = null;
        this.f1596p = null;
        m958K(false);
    }

    @Override // android.view.Menu
    public void close() {
        m982e(true);
    }

    /* renamed from: d */
    public void m980d() {
        a aVar = this.f1585e;
        if (aVar != null) {
            aVar.mo1004b(this);
        }
    }

    /* renamed from: d0 */
    public void m981d0() {
        if (this.f1597q) {
            return;
        }
        this.f1597q = true;
        this.f1598r = false;
        this.f1599s = false;
    }

    /* renamed from: e */
    public final void m982e(boolean z10) {
        if (this.f1601u) {
            return;
        }
        this.f1601u = true;
        Iterator<WeakReference<InterfaceC0254i>> it = this.f1603w.iterator();
        while (it.hasNext()) {
            WeakReference<InterfaceC0254i> next = it.next();
            InterfaceC0254i interfaceC0254i = next.get();
            if (interfaceC0254i == null) {
                this.f1603w.remove(next);
            } else {
                interfaceC0254i.mo902b(this, z10);
            }
        }
        this.f1601u = false;
    }

    /* renamed from: f */
    public boolean mo983f(C0252g c0252g) {
        boolean z10;
        boolean z11 = false;
        if (!this.f1603w.isEmpty()) {
            if (this.f1604x != c0252g) {
                z11 = false;
            } else {
                m981d0();
                Iterator<WeakReference<InterfaceC0254i>> it = this.f1603w.iterator();
                boolean z12 = false;
                while (true) {
                    z10 = z12;
                    if (!it.hasNext()) {
                        break;
                    }
                    WeakReference<InterfaceC0254i> next = it.next();
                    InterfaceC0254i interfaceC0254i = next.get();
                    if (interfaceC0254i == null) {
                        this.f1603w.remove(next);
                    } else {
                        z10 = interfaceC0254i.mo907h(this, c0252g);
                        z12 = z10;
                        if (z10) {
                            break;
                        }
                    }
                }
                m979c0();
                z11 = z10;
                if (z10) {
                    this.f1604x = null;
                    z11 = z10;
                }
            }
        }
        return z11;
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i10) {
        MenuItem findItem;
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            C0252g c0252g = this.f1586f.get(i11);
            if (c0252g.getItemId() == i10) {
                return c0252g;
            }
            if (c0252g.hasSubMenu() && (findItem = c0252g.getSubMenu().findItem(i10)) != null) {
                return findItem;
            }
        }
        return null;
    }

    /* renamed from: g */
    public final C0252g m984g(int i10, int i11, int i12, int i13, CharSequence charSequence, int i14) {
        return new C0252g(this, i10, i11, i12, i13, charSequence, i14);
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i10) {
        return this.f1586f.get(i10);
    }

    /* renamed from: h */
    public boolean mo985h(C0250e c0250e, MenuItem menuItem) {
        a aVar = this.f1585e;
        return aVar != null && aVar.mo1003a(c0250e, menuItem);
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        if (this.f1606z) {
            return true;
        }
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f1586f.get(i10).isVisible()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: i */
    public final void m986i(boolean z10) {
        if (this.f1603w.isEmpty()) {
            return;
        }
        m981d0();
        Iterator<WeakReference<InterfaceC0254i>> it = this.f1603w.iterator();
        while (it.hasNext()) {
            WeakReference<InterfaceC0254i> next = it.next();
            InterfaceC0254i interfaceC0254i = next.get();
            if (interfaceC0254i == null) {
                this.f1603w.remove(next);
            } else {
                interfaceC0254i.mo906f(z10);
            }
        }
        m979c0();
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i10, KeyEvent keyEvent) {
        return m992p(i10, keyEvent) != null;
    }

    /* renamed from: j */
    public final boolean m987j(SubMenuC0257l subMenuC0257l, InterfaceC0254i interfaceC0254i) {
        boolean z10 = false;
        if (this.f1603w.isEmpty()) {
            return false;
        }
        if (interfaceC0254i != null) {
            z10 = interfaceC0254i.mo905e(subMenuC0257l);
        }
        Iterator<WeakReference<InterfaceC0254i>> it = this.f1603w.iterator();
        while (it.hasNext()) {
            WeakReference<InterfaceC0254i> next = it.next();
            InterfaceC0254i interfaceC0254i2 = next.get();
            if (interfaceC0254i2 == null) {
                this.f1603w.remove(next);
            } else if (!z10) {
                z10 = interfaceC0254i2.mo905e(subMenuC0257l);
            }
        }
        return z10;
    }

    /* renamed from: k */
    public boolean mo988k(C0252g c0252g) {
        boolean z10;
        boolean z11 = false;
        if (this.f1603w.isEmpty()) {
            return false;
        }
        m981d0();
        Iterator<WeakReference<InterfaceC0254i>> it = this.f1603w.iterator();
        while (true) {
            z10 = z11;
            if (!it.hasNext()) {
                break;
            }
            WeakReference<InterfaceC0254i> next = it.next();
            InterfaceC0254i interfaceC0254i = next.get();
            if (interfaceC0254i == null) {
                this.f1603w.remove(next);
            } else {
                z10 = interfaceC0254i.mo903c(this, c0252g);
                z11 = z10;
                if (z10) {
                    break;
                }
            }
        }
        m979c0();
        if (z10) {
            this.f1604x = c0252g;
        }
        return z10;
    }

    /* renamed from: l */
    public int m989l(int i10) {
        return m990m(i10, 0);
    }

    /* renamed from: m */
    public int m990m(int i10, int i11) {
        int size = size();
        int i12 = i11;
        if (i11 < 0) {
            i12 = 0;
        }
        while (i12 < size) {
            if (this.f1586f.get(i12).getGroupId() == i10) {
                return i12;
            }
            i12++;
        }
        return -1;
    }

    /* renamed from: o */
    public int m991o(int i10) {
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            if (this.f1586f.get(i11).getItemId() == i10) {
                return i11;
            }
        }
        return -1;
    }

    /* renamed from: p */
    public C0252g m992p(int i10, KeyEvent keyEvent) {
        ArrayList<C0252g> arrayList = this.f1602v;
        arrayList.clear();
        m993q(arrayList, i10, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return arrayList.get(0);
        }
        boolean mo954G = mo954G();
        for (int i11 = 0; i11 < size; i11++) {
            C0252g c0252g = arrayList.get(i11);
            char alphabeticShortcut = mo954G ? c0252g.getAlphabeticShortcut() : c0252g.getNumericShortcut();
            char[] cArr = keyData.meta;
            if ((alphabeticShortcut == cArr[0] && (metaState & 2) == 0) || ((alphabeticShortcut == cArr[2] && (metaState & 2) != 0) || (mo954G && alphabeticShortcut == '\b' && i10 == 67))) {
                return c0252g;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i10, int i11) {
        return m959L(findItem(i10), i11);
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i10, KeyEvent keyEvent, int i11) {
        C0252g m992p = m992p(i10, keyEvent);
        boolean m959L = m992p != null ? m959L(m992p, i11) : false;
        if ((i11 & 2) != 0) {
            m982e(true);
        }
        return m959L;
    }

    /* renamed from: q */
    public void m993q(List<C0252g> list, int i10, KeyEvent keyEvent) {
        boolean mo954G = mo954G();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i10 == 67) {
            int size = this.f1586f.size();
            for (int i11 = 0; i11 < size; i11++) {
                C0252g c0252g = this.f1586f.get(i11);
                if (c0252g.hasSubMenu()) {
                    ((C0250e) c0252g.getSubMenu()).m993q(list, i10, keyEvent);
                }
                char alphabeticShortcut = mo954G ? c0252g.getAlphabeticShortcut() : c0252g.getNumericShortcut();
                if (((modifiers & 69647) == ((mo954G ? c0252g.getAlphabeticModifiers() : c0252g.getNumericModifiers()) & 69647)) && alphabeticShortcut != 0) {
                    char[] cArr = keyData.meta;
                    if ((alphabeticShortcut == cArr[0] || alphabeticShortcut == cArr[2] || (mo954G && alphabeticShortcut == '\b' && i10 == 67)) && c0252g.isEnabled()) {
                        list.add(c0252g);
                    }
                }
            }
        }
    }

    /* renamed from: r */
    public void m994r() {
        ArrayList<C0252g> m952E = m952E();
        if (this.f1591k) {
            Iterator<WeakReference<InterfaceC0254i>> it = this.f1603w.iterator();
            boolean z10 = false;
            while (it.hasNext()) {
                WeakReference<InterfaceC0254i> next = it.next();
                InterfaceC0254i interfaceC0254i = next.get();
                if (interfaceC0254i == null) {
                    this.f1603w.remove(next);
                } else {
                    z10 |= interfaceC0254i.mo923g();
                }
            }
            if (z10) {
                this.f1589i.clear();
                this.f1590j.clear();
                int size = m952E.size();
                for (int i10 = 0; i10 < size; i10++) {
                    C0252g c0252g = m952E.get(i10);
                    (c0252g.m1022l() ? this.f1589i : this.f1590j).add(c0252g);
                }
            } else {
                this.f1589i.clear();
                this.f1590j.clear();
                this.f1590j.addAll(m952E());
            }
            this.f1591k = false;
        }
    }

    @Override // android.view.Menu
    public void removeGroup(int i10) {
        int m989l = m989l(i10);
        if (m989l >= 0) {
            int size = this.f1586f.size();
            for (int i11 = 0; i11 < size - m989l && this.f1586f.get(m989l).getGroupId() == i10; i11++) {
                m961N(m989l, false);
            }
            m958K(true);
        }
    }

    @Override // android.view.Menu
    public void removeItem(int i10) {
        m961N(m991o(i10), true);
    }

    /* renamed from: s */
    public ArrayList<C0252g> m995s() {
        m994r();
        return this.f1589i;
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i10, boolean z10, boolean z11) {
        int size = this.f1586f.size();
        for (int i11 = 0; i11 < size; i11++) {
            C0252g c0252g = this.f1586f.get(i11);
            if (c0252g.getGroupId() == i10) {
                c0252g.m1030t(z11);
                c0252g.setCheckable(z10);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z10) {
        this.f1605y = z10;
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i10, boolean z10) {
        int size = this.f1586f.size();
        for (int i11 = 0; i11 < size; i11++) {
            C0252g c0252g = this.f1586f.get(i11);
            if (c0252g.getGroupId() == i10) {
                c0252g.setEnabled(z10);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i10, boolean z10) {
        boolean z11;
        int size = this.f1586f.size();
        int i11 = 0;
        boolean z12 = false;
        while (true) {
            z11 = z12;
            if (i11 >= size) {
                break;
            }
            C0252g c0252g = this.f1586f.get(i11);
            boolean z13 = z11;
            if (c0252g.getGroupId() == i10) {
                z13 = z11;
                if (c0252g.m1035y(z10)) {
                    z13 = true;
                }
            }
            i11++;
            z12 = z13;
        }
        if (z11) {
            m958K(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z10) {
        this.f1583c = z10;
        m958K(false);
    }

    @Override // android.view.Menu
    public int size() {
        return this.f1586f.size();
    }

    /* renamed from: t */
    public String mo996t() {
        return "android:menu:actionviewstates";
    }

    /* renamed from: u */
    public Context m997u() {
        return this.f1581a;
    }

    /* renamed from: v */
    public C0252g m998v() {
        return this.f1604x;
    }

    /* renamed from: w */
    public Drawable m999w() {
        return this.f1595o;
    }

    /* renamed from: x */
    public CharSequence m1000x() {
        return this.f1594n;
    }

    /* renamed from: y */
    public View m1001y() {
        return this.f1596p;
    }

    /* renamed from: z */
    public ArrayList<C0252g> m1002z() {
        m994r();
        return this.f1590j;
    }
}
