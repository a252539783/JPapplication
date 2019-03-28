package ly.pp.addsongs;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;

/* renamed from: ly.pp.addsongs.kv */
final class C1270kv implements OnCancelListener {
    /* renamed from: a */
    final /* synthetic */ C1269ku f5851a;

    C1270kv(C1269ku c1269ku) {
        this.f5851a = c1269ku;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.f5851a.cancel(true);
    }
}
