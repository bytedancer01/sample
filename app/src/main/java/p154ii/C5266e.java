package p154ii;

import android.R;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import java.nio.ShortBuffer;
import p012ab.C0142b;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ii/e.class
 */
/* renamed from: ii.e */
/* loaded from: combined.jar:classes2.jar:ii/e.class */
public final class C5266e {

    /* renamed from: A */
    public static final int f30189A = 0;

    /* renamed from: B */
    public static final int f30191B = 1;

    /* renamed from: C */
    public static final int f30193C = 2;

    /* renamed from: D */
    public static final int f30195D = 3;

    /* renamed from: E */
    public static final int f30197E = 4;

    /* renamed from: F */
    public static final int f30199F = 6;

    /* renamed from: G */
    public static final int f30201G = 7;

    /* renamed from: H */
    public static final int f30203H = 8;

    /* renamed from: I */
    public static final int f30205I = 9;

    /* renamed from: J */
    public static final int f30207J = 15;

    /* renamed from: K */
    public static final int f30209K = 16;

    /* renamed from: L */
    public static final int f30210L = 17;

    /* renamed from: M */
    public static final int f30211M = 18;

    /* renamed from: N */
    public static final int f30212N = 19;

    /* renamed from: O */
    public static final int f30213O = 20;

    /* renamed from: P */
    public static final int f30214P = 21;

    /* renamed from: a */
    public static final int[] f30225a = {2130968655, 2130968662, 2130968663, 2130968883, 2130968884, 2130968885, 2130968886, 2130968887, 2130968888, 2130968927, 2130968969, 2130968970, 2130969010, 2130969178, 2130969185, 2130969194, 2130969195, 2130969199, 2130969219, 2130969244, 2130969373, 2130969505, 2130969617, 2130969634, 2130969635, 2130969812, 2130969815, 2130969920, 2130969930};

    /* renamed from: b */
    public static final int[] f30227b = {R.attr.layout_gravity};

    /* renamed from: c */
    public static final int[] f30229c = {R.attr.minWidth};

    /* renamed from: d */
    public static final int[] f30231d = new int[0];

    /* renamed from: e */
    public static final int[] f30233e = {2130968655, 2130968662, 2130968843, 2130969178, 2130969815, 2130969930};

    /* renamed from: f */
    public static final int[] f30235f = {2130969037, 2130969228};

    /* renamed from: g */
    public static final int[] f30237g = {R.attr.layout, 2130968725, 2130968726, 2130969362, 2130969363, 2130969500, 2130969758, 2130969773};

    /* renamed from: h */
    public static final int[] f30239h = {R.attr.dither, R.attr.visible, R.attr.variablePadding, R.attr.constantSize, R.attr.enterFadeDuration, R.attr.exitFadeDuration};

    /* renamed from: i */
    public static final int[] f30241i = {R.attr.id, R.attr.drawable};

    /* renamed from: j */
    public static final int[] f30243j = {R.attr.drawable, R.attr.toId, R.attr.fromId, R.attr.reversible};

    /* renamed from: k */
    public static final int[] f30245k = {R.attr.background, R.attr.touchscreenBlocksFocus, R.attr.keyboardNavigationCluster, 2130969010, 2130969038, 2130969351, 2130969352, 2130969805};

    /* renamed from: l */
    public static final int[] f30247l = {2130969799, 2130969800, 2130969802, 2130969803};

    /* renamed from: m */
    public static final int[] f30249m = {2130969344, 2130969345};

    /* renamed from: n */
    public static final int[] f30251n = {R.attr.src, 2130969789, 2130969918, 2130969919};

    /* renamed from: o */
    public static final int[] f30253o = {R.attr.thumb, 2130969913, 2130969914, 2130969915};

    /* renamed from: p */
    public static final int[] f30255p = {R.attr.textAppearance, R.attr.drawableTop, R.attr.drawableBottom, R.attr.drawableLeft, R.attr.drawableRight, R.attr.drawableStart, R.attr.drawableEnd};

