package org.simpleframework.xml.transform;

import com.amazonaws.mobileconnectors.appsync.AWSAppSyncClient;
import java.util.Locale;
import java.util.regex.Pattern;

/* loaded from: combined.jar:classes3.jar:org/simpleframework/xml/transform/LocaleTransform.class */
class LocaleTransform implements Transform<Locale> {
    private final Pattern pattern = Pattern.compile(AWSAppSyncClient.DATABASE_NAME_DELIMITER);

    private Locale read(String[] strArr) {
        String[] strArr2 = new String[3];
        strArr2[0] = "";
        strArr2[1] = "";
        strArr2[2] = "";
        for (int i10 = 0; i10 < 3; i10++) {
            if (i10 < strArr.length) {
                strArr2[i10] = strArr[i10];
            }
        }
        return new Locale(strArr2[0], strArr2[1], strArr2[2]);
    }

    @Override // org.simpleframework.xml.transform.Transform
    public Locale read(String str) {
        String[] split = this.pattern.split(str);
        if (split.length >= 1) {
            return read(split);
        }
        throw new InvalidFormatException("Invalid locale %s", str);
    }

    @Override // org.simpleframework.xml.transform.Transform
    public String write(Locale locale) {
        return locale.toString();
    }
}
