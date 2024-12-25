package com.maxdigitall.maxdigitaliptvbox.view.activity;

import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.ActivityC0243b;
import butterknife.BindView;
import butterknife.ButterKnife;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import nf.C6783a;
import org.achartengine.ChartFactory;
import org.achartengine.model.XYMultipleSeriesDataset;
import org.achartengine.model.XYSeries;
import org.achartengine.renderer.XYMultipleSeriesRenderer;
import org.apache.commons.net.ftp.FTPReply;
import p064df.C4452a;
import p064df.C4454c;
import p064df.C4455d;
import p151if.C5251a;
import p151if.C5253c;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SpeedTestActivity.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SpeedTestActivity.class */
public class SpeedTestActivity extends ActivityC0243b {

    /* renamed from: i */
    public static int f18805i;

    /* renamed from: j */
    public static int f18806j;

    @BindView
    public ImageView bar_speed;

    /* renamed from: d */
    public C5253c f18807d;

    @BindView
    public TextView down_text;

    /* renamed from: e */
    public HashSet<String> f18808e;

    /* renamed from: f */
    public RotateAnimation f18809f;

    /* renamed from: g */
    public Context f18810g;

    @BindView
    public LinearLayout graph_chart;

    /* renamed from: h */
    public C6783a f18811h;

    @BindView
    public TextView ping_text;

    @BindView
    public Button test_button;

    @BindView
    public TextView upl_text;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SpeedTestActivity$a.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.SpeedTestActivity$a */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SpeedTestActivity$a.class */
    public class ViewOnClickListenerC3162a implements View.OnClickListener {

        /* renamed from: b */
        public final SpeedTestActivity f18812b;

