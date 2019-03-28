package ly.pp.addsongs;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;

/* renamed from: ly.pp.addsongs.ni */
final class C1338ni implements OnCancelListener {
    /* renamed from: a */
    final /* synthetic */ C1337nh f6011a;

    C1338ni(C1337nh c1337nh) {
        this.f6011a = c1337nh;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.f6011a.cancel(true);
    }
}
