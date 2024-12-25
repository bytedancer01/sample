package com.maxdigitall.maxdigitaliptvbox.vpn.activities;

import ag.C0164a;
import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.ActivityC0243b;
import androidx.appcompat.app.DialogC0242a;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bg.C0900a;
import bg.C0901b;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.maxdigitall.maxdigitaliptvbox.vpn.adapters.VpnProfileAdapter;
import gh.C5011b;
import java.util.ArrayList;
import java.util.Objects;
import nf.C6783a;
import p030c0.C0936d;
import p083eh.C4726a;
import p135hh.C5093c0;
import p135hh.C5095d0;
import p135hh.C5117y;
import p135hh.C5118z;
import p135hh.EnumC5096e;
import p135hh.InterfaceC5100h;
import p135hh.ServiceC5111s;
import p151if.C5251a;
import p151if.C5255e;
import p170jf.C5377i;
import p324sf.InterfaceC8573l;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/vpn/activities/ProfileActivity.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/vpn/activities/ProfileActivity.class */
public class ProfileActivity extends ActivityC0243b implements InterfaceC8573l {

    /* renamed from: w */
    public static C6783a f25088w;

    /* renamed from: d */
    public DialogC0242a f25089d;

    /* renamed from: e */
    public C4726a f25090e;

    /* renamed from: h */
    public String f25093h;

    /* renamed from: i */
    public String f25094i;

    /* renamed from: j */
    public String f25095j;

    /* renamed from: k */
    public ArrayList<C0900a> f25096k;

    /* renamed from: l */
    public ArrayList<C0900a> f25097l;

    @BindView
    public LinearLayout ll_add_new_profile;

    @BindView
    public LinearLayout ll_add_profile;

    /* renamed from: m */
    public ArrayList<C0901b> f25098m;

    /* renamed from: n */
    public C0164a f25099n;

    /* renamed from: o */
    public Context f25100o;

    @BindView
    public ProgressBar progressBar;

    /* renamed from: r */
    public InterfaceC5100h f25103r;

    @BindView
    public RecyclerView recyclerView;

    @BindView
    public RelativeLayout rl_bottom_message;

    /* renamed from: s */
    public C5377i f25104s;

    @BindView
    public TextView tv_no_server_found;

    /* renamed from: u */
    public String f25106u;

    /* renamed from: f */
    public boolean f25091f = false;

    /* renamed from: g */
    public boolean f25092g = false;

    /* renamed from: p */
    public String f25101p = "";

    /* renamed from: q */
    public String f25102q = "";

    /* renamed from: t */
    public ArrayList<C0900a> f25105t = null;

    /* renamed from: v */
    public ServiceConnection f25107v = new ServiceConnectionC4061a(this);

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/vpn/activities/ProfileActivity$a.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.vpn.activities.ProfileActivity$a */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/vpn/activities/ProfileActivity$a.class */
    public class ServiceConnectionC4061a implements ServiceConnection {

        /* renamed from: b */
        public final ProfileActivity f25108b;

