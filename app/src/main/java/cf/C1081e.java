package cf;

import android.R;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Environment;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import android.widget.Toast;
import com.amazonaws.services.p045s3.model.InstructionFileId;
import com.maxdigitall.maxdigitaliptvbox.view.activity.HoneyPlayer;
import com.maxdigitall.maxdigitaliptvbox.view.utility.ListViewMaxHeight;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.regex.Pattern;
import nf.C6783a;
import p130hc.C5057a;
import p151if.C5251a;
import p203lf.C5852e;
import p203lf.C5854g;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:cf/e.class
 */
/* renamed from: cf.e */
/* loaded from: combined.jar:classes2.jar:cf/e.class */
public class C1081e {

    /* renamed from: v */
    public static C6783a f7150v;

    /* renamed from: b */
    public String f7152b;

    /* renamed from: c */
    public Context f7153c;

    /* renamed from: f */
    public List<String> f7156f;

    /* renamed from: h */
    public List<Integer> f7158h;

    /* renamed from: i */
    public List<Integer> f7159i;

    /* renamed from: j */
    public g f7160j;

    /* renamed from: k */
    public C5852e f7161k;

    /* renamed from: l */
    public C5854g f7162l;

    /* renamed from: m */
    public Button f7163m;

    /* renamed from: n */
    public Button f7164n;

    /* renamed from: p */
    public ListViewMaxHeight f7166p;

    /* renamed from: q */
    public AlertDialog.Builder f7167q;

    /* renamed from: r */
    public AlertDialog f7168r;

    /* renamed from: t */
    public List<String> f7170t;

    /* renamed from: u */
    public File f7171u;

    /* renamed from: a */
    public boolean f7151a = true;

    /* renamed from: d */
    public String f7154d = "";

    /* renamed from: e */
    public List<String> f7155e = null;

    /* renamed from: g */
    public List<String> f7157g = null;

    /* renamed from: o */
    public HashMap<String, String> f7165o = new HashMap<>();

    /* renamed from: s */
    public Boolean f7169s = Boolean.TRUE;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:cf/e$a.class
     */
    /* renamed from: cf.e$a */
    /* loaded from: combined.jar:classes2.jar:cf/e$a.class */
    public class a implements AdapterView.OnItemClickListener {

        /* renamed from: b */
        public final C1081e f7172b;

