package ly.pp.addsongs;

import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;

/* renamed from: ly.pp.addsongs.f */
final class C1113f extends Handler {
    /* renamed from: a */
    WeakReference f5421a;

    C1113f(BaseActivity baseActivity) {
        this.f5421a = new WeakReference(baseActivity);
    }

    public final void handleMessage(Message message) {
        BaseActivity baseActivity = (BaseActivity) this.f5421a.get();
        switch (message.what) {
            case 0:
                post(new C1140g(this, baseActivity));
                return;
            default:
                return;
        }
    }
}
