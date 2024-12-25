package p203lf;

import af.C0158a;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.FileProvider;
import androidx.recyclerview.widget.RecyclerView;
import com.maxdigitall.maxdigitaliptvbox.model.Myaudiofile;
import com.maxdigitall.maxdigitaliptvbox.view.activity.HoneyPlayer;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import nf.C6783a;
import ve.C9342c;
import ve.C9343d;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:lf/b.class
 */
/* renamed from: lf.b */
/* loaded from: combined.jar:classes2.jar:lf/b.class */
public class C5849b extends AbstractC5850c<C0158a, c> {

    /* renamed from: m */
    public static C6783a f32509m;

    /* renamed from: h */
    public int f32510h;

    /* renamed from: i */
    public int f32511i;

    /* renamed from: j */
    public Boolean f32512j;

    /* renamed from: k */
    public Context f32513k;

    /* renamed from: l */
    public ArrayList<Myaudiofile> f32514l;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:lf/b$a.class
     */
    /* renamed from: lf.b$a */
    /* loaded from: combined.jar:classes2.jar:lf/b$a.class */
    public class a implements View.OnClickListener {

        /* renamed from: b */
        public final c f32515b;

        /* renamed from: c */
        public final C5849b f32516c;

        public a(C5849b c5849b, c cVar) {
            this.f32516c = c5849b;
            this.f32515b = cVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (!view.isSelected() && this.f32516c.m28474k0()) {
                C9342c.m39377a(this.f32516c.f32526e).m39378b(2132018805);
                return;
            }
            if (view.isSelected()) {
                this.f32515b.f32524y.setSelected(false);
                C5849b.m28470g0(this.f32516c);
            } else {
                this.f32515b.f32524y.setSelected(true);
                C5849b.m28469f0(this.f32516c);
            }
            ((C0158a) this.f32516c.f32527f.get(this.f32515b.m4064n())).m703T(this.f32515b.f32524y.isSelected());
            InterfaceC5862o<T> interfaceC5862o = this.f32516c.f32528g;
            if (interfaceC5862o != 0) {
                interfaceC5862o.mo15598a(this.f32515b.f32524y.isSelected(), (C0158a) this.f32516c.f32527f.get(this.f32515b.m4064n()));
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:lf/b$b.class
     */
    /* renamed from: lf.b$b */
    /* loaded from: combined.jar:classes2.jar:lf/b$b.class */
    public class b implements View.OnClickListener {

        /* renamed from: b */
        public final C0158a f32517b;

        /* renamed from: c */
        public final C5849b f32518c;

        public b(C5849b c5849b, C0158a c0158a) {
            this.f32518c = c5849b;
            this.f32517b = c0158a;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Uri parse;
            Intent intent;
            try {
                Intent intent2 = new Intent("android.intent.action.VIEW");
                try {
                    if (Build.VERSION.SDK_INT >= 24) {
                        intent2.setFlags(1);
                        File file = new File(this.f32517b.m710z());
                        parse = FileProvider.m1874e(this.f32518c.f32526e, this.f32518c.f32526e.getApplicationContext().getPackageName() + ".provider", file);
                    } else {
                        parse = Uri.parse("file://" + this.f32517b.m710z());
                    }
                } catch (Exception e10) {
                    parse = Uri.parse("file://" + this.f32517b.m710z());
                }
                intent2.setDataAndType(parse, "audio/mp3");
                if (!C9343d.m39380a(this.f32518c.f32526e, intent2)) {
                    C9342c.m39377a(this.f32518c.f32526e).m39379c(this.f32518c.f32526e.getString(2132018799));
                    return;
                }
                C5849b c5849b = this.f32518c;
                if (c5849b.f32526e == null || !c5849b.f32512j.booleanValue()) {
                    return;
                }
                C6783a unused = C5849b.f32509m = new C6783a(this.f32518c.f32526e);
                if (C5849b.f32509m.m31285w() == 3) {
                    C5849b.f32509m.m31258Q(this.f32518c.f32513k.getResources().getString(2132017829));
                    intent = new Intent(this.f32518c.f32526e, (Class<?>) HoneyPlayer.class);
                } else {
                    intent = new Intent(this.f32518c.f32526e, (Class<?>) HoneyPlayer.class);
                }
                intent.putExtra("type", "devicedata");
                intent.putExtra("VIDEO_NUM", 0);
                intent.putExtra("VIDEO_PATH", this.f32517b.m710z());
                this.f32518c.f32526e.startActivity(intent);
            } catch (Exception e11) {
                C9342c.m39377a(this.f32518c.f32526e).m39379c(e11.getMessage());
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:lf/b$c.class
     */
    /* renamed from: lf.b$c */
    /* loaded from: combined.jar:classes2.jar:lf/b$c.class */
    public class c extends RecyclerView.AbstractC0674e0 {

        /* renamed from: A */
        public final C5849b f32519A;

        /* renamed from: u */
        public TextView f32520u;

        /* renamed from: v */
        public TextView f32521v;

        /* renamed from: w */
        public TextView f32522w;

        /* renamed from: x */
        public TextView f32523x;

        /* renamed from: y */
        public ImageView f32524y;

        /* renamed from: z */
        public ImageView f32525z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C5849b c5849b, View view) {
            super(view);
            this.f32519A = c5849b;
            this.f32520u = (TextView) view.findViewById(2131429358);
            this.f32521v = (TextView) view.findViewById(2131429609);
            this.f32522w = (TextView) view.findViewById(2131429427);
            this.f32523x = (TextView) view.findViewById(2131429510);
            this.f32524y = (ImageView) view.findViewById(2131427737);
            this.f32525z = (ImageView) view.findViewById(2131428104);
        }
    }

    public C5849b(Context context, int i10) {
        this(context, new ArrayList(), i10);
    }

    public C5849b(Context context, ArrayList<C0158a> arrayList, int i10) {
        super(context, arrayList);
        this.f32511i = 0;
        this.f32512j = Boolean.TRUE;
        this.f32514l = new ArrayList<>();
        this.f32510h = i10;
        this.f32513k = context;
    }

    /* renamed from: f0 */
    public static /* synthetic */ int m28469f0(C5849b c5849b) {
        int i10 = c5849b.f32511i;
        c5849b.f32511i = i10 + 1;
        return i10;
    }

    /* renamed from: g0 */
    public static /* synthetic */ int m28470g0(C5849b c5849b) {
        int i10 = c5849b.f32511i;
        c5849b.f32511i = i10 - 1;
        return i10;
    }

    /* renamed from: k0 */
    public boolean m28474k0() {
        return this.f32511i >= this.f32510h;
    }

    /* renamed from: l0 */
    public ArrayList<Myaudiofile> m28475l0(ArrayList<Myaudiofile> arrayList) {
        this.f32514l = arrayList;
        return arrayList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0677h
    @SuppressLint({"SetTextI18n"})
    /* renamed from: m0, reason: merged with bridge method [inline-methods] */
    public void mo2996G(c cVar, int i10) {
        C0158a c0158a = (C0158a) this.f32527f.get(i10);
        try {
            this.f32514l.get(i10).m14885a();
            cVar.f32521v.setText("Size: " + this.f32514l.get(i10).m14889e());
            cVar.f32520u.setText(this.f32514l.get(i10).m14888d().substring(0, 1).toUpperCase() + this.f32514l.get(i10).m14888d().substring(1));
            cVar.f32523x.setText("Modified:" + new Date(this.f32514l.get(i10).m14887c()));
            cVar.f32522w.setText("Duration: " + this.f32514l.get(i10).m14886b());
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        try {
            if (c0158a.m696B()) {
                cVar.f32524y.setSelected(true);
            } else {
                cVar.f32524y.setSelected(false);
            }
        } catch (Exception e11) {
        }
        try {
            if (this.f32514l.get(i10).m14885a() != null) {
                cVar.f32525z.setImageBitmap(this.f32514l.get(i10).m14885a());
            } else {
                cVar.f32525z.setImageDrawable(this.f32513k.getResources().getDrawable(2131231400));
            }
        } catch (Exception e12) {
            cVar.f32525z.setImageDrawable(this.f32513k.getResources().getDrawable(2131231400));
        }
        cVar.f32524y.setOnClickListener(new a(this, cVar));
        cVar.f4620a.setOnClickListener(new b(this, c0158a));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0677h
    /* renamed from: n */
    public int mo3013n() {
        return this.f32527f.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0677h
    /* renamed from: n0, reason: merged with bridge method [inline-methods] */
    public c mo2998J(ViewGroup viewGroup, int i10) {
        return new c(this, LayoutInflater.from(this.f32526e).inflate(2131624565, viewGroup, false));
    }

    /* renamed from: o0 */
    public void m28478o0(int i10) {
        this.f32511i = i10;
    }
}
