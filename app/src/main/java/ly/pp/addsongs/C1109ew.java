package ly.pp.addsongs;

import android.os.Bundle;
import android.os.Message;

/* renamed from: ly.pp.addsongs.ew */
final class C1109ew implements Runnable {
    /* renamed from: a */
    final /* synthetic */ C1101eo f5409a;
    /* renamed from: b */
    private final /* synthetic */ OLPlayHall f5410b;
    /* renamed from: c */
    private final /* synthetic */ Message f5411c;

    C1109ew(C1101eo c1101eo, OLPlayHall oLPlayHall, Message message) {
        this.f5409a = c1101eo;
        this.f5410b = oLPlayHall;
        this.f5411c = message;
    }

    /* renamed from: run */
    public final void run() {
        this.f5410b.f4373F.clear();
        Bundle data = this.f5411c.getData();
        int size = data.size();
        for (int i = 0; i < size; i++) {
            this.f5410b.f4373F.add(data.getBundle(String.valueOf(i)));
        }
        this.f5410b.mo2831b(this.f5410b.f4371D, this.f5410b.f4373F);
    }
}
