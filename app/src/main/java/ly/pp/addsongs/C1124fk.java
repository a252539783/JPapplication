package ly.pp.addsongs;

import android.os.Message;

/* renamed from: ly.pp.addsongs.fk */
final class C1124fk extends Thread {
    /* renamed from: a */
    final /* synthetic */ OLPlayHall f5448a;

    private C1124fk(OLPlayHall oLPlayHall) {
        this.f5448a = oLPlayHall;
    }

    /* synthetic */ C1124fk(OLPlayHall oLPlayHall, byte b) {
        this(oLPlayHall);
    }

    /* renamed from: run */
    public final void run() {
        do {
            try {
                Message message = new Message();
                message.what = 3;
                this.f5448a.f4400p.sendMessage(message);
                Thread.sleep(60000);
            } catch (Exception e) {
                this.f5448a.f4385R = false;
            }
            if (!this.f5448a.f4385R) {
                //"time update finish" + this.f5448a.f4400p.toString() + toString();
            }
        } while (this.f5448a.f4385R);
    }
}
