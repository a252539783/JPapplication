package ly.pp.addsongs;

import android.os.Bundle;
import android.os.Message;

/* renamed from: ly.pp.addsongs.hc */
final class C1170hc implements Runnable {
    /* renamed from: a */
    final /* synthetic */ C1164gx f5537a;
    /* renamed from: b */
    private final /* synthetic */ OLPlayRoom f5538b;
    /* renamed from: c */
    private final /* synthetic */ Message f5539c;

    C1170hc(C1164gx c1164gx, OLPlayRoom oLPlayRoom, Message message) {
        this.f5537a = c1164gx;
        this.f5538b = oLPlayRoom;
        this.f5539c = message;
    }

    /* renamed from: run */
    public final void run() {
        this.f5538b.f4479D.clear();
        Bundle data = this.f5539c.getData();
        int size = data.size();
        if (size >= 0) {
            for (int i = 0; i < size; i++) {
                this.f5538b.f4479D.add(data.getBundle(String.valueOf(i)));
            }
            this.f5538b.mo2863a(this.f5538b.f4514am, this.f5538b.f4479D, 3);
        }
    }
}
