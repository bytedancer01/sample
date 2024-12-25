package p203lf;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.maxdigitall.maxdigitaliptvbox.model.database.DatabaseHandler;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:lf/e.class
 */
/* renamed from: lf.e */
/* loaded from: combined.jar:classes2.jar:lf/e.class */
public class C5852e extends BaseAdapter {

    /* renamed from: b */
    public List<String> f32538b;

    /* renamed from: d */
    public List<String> f32540d;

    /* renamed from: e */
    public LayoutInflater f32541e;

    /* renamed from: f */
    public Context f32542f;

    /* renamed from: g */
    public DatabaseHandler f32543g;

    /* renamed from: h */
    public a f32544h;

    /* renamed from: k */
    public File f32547k;

    /* renamed from: l */
    public File f32548l;

    /* renamed from: s */
    public String f32555s;

    /* renamed from: m */
    public int f32549m = 0;

    /* renamed from: n */
    public int f32550n = 0;

    /* renamed from: o */
    public int f32551o = 0;

    /* renamed from: p */
    public int f32552p = 0;

    /* renamed from: q */
    public int f32553q = 0;

    /* renamed from: r */
    public int f32554r = 0;

    /* renamed from: t */
    public int f32556t = 0;

    /* renamed from: i */
    public List<Integer> f32545i = new ArrayList();

    /* renamed from: j */
    public List<Integer> f32546j = new ArrayList();

    /* renamed from: c */
    public List<String> f32539c = new ArrayList();

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:lf/e$a.class
     */
    /* renamed from: lf.e$a */
    /* loaded from: combined.jar:classes2.jar:lf/e$a.class */
    public static class a {

        /* renamed from: a */
        public TextView f32557a;

        /* renamed from: b */
        public TextView f32558b;

        /* renamed from: c */
        public TextView f32559c;

        /* renamed from: d */
        public ImageView f32560d;

        /* renamed from: e */
        public LinearLayout f32561e;
    }

