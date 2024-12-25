package com.maxdigitall.maxdigitaliptvbox.vpn.activities;

import ag.C0164a;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.AsyncTask;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.ActivityC0243b;
import bg.C0901b;
import butterknife.BindView;
import butterknife.OnClick;
import de.blinkt.openvpn.LaunchVPN;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.achartengine.renderer.DefaultRenderer;
import org.jetbrains.annotations.NotNull;
import p083eh.C4726a;
import p135hh.C5118z;
import p151if.C5251a;
import p151if.C5255e;
import p427yf.AsyncTaskC9986d;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/vpn/activities/VPNLoginActivity.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/vpn/activities/VPNLoginActivity.class */
public class VPNLoginActivity extends ActivityC0243b {

    @BindView
    public Button btn_back;

    @BindView
    public Button btn_connect;

    @BindView
    public Button btn_save;

    /* renamed from: d */
    public Context f25119d;

    /* renamed from: e */
    public List<File> f25120e;

    @BindView
    public EditText et_password;

    @BindView
    public EditText et_username;

    /* renamed from: f */
    public List<String> f25121f;

    /* renamed from: g */
    public AsyncTaskC9986d f25122g;

    /* renamed from: h */
    public String f25123h;

    /* renamed from: i */
    public String f25124i;

    @BindView
    public ImageView iv_spinner_down;

    /* renamed from: j */
    public String f25125j;

    /* renamed from: k */
    public String f25126k;

    /* renamed from: l */
    public String f25127l;

    /* renamed from: m */
    public String f25128m;

    /* renamed from: n */
    public String f25129n;

    /* renamed from: o */
    public String f25130o;

    /* renamed from: p */
    public String f25131p;

    @BindView
    public LinearLayout password_p;

    /* renamed from: q */
    public String f25132q;

    /* renamed from: r */
    public String f25133r;

    /* renamed from: s */
    public int f25134s;

    @BindView
    public Spinner spinner_server;

    /* renamed from: t */
    public C0164a f25135t;

    /* renamed from: u */
    public Intent f25136u;

    @BindView
    public LinearLayout username_p;

    /* renamed from: v */
    public String f25137v;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/vpn/activities/VPNLoginActivity$a.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.vpn.activities.VPNLoginActivity$a */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/vpn/activities/VPNLoginActivity$a.class */
    public class C4067a implements AdapterView.OnItemSelectedListener {

        /* renamed from: b */
        public final VPNLoginActivity f25138b;

