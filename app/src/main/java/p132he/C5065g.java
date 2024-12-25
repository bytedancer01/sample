package p132he;

import java.util.ArrayList;
import java.util.List;
import org.apache.commons.net.ftp.FTPReply;
import org.apache.commons.net.nntp.NNTPReply;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:he/g.class
 */
/* renamed from: he.g */
/* loaded from: combined.jar:classes2.jar:he/g.class */
public final class C5065g {

    /* renamed from: a */
    public final List<int[]> f29160a = new ArrayList();

    /* renamed from: b */
    public final List<String> f29161b = new ArrayList();

    /* renamed from: a */
    public final void m25318a(int[] iArr, String str) {
        this.f29160a.add(iArr);
        this.f29161b.add(str);
    }

    /* renamed from: b */
    public final void m25319b() {
        synchronized (this) {
            if (this.f29160a.isEmpty()) {
                m25318a(new int[]{0, 19}, "US/CA");
                m25318a(new int[]{30, 39}, "US");
                m25318a(new int[]{60, 139}, "US/CA");
                m25318a(new int[]{300, 379}, "FR");
                m25318a(new int[]{380}, "BG");
                m25318a(new int[]{383}, "SI");
                m25318a(new int[]{385}, "HR");
                m25318a(new int[]{387}, "BA");
                m25318a(new int[]{400, NNTPReply.POSTING_NOT_ALLOWED}, "DE");
                m25318a(new int[]{450, 459}, "JP");
                m25318a(new int[]{460, 469}, "RU");
                m25318a(new int[]{471}, "TW");
                m25318a(new int[]{474}, "EE");
                m25318a(new int[]{475}, "LV");
                m25318a(new int[]{476}, "AZ");
                m25318a(new int[]{477}, "LT");
                m25318a(new int[]{478}, "UZ");
                m25318a(new int[]{479}, "LK");
                m25318a(new int[]{NNTPReply.AUTHENTICATION_REQUIRED}, "PH");
                m25318a(new int[]{481}, "BY");
                m25318a(new int[]{NNTPReply.AUTHENTICATION_REJECTED}, "UA");
                m25318a(new int[]{484}, "MD");
                m25318a(new int[]{485}, "AM");
                m25318a(new int[]{486}, "GE");
                m25318a(new int[]{487}, "KZ");
                m25318a(new int[]{489}, "HK");
                m25318a(new int[]{490, 499}, "JP");
                m25318a(new int[]{500, 509}, "GB");
                m25318a(new int[]{520}, "GR");
                m25318a(new int[]{528}, "LB");
                m25318a(new int[]{529}, "CY");
                m25318a(new int[]{531}, "MK");
                m25318a(new int[]{FTPReply.FAILED_SECURITY_CHECK}, "MT");
                m25318a(new int[]{539}, "IE");
                m25318a(new int[]{540, 549}, "BE/LU");
                m25318a(new int[]{560}, "PT");
                m25318a(new int[]{569}, "IS");
                m25318a(new int[]{570, 579}, "DK");
                m25318a(new int[]{590}, "PL");
                m25318a(new int[]{594}, "RO");
                m25318a(new int[]{599}, "HU");
                m25318a(new int[]{600, 601}, "ZA");
                m25318a(new int[]{603}, "GH");
                m25318a(new int[]{608}, "BH");
                m25318a(new int[]{609}, "MU");
                m25318a(new int[]{611}, "MA");
                m25318a(new int[]{613}, "DZ");
                m25318a(new int[]{616}, "KE");
                m25318a(new int[]{618}, "CI");
                m25318a(new int[]{619}, "TN");
                m25318a(new int[]{621}, "SY");
                m25318a(new int[]{622}, "EG");
                m25318a(new int[]{624}, "LY");
                m25318a(new int[]{625}, "JO");
                m25318a(new int[]{626}, "IR");
                m25318a(new int[]{627}, "KW");
                m25318a(new int[]{628}, "SA");
                m25318a(new int[]{629}, "AE");
                m25318a(new int[]{640, 649}, "FI");
                m25318a(new int[]{690, 695}, "CN");
                m25318a(new int[]{700, 709}, "NO");
                m25318a(new int[]{729}, "IL");
                m25318a(new int[]{730, 739}, "SE");
                m25318a(new int[]{740}, "GT");
                m25318a(new int[]{741}, "SV");
                m25318a(new int[]{742}, "HN");
                m25318a(new int[]{743}, "NI");
                m25318a(new int[]{744}, "CR");
                m25318a(new int[]{745}, "PA");
                m25318a(new int[]{746}, "DO");
                m25318a(new int[]{750}, "MX");
                m25318a(new int[]{754, 755}, "CA");
                m25318a(new int[]{759}, "VE");
                m25318a(new int[]{760, 769}, "CH");
                m25318a(new int[]{770}, "CO");
                m25318a(new int[]{773}, "UY");
                m25318a(new int[]{775}, "PE");
                m25318a(new int[]{777}, "BO");
                m25318a(new int[]{779}, "AR");
                m25318a(new int[]{780}, "CL");
                m25318a(new int[]{784}, "PY");
                m25318a(new int[]{785}, "PE");
                m25318a(new int[]{786}, "EC");
                m25318a(new int[]{789, 790}, "BR");
                m25318a(new int[]{800, 839}, "IT");
                m25318a(new int[]{840, 849}, "ES");
                m25318a(new int[]{850}, "CU");
                m25318a(new int[]{858}, "SK");
                m25318a(new int[]{859}, "CZ");
                m25318a(new int[]{860}, "YU");
                m25318a(new int[]{865}, "MN");
                m25318a(new int[]{867}, "KP");
                m25318a(new int[]{868, 869}, "TR");
                m25318a(new int[]{870, 879}, "NL");
                m25318a(new int[]{880}, "KR");
                m25318a(new int[]{885}, "TH");
                m25318a(new int[]{888}, "SG");
                m25318a(new int[]{890}, "IN");
                m25318a(new int[]{893}, "VN");
                m25318a(new int[]{896}, "PK");
                m25318a(new int[]{899}, "ID");
                m25318a(new int[]{900, 919}, "AT");
                m25318a(new int[]{930, 939}, "AU");
                m25318a(new int[]{940, 949}, "AZ");
                m25318a(new int[]{955}, "MY");
                m25318a(new int[]{958}, "MO");
            }
        }
    }

    /* renamed from: c */
    public String m25320c(String str) {
        m25319b();
        int parseInt = Integer.parseInt(str.substring(0, 3));
        int size = this.f29160a.size();
        for (int i10 = 0; i10 < size; i10++) {
            int[] iArr = this.f29160a.get(i10);
            int i11 = iArr[0];
            if (parseInt < i11) {
                return null;
            }
            if (iArr.length != 1) {
                i11 = iArr[1];
            }
            if (parseInt <= i11) {
                return this.f29161b.get(i10);
            }
        }
        return null;
    }
}
