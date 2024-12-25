package p107g1;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Arrays;
import p050d0.C4289a;
import p107g1.C4931c;
import p175k0.C5441b;
import p175k0.C5449j;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:g1/b.class
 */
/* renamed from: g1.b */
/* loaded from: combined.jar:classes1.jar:g1/b.class */
public class C4930b extends AbstractC4929a<Cursor> {

    /* renamed from: p */
    public final C4931c<Cursor>.a f28643p;

    /* renamed from: q */
    public Uri f28644q;

    /* renamed from: r */
    public String[] f28645r;

    /* renamed from: s */
    public String f28646s;

    /* renamed from: t */
    public String[] f28647t;

    /* renamed from: u */
    public String f28648u;

    /* renamed from: v */
    public Cursor f28649v;

    /* renamed from: w */
    public C5441b f28650w;

    public C4930b(Context context) {
        super(context);
        this.f28643p = new C4931c.a(this);
    }

    @Override // p107g1.AbstractC4929a
    /* renamed from: A */
    public void mo24869A() {
        super.mo24869A();
        synchronized (this) {
            C5441b c5441b = this.f28650w;
            if (c5441b != null) {
                c5441b.m27190a();
            }
        }
    }

    @Override // p107g1.C4931c
    /* renamed from: I, reason: merged with bridge method [inline-methods] */
    public void mo24892f(Cursor cursor) {
        if (m24904k()) {
            if (cursor != null) {
                cursor.close();
                return;
            }
            return;
        }
        Cursor cursor2 = this.f28649v;
        this.f28649v = cursor;
        if (m24905l()) {
            super.mo24892f(cursor);
        }
        if (cursor2 == null || cursor2 == cursor || cursor2.isClosed()) {
            return;
        }
        cursor2.close();
    }

    @Override // p107g1.AbstractC4929a
    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    public Cursor mo24874F() {
        synchronized (this) {
            if (m24873E()) {
                throw new C5449j();
            }
            this.f28650w = new C5441b();
        }
        try {
            Cursor m21721a = C4289a.m21721a(m24902i().getContentResolver(), this.f28644q, this.f28645r, this.f28646s, this.f28647t, this.f28648u, this.f28650w);
            if (m21721a != null) {
                try {
                    m21721a.getCount();
                    m21721a.registerContentObserver(this.f28643p);
                } catch (RuntimeException e10) {
                    m21721a.close();
                    throw e10;
                }
            }
            synchronized (this) {
                this.f28650w = null;
            }
            return m21721a;
        } catch (Throwable th2) {
            synchronized (this) {
                this.f28650w = null;
                throw th2;
            }
        }
    }

    @Override // p107g1.AbstractC4929a
    /* renamed from: K, reason: merged with bridge method [inline-methods] */
    public void mo24875G(Cursor cursor) {
        if (cursor == null || cursor.isClosed()) {
            return;
        }
        cursor.close();
    }

    /* renamed from: L */
    public void m24887L(String[] strArr) {
        this.f28645r = strArr;
    }

    /* renamed from: M */
    public void m24888M(String str) {
        this.f28646s = str;
    }

    /* renamed from: N */
    public void m24889N(String[] strArr) {
        this.f28647t = strArr;
    }

    /* renamed from: O */
    public void m24890O(String str) {
        this.f28648u = str;
    }

    /* renamed from: P */
    public void m24891P(Uri uri) {
        this.f28644q = uri;
    }

    @Override // p107g1.AbstractC4929a, p107g1.C4931c
    @Deprecated
    /* renamed from: g */
    public void mo24877g(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.mo24877g(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("mUri=");
        printWriter.println(this.f28644q);
        printWriter.print(str);
        printWriter.print("mProjection=");
        printWriter.println(Arrays.toString(this.f28645r));
        printWriter.print(str);
        printWriter.print("mSelection=");
        printWriter.println(this.f28646s);
        printWriter.print(str);
        printWriter.print("mSelectionArgs=");
        printWriter.println(Arrays.toString(this.f28647t));
        printWriter.print(str);
        printWriter.print("mSortOrder=");
        printWriter.println(this.f28648u);
        printWriter.print(str);
        printWriter.print("mCursor=");
        printWriter.println(this.f28649v);
        printWriter.print(str);
        printWriter.print("mContentChanged=");
        printWriter.println(this.f28658h);
    }

    @Override // p107g1.C4931c
    /* renamed from: q */
    public void mo24893q() {
        super.mo24893q();
        mo24895s();
        Cursor cursor = this.f28649v;
        if (cursor != null && !cursor.isClosed()) {
            this.f28649v.close();
        }
        this.f28649v = null;
    }

    @Override // p107g1.C4931c
    /* renamed from: r */
    public void mo24894r() {
        Cursor cursor = this.f28649v;
        if (cursor != null) {
            mo24892f(cursor);
        }
        if (m24913y() || this.f28649v == null) {
            m24901h();
        }
    }

    @Override // p107g1.C4931c
    /* renamed from: s */
    public void mo24895s() {
        m24897b();
    }
}
