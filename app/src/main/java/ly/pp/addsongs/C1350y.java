package ly.pp.addsongs;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;

/* renamed from: ly.pp.addsongs.y */
final class C1350y implements OnCancelListener {
    /* renamed from: a */
    final /* synthetic */ C1349x f6053a;

    C1350y(C1349x c1349x) {
        this.f6053a = c1349x;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.f6053a.cancel(true);
    }
}
