package org.apache.commons.codec.digest;

import android.R;
import com.amazonaws.services.p045s3.internal.Constants;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import java.nio.ShortBuffer;
import java.util.Random;
import org.apache.commons.codec.Charsets;
import org.apache.commons.net.bsd.RCommandClient;
import org.apache.commons.net.bsd.RLoginClient;
import org.apache.http.impl.auth.NTLMEngineImpl;
import org.jsoup.parser.CharacterReader;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/apache/commons/codec/digest/UnixCrypt.class
 */
/* loaded from: combined.jar:classes2.jar:org/apache/commons/codec/digest/UnixCrypt.class */
public class UnixCrypt {
    private static final int[] CON_SALT = $d2j$hex$b0ee2986$decode_I("00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000100000002000000030000000400000005000000060000000700000008000000090000000a0000000b00000005000000060000000700000008000000090000000a0000000b0000000c0000000d0000000e0000000f000000100000001100000012000000130000001400000015000000160000001700000018000000190000001a0000001b0000001c0000001d0000001e0000001f000000200000002100000022000000230000002400000025000000200000002100000022000000230000002400000025000000260000002700000028000000290000002a0000002b0000002c0000002d0000002e0000002f000000300000003100000032000000330000003400000035000000360000003700000038000000390000003a0000003b0000003c0000003d0000003e0000003f0000000000000000000000000000000000000000000000");
    private static final int[] COV2CHAR = {46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122};
    private static final char[] SALT_CHARS = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789./".toCharArray();
    private static final boolean[] SHIFT2 = {false, false, true, true, true, true, true, true, false, true, true, true, true, true, true, false};
    private static final int[][] SKB = {new int[]{0, 16, NTLMEngineImpl.FLAG_REQUEST_128BIT_KEY_EXCH, 536870928, 65536, 65552, 536936448, 536936464, 2048, 2064, 536872960, 536872976, 67584, 67600, 536938496, 536938512, 32, 48, 536870944, 536870960, 65568, 65584, 536936480, 536936496, 2080, 2096, 536872992, 536873008, 67616, 67632, 536938528, 536938544, NTLMEngineImpl.FLAG_REQUEST_NTLM2_SESSION, 524304, 537395200, 537395216, 589824, 589840, 537460736, 537460752, 526336, 526352, 537397248, 537397264, 591872, 591888, 537462784, 537462800, 524320, 524336, 537395232, 537395248, 589856, 589872, 537460768, 537460784, 526368, 526384, 537397280, 537397296, 591904, 591920, 537462816, 537462832}, new int[]{0, NTLMEngineImpl.FLAG_REQUEST_VERSION, NTLMEngineImpl.FLAG_WORKSTATION_PRESENT, 33562624, 2097152, 35651584, 2105344, 35659776, 4, 33554436, 8196, 33562628, 2097156, 35651588, 2105348, 35659780, 1024, 33555456, 9216, 33563648, 2098176, 35652608, 2106368, 35660800, 1028, 33555460, 9220, 33563652, 2098180, 35652612, 2106372, 35660804, 268435456, 301989888, 268443648, 301998080, 270532608, 304087040, 270540800, 304095232, 268435460, 301989892, 268443652, 301998084, 270532612, 304087044, 270540804, 304095236, 268436480, 301990912, 268444672, 301999104, 270533632, 304088064, 270541824, 304096256, 268436484, 301990916, 268444676, 301999108, 270533636, 304088068, 270541828, 304096260}, new int[]{0, 1, 262144, 262145, 16777216, 16777217, R.string.cancel, R.string.copy, 2, 3, 262146, 262147, 16777218, 16777219, R.string.copyUrl, R.string.cut, 512, RLoginClient.DEFAULT_PORT, 262656, 262657, 16777728, 16777729, R.string.config_chooseTypeAndAccountActivity, R.string.config_chooserActivity, RCommandClient.DEFAULT_PORT, 515, 262658, 262659, 16777730, 16777731, R.string.config_clockFontFamily, R.string.config_companionDeviceManagerPackage, 134217728, 134217729, 134479872, 134479873, 150994944, 150994945, 151257088, 151257089, 134217730, 134217731, 134479874, 134479875, 150994946, 150994947, 151257090, 151257091, 134218240, 134218241, 134480384, 134480385, 150995456, 150995457, 151257600, 151257601, 134218242, 134218243, 134480386, 134480387, 150995458, 150995459, 151257602, 151257603}, new int[]{0, Constants.f7590MB, 256, 1048832, 8, 1048584, 264, 1048840, 4096, 1052672, 4352, 1052928, 4104, 1052680, 4360, 1052936, 67108864, 68157440, 67109120, 68157696, 67108872, 68157448, 67109128, 68157704, 67112960, 68161536, 67113216, 68161792, 67112968, 68161544, 67113224, 68161800, 131072, 1179648, 131328, 1179904, 131080, 1179656, 131336, 1179912, 135168, 1183744, 135424, 1184000, 135176, 1183752, 135432, 1184008, 67239936, 68288512, 67240192, 68288768, 67239944, 68288520, 67240200, 68288776, 67244032, 68292608, 67244288, 68292864, 67244040, 68292616, 67244296, 68292872}, new int[]{0, 268435456, 65536, 268500992, 4, 268435460, 65540, 268500996, NTLMEngineImpl.FLAG_REQUEST_128BIT_KEY_EXCH, 805306368, 536936448, 805371904, 536870916, 805306372, 536936452, 805371908, Constants.f7590MB, 269484032, 1114112, 269549568, 1048580, 269484036, 1114116, 269549572, 537919488, 806354944, 537985024, 806420480, 537919492, 806354948, 537985028, 806420484, 4096, 268439552, 69632, 268505088, 4100, 268439556, 69636, 268505092, 536875008, 805310464, 536940544, 805376000, 536875012, 805310468, 536940548, 805376004, 1052672, 269488128, 1118208, 269553664, 1052676, 269488132, 1118212, 269553668, 537923584, 806359040, 537989120, 806424576, 537923588, 806359044, 537989124, 806424580}, new int[]{0, 134217728, 8, 134217736, 1024, 134218752, 1032, 134218760, 131072, 134348800, 131080, 134348808, 132096, 134349824, 132104, 134349832, 1, 134217729, 9, 134217737, 1025, 134218753, 1033, 134218761, 131073, 134348801, 131081, 134348809, 132097, 134349825, 132105, 134349833, NTLMEngineImpl.FLAG_REQUEST_VERSION, 167772160, 33554440, 167772168, 33555456, 167773184, 33555464, 167773192, 33685504, 167903232, 33685512, 167903240, 33686528, 167904256, 33686536, 167904264, 33554433, 167772161, 33554441, 167772169, 33555457, 167773185, 33555465, 167773193, 33685505, 167903233, 33685513, 167903241, 33686529, 167904257, 33686537, 167904265}, new int[]{0, 256, NTLMEngineImpl.FLAG_REQUEST_NTLM2_SESSION, 524544, 16777216, 16777472, R.drawable.alert_dark_frame, R.drawable.ab_solid_shadow_holo, 16, 272, 524304, 524560, 16777232, 16777488, R.drawable.checkbox_on_background, R.drawable.activated_background, 2097152, 2097408, 2621440, 2621696, 18874368, 18874624, 19398656, 19398912, 2097168, 2097424, 2621456, 2621712, 18874384, 18874640, 19398672, 19398928, 512, 768, 524800, 525056, 16777728, 16777984, R.drawable.btn_radio_on_pressed_holo_light, R.drawable.dropdown_normal_holo_light, 528, 784, 524816, 525072, 16777744, 16778000, R.drawable.btn_rating_star_off_pressed_holo_light, R.drawable.emo_im_cool, 2097664, 2097920, 2621952, 2622208, 18874880, 18875136, 19399168, 19399424, 2097680, 2097936, 2621968, 2622224, 18874896, 18875152, 19399184, 19399440}, new int[]{0, 67108864, 262144, 67371008, 2, 67108866, 262146, 67371010, NTLMEngineImpl.FLAG_WORKSTATION_PRESENT, 67117056, 270336, 67379200, 8194, 67117058, 270338, 67379202, 32, 67108896, 262176, 67371040, 34, 67108898, 262178, 67371042, 8224, 67117088, 270368, 67379232, 8226, 67117090, 270370, 67379234, 2048, 67110912, 264192, 67373056, 2050, 67110914, 264194, 67373058, 10240, 67119104, 272384, 67381248, 10242, 67119106, 272386, 67381250, 2080, 67110944, 264224, 67373088, 2082, 67110946, 264226, 67373090, 10272, 67119136, 272416, 67381280, 10274, 67119138, 272418, 67381282}};
    private static final int[][] SPTRANS = {new int[]{8520192, 131072, -2139095040, -2138963456, NTLMEngineImpl.FLAG_TARGETINFO_PRESENT, -2147352064, -2147352576, -2139095040, -2147352064, 8520192, 8519680, -2147483136, -2139094528, NTLMEngineImpl.FLAG_TARGETINFO_PRESENT, 0, -2147352576, 131072, NTLMEngineImpl.FLAG_REQUEST_56BIT_ENCRYPTION, 8389120, 131584, -2138963456, 8519680, -2147483136, 8389120, NTLMEngineImpl.FLAG_REQUEST_56BIT_ENCRYPTION, 512, 131584, -2138963968, 512, -2139094528, -2138963968, 0, 0, -2138963456, 8389120, -2147352576, 8520192, 131072, -2147483136, 8389120, -2138963968, 512, 131584, -2139095040, -2147352064, NTLMEngineImpl.FLAG_REQUEST_56BIT_ENCRYPTION, -2139095040, 8519680, -2138963456, 131584, 8519680, -2139094528, NTLMEngineImpl.FLAG_TARGETINFO_PRESENT, -2147483136, -2147352576, 0, 131072, NTLMEngineImpl.FLAG_TARGETINFO_PRESENT, -2139094528, 8520192, NTLMEngineImpl.FLAG_REQUEST_56BIT_ENCRYPTION, -2138963968, 512, -2147352064}, new int[]{268705796, 0, 270336, 268697600, 268435460, 8196, 268443648, 270336, NTLMEngineImpl.FLAG_WORKSTATION_PRESENT, 268697604, 4, 268443648, 262148, 268705792, 268697600, 4, 262144, 268443652, 268697604, NTLMEngineImpl.FLAG_WORKSTATION_PRESENT, 270340, 268435456, 0, 262148, 268443652, 270340, 268705792, 268435460, 268435456, 262144, 8196, 268705796, 262148, 268705792, 268443648, 270340, 268705796, 262148, 268435460, 0, 268435456, 8196, 262144, 268697604, NTLMEngineImpl.FLAG_WORKSTATION_PRESENT, 268435456, 270340, 268443652, 268705792, NTLMEngineImpl.FLAG_WORKSTATION_PRESENT, 0, 268435460, 4, 268705796, 270336, 268697600, 268697604, 262144, 8196, 268443648, 268443652, 4, 268697600, 270336}, new int[]{1090519040, R.attr.textAppearanceLarge, 64, 1090519104, 1073807360, 16777216, 1090519104, 65600, 16777280, 65536, R.attr.theme, NTLMEngineImpl.FLAG_REQUEST_EXPLICIT_KEY_EXCH, 1090584640, 1073741888, NTLMEngineImpl.FLAG_REQUEST_EXPLICIT_KEY_EXCH, 1090584576, 0, 1073807360, R.attr.textAppearanceLarge, 64, 1073741888, 1090584640, 65536, 1090519040, 1090584576, 16777280, 1073807424, R.attr.theme, 65600, 0, 16777216, 1073807424, R.attr.textAppearanceLarge, 64, NTLMEngineImpl.FLAG_REQUEST_EXPLICIT_KEY_EXCH, 65536, 1073741888, 1073807360, R.attr.theme, 1090519104, 0, R.attr.textAppearanceLarge, 65600, 1090584576, 1073807360, 16777216, 1090584640, NTLMEngineImpl.FLAG_REQUEST_EXPLICIT_KEY_EXCH, 1073807424, 1090519040, 16777216, 1090584640, 65536, 16777280, 1090519104, 65600, 16777280, 0, 1090584576, 1073741888, 1090519040, 1073807424, 64, R.attr.theme}, new int[]{1049602, 67109888, 2, 68158466, 0, 68157440, 67109890, 1048578, 68158464, 67108866, 67108864, 1026, 67108866, 1049602, Constants.f7590MB, 67108864, 68157442, 1049600, 1024, 2, 1049600, 67109890, 68157440, 1024, 1026, 0, 1048578, 68158464, 67109888, 68157442, 68158466, Constants.f7590MB, 68157442, 1026, Constants.f7590MB, 67108866, 1049600, 67109888, 2, 68157440, 67109890, 0, 1024, 1048578, 0, 68157442, 68158464, 1024, 67108864, 68158466, 1049602, Constants.f7590MB, 68158466, 2, 67109888, 1049602, 1048578, 1049600, 68157440, 67109890, 1026, 67108864, 67108866, 68158464}, new int[]{NTLMEngineImpl.FLAG_REQUEST_VERSION, 16384, 256, 33571080, 33570824, 33554688, 16648, 33570816, 16384, 8, 33554440, 16640, 33554696, 33570824, 33571072, 0, 16640, NTLMEngineImpl.FLAG_REQUEST_VERSION, 16392, 264, 33554688, 16648, 0, 33554440, 8, 33554696, 33571080, 16392, 33570816, 256, 264, 33571072, 33571072, 33554696, 16392, 33570816, 16384, 8, 33554440, 33554688, NTLMEngineImpl.FLAG_REQUEST_VERSION, 16640, 33571080, 0, 16648, NTLMEngineImpl.FLAG_REQUEST_VERSION, 256, 16392, 33554696, 256, 0, 33571080, 33570824, 33571072, 264, 16384, 16640, 33570824, 33554688, 264, 8, 16648, 33570816, 33554440}, new int[]{536870928, 524304, 0, 537397248, 524304, 2048, 536872976, NTLMEngineImpl.FLAG_REQUEST_NTLM2_SESSION, 2064, 537397264, 526336, NTLMEngineImpl.FLAG_REQUEST_128BIT_KEY_EXCH, 536872960, 536870928, 537395200, 526352, NTLMEngineImpl.FLAG_REQUEST_NTLM2_SESSION, 536872976, 537395216, 0, 2048, 16, 537397248, 537395216, 537397264, 537395200, NTLMEngineImpl.FLAG_REQUEST_128BIT_KEY_EXCH, 2064, 16, 526336, 526352, 536872960, 2064, NTLMEngineImpl.FLAG_REQUEST_128BIT_KEY_EXCH, 536872960, 526352, 537397248, 524304, 0, 536872960, NTLMEngineImpl.FLAG_REQUEST_128BIT_KEY_EXCH, 2048, 537395216, NTLMEngineImpl.FLAG_REQUEST_NTLM2_SESSION, 524304, 537397264, 526336, 16, 537397264, 526336, NTLMEngineImpl.FLAG_REQUEST_NTLM2_SESSION, 536872976, 536870928, 537395200, 526352, 0, 2048, 536870928, 536872976, 537397248, 537395200, 2064, 16, 537395216}, new int[]{4096, 128, 4194432, 4194305, 4198529, 4097, 4224, 0, 4194304, 4194433, 129, 4198400, 1, 4198528, 4198400, 129, 4194433, 4096, 4097, 4198529, 0, 4194432, 4194305, 4224, 4198401, 4225, 4198528, 1, 4225, 4198401, 128, 4194304, 4225, 4198400, 4198401, 129, 4096, 128, 4194304, 4198401, 4194433, 4225, 4224, 0, 128, 4194305, 1, 4194432, 0, 4194433, 4194432, 4224, 129, 4096, 4198529, 4194304, 4198528, 1, 4097, 4198529, 4194305, 4198528, 4198400, 4097}, new int[]{136314912, 136347648, 32800, 0, 134250496, 2097184, 136314880, 136347680, 32, 134217728, 2129920, 32800, 2129952, 134250528, 134217760, 136314880, 32768, 2129952, 2097184, 134250496, 136347680, 134217760, 0, 2129920, 134217728, 2097152, 134250528, 136314912, 2097152, 32768, 136347648, 32, 2097152, 32768, 134217760, 136347680, 32800, 134217728, 0, 2129920, 136314912, 134250528, 134250496, 2097184, 136347648, 32, 2097184, 134250496, 136347680, 2097152, 136314880, 134217760, 2129920, 32800, 134250528, 136314880, 32, 136347648, 2129952, 0, 134217728, 136314912, 32768, 2129952}};

