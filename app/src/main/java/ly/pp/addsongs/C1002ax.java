package ly.pp.addsongs;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;

/* renamed from: ly.pp.addsongs.ax */
final class C1002ax implements OnCancelListener {
    /* renamed from: a */
    final /* synthetic */ C1001aw f5138a;

    C1002ax(C1001aw c1001aw) {
        this.f5138a = c1001aw;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.f5138a.cancel(true);
    }
}
