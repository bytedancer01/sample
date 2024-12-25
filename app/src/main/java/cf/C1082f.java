package cf;

import android.R;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Environment;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
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
import org.apache.commons.net.ftp.FTPReply;
import p151if.C5251a;
import p203lf.C5851d;
import p203lf.C5853f;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:cf/f.class
 */
/* renamed from: cf.f */
/* loaded from: combined.jar:classes2.jar:cf/f.class */
public class C1082f {

    /* renamed from: b */
    public String f7184b;

    /* renamed from: c */
    public Context f7185c;

    /* renamed from: g */
    public j f7189g;

    /* renamed from: h */
    public C5851d f7190h;

    /* renamed from: i */
    public C5853f f7191i;

    /* renamed from: j */
    public Button f7192j;

    /* renamed from: k */
    public Button f7193k;

    /* renamed from: l */
    public Button f7194l;

    /* renamed from: m */
    public Button f7195m;

    /* renamed from: n */
    public Button f7196n;

    /* renamed from: p */
    public ListViewMaxHeight f7198p;

    /* renamed from: q */
    public ImageView f7199q;

    /* renamed from: r */
    public AlertDialog.Builder f7200r;

    /* renamed from: s */
    public AlertDialog f7201s;

    /* renamed from: t */
    public File f7202t;

    /* renamed from: a */
    public boolean f7183a = true;

    /* renamed from: d */
    public String f7186d = "";

    /* renamed from: e */
    public List<String> f7187e = null;

    /* renamed from: f */
    public List<String> f7188f = null;

    /* renamed from: o */
    public HashMap<String, String> f7197o = new HashMap<>();

    /* renamed from: u */
    public String f7203u = "";

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:cf/f$a.class
     */
    /* renamed from: cf.f$a */
    /* loaded from: combined.jar:classes2.jar:cf/f$a.class */
    public class a implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final C1082f f7204b;

