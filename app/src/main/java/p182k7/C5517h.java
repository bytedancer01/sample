package p182k7;

import org.apache.http.HttpHeaders;
import p057d7.C4332o;
import p059d9.C4361f0;
import p059d9.C4392v;
import p267p6.C7629w0;
import p283q7.C7839a;
import p366v7.AbstractC9301i;
import p366v7.C9293a;
import p366v7.C9297e;
import p366v7.C9302j;
import p366v7.C9305m;
import p381w7.C9425a;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:k7/h.class
 */
/* renamed from: k7.h */
/* loaded from: combined.jar:classes2.jar:k7/h.class */
public final class C5517h {

    /* renamed from: a */
    public static final String[] f31483a = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", HttpHeaders.TRAILER, "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Afro-Punk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop", "Abstract", "Art Rock", "Baroque", "Bhangra", "Big beat", "Breakbeat", "Chillout", "Downtempo", "Dub", "EBM", "Eclectic", "Electro", "Electroclash", "Emo", "Experimental", "Garage", "Global", "IDM", "Illbient", "Industro-Goth", "Jam Band", "Krautrock", "Leftfield", "Lounge", "Math Rock", "New Romantic", "Nu-Breakz", "Post-Punk", "Post-Rock", "Psytrance", "Shoegaze", "Space Rock", "Trop Rock", "World Music", "Neoclassical", "Audiobook", "Audio theatre", "Neue Deutsche Welle", "Podcast", "Indie-Rock", "G-Funk", "Dubstep", "Garage Rock", "Psybient"};

    /* renamed from: a */
    public static C9297e m27435a(int i10, C4361f0 c4361f0) {
        int m21998n = c4361f0.m21998n();
        if (c4361f0.m21998n() == 1684108385) {
            c4361f0.m21984Q(8);
            String m22009y = c4361f0.m22009y(m21998n - 16);
            return new C9297e("und", m22009y, m22009y);
        }
        C4392v.m22275i("MetadataUtil", "Failed to parse comment attribute: " + AbstractC5510a.m27340a(i10));
        return null;
    }

    /* renamed from: b */
    public static C9293a m27436b(C4361f0 c4361f0) {
        String str;
        int m21998n = c4361f0.m21998n();
        if (c4361f0.m21998n() == 1684108385) {
            int m27341b = AbstractC5510a.m27341b(c4361f0.m21998n());
            String str2 = m27341b == 13 ? "image/jpeg" : m27341b == 14 ? "image/png" : null;
            if (str2 != null) {
                c4361f0.m21984Q(4);
                int i10 = m21998n - 16;
                byte[] bArr = new byte[i10];
                c4361f0.m21994j(bArr, 0, i10);
                return new C9293a(str2, null, 3, bArr);
            }
            str = "Unrecognized cover art flags: " + m27341b;
        } else {
            str = "Failed to parse cover art attribute";
        }
        C4392v.m22275i("MetadataUtil", str);
        return null;
    }

    /* renamed from: c */
    public static C7839a.b m27437c(C4361f0 c4361f0) {
        int m21989e = c4361f0.m21989e() + c4361f0.m21998n();
        int m21998n = c4361f0.m21998n();
        int i10 = (m21998n >> 24) & 255;
        try {
            if (i10 == 169 || i10 == 253) {
                int i11 = 16777215 & m21998n;
                if (i11 == 6516084) {
                    return m27435a(m21998n, c4361f0);
                }
                if (i11 == 7233901 || i11 == 7631467) {
                    return m27442h(m21998n, "TIT2", c4361f0);
                }
                if (i11 == 6516589 || i11 == 7828084) {
                    return m27442h(m21998n, "TCOM", c4361f0);
                }
                if (i11 == 6578553) {
                    return m27442h(m21998n, "TDRC", c4361f0);
                }
                if (i11 == 4280916) {
                    return m27442h(m21998n, "TPE1", c4361f0);
                }
                if (i11 == 7630703) {
                    return m27442h(m21998n, "TSSE", c4361f0);
                }
                if (i11 == 6384738) {
                    return m27442h(m21998n, "TALB", c4361f0);
                }
                if (i11 == 7108978) {
                    return m27442h(m21998n, "USLT", c4361f0);
                }
                if (i11 == 6776174) {
                    return m27442h(m21998n, "TCON", c4361f0);
                }
                if (i11 == 6779504) {
                    return m27442h(m21998n, "TIT1", c4361f0);
                }
            } else {
                if (m21998n == 1735291493) {
                    return m27441g(c4361f0);
                }
                if (m21998n == 1684632427) {
                    return m27438d(m21998n, "TPOS", c4361f0);
                }
                if (m21998n == 1953655662) {
                    return m27438d(m21998n, "TRCK", c4361f0);
                }
                if (m21998n == 1953329263) {
                    return m27443i(m21998n, "TBPM", c4361f0, true, false);
                }
                if (m21998n == 1668311404) {
                    return m27443i(m21998n, "TCMP", c4361f0, true, true);
                }
                if (m21998n == 1668249202) {
                    return m27436b(c4361f0);
                }
                if (m21998n == 1631670868) {
                    return m27442h(m21998n, "TPE2", c4361f0);
                }
                if (m21998n == 1936682605) {
                    return m27442h(m21998n, "TSOT", c4361f0);
                }
                if (m21998n == 1936679276) {
                    return m27442h(m21998n, "TSO2", c4361f0);
                }
                if (m21998n == 1936679282) {
                    return m27442h(m21998n, "TSOA", c4361f0);
                }
                if (m21998n == 1936679265) {
                    return m27442h(m21998n, "TSOP", c4361f0);
                }
                if (m21998n == 1936679791) {
                    return m27442h(m21998n, "TSOC", c4361f0);
                }
                if (m21998n == 1920233063) {
                    return m27443i(m21998n, "ITUNESADVISORY", c4361f0, false, false);
                }
                if (m21998n == 1885823344) {
                    return m27443i(m21998n, "ITUNESGAPLESS", c4361f0, false, true);
                }
                if (m21998n == 1936683886) {
                    return m27442h(m21998n, "TVSHOWSORT", c4361f0);
                }
                if (m21998n == 1953919848) {
                    return m27442h(m21998n, "TVSHOW", c4361f0);
                }
                if (m21998n == 757935405) {
                    return m27439e(c4361f0, m21989e);
                }
            }
            C4392v.m22268b("MetadataUtil", "Skipped unknown metadata entry: " + AbstractC5510a.m27340a(m21998n));
            c4361f0.m21983P(m21989e);
            return null;
        } finally {
            c4361f0.m21983P(m21989e);
        }
    }

