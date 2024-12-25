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
  classes2.jar:cf/d.class
 */
/* renamed from: cf.d */
/* loaded from: combined.jar:classes2.jar:cf/d.class */
public class C1080d {

    /* renamed from: v */
    public static C6783a f7117v;

    /* renamed from: b */
    public String f7119b;

    /* renamed from: c */
    public Context f7120c;

    /* renamed from: f */
    public List<String> f7123f;

    /* renamed from: h */
    public List<Integer> f7125h;

    /* renamed from: i */
    public List<Integer> f7126i;

    /* renamed from: j */
    public g f7127j;

    /* renamed from: k */
    public C5852e f7128k;

    /* renamed from: l */
    public Button f7129l;

    /* renamed from: m */
    public Button f7130m;

    /* renamed from: o */
    public ListViewMaxHeight f7132o;

    /* renamed from: p */
    public AlertDialog.Builder f7133p;

    /* renamed from: q */
    public AlertDialog f7134q;

    /* renamed from: s */
    public List<String> f7136s;

    /* renamed from: t */
    public C5854g f7137t;

    /* renamed from: u */
    public File f7138u;

    /* renamed from: a */
    public boolean f7118a = true;

    /* renamed from: d */
    public String f7121d = "";

    /* renamed from: e */
    public List<String> f7122e = null;

    /* renamed from: g */
    public List<String> f7124g = null;

    /* renamed from: n */
    public HashMap<String, String> f7131n = new HashMap<>();

    /* renamed from: r */
    public Boolean f7135r = Boolean.TRUE;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:cf/d$a.class
     */
    /* renamed from: cf.d$a */
    /* loaded from: combined.jar:classes2.jar:cf/d$a.class */
    public class a implements AdapterView.OnItemClickListener {

        /* renamed from: b */
        public final C1080d f7139b;

