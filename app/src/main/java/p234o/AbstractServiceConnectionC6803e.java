package p234o;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.support.customtabs.ICustomTabsService;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:o/e.class
 */
/* renamed from: o.e */
/* loaded from: combined.jar:classes1.jar:o/e.class */
public abstract class AbstractServiceConnectionC6803e implements ServiceConnection {
    private Context mApplicationContext;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:o/e$a.class
     */
    /* renamed from: o.e$a */
    /* loaded from: combined.jar:classes1.jar:o/e$a.class */
    public class a extends C6801c {

        /* renamed from: d */
        public final AbstractServiceConnectionC6803e f35485d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AbstractServiceConnectionC6803e abstractServiceConnectionC6803e, ICustomTabsService iCustomTabsService, ComponentName componentName, Context context) {
            super(iCustomTabsService, componentName, context);
            this.f35485d = abstractServiceConnectionC6803e;
        }
    }

    public Context getApplicationContext() {
        return this.mApplicationContext;
    }

    public abstract void onCustomTabsServiceConnected(ComponentName componentName, C6801c c6801c);

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (this.mApplicationContext == null) {
            throw new IllegalStateException("Custom Tabs Service connected before an applicationcontext has been provided.");
        }
        onCustomTabsServiceConnected(componentName, new a(this, ICustomTabsService.Stub.asInterface(iBinder), componentName, this.mApplicationContext));
    }

    public void setApplicationContext(Context context) {
        this.mApplicationContext = context;
    }
}
