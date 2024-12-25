package cf;

import android.R;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
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
import p151if.C5251a;
import p203lf.C5851d;
import p203lf.C5853f;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:cf/g.class
 */
/* renamed from: cf.g */
/* loaded from: combined.jar:classes2.jar:cf/g.class */
public class C1083g {

    /* renamed from: b */
    public String f7223b;

    /* renamed from: c */
    public Context f7224c;

    /* renamed from: g */
    public g f7228g;

    /* renamed from: h */
    public C5851d f7229h;

    /* renamed from: i */
    public C5853f f7230i;

    /* renamed from: j */
    public Button f7231j;

    /* renamed from: k */
    public Button f7232k;

    /* renamed from: m */
    public ListViewMaxHeight f7234m;

    /* renamed from: n */
    public AlertDialog.Builder f7235n;

    /* renamed from: o */
    public AlertDialog f7236o;

    /* renamed from: p */
    public File f7237p;

    /* renamed from: a */
    public boolean f7222a = true;

    /* renamed from: d */
    public String f7225d = "";

    /* renamed from: e */
    public List<String> f7226e = null;

    /* renamed from: f */
    public List<String> f7227f = null;

    /* renamed from: l */
    public HashMap<String, String> f7233l = new HashMap<>();

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:cf/g$a.class
     */
    /* renamed from: cf.g$a */
    /* loaded from: combined.jar:classes2.jar:cf/g$a.class */
    public class a implements AdapterView.OnItemClickListener {

        /* renamed from: b */
        public final C1083g f7238b;

