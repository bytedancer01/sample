package p328t2;

import android.R;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import java.nio.ShortBuffer;
import me.zhanghai.android.materialprogressbar.C6586R;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:t2/e.class
 */
/* renamed from: t2.e */
/* loaded from: combined.jar:classes1.jar:t2/e.class */
public final class C8609e {

    /* renamed from: v */
    public static final int f40186v = 0;

    /* renamed from: a */
    public static final int[] f40165a = {2130968655, 2130968662, 2130968663, 2130968883, 2130968884, 2130968885, 2130968886, 2130968887, 2130968888, 2130968927, 2130968969, 2130968970, 2130969010, 2130969178, 2130969185, 2130969194, 2130969195, 2130969199, 2130969219, 2130969244, 2130969373, 2130969505, 2130969617, 2130969634, 2130969635, 2130969812, 2130969815, 2130969920, 2130969930};

    /* renamed from: b */
    public static final int[] f40166b = {R.attr.layout_gravity};

    /* renamed from: c */
    public static final int[] f40167c = {R.attr.minWidth};

    /* renamed from: d */
    public static final int[] f40168d = {2130968655, 2130968662, 2130968843, 2130969178, 2130969815, 2130969930};

    /* renamed from: e */
    public static final int[] f40169e = {2130969037, 2130969228};

    /* renamed from: f */
    public static final int[] f40170f = {R.attr.layout, 2130968725, 2130968726, 2130969362, 2130969363, 2130969500, 2130969758, 2130969773};

    /* renamed from: g */
    public static final int[] f40171g = {R.attr.src, 2130969789, 2130969918, 2130969919};

    /* renamed from: h */
    public static final int[] f40172h = {R.attr.thumb, 2130969913, 2130969914, 2130969915};

    /* renamed from: i */
    public static final int[] f40173i = {R.attr.textAppearance, R.attr.drawableTop, R.attr.drawableBottom, R.attr.drawableLeft, R.attr.drawableRight, R.attr.drawableStart, R.attr.drawableEnd};

    /* renamed from: j */
    public static final int[] f40174j = {R.attr.textAppearance, 2130968648, 2130968649, 2130968650, 2130968651, 2130968652, 2130968991, 2130968992, 2130968993, 2130968994, 2130968996, 2130968997, 2130968998, 2130968999, 2130969073, 2130969101, 2130969110, 2130969270, 2130969354, 2130969865, 2130969893};

    /* renamed from: k */
    public static final int[] f40175k = $d2j$hex$534e66da$decode_I("57000101ae0001010400047f0500047f0600047f0700047f0800047f0900047f0a00047f0b00047f0c00047f0d00047f0e00047f0f00047f1000047f1200047f1300047f1400047f1500047f1600047f1700047f1800047f1900047f1a00047f1b00047f1c00047f1d00047f1e00047f1f00047f2000047f2100047f2200047f2300047f2400047f2900047f2d00047f2e00047f2f00047f3000047f4700047f7100047f8e00047f8f00047f9000047f9100047f9200047f9800047f9900047fda00047fe300047f1401047f1501047f1601047f1701047f1801047f1901047f1a01047f2101047f2201047f2901047f4201047f8001047f8501047f8601047f8e01047f9001047faa01047fab01047fae01047faf01047fb101047f6a02047f7b02047f0e03047f0f03047f1003047f1103047f1403047f1503047f1603047f1703047f1803047f1903047f1a03047f1b03047f1c03047fca03047fcb03047fcc03047f1004047f1204047f2804047f2a04047f2b04047f2c04047f6004047f6404047f6604047f6704047fba04047fbb04047fe404047f1405047f1605047f1705047f1805047f1a05047f1b05047f1c05047f1d05047f2005047f2105047f4c05047f4d05047f4e05047f4f05047f7505047f7f05047f8005047f8105047f8205047f8305047f8405047f8505047f8605047f8705047f8805047f");

    /* renamed from: l */
    public static final int[] f40176l = {2130968630};

    /* renamed from: m */
    public static final int[] f40177m = {R.attr.color, R.attr.alpha, 2130968631};

    /* renamed from: n */
    public static final int[] f40178n = {R.attr.button, 2130968723, 2130968730, 2130968731};

