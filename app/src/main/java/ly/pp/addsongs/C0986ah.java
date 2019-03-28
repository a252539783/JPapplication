package ly.pp.addsongs;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;

/* renamed from: ly.pp.addsongs.ah */
final class C0986ah implements OnCancelListener {
    /* renamed from: a */
    final /* synthetic */ C0985ag f5109a;

    C0986ah(C0985ag c0985ag) {
        this.f5109a = c0985ag;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.f5109a.cancel(true);
    }
}
