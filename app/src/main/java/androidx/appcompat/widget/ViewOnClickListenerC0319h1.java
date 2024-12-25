package androidx.appcompat.widget;

import android.R;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.WeakHashMap;
import p029c.C0920a;
import p029c.C0925f;
import p050d0.C4290b;
import p326t0.AbstractC8592c;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/appcompat/widget/h1.class
 */
/* renamed from: androidx.appcompat.widget.h1 */
/* loaded from: combined.jar:classes1.jar:androidx/appcompat/widget/h1.class */
public class ViewOnClickListenerC0319h1 extends AbstractC8592c implements View.OnClickListener {

    /* renamed from: m */
    public final SearchView f2106m;

    /* renamed from: n */
    public final SearchableInfo f2107n;

    /* renamed from: o */
    public final Context f2108o;

    /* renamed from: p */
    public final WeakHashMap<String, Drawable.ConstantState> f2109p;

    /* renamed from: q */
    public final int f2110q;

    /* renamed from: r */
    public boolean f2111r;

    /* renamed from: s */
    public int f2112s;

    /* renamed from: t */
    public ColorStateList f2113t;

    /* renamed from: u */
    public int f2114u;

    /* renamed from: v */
    public int f2115v;

    /* renamed from: w */
    public int f2116w;

    /* renamed from: x */
    public int f2117x;

    /* renamed from: y */
    public int f2118y;

    /* renamed from: z */
    public int f2119z;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/appcompat/widget/h1$a.class
     */
    /* renamed from: androidx.appcompat.widget.h1$a */
    /* loaded from: combined.jar:classes1.jar:androidx/appcompat/widget/h1$a.class */
    public static final class a {

        /* renamed from: a */
        public final TextView f2120a;

        /* renamed from: b */
        public final TextView f2121b;

        /* renamed from: c */
        public final ImageView f2122c;

        /* renamed from: d */
        public final ImageView f2123d;

        /* renamed from: e */
        public final ImageView f2124e;

        public a(View view) {
            this.f2120a = (TextView) view.findViewById(R.id.text1);
            this.f2121b = (TextView) view.findViewById(R.id.text2);
            this.f2122c = (ImageView) view.findViewById(R.id.icon1);
            this.f2123d = (ImageView) view.findViewById(R.id.icon2);
            this.f2124e = (ImageView) view.findViewById(C0925f.f6233q);
        }
    }

    public ViewOnClickListenerC0319h1(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap<String, Drawable.ConstantState> weakHashMap) {
        super(context, searchView.getSuggestionRowLayout(), null, true);
        this.f2111r = false;
        this.f2112s = 1;
        this.f2114u = -1;
        this.f2115v = -1;
        this.f2116w = -1;
        this.f2117x = -1;
        this.f2118y = -1;
        this.f2119z = -1;
        this.f2106m = searchView;
        this.f2107n = searchableInfo;
        this.f2110q = searchView.getSuggestionCommitIconResId();
        this.f2108o = context;
        this.f2109p = weakHashMap;
    }

    /* renamed from: n */
    public static String m1414n(Cursor cursor, String str) {
        return m1415v(cursor, cursor.getColumnIndex(str));
    }

