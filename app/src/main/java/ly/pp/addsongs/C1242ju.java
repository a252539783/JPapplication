package ly.pp.addsongs;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;

/* renamed from: ly.pp.addsongs.ju */
final class C1242ju implements OnCancelListener {
    /* renamed from: a */
    final /* synthetic */ C1241jt f5736a;

    C1242ju(C1241jt c1241jt) {
        this.f5736a = c1241jt;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.f5736a.cancel(true);
    }
}
