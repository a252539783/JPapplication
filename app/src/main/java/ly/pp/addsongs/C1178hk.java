package ly.pp.addsongs;

import android.os.Message;

/* renamed from: ly.pp.addsongs.hk */
final class C1178hk implements Runnable {
    /* renamed from: a */
    final /* synthetic */ C1164gx f5557a;
    /* renamed from: b */
    private final /* synthetic */ OLPlayRoom f5558b;
    /* renamed from: c */
    private final /* synthetic */ Message f5559c;

    C1178hk(C1164gx c1164gx, OLPlayRoom oLPlayRoom, Message message) {
        this.f5557a = c1164gx;
        this.f5558b = oLPlayRoom;
        this.f5559c = message;
    }

    /* renamed from: run */
    public final void run() {
        if (this.f5558b.f4492Q.size() > this.f5558b.f4493R) {
            this.f5558b.f4492Q.remove(0);
        }
        this.f5558b.f4492Q.add(this.f5559c.getData());
        this.f5558b.mo2862a(this.f5558b.f4490O, this.f5558b.f4492Q);
    }
}
