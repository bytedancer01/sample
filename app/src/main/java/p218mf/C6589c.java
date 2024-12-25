package p218mf;

import android.content.Intent;
import android.net.Uri;
import com.amazonaws.mobileconnectors.appsync.AWSAppSyncClient;
import com.amazonaws.mobileconnectors.appsync.AppSyncMutationsSqlHelper;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.achartengine.ChartFactory;
import p059d9.C4349a;
import p059d9.C4401z0;
import p099fc.AbstractC4834t;
import p267p6.C7561b1;
import p267p6.C7565c1;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:mf/c.class
 */
/* renamed from: mf.c */
/* loaded from: combined.jar:classes2.jar:mf/c.class */
public class C6589c {
    /* renamed from: a */
    public static void m30449a(C7561b1.d dVar, Intent intent, String str) {
        if (dVar.f36484a != 0) {
            intent.putExtra("clip_start_position_ms" + str, dVar.f36484a);
        }
        if (dVar.f36485b != Long.MIN_VALUE) {
            intent.putExtra("clip_end_position_ms" + str, dVar.f36485b);
        }
    }

    /* renamed from: b */
    public static void m30450b(C7561b1.e eVar, Intent intent, String str) {
        intent.putExtra("drm_scheme" + str, eVar.f36489a.toString());
        String str2 = "drm_license_uri" + str;
        Uri uri = eVar.f36490b;
        intent.putExtra(str2, uri != null ? uri.toString() : null);
        intent.putExtra("drm_multi_session" + str, eVar.f36492d);
        intent.putExtra("drm_force_default_license_uri" + str, eVar.f36494f);
        String[] strArr = new String[eVar.f36491c.size() * 2];
        int i10 = 0;
        for (Map.Entry<String, String> entry : eVar.f36491c.entrySet()) {
            int i11 = i10 + 1;
            strArr[i10] = entry.getKey();
            i10 = i11 + 1;
            strArr[i11] = entry.getValue();
        }
        intent.putExtra("drm_key_request_properties" + str, strArr);
        List<Integer> list = eVar.f36495g;
        if (list.isEmpty()) {
            return;
        }
        boolean z10 = false;
        if (list.size() == 2) {
            z10 = false;
            if (list.contains(2)) {
                z10 = false;
                if (list.contains(1)) {
                    z10 = true;
                }
            }
        }
        C4349a.m21884g(z10);
        intent.putExtra("drm_session_for_clear_content" + str, true);
    }

    /* renamed from: c */
    public static void m30451c(C7561b1.g gVar, Intent intent, String str) {
        Intent putExtra = intent.putExtra(AppSyncMutationsSqlHelper.COLUMN_MIME_TYPE + str, gVar.f36505b);
        String str2 = "ad_tag_uri" + str;
        C7561b1.b bVar = gVar.f36507d;
        putExtra.putExtra(str2, bVar != null ? bVar.f36453a.toString() : null);
        C7561b1.e eVar = gVar.f36506c;
        if (eVar != null) {
            m30450b(eVar, intent, str);
        }
        if (gVar.f36510g.isEmpty()) {
            return;
        }
        boolean z10 = true;
        if (gVar.f36510g.size() != 1) {
            z10 = false;
        }
        C4349a.m21884g(z10);
        C7561b1.h hVar = gVar.f36510g.get(0);
        intent.putExtra("subtitle_uri" + str, hVar.f36512a.toString());
        intent.putExtra("subtitle_mime_type" + str, hVar.f36513b);
        intent.putExtra("subtitle_language" + str, hVar.f36514c);
    }

