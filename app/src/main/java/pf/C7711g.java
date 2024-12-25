package pf;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TableLayout;
import android.widget.TextView;
import androidx.appcompat.app.DialogC0242a;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:pf/g.class
 */
/* renamed from: pf.g */
/* loaded from: combined.jar:classes2.jar:pf/g.class */
public class C7711g {

    /* renamed from: a */
    public Context f37471a;

    /* renamed from: b */
    public ViewGroup f37472b;

    /* renamed from: c */
    public TableLayout f37473c;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:pf/g$b.class
     */
    /* renamed from: pf.g$b */
    /* loaded from: combined.jar:classes2.jar:pf/g$b.class */
    public static class b {

        /* renamed from: a */
        public TextView f37474a;

        /* renamed from: b */
        public TextView f37475b;

        public b() {
        }

        /* renamed from: a */
        public void m33698a(String str) {
            TextView textView = this.f37474a;
            if (textView != null) {
                textView.setText(str);
            }
        }

        /* renamed from: b */
        public void m33699b(String str) {
            TextView textView = this.f37475b;
            if (textView != null) {
                textView.setText(str);
            }
        }
    }

    public C7711g(Context context) {
        this(context, 2131624527);
    }

    public C7711g(Context context, int i10) {
        this.f37471a = context;
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(i10, (ViewGroup) null);
        this.f37472b = viewGroup;
        this.f37473c = (TableLayout) viewGroup.findViewById(2131429256);
    }

    public C7711g(Context context, TableLayout tableLayout) {
        this.f37471a = context;
        this.f37472b = tableLayout;
        this.f37473c = tableLayout;
    }

    /* renamed from: a */
    public static String m33686a() {
        return "V";
    }

    /* renamed from: i */
    public static String m33687i() {
        return "GhlIGFwcCB5b3UgYXJlIHVzaW5nIGlzIG5vdCBvcmlnaW5hbC4=";
    }

    /* renamed from: b */
    public View m33688b(int i10, String str, String str2) {
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(this.f37471a).inflate(i10, (ViewGroup) this.f37473c, false);
        m33696k(viewGroup, str, str2);
        this.f37473c.addView(viewGroup);
        return viewGroup;
    }

    /* renamed from: c */
    public View m33689c(int i10, String str) {
        return m33690d(this.f37471a.getString(i10), str);
    }

    /* renamed from: d */
    public View m33690d(String str, String str2) {
        return m33688b(2131624529, str, str2);
    }

    /* renamed from: e */
    public View m33691e(int i10) {
        return m33692f(this.f37471a.getString(i10));
    }

    /* renamed from: f */
    public View m33692f(String str) {
        return m33688b(2131624530, str, null);
    }

    /* renamed from: g */
    public DialogC0242a.a m33693g() {
        DialogC0242a.a aVar = new DialogC0242a.a(this.f37471a);
        aVar.setView(m33694h());
        return aVar;
    }

    /* renamed from: h */
    public ViewGroup m33694h() {
        return this.f37472b;
    }

    /* renamed from: j */
    public b m33695j(View view) {
        b bVar = (b) view.getTag();
        b bVar2 = bVar;
        if (bVar == null) {
            bVar2 = new b();
            bVar2.f37474a = (TextView) view.findViewById(2131428748);
            bVar2.f37475b = (TextView) view.findViewById(2131429662);
            view.setTag(bVar2);
        }
        return bVar2;
    }

    /* renamed from: k */
    public void m33696k(View view, String str, String str2) {
        b m33695j = m33695j(view);
        m33695j.m33698a(str);
        m33695j.m33699b(str2);
    }

    /* renamed from: l */
    public void m33697l(View view, String str) {
        m33695j(view).m33699b(str);
    }
}
