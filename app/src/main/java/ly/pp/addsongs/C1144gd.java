package ly.pp.addsongs;

import android.os.Bundle;
import android.os.Message;

/* renamed from: ly.pp.addsongs.gd */
final class C1144gd implements Runnable {
    /* renamed from: a */
    final /* synthetic */ C1137fx f5482a;
    /* renamed from: b */
    private final /* synthetic */ OLPlayHallRoom f5483b;
    /* renamed from: c */
    private final /* synthetic */ Message f5484c;

    C1144gd(C1137fx c1137fx, OLPlayHallRoom oLPlayHallRoom, Message message) {
        this.f5482a = c1137fx;
        this.f5483b = oLPlayHallRoom;
        this.f5484c = message;
    }

    /* renamed from: run */
    public final void run() {
        this.f5483b.f4458i.clear();
        this.f5483b.f4426P.dismiss();
        Bundle data = this.f5484c.getData();
        int size = data.size();
        if (size >= 0) {
            for (int i = 0; i < size; i++) {
                this.f5483b.f4458i.add(data.getBundle(String.valueOf(i)));
            }
            this.f5483b.mo2846b(this.f5483b.f4459j, this.f5483b.f4458i);
        }
        if (size < 20) {
            this.f5483b.f4467r = true;
        } else {
            this.f5483b.f4467r = false;
        }
    }
}
