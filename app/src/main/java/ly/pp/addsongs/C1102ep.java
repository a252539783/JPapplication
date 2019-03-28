package ly.pp.addsongs;

import android.os.Message;

/* renamed from: ly.pp.addsongs.ep */
final class C1102ep implements Runnable {
    /* renamed from: a */
    final /* synthetic */ C1101eo f5391a;
    /* renamed from: b */
    private final /* synthetic */ OLPlayHall f5392b;
    /* renamed from: c */
    private final /* synthetic */ Message f5393c;

    C1102ep(C1101eo c1101eo, OLPlayHall oLPlayHall, Message message) {
        this.f5391a = c1101eo;
        this.f5392b = oLPlayHall;
        this.f5393c = message;
    }

    /* renamed from: run */
    public final void run() {
        if (this.f5392b.f4393i.size() > this.f5392b.f4374G) {
            this.f5392b.f4393i.remove(0);
        }
        this.f5392b.f4393i.add(this.f5393c.getData());
        this.f5392b.mo2828a(this.f5392b.f4369B, this.f5392b.f4393i);
    }
}
