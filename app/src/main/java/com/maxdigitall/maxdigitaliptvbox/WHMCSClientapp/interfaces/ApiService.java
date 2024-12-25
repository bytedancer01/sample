package com.maxdigitall.maxdigitaliptvbox.WHMCSClientapp.interfaces;

import com.maxdigitall.maxdigitaliptvbox.WHMCSClientapp.modelclassess.ActiveServiceModelClass;
import com.maxdigitall.maxdigitaliptvbox.WHMCSClientapp.modelclassess.BuyNowModelClass;
import com.maxdigitall.maxdigitaliptvbox.WHMCSClientapp.modelclassess.DepartmentClass;
import com.maxdigitall.maxdigitaliptvbox.WHMCSClientapp.modelclassess.InvoicesModelClass;
import com.maxdigitall.maxdigitaliptvbox.WHMCSClientapp.modelclassess.LoginWHMCSModelClass;
import com.maxdigitall.maxdigitaliptvbox.WHMCSClientapp.modelclassess.OpenDepartmentClass;
import com.maxdigitall.maxdigitaliptvbox.WHMCSClientapp.modelclassess.ServicesIncoiveTicketCoutModelClass;
import com.maxdigitall.maxdigitaliptvbox.WHMCSClientapp.modelclassess.TickedMessageModelClass;
import com.maxdigitall.maxdigitaliptvbox.WHMCSClientapp.modelclassess.TicketModelClass;
import com.maxdigitall.maxdigitaliptvbox.model.FreeTrailModelClass;
import dj.InterfaceC4535b;
import fj.InterfaceC4890c;
import fj.InterfaceC4892e;
import fj.InterfaceC4902o;
import java.util.ArrayList;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/WHMCSClientapp/interfaces/ApiService.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/WHMCSClientapp/interfaces/ApiService.class */
public interface ApiService {
    @InterfaceC4902o("modules/addons/AppProducts/response.php")
    @InterfaceC4892e
    /* renamed from: a */
    InterfaceC4535b<TickedMessageModelClass> m14633a(@InterfaceC4890c("api_username") String str, @InterfaceC4890c("api_password") String str2, @InterfaceC4890c("command") String str3, @InterfaceC4890c("custom") String str4, @InterfaceC4890c("ticketid") String str5);

    @InterfaceC4902o("modules/addons/AppProducts/response.php")
    @InterfaceC4892e
    /* renamed from: b */
    InterfaceC4535b<TicketModelClass> m14634b(@InterfaceC4890c("api_username") String str, @InterfaceC4890c("api_password") String str2, @InterfaceC4890c("command") String str3, @InterfaceC4890c("custom") String str4, @InterfaceC4890c("clientid") int i10);

    @InterfaceC4902o("modules/addons/AppProducts/response.php")
    @InterfaceC4892e
    /* renamed from: c */
    InterfaceC4535b<DepartmentClass> m14635c(@InterfaceC4890c("api_username") String str, @InterfaceC4890c("api_password") String str2, @InterfaceC4890c("command") String str3, @InterfaceC4890c("custom") String str4, @InterfaceC4890c("clientid") int i10);

    @InterfaceC4902o("modules/addons/AppProducts/response.php")
    @InterfaceC4892e
    /* renamed from: d */
    InterfaceC4535b<ArrayList<ActiveServiceModelClass>> m14636d(@InterfaceC4890c("api_username") String str, @InterfaceC4890c("api_password") String str2, @InterfaceC4890c("command") String str3, @InterfaceC4890c("custom") String str4, @InterfaceC4890c("clientid") int i10, @InterfaceC4890c("status") String str5);

    @InterfaceC4902o("modules/addons/AppProducts/response.php")
    @InterfaceC4892e
    /* renamed from: e */
    InterfaceC4535b<OpenDepartmentClass> m14637e(@InterfaceC4890c("api_username") String str, @InterfaceC4890c("api_password") String str2, @InterfaceC4890c("command") String str3, @InterfaceC4890c("message") String str4, @InterfaceC4890c("deptid") String str5, @InterfaceC4890c("clientid") int i10, @InterfaceC4890c("subject") String str6);

    @InterfaceC4902o("modules/addons/AppProducts/response.php")
    @InterfaceC4892e
    /* renamed from: f */
    InterfaceC4535b<LoginWHMCSModelClass> m14638f(@InterfaceC4890c("api_username") String str, @InterfaceC4890c("api_password") String str2, @InterfaceC4890c("command") String str3, @InterfaceC4890c("custom") String str4, @InterfaceC4890c("username") String str5, @InterfaceC4890c("password") String str6);

    @InterfaceC4902o("modules/addons/AppProducts/response.php")
    @InterfaceC4892e
    /* renamed from: g */
    InterfaceC4535b<BuyNowModelClass> m14639g(@InterfaceC4890c("api_username") String str, @InterfaceC4890c("api_password") String str2, @InterfaceC4890c("username") String str3, @InterfaceC4890c("password") String str4, @InterfaceC4890c("command") String str5, @InterfaceC4890c("custom") String str6, @InterfaceC4890c("clientid") int i10);

    @InterfaceC4902o("modules/addons/AppProducts/response.php")
    @InterfaceC4892e
    /* renamed from: h */
    InterfaceC4535b<ServicesIncoiveTicketCoutModelClass> m14640h(@InterfaceC4890c("api_username") String str, @InterfaceC4890c("api_password") String str2, @InterfaceC4890c("command") String str3, @InterfaceC4890c("custom") String str4, @InterfaceC4890c("clientid") int i10);

    @InterfaceC4902o("modules/addons/AppProducts/response.php")
    @InterfaceC4892e
    /* renamed from: i */
    InterfaceC4535b<TicketModelClass> m14641i(@InterfaceC4890c("api_username") String str, @InterfaceC4890c("api_password") String str2, @InterfaceC4890c("command") String str3, @InterfaceC4890c("custom") String str4, @InterfaceC4890c("message") String str5, @InterfaceC4890c("clientid") int i10, @InterfaceC4890c("ticketid") String str6);

    @InterfaceC4902o("modules/addons/AppProducts/response.php")
    @InterfaceC4892e
    /* renamed from: j */
    InterfaceC4535b<InvoicesModelClass> m14642j(@InterfaceC4890c("api_username") String str, @InterfaceC4890c("api_password") String str2, @InterfaceC4890c("command") String str3, @InterfaceC4890c("custom") String str4, @InterfaceC4890c("userid") int i10, @InterfaceC4890c("status") String str5);

    @InterfaceC4902o("modules/addons/AppProducts/response.php")
    @InterfaceC4892e
    /* renamed from: k */
    InterfaceC4535b<FreeTrailModelClass> m14643k(@InterfaceC4890c("api_username") String str, @InterfaceC4890c("api_password") String str2, @InterfaceC4890c("command") String str3, @InterfaceC4890c("custom") String str4, @InterfaceC4890c("emailaddress") String str5, @InterfaceC4890c("username") String str6, @InterfaceC4890c("password") String str7, @InterfaceC4890c("activation_code") String str8, @InterfaceC4890c("app_package") String str9);
}
