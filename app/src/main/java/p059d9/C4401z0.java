package p059d9;

import android.app.Activity;
import android.app.UiModeManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.SystemClock;
import android.p016os.LocaleList;
import android.security.NetworkSecurityPolicy;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.view.Display;
import android.view.Display$Mode;
import android.view.WindowManager;
import com.amazonaws.mobileconnectors.appsync.AWSAppSyncClient;
import com.amazonaws.mobileconnectors.p044s3.transferutility.TransferTable;
import com.amazonaws.services.p045s3.model.InstructionFileId;
import ec.C4699b;
import ec.C4701d;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import java.nio.ShortBuffer;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Formatter;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.TimeZone;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.commons.net.telnet.TelnetCommand;
import org.apache.http.HttpHost;
import org.apache.http.HttpStatus;
import org.apache.http.impl.auth.NTLMEngineImpl;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.joda.time.DateTimeConstants;
import org.simpleframework.xml.strategy.Name;
import p027b9.InterfaceC0854m;
import p267p6.C7561b1;
import p267p6.C7583h;
import p267p6.C7594k1;
import p267p6.C7629w0;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:d9/z0.class
 */
/* renamed from: d9.z0 */
/* loaded from: combined.jar:classes2.jar:d9/z0.class */
public final class C4401z0 {

    /* renamed from: a */
    public static final int f26679a;

    /* renamed from: b */
    public static final String f26680b;

    /* renamed from: c */
    public static final String f26681c;

    /* renamed from: d */
    public static final String f26682d;

    /* renamed from: e */
    public static final String f26683e;

    /* renamed from: f */
    public static final byte[] f26684f;

    /* renamed from: g */
    public static final Pattern f26685g;

    /* renamed from: h */
    public static final Pattern f26686h;

    /* renamed from: i */
    public static final Pattern f26687i;

    /* renamed from: j */
    public static final Pattern f26688j;

    /* renamed from: k */
    public static HashMap<String, String> f26689k;

    /* renamed from: l */
    public static final String[] f26690l;

    /* renamed from: m */
    public static final String[] f26691m;

    /* renamed from: n */
    public static final int[] f26692n;

    /* renamed from: o */
    public static final int[] f26693o;

