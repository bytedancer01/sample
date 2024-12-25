package tg;

import java.net.SocketException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import ug.C9181f;
import ug.C9183h;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:tg/j.class
 */
/* renamed from: tg.j */
/* loaded from: combined.jar:classes2.jar:tg/j.class */
public final class C8734j {

    /* renamed from: f */
    public static final C8734j f40619f;

    /* renamed from: a */
    public final int f40620a;

    /* renamed from: b */
    public final long f40621b;

    /* renamed from: c */
    public final LinkedList<C8733i> f40622c = new LinkedList<>();

    /* renamed from: d */
    public final ExecutorService f40623d = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), C9183h.m38698r("OkHttp ConnectionPool", true));

    /* renamed from: e */
    public final Runnable f40624e = new a(this);

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:tg/j$a.class
     */
    /* renamed from: tg.j$a */
    /* loaded from: combined.jar:classes2.jar:tg/j$a.class */
    public class a implements Runnable {

        /* renamed from: b */
        public final C8734j f40625b;

        public a(C8734j c8734j) {
            this.f40625b = c8734j;
        }

        @Override // java.lang.Runnable
        public void run() {
            ArrayList arrayList = new ArrayList(2);
            synchronized (this.f40625b) {
                ListIterator listIterator = this.f40625b.f40622c.listIterator(this.f40625b.f40622c.size());
                int i10 = 0;
                while (listIterator.hasPrevious()) {
                    C8733i c8733i = (C8733i) listIterator.previous();
                    if (c8733i.m37348j() && !c8733i.m37350l(this.f40625b.f40621b)) {
                        if (c8733i.m37351m()) {
                            i10++;
                        }
                    }
                    listIterator.remove();
                    arrayList.add(c8733i);
                    if (arrayList.size() == 2) {
                        break;
                    }
                }
                ListIterator listIterator2 = this.f40625b.f40622c.listIterator(this.f40625b.f40622c.size());
                while (listIterator2.hasPrevious() && i10 > this.f40625b.f40620a) {
                    C8733i c8733i2 = (C8733i) listIterator2.previous();
                    if (c8733i2.m37351m()) {
                        arrayList.add(c8733i2);
                        listIterator2.remove();
                        i10--;
                    }
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C9183h.m38684d(((C8733i) it.next()).m37346h());
            }
        }
    }

    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException
        */
    static {
        /*
            java.lang.String r0 = "http.keepAlive"
            java.lang.String r0 = java.lang.System.getProperty(r0)
            r8 = r0
            java.lang.String r0 = "http.keepAliveDuration"
            java.lang.String r0 = java.lang.System.getProperty(r0)
            r10 = r0
            java.lang.String r0 = "http.maxConnections"
            java.lang.String r0 = java.lang.System.getProperty(r0)
            r9 = r0
            r0 = r10
            if (r0 == 0) goto L21
            r0 = r10
            long r0 = java.lang.Long.parseLong(r0)
            r6 = r0
            goto L25
        L21:
            r0 = 300000(0x493e0, double:1.482197E-318)
            r6 = r0
        L25:
            r0 = r8
            if (r0 == 0) goto L3d
            r0 = r8
            boolean r0 = java.lang.Boolean.parseBoolean(r0)
            if (r0 != 0) goto L3d
            tg.j r0 = new tg.j
            r1 = r0
            r2 = 0
            r3 = r6
            r1.<init>(r2, r3)
            r8 = r0
            goto L57
        L3d:
            tg.j r0 = new tg.j
            r8 = r0
            r0 = r9
            if (r0 == 0) goto L51
            r0 = r8
            r1 = r9
            int r1 = java.lang.Integer.parseInt(r1)
            r2 = r6
            r0.<init>(r1, r2)
            goto L57
        L51:
            r0 = r8
            r1 = 5
            r2 = r6
            r0.<init>(r1, r2)
        L57:
            r0 = r8
            tg.C8734j.f40619f = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tg.C8734j.m46083clinit():void");
    }

    public C8734j(int i10, long j10) {
        this.f40620a = i10;
        this.f40621b = j10 * 1000 * 1000;
    }

    /* renamed from: e */
    public static C8734j m37366e() {
        return f40619f;
    }

    /* renamed from: d */
    public C8733i m37367d(C8725a c8725a) {
        C8733i c8733i;
        synchronized (this) {
            LinkedList<C8733i> linkedList = this.f40622c;
            ListIterator<C8733i> listIterator = linkedList.listIterator(linkedList.size());
            while (true) {
                c8733i = null;
                if (!listIterator.hasPrevious()) {
                    break;
                }
                c8733i = listIterator.previous();
                if (c8733i.m37345g().m37539a().equals(c8725a) && c8733i.m37348j() && System.nanoTime() - c8733i.m37343e() < this.f40621b) {
                    listIterator.remove();
                    if (c8733i.m37353o()) {
                        break;
                    }
                    try {
                        C9181f.m38667e().mo38673i(c8733i.m37346h());
                        break;
                    } catch (SocketException e10) {
                        C9183h.m38684d(c8733i.m37346h());
                        C9181f.m38667e().m38672h("Unable to tagSocket(): " + e10);
                    }
                }
            }
            if (c8733i != null && c8733i.m37353o()) {
                this.f40622c.addFirst(c8733i);
            }
            this.f40623d.execute(this.f40624e);
        }
        return c8733i;
    }

    /* renamed from: f */
    public void m37368f(C8733i c8733i) {
        if (!c8733i.m37353o() && c8733i.m37339a()) {
            if (!c8733i.m37348j()) {
                C9183h.m38684d(c8733i.m37346h());
                return;
            }
            try {
                C9181f.m38667e().mo38675k(c8733i.m37346h());
                synchronized (this) {
                    this.f40622c.addFirst(c8733i);
                    c8733i.m37347i();
                    c8733i.m37357s();
                }
                this.f40623d.execute(this.f40624e);
            } catch (SocketException e10) {
                C9181f.m38667e().m38672h("Unable to untagSocket(): " + e10);
                C9183h.m38684d(c8733i.m37346h());
            }
        }
    }

    /* renamed from: g */
    public void m37369g(C8733i c8733i) {
        if (!c8733i.m37353o()) {
            throw new IllegalArgumentException();
        }
        this.f40623d.execute(this.f40624e);
        if (c8733i.m37348j()) {
            synchronized (this) {
                this.f40622c.addFirst(c8733i);
            }
        }
    }
}
