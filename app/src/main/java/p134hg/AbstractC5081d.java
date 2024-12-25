package p134hg;

import com.onesignal.InterfaceC4239x1;
import java.util.List;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p103fg.C4857a;
import p152ig.C5257b;
import p152ig.InterfaceC5258c;
import p372vh.C9367f;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:hg/d.class
 */
/* renamed from: hg.d */
/* loaded from: combined.jar:classes2.jar:hg/d.class */
public abstract class AbstractC5081d implements InterfaceC5258c {

    /* renamed from: a */
    @NotNull
    public final InterfaceC4239x1 f29206a;

    /* renamed from: b */
    @NotNull
    public final C5078a f29207b;

    /* renamed from: c */
    @NotNull
    public final InterfaceC5087j f29208c;

    public AbstractC5081d(@NotNull InterfaceC4239x1 interfaceC4239x1, @NotNull C5078a c5078a, @NotNull InterfaceC5087j interfaceC5087j) {
        C9367f.m39526e(interfaceC4239x1, "logger");
        C9367f.m39526e(c5078a, "outcomeEventsCache");
        C9367f.m39526e(interfaceC5087j, "outcomeEventsService");
        this.f29206a = interfaceC4239x1;
        this.f29207b = c5078a;
        this.f29208c = interfaceC5087j;
    }

    @Override // p152ig.InterfaceC5258c
    @NotNull
    /* renamed from: a */
    public List<C4857a> mo25376a(@NotNull String str, @NotNull List<C4857a> list) {
        C9367f.m39526e(str, "name");
        C9367f.m39526e(list, "influences");
        List<C4857a> m25365g = this.f29207b.m25365g(str, list);
        this.f29206a.debug(C9367f.m39532k("OneSignal getNotCachedUniqueOutcome influences: ", m25365g));
        return m25365g;
    }

    @Override // p152ig.InterfaceC5258c
    @NotNull
    /* renamed from: b */
    public List<C5257b> mo25377b() {
        return this.f29207b.m25363e();
    }

    @Override // p152ig.InterfaceC5258c
    /* renamed from: c */
    public void mo25378c(@NotNull C5257b c5257b) {
        C9367f.m39526e(c5257b, "outcomeEvent");
        this.f29207b.m25362d(c5257b);
    }

    @Override // p152ig.InterfaceC5258c
    /* renamed from: d */
    public void mo25379d(@NotNull String str, @NotNull String str2) {
        C9367f.m39526e(str, "notificationTableName");
        C9367f.m39526e(str2, "notificationIdColumnName");
        this.f29207b.m25361c(str, str2);
    }

    @Override // p152ig.InterfaceC5258c
    /* renamed from: e */
    public void mo25380e(@NotNull C5257b c5257b) {
        C9367f.m39526e(c5257b, "eventParams");
        this.f29207b.m25371m(c5257b);
    }

    @Override // p152ig.InterfaceC5258c
    /* renamed from: f */
    public void mo25381f(@NotNull Set<String> set) {
        C9367f.m39526e(set, "unattributedUniqueOutcomeEvents");
        this.f29206a.debug(C9367f.m39532k("OneSignal save unattributedUniqueOutcomeEvents: ", set));
        this.f29207b.m25370l(set);
    }

    @Override // p152ig.InterfaceC5258c
    /* renamed from: g */
    public void mo25382g(@NotNull C5257b c5257b) {
        C9367f.m39526e(c5257b, "event");
        this.f29207b.m25369k(c5257b);
    }

    @Override // p152ig.InterfaceC5258c
    @Nullable
    /* renamed from: i */
    public Set<String> mo25383i() {
        Set<String> m25367i = this.f29207b.m25367i();
        this.f29206a.debug(C9367f.m39532k("OneSignal getUnattributedUniqueOutcomeEventsSentByChannel: ", m25367i));
        return m25367i;
    }

    @NotNull
    /* renamed from: j */
    public final InterfaceC4239x1 m25384j() {
        return this.f29206a;
    }

    @NotNull
    /* renamed from: k */
    public final InterfaceC5087j m25385k() {
        return this.f29208c;
    }
}
