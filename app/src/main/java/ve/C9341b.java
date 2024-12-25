package ve;

import android.R;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import java.nio.ShortBuffer;
import me.zhanghai.android.materialprogressbar.C6586R;
import p012ab.C0142b;
import p216m9.C5965k;
import p296r1.C7944c;
import p413y0.C9788a;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ve/b.class
 */
/* renamed from: ve.b */
/* loaded from: combined.jar:classes2.jar:ve/b.class */
public final class C9341b {

    /* renamed from: a */
    public static final int[] f42669a = {2130969220, 2130969224, 2130969409, 2130969414, 2130969467, 2130969471};

    /* renamed from: b */
    public static final int[] f42674b = {2130968655, 2130968662, 2130968663, 2130968883, 2130968884, 2130968885, 2130968886, 2130968887, 2130968888, 2130968927, 2130968969, 2130968970, 2130969010, 2130969178, 2130969185, 2130969194, 2130969195, 2130969199, 2130969219, 2130969244, 2130969373, 2130969505, 2130969617, 2130969634, 2130969635, 2130969812, 2130969815, 2130969920, 2130969930};

    /* renamed from: c */
    public static final int[] f42679c = {R.attr.layout_gravity};

    /* renamed from: d */
    public static final int[] f42684d = {R.attr.minWidth};

    /* renamed from: e */
    public static final int[] f42689e = new int[0];

    /* renamed from: f */
    public static final int[] f42694f = {2130968655, 2130968662, 2130968843, 2130969178, 2130969815, 2130969930};

    /* renamed from: g */
    public static final int[] f42699g = {2130969037, 2130969228};

    /* renamed from: h */
    public static final int[] f42704h = {R.attr.name, 2130968579, 2130968931, 2130968932, 2130969860};

    /* renamed from: i */
    public static final int[] f42709i = {R.attr.layout, 2130968725, 2130968726, 2130969362, 2130969363, 2130969500, 2130969758, 2130969773};

    /* renamed from: j */
    public static final int[] f42714j = {R.attr.dither, R.attr.visible, R.attr.variablePadding, R.attr.constantSize, R.attr.enterFadeDuration, R.attr.exitFadeDuration};

    /* renamed from: k */
    public static final int[] f42719k = {R.attr.id, R.attr.drawable};

    /* renamed from: l */
    public static final int[] f42724l = {R.attr.drawable, R.attr.toId, R.attr.fromId, R.attr.reversible};

    /* renamed from: m */
    public static final int[] f42728m = {R.attr.background, R.attr.touchscreenBlocksFocus, R.attr.keyboardNavigationCluster, 2130969010, 2130969038, 2130969351, 2130969352, 2130969805};

    /* renamed from: n */
    public static final int[] f42732n = {2130969799, 2130969800, 2130969802, 2130969803};

    /* renamed from: o */
    public static final int[] f42736o = {2130969344, 2130969345};

    /* renamed from: p */
    public static final int[] f42740p = {R.attr.src, 2130969789, 2130969918, 2130969919};

    /* renamed from: q */
    public static final int[] f42744q = {R.attr.thumb, 2130969913, 2130969914, 2130969915};

    /* renamed from: r */
    public static final int[] f42748r = {R.attr.textAppearance, R.attr.drawableTop, R.attr.drawableBottom, R.attr.drawableLeft, R.attr.drawableRight, R.attr.drawableStart, R.attr.drawableEnd};

    /* renamed from: s */
    public static final int[] f42752s = {R.attr.textAppearance, 2130968648, 2130968649, 2130968650, 2130968651, 2130968652, 2130968991, 2130968992, 2130968993, 2130968994, 2130968996, 2130968997, 2130968998, 2130968999, 2130969073, 2130969101, 2130969110, 2130969270, 2130969354, 2130969865, 2130969893};

    /* renamed from: t */
    public static final int[] f42756t = $d2j$hex$b7fab1ac$decode_I("57000101ae0001010400047f0500047f0600047f0700047f0800047f0900047f0a00047f0b00047f0c00047f0d00047f0e00047f0f00047f1000047f1200047f1300047f1400047f1500047f1600047f1700047f1800047f1900047f1a00047f1b00047f1c00047f1d00047f1e00047f1f00047f2000047f2100047f2200047f2300047f2400047f2900047f2d00047f2e00047f2f00047f3000047f4700047f7100047f8e00047f8f00047f9000047f9100047f9200047f9800047f9900047fda00047fe300047f1401047f1501047f1601047f1701047f1801047f1901047f1a01047f2101047f2201047f2901047f4201047f8001047f8501047f8601047f8e01047f9001047faa01047fab01047fae01047faf01047fb101047f6a02047f7b02047f0e03047f0f03047f1003047f1103047f1403047f1503047f1603047f1703047f1803047f1903047f1a03047f1b03047f1c03047fca03047fcb03047fcc03047f1004047f1204047f2804047f2a04047f2b04047f2c04047f6004047f6404047f6604047f6704047fba04047fbb04047fe404047f1405047f1605047f1705047f1805047f1a05047f1b05047f1c05047f1d05047f2005047f2105047f4c05047f4d05047f4e05047f4f05047f7505047f7f05047f8005047f8105047f8205047f8305047f8405047f8505047f8605047f8705047f8805047f");

    /* renamed from: u */
    public static final int[] f42760u = {2130969662};

    /* renamed from: v */
    public static final int[] f42764v = {R.attr.selectableItemBackground, 2130969702};

    /* renamed from: w */
    public static final int[] f42768w = {2130968656, 2130968667, 2130968669, 2130969197, 2130969408, 2130969513, 2130969972};

    /* renamed from: x */
    public static final int[] f42772x = {R.attr.indeterminate, 2130969183, 2130969220, 2130969468, 2130969747, 2130969749, 2130969943, 2130969946, 2130969948};

    /* renamed from: y */
    public static final int[] f42776y = {2130968664, 2130969010, 2130969052, 2130969053, 2130969054, 2130969055, 2130969056, 2130969186, 2130969540, 2130969542, 2130969543};

    /* renamed from: z */
    public static final int[] f42780z = {2130968664, 2130969010, 2130969236, 2130969239, 2130969241, 2130969242, 2130969245, 2130969257, 2130969258, 2130969259, 2130969269, 2130969461};

    /* renamed from: A */
    public static final int[] f42565A = {R.attr.elevation, 2130968664, 2130968679, 2130968680, 2130968681, 2130968682, 2130968683, 2130968685, 2130968686, 2130968687, 2130969118, 2130969720, 2130969723};

    /* renamed from: B */
    public static final int[] f42569B = {2130968630};

    /* renamed from: C */
    public static final int[] f42573C = {2130969639, 2130969745};