        public a(C1083g c1083g) {
            this.f7238b = c1083g;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
            this.f7238b.f7232k.setVisibility(0);
            this.f7238b.f7237p = new File((String) this.f7238b.f7227f.get(i10));
            if (this.f7238b.f7237p != null && this.f7238b.f7237p.isFile()) {
                C1083g c1083g = this.f7238b;
                c1083g.f7225d = c1083g.f7237p.getName();
                if (!this.f7238b.f7225d.endsWith(".m3u") && !this.f7238b.f7225d.endsWith(".m3u8")) {
                    Toast.makeText(this.f7238b.f7224c, "Please select .m3u File", 0).show();
                    return;
                } else {
                    if (this.f7238b.f7228g != null) {
                        this.f7238b.f7228g.mo6468a(this.f7238b.f7237p.getPath());
                        this.f7238b.f7236o.dismiss();
                        return;
                    }
                    return;
                }
            }
            C1083g c1083g2 = this.f7238b;
            c1083g2.f7225d = c1083g2.f7237p.getName();
            ArrayList arrayList = new ArrayList();
            arrayList.clear();
            if (this.f7238b.f7225d.equals("!c2@f3qc@!V#VEVSD3gg3VC43hh&*%#H2252B@rv3F#RCD5%$#$V#")) {
                C1083g c1083g3 = this.f7238b;
                c1083g3.m6461t(c1083g3.f7237p);
                return;
            }
            arrayList.add(this.f7238b.f7237p.getParent() + "/!c2@f3qc@!V#VEVSD3gg3VC43hh&*%#H2252B@rv3F#RCD5%$#$V#");
            if (this.f7238b.f7237p.list() != null) {
                int i11 = 0;
                while (true) {
                    String[] list = this.f7238b.f7237p.list();
                    Objects.requireNonNull(list);
                    if (i11 >= list.length) {
                        break;
                    }
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(this.f7238b.f7237p.getPath());
                    sb2.append("/");
                    String[] list2 = this.f7238b.f7237p.list();
                    Objects.requireNonNull(list2);
                    sb2.append(list2[i11]);
                    arrayList.add(sb2.toString());
                    i11++;
                }
            }
            this.f7238b.f7227f.clear();
            this.f7238b.f7227f.addAll(arrayList);
            this.f7238b.f7230i.notifyDataSetChanged();
            this.f7238b.f7234m.setSelection(0);
            if (this.f7238b.f7234m != null) {
                this.f7238b.f7234m.requestFocus();
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:cf/g$b.class
     */
    /* renamed from: cf.g$b */
    /* loaded from: combined.jar:classes2.jar:cf/g$b.class */
    public class b implements DialogInterface.OnShowListener {

        /* renamed from: a */
        public final C1083g f7239a;

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:cf/g$b$a.class
         */
        /* renamed from: cf.g$b$a */
        /* loaded from: combined.jar:classes2.jar:cf/g$b$a.class */
        public class a implements View.OnClickListener {

            /* renamed from: b */
            public final b f7240b;

            public a(b bVar) {
                this.f7240b = bVar;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                this.f7240b.f7239a.f7236o.dismiss();
            }
        }

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:cf/g$b$b.class
         */
        /* renamed from: cf.g$b$b, reason: collision with other inner class name */
        /* loaded from: combined.jar:classes2.jar:cf/g$b$b.class */
        public class ViewOnClickListenerC10260b implements View.OnClickListener {

            /* renamed from: b */
            public final b f7241b;

            public ViewOnClickListenerC10260b(b bVar) {
                this.f7241b = bVar;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (this.f7241b.f7239a.f7227f == null || this.f7241b.f7239a.f7227f.get(0) == null) {
                    return;
                }
                this.f7241b.f7239a.m6461t(new File((String) this.f7241b.f7239a.f7227f.get(0)));
            }
        }

        public b(C1083g c1083g) {
            this.f7239a = c1083g;
        }

        @Override // android.content.DialogInterface.OnShowListener
        public void onShow(DialogInterface dialogInterface) {
            C1083g c1083g = this.f7239a;
            c1083g.f7231j = c1083g.f7236o.getButton(-2);
            C1083g c1083g2 = this.f7239a;
            c1083g2.f7232k = c1083g2.f7236o.getButton(-3);
            if (this.f7239a.f7237p == null || this.f7239a.f7237p.getParent() == null || this.f7239a.f7237p.getParent().equals("/storage/emulated/0")) {
                this.f7239a.f7232k.setVisibility(4);
            } else {
                this.f7239a.f7232k.setVisibility(0);
            }
            this.f7239a.f7231j.setTag("1");
            this.f7239a.f7232k.setTag("3");
            Button button = this.f7239a.f7231j;
            C1083g c1083g3 = this.f7239a;
            button.setOnFocusChangeListener(new h(c1083g3, c1083g3.f7231j));
            this.f7239a.f7231j.setTextColor(this.f7239a.f7224c.getResources().getColor(2131100158));
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f7239a.f7231j.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.f7239a.f7232k.getLayoutParams();
            marginLayoutParams.setMargins(0, 0, 50, 0);
            String m31288z = new C6783a(this.f7239a.f7224c).m31288z();
            if (m31288z.equals(C5251a.f30065s0)) {
                this.f7239a.f7231j.setTextSize(16.0f);
                this.f7239a.f7231j.setBackground(this.f7239a.f7224c.getResources().getDrawable(2131230845));
                marginLayoutParams.width = 230;
                marginLayoutParams.height = 90;
            } else {
                this.f7239a.f7231j.setTextSize(14.0f);
                this.f7239a.f7231j.setBackground(this.f7239a.f7224c.getResources().getDrawable(2131230828));
                marginLayoutParams.width = 255;
                marginLayoutParams.height = 135;
            }
            this.f7239a.f7231j.setOnClickListener(new a(this));
            this.f7239a.f7232k.setOnClickListener(new ViewOnClickListenerC10260b(this));
            Button button2 = this.f7239a.f7232k;
            C1083g c1083g4 = this.f7239a;
            button2.setOnFocusChangeListener(new h(c1083g4, c1083g4.f7232k));
            this.f7239a.f7232k.setTextColor(this.f7239a.f7224c.getResources().getColor(2131100158));
            if (m31288z.equals(C5251a.f30065s0)) {
                this.f7239a.f7232k.setTextSize(16.0f);
                this.f7239a.f7232k.setBackground(this.f7239a.f7224c.getResources().getDrawable(2131230845));
                marginLayoutParams2.width = 230;
                marginLayoutParams2.height = 90;
                return;
            }
            this.f7239a.f7232k.setTextSize(14.0f);
            this.f7239a.f7232k.setBackground(this.f7239a.f7224c.getResources().getDrawable(2131231576));
            marginLayoutParams2.width = 255;
            marginLayoutParams2.height = 135;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:cf/g$c.class
     */
    /* renamed from: cf.g$c */
    /* loaded from: combined.jar:classes2.jar:cf/g$c.class */
    public class c implements AdapterView.OnItemClickListener {

        /* renamed from: b */
        public final C1083g f7242b;

        public c(C1083g c1083g) {
            this.f7242b = c1083g;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
            C1083g c1083g;
            StringBuilder sb2;
            String str;
            C1083g c1083g2;
            String str2;
            if (((String) this.f7242b.f7227f.get(i10)).equals("Internal Storage")) {
                c1083g2 = this.f7242b;
                str2 = "/emulated/0";
            } else {
                if (this.f7242b.f7227f.get(i10) != null && i10 == 0 && ((String) this.f7242b.f7227f.get(i10)).equals("..")) {
                    this.f7242b.f7232k.performClick();
                    this.f7242b.m6460A();
                }
                if (this.f7242b.f7233l == null) {
                    c1083g = this.f7242b;
                    sb2 = new StringBuilder();
                } else if (this.f7242b.f7233l.get(this.f7242b.f7227f.get(i10)) == null || ((String) this.f7242b.f7233l.get(this.f7242b.f7227f.get(i10))).equals("")) {
                    c1083g = this.f7242b;
                    sb2 = new StringBuilder();
                } else {
                    c1083g = this.f7242b;
                    sb2 = new StringBuilder();
                    sb2.append("/");
                    sb2.append((String) this.f7242b.f7233l.get(this.f7242b.f7227f.get(i10)));
                    sb2.append("/Android/data/");
                    str = "com.maxdigitall.maxdigitaliptvbox";
                    sb2.append(str);
                    String sb3 = sb2.toString();
                    c1083g2 = c1083g;
                    str2 = sb3;
                }
                sb2.append("/");
                str = (String) this.f7242b.f7227f.get(i10);
                sb2.append(str);
                String sb32 = sb2.toString();
                c1083g2 = c1083g;
                str2 = sb32;
            }
            C1083g.m6452m(c1083g2, str2);
            this.f7242b.m6460A();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:cf/g$d.class
     */
    /* renamed from: cf.g$d */
    /* loaded from: combined.jar:classes2.jar:cf/g$d.class */
    public class d implements DialogInterface.OnShowListener {

        /* renamed from: a */
        public final C1083g f7243a;

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:cf/g$d$a.class
         */
        /* renamed from: cf.g$d$a */
        /* loaded from: combined.jar:classes2.jar:cf/g$d$a.class */
        public class a implements View.OnClickListener {

            /* renamed from: b */
            public final d f7244b;

            public a(d dVar) {
                this.f7244b = dVar;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                C1083g c1083g;
                File file;
                if (this.f7244b.f7243a.f7225d.equals(this.f7244b.f7243a.f7223b)) {
                    return;
                }
                if (!this.f7244b.f7243a.f7225d.equals("/storage/emulated/0")) {
                    this.f7244b.f7243a.f7225d = new File(this.f7244b.f7243a.f7225d).getParent();
                    String[] split = this.f7244b.f7243a.f7225d.split("/");
                    if (split.length >= 3) {
                        if (Pattern.compile("^\\(?(.{4})\\)?[- ]?(.{4})$").matcher(split[2]).matches()) {
                            if (this.f7244b.f7243a.f7225d.equals("/storage/" + split[2] + "/Android/data")) {
                                this.f7244b.f7243a.f7225d = "/storage/" + split[2];
                                c1083g = this.f7244b.f7243a;
                                file = new File(this.f7244b.f7243a.f7225d);
                            }
                        }
                        if (new File(this.f7244b.f7243a.f7225d).getParent().equals("/storage/" + split[2] + "/Android/data")) {
                            this.f7244b.f7243a.f7225d = "/storage/" + split[2] + "/Android/data/com.maxdigitall.maxdigitaliptvbox";
                        }
                    }
                    this.f7244b.f7243a.m6460A();
                }
                this.f7244b.f7243a.f7225d = "/storage/emulated";
                c1083g = this.f7244b.f7243a;
                file = new File(this.f7244b.f7243a.f7225d);
                c1083g.f7225d = file.getParent();
                this.f7244b.f7243a.m6460A();
            }
        }

        public d(C1083g c1083g) {
            this.f7243a = c1083g;
        }

        @Override // android.content.DialogInterface.OnShowListener
        public void onShow(DialogInterface dialogInterface) {
            C1083g c1083g = this.f7243a;
            c1083g.f7231j = c1083g.f7236o.getButton(-2);
            C1083g c1083g2 = this.f7243a;
            c1083g2.f7232k = c1083g2.f7236o.getButton(-3);
            if (this.f7243a.f7225d.equals(this.f7243a.f7223b)) {
                this.f7243a.f7232k.setVisibility(4);
            } else {
                this.f7243a.f7232k.setVisibility(0);
            }
            this.f7243a.f7231j.setTag("1");
            this.f7243a.f7232k.setTag("3");
            Button button = this.f7243a.f7231j;
            C1083g c1083g3 = this.f7243a;
            button.setOnFocusChangeListener(new h(c1083g3, c1083g3.f7231j));
            this.f7243a.f7231j.setTextColor(this.f7243a.f7224c.getResources().getColor(2131100158));
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f7243a.f7231j.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.f7243a.f7232k.getLayoutParams();
            marginLayoutParams.setMargins(0, 0, 50, 0);
            String m31288z = new C6783a(this.f7243a.f7224c).m31288z();
            if (m31288z.equals(C5251a.f30065s0)) {
                this.f7243a.f7231j.setTextSize(16.0f);
                this.f7243a.f7231j.setBackground(this.f7243a.f7224c.getResources().getDrawable(2131230845));
                marginLayoutParams.width = 230;
                marginLayoutParams.height = 90;
            } else {
                this.f7243a.f7231j.setTextSize(14.0f);
                this.f7243a.f7231j.setBackground(this.f7243a.f7224c.getResources().getDrawable(2131230828));
                marginLayoutParams.width = 255;
                marginLayoutParams.height = 135;
            }
            Button button2 = this.f7243a.f7232k;
            C1083g c1083g4 = this.f7243a;
            button2.setOnFocusChangeListener(new h(c1083g4, c1083g4.f7232k));
            this.f7243a.f7232k.setTextColor(this.f7243a.f7224c.getResources().getColor(2131100158));
            if (m31288z.equals(C5251a.f30065s0)) {
                this.f7243a.f7232k.setTextSize(16.0f);
                this.f7243a.f7232k.setBackground(this.f7243a.f7224c.getResources().getDrawable(2131230845));
                marginLayoutParams2.width = 230;
                marginLayoutParams2.height = 90;
            } else {
                this.f7243a.f7232k.setTextSize(14.0f);
                this.f7243a.f7232k.setBackground(this.f7243a.f7224c.getResources().getDrawable(2131231576));
                marginLayoutParams2.width = 255;
                marginLayoutParams2.height = 135;
            }
            this.f7243a.f7232k.setOnClickListener(new a(this));
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:cf/g$e.class
     */
    /* renamed from: cf.g$e */
    /* loaded from: combined.jar:classes2.jar:cf/g$e.class */
    public class e implements DialogInterface.OnKeyListener {

        /* renamed from: b */
        public final C1083g f7245b;

        public e(C1083g c1083g) {
            this.f7245b = c1083g;
        }

        @Override // android.content.DialogInterface.OnKeyListener
        public boolean onKey(DialogInterface dialogInterface, int i10, KeyEvent keyEvent) {
            C1083g c1083g;
            File file;
            if (i10 != 4 || keyEvent.getAction() != 0) {
                return false;
            }
            if (this.f7245b.f7225d.equals(this.f7245b.f7223b)) {
                this.f7245b.f7236o.dismiss();
                return true;
            }
            if (!this.f7245b.f7225d.equals("/storage/emulated/0")) {
                this.f7245b.f7225d = new File(this.f7245b.f7225d).getParent();
                String[] split = this.f7245b.f7225d.split("/");
                if (split.length >= 3) {
                    if (Pattern.compile("^\\(?(.{4})\\)?[- ]?(.{4})$").matcher(split[2]).matches()) {
                        if (this.f7245b.f7225d.equals("/storage/" + split[2] + "/Android/data")) {
                            this.f7245b.f7225d = "/storage/" + split[2];
                            c1083g = this.f7245b;
                            file = new File(this.f7245b.f7225d);
                        }
                    }
                    if (new File(this.f7245b.f7225d).getParent().equals("/storage/" + split[2] + "/Android/data")) {
                        this.f7245b.f7225d = "/storage/" + split[2] + "/Android/data/com.maxdigitall.maxdigitaliptvbox";
                    }
                }
                this.f7245b.m6460A();
                return true;
            }
            this.f7245b.f7225d = "/storage/emulated";
            c1083g = this.f7245b;
            file = new File(this.f7245b.f7225d);
            c1083g.f7225d = file.getParent();
            this.f7245b.m6460A();
            return true;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:cf/g$f.class
     */
    /* renamed from: cf.g$f */
    /* loaded from: combined.jar:classes2.jar:cf/g$f.class */
    public class f implements Comparator<String> {

        /* renamed from: b */
        public final C1083g f7246b;

        public f(C1083g c1083g) {
            this.f7246b = c1083g;
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(String str, String str2) {
            return str.compareTo(str2);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:cf/g$g.class
     */
    /* renamed from: cf.g$g */
    /* loaded from: combined.jar:classes2.jar:cf/g$g.class */
    public interface g {
        /* renamed from: a */
        void mo6468a(String str);
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:cf/g$h.class
     */
    /* renamed from: cf.g$h */
    /* loaded from: combined.jar:classes2.jar:cf/g$h.class */
    public class h implements View.OnFocusChangeListener {

        /* renamed from: b */
        public final View f7247b;

        /* renamed from: c */
        public final C1083g f7248c;

        public h(C1083g c1083g, View view) {
            this.f7248c = c1083g;
            this.f7247b = view;
        }

        /* renamed from: a */
        public final void m6469a(float f10) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f7247b, "scaleX", f10);
            ofFloat.setDuration(150L);
            ofFloat.start();
        }

        /* renamed from: b */
        public final void m6470b(float f10) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f7247b, "scaleY", f10);
            ofFloat.setDuration(150L);
            ofFloat.start();
        }

        @Override // android.view.View.OnFocusChangeListener
        @SuppressLint({"ResourceType"})
        public void onFocusChange(View view, boolean z10) {
            float f10;
            float f11 = 1.0f;
            if (z10) {
                View view2 = this.f7247b;
                if (view2 == null || view2.getTag() == null || !this.f7247b.getTag().equals("6")) {
                    if (z10) {
                        f11 = 1.12f;
                    }
                    m6469a(f11);
                    m6470b(f11);
                    View view3 = this.f7247b;
                    if (view3 != null && view3.getTag() != null && this.f7247b.getTag().equals("1") && this.f7248c.f7231j != null) {
                        this.f7248c.f7231j.setBackgroundResource(2131230828);
                    }
                    View view4 = this.f7247b;
                    if (view4 == null || view4.getTag() == null || !this.f7247b.getTag().equals("3") || this.f7248c.f7232k == null) {
                        return;
                    }
                    this.f7248c.f7232k.setBackgroundResource(2131230846);
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
                View view5 = this.f7247b;
                if (view5 != null && view5.getTag() != null && this.f7247b.getTag().equals("1") && this.f7248c.f7231j != null) {
                    this.f7248c.f7231j.setBackgroundResource(2131230845);
                }
                View view6 = this.f7247b;
                f10 = 1.0f;
                if (view6 != null) {
                    f10 = 1.0f;
                    if (view6.getTag() != null) {
                        f10 = 1.0f;
                        if (this.f7247b.getTag().equals("3")) {
                            f10 = 1.0f;
                            if (this.f7248c.f7232k != null) {
                                this.f7248c.f7232k.setBackgroundResource(2131230845);
                                f10 = 1.0f;
                            }
                        }
                    }
                }
            }
            m6469a(f10);
            m6470b(f10);
        }
    }

    public C1083g(Context context, g gVar) {
        this.f7223b = "";
        this.f7228g = null;
        this.f7224c = context;
        int length = context.getExternalFilesDirs("external").length;
        this.f7223b = "/storage";
        this.f7228g = gVar;
        try {
            this.f7223b = new File(this.f7223b).getCanonicalPath();
        } catch (IOException e10) {
        }
    }

    /* renamed from: m */
    public static /* synthetic */ String m6452m(C1083g c1083g, Object obj) {
        String str = c1083g.f7225d + obj;
        c1083g.f7225d = str;
        return str;
    }

    /* renamed from: w */
    public static int m6459w(float f10, Context context) {
        return (int) ((f10 * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    /* renamed from: A */
    public final void m6460A() {
        TextView textView;
        try {
            if (!this.f7225d.endsWith(".m3u") && !this.f7225d.endsWith(".m3u8")) {
                if (this.f7225d.equals(this.f7223b)) {
                    m6466z(m6465y(this.f7225d));
                } else {
                    this.f7227f.clear();
                    this.f7227f.add("..");
                    this.f7227f.addAll(m6465y(this.f7225d));
                }
                AlertDialog alertDialog = this.f7236o;
                if (alertDialog != null && (textView = (TextView) alertDialog.findViewById(R.id.message)) != null) {
                    textView.setText(this.f7225d);
                }
                if (this.f7225d.equals(this.f7223b)) {
                    this.f7232k.setVisibility(4);
                } else {
                    this.f7232k.setVisibility(0);
                }
                this.f7229h.notifyDataSetChanged();
                this.f7234m.setSelection(0);
                ListViewMaxHeight listViewMaxHeight = this.f7234m;
                if (listViewMaxHeight != null) {
                    listViewMaxHeight.requestFocus();
                    return;
                }
                return;
            }
            g gVar = this.f7228g;
            if (gVar != null) {
                gVar.mo6468a(this.f7225d);
                this.f7236o.dismiss();
            }
        } catch (Exception e10) {
        }
    }

    /* renamed from: t */
    public final void m6461t(File file) {
        try {
            ArrayList arrayList = new ArrayList();
            arrayList.clear();
            if (file.getParent() != null) {
                String parent = file.getParent();
                if (parent.equals("/storage/emulated/0")) {
                    this.f7232k.setVisibility(4);
                } else {
                    arrayList.add(new File(parent).getParent() + "/!c2@f3qc@!V#VEVSD3gg3VC43hh&*%#H2252B@rv3F#RCD5%$#$V#");
                    this.f7232k.setVisibility(0);
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
            this.f7227f.clear();
            this.f7227f.addAll(arrayList);
            this.f7230i.notifyDataSetChanged();
            this.f7234m.setSelection(0);
            ListViewMaxHeight listViewMaxHeight = this.f7234m;
            if (listViewMaxHeight != null) {
                listViewMaxHeight.requestFocus();
            }
        } catch (Exception e10) {
        }
    }

    /* renamed from: u */
    public void m6462u(String str) {
        File file = new File(str);
        if (!file.exists() || !file.isDirectory()) {
            str = this.f7223b;
        }
        try {
            String canonicalPath = new File(str).getCanonicalPath();
            this.f7225d = canonicalPath;
            this.f7226e = m6465y(canonicalPath);
            this.f7227f = m6465y("");
            m6466z(this.f7226e);
            AlertDialog.Builder m6464x = m6464x(canonicalPath, this.f7227f);
            this.f7235n = m6464x;
            m6464x.setNegativeButton(this.f7224c.getResources().getString(2132018556), (DialogInterface.OnClickListener) null);
            this.f7235n.setNeutralButton(this.f7224c.getResources().getString(2132018555), (DialogInterface.OnClickListener) null);
            C5851d c5851d = new C5851d(this.f7224c, this.f7227f);
            this.f7229h = c5851d;
            ListViewMaxHeight listViewMaxHeight = this.f7234m;
            if (listViewMaxHeight != null) {
                listViewMaxHeight.setAdapter((ListAdapter) c5851d);
                this.f7234m.setOnItemClickListener(new c(this));
            }
            AlertDialog create = this.f7235n.create();
            this.f7236o = create;
            create.setOnShowListener(new d(this));
            this.f7236o.setOnKeyListener(new e(this));
            this.f7236o.show();
            if (this.f7236o.getWindow() != null) {
                this.f7236o.getWindow().setBackgroundDrawable(new ColorDrawable(-1));
                this.f7236o.getWindow().setLayout(m6459w(650.0f, this.f7224c), -2);
            }
        } catch (IOException e10) {
        }
    }

    /* renamed from: v */
    public void m6463v(String str) {
        try {
            File absoluteFile = Environment.getExternalStoragePublicDirectory("").getAbsoluteFile();
            ArrayList arrayList = new ArrayList();
            this.f7227f = arrayList;
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
                    this.f7227f.add(new File(Environment.getExternalStoragePublicDirectory(list2[i10]).toString()).getPath());
                    i10++;
                }
            }
            AlertDialog.Builder m6464x = m6464x("", this.f7227f);
            this.f7235n = m6464x;
            m6464x.setNegativeButton(this.f7224c.getResources().getString(2132018556), (DialogInterface.OnClickListener) null);
            this.f7235n.setNeutralButton(this.f7224c.getResources().getString(2132018555), (DialogInterface.OnClickListener) null);
            C5853f c5853f = new C5853f(this.f7224c, this.f7227f, "m3u");
            this.f7230i = c5853f;
            ListViewMaxHeight listViewMaxHeight = this.f7234m;
            if (listViewMaxHeight != null) {
                listViewMaxHeight.setAdapter((ListAdapter) c5853f);
                this.f7234m.setOnItemClickListener(new a(this));
            }
            AlertDialog create = this.f7235n.create();
            this.f7236o = create;
            create.setOnShowListener(new b(this));
            this.f7236o.show();
            if (this.f7236o.getWindow() != null) {
                this.f7236o.getWindow().setBackgroundDrawable(new ColorDrawable(-1));
                this.f7236o.getWindow().setLayout(m6459w(650.0f, this.f7224c), -2);
            }
        } catch (Exception e10) {
        }
    }

    /* renamed from: x */
    public final AlertDialog.Builder m6464x(String str, List<String> list) {
        this.f7235n = new AlertDialog.Builder(this.f7224c, 2132082693);
        LinearLayout linearLayout = new LinearLayout(this.f7224c);
        linearLayout.setOrientation(0);
        TextView textView = new TextView(this.f7224c);
        textView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        textView.setText(this.f7224c.getResources().getString(2132017469));
        Drawable drawable = this.f7224c.getResources().getDrawable(2131230894);
        drawable.setBounds(0, 0, 80, 80);
        textView.setCompoundDrawables(drawable, null, null, null);
        textView.setTextSize(22.0f);
        textView.setTextColor(this.f7224c.getResources().getColor(R.color.black));
        textView.setPadding(50, 50, 0, 0);
        textView.setTypeface(null, 1);
        linearLayout.addView(textView);
        this.f7235n.setCustomTitle(linearLayout);
        View inflate = ((LayoutInflater) this.f7224c.getSystemService("layout_inflater")).inflate(2131624175, (ViewGroup) null);
        this.f7235n.setView(inflate);
        this.f7234m = (ListViewMaxHeight) inflate.findViewById(2131428560);
        this.f7235n.setCancelable(true);
        return this.f7235n;
    }

    /* renamed from: y */
    public final List<String> m6465y(String str) {
        File file;
        ArrayList arrayList = new ArrayList();
        try {
            file = new File(str);
        } catch (Exception e10) {
        }
        if (file.exists() && file.isDirectory()) {
            if (file.listFiles() != null) {
                for (File file2 : file.listFiles()) {
                    if (file2.isDirectory()) {
                        arrayList.add(file2.getName());
                    }
                    if ((file2.isFile() && file2.getName().endsWith(".m3u")) || (file2.isFile() && file2.getName().endsWith(".m3u8"))) {
                        arrayList.add(file2.getName());
                    }
                }
            }
            Collections.sort(arrayList, new f(this));
            return arrayList;
        }
        return arrayList;
    }

    /* renamed from: z */
    public final void m6466z(List<String> list) {
        this.f7227f.clear();
        boolean z10 = false;
        for (String str : list) {
            if (!str.equals("self")) {
                if (str.equals("emulated")) {
                    z10 = true;
                } else if (Pattern.compile("^\\(?(.{4})\\)?[- ]?(.{4})$").matcher(str).matches()) {
                    this.f7233l.put("SD Card", str);
                    this.f7227f.add("SD Card");
                } else {
                    this.f7227f.add(str);
                }
            }
        }
        if (z10) {
            this.f7227f.add(0, "Internal Storage");
        }
    }
}
