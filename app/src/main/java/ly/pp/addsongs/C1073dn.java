package ly.pp.addsongs;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;

/* renamed from: ly.pp.addsongs.dn */
final class C1073dn implements OnCancelListener {
    /* renamed from: a */
    final /* synthetic */ C1072dm f5337a;

    C1073dn(C1072dm c1072dm) {
        this.f5337a = c1072dm;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.f5337a.cancel(true);
    }
}