    /* renamed from: D */
    public static final int[] f42577D = {R.attr.minWidth, R.attr.minHeight, 2130968734, 2130968735, 2130968736, 2130968739, 2130968740, 2130968742, 2130968889, 2130968890, 2130968892, 2130968893, 2130968895};

    /* renamed from: E */
    public static final int[] f42581E = {2130968760, 2130968762};

    /* renamed from: F */
    public static final int[] f42585F = {2130968744, 2130968745, 2130968746, 2130968747, 2130968748, 2130968749, 2130968750, 2130968754, 2130968757, 2130968758, 2130968759, 2130968763, 2130968767, 2130968772, 2130968775, 2130968776, 2130968777, 2130968779, 2130968780, 2130968781, 2130968782, 2130968783, 2130968784, 2130968785, 2130968787, 2130968788, 2130968789};

    /* renamed from: G */
    public static final int[] f42589G = {2130968752, 2130968753, 2130968755, 2130968756, 2130968766, 2130968791};

    /* renamed from: H */
    public static final int[] f42593H = {2130968751, 2130968754, 2130968757, 2130968758, 2130968767, 2130968769, 2130968770, 2130968771, 2130968773, 2130968775, 2130968776, 2130968777, 2130968778, 2130968779, 2130968786, 2130968787, 2130968788, 2130968789, 2130968790, 2130968791};

    /* renamed from: I */
    public static final int[] f42597I = {R.attr.summaryOn, R.attr.summaryOff, R.attr.disableDependentsState, 2130968968, 2130969821, 2130969822};

    /* renamed from: J */
    public static final int[] f42601J = {R.attr.textAppearance, R.attr.textSize, R.attr.textColor, R.attr.ellipsize, R.attr.maxWidth, R.attr.text, R.attr.checkable, 2130968797, 2130968798, 2130968801, 2130968802, 2130968804, 2130968805, 2130968806, 2130968808, 2130968809, 2130968810, 2130968811, 2130968812, 2130968813, 2130968814, 2130968819, 2130968820, 2130968821, 2130968823, 2130968836, 2130968837, 2130968838, 2130968839, 2130968840, 2130968841, 2130968842, 2130969023, 2130969184, 2130969200, 2130969205, 2130969668, 2130969720, 2130969723, 2130969754, 2130969890, 2130969894};

    /* renamed from: K */
    public static final int[] f42605K = {2130968796, 2130968815, 2130968816, 2130968817, 2130969707, 2130969774, 2130969776};

    /* renamed from: L */
    public static final int[] f42609L = {R.attr.src, R.attr.max, R.attr.progress, R.attr.indeterminate, R.attr.indeterminateDuration, R.attr.shadowColor, R.attr.shadowDx, R.attr.shadowDy, R.attr.shadowRadius, R.attr.color, 2130968827, 2130968828, 2130968829, 2130968830, 2130969065, 2130969066, 2130969067, 2130969068, 2130969069, 2130969070, 2130969071, 2130969072};

    /* renamed from: M */
    public static final int[] f42613M = {2130969221, 2130969223, 2130969225};

    /* renamed from: N */
    public static final int[] f42617N = {2130968832, 2130968835};

    /* renamed from: O */
    public static final int[] f42621O = {2130968833, 2130969400, 2130969708};

    /* renamed from: P */
    public static final int[] f42625P = {2130968848, 2130968849, 2130968896, 2130969040, 2130969041, 2130969042, 2130969043, 2130969044, 2130969045, 2130969046, 2130969412, 2130969681, 2130969683, 2130969806, 2130969920, 2130969921, 2130969931};

    /* renamed from: Q */
    public static final int[] f42629Q = {2130969280, 2130969281};

    /* renamed from: R */
    public static final int[] f42633R = {R.attr.color, R.attr.alpha, 2130968631};

    /* renamed from: S */
    public static final int[] f42637S = {R.attr.button, 2130968723, 2130968730, 2130968731};

    /* renamed from: T */
    public static final int[] f42641T = {R.attr.orientation, R.attr.id, R.attr.visibility, R.attr.layout_width, R.attr.layout_height, R.attr.layout_marginLeft, R.attr.layout_marginTop, R.attr.layout_marginRight, R.attr.layout_marginBottom, R.attr.maxWidth, R.attr.maxHeight, R.attr.minWidth, R.attr.minHeight, R.attr.alpha, R.attr.transformPivotX, R.attr.transformPivotY, R.attr.translationX, R.attr.translationY, R.attr.scaleX, R.attr.scaleY, R.attr.rotation, R.attr.rotationX, R.attr.rotationY, R.attr.layout_marginStart, R.attr.layout_marginEnd, R.attr.translationZ, R.attr.elevation, 2130968634, 2130968673, 2130968674, 2130968675, 2130968792, 2130968879, 2130968990, 2130969077, 2130969078, 2130969079, 2130969080, 2130969081, 2130969082, 2130969083, 2130969084, 2130969085, 2130969086, 2130969087, 2130969088, 2130969089, 2130969091, 2130969092, 2130969093, 2130969094, 2130969095, 2130969282, 2130969283, 2130969284, 2130969285, 2130969286, 2130969287, 2130969288, 2130969289, 2130969290, 2130969291, 2130969292, 2130969293, 2130969294, 2130969295, 2130969296, 2130969297, 2130969298, 2130969299, 2130969300, 2130969301, 2130969302, 2130969303, 2130969304, 2130969305, 2130969306, 2130969307, 2130969308, 2130969309, 2130969310, 2130969311, 2130969312, 2130969313, 2130969314, 2130969315, 2130969316, 2130969317, 2130969318, 2130969319, 2130969320, 2130969321, 2130969322, 2130969323, 2130969325, 2130969326, 2130969330, 2130969331, 2130969332, 2130969333, 2130969334, 2130969335, 2130969481, 2130969482, 2130969554, 2130969580, 2130969952, 2130969954, 2130969974};

    /* renamed from: U */
    public static final int[] f42645U = {R.attr.orientation, R.attr.padding, R.attr.paddingLeft, R.attr.paddingTop, R.attr.paddingRight, R.attr.paddingBottom, R.attr.visibility, R.attr.maxWidth, R.attr.maxHeight, R.attr.minWidth, R.attr.minHeight, R.attr.paddingStart, R.attr.paddingEnd, R.attr.elevation, 2130968673, 2130968674, 2130968675, 2130968792, 2130968876, 2130968879, 2130969077, 2130969078, 2130969079, 2130969080, 2130969081, 2130969082, 2130969083, 2130969084, 2130969085, 2130969086, 2130969087, 2130969088, 2130969089, 2130969091, 2130969092, 2130969093, 2130969094, 2130969095, 2130969273, 2130969282, 2130969283, 2130969284, 2130969285, 2130969286, 2130969287, 2130969288, 2130969289, 2130969290, 2130969291, 2130969292, 2130969293, 2130969294, 2130969295, 2130969296, 2130969297, 2130969298, 2130969299, 2130969300, 2130969301, 2130969302, 2130969303, 2130969304, 2130969305, 2130969306, 2130969307, 2130969308, 2130969309, 2130969310, 2130969311, 2130969312, 2130969313, 2130969314, 2130969315, 2130969316, 2130969317, 2130969318, 2130969319, 2130969320, 2130969321, 2130969322, 2130969323, 2130969325, 2130969326, 2130969330, 2130969331, 2130969332, 2130969333, 2130969334, 2130969335, 2130969342};

