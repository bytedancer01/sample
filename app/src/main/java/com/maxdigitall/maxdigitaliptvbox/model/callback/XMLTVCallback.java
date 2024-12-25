package com.maxdigitall.maxdigitaliptvbox.model.callback;

import com.maxdigitall.maxdigitaliptvbox.model.pojo.XMLTVProgrammePojo;
import java.util.List;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/model/callback/XMLTVCallback.class
 */
@Root(name = "tv", strict = false)
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/model/callback/XMLTVCallback.class */
public class XMLTVCallback {

    /* renamed from: a */
    @ElementList(inline = true, required = false)
    public List<XMLTVProgrammePojo> f16605a;

    public String toString() {
        return "ClassPojo [programmePojos= " + this.f16605a + "]";
    }
}
