package com.maxdigitall.maxdigitaliptvbox.WHMCSClientapp.activities;

import android.R;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.ActivityC0243b;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.maxdigitall.maxdigitaliptvbox.WHMCSClientapp.Clientdatabase.ClientSharepreferenceHandler;
import com.maxdigitall.maxdigitaliptvbox.WHMCSClientapp.interfaces.ApiService;
import com.maxdigitall.maxdigitaliptvbox.WHMCSClientapp.interfaces.ApiclientRetrofit;
import com.maxdigitall.maxdigitaliptvbox.WHMCSClientapp.modelclassess.DepartmentClass;
import com.maxdigitall.maxdigitaliptvbox.WHMCSClientapp.modelclassess.OpenDepartmentClass;
import dj.C4554u;
import dj.InterfaceC4535b;
import dj.InterfaceC4537d;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import p151if.C5255e;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/WHMCSClientapp/activities/OpenTicketActivity.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/WHMCSClientapp/activities/OpenTicketActivity.class */
public class OpenTicketActivity extends ActivityC0243b {

    @BindView
    public Button btSubmit;

    @BindView
    public Button bt_close;

    @BindView
    public TextView date;

    /* renamed from: e */
    public String[] f16065e;

    @BindView
    public EditText etMessage;

    @BindView
    public EditText et_subject_value;

    /* renamed from: f */
    public HashMap<Integer, String> f16066f;

    /* renamed from: g */
    public Context f16067g;

    /* renamed from: h */
    public String f16068h;

    /* renamed from: i */
    public String f16069i;

    @BindView
    public Spinner spDepartmentValue;

    @BindView
    public Spinner sp_priority;

    @BindView
    public TextView time;

    @BindView
    public TextView tvDepartement;

    @BindView
    public TextView tvMessage;

    @BindView
    public TextView tvPriority;

    /* renamed from: d */
    public List<String> f16064d = new ArrayList();

    /* renamed from: j */
    public Thread f16070j = null;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/WHMCSClientapp/activities/OpenTicketActivity$CountDownRunner.class
     */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/WHMCSClientapp/activities/OpenTicketActivity$CountDownRunner.class */
    public class CountDownRunner implements Runnable {

        /* renamed from: b */
        public final OpenTicketActivity f16074b;

        public CountDownRunner(OpenTicketActivity openTicketActivity) {
            this.f16074b = openTicketActivity;
        }

        @Override // java.lang.Runnable
        public void run() {
            while (!Thread.currentThread().isInterrupted()) {
                try {
                    this.f16074b.m14562u0();
                    Thread.sleep(1000L);
                } catch (InterruptedException e10) {
                    Thread.currentThread().interrupt();
                } catch (Exception e11) {
                }
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/WHMCSClientapp/activities/OpenTicketActivity$OnFocusChangeAccountListener.class
     */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/WHMCSClientapp/activities/OpenTicketActivity$OnFocusChangeAccountListener.class */
    public static class OnFocusChangeAccountListener implements View.OnFocusChangeListener {

        /* renamed from: b */
        public final View f16075b;

        /* renamed from: c */
        public final Activity f16076c;

        public OnFocusChangeAccountListener(View view, Activity activity) {
            this.f16075b = view;
            this.f16076c = activity;
        }

        /* renamed from: a */
        public final void m14564a(float f10) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f16075b, "scaleX", f10);
            ofFloat.setDuration(150L);
            ofFloat.start();
        }

        /* renamed from: b */
        public final void m14565b(float f10) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f16075b, "scaleY", f10);
            ofFloat.setDuration(150L);
            ofFloat.start();
        }

        @Override // android.view.View.OnFocusChangeListener
        @SuppressLint({"ResourceType"})
        public void onFocusChange(View view, boolean z10) {
            int i10;
            if (this.f16076c != null) {
                float f10 = 1.0f;
                if (!z10) {
                    if (z10) {
                        return;
                    }
                    m14564a(1.0f);
                    m14565b(1.0f);
                    View view2 = this.f16075b;
                    if (view2 != null && view2.getTag() != null && this.f16075b.getTag().equals("1")) {
                        view.setBackgroundResource(2131230845);
                    }
                    View view3 = this.f16075b;
                    if (view3 != null && view3.getTag() != null && this.f16075b.getTag().equals("2")) {
                        view.setBackgroundResource(2131230845);
                    }
                    View view4 = this.f16075b;
                    if (view4 == null || view4.getTag() == null || !this.f16075b.getTag().equals("3")) {
                        return;
                    }
                    view.setBackgroundResource(2131230845);
                    return;
                }
                if (z10) {
                    f10 = 1.03f;
                }
                View view5 = this.f16075b;
                if (view5 == null || view5.getTag() == null || !this.f16075b.getTag().equals("1")) {
                    View view6 = this.f16075b;
                    if (view6 == null || view6.getTag() == null || !this.f16075b.getTag().equals("2")) {
                        View view7 = this.f16075b;
                        if (view7 == null || view7.getTag() == null || !this.f16075b.getTag().equals("3")) {
                            view.setBackground(this.f16076c.getResources().getDrawable(2131231786));
                            return;
                        } else {
                            m14564a(f10);
                            m14565b(f10);
                            i10 = 2131230846;
                        }
                    } else {
                        m14564a(f10);
                        m14565b(f10);
                        i10 = 2131231576;
                    }
                } else {
                    m14564a(f10);
                    m14565b(f10);
                    i10 = 2131230828;
                }
                view.setBackgroundResource(i10);
            }
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
    }

