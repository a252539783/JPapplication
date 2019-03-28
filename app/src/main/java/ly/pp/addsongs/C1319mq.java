package ly.pp.addsongs;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;

/* renamed from: ly.pp.addsongs.mq */
final class C1319mq implements OnCancelListener {
    /* renamed from: a */
    final /* synthetic */ C1318mp f5970a;

    C1319mq(C1318mp c1318mp) {
        this.f5970a = c1318mp;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.f5970a.cancel(true);
    }
}
