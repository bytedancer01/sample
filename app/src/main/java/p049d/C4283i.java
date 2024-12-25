package p049d;

import android.util.AttributeSet;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.Deque;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:d/i.class
 */
/* renamed from: d.i */
/* loaded from: combined.jar:classes1.jar:d/i.class */
public class C4283i {

    /* renamed from: a */
    public final Deque<WeakReference<XmlPullParser>> f26338a = new ArrayDeque();

    /* renamed from: b */
    public static boolean m21667b(XmlPullParser xmlPullParser) {
        boolean z10 = true;
        if (xmlPullParser != null) {
            z10 = true;
            try {
                if (xmlPullParser.getEventType() != 3) {
                    z10 = xmlPullParser.getEventType() == 1;
                }
            } catch (XmlPullParserException e10) {
                z10 = true;
            }
        }
        return z10;
    }

    /* renamed from: c */
    public static XmlPullParser m21668c(Deque<WeakReference<XmlPullParser>> deque) {
        while (!deque.isEmpty()) {
            XmlPullParser xmlPullParser = deque.peek().get();
            if (!m21667b(xmlPullParser)) {
                return xmlPullParser;
            }
            deque.pop();
        }
        return null;
    }

    /* renamed from: d */
    public static boolean m21669d(XmlPullParser xmlPullParser, XmlPullParser xmlPullParser2) {
        if (xmlPullParser2 == null || xmlPullParser == xmlPullParser2) {
            return false;
        }
        try {
            if (xmlPullParser2.getEventType() == 2) {
                return "include".equals(xmlPullParser2.getName());
            }
            return false;
        } catch (XmlPullParserException e10) {
            return false;
        }
    }

    /* renamed from: a */
    public boolean m21670a(AttributeSet attributeSet) {
        if (!(attributeSet instanceof XmlPullParser)) {
            return false;
        }
        XmlPullParser xmlPullParser = (XmlPullParser) attributeSet;
        if (xmlPullParser.getDepth() != 1) {
            return false;
        }
        XmlPullParser m21668c = m21668c(this.f26338a);
        this.f26338a.push(new WeakReference<>(xmlPullParser));
        return m21669d(xmlPullParser, m21668c);
    }
}
