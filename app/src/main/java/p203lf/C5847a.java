package p203lf;

import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.maxdigitall.maxdigitaliptvbox.model.pojo.AnnouncementsResponsePojo;
import com.maxdigitall.maxdigitaliptvbox.view.activity.AnnouncementAlertActivity;
import com.maxdigitall.maxdigitaliptvbox.view.activity.AnnouncementsActivity;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import org.achartengine.chart.TimeChart;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:lf/a.class
 */
/* renamed from: lf.a */
/* loaded from: combined.jar:classes2.jar:lf/a.class */
public class C5847a extends RecyclerView.AbstractC0677h<c> {

    /* renamed from: e */
    public RelativeLayout f32471e;

    /* renamed from: f */
    public List<AnnouncementsResponsePojo> f32472f;

    /* renamed from: g */
    public AnnouncementsActivity f32473g;

    /* renamed from: h */
    public boolean f32474h = true;

    /* renamed from: i */
    public ImageView f32475i;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:lf/a$a.class
     */
    /* renamed from: lf.a$a */
    /* loaded from: combined.jar:classes2.jar:lf/a$a.class */
    public class a implements View.OnClickListener {

        /* renamed from: b */
        public final String f32476b;

        /* renamed from: c */
        public final String f32477c;

        /* renamed from: d */
        public final C5847a f32478d;

        public a(C5847a c5847a, String str, String str2) {
            this.f32478d = c5847a;
            this.f32476b = str;
            this.f32477c = str2;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Intent intent = new Intent(this.f32478d.f32473g, (Class<?>) AnnouncementAlertActivity.class);
            intent.putExtra("Title", this.f32476b);
            intent.putExtra("Description", this.f32477c);
            this.f32478d.f32473g.startActivity(intent);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:lf/a$b.class
     */
    /* renamed from: lf.a$b */
    /* loaded from: combined.jar:classes2.jar:lf/a$b.class */
    public class b implements View.OnFocusChangeListener {

        /* renamed from: b */
        public final View f32479b;

        /* renamed from: c */
        public final C5847a f32480c;

        public b(C5847a c5847a, View view) {
            this.f32480c = c5847a;
            this.f32479b = view;
        }

        /* renamed from: a */
        public final void m28452a(boolean z10) {
            if (z10) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f32479b, "alpha", z10 ? 0.6f : 0.5f);
                ofFloat.setDuration(150L);
                ofFloat.start();
            }
        }

        /* renamed from: b */
        public final void m28453b(float f10) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f32479b, "scaleX", f10);
            ofFloat.setDuration(150L);
            ofFloat.start();
        }

        /* renamed from: c */
        public final void m28454c(float f10) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f32479b, "scaleY", f10);
            ofFloat.setDuration(150L);
            ofFloat.start();
        }

        @Override // android.view.View.OnFocusChangeListener
        @SuppressLint({"ResourceType"})
        public void onFocusChange(View view, boolean z10) {
            View view2;
            int i10;
            if (z10) {
                m28453b(1.0f);
                m28454c(1.0f);
                view2 = this.f32479b;
                i10 = 2131231882;
            } else {
                if (z10) {
                    return;
                }
                m28453b(1.0f);
                m28454c(1.0f);
                m28452a(z10);
                view2 = this.f32479b;
                i10 = 2131100138;
            }
            view2.setBackgroundResource(i10);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:lf/a$c.class
     */
    /* renamed from: lf.a$c */
    /* loaded from: combined.jar:classes2.jar:lf/a$c.class */
    public class c extends RecyclerView.AbstractC0674e0 {

        /* renamed from: u */
        public TextView f32481u;

        /* renamed from: v */
        public TextView f32482v;

        /* renamed from: w */
        public TextView f32483w;

        /* renamed from: x */
        public View f32484x;

        /* renamed from: y */
        public CardView f32485y;

        /* renamed from: z */
        public final C5847a f32486z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C5847a c5847a, View view) {
            super(view);
            this.f32486z = c5847a;
            this.f32484x = view;
            this.f32481u = (TextView) view.findViewById(2131429509);
            this.f32482v = (TextView) view.findViewById(2131429508);
            this.f32483w = (TextView) view.findViewById(2131429395);
            this.f32485y = (CardView) view.findViewById(2131427700);
            c5847a.f32471e = (RelativeLayout) view.findViewById(2131429022);
            c5847a.f32475i = (ImageView) view.findViewById(2131428170);
        }
    }

    public C5847a(List<AnnouncementsResponsePojo> list, AnnouncementsActivity announcementsActivity) {
        this.f32473g = announcementsActivity;
        this.f32472f = list;
    }

    /* renamed from: e0 */
    public String m28449e0(String str) {
        String str2;
        String str3 = "";
        try {
            String format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(Calendar.getInstance().getTime());
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
            str2 = Long.toString(Math.abs(simpleDateFormat.parse(format).getTime() - simpleDateFormat.parse(str).getTime()) / TimeChart.DAY);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("HERE: ");
            sb2.append(str2);
            str3 = str2;
            Log.e("HERE", sb2.toString());
        } catch (Exception e10) {
            Log.e("DIDN'T WORK", "exception " + e10);
            str2 = str3;
        }
        return str2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0677h
    /* renamed from: f0, reason: merged with bridge method [inline-methods] */
    public void mo2996G(c cVar, int i10) {
        TextView textView;
        CharSequence charSequence;
        AnnouncementsResponsePojo announcementsResponsePojo = this.f32472f.get(i10);
        cVar.f32481u.setText(announcementsResponsePojo.m15406c());
        String m15406c = announcementsResponsePojo.m15406c();
        String m15405b = announcementsResponsePojo.m15405b();
        cVar.f32482v.setText(announcementsResponsePojo.m15405b());
        String m28449e0 = m28449e0(announcementsResponsePojo.m15404a());
        if (m28449e0.equalsIgnoreCase("0")) {
            textView = cVar.f32483w;
            charSequence = "Today";
        } else {
            if (!m28449e0.equalsIgnoreCase("1")) {
                cVar.f32483w.setText(m28449e0 + " days ago");
                cVar.f32485y.setOnClickListener(new a(this, m15406c, m15405b));
                cVar.f32485y.setOnFocusChangeListener(new b(this, cVar.f32485y));
                if (i10 == 0 || !this.f32474h) {
                }
                cVar.f32485y.requestFocus();
                this.f32474h = false;
                return;
            }
            textView = cVar.f32483w;
            charSequence = "Yesterday";
        }
        textView.setText(charSequence);
        cVar.f32485y.setOnClickListener(new a(this, m15406c, m15405b));
        cVar.f32485y.setOnFocusChangeListener(new b(this, cVar.f32485y));
        if (i10 == 0) {
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0677h
    /* renamed from: g0, reason: merged with bridge method [inline-methods] */
    public c mo2998J(ViewGroup viewGroup, int i10) {
        return new c(this, LayoutInflater.from(this.f32473g).inflate(2131624233, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0677h
    /* renamed from: n */
    public int mo3013n() {
        return this.f32472f.size();
    }
}