        public a(C1080d c1080d) {
            this.f7139b = c1080d;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
            Intent intent;
            this.f7139b.f7130m.setVisibility(0);
            this.f7139b.f7138u = new File((String) this.f7139b.f7124g.get(i10));
            if (this.f7139b.f7138u != null && this.f7139b.f7138u.isFile()) {
                C1080d c1080d = this.f7139b;
                c1080d.f7121d = c1080d.f7138u.getName();
                if (this.f7139b.f7127j != null) {
                    if (this.f7139b.f7120c != null) {
                        C6783a unused = C1080d.f7117v = new C6783a(this.f7139b.f7120c);
                        if (C1080d.f7117v.m31285w() == 3) {
                            C1080d.f7117v.m31258Q(this.f7139b.f7120c.getResources().getString(2132017829));
                            intent = new Intent(this.f7139b.f7120c, (Class<?>) HoneyPlayer.class);
                        } else {
                            intent = new Intent(this.f7139b.f7120c, (Class<?>) HoneyPlayer.class);
                        }
                        intent.putExtra("type", "devicedata");
                        intent.putExtra("VIDEO_NUM", 0);
                        intent.putExtra("VIDEO_PATH", this.f7139b.f7138u.getPath());
                        this.f7139b.f7120c.startActivity(intent);
                    }
                    this.f7139b.f7134q.dismiss();
                    return;
                }
                return;
            }
            C1080d c1080d2 = this.f7139b;
            c1080d2.f7121d = c1080d2.f7138u.getName();
            ArrayList arrayList = new ArrayList();
            arrayList.clear();
            if (this.f7139b.f7121d.equals("!c2@f3qc@!V#VEVSD3gg3VC43hh&*%#H2252B@rv3F#RCD5%$#$V#")) {
                C1080d c1080d3 = this.f7139b;
                c1080d3.m6359v(c1080d3.f7138u);
                return;
            }
            arrayList.add(this.f7139b.f7138u.getParent() + "/!c2@f3qc@!V#VEVSD3gg3VC43hh&*%#H2252B@rv3F#RCD5%$#$V#");
            if (this.f7139b.f7138u.list() != null) {
                int i11 = 0;
                while (true) {
                    String[] list = this.f7139b.f7138u.list();
                    Objects.requireNonNull(list);
                    if (i11 >= list.length) {
                        break;
                    }
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(this.f7139b.f7138u.getPath());
                    sb2.append("/");
                    String[] list2 = this.f7139b.f7138u.list();
                    Objects.requireNonNull(list2);
                    sb2.append(list2[i11]);
                    arrayList.add(sb2.toString());
                    i11++;
                }
            }
            this.f7139b.f7124g.clear();
            this.f7139b.f7124g.addAll(arrayList);
            this.f7139b.f7137t.notifyDataSetChanged();
            this.f7139b.f7132o.setSelection(0);
            if (this.f7139b.f7132o != null) {
                this.f7139b.f7132o.requestFocus();
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:cf/d$b.class
     */
    /* renamed from: cf.d$b */
    /* loaded from: combined.jar:classes2.jar:cf/d$b.class */
    public class b implements DialogInterface.OnShowListener {

        /* renamed from: a */
        public final C1080d f7140a;

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:cf/d$b$a.class
         */
        /* renamed from: cf.d$b$a */
        /* loaded from: combined.jar:classes2.jar:cf/d$b$a.class */
        public class a implements View.OnClickListener {

            /* renamed from: b */
            public final b f7141b;

            public a(b bVar) {
                this.f7141b = bVar;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                this.f7141b.f7140a.f7134q.dismiss();
            }
        }

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:cf/d$b$b.class
         */
        /* renamed from: cf.d$b$b, reason: collision with other inner class name */
        /* loaded from: combined.jar:classes2.jar:cf/d$b$b.class */
        public class ViewOnClickListenerC10258b implements View.OnClickListener {

            /* renamed from: b */
            public final b f7142b;

            public ViewOnClickListenerC10258b(b bVar) {
                this.f7142b = bVar;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (this.f7142b.f7140a.f7124g == null || this.f7142b.f7140a.f7124g.get(0) == null) {
                    return;
                }
                this.f7142b.f7140a.m6359v(new File((String) this.f7142b.f7140a.f7124g.get(0)));
            }
        }

        public b(C1080d c1080d) {
            this.f7140a = c1080d;
        }

        @Override // android.content.DialogInterface.OnShowListener
        public void onShow(DialogInterface dialogInterface) {
            C1080d c1080d = this.f7140a;
            c1080d.f7129l = c1080d.f7134q.getButton(-2);
            C1080d c1080d2 = this.f7140a;
            c1080d2.f7130m = c1080d2.f7134q.getButton(-3);
            if (this.f7140a.f7138u == null || this.f7140a.f7138u.getParent() == null || this.f7140a.f7138u.getParent().equals("/storage/emulated/0")) {
                this.f7140a.f7130m.setVisibility(4);
            } else {
                this.f7140a.f7130m.setVisibility(0);
            }
            this.f7140a.f7129l.setTag("1");
            this.f7140a.f7130m.setTag("3");
            Button button = this.f7140a.f7129l;
            C1080d c1080d3 = this.f7140a;
            button.setOnFocusChangeListener(new h(c1080d3, c1080d3.f7129l));
            this.f7140a.f7129l.setTextColor(this.f7140a.f7120c.getResources().getColor(2131100158));
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f7140a.f7129l.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.f7140a.f7130m.getLayoutParams();
            marginLayoutParams.setMargins(0, 0, 50, 0);
            String m31288z = new C6783a(this.f7140a.f7120c).m31288z();
            if (m31288z.equals(C5251a.f30065s0)) {
                this.f7140a.f7129l.setTextSize(16.0f);
                this.f7140a.f7129l.setBackground(this.f7140a.f7120c.getResources().getDrawable(2131230845));
                marginLayoutParams.width = 230;
                marginLayoutParams.height = 90;
            } else {
                this.f7140a.f7129l.setTextSize(14.0f);
                this.f7140a.f7129l.setBackground(this.f7140a.f7120c.getResources().getDrawable(2131230828));
                marginLayoutParams.width = 255;
                marginLayoutParams.height = 135;
            }
            this.f7140a.f7129l.setOnClickListener(new a(this));
            this.f7140a.f7130m.setOnClickListener(new ViewOnClickListenerC10258b(this));
            Button button2 = this.f7140a.f7130m;
            C1080d c1080d4 = this.f7140a;
            button2.setOnFocusChangeListener(new h(c1080d4, c1080d4.f7130m));
            this.f7140a.f7130m.setTextColor(this.f7140a.f7120c.getResources().getColor(2131100158));
            if (m31288z.equals(C5251a.f30065s0)) {
                this.f7140a.f7130m.setTextSize(16.0f);
                this.f7140a.f7130m.setBackground(this.f7140a.f7120c.getResources().getDrawable(2131230845));
                marginLayoutParams2.width = 230;
                marginLayoutParams2.height = 90;
                return;
            }
            this.f7140a.f7130m.setTextSize(14.0f);
            this.f7140a.f7130m.setBackground(this.f7140a.f7120c.getResources().getDrawable(2131231576));
            marginLayoutParams2.width = 255;
            marginLayoutParams2.height = 135;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:cf/d$c.class
     */
    /* renamed from: cf.d$c */
    /* loaded from: combined.jar:classes2.jar:cf/d$c.class */
    public class c implements AdapterView.OnItemClickListener {

        /* renamed from: b */
        public final C1080d f7143b;

        public c(C1080d c1080d) {
            this.f7143b = c1080d;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
            C1080d c1080d;
            StringBuilder sb2;
            StringBuilder sb3;
            String str;
            String sb4;
            if (((String) this.f7143b.f7124g.get(i10)).equals("Internal Storage")) {
                c1080d = this.f7143b;
                sb4 = "/emulated/0";
            } else {
                if (this.f7143b.f7124g.get(i10) != null && i10 == 0 && ((String) this.f7143b.f7124g.get(i10)).equals("..")) {
                    this.f7143b.f7130m.performClick();
                    this.f7143b.m6358C();
                }
                if (this.f7143b.f7131n == null) {
                    c1080d = this.f7143b;
                    sb2 = new StringBuilder();
                } else if (this.f7143b.f7131n.get(this.f7143b.f7124g.get(i10)) == null || ((String) this.f7143b.f7131n.get(this.f7143b.f7124g.get(i10))).equals("")) {
                    c1080d = this.f7143b;
                    sb2 = new StringBuilder();
                } else {
                    c1080d = this.f7143b;
                    sb3 = new StringBuilder();
                    sb3.append("/");
                    sb3.append((String) this.f7143b.f7131n.get(this.f7143b.f7124g.get(i10)));
                    sb3.append("/Android/data/");
                    str = "com.maxdigitall.maxdigitaliptvbox";
                    sb3.append(str);
                    sb4 = sb3.toString();
                }
                sb2.append("/");
                sb3 = sb2;
                str = (String) this.f7143b.f7124g.get(i10);
                sb3.append(str);
                sb4 = sb3.toString();
            }
            C1080d.m6347n(c1080d, sb4);
            this.f7143b.m6358C();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:cf/d$d.class
     */
    /* renamed from: cf.d$d */
    /* loaded from: combined.jar:classes2.jar:cf/d$d.class */
    public class d implements DialogInterface.OnShowListener {

        /* renamed from: a */
        public final C1080d f7144a;

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:cf/d$d$a.class
         */
        /* renamed from: cf.d$d$a */
        /* loaded from: combined.jar:classes2.jar:cf/d$d$a.class */
        public class a implements View.OnClickListener {

            /* renamed from: b */
            public final d f7145b;

            public a(d dVar) {
                this.f7145b = dVar;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                C1080d c1080d;
                File file;
                if (this.f7145b.f7144a.f7121d.equals(this.f7145b.f7144a.f7119b)) {
                    this.f7145b.f7144a.f7129l.performClick();
                    return;
                }
                if (!this.f7145b.f7144a.f7121d.equals("/storage/emulated/0")) {
                    this.f7145b.f7144a.f7121d = new File(this.f7145b.f7144a.f7121d).getParent();
                    String[] split = this.f7145b.f7144a.f7121d.split("/");
                    if (split.length >= 3) {
                        if (Pattern.compile("^\\(?(.{4})\\)?[- ]?(.{4})$").matcher(split[2]).matches()) {
                            if (this.f7145b.f7144a.f7121d.equals("/storage/" + split[2] + "/Android/data")) {
                                this.f7145b.f7144a.f7121d = "/storage/" + split[2];
                                c1080d = this.f7145b.f7144a;
                                file = new File(this.f7145b.f7144a.f7121d);
                            }
                        }
                        if (new File(this.f7145b.f7144a.f7121d).getParent().equals("/storage/" + split[2] + "/Android/data")) {
                            this.f7145b.f7144a.f7121d = "/storage/" + split[2] + "/Android/data/com.maxdigitall.maxdigitaliptvbox";
                        }
                    }
                    this.f7145b.f7144a.m6358C();
                }
                this.f7145b.f7144a.f7121d = "/storage/emulated";
                c1080d = this.f7145b.f7144a;
                file = new File(this.f7145b.f7144a.f7121d);
                c1080d.f7121d = file.getParent();
                this.f7145b.f7144a.m6358C();
            }
        }

        public d(C1080d c1080d) {
            this.f7144a = c1080d;
        }

        @Override // android.content.DialogInterface.OnShowListener
        public void onShow(DialogInterface dialogInterface) {
            C1080d c1080d = this.f7144a;
            c1080d.f7129l = c1080d.f7134q.getButton(-2);
            C1080d c1080d2 = this.f7144a;
            c1080d2.f7130m = c1080d2.f7134q.getButton(-3);
            if (this.f7144a.f7121d.equals(this.f7144a.f7119b)) {
                this.f7144a.f7130m.setVisibility(4);
            } else {
                this.f7144a.f7130m.setVisibility(0);
            }
            this.f7144a.f7129l.setTag("1");
            this.f7144a.f7130m.setTag("3");
            Button button = this.f7144a.f7129l;
            C1080d c1080d3 = this.f7144a;
            button.setOnFocusChangeListener(new h(c1080d3, c1080d3.f7129l));
            this.f7144a.f7129l.setTextColor(this.f7144a.f7120c.getResources().getColor(2131100158));
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f7144a.f7129l.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.f7144a.f7130m.getLayoutParams();
            marginLayoutParams.setMargins(0, 0, 50, 0);
            String m31288z = new C6783a(this.f7144a.f7120c).m31288z();
            if (m31288z.equals(C5251a.f30065s0)) {
                this.f7144a.f7129l.setTextSize(16.0f);
                this.f7144a.f7129l.setBackground(this.f7144a.f7120c.getResources().getDrawable(2131230845));
                marginLayoutParams.width = 230;
                marginLayoutParams.height = 90;
            } else {
                this.f7144a.f7129l.setTextSize(14.0f);
                this.f7144a.f7129l.setBackground(this.f7144a.f7120c.getResources().getDrawable(2131230828));
                marginLayoutParams.width = 255;
                marginLayoutParams.height = 135;
            }
            Button button2 = this.f7144a.f7130m;
            C1080d c1080d4 = this.f7144a;
            button2.setOnFocusChangeListener(new h(c1080d4, c1080d4.f7130m));
            this.f7144a.f7130m.setTextColor(this.f7144a.f7120c.getResources().getColor(2131100158));
            if (m31288z.equals(C5251a.f30065s0)) {
                this.f7144a.f7130m.setTextSize(16.0f);
                this.f7144a.f7130m.setBackground(this.f7144a.f7120c.getResources().getDrawable(2131230845));
                marginLayoutParams2.width = 230;
                marginLayoutParams2.height = 90;
            } else {
                this.f7144a.f7130m.setTextSize(14.0f);
                this.f7144a.f7130m.setBackground(this.f7144a.f7120c.getResources().getDrawable(2131231576));
                marginLayoutParams2.width = 250;
                marginLayoutParams2.height = 110;
            }
            this.f7144a.f7130m.setOnClickListener(new a(this));
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:cf/d$e.class
     */
    /* renamed from: cf.d$e */
    /* loaded from: combined.jar:classes2.jar:cf/d$e.class */
    public class e implements DialogInterface.OnKeyListener {

        /* renamed from: b */
        public final C1080d f7146b;

        public e(C1080d c1080d) {
            this.f7146b = c1080d;
        }

        @Override // android.content.DialogInterface.OnKeyListener
        public boolean onKey(DialogInterface dialogInterface, int i10, KeyEvent keyEvent) {
            C1080d c1080d;
            File file;
            if (i10 != 4 || keyEvent.getAction() != 0) {
                return false;
            }
            if (this.f7146b.f7121d.equals(this.f7146b.f7119b)) {
                this.f7146b.f7134q.dismiss();
                return true;
            }
            if (!this.f7146b.f7121d.equals("/storage/emulated/0")) {
                this.f7146b.f7121d = new File(this.f7146b.f7121d).getParent();
                String[] split = this.f7146b.f7121d.split("/");
                if (split.length >= 3) {
                    if (Pattern.compile("^\\(?(.{4})\\)?[- ]?(.{4})$").matcher(split[2]).matches()) {
                        if (this.f7146b.f7121d.equals("/storage/" + split[2] + "/Android/data")) {
                            this.f7146b.f7121d = "/storage/" + split[2];
                            c1080d = this.f7146b;
                            file = new File(this.f7146b.f7121d);
                        }
                    }
                    if (new File(this.f7146b.f7121d).getParent().equals("/storage/" + split[2] + "/Android/data")) {
                        this.f7146b.f7121d = "/storage/" + split[2] + "/Android/data/com.maxdigitall.maxdigitaliptvbox";
                    }
                }
                this.f7146b.m6358C();
                return true;
            }
            this.f7146b.f7121d = "/storage/emulated";
            c1080d = this.f7146b;
            file = new File(this.f7146b.f7121d);
            c1080d.f7121d = file.getParent();
            this.f7146b.m6358C();
            return true;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:cf/d$f.class
     */
    /* renamed from: cf.d$f */
    /* loaded from: combined.jar:classes2.jar:cf/d$f.class */
    public class f implements Comparator<String> {

        /* renamed from: b */
        public final C1080d f7147b;

        public f(C1080d c1080d) {
            this.f7147b = c1080d;
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(String str, String str2) {
            return str.compareTo(str2);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:cf/d$g.class
     */
    /* renamed from: cf.d$g */
    /* loaded from: combined.jar:classes2.jar:cf/d$g.class */
    public interface g {
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:cf/d$h.class
     */
    /* renamed from: cf.d$h */
    /* loaded from: combined.jar:classes2.jar:cf/d$h.class */
    public class h implements View.OnFocusChangeListener {

        /* renamed from: b */
        public final View f7148b;

        /* renamed from: c */
        public final C1080d f7149c;

        public h(C1080d c1080d, View view) {
            this.f7149c = c1080d;
            this.f7148b = view;
        }

        /* renamed from: a */
        public final void m6364a(float f10) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f7148b, "scaleX", f10);
            ofFloat.setDuration(150L);
            ofFloat.start();
        }

        /* renamed from: b */
        public final void m6365b(float f10) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f7148b, "scaleY", f10);
            ofFloat.setDuration(150L);
            ofFloat.start();
        }

        @Override // android.view.View.OnFocusChangeListener
        @SuppressLint({"ResourceType"})
        public void onFocusChange(View view, boolean z10) {
            float f10;
            float f11 = 1.0f;
            if (z10) {
                View view2 = this.f7148b;
                if (view2 == null || view2.getTag() == null || !this.f7148b.getTag().equals("6")) {
                    if (z10) {
                        f11 = 1.12f;
                    }
                    m6364a(f11);
                    m6365b(f11);
                    View view3 = this.f7148b;
                    if (view3 != null && view3.getTag() != null && this.f7148b.getTag().equals("1") && this.f7149c.f7129l != null) {
                        this.f7149c.f7129l.setBackgroundResource(2131230828);
                    }
                    View view4 = this.f7148b;
                    if (view4 == null || view4.getTag() == null || !this.f7148b.getTag().equals("3") || this.f7149c.f7130m == null) {
                        return;
                    }
                    this.f7149c.f7130m.setBackgroundResource(2131230846);
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
                View view5 = this.f7148b;
                if (view5 != null && view5.getTag() != null && this.f7148b.getTag().equals("1") && this.f7149c.f7129l != null) {
                    this.f7149c.f7129l.setBackgroundResource(2131230845);
                }
                View view6 = this.f7148b;
                f10 = 1.0f;
                if (view6 != null) {
                    f10 = 1.0f;
                    if (view6.getTag() != null) {
                        f10 = 1.0f;
                        if (this.f7148b.getTag().equals("3")) {
                            f10 = 1.0f;
                            if (this.f7149c.f7130m != null) {
                                this.f7149c.f7130m.setBackgroundResource(2131230845);
                                f10 = 1.0f;
                            }
                        }
                    }
                }
            }
            m6364a(f10);
            m6365b(f10);
        }
    }

    public C1080d(Context context, g gVar) {
        this.f7119b = "";
        this.f7123f = null;
        this.f7127j = null;
        this.f7120c = context;
        int length = context.getExternalFilesDirs("external").length;
        this.f7123f = new ArrayList();
        this.f7136s = new ArrayList();
        this.f7125h = new ArrayList();
        this.f7126i = new ArrayList();
        this.f7119b = "/storage";
        this.f7127j = gVar;
        try {
            this.f7119b = new File(this.f7119b).getCanonicalPath();
        } catch (IOException e10) {
        }
    }

    /* renamed from: n */
    public static /* synthetic */ String m6347n(C1080d c1080d, Object obj) {
        String str = c1080d.f7121d + obj;
        c1080d.f7121d = str;
        return str;
    }

    /* renamed from: y */
    public static int m6355y(float f10, Context context) {
        return (int) ((f10 * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    /* renamed from: A */
    public final List<String> m6356A(String str) {
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
    public final void m6357B(List<String> list) {
        this.f7124g.clear();
        boolean z10 = false;
        for (String str : list) {
            if (!str.equals("self")) {
                if (str.equals("emulated")) {
                    z10 = true;
                } else if (Pattern.compile("^\\(?(.{4})\\)?[- ]?(.{4})$").matcher(str).matches()) {
                    this.f7131n.put("SD Card", str);
                    this.f7124g.add("SD Card");
                } else {
                    this.f7124g.add(str);
                }
            }
        }
        if (z10) {
            this.f7124g.add(0, "Internal Storage");
        }
    }

    /* renamed from: C */
    public final void m6358C() {
        Intent intent;
        List<String> list;
        String str;
        try {
            if (!this.f7121d.contains(".mp4") && !this.f7121d.contains(".mp3") && !this.f7121d.contains(".3gp") && !this.f7121d.contains(".ts") && !this.f7121d.contains(".webm") && !this.f7121d.contains(".mkv") && !this.f7121d.contains(".flv") && !this.f7121d.contains(".wmv") && !this.f7121d.contains(".MP3")) {
                if (this.f7121d.equals(this.f7119b)) {
                    m6357B(m6356A(this.f7121d));
                } else {
                    if (!this.f7121d.endsWith(".zip") && !this.f7121d.endsWith(".apk") && !this.f7121d.endsWith(".txt") && !this.f7121d.endsWith(".pdf") && !this.f7121d.endsWith(".m3u") && !this.f7121d.endsWith(".xml")) {
                        if (this.f7121d.indexOf(InstructionFileId.DOT) != this.f7121d.lastIndexOf(InstructionFileId.DOT)) {
                            if (!this.f7121d.endsWith(".zip") && !this.f7121d.endsWith(".apk")) {
                                if (!this.f7121d.endsWith(".mp4") || !this.f7121d.endsWith(".ts") || !this.f7121d.endsWith(".mp3") || !this.f7121d.endsWith(".webm") || !this.f7121d.endsWith(".3gp") || !this.f7121d.endsWith(".mkv") || !this.f7121d.endsWith(".flv") || !this.f7121d.endsWith(".wmv")) {
                                    Toast.makeText(this.f7120c, "File Not Supported !!", 1).show();
                                    this.f7130m.performClick();
                                }
                                this.f7124g.clear();
                                this.f7124g.add("..");
                                list = this.f7124g;
                                str = this.f7121d;
                            }
                            Toast.makeText(this.f7120c, "File Not Supported !!", 1).show();
                            this.f7130m.performClick();
                            this.f7124g.clear();
                            this.f7124g.add("..");
                            list = this.f7124g;
                            str = this.f7121d;
                        } else {
                            this.f7124g.clear();
                            this.f7124g.add("..");
                            list = this.f7124g;
                            str = this.f7121d;
                        }
                        list.addAll(m6356A(str));
                    }
                    Toast.makeText(this.f7120c, "File Not Supported !!", 1).show();
                    this.f7130m.performClick();
                }
                AlertDialog alertDialog = this.f7134q;
                if (alertDialog != null) {
                    ((TextView) alertDialog.findViewById(R.id.message)).setText(this.f7121d);
                }
                if (this.f7121d.equals(this.f7119b)) {
                    this.f7130m.setVisibility(4);
                } else {
                    this.f7130m.setVisibility(0);
                }
                this.f7128k.f32539c.clear();
                this.f7128k.f32539c.add(this.f7121d);
                C5852e c5852e = this.f7128k;
                c5852e.f32556t++;
                c5852e.notifyDataSetChanged();
                this.f7132o.setSelection(0);
                ListViewMaxHeight listViewMaxHeight = this.f7132o;
                if (listViewMaxHeight != null) {
                    listViewMaxHeight.requestFocus();
                    return;
                }
                return;
            }
            if (this.f7127j != null) {
                if (this.f7120c != null && this.f7135r.booleanValue()) {
                    C6783a c6783a = new C6783a(this.f7120c);
                    f7117v = c6783a;
                    if (c6783a.m31285w() == 3) {
                        f7117v.m31258Q(this.f7120c.getResources().getString(2132017829));
                        intent = new Intent(this.f7120c, (Class<?>) HoneyPlayer.class);
                    } else {
                        intent = new Intent(this.f7120c, (Class<?>) HoneyPlayer.class);
                    }
                    intent.putExtra("type", "devicedata");
                    intent.putExtra("VIDEO_NUM", 0);
                    intent.putExtra("VIDEO_PATH", this.f7121d);
                    this.f7120c.startActivity(intent);
                }
                this.f7130m.performClick();
            }
        } catch (Exception e10) {
        }
    }

    /* renamed from: v */
    public final void m6359v(File file) {
        try {
            ArrayList arrayList = new ArrayList();
            arrayList.clear();
            if (file.getParent() != null) {
                String parent = file.getParent();
                if (parent.equals("/storage/emulated/0")) {
                    this.f7130m.setVisibility(4);
                } else {
                    arrayList.add(new File(parent).getParent() + "/!c2@f3qc@!V#VEVSD3gg3VC43hh&*%#H2252B@rv3F#RCD5%$#$V#");
                    this.f7130m.setVisibility(0);
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
            this.f7124g.clear();
            this.f7124g.addAll(arrayList);
            this.f7137t.notifyDataSetChanged();
            this.f7132o.setSelection(0);
            ListViewMaxHeight listViewMaxHeight = this.f7132o;
            if (listViewMaxHeight != null) {
                listViewMaxHeight.requestFocus();
            }
        } catch (Exception e10) {
        }
    }

    /* renamed from: w */
    public void m6360w(String str) {
        File file = new File(str);
        if (!file.exists() || !file.isDirectory()) {
            str = this.f7119b;
        }
        try {
            String canonicalPath = new File(str).getCanonicalPath();
            this.f7136s.clear();
            this.f7121d = canonicalPath;
            this.f7122e = m6356A(canonicalPath);
            this.f7124g = m6356A("");
            m6357B(this.f7122e);
            AlertDialog.Builder m6362z = m6362z(canonicalPath, this.f7124g);
            this.f7133p = m6362z;
            m6362z.setNegativeButton(this.f7120c.getResources().getString(2132018556), (DialogInterface.OnClickListener) null);
            this.f7133p.setNeutralButton(this.f7120c.getResources().getString(2132018555), (DialogInterface.OnClickListener) null);
            C5852e c5852e = new C5852e(this.f7120c, this.f7124g);
            this.f7128k = c5852e;
            ListViewMaxHeight listViewMaxHeight = this.f7132o;
            if (listViewMaxHeight != null) {
                listViewMaxHeight.setAdapter((ListAdapter) c5852e);
                this.f7132o.setOnItemClickListener(new c(this));
            }
            AlertDialog create = this.f7133p.create();
            this.f7134q = create;
            create.setOnShowListener(new d(this));
            this.f7134q.setOnKeyListener(new e(this));
            this.f7134q.show();
            if (this.f7134q.getWindow() != null) {
                this.f7134q.getWindow().setBackgroundDrawable(new ColorDrawable(-1));
                this.f7134q.getWindow().setLayout(m6355y(650.0f, this.f7120c), -2);
            }
        } catch (IOException e10) {
        }
    }

    /* renamed from: x */
    public void m6361x(String str) {
        try {
            File absoluteFile = Environment.getExternalStoragePublicDirectory("").getAbsoluteFile();
            ArrayList arrayList = new ArrayList();
            this.f7124g = arrayList;
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
                    this.f7124g.add(new File(Environment.getExternalStoragePublicDirectory(list2[i10]).toString()).getPath());
                    i10++;
                }
            }
            AlertDialog.Builder m6362z = m6362z("", this.f7124g);
            this.f7133p = m6362z;
            m6362z.setNegativeButton(this.f7120c.getResources().getString(2132018556), (DialogInterface.OnClickListener) null);
            this.f7133p.setNeutralButton(this.f7120c.getResources().getString(2132018555), (DialogInterface.OnClickListener) null);
            C5854g c5854g = new C5854g(this.f7120c, this.f7124g);
            this.f7137t = c5854g;
            ListViewMaxHeight listViewMaxHeight = this.f7132o;
            if (listViewMaxHeight != null) {
                listViewMaxHeight.setAdapter((ListAdapter) c5854g);
                this.f7132o.setOnItemClickListener(new a(this));
            }
            AlertDialog create = this.f7133p.create();
            this.f7134q = create;
            create.setOnShowListener(new b(this));
            this.f7134q.show();
            if (this.f7134q.getWindow() != null) {
                this.f7134q.getWindow().setBackgroundDrawable(new ColorDrawable(-1));
                this.f7134q.getWindow().setLayout(m6355y(650.0f, this.f7120c), -2);
            }
        } catch (Exception e10) {
        }
    }

    /* renamed from: z */
    public final AlertDialog.Builder m6362z(String str, List<String> list) {
        this.f7133p = new AlertDialog.Builder(this.f7120c, 2132082693);
        LinearLayout linearLayout = new LinearLayout(this.f7120c);
        linearLayout.setOrientation(0);
        TextView textView = new TextView(this.f7120c);
        textView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        textView.setText(this.f7120c.getResources().getString(2132017467));
        Drawable drawable = this.f7120c.getResources().getDrawable(2131230894);
        drawable.setBounds(0, 0, 80, 80);
        textView.setCompoundDrawables(drawable, null, null, null);
        textView.setTextSize(22.0f);
        textView.setTextColor(this.f7120c.getResources().getColor(R.color.black));
        textView.setPadding(50, 50, 0, 0);
        textView.setTypeface(null, 1);
        linearLayout.addView(textView);
        this.f7133p.setCustomTitle(linearLayout);
        View inflate = ((LayoutInflater) this.f7120c.getSystemService("layout_inflater")).inflate(2131624175, (ViewGroup) null);
        this.f7133p.setView(inflate);
        this.f7132o = (ListViewMaxHeight) inflate.findViewById(2131428560);
        this.f7133p.setCancelable(false);
        return this.f7133p;
    }
}
