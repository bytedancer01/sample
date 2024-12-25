package p285q9;

import android.R;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.renderscript.Allocation;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import p050d0.C4290b;
import p087f0.C4738a;
import p106g0.C4917c;
import p304r9.C8015b;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:q9/t.class
 */
/* renamed from: q9.t */
/* loaded from: combined.jar:classes2.jar:q9/t.class */
public final class C7869t {

    /* renamed from: a */
    public static final C8015b f37939a = new C8015b("WidgetUtil");

    @TargetApi(17)
    /* renamed from: a */
    public static Bitmap m34138a(Context context, Bitmap bitmap, float f10, float f11) {
        C8015b c8015b = f37939a;
        c8015b.m34873a("Begin blurring bitmap %s, original width = %d, original height = %d.", bitmap, Integer.valueOf(bitmap.getWidth()), Integer.valueOf(bitmap.getHeight()));
        int round = Math.round(bitmap.getWidth() * 0.25f);
        int round2 = Math.round(bitmap.getHeight() * 0.25f);
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, round, round2, false);
        Bitmap createBitmap = Bitmap.createBitmap(round, round2, createScaledBitmap.getConfig());
        RenderScript create = RenderScript.create(context);
        Allocation createFromBitmap = Allocation.createFromBitmap(create, createScaledBitmap);
        Allocation createTyped = Allocation.createTyped(create, createFromBitmap.getType());
        ScriptIntrinsicBlur create2 = ScriptIntrinsicBlur.create(create, createFromBitmap.getElement());
        create2.setInput(createFromBitmap);
        create2.setRadius(7.5f);
        create2.forEach(createTyped);
        createTyped.copyTo(createBitmap);
        create.destroy();
        c8015b.m34873a("End blurring bitmap %s, original width = %d, original height = %d.", createScaledBitmap, Integer.valueOf(round), Integer.valueOf(round2));
        return createBitmap;
    }

    /* renamed from: b */
    public static Drawable m34139b(Context context, int i10, int i11) {
        return m34141d(context, i10, i11, 0, R.color.white);
    }

    /* renamed from: c */
    public static Drawable m34140c(Context context, int i10, int i11) {
        return m34141d(context, i10, i11, R.attr.colorForeground, 0);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [int[], int[][]] */
    /* renamed from: d */
    public static Drawable m34141d(Context context, int i10, int i11, int i12, int i13) {
        int m21724c;
        ColorStateList colorStateList;
        Drawable m24854r = C4917c.m24854r(context.getResources().getDrawable(i11).mutate());
        C4917c.m24852p(m24854r, PorterDuff.Mode.SRC_IN);
        if (i10 != 0) {
            colorStateList = C4290b.m21725d(context, i10);
        } else {
            if (i12 != 0) {
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{i12});
                m21724c = obtainStyledAttributes.getColor(0, 0);
                obtainStyledAttributes.recycle();
            } else {
                m21724c = C4290b.m21724c(context, i13);
            }
            colorStateList = new ColorStateList(new int[]{new int[]{R.attr.state_enabled}, new int[]{-16842910}}, new int[]{m21724c, C4738a.m23974m(m21724c, 128)});
        }
        C4917c.m24851o(m24854r, colorStateList);
        return m24854r;
    }
}
