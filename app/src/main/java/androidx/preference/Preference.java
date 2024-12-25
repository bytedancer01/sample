package androidx.preference;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import java.util.List;
import p069e0.C4570i;
import p296r1.AbstractC7942a;
import p296r1.C7943b;
import p296r1.C7944c;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/preference/Preference.class
 */
/* loaded from: combined.jar:classes1.jar:androidx/preference/Preference.class */
public class Preference implements Comparable<Preference> {

    /* renamed from: A */
    public boolean f4361A;

    /* renamed from: B */
    public int f4362B;

    /* renamed from: C */
    public int f4363C;

    /* renamed from: D */
    public InterfaceC0648b f4364D;

    /* renamed from: E */
    public List<Preference> f4365E;

    /* renamed from: F */
    public InterfaceC0651e f4366F;

    /* renamed from: G */
    public final View.OnClickListener f4367G;

    /* renamed from: b */
    public Context f4368b;

    /* renamed from: c */
    public InterfaceC0649c f4369c;

    /* renamed from: d */
    public InterfaceC0650d f4370d;

    /* renamed from: e */
    public int f4371e;

    /* renamed from: f */
    public int f4372f;

    /* renamed from: g */
    public CharSequence f4373g;

    /* renamed from: h */
    public CharSequence f4374h;

    /* renamed from: i */
    public int f4375i;

    /* renamed from: j */
    public String f4376j;

    /* renamed from: k */
    public Intent f4377k;

    /* renamed from: l */
    public String f4378l;

    /* renamed from: m */
    public boolean f4379m;

    /* renamed from: n */
    public boolean f4380n;

    /* renamed from: o */
    public boolean f4381o;

    /* renamed from: p */
    public String f4382p;

    /* renamed from: q */
    public Object f4383q;

    /* renamed from: r */
    public boolean f4384r;

    /* renamed from: s */
    public boolean f4385s;

    /* renamed from: t */
    public boolean f4386t;

    /* renamed from: u */
    public boolean f4387u;

    /* renamed from: v */
    public boolean f4388v;

    /* renamed from: w */
    public boolean f4389w;

    /* renamed from: x */
    public boolean f4390x;

    /* renamed from: y */
    public boolean f4391y;

    /* renamed from: z */
    public boolean f4392z;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/preference/Preference$a.class
     */
    /* renamed from: androidx.preference.Preference$a */
    /* loaded from: combined.jar:classes1.jar:androidx/preference/Preference$a.class */
    public class ViewOnClickListenerC0647a implements View.OnClickListener {

        /* renamed from: b */
        public final Preference f4393b;

