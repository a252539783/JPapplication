package ly.pp.addsongs;

import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;

/* renamed from: ly.pp.addsongs.jf */
final class C1227jf extends Handler {
    /* renamed from: a */
    WeakReference f5702a;

    C1227jf(PianoPlay pianoPlay) {
        this.f5702a = new WeakReference(pianoPlay);
    }

    public final void handleMessage(Message message) {
        PianoPlay pianoPlay = (PianoPlay) this.f5702a.get();
        switch (message.what) {
            case 1:
                post(new C1228jg(this, pianoPlay, message));
                return;
            case 2:
                post(new C1231jj(this, pianoPlay, message));
                return;
            case 3:
                post(new C1232jk(this, pianoPlay, message));
                return;
            case 4:
                post(new C1233jl(this, pianoPlay, message));
                return;
            case 5:
                post(new C1234jm(this, pianoPlay));
                return;
            case 6:
                post(new C1235jn(this, pianoPlay, message));
                return;
            case 7:
                post(new C1237jp(this, message, pianoPlay));
                return;
            case 8:
                post(new C1238jq(this, pianoPlay));
                return;
            case 20:
                post(new C1239jr(this, pianoPlay));
                return;
            case 21:
                post(new C1229jh(this, pianoPlay));
                return;
            case 22:
                post(new C1230ji(this, pianoPlay));
                return;
            default:
                return;
        }
    }
}
