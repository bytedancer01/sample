package p203lf;

import af.C0163f;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.support.v4.media.session.PlaybackStateCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.amazonaws.services.p045s3.model.InstructionFileId;
import com.maxdigitall.maxdigitaliptvbox.model.Mylist;
import com.maxdigitall.maxdigitaliptvbox.view.activity.HoneyPlayer;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import nf.C6783a;
import p329t3.C8617g;
import ve.C9342c;
import ve.C9343d;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:lf/z.class
 */
/* renamed from: lf.z */
/* loaded from: combined.jar:classes2.jar:lf/z.class */
public class C5873z extends AbstractC5850c<C0163f, b> {

    /* renamed from: q */
    public static C6783a f32914q;

    /* renamed from: h */
    public boolean f32915h;

    /* renamed from: i */
    public int f32916i;

    /* renamed from: j */
    public int f32917j;

    /* renamed from: k */
    public String f32918k;

    /* renamed from: l */
    public Boolean f32919l;

    /* renamed from: m */
    public long f32920m;

    /* renamed from: n */
    public String f32921n;

    /* renamed from: o */
    public ArrayList<Mylist> f32922o;

    /* renamed from: p */
    public ArrayList<String> f32923p;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:lf/z$a.class
     */
    /* renamed from: lf.z$a */
    /* loaded from: combined.jar:classes2.jar:lf/z$a.class */
    public class a implements View.OnClickListener {

        /* renamed from: b */
        public final C0163f f32924b;

        /* renamed from: c */
        public final C5873z f32925c;

        public a(C5873z c5873z, C0163f c0163f) {
            this.f32925c = c5873z;
            this.f32924b = c0163f;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Uri parse;
            Intent intent;
            try {
                Intent intent2 = new Intent("android.intent.action.VIEW");
                if (Build.VERSION.SDK_INT >= 24) {
                    intent2.setFlags(1);
                    File file = new File(this.f32924b.m710z());
                    this.f32925c.f32920m = file.length() / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
                    parse = Uri.fromFile(file);
                } else {
                    parse = Uri.parse("file://" + this.f32924b.m710z());
                }
                intent2.setDataAndType(parse, "video/mp4");
                String substring = this.f32924b.m710z().substring(0, this.f32924b.m710z().lastIndexOf(InstructionFileId.DOT));
                this.f32925c.f32921n = substring.substring(substring.lastIndexOf("/") + 1);
                if (!C9343d.m39380a(this.f32925c.f32526e, intent2)) {
                    C9342c.m39377a(this.f32925c.f32526e).m39379c(this.f32925c.f32526e.getString(2132018802));
                    return;
                }
                C5873z c5873z = this.f32925c;
                if (c5873z.f32526e == null || !c5873z.f32919l.booleanValue()) {
                    return;
                }
                C6783a unused = C5873z.f32914q = new C6783a(this.f32925c.f32526e);
                if (C5873z.f32914q.m31285w() == 3) {
                    C5873z.f32914q.m31258Q("Hardware Decoder");
                    intent = new Intent(this.f32925c.f32526e, (Class<?>) HoneyPlayer.class);
                } else {
                    intent = new Intent(this.f32925c.f32526e, (Class<?>) HoneyPlayer.class);
                }
                intent.putExtra("type", "devicedata");
                intent.putExtra("VIDEO_NUM", 0);
                intent.putExtra("VIDEO_PATH", this.f32924b.m710z());
                this.f32925c.f32526e.startActivity(intent);
            } catch (Exception e10) {
                C9342c.m39377a(this.f32925c.f32526e).m39379c(e10.getMessage());
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:lf/z$b.class
     */
    /* renamed from: lf.z$b */
    /* loaded from: combined.jar:classes2.jar:lf/z$b.class */
    public class b extends RecyclerView.AbstractC0674e0 {

        /* renamed from: u */
        public ImageView f32926u;

        /* renamed from: v */
        public TextView f32927v;

        /* renamed from: w */
        public TextView f32928w;

        /* renamed from: x */
        public TextView f32929x;

        /* renamed from: y */
        public TextView f32930y;

        /* renamed from: z */
        public final C5873z f32931z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C5873z c5873z, View view) {
            super(view);
            this.f32931z = c5873z;
            this.f32926u = (ImageView) view.findViewById(2131428235);
            TextView textView = (TextView) view.findViewById(2131429646);
            this.f32930y = textView;
            textView.setSelected(true);
            this.f32928w = (TextView) view.findViewById(2131429649);
            this.f32929x = (TextView) view.findViewById(2131429510);
            this.f32927v = (TextView) view.findViewById(2131429645);
        }
    }

    public C5873z(Context context, ArrayList<C0163f> arrayList, boolean z10, int i10) {
        super(context, arrayList);
        this.f32917j = 0;
        this.f32919l = Boolean.TRUE;
        this.f32922o = new ArrayList<>();
        this.f32923p = new ArrayList<>();
        this.f32915h = z10;
        this.f32916i = i10;
    }

    public C5873z(Context context, boolean z10, int i10) {
        this(context, new ArrayList(), z10, i10);
    }

    /* renamed from: i0 */
    public boolean m28678i0() {
        return this.f32917j >= this.f32916i;
    }

    /* renamed from: j0 */
    public ArrayList<Mylist> m28679j0(ArrayList<Mylist> arrayList) {
        this.f32922o = arrayList;
        return arrayList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0677h
    /* renamed from: k0, reason: merged with bridge method [inline-methods] */
    public void mo2996G(b bVar, int i10) {
        bVar.f32926u.setVisibility(0);
        C0163f c0163f = (C0163f) (this.f32915h ? this.f32527f.get(i10 - 1) : this.f32527f.get(i10));
        try {
            C8617g.m37004u(this.f32526e).m37029q(c0163f.m710z()).mo36984k(bVar.f32926u);
        } catch (Exception e10) {
        }
        c0163f.m696B();
        bVar.f4620a.setOnClickListener(new a(this, c0163f));
        try {
            this.f32922o.get(i10).m14895f();
            this.f32922o.get(i10).m14896g();
            this.f32922o.get(i10).m14894e();
            this.f32922o.get(i10).m14890a();
            this.f32922o.get(i10).m14891b();
            this.f32922o.get(i10).m14892c();
            this.f32922o.get(i10).m14893d();
            bVar.f32929x.setText("Modified:" + new Date(this.f32922o.get(i10).m14894e()));
            bVar.f32927v.setText("Duration: " + this.f32922o.get(i10).m14890a());
            bVar.f32930y.setText(this.f32922o.get(i10).m14895f());
            bVar.f32928w.setText("Size: " + this.f32922o.get(i10).m14896g() + " video/" + this.f32922o.get(i10).m14891b() + " " + this.f32922o.get(i10).m14893d() + "x" + this.f32922o.get(i10).m14892c());
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0677h
    /* renamed from: l0, reason: merged with bridge method [inline-methods] */
    public b mo2998J(ViewGroup viewGroup, int i10) {
        View inflate = LayoutInflater.from(this.f32526e).inflate(2131624567, viewGroup, false);
        inflate.getLayoutParams();
        return new b(this, inflate);
    }

    /* renamed from: m0 */
    public void m28682m0(int i10) {
        this.f32917j = i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0677h
    /* renamed from: n */
    public int mo3013n() {
        return this.f32527f.size();
    }
}