    /* renamed from: o */
    public static final int[] f40179o = {2130968643, 2130968645, 2130968670, 2130968851, 2130968995, 2130969117, 2130969785, 2130969897};

    /* renamed from: p */
    public static final int[] f40180p = {2130969102, 2130969103, 2130969104, 2130969105, 2130969106, 2130969107, 2130969108};

    /* renamed from: q */
    public static final int[] f40181q = {R.attr.font, R.attr.fontWeight, R.attr.fontStyle, R.attr.ttcIndex, R.attr.fontVariationSettings, 2130969100, 2130969109, 2130969110, 2130969111, 2130969959};

    /* renamed from: r */
    public static final int[] f40182r = {R.attr.gravity, R.attr.orientation, R.attr.baselineAligned, R.attr.baselineAlignedChildIndex, R.attr.weightSum, 2130968970, 2130968975, 2130969444, 2130969753};

    /* renamed from: s */
    public static final int[] f40183s = {R.attr.layout_gravity, R.attr.layout_width, R.attr.layout_height, R.attr.layout_weight};

    /* renamed from: t */
    public static final int[] f40184t = {R.attr.dropDownHorizontalOffset, R.attr.dropDownVerticalOffset};

    /* renamed from: u */
    public static final int[] f40185u = {2130969439};

    /* renamed from: w */
    public static final int[] f40187w = {C6586R.attr.mpb_determinateCircularProgressStyle, C6586R.attr.mpb_indeterminateTint, C6586R.attr.mpb_indeterminateTintMode, C6586R.attr.mpb_progressBackgroundTint, C6586R.attr.mpb_progressBackgroundTintMode, C6586R.attr.mpb_progressStyle, C6586R.attr.mpb_progressTint, C6586R.attr.mpb_progressTintMode, C6586R.attr.mpb_secondaryProgressTint, C6586R.attr.mpb_secondaryProgressTintMode, C6586R.attr.mpb_setBothDrawables, C6586R.attr.mpb_showProgressBackground, C6586R.attr.mpb_useIntrinsicPadding};

    /* renamed from: x */
    public static final int[] f40188x = {R.attr.enabled, R.attr.id, R.attr.visible, R.attr.menuCategory, R.attr.orderInCategory, R.attr.checkableBehavior};

    /* renamed from: y */
    public static final int[] f40189y = {R.attr.icon, R.attr.enabled, R.attr.id, R.attr.checked, R.attr.visible, R.attr.menuCategory, R.attr.orderInCategory, R.attr.title, R.attr.titleCondensed, R.attr.alphabeticShortcut, R.attr.numericShortcut, R.attr.checkable, R.attr.onClick, 2130968593, 2130968613, 2130968615, 2130968632, 2130968882, 2130969206, 2130969207, 2130969516, 2130969748, 2130969937};

    /* renamed from: z */
    public static final int[] f40190z = {R.attr.windowAnimationStyle, R.attr.itemTextAppearance, R.attr.horizontalDivider, R.attr.verticalDivider, R.attr.headerBackground, R.attr.itemBackground, R.attr.itemIconDisabledAlpha, 2130969632, 2130969810};

    /* renamed from: A */
    public static final int[] f40153A = {R.attr.popupBackground, R.attr.popupAnimationStyle, 2130969534};

    /* renamed from: B */
    public static final int[] f40154B = {2130969798};

    /* renamed from: C */
    public static final int[] f40155C = {2130969539, 2130969545};

    /* renamed from: D */
    public static final int[] f40156D = {R.attr.orientation, R.attr.clipToPadding, R.attr.descendantFocusability, 2130969059, 2130969060, 2130969061, 2130969062, 2130969063, 2130969275, 2130969666, 2130969784, 2130969790};

    /* renamed from: E */
    public static final int[] f40157E = {R.attr.focusable, R.attr.maxWidth, R.attr.inputType, R.attr.imeOptions, 2130968836, 2130968875, 2130968942, 2130969120, 2130969208, 2130969272, 2130969637, 2130969638, 2130969689, 2130969690, 2130969811, 2130969819, 2130969975};

    /* renamed from: F */
    public static final int[] f40158F = {R.attr.entries, R.attr.popupBackground, R.attr.prompt, R.attr.dropDownWidth, 2130969617};

