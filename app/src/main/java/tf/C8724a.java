package tf;

import android.util.Base64;
import com.maxdigitall.maxdigitaliptvbox.model.database.LiveStreamDBHandler;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:tf/a.class
 */
/* renamed from: tf.a */
/* loaded from: combined.jar:classes2.jar:tf/a.class */
public class C8724a {

    /* renamed from: a */
    public LiveStreamDBHandler f40534a;

    /* renamed from: b */
    public HashMap<String, String> f40535b = new HashMap<>();

    /* renamed from: a */
    public final String m37275a(String str) {
        return Base64.encodeToString(str.getBytes(StandardCharsets.UTF_8), 0).replace("\n", "");
    }

    /* renamed from: b */
    public String m37276b(InputStream inputStream) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            StringBuilder sb2 = new StringBuilder();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    inputStream.close();
                    return sb2.toString();
                }
                sb2.append(readLine + "\n");
            }
        } catch (Exception e10) {
            return "";
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0056, code lost:
    
        if (r0.contains("tvg-logo") == false) goto L19;
     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String m37277c(java.io.InputStream r4, android.content.Context r5) {
        /*
            r3 = this;
            java.io.BufferedReader r0 = new java.io.BufferedReader     // Catch: java.lang.Exception -> L71
            r9 = r0
            java.io.InputStreamReader r0 = new java.io.InputStreamReader     // Catch: java.lang.Exception -> L71
            r5 = r0
            r0 = r5
            r1 = r4
            r0.<init>(r1)     // Catch: java.lang.Exception -> L71
            r0 = r9
            r1 = r5
            r0.<init>(r1)     // Catch: java.lang.Exception -> L71
            java.lang.String r0 = ""
            r5 = r0
        L17:
            r0 = r9
            java.lang.String r0 = r0.readLine()     // Catch: java.lang.Exception -> L71
            r8 = r0
            r0 = r5
            r7 = r0
            r0 = r8
            if (r0 == 0) goto L6a
            r0 = r8
            java.lang.String r1 = "http://"
            boolean r0 = r0.contains(r1)     // Catch: java.lang.Exception -> L71
            r6 = r0
            r0 = r6
            if (r0 == 0) goto L3f
            r0 = r8
            java.lang.String r1 = "tvg-logo"
            boolean r0 = r0.contains(r1)     // Catch: java.lang.Exception -> L71
            if (r0 != 0) goto L3f
            goto L59
        L3f:
            r0 = r5
            r7 = r0
            r0 = r8
            java.lang.String r1 = "https://"
            boolean r0 = r0.contains(r1)     // Catch: java.lang.Exception -> L71
            if (r0 == 0) goto L5d
            r0 = r5
            r7 = r0
            r0 = r8
            java.lang.String r1 = "tvg-logo"
            boolean r0 = r0.contains(r1)     // Catch: java.lang.Exception -> L71
            if (r0 != 0) goto L5d
        L59:
            r0 = r8
            r7 = r0
        L5d:
            r0 = r7
            r5 = r0
            r0 = r7
            java.lang.String r1 = ""
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Exception -> L71
            if (r0 != 0) goto L17
        L6a:
            r0 = r4
            r0.close()     // Catch: java.lang.Exception -> L71
            r0 = r7
            return r0
        L71:
            r4 = move-exception
            java.lang.String r0 = ""
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: tf.C8724a.m37277c(java.io.InputStream, android.content.Context):java.lang.String");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Can't wrap try/catch for region: R(12:13|(3:326|327|(7:332|100|101|102|(3:303|304|(15:309|(2:316|317)(14:311|(1:313)|108|109|(2:286|287)(10:111|(1:113)|285|116|(9:123|(7:125|(1:127)(1:135)|128|129|(1:131)(1:134)|132|133)|136|(6:141|(1:143)(1:283)|144|145|146|(8:148|149|150|151|152|120|121|122)(7:155|156|157|(4:277|278|279|280)(4:159|160|161|(4:271|272|273|274)(3:163|164|(4:265|266|267|268)(3:166|167|(4:259|260|261|262)(3:169|170|(4:253|254|255|256)(3:172|173|(4:247|248|249|250)(3:175|176|(4:241|242|243|244)(3:178|179|(4:235|236|237|238)(3:181|182|(4:229|230|231|232)(4:184|185|(3:223|224|225)(2:187|(5:189|190|191|192|193)(2:197|(5:199|200|201|202|203)(2:206|(4:208|209|210|211)(5:215|216|217|218|122))))|194)))))))))|120|121|122))|284|144|145|146|(0)(0))|118|119|120|121|122)|114|115|116|(0)|118|119|120|121|122)|314|315|109|(0)(0)|114|115|116|(0)|118|119|120|121|122))|104|(13:298|299|109|(0)(0)|114|115|116|(0)|118|119|120|121|122)(14:106|(13:290|291|109|(0)(0)|114|115|116|(0)|118|119|120|121|122)|108|109|(0)(0)|114|115|116|(0)|118|119|120|121|122)))|15|16|(10:20|21|22|(4:24|25|26|(1:28)(4:29|30|(4:32|33|34|(5:36|37|38|39|40)(4:42|43|44|45))(3:46|47|(4:49|50|51|(5:53|54|55|56|57)(4:58|59|60|61))(3:62|63|(4:65|66|67|(8:69|70|71|72|73|(5:75|76|77|78|79)|80|81)(4:82|83|84|85))(1:86)))|41))|87|88|(5:90|91|92|93|94)(4:95|96|97|98)|41|17|18)|99|100|101|102|(0)|104|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:323:0x02c4, code lost:
    
        r13 = r13;
     */
    /* JADX WARN: Removed duplicated region for block: B:106:0x03a5 A[Catch: Exception -> 0x3fd0, TRY_ENTER, TRY_LEAVE, TryCatch #47 {Exception -> 0x3fd0, blocks: (B:304:0x02dd, B:306:0x02e7, B:309:0x02f4, B:109:0x03f4, B:116:0x044f, B:123:0x0462, B:125:0x047d, B:129:0x049a, B:131:0x04a4, B:133:0x04ba, B:134:0x04c2, B:135:0x048c, B:136:0x04d0, B:138:0x04e1, B:141:0x04ee, B:143:0x04f8, B:145:0x0515, B:283:0x0502, B:284:0x050c, B:111:0x0425, B:311:0x0327, B:104:0x034f, B:106:0x03a5, B:294:0x03d6, B:296:0x0399, B:302:0x0380, B:291:0x03b3, B:299:0x035d), top: B:303:0x02dd, inners: #46, #79 }] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0425 A[Catch: Exception -> 0x3fd0, TRY_ENTER, TRY_LEAVE, TryCatch #47 {Exception -> 0x3fd0, blocks: (B:304:0x02dd, B:306:0x02e7, B:309:0x02f4, B:109:0x03f4, B:116:0x044f, B:123:0x0462, B:125:0x047d, B:129:0x049a, B:131:0x04a4, B:133:0x04ba, B:134:0x04c2, B:135:0x048c, B:136:0x04d0, B:138:0x04e1, B:141:0x04ee, B:143:0x04f8, B:145:0x0515, B:283:0x0502, B:284:0x050c, B:111:0x0425, B:311:0x0327, B:104:0x034f, B:106:0x03a5, B:294:0x03d6, B:296:0x0399, B:302:0x0380, B:291:0x03b3, B:299:0x035d), top: B:303:0x02dd, inners: #46, #79 }] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0462 A[Catch: Exception -> 0x3fd0, TRY_ENTER, TryCatch #47 {Exception -> 0x3fd0, blocks: (B:304:0x02dd, B:306:0x02e7, B:309:0x02f4, B:109:0x03f4, B:116:0x044f, B:123:0x0462, B:125:0x047d, B:129:0x049a, B:131:0x04a4, B:133:0x04ba, B:134:0x04c2, B:135:0x048c, B:136:0x04d0, B:138:0x04e1, B:141:0x04ee, B:143:0x04f8, B:145:0x0515, B:283:0x0502, B:284:0x050c, B:111:0x0425, B:311:0x0327, B:104:0x034f, B:106:0x03a5, B:294:0x03d6, B:296:0x0399, B:302:0x0380, B:291:0x03b3, B:299:0x035d), top: B:303:0x02dd, inners: #46, #79 }] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0523  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x053f  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0402 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:298:0x035d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:303:0x02dd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean m37278d(java.io.InputStream r6, android.content.Context r7) {
        /*
            Method dump skipped, instructions count: 16628
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tf.C8724a.m37278d(java.io.InputStream, android.content.Context):boolean");
    }
}
