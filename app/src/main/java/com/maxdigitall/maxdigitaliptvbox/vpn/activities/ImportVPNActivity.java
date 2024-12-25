package com.maxdigitall.maxdigitaliptvbox.vpn.activities;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.provider.DocumentsContract;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.ActivityC0243b;
import androidx.appcompat.app.DialogC0242a;
import bg.C0900a;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.amazonaws.mobileconnectors.p044s3.transferutility.TransferTable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Objects;
import nf.C6783a;
import p151if.C5251a;
import p151if.C5255e;
import p355uf.C9174b;
import p427yf.AsyncTaskC9985c;
import p427yf.C9983a;
import p427yf.C9984b;
import p427yf.C9987e;
import p446zf.InterfaceC10207a;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/vpn/activities/ImportVPNActivity.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/vpn/activities/ImportVPNActivity.class */
public class ImportVPNActivity extends ActivityC0243b implements InterfaceC10207a {

    /* renamed from: s */
    public static C6783a f25055s;

    @BindView
    public Button bt_browse;

    @BindView
    public Button btn_back;

    @BindView
    public Button btn_import;

    /* renamed from: d */
    public Context f25056d;

    @BindView
    public TextView date;

    /* renamed from: e */
    public DialogC0242a f25057e;

    @BindView
    public EditText et_certificate;

    @BindView
    public LinearLayout ll_url;

    /* renamed from: m */
    public List<File> f25065m;

    /* renamed from: n */
    public List<String> f25066n;

    /* renamed from: q */
    public String f25069q;

    /* renamed from: r */
    public Uri f25070r;

    @BindView
    public RadioButton rb_file;

    @BindView
    public RadioButton rb_url;

    @BindView
    public LinearLayout rl_browse;

    @BindView
    public TextView time;

    @BindView
    public TextView tv_browse_error;

    @BindView
    public TextView tv_file_path;

    /* renamed from: f */
    public String f25058f = "";

    /* renamed from: g */
    public String f25059g = "";

    /* renamed from: h */
    public String f25060h = "";

    /* renamed from: i */
    public String f25061i = "";

    /* renamed from: j */
    public int f25062j = 1024;

    /* renamed from: k */
    public String f25063k = "url";

    /* renamed from: l */
    public String f25064l = "";

    /* renamed from: o */
    public ArrayList<C0900a> f25067o = null;

    /* renamed from: p */
    public Thread f25068p = null;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/vpn/activities/ImportVPNActivity$a.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.vpn.activities.ImportVPNActivity$a */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/vpn/activities/ImportVPNActivity$a.class */
    public class C4052a implements AsyncTaskC9985c.a {

        /* renamed from: a */
        public final ImportVPNActivity f25071a;

        public C4052a(ImportVPNActivity importVPNActivity) {
            this.f25071a = importVPNActivity;
        }

