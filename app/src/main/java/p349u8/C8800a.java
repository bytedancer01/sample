package p349u8;

import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p059d9.C4349a;
import p059d9.C4361f0;
import p059d9.C4392v;
import p059d9.C4394w;
import p243o8.AbstractC6921c;
import p243o8.C6919a;
import p243o8.InterfaceC6923e;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:u8/a.class
 */
/* renamed from: u8.a */
/* loaded from: combined.jar:classes2.jar:u8/a.class */
public final class C8800a extends AbstractC6921c {

    /* renamed from: q */
    public static final Pattern f40809q = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*");

    /* renamed from: r */
    public static final Pattern f40810r = Pattern.compile("\\{\\\\.*?\\}");

    /* renamed from: o */
    public final StringBuilder f40811o;

    /* renamed from: p */
    public final ArrayList<String> f40812p;

    public C8800a() {
        super("SubripDecoder");
        this.f40811o = new StringBuilder();
        this.f40812p = new ArrayList<>();
    }

    /* renamed from: C */
    public static float m37653C(int i10) {
        if (i10 == 0) {
            return 0.08f;
        }
        if (i10 == 1) {
            return 0.5f;
        }
        if (i10 == 2) {
            return 0.92f;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: D */
    public static long m37654D(Matcher matcher, int i10) {
        String group = matcher.group(i10 + 1);
        long parseLong = (group != null ? Long.parseLong(group) * 60 * 60 * 1000 : 0L) + (Long.parseLong((String) C4349a.m21882e(matcher.group(i10 + 2))) * 60 * 1000) + (Long.parseLong((String) C4349a.m21882e(matcher.group(i10 + 3))) * 1000);
        String group2 = matcher.group(i10 + 4);
        long j10 = parseLong;
        if (group2 != null) {
            j10 = parseLong + Long.parseLong(group2);
        }
        return j10 * 1000;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: B */
    public final C6919a m37655B(Spanned spanned, String str) {
        boolean z10;
        boolean z11;
        C6919a.b m31871o = new C6919a.b().m31871o(spanned);
        if (str == null) {
            return m31871o.m31857a();
        }
        switch (str.hashCode()) {
            case -685620710:
                if (str.equals("{\\an1}")) {
                    z10 = false;
                    break;
                }
                z10 = -1;
                break;
            case -685620679:
                if (str.equals("{\\an2}")) {
                    z10 = 6;
                    break;
                }
                z10 = -1;
                break;
            case -685620648:
                if (str.equals("{\\an3}")) {
                    z10 = 3;
                    break;
                }
                z10 = -1;
                break;
            case -685620617:
                if (str.equals("{\\an4}")) {
                    z10 = true;
                    break;
                }
                z10 = -1;
                break;
            case -685620586:
                if (str.equals("{\\an5}")) {
                    z10 = 7;
                    break;
                }
                z10 = -1;
                break;
            case -685620555:
                if (str.equals("{\\an6}")) {
                    z10 = 4;
                    break;
                }
                z10 = -1;
                break;
            case -685620524:
                if (str.equals("{\\an7}")) {
                    z10 = 2;
                    break;
                }
                z10 = -1;
                break;
            case -685620493:
                if (str.equals("{\\an8}")) {
                    z10 = 8;
                    break;
                }
                z10 = -1;
                break;
            case -685620462:
                if (str.equals("{\\an9}")) {
                    z10 = 5;
                    break;
                }
                z10 = -1;
                break;
            default:
                z10 = -1;
                break;
        }
        if (!z10 || z10 || z10 == 2) {
            m31871o.m31868l(0);
        } else if (z10 == 3 || z10 == 4 || z10 == 5) {
            m31871o.m31868l(2);
        } else {
            m31871o.m31868l(1);
        }
        switch (str.hashCode()) {
            case -685620710:
                if (str.equals("{\\an1}")) {
                    z11 = false;
                    break;
                }
                z11 = -1;
                break;
            case -685620679:
                if (str.equals("{\\an2}")) {
                    z11 = true;
                    break;
                }
                z11 = -1;
                break;
            case -685620648:
                if (str.equals("{\\an3}")) {
                    z11 = 2;
                    break;
                }
                z11 = -1;
                break;
            case -685620617:
                if (str.equals("{\\an4}")) {
                    z11 = 6;
                    break;
                }
                z11 = -1;
                break;
            case -685620586:
                if (str.equals("{\\an5}")) {
                    z11 = 7;
                    break;
                }
                z11 = -1;
                break;
            case -685620555:
                if (str.equals("{\\an6}")) {
                    z11 = 8;
                    break;
                }
                z11 = -1;
                break;
            case -685620524:
                if (str.equals("{\\an7}")) {
                    z11 = 3;
                    break;
                }
                z11 = -1;
                break;
            case -685620493:
                if (str.equals("{\\an8}")) {
                    z11 = 4;
                    break;
                }
                z11 = -1;
                break;
            case -685620462:
                if (str.equals("{\\an9}")) {
                    z11 = 5;
                    break;
                }
                z11 = -1;
                break;
            default:
                z11 = -1;
                break;
        }
        if (!z11 || z11 || z11 == 2) {
            m31871o.m31865i(2);
        } else if (z11 == 3 || z11 == 4 || z11 == 5) {
            m31871o.m31865i(0);
        } else {
            m31871o.m31865i(1);
        }
        return m31871o.m31867k(m37653C(m31871o.m31860d())).m31864h(m37653C(m31871o.m31859c()), 0).m31857a();
    }

    /* renamed from: E */
    public final String m37656E(String str, ArrayList<String> arrayList) {
        String trim = str.trim();
        StringBuilder sb2 = new StringBuilder(trim);
        Matcher matcher = f40810r.matcher(trim);
        int i10 = 0;
        while (true) {
            int i11 = i10;
            if (!matcher.find()) {
                return sb2.toString();
            }
            String group = matcher.group();
            arrayList.add(group);
            int start = matcher.start() - i11;
            int length = group.length();
            sb2.replace(start, start + length, "");
            i10 = i11 + length;
        }
    }

    @Override // p243o8.AbstractC6921c
    /* renamed from: z */
    public InterfaceC6923e mo31882z(byte[] bArr, int i10, boolean z10) {
        StringBuilder sb2;
        String str;
        String str2;
        ArrayList arrayList = new ArrayList();
        C4394w c4394w = new C4394w();
        C4361f0 c4361f0 = new C4361f0(bArr, i10);
        while (true) {
            String m22000p = c4361f0.m22000p();
            int i11 = 0;
            if (m22000p == null) {
                break;
            }
            if (m22000p.length() != 0) {
                try {
                    Integer.parseInt(m22000p);
                    m22000p = c4361f0.m22000p();
                } catch (NumberFormatException e10) {
                    sb2 = new StringBuilder();
                    str = "Skipping invalid index: ";
                }
                if (m22000p == null) {
                    C4392v.m22275i("SubripDecoder", "Unexpected end");
                    break;
                }
                Matcher matcher = f40809q.matcher(m22000p);
                if (matcher.matches()) {
                    c4394w.m22282a(m37654D(matcher, 1));
                    c4394w.m22282a(m37654D(matcher, 6));
                    this.f40811o.setLength(0);
                    this.f40812p.clear();
                    while (true) {
                        String m22000p2 = c4361f0.m22000p();
                        if (TextUtils.isEmpty(m22000p2)) {
                            break;
                        }
                        if (this.f40811o.length() > 0) {
                            this.f40811o.append("<br>");
                        }
                        this.f40811o.append(m37656E(m22000p2, this.f40812p));
                    }
                    Spanned fromHtml = Html.fromHtml(this.f40811o.toString());
                    while (true) {
                        str2 = null;
                        if (i11 >= this.f40812p.size()) {
                            break;
                        }
                        str2 = this.f40812p.get(i11);
                        if (str2.matches("\\{\\\\an[1-9]\\}")) {
                            break;
                        }
                        i11++;
                    }
                    arrayList.add(m37655B(fromHtml, str2));
                    arrayList.add(C6919a.f35794r);
                } else {
                    sb2 = new StringBuilder();
                    str = "Skipping invalid timing: ";
                    sb2.append(str);
                    sb2.append(m22000p);
                    C4392v.m22275i("SubripDecoder", sb2.toString());
                }
            }
        }
        return new C8801b((C6919a[]) arrayList.toArray(new C6919a[0]), c4394w.m22285d());
    }
}
