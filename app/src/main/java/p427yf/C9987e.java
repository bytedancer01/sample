package p427yf;

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
  classes2.jar:yf/e.class
 */
/* renamed from: yf.e */
/* loaded from: combined.jar:classes2.jar:yf/e.class */
public class C9987e {

    /* renamed from: b */
    public String f45729b;

    /* renamed from: c */
    public Context f45730c;

    /* renamed from: g */
    public g f45734g;

    /* renamed from: h */
    public C5851d f45735h;

    /* renamed from: i */
    public C5853f f45736i;

    /* renamed from: j */
    public Button f45737j;

    /* renamed from: k */
    public Button f45738k;

    /* renamed from: m */
    public ListViewMaxHeight f45740m;

    /* renamed from: n */
    public AlertDialog.Builder f45741n;

    /* renamed from: o */
    public AlertDialog f45742o;

    /* renamed from: p */
    public File f45743p;

    /* renamed from: a */
    public boolean f45728a = true;

    /* renamed from: d */
    public String f45731d = "";

    /* renamed from: e */
    public List<String> f45732e = null;

    /* renamed from: f */
    public List<String> f45733f = null;

    /* renamed from: l */
    public HashMap<String, String> f45739l = new HashMap<>();

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:yf/e$a.class
     */
    /* renamed from: yf.e$a */
    /* loaded from: combined.jar:classes2.jar:yf/e$a.class */
    public class a implements AdapterView.OnItemClickListener {

        /* renamed from: b */
        public final C9987e f45744b;

