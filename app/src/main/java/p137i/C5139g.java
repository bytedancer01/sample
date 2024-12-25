package p137i;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.view.menu.C0252g;
import androidx.appcompat.widget.C0337n1;
import androidx.appcompat.widget.C0339o0;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.jsoup.parser.CharacterReader;
import org.xmlpull.v1.XmlPullParserException;
import p029c.C0929j;
import p118h0.InterfaceMenuC5016a;
import p155j.MenuItemC5271c;
import p235o0.AbstractC6808b;
import p235o0.C6845p;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:i/g.class
 */
/* renamed from: i.g */
/* loaded from: combined.jar:classes1.jar:i/g.class */
public class C5139g extends MenuInflater {

    /* renamed from: e */
    public static final Class<?>[] f29462e;

    /* renamed from: f */
    public static final Class<?>[] f29463f;

    /* renamed from: a */
    public final Object[] f29464a;

    /* renamed from: b */
    public final Object[] f29465b;

    /* renamed from: c */
    public Context f29466c;

    /* renamed from: d */
    public Object f29467d;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:i/g$a.class
     */
    /* renamed from: i.g$a */
    /* loaded from: combined.jar:classes1.jar:i/g$a.class */
    public static class a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: c */
        public static final Class<?>[] f29468c = {MenuItem.class};

        /* renamed from: a */
        public Object f29469a;

        /* renamed from: b */
        public Method f29470b;

