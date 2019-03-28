package ly.pp.addsongs;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;

/* renamed from: ly.pp.addsongs.li */
final class C1284li implements OnCancelListener {
    /* renamed from: a */
    final /* synthetic */ C1283lh f5880a;

    C1284li(C1283lh c1283lh) {
        this.f5880a = c1283lh;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.f5880a.cancel(true);
    }
}
