package ly.pp.addsongs;

import android.os.Message;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

/* renamed from: ly.pp.addsongs.jw */
final class C1244jw implements OnTouchListener {
    /* renamed from: a */
    final /* synthetic */ PlayView f5748a;

    C1244jw(PlayView playView) {
        this.f5748a = playView;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (this.f5748a.f4710S) {
            switch (action & 255) {
                case 0:
                    if (this.f5748a.f4735aT != null) {
                        this.f5748a.f4811l = this.f5748a.f4735aT.f5215h;
                    }
                    this.f5748a.f4724aH = motionEvent.getX();
                    this.f5748a.f4725aI = motionEvent.getY();
                    this.f5748a.f4754am = this.f5748a.mo2927a(this.f5748a.f4724aH, this.f5748a.f4725aI);
                    if (this.f5748a.f4725aI >= this.f5748a.f4776ba.mo2748w()) {
                        this.f5748a.f4729aM = this.f5748a.f4754am;
                        this.f5748a.f4727aK = this.f5748a.mo2928a(this.f5748a.f4754am);
                        break;
                    }
                    break;
                case 1:
                    this.f5748a.f4754am = -1;
                    break;
                case 2:
                    if (this.f5748a.f4735aT != null) {
                        this.f5748a.f4811l = this.f5748a.f4735aT.f5215h;
                    }
                    float x = motionEvent.getX();
                    float y = motionEvent.getY();
                    this.f5748a.f4754am = this.f5748a.mo2927a(x, y);
                    if (y >= this.f5748a.f4776ba.mo2748w() && this.f5748a.f4754am != this.f5748a.f4729aM) {
                        this.f5748a.mo2928a(this.f5748a.f4754am);
                        this.f5748a.f4729aM = this.f5748a.f4754am;
                        break;
                    }
            }
        }
        Message obtainMessage = this.f5748a.f4721aE.f4590I.obtainMessage();
        obtainMessage.what = 4;
        obtainMessage.arg1 = this.f5748a.f4754am;
        this.f5748a.f4721aE.f4590I.handleMessage(obtainMessage);
        return true;
    }
}
