package p077e8;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import p267p6.C7583h;
import p420y7.C9858i0;
import p420y7.InterfaceC9848d0;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:e8/c.class
 */
/* renamed from: e8.c */
/* loaded from: combined.jar:classes2.jar:e8/c.class */
public class C4650c implements InterfaceC9848d0<C4650c> {

    /* renamed from: a */
    public final long f27411a;

    /* renamed from: b */
    public final long f27412b;

    /* renamed from: c */
    public final long f27413c;

    /* renamed from: d */
    public final boolean f27414d;

    /* renamed from: e */
    public final long f27415e;

    /* renamed from: f */
    public final long f27416f;

    /* renamed from: g */
    public final long f27417g;

    /* renamed from: h */
    public final long f27418h;

    /* renamed from: i */
    public final C4662o f27419i;

    /* renamed from: j */
    public final C4659l f27420j;

    /* renamed from: k */
    public final Uri f27421k;

    /* renamed from: l */
    public final C4655h f27422l;

    /* renamed from: m */
    public final List<C4654g> f27423m;

    public C4650c(long j10, long j11, long j12, boolean z10, long j13, long j14, long j15, long j16, C4655h c4655h, C4662o c4662o, C4659l c4659l, Uri uri, List<C4654g> list) {
        this.f27411a = j10;
        this.f27412b = j11;
        this.f27413c = j12;
        this.f27414d = z10;
        this.f27415e = j13;
        this.f27416f = j14;
        this.f27417g = j15;
        this.f27418h = j16;
        this.f27422l = c4655h;
        this.f27419i = c4662o;
        this.f27421k = uri;
        this.f27420j = c4659l;
        this.f27423m = list == null ? Collections.emptyList() : list;
    }

    /* renamed from: c */
    public static ArrayList<C4648a> m23295c(List<C4648a> list, LinkedList<C9858i0> linkedList) {
        C9858i0 poll;
        C9858i0 poll2 = linkedList.poll();
        int i10 = poll2.f45227b;
        ArrayList<C4648a> arrayList = new ArrayList<>();
        do {
            int i11 = poll2.f45228c;
            C4648a c4648a = list.get(i11);
            List<AbstractC4657j> list2 = c4648a.f27403c;
            ArrayList arrayList2 = new ArrayList();
            do {
                arrayList2.add(list2.get(poll2.f45229d));
                poll = linkedList.poll();
                if (poll.f45227b != i10) {
                    break;
                }
                poll2 = poll;
            } while (poll.f45228c == i11);
            arrayList.add(new C4648a(c4648a.f27401a, c4648a.f27402b, arrayList2, c4648a.f27404d, c4648a.f27405e, c4648a.f27406f));
            poll2 = poll;
        } while (poll.f45227b == i10);
        linkedList.addFirst(poll);
        return arrayList;
    }

    @Override // p420y7.InterfaceC9848d0
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C4650c mo23296a(List<C9858i0> list) {
        long j10;
        long j11;
        LinkedList linkedList = new LinkedList(list);
        Collections.sort(linkedList);
        linkedList.add(new C9858i0(-1, -1, -1));
        ArrayList arrayList = new ArrayList();
        long j12 = 0;
        int i10 = 0;
        while (true) {
            j10 = -9223372036854775807L;
            if (i10 >= m23299e()) {
                break;
            }
            if (((C9858i0) linkedList.peek()).f45227b != i10) {
                long m23300f = m23300f(i10);
                j11 = j12;
                if (m23300f != -9223372036854775807L) {
                    j11 = j12 + m23300f;
                }
            } else {
                C4654g m23298d = m23298d(i10);
                arrayList.add(new C4654g(m23298d.f27444a, m23298d.f27445b - j12, m23295c(m23298d.f27446c, linkedList), m23298d.f27447d));
                j11 = j12;
            }
            i10++;
            j12 = j11;
        }
        long j13 = this.f27412b;
        if (j13 != -9223372036854775807L) {
            j10 = j13 - j12;
        }
        return new C4650c(this.f27411a, j10, this.f27413c, this.f27414d, this.f27415e, this.f27416f, this.f27417g, this.f27418h, this.f27422l, this.f27419i, this.f27420j, this.f27421k, arrayList);
    }

    /* renamed from: d */
    public final C4654g m23298d(int i10) {
        return this.f27423m.get(i10);
    }

    /* renamed from: e */
    public final int m23299e() {
        return this.f27423m.size();
    }

    /* renamed from: f */
    public final long m23300f(int i10) {
        long j10 = -9223372036854775807L;
        if (i10 == this.f27423m.size() - 1) {
            long j11 = this.f27412b;
            if (j11 != -9223372036854775807L) {
                j10 = j11 - this.f27423m.get(i10).f27445b;
            }
        } else {
            j10 = this.f27423m.get(i10 + 1).f27445b - this.f27423m.get(i10).f27445b;
        }
        return j10;
    }

    /* renamed from: g */
    public final long m23301g(int i10) {
        return C7583h.m32760d(m23300f(i10));
    }
}
