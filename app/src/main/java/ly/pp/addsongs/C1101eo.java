package ly.pp.addsongs;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;


/* renamed from: ly.pp.addsongs.eo */
final class C1101eo extends Handler {
    /* renamed from: a */
    WeakReference f5390a;

    C1101eo(OLPlayHall oLPlayHall) {
        this.f5390a = new WeakReference(oLPlayHall);
    }

    public final void handleMessage(Message message) {
        OLPlayHall oLPlayHall = (OLPlayHall) this.f5390a.get();
        switch (message.what) {
            case 1:
                post(new C1102ep(this, oLPlayHall, message));
                return;
            case 2:
                Intent intent = new Intent(oLPlayHall, OLPlayRoom.class);
                Bundle data = message.getData();
                data.putBundle("bundle", oLPlayHall.f4381N);
                intent.putExtras(data);
                oLPlayHall.startActivity(intent);
                oLPlayHall.finish();
                return;
            case 3:
                post(new C1109ew(this, oLPlayHall, message));
                return;
            case 4:
                post(new C1110ex(this, message, oLPlayHall));
                return;
            case 5:
                post(new C1111ey(this, oLPlayHall, message));
                return;
            case 6:
                post(new C1112ez(this, oLPlayHall, message));
                return;
            case 7:
                post(new C1114fa(this, oLPlayHall, message));
                return;
            case 8:
                post(new C1115fb(this, message, oLPlayHall));
                return;
            case 9:
                post(new C1119ff(this, message, oLPlayHall));
                return;
            case 10:
                post(new C1123fj(this, message, oLPlayHall));
                return;
            case 11:
                post(new C1103eq(this, message, oLPlayHall));
                return;
            case 12:
                post(new C1106et(this, message, oLPlayHall));
                return;
            case 20:
                post(new C1107eu(this, oLPlayHall));
                return;
            case 21:
                post(new C1108ev(this, oLPlayHall));
                return;
            default:
                return;
        }
    }
}