    /* renamed from: d */
    public static C9305m m27438d(int i10, String str, C4361f0 c4361f0) {
        int m21998n = c4361f0.m21998n();
        if (c4361f0.m21998n() == 1684108385 && m21998n >= 22) {
            c4361f0.m21984Q(10);
            int m21977J = c4361f0.m21977J();
            if (m21977J > 0) {
                String str2 = "" + m21977J;
                int m21977J2 = c4361f0.m21977J();
                String str3 = str2;
                if (m21977J2 > 0) {
                    str3 = str2 + "/" + m21977J2;
                }
                return new C9305m(str, null, str3);
            }
        }
        C4392v.m22275i("MetadataUtil", "Failed to parse index/count attribute: " + AbstractC5510a.m27340a(i10));
        return null;
    }

    /* renamed from: e */
    public static AbstractC9301i m27439e(C4361f0 c4361f0, int i10) {
        String str = null;
        String str2 = null;
        int i11 = -1;
        int i12 = -1;
        while (c4361f0.m21989e() < i10) {
            int m21989e = c4361f0.m21989e();
            int m21998n = c4361f0.m21998n();
            int m21998n2 = c4361f0.m21998n();
            c4361f0.m21984Q(4);
            if (m21998n2 == 1835360622) {
                str = c4361f0.m22009y(m21998n - 12);
            } else if (m21998n2 == 1851878757) {
                str2 = c4361f0.m22009y(m21998n - 12);
            } else {
                if (m21998n2 == 1684108385) {
                    i11 = m21989e;
                    i12 = m21998n;
                }
                c4361f0.m21984Q(m21998n - 12);
            }
        }
        if (str == null || str2 == null || i11 == -1) {
            return null;
        }
        c4361f0.m21983P(i11);
        c4361f0.m21984Q(16);
        return new C9302j(str, str2, c4361f0.m22009y(i12 - 16));
    }

