package com.maxdigitall.maxdigitaliptvbox.vpn.adapters;

import ag.C0164a;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.recyclerview.widget.RecyclerView;
import bg.C0900a;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.maxdigitall.maxdigitaliptvbox.vpn.activities.ProfileActivity;
import de.blinkt.openvpn.LaunchVPN;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import p151if.C5255e;
import p316s2.C8522c;
import p428yg.C10014t;
import p428yg.InterfaceC9996e;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/vpn/adapters/VpnProfileAdapter.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/vpn/adapters/VpnProfileAdapter.class */
public class VpnProfileAdapter extends RecyclerView.AbstractC0677h<ViewHolder> {

    /* renamed from: e */
    public Context f25157e;

    /* renamed from: f */
    public ArrayList<C0900a> f25158f;

    /* renamed from: g */
    public C0164a f25159g;

    /* renamed from: h */
    public ProfileActivity f25160h;

    /* renamed from: i */
    public PopupWindow f25161i;

    /* renamed from: j */
    public String f25162j = "";

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/vpn/adapters/VpnProfileAdapter$ViewHolder.class
     */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/vpn/adapters/VpnProfileAdapter$ViewHolder.class */
    public class ViewHolder extends RecyclerView.AbstractC0674e0 {

        @BindView
        public ImageView iv_profile_image;

        @BindView
        public RelativeLayout rl_outer;

        @BindView
        public TextView tv_profile_name;

