package ly.pp.addsongs;

import android.os.Message;
import java.util.Timer;
import java.util.TimerTask;

/* renamed from: ly.pp.addsongs.jb */
final class C1223jb extends TimerTask {
    /* renamed from: a */
    int f5695a = 3;
    /* renamed from: b */
    final /* synthetic */ PianoPlay f5696b;
    /* renamed from: c */
    private final /* synthetic */ Message f5697c;
    /* renamed from: d */
    private final /* synthetic */ Timer f5698d;

    C1223jb(PianoPlay pianoPlay, Message message, Timer timer) {
        this.f5696b = pianoPlay;
        this.f5697c = message;
        this.f5698d = timer;
    }

    /* renamed from: run */
    public final void run() {
        this.f5697c.arg1 = this.f5695a;
        this.f5696b.f4590I.handleMessage(this.f5697c);
        if (this.f5695a == 0) {
            cancel();
            this.f5698d.cancel();
            return;
        }
        this.f5695a--;
    }
}