        public ViewOnClickListenerC3162a(SpeedTestActivity speedTestActivity) {
            this.f18812b = speedTestActivity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f18812b.test_button.setEnabled(false);
            this.f18812b.m16662t0();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SpeedTestActivity$b.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.SpeedTestActivity$b */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SpeedTestActivity$b.class */
    public class RunnableC3163b implements Runnable {

        /* renamed from: b */
        public final DecimalFormat f18813b;

        /* renamed from: c */
        public final SpeedTestActivity f18814c;

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SpeedTestActivity$b$a.class
         */
        /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.SpeedTestActivity$b$a */
        /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SpeedTestActivity$b$a.class */
        public class a implements Runnable {

            /* renamed from: b */
            public final C4452a f18815b;

            /* renamed from: c */
            public final RunnableC3163b f18816c;

            public a(RunnableC3163b runnableC3163b, C4452a c4452a) {
                this.f18816c = runnableC3163b;
                this.f18815b = c4452a;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f18816c.f18814c.f18809f = new RotateAnimation(SpeedTestActivity.f18806j, SpeedTestActivity.f18805i, 1, 0.5f, 1, 0.5f);
                this.f18816c.f18814c.f18809f.setInterpolator(new LinearInterpolator());
                this.f18816c.f18814c.f18809f.setDuration(100L);
                SpeedTestActivity speedTestActivity = this.f18816c.f18814c;
                speedTestActivity.bar_speed.startAnimation(speedTestActivity.f18809f);
                this.f18816c.f18814c.down_text.setText(this.f18816c.f18813b.format(this.f18815b.m22602b()) + " Mbps");
            }
        }

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SpeedTestActivity$b$b.class
         */
        /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.SpeedTestActivity$b$b */
        /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SpeedTestActivity$b$b.class */
        public class b implements Runnable {

            /* renamed from: b */
            public final List f18817b;

            /* renamed from: c */
            public final XYMultipleSeriesRenderer f18818c;

            /* renamed from: d */
            public final LinearLayout f18819d;

            /* renamed from: e */
            public final RunnableC3163b f18820e;

            public b(RunnableC3163b runnableC3163b, List list, XYMultipleSeriesRenderer xYMultipleSeriesRenderer, LinearLayout linearLayout) {
                this.f18820e = runnableC3163b;
                this.f18817b = list;
                this.f18818c = xYMultipleSeriesRenderer;
                this.f18819d = linearLayout;
            }

            @Override // java.lang.Runnable
            public void run() {
                XYSeries xYSeries = new XYSeries("");
                xYSeries.setTitle("");
                Iterator it = new ArrayList(this.f18817b).iterator();
                int i10 = 0;
                while (it.hasNext()) {
                    xYSeries.add(i10, ((Double) it.next()).doubleValue());
                    i10++;
                }
                XYMultipleSeriesDataset xYMultipleSeriesDataset = new XYMultipleSeriesDataset();
                xYMultipleSeriesDataset.addSeries(xYSeries);
                this.f18819d.addView(ChartFactory.getLineChartView(this.f18820e.f18814c.getBaseContext(), xYMultipleSeriesDataset, this.f18818c), 0);
            }
        }

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SpeedTestActivity$b$c.class
         */
        /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.SpeedTestActivity$b$c */
        /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SpeedTestActivity$b$c.class */
        public class c implements Runnable {

            /* renamed from: b */
            public final C4454c f18821b;

            /* renamed from: c */
            public final RunnableC3163b f18822c;

            public c(RunnableC3163b runnableC3163b, C4454c c4454c) {
                this.f18822c = runnableC3163b;
                this.f18821b = c4454c;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f18822c.f18814c.upl_text.setText(this.f18822c.f18813b.format(this.f18821b.m22606a()) + " Mbps");
            }
        }

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SpeedTestActivity$b$d.class
         */
        /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.SpeedTestActivity$b$d */
        /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SpeedTestActivity$b$d.class */
        public class d implements Runnable {

            /* renamed from: b */
            public final C4454c f18823b;

            /* renamed from: c */
            public final RunnableC3163b f18824c;

            public d(RunnableC3163b runnableC3163b, C4454c c4454c) {
                this.f18824c = runnableC3163b;
                this.f18823b = c4454c;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f18824c.f18814c.f18809f = new RotateAnimation(SpeedTestActivity.f18806j, SpeedTestActivity.f18805i, 1, 0.5f, 1, 0.5f);
                this.f18824c.f18814c.f18809f.setInterpolator(new LinearInterpolator());
                this.f18824c.f18814c.f18809f.setDuration(100L);
                SpeedTestActivity speedTestActivity = this.f18824c.f18814c;
                speedTestActivity.bar_speed.startAnimation(speedTestActivity.f18809f);
                this.f18824c.f18814c.upl_text.setText(this.f18824c.f18813b.format(this.f18823b.m22607b()) + " Mbps");
            }
        }

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SpeedTestActivity$b$e.class
         */
        /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.SpeedTestActivity$b$e */
        /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SpeedTestActivity$b$e.class */
        public class e implements Runnable {

            /* renamed from: b */
            public final List f18825b;

            /* renamed from: c */
            public final XYMultipleSeriesRenderer f18826c;

            /* renamed from: d */
            public final LinearLayout f18827d;

            /* renamed from: e */
            public final RunnableC3163b f18828e;

            public e(RunnableC3163b runnableC3163b, List list, XYMultipleSeriesRenderer xYMultipleSeriesRenderer, LinearLayout linearLayout) {
                this.f18828e = runnableC3163b;
                this.f18825b = list;
                this.f18826c = xYMultipleSeriesRenderer;
                this.f18827d = linearLayout;
            }

            @Override // java.lang.Runnable
            public void run() {
                XYSeries xYSeries = new XYSeries("");
                xYSeries.setTitle("");
                int i10 = 0;
                for (Double d10 : new ArrayList(this.f18825b)) {
                    if (i10 == 0) {
                        d10 = Double.valueOf(0.0d);
                    }
                    xYSeries.add(i10, d10.doubleValue());
                    i10++;
                }
                XYMultipleSeriesDataset xYMultipleSeriesDataset = new XYMultipleSeriesDataset();
                xYMultipleSeriesDataset.addSeries(xYSeries);
                this.f18827d.addView(ChartFactory.getLineChartView(this.f18828e.f18814c.getBaseContext(), xYMultipleSeriesDataset, this.f18826c), 0);
            }
        }

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SpeedTestActivity$b$f.class
         */
        /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.SpeedTestActivity$b$f */
        /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SpeedTestActivity$b$f.class */
        public class f implements Runnable {

            /* renamed from: b */
            public final RunnableC3163b f18829b;

            public f(RunnableC3163b runnableC3163b) {
                this.f18829b = runnableC3163b;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f18829b.f18814c.test_button.setEnabled(true);
                SpeedTestActivity speedTestActivity = this.f18829b.f18814c;
                speedTestActivity.test_button.setText(speedTestActivity.getResources().getString(2132018487));
            }
        }

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SpeedTestActivity$b$g.class
         */
        /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.SpeedTestActivity$b$g */
        /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SpeedTestActivity$b$g.class */
        public class g implements Runnable {

            /* renamed from: b */
            public final RunnableC3163b f18830b;

            public g(RunnableC3163b runnableC3163b) {
                this.f18830b = runnableC3163b;
            }

            @Override // java.lang.Runnable
            public void run() {
                SpeedTestActivity speedTestActivity = this.f18830b.f18814c;
                speedTestActivity.test_button.setText(speedTestActivity.getResources().getString(2132018312));
            }
        }

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SpeedTestActivity$b$h.class
         */
        /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.SpeedTestActivity$b$h */
        /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SpeedTestActivity$b$h.class */
        public class h implements Runnable {

            /* renamed from: b */
            public final RunnableC3163b f18831b;

            public h(RunnableC3163b runnableC3163b) {
                this.f18831b = runnableC3163b;
            }

            @Override // java.lang.Runnable
            public void run() {
                Toast.makeText(this.f18831b.f18814c.getApplicationContext(), "No Connection...", 1).show();
                this.f18831b.f18814c.test_button.setEnabled(true);
                SpeedTestActivity speedTestActivity = this.f18831b.f18814c;
                speedTestActivity.test_button.setText(speedTestActivity.getResources().getString(2132018487));
            }
        }

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SpeedTestActivity$b$i.class
         */
        /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.SpeedTestActivity$b$i */
        /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SpeedTestActivity$b$i.class */
        public class i implements Runnable {

            /* renamed from: b */
            public final RunnableC3163b f18832b;

            public i(RunnableC3163b runnableC3163b) {
                this.f18832b = runnableC3163b;
            }

            @Override // java.lang.Runnable
            public void run() {
                SpeedTestActivity speedTestActivity = this.f18832b.f18814c;
                speedTestActivity.test_button.setText(speedTestActivity.getResources().getString(2132018412));
            }
        }

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SpeedTestActivity$b$j.class
         */
        /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.SpeedTestActivity$b$j */
        /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SpeedTestActivity$b$j.class */
        public class j implements Runnable {

            /* renamed from: b */
            public final List f18833b;

            /* renamed from: c */
            public final double f18834c;

            /* renamed from: d */
            public final RunnableC3163b f18835d;

            public j(RunnableC3163b runnableC3163b, List list, double d10) {
                this.f18835d = runnableC3163b;
                this.f18833b = list;
                this.f18834c = d10;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f18835d.f18814c.test_button.setText(String.format("Host Location: %s [Distance: %s km]", this.f18833b.get(2), new DecimalFormat("#.##").format(this.f18834c / 1000.0d)));
            }
        }

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SpeedTestActivity$b$k.class
         */
        /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.SpeedTestActivity$b$k */
        /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SpeedTestActivity$b$k.class */
        public class k implements Runnable {

            /* renamed from: b */
            public final LinearLayout f18836b;

            /* renamed from: c */
            public final LinearLayout f18837c;

            /* renamed from: d */
            public final LinearLayout f18838d;

            /* renamed from: e */
            public final RunnableC3163b f18839e;

            public k(RunnableC3163b runnableC3163b, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3) {
                this.f18839e = runnableC3163b;
                this.f18836b = linearLayout;
                this.f18837c = linearLayout2;
                this.f18838d = linearLayout3;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f18839e.f18814c.ping_text.setText("0 ms");
                this.f18836b.removeAllViews();
                this.f18839e.f18814c.down_text.setText("0 Mbps");
                this.f18837c.removeAllViews();
                this.f18839e.f18814c.upl_text.setText("0 Mbps");
                this.f18838d.removeAllViews();
            }
        }

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SpeedTestActivity$b$l.class
         */
        /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.SpeedTestActivity$b$l */
        /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SpeedTestActivity$b$l.class */
        public class l implements Runnable {

            /* renamed from: b */
            public final C4455d f18840b;

            /* renamed from: c */
            public final RunnableC3163b f18841c;

            public l(RunnableC3163b runnableC3163b, C4455d c4455d) {
                this.f18841c = runnableC3163b;
                this.f18840b = c4455d;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f18841c.f18814c.ping_text.setText(this.f18841c.f18813b.format(this.f18840b.m22610a()) + " ms");
            }
        }

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SpeedTestActivity$b$m.class
         */
        /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.SpeedTestActivity$b$m */
        /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SpeedTestActivity$b$m.class */
        public class m implements Runnable {

            /* renamed from: b */
            public final C4455d f18842b;

            /* renamed from: c */
            public final RunnableC3163b f18843c;

            public m(RunnableC3163b runnableC3163b, C4455d c4455d) {
                this.f18843c = runnableC3163b;
                this.f18842b = c4455d;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f18843c.f18814c.ping_text.setText(this.f18843c.f18813b.format(this.f18842b.m22611b()) + " ms");
            }
        }

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SpeedTestActivity$b$n.class
         */
        /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.SpeedTestActivity$b$n */
        /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SpeedTestActivity$b$n.class */
        public class n implements Runnable {

            /* renamed from: b */
            public final List f18844b;

            /* renamed from: c */
            public final XYMultipleSeriesRenderer f18845c;

            /* renamed from: d */
            public final LinearLayout f18846d;

            /* renamed from: e */
            public final RunnableC3163b f18847e;

            public n(RunnableC3163b runnableC3163b, List list, XYMultipleSeriesRenderer xYMultipleSeriesRenderer, LinearLayout linearLayout) {
                this.f18847e = runnableC3163b;
                this.f18844b = list;
                this.f18845c = xYMultipleSeriesRenderer;
                this.f18846d = linearLayout;
            }

            @Override // java.lang.Runnable
            public void run() {
                XYSeries xYSeries = new XYSeries("");
                xYSeries.setTitle("");
                Iterator it = new ArrayList(this.f18844b).iterator();
                int i10 = 0;
                while (it.hasNext()) {
                    xYSeries.add(i10, ((Double) it.next()).doubleValue());
                    i10++;
                }
                XYMultipleSeriesDataset xYMultipleSeriesDataset = new XYMultipleSeriesDataset();
                xYMultipleSeriesDataset.addSeries(xYSeries);
                this.f18846d.addView(ChartFactory.getLineChartView(this.f18847e.f18814c.getBaseContext(), xYMultipleSeriesDataset, this.f18845c), 0);
            }
        }

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SpeedTestActivity$b$o.class
         */
        /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.SpeedTestActivity$b$o */
        /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SpeedTestActivity$b$o.class */
        public class o implements Runnable {

            /* renamed from: b */
            public final C4452a f18848b;

            /* renamed from: c */
            public final RunnableC3163b f18849c;

            public o(RunnableC3163b runnableC3163b, C4452a c4452a) {
                this.f18849c = runnableC3163b;
                this.f18848b = c4452a;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f18849c.f18814c.down_text.setText(this.f18849c.f18813b.format(this.f18848b.m22601a()) + " Mbps");
            }
        }

        public RunnableC3163b(SpeedTestActivity speedTestActivity, DecimalFormat decimalFormat) {
            this.f18814c = speedTestActivity;
            this.f18813b = decimalFormat;
        }

        /* JADX WARN: Can't wrap try/catch for region: R(27:35|(1:37)|38|(2:40|(1:42))|43|(2:45|(1:47))|48|(2:50|(7:52|53|(2:55|(2:57|(1:59)(1:60))(1:61))|62|(2:64|(2:66|(1:68)(1:69))(1:70))|71|(9:80|(1:82)|83|(1:85)|86|(1:88)|89|(3:100|101|103)(4:93|94|95|96)|97)(3:77|78|79))(1:106))(1:108)|107|53|(0)|62|(0)|71|(1:73)|80|(0)|83|(0)|86|(0)|89|(1:91)|100|101|103|97) */
        /* JADX WARN: Removed duplicated region for block: B:55:0x0511  */
        /* JADX WARN: Removed duplicated region for block: B:64:0x0597  */
        /* JADX WARN: Removed duplicated region for block: B:82:0x0645  */
        /* JADX WARN: Removed duplicated region for block: B:85:0x0652  */
        /* JADX WARN: Removed duplicated region for block: B:88:0x065f  */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void run() {
            /*
                Method dump skipped, instructions count: 1692
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.maxdigitall.maxdigitaliptvbox.view.activity.SpeedTestActivity.RunnableC3163b.run():void");
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SpeedTestActivity$c.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.SpeedTestActivity$c */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SpeedTestActivity$c.class */
    public class ViewOnFocusChangeListenerC3164c implements View.OnFocusChangeListener {

        /* renamed from: b */
        public final View f18850b;

        /* renamed from: c */
        public final SpeedTestActivity f18851c;

        public ViewOnFocusChangeListenerC3164c(SpeedTestActivity speedTestActivity, View view) {
            this.f18851c = speedTestActivity;
            this.f18850b = view;
        }

        /* renamed from: a */
        public final void m16663a(boolean z10) {
            if (z10) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f18850b, "alpha", z10 ? 0.6f : 0.5f);
                ofFloat.setDuration(150L);
                ofFloat.start();
            }
        }

        /* renamed from: b */
        public final void m16664b(float f10) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f18850b, "scaleX", f10);
            ofFloat.setDuration(150L);
            ofFloat.start();
        }