    /* renamed from: q */
    public static final int[] f30257q = {R.attr.textAppearance, 2130968648, 2130968649, 2130968650, 2130968651, 2130968652, 2130968991, 2130968992, 2130968993, 2130968994, 2130968996, 2130968997, 2130968998, 2130968999, 2130969073, 2130969101, 2130969110, 2130969270, 2130969354, 2130969865, 2130969893};

    /* renamed from: r */
    public static final int[] f30259r = $d2j$hex$3ed00caf$decode_I("57000101ae0001010400047f0500047f0600047f0700047f0800047f0900047f0a00047f0b00047f0c00047f0d00047f0e00047f0f00047f1000047f1200047f1300047f1400047f1500047f1600047f1700047f1800047f1900047f1a00047f1b00047f1c00047f1d00047f1e00047f1f00047f2000047f2100047f2200047f2300047f2400047f2900047f2d00047f2e00047f2f00047f3000047f4700047f7100047f8e00047f8f00047f9000047f9100047f9200047f9800047f9900047fda00047fe300047f1401047f1501047f1601047f1701047f1801047f1901047f1a01047f2101047f2201047f2901047f4201047f8001047f8501047f8601047f8e01047f9001047faa01047fab01047fae01047faf01047fb101047f6a02047f7b02047f0e03047f0f03047f1003047f1103047f1403047f1503047f1603047f1703047f1803047f1903047f1a03047f1b03047f1c03047fca03047fcb03047fcc03047f1004047f1204047f2804047f2a04047f2b04047f2c04047f6004047f6404047f6604047f6704047fba04047fbb04047fe404047f1405047f1605047f1705047f1805047f1a05047f1b05047f1c05047f1d05047f2005047f2105047f4c05047f4d05047f4e05047f4f05047f7505047f7f05047f8005047f8105047f8205047f8305047f8405047f8505047f8605047f8705047f8805047f");

    /* renamed from: s */
    public static final int[] f30261s = {2130968664, 2130969010, 2130969052, 2130969053, 2130969054, 2130969055, 2130969056, 2130969186, 2130969540, 2130969542, 2130969543};

    /* renamed from: t */
    public static final int[] f30263t = {2130968664, 2130969010, 2130969236, 2130969239, 2130969241, 2130969242, 2130969245, 2130969257, 2130969258, 2130969259, 2130969269, 2130969461};

    /* renamed from: u */
    public static final int[] f30265u = {R.attr.elevation, 2130968664, 2130968679, 2130968680, 2130968681, 2130968682, 2130968683, 2130968685, 2130968686, 2130968687, 2130969118, 2130969720, 2130969723};

    /* renamed from: v */
    public static final int[] f30267v = {2130968630};

    /* renamed from: w */
    public static final int[] f30269w = {R.attr.minWidth, R.attr.minHeight, 2130968734, 2130968735, 2130968736, 2130968739, 2130968740, 2130968742, 2130968889, 2130968890, 2130968892, 2130968893, 2130968895};

    /* renamed from: x */
    public static final int[] f30271x = {R.attr.textAppearance, R.attr.textSize, R.attr.textColor, R.attr.ellipsize, R.attr.maxWidth, R.attr.text, R.attr.checkable, 2130968797, 2130968798, 2130968801, 2130968802, 2130968804, 2130968805, 2130968806, 2130968808, 2130968809, 2130968810, 2130968811, 2130968812, 2130968813, 2130968814, 2130968819, 2130968820, 2130968821, 2130968823, 2130968836, 2130968837, 2130968838, 2130968839, 2130968840, 2130968841, 2130968842, 2130969023, 2130969184, 2130969200, 2130969205, 2130969668, 2130969720, 2130969723, 2130969754, 2130969890, 2130969894};

    /* renamed from: y */
    public static final int[] f30273y = {2130968796, 2130968815, 2130968816, 2130968817, 2130969707, 2130969774, 2130969776};

    /* renamed from: z */
    public static final int[] f30275z = {R.attr.src, R.attr.max, R.attr.progress, R.attr.indeterminate, R.attr.indeterminateDuration, R.attr.shadowColor, R.attr.shadowDx, R.attr.shadowDy, R.attr.shadowRadius, R.attr.color, 2130968827, 2130968828, 2130968829, 2130968830, 2130969065, 2130969066, 2130969067, 2130969068, 2130969069, 2130969070, 2130969071, 2130969072};