    /* renamed from: V */
    public static final int[] f42649V = {2130968881, 2130969584};

    /* renamed from: W */
    public static final int[] f42653W = {R.attr.orientation, R.attr.id, R.attr.visibility, R.attr.layout_width, R.attr.layout_height, R.attr.layout_marginLeft, R.attr.layout_marginTop, R.attr.layout_marginRight, R.attr.layout_marginBottom, R.attr.maxWidth, R.attr.maxHeight, R.attr.minWidth, R.attr.minHeight, R.attr.pivotX, R.attr.pivotY, R.attr.alpha, R.attr.transformPivotX, R.attr.transformPivotY, R.attr.translationX, R.attr.translationY, R.attr.scaleX, R.attr.scaleY, R.attr.rotation, R.attr.rotationX, R.attr.rotationY, R.attr.layout_marginStart, R.attr.layout_marginEnd, R.attr.translationZ, R.attr.elevation, 2130968634, 2130968673, 2130968674, 2130968675, 2130968792, 2130968879, 2130968954, 2130968990, 2130969077, 2130969078, 2130969079, 2130969080, 2130969081, 2130969082, 2130969083, 2130969084, 2130969085, 2130969086, 2130969087, 2130969088, 2130969089, 2130969091, 2130969092, 2130969093, 2130969094, 2130969095, 2130969282, 2130969283, 2130969284, 2130969285, 2130969286, 2130969287, 2130969288, 2130969289, 2130969290, 2130969291, 2130969292, 2130969293, 2130969294, 2130969295, 2130969296, 2130969297, 2130969298, 2130969299, 2130969300, 2130969301, 2130969302, 2130969303, 2130969304, 2130969305, 2130969306, 2130969307, 2130969308, 2130969309, 2130969310, 2130969311, 2130969312, 2130969313, 2130969314, 2130969315, 2130969316, 2130969317, 2130969318, 2130969319, 2130969320, 2130969321, 2130969322, 2130969323, 2130969325, 2130969326, 2130969330, 2130969331, 2130969332, 2130969333, 2130969334, 2130969335, 2130969481, 2130969482, 2130969554, 2130969580, 2130969952, 2130969954};

    /* renamed from: X */
    public static final int[] f42657X = {2130969266, 2130969804};

    /* renamed from: Y */
    public static final int[] f42661Y = {R.attr.layout_gravity, 2130969277, 2130969278, 2130969279, 2130969324, 2130969336, 2130969337};

    /* renamed from: Z */
    public static final int[] f42665Z = {2130968646, 2130968921, 2130968922, 2130968923, 2130968924, 2130968925, 2130968926, 2130968928, 2130968929};

    /* renamed from: a0 */
    public static final int[] f42670a0 = {2130968761, C5965k.f33453a, 2130968768, C5965k.f33454b};

    /* renamed from: b0 */
    public static final int[] f42675b0 = {2130968618, 2130968619, 2130968671, 2130968672, 2130968717, 2130969608, 2130969609, 2130969684, 2130969685, 2130969686, 2130969687, 2130969688, 2130969941, 2130969960};

    /* renamed from: c0 */
    public static final int[] f42680c0 = {R.attr.name};

    /* renamed from: d0 */
    public static final int[] f42685d0 = {R.attr.dialogTitle, R.attr.dialogMessage, R.attr.dialogIcon, R.attr.positiveButtonText, R.attr.negativeButtonText, R.attr.dialogLayout, 2130968961, 2130968962, 2130968963, 2130968967, 2130969508, 2130969619};

    /* renamed from: e0 */
    public static final int[] f42690e0 = {2130968980, 2130968981, 2130968982, 2130968983, 2130968986, 2130969636, 2130969706};

    /* renamed from: f0 */
    public static final int[] f42695f0 = {2130968643, 2130968645, 2130968670, 2130968851, 2130968995, 2130969117, 2130969785, 2130969897};

    /* renamed from: g0 */
    public static final int[] f42700g0 = {2130969010};

    /* renamed from: h0 */
    public static final int[] f42705h0 = {2130969966};

    /* renamed from: i0 */
    public static final int[] f42710i0 = {2130968847, 2130969010, 2130969047, 2130969184, 2130969754, 2130969768};

    /* renamed from: j0 */
    public static final int[] f42715j0 = {2130968677, 2130968678};

    /* renamed from: k0 */
    public static final int[] f42720k0 = {2130968625, 2130968626, 2130968971, 2130968972, 2130968973, 2130969074, 2130969075, 2130969261, 2130969411, 2130969750, 2130969751, 2130969752};

    /* renamed from: l0 */
    public static final int[] f42725l0 = {2130969276, 2130969327, 2130969328, 2130969329, 2130969338, 2130969339, 2130969340, 2130969341, 2130969343, 2130969347};

    /* renamed from: m0 */
    public static final int[] f42729m0 = {R.attr.enabled, 2130968664, 2130968665, 2130968688, 2130969010, 2130969023, 2130969057, 2130969058, 2130969184, 2130969198, 2130969410, 2130969633, 2130969668, 2130969720, 2130969723, 2130969754, 2130969963};

    /* renamed from: n0 */
    public static final int[] f42733n0 = {2130968677};

    /* renamed from: o0 */
    public static final int[] f42737o0 = {2130969253, 2130969355};

    /* renamed from: p0 */
    public static final int[] f42741p0 = {2130969102, 2130969103, 2130969104, 2130969105, 2130969106, 2130969107, 2130969108};

    /* renamed from: q0 */
    public static final int[] f42745q0 = {R.attr.font, R.attr.fontWeight, R.attr.fontStyle, R.attr.ttcIndex, R.attr.fontVariationSettings, 2130969100, 2130969109, 2130969110, 2130969111, 2130969959};

    /* renamed from: r0 */
    public static final int[] f42749r0 = {R.attr.foreground, R.attr.foregroundGravity, 2130969112};

    /* renamed from: s0 */
    public static final int[] f42753s0 = {2130969113};

    /* renamed from: t0 */
    public static final int[] f42757t0 = {R.attr.name, R.attr.id, R.attr.tag};