        public a(Object obj, String str) {
            this.f29469a = obj;
            Class<?> cls = obj.getClass();
            try {
                this.f29470b = cls.getMethod(str, f29468c);
            } catch (Exception e10) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
                inflateException.initCause(e10);
                throw inflateException;
            }
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            try {
                if (this.f29470b.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.f29470b.invoke(this.f29469a, menuItem)).booleanValue();
                }
                this.f29470b.invoke(this.f29469a, menuItem);
                return true;
            } catch (Exception e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:i/g$b.class
     */
    /* renamed from: i.g$b */
    /* loaded from: combined.jar:classes1.jar:i/g$b.class */
    public class b {

        /* renamed from: A */
        public AbstractC6808b f29471A;

        /* renamed from: B */
        public CharSequence f29472B;

        /* renamed from: C */
        public CharSequence f29473C;

        /* renamed from: D */
        public ColorStateList f29474D = null;

        /* renamed from: E */
        public PorterDuff.Mode f29475E = null;

        /* renamed from: F */
        public final C5139g f29476F;

        /* renamed from: a */
        public Menu f29477a;

        /* renamed from: b */
        public int f29478b;

        /* renamed from: c */
        public int f29479c;

        /* renamed from: d */
        public int f29480d;

        /* renamed from: e */
        public int f29481e;

        /* renamed from: f */
        public boolean f29482f;

        /* renamed from: g */
        public boolean f29483g;

        /* renamed from: h */
        public boolean f29484h;

        /* renamed from: i */
        public int f29485i;

        /* renamed from: j */
        public int f29486j;

        /* renamed from: k */
        public CharSequence f29487k;

        /* renamed from: l */
        public CharSequence f29488l;

        /* renamed from: m */
        public int f29489m;

        /* renamed from: n */
        public char f29490n;

        /* renamed from: o */
        public int f29491o;

        /* renamed from: p */
        public char f29492p;

        /* renamed from: q */
        public int f29493q;

        /* renamed from: r */
        public int f29494r;

        /* renamed from: s */
        public boolean f29495s;

        /* renamed from: t */
        public boolean f29496t;

        /* renamed from: u */
        public boolean f29497u;

        /* renamed from: v */
        public int f29498v;

        /* renamed from: w */
        public int f29499w;

        /* renamed from: x */
        public String f29500x;

        /* renamed from: y */
        public String f29501y;

        /* renamed from: z */
        public String f29502z;

        public b(C5139g c5139g, Menu menu) {
            this.f29476F = c5139g;
            this.f29477a = menu;
            m25762h();
        }

        /* renamed from: a */
        public void m25755a() {
            this.f29484h = true;
            m25763i(this.f29477a.add(this.f29478b, this.f29485i, this.f29486j, this.f29487k));
        }

        /* renamed from: b */
        public SubMenu m25756b() {
            this.f29484h = true;
            SubMenu addSubMenu = this.f29477a.addSubMenu(this.f29478b, this.f29485i, this.f29486j, this.f29487k);
            m25763i(addSubMenu.getItem());
            return addSubMenu;
        }

        /* renamed from: c */
        public final char m25757c(String str) {
            if (str == null) {
                return (char) 0;
            }
            return str.charAt(0);
        }

        /* renamed from: d */
        public boolean m25758d() {
            return this.f29484h;
        }

        /* renamed from: e */
        public final <T> T m25759e(String str, Class<?>[] clsArr, Object[] objArr) {
            try {
                Constructor<?> constructor = Class.forName(str, false, this.f29476F.f29466c.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return (T) constructor.newInstance(objArr);
            } catch (Exception e10) {
                Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e10);
                return null;
            }
        }

        /* renamed from: f */
        public void m25760f(AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = this.f29476F.f29466c.obtainStyledAttributes(attributeSet, C0929j.f6546z1);
            this.f29478b = obtainStyledAttributes.getResourceId(C0929j.f6289B1, 0);
            this.f29479c = obtainStyledAttributes.getInt(C0929j.f6299D1, 0);
            this.f29480d = obtainStyledAttributes.getInt(C0929j.f6304E1, 0);
            this.f29481e = obtainStyledAttributes.getInt(C0929j.f6309F1, 0);
            this.f29482f = obtainStyledAttributes.getBoolean(C0929j.f6294C1, true);
            this.f29483g = obtainStyledAttributes.getBoolean(C0929j.f6284A1, true);
            obtainStyledAttributes.recycle();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v17, types: [int] */
        /* JADX WARN: Type inference failed for: r0v31 */
        /* JADX WARN: Type inference failed for: r0v32 */
        /* JADX WARN: Type inference failed for: r8v3 */
        /* JADX WARN: Type inference failed for: r8v4 */
        /* JADX WARN: Type inference failed for: r8v7 */
        /* renamed from: g */
        public void m25761g(AttributeSet attributeSet) {
            C0337n1 m1504u = C0337n1.m1504u(this.f29476F.f29466c, attributeSet, C0929j.f6314G1);
            this.f29485i = m1504u.m1519n(C0929j.f6329J1, 0);
            this.f29486j = (m1504u.m1516k(C0929j.f6344M1, this.f29479c) & (-65536)) | (m1504u.m1516k(C0929j.f6349N1, this.f29480d) & CharacterReader.EOF);
            this.f29487k = m1504u.m1521p(C0929j.f6354O1);
            this.f29488l = m1504u.m1521p(C0929j.f6359P1);
            this.f29489m = m1504u.m1519n(C0929j.f6319H1, 0);
            this.f29490n = m25757c(m1504u.m1520o(C0929j.f6364Q1));
            this.f29491o = m1504u.m1516k(C0929j.f6399X1, 4096);
            this.f29492p = m25757c(m1504u.m1520o(C0929j.f6369R1));
            this.f29493q = m1504u.m1516k(C0929j.f6421b2, 4096);
            int i10 = C0929j.f6374S1;
            this.f29494r = m1504u.m1524s(i10) ? m1504u.m1506a(i10, false) : this.f29481e ? 1 : 0;
            this.f29495s = m1504u.m1506a(C0929j.f6334K1, false);
            this.f29496t = m1504u.m1506a(C0929j.f6339L1, this.f29482f);
            this.f29497u = m1504u.m1506a(C0929j.f6324I1, this.f29483g);
            this.f29498v = m1504u.m1516k(C0929j.f6427c2, -1);
            this.f29502z = m1504u.m1520o(C0929j.f6379T1);
            this.f29499w = m1504u.m1519n(C0929j.f6384U1, 0);
            this.f29500x = m1504u.m1520o(C0929j.f6394W1);
            String m1520o = m1504u.m1520o(C0929j.f6389V1);
            this.f29501y = m1520o;
            ?? r82 = m1520o != null;
            if (r82 == true && this.f29499w == 0 && this.f29500x == null) {
                this.f29471A = (AbstractC6808b) m25759e(m1520o, C5139g.f29463f, this.f29476F.f29465b);
            } else {
                if (r82 != false) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                }
                this.f29471A = null;
            }
            this.f29472B = m1504u.m1521p(C0929j.f6404Y1);
            this.f29473C = m1504u.m1521p(C0929j.f6433d2);
            int i11 = C0929j.f6415a2;
            if (m1504u.m1524s(i11)) {
                this.f29475E = C0339o0.m1532e(m1504u.m1516k(i11, -1), this.f29475E);
            } else {
                this.f29475E = null;
            }
            int i12 = C0929j.f6409Z1;
            if (m1504u.m1524s(i12)) {
                this.f29474D = m1504u.m1508c(i12);
            } else {
                this.f29474D = null;
            }
            m1504u.m1525w();
            this.f29484h = false;
        }

        /* renamed from: h */
        public void m25762h() {
            this.f29478b = 0;
            this.f29479c = 0;
            this.f29480d = 0;
            this.f29481e = 0;
            this.f29482f = true;
            this.f29483g = true;
        }

        /* renamed from: i */
        public final void m25763i(MenuItem menuItem) {
            boolean z10 = false;
            menuItem.setChecked(this.f29495s).setVisible(this.f29496t).setEnabled(this.f29497u).setCheckable(this.f29494r >= 1).setTitleCondensed(this.f29488l).setIcon(this.f29489m);
            int i10 = this.f29498v;
            if (i10 >= 0) {
                menuItem.setShowAsAction(i10);
            }
            if (this.f29502z != null) {
                if (this.f29476F.f29466c.isRestricted()) {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
                menuItem.setOnMenuItemClickListener(new a(this.f29476F.m25753b(), this.f29502z));
            }
            if (this.f29494r >= 2) {
                if (menuItem instanceof C0252g) {
                    ((C0252g) menuItem).m1030t(true);
                } else if (menuItem instanceof MenuItemC5271c) {
                    ((MenuItemC5271c) menuItem).m26342h(true);
                }
            }
            String str = this.f29500x;
            if (str != null) {
                menuItem.setActionView((View) m25759e(str, C5139g.f29462e, this.f29476F.f29464a));
                z10 = true;
            }
            int i11 = this.f29499w;
            if (i11 > 0) {
                if (z10) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                } else {
                    menuItem.setActionView(i11);
                }
            }
            AbstractC6808b abstractC6808b = this.f29471A;
            if (abstractC6808b != null) {
                C6845p.m31620c(menuItem, abstractC6808b);
            }
            C6845p.m31622e(menuItem, this.f29472B);
            C6845p.m31626i(menuItem, this.f29473C);
            C6845p.m31621d(menuItem, this.f29490n, this.f29491o);
            C6845p.m31625h(menuItem, this.f29492p, this.f29493q);
            PorterDuff.Mode mode = this.f29475E;
            if (mode != null) {
                C6845p.m31624g(menuItem, mode);
            }
            ColorStateList colorStateList = this.f29474D;
            if (colorStateList != null) {
                C6845p.m31623f(menuItem, colorStateList);
            }
        }
    }

    static {
        Class<?>[] clsArr = {Context.class};
        f29462e = clsArr;
        f29463f = clsArr;
    }

    public C5139g(Context context) {
        super(context);
        this.f29466c = context;
        Object[] objArr = {context};
        this.f29464a = objArr;
        this.f29465b = objArr;
    }

    /* renamed from: a */
    public final Object m25752a(Object obj) {
        if (obj instanceof Activity) {
            return obj;
        }
        Object obj2 = obj;
        if (obj instanceof ContextWrapper) {
            obj2 = m25752a(((ContextWrapper) obj).getBaseContext());
        }
        return obj2;
    }

    /* renamed from: b */
    public Object m25753b() {
        if (this.f29467d == null) {
            this.f29467d = m25752a(this.f29466c);
        }
        return this.f29467d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0076, code lost:
    
        if (r10 != false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x007c, code lost:
    
        if (r9 == 1) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0082, code lost:
    
        if (r9 == 2) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0088, code lost:
    
        if (r9 == 3) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x008b, code lost:
    
        r12 = r10;
        r9 = r11;
        r8 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x01cd, code lost:
    
        r10 = r12;
        r11 = r9;
        r14 = r8;
        r9 = r6.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0099, code lost:
    
        r0 = r6.getName();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00a3, code lost:
    
        if (r11 == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00ad, code lost:
    
        if (r0.equals(r14) == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00b0, code lost:
    
        r8 = null;
        r9 = false;
        r12 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00c3, code lost:
    
        if (r0.equals("group") == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00c6, code lost:
    
        r0.m25762h();
        r12 = r10;
        r9 = r11;
        r8 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00e0, code lost:
    
        if (r0.equals("item") == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00e3, code lost:
    
        r12 = r10;
        r9 = r11;
        r8 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00f3, code lost:
    
        if (r0.m25758d() != false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00f6, code lost:
    
        r0 = r0.f29471A;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00fd, code lost:
    
        if (r0 == null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0104, code lost:
    
        if (r0.mo26343b() == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0107, code lost:
    
        r0.m25756b();
        r12 = r10;
        r9 = r11;
        r8 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x011b, code lost:
    
        r0.m25755a();
        r12 = r10;
        r9 = r11;
        r8 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x012e, code lost:
    
        r12 = r10;
        r9 = r11;
        r8 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0140, code lost:
    
        if (r0.equals("menu") == false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0143, code lost:
    
        r12 = true;
        r9 = r11;
        r8 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0152, code lost:
    
        if (r11 == false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0155, code lost:
    
        r12 = r10;
        r9 = r11;
        r8 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0163, code lost:
    
        r8 = r6.getName();
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0170, code lost:
    
        if (r8.equals("group") == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0173, code lost:
    
        r0.m25760f(r7);
        r12 = r10;
        r9 = r11;
        r8 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x018d, code lost:
    
        if (r8.equals("item") == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0190, code lost:
    
        r0.m25761g(r7);
        r12 = r10;
        r9 = r11;
        r8 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01aa, code lost:
    
        if (r8.equals("menu") == false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01ad, code lost:
    
        m25754c(r6, r7, r0.m25756b());
        r12 = r10;
        r9 = r11;
        r8 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01c6, code lost:
    
        r9 = true;
        r12 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01f0, code lost:
    
        throw new java.lang.RuntimeException("Unexpected end of document");
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01f1, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x006b, code lost:
    
        r14 = null;
        r10 = false;
        r11 = false;
     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m25754c(org.xmlpull.v1.XmlPullParser r6, android.util.AttributeSet r7, android.view.Menu r8) {
        /*
            Method dump skipped, instructions count: 498
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p137i.C5139g.m25754c(org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.view.Menu):void");
    }

    @Override // android.view.MenuInflater
    public void inflate(int i10, Menu menu) {
        if (!(menu instanceof InterfaceMenuC5016a)) {
            super.inflate(i10, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        XmlResourceParser xmlResourceParser2 = null;
        XmlResourceParser xmlResourceParser3 = null;
        try {
            try {
                try {
                    XmlResourceParser layout = this.f29466c.getResources().getLayout(i10);
                    xmlResourceParser3 = layout;
                    xmlResourceParser = layout;
                    xmlResourceParser2 = layout;
                    m25754c(layout, Xml.asAttributeSet(layout), menu);
                    if (layout != null) {
                        layout.close();
                    }
                } catch (IOException e10) {
                    XmlResourceParser xmlResourceParser4 = xmlResourceParser;
                    XmlResourceParser xmlResourceParser5 = xmlResourceParser;
                    throw new InflateException("Error inflating menu XML", e10);
                }
            } catch (XmlPullParserException e11) {
                XmlResourceParser xmlResourceParser6 = xmlResourceParser2;
                XmlResourceParser xmlResourceParser7 = xmlResourceParser2;
                throw new InflateException("Error inflating menu XML", e11);
            }
        } catch (Throwable th2) {
            if (xmlResourceParser3 != null) {
                xmlResourceParser3.close();
            }
            throw th2;
        }
    }
}
