package ly.pp.addsongs;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;

/* renamed from: ly.pp.addsongs.dd */
final class C1063dd implements OnCancelListener {
    /* renamed from: a */
    final /* synthetic */ C1062dc f5318a;

    C1063dd(C1062dc c1062dc) {
        this.f5318a = c1062dc;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.f5318a.cancel(true);
    }
}
