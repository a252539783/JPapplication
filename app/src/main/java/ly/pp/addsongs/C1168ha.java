package ly.pp.addsongs;

import android.os.Bundle;
import android.os.Message;

/* renamed from: ly.pp.addsongs.ha */
final class C1168ha implements Runnable {
    /* renamed from: a */
    final /* synthetic */ C1164gx f5531a;
    /* renamed from: b */
    private final /* synthetic */ OLPlayRoom f5532b;
    /* renamed from: c */
    private final /* synthetic */ Message f5533c;

    C1168ha(C1164gx c1164gx, OLPlayRoom oLPlayRoom, Message message) {
        this.f5531a = c1164gx;
        this.f5532b = oLPlayRoom;
        this.f5533c = message;
    }

    /* renamed from: run */
    public final void run() {
        this.f5532b.f4479D.clear();
        Bundle data = this.f5533c.getData();
        int size = data.size();
        if (size >= 0) {
            for (int i = 0; i < size; i++) {
                this.f5532b.f4479D.add(data.getBundle(String.valueOf(i)));
            }
            this.f5532b.mo2863a(this.f5532b.f4514am, this.f5532b.f4479D, 1);
        }
        if (size < 20) {
            this.f5532b.f4481F = true;
        } else {
            this.f5532b.f4481F = false;
        }
    }
}
