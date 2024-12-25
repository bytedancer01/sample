package p049d;

import android.R;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.C0305d;
import androidx.appcompat.widget.C0311f;
import androidx.appcompat.widget.C0314g;
import androidx.appcompat.widget.C0323j;
import androidx.appcompat.widget.C0327k0;
import androidx.appcompat.widget.C0329l;
import androidx.appcompat.widget.C0335n;
import androidx.appcompat.widget.C0344q;
import androidx.appcompat.widget.C0353t;
import androidx.appcompat.widget.C0359v;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.simpleframework.xml.strategy.Name;
import p235o0.C6824g0;
import p294r.C7936i;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:d/h.class
 */
/* renamed from: d.h */
/* loaded from: combined.jar:classes1.jar:d/h.class */
public class C4282h {

    /* renamed from: b */
    public static final Class<?>[] f26329b = {Context.class, AttributeSet.class};

    /* renamed from: c */
    public static final int[] f26330c = {R.attr.onClick};

    /* renamed from: d */
    public static final String[] f26331d = {"android.widget.", "android.view.", "android.webkit."};

    /* renamed from: e */
    public static final C7936i<String, Constructor<? extends View>> f26332e = new C7936i<>();

    /* renamed from: a */
    public final Object[] f26333a = new Object[2];

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:d/h$a.class
     */
    /* renamed from: d.h$a */
    /* loaded from: combined.jar:classes1.jar:d/h$a.class */
    public static class a implements View.OnClickListener {

        /* renamed from: b */
        public final View f26334b;

        /* renamed from: c */
        public final String f26335c;

        /* renamed from: d */
        public Method f26336d;

        /* renamed from: e */
        public Context f26337e;

        public a(View view, String str) {
            this.f26334b = view;
            this.f26335c = str;
        }

