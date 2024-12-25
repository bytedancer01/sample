package com.maxdigitall.maxdigitaliptvbox.view.activity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.app.ActivityC0243b;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.maxdigitall.maxdigitaliptvbox.model.database.ExternalPlayerDataBase;
import com.maxdigitall.maxdigitaliptvbox.model.pojo.ExternalPlayerModelClass;
import com.maxdigitall.maxdigitaliptvbox.view.adapter.AddedExternalPlayerAdapter;
import java.util.ArrayList;
import nf.C6783a;
import p151if.C5251a;
import p151if.C5255e;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/AddedExternalPlayerActivity.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/AddedExternalPlayerActivity.class */
public class AddedExternalPlayerActivity extends ActivityC0243b {

    /* renamed from: d */
    public Context f16840d;

    /* renamed from: e */
    public ExternalPlayerDataBase f16841e;

    /* renamed from: f */
    public ArrayList<ExternalPlayerModelClass> f16842f;

    /* renamed from: g */
    public C6783a f16843g;

    @BindView
    public LinearLayout ll_add_player;

    @BindView
    public LinearLayout ll_no_data_found;

    @BindView
    public LinearLayout ll_progressbar;

    @BindView
    public ImageView logo;

    @BindView
    public RecyclerView recyclerView;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/AddedExternalPlayerActivity$a.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.AddedExternalPlayerActivity$a */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/AddedExternalPlayerActivity$a.class */
    public class ViewOnClickListenerC2674a implements View.OnClickListener {

        /* renamed from: b */
        public final AddedExternalPlayerActivity f16844b;

        public ViewOnClickListenerC2674a(AddedExternalPlayerActivity addedExternalPlayerActivity) {
            this.f16844b = addedExternalPlayerActivity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C5255e.m26224a(this.f16844b.f16840d);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/AddedExternalPlayerActivity$b.class
     */
    @SuppressLint({"StaticFieldLeak"})
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.AddedExternalPlayerActivity$b */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/AddedExternalPlayerActivity$b.class */
    public class AsyncTaskC2675b extends AsyncTask<Boolean, Void, Boolean> {

        /* renamed from: a */
        public final AddedExternalPlayerActivity f16845a;

        public AsyncTaskC2675b(AddedExternalPlayerActivity addedExternalPlayerActivity) {
            this.f16845a = addedExternalPlayerActivity;
        }

        public /* synthetic */ AsyncTaskC2675b(AddedExternalPlayerActivity addedExternalPlayerActivity, ViewOnClickListenerC2674a viewOnClickListenerC2674a) {
            this(addedExternalPlayerActivity);
        }

        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean doInBackground(Boolean... boolArr) {
            return this.f16845a.m15564u0();
        }

        @Override // android.os.AsyncTask
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Boolean bool) {
            super.onPostExecute(bool);
            this.f16845a.ll_progressbar.setVisibility(8);
            if (!bool.booleanValue()) {
                this.f16845a.m15565v0(Boolean.FALSE);
                return;
            }
            this.f16845a.m15565v0(Boolean.TRUE);
            AddedExternalPlayerActivity addedExternalPlayerActivity = this.f16845a;
            addedExternalPlayerActivity.recyclerView.setLayoutManager(new LinearLayoutManager(addedExternalPlayerActivity.f16840d, 1, false));
            this.f16845a.recyclerView.setAdapter(new AddedExternalPlayerAdapter(this.f16845a.f16840d, this.f16845a.f16842f, this.f16845a));
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
            this.f16845a.ll_no_data_found.setVisibility(8);
            this.f16845a.recyclerView.setVisibility(8);
            this.f16845a.ll_progressbar.setVisibility(0);
        }
    }

    @Override // androidx.fragment.app.ActivityC0416e, androidx.activity.ComponentActivity, p030c0.ActivityC0952l, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f16840d = this;
        super.onCreate(bundle);
        C6783a c6783a = new C6783a(this.f16840d);
        this.f16843g = c6783a;
        setContentView(c6783a.m31288z().equals(C5251a.f30065s0) ? 2131623968 : 2131623967);
        ButterKnife.m5626a(this);
        this.logo.setOnClickListener(new ViewOnClickListenerC2674a(this));
    }

    @Override // androidx.fragment.app.ActivityC0416e, android.app.Activity
    public void onResume() {
        super.onResume();
        overridePendingTransition(2130772003, 2130772000);
        m15566w0();
    }

    @OnClick
    public void onclick(View view) {
        switch (view.getId()) {
            case 2131428135:
            case 2131428319:
            case 2131428451:
            case 2131429350:
                startActivity(new Intent(this, (Class<?>) ExternalPlayerActivity.class));
                break;
        }
    }

    /* renamed from: u0 */
    public final Boolean m15564u0() {
        ExternalPlayerDataBase externalPlayerDataBase = new ExternalPlayerDataBase(this.f16840d);
        this.f16841e = externalPlayerDataBase;
        ArrayList<ExternalPlayerModelClass> m15132o = externalPlayerDataBase.m15132o();
        this.f16842f = m15132o;
        if (m15132o != null && m15132o.size() > 0) {
            for (int i10 = 0; i10 < this.f16842f.size(); i10++) {
                String m15415a = this.f16842f.get(i10).m15415a();
                if (!C5255e.m26231e(this.f16842f.get(i10).m15416b(), this.f16840d)) {
                    this.f16841e.m15133p(m15415a);
                }
            }
        }
        this.f16842f = new ArrayList<>();
        ArrayList<ExternalPlayerModelClass> m15132o2 = this.f16841e.m15132o();
        this.f16842f = m15132o2;
        return (m15132o2 == null || m15132o2.size() <= 0) ? Boolean.FALSE : Boolean.TRUE;
    }

    /* renamed from: v0 */
    public final void m15565v0(Boolean bool) {
        if (bool.booleanValue()) {
            this.ll_add_player.setVisibility(0);
            this.ll_no_data_found.setVisibility(8);
            this.recyclerView.setVisibility(0);
        } else {
            this.ll_no_data_found.setVisibility(0);
            this.ll_add_player.setVisibility(8);
            this.recyclerView.setVisibility(8);
        }
    }

    /* renamed from: w0 */
    public void m15566w0() {
        new AsyncTaskC2675b(this, null).execute(new Boolean[0]);
    }
}
