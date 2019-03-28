package ly.pp.addsongs;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;

/* renamed from: ly.pp.addsongs.ng */
final class C1336ng implements OnCancelListener {
    /* renamed from: a */
    final /* synthetic */ C1335nf f6008a;

    C1336ng(C1335nf c1335nf) {
        this.f6008a = c1335nf;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.f6008a.cancel(true);
    }
}
