package p020b2;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import p069e0.C4570i;
import p106g0.C4917c;
import p294r.C7928a;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:b2/b.class
 */
/* renamed from: b2.b */
/* loaded from: combined.jar:classes1.jar:b2/b.class */
public class C0783b extends AbstractC0787f implements Animatable {

    /* renamed from: c */
    public b f5435c;

    /* renamed from: d */
    public Context f5436d;

    /* renamed from: e */
    public ArgbEvaluator f5437e;

    /* renamed from: f */
    public Animator.AnimatorListener f5438f;

    /* renamed from: g */
    public ArrayList<Object> f5439g;

    /* renamed from: h */
    public final Drawable.Callback f5440h;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:b2/b$a.class
     */
    /* renamed from: b2.b$a */
    /* loaded from: combined.jar:classes1.jar:b2/b$a.class */
    public class a implements Drawable.Callback {

        /* renamed from: b */
        public final C0783b f5441b;

        public a(C0783b c0783b) {
            this.f5441b = c0783b;
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(Drawable drawable) {
            this.f5441b.invalidateSelf();
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
            this.f5441b.scheduleSelf(runnable, j10);
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            this.f5441b.unscheduleSelf(runnable);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:b2/b$b.class
     */
    /* renamed from: b2.b$b */
    /* loaded from: combined.jar:classes1.jar:b2/b$b.class */
    public static class b extends Drawable.ConstantState {

        /* renamed from: a */
        public int f5442a;

        /* renamed from: b */
        public C0788g f5443b;

        /* renamed from: c */
        public AnimatorSet f5444c;

        /* renamed from: d */
        public ArrayList<Animator> f5445d;

        /* renamed from: e */
        public C7928a<Animator, String> f5446e;

        public b(Context context, b bVar, Drawable.Callback callback, Resources resources) {
            if (bVar != null) {
                this.f5442a = bVar.f5442a;
                C0788g c0788g = bVar.f5443b;
                if (c0788g != null) {
                    Drawable.ConstantState constantState = c0788g.getConstantState();
                    this.f5443b = (C0788g) (resources != null ? constantState.newDrawable(resources) : constantState.newDrawable());
                    C0788g c0788g2 = (C0788g) this.f5443b.mutate();
                    this.f5443b = c0788g2;
                    c0788g2.setCallback(callback);
                    this.f5443b.setBounds(bVar.f5443b.getBounds());
                    this.f5443b.m5053h(false);
                }
                ArrayList<Animator> arrayList = bVar.f5445d;
                if (arrayList != null) {
                    int size = arrayList.size();
                    this.f5445d = new ArrayList<>(size);
                    this.f5446e = new C7928a<>(size);
                    for (int i10 = 0; i10 < size; i10++) {
                        Animator animator = bVar.f5445d.get(i10);
                        Animator clone = animator.clone();
                        String str = bVar.f5446e.get(animator);
                        clone.setTarget(this.f5443b.m5050d(str));
                        this.f5445d.add(clone);
                        this.f5446e.put(clone, str);
                    }
                    m5023a();
                }
            }
        }

        /* renamed from: a */
        public void m5023a() {
            if (this.f5444c == null) {
                this.f5444c = new AnimatorSet();
            }
            this.f5444c.playTogether(this.f5445d);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f5442a;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:b2/b$c.class
     */
    /* renamed from: b2.b$c */
    /* loaded from: combined.jar:classes1.jar:b2/b$c.class */
    public static class c extends Drawable.ConstantState {

        /* renamed from: a */
        public final Drawable.ConstantState f5447a;

        public c(Drawable.ConstantState constantState) {
            this.f5447a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.f5447a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f5447a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            C0783b c0783b = new C0783b();
            Drawable newDrawable = this.f5447a.newDrawable();
            c0783b.f5450b = newDrawable;
            newDrawable.setCallback(c0783b.f5440h);
            return c0783b;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            C0783b c0783b = new C0783b();
            Drawable newDrawable = this.f5447a.newDrawable(resources);
            c0783b.f5450b = newDrawable;
            newDrawable.setCallback(c0783b.f5440h);
            return c0783b;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            C0783b c0783b = new C0783b();
            Drawable newDrawable = this.f5447a.newDrawable(resources, theme);
            c0783b.f5450b = newDrawable;
            newDrawable.setCallback(c0783b.f5440h);
            return c0783b;
        }
    }

    public C0783b() {
        this(null, null, null);
    }

    public C0783b(Context context) {
        this(context, null, null);
    }

    public C0783b(Context context, b bVar, Resources resources) {
        this.f5437e = null;
        this.f5438f = null;
        this.f5439g = null;
        a aVar = new a(this);
        this.f5440h = aVar;
        this.f5436d = context;
        if (bVar != null) {
            this.f5435c = bVar;
        } else {
            this.f5435c = new b(context, bVar, aVar, resources);
        }
    }

    /* renamed from: a */
    public static C0783b m5021a(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        C0783b c0783b = new C0783b(context);
        c0783b.inflate(resources, xmlPullParser, attributeSet, theme);
        return c0783b;
    }

    @Override // p020b2.AbstractC0787f, android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f5450b;
        if (drawable != null) {
            C4917c.m24837a(drawable, theme);
        }
    }

    /* renamed from: b */
    public final void m5022b(String str, Animator animator) {
        animator.setTarget(this.f5435c.f5443b.m5050d(str));
        b bVar = this.f5435c;
        if (bVar.f5445d == null) {
            bVar.f5445d = new ArrayList<>();
            this.f5435c.f5446e = new C7928a<>();
        }
        this.f5435c.f5445d.add(animator);
        this.f5435c.f5446e.put(animator, str);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable = this.f5450b;
        if (drawable != null) {
            return C4917c.m24838b(drawable);
        }
        return false;
    }

    @Override // p020b2.AbstractC0787f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f5450b;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        this.f5435c.f5443b.draw(canvas);
        if (this.f5435c.f5444c.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = this.f5450b;
        return drawable != null ? C4917c.m24840d(drawable) : this.f5435c.f5443b.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.f5450b;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f5435c.f5442a;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        Drawable drawable = this.f5450b;
        return drawable != null ? C4917c.m24841e(drawable) : this.f5435c.f5443b.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.f5450b == null || Build.VERSION.SDK_INT < 24) {
            return null;
        }
        return new c(this.f5450b.getConstantState());
    }

    @Override // p020b2.AbstractC0787f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.f5450b;
        return drawable != null ? drawable.getIntrinsicHeight() : this.f5435c.f5443b.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f5450b;
        return drawable != null ? drawable.getIntrinsicWidth() : this.f5435c.f5443b.getIntrinsicWidth();
    }

    @Override // p020b2.AbstractC0787f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    @Override // p020b2.AbstractC0787f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f5450b;
        return drawable != null ? drawable.getOpacity() : this.f5435c.f5443b.getOpacity();
    }