    /* renamed from: d */
    public static void m30452d(List<C7561b1> list, Intent intent) {
        C4349a.m21878a(!list.isEmpty());
        if (list.size() == 1) {
            C7561b1 c7561b1 = list.get(0);
            C7561b1.g gVar = (C7561b1.g) C4349a.m21882e(c7561b1.f36449b);
            intent.setAction("com.google.android.exoplayer.demo.action.VIEW").setData(c7561b1.f36449b.f36504a);
            CharSequence charSequence = c7561b1.f36451d.f36602a;
            if (charSequence != null) {
                intent.putExtra(ChartFactory.TITLE, charSequence);
            }
            m30451c(gVar, intent, "");
            m30449a(c7561b1.f36452e, intent, "");
            return;
        }
        intent.setAction("com.google.android.exoplayer.demo.action.VIEW_LIST");
        for (int i10 = 0; i10 < list.size(); i10++) {
            C7561b1 c7561b12 = list.get(i10);
            C7561b1.g gVar2 = (C7561b1.g) C4349a.m21882e(c7561b12.f36449b);
            intent.putExtra("uri" + AWSAppSyncClient.DATABASE_NAME_DELIMITER + i10, gVar2.f36504a.toString());
            StringBuilder sb2 = new StringBuilder();
            sb2.append(AWSAppSyncClient.DATABASE_NAME_DELIMITER);
            sb2.append(i10);
            m30451c(gVar2, intent, sb2.toString());
            m30449a(c7561b12.f36452e, intent, AWSAppSyncClient.DATABASE_NAME_DELIMITER + i10);
            if (c7561b12.f36451d.f36602a != null) {
                intent.putExtra(ChartFactory.TITLE + AWSAppSyncClient.DATABASE_NAME_DELIMITER + i10, c7561b12.f36451d.f36602a);
            }
        }
    }

    /* renamed from: e */
    public static C7561b1 m30453e(Uri uri, Intent intent, String str) {
        return m30456h(new C7561b1.c().m32348B(uri).m32373x(intent.getStringExtra(AppSyncMutationsSqlHelper.COLUMN_MIME_TYPE + str)).m32372w(new C7565c1.b().m32576V(intent.getStringExtra(ChartFactory.TITLE + str)).m32560F()).m32353d(intent.getStringExtra("ad_tag_uri" + str)).m32375z(m30455g(intent, str)).m32355f(intent.getLongExtra("clip_start_position_ms" + str, 0L)).m32354e(intent.getLongExtra("clip_end_position_ms" + str, Long.MIN_VALUE)), intent, str).m32350a();
    }

    /* renamed from: f */
    public static List<C7561b1> m30454f(Intent intent) {
        ArrayList arrayList = new ArrayList();
        if ("com.google.android.exoplayer.demo.action.VIEW_LIST".equals(intent.getAction())) {
            int i10 = 0;
            while (true) {
                if (!intent.hasExtra("uri_" + i10)) {
                    break;
                }
                arrayList.add(m30453e(Uri.parse(intent.getStringExtra("uri_" + i10)), intent, AWSAppSyncClient.DATABASE_NAME_DELIMITER + i10));
                i10++;
            }
        } else {
            arrayList.add(m30453e(intent.getData(), intent, ""));
        }
        return arrayList;
    }

    /* renamed from: g */
    public static List<C7561b1.h> m30455g(Intent intent, String str) {
        if (!intent.hasExtra("subtitle_uri" + str)) {
            return Collections.emptyList();
        }
        return Collections.singletonList(new C7561b1.h(Uri.parse(intent.getStringExtra("subtitle_uri" + str)), (String) C4349a.m21882e(intent.getStringExtra("subtitle_mime_type" + str)), intent.getStringExtra("subtitle_language" + str), 1));
    }

    /* renamed from: h */
    public static C7561b1.c m30456h(C7561b1.c cVar, Intent intent, String str) {
        String stringExtra = intent.getStringExtra("drm_scheme" + str);
        if (stringExtra == null) {
            return cVar;
        }
        HashMap hashMap = new HashMap();
        String[] stringArrayExtra = intent.getStringArrayExtra("drm_key_request_properties" + str);
        if (stringArrayExtra != null) {
            for (int i10 = 0; i10 < stringArrayExtra.length; i10 += 2) {
                hashMap.put(stringArrayExtra[i10], stringArrayExtra[i10 + 1]);
            }
        }
        cVar.m32365p(C4401z0.m22355V((String) C4401z0.m22391j(stringExtra))).m32361l(intent.getStringExtra("drm_license_uri" + str)).m32362m(intent.getBooleanExtra("drm_multi_session" + str, false)).m32357h(intent.getBooleanExtra("drm_force_default_license_uri" + str, false)).m32359j(hashMap);
        if (intent.getBooleanExtra("drm_session_for_clear_content" + str, false)) {
            cVar.m32364o(AbstractC4834t.m24541G(2, 1));
        }
        return cVar;
    }
}
