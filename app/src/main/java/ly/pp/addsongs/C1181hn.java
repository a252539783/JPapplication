package ly.pp.addsongs;

import android.os.Message;

/* renamed from: ly.pp.addsongs.hn */
final class C1181hn implements Runnable {
    /* renamed from: a */
    final /* synthetic */ C1164gx f5565a;
    /* renamed from: b */
    private final /* synthetic */ OLPlayRoom f5566b;
    /* renamed from: c */
    private final /* synthetic */ Message f5567c;

    C1181hn(C1164gx c1164gx, OLPlayRoom oLPlayRoom, Message message) {
        this.f5565a = c1164gx;
        this.f5566b = oLPlayRoom;
        this.f5567c = message;
    }

    /* renamed from: run */
    public final void run() {
        if (this.f5566b.f4492Q.size() > this.f5566b.f4493R) {
            this.f5566b.f4492Q.remove(0);
        }
        this.f5566b.f4492Q.add(this.f5567c.getData());
        this.f5566b.mo2862a(this.f5566b.f4490O, this.f5566b.f4492Q);
    }
}