    /* renamed from: u0 */
    public static final int[] f42761u0 = {R.attr.name, R.attr.tag};

    /* renamed from: v0 */
    public static final int[] f42765v0 = {R.attr.name};

    /* renamed from: w0 */
    public static final int[] f42769w0 = {2130969119, 2130969234};

    /* renamed from: x0 */
    public static final int[] f42773x0 = {2130969116, 2130969375};

    /* renamed from: y0 */
    public static final int[] f42777y0 = {R.attr.startColor, R.attr.endColor, R.attr.type, R.attr.centerX, R.attr.centerY, R.attr.gradientRadius, R.attr.tileMode, R.attr.centerColor, R.attr.startX, R.attr.startY, R.attr.endX, R.attr.endY};

    /* renamed from: z0 */
    public static final int[] f42781z0 = {R.attr.color, R.attr.offset};

    /* renamed from: A0 */
    public static final int[] f42566A0 = {2130969026};

    /* renamed from: B0 */
    public static final int[] f42570B0 = {2130968633, 2130968705, 2130968897, 2130968918, 2130969535, 2130969669, 2130969670, 2130969679, 2130969976};

    /* renamed from: C0 */
    public static final int[] f42574C0 = {2130969540, 2130969542, 2130969543};

    /* renamed from: D0 */
    public static final int[] f42578D0 = {R.attr.alpha, R.attr.transformPivotX, R.attr.transformPivotY, R.attr.translationX, R.attr.translationY, R.attr.scaleX, R.attr.scaleY, R.attr.rotation, R.attr.rotationX, R.attr.rotationY, R.attr.translationZ, R.attr.elevation, 2130968920, 2130969115, 2130969481, 2130969483, 2130969952, 2130969954};

    /* renamed from: E0 */
    public static final int[] f42582E0 = {R.attr.alpha, R.attr.translationX, R.attr.translationY, R.attr.scaleX, R.attr.scaleY, R.attr.rotation, R.attr.rotationX, R.attr.rotationY, R.attr.translationZ, R.attr.elevation, 2130968920, 2130969115, 2130969481, 2130969483, 2130969952, 2130969954, 2130969978, 2130969979, 2130969980, 2130969981};

    /* renamed from: F0 */
    public static final int[] f42586F0 = new int[0];

    /* renamed from: G0 */
    public static final int[] f42590G0 = new int[0];

    /* renamed from: H0 */
    public static final int[] f42594H0 = new int[0];

    /* renamed from: I0 */
    public static final int[] f42598I0 = {2130968920, 2130968990, 2130969115, 2130969264, 2130969483, 2130969554, 2130969557, 2130969558, 2130969559, 2130969560, 2130969777, 2130969952};

    /* renamed from: J0 */
    public static final int[] f42602J0 = {R.attr.alpha, R.attr.translationX, R.attr.translationY, R.attr.scaleX, R.attr.scaleY, R.attr.rotation, R.attr.rotationX, R.attr.rotationY, R.attr.translationZ, R.attr.elevation, 2130968920, 2130969115, 2130969481, 2130969483, 2130969952, 2130969954, 2130969977, 2130969978, 2130969979, 2130969980};

    /* renamed from: K0 */
    public static final int[] f42606K0 = {2130969115, 2130969483, 2130969484, 2130969485, 2130969517, 2130969519, 2130969520, 2130969956, 2130969957, 2130969958};

    /* renamed from: L0 */
    public static final int[] f42610L0 = {R.attr.orientation, R.attr.layout_width, R.attr.layout_height, R.attr.layout_marginLeft, R.attr.layout_marginTop, R.attr.layout_marginRight, R.attr.layout_marginBottom, R.attr.layout_marginStart, R.attr.layout_marginEnd, 2130968673, 2130968674, 2130968675, 2130968792, 2130968879, 2130969282, 2130969283, 2130969284, 2130969285, 2130969286, 2130969287, 2130969288, 2130969289, 2130969290, 2130969291, 2130969292, 2130969293, 2130969294, 2130969295, 2130969296, 2130969297, 2130969298, 2130969299, 2130969300, 2130969301, 2130969302, 2130969303, 2130969304, 2130969305, 2130969306, 2130969307, 2130969308, 2130969309, 2130969310, 2130969311, 2130969312, 2130969314, 2130969315, 2130969316, 2130969317, 2130969318, 2130969319, 2130969320, 2130969321, 2130969322, 2130969323, 2130969325, 2130969326, 2130969330, 2130969331, 2130969332, 2130969333, 2130969334, 2130969335, 2130969409, 2130969414, 2130969467, 2130969471};

    /* renamed from: M0 */
    public static final int[] f42614M0 = {2130969122, 2130969123, 2130969124, 2130969125, 2130969126, 2130969127, 2130969128, 2130969129, 2130969130, 2130969131, 2130969132, 2130969133, 2130969134, 2130969135, 2130969136, 2130969137, 2130969138, 2130969139, 2130969140, 2130969141, 2130969142, 2130969143, 2130969144, 2130969145, 2130969146, 2130969147, 2130969148, 2130969149, 2130969150, 2130969151, 2130969152, 2130969153, 2130969154, 2130969155, 2130969156, 2130969157, 2130969158, 2130969159, 2130969160, 2130969161, 2130969162, 2130969163, 2130969164, 2130969165, 2130969166, 2130969167, 2130969168, 2130969169, 2130969170, 2130969171, 2130969172};

    /* renamed from: N0 */
    public static final int[] f42618N0 = {2130969523, 2130969524, 2130969525, 2130969526, 2130969527, 2130969528, 2130969529, 2130969530, 2130969531};

    /* renamed from: O0 */
    public static final int[] f42622O0 = {2130968676, 2130968706, 2130968707, 2130968708, 2130968709, 2130968710, 2130968711, 2130968712, 2130968713, 2130968714, 2130968715, C9788a.f44918a, 2130968938, 2130968939, 2130968943, 2130968944, 2130968945, 2130968946, 2130968947, 2130968956, 2130968957, 2130968958, 2130968959, 2130969033, 2130969176, 2130969177, 2130969212, 2130969213, 2130969214, 2130969215, 2130969216, 2130969217, 2130969260, 2130969536, 2130969537, 2130969538, 2130969586, 2130969587, 2130969588, 2130969589, 2130969590, 2130969591, 2130969592, 2130969593, 2130969594, 2130969595, 2130969596, 2130969597, 2130969598, 2130969599, 2130969600, 2130969601, 2130969602, 2130969603, 2130969604, 2130969605, 2130969606, 2130969607, 2130969671, 2130969672, C9788a.f44919b, 2130969675, 2130969676, 2130969677, 2130969678, C9788a.f44920c, 2130969697};

