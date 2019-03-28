package ly.pp.addsongs;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;

/* renamed from: ly.pp.addsongs.lp */
final class C1291lp implements OnCancelListener {
    /* renamed from: a */
    final /* synthetic */ C1290lo f5899a;

    C1291lp(C1290lo c1290lo) {
        this.f5899a = c1290lo;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.f5899a.cancel(true);
    }
}
