package ly.pp.addsongs;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;

/* renamed from: ly.pp.addsongs.lx */
final class C1299lx implements OnCancelListener {
    /* renamed from: a */
    final /* synthetic */ C1298lw f5916a;

    C1299lx(C1298lw c1298lw) {
        this.f5916a = c1298lw;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.f5916a.cancel(true);
    }
}
