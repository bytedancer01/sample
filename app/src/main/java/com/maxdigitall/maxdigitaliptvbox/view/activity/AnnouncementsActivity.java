package com.maxdigitall.maxdigitaliptvbox.view.activity;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.app.ActivityC0243b;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.amazonaws.services.p045s3.internal.Constants;
import com.maxdigitall.maxdigitaliptvbox.model.pojo.AnnouncementsResponsePojo;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Random;
import org.json.JSONArray;
import org.json.JSONObject;
import org.slf4j.Marker;
import p151if.C5255e;
import p187kc.AbstractC5546b;
import p188kd.C5552e;
import p203lf.C5847a;
import p407xe.C9740b;
import p407xe.C9744f;
import p407xe.C9745g;
import p407xe.InterfaceC9741c;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/AnnouncementsActivity.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/AnnouncementsActivity.class */
public class AnnouncementsActivity extends ActivityC0243b implements InterfaceC9741c<String> {

    /* renamed from: d */
    public int f16868d;

    @BindView
    public TextView date;

    /* renamed from: e */
    public String f16869e;

    /* renamed from: f */
    public RecyclerView.AbstractC0685p f16870f;

    /* renamed from: g */
    public RecyclerView.AbstractC0677h f16871g;

    /* renamed from: h */
    public Context f16872h;

    /* renamed from: i */
    public Thread f16873i = null;

    @BindView
    public ImageView logo;

    @BindView
    public TextView noRecord;

    @BindView
    public ProgressBar pbLoader;

    @BindView
    public RecyclerView recyclerView;

    @BindView
    public TextView time;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/AnnouncementsActivity$a.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.AnnouncementsActivity$a */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/AnnouncementsActivity$a.class */
    public class ViewOnClickListenerC2683a implements View.OnClickListener {

        /* renamed from: b */
        public final AnnouncementsActivity f16874b;