    /* renamed from: P0 */
    public static final int[] f42626P0 = {R.attr.gravity, R.attr.orientation, R.attr.baselineAligned, R.attr.baselineAlignedChildIndex, R.attr.weightSum, 2130968970, 2130968975, 2130969444, 2130969753};

    /* renamed from: Q0 */
    public static final int[] f42630Q0 = {R.attr.layout_gravity, R.attr.layout_width, R.attr.layout_height, R.attr.layout_weight};

    /* renamed from: R0 */
    public static final int[] f42634R0 = {2130969218, 2130969222};

    /* renamed from: S0 */
    public static final int[] f42638S0 = {R.attr.dropDownHorizontalOffset, R.attr.dropDownVerticalOffset};

    /* renamed from: T0 */
    public static final int[] f42642T0 = {R.attr.entries, R.attr.entryValues, 2130969025, 2130969027, 2130969966};

    /* renamed from: U0 */
    public static final int[] f42646U0 = {2130969409};

    /* renamed from: V0 */
    public static final int[] f42650V0 = {2130968824, 2130969209, 2130969210};

    /* renamed from: W0 */
    public static final int[] f42654W0 = {2130969439};

    /* renamed from: X0 */
    public static final int[] f42658X0 = {2130969462};

    /* renamed from: Y0 */
    public static final int[] f42662Y0 = {2130968657, 2130968658, 2130968659, 2130968660};

    /* renamed from: Z0 */
    public static final int[] f42666Z0 = {2130969377, 2130969378, 2130969379, 2130969380, 2130969381};

    /* renamed from: a1 */
    public static final int[] f42671a1 = {R.attr.inputType};

    /* renamed from: b1 */
    public static final int[] f42676b1 = {R.attr.background, R.attr.insetLeft, R.attr.insetRight, R.attr.insetTop, R.attr.insetBottom, R.attr.checkable, 2130968664, 2130968665, 2130968906, 2130969010, 2130969199, 2130969201, 2130969202, 2130969203, 2130969206, 2130969207, 2130969668, 2130969720, 2130969723, 2130969808, 2130969809};

    /* renamed from: c1 */
    public static final int[] f42681c1 = {2130968795, 2130969707, 2130969776};

    /* renamed from: d1 */
    public static final int[] f42686d1 = {R.attr.windowFullscreen, 2130968934, 2130968935, 2130968936, 2130968937, C0142b.f664x, 2130969641, 2130969993, 2130969994, 2130969995};

    /* renamed from: e1 */
    public static final int[] f42691e1 = {R.attr.insetLeft, R.attr.insetRight, R.attr.insetTop, R.attr.insetBottom, 2130969237, 2130969246, 2130969247, 2130969254, 2130969255, 2130969259};

    /* renamed from: f1 */
    public static final int[] f42696f1 = {R.attr.checkable, 2130968738, 2130968797, 2130968799, 2130968800, 2130968801, 2130969668, 2130969720, 2130969723, C0142b.f633B, 2130969808, 2130969809};

    /* renamed from: g1 */
    public static final int[] f42701g1 = {2130968730, 2130969965};

    /* renamed from: h1 */
    public static final int[] f42706h1 = {C6586R.attr.mpb_determinateCircularProgressStyle, C6586R.attr.mpb_indeterminateTint, C6586R.attr.mpb_indeterminateTintMode, C6586R.attr.mpb_progressBackgroundTint, C6586R.attr.mpb_progressBackgroundTintMode, C6586R.attr.mpb_progressStyle, C6586R.attr.mpb_progressTint, C6586R.attr.mpb_progressTintMode, C6586R.attr.mpb_secondaryProgressTint, C6586R.attr.mpb_secondaryProgressTintMode, C6586R.attr.mpb_setBothDrawables, C6586R.attr.mpb_showProgressBackground, C6586R.attr.mpb_useIntrinsicPadding};

    /* renamed from: i1 */
    public static final int[] f42711i1 = {2130968730, 2130969965};

    /* renamed from: j1 */
    public static final int[] f42716j1 = {2130969720, 2130969723};

    /* renamed from: k1 */
    public static final int[] f42721k1 = {R.attr.letterSpacing, R.attr.lineHeight, 2130969354};

    /* renamed from: l1 */
    public static final int[] f42726l1 = {R.attr.textAppearance, R.attr.lineHeight, 2130969354};

    /* renamed from: m1 */
    public static final int[] f42730m1 = {2130968834, 2130969265};

    /* renamed from: n1 */
    public static final int[] f42734n1 = {2130969504};

    /* renamed from: o1 */
    public static final int[] f42738o1 = {2130969463, 2130969464};

    /* renamed from: p1 */
    public static final int[] f42742p1 = {R.attr.minWidth, R.attr.minHeight, 2130969049, 2130969050, 2130969448};

    /* renamed from: q1 */
    public static final int[] f42746q1 = {R.attr.enabled, R.attr.id, R.attr.visible, R.attr.menuCategory, R.attr.orderInCategory, R.attr.checkableBehavior};

    /* renamed from: r1 */
    public static final int[] f42750r1 = {R.attr.icon, R.attr.enabled, R.attr.id, R.attr.checked, R.attr.visible, R.attr.menuCategory, R.attr.orderInCategory, R.attr.title, R.attr.titleCondensed, R.attr.alphabeticShortcut, R.attr.numericShortcut, R.attr.checkable, R.attr.onClick, 2130968593, 2130968613, 2130968615, 2130968632, 2130968882, 2130969206, 2130969207, 2130969516, 2130969748, 2130969937};

    /* renamed from: s1 */
    public static final int[] f42754s1 = {R.attr.windowAnimationStyle, R.attr.itemTextAppearance, R.attr.horizontalDivider, R.attr.verticalDivider, R.attr.headerBackground, R.attr.itemBackground, R.attr.itemIconDisabledAlpha, 2130969632, 2130969810};

    /* renamed from: t1 */
    public static final int[] f42758t1 = {2130969472, 2130969473, 2130969474, 2130969475, 2130969476, 2130969477};

    /* renamed from: u1 */
    public static final int[] f42762u1 = {2130968634, 2130968990, 2130969480, 2130969482, 2130969554, 2130969952};

    /* renamed from: v1 */
    public static final int[] f42766v1 = {2130969518, 2130969521};

    /* renamed from: w1 */
    public static final int[] f42770w1 = {2130968638, 2130968919, 2130969273, 2130969478, 2130969481, 2130969755};

    /* renamed from: x1 */
    public static final int[] f42774x1 = {2130968940, 2130969274};

    /* renamed from: y1 */
    public static final int[] f42778y1 = {2130969861, 2130969862, 2130969863};

    /* renamed from: z1 */
    public static final int[] f42782z1 = {R.attr.src, R.attr.adjustViewBounds, R.attr.title};

