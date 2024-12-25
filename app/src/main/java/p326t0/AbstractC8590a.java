package p326t0;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import p326t0.C8591b;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:t0/a.class
 */
/* renamed from: t0.a */
/* loaded from: combined.jar:classes1.jar:t0/a.class */
public abstract class AbstractC8590a extends BaseAdapter implements Filterable, C8591b.a {

    /* renamed from: b */
    public boolean f40046b;

    /* renamed from: c */
    public boolean f40047c;

    /* renamed from: d */
    public Cursor f40048d;

    /* renamed from: e */
    public Context f40049e;

    /* renamed from: f */
    public int f40050f;

    /* renamed from: g */
    public a f40051g;

    /* renamed from: h */
    public DataSetObserver f40052h;

    /* renamed from: i */
    public C8591b f40053i;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:t0/a$a.class
     */
    /* renamed from: t0.a$a */
    /* loaded from: combined.jar:classes1.jar:t0/a$a.class */
    public class a extends ContentObserver {

        /* renamed from: a */
        public final AbstractC8590a f40054a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AbstractC8590a abstractC8590a) {
            super(new Handler());
            this.f40054a = abstractC8590a;
        }

        @Override // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
            return true;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z10) {
            this.f40054a.m36888h();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:t0/a$b.class
     */
    /* renamed from: t0.a$b */
    /* loaded from: combined.jar:classes1.jar:t0/a$b.class */
    public class b extends DataSetObserver {

        /* renamed from: a */
        public final AbstractC8590a f40055a;

        public b(AbstractC8590a abstractC8590a) {
            this.f40055a = abstractC8590a;
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            AbstractC8590a abstractC8590a = this.f40055a;
            abstractC8590a.f40046b = true;
            abstractC8590a.notifyDataSetChanged();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            AbstractC8590a abstractC8590a = this.f40055a;
            abstractC8590a.f40046b = false;
            abstractC8590a.notifyDataSetInvalidated();
        }
    }

    public AbstractC8590a(Context context, Cursor cursor, boolean z10) {
        m36886e(context, cursor, z10 ? 1 : 2);
    }

    /* renamed from: a */
    public void mo1417a(Cursor cursor) {
        Cursor m36889i = m36889i(cursor);
        if (m36889i != null) {
            m36889i.close();
        }
    }

    @Override // p326t0.C8591b.a
    /* renamed from: c */
    public Cursor mo36885c() {
        return this.f40048d;
    }

    public abstract CharSequence convertToString(Cursor cursor);

    /* renamed from: d */
    public abstract void mo1419d(View view, Context context, Cursor cursor);

    /* renamed from: e */
    public void m36886e(Context context, Cursor cursor, int i10) {
        b bVar;
        boolean z10 = false;
        if ((i10 & 1) == 1) {
            i10 |= 2;
            this.f40047c = true;
        } else {
            this.f40047c = false;
        }
        if (cursor != null) {
            z10 = true;
        }
        this.f40048d = cursor;
        this.f40046b = z10;
        this.f40049e = context;
        this.f40050f = z10 ? cursor.getColumnIndexOrThrow("_id") : -1;
        if ((i10 & 2) == 2) {
            this.f40051g = new a(this);
            bVar = new b(this);
        } else {
            bVar = null;
            this.f40051g = null;
        }
        this.f40052h = bVar;
        if (z10) {
            a aVar = this.f40051g;
            if (aVar != null) {
                cursor.registerContentObserver(aVar);
            }
            DataSetObserver dataSetObserver = this.f40052h;
            if (dataSetObserver != null) {
                cursor.registerDataSetObserver(dataSetObserver);
            }
        }
    }

    /* renamed from: f */
    public abstract View mo36887f(Context context, Cursor cursor, ViewGroup viewGroup);

    /* renamed from: g */
    public abstract View mo1420g(Context context, Cursor cursor, ViewGroup viewGroup);

    @Override // android.widget.Adapter
    public int getCount() {
        Cursor cursor;
        if (!this.f40046b || (cursor = this.f40048d) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i10, View view, ViewGroup viewGroup) {
        if (!this.f40046b) {
            return null;
        }
        this.f40048d.moveToPosition(i10);
        View view2 = view;
        if (view == null) {
            view2 = mo36887f(this.f40049e, this.f40048d, viewGroup);
        }
        mo1419d(view2, this.f40049e, this.f40048d);
        return view2;
    }

    @Override // android.widget.Filterable
    public Filter getFilter() {
        if (this.f40053i == null) {
            this.f40053i = new C8591b(this);
        }
        return this.f40053i;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i10) {
        Cursor cursor;
        if (!this.f40046b || (cursor = this.f40048d) == null) {
            return null;
        }
        cursor.moveToPosition(i10);
        return this.f40048d;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        Cursor cursor;
        if (this.f40046b && (cursor = this.f40048d) != null && cursor.moveToPosition(i10)) {
            return this.f40048d.getLong(this.f40050f);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) {
        if (!this.f40046b) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        }
        if (!this.f40048d.moveToPosition(i10)) {
            throw new IllegalStateException("couldn't move cursor to position " + i10);
        }
        View view2 = view;
        if (view == null) {
            view2 = mo1420g(this.f40049e, this.f40048d, viewGroup);
        }
        mo1419d(view2, this.f40049e, this.f40048d);
        return view2;
    }

    /* renamed from: h */
    public void m36888h() {
        Cursor cursor;
        if (!this.f40047c || (cursor = this.f40048d) == null || cursor.isClosed()) {
            return;
        }
        this.f40046b = this.f40048d.requery();
    }

    /* renamed from: i */
    public Cursor m36889i(Cursor cursor) {
        Cursor cursor2 = this.f40048d;
        if (cursor == cursor2) {
            return null;
        }
        if (cursor2 != null) {
            a aVar = this.f40051g;
            if (aVar != null) {
                cursor2.unregisterContentObserver(aVar);
            }
            DataSetObserver dataSetObserver = this.f40052h;
            if (dataSetObserver != null) {
                cursor2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f40048d = cursor;
        if (cursor != null) {
            a aVar2 = this.f40051g;
            if (aVar2 != null) {
                cursor.registerContentObserver(aVar2);
            }
            DataSetObserver dataSetObserver2 = this.f40052h;
            if (dataSetObserver2 != null) {
                cursor.registerDataSetObserver(dataSetObserver2);
            }
            this.f40050f = cursor.getColumnIndexOrThrow("_id");
            this.f40046b = true;
            notifyDataSetChanged();
        } else {
            this.f40050f = -1;
            this.f40046b = false;
            notifyDataSetInvalidated();
        }
        return cursor2;
    }
}
