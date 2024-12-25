package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.InterfaceC0724b;
import java.util.HashMap;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/room/MultiInstanceInvalidationService.class
 */
/* loaded from: combined.jar:classes1.jar:androidx/room/MultiInstanceInvalidationService.class */
public class MultiInstanceInvalidationService extends Service {

    /* renamed from: b */
    public int f4980b = 0;

    /* renamed from: c */
    public final HashMap<Integer, String> f4981c = new HashMap<>();

    /* renamed from: d */
    public final RemoteCallbackList<InterfaceC0723a> f4982d = new RemoteCallbackListC0721a(this);

    /* renamed from: e */
    public final InterfaceC0724b.a f4983e = new BinderC0722b(this);

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/room/MultiInstanceInvalidationService$a.class
     */
    /* renamed from: androidx.room.MultiInstanceInvalidationService$a */
    /* loaded from: combined.jar:classes1.jar:androidx/room/MultiInstanceInvalidationService$a.class */
    public class RemoteCallbackListC0721a extends RemoteCallbackList<InterfaceC0723a> {

        /* renamed from: a */
        public final MultiInstanceInvalidationService f4984a;

        public RemoteCallbackListC0721a(MultiInstanceInvalidationService multiInstanceInvalidationService) {
            this.f4984a = multiInstanceInvalidationService;
        }

        @Override // android.os.RemoteCallbackList
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onCallbackDied(InterfaceC0723a interfaceC0723a, Object obj) {
            this.f4984a.f4981c.remove(Integer.valueOf(((Integer) obj).intValue()));
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/room/MultiInstanceInvalidationService$b.class
     */
    /* renamed from: androidx.room.MultiInstanceInvalidationService$b */
    /* loaded from: combined.jar:classes1.jar:androidx/room/MultiInstanceInvalidationService$b.class */
    public class BinderC0722b extends InterfaceC0724b.a {

        /* renamed from: b */
        public final MultiInstanceInvalidationService f4985b;

        public BinderC0722b(MultiInstanceInvalidationService multiInstanceInvalidationService) {
            this.f4985b = multiInstanceInvalidationService;
        }

        @Override // androidx.room.InterfaceC0724b
        /* renamed from: K0 */
        public int mo4704K0(InterfaceC0723a interfaceC0723a, String str) {
            if (str == null) {
                return 0;
            }
            synchronized (this.f4985b.f4982d) {
                MultiInstanceInvalidationService multiInstanceInvalidationService = this.f4985b;
                int i10 = multiInstanceInvalidationService.f4980b + 1;
                multiInstanceInvalidationService.f4980b = i10;
                if (multiInstanceInvalidationService.f4982d.register(interfaceC0723a, Integer.valueOf(i10))) {
                    this.f4985b.f4981c.put(Integer.valueOf(i10), str);
                    return i10;
                }
                this.f4985b.f4980b--;
                return 0;
            }
        }

        @Override // androidx.room.InterfaceC0724b
        /* renamed from: r0 */
        public void mo4705r0(int i10, String[] strArr) {
            synchronized (this.f4985b.f4982d) {
                String str = this.f4985b.f4981c.get(Integer.valueOf(i10));
                if (str == null) {
                    Log.w("ROOM", "Remote invalidation client ID not registered");
                    return;
                }
                int beginBroadcast = this.f4985b.f4982d.beginBroadcast();
                for (int i11 = 0; i11 < beginBroadcast; i11++) {
                    try {
                        int intValue = ((Integer) this.f4985b.f4982d.getBroadcastCookie(i11)).intValue();
                        String str2 = this.f4985b.f4981c.get(Integer.valueOf(intValue));
                        if (i10 != intValue && str.equals(str2)) {
                            try {
                                this.f4985b.f4982d.getBroadcastItem(i11).mo4707G(strArr);
                            } catch (RemoteException e10) {
                                Log.w("ROOM", "Error invoking a remote callback", e10);
                            }
                        }
                    } finally {
                        this.f4985b.f4982d.finishBroadcast();
                    }
                }
            }
        }

        @Override // androidx.room.InterfaceC0724b
        /* renamed from: x1 */
        public void mo4706x1(InterfaceC0723a interfaceC0723a, int i10) {
            synchronized (this.f4985b.f4982d) {
                this.f4985b.f4982d.unregister(interfaceC0723a);
                this.f4985b.f4981c.remove(Integer.valueOf(i10));
            }
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.f4983e;
    }
}
