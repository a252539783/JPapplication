package ly.pp.addsongs;

import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;


/* renamed from: ly.pp.addsongs.gx */
final class C1164gx extends Handler {
    /* renamed from: a */
    WeakReference f5525a;

    C1164gx(OLPlayRoom oLPlayRoom) {
        this.f5525a = new WeakReference(oLPlayRoom);
    }

    public final void handleMessage(Message message) {
        OLPlayRoom oLPlayRoom = (OLPlayRoom) this.f5525a.get();
        try {
            switch (message.what) {
                case 1:
                    post(new C1165gy(this, oLPlayRoom, message));
                    return;
                case 2:
                    post(new C1178hk(this, oLPlayRoom, message));
                    return;
                case 3:
                    post(new C1179hl(this, message, oLPlayRoom));
                    return;
                case 4:
                    post(new C1181hn(this, oLPlayRoom, message));
                    return;
                case 5:
                    post(new C1182ho(this, oLPlayRoom, message));
                    return;
                case 6:
                    post(new C1183hp(this, oLPlayRoom));
                    return;
                case 7:
                    post(new C1184hq(this, oLPlayRoom, message));
                    return;
                case 8:
                    post(new C1185hr(this, oLPlayRoom));
                    return;
                case 9:
                    post(new C1187ht(this, message, oLPlayRoom));
                    return;
                case 10:
                    post(new C1166gz(this));
                    return;
                case 11:
                    post(new C1168ha(this, oLPlayRoom, message));
                    return;
                case 12:
                    post(new C1169hb(this, oLPlayRoom, message));
                    return;
                case 13:
                    post(new C1170hc(this, oLPlayRoom, message));
                    return;
                case 14:
                    post(new C1171hd(this, message, oLPlayRoom));
                    return;
                case 15:
                    post(new C1173hf(this, oLPlayRoom, message));
                    return;
                case 16:
                    post(new C1174hg(this, message, oLPlayRoom));
                    return;
                case 20:
                    post(new C1175hh(this, oLPlayRoom));
                    return;
                case 21:
                    post(new C1176hi(this, oLPlayRoom));
                    return;
                case 22:
                    post(new C1177hj(this, message, oLPlayRoom));
                    return;
                default:
                    return;
            }
        } catch (Exception e) {
        }
    }
}