        /* renamed from: a */
        public final void m21666a(Context context) {
            String str;
            Method method;
            while (context != null) {
                try {
                    if (!context.isRestricted() && (method = context.getClass().getMethod(this.f26335c, View.class)) != null) {
                        this.f26336d = method;
                        this.f26337e = context;
                        return;
                    }
                } catch (NoSuchMethodException e10) {
                }
                context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
            }
            int id2 = this.f26334b.getId();
            if (id2 == -1) {
                str = "";
            } else {
                str = " with id '" + this.f26334b.getContext().getResources().getResourceEntryName(id2) + "'";
            }
            throw new IllegalStateException("Could not find method " + this.f26335c + "(View) in a parent or ancestor Context for android:onClick attribute defined on view " + this.f26334b.getClass() + str);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (this.f26336d == null) {
                m21666a(this.f26334b.getContext());
            }
            try {
                this.f26336d.invoke(this.f26337e, view);
            } catch (IllegalAccessException e10) {
                throw new IllegalStateException("Could not execute non-public method for android:onClick", e10);
            } catch (InvocationTargetException e11) {
                throw new IllegalStateException("Could not execute method for android:onClick", e11);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x006c, code lost:
    
        if (((p137i.C5136d) r6).m25747c() != r11) goto L19;
     */
    /* renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.content.Context m21650t(android.content.Context r6, android.util.AttributeSet r7, boolean r8, boolean r9) {
        /*
            r0 = r6
            r1 = r7
            int[] r2 = p029c.C0929j.f6396W3
            r3 = 0
            r4 = 0
            android.content.res.TypedArray r0 = r0.obtainStyledAttributes(r1, r2, r3, r4)
            r7 = r0
            r0 = r8
            if (r0 == 0) goto L1c
            r0 = r7
            int r1 = p029c.C0929j.f6401X3
            r2 = 0
            int r0 = r0.getResourceId(r1, r2)
            r10 = r0
            goto L1f
        L1c:
            r0 = 0
            r10 = r0
        L1f:
            r0 = r10
            r11 = r0
            r0 = r9
            if (r0 == 0) goto L4f
            r0 = r10
            r11 = r0
            r0 = r10
            if (r0 != 0) goto L4f
            r0 = r7
            int r1 = p029c.C0929j.f6406Y3
            r2 = 0
            int r0 = r0.getResourceId(r1, r2)
            r10 = r0
            r0 = r10
            r11 = r0
            r0 = r10
            if (r0 == 0) goto L4f
            java.lang.String r0 = "AppCompatViewInflater"
            java.lang.String r1 = "app:theme is now deprecated. Please move to using android:theme instead."
            int r0 = android.util.Log.i(r0, r1)
            r0 = r10
            r11 = r0
        L4f:
            r0 = r7
            r0.recycle()
            r0 = r6
            r7 = r0
            r0 = r11
            if (r0 == 0) goto L7a
            r0 = r6
            boolean r0 = r0 instanceof p137i.C5136d
            if (r0 == 0) goto L6f
            r0 = r6
            r7 = r0
            r0 = r6
            i.d r0 = (p137i.C5136d) r0
            int r0 = r0.m25747c()
            r1 = r11
            if (r0 == r1) goto L7a
        L6f:
            i.d r0 = new i.d
            r1 = r0
            r2 = r6
            r3 = r11
            r1.<init>(r2, r3)
            r7 = r0
        L7a:
            r0 = r7
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p049d.C4282h.m21650t(android.content.Context, android.util.AttributeSet, boolean, boolean):android.content.Context");
    }

    /* renamed from: a */
    public final void m21651a(View view, AttributeSet attributeSet) {
        Context context = view.getContext();
        if ((context instanceof ContextWrapper) && C6824g0.m31497P(view)) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f26330c);
            String string = obtainStyledAttributes.getString(0);
            if (string != null) {
                view.setOnClickListener(new a(view, string));
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: b */
    public C0305d mo14150b(Context context, AttributeSet attributeSet) {
        return new C0305d(context, attributeSet);
    }

    /* renamed from: c */
    public C0311f mo14151c(Context context, AttributeSet attributeSet) {
        return new C0311f(context, attributeSet);
    }

    /* renamed from: d */
    public AppCompatCheckBox mo14152d(Context context, AttributeSet attributeSet) {
        return new AppCompatCheckBox(context, attributeSet);
    }

    /* renamed from: e */
    public C0314g m21652e(Context context, AttributeSet attributeSet) {
        return new C0314g(context, attributeSet);
    }

    /* renamed from: f */
    public C0323j m21653f(Context context, AttributeSet attributeSet) {
        return new C0323j(context, attributeSet);
    }

    /* renamed from: g */
    public C0329l m21654g(Context context, AttributeSet attributeSet) {
        return new C0329l(context, attributeSet);
    }

    /* renamed from: h */
    public AppCompatImageView m21655h(Context context, AttributeSet attributeSet) {
        return new AppCompatImageView(context, attributeSet);
    }

    /* renamed from: i */
    public C0335n m21656i(Context context, AttributeSet attributeSet) {
        return new C0335n(context, attributeSet);
    }

    /* renamed from: j */
    public AppCompatRadioButton mo14153j(Context context, AttributeSet attributeSet) {
        return new AppCompatRadioButton(context, attributeSet);
    }

    /* renamed from: k */
    public C0344q m21657k(Context context, AttributeSet attributeSet) {
        return new C0344q(context, attributeSet);
    }

    /* renamed from: l */
    public C0353t m21658l(Context context, AttributeSet attributeSet) {
        return new C0353t(context, attributeSet);
    }

    /* renamed from: m */
    public C0359v m21659m(Context context, AttributeSet attributeSet) {
        return new C0359v(context, attributeSet);
    }

    /* renamed from: n */
    public AppCompatTextView mo14154n(Context context, AttributeSet attributeSet) {
        return new AppCompatTextView(context, attributeSet);
    }

    /* renamed from: o */
    public C0327k0 m21660o(Context context, AttributeSet attributeSet) {
        return new C0327k0(context, attributeSet);
    }

    /* renamed from: p */
    public View m21661p(Context context, String str, AttributeSet attributeSet) {
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
    
        if (r12 != false) goto L12;
     */
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View m21662q(android.view.View r6, java.lang.String r7, android.content.Context r8, android.util.AttributeSet r9, boolean r10, boolean r11, boolean r12, boolean r13) {
        /*
            Method dump skipped, instructions count: 758
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p049d.C4282h.m21662q(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet, boolean, boolean, boolean, boolean):android.view.View");
    }

    /* renamed from: r */
    public final View m21663r(Context context, String str, String str2) {
        String str3;
        C7936i<String, Constructor<? extends View>> c7936i = f26332e;
        Constructor<? extends View> constructor = c7936i.get(str);
        Constructor<? extends View> constructor2 = constructor;
        if (constructor == null) {
            if (str2 != null) {
                try {
                    str3 = str2 + str;
                } catch (Exception e10) {
                    return null;
                }
            } else {
                str3 = str;
            }
            constructor2 = Class.forName(str3, false, context.getClassLoader()).asSubclass(View.class).getConstructor(f26329b);
            c7936i.put(str, constructor2);
        }
        constructor2.setAccessible(true);
        return constructor2.newInstance(this.f26333a);
    }

    /* renamed from: s */
    public final View m21664s(Context context, String str, AttributeSet attributeSet) {
        String str2 = str;
        if (str.equals("view")) {
            str2 = attributeSet.getAttributeValue(null, Name.LABEL);
        }
        try {
            Object[] objArr = this.f26333a;
            objArr[0] = context;
            objArr[1] = attributeSet;
            if (-1 != str2.indexOf(46)) {
                View m21663r = m21663r(context, str2, null);
                Object[] objArr2 = this.f26333a;
                objArr2[0] = null;
                objArr2[1] = null;
                return m21663r;
            }
            int i10 = 0;
            while (true) {
                String[] strArr = f26331d;
                if (i10 >= strArr.length) {
                    Object[] objArr3 = this.f26333a;
                    objArr3[0] = null;
                    objArr3[1] = null;
                    return null;
                }
                View m21663r2 = m21663r(context, str2, strArr[i10]);
                if (m21663r2 != null) {
                    Object[] objArr4 = this.f26333a;
                    objArr4[0] = null;
                    objArr4[1] = null;
                    return m21663r2;
                }
                i10++;
            }
        } catch (Exception e10) {
            Object[] objArr5 = this.f26333a;
            objArr5[0] = null;
            objArr5[1] = null;
            return null;
        } catch (Throwable th2) {
            Object[] objArr6 = this.f26333a;
            objArr6[0] = null;
            objArr6[1] = null;
            throw th2;
        }
    }

    /* renamed from: u */
    public final void m21665u(View view, String str) {
        if (view != null) {
            return;
        }
        throw new IllegalStateException(getClass().getName() + " asked to inflate view for <" + str + ">, but returned null");
    }
}
