package gg;

import java.util.Locale;
import org.simpleframework.xml.strategy.Name;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:gg/d.class
 */
/* renamed from: gg.d */
/* loaded from: combined.jar:classes2.jar:gg/d.class */
public class C5009d implements InterfaceC5007b {
    @Override // gg.InterfaceC5007b
    public String getLanguage() {
        String language;
        language = Locale.getDefault().getLanguage();
        language.hashCode();
        switch (language) {
            case "in":
                return Name.MARK;
            case "iw":
                return "he";
            case "ji":
                return "yi";
            case "zh":
                return language + "-" + Locale.getDefault().getCountry();
            default:
                return language;
        }
    }
}