    static {
        String str = Build.VERSION.CODENAME;
        int i10 = "S".equals(str) ? 31 : "R".equals(str) ? 30 : Build.VERSION.SDK_INT;
        f26679a = i10;
        String str2 = Build.DEVICE;
        f26680b = str2;
        String str3 = Build.MANUFACTURER;
        f26681c = str3;
        String str4 = Build.MODEL;
        f26682d = str4;
        f26683e = str2 + ", " + str4 + ", " + str3 + ", " + i10;
        f26684f = new byte[0];
        f26685g = Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");
        f26686h = Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
        f26687i = Pattern.compile("%([A-Fa-f0-9]{2})");
        f26688j = Pattern.compile(".*\\.isml?(?:/(manifest(.*))?)?");
        f26690l = new String[]{"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", "de", "gre", "el", "fre", "fr", "geo", "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", Name.MARK, "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "in", "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", "bs", "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn"};
        f26691m = new String[]{"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};
        f26692n = $d2j$hex$44723900$decode_I("00000000b71dc1046e3b8209d926430ddc7604136b6bc517b24d861a0550471eb8ed08260ff0c922d6d68a2f61cb4b2b649b0c35d386cd310aa08e3cbdbd4f3870db114cc7c6d0481ee09345a9fd5241acad155f1bb0d45bc2969756758b5652c836196a7f2bd86ea60d9b6311105a6714401d79a35ddc7d7a7b9f70cd665e74e0b6239857abe29c8e8da191399060953cc0278b8bdde68f52fba582e5e66486585b2bbeef46eaba3660a9b7817d68b3842d2fad3330eea9ea16ada45d0b6ca0906d32d42770f3d0fe56b0dd494b71d94c1b36c7fb06f7c32220b4ce953d75ca28803af29f9dfbf646bbb8fbf1a679fff4f63ee143ebffe59acdbce82dd07dec77708634c06d4730194b043dae56c539ab0682271c1b4323c53d002e7220c12acf9d8e1278804f16a1a60c1b16bbcd1f13eb8a01a4f64b057dd00808cacdc90c07ab9778b0b6567c69901571de8dd475dbdd936b6cc0526fb5e6116202fbd066bf469f5e085b5e5ad17d1d576660dc5363309b4dd42d5a490d0b1944ba16d84097c6a5ac20db64a8f9fd27a54ee0e6a14bb0a1bffcad60bb258b23b69296e2b22f2bad8a98366c8e41102f83f60dee87f35da9994440689d9d662b902a7bea94e71db4e0500075e4892636e93e3bf7ed3b6bb0f38c7671f7555032fae24df3fe5ff0bcc6e8ed7dc231cb3ecf86d6ffcb8386b8d5349b79d1edbd3adc5aa0fbd8eee00c6959fdcd6d80db8e6037c64f643296087a858bc97e5cad8a73ebb04b77560d044fe110c54b383686468f2b47428a7b005c3d66c158e4408255535d43519e3b1d252926dc21f0009f2c471d5e28424d1936f550d8322c769b3f9b6b5a3b26d6150391cbd40748ed970afff0560efaa011104dbdd014949b93192386521d0e562ff1b94beef5606dadf8d7706cfcd2202be2653deae6bc1ba9eb0b0668efb6bb27d701a6e6d3d880a5de6f9d64da6acd23c4ddd0e2c004f6a1cdb3eb60c97e8d3ebdc990ffb910b6bcb4a7ab7db0a2fb3aae15e6fbaaccc0b8a77bdd79a3c660369b717df79fa85bb4921f4675961a163288ad0bf38c742db081c330718599908a5d2e8d4b59f7ab085440b6c95045e68e4ef2fb4f4a2bdd0c479cc0cd43217d827b9660437f4f460072f85bc176fd0b86684a16476c93300461242dc565e94b9b115e565a1587701918306dd81c353d9f0282205e065b061d0bec1bdc0f51a69337e6bb52333f9d113e8880d03a8dd097243acd5620e3eb152d54f6d4297926a9c5ce3b68c1171d2bcca000eac8a550add6124d6cd2cb6b2fdf7c76eedbc1cba1e376d660e7aff023ea18ede2ee1dbda5f0aaa064f4738627f9c49be6fd09fdb889bee0798d67c63a80d0dbfb84d58bbc9a62967d9ebbb03e930cadff97b110b0af060d71abdf2b32a66836f3a26d66b4bcda7b75b8035d36b5b440f7b1");
        f26693o = $d2j$hex$44723900$decode_I("00000000070000000e000000090000001c0000001b0000001200000015000000380000003f000000360000003100000024000000230000002a0000002d00000070000000770000007e000000790000006c0000006b0000006200000065000000480000004f000000460000004100000054000000530000005a0000005d000000e0000000e7000000ee000000e9000000fc000000fb000000f2000000f5000000d8000000df000000d6000000d1000000c4000000c3000000ca000000cd00000090000000970000009e000000990000008c0000008b0000008200000085000000a8000000af000000a6000000a1000000b4000000b3000000ba000000bd000000c7000000c0000000c9000000ce000000db000000dc000000d5000000d2000000ff000000f8000000f1000000f6000000e3000000e4000000ed000000ea000000b7000000b0000000b9000000be000000ab000000ac000000a5000000a20000008f00000088000000810000008600000093000000940000009d0000009a0000002700000020000000290000002e0000003b0000003c00000035000000320000001f00000018000000110000001600000003000000040000000d0000000a0000005700000050000000590000005e0000004b0000004c00000045000000420000006f00000068000000610000006600000073000000740000007d0000007a000000890000008e000000870000008000000095000000920000009b0000009c000000b1000000b6000000bf000000b8000000ad000000aa000000a3000000a4000000f9000000fe000000f7000000f0000000e5000000e2000000eb000000ec000000c1000000c6000000cf000000c8000000dd000000da000000d3000000d4000000690000006e000000670000006000000075000000720000007b0000007c00000051000000560000005f000000580000004d0000004a0000004300000044000000190000001e000000170000001000000005000000020000000b0000000c00000021000000260000002f000000280000003d0000003a00000033000000340000004e00000049000000400000004700000052000000550000005c0000005b0000007600000071000000780000007f0000006a0000006d00000064000000630000003e00000039000000300000003700000022000000250000002c0000002b0000000600000001000000080000000f0000001a0000001d0000001400000013000000ae000000a9000000a0000000a7000000b2000000b5000000bc000000bb0000009600000091000000980000009f0000008a0000008d0000008400000083000000de000000d9000000d0000000d7000000c2000000c5000000cc000000cb000000e6000000e1000000e8000000ef000000fa000000fd000000f4000000f3000000");
    }

    /* renamed from: A */
    public static Handler m22313A() {
        return m22315B(null);
    }

    /* renamed from: A0 */
    public static boolean m22314A0(Activity activity, Uri... uriArr) {
        if (f26679a < 23) {
            return false;
        }
        for (Uri uri : uriArr) {
            if (m22414u0(uri)) {
                return m22344P0(activity);
            }
        }
        return false;
    }

    /* renamed from: B */
    public static Handler m22315B(Handler.Callback callback) {
        return m22419x(m22347R(), callback);
    }

    /* renamed from: B0 */
    public static boolean m22316B0(Activity activity, C7561b1... c7561b1Arr) {
        if (f26679a < 23) {
            return false;
        }
        for (C7561b1 c7561b1 : c7561b1Arr) {
            C7561b1.g gVar = c7561b1.f36449b;
            if (gVar != null) {
                if (m22414u0(gVar.f36504a)) {
                    return m22344P0(activity);
                }
                for (int i10 = 0; i10 < c7561b1.f36449b.f36510g.size(); i10++) {
                    if (m22414u0(c7561b1.f36449b.f36510g.get(i10).f36512a)) {
                        return m22344P0(activity);
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: C */
    public static HashMap<String, String> m22317C() {
        int i10;
        String[] iSOLanguages = Locale.getISOLanguages();
        HashMap<String, String> hashMap = new HashMap<>(iSOLanguages.length + f26690l.length);
        int length = iSOLanguages.length;
        int i11 = 0;
        while (true) {
            i10 = 0;
            if (i11 >= length) {
                break;
            }
            String str = iSOLanguages[i11];
            try {
                String iSO3Language = new Locale(str).getISO3Language();
                if (!TextUtils.isEmpty(iSO3Language)) {
                    hashMap.put(iSO3Language, str);
                }
            } catch (MissingResourceException e10) {
            }
            i11++;
        }
        while (true) {
            String[] strArr = f26690l;
            if (i10 >= strArr.length) {
                return hashMap;
            }
            hashMap.put(strArr[i10], strArr[i10 + 1]);
            i10 += 2;
        }
    }

    /* renamed from: C0 */
    public static <T> void m22318C0(List<T> list, int i10, int i11, int i12) {
        ArrayDeque arrayDeque = new ArrayDeque();
        for (int i13 = (i11 - i10) - 1; i13 >= 0; i13--) {
            arrayDeque.addFirst(list.remove(i10 + i13));
        }
        list.addAll(Math.min(i12, list.size()), arrayDeque);
    }

    /* renamed from: D */
    public static Uri m22319D(Uri uri) {
        String path = uri.getPath();
        if (path == null) {
            return uri;
        }
        Matcher matcher = f26688j.matcher(C4699b.m23638e(path));
        Uri uri2 = uri;
        if (matcher.matches()) {
            uri2 = uri;
            if (matcher.group(1) == null) {
                uri2 = Uri.withAppendedPath(uri, "Manifest");
            }
        }
        return uri2;
    }

    /* renamed from: D0 */
    public static ExecutorService m22320D0(final String str) {
        return Executors.newSingleThreadExecutor(new ThreadFactory(str) { // from class: d9.y0

            /* renamed from: a */
            public final String f26671a;

            {
                this.f26671a = str;
            }

            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                Thread m22420x0;
                m22420x0 = C4401z0.m22420x0(this.f26671a, runnable);
                return m22420x0;
            }
        });
    }

    /* renamed from: E */
    public static String m22321E(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0099, code lost:
    
        if ("zh".equals(r5) != false) goto L24;
     */
    /* renamed from: E0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String m22322E0(java.lang.String r4) {
        /*
            r0 = r4
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            r0 = r4
            r1 = 95
            r2 = 45
            java.lang.String r0 = r0.replace(r1, r2)
            r6 = r0
            r0 = r4
            r5 = r0
            r0 = r6
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L29
            r0 = r6
            java.lang.String r1 = "und"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L27
            r0 = r4
            r5 = r0
            goto L29
        L27:
            r0 = r6
            r5 = r0
        L29:
            r0 = r5
            java.lang.String r0 = ec.C4699b.m23638e(r0)
            r8 = r0
            r0 = r8
            java.lang.String r1 = "-"
            java.lang.String[] r0 = m22358W0(r0, r1)
            r1 = 0
            r0 = r0[r1]
            r7 = r0
            java.util.HashMap<java.lang.String, java.lang.String> r0 = p059d9.C4401z0.f26689k
            if (r0 != 0) goto L46
            java.util.HashMap r0 = m22317C()
            p059d9.C4401z0.f26689k = r0
        L46:
            java.util.HashMap<java.lang.String, java.lang.String> r0 = p059d9.C4401z0.f26689k
            r1 = r7
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            r6 = r0
            r0 = r7
            r5 = r0
            r0 = r8
            r4 = r0
            r0 = r6
            if (r0 == 0) goto L7d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r4 = r0
            r0 = r4
            r1 = r6
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r4
            r1 = r8
            r2 = r7
            int r2 = r2.length()
            java.lang.String r1 = r1.substring(r2)
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r4
            java.lang.String r0 = r0.toString()
            r4 = r0
            r0 = r6
            r5 = r0
        L7d:
            java.lang.String r0 = "no"
            r1 = r5
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L9c
            java.lang.String r0 = "i"
            r1 = r5
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L9c
            r0 = r4
            r6 = r0
            java.lang.String r0 = "zh"
            r1 = r5
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto La1
        L9c:
            r0 = r4
            java.lang.String r0 = m22424z0(r0)
            r6 = r0
        La1:
            r0 = r6
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p059d9.C4401z0.m22322E0(java.lang.String):java.lang.String");
    }

    /* renamed from: F */
    public static String m22323F(byte[] bArr) {
        return new String(bArr, C4701d.f27717c);
    }

    /* renamed from: F0 */
    public static <T> T[] m22324F0(T[] tArr, T t10) {
        Object[] copyOf = Arrays.copyOf(tArr, tArr.length + 1);
        copyOf[tArr.length] = t10;
        return (T[]) m22393k(copyOf);
    }

    /* renamed from: G */
    public static String m22325G(byte[] bArr, int i10, int i11) {
        return new String(bArr, i10, i11, C4701d.f27717c);
    }

    /* renamed from: G0 */
    public static <T> T[] m22326G0(T[] tArr, T[] tArr2) {
        T[] tArr3 = (T[]) Arrays.copyOf(tArr, tArr.length + tArr2.length);
        System.arraycopy(tArr2, 0, tArr3, tArr.length, tArr2.length);
        return tArr3;
    }

    /* renamed from: H */
    public static String m22327H(int i10) {
        if (i10 == 0) {
            return "application/dash+xml";
        }
        if (i10 == 1) {
            return "application/vnd.ms-sstr+xml";
        }
        if (i10 != 2) {
            return null;
        }
        return "application/x-mpegURL";
    }

    /* renamed from: H0 */
    public static <T> T[] m22328H0(T[] tArr, int i10) {
        C4349a.m21878a(i10 <= tArr.length);
        return (T[]) Arrays.copyOf(tArr, i10);
    }

    /* renamed from: I */
    public static int m22329I(int i10) {
        switch (i10) {
            case 1:
                return 4;
            case 2:
                return 12;
            case 3:
                return 28;
            case 4:
                return HttpStatus.SC_NO_CONTENT;
            case 5:
                return 220;
            case 6:
                return TelnetCommand.WONT;
            case 7:
                return 1276;
            case 8:
                int i11 = f26679a;
                return (i11 < 23 && i11 < 21) ? 0 : 6396;
            default:
                return 0;
        }
    }

    /* renamed from: I0 */
    public static <T> T[] m22330I0(T[] tArr, int i10, int i11) {
        C4349a.m21878a(i10 >= 0);
        C4349a.m21878a(i11 <= tArr.length);
        return (T[]) Arrays.copyOfRange(tArr, i10, i11);
    }

    /* renamed from: J */
    public static int m22331J(ByteBuffer byteBuffer, int i10) {
        int i11 = byteBuffer.getInt(i10);
        if (byteBuffer.order() != ByteOrder.BIG_ENDIAN) {
            i11 = Integer.reverseBytes(i11);
        }
        return i11;
    }

    /* renamed from: J0 */
    public static long m22332J0(String str) {
        Matcher matcher = f26685g.matcher(str);
        if (!matcher.matches()) {
            throw C7594k1.m32822a("Invalid date/time format: " + str, null);
        }
        int i10 = 0;
        if (matcher.group(9) != null && !matcher.group(9).equalsIgnoreCase("Z")) {
            int parseInt = (Integer.parseInt(matcher.group(12)) * 60) + Integer.parseInt(matcher.group(13));
            i10 = parseInt;
            if ("-".equals(matcher.group(11))) {
                i10 = parseInt * (-1);
            }
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar(TimeZone.getTimeZone("GMT"));
        gregorianCalendar.clear();
        gregorianCalendar.set(Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2)) - 1, Integer.parseInt(matcher.group(3)), Integer.parseInt(matcher.group(4)), Integer.parseInt(matcher.group(5)), Integer.parseInt(matcher.group(6)));
        if (!TextUtils.isEmpty(matcher.group(8))) {
            gregorianCalendar.set(14, new BigDecimal("0." + matcher.group(8)).movePointRight(3).intValue());
        }
        long timeInMillis = gregorianCalendar.getTimeInMillis();
        long j10 = timeInMillis;
        if (i10 != 0) {
            j10 = timeInMillis - (i10 * DateTimeConstants.MILLIS_PER_MINUTE);
        }
        return j10;
    }

    /* renamed from: K */
    public static byte[] m22333K(String str) {
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = i10 * 2;
            bArr[i10] = (byte) ((Character.digit(str.charAt(i11), 16) << 4) + Character.digit(str.charAt(i11 + 1), 16));
        }
        return bArr;
    }

    /* renamed from: K0 */
    public static long m22334K0(String str) {
        Matcher matcher = f26686h.matcher(str);
        if (!matcher.matches()) {
            return (long) (Double.parseDouble(str) * 3600.0d * 1000.0d);
        }
        boolean isEmpty = TextUtils.isEmpty(matcher.group(1));
        String group = matcher.group(3);
        double d10 = 0.0d;
        double parseDouble = group != null ? Double.parseDouble(group) * 3.1556908E7d : 0.0d;
        String group2 = matcher.group(5);
        double parseDouble2 = group2 != null ? Double.parseDouble(group2) * 2629739.0d : 0.0d;
        String group3 = matcher.group(7);
        double parseDouble3 = group3 != null ? Double.parseDouble(group3) * 86400.0d : 0.0d;
        String group4 = matcher.group(10);
        double parseDouble4 = group4 != null ? Double.parseDouble(group4) * 3600.0d : 0.0d;
        String group5 = matcher.group(12);
        double parseDouble5 = group5 != null ? Double.parseDouble(group5) * 60.0d : 0.0d;
        String group6 = matcher.group(14);
        if (group6 != null) {
            d10 = Double.parseDouble(group6);
        }
        long j10 = (long) ((parseDouble + parseDouble2 + parseDouble3 + parseDouble4 + parseDouble5 + d10) * 1000.0d);
        long j11 = j10;
        if (true ^ isEmpty) {
            j11 = -j10;
        }
        return j11;
    }

    /* renamed from: L */
    public static int m22335L(String str, int i10) {
        String[] m22360X0 = m22360X0(str);
        int length = m22360X0.length;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            int i13 = i12;
            if (i11 >= length) {
                return i13;
            }
            int i14 = i13;
            if (i10 == C4400z.m22306n(m22360X0[i11])) {
                i14 = i13 + 1;
            }
            i11++;
            i12 = i14;
        }
    }

    /* renamed from: L0 */
    public static boolean m22336L0(Handler handler, Runnable runnable) {
        if (!handler.getLooper().getThread().isAlive()) {
            return false;
        }
        if (handler.getLooper() != Looper.myLooper()) {
            return handler.post(runnable);
        }
        runnable.run();
        return true;
    }

    /* renamed from: M */
    public static String m22337M(String str, int i10) {
        String[] m22360X0 = m22360X0(str);
        if (m22360X0.length == 0) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        for (String str2 : m22360X0) {
            if (i10 == C4400z.m22306n(str2)) {
                if (sb2.length() > 0) {
                    sb2.append(",");
                }
                sb2.append(str2);
            }
        }
        return sb2.length() > 0 ? sb2.toString() : null;
    }

    /* renamed from: M0 */
    public static boolean m22338M0(Parcel parcel) {
        return parcel.readInt() != 0;
    }

    /* renamed from: N */
    public static String m22339N(Object[] objArr) {
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < objArr.length; i10++) {
            sb2.append(objArr[i10].getClass().getSimpleName());
            if (i10 < objArr.length - 1) {
                sb2.append(", ");
            }
        }
        return sb2.toString();
    }

    /* renamed from: N0 */
    public static byte[] m22340N0(InterfaceC0854m interfaceC0854m) {
        byte[] bArr = new byte[1024];
        int i10 = 0;
        int i11 = 0;
        while (i10 != -1) {
            byte[] bArr2 = bArr;
            if (i11 == bArr.length) {
                bArr2 = Arrays.copyOf(bArr, bArr.length * 2);
            }
            int read = interfaceC0854m.read(bArr2, i11, bArr2.length - i11);
            bArr = bArr2;
            i10 = read;
            if (read != -1) {
                i11 += read;
                bArr = bArr2;
                i10 = read;
            }
        }
        return Arrays.copyOf(bArr, i11);
    }

    /* renamed from: O */
    public static String m22341O(Context context) {
        TelephonyManager telephonyManager;
        if (context != null && (telephonyManager = (TelephonyManager) context.getSystemService("phone")) != null) {
            String networkCountryIso = telephonyManager.getNetworkCountryIso();
            if (!TextUtils.isEmpty(networkCountryIso)) {
                return C4699b.m23639f(networkCountryIso);
            }
        }
        return C4699b.m23639f(Locale.getDefault().getCountry());
    }

    /* renamed from: O0 */
    public static <T> void m22342O0(List<T> list, int i10, int i11) {
        if (i10 < 0 || i11 > list.size() || i10 > i11) {
            throw new IllegalArgumentException();
        }
        if (i10 != i11) {
            list.subList(i10, i11).clear();
        }
    }

    /* renamed from: P */
    public static Point m22343P(Context context) {
        DisplayManager displayManager;
        Display display = (f26679a < 17 || (displayManager = (DisplayManager) context.getSystemService("display")) == null) ? null : displayManager.getDisplay(0);
        Display display2 = display;
        if (display == null) {
            display2 = ((WindowManager) C4349a.m21882e((WindowManager) context.getSystemService("window"))).getDefaultDisplay();
        }
        return m22345Q(context, display2);
    }

    /* renamed from: P0 */
    public static boolean m22344P0(Activity activity) {
        int checkSelfPermission;
        checkSelfPermission = activity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE");
        if (checkSelfPermission == 0) {
            return false;
        }
        activity.requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 0);
        return true;
    }

    /* renamed from: Q */
    public static Point m22345Q(Context context, Display display) {
        int i10 = f26679a;
        if (i10 <= 29 && display.getDisplayId() == 0 && m22418w0(context)) {
            if ("Sony".equals(f26681c) && f26682d.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                return new Point(3840, 2160);
            }
            String m22394k0 = m22394k0(i10 < 28 ? "sys.display-size" : "vendor.display-size");
            if (!TextUtils.isEmpty(m22394k0)) {
                try {
                    String[] m22356V0 = m22356V0(m22394k0.trim(), "x");
                    if (m22356V0.length == 2) {
                        int parseInt = Integer.parseInt(m22356V0[0]);
                        int parseInt2 = Integer.parseInt(m22356V0[1]);
                        if (parseInt > 0 && parseInt2 > 0) {
                            return new Point(parseInt, parseInt2);
                        }
                    }
                } catch (NumberFormatException e10) {
                }
                C4392v.m22270d("Util", "Invalid display size: " + m22394k0);
            }
        }
        Point point = new Point();
        int i11 = f26679a;
        if (i11 >= 23) {
            m22353U(display, point);
        } else if (i11 >= 17) {
            m22351T(display, point);
        } else {
            m22349S(display, point);
        }
        return point;
    }

    /* renamed from: Q0 */
    public static long m22346Q0(long j10, long j11, long j12) {
        if (j12 >= j11 && j12 % j11 == 0) {
            return j10 / (j12 / j11);
        }
        if (j12 < j11 && j11 % j12 == 0) {
            return j10 * (j11 / j12);
        }
        return (long) (j10 * (j11 / j12));
    }

    /* renamed from: R */
    public static Looper m22347R() {
        Looper myLooper = Looper.myLooper();
        if (myLooper == null) {
            myLooper = Looper.getMainLooper();
        }
        return myLooper;
    }

    /* renamed from: R0 */
    public static long[] m22348R0(List<Long> list, long j10, long j11) {
        int size = list.size();
        long[] jArr = new long[size];
        if (j11 >= j10 && j11 % j10 == 0) {
            long j12 = j11 / j10;
            for (int i10 = 0; i10 < size; i10++) {
                jArr[i10] = list.get(i10).longValue() / j12;
            }
        } else if (j11 >= j10 || j10 % j11 != 0) {
            double d10 = j10 / j11;
            for (int i11 = 0; i11 < size; i11++) {
                jArr[i11] = (long) (list.get(i11).longValue() * d10);
            }
        } else {
            long j13 = j10 / j11;
            for (int i12 = 0; i12 < size; i12++) {
                jArr[i12] = list.get(i12).longValue() * j13;
            }
        }
        return jArr;
    }

    /* renamed from: S */
    public static void m22349S(Display display, Point point) {
        display.getSize(point);
    }

    /* renamed from: S0 */
    public static void m22350S0(long[] jArr, long j10, long j11) {
        if (j11 >= j10 && j11 % j10 == 0) {
            long j12 = j11 / j10;
            for (int i10 = 0; i10 < jArr.length; i10++) {
                jArr[i10] = jArr[i10] / j12;
            }
            return;
        }
        if (j11 < j10 && j10 % j11 == 0) {
            long j13 = j10 / j11;
            for (int i11 = 0; i11 < jArr.length; i11++) {
                jArr[i11] = jArr[i11] * j13;
            }
            return;
        }
        double d10 = j10 / j11;
        for (int i12 = 0; i12 < jArr.length; i12++) {
            jArr[i12] = (long) (jArr[i12] * d10);
        }
    }

    /* renamed from: T */
    public static void m22351T(Display display, Point point) {
        display.getRealSize(point);
    }

    /* renamed from: T0 */
    public static void m22352T0(Throwable th2) {
        m22354U0(th2);
    }

    /* renamed from: U */
    public static void m22353U(Display display, Point point) {
        Display$Mode mode;
        mode = display.getMode();
        point.x = mode.getPhysicalWidth();
        point.y = mode.getPhysicalHeight();
    }

    /* renamed from: U0 */
    public static <T extends Throwable> void m22354U0(Throwable th2) {
        throw th2;
    }

    /* renamed from: V */
    public static UUID m22355V(String str) {
        String m23638e = C4699b.m23638e(str);
        m23638e.hashCode();
        switch (m23638e) {
            case "playready":
                return C7583h.f36780e;
            case "widevine":
                return C7583h.f36779d;
            case "clearkey":
                return C7583h.f36778c;
            default:
                try {
                    return UUID.fromString(str);
                } catch (RuntimeException e10) {
                    return null;
                }
        }
    }

    /* renamed from: V0 */
    public static String[] m22356V0(String str, String str2) {
        return str.split(str2, -1);
    }

    /* renamed from: W */
    public static int m22357W(String str) {
        String[] m22356V0;
        int length;
        int i10 = 0;
        if (str == null || (length = (m22356V0 = m22356V0(str, AWSAppSyncClient.DATABASE_NAME_DELIMITER)).length) < 2) {
            return 0;
        }
        String str2 = m22356V0[length - 1];
        boolean z10 = length >= 3 && "neg".equals(m22356V0[length - 2]);
        try {
            int parseInt = Integer.parseInt((String) C4349a.m21882e(str2));
            i10 = parseInt;
            if (z10) {
                i10 = -parseInt;
            }
        } catch (NumberFormatException e10) {
        }
        return i10;
    }

    /* renamed from: W0 */
    public static String[] m22358W0(String str, String str2) {
        return str.split(str2, 2);
    }

    /* renamed from: X */
    public static String m22359X(Locale locale) {
        return f26679a >= 21 ? m22361Y(locale) : locale.toString();
    }

    /* renamed from: X0 */
    public static String[] m22360X0(String str) {
        return TextUtils.isEmpty(str) ? new String[0] : m22356V0(str.trim(), "(\\s*,\\s*)");
    }

    /* renamed from: Y */
    public static String m22361Y(Locale locale) {
        return locale.toLanguageTag();
    }

    /* renamed from: Y0 */
    public static ComponentName m22362Y0(Context context, Intent intent) {
        ComponentName startForegroundService;
        if (f26679a < 26) {
            return context.startService(intent);
        }
        startForegroundService = context.startForegroundService(intent);
        return startForegroundService;
    }

    /* renamed from: Z */
    public static long m22363Z(long j10, float f10) {
        return f10 == 1.0f ? j10 : Math.round(j10 * f10);
    }

    /* renamed from: Z0 */
    public static long m22364Z0(long j10, long j11, long j12) {
        long j13 = j10 - j11;
        return ((j10 ^ j13) & (j11 ^ j10)) < 0 ? j12 : j13;
    }

    /* renamed from: a0 */
    public static long m22366a0(long j10) {
        return j10 == -9223372036854775807L ? System.currentTimeMillis() : j10 + SystemClock.elapsedRealtime();
    }

    /* renamed from: a1 */
    public static boolean m22367a1(SQLiteDatabase sQLiteDatabase, String str) {
        boolean z10 = true;
        if (DatabaseUtils.queryNumEntries(sQLiteDatabase, "sqlite_master", "tbl_name = ?", new String[]{str}) <= 0) {
            z10 = false;
        }
        return z10;
    }

    /* renamed from: b */
    public static long m22368b(long j10, long j11, long j12) {
        long j13 = j10 + j11;
        return ((j10 ^ j13) & (j11 ^ j13)) < 0 ? j12 : j13;
    }

    /* renamed from: b0 */
    public static int m22369b0(int i10) {
        if (i10 == 8) {
            return 3;
        }
        if (i10 != 16) {
            return i10 != 24 ? i10 != 32 ? 0 : 805306368 : NTLMEngineImpl.FLAG_REQUEST_128BIT_KEY_EXCH;
        }
        return 2;
    }

    /* renamed from: b1 */
    public static byte[] m22370b1(InputStream inputStream) {
        byte[] bArr = new byte[4096];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }

    /* renamed from: c */
    public static boolean m22371c(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    /* renamed from: c0 */
    public static C7629w0 m22372c0(int i10, int i11, int i12) {
        return new C7629w0.b().m33220e0("audio/raw").m33197H(i11).m33221f0(i12).m33214Y(i10).m33194E();
    }

    /* renamed from: c1 */
    public static String m22373c1(byte[] bArr) {
        StringBuilder sb2 = new StringBuilder(bArr.length * 2);
        for (int i10 = 0; i10 < bArr.length; i10++) {
            sb2.append(Character.forDigit((bArr[i10] >> 4) & 15, 16));
            sb2.append(Character.forDigit(bArr[i10] & 15, 16));
        }
        return sb2.toString();
    }

    /* renamed from: d */
    public static <T extends Comparable<? super T>> int m22374d(List<? extends Comparable<? super T>> list, T t10, boolean z10, boolean z11) {
        int binarySearch = Collections.binarySearch(list, t10);
        if (binarySearch < 0) {
            binarySearch ^= -1;
        } else {
            int size = list.size();
            do {
                binarySearch++;
                if (binarySearch >= size) {
                    break;
                }
            } while (list.get(binarySearch).compareTo(t10) == 0);
            if (z10) {
                binarySearch--;
            }
        }
        int i10 = binarySearch;
        if (z11) {
            i10 = Math.min(list.size() - 1, binarySearch);
        }
        return i10;
    }

    /* renamed from: d0 */
    public static int m22375d0(int i10, int i11) {
        if (i10 != 2) {
            int i12 = i11;
            if (i10 != 3) {
                if (i10 != 4) {
                    if (i10 != 268435456) {
                        if (i10 == 536870912) {
                            return i11 * 3;
                        }
                        if (i10 != 805306368) {
                            throw new IllegalArgumentException();
                        }
                    }
                }
                i12 = i11 * 4;
            }
            return i12;
        }
        return i11 * 2;
    }

    /* renamed from: d1 */
    public static long m22376d1(int i10, int i11) {
        return m22379e1(i11) | (m22379e1(i10) << 32);
    }

    /* renamed from: e */
    public static int m22377e(long[] jArr, long j10, boolean z10, boolean z11) {
        int binarySearch = Arrays.binarySearch(jArr, j10);
        int i10 = binarySearch;
        if (binarySearch < 0) {
            i10 = binarySearch ^ (-1);
        } else {
            do {
                i10++;
                if (i10 >= jArr.length) {
                    break;
                }
            } while (jArr[i10] == j10);
            if (z10) {
                i10--;
            }
        }
        int i11 = i10;
        if (z11) {
            i11 = Math.min(jArr.length - 1, i10);
        }
        return i11;
    }

    /* renamed from: e0 */
    public static long m22378e0(long j10, float f10) {
        return f10 == 1.0f ? j10 : Math.round(j10 / f10);
    }

    /* renamed from: e1 */
    public static long m22379e1(int i10) {
        return i10 & 4294967295L;
    }

    /* renamed from: f */
    public static int m22380f(C4394w c4394w, long j10, boolean z10, boolean z11) {
        int i10;
        int m22284c = c4394w.m22284c() - 1;
        int i11 = 0;
        while (i11 <= m22284c) {
            int i12 = (i11 + m22284c) >>> 1;
            if (c4394w.m22283b(i12) < j10) {
                i11 = i12 + 1;
            } else {
                m22284c = i12 - 1;
            }
        }
        if (z10 && (i10 = m22284c + 1) < c4394w.m22284c() && c4394w.m22283b(i10) == j10) {
            m22284c = i10;
        } else if (z11 && m22284c == -1) {
            m22284c = 0;
        }
        return m22284c;
    }

    /* renamed from: f0 */
    public static int m22381f0(int i10) {
        if (i10 == 13) {
            return 1;
        }
        switch (i10) {
            case 2:
                return 0;
            case 3:
                return 8;
            case 4:
                return 4;
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
                return 5;
            case 6:
                return 2;
            default:
                return 3;
        }
    }

    /* renamed from: f1 */
    public static CharSequence m22382f1(CharSequence charSequence, int i10) {
        if (charSequence.length() > i10) {
            charSequence = charSequence.subSequence(0, i10);
        }
        return charSequence;
    }

    /* renamed from: g */
    public static <T extends Comparable<? super T>> int m22383g(List<? extends Comparable<? super T>> list, T t10, boolean z10, boolean z11) {
        int binarySearch = Collections.binarySearch(list, t10);
        int i10 = binarySearch;
        if (binarySearch < 0) {
            i10 = -(binarySearch + 2);
        } else {
            do {
                i10--;
                if (i10 < 0) {
                    break;
                }
            } while (list.get(i10).compareTo(t10) == 0);
            if (z10) {
                i10++;
            }
        }
        int i11 = i10;
        if (z11) {
            i11 = Math.max(0, i10);
        }
        return i11;
    }

    /* renamed from: g0 */
    public static String m22384g0(StringBuilder sb2, Formatter formatter, long j10) {
        long j11 = j10;
        if (j10 == -9223372036854775807L) {
            j11 = 0;
        }
        String str = j11 < 0 ? "-" : "";
        long abs = (Math.abs(j11) + 500) / 1000;
        long j12 = abs % 60;
        long j13 = (abs / 60) % 60;
        long j14 = abs / 3600;
        sb2.setLength(0);
        return (j14 > 0 ? formatter.format("%s%d:%02d:%02d", str, Long.valueOf(j14), Long.valueOf(j13), Long.valueOf(j12)) : formatter.format("%s%02d:%02d", str, Long.valueOf(j13), Long.valueOf(j12))).toString();
    }

    /* renamed from: g1 */
    public static String m22385g1(String str) {
        int i10;
        int length = str.length();
        int i11 = 0;
        int i12 = 0;
        while (true) {
            i10 = i12;
            if (i11 >= length) {
                break;
            }
            int i13 = i10;
            if (str.charAt(i11) == '%') {
                i13 = i10 + 1;
            }
            i11++;
            i12 = i13;
        }
        if (i10 == 0) {
            return str;
        }
        int i14 = length - (i10 * 2);
        StringBuilder sb2 = new StringBuilder(i14);
        Matcher matcher = f26687i.matcher(str);
        int i15 = 0;
        while (i10 > 0 && matcher.find()) {
            char parseInt = (char) Integer.parseInt((String) C4349a.m21882e(matcher.group(1)), 16);
            sb2.append((CharSequence) str, i15, matcher.start());
            sb2.append(parseInt);
            i15 = matcher.end();
            i10--;
        }
        if (i15 < length) {
            sb2.append((CharSequence) str, i15, length);
        }
        if (sb2.length() != i14) {
            return null;
        }
        return sb2.toString();
    }

    /* renamed from: h */
    public static int m22386h(int[] iArr, int i10, boolean z10, boolean z11) {
        int i11;
        int binarySearch = Arrays.binarySearch(iArr, i10);
        int i12 = binarySearch;
        if (binarySearch < 0) {
            i11 = -(binarySearch + 2);
        } else {
            do {
                i12--;
                if (i12 < 0) {
                    break;
                }
            } while (iArr[i12] == i10);
            i11 = z10 ? i12 + 1 : i12;
        }
        int i13 = i11;
        if (z11) {
            i13 = Math.max(0, i11);
        }
        return i13;
    }

    /* renamed from: h0 */
    public static String[] m22387h0() {
        String[] m22390i0 = m22390i0();
        for (int i10 = 0; i10 < m22390i0.length; i10++) {
            m22390i0[i10] = m22322E0(m22390i0[i10]);
        }
        return m22390i0;
    }

    /* renamed from: h1 */
    public static void m22388h1(Parcel parcel, boolean z10) {
        parcel.writeInt(z10 ? 1 : 0);
    }

    /* renamed from: i */
    public static int m22389i(long[] jArr, long j10, boolean z10, boolean z11) {
        int binarySearch = Arrays.binarySearch(jArr, j10);
        int i10 = binarySearch;
        if (binarySearch < 0) {
            i10 = -(binarySearch + 2);
        } else {
            do {
                i10--;
                if (i10 < 0) {
                    break;
                }
            } while (jArr[i10] == j10);
            if (z10) {
                i10++;
            }
        }
        int i11 = i10;
        if (z11) {
            i11 = Math.max(0, i10);
        }
        return i11;
    }

    /* renamed from: i0 */
    public static String[] m22390i0() {
        Configuration configuration = Resources.getSystem().getConfiguration();
        return f26679a >= 24 ? m22392j0(configuration) : new String[]{m22359X(configuration.locale)};
    }

    @EnsuresNonNull({"#1"})
    /* renamed from: j */
    public static <T> T m22391j(T t10) {
        return t10;
    }

    /* renamed from: j0 */
    public static String[] m22392j0(Configuration configuration) {
        LocaleList locales;
        locales = configuration.getLocales();
        return m22356V0(locales.toLanguageTags(), ",");
    }

    @EnsuresNonNull({"#1"})
    /* renamed from: k */
    public static <T> T[] m22393k(T[] tArr) {
        return tArr;
    }

    /* renamed from: k0 */
    public static String m22394k0(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class).invoke(cls, str);
        } catch (Exception e10) {
            C4392v.m22271e("Util", "Failed to read system property " + str, e10);
            return null;
        }
    }

    /* renamed from: l */
    public static int m22395l(int i10, int i11) {
        return ((i10 + i11) - 1) / i11;
    }

    /* renamed from: l0 */
    public static byte[] m22396l0(String str) {
        return str.getBytes(C4701d.f27717c);
    }

    /* renamed from: m */
    public static long m22397m(long j10, long j11) {
        return ((j10 + j11) - 1) / j11;
    }

    /* renamed from: m0 */
    public static int m22398m0(Uri uri) {
        String scheme = uri.getScheme();
        if (scheme != null && C4699b.m23634a("rtsp", scheme)) {
            return 3;
        }
        String path = uri.getPath();
        return path == null ? 4 : m22402o0(path);
    }

    /* renamed from: n */
    public static boolean m22399n(C7561b1... c7561b1Arr) {
        if (f26679a < 24) {
            return true;
        }
        for (C7561b1 c7561b1 : c7561b1Arr) {
            C7561b1.g gVar = c7561b1.f36449b;
            if (gVar != null) {
                if (m22416v0(gVar.f36504a)) {
                    return false;
                }
                for (int i10 = 0; i10 < c7561b1.f36449b.f36510g.size(); i10++) {
                    if (m22416v0(c7561b1.f36449b.f36510g.get(i10).f36512a)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    /* renamed from: n0 */
    public static int m22400n0(Uri uri, String str) {
        int m22402o0;
        if (TextUtils.isEmpty(str)) {
            m22402o0 = m22398m0(uri);
        } else {
            m22402o0 = m22402o0(InstructionFileId.DOT + str);
        }
        return m22402o0;
    }

    /* renamed from: o */
    public static void m22401o(InterfaceC0854m interfaceC0854m) {
        if (interfaceC0854m != null) {
            try {
                interfaceC0854m.close();
            } catch (IOException e10) {
            }
        }
    }

    /* renamed from: o0 */
    public static int m22402o0(String str) {
        String m23638e = C4699b.m23638e(str);
        if (m23638e.endsWith(".mpd")) {
            return 0;
        }
        if (m23638e.endsWith(".m3u8")) {
            return 2;
        }
        Matcher matcher = f26688j.matcher(m23638e);
        if (!matcher.matches()) {
            return 4;
        }
        String group = matcher.group(2);
        if (group == null) {
            return 1;
        }
        if (group.contains("format=mpd-time-csf")) {
            return 0;
        }
        return group.contains("format=m3u8-aapl") ? 2 : 1;
    }

    /* renamed from: p */
    public static void m22403p(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e10) {
            }
        }
    }

    /* renamed from: p0 */
    public static int m22404p0(Uri uri, String str) {
        if (str == null) {
            return m22398m0(uri);
        }
        switch (str) {
            case "application/x-mpegURL":
                return 2;
            case "application/vnd.ms-sstr+xml":
                return 1;
            case "application/dash+xml":
                return 0;
            case "application/x-rtsp":
                return 3;
            default:
                return 4;
        }
    }

    /* renamed from: q */
    public static int m22405q(long j10, long j11) {
        return j10 < j11 ? -1 : j10 == j11 ? 0 : 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0099, code lost:
    
        r12.reset();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x009f, code lost:
    
        return false;
     */
    /* renamed from: q0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean m22406q0(p059d9.C4361f0 r7, p059d9.C4361f0 r8, java.util.zip.Inflater r9) {
        /*
            r0 = r7
            int r0 = r0.m21985a()
            if (r0 > 0) goto L9
            r0 = 0
            return r0
        L9:
            r0 = r8
            int r0 = r0.m21986b()
            r1 = r7
            int r1 = r1.m21985a()
            if (r0 >= r1) goto L1e
            r0 = r8
            r1 = r7
            int r1 = r1.m21985a()
            r2 = 2
            int r1 = r1 * r2
            r0.m21987c(r1)
        L1e:
            r0 = r9
            r12 = r0
            r0 = r9
            if (r0 != 0) goto L2e
            java.util.zip.Inflater r0 = new java.util.zip.Inflater
            r1 = r0
            r1.<init>()
            r12 = r0
        L2e:
            r0 = r12
            r1 = r7
            byte[] r1 = r1.m21988d()
            r2 = r7
            int r2 = r2.m21989e()
            r3 = r7
            int r3 = r3.m21985a()
            r0.setInput(r1, r2, r3)
            r0 = 0
            r10 = r0
        L41:
            r0 = r10
            r1 = r12
            r2 = r8
            byte[] r2 = r2.m21988d()     // Catch: java.lang.Throwable -> La0 java.util.zip.DataFormatException -> La8
            r3 = r10
            r4 = r8
            int r4 = r4.m21986b()     // Catch: java.lang.Throwable -> La0 java.util.zip.DataFormatException -> La8
            r5 = r10
            int r4 = r4 - r5
            int r1 = r1.inflate(r2, r3, r4)     // Catch: java.lang.Throwable -> La0 java.util.zip.DataFormatException -> La8
            int r0 = r0 + r1
            r11 = r0
            r0 = r12
            boolean r0 = r0.finished()     // Catch: java.lang.Throwable -> La0 java.util.zip.DataFormatException -> La8
            if (r0 == 0) goto L6a
            r0 = r8
            r1 = r11
            r0.m21982O(r1)     // Catch: java.lang.Throwable -> La0 java.util.zip.DataFormatException -> La8
            r0 = r12
            r0.reset()
            r0 = 1
            return r0
        L6a:
            r0 = r12
            boolean r0 = r0.needsDictionary()     // Catch: java.lang.Throwable -> La0 java.util.zip.DataFormatException -> La8
            if (r0 != 0) goto L99
            r0 = r12
            boolean r0 = r0.needsInput()     // Catch: java.lang.Throwable -> La0 java.util.zip.DataFormatException -> La8
            if (r0 == 0) goto L7d
            goto L99
        L7d:
            r0 = r11
            r10 = r0
            r0 = r11
            r1 = r8
            int r1 = r1.m21986b()     // Catch: java.lang.Throwable -> La0 java.util.zip.DataFormatException -> La8
            if (r0 != r1) goto L41
            r0 = r8
            r1 = r8
            int r1 = r1.m21986b()     // Catch: java.lang.Throwable -> La0 java.util.zip.DataFormatException -> La8
            r2 = 2
            int r1 = r1 * r2
            r0.m21987c(r1)     // Catch: java.lang.Throwable -> La0 java.util.zip.DataFormatException -> La8
            r0 = r11
            r10 = r0
            goto L41
        L99:
            r0 = r12
            r0.reset()
            r0 = 0
            return r0
        La0:
            r7 = move-exception
            r0 = r12
            r0.reset()
            r0 = r7
            throw r0
        La8:
            r7 = move-exception
            r0 = r12
            r0.reset()
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p059d9.C4401z0.m22406q0(d9.f0, d9.f0, java.util.zip.Inflater):boolean");
    }

    /* renamed from: r */
    public static float m22407r(float f10, float f11, float f12) {
        return Math.max(f11, Math.min(f10, f12));
    }

    /* renamed from: r0 */
    public static boolean m22408r0(int i10) {
        return i10 == 536870912 || i10 == 805306368 || i10 == 4;
    }

    /* renamed from: s */
    public static int m22409s(int i10, int i11, int i12) {
        return Math.max(i11, Math.min(i10, i12));
    }

    /* renamed from: s0 */
    public static boolean m22410s0(int i10) {
        return i10 == 3 || i10 == 2 || i10 == 268435456 || i10 == 536870912 || i10 == 805306368 || i10 == 4;
    }

    /* renamed from: t */
    public static long m22411t(long j10, long j11, long j12) {
        return Math.max(j11, Math.min(j10, j12));
    }

    /* renamed from: t0 */
    public static boolean m22412t0(int i10) {
        return i10 == 10 || i10 == 13;
    }

    /* renamed from: u */
    public static boolean m22413u(Object[] objArr, Object obj) {
        for (Object obj2 : objArr) {
            if (m22371c(obj2, obj)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: u0 */
    public static boolean m22414u0(Uri uri) {
        String scheme = uri.getScheme();
        return TextUtils.isEmpty(scheme) || TransferTable.COLUMN_FILE.equals(scheme);
    }

    /* renamed from: v */
    public static int m22415v(byte[] bArr, int i10, int i11, int i12) {
        while (i10 < i11) {
            i12 = f26692n[((i12 >>> 24) ^ (bArr[i10] & 255)) & 255] ^ (i12 << 8);
            i10++;
        }
        return i12;
    }

    /* renamed from: v0 */
    public static boolean m22416v0(Uri uri) {
        boolean z10;
        boolean isCleartextTrafficPermitted;
        if (HttpHost.DEFAULT_SCHEME_NAME.equals(uri.getScheme())) {
            isCleartextTrafficPermitted = NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted((String) C4349a.m21882e(uri.getHost()));
            if (!isCleartextTrafficPermitted) {
                z10 = true;
                return z10;
            }
        }
        z10 = false;
        return z10;
    }

    /* renamed from: w */
    public static int m22417w(byte[] bArr, int i10, int i11, int i12) {
        while (i10 < i11) {
            i12 = f26693o[i12 ^ (bArr[i10] & 255)];
            i10++;
        }
        return i12;
    }

    /* renamed from: w0 */
    public static boolean m22418w0(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService("uimode");
        return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
    }

    /* renamed from: x */
    public static Handler m22419x(Looper looper, Handler.Callback callback) {
        return new Handler(looper, callback);
    }

    /* renamed from: x0 */
    public static /* synthetic */ Thread m22420x0(String str, Runnable runnable) {
        return new Thread(runnable, str);
    }

    /* renamed from: y */
    public static Handler m22421y() {
        return m22423z(null);
    }

    /* renamed from: y0 */
    public static int m22422y0(int[] iArr, int i10) {
        for (int i11 = 0; i11 < iArr.length; i11++) {
            if (iArr[i11] == i10) {
                return i11;
            }
        }
        return -1;
    }

    /* renamed from: z */
    public static Handler m22423z(Handler.Callback callback) {
        return m22419x((Looper) C4349a.m21886i(Looper.myLooper()), callback);
    }

    /* renamed from: z0 */
    public static String m22424z0(String str) {
        int i10 = 0;
        while (true) {
            String[] strArr = f26691m;
            if (i10 >= strArr.length) {
                return str;
            }
            if (str.startsWith(strArr[i10])) {
                return strArr[i10 + 1] + str.substring(strArr[i10].length());
            }
            i10 += 2;
        }
    }

    private static long[] $d2j$hex$44723900$decode_J(String src) {
        byte[] d10 = $d2j$hex$44723900$decode_B(src);
        ByteBuffer b10 = ByteBuffer.wrap(d10);
        b10.order(ByteOrder.LITTLE_ENDIAN);
        LongBuffer s10 = b10.asLongBuffer();
        long[] data = new long[d10.length / 8];
        s10.get(data);
        return data;
    }

    private static int[] $d2j$hex$44723900$decode_I(String src) {
        byte[] d10 = $d2j$hex$44723900$decode_B(src);
        ByteBuffer b10 = ByteBuffer.wrap(d10);
        b10.order(ByteOrder.LITTLE_ENDIAN);
        IntBuffer s10 = b10.asIntBuffer();
        int[] data = new int[d10.length / 4];
        s10.get(data);
        return data;
    }

    private static short[] $d2j$hex$44723900$decode_S(String src) {
        byte[] d10 = $d2j$hex$44723900$decode_B(src);
        ByteBuffer b10 = ByteBuffer.wrap(d10);
        b10.order(ByteOrder.LITTLE_ENDIAN);
        ShortBuffer s10 = b10.asShortBuffer();
        short[] data = new short[d10.length / 2];
        s10.get(data);
        return data;
    }

    private static byte[] $d2j$hex$44723900$decode_B(String src) {
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
