package p203lf;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.maxdigitall.maxdigitaliptvbox.model.database.DatabaseHandler;
import java.util.List;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:lf/d.class
 */
/* renamed from: lf.d */
/* loaded from: combined.jar:classes2.jar:lf/d.class */
public class C5851d extends BaseAdapter {

    /* renamed from: b */
    public List<String> f32529b;

    /* renamed from: c */
    public List<String> f32530c;

    /* renamed from: d */
    public LayoutInflater f32531d;

    /* renamed from: e */
    public Context f32532e;

    /* renamed from: f */
    public DatabaseHandler f32533f;

    /* renamed from: g */
    public a f32534g;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:lf/d$a.class
     */
    /* renamed from: lf.d$a */
    /* loaded from: combined.jar:classes2.jar:lf/d$a.class */
    public static class a {

        /* renamed from: a */
        public TextView f32535a;

        /* renamed from: b */
        public ImageView f32536b;

        /* renamed from: c */
        public LinearLayout f32537c;
    }

    public C5851d(Context context, List<String> list) {
        this.f32530c = list;
        this.f32529b = list;
        this.f32532e = context;
        this.f32531d = LayoutInflater.from(context);
        this.f32533f = new DatabaseHandler(context);
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f32530c.size();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i10) {
        return this.f32530c.get(i10);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        return i10;
    }

    @Override // android.widget.Adapter
    @SuppressLint({"InflateParams"})
    public View getView(int i10, View view, ViewGroup viewGroup) {
        if (view == null) {
            try {
                View inflate = ((LayoutInflater) this.f32532e.getSystemService("layout_inflater")).inflate(2131624505, (ViewGroup) null);
                a aVar = new a();
                this.f32534g = aVar;
                aVar.f32535a = (TextView) inflate.findViewById(2131428305);
                this.f32534g.f32536b = (ImageView) inflate.findViewById(2131429499);
                this.f32534g.f32537c = (LinearLayout) inflate.findViewById(2131428433);
                view = inflate;
                inflate.setTag(this.f32534g);
                view = inflate;
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        } else {
            this.f32534g = (a) view.getTag();
        }
        try {
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        if (!this.f32530c.get(i10).endsWith(".m3u") && !this.f32530c.get(i10).endsWith(".m3u8")) {
            this.f32534g.f32536b.setBackgroundResource(2131231093);
            this.f32534g.f32535a.setText(this.f32530c.get(i10));
            return view;
        }
        this.f32534g.f32536b.setBackgroundResource(2131231470);
        this.f32534g.f32535a.setText(this.f32530c.get(i10));
        return view;
    }
}