    /* renamed from: A1 */
    public static final int[] f42567A1 = {R.attr.entries, R.attr.entryValues, 2130969025, 2130969027};

    /* renamed from: B1 */
    public static final int[] f42571B1 = {2130968666, 2130969357, 2130969507, 2130969657};

    /* renamed from: C1 */
    public static final int[] f42575C1 = {R.attr.id, 2130968955, 2130969024, 2130969036, 2130969271, 2130969611, 2130969612, 2130969613, 2130969614};

    /* renamed from: D1 */
    public static final int[] f42579D1 = {R.attr.name, R.attr.defaultValue, 2130968640, 2130969512};

    /* renamed from: E1 */
    public static final int[] f42583E1 = {R.attr.autoVerify, 2130968579, 2130969465, 2130969962};

    /* renamed from: F1 */
    public static final int[] f42587F1 = {2130969792};

    /* renamed from: G1 */
    public static final int[] f42591G1 = {2130969501};

    /* renamed from: H1 */
    public static final int[] f42595H1 = {2130968941};

    /* renamed from: I1 */
    public static final int[] f42599I1 = {2130969121};

    /* renamed from: J1 */
    public static final int[] f42603J1 = {R.attr.background, R.attr.fitsSystemWindows, R.attr.maxWidth, 2130969010, 2130969175, 2130969236, 2130969238, 2130969240, 2130969241, 2130969242, 2130969243, 2130969246, 2130969247, 2130969248, 2130969249, 2130969250, 2130969251, 2130969252, 2130969256, 2130969259, 2130969461, 2130969720, 2130969723};

    /* renamed from: K1 */
    public static final int[] f42607K1 = {R.attr.label, R.attr.id};

    /* renamed from: L1 */
    public static final int[] f42611L1 = {2130968831, 2130969859};

    /* renamed from: M1 */
    public static final int[] f42615M1 = {2130968987, 2130968988, 2130968989, 2130969353, 2130969405, 2130969413, 2130969486, 2130969509, 2130969522, 2130969938, 2130969939, 2130969940};

    /* renamed from: N1 */
    public static final int[] f42619N1 = {2130969564, 2130969565, 2130969566, 2130969567, 2130969568, 2130969569, 2130969570, 2130969571, 2130969572, 2130969573, 2130969574, 2130969575, 2130969576, 2130969577, 2130969578, 2130969579};

    /* renamed from: O1 */
    public static final int[] f42623O1 = {2130968641, 2130968642, 2130968644, 2130968977, 2130968978, 2130968979, 2130969348};

    /* renamed from: P1 */
    public static final int[] f42627P1 = {2130968618, 2130968619, 2130968671, 2130968672, 2130968717, 2130968899, 2130969608, 2130969609, 2130969660, 2130969684, 2130969685, 2130969686, 2130969687, 2130969688, 2130969760, 2130969761, 2130969762, 2130969763, 2130969764, 2130969766, 2130969917, 2130969941, 2130969960};

    /* renamed from: Q1 */
    public static final int[] f42631Q1 = {2130968618, 2130968619, 2130968654, 2130968672, 2130968717, 2130968899, 2130968950, 2130969187, 2130969188, 2130969262, 2130969608, 2130969609, 2130969610, 2130969660, 2130969662, 2130969684, 2130969685, 2130969686, 2130969687, 2130969688, 2130969759, 2130969764, 2130969766, 2130969770, 2130969823, 2130969917, 2130969941, 2130969960, 2130969968, 2130969969};

    /* renamed from: R1 */
    public static final int[] f42635R1 = {R.attr.popupBackground, R.attr.popupAnimationStyle, 2130969534};

    /* renamed from: S1 */
    public static final int[] f42639S1 = {2130969798};

    /* renamed from: T1 */
    public static final int[] f42643T1 = {R.attr.icon, R.attr.persistent, R.attr.enabled, R.attr.layout, R.attr.title, R.attr.selectable, R.attr.key, R.attr.summary, R.attr.order, R.attr.widgetLayout, R.attr.dependency, R.attr.defaultValue, R.attr.shouldDisableView, R.attr.fragment, R.attr.singleLineTitle, R.attr.iconSpaceReserved, 2130968627, 2130968629, 2130968949, 2130968953, 2130969013, 2130969014, 2130969114, 2130969199, 2130969204, 2130969235, 2130969263, 2130969272, 2130969532, 2130969562, 2130969701, 2130969746, 2130969775, 2130969820, 2130969920, 2130969967, 2130969982};

    /* renamed from: U1 */
    public static final int[] f42647U1 = {R.attr.layout, R.attr.divider, R.attr.dividerHeight, 2130968628};

    /* renamed from: V1 */
    public static final int[] f42651V1 = {R.attr.layout, R.attr.divider, R.attr.dividerHeight, 2130968628};

    /* renamed from: W1 */
    public static final int[] f42655W1 = {R.attr.orderingFromXml, 2130969229, 2130969533};

    /* renamed from: X1 */
    public static final int[] f42659X1 = {R.attr.maxWidth, R.attr.maxHeight, 2130969409, 2130969414};

    /* renamed from: Y1 */
    public static final int[] f42663Y1 = {C7944c.f38211a, C7944c.f38212b, C7944c.f38213c, C7944c.f38214d, C7944c.f38215e, 2130969621, 2130969622, 2130969623, 2130969624, 2130969625, C7944c.f38216f, C7944c.f38217g, 2130969628, C7944c.f38218h, C7944c.f38219i, C7944c.f38220j};

    /* renamed from: Z1 */
    public static final int[] f42667Z1 = {R.attr.visibility, R.attr.alpha, 2130969313, 2130969481, 2130969974};

    /* renamed from: a2 */
    public static final int[] f42672a2 = {2130969400};

    /* renamed from: b2 */
    public static final int[] f42677b2 = {2130969469, 2130969970};

    /* renamed from: c2 */
    public static final int[] f42682c2 = {2130969539, 2130969545};

    /* renamed from: d2 */
    public static final int[] f42687d2 = {R.attr.orientation, R.attr.clipToPadding, R.attr.descendantFocusability, 2130969059, 2130969060, 2130969061, 2130969062, 2130969063, 2130969275, 2130969666, 2130969784, 2130969790};

    /* renamed from: e2 */
    public static final int[] f42692e2 = {2130969645, 2130969646, 2130969647, 2130969648, 2130969649, 2130969650, 2130969651};

    /* renamed from: f2 */
    public static final int[] f42697f2 = {2130969230};

    /* renamed from: g2 */
    public static final int[] f42702g2 = {2130968684};

    /* renamed from: h2 */
    public static final int[] f42707h2 = {R.attr.focusable, R.attr.maxWidth, R.attr.inputType, R.attr.imeOptions, 2130968836, 2130968875, 2130968942, 2130969120, 2130969208, 2130969272, 2130969637, 2130969638, 2130969689, 2130969690, 2130969811, 2130969819, 2130969975};

