package ly.pp.addsongs;

import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;

/* renamed from: ly.pp.addsongs.fx */
final class C1137fx extends Handler {
    /* renamed from: a */
    WeakReference f5466a;

    C1137fx(OLPlayHallRoom oLPlayHallRoom) {
        this.f5466a = new WeakReference(oLPlayHallRoom);
    }

    public final void handleMessage(Message message) {
        OLPlayHallRoom oLPlayHallRoom = (OLPlayHallRoom) this.f5466a.get();
        if (oLPlayHallRoom != null) {
            switch (message.what) {
                case 0:
                    post(new C1138fy(this, oLPlayHallRoom, message));
                    return;
                case 1:
                    post(new C1142gb(this, message, oLPlayHallRoom));
                    return;
                case 2:
                    post(new C1143gc(this, message));
                    return;
                case 3:
                    post(new C1144gd(this, oLPlayHallRoom, message));
                    return;
                case 4:
                    post(new C1145ge(this, oLPlayHallRoom, message));
                    return;
                case 5:
                    post(new C1146gf(this, oLPlayHallRoom, message));
                    return;
                case 6:
                    post(new C1150gj(this, oLPlayHallRoom, message));
                    return;
                case 7:
                    post(new C1151gk(this, message, oLPlayHallRoom));
                    return;
                case 20:
                    post(new C1152gl(this, oLPlayHallRoom));
                    return;
                case 21:
                    post(new C1139fz(this, oLPlayHallRoom));
                    return;
                case 22:
                    post(new C1141ga(this, message, oLPlayHallRoom));
                    return;
                default:
                    return;
            }
        }
    }
}