        public ServiceConnectionC4061a(ProfileActivity profileActivity) {
            this.f25108b = profileActivity;
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            this.f25108b.f25103r = InterfaceC5100h.a.m25510Z(iBinder);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            this.f25108b.f25103r = null;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/vpn/activities/ProfileActivity$b.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.vpn.activities.ProfileActivity$b */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/vpn/activities/ProfileActivity$b.class */
    public class ViewOnClickListenerC4062b implements View.OnClickListener {

        /* renamed from: b */
        public final ProfileActivity f25109b;

        public ViewOnClickListenerC4062b(ProfileActivity profileActivity) {
            this.f25109b = profileActivity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            try {
                Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                intent.setData(Uri.fromParts("package", this.f25109b.getPackageName(), null));
                this.f25109b.startActivityForResult(intent, 101);
                Toast.makeText(this.f25109b.f25100o, this.f25109b.f25100o.getResources().getString(2132017828), 1).show();
            } catch (Exception e10) {
            }
            this.f25109b.f25089d.dismiss();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/vpn/activities/ProfileActivity$c.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.vpn.activities.ProfileActivity$c */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/vpn/activities/ProfileActivity$c.class */
    public class ViewOnClickListenerC4063c implements View.OnClickListener {

        /* renamed from: b */
        public final ProfileActivity f25110b;

        public ViewOnClickListenerC4063c(ProfileActivity profileActivity) {
            this.f25110b = profileActivity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f25110b.f25089d.dismiss();
            this.f25110b.onBackPressed();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/vpn/activities/ProfileActivity$d.class
     */
    @SuppressLint({"StaticFieldLeak"})
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.vpn.activities.ProfileActivity$d */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/vpn/activities/ProfileActivity$d.class */
    public class AsyncTaskC4064d extends AsyncTask<Boolean, Void, Boolean> {

        /* renamed from: a */
        public final ProfileActivity f25111a;

        public AsyncTaskC4064d(ProfileActivity profileActivity) {
            this.f25111a = profileActivity;
        }

        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean doInBackground(Boolean... boolArr) {
            return this.f25111a.m19826w0();
        }

        @Override // android.os.AsyncTask
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Boolean bool) {
            super.onPostExecute(bool);
            if (!bool.booleanValue()) {
                this.f25111a.m19825q0(false);
            } else {
                this.f25111a.m19825q0(true);
                this.f25111a.m19823B0();
            }
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
            this.f25111a.progressBar.setVisibility(0);
            this.f25111a.ll_add_new_profile.setVisibility(8);
        }
    }

    /* renamed from: A0 */
    public void m19822A0() {
        startActivity(new Intent(this, (Class<?>) ImportVPNActivity.class));
        finish();
    }

    /* renamed from: B0 */
    public void m19823B0() {
        this.recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        this.recyclerView.setAdapter(new VpnProfileAdapter(this.f25100o, this.f25096k, this));
    }

    /* renamed from: C0 */
    public void m19824C0() {
        new AsyncTaskC4064d(this).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Boolean[0]);
    }

    @Override // androidx.fragment.app.ActivityC0416e, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        if (i10 != 70) {
            if (i10 == 101) {
                try {
                    m19827x0();
                    return;
                } catch (Exception e10) {
                    return;
                }
            }
            return;
        }
        if (i11 == -1) {
            if (this.f25090e.m23858L(this.f25094i, this.f25093h) != 0) {
                C5095d0.m25456J("USER_VPN_PASSWORD", "", 2132018641, EnumC5096e.LEVEL_WAITING_FOR_USER_INPUT);
                C4726a c4726a = this.f25090e;
                c4726a.f27799B = this.f25101p;
                String str = this.f25102q;
                c4726a.f27797A = str;
                this.f25093h = str;
                bindService(new Intent(this, (Class<?>) ServiceC5111s.class), this.f25107v, 1);
                return;
            }
            boolean z10 = C5117y.m25656a(this).getBoolean("showlogwindow", true);
            if (!this.f25091f && z10) {
                C5118z.m25669q(this, this.f25090e);
            }
            C5093c0.m25440f(this.f25090e, getBaseContext());
        } else {
            if (i11 != 0) {
                return;
            }
            C5095d0.m25456J("USER_VPN_PERMISSION_CANCELLED", "", 2132018644, EnumC5096e.LEVEL_NOTCONNECTED);
            if (Build.VERSION.SDK_INT >= 24) {
                C5095d0.m25471n(2132018248);
            }
        }
        finish();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
    }

    @Override // androidx.fragment.app.ActivityC0416e, androidx.activity.ComponentActivity, p030c0.ActivityC0952l, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f25100o = this;
        super.onCreate(bundle);
        C6783a c6783a = new C6783a(this.f25100o);
        f25088w = c6783a;
        String m31288z = c6783a.m31288z();
        this.f25106u = m31288z;
        setContentView(m31288z.equals(C5251a.f30065s0) ? 2131624032 : 2131624031);
        ButterKnife.m5626a(this);
        m19828z0();
        this.f25104s = new C5377i(this.f25100o, this);
        this.f25099n = new C0164a(this.f25100o);
        this.f25096k = new ArrayList<>();
        this.f25098m = new ArrayList<>();
        this.f25097l = new ArrayList<>();
        this.f25105t = new ArrayList<>();
        try {
            m19827x0();
        } catch (Exception e10) {
        }
        this.ll_add_new_profile.setVisibility(0);
        this.ll_add_profile.setVisibility(0);
        this.f25095j = getIntent().getStringExtra("typeid");
        C5011b c5011b = new C5011b(this.f25100o);
        c5011b.m25206c();
        c5011b.m25204a("com.maxdigitall.maxdigitaliptvbox");
    }