        /* renamed from: c */
        public final void m16665c(float f10) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f18850b, "scaleY", f10);
            ofFloat.setDuration(150L);
            ofFloat.start();
        }

        @Override // android.view.View.OnFocusChangeListener
        @SuppressLint({"ResourceType"})
        public void onFocusChange(View view, boolean z10) {
            Button button;
            int i10;
            float f10 = 1.0f;
            if (z10) {
                if (z10) {
                    f10 = 1.12f;
                }
                m16664b(f10);
                m16665c(f10);
                View view2 = this.f18850b;
                if (view2 == null || view2.getTag() == null || !this.f18850b.getTag().equals("1")) {
                    return;
                }
                button = this.f18851c.test_button;
                i10 = 2131230846;
            } else {
                if (z10) {
                    return;
                }
                if (z10) {
                    f10 = 1.09f;
                }
                m16664b(f10);
                m16665c(f10);
                m16663a(z10);
                View view3 = this.f18850b;
                if (view3 == null || view3.getTag() == null || !this.f18850b.getTag().equals("1")) {
                    return;
                }
                button = this.f18851c.test_button;
                i10 = 2131230845;
            }
            button.setBackgroundResource(i10);
        }
    }

    @Override // androidx.fragment.app.ActivityC0416e, androidx.activity.ComponentActivity, p030c0.ActivityC0952l, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f18810g = this;
        super.onCreate(bundle);
        C6783a c6783a = new C6783a(this.f18810g);
        this.f18811h = c6783a;
        setContentView(c6783a.m31288z().equals(C5251a.f30065s0) ? 2131624065 : 2131624064);
        ButterKnife.m5626a(this);
        this.f18808e = new HashSet<>();
        try {
            C5253c c5253c = new C5253c();
            this.f18807d = c5253c;
            c5253c.start();
        } catch (Exception e10) {
        }
        Button button = this.test_button;
        if (button != null) {
            button.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3164c(this, button));
        }
        m16661s0();
    }

    @Override // androidx.fragment.app.ActivityC0416e, android.app.Activity
    public void onResume() {
        super.onResume();
        try {
            C5253c c5253c = new C5253c();
            this.f18807d = c5253c;
            c5253c.start();
        } catch (Exception e10) {
        }
    }

    /* renamed from: r0 */
    public int m16660r0(double d10) {
        if (d10 <= 1.0d) {
            return (int) (d10 * 30.0d);
        }
        if (d10 <= 10.0d) {
            return ((int) (d10 * 6.0d)) + 30;
        }
        if (d10 <= 30.0d) {
            return ((int) ((d10 - 10.0d) * 3.0d)) + 90;
        }
        if (d10 <= 50.0d) {
            return ((int) ((d10 - 30.0d) * 1.5d)) + FTPReply.FILE_STATUS_OK;
        }
        if (d10 <= 100.0d) {
            return ((int) ((d10 - 50.0d) * 1.2d)) + 180;
        }
        return 0;
    }

    /* renamed from: s0 */
    public final void m16661s0() {
        this.test_button.setOnClickListener(new ViewOnClickListenerC3162a(this));
    }

    /* renamed from: t0 */
    public final void m16662t0() {
        try {
            if (this.f18807d == null) {
                C5253c c5253c = new C5253c();
                this.f18807d = c5253c;
                c5253c.start();
            }
            if (this.f18807d != null) {
                this.graph_chart.setVisibility(0);
                try {
                    new Thread(new RunnableC3163b(this, new DecimalFormat("#.##"))).start();
                } catch (Exception e10) {
                    Toast.makeText(this.f18810g, e10.getMessage(), 0).show();
                }
            }
        } catch (Exception e11) {
        }
    }
}
