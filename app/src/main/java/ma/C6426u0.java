package ma;

import android.widget.TextView;
import com.google.android.gms.cast.MediaInfo;
import java.util.ArrayList;
import java.util.List;
import p200l9.C5782l;
import p200l9.C5797q;
import p230n9.C6721i;
import p270p9.AbstractC7670a;
import p422y9.C9935o;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ma/u0.class
 */
/* renamed from: ma.u0 */
/* loaded from: combined.jar:classes2.jar:ma/u0.class */
public final class C6426u0 extends AbstractC7670a {

    /* renamed from: b */
    public final TextView f34079b;

    /* renamed from: c */
    public final List f34080c;

    public C6426u0(TextView textView, List list) {
        ArrayList arrayList = new ArrayList();
        this.f34080c = arrayList;
        this.f34079b = textView;
        arrayList.addAll(list);
    }

    @Override // p270p9.AbstractC7670a
    /* renamed from: c */
    public final void mo29375c() {
        MediaInfo m28315a0;
        C5782l m13065Y;
        C6721i mo29823b = mo29823b();
        if (mo29823b == null || !mo29823b.m31020p() || (m28315a0 = ((C5797q) C9935o.m41850j(mo29823b.m31012l())).m28315a0()) == null || (m13065Y = m28315a0.m13065Y()) == null) {
            return;
        }
        for (String str : this.f34080c) {
            if (m13065Y.m28243P(str)) {
                this.f34079b.setText(m13065Y.m28246S(str));
                return;
            }
        }
        this.f34079b.setText("");
    }
}
