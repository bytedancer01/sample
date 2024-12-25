package p326t0;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:t0/c.class
 */
/* renamed from: t0.c */
/* loaded from: combined.jar:classes1.jar:t0/c.class */
public abstract class AbstractC8592c extends AbstractC8590a {

    /* renamed from: j */
    public int f40057j;

    /* renamed from: k */
    public int f40058k;

    /* renamed from: l */
    public LayoutInflater f40059l;

    @Deprecated
    public AbstractC8592c(Context context, int i10, Cursor cursor, boolean z10) {
        super(context, cursor, z10);
        this.f40058k = i10;
        this.f40057j = i10;
        this.f40059l = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    @Override // p326t0.AbstractC8590a
    /* renamed from: f */
    public View mo36887f(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f40059l.inflate(this.f40058k, viewGroup, false);
    }

    @Override // p326t0.AbstractC8590a
    /* renamed from: g */
    public View mo1420g(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f40059l.inflate(this.f40057j, viewGroup, false);
    }
}