        /* renamed from: u */
        public final VpnProfileAdapter f25163u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(VpnProfileAdapter vpnProfileAdapter, View view) {
            super(view);
            this.f25163u = vpnProfileAdapter;
            ButterKnife.m5627b(this, view);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/vpn/adapters/VpnProfileAdapter$ViewHolder_ViewBinding.class
     */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/vpn/adapters/VpnProfileAdapter$ViewHolder_ViewBinding.class */
    public class ViewHolder_ViewBinding implements Unbinder {

        /* renamed from: b */
        public ViewHolder f25164b;

        public ViewHolder_ViewBinding(ViewHolder viewHolder, View view) {
            this.f25164b = viewHolder;
            viewHolder.tv_profile_name = (TextView) C8522c.m36739c(view, 2131429569, "field 'tv_profile_name'", TextView.class);
            viewHolder.iv_profile_image = (ImageView) C8522c.m36739c(view, 2131428218, "field 'iv_profile_image'", ImageView.class);
            viewHolder.rl_outer = (RelativeLayout) C8522c.m36739c(view, 2131429028, "field 'rl_outer'", RelativeLayout.class);
        }

        @Override // butterknife.Unbinder
        /* renamed from: a */
        public void mo5629a() {
            ViewHolder viewHolder = this.f25164b;
            if (viewHolder == null) {
                throw new IllegalStateException("Bindings already cleared.");
            }
            this.f25164b = null;
            viewHolder.tv_profile_name = null;
            viewHolder.iv_profile_image = null;
            viewHolder.rl_outer = null;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/vpn/adapters/VpnProfileAdapter$a.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.vpn.adapters.VpnProfileAdapter$a */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/vpn/adapters/VpnProfileAdapter$a.class */
    public class C4075a implements InterfaceC9996e {

        /* renamed from: a */
        public final ViewHolder f25165a;

        /* renamed from: b */
        public final VpnProfileAdapter f25166b;

        public C4075a(VpnProfileAdapter vpnProfileAdapter, ViewHolder viewHolder) {
            this.f25166b = vpnProfileAdapter;
            this.f25165a = viewHolder;
        }

        @Override // p428yg.InterfaceC9996e
        /* renamed from: a */
        public void mo15848a() {
            this.f25165a.iv_profile_image.setImageResource(2131231657);
        }

        @Override // p428yg.InterfaceC9996e
        public void onSuccess() {
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/vpn/adapters/VpnProfileAdapter$b.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.vpn.adapters.VpnProfileAdapter$b */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/vpn/adapters/VpnProfileAdapter$b.class */
    public class ViewOnLongClickListenerC4076b implements View.OnLongClickListener {

        /* renamed from: b */
        public final int f25167b;

        /* renamed from: c */
        public final ViewHolder f25168c;

        /* renamed from: d */
        public final String f25169d;

        /* renamed from: e */
        public final VpnProfileAdapter f25170e;

        public ViewOnLongClickListenerC4076b(VpnProfileAdapter vpnProfileAdapter, int i10, ViewHolder viewHolder, String str) {
            this.f25170e = vpnProfileAdapter;
            this.f25167b = i10;
            this.f25168c = viewHolder;
            this.f25169d = str;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            VpnProfileAdapter vpnProfileAdapter = this.f25170e;
            vpnProfileAdapter.m19859m0(((C0900a) vpnProfileAdapter.f25158f.get(this.f25167b)).m5560i(), this.f25168c, this.f25169d, this.f25170e.f25158f, this.f25167b);
            return true;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/vpn/adapters/VpnProfileAdapter$c.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.vpn.adapters.VpnProfileAdapter$c */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/vpn/adapters/VpnProfileAdapter$c.class */
    public class ViewOnClickListenerC4077c implements View.OnClickListener {

        /* renamed from: b */
        public final int f25171b;

        /* renamed from: c */
        public final String f25172c;

        /* renamed from: d */
        public final VpnProfileAdapter f25173d;

        public ViewOnClickListenerC4077c(VpnProfileAdapter vpnProfileAdapter, int i10, String str) {
            this.f25173d = vpnProfileAdapter;
            this.f25171b = i10;
            this.f25172c = str;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Intent intent;
            if (!((C0900a) this.f25173d.f25158f.get(this.f25171b)).m5560i().equals("1")) {
                intent = new Intent(this.f25173d.f25157e, (Class<?>) LaunchVPN.class);
            } else {
                if (((C0900a) this.f25173d.f25158f.get(this.f25171b)).m5559h().equals("") || ((C0900a) this.f25173d.f25158f.get(this.f25171b)).m5558g().equals("")) {
                    VpnProfileAdapter vpnProfileAdapter = this.f25173d;
                    vpnProfileAdapter.m19860n0(this.f25172c, vpnProfileAdapter.f25158f, this.f25171b);
                    return;
                }
                intent = new Intent(this.f25173d.f25157e, (Class<?>) LaunchVPN.class);
            }
            intent.putExtra("vpnProfile", (Serializable) this.f25173d.f25158f.get(this.f25171b));
            this.f25173d.f25157e.startActivity(intent);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/vpn/adapters/VpnProfileAdapter$d.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.vpn.adapters.VpnProfileAdapter$d */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/vpn/adapters/VpnProfileAdapter$d.class */
    public class ViewOnClickListenerC4078d implements View.OnClickListener {

        /* renamed from: b */
        public final VpnProfileAdapter f25174b;

        public ViewOnClickListenerC4078d(VpnProfileAdapter vpnProfileAdapter) {
            this.f25174b = vpnProfileAdapter;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f25174b.f25161i.dismiss();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/vpn/adapters/VpnProfileAdapter$e.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.vpn.adapters.VpnProfileAdapter$e */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/vpn/adapters/VpnProfileAdapter$e.class */
    public class ViewOnClickListenerC4079e implements View.OnClickListener {

        /* renamed from: b */
        public final VpnProfileAdapter f25175b;

        public ViewOnClickListenerC4079e(VpnProfileAdapter vpnProfileAdapter) {
            this.f25175b = vpnProfileAdapter;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f25175b.f25161i.dismiss();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/vpn/adapters/VpnProfileAdapter$f.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.vpn.adapters.VpnProfileAdapter$f */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/vpn/adapters/VpnProfileAdapter$f.class */
    public class ViewOnClickListenerC4080f implements View.OnClickListener {

        /* renamed from: b */
        public final C0900a f25176b;

        /* renamed from: c */
        public final String[] f25177c;

        /* renamed from: d */
        public final String[] f25178d;

        /* renamed from: e */
        public final EditText f25179e;

        /* renamed from: f */
        public final EditText f25180f;

        /* renamed from: g */
        public final VpnProfileAdapter f25181g;

        public ViewOnClickListenerC4080f(VpnProfileAdapter vpnProfileAdapter, C0900a c0900a, String[] strArr, String[] strArr2, EditText editText, EditText editText2) {
            this.f25181g = vpnProfileAdapter;
            this.f25176b = c0900a;
            this.f25177c = strArr;
            this.f25178d = strArr2;
            this.f25179e = editText;
            this.f25180f = editText2;
        }

        /* renamed from: a */
        public final boolean m19862a() {
            Context context;
            Resources resources;
            int i10;
            this.f25177c[0] = String.valueOf(this.f25179e.getText());
            this.f25178d[0] = String.valueOf(this.f25180f.getText());
            String str = this.f25177c[0];
            if (str == null || !str.equals("")) {
                String str2 = this.f25178d[0];
                if (str2 == null || !str2.equals("")) {
                    String str3 = this.f25177c[0];
                    return (str3 == null || this.f25178d[0] == null || str3.equals("") || this.f25178d[0].equals("")) ? false : true;
                }
                context = this.f25181g.f25157e;
                resources = this.f25181g.f25157e.getResources();
                i10 = 2132017649;
            } else {
                context = this.f25181g.f25157e;
                resources = this.f25181g.f25157e.getResources();
                i10 = 2132017654;
            }
            Toast.makeText(context, resources.getString(i10), 1).show();
            return false;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (m19862a()) {
                this.f25176b.m5571t(this.f25177c[0]);
                this.f25176b.m5570s(this.f25178d[0]);
                this.f25181g.f25159g.m740q0(this.f25176b);
                this.f25181g.f25161i.dismiss();
                Intent intent = new Intent(this.f25181g.f25157e, (Class<?>) LaunchVPN.class);
                intent.putExtra("vpnProfile", this.f25176b);
                this.f25181g.f25157e.startActivity(intent);
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/vpn/adapters/VpnProfileAdapter$g.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.vpn.adapters.VpnProfileAdapter$g */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/vpn/adapters/VpnProfileAdapter$g.class */
    public class C4081g implements PopupMenu.OnMenuItemClickListener {

        /* renamed from: a */
        public final String f25182a;

        /* renamed from: b */
        public final ArrayList f25183b;

        /* renamed from: c */
        public final int f25184c;

        /* renamed from: d */
        public final VpnProfileAdapter f25185d;

        public C4081g(VpnProfileAdapter vpnProfileAdapter, String str, ArrayList arrayList, int i10) {
            this.f25185d = vpnProfileAdapter;
            this.f25182a = str;
            this.f25183b = arrayList;
            this.f25184c = i10;
        }

        @Override // android.widget.PopupMenu.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            int itemId = menuItem.getItemId();
            if (itemId == 2131427828) {
                this.f25185d.m19861o0(this.f25182a, this.f25183b, this.f25184c);
                return false;
            }
            if (itemId != 2131427884) {
                return false;
            }
            this.f25185d.m19860n0(this.f25182a, this.f25183b, this.f25184c);
            return false;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/vpn/adapters/VpnProfileAdapter$h.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.vpn.adapters.VpnProfileAdapter$h */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/vpn/adapters/VpnProfileAdapter$h.class */
    public class ViewOnClickListenerC4082h implements View.OnClickListener {

        /* renamed from: b */
        public final VpnProfileAdapter f25186b;

        public ViewOnClickListenerC4082h(VpnProfileAdapter vpnProfileAdapter) {
            this.f25186b = vpnProfileAdapter;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f25186b.f25161i.dismiss();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/vpn/adapters/VpnProfileAdapter$i.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.vpn.adapters.VpnProfileAdapter$i */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/vpn/adapters/VpnProfileAdapter$i.class */
    public class ViewOnClickListenerC4083i implements View.OnClickListener {

        /* renamed from: b */
        public final File f25187b;

        /* renamed from: c */
        public final C0900a f25188c;

        /* renamed from: d */
        public final VpnProfileAdapter f25189d;

        public ViewOnClickListenerC4083i(VpnProfileAdapter vpnProfileAdapter, File file, C0900a c0900a) {
            this.f25189d = vpnProfileAdapter;
            this.f25187b = file;
            this.f25188c = c0900a;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (this.f25187b.exists()) {
                this.f25187b.delete();
            }
            this.f25189d.f25159g.m741t(this.f25188c.m5554c());
            ((ProfileActivity) this.f25189d.f25157e).m19824C0();
            this.f25189d.f25161i.dismiss();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/vpn/adapters/VpnProfileAdapter$j.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.vpn.adapters.VpnProfileAdapter$j */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/vpn/adapters/VpnProfileAdapter$j.class */
    public class ViewOnFocusChangeListenerC4084j implements View.OnFocusChangeListener {

        /* renamed from: b */
        public final View f25190b;

        /* renamed from: c */
        public final VpnProfileAdapter f25191c;

        public ViewOnFocusChangeListenerC4084j(VpnProfileAdapter vpnProfileAdapter, View view) {
            this.f25191c = vpnProfileAdapter;
            this.f25190b = view;
        }

        /* renamed from: a */
        public final void m19863a(boolean z10) {
            if (z10) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f25190b, "alpha", z10 ? 0.6f : 0.5f);
                ofFloat.setDuration(150L);
                ofFloat.start();
            }
        }

        /* renamed from: b */
        public final void m19864b(float f10) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f25190b, "scaleX", f10);
            ofFloat.setDuration(150L);
            ofFloat.start();
        }

        /* renamed from: c */
        public final void m19865c(float f10) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f25190b, "scaleY", f10);
            ofFloat.setDuration(150L);
            ofFloat.start();
        }

        @Override // android.view.View.OnFocusChangeListener
        @SuppressLint({"ResourceType"})
        public void onFocusChange(View view, boolean z10) {
            View view2;
            int i10;
            float f10 = 1.05f;
            if (z10) {
                if (!z10) {
                    f10 = 1.0f;
                }
                m19864b(f10);
                m19865c(f10);
                Log.e("id is", "" + this.f25190b.getTag());
                view2 = this.f25190b;
                i10 = 2131231898;
            } else {
                if (z10) {
                    return;
                }
                if (!z10) {
                    f10 = 1.0f;
                }
                m19864b(f10);
                m19865c(f10);
                m19863a(z10);
                view2 = this.f25190b;
                i10 = 2131231897;
            }
            view2.setBackgroundResource(i10);
        }
    }

    public VpnProfileAdapter(Context context, ArrayList<C0900a> arrayList, ProfileActivity profileActivity) {
        this.f25157e = context;
        this.f25158f = arrayList;
        this.f25159g = new C0164a(context);
        this.f25160h = profileActivity;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0677h
    /* renamed from: k0, reason: merged with bridge method [inline-methods] */
    public void mo2996G(ViewHolder viewHolder, int i10) {
        String str;
        try {
            str = this.f25158f.get(i10).m5556e().substring(0, 1).toUpperCase() + this.f25158f.get(i10).m5556e().substring(1);
        } catch (Exception e10) {
            str = "";
        }
        viewHolder.tv_profile_name.setText(str);
        try {
            if (this.f25158f.get(i10).m5553b().equals("")) {
                viewHolder.iv_profile_image.setImageResource(2131231657);
            } else {
                C10014t.m42105q(this.f25157e).m42116l(this.f25158f.get(i10).m5553b()).m42152h(viewHolder.iv_profile_image, new C4075a(this, viewHolder));
            }
        } catch (Exception e11) {
            viewHolder.iv_profile_image.setImageResource(2131231657);
        }
        viewHolder.rl_outer.setOnLongClickListener(new ViewOnLongClickListenerC4076b(this, i10, viewHolder, str));
        viewHolder.rl_outer.setOnClickListener(new ViewOnClickListenerC4077c(this, i10, str));
        RelativeLayout relativeLayout = viewHolder.rl_outer;
        relativeLayout.setOnFocusChangeListener(new ViewOnFocusChangeListenerC4084j(this, relativeLayout));
        if (i10 == 0) {
            viewHolder.rl_outer.requestFocus();
            viewHolder.rl_outer.requestFocusFromTouch();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0677h
    /* renamed from: l0, reason: merged with bridge method [inline-methods] */
    public ViewHolder mo2998J(ViewGroup viewGroup, int i10) {
        return new ViewHolder(this, LayoutInflater.from(this.f25157e).inflate(2131624150, viewGroup, false));
    }

    /* renamed from: m0 */
    public final void m19859m0(String str, ViewHolder viewHolder, String str2, ArrayList<C0900a> arrayList, int i10) {
        if (this.f25157e != null) {
            PopupMenu popupMenu = new PopupMenu(this.f25157e, viewHolder.rl_outer);
            popupMenu.inflate(2131689477);
            popupMenu.getMenu().getItem(0).setVisible(false);
            if (str.equals("1")) {
                popupMenu.getMenu().getItem(1).setVisible(true);
            } else {
                popupMenu.getMenu().getItem(1).setVisible(false);
            }
            popupMenu.setOnMenuItemClickListener(new C4081g(this, str2, arrayList, i10));
            popupMenu.show();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0677h
    /* renamed from: n */
    public int mo3013n() {
        return this.f25158f.size();
    }

    /* renamed from: n0 */
    public final void m19860n0(String str, ArrayList<C0900a> arrayList, int i10) {
        C0900a c0900a = arrayList.get(i10);
        new C0900a();
        try {
            View inflate = ((LayoutInflater) this.f25157e.getSystemService("layout_inflater")).inflate(2131624234, (RelativeLayout) ((Activity) this.f25157e).findViewById(2131428953));
            PopupWindow popupWindow = new PopupWindow(this.f25157e);
            this.f25161i = popupWindow;
            popupWindow.setContentView(inflate);
            this.f25161i.setWidth(-1);
            this.f25161i.setHeight(-1);
            this.f25161i.setFocusable(true);
            this.f25161i.showAtLocation(inflate, 17, 0, 0);
            Button button = (Button) inflate.findViewById(2131427619);
            Button button2 = (Button) inflate.findViewById(2131427605);
            if (button != null) {
                button.setOnFocusChangeListener(new C5255e.i(button, (Activity) this.f25157e));
            }
            if (button2 != null) {
                button2.setOnFocusChangeListener(new C5255e.i(button2, (Activity) this.f25157e));
            }
            EditText editText = (EditText) inflate.findViewById(2131429640);
            EditText editText2 = (EditText) inflate.findViewById(2131429639);
            TextView textView = (TextView) inflate.findViewById(2131427905);
            ImageView imageView = (ImageView) inflate.findViewById(2131428154);
            editText.setText(c0900a.m5559h());
            editText2.setText(c0900a.m5558g());
            textView.setText(this.f25157e.getResources().getString(2132018793) + " " + str);
            if (this.f25157e.getSharedPreferences("selected_language", 0).getString("selected_language", "English").equalsIgnoreCase("Arabic")) {
                editText.setGravity(21);
                editText2.setGravity(21);
            }
            if (button2 != null) {
                button2.setOnClickListener(new ViewOnClickListenerC4078d(this));
            }
            if (imageView != null) {
                imageView.setOnClickListener(new ViewOnClickListenerC4079e(this));
            }
            if (button != null) {
                button.setOnClickListener(new ViewOnClickListenerC4080f(this, c0900a, new String[]{""}, new String[]{""}, editText, editText2));
            }
        } catch (NullPointerException | Exception e10) {
        }
    }

    /* renamed from: o0 */
    public final void m19861o0(String str, ArrayList<C0900a> arrayList, int i10) {
        try {
            C0900a c0900a = arrayList.get(i10);
            File file = new File(c0900a.m5555d());
            View inflate = ((LayoutInflater) this.f25157e.getSystemService("layout_inflater")).inflate(2131624152, (RelativeLayout) ((Activity) this.f25157e).findViewById(2131429033));
            PopupWindow popupWindow = new PopupWindow(this.f25157e);
            this.f25161i = popupWindow;
            popupWindow.setContentView(inflate);
            this.f25161i.setWidth(-1);
            this.f25161i.setHeight(-1);
            this.f25161i.setFocusable(true);
            this.f25161i.showAtLocation(inflate, 17, 0, 0);
            ((TextView) inflate.findViewById(2131429411)).setText("Are you Sure you want to Delete this Profile?");
            Button button = (Button) inflate.findViewById(2131427628);
            Button button2 = (Button) inflate.findViewById(2131427605);
            if (button != null) {
                button.setOnFocusChangeListener(new C5255e.i(button, (Activity) this.f25157e));
            }
            if (button2 != null) {
                button2.setOnFocusChangeListener(new C5255e.i(button2, (Activity) this.f25157e));
            }
            button.requestFocus();
            button2.setOnClickListener(new ViewOnClickListenerC4082h(this));
            button.setOnClickListener(new ViewOnClickListenerC4083i(this, file, c0900a));
        } catch (Exception e10) {
        }
    }
}
