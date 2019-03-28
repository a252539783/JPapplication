package ly.pp.addsongs;

import android.os.Message;

/* renamed from: ly.pp.addsongs.et */
final class C1106et implements Runnable {
    /* renamed from: a */
    final /* synthetic */ C1101eo f5402a;
    /* renamed from: b */
    private final /* synthetic */ Message f5403b;
    /* renamed from: c */
    private final /* synthetic */ OLPlayHall f5404c;

    C1106et(C1101eo c1101eo, Message message, OLPlayHall oLPlayHall) {
        this.f5402a = c1101eo;
        this.f5403b = message;
        this.f5404c = oLPlayHall;
    }

    /* renamed from: run */
    public final void run() {
        this.f5404c.mo2827a(this.f5403b.getData());
    }
}