    private static int[] body(int[] iArr, int i10, int i11) {
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (true) {
            int i15 = i14;
            if (i12 >= 25) {
                int[] iArr2 = new int[2];
                permOp((i15 >>> 1) | (i15 << 31), (i13 >>> 1) | (i13 << 31), 1, 1431655765, iArr2);
                permOp(iArr2[1], iArr2[0], 8, 16711935, iArr2);
                permOp(iArr2[1], iArr2[0], 2, 858993459, iArr2);
                permOp(iArr2[1], iArr2[0], 16, CharacterReader.EOF, iArr2);
                permOp(iArr2[1], iArr2[0], 4, 252645135, iArr2);
                return new int[]{iArr2[1], iArr2[0]};
            }
            for (int i16 = 0; i16 < 32; i16 += 4) {
                i15 = dEncrypt(i15, i13, i16, i10, i11, iArr);
                i13 = dEncrypt(i13, i15, i16 + 2, i10, i11, iArr);
            }
            i12++;
            int i17 = i13;
            i13 = i15;
            i14 = i17;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    private static int byteToUnsigned(byte b10) {
        byte b11 = b10;
        if (b10 < 0) {
            b11 = b10 + 256;
        }
        return b11;
    }

    public static String crypt(String str) {
        return crypt(str.getBytes(Charsets.UTF_8));
    }

    public static String crypt(String str, String str2) {
        return crypt(str.getBytes(Charsets.UTF_8), str2);
    }

    public static String crypt(byte[] bArr) {
        return crypt(bArr, (String) null);
    }

    public static String crypt(byte[] bArr, String str) {
        if (str == null) {
            Random random = new Random();
            char[] cArr = SALT_CHARS;
            int length = cArr.length;
            str = "" + cArr[random.nextInt(length)] + cArr[random.nextInt(length)];
        } else if (!str.matches("^[./0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz]{2,}$")) {
            throw new IllegalArgumentException("Invalid salt value: " + str);
        }
        StringBuilder sb2 = new StringBuilder("             ");
        char charAt = str.charAt(0);
        char charAt2 = str.charAt(1);
        sb2.setCharAt(0, charAt);
        sb2.setCharAt(1, charAt2);
        int[] iArr = CON_SALT;
        int i10 = iArr[charAt];
        int i11 = iArr[charAt2];
        byte[] bArr2 = new byte[8];
        for (int i12 = 0; i12 < 8; i12++) {
            bArr2[i12] = 0;
        }
        for (int i13 = 0; i13 < 8 && i13 < bArr.length; i13++) {
            bArr2[i13] = (byte) (bArr[i13] << 1);
        }
        int[] body = body(desSetKey(bArr2), i10, i11 << 4);
        byte[] bArr3 = new byte[9];
        intToFourBytes(body[0], bArr3, 0);
        intToFourBytes(body[1], bArr3, 4);
        bArr3[8] = 0;
        int i14 = 0;
        int i15 = 128;
        for (int i16 = 2; i16 < 13; i16++) {
            int i17 = 0;
            int i18 = 0;
            while (i17 < 6) {
                int i19 = i18 << 1;
                i18 = i19;
                if ((bArr3[i14] & i15) != 0) {
                    i18 = i19 | 1;
                }
                int i20 = i15 >>> 1;
                int i21 = i14;
                i15 = i20;
                if (i20 == 0) {
                    i21 = i14 + 1;
                    i15 = 128;
                }
                sb2.setCharAt(i16, (char) COV2CHAR[i18]);
                i17++;
                i14 = i21;
            }
        }
        return sb2.toString();
    }

    private static int dEncrypt(int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        int i15 = (i11 >>> 16) ^ i11;
        int i16 = i13 & i15;
        int i17 = i14 & i15;
        int i18 = ((i16 ^ (i16 << 16)) ^ i11) ^ iArr[i12];
        int i19 = (i11 ^ (i17 ^ (i17 << 16))) ^ iArr[i12 + 1];
        int i20 = (i19 << 28) | (i19 >>> 4);
        int[][] iArr2 = SPTRANS;
        int i21 = iArr2[1][i20 & 63];
        int i22 = iArr2[3][(i20 >>> 8) & 63];
        return i10 ^ (((((iArr2[7][(i20 >>> 24) & 63] | ((i21 | i22) | iArr2[5][(i20 >>> 16) & 63])) | iArr2[0][i18 & 63]) | iArr2[2][(i18 >>> 8) & 63]) | iArr2[4][(i18 >>> 16) & 63]) | iArr2[6][(i18 >>> 24) & 63]);
    }

    private static int[] desSetKey(byte[] bArr) {
        int i10;
        int i11;
        int i12;
        int i13;
        int[] iArr = new int[32];
        int[] iArr2 = new int[2];
        permOp(fourBytesToInt(bArr, 4), fourBytesToInt(bArr, 0), 4, 252645135, iArr2);
        permOp(hPermOp(iArr2[0], -2, -859045888), hPermOp(iArr2[1], -2, -859045888), 1, 1431655765, iArr2);
        permOp(iArr2[1], iArr2[0], 8, 16711935, iArr2);
        permOp(iArr2[1], iArr2[0], 1, 1431655765, iArr2);
        int i14 = iArr2[0];
        int i15 = iArr2[1];
        int i16 = ((i14 & 16711680) >>> 16) | ((i14 & 255) << 16) | (65280 & i14) | (((-268435456) & i15) >>> 4);
        int i17 = i15 & 268435455;
        int i18 = 0;
        int i19 = 0;
        while (i18 < 16) {
            if (SHIFT2[i18]) {
                i10 = (i17 << 26) | (i17 >>> 2);
                i11 = i16 >>> 2;
                i12 = i16;
                i13 = 26;
            } else {
                i10 = (i17 << 27) | (i17 >>> 1);
                i11 = i16 >>> 1;
                i12 = i16;
                i13 = 27;
            }
            int i20 = i10 & 268435455;
            i16 = ((i12 << i13) | i11) & 268435455;
            int[][] iArr3 = SKB;
            int i21 = iArr3[0][i20 & 63] | iArr3[1][((i20 >>> 6) & 3) | ((i20 >>> 7) & 60)] | iArr3[2][((i20 >>> 13) & 15) | ((i20 >>> 14) & 48)] | iArr3[3][((i20 >>> 20) & 1) | ((i20 >>> 21) & 6) | ((i20 >>> 22) & 56)];
            int i22 = iArr3[7][((i16 >>> 21) & 15) | ((i16 >>> 22) & 48)] | iArr3[4][i16 & 63] | iArr3[5][((i16 >>> 7) & 3) | ((i16 >>> 8) & 60)] | iArr3[6][(i16 >>> 15) & 63];
            int i23 = i19 + 1;
            iArr[i19] = (i22 << 16) | (65535 & i21);
            int i24 = (i21 >>> 16) | (i22 & (-65536));
            iArr[i23] = (i24 >>> 28) | (i24 << 4);
            i18++;
            i19 = i23 + 1;
            i17 = i20;
        }
        return iArr;
    }

    private static int fourBytesToInt(byte[] bArr, int i10) {
        int i11 = i10 + 1;
        int i12 = i11 + 1;
        return (byteToUnsigned(bArr[i12 + 1]) << 24) | byteToUnsigned(bArr[i10]) | (byteToUnsigned(bArr[i11]) << 8) | (byteToUnsigned(bArr[i12]) << 16);
    }

    private static int hPermOp(int i10, int i11, int i12) {
        int i13 = 16 - i11;
        int i14 = i12 & ((i10 << i13) ^ i10);
        return (i10 ^ i14) ^ (i14 >>> i13);
    }

    private static void intToFourBytes(int i10, byte[] bArr, int i11) {
        int i12 = i11 + 1;
        bArr[i11] = (byte) (i10 & 255);
        int i13 = i12 + 1;
        bArr[i12] = (byte) ((i10 >>> 8) & 255);
        bArr[i13] = (byte) ((i10 >>> 16) & 255);
        bArr[i13 + 1] = (byte) ((i10 >>> 24) & 255);
    }

    private static void permOp(int i10, int i11, int i12, int i13, int[] iArr) {
        int i14 = i13 & ((i10 >>> i12) ^ i11);
        iArr[0] = i10 ^ (i14 << i12);
        iArr[1] = i11 ^ i14;
    }

    private static long[] $d2j$hex$b0ee2986$decode_J(String src) {
        byte[] d10 = $d2j$hex$b0ee2986$decode_B(src);
        ByteBuffer b10 = ByteBuffer.wrap(d10);
        b10.order(ByteOrder.LITTLE_ENDIAN);
        LongBuffer s10 = b10.asLongBuffer();
        long[] data = new long[d10.length / 8];
        s10.get(data);
        return data;
    }

    private static int[] $d2j$hex$b0ee2986$decode_I(String src) {
        byte[] d10 = $d2j$hex$b0ee2986$decode_B(src);
        ByteBuffer b10 = ByteBuffer.wrap(d10);
        b10.order(ByteOrder.LITTLE_ENDIAN);
        IntBuffer s10 = b10.asIntBuffer();
        int[] data = new int[d10.length / 4];
        s10.get(data);
        return data;
    }

    private static short[] $d2j$hex$b0ee2986$decode_S(String src) {
        byte[] d10 = $d2j$hex$b0ee2986$decode_B(src);
        ByteBuffer b10 = ByteBuffer.wrap(d10);
        b10.order(ByteOrder.LITTLE_ENDIAN);
        ShortBuffer s10 = b10.asShortBuffer();
        short[] data = new short[d10.length / 2];
        s10.get(data);
        return data;
    }

    private static byte[] $d2j$hex$b0ee2986$decode_B(String src) {
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