    /* renamed from: Q */
    public static final int[] f30215Q = {2130968848, 2130968849, 2130968896, 2130969040, 2130969041, 2130969042, 2130969043, 2130969044, 2130969045, 2130969046, 2130969412, 2130969681, 2130969683, 2130969806, 2130969920, 2130969921, 2130969931};

    /* renamed from: R */
    public static final int[] f30216R = {2130969280, 2130969281};

    /* renamed from: S */
    public static final int[] f30217S = {R.attr.color, R.attr.alpha, 2130968631};

    /* renamed from: T */
    public static final int[] f30218T = {R.attr.button, 2130968723, 2130968730, 2130968731};

    /* renamed from: U */
    public static final int[] f30219U = {2130969266, 2130969804};

    /* renamed from: V */
    public static final int[] f30220V = {R.attr.layout_gravity, 2130969277, 2130969278, 2130969279, 2130969324, 2130969336, 2130969337};

    /* renamed from: W */
    public static final int[] f30221W = {2130968643, 2130968645, 2130968670, 2130968851, 2130968995, 2130969117, 2130969785, 2130969897};

    /* renamed from: X */
    public static final int[] f30222X = {R.attr.enabled, 2130968664, 2130968665, 2130968688, 2130969010, 2130969023, 2130969057, 2130969058, 2130969184, 2130969198, 2130969410, 2130969633, 2130969668, 2130969720, 2130969723, 2130969754, 2130969963};

    /* renamed from: Y */
    public static final int[] f30223Y = {2130968677};

    /* renamed from: Z */
    public static final int[] f30224Z = {2130969253, 2130969355};

    /* renamed from: a0 */
    public static final int[] f30226a0 = {2130969102, 2130969103, 2130969104, 2130969105, 2130969106, 2130969107, 2130969108};

    /* renamed from: b0 */
    public static final int[] f30228b0 = {R.attr.font, R.attr.fontWeight, R.attr.fontStyle, R.attr.ttcIndex, R.attr.fontVariationSettings, 2130969100, 2130969109, 2130969110, 2130969111, 2130969959};

    /* renamed from: c0 */
    public static final int[] f30230c0 = {R.attr.foreground, R.attr.foregroundGravity, 2130969112};

    /* renamed from: d0 */
    public static final int[] f30232d0 = {R.attr.startColor, R.attr.endColor, R.attr.type, R.attr.centerX, R.attr.centerY, R.attr.gradientRadius, R.attr.tileMode, R.attr.centerColor, R.attr.startX, R.attr.startY, R.attr.endX, R.attr.endY};

    /* renamed from: e0 */
    public static final int[] f30234e0 = {R.attr.color, R.attr.offset};

    /* renamed from: f0 */
    public static final int[] f30236f0 = {R.attr.gravity, R.attr.orientation, R.attr.baselineAligned, R.attr.baselineAlignedChildIndex, R.attr.weightSum, 2130968970, 2130968975, 2130969444, 2130969753};

    /* renamed from: g0 */
    public static final int[] f30238g0 = {R.attr.layout_gravity, R.attr.layout_width, R.attr.layout_height, R.attr.layout_weight};

    /* renamed from: h0 */
    public static final int[] f30240h0 = {R.attr.dropDownHorizontalOffset, R.attr.dropDownVerticalOffset};

    /* renamed from: i0 */
    public static final int[] f30242i0 = {R.attr.background, R.attr.insetLeft, R.attr.insetRight, R.attr.insetTop, R.attr.insetBottom, R.attr.checkable, 2130968664, 2130968665, 2130968906, 2130969010, 2130969199, 2130969201, 2130969202, 2130969203, 2130969206, 2130969207, 2130969668, 2130969720, 2130969723, 2130969808, 2130969809};

    /* renamed from: j0 */
    public static final int[] f30244j0 = {R.attr.checkable, 2130968738, 2130968797, 2130968799, 2130968800, 2130968801, 2130969668, 2130969720, 2130969723, C0142b.f633B, 2130969808, 2130969809};

    /* renamed from: k0 */
    public static final int[] f30246k0 = {R.attr.enabled, R.attr.id, R.attr.visible, R.attr.menuCategory, R.attr.orderInCategory, R.attr.checkableBehavior};