    @Override // p020b2.AbstractC0787f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    @Override // p020b2.AbstractC0787f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    @Override // p020b2.AbstractC0787f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        inflate(resources, xmlPullParser, attributeSet, null);
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        TypedArray typedArray;
        Drawable drawable = this.f5450b;
        if (drawable != null) {
            C4917c.m24843g(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth();
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth + 1 || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    TypedArray m23087s = C4570i.m23087s(resources, theme, attributeSet, C0782a.f5427e);
                    int resourceId = m23087s.getResourceId(0, 0);
                    typedArray = m23087s;
                    if (resourceId != 0) {
                        C0788g m5047b = C0788g.m5047b(resources, resourceId, theme);
                        m5047b.m5053h(false);
                        m5047b.setCallback(this.f5440h);
                        C0788g c0788g = this.f5435c.f5443b;
                        if (c0788g != null) {
                            c0788g.setCallback(null);
                        }
                        this.f5435c.f5443b = m5047b;
                        typedArray = m23087s;
                    }
                } else if ("target".equals(name)) {
                    TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, C0782a.f5428f);
                    String string = obtainAttributes.getString(0);
                    int resourceId2 = obtainAttributes.getResourceId(1, 0);
                    typedArray = obtainAttributes;
                    if (resourceId2 != 0) {
                        Context context = this.f5436d;
                        if (context == null) {
                            obtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                        m5022b(string, C0785d.m5033i(context, resourceId2));
                        typedArray = obtainAttributes;
                    }
                } else {
                    continue;
                }
                typedArray.recycle();
            }
            eventType = xmlPullParser.next();
        }
        this.f5435c.m5023a();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable = this.f5450b;
        return drawable != null ? C4917c.m24844h(drawable) : this.f5435c.f5443b.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        Drawable drawable = this.f5450b;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.f5435c.f5444c.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        Drawable drawable = this.f5450b;
        return drawable != null ? drawable.isStateful() : this.f5435c.f5443b.isStateful();
    }

    @Override // p020b2.AbstractC0787f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.f5450b;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f5450b;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f5435c.f5443b.setBounds(rect);
        }
    }

    @Override // p020b2.AbstractC0787f, android.graphics.drawable.Drawable
    public boolean onLevelChange(int i10) {
        Drawable drawable = this.f5450b;
        return drawable != null ? drawable.setLevel(i10) : this.f5435c.f5443b.setLevel(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f5450b;
        return drawable != null ? drawable.setState(iArr) : this.f5435c.f5443b.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        Drawable drawable = this.f5450b;
        if (drawable != null) {
            drawable.setAlpha(i10);
        } else {
            this.f5435c.f5443b.setAlpha(i10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z10) {
        Drawable drawable = this.f5450b;
        if (drawable != null) {
            C4917c.m24846j(drawable, z10);
        } else {
            this.f5435c.f5443b.setAutoMirrored(z10);
        }
    }

    @Override // p020b2.AbstractC0787f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i10) {
        super.setChangingConfigurations(i10);
    }

    @Override // p020b2.AbstractC0787f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(int i10, PorterDuff.Mode mode) {
        super.setColorFilter(i10, mode);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f5450b;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f5435c.f5443b.setColorFilter(colorFilter);
        }
    }

    @Override // p020b2.AbstractC0787f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z10) {
        super.setFilterBitmap(z10);
    }

    @Override // p020b2.AbstractC0787f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspot(float f10, float f11) {
        super.setHotspot(f10, f11);
    }

    @Override // p020b2.AbstractC0787f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspotBounds(int i10, int i11, int i12, int i13) {
        super.setHotspotBounds(i10, i11, i12, i13);
    }

    @Override // p020b2.AbstractC0787f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i10) {
        Drawable drawable = this.f5450b;
        if (drawable != null) {
            C4917c.m24850n(drawable, i10);
        } else {
            this.f5435c.f5443b.setTint(i10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f5450b;
        if (drawable != null) {
            C4917c.m24851o(drawable, colorStateList);
        } else {
            this.f5435c.f5443b.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f5450b;
        if (drawable != null) {
            C4917c.m24852p(drawable, mode);
        } else {
            this.f5435c.f5443b.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        Drawable drawable = this.f5450b;
        if (drawable != null) {
            return drawable.setVisible(z10, z11);
        }
        this.f5435c.f5443b.setVisible(z10, z11);
        return super.setVisible(z10, z11);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        Drawable drawable = this.f5450b;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
        } else {
            if (this.f5435c.f5444c.isStarted()) {
                return;
            }
            this.f5435c.f5444c.start();
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        Drawable drawable = this.f5450b;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f5435c.f5444c.end();
        }
    }
}