        public ViewOnClickListenerC2683a(AnnouncementsActivity announcementsActivity) {
            this.f16874b = announcementsActivity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C5255e.m26224a(this.f16874b.f16872h);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/AnnouncementsActivity$b.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.AnnouncementsActivity$b */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/AnnouncementsActivity$b.class */
    public class C2684b extends AbstractC5546b<List<AnnouncementsResponsePojo>> {

        /* renamed from: c */
        public final AnnouncementsActivity f16875c;

        public C2684b(AnnouncementsActivity announcementsActivity) {
            this.f16875c = announcementsActivity;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/AnnouncementsActivity$c.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.AnnouncementsActivity$c */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/AnnouncementsActivity$c.class */
    public class RunnableC2685c implements Runnable {

        /* renamed from: b */
        public final AnnouncementsActivity f16876b;

        public RunnableC2685c(AnnouncementsActivity announcementsActivity) {
            this.f16876b = announcementsActivity;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                String date = Calendar.getInstance().getTime().toString();
                String m26199B = C5255e.m26199B(this.f16876b.f16872h);
                String m26249p = C5255e.m26249p(date);
                TextView textView = this.f16876b.time;
                if (textView != null) {
                    textView.setText(m26199B);
                }
                TextView textView2 = this.f16876b.date;
                if (textView2 != null) {
                    textView2.setText(m26249p);
                }
            } catch (Exception e10) {
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/AnnouncementsActivity$d.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.AnnouncementsActivity$d */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/AnnouncementsActivity$d.class */
    public class RunnableC2686d implements Runnable {

        /* renamed from: b */
        public final AnnouncementsActivity f16877b;

        public RunnableC2686d(AnnouncementsActivity announcementsActivity) {
            this.f16877b = announcementsActivity;
        }

        @Override // java.lang.Runnable
        public void run() {
            while (!Thread.currentThread().isInterrupted()) {
                try {
                    this.f16877b.m15573r0();
                    Thread.sleep(1000L);
                } catch (InterruptedException e10) {
                    Thread.currentThread().interrupt();
                } catch (Exception e11) {
                }
            }
        }
    }

    @Override // p407xe.InterfaceC9741c
    /* renamed from: E */
    public void mo15570E(int i10) {
        m15575t0(getResources().getString(2132017868));
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(2130772003, 2130772000);
    }

    @Override // androidx.fragment.app.ActivityC0416e, androidx.activity.ComponentActivity, p030c0.ActivityC0952l, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2131623970);
        C9745g.f44477c = new C9745g(this);
        this.f16872h = this;
        ButterKnife.m5626a(this);
        m15572q0();
        m15574s0();
        Thread thread = this.f16873i;
        if (thread == null || !thread.isAlive()) {
            Thread thread2 = new Thread(new RunnableC2686d(this));
            this.f16873i = thread2;
            thread2.start();
        }
        this.logo.setOnClickListener(new ViewOnClickListenerC2683a(this));
    }

    @Override // androidx.fragment.app.ActivityC0416e, android.app.Activity
    public void onPause() {
        super.onPause();
        try {
            Thread thread = this.f16873i;
            if (thread == null || !thread.isAlive()) {
                return;
            }
            this.f16873i.interrupt();
        } catch (Exception e10) {
        }
    }

    @Override // androidx.fragment.app.ActivityC0416e, android.app.Activity
    public void onResume() {
        super.onResume();
        Thread thread = this.f16873i;
        if (thread == null || !thread.isAlive()) {
            Thread thread2 = new Thread(new RunnableC2686d(this));
            this.f16873i = thread2;
            thread2.start();
        }
        overridePendingTransition(2130772003, 2130772000);
    }

    /* renamed from: q0 */
    public void m15572q0() {
        int nextInt = new Random().nextInt(8378600) + Constants.MAXIMUM_UPLOAD_PARTS;
        this.f16868d = nextInt;
        C9740b.f44454b = String.valueOf(nextInt);
    }

    /* renamed from: r0 */
    public void m15573r0() {
        runOnUiThread(new RunnableC2685c(this));
    }

    /* renamed from: s0 */
    public void m15574s0() {
        this.f16869e = LoginActivity.m15973M0(C9744f.m41040b(this) + Marker.ANY_MARKER + C9744f.m41042d(this) + "-" + C9740b.f44454b);
        ArrayList arrayList = new ArrayList();
        C9745g.f44476b = arrayList;
        arrayList.add(C9745g.m41047a("action", "getAnnouncement"));
        C9745g.f44476b.add(C9745g.m41047a("sc", this.f16869e));
        C9745g.f44476b.add(C9745g.m41047a("apikey", C9744f.m41040b(this)));
        C9745g.f44476b.add(C9745g.m41047a("rand_num", C9740b.f44454b));
        C9745g.f44477c.m41049c(this);
    }

    /* renamed from: t0 */
    public void m15575t0(String str) {
        ProgressBar progressBar = this.pbLoader;
        if (progressBar != null) {
            progressBar.setVisibility(8);
        }
        this.noRecord.setText(str);
        this.noRecord.setVisibility(0);
        this.recyclerView.setVisibility(8);
    }

    @Override // p407xe.InterfaceC9741c
    /* renamed from: u0, reason: merged with bridge method [inline-methods] */
    public void mo15571Y(String str, int i10, boolean z10) {
        String string;
        if (z10) {
            if (i10 != 1) {
                return;
            }
            try {
                if (str.isEmpty() && str.equalsIgnoreCase("")) {
                    string = getResources().getString(2132018218);
                    m15575t0(string);
                    return;
                }
                C9740b.f44453a = new JSONObject(str);
                C5552e c5552e = new C5552e();
                if (Boolean.valueOf(C9740b.f44453a.getBoolean("status")).booleanValue()) {
                    JSONArray jSONArray = C9740b.f44453a.getJSONArray("response");
                    this.recyclerView.setHasFixedSize(true);
                    LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
                    this.f16870f = linearLayoutManager;
                    this.recyclerView.setLayoutManager(linearLayoutManager);
                    List list = (List) c5552e.m27547j(jSONArray.toString(), new C2684b(this).m27531b());
                    if (list.isEmpty()) {
                        string = getResources().getString(2132018218);
                        m15575t0(string);
                        return;
                    }
                    C5847a c5847a = new C5847a(list, this);
                    this.f16871g = c5847a;
                    this.recyclerView.setAdapter(c5847a);
                    ProgressBar progressBar = this.pbLoader;
                    if (progressBar != null) {
                        progressBar.setVisibility(8);
                    }
                    this.noRecord.setVisibility(8);
                    return;
                }
                return;
            } catch (Exception e10) {
                Log.e("Get Announcements", e10.getMessage());
            }
        }
        m15575t0(getResources().getString(2132018218));
    }
}