        @Override // p427yf.AsyncTaskC9985c.a
        /* renamed from: a */
        public void mo19815a(File file) {
            Log.i("main", "file download completed");
            if (file == null || !file.exists()) {
                Toast.makeText(this.f25071a.f25056d, this.f25071a.getResources().getString(2132017769), 0).show();
                C5255e.m26205H();
            } else {
                ImportVPNActivity importVPNActivity = this.f25071a;
                new C9983a(importVPNActivity, file, importVPNActivity).m41931b();
            }
            Log.i("main", "file unzip completed");
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/vpn/activities/ImportVPNActivity$b.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.vpn.activities.ImportVPNActivity$b */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/vpn/activities/ImportVPNActivity$b.class */
    public class C4053b implements C9987e.g {

        /* renamed from: a */
        public final String[] f25072a;

        /* renamed from: b */
        public final ImportVPNActivity f25073b;

        public C4053b(ImportVPNActivity importVPNActivity, String[] strArr) {
            this.f25073b = importVPNActivity;
            this.f25072a = strArr;
        }

        @Override // p427yf.C9987e.g
        /* renamed from: a */
        public void mo19816a(String str) {
            this.f25072a[0] = str;
            if (!str.endsWith(".zip") && !str.endsWith(".ovpn")) {
                this.f25073b.tv_file_path.setVisibility(8);
                this.f25073b.tv_browse_error.setVisibility(0);
                ImportVPNActivity importVPNActivity = this.f25073b;
                importVPNActivity.tv_browse_error.setText(importVPNActivity.getResources().getString(2132017791));
                return;
            }
            this.f25073b.tv_file_path.setVisibility(0);
            this.f25073b.tv_file_path.setText(str);
            this.f25073b.f25064l = str;
            if (!this.f25073b.f25069q.equals(C5251a.f30065s0) && Build.VERSION.SDK_INT >= 23) {
                this.f25073b.m19806E0(str);
            } else {
                this.f25073b.m19807F0(str);
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/vpn/activities/ImportVPNActivity$c.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.vpn.activities.ImportVPNActivity$c */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/vpn/activities/ImportVPNActivity$c.class */
    public class RunnableC4054c implements Runnable {

        /* renamed from: b */
        public final ImportVPNActivity f25074b;

        public RunnableC4054c(ImportVPNActivity importVPNActivity) {
            this.f25074b = importVPNActivity;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                String date = Calendar.getInstance().getTime().toString();
                String m26199B = C5255e.m26199B(this.f25074b.f25056d);
                String m26249p = C5255e.m26249p(date);
                TextView textView = this.f25074b.time;
                if (textView != null) {
                    textView.setText(m26199B);
                }
                TextView textView2 = this.f25074b.date;
                if (textView2 != null) {
                    textView2.setText(m26249p);
                }
            } catch (Exception e10) {
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/vpn/activities/ImportVPNActivity$d.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.vpn.activities.ImportVPNActivity$d */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/vpn/activities/ImportVPNActivity$d.class */
    public class ViewOnClickListenerC4055d implements View.OnClickListener {

        /* renamed from: b */
        public final ImportVPNActivity f25075b;

        public ViewOnClickListenerC4055d(ImportVPNActivity importVPNActivity) {
            this.f25075b = importVPNActivity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            try {
                Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                intent.setData(Uri.fromParts("package", this.f25075b.getPackageName(), null));
                this.f25075b.startActivityForResult(intent, 101);
                Toast.makeText(this.f25075b.f25056d, this.f25075b.f25056d.getResources().getString(2132017828), 1).show();
            } catch (Exception e10) {
            }
            this.f25075b.f25057e.dismiss();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/vpn/activities/ImportVPNActivity$e.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.vpn.activities.ImportVPNActivity$e */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/vpn/activities/ImportVPNActivity$e.class */
    public class ViewOnClickListenerC4056e implements View.OnClickListener {

        /* renamed from: b */
        public final ImportVPNActivity f25076b;

        public ViewOnClickListenerC4056e(ImportVPNActivity importVPNActivity) {
            this.f25076b = importVPNActivity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f25076b.f25057e.dismiss();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/vpn/activities/ImportVPNActivity$f.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.vpn.activities.ImportVPNActivity$f */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/vpn/activities/ImportVPNActivity$f.class */
    public class RunnableC4057f implements Runnable {

        /* renamed from: b */
        public final ImportVPNActivity f25077b;

        public RunnableC4057f(ImportVPNActivity importVPNActivity) {
            this.f25077b = importVPNActivity;
        }

        @Override // java.lang.Runnable
        public void run() {
            while (!Thread.currentThread().isInterrupted()) {
                try {
                    this.f25077b.m19811v0();
                    Thread.sleep(1000L);
                } catch (InterruptedException e10) {
                    Thread.currentThread().interrupt();
                } catch (Exception e11) {
                }
            }
        }
    }

    /* renamed from: A0 */
    public final void m19802A0(Intent intent) {
        String str;
        Cursor cursor;
        if (intent == null || Build.VERSION.SDK_INT < 23) {
            return;
        }
        try {
            this.f25070r = intent.getData();
            if ((getContentResolver() == null || getContentResolver().getType(this.f25070r) == null || !Objects.equals(getContentResolver().getType(this.f25070r), "application/octet-stream")) && (getContentResolver() == null || getContentResolver().getType(this.f25070r) == null || !Objects.equals(getContentResolver().getType(this.f25070r), "application/zip"))) {
                Toast.makeText(this, this.f25056d.getResources().getString(2132017784), 0).show();
                str = "";
            } else {
                str = "";
                if (DocumentsContract.isDocumentUri(this.f25056d.getApplicationContext(), this.f25070r)) {
                    if (C9174b.m38609c(this.f25070r)) {
                        Uri uri = this.f25070r;
                        str = "";
                        if (uri != null) {
                            str = "";
                            if (uri.getPath() != null) {
                                str = "";
                                if (this.f25070r.getPathSegments() != null) {
                                    str = "";
                                    if (this.f25070r.getPathSegments().size() >= 2) {
                                        String[] split = this.f25070r.getPathSegments().get(1).split(":");
                                        String str2 = split[0];
                                        if (str2.contains("primary")) {
                                            str = Environment.getExternalStorageDirectory() + "/" + split[1];
                                        } else if (str2.contains("raw")) {
                                            str = split[1];
                                        } else {
                                            str = "/storage/" + str2 + "/" + split[1];
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        str = "";
                        if (C9174b.m38608b(this.f25070r)) {
                            try {
                                Cursor query = this.f25056d.getContentResolver().query(this.f25070r, new String[]{"_display_name"}, null, null, null);
                                String str3 = "";
                                if (query != null) {
                                    str3 = "";
                                    try {
                                        if (query.moveToFirst()) {
                                            str3 = Environment.getExternalStorageDirectory().toString() + "/Download/" + query.getString(0);
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        cursor = query;
                                        throw th;
                                    }
                                }
                                str = str3;
                                if (query != null) {
                                    query.close();
                                    str = str3;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                cursor = null;
                            }
                        }
                    }
                }
                if (str.length() == 0) {
                    Cursor cursor2 = null;
                    try {
                        Cursor query2 = this.f25056d.getContentResolver().query(this.f25070r, new String[]{"_data"}, null, null, null);
                        int columnIndexOrThrow = query2.getColumnIndexOrThrow("_data");
                        query2.moveToFirst();
                        cursor2 = query2;
                        String string = query2.getString(columnIndexOrThrow);
                        query2.close();
                        str = string;
                    } finally {
                        if (cursor2 != null) {
                            cursor2.close();
                        }
                    }
                }
            }
            this.tv_file_path.setVisibility(0);
            this.tv_file_path.setText(str);
            this.f25064l = str;
            m19806E0(str);
        } catch (Exception e10) {
            Log.e("EditProfile>>>", "Execpetion >>>" + e10);
        }
    }

    /* renamed from: B0 */
    public final void m19803B0(String str, String str2, String str3, File file) {
        C0900a c0900a = new C0900a();
        if (str3.contains("auth-user-pass")) {
            c0900a.m5562k("1");
        } else {
            c0900a.m5562k("0");
        }
        c0900a.m5566o("0");
        c0900a.m5571t("");
        c0900a.m5570s("");
        c0900a.m5568q(str2);
        c0900a.m5563l(str);
        c0900a.m5569r("0");
        c0900a.m5567p(String.valueOf(file));
        this.f25067o.add(c0900a);
    }

    /* renamed from: C0 */
    public final void m19804C0() {
        C5255e.m26205H();
        startActivity(new Intent(this, (Class<?>) ProfileActivity.class));
        finish();
    }

    /* renamed from: D0 */
    public final void m19805D0() {
        String str = this.f25063k;
        if (str == null || !str.equalsIgnoreCase("url")) {
            String str2 = this.f25064l;
            if (str2 == null || !str2.trim().isEmpty()) {
                if (!this.f25069q.equals(C5251a.f30065s0) && Build.VERSION.SDK_INT >= 23) {
                    m19806E0(this.f25064l);
                    return;
                } else {
                    m19807F0(this.f25064l);
                    return;
                }
            }
        } else {
            String obj = this.et_certificate.getText().toString();
            this.f25059g = obj;
            if (obj == null || !obj.isEmpty()) {
                m19812w0();
                return;
            }
        }
        Toast.makeText(this.f25056d, getResources().getString(2132018416), 0).show();
    }

    /* renamed from: E0 */
    public void m19806E0(String str) {
        C5255e.m26238i0(this.f25056d);
        Cursor query = this.f25056d.getContentResolver().query(this.f25070r, new String[]{"_display_name", "_size"}, null, null, null);
        int columnIndex = query.getColumnIndex("_display_name");
        query.moveToFirst();
        String string = query.getString(columnIndex);
        File file = new File(this.f25056d.getFilesDir() + "/VPNMAXDIGITAL");
        if (!file.exists()) {
            file.mkdir();
        }
        File file2 = new File(this.f25056d.getFilesDir() + "/VPNMAXDIGITAL/" + string);
        try {
            InputStream openInputStream = this.f25056d.getContentResolver().openInputStream(this.f25070r);
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            byte[] bArr = new byte[1024];
            while (true) {
                int read = openInputStream.read(bArr);
                if (read == -1) {
                    break;
                } else {
                    fileOutputStream.write(bArr, 0, read);
                }
            }
            openInputStream.close();
            fileOutputStream.close();
        } catch (Exception e10) {
            Log.e("Exception", e10.getMessage());
        }
        File file3 = new File(this.f25056d.getFilesDir() + "/VPNMAXDIGITAL/" + string);
        if (file3.exists() && str.contains(".zip")) {
            new C9984b(this, file3, this).m41933b();
        } else if (str.contains(".ovpn")) {
            m19814z0(str, ".ovpn");
        } else {
            Toast.makeText(this.f25056d, getResources().getString(2132017766), 0).show();
            C5255e.m26205H();
        }
    }

    /* renamed from: F0 */
    public void m19807F0(String str) {
        C5255e.m26238i0(this.f25056d);
        File file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOCUMENTS), "VPNMAXDIGITAL");
        if (!file.exists()) {
            file.mkdir();
        }
        File file2 = new File(str);
        if (file2.exists() && str.contains(".zip")) {
            new C9984b(this, file2, this).m41933b();
        } else if (str.contains(".ovpn")) {
            m19814z0(str, ".ovpn");
        } else {
            Toast.makeText(this.f25056d, getResources().getString(2132017766), 0).show();
            C5255e.m26205H();
        }
    }

    @Override // p446zf.InterfaceC10207a
    /* renamed from: S */
    public void mo19808S(String str) {
        m19814z0(str, ".zip");
    }

    @Override // p446zf.InterfaceC10207a
    /* renamed from: T */
    public void mo19809T(String str) {
        C5255e.m26205H();
        Toast.makeText(this.f25056d, "" + str, 0).show();
    }

    @Override // androidx.fragment.app.ActivityC0416e, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        if (i10 == 201) {
            m19802A0(intent);
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        Intent intent = new Intent(this.f25056d, (Class<?>) ProfileActivity.class);
        intent.putExtra("typeid", this.f25060h);
        startActivity(intent);
        super.onBackPressed();
    }

    @Override // androidx.fragment.app.ActivityC0416e, androidx.activity.ComponentActivity, p030c0.ActivityC0952l, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f25056d = this;
        super.onCreate(bundle);
        C6783a c6783a = new C6783a(this.f25056d);
        f25055s = c6783a;
        String m31288z = c6783a.m31288z();
        this.f25069q = m31288z;
        setContentView(m31288z.equals(C5251a.f30065s0) ? 2131624004 : 2131624003);
        ButterKnife.m5626a(this);
        Thread thread = this.f25068p;
        if (thread == null || !thread.isAlive()) {
            Thread thread2 = new Thread(new RunnableC4057f(this));
            this.f25068p = thread2;
            thread2.start();
        }
        Intent intent = getIntent();
        if (intent != null) {
            this.f25060h = intent.getStringExtra("typeid");
        }
        Button button = this.btn_import;
        button.setOnFocusChangeListener(new C5255e.i(button, this));
        Button button2 = this.btn_back;
        button2.setOnFocusChangeListener(new C5255e.i(button2, this));
        Button button3 = this.bt_browse;
        button3.setOnFocusChangeListener(new C5255e.i(button3, this));
    }

    @Override // androidx.fragment.app.ActivityC0416e, android.app.Activity
    public void onPause() {
        super.onPause();
        try {
            Thread thread = this.f25068p;
            if (thread == null || !thread.isAlive()) {
                return;
            }
            this.f25068p.interrupt();
        } catch (Exception e10) {
        }
    }

    public void onRadioButtonClicked(View view) {
        View view2;
        boolean isChecked = ((RadioButton) view).isChecked();
        int id2 = view.getId();
        if (id2 != 2131428901) {
            if (id2 != 2131428914 || !isChecked) {
                return;
            }
            this.f25063k = "url";
            this.ll_url.setVisibility(0);
            view2 = this.rl_browse;
        } else {
            if (!isChecked) {
                return;
            }
            this.f25063k = TransferTable.COLUMN_FILE;
            this.ll_url.setVisibility(8);
            this.rl_browse.setVisibility(0);
            this.tv_browse_error.setVisibility(8);
            view2 = this.tv_file_path;
        }
        view2.setVisibility(8);
    }

    @Override // androidx.fragment.app.ActivityC0416e, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        if (i10 != 101) {
            return;
        }
        try {
            if (iArr.length > 0 && iArr[0] == 0 && iArr[1] == 0) {
                m19812w0();
            } else if (Build.VERSION.SDK_INT >= 23 && !shouldShowRequestPermissionRationale(strArr[0])) {
                DialogC0242a.a aVar = new DialogC0242a.a(this, 2132082693);
                View inflate = LayoutInflater.from(this).inflate(2131624461, (ViewGroup) null);
                Button button = (Button) inflate.findViewById(2131427646);
                Button button2 = (Button) inflate.findViewById(2131427636);
                button.setOnFocusChangeListener(new C5255e.i(button, this));
                button2.setOnFocusChangeListener(new C5255e.i(button2, this));
                button.setOnClickListener(new ViewOnClickListenerC4055d(this));
                button2.setOnClickListener(new ViewOnClickListenerC4056e(this));
                aVar.setView(inflate);
                this.f25057e = aVar.create();
                WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
                Window window = this.f25057e.getWindow();
                Objects.requireNonNull(window);
                Window window2 = window;
                layoutParams.copyFrom(window.getAttributes());
                layoutParams.width = -1;
                layoutParams.height = -2;
                this.f25057e.show();
                this.f25057e.getWindow().setAttributes(layoutParams);
                this.f25057e.setCancelable(false);
                this.f25057e.show();
            }
        } catch (Exception e10) {
        }
    }

    @Override // androidx.fragment.app.ActivityC0416e, android.app.Activity
    public void onResume() {
        super.onResume();
        Thread thread = this.f25068p;
        if (thread == null || !thread.isAlive()) {
            Thread thread2 = new Thread(new RunnableC4057f(this));
            this.f25068p = thread2;
            thread2.start();
        }
    }

    @OnClick
    public void onclick(View view) {
        int id2 = view.getId();
        if (id2 == 2131427599) {
            m19812w0();
        } else if (id2 == 2131427632) {
            onBackPressed();
        } else {
            if (id2 != 2131427648) {
                return;
            }
            m19805D0();
        }
    }

    /* renamed from: u0 */
    public void m19810u0() {
        C9987e c9987e = new C9987e(this.f25056d, new C4053b(this, new String[]{""}));
        if (Build.VERSION.SDK_INT >= 30) {
            c9987e.m41964v("");
        } else {
            c9987e.m41963u("");
        }
    }

    /* renamed from: v0 */
    public void m19811v0() {
        runOnUiThread(new RunnableC4054c(this));
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:17:0x005c
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1179)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    /* renamed from: w0 */
    public final void m19812w0() {
        /*
            r4 = this;
            r0 = r4
            java.lang.String r0 = r0.f25063k
            r5 = r0
            r0 = r5
            if (r0 == 0) goto L19
            r0 = r5
            java.lang.String r1 = "url"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L19
            r0 = r4
            r0.m19813x0()
            goto L5b
        L19:
            r0 = r4
            java.lang.String r0 = r0.f25069q     // Catch: java.lang.Exception -> L5c
            java.lang.String r1 = p151if.C5251a.f30065s0     // Catch: java.lang.Exception -> L5c
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Exception -> L5c
            if (r0 == 0) goto L2d
        L26:
            r0 = r4
            r0.m19810u0()     // Catch: java.lang.Exception -> L5c
            goto L5b
        L2d:
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Exception -> L5c
            r1 = 23
            if (r0 < r1) goto L26
            android.content.Intent r0 = new android.content.Intent     // Catch: java.lang.Exception -> L5c
            r5 = r0
            r0 = r5
            r0.<init>()     // Catch: java.lang.Exception -> L5c
            r0 = r5
            java.lang.String r1 = "application/*"
            android.content.Intent r0 = r0.setType(r1)     // Catch: java.lang.Exception -> L5c
            r0 = r5
            java.lang.String r1 = "android.intent.action.GET_CONTENT"
            android.content.Intent r0 = r0.setAction(r1)     // Catch: java.lang.Exception -> L5c
            r0 = r4
            r1 = r5
            java.lang.String r2 = "Select File"
            android.content.Intent r1 = android.content.Intent.createChooser(r1, r2)     // Catch: java.lang.Exception -> L5c
            r2 = 201(0xc9, float:2.82E-43)
            r0.startActivityForResult(r1, r2)     // Catch: java.lang.Exception -> L5c
        L5b:
            return
        L5c:
            r5 = move-exception
            goto L5b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.maxdigitall.maxdigitaliptvbox.vpn.activities.ImportVPNActivity.m19812w0():void");
    }

    /* renamed from: x0 */
    public final void m19813x0() {
        File file;
        C5255e.m26236h0(this);
        if (this.f25069q.equals(C5251a.f30065s0)) {
            if (Build.VERSION.SDK_INT >= 23) {
                file = new File(this.f25056d.getFilesDir() + "/VPNMAXDIGITAL/vpncertificate.zip");
            } else {
                file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOCUMENTS), "VPNMAXDIGITAL/vpncertificate.zip");
            }
        } else if (Build.VERSION.SDK_INT >= 23) {
            file = new File(this.f25056d.getFilesDir() + "/VPNMAXDIGITAL/vpncertificate.zip");
        } else {
            file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOCUMENTS), "VPNMAXDIGITAL/vpncertificate.zip");
        }
        File file2 = new File(String.valueOf(file));
        if (file2.exists()) {
            file2.deleteOnExit();
        }
        new AsyncTaskC9985c(String.valueOf(file), this, new C4052a(this)).execute(this.f25059g);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:111:0x062e
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1179)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0472 A[Catch: Exception -> 0x062e, TryCatch #1 {Exception -> 0x062e, blocks: (B:109:0x0543, B:144:0x0465, B:146:0x0472, B:148:0x047a, B:149:0x0521, B:149:0x0521, B:150:0x0524, B:152:0x04b7, B:153:0x04ce, B:155:0x04d6, B:156:0x050d), top: B:143:0x0465 }] */
    /* JADX WARN: Removed duplicated region for block: B:153:0x04ce A[Catch: Exception -> 0x062e, TRY_ENTER, TryCatch #1 {Exception -> 0x062e, blocks: (B:109:0x0543, B:144:0x0465, B:146:0x0472, B:148:0x047a, B:149:0x0521, B:149:0x0521, B:150:0x0524, B:152:0x04b7, B:153:0x04ce, B:155:0x04d6, B:156:0x050d), top: B:143:0x0465 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0140 A[Catch: IOException -> 0x0621, TRY_ENTER, TryCatch #7 {IOException -> 0x0621, blocks: (B:13:0x011d, B:15:0x0136, B:17:0x0140, B:20:0x014e, B:27:0x0161, B:30:0x0166), top: B:12:0x011d }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0161 A[EDGE_INSN: B:26:0x0161->B:27:0x0161 BREAK  A[LOOP:0: B:14:0x0134->B:22:0x0134], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x019a A[Catch: Exception -> 0x01ad, TRY_LEAVE, TryCatch #2 {Exception -> 0x01ad, blocks: (B:30:0x0166, B:34:0x0169, B:36:0x019a), top: B:29:0x0166 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0220  */
    /* renamed from: z0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m19814z0(java.lang.String r7, java.lang.String r8) {
        /*
            Method dump skipped, instructions count: 1586
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.maxdigitall.maxdigitaliptvbox.vpn.activities.ImportVPNActivity.m19814z0(java.lang.String, java.lang.String):void");
    }
}
