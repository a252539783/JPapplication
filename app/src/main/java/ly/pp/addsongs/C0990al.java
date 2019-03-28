package ly.pp.addsongs;

import android.os.Message;
import java.util.Timer;
import java.util.TimerTask;

/* renamed from: ly.pp.addsongs.al */
final class C0990al extends TimerTask {
    /* renamed from: a */
    int f5112a = 3;
    /* renamed from: b */
    final /* synthetic */ JustPiano f5113b;
    /* renamed from: c */
    private final /* synthetic */ Timer f5114c;

    C0990al(JustPiano justPiano, Timer timer) {
        this.f5113b = justPiano;
        this.f5114c = timer;
    }

    /* renamed from: run */
    public final void run() {
        if (this.f5112a == 0) {
            cancel();
            this.f5114c.cancel();
            Message obtainMessage = this.f5113b.f4092b.obtainMessage();
            obtainMessage.what = 0;
            this.f5113b.f4092b.sendMessage(obtainMessage);
            new Thread(this.f5113b).start();
            return;
        }
        this.f5112a--;
    }
}