    public C5852e(Context context, List<String> list) {
        this.f32540d = list;
        this.f32538b = list;
        this.f32542f = context;
        this.f32541e = LayoutInflater.from(context);
        this.f32543g = new DatabaseHandler(context);
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f32540d.size();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i10) {
        return this.f32540d.get(i10);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        return i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:170:0x01f1 A[Catch: all -> 0x032b, Exception -> 0x032f, TRY_LEAVE, TryCatch #1 {Exception -> 0x032f, blocks: (B:5:0x00c6, B:7:0x011d, B:9:0x0128, B:13:0x0152, B:15:0x015c, B:17:0x0173, B:18:0x0169, B:161:0x0179, B:164:0x0191, B:166:0x01a6, B:168:0x01bb, B:170:0x01f1, B:171:0x0215, B:173:0x021f, B:177:0x0235, B:179:0x023f, B:181:0x0256, B:182:0x024c, B:185:0x025c, B:186:0x02c0), top: B:4:0x00c6, outer: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0215 A[Catch: all -> 0x032b, Exception -> 0x032f, TRY_ENTER, TryCatch #1 {Exception -> 0x032f, blocks: (B:5:0x00c6, B:7:0x011d, B:9:0x0128, B:13:0x0152, B:15:0x015c, B:17:0x0173, B:18:0x0169, B:161:0x0179, B:164:0x0191, B:166:0x01a6, B:168:0x01bb, B:170:0x01f1, B:171:0x0215, B:173:0x021f, B:177:0x0235, B:179:0x023f, B:181:0x0256, B:182:0x024c, B:185:0x025c, B:186:0x02c0), top: B:4:0x00c6, outer: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x034e A[Catch: all -> 0x088b, Exception -> 0x088f, TRY_ENTER, TryCatch #0 {Exception -> 0x088f, blocks: (B:24:0x0336, B:26:0x034e, B:28:0x0357, B:30:0x06af, B:32:0x06db, B:36:0x074e, B:38:0x0764, B:40:0x076e, B:42:0x077c, B:43:0x0783, B:45:0x0798, B:47:0x07ad, B:49:0x07c3, B:51:0x07cd, B:53:0x07d7, B:54:0x07e7, B:56:0x07f1, B:58:0x07fa, B:59:0x0809, B:61:0x0815, B:63:0x081f, B:65:0x0834, B:67:0x0857, B:69:0x0861, B:70:0x0871, B:72:0x087b, B:73:0x0360, B:75:0x0376, B:76:0x0381, B:78:0x0396, B:79:0x03a6, B:81:0x03bf, B:83:0x03d5, B:85:0x03eb, B:87:0x0401, B:89:0x0417, B:91:0x042d, B:93:0x0443, B:95:0x0459, B:97:0x046f, B:99:0x0485, B:101:0x0492, B:102:0x049b, B:104:0x04b0, B:106:0x04c0, B:108:0x04d6, B:111:0x04ef, B:113:0x0505, B:116:0x051e, B:118:0x0534, B:120:0x054a, B:122:0x0560, B:124:0x0576, B:126:0x058c, B:128:0x05a2, B:131:0x05bb, B:133:0x05c5, B:135:0x05db, B:137:0x05f1, B:139:0x0607, B:141:0x061d, B:143:0x0633, B:145:0x0649, B:148:0x0660, B:150:0x066f, B:152:0x067f, B:153:0x068f, B:154:0x069f), top: B:23:0x0336, outer: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x06db A[Catch: all -> 0x088b, Exception -> 0x088f, TRY_LEAVE, TryCatch #0 {Exception -> 0x088f, blocks: (B:24:0x0336, B:26:0x034e, B:28:0x0357, B:30:0x06af, B:32:0x06db, B:36:0x074e, B:38:0x0764, B:40:0x076e, B:42:0x077c, B:43:0x0783, B:45:0x0798, B:47:0x07ad, B:49:0x07c3, B:51:0x07cd, B:53:0x07d7, B:54:0x07e7, B:56:0x07f1, B:58:0x07fa, B:59:0x0809, B:61:0x0815, B:63:0x081f, B:65:0x0834, B:67:0x0857, B:69:0x0861, B:70:0x0871, B:72:0x087b, B:73:0x0360, B:75:0x0376, B:76:0x0381, B:78:0x0396, B:79:0x03a6, B:81:0x03bf, B:83:0x03d5, B:85:0x03eb, B:87:0x0401, B:89:0x0417, B:91:0x042d, B:93:0x0443, B:95:0x0459, B:97:0x046f, B:99:0x0485, B:101:0x0492, B:102:0x049b, B:104:0x04b0, B:106:0x04c0, B:108:0x04d6, B:111:0x04ef, B:113:0x0505, B:116:0x051e, B:118:0x0534, B:120:0x054a, B:122:0x0560, B:124:0x0576, B:126:0x058c, B:128:0x05a2, B:131:0x05bb, B:133:0x05c5, B:135:0x05db, B:137:0x05f1, B:139:0x0607, B:141:0x061d, B:143:0x0633, B:145:0x0649, B:148:0x0660, B:150:0x066f, B:152:0x067f, B:153:0x068f, B:154:0x069f), top: B:23:0x0336, outer: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x074e A[Catch: all -> 0x088b, Exception -> 0x088f, TRY_ENTER, TryCatch #0 {Exception -> 0x088f, blocks: (B:24:0x0336, B:26:0x034e, B:28:0x0357, B:30:0x06af, B:32:0x06db, B:36:0x074e, B:38:0x0764, B:40:0x076e, B:42:0x077c, B:43:0x0783, B:45:0x0798, B:47:0x07ad, B:49:0x07c3, B:51:0x07cd, B:53:0x07d7, B:54:0x07e7, B:56:0x07f1, B:58:0x07fa, B:59:0x0809, B:61:0x0815, B:63:0x081f, B:65:0x0834, B:67:0x0857, B:69:0x0861, B:70:0x0871, B:72:0x087b, B:73:0x0360, B:75:0x0376, B:76:0x0381, B:78:0x0396, B:79:0x03a6, B:81:0x03bf, B:83:0x03d5, B:85:0x03eb, B:87:0x0401, B:89:0x0417, B:91:0x042d, B:93:0x0443, B:95:0x0459, B:97:0x046f, B:99:0x0485, B:101:0x0492, B:102:0x049b, B:104:0x04b0, B:106:0x04c0, B:108:0x04d6, B:111:0x04ef, B:113:0x0505, B:116:0x051e, B:118:0x0534, B:120:0x054a, B:122:0x0560, B:124:0x0576, B:126:0x058c, B:128:0x05a2, B:131:0x05bb, B:133:0x05c5, B:135:0x05db, B:137:0x05f1, B:139:0x0607, B:141:0x061d, B:143:0x0633, B:145:0x0649, B:148:0x0660, B:150:0x066f, B:152:0x067f, B:153:0x068f, B:154:0x069f), top: B:23:0x0336, outer: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0360 A[Catch: all -> 0x088b, Exception -> 0x088f, TRY_ENTER, TryCatch #0 {Exception -> 0x088f, blocks: (B:24:0x0336, B:26:0x034e, B:28:0x0357, B:30:0x06af, B:32:0x06db, B:36:0x074e, B:38:0x0764, B:40:0x076e, B:42:0x077c, B:43:0x0783, B:45:0x0798, B:47:0x07ad, B:49:0x07c3, B:51:0x07cd, B:53:0x07d7, B:54:0x07e7, B:56:0x07f1, B:58:0x07fa, B:59:0x0809, B:61:0x0815, B:63:0x081f, B:65:0x0834, B:67:0x0857, B:69:0x0861, B:70:0x0871, B:72:0x087b, B:73:0x0360, B:75:0x0376, B:76:0x0381, B:78:0x0396, B:79:0x03a6, B:81:0x03bf, B:83:0x03d5, B:85:0x03eb, B:87:0x0401, B:89:0x0417, B:91:0x042d, B:93:0x0443, B:95:0x0459, B:97:0x046f, B:99:0x0485, B:101:0x0492, B:102:0x049b, B:104:0x04b0, B:106:0x04c0, B:108:0x04d6, B:111:0x04ef, B:113:0x0505, B:116:0x051e, B:118:0x0534, B:120:0x054a, B:122:0x0560, B:124:0x0576, B:126:0x058c, B:128:0x05a2, B:131:0x05bb, B:133:0x05c5, B:135:0x05db, B:137:0x05f1, B:139:0x0607, B:141:0x061d, B:143:0x0633, B:145:0x0649, B:148:0x0660, B:150:0x066f, B:152:0x067f, B:153:0x068f, B:154:0x069f), top: B:23:0x0336, outer: #4 }] */
    @Override // android.widget.Adapter
    @android.annotation.SuppressLint({"InflateParams"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View getView(int r6, android.view.View r7, android.view.ViewGroup r8) {
        /*
            Method dump skipped, instructions count: 2202
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p203lf.C5852e.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }
}