    /* renamed from: l0 */
    public static final int[] f30248l0 = {R.attr.icon, R.attr.enabled, R.attr.id, R.attr.checked, R.attr.visible, R.attr.menuCategory, R.attr.orderInCategory, R.attr.title, R.attr.titleCondensed, R.attr.alphabeticShortcut, R.attr.numericShortcut, R.attr.checkable, R.attr.onClick, 2130968593, 2130968613, 2130968615, 2130968632, 2130968882, 2130969206, 2130969207, 2130969516, 2130969748, 2130969937};

    /* renamed from: m0 */
    public static final int[] f30250m0 = {R.attr.windowAnimationStyle, R.attr.itemTextAppearance, R.attr.horizontalDivider, R.attr.verticalDivider, R.attr.headerBackground, R.attr.itemBackground, R.attr.itemIconDisabledAlpha, 2130969632, 2130969810};

    /* renamed from: n0 */
    public static final int[] f30252n0 = {R.attr.background, R.attr.fitsSystemWindows, R.attr.maxWidth, 2130969010, 2130969175, 2130969236, 2130969238, 2130969240, 2130969241, 2130969242, 2130969243, 2130969246, 2130969247, 2130969248, 2130969249, 2130969250, 2130969251, 2130969252, 2130969256, 2130969259, 2130969461, 2130969720, 2130969723};

    /* renamed from: o0 */
    public static final int[] f30254o0 = {R.attr.popupBackground, R.attr.popupAnimationStyle, 2130969534};

    /* renamed from: p0 */
    public static final int[] f30256p0 = {2130969798};

    /* renamed from: q0 */
    public static final int[] f30258q0 = {2130969539, 2130969545};

    /* renamed from: r0 */
    public static final int[] f30260r0 = {R.attr.orientation, R.attr.clipToPadding, R.attr.descendantFocusability, 2130969059, 2130969060, 2130969061, 2130969062, 2130969063, 2130969275, 2130969666, 2130969784, 2130969790};

    /* renamed from: s0 */
    public static final int[] f30262s0 = {2130969230};

    /* renamed from: t0 */
    public static final int[] f30264t0 = {2130968684};

    /* renamed from: u0 */
    public static final int[] f30266u0 = {R.attr.focusable, R.attr.maxWidth, R.attr.inputType, R.attr.imeOptions, 2130968836, 2130968875, 2130968942, 2130969120, 2130969208, 2130969272, 2130969637, 2130969638, 2130969689, 2130969690, 2130969811, 2130969819, 2130969975};

    /* renamed from: v0 */
    public static final int[] f30268v0 = {2130969781, 2130969782, 2130969783};

    /* renamed from: w0 */
    public static final int[] f30270w0 = {R.attr.maxWidth, 2130968614, 2130968635, 2130968661, 2130968664, 2130968665, 2130969010, 2130969406};

    /* renamed from: x0 */
    public static final int[] f30272x0 = {R.attr.entries, R.attr.popupBackground, R.attr.prompt, R.attr.dropDownWidth, 2130969617};

    /* renamed from: y0 */
    public static final int[] f30274y0 = {R.attr.dither, R.attr.visible, R.attr.variablePadding, R.attr.constantSize, R.attr.enterFadeDuration, R.attr.exitFadeDuration};

    /* renamed from: z0 */
    public static final int[] f30276z0 = {R.attr.drawable};

    /* renamed from: A0 */
    public static final int[] f30190A0 = {R.attr.textOn, R.attr.textOff, R.attr.thumb, 2130969757, 2130969788, 2130969824, 2130969825, 2130969829, 2130969903, 2130969904, 2130969905, 2130969942, 2130969949, 2130969950};

    /* renamed from: B0 */
    public static final int[] f30192B0 = {R.attr.icon, R.attr.layout, R.attr.text};

    /* renamed from: C0 */
    public static final int[] f30194C0 = {2130969832, 2130969833, 2130969834, 2130969835, 2130969836, 2130969837, 2130969838, 2130969839, 2130969840, 2130969841, 2130969842, 2130969843, 2130969844, 2130969845, 2130969846, 2130969847, 2130969848, 2130969849, 2130969850, 2130969851, 2130969852, 2130969853, 2130969854, 2130969856, 2130969857, 2130969858};

