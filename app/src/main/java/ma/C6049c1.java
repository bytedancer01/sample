package ma;

import android.widget.TextView;
import com.google.android.gms.cast.MediaInfo;
import p200l9.C5782l;
import p230n9.C6721i;
import p244o9.C6953w;
import p270p9.AbstractC7670a;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ma/c1.class
 */
/* renamed from: ma.c1 */
/* loaded from: combined.jar:classes2.jar:ma/c1.class */
public final class C6049c1 extends AbstractC7670a {

    /* renamed from: b */
    public final TextView f33696b;

    public C6049c1(TextView textView) {
        this.f33696b = textView;
    }

    @Override // p270p9.AbstractC7670a
    /* renamed from: c */
    public final void mo29375c() {
        MediaInfo m31009j;
        C5782l m13065Y;
        String m31944e;
        C6721i mo29823b = mo29823b();
        if (mo29823b == null || (m31009j = mo29823b.m31009j()) == null || (m13065Y = m31009j.m13065Y()) == null || (m31944e = C6953w.m31944e(m13065Y)) == null) {
            return;
        }
        this.f33696b.setText(m31944e);
    }
}
