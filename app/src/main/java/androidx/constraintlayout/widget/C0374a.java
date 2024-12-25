package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import p412y.C9786d;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/constraintlayout/widget/a.class
 */
/* renamed from: androidx.constraintlayout.widget.a */
/* loaded from: combined.jar:classes1.jar:androidx/constraintlayout/widget/a.class */
public class C0374a {

    /* renamed from: a */
    public String f2465a;

    /* renamed from: b */
    public b f2466b;

    /* renamed from: c */
    public int f2467c;

    /* renamed from: d */
    public float f2468d;

    /* renamed from: e */
    public String f2469e;

    /* renamed from: f */
    public boolean f2470f;

    /* renamed from: g */
    public int f2471g;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/constraintlayout/widget/a$a.class
     */
    /* renamed from: androidx.constraintlayout.widget.a$a */
    /* loaded from: combined.jar:classes1.jar:androidx/constraintlayout/widget/a$a.class */
    public static /* synthetic */ class a {

        /* renamed from: a */
        public static final int[] f2472a;

        /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:43:0x006d
            	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1179)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
            */
        static {
            /*
                androidx.constraintlayout.widget.a$b[] r0 = androidx.constraintlayout.widget.C0374a.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r4 = r0
                r0 = r4
                androidx.constraintlayout.widget.C0374a.a.f2472a = r0
                r0 = r4
                androidx.constraintlayout.widget.a$b r1 = androidx.constraintlayout.widget.C0374a.b.COLOR_TYPE     // Catch: java.lang.NoSuchFieldError -> L59
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L59
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L59
            L14:
                int[] r0 = androidx.constraintlayout.widget.C0374a.a.f2472a     // Catch: java.lang.NoSuchFieldError -> L59 java.lang.NoSuchFieldError -> L5d
                androidx.constraintlayout.widget.a$b r1 = androidx.constraintlayout.widget.C0374a.b.COLOR_DRAWABLE_TYPE     // Catch: java.lang.NoSuchFieldError -> L5d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L5d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L5d
            L1f:
                int[] r0 = androidx.constraintlayout.widget.C0374a.a.f2472a     // Catch: java.lang.NoSuchFieldError -> L5d java.lang.NoSuchFieldError -> L61
                androidx.constraintlayout.widget.a$b r1 = androidx.constraintlayout.widget.C0374a.b.INT_TYPE     // Catch: java.lang.NoSuchFieldError -> L61
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L61
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L61
            L2a:
                int[] r0 = androidx.constraintlayout.widget.C0374a.a.f2472a     // Catch: java.lang.NoSuchFieldError -> L61 java.lang.NoSuchFieldError -> L65
                androidx.constraintlayout.widget.a$b r1 = androidx.constraintlayout.widget.C0374a.b.FLOAT_TYPE     // Catch: java.lang.NoSuchFieldError -> L65
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L65
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L65
            L35:
                int[] r0 = androidx.constraintlayout.widget.C0374a.a.f2472a     // Catch: java.lang.NoSuchFieldError -> L65 java.lang.NoSuchFieldError -> L69
                androidx.constraintlayout.widget.a$b r1 = androidx.constraintlayout.widget.C0374a.b.STRING_TYPE     // Catch: java.lang.NoSuchFieldError -> L69
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L69
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L69
            L40:
                int[] r0 = androidx.constraintlayout.widget.C0374a.a.f2472a     // Catch: java.lang.NoSuchFieldError -> L69 java.lang.NoSuchFieldError -> L6d
                androidx.constraintlayout.widget.a$b r1 = androidx.constraintlayout.widget.C0374a.b.BOOLEAN_TYPE     // Catch: java.lang.NoSuchFieldError -> L6d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L6d
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L6d
            L4c:
                int[] r0 = androidx.constraintlayout.widget.C0374a.a.f2472a     // Catch: java.lang.NoSuchFieldError -> L6d java.lang.NoSuchFieldError -> L71
                androidx.constraintlayout.widget.a$b r1 = androidx.constraintlayout.widget.C0374a.b.DIMENSION_TYPE     // Catch: java.lang.NoSuchFieldError -> L71
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L71
                r2 = 7
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L71
            L58:
                return
            L59:
                r4 = move-exception
                goto L14
            L5d:
                r4 = move-exception
                goto L1f
            L61:
                r4 = move-exception
                goto L2a
            L65:
                r4 = move-exception
                goto L35
            L69:
                r4 = move-exception
                goto L40
            L6d:
                r4 = move-exception
                goto L4c
            L71:
                r4 = move-exception
                goto L58
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.C0374a.a.m43000clinit():void");
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/constraintlayout/widget/a$b.class
     */
    /* renamed from: androidx.constraintlayout.widget.a$b */
    /* loaded from: combined.jar:classes1.jar:androidx/constraintlayout/widget/a$b.class */
    public enum b {
        INT_TYPE,
        FLOAT_TYPE,
        COLOR_TYPE,
        COLOR_DRAWABLE_TYPE,
        STRING_TYPE,
        BOOLEAN_TYPE,
        DIMENSION_TYPE
    }

    public C0374a(C0374a c0374a, Object obj) {
        this.f2465a = c0374a.f2465a;
        this.f2466b = c0374a.f2466b;
        m1720d(obj);
    }

    public C0374a(String str, b bVar, Object obj) {
        this.f2465a = str;
        this.f2466b = bVar;
        m1720d(obj);
    }

    /* renamed from: a */
    public static HashMap<String, C0374a> m1717a(HashMap<String, C0374a> hashMap, View view) {
        HashMap<String, C0374a> hashMap2 = new HashMap<>();
        Class<?> cls = view.getClass();
        for (String str : hashMap.keySet()) {
            C0374a c0374a = hashMap.get(str);
            try {
                hashMap2.put(str, str.equals("BackgroundColor") ? new C0374a(c0374a, Integer.valueOf(((ColorDrawable) view.getBackground()).getColor())) : new C0374a(c0374a, cls.getMethod("getMap" + str, new Class[0]).invoke(view, new Object[0])));
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e10) {
                e10.printStackTrace();
            }
        }
        return hashMap2;
    }

    /* renamed from: b */
    public static void m1718b(Context context, XmlPullParser xmlPullParser, HashMap<String, C0374a> hashMap) {
        String str;
        Object obj;
        b bVar;
        b bVar2;
        Object string;
        int integer;
        float f10;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), C9786d.f44604B2);
        int indexCount = obtainStyledAttributes.getIndexCount();
        String str2 = null;
        Object obj2 = null;
        b bVar3 = null;
        int i10 = 0;
        while (i10 < indexCount) {
            int index = obtainStyledAttributes.getIndex(i10);
            if (index == C9786d.f44610C2) {
                String string2 = obtainStyledAttributes.getString(index);
                str = string2;
                obj = obj2;
                bVar = bVar3;
                if (string2 != null) {
                    str = string2;
                    obj = obj2;
                    bVar = bVar3;
                    if (string2.length() > 0) {
                        str = Character.toUpperCase(string2.charAt(0)) + string2.substring(1);
                        obj = obj2;
                        bVar = bVar3;
                    }
                }
            } else if (index == C9786d.f44616D2) {
                obj = Boolean.valueOf(obtainStyledAttributes.getBoolean(index, false));
                bVar = b.BOOLEAN_TYPE;
                str = str2;
            } else {
                if (index == C9786d.f44628F2) {
                    bVar2 = b.COLOR_TYPE;
                } else if (index == C9786d.f44622E2) {
                    bVar2 = b.COLOR_DRAWABLE_TYPE;
                } else {
                    if (index == C9786d.f44652J2) {
                        bVar2 = b.DIMENSION_TYPE;
                        f10 = TypedValue.applyDimension(1, obtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics());
                    } else if (index == C9786d.f44634G2) {
                        bVar2 = b.DIMENSION_TYPE;
                        f10 = obtainStyledAttributes.getDimension(index, 0.0f);
                    } else if (index == C9786d.f44640H2) {
                        bVar2 = b.FLOAT_TYPE;
                        f10 = obtainStyledAttributes.getFloat(index, Float.NaN);
                    } else if (index == C9786d.f44646I2) {
                        bVar2 = b.INT_TYPE;
                        integer = obtainStyledAttributes.getInteger(index, -1);
                        string = Integer.valueOf(integer);
                        bVar = bVar2;
                        obj = string;
                        str = str2;
                    } else {
                        str = str2;
                        obj = obj2;
                        bVar = bVar3;
                        if (index == C9786d.f44658K2) {
                            bVar2 = b.STRING_TYPE;
                            string = obtainStyledAttributes.getString(index);
                            bVar = bVar2;
                            obj = string;
                            str = str2;
                        }
                    }
                    string = Float.valueOf(f10);
                    bVar = bVar2;
                    obj = string;
                    str = str2;
                }
                integer = obtainStyledAttributes.getColor(index, 0);
                string = Integer.valueOf(integer);
                bVar = bVar2;
                obj = string;
                str = str2;
            }
            i10++;
            str2 = str;
            obj2 = obj;
            bVar3 = bVar;
        }
        if (str2 != null && obj2 != null) {
            hashMap.put(str2, new C0374a(str2, bVar3, obj2));
        }
        obtainStyledAttributes.recycle();
    }

    /* renamed from: c */
    public static void m1719c(View view, HashMap<String, C0374a> hashMap) {
        StringBuilder sb2;
        Class<?> cls = view.getClass();
        for (String str : hashMap.keySet()) {
            C0374a c0374a = hashMap.get(str);
            String str2 = "set" + str;
            try {
                switch (a.f2472a[c0374a.f2466b.ordinal()]) {
                    case 1:
                        cls.getMethod(str2, Integer.TYPE).invoke(view, Integer.valueOf(c0374a.f2471g));
                        break;
                    case 2:
                        Method method = cls.getMethod(str2, Drawable.class);
                        ColorDrawable colorDrawable = new ColorDrawable();
                        colorDrawable.setColor(c0374a.f2471g);
                        method.invoke(view, colorDrawable);
                        break;
                    case 3:
                        cls.getMethod(str2, Integer.TYPE).invoke(view, Integer.valueOf(c0374a.f2467c));
                        break;
                    case 4:
                        cls.getMethod(str2, Float.TYPE).invoke(view, Float.valueOf(c0374a.f2468d));
                        break;
                    case 5:
                        cls.getMethod(str2, CharSequence.class).invoke(view, c0374a.f2469e);
                        break;
                    case 6:
                        cls.getMethod(str2, Boolean.TYPE).invoke(view, Boolean.valueOf(c0374a.f2470f));
                        break;
                    case 7:
                        cls.getMethod(str2, Float.TYPE).invoke(view, Float.valueOf(c0374a.f2468d));
                        break;
                }
            } catch (IllegalAccessException e10) {
                e = e10;
                sb2 = new StringBuilder();
                StringBuilder sb3 = sb2;
                sb3.append(" Custom Attribute \"");
                sb3.append(str);
                sb3.append("\" not found on ");
                sb3.append(cls.getName());
                Log.e("TransitionLayout", sb3.toString());
                e.printStackTrace();
            } catch (NoSuchMethodException e11) {
                Log.e("TransitionLayout", e11.getMessage());
                Log.e("TransitionLayout", " Custom Attribute \"" + str + "\" not found on " + cls.getName());
                StringBuilder sb4 = new StringBuilder();
                sb4.append(cls.getName());
                sb4.append(" must have a method ");
                sb4.append(str2);
                Log.e("TransitionLayout", sb4.toString());
            } catch (InvocationTargetException e12) {
                e = e12;
                sb2 = new StringBuilder();
                StringBuilder sb32 = sb2;
                sb32.append(" Custom Attribute \"");
                sb32.append(str);
                sb32.append("\" not found on ");
                sb32.append(cls.getName());
                Log.e("TransitionLayout", sb32.toString());
                e.printStackTrace();
            }
        }
    }

    /* renamed from: d */
    public void m1720d(Object obj) {
        switch (a.f2472a[this.f2466b.ordinal()]) {
            case 1:
            case 2:
                this.f2471g = ((Integer) obj).intValue();
                break;
            case 3:
                this.f2467c = ((Integer) obj).intValue();
                break;
            case 4:
            case 7:
                this.f2468d = ((Float) obj).floatValue();
                break;
            case 5:
                this.f2469e = (String) obj;
                break;
            case 6:
                this.f2470f = ((Boolean) obj).booleanValue();
                break;
        }
    }
}
