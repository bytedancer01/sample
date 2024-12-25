package androidx.navigation;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import androidx.navigation.C0619d;
import androidx.navigation.C0628h;
import androidx.navigation.C0636p;
import org.xmlpull.v1.XmlPullParserException;
import p236o1.C6867a;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/navigation/o.class
 */
/* renamed from: androidx.navigation.o */
/* loaded from: combined.jar:classes1.jar:androidx/navigation/o.class */
public final class C0635o {

    /* renamed from: c */
    public static final ThreadLocal<TypedValue> f4280c = new ThreadLocal<>();

    /* renamed from: a */
    public Context f4281a;

    /* renamed from: b */
    public C0640t f4282b;

    public C0635o(Context context, C0640t c0640t) {
        this.f4281a = context;
        this.f4282b = c0640t;
    }

    /* renamed from: a */
    public static AbstractC0637q m3585a(TypedValue typedValue, AbstractC0637q abstractC0637q, AbstractC0637q abstractC0637q2, String str, String str2) {
        if (abstractC0637q == null || abstractC0637q == abstractC0637q2) {
            if (abstractC0637q == null) {
                abstractC0637q = abstractC0637q2;
            }
            return abstractC0637q;
        }
        throw new XmlPullParserException("Type is " + str + " but found " + str2 + ": " + typedValue.data);
    }

