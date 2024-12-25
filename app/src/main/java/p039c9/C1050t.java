package p039c9;

import com.amazonaws.services.p045s3.model.InstructionFileId;
import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p059d9.C4349a;
import p059d9.C4401z0;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:c9/t.class
 */
/* renamed from: c9.t */
/* loaded from: combined.jar:classes2.jar:c9/t.class */
public final class C1050t extends C1040j {

    /* renamed from: h */
    public static final Pattern f7035h = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v1\\.exo$", 32);

    /* renamed from: i */
    public static final Pattern f7036i = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v2\\.exo$", 32);

    /* renamed from: j */
    public static final Pattern f7037j = Pattern.compile("^(\\d+)\\.(\\d+)\\.(\\d+)\\.v3\\.exo$", 32);

    public C1050t(String str, long j10, long j11, long j12, File file) {
        super(str, j10, j11, j12, file);
    }

    /* renamed from: g */
    public static C1050t m6215g(File file, long j10, long j11, C1043m c1043m) {
        String m6151k;
        String name = file.getName();
        if (!name.endsWith(".v3.exo")) {
            file = m6220n(file, c1043m);
            if (file == null) {
                return null;
            }
            name = file.getName();
        }
        Matcher matcher = f7037j.matcher(name);
        if (!matcher.matches() || (m6151k = c1043m.m6151k(Integer.parseInt((String) C4349a.m21882e(matcher.group(1))))) == null) {
            return null;
        }
        if (j10 == -1) {
            j10 = file.length();
        }
        if (j10 == 0) {
            return null;
        }
        long parseLong = Long.parseLong((String) C4349a.m21882e(matcher.group(2)));
        if (j11 == -9223372036854775807L) {
            j11 = Long.parseLong((String) C4349a.m21882e(matcher.group(3)));
        }
        return new C1050t(m6151k, parseLong, j10, j11, file);
    }

    /* renamed from: h */
    public static C1050t m6216h(File file, long j10, C1043m c1043m) {
        return m6215g(file, j10, -9223372036854775807L, c1043m);
    }

    /* renamed from: i */
    public static C1050t m6217i(String str, long j10, long j11) {
        return new C1050t(str, j10, j11, -9223372036854775807L, null);
    }

    /* renamed from: j */
    public static C1050t m6218j(String str, long j10) {
        return new C1050t(str, j10, -1L, -9223372036854775807L, null);
    }

    /* renamed from: m */
    public static File m6219m(File file, int i10, long j10, long j11) {
        return new File(file, i10 + InstructionFileId.DOT + j10 + InstructionFileId.DOT + j11 + ".v3.exo");
    }

    /* renamed from: n */
    public static File m6220n(File file, C1043m c1043m) {
        String str;
        String name = file.getName();
        Matcher matcher = f7036i.matcher(name);
        if (matcher.matches()) {
            str = C4401z0.m22385g1((String) C4349a.m21882e(matcher.group(1)));
        } else {
            matcher = f7035h.matcher(name);
            str = matcher.matches() ? (String) C4349a.m21882e(matcher.group(1)) : null;
        }
        if (str == null) {
            return null;
        }
        File m6219m = m6219m((File) C4349a.m21886i(file.getParentFile()), c1043m.m6147f(str), Long.parseLong((String) C4349a.m21882e(matcher.group(2))), Long.parseLong((String) C4349a.m21882e(matcher.group(3))));
        if (file.renameTo(m6219m)) {
            return m6219m;
        }
        return null;
    }

    /* renamed from: f */
    public C1050t m6221f(File file, long j10) {
        C4349a.m21884g(this.f6978e);
        return new C1050t(this.f6975b, this.f6976c, this.f6977d, j10, file);
    }
}
