package ly.pp.addsongs;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;

/* renamed from: ly.pp.addsongs.az */
final class C1004az implements OnCancelListener {
    /* renamed from: a */
    final /* synthetic */ C1003ay f5144a;

    C1004az(C1003ay c1003ay) {
        this.f5144a = c1003ay;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.f5144a.cancel(true);
    }
}