    @Override // androidx.appcompat.app.ActivityC0243b, androidx.fragment.app.ActivityC0416e, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // androidx.fragment.app.ActivityC0416e, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // androidx.fragment.app.ActivityC0416e, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        if (i10 != 101) {
            return;
        }
        try {
            if (iArr.length > 0 && iArr[0] == 0 && iArr[1] == 0) {
                m19827x0();
            } else if (Build.VERSION.SDK_INT < 23 || shouldShowRequestPermissionRationale(strArr[0])) {
                onBackPressed();
            } else {
                DialogC0242a.a aVar = new DialogC0242a.a(this, 2132082693);
                View inflate = LayoutInflater.from(this).inflate(2131624461, (ViewGroup) null);
                Button button = (Button) inflate.findViewById(2131427646);
                Button button2 = (Button) inflate.findViewById(2131427636);
                button.setOnFocusChangeListener(new C5255e.i(button, this));
                button2.setOnFocusChangeListener(new C5255e.i(button2, this));
                button.requestFocus();
                button.setOnClickListener(new ViewOnClickListenerC4062b(this));
                button2.setOnClickListener(new ViewOnClickListenerC4063c(this));
                aVar.setView(inflate);
                this.f25089d = aVar.create();
                WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
                Window window = this.f25089d.getWindow();
                Objects.requireNonNull(window);
                Window window2 = window;
                layoutParams.copyFrom(window.getAttributes());
                layoutParams.width = -1;
                layoutParams.height = -2;
                this.f25089d.show();
                this.f25089d.getWindow().setAttributes(layoutParams);
                this.f25089d.setCancelable(false);
                this.f25089d.show();
            }
        } catch (Exception e10) {
        }
    }

    @Override // androidx.fragment.app.ActivityC0416e, android.app.Activity
    public void onResume() {
        super.onResume();
        m19824C0();
    }

    @Override // androidx.appcompat.app.ActivityC0243b, androidx.fragment.app.ActivityC0416e, android.app.Activity
    public void onStop() {
        super.onStop();
    }

    @OnClick
    public void onclick(View view) {
        int id2 = view.getId();
        if (id2 == 2131428317 || id2 == 2131428320) {
            m19822A0();
        }
    }

    /* renamed from: q0 */
    public final void m19825q0(boolean z10) {
        this.progressBar.setVisibility(8);
        if (z10) {
            this.ll_add_new_profile.setVisibility(8);
            this.recyclerView.setVisibility(0);
            this.rl_bottom_message.setVisibility(0);
        } else {
            this.ll_add_new_profile.setVisibility(0);
            this.ll_add_new_profile.requestFocus();
            this.recyclerView.setVisibility(8);
            this.rl_bottom_message.setVisibility(8);
        }
    }

    /* renamed from: w0 */
    public final Boolean m19826w0() {
        try {
            this.f25096k = this.f25099n.m742v();
        } catch (Exception e10) {
        }
        ArrayList<C0900a> arrayList = this.f25096k;
        return (arrayList == null || arrayList.size() <= 0) ? Boolean.FALSE : Boolean.TRUE;
    }

    /* renamed from: x0 */
    public void m19827x0() {
        try {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 < 23 || i10 >= 33) {
                return;
            }
            if (checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") == 0 && checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
                return;
            }
            C0936d.m5641r(this, new String[]{"android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"}, 101);
        } catch (Exception e10) {
        }
    }

    /* renamed from: z0 */
    public final void m19828z0() {
        if (Build.VERSION.SDK_INT < 33 || checkSelfPermission("android.permission.POST_NOTIFICATIONS") == 0) {
            return;
        }
        C0936d.m5641r(this, C5255e.m26216S(), 1);
    }
}