        public C4067a(VPNLoginActivity vPNLoginActivity) {
            this.f25138b = vPNLoginActivity;
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i10, long j10) {
            ((TextView) this.f25138b.spinner_server.getSelectedView()).setTextColor(this.f25138b.getResources().getColor(2131099660));
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/vpn/activities/VPNLoginActivity$b.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.vpn.activities.VPNLoginActivity$b */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/vpn/activities/VPNLoginActivity$b.class */
    public class C4068b implements AsyncTaskC9986d.a {

        /* renamed from: a */
        public final VPNLoginActivity f25139a;

        public C4068b(VPNLoginActivity vPNLoginActivity) {
            this.f25139a = vPNLoginActivity;
        }

        @Override // p427yf.AsyncTaskC9986d.a
        /* renamed from: a */
        public void mo19845a() {
            C0901b c0901b = new C0901b();
            c0901b.m5577f(this.f25139a.f25126k);
            c0901b.m5575d(this.f25139a.f25127l);
            c0901b.m5576e(this.f25139a.f25128m);
            c0901b.m5583l(this.f25139a.f25123h);
            c0901b.m5579h(this.f25139a.f25124i);
        }

        @Override // p427yf.AsyncTaskC9986d.a
        /* renamed from: b */
        public void mo19846b(String str) {
            Toast.makeText(this.f25139a.f25119d, this.f25139a.getResources().getString(2132017767), 0).show();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/vpn/activities/VPNLoginActivity$c.class
     */
    @SuppressLint({"StaticFieldLeak"})
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.vpn.activities.VPNLoginActivity$c */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/vpn/activities/VPNLoginActivity$c.class */
    public class AsyncTaskC4069c extends AsyncTask<Boolean, Void, Boolean> {

        /* renamed from: a */
        public final VPNLoginActivity f25140a;

        public AsyncTaskC4069c(VPNLoginActivity vPNLoginActivity) {
            this.f25140a = vPNLoginActivity;
        }

        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean doInBackground(Boolean... boolArr) {
            return this.f25140a.m19840u0();
        }

        @Override // android.os.AsyncTask
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Boolean bool) {
            super.onPostExecute(bool);
            C5255e.m26205H();
            if (bool.booleanValue()) {
                this.f25140a.m19834B0();
            } else {
                Toast.makeText(this.f25140a.f25119d, this.f25140a.getResources().getString(2132017951), 0).show();
            }
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
            C5255e.m26238i0(this.f25140a.f25119d);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/vpn/activities/VPNLoginActivity$d.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.vpn.activities.VPNLoginActivity$d */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/vpn/activities/VPNLoginActivity$d.class */
    public class C4070d extends ArrayAdapter<List<File>> {

        /* renamed from: b */
        public Context f25141b;

        /* renamed from: c */
        public List<File> f25142c;

        /* renamed from: d */
        public final VPNLoginActivity f25143d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4070d(VPNLoginActivity vPNLoginActivity, Context context, int i10, List<File> list) {
            super(context, i10, Collections.singletonList(list));
            this.f25143d = vPNLoginActivity;
            this.f25141b = context;
            this.f25142c = list;
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<File> getItem(int i10) {
            return this.f25142c;
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public int getCount() {
            return this.f25142c.size();
        }

        @Override // android.widget.ArrayAdapter, android.widget.BaseAdapter, android.widget.SpinnerAdapter
        public View getDropDownView(int i10, View view, @NotNull ViewGroup viewGroup) {
            TextView textView = (TextView) super.getDropDownView(i10, view, viewGroup);
            textView.setTextColor(DefaultRenderer.BACKGROUND_COLOR);
            String name = this.f25142c.get(i10).getName();
            String str = name;
            if (name != null) {
                str = name;
                if (name.endsWith(".ovpn")) {
                    str = name.replaceAll(".ovpn", "");
                }
            }
            textView.setText(str);
            return textView;
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public long getItemId(int i10) {
            return i10;
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        @NotNull
        public View getView(int i10, View view, @NotNull ViewGroup viewGroup) {
            TextView textView = (TextView) super.getView(i10, view, viewGroup);
            textView.setTextColor(DefaultRenderer.BACKGROUND_COLOR);
            String name = this.f25142c.get(i10).getName();
            textView.setText((name == null || !name.endsWith(".ovpn")) ? this.f25142c.get(i10).getName() : name.replaceAll(".ovpn", ""));
            return textView;
        }
    }

    /* renamed from: A0 */
    public final void m19833A0() {
        List<File> list = this.f25120e;
        if (list == null || list.size() <= 0) {
            return;
        }
        C0901b c0901b = new C0901b();
        c0901b.m5577f(this.f25126k);
        String str = this.f25127l;
        if (str != null && str.endsWith(".ovpn")) {
            this.f25127l = this.f25127l.replaceAll(".ovpn", "");
        }
        c0901b.m5575d(this.f25127l);
        c0901b.m5576e(this.f25128m);
        c0901b.m5583l(this.f25123h);
        c0901b.m5579h(this.f25124i);
        c0901b.m5582k(-1);
        try {
            String str2 = this.f25125j;
            if (str2 == null || !str2.equalsIgnoreCase("vpneditprofile")) {
                return;
            }
            c0901b.m5578g(this.f25134s);
        } catch (Exception e10) {
            Toast.makeText(this.f25119d, "" + e10, 0).show();
        }
    }

    /* renamed from: B0 */
    public final void m19834B0() {
        this.spinner_server.setAdapter((SpinnerAdapter) new C4070d(this, this, 2131624519, this.f25120e));
        String str = this.f25125j;
        if (str == null || !str.equalsIgnoreCase("vpneditprofile") || this.f25126k == null) {
            return;
        }
        File file = new File(this.f25126k);
        if (file.exists()) {
            for (int i10 = 0; i10 < this.f25120e.size(); i10++) {
                if (this.f25120e.get(i10).getAbsolutePath().equals(file.getAbsolutePath())) {
                    this.spinner_server.setSelection(i10);
                    return;
                }
            }
        }
    }

    /* renamed from: C0 */
    public void m19835C0() {
        try {
            m19836D0(C5118z.m25663g(this).m25671j(this.f25127l));
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* renamed from: D0 */
    public void m19836D0(C4726a c4726a) {
        C5251a.f30018Q = this.f25124i;
        C5251a.f30017P = this.f25123h;
        C5251a.f30015N = this.f25134s;
        String str = this.f25127l;
        if (str != null && str.contains(".ovpn")) {
            this.f25127l = this.f25127l.replaceAll(".ovpn", "");
        }
        C5251a.f30016O = this.f25127l;
        C5251a.f30019R = this.f25126k;
        C5251a.f30015N = this.f25134s;
        Intent intent = new Intent(this.f25119d, (Class<?>) LaunchVPN.class);
        intent.putExtra("de.blinkt.openvpn.shortcutProfileUUID", c4726a.m23854E().toString());
        intent.setAction("android.intent.action.MAIN");
        startActivity(intent);
        finish();
    }

    /* renamed from: E0 */
    public void m19837E0() {
        new AsyncTaskC4069c(this).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Boolean[0]);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        Intent intent = new Intent(this, (Class<?>) ProfileActivity.class);
        intent.putExtra("typeid", this.f25129n);
        startActivity(intent);
        super.onBackPressed();
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x016b, code lost:
    
        if (r7.exists() != false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x00cb, code lost:
    
        if (r7.exists() != false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x00ce, code lost:
    
        r7 = r7.getParent();
     */
    @Override // androidx.fragment.app.ActivityC0416e, androidx.activity.ComponentActivity, p030c0.ActivityC0952l, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onCreate(android.os.Bundle r7) {
        /*
            Method dump skipped, instructions count: 579
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.maxdigitall.maxdigitaliptvbox.vpn.activities.VPNLoginActivity.onCreate(android.os.Bundle):void");
    }

    @OnClick
    public void onclick(View view) {
        switch (view.getId()) {
            case 2131427632:
                onBackPressed();
                break;
            case 2131427640:
                m19839t0();
                break;
            case 2131427668:
                m19844z0();
                break;
            case 2131428421:
                Intent intent = new Intent(this.f25119d, (Class<?>) ImportVPNActivity.class);
                this.f25136u = intent;
                intent.putExtra("typeid", this.f25129n);
                startActivity(this.f25136u);
                finish();
                break;
        }
    }

    /* renamed from: s0 */
    public void m19838s0(String str, String str2) {
        File file = new File(str);
        try {
            if (file.exists()) {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
                String str3 = "";
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    str3 = (str3 + readLine) + "\n";
                }
                if (str3.contains("\n")) {
                    String[] split = str3.split("\n");
                    if (split.length == 2) {
                        this.f25123h = split[0];
                        this.f25124i = split[1];
                        if (str2.equals("connect")) {
                            m19843x0();
                        } else {
                            m19833A0();
                        }
                    }
                }
            }
        } catch (Exception e10) {
            Log.d("", "" + e10);
        }
    }

    /* renamed from: t0 */
    public final void m19839t0() {
        Context context;
        Resources resources;
        int i10;
        String str;
        String str2;
        this.f25135t = new C0164a(this.f25119d);
        this.f25123h = this.et_username.getText().toString();
        this.f25124i = this.et_password.getText().toString();
        this.f25137v = "connect";
        if (this.f25129n.equals("typeovpn")) {
            str2 = this.f25130o;
        } else {
            if (!this.f25132q.endsWith(".ovpn")) {
                String str3 = this.f25123h;
                if (str3 != null && str3.trim().isEmpty() && (str = this.f25124i) != null && str.trim().isEmpty()) {
                    m19842w0(this.f25137v);
                    return;
                }
                String str4 = this.f25123h;
                if (str4 == null || !str4.trim().isEmpty()) {
                    String str5 = this.f25124i;
                    if (str5 != null && str5.trim().isEmpty()) {
                        context = this.f25119d;
                        resources = getResources();
                        i10 = 2132018347;
                    }
                    m19843x0();
                }
                context = this.f25119d;
                resources = getResources();
                i10 = 2132018350;
                Toast.makeText(context, resources.getString(i10), 0).show();
                return;
            }
            str2 = this.f25132q;
        }
        this.f25127l = str2;
        m19843x0();
    }

    /* renamed from: u0 */
    public Boolean m19840u0() {
        try {
            this.f25120e = new ArrayList();
            this.f25121f = new ArrayList();
            String str = this.f25132q;
            if (str == null || str.isEmpty()) {
                return Boolean.FALSE;
            }
            File[] listFiles = new File(this.f25132q).listFiles();
            if (this.f25129n.equals("typeovpn")) {
                this.f25120e.add(new File(this.f25132q));
                return Boolean.TRUE;
            }
            if (this.f25132q.endsWith(".ovpn")) {
                this.f25120e.add(new File(this.f25132q));
                return Boolean.TRUE;
            }
            if (listFiles == null || listFiles.length <= 0) {
                return Boolean.FALSE;
            }
            for (File file : listFiles) {
                if (file.getName().endsWith(".ovpn")) {
                    this.f25120e.add(file);
                }
            }
            List<File> list = this.f25120e;
            return (list == null || list.size() <= 0) ? Boolean.FALSE : Boolean.TRUE;
        } catch (Exception e10) {
            return Boolean.FALSE;
        }
    }

    /* renamed from: v0 */
    public void m19841v0(Reader reader, String str) {
        String readLine;
        BufferedReader bufferedReader = new BufferedReader(reader);
        while (true) {
            try {
                try {
                    readLine = bufferedReader.readLine();
                } catch (IOException e10) {
                    e10.printStackTrace();
                }
                if (readLine == null) {
                    return;
                }
                if (readLine.startsWith("auth-user-pass") && readLine.contains(" ")) {
                    String[] split = readLine.split(" ");
                    if (split.length == 2) {
                        String str2 = split[0];
                        m19838s0(this.f25126k.replaceAll(this.f25127l, split[1]), str);
                    }
                }
            } catch (Exception e11) {
                return;
            }
        }
    }

    /* renamed from: w0 */
    public final void m19842w0(String str) {
        if (this.f25120e.size() != 0) {
            this.f25126k = this.f25120e.get(this.spinner_server.getSelectedItemPosition()).getAbsolutePath();
            this.f25127l = this.f25120e.get(this.spinner_server.getSelectedItemPosition()).getName();
            try {
                m19841v0(new BufferedReader(new InputStreamReader(new FileInputStream(new File(this.f25126k)))), str);
            } catch (FileNotFoundException e10) {
                e10.printStackTrace();
            }
        }
    }

    /* renamed from: x0 */
    public void m19843x0() {
        if (this.f25120e.size() != 0) {
            this.f25127l = this.f25120e.get(this.spinner_server.getSelectedItemPosition()).getName();
            this.f25128m = this.f25120e.get(this.spinner_server.getSelectedItemPosition()).getName();
            if (this.f25129n.equals("typeovpn")) {
                String name = this.f25120e.get(this.spinner_server.getSelectedItemPosition()).getName();
                this.f25127l = name;
                if (!name.startsWith("http://")) {
                    m19835C0();
                }
            } else {
                this.f25126k = this.f25120e.get(this.spinner_server.getSelectedItemPosition()).getAbsolutePath();
                this.f25127l = this.f25120e.get(this.spinner_server.getSelectedItemPosition()).getName();
                this.f25128m = this.f25120e.get(this.spinner_server.getSelectedItemPosition()).getName();
            }
            String str = this.f25127l;
            if (str != null && str.contains(".ovpn")) {
                this.f25127l = this.f25127l.replaceAll(".ovpn", "");
            }
            try {
                AsyncTaskC9986d asyncTaskC9986d = new AsyncTaskC9986d(this, new FileInputStream(new File(this.f25126k)), this.f25127l, this.f25126k, this.f25128m, new C4068b(this));
                this.f25122g = asyncTaskC9986d;
                asyncTaskC9986d.execute(new Void[0]);
            } catch (FileNotFoundException e10) {
                Toast.makeText(this.f25119d, "" + e10, 0).show();
                e10.printStackTrace();
            } catch (Exception e11) {
                Toast.makeText(this.f25119d, "" + e11, 0).show();
            }
        }
    }

    /* renamed from: z0 */
    public final void m19844z0() {
        Context context;
        Resources resources;
        int i10;
        String str;
        this.f25135t = new C0164a(this.f25119d);
        this.f25123h = this.et_username.getText().toString();
        this.f25124i = this.et_password.getText().toString();
        this.f25137v = "save";
        List<File> list = this.f25120e;
        if (list != null && list.size() > 0) {
            this.f25126k = this.f25120e.get(this.spinner_server.getSelectedItemPosition()).getAbsolutePath();
            this.f25127l = this.f25120e.get(this.spinner_server.getSelectedItemPosition()).getName();
            this.f25128m = this.f25120e.get(this.spinner_server.getSelectedItemPosition()).getName();
        }
        String str2 = this.f25123h;
        if (str2 != null && str2.trim().isEmpty() && (str = this.f25124i) != null && str.trim().isEmpty()) {
            m19842w0(this.f25137v);
            return;
        }
        String str3 = this.f25123h;
        if (str3 == null || !str3.trim().isEmpty()) {
            String str4 = this.f25124i;
            if (str4 != null && str4.trim().isEmpty()) {
                context = this.f25119d;
                resources = getResources();
                i10 = 2132018347;
            } else if (this.f25126k != null) {
                m19833A0();
                return;
            } else {
                context = this.f25119d;
                resources = getResources();
                i10 = 2132018342;
            }
        } else {
            context = this.f25119d;
            resources = getResources();
            i10 = 2132018350;
        }
        Toast.makeText(context, resources.getString(i10), 0).show();
    }
}