    /* renamed from: i2 */
    public static final int[] f42712i2 = {R.attr.layout, R.attr.max, 2130968620, 2130969466, 2130969698, 2130969756, 2130969961};

    /* renamed from: j2 */
    public static final int[] f42717j2 = {2130969710, 2130969711, 2130969712, 2130969713, 2130969714, 2130969715, 2130969716, 2130969717, 2130969718, 2130969719};

    /* renamed from: k2 */
    public static final int[] f42722k2 = {2130968901, 2130968902, 2130968903, 2130968904, 2130968905, 2130968907, 2130968908, 2130968909, 2130968910, 2130968911};

    /* renamed from: l2 */
    public static final int[] f42727l2 = {2130968889, 2130968890, 2130968891, 2130968892, 2130968893, 2130968894, 2130968895, 2130969720, 2130969723, 2130969808, 2130969809};

    /* renamed from: m2 */
    public static final int[] f42731m2 = {2130969725, 2130969726, 2130969727, 2130969728, 2130969729, 2130969730, 2130969731, 2130969732, 2130969733, 2130969734, 2130969735, 2130969736, 2130969737, 2130969738, 2130969739, 2130969740, 2130969741, 2130969742, 2130969743, 2130969744};

    /* renamed from: n2 */
    public static final int[] f42735n2 = {2130968727, 2130968732, 2130968869, 2130969680, 2130969864};

    /* renamed from: o2 */
    public static final int[] f42739o2 = {2130969771};

    /* renamed from: p2 */
    public static final int[] f42743p2 = {2130969772};

    /* renamed from: q2 */
    public static final int[] f42747q2 = {R.attr.enabled, R.attr.value, R.attr.stepSize, R.attr.valueFrom, R.attr.valueTo, 2130969173, 2130969174, 2130969267, 2130969268, 2130969898, 2130969899, 2130969900, 2130969901, 2130969902, 2130969910, 2130969911, 2130969912, 2130969916, 2130969943, 2130969944, 2130969945, 2130969947};

    /* renamed from: r2 */
    public static final int[] f42751r2 = {2130969781, 2130969782, 2130969783};

    /* renamed from: s2 */
    public static final int[] f42755s2 = {R.attr.maxWidth, 2130968614, 2130968635, 2130968661, 2130968664, 2130968665, 2130969010, 2130969406};

    /* renamed from: t2 */
    public static final int[] f42759t2 = {2130968577, 2130968578};

    /* renamed from: u2 */
    public static final int[] f42763u2 = {R.attr.entries, R.attr.popupBackground, R.attr.prompt, R.attr.dropDownWidth, 2130969617};

    /* renamed from: v2 */
    public static final int[] f42767v2 = {2130968930, 2130968980, 2130968981, 2130968982, 2130968983, 2130968984, 2130968985, 2130969807};

    /* renamed from: w2 */
    public static final int[] f42771w2 = {R.attr.id, 2130968880};

    /* renamed from: x2 */
    public static final int[] f42775x2 = {R.attr.dither, R.attr.visible, R.attr.variablePadding, R.attr.constantSize, R.attr.enterFadeDuration, R.attr.exitFadeDuration};

    /* renamed from: y2 */
    public static final int[] f42779y2 = {R.attr.drawable};

    /* renamed from: z2 */
    public static final int[] f42783z2 = {2130968948};

    /* renamed from: A2 */
    public static final int[] f42568A2 = {2130968618, 2130968619, 2130968636, 2130968671, 2130968672, 2130968717, 2130968899, 2130969608, 2130969609, 2130969660, 2130969684, 2130969685, 2130969686, 2130969687, 2130969688, 2130969760, 2130969761, 2130969762, 2130969763, 2130969764, 2130969765, 2130969766, 2130969767, 2130969917, 2130969941, 2130969960};

    /* renamed from: B2 */
    public static final int[] f42572B2 = {2130968618, 2130968619, 2130968636, 2130968654, 2130968671, 2130968672, 2130968717, 2130968899, 2130968950, 2130969187, 2130969188, 2130969262, 2130969608, 2130969609, 2130969610, 2130969660, 2130969662, 2130969684, 2130969685, 2130969686, 2130969687, 2130969688, 2130969759, 2130969764, 2130969765, 2130969766, 2130969767, 2130969770, 2130969823, 2130969917, 2130969941, 2130969960, 2130969968, 2130969969};

    /* renamed from: C2 */
    public static final int[] f42576C2 = {R.attr.textOn, R.attr.textOff, R.attr.thumb, 2130969757, 2130969788, 2130969824, 2130969825, 2130969829, 2130969903, 2130969904, 2130969905, 2130969942, 2130969949, 2130969950};

    /* renamed from: D2 */
    public static final int[] f42580D2 = {2130969965};

    /* renamed from: E2 */
    public static final int[] f42584E2 = {R.attr.summaryOn, R.attr.summaryOff, R.attr.disableDependentsState, R.attr.switchTextOn, R.attr.switchTextOff, 2130968968, 2130969821, 2130969822, 2130969830, 2130969831};

    /* renamed from: F2 */
    public static final int[] f42588F2 = {R.attr.summaryOn, R.attr.summaryOff, R.attr.disableDependentsState, R.attr.switchTextOn, R.attr.switchTextOff, 2130968968, 2130969821, 2130969822, 2130969830, 2130969831};

    /* renamed from: G2 */
    public static final int[] f42592G2 = {R.attr.icon, R.attr.layout, R.attr.text};

    /* renamed from: H2 */
    public static final int[] f42596H2 = {2130969832, 2130969833, 2130969834, 2130969835, 2130969836, 2130969837, 2130969838, 2130969839, 2130969840, 2130969841, 2130969842, 2130969843, 2130969844, 2130969845, 2130969846, 2130969847, 2130969848, 2130969849, 2130969850, 2130969851, 2130969852, 2130969853, 2130969854, 2130969856, 2130969857, 2130969858};

    /* renamed from: I2 */
    public static final int[] f42600I2 = {R.attr.textSize, R.attr.typeface, R.attr.textStyle, R.attr.textColor, R.attr.textColorHint, R.attr.textColorLink, R.attr.shadowColor, R.attr.shadowDx, R.attr.shadowDy, R.attr.shadowRadius, R.attr.fontFamily, R.attr.textFontWeight, 2130969101, 2130969110, 2130969865, 2130969893};

    /* renamed from: J2 */
    public static final int[] f42604J2 = {2130969891};

