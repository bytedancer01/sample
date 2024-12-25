package p412y;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import androidx.constraintlayout.widget.C0376c;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.IOException;
import java.util.ArrayList;
import org.simpleframework.xml.strategy.Name;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:y/a.class
 */
/* renamed from: y.a */
/* loaded from: combined.jar:classes1.jar:y/a.class */
public class C9783a {

    /* renamed from: a */
    public final ConstraintLayout f44580a;

    /* renamed from: b */
    public int f44581b = -1;

    /* renamed from: c */
    public int f44582c = -1;

    /* renamed from: d */
    public SparseArray<a> f44583d = new SparseArray<>();

    /* renamed from: e */
    public SparseArray<C0376c> f44584e = new SparseArray<>();

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:y/a$a.class
     */
    /* renamed from: y.a$a */
    /* loaded from: combined.jar:classes1.jar:y/a$a.class */
    public static class a {

        /* renamed from: a */
        public int f44585a;

        /* renamed from: b */
        public ArrayList<b> f44586b = new ArrayList<>();

        /* renamed from: c */
        public int f44587c;

        /* renamed from: d */
        public C0376c f44588d;

        public a(Context context, XmlPullParser xmlPullParser) {
            this.f44587c = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), C9786d.f44624E4);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == C9786d.f44630F4) {
                    this.f44585a = obtainStyledAttributes.getResourceId(index, this.f44585a);
                } else if (index == C9786d.f44636G4) {
                    this.f44587c = obtainStyledAttributes.getResourceId(index, this.f44587c);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f44587c);
                    context.getResources().getResourceName(this.f44587c);
                    if ("layout".equals(resourceTypeName)) {
                        C0376c c0376c = new C0376c();
                        this.f44588d = c0376c;
                        c0376c.m1738f(context, this.f44587c);
                    }
                }
            }
            obtainStyledAttributes.recycle();
        }

        /* renamed from: a */
        public void m41282a(b bVar) {
            this.f44586b.add(bVar);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:y/a$b.class
     */
    /* renamed from: y.a$b */
    /* loaded from: combined.jar:classes1.jar:y/a$b.class */
    public static class b {

        /* renamed from: a */
        public float f44589a;

        /* renamed from: b */
        public float f44590b;

        /* renamed from: c */
        public float f44591c;

        /* renamed from: d */
        public float f44592d;

        /* renamed from: e */
        public int f44593e;

        /* renamed from: f */
        public C0376c f44594f;

        public b(Context context, XmlPullParser xmlPullParser) {
            this.f44589a = Float.NaN;
            this.f44590b = Float.NaN;
            this.f44591c = Float.NaN;
            this.f44592d = Float.NaN;
            this.f44593e = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), C9786d.f44757a5);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == C9786d.f44764b5) {
                    this.f44593e = obtainStyledAttributes.getResourceId(index, this.f44593e);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f44593e);
                    context.getResources().getResourceName(this.f44593e);
                    if ("layout".equals(resourceTypeName)) {
                        C0376c c0376c = new C0376c();
                        this.f44594f = c0376c;
                        c0376c.m1738f(context, this.f44593e);
                    }
                } else if (index == C9786d.f44771c5) {
                    this.f44592d = obtainStyledAttributes.getDimension(index, this.f44592d);
                } else if (index == C9786d.f44778d5) {
                    this.f44590b = obtainStyledAttributes.getDimension(index, this.f44590b);
                } else if (index == C9786d.f44785e5) {
                    this.f44591c = obtainStyledAttributes.getDimension(index, this.f44591c);
                } else if (index == C9786d.f44792f5) {
                    this.f44589a = obtainStyledAttributes.getDimension(index, this.f44589a);
                } else {
                    Log.v("ConstraintLayoutStates", "Unknown tag");
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public C9783a(Context context, ConstraintLayout constraintLayout, int i10) {
        this.f44580a = constraintLayout;
        m41279a(context, i10);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public final void m41279a(Context context, int i10) {
        a aVar;
        XmlResourceParser xml = context.getResources().getXml(i10);
        a aVar2 = null;
        try {
            int eventType = xml.getEventType();
            while (eventType != 1) {
                if (eventType == 0) {
                    xml.getName();
                    aVar = aVar2;
                } else if (eventType != 2) {
                    aVar = aVar2;
                } else {
                    String name = xml.getName();
                    boolean z10 = -1;
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (name.equals("ConstraintSet")) {
                                z10 = 4;
                                break;
                            }
                            break;
                        case 80204913:
                            if (name.equals("State")) {
                                z10 = 2;
                                break;
                            }
                            break;
                        case 1382829617:
                            if (name.equals("StateSet")) {
                                z10 = true;
                                break;
                            }
                            break;
                        case 1657696882:
                            if (name.equals("layoutDescription")) {
                                z10 = false;
                                break;
                            }
                            break;
                        case 1901439077:
                            if (name.equals("Variant")) {
                                z10 = 3;
                                break;
                            }
                            break;
                    }
                    aVar = aVar2;
                    if (z10) {
                        aVar = aVar2;
                        if (!z10) {
                            if (z10 == 2) {
                                aVar = new a(context, xml);
                                this.f44583d.put(aVar.f44585a, aVar);
                            } else if (z10 == 3) {
                                b bVar = new b(context, xml);
                                aVar = aVar2;
                                if (aVar2 != null) {
                                    aVar2.m41282a(bVar);
                                    aVar = aVar2;
                                }
                            } else if (z10 != 4) {
                                Log.v("ConstraintLayoutStates", "unknown tag " + name);
                                aVar = aVar2;
                            } else {
                                m41280b(context, xml);
                                aVar = aVar2;
                            }
                        }
                    }
                }
                eventType = xml.next();
                aVar2 = aVar;
            }
        } catch (IOException e10) {
            e10.printStackTrace();
        } catch (XmlPullParserException e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: b */
    public final void m41280b(Context context, XmlPullParser xmlPullParser) {
        C0376c c0376c = new C0376c();
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i10 = 0; i10 < attributeCount; i10++) {
            if (Name.MARK.equals(xmlPullParser.getAttributeName(i10))) {
                String attributeValue = xmlPullParser.getAttributeValue(i10);
                int identifier = attributeValue.contains("/") ? context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), Name.MARK, context.getPackageName()) : -1;
                int i11 = identifier;
                if (identifier == -1) {
                    if (attributeValue.length() > 1) {
                        i11 = Integer.parseInt(attributeValue.substring(1));
                    } else {
                        Log.e("ConstraintLayoutStates", "error in parsing id");
                        i11 = identifier;
                    }
                }
                c0376c.m1746n(context, xmlPullParser);
                this.f44584e.put(i11, c0376c);
                return;
            }
        }
    }

    /* renamed from: c */
    public void m41281c(AbstractC9784b abstractC9784b) {
    }
}