    @Override // androidx.fragment.app.ActivityC0416e, androidx.activity.ComponentActivity, p030c0.ActivityC0952l, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2131624022);
        ButterKnife.m5626a(this);
        this.f16067g = this;
        Button button = this.btSubmit;
        button.setOnFocusChangeListener(new OnFocusChangeAccountListener(button, this));
        Button button2 = this.bt_close;
        button2.setOnFocusChangeListener(new OnFocusChangeAccountListener(button2, this));
        Thread thread = this.f16070j;
        if (thread == null || !thread.isAlive()) {
            Thread thread2 = new Thread(new CountDownRunner(this));
            this.f16070j = thread2;
            thread2.start();
        }
        m14560q0();
    }

    @Override // androidx.fragment.app.ActivityC0416e, android.app.Activity
    public void onPause() {
        super.onPause();
        try {
            Thread thread = this.f16070j;
            if (thread == null || !thread.isAlive()) {
                return;
            }
            this.f16070j.interrupt();
        } catch (Exception e10) {
        }
    }

    @Override // androidx.fragment.app.ActivityC0416e, android.app.Activity
    public void onResume() {
        super.onResume();
        Thread thread = this.f16070j;
        if (thread == null || !thread.isAlive()) {
            Thread thread2 = new Thread(new CountDownRunner(this));
            this.f16070j = thread2;
            thread2.start();
        }
    }

    @OnClick
    public void onViewClicked(View view) {
        int id2 = view.getId();
        if (id2 == 2131427605) {
            onBackPressed();
        } else {
            if (id2 != 2131427629) {
                return;
            }
            m14563v0();
        }
    }

    /* renamed from: q0 */
    public final void m14560q0() {
        C5255e.m26236h0(this);
        ((ApiService) ApiclientRetrofit.m14644a().m22958b(ApiService.class)).m14635c("OUBQqC6334OcxjS", "61Ce6WTJP12wy1a", "GetSupportDepartments", "no", ClientSharepreferenceHandler.m14490a(this)).mo22862f(new InterfaceC4537d<DepartmentClass>(this) { // from class: com.maxdigitall.maxdigitaliptvbox.WHMCSClientapp.activities.OpenTicketActivity.1

            /* renamed from: a */
            public final OpenTicketActivity f16071a;

            {
                this.f16071a = this;
            }

            @Override // dj.InterfaceC4537d
            @SuppressLint({"UseSparseArrays"})
            /* renamed from: a */
            public void mo14532a(InterfaceC4535b<DepartmentClass> interfaceC4535b, C4554u<DepartmentClass> c4554u) {
                C5255e.m26205H();
                if (c4554u.m22952a() == null || !c4554u.m22952a().m14662b().equals("success")) {
                    if (c4554u.m22952a() == null || !c4554u.m22952a().m14662b().equals("error")) {
                        return;
                    }
                    Toast.makeText(this.f16071a.getApplicationContext(), "Error", 0).show();
                    return;
                }
                List<DepartmentClass.Departments.Department> m14663a = c4554u.m22952a().m14661a().m14663a();
                if (m14663a != null) {
                    Iterator<DepartmentClass.Departments.Department> it = m14663a.iterator();
                    while (it.hasNext()) {
                        this.f16071a.f16064d.add(it.next().m14665b());
                    }
                    this.f16071a.f16065e = new String[m14663a.size()];
                    this.f16071a.f16066f = new HashMap<>();
                    for (int i10 = 0; i10 < m14663a.size(); i10++) {
                        this.f16071a.f16066f.put(Integer.valueOf(i10), String.valueOf(m14663a.get(i10).m14664a()));
                        this.f16071a.f16065e[i10] = String.valueOf(m14663a.get(i10).m14665b());
                    }
                    if (this.f16071a.f16067g == null || this.f16071a.spDepartmentValue == null) {
                        return;
                    }
                    OpenTicketActivity openTicketActivity = this.f16071a;
                    ArrayAdapter arrayAdapter = new ArrayAdapter(openTicketActivity, R.layout.simple_list_item_1, openTicketActivity.f16065e);
                    arrayAdapter.setDropDownViewResource(R.layout.simple_spinner_dropdown_item);
                    this.f16071a.spDepartmentValue.setAdapter((SpinnerAdapter) arrayAdapter);
                    arrayAdapter.notifyDataSetChanged();
                }
            }

            @Override // dj.InterfaceC4537d
            /* renamed from: b */
            public void mo14533b(InterfaceC4535b<DepartmentClass> interfaceC4535b, Throwable th2) {
                C5255e.m26205H();
                Toast.makeText(this.f16071a.f16067g, "Network error occured! Please try again", 0).show();
            }
        });
    }

    /* renamed from: r0 */
    public final void m14561r0(String str, String str2, String str3, int i10) {
        C5255e.m26236h0(this);
        ((ApiService) ApiclientRetrofit.m14644a().m22958b(ApiService.class)).m14637e("OUBQqC6334OcxjS", "61Ce6WTJP12wy1a", "OpenTicket", str, str3, i10, str2).mo22862f(new InterfaceC4537d<OpenDepartmentClass>(this) { // from class: com.maxdigitall.maxdigitaliptvbox.WHMCSClientapp.activities.OpenTicketActivity.2

            /* renamed from: a */
            public final OpenTicketActivity f16072a;

            {
                this.f16072a = this;
            }

            @Override // dj.InterfaceC4537d
            /* renamed from: a */
            public void mo14532a(InterfaceC4535b<OpenDepartmentClass> interfaceC4535b, C4554u<OpenDepartmentClass> c4554u) {
                C5255e.m26205H();
                if (!c4554u.m22954d() || c4554u.m22952a() == null || !c4554u.m22952a().m14681a().equals("success")) {
                    if (c4554u.m22952a().m14681a().equals("error")) {
                        Toast.makeText(this.f16072a.getApplicationContext(), "Error", 0).show();
                    }
                } else {
                    Toast.makeText(this.f16072a.getApplicationContext(), this.f16072a.f16067g.getResources().getString(2132018685), 0).show();
                    Intent intent = new Intent(this.f16072a, (Class<?>) MyTicketActivity.class);
                    intent.setAction("updateticket");
                    intent.setFlags(67108864);
                    this.f16072a.startActivity(intent);
                    this.f16072a.finish();
                }
            }

            @Override // dj.InterfaceC4537d
            /* renamed from: b */
            public void mo14533b(InterfaceC4535b<OpenDepartmentClass> interfaceC4535b, Throwable th2) {
                C5255e.m26205H();
                Toast.makeText(this.f16072a.f16067g, "Network error occured! Please try again", 0).show();
            }
        });
    }

    /* renamed from: u0 */
    public void m14562u0() {
        runOnUiThread(new Runnable(this) { // from class: com.maxdigitall.maxdigitaliptvbox.WHMCSClientapp.activities.OpenTicketActivity.3

            /* renamed from: b */
            public final OpenTicketActivity f16073b;

            {
                this.f16073b = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    String date = Calendar.getInstance().getTime().toString();
                    String m26199B = C5255e.m26199B(this.f16073b.f16067g);
                    String m26249p = C5255e.m26249p(date);
                    TextView textView = this.f16073b.time;
                    if (textView != null) {
                        textView.setText(m26199B);
                    }
                    TextView textView2 = this.f16073b.date;
                    if (textView2 != null) {
                        textView2.setText(m26249p);
                    }
                } catch (Exception e10) {
                }
            }
        });
    }

    /* renamed from: v0 */
    public void m14563v0() {
        Context applicationContext;
        Resources resources;
        int i10;
        String str;
        int m14490a = ClientSharepreferenceHandler.m14490a(this.f16067g);
        String trim = this.etMessage.getText().toString().trim();
        this.f16068h = this.spDepartmentValue.getSelectedItem().toString();
        this.f16069i = this.sp_priority.getSelectedItem().toString();
        String trim2 = this.et_subject_value.getText().toString().trim();
        if (!trim2.isEmpty()) {
            String str2 = this.f16068h;
            if (str2 == null || !str2.equalsIgnoreCase("")) {
                String str3 = this.f16069i;
                if (str3 != null && str3.equalsIgnoreCase("")) {
                    applicationContext = this.f16067g;
                    str = "Please select priority";
                } else if (trim == null || !trim.isEmpty()) {
                    m14561r0(trim, trim2, this.f16066f.get(Integer.valueOf(this.spDepartmentValue.getSelectedItemPosition())), m14490a);
                    return;
                } else {
                    applicationContext = getApplicationContext();
                    resources = this.f16067g.getResources();
                    i10 = 2132017645;
                }
            } else {
                applicationContext = this.f16067g;
                str = "Please select Department";
            }
            Toast.makeText(applicationContext, str, 0).show();
        }
        applicationContext = getApplicationContext();
        resources = this.f16067g.getResources();
        i10 = 2132017653;
        str = resources.getString(i10);
        Toast.makeText(applicationContext, str, 0).show();
    }
}
