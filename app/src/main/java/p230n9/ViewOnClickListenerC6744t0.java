package p230n9;

import android.content.Context;
import android.view.View;
import android.widget.ArrayAdapter;
import com.google.android.gms.cast.MediaTrack;
import java.util.ArrayList;
import java.util.List;
import p216m9.C5977o;
import p422y9.C9935o;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:n9/t0.class
 */
/* renamed from: n9.t0 */
/* loaded from: combined.jar:classes2.jar:n9/t0.class */
public final class ViewOnClickListenerC6744t0 extends ArrayAdapter implements View.OnClickListener {

    /* renamed from: b */
    public final Context f35222b;

    /* renamed from: c */
    public int f35223c;

    public ViewOnClickListenerC6744t0(Context context, List list, int i10) {
        super(context, C5977o.f33542e, list == null ? new ArrayList() : list);
        this.f35222b = context;
        this.f35223c = i10;
    }

    /* renamed from: a */
    public final MediaTrack m31072a() {
        int i10 = this.f35223c;
        if (i10 < 0 || i10 >= getCount()) {
            return null;
        }
        return (MediaTrack) getItem(this.f35223c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x00d7, code lost:
    
        if (android.text.TextUtils.isEmpty(r10) == false) goto L21;
     */
    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View getView(int r9, android.view.View r10, android.view.ViewGroup r11) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p230n9.ViewOnClickListenerC6744t0.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f35223c = ((Integer) C9935o.m41850j(((C6742s0) C9935o.m41850j((C6742s0) view.getTag())).f35218b.getTag())).intValue();
        notifyDataSetChanged();
    }
}