    /* renamed from: f */
    public static C9425a m27440f(C4361f0 c4361f0, int i10, String str) {
        while (true) {
            int m21989e = c4361f0.m21989e();
            if (m21989e >= i10) {
                return null;
            }
            int m21998n = c4361f0.m21998n();
            if (c4361f0.m21998n() == 1684108385) {
                int m21998n2 = c4361f0.m21998n();
                int m21998n3 = c4361f0.m21998n();
                int i11 = m21998n - 16;
                byte[] bArr = new byte[i11];
                c4361f0.m21994j(bArr, 0, i11);
                return new C9425a(str, bArr, m21998n3, m21998n2);
            }
            c4361f0.m21983P(m21989e + m21998n);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static p366v7.C9305m m27441g(p059d9.C4361f0 r6) {
        /*
            r0 = r6
            int r0 = m27444j(r0)
            r7 = r0
            r0 = r7
            if (r0 <= 0) goto L1c
            java.lang.String[] r0 = p182k7.C5517h.f31483a
            r6 = r0
            r0 = r7
            r1 = r6
            int r1 = r1.length
            if (r0 > r1) goto L1c
            r0 = r6
            r1 = r7
            r2 = 1
            int r1 = r1 - r2
            r0 = r0[r1]
            r6 = r0
            goto L1e
        L1c:
            r0 = 0
            r6 = r0
        L1e:
            r0 = r6
            if (r0 == 0) goto L2f
            v7.m r0 = new v7.m
            r1 = r0
            java.lang.String r2 = "TCON"
            r3 = 0
            r4 = r6
            r1.<init>(r2, r3, r4)
            return r0
        L2f:
            java.lang.String r0 = "MetadataUtil"
            java.lang.String r1 = "Failed to parse standard genre code"
            p059d9.C4392v.m22275i(r0, r1)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p182k7.C5517h.m27441g(d9.f0):v7.m");
    }

    /* renamed from: h */
    public static C9305m m27442h(int i10, String str, C4361f0 c4361f0) {
        int m21998n = c4361f0.m21998n();
        if (c4361f0.m21998n() == 1684108385) {
            c4361f0.m21984Q(8);
            return new C9305m(str, null, c4361f0.m22009y(m21998n - 16));
        }
        C4392v.m22275i("MetadataUtil", "Failed to parse text attribute: " + AbstractC5510a.m27340a(i10));
        return null;
    }

    /* renamed from: i */
    public static AbstractC9301i m27443i(int i10, String str, C4361f0 c4361f0, boolean z10, boolean z11) {
        int m27444j = m27444j(c4361f0);
        int i11 = m27444j;
        if (z11) {
            i11 = Math.min(1, m27444j);
        }
        if (i11 >= 0) {
            return z10 ? new C9305m(str, null, Integer.toString(i11)) : new C9297e("und", str, Integer.toString(i11));
        }
        C4392v.m22275i("MetadataUtil", "Failed to parse uint8 attribute: " + AbstractC5510a.m27340a(i10));
        return null;
    }

    /* renamed from: j */
    public static int m27444j(C4361f0 c4361f0) {
        c4361f0.m21984Q(4);
        if (c4361f0.m21998n() == 1684108385) {
            c4361f0.m21984Q(8);
            return c4361f0.m21971D();
        }
        C4392v.m22275i("MetadataUtil", "Failed to parse uint8 attribute value");
        return -1;
    }

    /* renamed from: k */
    public static void m27445k(int i10, C4332o c4332o, C7629w0.b bVar) {
        if (i10 == 1 && c4332o.m21836a()) {
            bVar.m33202M(c4332o.f26488a).m33203N(c4332o.f26489b);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0016, code lost:
    
        if (r8 != null) goto L21;
     */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void m27446l(int r7, p283q7.C7839a r8, p283q7.C7839a r9, p267p6.C7629w0.b r10, p283q7.C7839a... r11) {
        /*
            r0 = 0
            r12 = r0
            q7.a r0 = new q7.a
            r1 = r0
            r2 = 0
            q7.a$b[] r2 = new p283q7.C7839a.b[r2]
            r1.<init>(r2)
            r14 = r0
            r0 = r7
            r1 = 1
            if (r0 != r1) goto L1c
            r0 = r8
            if (r0 == 0) goto L67
            goto L6a
        L1c:
            r0 = r7
            r1 = 2
            if (r0 != r1) goto L67
            r0 = r9
            if (r0 == 0) goto L67
            r0 = 0
            r7 = r0
        L27:
            r0 = r7
            r1 = r9
            int r1 = r1.m34087k()
            if (r0 >= r1) goto L67
            r0 = r9
            r1 = r7
            q7.a$b r0 = r0.m34086j(r1)
            r8 = r0
            r0 = r8
            boolean r0 = r0 instanceof p381w7.C9425a
            if (r0 == 0) goto L61
            r0 = r8
            w7.a r0 = (p381w7.C9425a) r0
            r8 = r0
            java.lang.String r0 = "com.android.capture.fps"
            r1 = r8
            java.lang.String r1 = r1.f43179b
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L61
            q7.a r0 = new q7.a
            r1 = r0
            r2 = 1
            q7.a$b[] r2 = new p283q7.C7839a.b[r2]
            r3 = r2
            r4 = 0
            r5 = r8
            r3[r4] = r5
            r1.<init>(r2)
            r8 = r0
            goto L6a
        L61:
            int r7 = r7 + 1
            goto L27
        L67:
            r0 = r14
            r8 = r0
        L6a:
            r0 = r11
            int r0 = r0.length
            r13 = r0
            r0 = r12
            r7 = r0
        L72:
            r0 = r7
            r1 = r13
            if (r0 >= r1) goto L87
            r0 = r8
            r1 = r11
            r2 = r7
            r1 = r1[r2]
            q7.a r0 = r0.m34085c(r1)
            r8 = r0
            int r7 = r7 + 1
            goto L72
        L87:
            r0 = r8
            int r0 = r0.m34087k()
            if (r0 <= 0) goto L94
            r0 = r10
            r1 = r8
            p6.w0$b r0 = r0.m33213X(r1)
        L94:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p182k7.C5517h.m27446l(int, q7.a, q7.a, p6.w0$b, q7.a[]):void");
    }
}
