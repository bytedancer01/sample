package p314s0;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.icu.text.DecimalFormatSymbols;
import android.os.Build;
import android.text.Editable;
import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.protocol.HTTP;
import p207m0.C5888d;
import p221n0.C6616h;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:s0/u.class
 */
/* renamed from: s0.u */
/* loaded from: combined.jar:classes1.jar:s0/u.class */
public final class C8513u {

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:s0/u$a.class
     */
    /* renamed from: s0.u$a */
    /* loaded from: combined.jar:classes1.jar:s0/u$a.class */
    public static class a implements ActionMode.Callback {

        /* renamed from: a */
        public final ActionMode.Callback f39865a;

        /* renamed from: b */
        public final TextView f39866b;

        /* renamed from: c */
        public Class<?> f39867c;

        /* renamed from: d */
        public Method f39868d;

        /* renamed from: e */
        public boolean f39869e;

        /* renamed from: f */
        public boolean f39870f = false;

        public a(ActionMode.Callback callback, TextView textView) {
            this.f39865a = callback;
            this.f39866b = textView;
        }

        /* renamed from: a */
        public final Intent m36726a() {
            return new Intent().setAction("android.intent.action.PROCESS_TEXT").setType(HTTP.PLAIN_TEXT_TYPE);
        }

        /* renamed from: b */
        public final Intent m36727b(ResolveInfo resolveInfo, TextView textView) {
            Intent putExtra = m36726a().putExtra("android.intent.extra.PROCESS_TEXT_READONLY", !m36729d(textView));
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            return putExtra.setClassName(activityInfo.packageName, activityInfo.name);
        }

        /* renamed from: c */
        public final List<ResolveInfo> m36728c(Context context, PackageManager packageManager) {
            ArrayList arrayList = new ArrayList();
            if (!(context instanceof Activity)) {
                return arrayList;
            }
            for (ResolveInfo resolveInfo : packageManager.queryIntentActivities(m36726a(), 0)) {
                if (m36730e(resolveInfo, context)) {
                    arrayList.add(resolveInfo);
                }
            }
            return arrayList;
        }

        /* renamed from: d */
        public final boolean m36729d(TextView textView) {
            return (textView instanceof Editable) && textView.onCheckIsTextEditor() && textView.isEnabled();
        }

        /* renamed from: e */
        public final boolean m36730e(ResolveInfo resolveInfo, Context context) {
            int checkSelfPermission;
            if (context.getPackageName().equals(resolveInfo.activityInfo.packageName)) {
                return true;
            }
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            if (!activityInfo.exported) {
                return false;
            }
            String str = activityInfo.permission;
            boolean z10 = true;
            if (str != null) {
                checkSelfPermission = context.checkSelfPermission(str);
                z10 = checkSelfPermission == 0;
            }
            return z10;
        }

        /* renamed from: f */
        public final void m36731f(Menu menu) {
            Context context = this.f39866b.getContext();
            PackageManager packageManager = context.getPackageManager();
            if (!this.f39870f) {
                this.f39870f = true;
                try {
                    Class<?> cls = Class.forName("com.android.internal.view.menu.MenuBuilder");
                    this.f39867c = cls;
                    this.f39868d = cls.getDeclaredMethod("removeItemAt", Integer.TYPE);
                    this.f39869e = true;
                } catch (ClassNotFoundException | NoSuchMethodException e10) {
                    this.f39867c = null;
                    this.f39868d = null;
                    this.f39869e = false;
                }
            }
            try {
                Method declaredMethod = (this.f39869e && this.f39867c.isInstance(menu)) ? this.f39868d : menu.getClass().getDeclaredMethod("removeItemAt", Integer.TYPE);
                for (int size = menu.size() - 1; size >= 0; size--) {
                    MenuItem item = menu.getItem(size);
                    if (item.getIntent() != null && "android.intent.action.PROCESS_TEXT".equals(item.getIntent().getAction())) {
                        declaredMethod.invoke(menu, Integer.valueOf(size));
                    }
                }
                List<ResolveInfo> m36728c = m36728c(context, packageManager);
                for (int i10 = 0; i10 < m36728c.size(); i10++) {
                    ResolveInfo resolveInfo = m36728c.get(i10);
                    menu.add(0, 0, i10 + 100, resolveInfo.loadLabel(packageManager)).setIntent(m36727b(resolveInfo, this.f39866b)).setShowAsAction(1);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e11) {
            }
        }

        @Override // android.view.ActionMode.Callback
        public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            return this.f39865a.onActionItemClicked(actionMode, menuItem);
        }

        @Override // android.view.ActionMode.Callback
        public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            return this.f39865a.onCreateActionMode(actionMode, menu);
        }

        @Override // android.view.ActionMode.Callback
        public void onDestroyActionMode(ActionMode actionMode) {
            this.f39865a.onDestroyActionMode(actionMode);
        }

