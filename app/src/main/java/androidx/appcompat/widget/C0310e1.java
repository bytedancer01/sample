package androidx.appcompat.widget;

import android.content.res.AssetFileDescriptor;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Movie;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import java.io.InputStream;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/appcompat/widget/e1.class
 */
/* renamed from: androidx.appcompat.widget.e1 */
/* loaded from: combined.jar:classes1.jar:androidx/appcompat/widget/e1.class */
public class C0310e1 extends Resources {

    /* renamed from: a */
    public final Resources f2053a;

    public C0310e1(Resources resources) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        this.f2053a = resources;
    }

    @Override // android.content.res.Resources
    public XmlResourceParser getAnimation(int i10) {
        return this.f2053a.getAnimation(i10);
    }

    @Override // android.content.res.Resources
    public boolean getBoolean(int i10) {
        return this.f2053a.getBoolean(i10);
    }

    @Override // android.content.res.Resources
    public int getColor(int i10) {
        return this.f2053a.getColor(i10);
    }

    @Override // android.content.res.Resources
    public ColorStateList getColorStateList(int i10) {
        return this.f2053a.getColorStateList(i10);
    }

    @Override // android.content.res.Resources
    public Configuration getConfiguration() {
        return this.f2053a.getConfiguration();
    }

    @Override // android.content.res.Resources
    public float getDimension(int i10) {
        return this.f2053a.getDimension(i10);
    }

    @Override // android.content.res.Resources
    public int getDimensionPixelOffset(int i10) {
        return this.f2053a.getDimensionPixelOffset(i10);
    }

    @Override // android.content.res.Resources
    public int getDimensionPixelSize(int i10) {
        return this.f2053a.getDimensionPixelSize(i10);
    }

    @Override // android.content.res.Resources
    public DisplayMetrics getDisplayMetrics() {
        return this.f2053a.getDisplayMetrics();
    }

    @Override // android.content.res.Resources
    public Drawable getDrawable(int i10) {
        return this.f2053a.getDrawable(i10);
    }

    @Override // android.content.res.Resources
    public Drawable getDrawable(int i10, Resources.Theme theme) {
        return this.f2053a.getDrawable(i10, theme);
    }

    @Override // android.content.res.Resources
    public Drawable getDrawableForDensity(int i10, int i11) {
        return this.f2053a.getDrawableForDensity(i10, i11);
    }

    @Override // android.content.res.Resources
    public Drawable getDrawableForDensity(int i10, int i11, Resources.Theme theme) {
        return this.f2053a.getDrawableForDensity(i10, i11, theme);
    }

    @Override // android.content.res.Resources
    public float getFraction(int i10, int i11, int i12) {
        return this.f2053a.getFraction(i10, i11, i12);
    }

    @Override // android.content.res.Resources
    public int getIdentifier(String str, String str2, String str3) {
        return this.f2053a.getIdentifier(str, str2, str3);
    }

    @Override // android.content.res.Resources
    public int[] getIntArray(int i10) {
        return this.f2053a.getIntArray(i10);
    }

    @Override // android.content.res.Resources
    public int getInteger(int i10) {
        return this.f2053a.getInteger(i10);
    }

    @Override // android.content.res.Resources
    public XmlResourceParser getLayout(int i10) {
        return this.f2053a.getLayout(i10);
    }

    @Override // android.content.res.Resources
    public Movie getMovie(int i10) {
        return this.f2053a.getMovie(i10);
    }

    @Override // android.content.res.Resources
    public String getQuantityString(int i10, int i11) {
        return this.f2053a.getQuantityString(i10, i11);
    }

    @Override // android.content.res.Resources
    public String getQuantityString(int i10, int i11, Object... objArr) {
        return this.f2053a.getQuantityString(i10, i11, objArr);
    }

    @Override // android.content.res.Resources
    public CharSequence getQuantityText(int i10, int i11) {
        return this.f2053a.getQuantityText(i10, i11);
    }

    @Override // android.content.res.Resources
    public String getResourceEntryName(int i10) {
        return this.f2053a.getResourceEntryName(i10);
    }

    @Override // android.content.res.Resources
    public String getResourceName(int i10) {
        return this.f2053a.getResourceName(i10);
    }

    @Override // android.content.res.Resources
    public String getResourcePackageName(int i10) {
        return this.f2053a.getResourcePackageName(i10);
    }

    @Override // android.content.res.Resources
    public String getResourceTypeName(int i10) {
        return this.f2053a.getResourceTypeName(i10);
    }

    @Override // android.content.res.Resources
    public String getString(int i10) {
        return this.f2053a.getString(i10);
    }

    @Override // android.content.res.Resources
    public String getString(int i10, Object... objArr) {
        return this.f2053a.getString(i10, objArr);
    }

    @Override // android.content.res.Resources
    public String[] getStringArray(int i10) {
        return this.f2053a.getStringArray(i10);
    }

    @Override // android.content.res.Resources
    public CharSequence getText(int i10) {
        return this.f2053a.getText(i10);
    }

    @Override // android.content.res.Resources
    public CharSequence getText(int i10, CharSequence charSequence) {
        return this.f2053a.getText(i10, charSequence);
    }

    @Override // android.content.res.Resources
    public CharSequence[] getTextArray(int i10) {
        return this.f2053a.getTextArray(i10);
    }

    @Override // android.content.res.Resources
    public void getValue(int i10, TypedValue typedValue, boolean z10) {
        this.f2053a.getValue(i10, typedValue, z10);
    }

    @Override // android.content.res.Resources
    public void getValue(String str, TypedValue typedValue, boolean z10) {
        this.f2053a.getValue(str, typedValue, z10);
    }

    @Override // android.content.res.Resources
    public void getValueForDensity(int i10, int i11, TypedValue typedValue, boolean z10) {
        this.f2053a.getValueForDensity(i10, i11, typedValue, z10);
    }

    @Override // android.content.res.Resources
    public XmlResourceParser getXml(int i10) {
        return this.f2053a.getXml(i10);
    }

    @Override // android.content.res.Resources
    public TypedArray obtainAttributes(AttributeSet attributeSet, int[] iArr) {
        return this.f2053a.obtainAttributes(attributeSet, iArr);
    }

    @Override // android.content.res.Resources
    public TypedArray obtainTypedArray(int i10) {
        return this.f2053a.obtainTypedArray(i10);
    }

    @Override // android.content.res.Resources
    public InputStream openRawResource(int i10) {
        return this.f2053a.openRawResource(i10);
    }

    @Override // android.content.res.Resources
    public InputStream openRawResource(int i10, TypedValue typedValue) {
        return this.f2053a.openRawResource(i10, typedValue);
    }

    @Override // android.content.res.Resources
    public AssetFileDescriptor openRawResourceFd(int i10) {
        return this.f2053a.openRawResourceFd(i10);
    }

    @Override // android.content.res.Resources
    public void parseBundleExtra(String str, AttributeSet attributeSet, Bundle bundle) {
        this.f2053a.parseBundleExtra(str, attributeSet, bundle);
    }

    @Override // android.content.res.Resources
    public void parseBundleExtras(XmlResourceParser xmlResourceParser, Bundle bundle) {
        this.f2053a.parseBundleExtras(xmlResourceParser, bundle);
    }

    @Override // android.content.res.Resources
    public void updateConfiguration(Configuration configuration, DisplayMetrics displayMetrics) {
        super.updateConfiguration(configuration, displayMetrics);
        Resources resources = this.f2053a;
        if (resources != null) {
            resources.updateConfiguration(configuration, displayMetrics);
        }
    }
}
