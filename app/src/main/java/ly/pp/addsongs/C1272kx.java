package ly.pp.addsongs;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;

/* renamed from: ly.pp.addsongs.kx */
final class C1272kx implements OnCancelListener {
    /* renamed from: a */
    final /* synthetic */ C1271kw f5854a;

    C1272kx(C1271kw c1271kw) {
        this.f5854a = c1271kw;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.f5854a.cancel(true);
    }
}
