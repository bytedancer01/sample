package p392x;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:x/f.class
 */
/* renamed from: x.f */
/* loaded from: combined.jar:classes1.jar:x/f.class */
public class C9605f implements InterfaceC9603d {

    /* renamed from: d */
    public AbstractC9612m f43883d;

    /* renamed from: f */
    public int f43885f;

    /* renamed from: g */
    public int f43886g;

    /* renamed from: a */
    public InterfaceC9603d f43880a = null;

    /* renamed from: b */
    public boolean f43881b = false;

    /* renamed from: c */
    public boolean f43882c = false;

    /* renamed from: e */
    public a f43884e = a.UNKNOWN;

    /* renamed from: h */
    public int f43887h = 1;

    /* renamed from: i */
    public C9606g f43888i = null;

    /* renamed from: j */
    public boolean f43889j = false;

    /* renamed from: k */
    public List<InterfaceC9603d> f43890k = new ArrayList();

    /* renamed from: l */
    public List<C9605f> f43891l = new ArrayList();

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:x/f$a.class
     */
    /* renamed from: x.f$a */
    /* loaded from: combined.jar:classes1.jar:x/f$a.class */
    public enum a {
        UNKNOWN,
        HORIZONTAL_DIMENSION,
        VERTICAL_DIMENSION,
        LEFT,
        RIGHT,
        TOP,
        BOTTOM,
        BASELINE
    }

    public C9605f(AbstractC9612m abstractC9612m) {
        this.f43883d = abstractC9612m;
    }

    @Override // p392x.InterfaceC9603d
    /* renamed from: a */
    public void mo40449a(InterfaceC9603d interfaceC9603d) {
        Iterator<C9605f> it = this.f43891l.iterator();
        while (it.hasNext()) {
            if (!it.next().f43889j) {
                return;
            }
        }
        this.f43882c = true;
        InterfaceC9603d interfaceC9603d2 = this.f43880a;
        if (interfaceC9603d2 != null) {
            interfaceC9603d2.mo40449a(this);
        }
        if (this.f43881b) {
            this.f43883d.mo40449a(this);
            return;
        }
        C9605f c9605f = null;
        int i10 = 0;
        for (C9605f c9605f2 : this.f43891l) {
            if (!(c9605f2 instanceof C9606g)) {
                i10++;
                c9605f = c9605f2;
            }
        }
        if (c9605f != null && i10 == 1 && c9605f.f43889j) {
            C9606g c9606g = this.f43888i;
            if (c9606g != null) {
                if (!c9606g.f43889j) {
                    return;
                } else {
                    this.f43885f = this.f43887h * c9606g.f43886g;
                }
            }
            mo40474d(c9605f.f43886g + this.f43885f);
        }
        InterfaceC9603d interfaceC9603d3 = this.f43880a;
        if (interfaceC9603d3 != null) {
            interfaceC9603d3.mo40449a(this);
        }
    }

    /* renamed from: b */
    public void m40472b(InterfaceC9603d interfaceC9603d) {
        this.f43890k.add(interfaceC9603d);
        if (this.f43889j) {
            interfaceC9603d.mo40449a(interfaceC9603d);
        }
    }

    /* renamed from: c */
    public void m40473c() {
        this.f43891l.clear();
        this.f43890k.clear();
        this.f43889j = false;
        this.f43886g = 0;
        this.f43882c = false;
        this.f43881b = false;
    }

    /* renamed from: d */
    public void mo40474d(int i10) {
        if (this.f43889j) {
            return;
        }
        this.f43889j = true;
        this.f43886g = i10;
        for (InterfaceC9603d interfaceC9603d : this.f43890k) {
            interfaceC9603d.mo40449a(interfaceC9603d);
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f43883d.f43907b.m39646p());
        sb2.append(":");
        sb2.append(this.f43884e);
        sb2.append("(");
        sb2.append(this.f43889j ? Integer.valueOf(this.f43886g) : "unresolved");
        sb2.append(") <t=");
        sb2.append(this.f43891l.size());
        sb2.append(":d=");
        sb2.append(this.f43890k.size());
        sb2.append(">");
        return sb2.toString();
    }
}
