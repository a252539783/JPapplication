package ly.pp.addsongs;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;

/* renamed from: ly.pp.addsongs.bx */
final class C1029bx implements OnCancelListener {
    /* renamed from: a */
    final /* synthetic */ C1028bw f5196a;

    C1029bx(C1028bw c1028bw) {
        this.f5196a = c1028bw;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.f5196a.cancel(true);
    }
}