        public ViewOnClickListenerC0647a(Preference preference) {
            this.f4393b = preference;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f4393b.mo3671B(view);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/preference/Preference$b.class
     */
    /* renamed from: androidx.preference.Preference$b */
    /* loaded from: combined.jar:classes1.jar:androidx/preference/Preference$b.class */
    public interface InterfaceC0648b {
        /* renamed from: a */
        void m3719a(Preference preference);
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/preference/Preference$c.class
     */
    /* renamed from: androidx.preference.Preference$c */
    /* loaded from: combined.jar:classes1.jar:androidx/preference/Preference$c.class */
    public interface InterfaceC0649c {
        /* renamed from: a */
        boolean m3720a(Preference preference, Object obj);
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/preference/Preference$d.class
     */
    /* renamed from: androidx.preference.Preference$d */
    /* loaded from: combined.jar:classes1.jar:androidx/preference/Preference$d.class */
    public interface InterfaceC0650d {
        /* renamed from: a */
        boolean m3721a(Preference preference);
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/preference/Preference$e.class
     */
    /* renamed from: androidx.preference.Preference$e */
    /* loaded from: combined.jar:classes1.jar:androidx/preference/Preference$e.class */
    public interface InterfaceC0651e<T extends Preference> {
        /* renamed from: a */
        CharSequence mo3682a(T t10);
    }

    public Preference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C4570i.m23069a(context, C7944c.f38217g, R.attr.preferenceStyle));
    }

    public Preference(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0160, code lost:
    
        if (r0.hasValue(r9) != false) goto L4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public Preference(android.content.Context r7, android.util.AttributeSet r8, int r9, int r10) {
        /*
            Method dump skipped, instructions count: 458
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.Preference.<init>(android.content.Context, android.util.AttributeSet, int, int):void");
    }

    /* renamed from: A */
    public void m3694A() {
        if (mo3714s() && m3715t()) {
            mo3674w();
            InterfaceC0650d interfaceC0650d = this.f4370d;
            if (interfaceC0650d == null || !interfaceC0650d.m3721a(this)) {
                m3710n();
                if (this.f4377k != null) {
                    m3702d().startActivity(this.f4377k);
                }
            }
        }
    }

    /* renamed from: B */
    public void mo3671B(View view) {
        m3694A();
    }

    /* renamed from: C */
    public boolean m3695C(boolean z10) {
        if (!m3699H()) {
            return false;
        }
        if (z10 == m3706h(!z10)) {
            return true;
        }
        m3709m();
        throw null;
    }

    /* renamed from: D */
    public boolean m3696D(int i10) {
        if (!m3699H()) {
            return false;
        }
        if (i10 == m3707i(i10 ^ (-1))) {
            return true;
        }
        m3709m();
        throw null;
    }

    /* renamed from: E */
    public boolean m3697E(String str) {
        if (!m3699H()) {
            return false;
        }
        if (TextUtils.equals(str, m3708j(null))) {
            return true;
        }
        m3709m();
        throw null;
    }

    /* renamed from: F */
    public final void m3698F(InterfaceC0651e interfaceC0651e) {
        this.f4366F = interfaceC0651e;
        mo3677u();
    }

    /* renamed from: G */
    public boolean mo3678G() {
        return !mo3714s();
    }

    /* renamed from: H */
    public boolean m3699H() {
        return false;
    }

    /* renamed from: a */
    public boolean m3700a(Object obj) {
        InterfaceC0649c interfaceC0649c = this.f4369c;
        return interfaceC0649c == null || interfaceC0649c.m3720a(this, obj);
    }

    @Override // java.lang.Comparable
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compareTo(Preference preference) {
        int i10 = this.f4371e;
        int i11 = preference.f4371e;
        if (i10 != i11) {
            return i10 - i11;
        }
        CharSequence charSequence = this.f4373g;
        CharSequence charSequence2 = preference.f4373g;
        if (charSequence == charSequence2) {
            return 0;
        }
        if (charSequence == null) {
            return 1;
        }
        if (charSequence2 == null) {
            return -1;
        }
        return charSequence.toString().compareToIgnoreCase(preference.f4373g.toString());
    }

    /* renamed from: d */
    public Context m3702d() {
        return this.f4368b;
    }

    /* renamed from: e */
    public StringBuilder m3703e() {
        StringBuilder sb2 = new StringBuilder();
        CharSequence m3712q = m3712q();
        if (!TextUtils.isEmpty(m3712q)) {
            sb2.append(m3712q);
            sb2.append(' ');
        }
        CharSequence mo3691o = mo3691o();
        if (!TextUtils.isEmpty(mo3691o)) {
            sb2.append(mo3691o);
            sb2.append(' ');
        }
        if (sb2.length() > 0) {
            sb2.setLength(sb2.length() - 1);
        }
        return sb2;
    }

    /* renamed from: f */
    public String m3704f() {
        return this.f4378l;
    }

    /* renamed from: g */
    public Intent m3705g() {
        return this.f4377k;
    }

    /* renamed from: h */
    public boolean m3706h(boolean z10) {
        if (!m3699H()) {
            return z10;
        }
        m3709m();
        throw null;
    }

    /* renamed from: i */
    public int m3707i(int i10) {
        if (!m3699H()) {
            return i10;
        }
        m3709m();
        throw null;
    }

    /* renamed from: j */
    public String m3708j(String str) {
        if (!m3699H()) {
            return str;
        }
        m3709m();
        throw null;
    }

    /* renamed from: m */
    public AbstractC7942a m3709m() {
        return null;
    }

    /* renamed from: n */
    public C7943b m3710n() {
        return null;
    }

    /* renamed from: o */
    public CharSequence mo3691o() {
        return m3711p() != null ? m3711p().mo3682a(this) : this.f4374h;
    }

    /* renamed from: p */
    public final InterfaceC0651e m3711p() {
        return this.f4366F;
    }

    /* renamed from: q */
    public CharSequence m3712q() {
        return this.f4373g;
    }

    /* renamed from: r */
    public boolean m3713r() {
        return !TextUtils.isEmpty(this.f4376j);
    }

    /* renamed from: s */
    public boolean mo3714s() {
        return this.f4379m && this.f4384r && this.f4385s;
    }

    /* renamed from: t */
    public boolean m3715t() {
        return this.f4380n;
    }

    public String toString() {
        return m3703e().toString();
    }

    /* renamed from: u */
    public void mo3677u() {
        InterfaceC0648b interfaceC0648b = this.f4364D;
        if (interfaceC0648b != null) {
            interfaceC0648b.m3719a(this);
        }
    }

    /* renamed from: v */
    public void mo3716v(boolean z10) {
        List<Preference> list = this.f4365E;
        if (list == null) {
            return;
        }
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            list.get(i10).m3717x(this, z10);
        }
    }

    /* renamed from: w */
    public void mo3674w() {
    }

    /* renamed from: x */
    public void m3717x(Preference preference, boolean z10) {
        if (this.f4384r == z10) {
            this.f4384r = !z10;
            mo3716v(mo3678G());
            mo3677u();
        }
    }

    /* renamed from: y */
    public Object mo3680y(TypedArray typedArray, int i10) {
        return null;
    }

    /* renamed from: z */
    public void m3718z(Preference preference, boolean z10) {
        if (this.f4385s == z10) {
            this.f4385s = !z10;
            mo3716v(mo3678G());
            mo3677u();
        }
    }
}
