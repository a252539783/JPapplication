package ly.pp.addsongs;

import android.os.Message;

/* renamed from: ly.pp.addsongs.ia */
public final class C1195ia extends Thread {
    /* renamed from: a */
    final /* synthetic */ OLPlayRoom f5608a;

    public C1195ia(OLPlayRoom oLPlayRoom) {
        this.f5608a = oLPlayRoom;
    }

    /* renamed from: run */
    public final void run() {
        do {
            try {
                Message message = new Message();
                message.what = 3;
                this.f5608a.f4540x.sendMessage(message);
                Thread.sleep(60000);
            } catch (Exception e) {
                this.f5608a.f4542z = false;
            }
        } while (this.f5608a.f4542z);
    }
}
