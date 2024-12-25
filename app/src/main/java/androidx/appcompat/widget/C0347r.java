package androidx.appcompat.widget;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.os.Bundle;
import android.text.Selection;
import android.text.Spannable;
import android.util.Log;
import android.view.DragEvent;
import android.view.View;
import android.view.inputmethod.InputContentInfo;
import android.widget.TextView;
import p235o0.C6811c;
import p235o0.C6824g0;
import p295r0.C7940c;
import p295r0.C7941d;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/appcompat/widget/r.class
 */
/* renamed from: androidx.appcompat.widget.r */
/* loaded from: combined.jar:classes1.jar:androidx/appcompat/widget/r.class */
public final class C0347r {

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/appcompat/widget/r$a.class
     */
    /* renamed from: androidx.appcompat.widget.r$a */
    /* loaded from: combined.jar:classes1.jar:androidx/appcompat/widget/r$a.class */
    public class a implements C7940c.c {

        /* renamed from: a */
        public final View f2219a;

        public a(View view) {
            this.f2219a = view;
        }

        @Override // p295r0.C7940c.c
        /* renamed from: a */
        public boolean mo1568a(C7941d c7941d, int i10, Bundle bundle) {
            boolean z10 = false;
            Bundle bundle2 = bundle;
            if (Build.VERSION.SDK_INT >= 25) {
                bundle2 = bundle;
                if ((i10 & 1) != 0) {
                    try {
                        c7941d.m34472d();
                        InputContentInfo inputContentInfo = (InputContentInfo) c7941d.m34473e();
                        Bundle bundle3 = bundle == null ? new Bundle() : new Bundle(bundle);
                        bundle3.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", inputContentInfo);
                        bundle2 = bundle3;
                    } catch (Exception e10) {
                        Log.w("ReceiveContent", "Can't insert content from IME; requestPermission() failed", e10);
                        return false;
                    }
                }
            }
            if (C6824g0.m31519f0(this.f2219a, new C6811c.a(new ClipData(c7941d.m34470b(), new ClipData.Item(c7941d.m34469a())), 2).m31386d(c7941d.m34471c()).m31384b(bundle2).m31383a()) == null) {
                z10 = true;
            }
            return z10;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/appcompat/widget/r$b.class
     */
    /* renamed from: androidx.appcompat.widget.r$b */
    /* loaded from: combined.jar:classes1.jar:androidx/appcompat/widget/r$b.class */
    public static final class b {
        /* renamed from: a */
        public static boolean m1569a(DragEvent dragEvent, TextView textView, Activity activity) {
            activity.requestDragAndDropPermissions(dragEvent);
            int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
            textView.beginBatchEdit();
            try {
                Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
                C6824g0.m31519f0(textView, new C6811c.a(dragEvent.getClipData(), 3).m31383a());
                textView.endBatchEdit();
                return true;
            } catch (Throwable th2) {
                textView.endBatchEdit();
                throw th2;
            }
        }

        /* renamed from: b */
        public static boolean m1570b(DragEvent dragEvent, View view, Activity activity) {
            activity.requestDragAndDropPermissions(dragEvent);
            C6824g0.m31519f0(view, new C6811c.a(dragEvent.getClipData(), 3).m31383a());
            return true;
        }
    }

    /* renamed from: a */
    public static C7940c.c m1564a(View view) {
        return new a(view);
    }

    /* renamed from: b */
    public static boolean m1565b(View view, DragEvent dragEvent) {
        if (Build.VERSION.SDK_INT < 24 || dragEvent.getLocalState() != null || C6824g0.m31479F(view) == null) {
            return false;
        }
        Activity m1567d = m1567d(view);
        if (m1567d == null) {
            Log.i("ReceiveContent", "Can't handle drop: no activity: view=" + view);
            return false;
        }
        if (dragEvent.getAction() == 1) {
            return !(view instanceof TextView);
        }
        if (dragEvent.getAction() == 3) {
            return view instanceof TextView ? b.m1569a(dragEvent, (TextView) view, m1567d) : b.m1570b(dragEvent, view, m1567d);
        }
        return false;
    }

    /* renamed from: c */
    public static boolean m1566c(TextView textView, int i10) {
        if ((i10 != 16908322 && i10 != 16908337) || C6824g0.m31479F(textView) == null) {
            return false;
        }
        ClipboardManager clipboardManager = (ClipboardManager) textView.getContext().getSystemService("clipboard");
        ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
        if (primaryClip == null || primaryClip.getItemCount() <= 0) {
            return true;
        }
        C6824g0.m31519f0(textView, new C6811c.a(primaryClip, 1).m31385c(i10 == 16908322 ? 0 : 1).m31383a());
        return true;
    }

    /* renamed from: d */
    public static Activity m1567d(View view) {
        Context context = view.getContext();
        while (true) {
            Context context2 = context;
            if (!(context2 instanceof ContextWrapper)) {
                return null;
            }
            if (context2 instanceof Activity) {
                return (Activity) context2;
            }
            context = ((ContextWrapper) context2).getBaseContext();
        }
    }
}
