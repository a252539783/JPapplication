package ly.pp.addsongs;

import android.os.Message;

/* renamed from: ly.pp.addsongs.hq */
final class C1184hq implements Runnable {
    /* renamed from: a */
    final /* synthetic */ C1164gx f5573a;
    /* renamed from: b */
    private final /* synthetic */ OLPlayRoom f5574b;
    /* renamed from: c */
    private final /* synthetic */ Message f5575c;

    C1184hq(C1164gx c1164gx, OLPlayRoom oLPlayRoom, Message message) {
        this.f5573a = c1164gx;
        this.f5574b = oLPlayRoom;
        this.f5575c = message;
    }

    /* renamed from: run */
    public final void run() {
        this.f5574b.mo2861a(this.f5574b.f4494S, this.f5575c.getData());
    }
}
