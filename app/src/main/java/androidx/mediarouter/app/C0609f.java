package androidx.mediarouter.app;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import p192l1.C5646b;
import p192l1.C5648d;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/mediarouter/app/f.class
 */
/* renamed from: androidx.mediarouter.app.f */
/* loaded from: combined.jar:classes1.jar:androidx/mediarouter/app/f.class */
public final class C0609f {
    /* renamed from: a */
    public static int m3338a(Context context) {
        return !context.getResources().getBoolean(C5646b.f31788a) ? -1 : -2;
    }

    /* renamed from: b */
    public static int m3339b(Context context) {
        float fraction;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        boolean z10 = displayMetrics.widthPixels < displayMetrics.heightPixels;
        TypedValue typedValue = new TypedValue();
        context.getResources().getValue(z10 ? C5648d.f31802g : C5648d.f31801f, typedValue, true);
        int i10 = typedValue.type;
        if (i10 == 5) {
            fraction = typedValue.getDimension(displayMetrics);
        } else {
            if (i10 != 6) {
                return -2;
            }
            int i11 = displayMetrics.widthPixels;
            fraction = typedValue.getFraction(i11, i11);
        }
        return (int) fraction;
    }

    /* renamed from: c */
    public static int m3340c(Context context) {
        if (context.getResources().getBoolean(C5646b.f31788a)) {
            return m3339b(context);
        }
        return -1;
    }

    /* renamed from: d */
    public static <E> HashMap<E, BitmapDrawable> m3341d(Context context, ListView listView, ArrayAdapter<E> arrayAdapter) {
        HashMap<E, BitmapDrawable> hashMap = new HashMap<>();
        int firstVisiblePosition = listView.getFirstVisiblePosition();
        for (int i10 = 0; i10 < listView.getChildCount(); i10++) {
            hashMap.put(arrayAdapter.getItem(firstVisiblePosition + i10), m3345h(context, listView.getChildAt(i10)));
        }
        return hashMap;
    }

    /* renamed from: e */
    public static <E> HashMap<E, Rect> m3342e(ListView listView, ArrayAdapter<E> arrayAdapter) {
        HashMap<E, Rect> hashMap = new HashMap<>();
        int firstVisiblePosition = listView.getFirstVisiblePosition();
        for (int i10 = 0; i10 < listView.getChildCount(); i10++) {
            E item = arrayAdapter.getItem(firstVisiblePosition + i10);
            View childAt = listView.getChildAt(i10);
            hashMap.put(item, new Rect(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom()));
        }
        return hashMap;
    }

    /* renamed from: f */
    public static <E> Set<E> m3343f(List<E> list, List<E> list2) {
        HashSet hashSet = new HashSet(list2);
        hashSet.removeAll(list);
        return hashSet;
    }

    /* renamed from: g */
    public static <E> Set<E> m3344g(List<E> list, List<E> list2) {
        HashSet hashSet = new HashSet(list);
        hashSet.removeAll(list2);
        return hashSet;
    }

    /* renamed from: h */
    public static BitmapDrawable m3345h(Context context, View view) {
        Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
        view.draw(new Canvas(createBitmap));
        return new BitmapDrawable(context.getResources(), createBitmap);
    }

    /* renamed from: i */
    public static <E> boolean m3346i(List<E> list, List<E> list2) {
        return new HashSet(list).equals(new HashSet(list2));
    }
}
