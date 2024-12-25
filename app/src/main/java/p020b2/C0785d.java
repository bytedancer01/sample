package p020b2;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import android.view.InflateException;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p069e0.C4570i;
import p087f0.C4740c;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:b2/d.class
 */
/* renamed from: b2.d */
/* loaded from: combined.jar:classes1.jar:b2/d.class */
public class C0785d {

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:b2/d$a.class
     */
    /* renamed from: b2.d$a */
    /* loaded from: combined.jar:classes1.jar:b2/d$a.class */
    public static class a implements TypeEvaluator<C4740c.b[]> {

        /* renamed from: a */
        public C4740c.b[] f5448a;

        @Override // android.animation.TypeEvaluator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C4740c.b[] evaluate(float f10, C4740c.b[] bVarArr, C4740c.b[] bVarArr2) {
            if (!C4740c.m23981b(bVarArr, bVarArr2)) {
                throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
            }
            if (!C4740c.m23981b(this.f5448a, bVarArr)) {
                this.f5448a = C4740c.m23985f(bVarArr);
            }
            for (int i10 = 0; i10 < bVarArr.length; i10++) {
                this.f5448a[i10].m23994d(bVarArr[i10], bVarArr2[i10], f10);
            }
            return this.f5448a;
        }
    }

    /* renamed from: a */
    public static Animator m5025a(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, float f10) {
        return m5026b(context, resources, theme, xmlPullParser, Xml.asAttributeSet(xmlPullParser), null, 0, f10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0151, code lost:
    
        if (r25 == null) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0154, code lost:
    
        r0 = new android.animation.Animator[r25.size()];
        r0 = r25.iterator();
        r20 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x016d, code lost:
    
        if (r0.hasNext() == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0170, code lost:
    
        r0[r20] = (android.animation.Animator) r0.next();
        r20 = r20 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0185, code lost:
    
        if (r18 != 0) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0188, code lost:
    
        r17.playTogether(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0191, code lost:
    
        r17.playSequentially(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0199, code lost:
    
        return r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x014c, code lost:
    
        if (r17 == null) goto L52;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v43, types: [android.animation.ValueAnimator] */
    /* JADX WARN: Type inference failed for: r0v56, types: [android.animation.ObjectAnimator] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.animation.Animator m5026b(android.content.Context r12, android.content.res.Resources r13, android.content.res.Resources.Theme r14, org.xmlpull.v1.XmlPullParser r15, android.util.AttributeSet r16, android.animation.AnimatorSet r17, int r18, float r19) {
        /*
            Method dump skipped, instructions count: 410
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p020b2.C0785d.m5026b(android.content.Context, android.content.res.Resources, android.content.res.Resources$Theme, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.animation.AnimatorSet, int, float):android.animation.Animator");
    }

    /* renamed from: c */
    public static Keyframe m5027c(Keyframe keyframe, float f10) {
        return keyframe.getType() == Float.TYPE ? Keyframe.ofFloat(f10) : keyframe.getType() == Integer.TYPE ? Keyframe.ofInt(f10) : Keyframe.ofObject(f10);
    }

    /* renamed from: d */
    public static void m5028d(Keyframe[] keyframeArr, float f10, int i10, int i11) {
        float f11 = f10 / ((i11 - i10) + 2);
        while (i10 <= i11) {
            keyframeArr[i10].setFraction(keyframeArr[i10 - 1].getFraction() + f11);
            i10++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b7, code lost:
    
        if (r0 != null) goto L40;
     */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.animation.PropertyValuesHolder m5029e(android.content.res.TypedArray r7, int r8, int r9, int r10, java.lang.String r11) {
        /*
            Method dump skipped, instructions count: 728
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p020b2.C0785d.m5029e(android.content.res.TypedArray, int, int, int, java.lang.String):android.animation.PropertyValuesHolder");
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0064, code lost:
    
        if (m5032h(r7) != false) goto L26;
     */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int m5030f(android.content.res.TypedArray r3, int r4, int r5) {
        /*
            r0 = r3
            r1 = r4
            android.util.TypedValue r0 = r0.peekValue(r1)
            r9 = r0
            r0 = 1
            r7 = r0
            r0 = 0
            r8 = r0
            r0 = r9
            if (r0 == 0) goto L17
            r0 = 1
            r4 = r0
            goto L19
        L17:
            r0 = 0
            r4 = r0
        L19:
            r0 = r4
            if (r0 == 0) goto L26
            r0 = r9
            int r0 = r0.type
            r6 = r0
            goto L28
        L26:
            r0 = 0
            r6 = r0
        L28:
            r0 = r3
            r1 = r5
            android.util.TypedValue r0 = r0.peekValue(r1)
            r3 = r0
            r0 = r3
            if (r0 == 0) goto L38
            r0 = r7
            r5 = r0
            goto L3a
        L38:
            r0 = 0
            r5 = r0
        L3a:
            r0 = r5
            if (r0 == 0) goto L47
            r0 = r3
            int r0 = r0.type
            r7 = r0
            goto L4a
        L47:
            r0 = 0
            r7 = r0
        L4a:
            r0 = r4
            if (r0 == 0) goto L55
            r0 = r6
            boolean r0 = m5032h(r0)
            if (r0 != 0) goto L67
        L55:
            r0 = r8
            r4 = r0
            r0 = r5
            if (r0 == 0) goto L69
            r0 = r8
            r4 = r0
            r0 = r7
            boolean r0 = m5032h(r0)
            if (r0 == 0) goto L69
        L67:
            r0 = 3
            r4 = r0
        L69:
            r0 = r4
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p020b2.C0785d.m5030f(android.content.res.TypedArray, int, int):int");
    }

    /* renamed from: g */
    public static int m5031g(Resources resources, Resources.Theme theme, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        TypedArray m23087s = C4570i.m23087s(resources, theme, attributeSet, C0782a.f5432j);
        TypedValue m23088t = C4570i.m23088t(m23087s, xmlPullParser, "value", 0);
        int i10 = 0;
        if (m23088t != null) {
            i10 = 0;
            if (m5032h(m23088t.type)) {
                i10 = 3;
            }
        }
        m23087s.recycle();
        return i10;
    }

    /* renamed from: h */
    public static boolean m5032h(int i10) {
        return i10 >= 28 && i10 <= 31;
    }

    /* renamed from: i */
    public static Animator m5033i(Context context, int i10) {
        return Build.VERSION.SDK_INT >= 24 ? AnimatorInflater.loadAnimator(context, i10) : m5034j(context, context.getResources(), context.getTheme(), i10);
    }

    /* renamed from: j */
    public static Animator m5034j(Context context, Resources resources, Resources.Theme theme, int i10) {
        return m5035k(context, resources, theme, i10, 1.0f);
    }

    /* renamed from: k */
    public static Animator m5035k(Context context, Resources resources, Resources.Theme theme, int i10, float f10) {
        XmlResourceParser xmlResourceParser = null;
        XmlResourceParser xmlResourceParser2 = null;
        XmlResourceParser xmlResourceParser3 = null;
        try {
            try {
                XmlResourceParser animation = resources.getAnimation(i10);
                xmlResourceParser3 = animation;
                xmlResourceParser = animation;
                xmlResourceParser2 = animation;
                Animator m5025a = m5025a(context, resources, theme, animation, f10);
                if (animation != null) {
                    animation.close();
                }
                return m5025a;
            } catch (IOException e10) {
                XmlResourceParser xmlResourceParser4 = xmlResourceParser;
                XmlResourceParser xmlResourceParser5 = xmlResourceParser;
                StringBuilder sb2 = new StringBuilder();
                XmlResourceParser xmlResourceParser6 = xmlResourceParser;
                sb2.append("Can't load animation resource ID #0x");
                XmlResourceParser xmlResourceParser7 = xmlResourceParser;
                sb2.append(Integer.toHexString(i10));
                XmlResourceParser xmlResourceParser8 = xmlResourceParser;
                Resources.NotFoundException notFoundException = new Resources.NotFoundException(sb2.toString());
                XmlResourceParser xmlResourceParser9 = xmlResourceParser;
                notFoundException.initCause(e10);
                XmlResourceParser xmlResourceParser10 = xmlResourceParser;
                throw notFoundException;
            } catch (XmlPullParserException e11) {
                XmlResourceParser xmlResourceParser11 = xmlResourceParser2;
                XmlResourceParser xmlResourceParser12 = xmlResourceParser2;
                StringBuilder sb3 = new StringBuilder();
                XmlResourceParser xmlResourceParser13 = xmlResourceParser2;
                sb3.append("Can't load animation resource ID #0x");
                XmlResourceParser xmlResourceParser14 = xmlResourceParser2;
                sb3.append(Integer.toHexString(i10));
                XmlResourceParser xmlResourceParser15 = xmlResourceParser2;
                Resources.NotFoundException notFoundException2 = new Resources.NotFoundException(sb3.toString());
                XmlResourceParser xmlResourceParser16 = xmlResourceParser2;
                notFoundException2.initCause(e11);
                XmlResourceParser xmlResourceParser17 = xmlResourceParser2;
                throw notFoundException2;
            }
        } catch (Throwable th2) {
            if (xmlResourceParser3 != null) {
                xmlResourceParser3.close();
            }
            throw th2;
        }
    }

    /* renamed from: l */
    public static ValueAnimator m5036l(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, ValueAnimator valueAnimator, float f10, XmlPullParser xmlPullParser) {
        TypedArray m23087s = C4570i.m23087s(resources, theme, attributeSet, C0782a.f5429g);
        TypedArray m23087s2 = C4570i.m23087s(resources, theme, attributeSet, C0782a.f5433k);
        ValueAnimator valueAnimator2 = valueAnimator;
        if (valueAnimator == null) {
            valueAnimator2 = new ValueAnimator();
        }
        m5041q(valueAnimator2, m23087s, m23087s2, f10, xmlPullParser);
        int m23080l = C4570i.m23080l(m23087s, xmlPullParser, "interpolator", 0, 0);
        if (m23080l > 0) {
            valueAnimator2.setInterpolator(C0784c.m5024a(context, m23080l));
        }
        m23087s.recycle();
        if (m23087s2 != null) {
            m23087s2.recycle();
        }
        return valueAnimator2;
    }

    /* renamed from: m */
    public static Keyframe m5037m(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, int i10, XmlPullParser xmlPullParser) {
        TypedArray m23087s = C4570i.m23087s(resources, theme, attributeSet, C0782a.f5432j);
        float m23078j = C4570i.m23078j(m23087s, xmlPullParser, "fraction", 3, -1.0f);
        TypedValue m23088t = C4570i.m23088t(m23087s, xmlPullParser, "value", 0);
        boolean z10 = m23088t != null;
        int i11 = i10;
        if (i10 == 4) {
            i11 = (z10 && m5032h(m23088t.type)) ? 3 : 0;
        }
        Keyframe ofInt = z10 ? i11 != 0 ? (i11 == 1 || i11 == 3) ? Keyframe.ofInt(m23078j, C4570i.m23079k(m23087s, xmlPullParser, "value", 0, 0)) : null : Keyframe.ofFloat(m23078j, C4570i.m23078j(m23087s, xmlPullParser, "value", 0, 0.0f)) : i11 == 0 ? Keyframe.ofFloat(m23078j) : Keyframe.ofInt(m23078j);
        int m23080l = C4570i.m23080l(m23087s, xmlPullParser, "interpolator", 1, 0);
        if (m23080l > 0) {
            ofInt.setInterpolator(C0784c.m5024a(context, m23080l));
        }
        m23087s.recycle();
        return ofInt;
    }

    /* renamed from: n */
    public static ObjectAnimator m5038n(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, float f10, XmlPullParser xmlPullParser) {
        ObjectAnimator objectAnimator = new ObjectAnimator();
        m5036l(context, resources, theme, attributeSet, objectAnimator, f10, xmlPullParser);
        return objectAnimator;
    }

    /* renamed from: o */
    public static PropertyValuesHolder m5039o(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, String str, int i10) {
        ArrayList arrayList = null;
        int i11 = i10;
        while (true) {
            int next = xmlPullParser.next();
            if (next == 3 || next == 1) {
                break;
            }
            if (xmlPullParser.getName().equals("keyframe")) {
                int i12 = i11;
                if (i11 == 4) {
                    i12 = m5031g(resources, theme, Xml.asAttributeSet(xmlPullParser), xmlPullParser);
                }
                Keyframe m5037m = m5037m(context, resources, theme, Xml.asAttributeSet(xmlPullParser), i12, xmlPullParser);
                ArrayList arrayList2 = arrayList;
                if (m5037m != null) {
                    arrayList2 = arrayList;
                    if (arrayList == null) {
                        arrayList2 = new ArrayList();
                    }
                    arrayList2.add(m5037m);
                }
                xmlPullParser.next();
                arrayList = arrayList2;
                i11 = i12;
            }
        }
        PropertyValuesHolder propertyValuesHolder = null;
        if (arrayList != null) {
            int size = arrayList.size();
            propertyValuesHolder = null;
            if (size > 0) {
                Keyframe keyframe = (Keyframe) arrayList.get(0);
                Keyframe keyframe2 = (Keyframe) arrayList.get(size - 1);
                float fraction = keyframe2.getFraction();
                int i13 = size;
                if (fraction < 1.0f) {
                    if (fraction < 0.0f) {
                        keyframe2.setFraction(1.0f);
                        i13 = size;
                    } else {
                        arrayList.add(arrayList.size(), m5027c(keyframe2, 1.0f));
                        i13 = size + 1;
                    }
                }
                float fraction2 = keyframe.getFraction();
                int i14 = i13;
                if (fraction2 != 0.0f) {
                    if (fraction2 < 0.0f) {
                        keyframe.setFraction(0.0f);
                        i14 = i13;
                    } else {
                        arrayList.add(0, m5027c(keyframe, 0.0f));
                        i14 = i13 + 1;
                    }
                }
                Keyframe[] keyframeArr = new Keyframe[i14];
                arrayList.toArray(keyframeArr);
                for (int i15 = 0; i15 < i14; i15++) {
                    Keyframe keyframe3 = keyframeArr[i15];
                    if (keyframe3.getFraction() < 0.0f) {
                        if (i15 == 0) {
                            keyframe3.setFraction(0.0f);
                        } else {
                            int i16 = i14 - 1;
                            if (i15 == i16) {
                                keyframe3.setFraction(1.0f);
                            } else {
                                int i17 = i15;
                                for (int i18 = i15 + 1; i18 < i16 && keyframeArr[i18].getFraction() < 0.0f; i18++) {
                                    i17 = i18;
                                }
                                m5028d(keyframeArr, keyframeArr[i17 + 1].getFraction() - keyframeArr[i15 - 1].getFraction(), i15, i17);
                            }
                        }
                    }
                }
                PropertyValuesHolder ofKeyframe = PropertyValuesHolder.ofKeyframe(str, keyframeArr);
                propertyValuesHolder = ofKeyframe;
                if (i11 == 3) {
                    ofKeyframe.setEvaluator(C0786e.m5045a());
                    propertyValuesHolder = ofKeyframe;
                }
            }
        }
        return propertyValuesHolder;
    }

    /* renamed from: p */
    public static PropertyValuesHolder[] m5040p(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        int i10;
        ArrayList arrayList = null;
        while (true) {
            int eventType = xmlPullParser.getEventType();
            i10 = 0;
            if (eventType == 3 || eventType == 1) {
                break;
            }
            if (eventType == 2 && xmlPullParser.getName().equals("propertyValuesHolder")) {
                TypedArray m23087s = C4570i.m23087s(resources, theme, attributeSet, C0782a.f5431i);
                String m23081m = C4570i.m23081m(m23087s, xmlPullParser, "propertyName", 3);
                int m23079k = C4570i.m23079k(m23087s, xmlPullParser, "valueType", 2, 4);
                PropertyValuesHolder m5039o = m5039o(context, resources, theme, xmlPullParser, m23081m, m23079k);
                PropertyValuesHolder propertyValuesHolder = m5039o;
                if (m5039o == null) {
                    propertyValuesHolder = m5029e(m23087s, m23079k, 0, 1, m23081m);
                }
                ArrayList arrayList2 = arrayList;
                if (propertyValuesHolder != null) {
                    arrayList2 = arrayList;
                    if (arrayList == null) {
                        arrayList2 = new ArrayList();
                    }
                    arrayList2.add(propertyValuesHolder);
                }
                m23087s.recycle();
                arrayList = arrayList2;
            }
            xmlPullParser.next();
        }
        PropertyValuesHolder[] propertyValuesHolderArr = null;
        if (arrayList != null) {
            int size = arrayList.size();
            PropertyValuesHolder[] propertyValuesHolderArr2 = new PropertyValuesHolder[size];
            while (true) {
                propertyValuesHolderArr = propertyValuesHolderArr2;
                if (i10 >= size) {
                    break;
                }
                propertyValuesHolderArr2[i10] = (PropertyValuesHolder) arrayList.get(i10);
                i10++;
            }
        }
        return propertyValuesHolderArr;
    }

    /* renamed from: q */
    public static void m5041q(ValueAnimator valueAnimator, TypedArray typedArray, TypedArray typedArray2, float f10, XmlPullParser xmlPullParser) {
        long m23079k = C4570i.m23079k(typedArray, xmlPullParser, "duration", 1, 300);
        long m23079k2 = C4570i.m23079k(typedArray, xmlPullParser, "startOffset", 2, 0);
        int m23079k3 = C4570i.m23079k(typedArray, xmlPullParser, "valueType", 7, 4);
        int i10 = m23079k3;
        if (C4570i.m23086r(xmlPullParser, "valueFrom")) {
            i10 = m23079k3;
            if (C4570i.m23086r(xmlPullParser, "valueTo")) {
                int i11 = m23079k3;
                if (m23079k3 == 4) {
                    i11 = m5030f(typedArray, 5, 6);
                }
                PropertyValuesHolder m5029e = m5029e(typedArray, i11, 5, 6, "");
                i10 = i11;
                if (m5029e != null) {
                    valueAnimator.setValues(m5029e);
                    i10 = i11;
                }
            }
        }
        valueAnimator.setDuration(m23079k);
        valueAnimator.setStartDelay(m23079k2);
        valueAnimator.setRepeatCount(C4570i.m23079k(typedArray, xmlPullParser, "repeatCount", 3, 0));
        valueAnimator.setRepeatMode(C4570i.m23079k(typedArray, xmlPullParser, "repeatMode", 4, 1));
        if (typedArray2 != null) {
            m5042r(valueAnimator, typedArray2, i10, f10, xmlPullParser);
        }
    }

    /* renamed from: r */
    public static void m5042r(ValueAnimator valueAnimator, TypedArray typedArray, int i10, float f10, XmlPullParser xmlPullParser) {
        ObjectAnimator objectAnimator = (ObjectAnimator) valueAnimator;
        String m23081m = C4570i.m23081m(typedArray, xmlPullParser, "pathData", 1);
        if (m23081m == null) {
            objectAnimator.setPropertyName(C4570i.m23081m(typedArray, xmlPullParser, "propertyName", 0));
            return;
        }
        String m23081m2 = C4570i.m23081m(typedArray, xmlPullParser, "propertyXName", 2);
        String m23081m3 = C4570i.m23081m(typedArray, xmlPullParser, "propertyYName", 3);
        if (i10 != 2) {
        }
        if (m23081m2 != null || m23081m3 != null) {
            m5043s(C4740c.m23984e(m23081m), objectAnimator, f10 * 0.5f, m23081m2, m23081m3);
            return;
        }
        throw new InflateException(typedArray.getPositionDescription() + " propertyXName or propertyYName is needed for PathData");
    }

    /* renamed from: s */
    public static void m5043s(Path path, ObjectAnimator objectAnimator, float f10, String str, String str2) {
        float length;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        ArrayList arrayList = new ArrayList();
        arrayList.add(Float.valueOf(0.0f));
        float f11 = 0.0f;
        do {
            length = f11 + pathMeasure.getLength();
            arrayList.add(Float.valueOf(length));
            f11 = length;
        } while (pathMeasure.nextContour());
        PathMeasure pathMeasure2 = new PathMeasure(path, false);
        int min = Math.min(100, ((int) (length / f10)) + 1);
        float[] fArr = new float[min];
        float[] fArr2 = new float[min];
        float[] fArr3 = new float[2];
        float f12 = length / (min - 1);
        int i10 = 0;
        int i11 = 0;
        float f13 = 0.0f;
        while (i10 < min) {
            pathMeasure2.getPosTan(f13 - ((Float) arrayList.get(i11)).floatValue(), fArr3, null);
            fArr[i10] = fArr3[0];
            fArr2[i10] = fArr3[1];
            f13 += f12;
            int i12 = i11 + 1;
            int i13 = i11;
            if (i12 < arrayList.size()) {
                i13 = i11;
                if (f13 > ((Float) arrayList.get(i12)).floatValue()) {
                    pathMeasure2.nextContour();
                    i13 = i12;
                }
            }
            i10++;
            i11 = i13;
        }
        PropertyValuesHolder ofFloat = str != null ? PropertyValuesHolder.ofFloat(str, fArr) : null;
        PropertyValuesHolder propertyValuesHolder = null;
        if (str2 != null) {
            propertyValuesHolder = PropertyValuesHolder.ofFloat(str2, fArr2);
        }
        if (ofFloat == null) {
            objectAnimator.setValues(propertyValuesHolder);
        } else if (propertyValuesHolder == null) {
            objectAnimator.setValues(ofFloat);
        } else {
            objectAnimator.setValues(ofFloat, propertyValuesHolder);
        }
    }
}