    /* renamed from: v */
    public static String m1415v(Cursor cursor, int i10) {
        if (i10 == -1) {
            return null;
        }
        try {
            return cursor.getString(i10);
        } catch (Exception e10) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e10);
            return null;
        }
    }

    /* renamed from: A */
    public final void m1416A(Cursor cursor) {
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // p326t0.AbstractC8590a, p326t0.C8591b.a
    /* renamed from: a */
    public void mo1417a(Cursor cursor) {
        if (this.f2111r) {
            Log.w("SuggestionsAdapter", "Tried to change cursor after adapter was closed.");
            if (cursor != null) {
                cursor.close();
                return;
            }
            return;
        }
        try {
            super.mo1417a(cursor);
            if (cursor != null) {
                this.f2114u = cursor.getColumnIndex("suggest_text_1");
                this.f2115v = cursor.getColumnIndex("suggest_text_2");
                this.f2116w = cursor.getColumnIndex("suggest_text_2_url");
                this.f2117x = cursor.getColumnIndex("suggest_icon_1");
                this.f2118y = cursor.getColumnIndex("suggest_icon_2");
                this.f2119z = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e10) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e10);
        }
    }

    @Override // p326t0.C8591b.a
    /* renamed from: b */
    public Cursor mo1418b(CharSequence charSequence) {
        String charSequence2 = charSequence == null ? "" : charSequence.toString();
        if (this.f2106m.getVisibility() != 0 || this.f2106m.getWindowVisibility() != 0) {
            return null;
        }
        try {
            Cursor m1431u = m1431u(this.f2107n, charSequence2, 50);
            if (m1431u == null) {
                return null;
            }
            m1431u.getCount();
            return m1431u;
        } catch (RuntimeException e10) {
            Log.w("SuggestionsAdapter", "Search suggestions query threw an exception.", e10);
            return null;
        }
    }

    @Override // p326t0.AbstractC8590a, p326t0.C8591b.a
    public CharSequence convertToString(Cursor cursor) {
        String m1414n;
        String m1414n2;
        if (cursor == null) {
            return null;
        }
        String m1414n3 = m1414n(cursor, "suggest_intent_query");
        if (m1414n3 != null) {
            return m1414n3;
        }
        if (this.f2107n.shouldRewriteQueryFromData() && (m1414n2 = m1414n(cursor, "suggest_intent_data")) != null) {
            return m1414n2;
        }
        if (!this.f2107n.shouldRewriteQueryFromText() || (m1414n = m1414n(cursor, "suggest_text_1")) == null) {
            return null;
        }
        return m1414n;
    }

    @Override // p326t0.AbstractC8590a
    /* renamed from: d */
    public void mo1419d(View view, Context context, Cursor cursor) {
        a aVar = (a) view.getTag();
        int i10 = this.f2119z;
        int i11 = i10 != -1 ? cursor.getInt(i10) : 0;
        if (aVar.f2120a != null) {
            m1434y(aVar.f2120a, m1415v(cursor, this.f2114u));
        }
        if (aVar.f2121b != null) {
            String m1415v = m1415v(cursor, this.f2116w);
            CharSequence m1422k = m1415v != null ? m1422k(m1415v) : m1415v(cursor, this.f2115v);
            if (TextUtils.isEmpty(m1422k)) {
                TextView textView = aVar.f2120a;
                if (textView != null) {
                    textView.setSingleLine(false);
                    aVar.f2120a.setMaxLines(2);
                }
            } else {
                TextView textView2 = aVar.f2120a;
                if (textView2 != null) {
                    textView2.setSingleLine(true);
                    aVar.f2120a.setMaxLines(1);
                }
            }
            m1434y(aVar.f2121b, m1422k);
        }
        ImageView imageView = aVar.f2122c;
        if (imageView != null) {
            m1433x(imageView, m1429s(cursor), 4);
        }
        ImageView imageView2 = aVar.f2123d;
        if (imageView2 != null) {
            m1433x(imageView2, m1430t(cursor), 8);
        }
        int i12 = this.f2112s;
        if (i12 != 2 && (i12 != 1 || (i11 & 1) == 0)) {
            aVar.f2124e.setVisibility(8);
            return;
        }
        aVar.f2124e.setVisibility(0);
        aVar.f2124e.setTag(aVar.f2120a.getText());
        aVar.f2124e.setOnClickListener(this);
    }

    @Override // p326t0.AbstractC8592c, p326t0.AbstractC8590a
    /* renamed from: g */
    public View mo1420g(Context context, Cursor cursor, ViewGroup viewGroup) {
        View mo1420g = super.mo1420g(context, cursor, viewGroup);
        mo1420g.setTag(new a(mo1420g));
        ((ImageView) mo1420g.findViewById(C0925f.f6233q)).setImageResource(this.f2110q);
        return mo1420g;
    }

    @Override // p326t0.AbstractC8590a, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i10, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i10, view, viewGroup);
        } catch (RuntimeException e10) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e10);
            View mo36887f = mo36887f(this.f2108o, mo36885c(), viewGroup);
            if (mo36887f != null) {
                ((a) mo36887f.getTag()).f2120a.setText(e10.toString());
            }
            return mo36887f;
        }
    }

    @Override // p326t0.AbstractC8590a, android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i10, view, viewGroup);
        } catch (RuntimeException e10) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e10);
            View mo1420g = mo1420g(this.f2108o, mo36885c(), viewGroup);
            if (mo1420g != null) {
                ((a) mo1420g.getTag()).f2120a.setText(e10.toString());
            }
            return mo1420g;
        }
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return false;
    }

    /* renamed from: j */
    public final Drawable m1421j(String str) {
        Drawable.ConstantState constantState = this.f2109p.get(str);
        if (constantState == null) {
            return null;
        }
        return constantState.newDrawable();
    }

    /* renamed from: k */
    public final CharSequence m1422k(CharSequence charSequence) {
        if (this.f2113t == null) {
            TypedValue typedValue = new TypedValue();
            this.f2108o.getTheme().resolveAttribute(C0920a.f6103R, typedValue, true);
            this.f2113t = this.f2108o.getResources().getColorStateList(typedValue.resourceId);
        }
        SpannableString spannableString = new SpannableString(charSequence);
        spannableString.setSpan(new TextAppearanceSpan(null, 0, 0, this.f2113t, null), 0, charSequence.length(), 33);
        return spannableString;
    }

    /* renamed from: l */
    public final Drawable m1423l(ComponentName componentName) {
        String obj;
        ActivityInfo activityInfo;
        int iconResource;
        PackageManager packageManager = this.f2108o.getPackageManager();
        try {
            activityInfo = packageManager.getActivityInfo(componentName, 128);
            iconResource = activityInfo.getIconResource();
        } catch (PackageManager.NameNotFoundException e10) {
            obj = e10.toString();
        }
        if (iconResource == 0) {
            return null;
        }
        Drawable drawable = packageManager.getDrawable(componentName.getPackageName(), iconResource, activityInfo.applicationInfo);
        if (drawable != null) {
            return drawable;
        }
        obj = "Invalid icon resource " + iconResource + " for " + componentName.flattenToShortString();
        Log.w("SuggestionsAdapter", obj);
        return null;
    }

    /* renamed from: m */
    public final Drawable m1424m(ComponentName componentName) {
        String flattenToShortString = componentName.flattenToShortString();
        if (this.f2109p.containsKey(flattenToShortString)) {
            Drawable.ConstantState constantState = this.f2109p.get(flattenToShortString);
            return constantState == null ? null : constantState.newDrawable(this.f2108o.getResources());
        }
        Drawable m1423l = m1423l(componentName);
        this.f2109p.put(flattenToShortString, m1423l == null ? null : m1423l.getConstantState());
        return m1423l;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        m1416A(mo36885c());
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        m1416A(mo36885c());
    }

    /* renamed from: o */
    public final Drawable m1425o() {
        Drawable m1424m = m1424m(this.f2107n.getSearchActivity());
        return m1424m != null ? m1424m : this.f2108o.getPackageManager().getDefaultActivityIcon();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f2106m.m1140S((CharSequence) tag);
        }
    }

    /* renamed from: p */
    public final Drawable m1426p(Uri uri) {
        try {
            if ("android.resource".equals(uri.getScheme())) {
                try {
                    return m1427q(uri);
                } catch (Resources.NotFoundException e10) {
                    throw new FileNotFoundException("Resource does not exist: " + uri);
                }
            }
            InputStream openInputStream = this.f2108o.getContentResolver().openInputStream(uri);
            if (openInputStream == null) {
                throw new FileNotFoundException("Failed to open " + uri);
            }
            try {
                return Drawable.createFromStream(openInputStream, null);
            } finally {
                try {
                    openInputStream.close();
                } catch (IOException e11) {
                    Log.e("SuggestionsAdapter", "Error closing icon stream for " + uri, e11);
                }
            }
        } catch (FileNotFoundException e12) {
            Log.w("SuggestionsAdapter", "Icon not found: " + uri + ", " + e12.getMessage());
            return null;
        }
        Log.w("SuggestionsAdapter", "Icon not found: " + uri + ", " + e12.getMessage());
        return null;
    }

    /* renamed from: q */
    public Drawable m1427q(Uri uri) {
        int parseInt;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            throw new FileNotFoundException("No authority: " + uri);
        }
        try {
            Resources resourcesForApplication = this.f2108o.getPackageManager().getResourcesForApplication(authority);
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments == null) {
                throw new FileNotFoundException("No path: " + uri);
            }
            int size = pathSegments.size();
            if (size == 1) {
                try {
                    parseInt = Integer.parseInt(pathSegments.get(0));
                } catch (NumberFormatException e10) {
                    throw new FileNotFoundException("Single path segment is not a resource ID: " + uri);
                }
            } else {
                if (size != 2) {
                    throw new FileNotFoundException("More than two path segments: " + uri);
                }
                parseInt = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
            }
            if (parseInt != 0) {
                return resourcesForApplication.getDrawable(parseInt);
            }
            throw new FileNotFoundException("No resource found for: " + uri);
        } catch (PackageManager.NameNotFoundException e11) {
            throw new FileNotFoundException("No package found for authority: " + uri);
        }
    }

    /* renamed from: r */
    public final Drawable m1428r(String str) {
        Drawable drawable = null;
        if (str != null) {
            drawable = null;
            if (!str.isEmpty()) {
                if ("0".equals(str)) {
                    drawable = null;
                } else {
                    try {
                        int parseInt = Integer.parseInt(str);
                        String str2 = "android.resource://" + this.f2108o.getPackageName() + "/" + parseInt;
                        Drawable m1421j = m1421j(str2);
                        if (m1421j != null) {
                            return m1421j;
                        }
                        Drawable m21726e = C4290b.m21726e(this.f2108o, parseInt);
                        m1435z(str2, m21726e);
                        return m21726e;
                    } catch (Resources.NotFoundException e10) {
                        Log.w("SuggestionsAdapter", "Icon resource not found: " + str);
                        return null;
                    } catch (NumberFormatException e11) {
                        Drawable m1421j2 = m1421j(str);
                        if (m1421j2 != null) {
                            return m1421j2;
                        }
                        drawable = m1426p(Uri.parse(str));
                        m1435z(str, drawable);
                    }
                }
            }
        }
        return drawable;
    }

    /* renamed from: s */
    public final Drawable m1429s(Cursor cursor) {
        int i10 = this.f2117x;
        if (i10 == -1) {
            return null;
        }
        Drawable m1428r = m1428r(cursor.getString(i10));
        return m1428r != null ? m1428r : m1425o();
    }

    /* renamed from: t */
    public final Drawable m1430t(Cursor cursor) {
        int i10 = this.f2118y;
        if (i10 == -1) {
            return null;
        }
        return m1428r(cursor.getString(i10));
    }

    /* renamed from: u */
    public Cursor m1431u(SearchableInfo searchableInfo, String str, int i10) {
        String suggestAuthority;
        String[] strArr;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder fragment = new Uri.Builder().scheme("content").authority(suggestAuthority).query("").fragment("");
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            fragment.appendEncodedPath(suggestPath);
        }
        fragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            fragment.appendPath(str);
            strArr = null;
        }
        if (i10 > 0) {
            fragment.appendQueryParameter("limit", String.valueOf(i10));
        }
        return this.f2108o.getContentResolver().query(fragment.build(), null, suggestSelection, strArr, null);
    }

    /* renamed from: w */
    public void m1432w(int i10) {
        this.f2112s = i10;
    }

    /* renamed from: x */
    public final void m1433x(ImageView imageView, Drawable drawable, int i10) {
        imageView.setImageDrawable(drawable);
        if (drawable == null) {
            imageView.setVisibility(i10);
            return;
        }
        imageView.setVisibility(0);
        drawable.setVisible(false, false);
        drawable.setVisible(true, false);
    }

    /* renamed from: y */
    public final void m1434y(TextView textView, CharSequence charSequence) {
        textView.setText(charSequence);
        textView.setVisibility(TextUtils.isEmpty(charSequence) ? 8 : 0);
    }

    /* renamed from: z */
    public final void m1435z(String str, Drawable drawable) {
        if (drawable != null) {
            this.f2109p.put(str, drawable.getConstantState());
        }
    }
}