        @Override // android.view.ActionMode.Callback
        public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            m36731f(menu);
            return this.f39865a.onPrepareActionMode(actionMode, menu);
        }
    }

    /* renamed from: a */
    public static Drawable[] m36709a(TextView textView) {
        return textView.getCompoundDrawablesRelative();
    }

    /* renamed from: b */
    public static int m36710b(TextView textView) {
        return textView.getPaddingTop() - textView.getPaint().getFontMetricsInt().top;
    }

    /* renamed from: c */
    public static int m36711c(TextView textView) {
        return textView.getPaddingBottom() + textView.getPaint().getFontMetricsInt().bottom;
    }

    /* renamed from: d */
    public static int m36712d(TextView textView) {
        return textView.getMaxLines();
    }

    /* renamed from: e */
    public static int m36713e(TextDirectionHeuristic textDirectionHeuristic) {
        if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_RTL || textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR) {
            return 1;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.ANYRTL_LTR) {
            return 2;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.LTR) {
            return 3;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.RTL) {
            return 4;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.LOCALE) {
            return 5;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR) {
            return 6;
        }
        return textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_RTL ? 7 : 1;
    }

    /* renamed from: f */
    public static TextDirectionHeuristic m36714f(TextView textView) {
        String[] digitStrings;
        if (textView.getTransformationMethod() instanceof PasswordTransformationMethod) {
            return TextDirectionHeuristics.LTR;
        }
        boolean z10 = false;
        if (Build.VERSION.SDK_INT >= 28 && (textView.getInputType() & 15) == 3) {
            digitStrings = DecimalFormatSymbols.getInstance(textView.getTextLocale()).getDigitStrings();
            byte directionality = Character.getDirectionality(digitStrings[0].codePointAt(0));
            return (directionality == 1 || directionality == 2) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
        }
        if (textView.getLayoutDirection() == 1) {
            z10 = true;
        }
        switch (textView.getTextDirection()) {
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            default:
                break;
        }
        return TextDirectionHeuristics.LTR;
    }

    /* renamed from: g */
    public static C5888d.a m36715g(TextView textView) {
        int breakStrategy;
        int hyphenationFrequency;
        PrecomputedText.Params textMetricsParams;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            textMetricsParams = textView.getTextMetricsParams();
            return new C5888d.a(textMetricsParams);
        }
        C5888d.a.C10315a c10315a = new C5888d.a.C10315a(new TextPaint(textView.getPaint()));
        if (i10 >= 23) {
            breakStrategy = textView.getBreakStrategy();
            c10315a.m28726b(breakStrategy);
            hyphenationFrequency = textView.getHyphenationFrequency();
            c10315a.m28727c(hyphenationFrequency);
        }
        c10315a.m28728d(m36714f(textView));
        return c10315a.m28725a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: h */
    public static void m36716h(TextView textView, ColorStateList colorStateList) {
        C6616h.m30527e(textView);
        if (Build.VERSION.SDK_INT >= 24) {
            textView.setCompoundDrawableTintList(colorStateList);
        } else if (textView instanceof InterfaceC8515w) {
            ((InterfaceC8515w) textView).setSupportCompoundDrawablesTintList(colorStateList);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: i */
    public static void m36717i(TextView textView, PorterDuff.Mode mode) {
        C6616h.m30527e(textView);
        if (Build.VERSION.SDK_INT >= 24) {
            textView.setCompoundDrawableTintMode(mode);
        } else if (textView instanceof InterfaceC8515w) {
            ((InterfaceC8515w) textView).setSupportCompoundDrawablesTintMode(mode);
        }
    }

    /* renamed from: j */
    public static void m36718j(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        textView.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }

    /* renamed from: k */
    public static void m36719k(TextView textView, int i10) {
        C6616h.m30525c(i10);
        if (Build.VERSION.SDK_INT >= 28) {
            textView.setFirstBaselineToTopHeight(i10);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i11 = textView.getIncludeFontPadding() ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (i10 > Math.abs(i11)) {
            textView.setPadding(textView.getPaddingLeft(), i10 + i11, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    /* renamed from: l */
    public static void m36720l(TextView textView, int i10) {
        C6616h.m30525c(i10);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i11 = textView.getIncludeFontPadding() ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i10 > Math.abs(i11)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i10 - i11);
        }
    }

    /* renamed from: m */
    public static void m36721m(TextView textView, int i10) {
        C6616h.m30525c(i10);
        if (i10 != textView.getPaint().getFontMetricsInt(null)) {
            textView.setLineSpacing(i10 - r0, 1.0f);
        }
    }

    /* renamed from: n */
    public static void m36722n(TextView textView, C5888d c5888d) {
        if (Build.VERSION.SDK_INT >= 29) {
            c5888d = c5888d.m28719b();
        } else if (!m36715g(textView).m28720a(c5888d.m28718a())) {
            throw new IllegalArgumentException("Given text can not be applied to TextView.");
        }
        textView.setText(c5888d);
    }

    /* renamed from: o */
    public static void m36723o(TextView textView, int i10) {
        if (Build.VERSION.SDK_INT >= 23) {
            textView.setTextAppearance(i10);
        } else {
            textView.setTextAppearance(textView.getContext(), i10);
        }
    }

    /* renamed from: p */
    public static void m36724p(TextView textView, C5888d.a aVar) {
        int i10 = Build.VERSION.SDK_INT;
        textView.setTextDirection(m36713e(aVar.m28723d()));
        if (i10 >= 23) {
            textView.getPaint().set(aVar.m28724e());
            textView.setBreakStrategy(aVar.m28721b());
            textView.setHyphenationFrequency(aVar.m28722c());
        } else {
            float textScaleX = aVar.m28724e().getTextScaleX();
            textView.getPaint().set(aVar.m28724e());
            if (textScaleX == textView.getTextScaleX()) {
                textView.setTextScaleX((textScaleX / 2.0f) + 1.0f);
            }
            textView.setTextScaleX(textScaleX);
        }
    }

    /* renamed from: q */
    public static ActionMode.Callback m36725q(TextView textView, ActionMode.Callback callback) {
        int i10 = Build.VERSION.SDK_INT;
        return (i10 < 26 || i10 > 27 || (callback instanceof a) || callback == null) ? callback : new a(callback, textView);
    }
}
