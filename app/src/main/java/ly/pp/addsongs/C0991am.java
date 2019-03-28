package ly.pp.addsongs;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

/* renamed from: ly.pp.addsongs.am */
final class C0991am implements OnTouchListener {
    /* renamed from: a */
    final /* synthetic */ KeyBoard f5115a;
    /* renamed from: b */
    private final /* synthetic */ C0992an f5116b;

    C0991am(KeyBoard keyBoard, C0992an c0992an) {
        this.f5115a = keyBoard;
        this.f5116b = c0992an;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        JPApplication jPApplication;
        float x;
        float y;
        switch (action & 255) {
            case 0:
                this.f5115a.f4154q = motionEvent.getX();
                this.f5115a.f4155r = motionEvent.getY();
                this.f5115a.f4138a = this.f5115a.mo2763a(this.f5115a.f4154q, this.f5115a.f4155r, 0);
                if (this.f5115a.f4138a > 13) {
                    action = (this.f5115a.f4138a - 14) + ((this.f5115a.f4153p + this.f5115a.f4137N.mo2742q()) * 12);
                    if (this.f5115a.f4155r >= this.f5115a.f4124A) {
                        this.f5115a.f4135L = this.f5115a.f4137N.mo2703a(action, 100.0f);
                    }
                } else {
                    action = this.f5115a.f4138a + ((this.f5115a.f4152o + this.f5115a.f4137N.mo2742q()) * 12);
                    if (this.f5115a.f4155r >= this.f5115a.f4124A) {
                        this.f5115a.f4136M = this.f5115a.f4137N.mo2703a(action, 100.0f);
                    }
                }
                this.f5115a.f4149l = this.f5115a.f4138a;
                break;
            case 1:
                if (!this.f5115a.f4137N.mo2733k()) {
                    jPApplication = this.f5115a.f4137N;
                    JPApplication.m3519a(this.f5115a.f4135L);
                    jPApplication = this.f5115a.f4137N;
                    JPApplication.m3519a(this.f5115a.f4136M);
                }
                this.f5115a.f4154q = motionEvent.getX();
                this.f5115a.f4155r = motionEvent.getY();
                this.f5115a.mo2763a(this.f5115a.f4154q, this.f5115a.f4155r, 1);
                this.f5115a.f4138a = -1;
                this.f5115a.f4139b = -1;
                break;
            case 2:
                x = motionEvent.getX();
                y = motionEvent.getY();
                this.f5115a.f4138a = this.f5115a.mo2763a(x, y, 2);
                if (y > this.f5115a.f4124A && this.f5115a.f4138a != this.f5115a.f4149l) {
                    if (this.f5115a.f4138a > 13) {
                        action = (this.f5115a.f4138a - 14) + ((this.f5115a.f4153p + this.f5115a.f4137N.mo2742q()) * 12);
                        if (y >= this.f5115a.f4124A) {
                            this.f5115a.f4135L = this.f5115a.f4137N.mo2703a(action, 100.0f);
                        }
                    } else {
                        action = this.f5115a.f4138a + ((this.f5115a.f4152o + this.f5115a.f4137N.mo2742q()) * 12);
                        if (y >= this.f5115a.f4124A) {
                            this.f5115a.f4136M = this.f5115a.f4137N.mo2703a(action, 100.0f);
                        }
                    }
                    this.f5115a.f4149l = this.f5115a.f4138a;
                    break;
                }
            case 5:
                action = (action & 65280) >> 8;
                y = motionEvent.getX(action);
                x = motionEvent.getY(action);
                this.f5115a.f4139b = this.f5115a.mo2763a(y, x, 5);
                int q;
                if (this.f5115a.f4139b <= 13) {
                    q = this.f5115a.f4139b + ((this.f5115a.f4152o + this.f5115a.f4137N.mo2742q()) * 12);
                    if (x >= this.f5115a.f4124A) {
                        this.f5115a.f4136M = this.f5115a.f4137N.mo2703a(q, 100.0f);
                        break;
                    }
                }
                q = (this.f5115a.f4139b - 14) + ((this.f5115a.f4153p + this.f5115a.f4137N.mo2742q()) * 12);
                if (x >= this.f5115a.f4124A) {
                    this.f5115a.f4135L = this.f5115a.f4137N.mo2703a(q, 100.0f);
                    break;
                }
                break;
            case 6:
                if (!this.f5115a.f4137N.mo2733k()) {
                    switch ((action & 65280) >> 8) {
                        case 0:
                            this.f5115a.f4138a = -1;
                            jPApplication = this.f5115a.f4137N;
                            JPApplication.m3519a(this.f5115a.f4136M);
                            break;
                        case 1:
                            this.f5115a.f4139b = -1;
                            jPApplication = this.f5115a.f4137N;
                            JPApplication.m3519a(this.f5115a.f4135L);
                            break;
                    }
                }
                break;
        }
        this.f5116b.mo3045a(this.f5115a.f4138a, this.f5115a.f4139b);
        return true;
    }
}
