package com.maxdigitall.maxdigitaliptvbox.model.webrequest;

import com.maxdigitall.maxdigitaliptvbox.model.callback.ActivationCallBack;
import com.maxdigitall.maxdigitaliptvbox.model.callback.BillingLoginClientCallback;
import com.maxdigitall.maxdigitaliptvbox.model.callback.GetSeriesStreamCallback;
import com.maxdigitall.maxdigitaliptvbox.model.callback.GetSeriesStreamCategoriesCallback;
import com.maxdigitall.maxdigitaliptvbox.model.callback.LiveStreamCategoriesCallback;
import com.maxdigitall.maxdigitaliptvbox.model.callback.LiveStreamsCallback;
import com.maxdigitall.maxdigitaliptvbox.model.callback.LiveStreamsEpgCallback;
import com.maxdigitall.maxdigitaliptvbox.model.callback.LoginCallback;
import com.maxdigitall.maxdigitaliptvbox.model.callback.SearchTMDBMoviesCallback;
import com.maxdigitall.maxdigitaliptvbox.model.callback.SearchTMDBTVShowsCallback;
import com.maxdigitall.maxdigitaliptvbox.model.callback.TMDBCastsCallback;
import com.maxdigitall.maxdigitaliptvbox.model.callback.TMDBGenreCallback;
import com.maxdigitall.maxdigitaliptvbox.model.callback.TMDBPersonInfoCallback;
import com.maxdigitall.maxdigitaliptvbox.model.callback.TMDBTVShowsInfoCallback;
import com.maxdigitall.maxdigitaliptvbox.model.callback.TMDBTrailerCallback;
import com.maxdigitall.maxdigitaliptvbox.model.callback.VodCategoriesCallback;
import com.maxdigitall.maxdigitaliptvbox.model.callback.VodInfoCallback;
import com.maxdigitall.maxdigitaliptvbox.model.callback.VodStreamsCallback;
import dj.InterfaceC4535b;
import fj.InterfaceC4888a;
import fj.InterfaceC4890c;
import fj.InterfaceC4892e;
import fj.InterfaceC4893f;
import fj.InterfaceC4896i;
import fj.InterfaceC4902o;
import fj.InterfaceC4906s;
import fj.InterfaceC4907t;
import java.util.List;
import p188kd.AbstractC5557j;
import p188kd.C5560m;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/model/webrequest/RetrofitPost.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/model/webrequest/RetrofitPost.class */
public interface RetrofitPost {
    @InterfaceC4902o("modules/addons/ActivationCoder/response.php")
    /* renamed from: a */
    InterfaceC4535b<ActivationCallBack> m15529a(@InterfaceC4888a C5560m c5560m);

    @InterfaceC4893f("search/movie")
    /* renamed from: b */
    InterfaceC4535b<SearchTMDBMoviesCallback> m15530b(@InterfaceC4907t("api_key") String str, @InterfaceC4907t("query") String str2);

    @InterfaceC4893f("player_api.php")
    /* renamed from: c */
    InterfaceC4535b<LiveStreamsEpgCallback> m15531c(@InterfaceC4896i("Content-Type") String str, @InterfaceC4907t("username") String str2, @InterfaceC4907t("password") String str3, @InterfaceC4907t("action") String str4, @InterfaceC4907t("stream_id") int i10);

    @InterfaceC4893f("tv/{show_id}")
    /* renamed from: d */
    InterfaceC4535b<TMDBTVShowsInfoCallback> m15532d(@InterfaceC4906s("show_id") int i10, @InterfaceC4907t("api_key") String str);

    @InterfaceC4902o("/includes/smartersapi/api.php")
    @InterfaceC4892e
    /* renamed from: e */
    InterfaceC4535b<BillingLoginClientCallback> m15533e(@InterfaceC4890c("a") String str, @InterfaceC4890c("e") String str2, @InterfaceC4890c("sc") String str3, @InterfaceC4890c("s") String str4, @InterfaceC4890c("r") String str5, @InterfaceC4890c("m") String str6, @InterfaceC4890c("p") String str7, @InterfaceC4890c("action") String str8, @InterfaceC4890c("d") String str9);

    @InterfaceC4893f("player_api.php")
    /* renamed from: f */
    InterfaceC4535b<LoginCallback> m15534f(@InterfaceC4896i("Content-Type") String str, @InterfaceC4907t("username") String str2, @InterfaceC4907t("password") String str3);

