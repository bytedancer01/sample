package p326t0;

import android.database.Cursor;
import android.widget.Filter;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:t0/b.class
 */
/* renamed from: t0.b */
/* loaded from: combined.jar:classes1.jar:t0/b.class */
public class C8591b extends Filter {

    /* renamed from: a */
    public a f40056a;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:t0/b$a.class
     */
    /* renamed from: t0.b$a */
    /* loaded from: combined.jar:classes1.jar:t0/b$a.class */
    public interface a {
        /* renamed from: a */
        void mo1417a(Cursor cursor);

        /* renamed from: b */
        Cursor mo1418b(CharSequence charSequence);

        /* renamed from: c */
        Cursor mo36885c();

        CharSequence convertToString(Cursor cursor);
    }

    public C8591b(a aVar) {
        this.f40056a = aVar;
    }

    @Override // android.widget.Filter
    public CharSequence convertResultToString(Object obj) {
        return this.f40056a.convertToString((Cursor) obj);
    }

    @Override // android.widget.Filter
    public Filter.FilterResults performFiltering(CharSequence charSequence) {
        Cursor mo1418b = this.f40056a.mo1418b(charSequence);
        Filter.FilterResults filterResults = new Filter.FilterResults();
        if (mo1418b != null) {
            filterResults.count = mo1418b.getCount();
        } else {
            filterResults.count = 0;
            mo1418b = null;
        }
        filterResults.values = mo1418b;
        return filterResults;
    }

    @Override // android.widget.Filter
    public void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        Cursor mo36885c = this.f40056a.mo36885c();
        Object obj = filterResults.values;
        if (obj == null || obj == mo36885c) {
            return;
        }
        this.f40056a.mo1417a((Cursor) obj);
    }
}