    /* renamed from: K2 */
    public static final int[] f42608K2 = {R.attr.enabled, R.attr.textColorHint, R.attr.hint, 2130968694, 2130968695, 2130968696, 2130968697, 2130968698, 2130968699, 2130968700, 2130968701, 2130968702, 2130968703, 2130968704, 2130968912, 2130968913, 2130968914, 2130968915, 2130968916, 2130968917, 2130969015, 2130969016, 2130969017, 2130969018, 2130969019, 2130969020, 2130969028, 2130969029, 2130969030, 2130969031, 2130969032, 2130969034, 2130969035, 2130969039, 2130969179, 2130969180, 2130969181, 2130969182, 2130969190, 2130969191, 2130969192, 2130969193, 2130969549, 2130969550, 2130969551, 2130969552, 2130969553, 2130969581, 2130969582, 2130969583, 2130969629, 2130969630, 2130969631, 2130969720, 2130969723, 2130969793, 2130969794, 2130969795, 2130969796, 2130969797, 2130969816, 2130969817, 2130969818};

    /* renamed from: L2 */
    public static final int[] f42612L2 = {R.attr.textAppearance, 2130969021, 2130969022};

    /* renamed from: M2 */
    public static final int[] f42616M2 = {R.attr.gravity, R.attr.minHeight, 2130968724, 2130968845, 2130968846, 2130968883, 2130968884, 2130968885, 2130968886, 2130968887, 2130968888, 2130969373, 2130969374, 2130969407, 2130969461, 2130969502, 2130969503, 2130969617, 2130969812, 2130969813, 2130969814, 2130969920, 2130969922, 2130969923, 2130969924, 2130969925, 2130969926, 2130969927, 2130969928, 2130969929};

    /* renamed from: N2 */
    public static final int[] f42620N2 = {R.attr.textAppearance, R.attr.padding, R.attr.layout_margin, R.attr.minWidth, R.attr.minHeight, R.attr.text, 2130968664};

    /* renamed from: O2 */
    public static final int[] f42624O2 = {R.attr.transformPivotX, R.attr.transformPivotY, R.attr.translationX, R.attr.translationY, R.attr.scaleX, R.attr.scaleY, R.attr.rotation, R.attr.rotationX, R.attr.rotationY, R.attr.translationZ, R.attr.elevation};

    /* renamed from: P2 */
    public static final int[] f42628P2 = {R.attr.id, 2130968653, 2130968877, 2130968878, 2130969005, 2130969274, 2130969479, 2130969554, 2130969791, 2130969951, 2130969953};

    /* renamed from: Q2 */
    public static final int[] f42632Q2 = {2130968880, 2130969653, 2130969654, 2130969655, 2130969656};

    /* renamed from: R2 */
    public static final int[] f42636R2 = {R.attr.theme, R.attr.focusable, 2130969541, 2130969544, 2130969895};

    /* renamed from: S2 */
    public static final int[] f42640S2 = {R.attr.background, 2130968664, 2130968665};

    /* renamed from: T2 */
    public static final int[] f42644T2 = {R.attr.orientation};

    /* renamed from: U2 */
    public static final int[] f42648U2 = {R.attr.id, R.attr.layout, R.attr.inflatedId};

    /* renamed from: V2 */
    public static final int[] f42652V2 = {2130968980, 2130968981, 2130968982, 2130968983, 2130968984, 2130968985};

    /* renamed from: W2 */
    public static final int[] f42656W2 = {2130968616, 2130968733, 2130968737, 2130968741, 2130969051, 2130969227, 2130969704, 2130969705};

    /* renamed from: X2 */
    public static final int[] f42660X2 = {2130969346};

    /* renamed from: Y2 */
    public static final int[] f42664Y2 = {R.attr.gravity, R.attr.horizontalSpacing, R.attr.verticalSpacing, 2130969096, 2130969097, 2130969098, 2130969099, 2130969196, 2130969971};

    /* renamed from: Z2 */
    public static final int[] f42668Z2 = {R.attr.minDate, R.attr.maxDate, 2130968933};

    /* renamed from: a3 */
    public static final int[] f42673a3 = {2130969515, 2130969674};

    /* renamed from: b3 */
    public static final int[] f42678b3 = {2130969226, 2130969349};

    /* renamed from: c3 */
    public static final int[] f42683c3 = {2130968844, 2130969064, 2130969189, 2130969556, 2130969563, 2130969585, 2130969658, 2130969659, 2130969667, 2130969769, 2130969778, 2130969779, 2130969906, 2130969907, 2130969908, 2130969909};

    /* renamed from: d3 */
    public static final int[] f42688d3 = {2130969376, 2130969661, 2130969663, 2130969664, 2130969665};

    /* renamed from: e3 */
    public static final int[] f42693e3 = {2130969691, 2130969692, 2130969693, 2130969694};

    /* renamed from: f3 */
    public static final int[] f42698f3 = {R.attr.interpolator, R.attr.duration, R.attr.startDelay, 2130969350};

    /* renamed from: g3 */
    public static final int[] f42703g3 = {2130969231, 2130969964};

    /* renamed from: h3 */
    public static final int[] f42708h3 = {2130968874, 2130969514};

    /* renamed from: i3 */
    public static final int[] f42713i3 = {2130969996, 2130969997, 2130969999, 2130970002};

    /* renamed from: j3 */
    public static final int[] f42718j3 = {2130969998, 2130970000, 2130970003, 2130970004, 2130970005};

    /* renamed from: k3 */
    public static final int[] f42723k3 = {2130970001};

    private static long[] $d2j$hex$b7fab1ac$decode_J(String src) {
        byte[] d10 = $d2j$hex$b7fab1ac$decode_B(src);
        ByteBuffer b10 = ByteBuffer.wrap(d10);
        b10.order(ByteOrder.LITTLE_ENDIAN);
        LongBuffer s10 = b10.asLongBuffer();
        long[] data = new long[d10.length / 8];
        s10.get(data);
        return data;
    }

    private static int[] $d2j$hex$b7fab1ac$decode_I(String src) {
        byte[] d10 = $d2j$hex$b7fab1ac$decode_B(src);
        ByteBuffer b10 = ByteBuffer.wrap(d10);
        b10.order(ByteOrder.LITTLE_ENDIAN);
        IntBuffer s10 = b10.asIntBuffer();
        int[] data = new int[d10.length / 4];
        s10.get(data);
        return data;
    }

    private static short[] $d2j$hex$b7fab1ac$decode_S(String src) {
        byte[] d10 = $d2j$hex$b7fab1ac$decode_B(src);
        ByteBuffer b10 = ByteBuffer.wrap(d10);
        b10.order(ByteOrder.LITTLE_ENDIAN);
        ShortBuffer s10 = b10.asShortBuffer();
        short[] data = new short[d10.length / 2];
        s10.get(data);
        return data;
    }

    private static byte[] $d2j$hex$b7fab1ac$decode_B(String src) {
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
