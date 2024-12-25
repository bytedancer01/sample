package androidx.recyclerview.widget;

import androidx.recyclerview.widget.C0702a;
import java.util.List;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/recyclerview/widget/k.class
 */
/* renamed from: androidx.recyclerview.widget.k */
/* loaded from: combined.jar:classes1.jar:androidx/recyclerview/widget/k.class */
public class C0712k {

    /* renamed from: a */
    public final a f4950a;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/recyclerview/widget/k$a.class
     */
    /* renamed from: androidx.recyclerview.widget.k$a */
    /* loaded from: combined.jar:classes1.jar:androidx/recyclerview/widget/k$a.class */
    public interface a {
        /* renamed from: a */
        C0702a.b mo4424a(int i10, int i11, int i12, Object obj);

        /* renamed from: b */
        void mo4425b(C0702a.b bVar);
    }

    public C0712k(a aVar) {
        this.f4950a = aVar;
    }

    /* renamed from: a */
    public final int m4605a(List<C0702a.b> list) {
        boolean z10;
        int size = list.size() - 1;
        boolean z11 = false;
        while (true) {
            boolean z12 = z11;
            if (size < 0) {
                return -1;
            }
            if (list.get(size).f4763a == 8) {
                z10 = z12;
                if (z12) {
                    return size;
                }
            } else {
                z10 = true;
            }
            size--;
            z11 = z10;
        }
    }

    /* renamed from: b */
    public void m4606b(List<C0702a.b> list) {
        while (true) {
            int m4605a = m4605a(list);
            if (m4605a == -1) {
                return;
            } else {
                m4608d(list, m4605a, m4605a + 1);
            }
        }
    }

    /* renamed from: c */
    public final void m4607c(List<C0702a.b> list, int i10, C0702a.b bVar, int i11, C0702a.b bVar2) {
        int i12 = bVar.f4766d;
        int i13 = bVar2.f4764b;
        int i14 = i12 < i13 ? -1 : 0;
        int i15 = bVar.f4764b;
        int i16 = i14;
        if (i15 < i13) {
            i16 = i14 + 1;
        }
        if (i13 <= i15) {
            bVar.f4764b = i15 + bVar2.f4766d;
        }
        int i17 = bVar2.f4764b;
        if (i17 <= i12) {
            bVar.f4766d = i12 + bVar2.f4766d;
        }
        bVar2.f4764b = i17 + i16;
        list.set(i10, bVar2);
        list.set(i11, bVar);
    }

    /* renamed from: d */
    public final void m4608d(List<C0702a.b> list, int i10, int i11) {
        C0702a.b bVar = list.get(i10);
        C0702a.b bVar2 = list.get(i11);
        int i12 = bVar2.f4763a;
        if (i12 == 1) {
            m4607c(list, i10, bVar, i11, bVar2);
        } else if (i12 == 2) {
            m4609e(list, i10, bVar, i11, bVar2);
        } else {
            if (i12 != 4) {
                return;
            }
            m4610f(list, i10, bVar, i11, bVar2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x01a4, code lost:
    
        if (r12 > r11.f4764b) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0213, code lost:
    
        r9.f4766d = r12 - r11.f4766d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0210, code lost:
    
        if (r12 >= r11.f4764b) goto L65;
     */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m4609e(java.util.List<androidx.recyclerview.widget.C0702a.b> r7, int r8, androidx.recyclerview.widget.C0702a.b r9, int r10, androidx.recyclerview.widget.C0702a.b r11) {
        /*
            Method dump skipped, instructions count: 601
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.C0712k.m4609e(java.util.List, int, androidx.recyclerview.widget.a$b, int, androidx.recyclerview.widget.a$b):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x006d  */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m4610f(java.util.List<androidx.recyclerview.widget.C0702a.b> r7, int r8, androidx.recyclerview.widget.C0702a.b r9, int r10, androidx.recyclerview.widget.C0702a.b r11) {
        /*
            Method dump skipped, instructions count: 263
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.C0712k.m4610f(java.util.List, int, androidx.recyclerview.widget.a$b, int, androidx.recyclerview.widget.a$b):void");
    }
}