    /* renamed from: G */
    public static final int[] f40159G = {R.attr.textOn, R.attr.textOff, R.attr.thumb, 2130969757, 2130969788, 2130969824, 2130969825, 2130969829, 2130969903, 2130969904, 2130969905, 2130969942, 2130969949, 2130969950};

    /* renamed from: H */
    public static final int[] f40160H = {R.attr.textSize, R.attr.typeface, R.attr.textStyle, R.attr.textColor, R.attr.textColorHint, R.attr.textColorLink, R.attr.shadowColor, R.attr.shadowDx, R.attr.shadowDy, R.attr.shadowRadius, R.attr.fontFamily, R.attr.textFontWeight, 2130969101, 2130969110, 2130969865, 2130969893};

    /* renamed from: I */
    public static final int[] f40161I = {R.attr.gravity, R.attr.minHeight, 2130968724, 2130968845, 2130968846, 2130968883, 2130968884, 2130968885, 2130968886, 2130968887, 2130968888, 2130969373, 2130969374, 2130969407, 2130969461, 2130969502, 2130969503, 2130969617, 2130969812, 2130969813, 2130969814, 2130969920, 2130969922, 2130969923, 2130969924, 2130969925, 2130969926, 2130969927, 2130969928, 2130969929};

    /* renamed from: J */
    public static final int[] f40162J = {R.attr.theme, R.attr.focusable, 2130969541, 2130969544, 2130969895};

    /* renamed from: K */
    public static final int[] f40163K = {R.attr.background, 2130968664, 2130968665};

    /* renamed from: L */
    public static final int[] f40164L = {R.attr.id, R.attr.layout, R.attr.inflatedId};

    private static long[] $d2j$hex$534e66da$decode_J(String src) {
        byte[] d10 = $d2j$hex$534e66da$decode_B(src);
        ByteBuffer b10 = ByteBuffer.wrap(d10);
        b10.order(ByteOrder.LITTLE_ENDIAN);
        LongBuffer s10 = b10.asLongBuffer();
        long[] data = new long[d10.length / 8];
        s10.get(data);
        return data;
    }

    private static int[] $d2j$hex$534e66da$decode_I(String src) {
        byte[] d10 = $d2j$hex$534e66da$decode_B(src);
        ByteBuffer b10 = ByteBuffer.wrap(d10);
        b10.order(ByteOrder.LITTLE_ENDIAN);
        IntBuffer s10 = b10.asIntBuffer();
        int[] data = new int[d10.length / 4];
        s10.get(data);
        return data;
    }

    private static short[] $d2j$hex$534e66da$decode_S(String src) {
        byte[] d10 = $d2j$hex$534e66da$decode_B(src);
        ByteBuffer b10 = ByteBuffer.wrap(d10);
        b10.order(ByteOrder.LITTLE_ENDIAN);
        ShortBuffer s10 = b10.asShortBuffer();
        short[] data = new short[d10.length / 2];
        s10.get(data);
        return data;
    }

    private static byte[] $d2j$hex$534e66da$decode_B(String src) {
        int hh2;
        int i10;
        char[] d10 = src.toCharArray();
        byte[] ret = new byte[src.length() / 2];
        for (int i11 = 0; i11 < ret.length; i11++) {
            char h10 = d10[2 * i11];
            char l10 = d10[(2 * i11) + 1];
            if (h10 >= '0' && h10 <= '9') {
                hh2 = h10 - '0';
            } else if (h10 >= 'a' && h10 <= 'f') {
                hh2 = (h10 - 'a') + 10;
            } else if (h10 >= 'A' && h10 <= 'F') {
                hh2 = (h10 - 'A') + 10;
            } else {
                throw new RuntimeException();
            }
            if (l10 >= '0' && l10 <= '9') {
                i10 = l10 - '0';
            } else if (l10 >= 'a' && l10 <= 'f') {
                i10 = (l10 - 'a') + 10;
            } else if (l10 >= 'A' && l10 <= 'F') {
                i10 = (l10 - 'A') + 10;
            } else {
                throw new RuntimeException();
            }
            int ll = i10;
            ret[i11] = (byte) ((hh2 << 4) | ll);
        }
        return ret;
    }
}