        public a(C1081e c1081e) {
            this.f7172b = c1081e;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
            Intent intent;
            this.f7172b.f7164n.setVisibility(0);
            this.f7172b.f7171u = new File((String) this.f7172b.f7157g.get(i10));
            if (this.f7172b.f7171u != null && this.f7172b.f7171u.isFile()) {
                C1081e c1081e = this.f7172b;
                c1081e.f7154d = c1081e.f7171u.getName();
                if (this.f7172b.f7160j != null) {
                    if (this.f7172b.f7153c != null) {
                        C6783a unused = C1081e.f7150v = new C6783a(this.f7172b.f7153c);
                        if (C1081e.f7150v.m31285w() == 3) {
                            C1081e.f7150v.m31258Q(this.f7172b.f7153c.getResources().getString(2132017829));
                            intent = new Intent(this.f7172b.f7153c, (Class<?>) HoneyPlayer.class);
                        } else {
                            intent = new Intent(this.f7172b.f7153c, (Class<?>) HoneyPlayer.class);
                        }
                        intent.putExtra("type", "devicedata");
                        intent.putExtra("VIDEO_NUM", 0);
                        intent.putExtra("VIDEO_PATH", this.f7172b.f7171u.getPath());
                        this.f7172b.f7153c.startActivity(intent);
                    }
                    this.f7172b.f7168r.dismiss();
                    return;
                }
                return;
            }
            C1081e c1081e2 = this.f7172b;
            c1081e2.f7154d = c1081e2.f7171u.getName();
            ArrayList arrayList = new ArrayList();
            arrayList.clear();
            if (this.f7172b.f7154d.equals("!c2@f3qc@!V#VEVSD3gg3VC43hh&*%#H2252B@rv3F#RCD5%$#$V#")) {
                C1081e c1081e3 = this.f7172b;
                c1081e3.m6391v(c1081e3.f7171u);
                return;
            }
            arrayList.add(this.f7172b.f7171u.getParent() + "/!c2@f3qc@!V#VEVSD3gg3VC43hh&*%#H2252B@rv3F#RCD5%$#$V#");
            if (this.f7172b.f7171u.list() != null) {
                int i11 = 0;
                while (true) {
                    String[] list = this.f7172b.f7171u.list();
                    Objects.requireNonNull(list);
                    if (i11 >= list.length) {
                        break;
                    }
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(this.f7172b.f7171u.getPath());
                    sb2.append("/");
                    String[] list2 = this.f7172b.f7171u.list();
                    Objects.requireNonNull(list2);
                    sb2.append(list2[i11]);
                    arrayList.add(sb2.toString());
                    i11++;
                }
            }
            this.f7172b.f7157g.clear();
            this.f7172b.f7157g.addAll(arrayList);
            this.f7172b.f7162l.notifyDataSetChanged();
            this.f7172b.f7166p.setSelection(0);
            if (this.f7172b.f7166p != null) {
                this.f7172b.f7166p.requestFocus();
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:cf/e$b.class
     */
    /* renamed from: cf.e$b */
    /* loaded from: combined.jar:classes2.jar:cf/e$b.class */
    public class b implements DialogInterface.OnShowListener {

        /* renamed from: a */
        public final C1081e f7173a;

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:cf/e$b$a.class
         */
        /* renamed from: cf.e$b$a */
        /* loaded from: combined.jar:classes2.jar:cf/e$b$a.class */
        public class a implements View.OnClickListener {

            /* renamed from: b */
            public final b f7174b;

            public a(b bVar) {
                this.f7174b = bVar;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                this.f7174b.f7173a.f7168r.dismiss();
            }
        }

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:cf/e$b$b.class
         */
        /* renamed from: cf.e$b$b, reason: collision with other inner class name */
        /* loaded from: combined.jar:classes2.jar:cf/e$b$b.class */
        public class ViewOnClickListenerC10259b implements View.OnClickListener {

            /* renamed from: b */
            public final b f7175b;

            public ViewOnClickListenerC10259b(b bVar) {
                this.f7175b = bVar;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (this.f7175b.f7173a.f7157g == null || this.f7175b.f7173a.f7157g.get(0) == null) {
                    return;
                }
                this.f7175b.f7173a.m6391v(new File((String) this.f7175b.f7173a.f7157g.get(0)));
            }
        }

        public b(C1081e c1081e) {
            this.f7173a = c1081e;
        }

        @Override // android.content.DialogInterface.OnShowListener
        public void onShow(DialogInterface dialogInterface) {
            C1081e c1081e = this.f7173a;
            c1081e.f7163m = c1081e.f7168r.getButton(-2);
            C1081e c1081e2 = this.f7173a;
            c1081e2.f7164n = c1081e2.f7168r.getButton(-3);
            if (this.f7173a.f7171u == null || this.f7173a.f7171u.getParent() == null || this.f7173a.f7171u.getParent().equals("/storage/emulated/0")) {
                this.f7173a.f7164n.setVisibility(4);
            } else {
                this.f7173a.f7164n.setVisibility(0);
            }
            this.f7173a.f7163m.setTag("1");
            this.f7173a.f7164n.setTag("3");
            Button button = this.f7173a.f7163m;
            C1081e c1081e3 = this.f7173a;
            button.setOnFocusChangeListener(new h(c1081e3, c1081e3.f7163m));
            this.f7173a.f7163m.setTextColor(this.f7173a.f7153c.getResources().getColor(2131100158));
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f7173a.f7163m.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.f7173a.f7164n.getLayoutParams();
            marginLayoutParams.setMargins(0, 0, 50, 0);
            String m31288z = new C6783a(this.f7173a.f7153c).m31288z();
            if (m31288z.equals(C5251a.f30065s0)) {
                this.f7173a.f7163m.setTextSize(16.0f);
                this.f7173a.f7163m.setBackground(this.f7173a.f7153c.getResources().getDrawable(2131230845));
                marginLayoutParams.width = 230;
                marginLayoutParams.height = 90;
            } else {
                this.f7173a.f7163m.setTextSize(14.0f);
                this.f7173a.f7163m.setBackground(this.f7173a.f7153c.getResources().getDrawable(2131230828));
                marginLayoutParams.width = 255;
                marginLayoutParams.height = 135;
            }
            this.f7173a.f7163m.setOnClickListener(new a(this));
            this.f7173a.f7164n.setOnClickListener(new ViewOnClickListenerC10259b(this));
            Button button2 = this.f7173a.f7164n;
            C1081e c1081e4 = this.f7173a;
            button2.setOnFocusChangeListener(new h(c1081e4, c1081e4.f7164n));
            this.f7173a.f7164n.setTextColor(this.f7173a.f7153c.getResources().getColor(2131100158));
            if (m31288z.equals(C5251a.f30065s0)) {
                this.f7173a.f7164n.setTextSize(16.0f);
                this.f7173a.f7164n.setBackground(this.f7173a.f7153c.getResources().getDrawable(2131230845));
                marginLayoutParams2.width = 230;
                marginLayoutParams2.height = 90;
                return;
            }
            this.f7173a.f7164n.setTextSize(14.0f);
            this.f7173a.f7164n.setBackground(this.f7173a.f7153c.getResources().getDrawable(2131231576));
            marginLayoutParams2.width = 255;
            marginLayoutParams2.height = 135;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:cf/e$c.class
     */
    /* renamed from: cf.e$c */
    /* loaded from: combined.jar:classes2.jar:cf/e$c.class */
    public class c implements AdapterView.OnItemClickListener {

        /* renamed from: b */
        public final C1081e f7176b;

        public c(C1081e c1081e) {
            this.f7176b = c1081e;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
            C1081e c1081e;
            StringBuilder sb2;
            String str;
            C1081e c1081e2;
            String str2;
            if (((String) this.f7176b.f7157g.get(i10)).equals("Internal Storage")) {
                c1081e2 = this.f7176b;
                str2 = "/emulated/0";
            } else {
                if (this.f7176b.f7157g.get(i10) != null && i10 == 0 && ((String) this.f7176b.f7157g.get(i10)).equals("..")) {
                    this.f7176b.f7164n.performClick();
                    this.f7176b.m6390C();
                }
                if (this.f7176b.f7165o == null) {
                    c1081e = this.f7176b;
                    sb2 = new StringBuilder();
                } else if (this.f7176b.f7165o.get(this.f7176b.f7157g.get(i10)) == null || ((String) this.f7176b.f7165o.get(this.f7176b.f7157g.get(i10))).equals("")) {
                    c1081e = this.f7176b;
                    sb2 = new StringBuilder();
                } else {
                    c1081e = this.f7176b;
                    sb2 = new StringBuilder();
                    sb2.append("/");
                    sb2.append((String) this.f7176b.f7165o.get(this.f7176b.f7157g.get(i10)));
                    sb2.append("/Android/data/");
                    str = "com.maxdigitall.maxdigitaliptvbox";
                    sb2.append(str);
                    String sb3 = sb2.toString();
                    c1081e2 = c1081e;
                    str2 = sb3;
                }
                sb2.append("/");
                str = (String) this.f7176b.f7157g.get(i10);
                sb2.append(str);
                String sb32 = sb2.toString();
                c1081e2 = c1081e;
                str2 = sb32;
            }
            C1081e.m6379n(c1081e2, str2);
            this.f7176b.m6390C();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:cf/e$d.class
     */
    /* renamed from: cf.e$d */
    /* loaded from: combined.jar:classes2.jar:cf/e$d.class */
    public class d implements DialogInterface.OnShowListener {

        /* renamed from: a */
        public final C1081e f7177a;

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:cf/e$d$a.class
         */
        /* renamed from: cf.e$d$a */
        /* loaded from: combined.jar:classes2.jar:cf/e$d$a.class */
        public class a implements View.OnClickListener {

            /* renamed from: b */
            public final d f7178b;

            public a(d dVar) {
                this.f7178b = dVar;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                C1081e c1081e;
                File file;
                if (this.f7178b.f7177a.f7154d.equals(this.f7178b.f7177a.f7152b)) {
                    this.f7178b.f7177a.f7163m.performClick();
                    return;
                }
                if (!this.f7178b.f7177a.f7154d.equals("/storage/emulated/0")) {
                    this.f7178b.f7177a.f7154d = new File(this.f7178b.f7177a.f7154d).getParent();
                    String[] split = this.f7178b.f7177a.f7154d.split("/");
                    if (split.length >= 3) {
                        if (Pattern.compile("^\\(?(.{4})\\)?[- ]?(.{4})$").matcher(split[2]).matches()) {
                            if (this.f7178b.f7177a.f7154d.equals("/storage/" + split[2] + "/Android/data")) {
                                this.f7178b.f7177a.f7154d = "/storage/" + split[2];
                                c1081e = this.f7178b.f7177a;
                                file = new File(this.f7178b.f7177a.f7154d);
                            }
                        }
                        if (new File(this.f7178b.f7177a.f7154d).getParent().equals("/storage/" + split[2] + "/Android/data")) {
                            this.f7178b.f7177a.f7154d = "/storage/" + split[2] + "/Android/data/com.maxdigitall.maxdigitaliptvbox";
                        }
                    }
                    this.f7178b.f7177a.m6390C();
                }
                this.f7178b.f7177a.f7154d = "/storage/emulated";
                c1081e = this.f7178b.f7177a;
                file = new File(this.f7178b.f7177a.f7154d);
                c1081e.f7154d = file.getParent();
                this.f7178b.f7177a.m6390C();
            }
        }

        public d(C1081e c1081e) {
            this.f7177a = c1081e;
        }

        @Override // android.content.DialogInterface.OnShowListener
        public void onShow(DialogInterface dialogInterface) {
            Button button;
            Drawable drawable;
            int i10;
            C1081e c1081e = this.f7177a;
            c1081e.f7163m = c1081e.f7168r.getButton(-2);
            C1081e c1081e2 = this.f7177a;
            c1081e2.f7164n = c1081e2.f7168r.getButton(-3);
            if (this.f7177a.f7154d.equals(this.f7177a.f7152b)) {
                this.f7177a.f7164n.setVisibility(4);
            } else {
                this.f7177a.f7164n.setVisibility(0);
            }
            this.f7177a.f7163m.setTag("1");
            this.f7177a.f7164n.setTag("3");
            Button button2 = this.f7177a.f7163m;
            C1081e c1081e3 = this.f7177a;
            button2.setOnFocusChangeListener(new h(c1081e3, c1081e3.f7163m));
            this.f7177a.f7163m.setTextColor(this.f7177a.f7153c.getResources().getColor(2131100158));
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f7177a.f7163m.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.f7177a.f7164n.getLayoutParams();
            marginLayoutParams.setMargins(0, 0, 50, 0);
            String m31288z = new C6783a(this.f7177a.f7153c).m31288z();
            if (m31288z.equals(C5251a.f30065s0)) {
                this.f7177a.f7163m.setTextSize(16.0f);
                button = this.f7177a.f7163m;
                drawable = this.f7177a.f7153c.getResources().getDrawable(2131230845);
            } else {
                this.f7177a.f7163m.setTextSize(14.0f);
                button = this.f7177a.f7163m;
                drawable = this.f7177a.f7153c.getResources().getDrawable(2131230828);
            }
            button.setBackground(drawable);
            marginLayoutParams.width = 255;
            marginLayoutParams.height = 135;
            Button button3 = this.f7177a.f7164n;
            C1081e c1081e4 = this.f7177a;
            button3.setOnFocusChangeListener(new h(c1081e4, c1081e4.f7164n));
            this.f7177a.f7164n.setTextColor(this.f7177a.f7153c.getResources().getColor(2131100158));
            if (m31288z.equals(C5251a.f30065s0)) {
                this.f7177a.f7164n.setTextSize(16.0f);
                this.f7177a.f7164n.setBackground(this.f7177a.f7153c.getResources().getDrawable(2131230845));
                marginLayoutParams2.width = 230;
                i10 = 90;
            } else {
                this.f7177a.f7164n.setTextSize(14.0f);
                this.f7177a.f7164n.setBackground(this.f7177a.f7153c.getResources().getDrawable(2131231576));
                marginLayoutParams2.width = 250;
                i10 = 110;
            }
            marginLayoutParams2.height = i10;
            this.f7177a.f7164n.setOnClickListener(new a(this));
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:cf/e$e.class
     */
    /* renamed from: cf.e$e */
    /* loaded from: combined.jar:classes2.jar:cf/e$e.class */
    public class e implements DialogInterface.OnKeyListener {

        /* renamed from: b */
        public final C1081e f7179b;

        public e(C1081e c1081e) {
            this.f7179b = c1081e;
        }

        @Override // android.content.DialogInterface.OnKeyListener
        public boolean onKey(DialogInterface dialogInterface, int i10, KeyEvent keyEvent) {
            C1081e c1081e;
            File file;
            if (i10 != 4 || keyEvent.getAction() != 0) {
                return false;
            }
            if (this.f7179b.f7154d.equals(this.f7179b.f7152b)) {
                this.f7179b.f7168r.dismiss();
                return true;
            }
            if (!this.f7179b.f7154d.equals("/storage/emulated/0")) {
                this.f7179b.f7154d = new File(this.f7179b.f7154d).getParent();
                String[] split = this.f7179b.f7154d.split("/");
                if (split.length >= 3) {
                    if (Pattern.compile("^\\(?(.{4})\\)?[- ]?(.{4})$").matcher(split[2]).matches()) {
                        if (this.f7179b.f7154d.equals("/storage/" + split[2] + "/Android/data")) {
                            this.f7179b.f7154d = "/storage/" + split[2];
                            c1081e = this.f7179b;
                            file = new File(this.f7179b.f7154d);
                        }
                    }
                    if (new File(this.f7179b.f7154d).getParent().equals("/storage/" + split[2] + "/Android/data")) {
                        this.f7179b.f7154d = "/storage/" + split[2] + "/Android/data/com.maxdigitall.maxdigitaliptvbox";
                    }
                }
                this.f7179b.m6390C();
                return true;
            }
            this.f7179b.f7154d = "/storage/emulated";
            c1081e = this.f7179b;
            file = new File(this.f7179b.f7154d);
            c1081e.f7154d = file.getParent();
            this.f7179b.m6390C();
            return true;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:cf/e$f.class
     */
    /* renamed from: cf.e$f */
    /* loaded from: combined.jar:classes2.jar:cf/e$f.class */
    public class f implements Comparator<String> {

        /* renamed from: b */
        public final C1081e f7180b;

        public f(C1081e c1081e) {
            this.f7180b = c1081e;
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(String str, String str2) {
            return str.compareTo(str2);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:cf/e$g.class
     */
    /* renamed from: cf.e$g */
    /* loaded from: combined.jar:classes2.jar:cf/e$g.class */
    public interface g {
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:cf/e$h.class
     */
    /* renamed from: cf.e$h */
    /* loaded from: combined.jar:classes2.jar:cf/e$h.class */
    public class h implements View.OnFocusChangeListener {

        /* renamed from: b */
        public final View f7181b;

        /* renamed from: c */
        public final C1081e f7182c;

        public h(C1081e c1081e, View view) {
            this.f7182c = c1081e;
            this.f7181b = view;
        }

        /* renamed from: a */
        public final void m6396a(float f10) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f7181b, "scaleX", f10);
            ofFloat.setDuration(150L);
            ofFloat.start();
        }

        /* renamed from: b */
        public final void m6397b(float f10) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f7181b, "scaleY", f10);
            ofFloat.setDuration(150L);
            ofFloat.start();
        }

        @Override // android.view.View.OnFocusChangeListener
        @SuppressLint({"ResourceType"})
        public void onFocusChange(View view, boolean z10) {
            float f10;
            float f11 = 1.0f;
            if (z10) {
                View view2 = this.f7181b;
                if (view2 == null || view2.getTag() == null || !this.f7181b.getTag().equals("6")) {
                    if (z10) {
                        f11 = 1.12f;
                    }
                    m6396a(f11);
                    m6397b(f11);
                    View view3 = this.f7181b;
                    if (view3 != null && view3.getTag() != null && this.f7181b.getTag().equals("1") && this.f7182c.f7163m != null) {
                        this.f7182c.f7163m.setBackgroundResource(2131230828);
                    }
                    View view4 = this.f7181b;
                    if (view4 == null || view4.getTag() == null || !this.f7181b.getTag().equals("3") || this.f7182c.f7164n == null) {
                        return;
                    }
                    this.f7182c.f7164n.setBackgroundResource(2131230846);
                    return;
                }
                f10 = 1.0f;
                if (z10) {
                    f10 = 1.18f;
                }
            } else {
                if (z10) {
                    return;
                }
                View view5 = this.f7181b;
                if (view5 != null && view5.getTag() != null && this.f7181b.getTag().equals("1") && this.f7182c.f7163m != null) {
                    this.f7182c.f7163m.setBackgroundResource(2131230845);
                }
                View view6 = this.f7181b;
                f10 = 1.0f;
                if (view6 != null) {
                    f10 = 1.0f;
                    if (view6.getTag() != null) {
                        f10 = 1.0f;
                        if (this.f7181b.getTag().equals("3")) {
                            f10 = 1.0f;
                            if (this.f7182c.f7164n != null) {
                                this.f7182c.f7164n.setBackgroundResource(2131230845);
                                f10 = 1.0f;
                            }
                        }
                    }
                }
            }
            m6396a(f10);
            m6397b(f10);
        }
    }

    public C1081e(Context context, g gVar) {
        this.f7152b = "";
        this.f7156f = null;
        this.f7160j = null;
        this.f7153c = context;
        int length = context.getExternalFilesDirs("external").length;
        this.f7156f = new ArrayList();
        this.f7170t = new ArrayList();
        this.f7158h = new ArrayList();
        this.f7159i = new ArrayList();
        this.f7152b = "/storage";
        this.f7160j = gVar;
        try {
            this.f7152b = new File(this.f7152b).getCanonicalPath();
        } catch (IOException e10) {
        }
    }

    /* renamed from: n */
    public static /* synthetic */ String m6379n(C1081e c1081e, Object obj) {
        String str = c1081e.f7154d + obj;
        c1081e.f7154d = str;
        return str;
    }

    /* renamed from: y */
    public static int m6387y(float f10, Context context) {
        return (int) ((f10 * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    /* renamed from: A */
    public final List<String> m6388A(String str) {
        File file;
        String name;
        ArrayList arrayList = new ArrayList();
        try {
            file = new File(str);
        } catch (Exception e10) {
        }
        if (file.exists() && file.isDirectory()) {
            for (File file2 : file.listFiles()) {
                try {
                    if (file2.isDirectory()) {
                        name = file2.getName();
                    } else {
                        C5057a.m25291a(file2.getName());
                        name = file2.getName();
                    }
                    arrayList.add(name);
                } catch (Exception e11) {
                    e11.getMessage();
                }
            }
            Collections.sort(arrayList, new f(this));
            return arrayList;
        }
        return arrayList;
    }

    /* renamed from: B */
    public final void m6389B(List<String> list) {
        this.f7157g.clear();
        boolean z10 = false;
        for (String str : list) {
            if (!str.equals("self")) {
                if (str.equals("emulated")) {
                    z10 = true;
                } else if (Pattern.compile("^\\(?(.{4})\\)?[- ]?(.{4})$").matcher(str).matches()) {
                    this.f7165o.put("SD Card", str);
                    this.f7157g.add("SD Card");
                } else {
                    this.f7157g.add(str);
                }
            }
        }
        if (z10) {
            this.f7157g.add(0, "Internal Storage");
        }
    }

    /* renamed from: C */
    public final void m6390C() {
        Intent intent;
        List<String> list;
        String str;
        try {
            if (!this.f7154d.contains(".mp4") && !this.f7154d.contains(".mp3") && !this.f7154d.contains(".3gp") && !this.f7154d.contains(".ts") && !this.f7154d.contains(".webm") && !this.f7154d.contains(".mkv") && !this.f7154d.contains(".flv") && !this.f7154d.contains(".wmv") && !this.f7154d.contains(".MP3")) {
                if (this.f7154d.equals(this.f7152b)) {
                    m6389B(m6388A(this.f7154d));
                } else {
                    if (!this.f7154d.endsWith(".zip") && !this.f7154d.endsWith(".apk") && !this.f7154d.endsWith(".txt") && !this.f7154d.endsWith(".pdf") && !this.f7154d.endsWith(".m3u") && !this.f7154d.endsWith(".xml")) {
                        if (this.f7154d.indexOf(InstructionFileId.DOT) != this.f7154d.lastIndexOf(InstructionFileId.DOT)) {
                            if (!this.f7154d.endsWith(".zip") && !this.f7154d.endsWith(".apk")) {
                                if (!this.f7154d.endsWith(".mp4") || !this.f7154d.endsWith(".ts") || !this.f7154d.endsWith(".mp3") || !this.f7154d.endsWith(".webm") || !this.f7154d.endsWith(".3gp") || !this.f7154d.endsWith(".mkv") || !this.f7154d.endsWith(".flv") || !this.f7154d.endsWith(".wmv")) {
                                    Toast.makeText(this.f7153c, "File Not Supported !!", 1).show();
                                    this.f7164n.performClick();
                                }
                                this.f7157g.clear();
                                this.f7157g.add("..");
                                list = this.f7157g;
                                str = this.f7154d;
                            }
                            Toast.makeText(this.f7153c, "File Not Supported !!", 1).show();
                            this.f7164n.performClick();
                            this.f7157g.clear();
                            this.f7157g.add("..");
                            list = this.f7157g;
                            str = this.f7154d;
                        } else {
                            this.f7157g.clear();
                            this.f7157g.add("..");
                            list = this.f7157g;
                            str = this.f7154d;
                        }
                        list.addAll(m6388A(str));
                    }
                    Toast.makeText(this.f7153c, "File Not Supported !!", 1).show();
                    this.f7164n.performClick();
                }
                AlertDialog alertDialog = this.f7168r;
                if (alertDialog != null) {
                    ((TextView) alertDialog.findViewById(R.id.message)).setText(this.f7154d);
                }
                if (this.f7154d.equals(this.f7152b)) {
                    this.f7164n.setVisibility(4);
                } else {
                    this.f7164n.setVisibility(0);
                }
                this.f7161k.f32539c.clear();
                this.f7161k.f32539c.add(this.f7154d);
                C5852e c5852e = this.f7161k;
                c5852e.f32556t++;
                c5852e.notifyDataSetChanged();
                this.f7166p.setSelection(0);
                ListViewMaxHeight listViewMaxHeight = this.f7166p;
                if (listViewMaxHeight != null) {
                    listViewMaxHeight.requestFocus();
                    return;
                }
                return;
            }
            if (this.f7160j != null) {
                if (this.f7153c != null && this.f7169s.booleanValue()) {
                    C6783a c6783a = new C6783a(this.f7153c);
                    f7150v = c6783a;
                    if (c6783a.m31285w() == 3) {
                        f7150v.m31258Q(this.f7153c.getResources().getString(2132017829));
                        intent = new Intent(this.f7153c, (Class<?>) HoneyPlayer.class);
                    } else {
                        intent = new Intent(this.f7153c, (Class<?>) HoneyPlayer.class);
                    }
                    intent.putExtra("type", "devicedata");
                    intent.putExtra("VIDEO_NUM", 0);
                    intent.putExtra("VIDEO_PATH", this.f7154d);
                    this.f7153c.startActivity(intent);
                }
                this.f7164n.performClick();
            }
        } catch (Exception e10) {
        }
    }

    /* renamed from: v */
    public final void m6391v(File file) {
        try {
            ArrayList arrayList = new ArrayList();
            arrayList.clear();
            if (file.getParent() != null) {
                String parent = file.getParent();
                if (parent.equals("/storage/emulated/0")) {
                    this.f7164n.setVisibility(4);
                } else {
                    arrayList.add(new File(parent).getParent() + "/!c2@f3qc@!V#VEVSD3gg3VC43hh&*%#H2252B@rv3F#RCD5%$#$V#");
                    this.f7164n.setVisibility(0);
                }
                File file2 = new File(file.getParent());
                if (file2.list() != null) {
                    int i10 = 0;
                    while (true) {
                        String[] list = file2.list();
                        Objects.requireNonNull(list);
                        if (i10 >= list.length) {
                            break;
                        }
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(file.getParent());
                        sb2.append("/");
                        String[] list2 = file2.list();
                        Objects.requireNonNull(list2);
                        sb2.append(list2[i10]);
                        arrayList.add(sb2.toString());
                        i10++;
                    }
                }
            }
            this.f7157g.clear();
            this.f7157g.addAll(arrayList);
            this.f7162l.notifyDataSetChanged();
            this.f7166p.setSelection(0);
            ListViewMaxHeight listViewMaxHeight = this.f7166p;
            if (listViewMaxHeight != null) {
                listViewMaxHeight.requestFocus();
            }
        } catch (Exception e10) {
        }
    }

    /* renamed from: w */
    public void m6392w(String str) {
        File file = new File(str);
        if (!file.exists() || !file.isDirectory()) {
            str = this.f7152b;
        }
        try {
            String canonicalPath = new File(str).getCanonicalPath();
            this.f7170t.clear();
            this.f7154d = canonicalPath;
            this.f7155e = m6388A(canonicalPath);
            this.f7157g = m6388A("");
            m6389B(this.f7155e);
            this.f7167q = m6394z(canonicalPath, this.f7157g);
            C5852e c5852e = new C5852e(this.f7153c, this.f7157g);
            this.f7161k = c5852e;
            ListViewMaxHeight listViewMaxHeight = this.f7166p;
            if (listViewMaxHeight != null) {
                listViewMaxHeight.setAdapter((ListAdapter) c5852e);
                this.f7166p.setOnItemClickListener(new c(this));
            }
            AlertDialog create = this.f7167q.create();
            this.f7168r = create;
            create.setOnShowListener(new d(this));
            this.f7168r.setOnKeyListener(new e(this));
            this.f7168r.show();
            this.f7168r.getWindow().setLayout(-1, -1);
            this.f7168r.getWindow().setBackgroundDrawableResource(2131100153);
        } catch (IOException e10) {
        }
    }

    /* renamed from: x */
    public void m6393x(String str) {
        try {
            File absoluteFile = Environment.getExternalStoragePublicDirectory("").getAbsoluteFile();
            ArrayList arrayList = new ArrayList();
            this.f7157g = arrayList;
            arrayList.clear();
            if (absoluteFile.list() != null) {
                int i10 = 0;
                while (true) {
                    String[] list = absoluteFile.list();
                    Objects.requireNonNull(list);
                    if (i10 >= list.length) {
                        break;
                    }
                    String[] list2 = absoluteFile.list();
                    Objects.requireNonNull(list2);
                    this.f7157g.add(new File(Environment.getExternalStoragePublicDirectory(list2[i10]).toString()).getPath());
                    i10++;
                }
            }
            AlertDialog.Builder m6394z = m6394z("", this.f7157g);
            this.f7167q = m6394z;
            m6394z.setNegativeButton(this.f7153c.getResources().getString(2132018556), (DialogInterface.OnClickListener) null);
            this.f7167q.setNeutralButton(this.f7153c.getResources().getString(2132018555), (DialogInterface.OnClickListener) null);
            C5854g c5854g = new C5854g(this.f7153c, this.f7157g);
            this.f7162l = c5854g;
            ListViewMaxHeight listViewMaxHeight = this.f7166p;
            if (listViewMaxHeight != null) {
                listViewMaxHeight.setAdapter((ListAdapter) c5854g);
                this.f7166p.setOnItemClickListener(new a(this));
            }
            AlertDialog create = this.f7167q.create();
            this.f7168r = create;
            create.setOnShowListener(new b(this));
            this.f7168r.show();
            if (this.f7168r.getWindow() != null) {
                this.f7168r.getWindow().setBackgroundDrawable(new ColorDrawable(-1));
                this.f7168r.getWindow().setLayout(m6387y(650.0f, this.f7153c), -2);
            }
        } catch (Exception e10) {
        }
    }

    /* renamed from: z */
    public final AlertDialog.Builder m6394z(String str, List<String> list) {
        this.f7167q = new AlertDialog.Builder(this.f7153c, 2132082694);
        LinearLayout linearLayout = new LinearLayout(this.f7153c);
        linearLayout.setOrientation(0);
        TextView textView = new TextView(this.f7153c);
        textView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        textView.setText(this.f7153c.getResources().getString(2132017467));
        Drawable drawable = this.f7153c.getResources().getDrawable(2131230894);
        drawable.setBounds(0, 0, 80, 80);
        textView.setCompoundDrawables(drawable, null, null, null);
        textView.setTextSize(22.0f);
        textView.setTextColor(this.f7153c.getResources().getColor(R.color.white));
        textView.setPadding(50, 50, 0, 0);
        textView.setTypeface(null, 1);
        linearLayout.addView(textView);
        this.f7167q.setCustomTitle(linearLayout);
        View inflate = ((LayoutInflater) this.f7153c.getSystemService("layout_inflater")).inflate(2131624176, (ViewGroup) null);
        this.f7167q.setView(inflate);
        this.f7166p = (ListViewMaxHeight) inflate.findViewById(2131428560);
        this.f7167q.setCancelable(true);
        return this.f7167q;
    }
}
