package ly.pp.addsongs;

import android.os.Bundle;
import android.os.Message;

/* renamed from: ly.pp.addsongs.hf */
final class C1173hf implements Runnable {
    /* renamed from: a */
    final /* synthetic */ C1164gx f5544a;
    /* renamed from: b */
    private final /* synthetic */ OLPlayRoom f5545b;
    /* renamed from: c */
    private final /* synthetic */ Message f5546c;

    C1173hf(C1164gx c1164gx, OLPlayRoom oLPlayRoom, Message message) {
        this.f5544a = c1164gx;
        this.f5545b = oLPlayRoom;
        this.f5546c = message;
    }

    /* renamed from: run */
    public final void run() {
        this.f5545b.f4496U.clear();
        Bundle data = this.f5546c.getData();
        int size = data.size();
        if (size >= 0) {
            for (int i = 0; i < size; i++) {
                this.f5545b.f4496U.add(data.getBundle(String.valueOf(i)));
            }
            this.f5545b.mo2863a(this.f5545b.f4513al, this.f5545b.f4496U, 3);
        }
    }
}
