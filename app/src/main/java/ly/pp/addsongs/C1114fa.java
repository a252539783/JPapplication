package ly.pp.addsongs;

import android.os.Bundle;
import android.os.Message;

/* renamed from: ly.pp.addsongs.fa */
final class C1114fa implements Runnable {
    /* renamed from: a */
    final /* synthetic */ C1101eo f5422a;
    /* renamed from: b */
    private final /* synthetic */ OLPlayHall f5423b;
    /* renamed from: c */
    private final /* synthetic */ Message f5424c;

    C1114fa(C1101eo c1101eo, OLPlayHall oLPlayHall, Message message) {
        this.f5422a = c1101eo;
        this.f5423b = oLPlayHall;
        this.f5424c = message;
    }

    /* renamed from: run */
    public final void run() {
        this.f5423b.f4396l.clear();
        Bundle data = this.f5424c.getData();
        int size = data.size();
        if (size < 20) {
            this.f5423b.f4402r = true;
        }
        if (size >= 0) {
            for (int i = 0; i < size; i++) {
                this.f5423b.f4396l.add(data.getBundle(String.valueOf(i)));
            }
            this.f5423b.mo2829a(this.f5423b.f4395k, this.f5423b.f4396l, 3, true);
        }
    }
}