    /* renamed from: D0 */
    public static final int[] f30196D0 = {R.attr.textSize, R.attr.typeface, R.attr.textStyle, R.attr.textColor, R.attr.textColorHint, R.attr.textColorLink, R.attr.shadowColor, R.attr.shadowDx, R.attr.shadowDy, R.attr.shadowRadius, R.attr.fontFamily, R.attr.textFontWeight, 2130969101, 2130969110, 2130969865, 2130969893};

    /* renamed from: E0 */
    public static final int[] f30198E0 = {R.attr.enabled, R.attr.textColorHint, R.attr.hint, 2130968694, 2130968695, 2130968696, 2130968697, 2130968698, 2130968699, 2130968700, 2130968701, 2130968702, 2130968703, 2130968704, 2130968912, 2130968913, 2130968914, 2130968915, 2130968916, 2130968917, 2130969015, 2130969016, 2130969017, 2130969018, 2130969019, 2130969020, 2130969028, 2130969029, 2130969030, 2130969031, 2130969032, 2130969034, 2130969035, 2130969039, 2130969179, 2130969180, 2130969181, 2130969182, 2130969190, 2130969191, 2130969192, 2130969193, 2130969549, 2130969550, 2130969551, 2130969552, 2130969553, 2130969581, 2130969582, 2130969583, 2130969629, 2130969630, 2130969631, 2130969720, 2130969723, 2130969793, 2130969794, 2130969795, 2130969796, 2130969797, 2130969816, 2130969817, 2130969818};

    /* renamed from: F0 */
    public static final int[] f30200F0 = {R.attr.textAppearance, 2130969021, 2130969022};

    /* renamed from: G0 */
    public static final int[] f30202G0 = {R.attr.gravity, R.attr.minHeight, 2130968724, 2130968845, 2130968846, 2130968883, 2130968884, 2130968885, 2130968886, 2130968887, 2130968888, 2130969373, 2130969374, 2130969407, 2130969461, 2130969502, 2130969503, 2130969617, 2130969812, 2130969813, 2130969814, 2130969920, 2130969922, 2130969923, 2130969924, 2130969925, 2130969926, 2130969927, 2130969928, 2130969929};

    /* renamed from: H0 */
    public static final int[] f30204H0 = {R.attr.theme, R.attr.focusable, 2130969541, 2130969544, 2130969895};

    /* renamed from: I0 */
    public static final int[] f30206I0 = {R.attr.background, 2130968664, 2130968665};

    /* renamed from: J0 */
    public static final int[] f30208J0 = {R.attr.id, R.attr.layout, R.attr.inflatedId};

    private static long[] $d2j$hex$3ed00caf$decode_J(String src) {
        byte[] d10 = $d2j$hex$3ed00caf$decode_B(src);
        ByteBuffer b10 = ByteBuffer.wrap(d10);
        b10.order(ByteOrder.LITTLE_ENDIAN);
        LongBuffer s10 = b10.asLongBuffer();
        long[] data = new long[d10.length / 8];
        s10.get(data);
        return data;
    }

    private static int[] $d2j$hex$3ed00caf$decode_I(String src) {
        byte[] d10 = $d2j$hex$3ed00caf$decode_B(src);
        ByteBuffer b10 = ByteBuffer.wrap(d10);
        b10.order(ByteOrder.LITTLE_ENDIAN);
        IntBuffer s10 = b10.asIntBuffer();
        int[] data = new int[d10.length / 4];
        s10.get(data);
        return data;
    }

    private static short[] $d2j$hex$3ed00caf$decode_S(String src) {
        byte[] d10 = $d2j$hex$3ed00caf$decode_B(src);
        ByteBuffer b10 = ByteBuffer.wrap(d10);
        b10.order(ByteOrder.LITTLE_ENDIAN);
        ShortBuffer s10 = b10.asShortBuffer();
        short[] data = new short[d10.length / 2];
        s10.get(data);
        return data;
    }

    private static byte[] $d2j$hex$3ed00caf$decode_B(String src) {
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