        public a(C9987e c9987e) {
            this.f45744b = c9987e;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
            this.f45744b.f45738k.setVisibility(0);
            this.f45744b.f45743p = new File((String) this.f45744b.f45733f.get(i10));
            if (this.f45744b.f45743p != null && this.f45744b.f45743p.isFile()) {
                C9987e c9987e = this.f45744b;
                c9987e.f45731d = c9987e.f45743p.getName();
                if (!this.f45744b.f45731d.endsWith(".zip") && !this.f45744b.f45731d.endsWith(".ovpn")) {
                    Toast.makeText(this.f45744b.f45730c, "Please select .zip or .ovpn File", 0).show();
                    return;
                } else {
                    if (this.f45744b.f45734g != null) {
                        this.f45744b.f45734g.mo19816a(this.f45744b.f45743p.getPath());
                        this.f45744b.f45742o.dismiss();
                        return;
                    }
                    return;
                }
            }
            C9987e c9987e2 = this.f45744b;
            c9987e2.f45731d = c9987e2.f45743p.getName();
            ArrayList arrayList = new ArrayList();
            arrayList.clear();
            if (this.f45744b.f45731d.equals("!c2@f3qc@!V#VEVSD3gg3VC43hh&*%#H2252B@rv3F#RCD5%$#$V#")) {
                C9987e c9987e3 = this.f45744b;
                c9987e3.m41962t(c9987e3.f45743p);
                return;
            }
            arrayList.add(this.f45744b.f45743p.getParent() + "/!c2@f3qc@!V#VEVSD3gg3VC43hh&*%#H2252B@rv3F#RCD5%$#$V#");
            if (this.f45744b.f45743p.list() != null) {
                int i11 = 0;
                while (true) {
                    String[] list = this.f45744b.f45743p.list();
                    Objects.requireNonNull(list);
                    if (i11 >= list.length) {
                        break;
                    }
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(this.f45744b.f45743p.getPath());
                    sb2.append("/");
                    String[] list2 = this.f45744b.f45743p.list();
                    Objects.requireNonNull(list2);
                    sb2.append(list2[i11]);
                    arrayList.add(sb2.toString());
                    i11++;
                }
            }
            this.f45744b.f45733f.clear();
            this.f45744b.f45733f.addAll(arrayList);
            this.f45744b.f45736i.notifyDataSetChanged();
            this.f45744b.f45740m.setSelection(0);
            if (this.f45744b.f45740m != null) {
                this.f45744b.f45740m.requestFocus();
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:yf/e$b.class
     */
    /* renamed from: yf.e$b */
    /* loaded from: combined.jar:classes2.jar:yf/e$b.class */
    public class b implements DialogInterface.OnShowListener {

        /* renamed from: a */
        public final C9987e f45745a;

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:yf/e$b$a.class
         */
        /* renamed from: yf.e$b$a */
        /* loaded from: combined.jar:classes2.jar:yf/e$b$a.class */
        public class a implements View.OnClickListener {

            /* renamed from: b */
            public final b f45746b;

            public a(b bVar) {
                this.f45746b = bVar;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                this.f45746b.f45745a.f45742o.dismiss();
            }
        }

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:yf/e$b$b.class
         */
        /* renamed from: yf.e$b$b, reason: collision with other inner class name */
        /* loaded from: combined.jar:classes2.jar:yf/e$b$b.class */
        public class ViewOnClickListenerC10335b implements View.OnClickListener {

            /* renamed from: b */
            public final b f45747b;

            public ViewOnClickListenerC10335b(b bVar) {
                this.f45747b = bVar;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (this.f45747b.f45745a.f45733f == null || this.f45747b.f45745a.f45733f.get(0) == null) {
                    return;
                }
                this.f45747b.f45745a.m41962t(new File((String) this.f45747b.f45745a.f45733f.get(0)));
            }
        }

        public b(C9987e c9987e) {
            this.f45745a = c9987e;
        }

        @Override // android.content.DialogInterface.OnShowListener
        public void onShow(DialogInterface dialogInterface) {
            C9987e c9987e = this.f45745a;
            c9987e.f45737j = c9987e.f45742o.getButton(-2);
            C9987e c9987e2 = this.f45745a;
            c9987e2.f45738k = c9987e2.f45742o.getButton(-3);
            if (this.f45745a.f45743p == null || this.f45745a.f45743p.getParent() == null || this.f45745a.f45743p.getParent().equals("/storage/emulated/0")) {
                this.f45745a.f45738k.setVisibility(4);
            } else {
                this.f45745a.f45738k.setVisibility(0);
            }
            this.f45745a.f45737j.setTag("1");
            this.f45745a.f45738k.setTag("3");
            Button button = this.f45745a.f45737j;
            C9987e c9987e3 = this.f45745a;
            button.setOnFocusChangeListener(new h(c9987e3, c9987e3.f45737j));
            this.f45745a.f45737j.setTextColor(this.f45745a.f45730c.getResources().getColor(2131100158));
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f45745a.f45737j.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.f45745a.f45738k.getLayoutParams();
            marginLayoutParams.setMargins(0, 0, 50, 0);
            String m31288z = new C6783a(this.f45745a.f45730c).m31288z();
            if (m31288z.equals(C5251a.f30065s0)) {
                this.f45745a.f45737j.setTextSize(16.0f);
                this.f45745a.f45737j.setBackground(this.f45745a.f45730c.getResources().getDrawable(2131230845));
                marginLayoutParams.width = 230;
                marginLayoutParams.height = 90;
            } else {
                this.f45745a.f45737j.setTextSize(14.0f);
                this.f45745a.f45737j.setBackground(this.f45745a.f45730c.getResources().getDrawable(2131230828));
                marginLayoutParams.width = 255;
                marginLayoutParams.height = 135;
            }
            this.f45745a.f45737j.setOnClickListener(new a(this));
            this.f45745a.f45738k.setOnClickListener(new ViewOnClickListenerC10335b(this));
            Button button2 = this.f45745a.f45738k;
            C9987e c9987e4 = this.f45745a;
            button2.setOnFocusChangeListener(new h(c9987e4, c9987e4.f45738k));
            this.f45745a.f45738k.setTextColor(this.f45745a.f45730c.getResources().getColor(2131100158));
            if (m31288z.equals(C5251a.f30065s0)) {
                this.f45745a.f45738k.setTextSize(16.0f);
                this.f45745a.f45738k.setBackground(this.f45745a.f45730c.getResources().getDrawable(2131230845));
                marginLayoutParams2.width = 230;
                marginLayoutParams2.height = 90;
                return;
            }
            this.f45745a.f45738k.setTextSize(14.0f);
            this.f45745a.f45738k.setBackground(this.f45745a.f45730c.getResources().getDrawable(2131231576));
            marginLayoutParams2.width = 255;
            marginLayoutParams2.height = 135;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:yf/e$c.class
     */
    /* renamed from: yf.e$c */
    /* loaded from: combined.jar:classes2.jar:yf/e$c.class */
    public class c implements AdapterView.OnItemClickListener {

        /* renamed from: b */
        public final C9987e f45748b;

        public c(C9987e c9987e) {
            this.f45748b = c9987e;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
            C9987e c9987e;
            StringBuilder sb2;
            String str;
            String sb3;
            if (((String) this.f45748b.f45733f.get(i10)).equals("Internal Storage")) {
                c9987e = this.f45748b;
                sb3 = "/emulated/0";
            } else {
                if (this.f45748b.f45733f.get(i10) != null && i10 == 0 && ((String) this.f45748b.f45733f.get(i10)).equals("..")) {
                    this.f45748b.f45738k.performClick();
                    this.f45748b.m41961A();
                }
                if (this.f45748b.f45739l == null) {
                    c9987e = this.f45748b;
                    sb2 = new StringBuilder();
                } else if (this.f45748b.f45739l.get(this.f45748b.f45733f.get(i10)) == null || ((String) this.f45748b.f45739l.get(this.f45748b.f45733f.get(i10))).equals("")) {
                    c9987e = this.f45748b;
                    sb2 = new StringBuilder();
                } else {
                    c9987e = this.f45748b;
                    sb2 = new StringBuilder();
                    sb2.append("/");
                    sb2.append((String) this.f45748b.f45739l.get(this.f45748b.f45733f.get(i10)));
                    sb2.append("/Android/data/");
                    str = "com.maxdigitall.maxdigitaliptvbox";
                    sb2.append(str);
                    sb3 = sb2.toString();
                }
                sb2.append("/");
                str = (String) this.f45748b.f45733f.get(i10);
                sb2.append(str);
                sb3 = sb2.toString();
            }
            C9987e.m41953m(c9987e, sb3);
            this.f45748b.m41961A();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:yf/e$d.class
     */
    /* renamed from: yf.e$d */
    /* loaded from: combined.jar:classes2.jar:yf/e$d.class */
    public class d implements DialogInterface.OnShowListener {

        /* renamed from: a */
        public final C9987e f45749a;

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:yf/e$d$a.class
         */
        /* renamed from: yf.e$d$a */
        /* loaded from: combined.jar:classes2.jar:yf/e$d$a.class */
        public class a implements View.OnClickListener {

            /* renamed from: b */
            public final d f45750b;

            public a(d dVar) {
                this.f45750b = dVar;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                C9987e c9987e;
                File file;
                if (this.f45750b.f45749a.f45731d.equals(this.f45750b.f45749a.f45729b)) {
                    return;
                }
                if (!this.f45750b.f45749a.f45731d.equals("/storage/emulated/0")) {
                    this.f45750b.f45749a.f45731d = new File(this.f45750b.f45749a.f45731d).getParent();
                    String[] split = this.f45750b.f45749a.f45731d.split("/");
                    if (split.length >= 3) {
                        if (Pattern.compile("^\\(?(.{4})\\)?[- ]?(.{4})$").matcher(split[2]).matches()) {
                            if (this.f45750b.f45749a.f45731d.equals("/storage/" + split[2] + "/Android/data")) {
                                this.f45750b.f45749a.f45731d = "/storage/" + split[2];
                                c9987e = this.f45750b.f45749a;
                                file = new File(this.f45750b.f45749a.f45731d);
                            }
                        }
                        if (new File(this.f45750b.f45749a.f45731d).getParent().equals("/storage/" + split[2] + "/Android/data")) {
                            this.f45750b.f45749a.f45731d = "/storage/" + split[2] + "/Android/data/com.maxdigitall.maxdigitaliptvbox";
                        }
                    }
                    this.f45750b.f45749a.m41961A();
                }
                this.f45750b.f45749a.f45731d = "/storage/emulated";
                c9987e = this.f45750b.f45749a;
                file = new File(this.f45750b.f45749a.f45731d);
                c9987e.f45731d = file.getParent();
                this.f45750b.f45749a.m41961A();
            }
        }

        public d(C9987e c9987e) {
            this.f45749a = c9987e;
        }

        @Override // android.content.DialogInterface.OnShowListener
        public void onShow(DialogInterface dialogInterface) {
            Button button;
            Drawable drawable;
            int i10;
            C9987e c9987e = this.f45749a;
            c9987e.f45737j = c9987e.f45742o.getButton(-2);
            C9987e c9987e2 = this.f45749a;
            c9987e2.f45738k = c9987e2.f45742o.getButton(-3);
            if (this.f45749a.f45731d.equals(this.f45749a.f45729b)) {
                this.f45749a.f45738k.setVisibility(4);
            } else {
                this.f45749a.f45738k.setVisibility(0);
            }
            this.f45749a.f45737j.setTag("1");
            this.f45749a.f45738k.setTag("3");
            Button button2 = this.f45749a.f45737j;
            C9987e c9987e3 = this.f45749a;
            button2.setOnFocusChangeListener(new h(c9987e3, c9987e3.f45737j));
            this.f45749a.f45737j.setTextColor(this.f45749a.f45730c.getResources().getColor(2131100158));
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f45749a.f45737j.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.f45749a.f45738k.getLayoutParams();
            marginLayoutParams.setMargins(0, 0, 50, 0);
            String m31288z = new C6783a(this.f45749a.f45730c).m31288z();
            if (m31288z.equals(C5251a.f30065s0)) {
                this.f45749a.f45737j.setTextSize(16.0f);
                button = this.f45749a.f45737j;
                drawable = this.f45749a.f45730c.getResources().getDrawable(2131230845);
            } else {
                this.f45749a.f45737j.setTextSize(14.0f);
                button = this.f45749a.f45737j;
                drawable = this.f45749a.f45730c.getResources().getDrawable(2131230828);
            }
            button.setBackground(drawable);
            marginLayoutParams.width = 255;
            marginLayoutParams.height = 135;
            Button button3 = this.f45749a.f45738k;
            C9987e c9987e4 = this.f45749a;
            button3.setOnFocusChangeListener(new h(c9987e4, c9987e4.f45738k));
            this.f45749a.f45738k.setTextColor(this.f45749a.f45730c.getResources().getColor(2131100158));
            if (m31288z.equals(C5251a.f30065s0)) {
                this.f45749a.f45738k.setTextSize(16.0f);
                this.f45749a.f45738k.setBackground(this.f45749a.f45730c.getResources().getDrawable(2131230845));
                marginLayoutParams2.width = 230;
                i10 = 90;
            } else {
                this.f45749a.f45738k.setTextSize(14.0f);
                this.f45749a.f45738k.setBackground(this.f45749a.f45730c.getResources().getDrawable(2131231576));
                marginLayoutParams2.width = 250;
                i10 = 110;
            }
            marginLayoutParams2.height = i10;
            this.f45749a.f45738k.setOnClickListener(new a(this));
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:yf/e$e.class
     */
    /* renamed from: yf.e$e */
    /* loaded from: combined.jar:classes2.jar:yf/e$e.class */
    public class e implements DialogInterface.OnKeyListener {

        /* renamed from: b */
        public final C9987e f45751b;

        public e(C9987e c9987e) {
            this.f45751b = c9987e;
        }

        @Override // android.content.DialogInterface.OnKeyListener
        public boolean onKey(DialogInterface dialogInterface, int i10, KeyEvent keyEvent) {
            C9987e c9987e;
            File file;
            if (i10 != 4 || keyEvent.getAction() != 0) {
                return false;
            }
            if (this.f45751b.f45731d.equals(this.f45751b.f45729b)) {
                this.f45751b.f45742o.dismiss();
                return true;
            }
            if (!this.f45751b.f45731d.equals("/storage/emulated/0")) {
                this.f45751b.f45731d = new File(this.f45751b.f45731d).getParent();
                String[] split = this.f45751b.f45731d.split("/");
                if (split.length >= 3) {
                    if (Pattern.compile("^\\(?(.{4})\\)?[- ]?(.{4})$").matcher(split[2]).matches()) {
                        if (this.f45751b.f45731d.equals("/storage/" + split[2] + "/Android/data")) {
                            this.f45751b.f45731d = "/storage/" + split[2];
                            c9987e = this.f45751b;
                            file = new File(this.f45751b.f45731d);
                        }
                    }
                    if (new File(this.f45751b.f45731d).getParent().equals("/storage/" + split[2] + "/Android/data")) {
                        this.f45751b.f45731d = "/storage/" + split[2] + "/Android/data/com.maxdigitall.maxdigitaliptvbox";
                    }
                }
                this.f45751b.m41961A();
                return true;
            }
            this.f45751b.f45731d = "/storage/emulated";
            c9987e = this.f45751b;
            file = new File(this.f45751b.f45731d);
            c9987e.f45731d = file.getParent();
            this.f45751b.m41961A();
            return true;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:yf/e$f.class
     */
    /* renamed from: yf.e$f */
    /* loaded from: combined.jar:classes2.jar:yf/e$f.class */
    public class f implements Comparator<String> {

        /* renamed from: b */
        public final C9987e f45752b;

        public f(C9987e c9987e) {
            this.f45752b = c9987e;
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(String str, String str2) {
            return str.compareTo(str2);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:yf/e$g.class
     */
    /* renamed from: yf.e$g */
    /* loaded from: combined.jar:classes2.jar:yf/e$g.class */
    public interface g {
        /* renamed from: a */
        void mo19816a(String str);
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:yf/e$h.class
     */
    /* renamed from: yf.e$h */
    /* loaded from: combined.jar:classes2.jar:yf/e$h.class */
    public class h implements View.OnFocusChangeListener {

        /* renamed from: b */
        public final View f45753b;

        /* renamed from: c */
        public final C9987e f45754c;

        public h(C9987e c9987e, View view) {
            this.f45754c = c9987e;
            this.f45753b = view;
        }

        /* renamed from: a */
        public final void m41969a(float f10) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f45753b, "scaleX", f10);
            ofFloat.setDuration(150L);
            ofFloat.start();
        }

        /* renamed from: b */
        public final void m41970b(float f10) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f45753b, "scaleY", f10);
            ofFloat.setDuration(150L);
            ofFloat.start();
        }

        @Override // android.view.View.OnFocusChangeListener
        @SuppressLint({"ResourceType"})
        public void onFocusChange(View view, boolean z10) {
            float f10;
            float f11 = 1.0f;
            if (z10) {
                View view2 = this.f45753b;
                if (view2 == null || view2.getTag() == null || !this.f45753b.getTag().equals("6")) {
                    if (z10) {
                        f11 = 1.12f;
                    }
                    m41969a(f11);
                    m41970b(f11);
                    View view3 = this.f45753b;
                    if (view3 != null && view3.getTag() != null && this.f45753b.getTag().equals("1") && this.f45754c.f45737j != null) {
                        this.f45754c.f45737j.setBackgroundResource(2131230828);
                    }
                    View view4 = this.f45753b;
                    if (view4 == null || view4.getTag() == null || !this.f45753b.getTag().equals("3") || this.f45754c.f45738k == null) {
                        return;
                    }
                    this.f45754c.f45738k.setBackgroundResource(2131230846);
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
                View view5 = this.f45753b;
                if (view5 != null && view5.getTag() != null && this.f45753b.getTag().equals("1") && this.f45754c.f45737j != null) {
                    this.f45754c.f45737j.setBackgroundResource(2131230845);
                }
                View view6 = this.f45753b;
                f10 = 1.0f;
                if (view6 != null) {
                    f10 = 1.0f;
                    if (view6.getTag() != null) {
                        f10 = 1.0f;
                        if (this.f45753b.getTag().equals("3")) {
                            f10 = 1.0f;
                            if (this.f45754c.f45738k != null) {
                                this.f45754c.f45738k.setBackgroundResource(2131230845);
                                f10 = 1.0f;
                            }
                        }
                    }
                }
            }
            m41969a(f10);
            m41970b(f10);
        }
    }

    public C9987e(Context context, g gVar) {
        this.f45729b = "";
        this.f45734g = null;
        this.f45730c = context;
        int length = context.getExternalFilesDirs("external").length;
        this.f45729b = "/storage";
        this.f45734g = gVar;
        try {
            this.f45729b = new File(this.f45729b).getCanonicalPath();
        } catch (IOException e10) {
        }
    }

    /* renamed from: m */
    public static /* synthetic */ String m41953m(C9987e c9987e, Object obj) {
        String str = c9987e.f45731d + obj;
        c9987e.f45731d = str;
        return str;
    }

    /* renamed from: w */
    public static int m41960w(float f10, Context context) {
        return (int) ((f10 * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    /* renamed from: A */
    public final void m41961A() {
        TextView textView;
        try {
            if (!this.f45731d.endsWith(".zip") && !this.f45731d.endsWith(".ovpn")) {
                if (this.f45731d.equals(this.f45729b)) {
                    m41967z(m41966y(this.f45731d));
                } else {
                    this.f45733f.clear();
                    this.f45733f.add("..");
                    this.f45733f.addAll(m41966y(this.f45731d));
                }
                AlertDialog alertDialog = this.f45742o;
                if (alertDialog != null && (textView = (TextView) alertDialog.findViewById(R.id.message)) != null) {
                    textView.setText(this.f45731d);
                }
                if (this.f45731d.equals(this.f45729b)) {
                    this.f45738k.setVisibility(4);
                } else {
                    this.f45738k.setVisibility(0);
                }
                this.f45735h.notifyDataSetChanged();
                this.f45740m.setSelection(0);
                ListViewMaxHeight listViewMaxHeight = this.f45740m;
                if (listViewMaxHeight != null) {
                    listViewMaxHeight.requestFocus();
                    return;
                }
                return;
            }
            g gVar = this.f45734g;
            if (gVar != null) {
                gVar.mo19816a(this.f45731d);
                this.f45742o.dismiss();
            }
        } catch (Exception e10) {
        }
    }

    /* renamed from: t */
    public final void m41962t(File file) {
        try {
            ArrayList arrayList = new ArrayList();
            arrayList.clear();
            if (file.getParent() != null) {
                String parent = file.getParent();
                if (parent.equals("/storage/emulated/0")) {
                    this.f45738k.setVisibility(4);
                } else {
                    arrayList.add(new File(parent).getParent() + "/!c2@f3qc@!V#VEVSD3gg3VC43hh&*%#H2252B@rv3F#RCD5%$#$V#");
                    this.f45738k.setVisibility(0);
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
            this.f45733f.clear();
            this.f45733f.addAll(arrayList);
            this.f45736i.notifyDataSetChanged();
            this.f45740m.setSelection(0);
            ListViewMaxHeight listViewMaxHeight = this.f45740m;
            if (listViewMaxHeight != null) {
                listViewMaxHeight.requestFocus();
            }
        } catch (Exception e10) {
        }
    }

    /* renamed from: u */
    public void m41963u(String str) {
        File file = new File(str);
        if (!file.exists() || !file.isDirectory()) {
            str = this.f45729b;
        }
        try {
            String canonicalPath = new File(str).getCanonicalPath();
            this.f45731d = canonicalPath;
            this.f45732e = m41966y(canonicalPath);
            this.f45733f = m41966y("");
            m41967z(this.f45732e);
            AlertDialog.Builder m41965x = m41965x(canonicalPath, this.f45733f);
            this.f45741n = m41965x;
            m41965x.setNegativeButton(this.f45730c.getResources().getString(2132018556), (DialogInterface.OnClickListener) null);
            this.f45741n.setNeutralButton(this.f45730c.getResources().getString(2132018555), (DialogInterface.OnClickListener) null);
            C5851d c5851d = new C5851d(this.f45730c, this.f45733f);
            this.f45735h = c5851d;
            ListViewMaxHeight listViewMaxHeight = this.f45740m;
            if (listViewMaxHeight != null) {
                listViewMaxHeight.setAdapter((ListAdapter) c5851d);
                this.f45740m.setOnItemClickListener(new c(this));
            }
            AlertDialog create = this.f45741n.create();
            this.f45742o = create;
            create.setOnShowListener(new d(this));
            this.f45742o.setOnKeyListener(new e(this));
            this.f45742o.show();
            if (this.f45742o.getWindow() != null) {
                this.f45742o.getWindow().setBackgroundDrawable(new ColorDrawable(-1));
                this.f45742o.getWindow().setLayout(m41960w(650.0f, this.f45730c), -2);
            }
        } catch (IOException e10) {
        }
    }

    /* renamed from: v */
    public void m41964v(String str) {
        try {
            File absoluteFile = Environment.getExternalStoragePublicDirectory("").getAbsoluteFile();
            ArrayList arrayList = new ArrayList();
            this.f45733f = arrayList;
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
                    this.f45733f.add(new File(Environment.getExternalStoragePublicDirectory(list2[i10]).toString()).getPath());
                    i10++;
                }
            }
            AlertDialog.Builder m41965x = m41965x("", this.f45733f);
            this.f45741n = m41965x;
            m41965x.setNegativeButton(this.f45730c.getResources().getString(2132018556), (DialogInterface.OnClickListener) null);
            this.f45741n.setNeutralButton(this.f45730c.getResources().getString(2132018555), (DialogInterface.OnClickListener) null);
            C5853f c5853f = new C5853f(this.f45730c, this.f45733f, "vpn");
            this.f45736i = c5853f;
            ListViewMaxHeight listViewMaxHeight = this.f45740m;
            if (listViewMaxHeight != null) {
                listViewMaxHeight.setAdapter((ListAdapter) c5853f);
                this.f45740m.setOnItemClickListener(new a(this));
            }
            AlertDialog create = this.f45741n.create();
            this.f45742o = create;
            create.setOnShowListener(new b(this));
            this.f45742o.show();
            if (this.f45742o.getWindow() != null) {
                this.f45742o.getWindow().setBackgroundDrawable(new ColorDrawable(-1));
                this.f45742o.getWindow().setLayout(m41960w(650.0f, this.f45730c), -2);
            }
        } catch (Exception e10) {
        }
    }

    /* renamed from: x */
    public final AlertDialog.Builder m41965x(String str, List<String> list) {
        this.f45741n = new AlertDialog.Builder(this.f45730c, 2132082693);
        LinearLayout linearLayout = new LinearLayout(this.f45730c);
        linearLayout.setOrientation(0);
        TextView textView = new TextView(this.f45730c);
        textView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        textView.setText("Choose Certificate Zip File or ovpn File");
        Drawable drawable = this.f45730c.getResources().getDrawable(2131230894);
        drawable.setBounds(0, 0, 80, 80);
        textView.setCompoundDrawables(drawable, null, null, null);
        textView.setTextSize(22.0f);
        textView.setTextColor(this.f45730c.getResources().getColor(R.color.black));
        textView.setPadding(50, 50, 0, 0);
        textView.setTypeface(null, 1);
        linearLayout.addView(textView);
        this.f45741n.setCustomTitle(linearLayout);
        View inflate = ((LayoutInflater) this.f45730c.getSystemService("layout_inflater")).inflate(2131624175, (ViewGroup) null);
        this.f45741n.setView(inflate);
        this.f45740m = (ListViewMaxHeight) inflate.findViewById(2131428560);
        this.f45741n.setCancelable(true);
        return this.f45741n;
    }

    /* renamed from: y */
    public final List<String> m41966y(String str) {
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
                if ((file2.isFile() && file2.getName().endsWith(".zip")) || file2.getName().endsWith(".ovpn")) {
                    arrayList.add(file2.getName());
                }
            }
            Collections.sort(arrayList, new f(this));
            return arrayList;
        }
        return arrayList;
    }

    /* renamed from: z */
    public final void m41967z(List<String> list) {
        this.f45733f.clear();
        boolean z10 = false;
        for (String str : list) {
            if (!str.equals("self")) {
                if (str.equals("emulated")) {
                    z10 = true;
                } else if (Pattern.compile("^\\(?(.{4})\\)?[- ]?(.{4})$").matcher(str).matches()) {
                    this.f45739l.put("SD Card", str);
                    this.f45733f.add("SD Card");
                } else {
                    this.f45733f.add(str);
                }
            }
        }
        if (z10) {
            this.f45733f.add(0, "Internal Storage");
        }
    }
}
