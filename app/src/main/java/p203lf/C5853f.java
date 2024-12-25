package p203lf;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.maxdigitall.maxdigitaliptvbox.model.database.DatabaseHandler;
import java.util.List;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:lf/f.class
 */
/* renamed from: lf.f */
/* loaded from: combined.jar:classes2.jar:lf/f.class */
public class C5853f extends BaseAdapter {

    /* renamed from: b */
    public final String f32562b;

    /* renamed from: c */
    public List<String> f32563c;

    /* renamed from: d */
    public List<String> f32564d;

    /* renamed from: e */
    public LayoutInflater f32565e;

    /* renamed from: f */
    public Context f32566f;

    /* renamed from: g */
    public DatabaseHandler f32567g;

    /* renamed from: h */
    public a f32568h;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:lf/f$a.class
     */
    /* renamed from: lf.f$a */
    /* loaded from: combined.jar:classes2.jar:lf/f$a.class */
    public static class a {

        /* renamed from: a */
        public TextView f32569a;

        /* renamed from: b */
        public ImageView f32570b;

        /* renamed from: c */
        public LinearLayout f32571c;
    }

    public C5853f(Context context, List<String> list, String str) {
        this.f32564d = list;
        this.f32563c = list;
        this.f32566f = context;
        this.f32565e = LayoutInflater.from(context);
        this.f32567g = new DatabaseHandler(context);
        this.f32562b = str;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f32564d.size();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i10) {
        return this.f32564d.get(i10);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        return i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x018d A[Catch: Exception -> 0x01db, TryCatch #1 {Exception -> 0x01db, blocks: (B:5:0x0085, B:8:0x00b9, B:10:0x00c2, B:11:0x0185, B:13:0x018d, B:15:0x019a, B:17:0x01a6, B:21:0x01af, B:22:0x01c1, B:23:0x00ca, B:25:0x00d2, B:28:0x00e6, B:30:0x00fb, B:33:0x0113, B:34:0x011e, B:36:0x0127, B:37:0x012f, B:39:0x0144, B:42:0x015c, B:43:0x0167, B:44:0x0172, B:46:0x017a), top: B:4:0x0085 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x01c1 A[Catch: Exception -> 0x01db, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x01db, blocks: (B:5:0x0085, B:8:0x00b9, B:10:0x00c2, B:11:0x0185, B:13:0x018d, B:15:0x019a, B:17:0x01a6, B:21:0x01af, B:22:0x01c1, B:23:0x00ca, B:25:0x00d2, B:28:0x00e6, B:30:0x00fb, B:33:0x0113, B:34:0x011e, B:36:0x0127, B:37:0x012f, B:39:0x0144, B:42:0x015c, B:43:0x0167, B:44:0x0172, B:46:0x017a), top: B:4:0x0085 }] */
    @Override // android.widget.Adapter
    @android.annotation.SuppressLint({"InflateParams"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View getView(int r5, android.view.View r6, android.view.ViewGroup r7) {
        /*
            Method dump skipped, instructions count: 482
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p203lf.C5853f.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }
}
