package ly.pp.addsongs;

import android.os.Message;

/* renamed from: ly.pp.addsongs.gj */
final class C1150gj implements Runnable {
    /* renamed from: a */
    final /* synthetic */ C1137fx f5498a;
    /* renamed from: b */
    private final /* synthetic */ OLPlayHallRoom f5499b;
    /* renamed from: c */
    private final /* synthetic */ Message f5500c;

    C1150gj(C1137fx c1137fx, OLPlayHallRoom oLPlayHallRoom, Message message) {
        this.f5498a = c1137fx;
        this.f5499b = oLPlayHallRoom;
        this.f5500c = message;
    }

    /* renamed from: run */
    public final void run() {
        this.f5499b.mo2842a(this.f5500c.getData());
    }
}