    @InterfaceC4893f("movie/{movie_id}/credits")
    /* renamed from: g */
    InterfaceC4535b<TMDBCastsCallback> m15535g(@InterfaceC4906s("movie_id") int i10, @InterfaceC4907t("api_key") String str);

    @InterfaceC4893f("tv/{show_id}/videos")
    /* renamed from: h */
    InterfaceC4535b<TMDBTrailerCallback> m15536h(@InterfaceC4906s("show_id") int i10, @InterfaceC4907t("api_key") String str);

    @InterfaceC4893f("tv/{show_id}/credits")
    /* renamed from: i */
    InterfaceC4535b<TMDBCastsCallback> m15537i(@InterfaceC4906s("show_id") int i10, @InterfaceC4907t("api_key") String str);

    @InterfaceC4893f("player_api.php")
    /* renamed from: j */
    InterfaceC4535b<List<LiveStreamCategoriesCallback>> m15538j(@InterfaceC4896i("Content-Type") String str, @InterfaceC4907t("username") String str2, @InterfaceC4907t("password") String str3, @InterfaceC4907t("action") String str4);

    @InterfaceC4893f("person/{person_id}")
    /* renamed from: k */
    InterfaceC4535b<TMDBPersonInfoCallback> m15539k(@InterfaceC4906s("person_id") String str, @InterfaceC4907t("api_key") String str2, @InterfaceC4907t("append_to_response") String str3);

    @InterfaceC4893f("player_api.php")
    /* renamed from: l */
    InterfaceC4535b<List<GetSeriesStreamCategoriesCallback>> m15540l(@InterfaceC4896i("Content-Type") String str, @InterfaceC4907t("username") String str2, @InterfaceC4907t("password") String str3, @InterfaceC4907t("action") String str4);

    @InterfaceC4893f("search/tv")
    /* renamed from: m */
    InterfaceC4535b<SearchTMDBTVShowsCallback> m15541m(@InterfaceC4907t("api_key") String str, @InterfaceC4907t("query") String str2);

    @InterfaceC4893f("movie/{movie_id}")
    /* renamed from: n */
    InterfaceC4535b<TMDBGenreCallback> m15542n(@InterfaceC4906s("movie_id") int i10, @InterfaceC4907t("api_key") String str);

    @InterfaceC4893f("player_api.php")
    /* renamed from: o */
    InterfaceC4535b<List<LiveStreamsCallback>> m15543o(@InterfaceC4896i("Content-Type") String str, @InterfaceC4907t("username") String str2, @InterfaceC4907t("password") String str3, @InterfaceC4907t("action") String str4);

    @InterfaceC4893f("movie/{movie_id}/videos")
    /* renamed from: p */
    InterfaceC4535b<TMDBTrailerCallback> m15544p(@InterfaceC4906s("movie_id") int i10, @InterfaceC4907t("api_key") String str);

    @InterfaceC4893f("player_api.php")
    /* renamed from: q */
    InterfaceC4535b<List<VodCategoriesCallback>> m15545q(@InterfaceC4896i("Content-Type") String str, @InterfaceC4907t("username") String str2, @InterfaceC4907t("password") String str3, @InterfaceC4907t("action") String str4);

    @InterfaceC4893f("player_api.php")
    /* renamed from: r */
    InterfaceC4535b<VodInfoCallback> m15546r(@InterfaceC4896i("Content-Type") String str, @InterfaceC4907t("username") String str2, @InterfaceC4907t("password") String str3, @InterfaceC4907t("action") String str4, @InterfaceC4907t("vod_id") int i10);

    @InterfaceC4893f("player_api.php")
    /* renamed from: s */
    InterfaceC4535b<List<GetSeriesStreamCallback>> m15547s(@InterfaceC4896i("Content-Type") String str, @InterfaceC4907t("username") String str2, @InterfaceC4907t("password") String str3, @InterfaceC4907t("action") String str4);

    @InterfaceC4893f("player_api.php")
    /* renamed from: t */
    InterfaceC4535b<List<VodStreamsCallback>> m15548t(@InterfaceC4896i("Content-Type") String str, @InterfaceC4907t("username") String str2, @InterfaceC4907t("password") String str3, @InterfaceC4907t("action") String str4);

    @InterfaceC4893f("player_api.php")
    /* renamed from: u */
    InterfaceC4535b<AbstractC5557j> m15549u(@InterfaceC4896i("Content-Type") String str, @InterfaceC4907t("username") String str2, @InterfaceC4907t("password") String str3, @InterfaceC4907t("action") String str4, @InterfaceC4907t("series_id") String str5);
}