        public a(C1082f c1082f) {
            this.f7204b = c1082f;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (this.f7204b.f7189g != null) {
                this.f7204b.f7189g.mo6437a(this.f7204b.f7203u);
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:cf/f$b.class
     */
    /* renamed from: cf.f$b */
    /* loaded from: combined.jar:classes2.jar:cf/f$b.class */
    public class b implements AdapterView.OnItemClickListener {

        /* renamed from: b */
        public final C1082f f7205b;

        public b(C1082f c1082f) {
            this.f7205b = c1082f;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
            this.f7205b.f7194l.setVisibility(0);
            this.f7205b.f7193k.setVisibility(0);
            this.f7205b.f7202t = new File((String) this.f7205b.f7188f.get(i10));
            if (this.f7205b.f7202t == null || !this.f7205b.f7202t.isFile()) {
                C1082f c1082f = this.f7205b;
                c1082f.f7186d = c1082f.f7202t.getName();
                C1082f c1082f2 = this.f7205b;
                c1082f2.f7203u = c1082f2.f7202t.getPath();
                ArrayList arrayList = new ArrayList();
                arrayList.clear();
                if (this.f7205b.f7186d.equals("!c2@f3qc@!V#VEVSD3gg3VC43hh&*%#H2252B@rv3F#RCD5%$#$V#")) {
                    C1082f c1082f3 = this.f7205b;
                    c1082f3.m6427C(c1082f3.f7202t);
                    return;
                }
                arrayList.add(this.f7205b.f7202t.getParent() + "/!c2@f3qc@!V#VEVSD3gg3VC43hh&*%#H2252B@rv3F#RCD5%$#$V#");
                if (this.f7205b.f7202t.list() != null) {
                    int i11 = 0;
                    while (true) {
                        String[] list = this.f7205b.f7202t.list();
                        Objects.requireNonNull(list);
                        if (i11 >= list.length) {
                            break;
                        }
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(this.f7205b.f7202t.getPath());
                        sb2.append("/");
                        String[] list2 = this.f7205b.f7202t.list();
                        Objects.requireNonNull(list2);
                        sb2.append(list2[i11]);
                        if (new File(sb2.toString()).isDirectory()) {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(this.f7205b.f7202t.getPath());
                            sb3.append("/");
                            String[] list3 = this.f7205b.f7202t.list();
                            Objects.requireNonNull(list3);
                            sb3.append(list3[i11]);
                            arrayList.add(sb3.toString());
                        }
                        i11++;
                    }
                }
                this.f7205b.f7188f.clear();
                this.f7205b.f7188f.addAll(arrayList);
                this.f7205b.f7191i.notifyDataSetChanged();
                this.f7205b.f7198p.setSelection(0);
                if (this.f7205b.f7198p != null) {
                    this.f7205b.f7198p.requestFocus();
                }
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:cf/f$c.class
     */
    /* renamed from: cf.f$c */
    /* loaded from: combined.jar:classes2.jar:cf/f$c.class */
    public class c implements DialogInterface.OnShowListener {

        /* renamed from: a */
        public final C1082f f7206a;

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:cf/f$c$a.class
         */
        /* renamed from: cf.f$c$a */
        /* loaded from: combined.jar:classes2.jar:cf/f$c$a.class */
        public class a implements View.OnClickListener {

            /* renamed from: b */
            public final c f7207b;

            public a(c cVar) {
                this.f7207b = cVar;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                this.f7207b.f7206a.f7201s.dismiss();
            }
        }

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:cf/f$c$b.class
         */
        /* renamed from: cf.f$c$b */
        /* loaded from: combined.jar:classes2.jar:cf/f$c$b.class */
        public class b implements View.OnClickListener {

            /* renamed from: b */
            public final c f7208b;

            public b(c cVar) {
                this.f7208b = cVar;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (this.f7208b.f7206a.f7188f == null || this.f7208b.f7206a.f7188f.get(0) == null) {
                    return;
                }
                this.f7208b.f7206a.m6427C(new File((String) this.f7208b.f7206a.f7188f.get(0)));
            }
        }

        public c(C1082f c1082f) {
            this.f7206a = c1082f;
        }

        @Override // android.content.DialogInterface.OnShowListener
        public void onShow(DialogInterface dialogInterface) {
            C1082f c1082f = this.f7206a;
            c1082f.f7192j = c1082f.f7201s.getButton(-2);
            C1082f c1082f2 = this.f7206a;
            c1082f2.f7193k = c1082f2.f7201s.getButton(-1);
            C1082f c1082f3 = this.f7206a;
            c1082f3.f7194l = c1082f3.f7201s.getButton(-3);
            if (this.f7206a.f7202t == null || this.f7206a.f7202t.getParent() == null || this.f7206a.f7202t.getParent().equals("/storage/emulated/0")) {
                this.f7206a.f7194l.setVisibility(4);
                this.f7206a.f7193k.setVisibility(4);
            } else {
                this.f7206a.f7194l.setVisibility(0);
                this.f7206a.f7193k.setVisibility(0);
            }
            this.f7206a.f7192j.setTag("1");
            this.f7206a.f7193k.setTag("2");
            this.f7206a.f7194l.setTag("3");
            Button button = this.f7206a.f7192j;
            C1082f c1082f4 = this.f7206a;
            button.setOnFocusChangeListener(new k(c1082f4, c1082f4.f7192j));
            this.f7206a.f7192j.setTextColor(this.f7206a.f7185c.getResources().getColor(2131100158));
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f7206a.f7192j.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.f7206a.f7193k.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) this.f7206a.f7194l.getLayoutParams();
            marginLayoutParams.setMargins(0, 0, 50, 0);
            String m31288z = new C6783a(this.f7206a.f7185c).m31288z();
            if (m31288z.equals(C5251a.f30065s0)) {
                this.f7206a.f7192j.setTextSize(16.0f);
                this.f7206a.f7192j.setBackground(this.f7206a.f7185c.getResources().getDrawable(2131230845));
                marginLayoutParams.width = 230;
                marginLayoutParams.height = 90;
            } else {
                this.f7206a.f7192j.setTextSize(14.0f);
                this.f7206a.f7192j.setBackground(this.f7206a.f7185c.getResources().getDrawable(2131230828));
                marginLayoutParams.width = 255;
                marginLayoutParams.height = 135;
            }
            this.f7206a.f7192j.setOnClickListener(new a(this));
            this.f7206a.f7194l.setOnClickListener(new b(this));
            Button button2 = this.f7206a.f7193k;
            C1082f c1082f5 = this.f7206a;
            button2.setOnFocusChangeListener(new k(c1082f5, c1082f5.f7193k));
            marginLayoutParams2.setMargins(0, 0, 70, 0);
            if (m31288z.equals(C5251a.f30065s0)) {
                this.f7206a.f7193k.setTextColor(this.f7206a.f7185c.getResources().getColor(2131100158));
                this.f7206a.f7193k.setTextSize(16.0f);
                this.f7206a.f7193k.setBackground(this.f7206a.f7185c.getResources().getDrawable(2131230845));
                marginLayoutParams2.width = 230;
                marginLayoutParams2.height = 90;
            } else {
                this.f7206a.f7193k.setTextColor(this.f7206a.f7185c.getResources().getColor(2131100158));
                this.f7206a.f7193k.setTextSize(14.0f);
                this.f7206a.f7193k.setBackground(this.f7206a.f7185c.getResources().getDrawable(2131231576));
                marginLayoutParams2.width = 255;
                marginLayoutParams2.height = 135;
            }
            Button button3 = this.f7206a.f7194l;
            C1082f c1082f6 = this.f7206a;
            button3.setOnFocusChangeListener(new k(c1082f6, c1082f6.f7194l));
            this.f7206a.f7194l.setTextColor(this.f7206a.f7185c.getResources().getColor(2131100158));
            if (m31288z.equals(C5251a.f30065s0)) {
                this.f7206a.f7194l.setTextSize(16.0f);
                this.f7206a.f7194l.setBackground(this.f7206a.f7185c.getResources().getDrawable(2131230845));
                marginLayoutParams3.width = 230;
                marginLayoutParams3.height = 90;
                return;
            }
            this.f7206a.f7194l.setTextSize(14.0f);
            this.f7206a.f7194l.setBackground(this.f7206a.f7185c.getResources().getDrawable(2131231576));
            marginLayoutParams3.width = 255;
            marginLayoutParams3.height = 135;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:cf/f$d.class
     */
    /* renamed from: cf.f$d */
    /* loaded from: combined.jar:classes2.jar:cf/f$d.class */
    public class d implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final C1082f f7209b;

        public d(C1082f c1082f) {
            this.f7209b = c1082f;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (this.f7209b.f7189g != null) {
                this.f7209b.f7189g.mo6437a(this.f7209b.f7186d);
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:cf/f$e.class
     */
    /* renamed from: cf.f$e */
    /* loaded from: combined.jar:classes2.jar:cf/f$e.class */
    public class e implements AdapterView.OnItemClickListener {

        /* renamed from: b */
        public final C1082f f7210b;

        public e(C1082f c1082f) {
            this.f7210b = c1082f;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
            C1082f c1082f;
            StringBuilder sb2;
            StringBuilder sb3;
            String str;
            String sb4;
            if (((String) this.f7210b.f7188f.get(i10)).equals("Internal Storage")) {
                c1082f = this.f7210b;
                sb4 = "/emulated/0";
            } else {
                if (this.f7210b.f7188f.get(i10) != null && i10 == 0 && ((String) this.f7210b.f7188f.get(i10)).equals("..")) {
                    this.f7210b.f7194l.performClick();
                    this.f7210b.m6435L();
                }
                if (this.f7210b.f7197o == null) {
                    c1082f = this.f7210b;
                    sb2 = new StringBuilder();
                } else if (this.f7210b.f7197o.get(this.f7210b.f7188f.get(i10)) == null || ((String) this.f7210b.f7197o.get(this.f7210b.f7188f.get(i10))).equals("")) {
                    c1082f = this.f7210b;
                    sb2 = new StringBuilder();
                } else {
                    c1082f = this.f7210b;
                    sb3 = new StringBuilder();
                    sb3.append("/");
                    sb3.append((String) this.f7210b.f7197o.get(this.f7210b.f7188f.get(i10)));
                    sb3.append("/Android/data/");
                    str = "com.maxdigitall.maxdigitaliptvbox";
                    sb3.append(str);
                    sb4 = sb3.toString();
                }
                sb2.append("/");
                sb3 = sb2;
                str = (String) this.f7210b.f7188f.get(i10);
                sb3.append(str);
                sb4 = sb3.toString();
            }
            C1082f.m6425y(c1082f, sb4);
            this.f7210b.m6435L();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:cf/f$f.class
     */
    /* renamed from: cf.f$f */
    /* loaded from: combined.jar:classes2.jar:cf/f$f.class */
    public class f implements DialogInterface.OnShowListener {

        /* renamed from: a */
        public final C1082f f7211a;

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:cf/f$f$a.class
         */
        /* renamed from: cf.f$f$a */
        /* loaded from: combined.jar:classes2.jar:cf/f$f$a.class */
        public class a implements View.OnClickListener {

            /* renamed from: b */
            public final f f7212b;

            public a(f fVar) {
                this.f7212b = fVar;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                C1082f c1082f;
                File file;
                if (this.f7212b.f7211a.f7186d.equals(this.f7212b.f7211a.f7184b)) {
                    return;
                }
                if (!this.f7212b.f7211a.f7186d.equals("/storage/emulated/0")) {
                    this.f7212b.f7211a.f7186d = new File(this.f7212b.f7211a.f7186d).getParent();
                    String[] split = this.f7212b.f7211a.f7186d.split("/");
                    if (split.length >= 3) {
                        if (Pattern.compile("^\\(?(.{4})\\)?[- ]?(.{4})$").matcher(split[2]).matches()) {
                            if (this.f7212b.f7211a.f7186d.equals("/storage/" + split[2] + "/Android/data")) {
                                this.f7212b.f7211a.f7186d = "/storage/" + split[2];
                                c1082f = this.f7212b.f7211a;
                                file = new File(this.f7212b.f7211a.f7186d);
                            }
                        }
                        if (new File(this.f7212b.f7211a.f7186d).getParent().equals("/storage/" + split[2] + "/Android/data")) {
                            this.f7212b.f7211a.f7186d = "/storage/" + split[2] + "/Android/data/com.maxdigitall.maxdigitaliptvbox";
                        }
                    }
                    this.f7212b.f7211a.m6435L();
                }
                this.f7212b.f7211a.f7186d = "/storage/emulated";
                c1082f = this.f7212b.f7211a;
                file = new File(this.f7212b.f7211a.f7186d);
                c1082f.f7186d = file.getParent();
                this.f7212b.f7211a.m6435L();
            }
        }

        public f(C1082f c1082f) {
            this.f7211a = c1082f;
        }

        @Override // android.content.DialogInterface.OnShowListener
        public void onShow(DialogInterface dialogInterface) {
            C1082f c1082f = this.f7211a;
            c1082f.f7192j = c1082f.f7201s.getButton(-2);
            C1082f c1082f2 = this.f7211a;
            c1082f2.f7193k = c1082f2.f7201s.getButton(-1);
            C1082f c1082f3 = this.f7211a;
            c1082f3.f7194l = c1082f3.f7201s.getButton(-3);
            if (this.f7211a.f7186d.equals(this.f7211a.f7184b)) {
                this.f7211a.f7194l.setVisibility(4);
                this.f7211a.f7193k.setVisibility(8);
            } else {
                this.f7211a.f7194l.setVisibility(0);
                this.f7211a.f7193k.setVisibility(0);
            }
            this.f7211a.f7192j.setTag("1");
            this.f7211a.f7193k.setTag("2");
            this.f7211a.f7194l.setTag("3");
            Button button = this.f7211a.f7192j;
            C1082f c1082f4 = this.f7211a;
            button.setOnFocusChangeListener(new k(c1082f4, c1082f4.f7192j));
            this.f7211a.f7192j.setTextColor(this.f7211a.f7185c.getResources().getColor(2131100158));
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f7211a.f7192j.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.f7211a.f7193k.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) this.f7211a.f7194l.getLayoutParams();
            marginLayoutParams.setMargins(0, 0, 50, 0);
            String m31288z = new C6783a(this.f7211a.f7185c).m31288z();
            if (m31288z.equals(C5251a.f30065s0)) {
                this.f7211a.f7192j.setTextSize(16.0f);
                this.f7211a.f7192j.setBackground(this.f7211a.f7185c.getResources().getDrawable(2131230845));
                marginLayoutParams.width = 230;
                marginLayoutParams.height = 90;
            } else {
                this.f7211a.f7192j.setTextSize(14.0f);
                this.f7211a.f7192j.setBackground(this.f7211a.f7185c.getResources().getDrawable(2131230828));
                marginLayoutParams.width = 250;
                marginLayoutParams.height = 110;
            }
            Button button2 = this.f7211a.f7193k;
            C1082f c1082f5 = this.f7211a;
            button2.setOnFocusChangeListener(new k(c1082f5, c1082f5.f7193k));
            marginLayoutParams2.setMargins(0, 0, 70, 0);
            if (m31288z.equals(C5251a.f30065s0)) {
                this.f7211a.f7193k.setTextColor(this.f7211a.f7185c.getResources().getColor(2131100158));
                this.f7211a.f7193k.setTextSize(16.0f);
                this.f7211a.f7193k.setBackground(this.f7211a.f7185c.getResources().getDrawable(2131230845));
                marginLayoutParams2.width = 230;
                marginLayoutParams2.height = 90;
            } else {
                this.f7211a.f7193k.setTextColor(this.f7211a.f7185c.getResources().getColor(2131100158));
                this.f7211a.f7193k.setTextSize(14.0f);
                this.f7211a.f7193k.setBackground(this.f7211a.f7185c.getResources().getDrawable(2131231576));
                marginLayoutParams2.width = 250;
                marginLayoutParams2.height = 110;
            }
            Button button3 = this.f7211a.f7194l;
            C1082f c1082f6 = this.f7211a;
            button3.setOnFocusChangeListener(new k(c1082f6, c1082f6.f7194l));
            this.f7211a.f7194l.setTextColor(this.f7211a.f7185c.getResources().getColor(2131100158));
            if (m31288z.equals(C5251a.f30065s0)) {
                this.f7211a.f7194l.setTextSize(16.0f);
                this.f7211a.f7194l.setBackground(this.f7211a.f7185c.getResources().getDrawable(2131230845));
                marginLayoutParams3.width = 230;
                marginLayoutParams3.height = 90;
            } else {
                this.f7211a.f7194l.setTextSize(14.0f);
                this.f7211a.f7194l.setBackground(this.f7211a.f7185c.getResources().getDrawable(2131231576));
                marginLayoutParams3.width = 250;
                marginLayoutParams3.height = 110;
            }
            this.f7211a.f7194l.setOnClickListener(new a(this));
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:cf/f$g.class
     */
    /* renamed from: cf.f$g */
    /* loaded from: combined.jar:classes2.jar:cf/f$g.class */
    public class g implements DialogInterface.OnKeyListener {

        /* renamed from: b */
        public final C1082f f7213b;

        public g(C1082f c1082f) {
            this.f7213b = c1082f;
        }

        @Override // android.content.DialogInterface.OnKeyListener
        public boolean onKey(DialogInterface dialogInterface, int i10, KeyEvent keyEvent) {
            C1082f c1082f;
            File file;
            if (i10 != 4 || keyEvent.getAction() != 0) {
                return false;
            }
            if (this.f7213b.f7186d.equals(this.f7213b.f7184b)) {
                this.f7213b.f7201s.dismiss();
                return true;
            }
            if (!this.f7213b.f7186d.equals("/storage/emulated/0")) {
                this.f7213b.f7186d = new File(this.f7213b.f7186d).getParent();
                String[] split = this.f7213b.f7186d.split("/");
                if (split.length >= 3) {
                    if (Pattern.compile("^\\(?(.{4})\\)?[- ]?(.{4})$").matcher(split[2]).matches()) {
                        if (this.f7213b.f7186d.equals("/storage/" + split[2] + "/Android/data")) {
                            this.f7213b.f7186d = "/storage/" + split[2];
                            c1082f = this.f7213b;
                            file = new File(this.f7213b.f7186d);
                        }
                    }
                    if (new File(this.f7213b.f7186d).getParent().equals("/storage/" + split[2] + "/Android/data")) {
                        this.f7213b.f7186d = "/storage/" + split[2] + "/Android/data/com.maxdigitall.maxdigitaliptvbox";
                    }
                }
                this.f7213b.m6435L();
                return true;
            }
            this.f7213b.f7186d = "/storage/emulated";
            c1082f = this.f7213b;
            file = new File(this.f7213b.f7186d);
            c1082f.f7186d = file.getParent();
            this.f7213b.m6435L();
            return true;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:cf/f$h.class
     */
    /* renamed from: cf.f$h */
    /* loaded from: combined.jar:classes2.jar:cf/f$h.class */
    public class h implements Comparator<String> {

        /* renamed from: b */
        public final C1082f f7214b;

        public h(C1082f c1082f) {
            this.f7214b = c1082f;
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(String str, String str2) {
            return str.compareTo(str2);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:cf/f$i.class
     */
    /* renamed from: cf.f$i */
    /* loaded from: combined.jar:classes2.jar:cf/f$i.class */
    public class i implements View.OnClickListener {

        /* renamed from: b */
        public final C1082f f7215b;

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:cf/f$i$a.class
         */
        /* renamed from: cf.f$i$a */
        /* loaded from: combined.jar:classes2.jar:cf/f$i$a.class */
        public class a implements DialogInterface.OnClickListener {

            /* renamed from: b */
            public final EditText f7216b;

            /* renamed from: c */
            public final i f7217c;

            public a(i iVar, EditText editText) {
                this.f7217c = iVar;
                this.f7216b = editText;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i10) {
                Context context;
                StringBuilder sb2;
                C1082f c1082f;
                File file;
                String obj = this.f7216b.getText().toString();
                if (Build.VERSION.SDK_INT < 30) {
                    if (this.f7217c.f7215b.m6431H(this.f7217c.f7215b.f7186d + "/" + obj)) {
                        C1082f.m6425y(this.f7217c.f7215b, "/" + obj);
                        this.f7217c.f7215b.m6435L();
                        return;
                    }
                    context = this.f7217c.f7215b.f7185c;
                    sb2 = new StringBuilder();
                    sb2.append(this.f7217c.f7215b.f7185c.getResources().getString(2132017768));
                    sb2.append("'");
                } else if (this.f7217c.f7215b.f7203u.equals("") || this.f7217c.f7215b.f7203u.equals("/storage/emulated/0/!c2@f3qc@!V#VEVSD3gg3VC43hh&*%#H2252B@rv3F#RCD5%$#$V#")) {
                    if (this.f7217c.f7215b.m6431H(new File("/storage/emulated/0/" + obj).toString())) {
                        c1082f = this.f7217c.f7215b;
                        file = new File("/storage/emulated/0/" + obj);
                        c1082f.m6427C(file);
                        return;
                    }
                    context = this.f7217c.f7215b.f7185c;
                    sb2 = new StringBuilder();
                    sb2.append(this.f7217c.f7215b.f7185c.getResources().getString(2132017768));
                    sb2.append(" '");
                } else if (this.f7217c.f7215b.f7203u.contains("!c2@f3qc@!V#VEVSD3gg3VC43hh&*%#H2252B@rv3F#RCD5%$#$V#")) {
                    C1082f c1082f2 = this.f7217c.f7215b;
                    c1082f2.f7203u = c1082f2.f7203u.replace("!c2@f3qc@!V#VEVSD3gg3VC43hh&*%#H2252B@rv3F#RCD5%$#$V#", "");
                    if (this.f7217c.f7215b.m6431H(this.f7217c.f7215b.f7203u + "/" + obj)) {
                        c1082f = this.f7217c.f7215b;
                        file = new File(this.f7217c.f7215b.f7203u + "/" + obj);
                        c1082f.m6427C(file);
                        return;
                    }
                    context = this.f7217c.f7215b.f7185c;
                    sb2 = new StringBuilder();
                    sb2.append(this.f7217c.f7215b.f7185c.getResources().getString(2132017768));
                    sb2.append(" '");
                } else {
                    if (this.f7217c.f7215b.m6431H(this.f7217c.f7215b.f7203u + "/" + obj)) {
                        c1082f = this.f7217c.f7215b;
                        file = new File(this.f7217c.f7215b.f7203u + "/" + obj);
                        c1082f.m6427C(file);
                        return;
                    }
                    context = this.f7217c.f7215b.f7185c;
                    sb2 = new StringBuilder();
                    sb2.append(this.f7217c.f7215b.f7185c.getResources().getString(2132017768));
                    sb2.append(" '");
                }
                sb2.append(obj);
                sb2.append("' ");
                sb2.append(this.f7217c.f7215b.f7185c.getResources().getString(2132017800));
                Toast.makeText(context, sb2.toString(), 0).show();
            }
        }

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:cf/f$i$b.class
         */
        /* renamed from: cf.f$i$b */
        /* loaded from: combined.jar:classes2.jar:cf/f$i$b.class */
        public class b implements DialogInterface.OnShowListener {

            /* renamed from: a */
            public final AlertDialog f7218a;

            /* renamed from: b */
            public final i f7219b;

            public b(i iVar, AlertDialog alertDialog) {
                this.f7219b = iVar;
                this.f7218a = alertDialog;
            }

            @Override // android.content.DialogInterface.OnShowListener
            public void onShow(DialogInterface dialogInterface) {
                this.f7219b.f7215b.f7196n = this.f7218a.getButton(-3);
                this.f7219b.f7215b.f7195m = this.f7218a.getButton(-1);
                this.f7219b.f7215b.f7196n.setTag("4");
                this.f7219b.f7215b.f7195m.setTag("5");
                Button button = this.f7219b.f7215b.f7196n;
                C1082f c1082f = this.f7219b.f7215b;
                button.setOnFocusChangeListener(new k(c1082f, c1082f.f7196n));
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f7219b.f7215b.f7196n.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.f7219b.f7215b.f7195m.getLayoutParams();
                marginLayoutParams.setMargins(70, 0, 0, 0);
                marginLayoutParams2.setMargins(0, 0, 70, 0);
                String m31288z = new C6783a(this.f7219b.f7215b.f7185c).m31288z();
                if (m31288z.equals(C5251a.f30065s0)) {
                    this.f7219b.f7215b.f7196n.setTextColor(this.f7219b.f7215b.f7185c.getResources().getColor(2131100158));
                    this.f7219b.f7215b.f7196n.setTextSize(16.0f);
                    this.f7219b.f7215b.f7196n.setBackground(this.f7219b.f7215b.f7185c.getResources().getDrawable(2131230845));
                    marginLayoutParams.width = 230;
                    marginLayoutParams.height = 70;
                } else {
                    this.f7219b.f7215b.f7196n.setTextColor(this.f7219b.f7215b.f7185c.getResources().getColor(2131100158));
                    this.f7219b.f7215b.f7196n.setTextSize(14.0f);
                    this.f7219b.f7215b.f7196n.setBackground(this.f7219b.f7215b.f7185c.getResources().getDrawable(2131230828));
                    marginLayoutParams.width = 250;
                    marginLayoutParams.height = 110;
                }
                Button button2 = this.f7219b.f7215b.f7195m;
                C1082f c1082f2 = this.f7219b.f7215b;
                button2.setOnFocusChangeListener(new k(c1082f2, c1082f2.f7195m));
                this.f7219b.f7215b.f7195m.setTextColor(this.f7219b.f7215b.f7185c.getResources().getColor(2131100158));
                if (m31288z.equals(C5251a.f30065s0)) {
                    this.f7219b.f7215b.f7195m.setTextSize(16.0f);
                    this.f7219b.f7215b.f7195m.setBackground(this.f7219b.f7215b.f7185c.getResources().getDrawable(2131230845));
                    marginLayoutParams2.width = 230;
                    marginLayoutParams2.height = 70;
                    return;
                }
                this.f7219b.f7215b.f7195m.setTextSize(14.0f);
                this.f7219b.f7215b.f7195m.setBackground(this.f7219b.f7215b.f7185c.getResources().getDrawable(2131231576));
                marginLayoutParams2.width = 250;
                marginLayoutParams2.height = 110;
            }
        }

        public i(C1082f c1082f) {
            this.f7215b = c1082f;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            EditText editText = new EditText(this.f7215b.f7185c);
            editText.setLayoutParams(new ViewGroup.LayoutParams(-1, 100));
            AlertDialog.Builder builder = new AlertDialog.Builder(this.f7215b.f7185c, 2132082693);
            builder.setTitle(this.f7215b.f7185c.getResources().getString(2132018179)).setView(editText).setPositiveButton(this.f7215b.f7185c.getResources().getString(2132018557), new a(this, editText)).setNeutralButton(this.f7215b.f7185c.getResources().getString(2132018556), (DialogInterface.OnClickListener) null);
            AlertDialog create = builder.create();
            create.setOnShowListener(new b(this, create));
            create.show();
            if (create.getWindow() != null) {
                create.getWindow().setLayout(750, FTPReply.FILE_ACTION_PENDING);
                create.getWindow().setBackgroundDrawable(new ColorDrawable(-1));
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:cf/f$j.class
     */
    /* renamed from: cf.f$j */
    /* loaded from: combined.jar:classes2.jar:cf/f$j.class */
    public interface j {
        /* renamed from: a */
        void mo6437a(String str);
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:cf/f$k.class
     */
    /* renamed from: cf.f$k */
    /* loaded from: combined.jar:classes2.jar:cf/f$k.class */
    public class k implements View.OnFocusChangeListener {

        /* renamed from: b */
        public final View f7220b;

        /* renamed from: c */
        public final C1082f f7221c;

        public k(C1082f c1082f, View view) {
            this.f7221c = c1082f;
            this.f7220b = view;
        }

        /* renamed from: a */
        public final void m6438a(float f10) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f7220b, "scaleX", f10);
            ofFloat.setDuration(150L);
            ofFloat.start();
        }

        /* renamed from: b */
        public final void m6439b(float f10) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f7220b, "scaleY", f10);
            ofFloat.setDuration(150L);
            ofFloat.start();
        }

        @Override // android.view.View.OnFocusChangeListener
        @SuppressLint({"ResourceType"})
        public void onFocusChange(View view, boolean z10) {
            float f10;
            float f11 = 1.0f;
            if (z10) {
                View view2 = this.f7220b;
                if (view2 == null || view2.getTag() == null || !this.f7220b.getTag().equals("6")) {
                    if (z10) {
                        f11 = 1.12f;
                    }
                    m6438a(f11);
                    m6439b(f11);
                    View view3 = this.f7220b;
                    if (view3 != null && view3.getTag() != null && this.f7220b.getTag().equals("1") && this.f7221c.f7192j != null) {
                        this.f7221c.f7192j.setBackgroundResource(2131230828);
                    }
                    View view4 = this.f7220b;
                    if (view4 != null && view4.getTag() != null && this.f7220b.getTag().equals("2") && this.f7221c.f7193k != null) {
                        this.f7221c.f7193k.setBackgroundResource(2131231576);
                    }
                    View view5 = this.f7220b;
                    if (view5 != null && view5.getTag() != null && this.f7220b.getTag().equals("3") && this.f7221c.f7194l != null) {
                        this.f7221c.f7194l.setBackgroundResource(2131230846);
                    }
                    View view6 = this.f7220b;
                    if (view6 != null && view6.getTag() != null && this.f7220b.getTag().equals("4") && this.f7221c.f7196n != null) {
                        this.f7221c.f7196n.setBackgroundResource(2131230828);
                    }
                    View view7 = this.f7220b;
                    if (view7 == null || view7.getTag() == null || !this.f7220b.getTag().equals("5") || this.f7221c.f7195m == null) {
                        return;
                    }
                    this.f7221c.f7195m.setBackgroundResource(2131231576);
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
                View view8 = this.f7220b;
                if (view8 != null && view8.getTag() != null && this.f7220b.getTag().equals("1") && this.f7221c.f7192j != null) {
                    this.f7221c.f7192j.setBackgroundResource(2131230845);
                }
                View view9 = this.f7220b;
                if (view9 != null && view9.getTag() != null && this.f7220b.getTag().equals("2") && this.f7221c.f7193k != null) {
                    this.f7221c.f7193k.setBackgroundResource(2131230845);
                }
                View view10 = this.f7220b;
                if (view10 != null && view10.getTag() != null && this.f7220b.getTag().equals("3") && this.f7221c.f7194l != null) {
                    this.f7221c.f7194l.setBackgroundResource(2131230845);
                }
                View view11 = this.f7220b;
                if (view11 != null && view11.getTag() != null && this.f7220b.getTag().equals("4") && this.f7221c.f7196n != null) {
                    this.f7221c.f7196n.setBackgroundResource(2131230845);
                }
                View view12 = this.f7220b;
                f10 = 1.0f;
                if (view12 != null) {
                    f10 = 1.0f;
                    if (view12.getTag() != null) {
                        f10 = 1.0f;
                        if (this.f7220b.getTag().equals("5")) {
                            f10 = 1.0f;
                            if (this.f7221c.f7195m != null) {
                                this.f7221c.f7195m.setBackgroundResource(2131230845);
                                f10 = 1.0f;
                            }
                        }
                    }
                }
            }
            m6438a(f10);
            m6439b(f10);
        }
    }

    public C1082f(Context context, j jVar) {
        this.f7184b = "";
        this.f7189g = null;
        this.f7185c = context;
        int length = context.getExternalFilesDirs("external").length;
        this.f7184b = "/storage";
        this.f7189g = jVar;
        try {
            this.f7184b = new File(this.f7184b).getCanonicalPath();
        } catch (IOException e10) {
        }
    }

    /* renamed from: F */
    public static int m6400F(float f10, Context context) {
        return (int) ((f10 * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    /* renamed from: y */
    public static /* synthetic */ String m6425y(C1082f c1082f, Object obj) {
        String str = c1082f.f7186d + obj;
        c1082f.f7186d = str;
        return str;
    }

    /* renamed from: C */
    public final void m6427C(File file) {
        try {
            ArrayList arrayList = new ArrayList();
            arrayList.clear();
            if (file.getParent() != null) {
                String parent = file.getParent();
                if (parent.equals("/storage/emulated/0")) {
                    this.f7194l.setVisibility(4);
                } else {
                    arrayList.add(new File(parent).getParent() + "/!c2@f3qc@!V#VEVSD3gg3VC43hh&*%#H2252B@rv3F#RCD5%$#$V#");
                    this.f7194l.setVisibility(0);
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
                        if (new File(sb2.toString()).isDirectory()) {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(file.getParent());
                            sb3.append("/");
                            String[] list3 = file2.list();
                            Objects.requireNonNull(list3);
                            sb3.append(list3[i10]);
                            arrayList.add(sb3.toString());
                        }
                        i10++;
                    }
                }
            }
            this.f7188f.clear();
            this.f7188f.addAll(arrayList);
            this.f7191i.notifyDataSetChanged();
            this.f7198p.setSelection(0);
            ListViewMaxHeight listViewMaxHeight = this.f7198p;
            if (listViewMaxHeight != null) {
                listViewMaxHeight.requestFocus();
            }
        } catch (Exception e10) {
        }
    }

    /* renamed from: D */
    public void m6428D(String str) {
        File file = new File(str);
        if (!file.exists() || !file.isDirectory()) {
            str = this.f7184b;
        }
        try {
            String canonicalPath = new File(str).getCanonicalPath();
            this.f7186d = canonicalPath;
            this.f7187e = m6432I(canonicalPath);
            this.f7188f = m6432I("");
            m6433J(this.f7187e);
            AlertDialog.Builder m6430G = m6430G(canonicalPath, this.f7188f);
            this.f7200r = m6430G;
            m6430G.setNegativeButton(this.f7185c.getResources().getString(2132018556), (DialogInterface.OnClickListener) null);
            this.f7200r.setNeutralButton(this.f7185c.getResources().getString(2132018555), (DialogInterface.OnClickListener) null);
            this.f7200r.setPositiveButton(this.f7185c.getResources().getString(2132018557), new d(this));
            C5851d c5851d = new C5851d(this.f7185c, this.f7188f);
            this.f7190h = c5851d;
            ListViewMaxHeight listViewMaxHeight = this.f7198p;
            if (listViewMaxHeight != null) {
                listViewMaxHeight.setAdapter((ListAdapter) c5851d);
                this.f7198p.setOnItemClickListener(new e(this));
            }
            AlertDialog create = this.f7200r.create();
            this.f7201s = create;
            create.setOnShowListener(new f(this));
            this.f7201s.setOnKeyListener(new g(this));
            this.f7201s.show();
            if (this.f7201s.getWindow() != null) {
                this.f7201s.getWindow().setBackgroundDrawable(new ColorDrawable(-1));
                this.f7201s.getWindow().setLayout(m6400F(650.0f, this.f7185c), -2);
            }
        } catch (IOException e10) {
        }
    }

    /* renamed from: E */
    public void m6429E(String str) {
        try {
            this.f7203u = "";
            File absoluteFile = Environment.getExternalStoragePublicDirectory("").getAbsoluteFile();
            ArrayList arrayList = new ArrayList();
            this.f7188f = arrayList;
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
                    File file = new File(Environment.getExternalStoragePublicDirectory(list2[i10]).toString());
                    if (file.isDirectory()) {
                        this.f7188f.add(file.getPath());
                    }
                    i10++;
                }
            }
            AlertDialog.Builder m6430G = m6430G("", this.f7188f);
            this.f7200r = m6430G;
            m6430G.setNegativeButton(this.f7185c.getResources().getString(2132018556), (DialogInterface.OnClickListener) null);
            this.f7200r.setNeutralButton(this.f7185c.getResources().getString(2132018555), (DialogInterface.OnClickListener) null);
            this.f7200r.setPositiveButton(this.f7185c.getResources().getString(2132018557), new a(this));
            C5853f c5853f = new C5853f(this.f7185c, this.f7188f, "recording");
            this.f7191i = c5853f;
            ListViewMaxHeight listViewMaxHeight = this.f7198p;
            if (listViewMaxHeight != null) {
                listViewMaxHeight.setAdapter((ListAdapter) c5853f);
                this.f7198p.setOnItemClickListener(new b(this));
            }
            AlertDialog create = this.f7200r.create();
            this.f7201s = create;
            create.setOnShowListener(new c(this));
            this.f7201s.show();
            if (this.f7201s.getWindow() != null) {
                this.f7201s.getWindow().setBackgroundDrawable(new ColorDrawable(-1));
                this.f7201s.getWindow().setLayout(m6400F(650.0f, this.f7185c), -2);
            }
        } catch (Exception e10) {
        }
    }

    /* renamed from: G */
    public final AlertDialog.Builder m6430G(String str, List<String> list) {
        this.f7200r = new AlertDialog.Builder(this.f7185c, 2132082693);
        LinearLayout linearLayout = new LinearLayout(this.f7185c);
        linearLayout.setOrientation(0);
        TextView textView = new TextView(this.f7185c);
        textView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        textView.setText(this.f7185c.getResources().getString(2132017470));
        Drawable drawable = this.f7185c.getResources().getDrawable(2131230894);
        drawable.setBounds(0, 0, 80, 80);
        textView.setCompoundDrawables(drawable, null, null, null);
        textView.setTextSize(22.0f);
        textView.setTextColor(this.f7185c.getResources().getColor(R.color.black));
        textView.setPadding(50, 50, 0, 0);
        textView.setTypeface(null, 1);
        ImageView imageView = new ImageView(this.f7185c);
        this.f7199q = imageView;
        imageView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        this.f7199q.setPadding(20, 20, 0, 0);
        this.f7199q.setTag("6");
        this.f7199q.setId(2131429279);
        this.f7199q.setFocusable(true);
        ImageView imageView2 = this.f7199q;
        imageView2.setOnFocusChangeListener(new k(this, imageView2));
        if (Build.VERSION.SDK_INT <= 21) {
            this.f7199q.setImageResource(2131230813);
        }
        this.f7199q.setImageDrawable(this.f7185c.getResources().getDrawable(2131230813, null));
        ((LinearLayout.LayoutParams) this.f7199q.getLayoutParams()).gravity = 8388613;
        this.f7199q.setOnClickListener(new i(this));
        linearLayout.addView(textView);
        linearLayout.addView(this.f7199q);
        this.f7200r.setCustomTitle(linearLayout);
        View inflate = ((LayoutInflater) this.f7185c.getSystemService("layout_inflater")).inflate(2131624175, (ViewGroup) null);
        this.f7200r.setView(inflate);
        this.f7198p = (ListViewMaxHeight) inflate.findViewById(2131428560);
        this.f7200r.setCancelable(false);
        return this.f7200r;
    }

    /* renamed from: H */
    public final boolean m6431H(String str) {
        File file = new File(str);
        if (file.exists()) {
            return false;
        }
        return file.mkdir();
    }

    /* renamed from: I */
    public final List<String> m6432I(String str) {
        File file;
        ArrayList arrayList = new ArrayList();
        try {
            file = new File(str);
        } catch (Exception e10) {
        }
        if (file.exists() && file.isDirectory()) {
            for (File file2 : file.listFiles()) {
                if (file2.isDirectory()) {
                    arrayList.add(file2.getName());
                }
            }
            Collections.sort(arrayList, new h(this));
            return arrayList;
        }
        return arrayList;
    }

    /* renamed from: J */
    public final void m6433J(List<String> list) {
        this.f7188f.clear();
        boolean z10 = false;
        for (String str : list) {
            if (!str.equals("self")) {
                if (str.equals("emulated")) {
                    z10 = true;
                } else if (Pattern.compile("^\\(?(.{4})\\)?[- ]?(.{4})$").matcher(str).matches()) {
                    this.f7197o.put("SD Card", str);
                    this.f7188f.add("SD Card");
                } else {
                    this.f7188f.add(str);
                }
            }
        }
        if (z10) {
            this.f7188f.add(0, "Internal Storage");
        }
    }

    /* renamed from: K */
    public void m6434K(boolean z10) {
        this.f7183a = z10;
    }

    /* renamed from: L */
    public final void m6435L() {
        TextView textView;
        try {
            if (this.f7186d.equals(this.f7184b)) {
                m6433J(m6432I(this.f7186d));
            } else {
                this.f7188f.clear();
                this.f7188f.add("..");
                this.f7188f.addAll(m6432I(this.f7186d));
            }
            AlertDialog alertDialog = this.f7201s;
            if (alertDialog != null && (textView = (TextView) alertDialog.findViewById(R.id.message)) != null) {
                textView.setText(this.f7186d);
            }
            if (this.f7186d.equals(this.f7184b)) {
                this.f7194l.setVisibility(4);
                this.f7193k.setVisibility(8);
            } else {
                this.f7194l.setVisibility(0);
                this.f7193k.setVisibility(0);
            }
            this.f7190h.notifyDataSetChanged();
            this.f7198p.setSelection(0);
            ListViewMaxHeight listViewMaxHeight = this.f7198p;
            if (listViewMaxHeight != null) {
                listViewMaxHeight.requestFocus();
            }
        } catch (Exception e10) {
        }
    }
}
