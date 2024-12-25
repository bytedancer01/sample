package p261p0;

import android.view.View;
import android.view.accessibility.AccessibilityRecord;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:p0/m.class
 */
/* renamed from: p0.m */
/* loaded from: combined.jar:classes1.jar:p0/m.class */
public class C7537m {
    /* renamed from: a */
    public static void m32261a(AccessibilityRecord accessibilityRecord, int i10) {
        accessibilityRecord.setMaxScrollX(i10);
    }

    /* renamed from: b */
    public static void m32262b(AccessibilityRecord accessibilityRecord, int i10) {
        accessibilityRecord.setMaxScrollY(i10);
    }

    /* renamed from: c */
    public static void m32263c(AccessibilityRecord accessibilityRecord, View view, int i10) {
        accessibilityRecord.setSource(view, i10);
    }
}