    /* renamed from: b */
    public final C0631k m3586b(Resources resources, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, int i10) {
        int depth;
        C0631k mo3464a = this.f4282b.m3669e(xmlResourceParser.getName()).mo3464a();
        mo3464a.mo3470B(this.f4281a, attributeSet);
        int depth2 = xmlResourceParser.getDepth() + 1;
        while (true) {
            int next = xmlResourceParser.next();
            if (next == 1 || ((depth = xmlResourceParser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2) {
                String name = xmlResourceParser.getName();
                if ("argument".equals(name)) {
                    m3591g(resources, mo3464a, attributeSet, i10);
                } else if ("deepLink".equals(name)) {
                    m3592h(resources, mo3464a, attributeSet);
                } else if ("action".equals(name)) {
                    m3588d(resources, mo3464a, attributeSet, xmlResourceParser, i10);
                } else if ("include".equals(name) && (mo3464a instanceof C0632l)) {
                    TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, C0642v.f4334r);
                    ((C0632l) mo3464a).m3576I(m3587c(obtainAttributes.getResourceId(C0642v.f4335s, 0)));
                    obtainAttributes.recycle();
                } else if (mo3464a instanceof C0632l) {
                    ((C0632l) mo3464a).m3576I(m3586b(resources, xmlResourceParser, attributeSet, i10));
                }
            }
        }
        return mo3464a;
    }

    @SuppressLint({"ResourceType"})
    /* renamed from: c */
    public C0632l m3587c(int i10) {
        int next;
        Resources resources = this.f4281a.getResources();
        XmlResourceParser xml = resources.getXml(i10);
        AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
        do {
            try {
                try {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } catch (Exception e10) {
                    throw new RuntimeException("Exception inflating " + resources.getResourceName(i10) + " line " + xml.getLineNumber(), e10);
                }
            } catch (Throwable th2) {
                xml.close();
                throw th2;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        String name = xml.getName();
        C0631k m3586b = m3586b(resources, xml, asAttributeSet, i10);
        if (m3586b instanceof C0632l) {
            C0632l c0632l = (C0632l) m3586b;
            xml.close();
            return c0632l;
        }
        throw new IllegalArgumentException("Root element <" + name + "> did not inflate into a NavGraph");
    }

    /* renamed from: d */
    public final void m3588d(Resources resources, C0631k c0631k, AttributeSet attributeSet, XmlResourceParser xmlResourceParser, int i10) {
        int depth;
        TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, C6867a.f35599f);
        int resourceId = obtainAttributes.getResourceId(C6867a.f35600g, 0);
        C0618c c0618c = new C0618c(obtainAttributes.getResourceId(C6867a.f35601h, 0));
        C0636p.a aVar = new C0636p.a();
        aVar.m3603d(obtainAttributes.getBoolean(C6867a.f35604k, false));
        aVar.m3606g(obtainAttributes.getResourceId(C6867a.f35607n, -1), obtainAttributes.getBoolean(C6867a.f35608o, false));
        aVar.m3601b(obtainAttributes.getResourceId(C6867a.f35602i, -1));
        aVar.m3602c(obtainAttributes.getResourceId(C6867a.f35603j, -1));
        aVar.m3604e(obtainAttributes.getResourceId(C6867a.f35605l, -1));
        aVar.m3605f(obtainAttributes.getResourceId(C6867a.f35606m, -1));
        c0618c.m3487e(aVar.m3600a());
        Bundle bundle = new Bundle();
        int depth2 = xmlResourceParser.getDepth() + 1;
        while (true) {
            int next = xmlResourceParser.next();
            if (next == 1 || ((depth = xmlResourceParser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2 && "argument".equals(xmlResourceParser.getName())) {
                m3590f(resources, bundle, attributeSet, i10);
            }
        }
        if (!bundle.isEmpty()) {
            c0618c.m3486d(bundle);
        }
        c0631k.m3558D(resourceId, c0618c);
        obtainAttributes.recycle();
    }

    /* renamed from: e */
    public final C0619d m3589e(TypedArray typedArray, Resources resources, int i10) {
        float f10;
        int dimension;
        C0619d.a aVar = new C0619d.a();
        boolean z10 = false;
        aVar.m3494c(typedArray.getBoolean(C6867a.f35613t, false));
        ThreadLocal<TypedValue> threadLocal = f4280c;
        TypedValue typedValue = threadLocal.get();
        TypedValue typedValue2 = typedValue;
        if (typedValue == null) {
            typedValue2 = new TypedValue();
            threadLocal.set(typedValue2);
        }
        String string = typedArray.getString(C6867a.f35612s);
        Object obj = null;
        AbstractC0637q<?> m3607a = string != null ? AbstractC0637q.m3607a(string, resources.getResourcePackageName(i10)) : null;
        int i11 = C6867a.f35611r;
        AbstractC0637q<?> abstractC0637q = m3607a;
        if (typedArray.getValue(i11, typedValue2)) {
            abstractC0637q = AbstractC0637q.f4298c;
            if (m3607a == abstractC0637q) {
                dimension = typedValue2.resourceId;
                if (dimension != 0) {
                    abstractC0637q = m3607a;
                    obj = Integer.valueOf(dimension);
                } else {
                    if (typedValue2.type != 16 || typedValue2.data != 0) {
                        throw new XmlPullParserException("unsupported value '" + ((Object) typedValue2.string) + "' for " + m3607a.mo3611c() + ". Must be a reference to a resource.");
                    }
                    obj = 0;
                    abstractC0637q = m3607a;
                }
            } else {
                int i12 = typedValue2.resourceId;
                if (i12 != 0) {
                    if (m3607a != null) {
                        throw new XmlPullParserException("unsupported value '" + ((Object) typedValue2.string) + "' for " + m3607a.mo3611c() + ". You must use a \"" + abstractC0637q.mo3611c() + "\" type to reference other resources.");
                    }
                    obj = Integer.valueOf(i12);
                } else if (m3607a == AbstractC0637q.f4306k) {
                    obj = typedArray.getString(i11);
                    abstractC0637q = m3607a;
                } else {
                    int i13 = typedValue2.type;
                    if (i13 != 3) {
                        if (i13 != 4) {
                            if (i13 == 5) {
                                abstractC0637q = m3585a(typedValue2, m3607a, AbstractC0637q.f4297b, string, "dimension");
                                dimension = (int) typedValue2.getDimension(resources.getDisplayMetrics());
                            } else if (i13 == 18) {
                                abstractC0637q = m3585a(typedValue2, m3607a, AbstractC0637q.f4304i, string, "boolean");
                                if (typedValue2.data != 0) {
                                    z10 = true;
                                }
                                obj = Boolean.valueOf(z10);
                            } else {
                                if (i13 < 16 || i13 > 31) {
                                    throw new XmlPullParserException("unsupported argument type " + typedValue2.type);
                                }
                                AbstractC0637q<Float> abstractC0637q2 = AbstractC0637q.f4302g;
                                if (m3607a == abstractC0637q2) {
                                    abstractC0637q = m3585a(typedValue2, m3607a, abstractC0637q2, string, "float");
                                    f10 = typedValue2.data;
                                } else {
                                    abstractC0637q = m3585a(typedValue2, m3607a, AbstractC0637q.f4297b, string, "integer");
                                    dimension = typedValue2.data;
                                }
                            }
                            obj = Integer.valueOf(dimension);
                        } else {
                            abstractC0637q = m3585a(typedValue2, m3607a, AbstractC0637q.f4302g, string, "float");
                            f10 = typedValue2.getFloat();
                        }
                        obj = Float.valueOf(f10);
                    } else {
                        String charSequence = typedValue2.string.toString();
                        abstractC0637q = m3607a;
                        if (m3607a == null) {
                            abstractC0637q = AbstractC0637q.m3608d(charSequence);
                        }
                        obj = abstractC0637q.mo3649k(charSequence);
                    }
                }
            }
        }
        if (obj != null) {
            aVar.m3493b(obj);
        }
        if (abstractC0637q != null) {
            aVar.m3495d(abstractC0637q);
        }
        return aVar.m3492a();
    }

    /* renamed from: f */
    public final void m3590f(Resources resources, Bundle bundle, AttributeSet attributeSet, int i10) {
        TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, C6867a.f35609p);
        String string = obtainAttributes.getString(C6867a.f35610q);
        if (string == null) {
            throw new XmlPullParserException("Arguments must have a name");
        }
        C0619d m3589e = m3589e(obtainAttributes, resources, i10);
        if (m3589e.m3489b()) {
            m3589e.m3490c(string, bundle);
        }
        obtainAttributes.recycle();
    }

    /* renamed from: g */
    public final void m3591g(Resources resources, C0631k c0631k, AttributeSet attributeSet, int i10) {
        TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, C6867a.f35609p);
        String string = obtainAttributes.getString(C6867a.f35610q);
        if (string == null) {
            throw new XmlPullParserException("Arguments must have a name");
        }
        c0631k.m3562a(string, m3589e(obtainAttributes, resources, i10));
        obtainAttributes.recycle();
    }

    /* renamed from: h */
    public final void m3592h(Resources resources, C0631k c0631k, AttributeSet attributeSet) {
        TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, C6867a.f35614u);
        String string = obtainAttributes.getString(C6867a.f35617x);
        String string2 = obtainAttributes.getString(C6867a.f35615v);
        String string3 = obtainAttributes.getString(C6867a.f35616w);
        if (TextUtils.isEmpty(string) && TextUtils.isEmpty(string2) && TextUtils.isEmpty(string3)) {
            throw new XmlPullParserException("Every <deepLink> must include at least one of app:uri, app:action, or app:mimeType");
        }
        C0628h.a aVar = new C0628h.a();
        if (string != null) {
            aVar.m3542d(string.replace("${applicationId}", this.f4281a.getPackageName()));
        }
        if (!TextUtils.isEmpty(string2)) {
            aVar.m3540b(string2.replace("${applicationId}", this.f4281a.getPackageName()));
        }
        if (string3 != null) {
            aVar.m3541c(string3.replace("${applicationId}", this.f4281a.getPackageName()));
        }
        c0631k.m3563b(aVar.m3539a());
        obtainAttributes.recycle();
    }
}
