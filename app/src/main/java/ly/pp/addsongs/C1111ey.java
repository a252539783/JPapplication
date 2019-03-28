package ly.pp.addsongs;

import android.os.Bundle;
import android.os.Message;

/* renamed from: ly.pp.addsongs.ey */
final class C1111ey implements Runnable {
    /* renamed from: a */
    final /* synthetic */ C1101eo f5415a;
    /* renamed from: b */
    private final /* synthetic */ OLPlayHall f5416b;
    /* renamed from: c */
    private final /* synthetic */ Message f5417c;

    C1111ey(C1101eo c1101eo, OLPlayHall oLPlayHall, Message message) {
        this.f5415a = c1101eo;
        this.f5416b = oLPlayHall;
        this.f5417c = message;
    }

    /* renamed from: run */
    public final void run() {
        this.f5416b.f4399o.clear();
        Bundle data = this.f5417c.getData();
        int size = data.size();
        if (size >= 0) {
            for (int i = 0; i < size; i++) {
                this.f5416b.f4399o.add(data.getBundle(String.valueOf(i)));
            }
            this.f5416b.mo2829a(this.f5416b.f4382O, this.f5416b.f4399o, 1, true);
        }
        if (size < 20) {
            this.f5416b.f4388U = true;
        } else {
            this.f5416b.f4388U = false;
        }
    }
}
