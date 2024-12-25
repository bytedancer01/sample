package p024b6;

import android.util.JsonReader;
import android.util.JsonToken;
import com.google.auto.value.AutoValue;
import java.io.IOException;
import java.io.Reader;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:b6/n.class
 */
@AutoValue
/* renamed from: b6.n */
/* loaded from: combined.jar:classes1.jar:b6/n.class */
public abstract class AbstractC0816n {
    /* renamed from: a */
    public static AbstractC0816n m5218a(long j10) {
        return new C0810h(j10);
    }

    /* renamed from: b */
    public static AbstractC0816n m5219b(Reader reader) {
        JsonReader jsonReader = new JsonReader(reader);
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                if (jsonReader.nextName().equals("nextRequestWaitMillis")) {
                    return jsonReader.peek() == JsonToken.STRING ? m5218a(Long.parseLong(jsonReader.nextString())) : m5218a(jsonReader.nextLong());
                }
                jsonReader.skipValue();
            }
            throw new IOException("Response is missing nextRequestWaitMillis field.");
        } finally {
            jsonReader.close();
        }
    }

    /* renamed from: c */
    public abstract long mo5203c();
}
