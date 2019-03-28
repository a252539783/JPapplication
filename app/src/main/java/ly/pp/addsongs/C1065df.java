package ly.pp.addsongs;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;

/* renamed from: ly.pp.addsongs.df */
final class C1065df implements OnCancelListener {
    /* renamed from: a */
    final /* synthetic */ C1064de f5324a;

    C1065df(C1064de c1064de) {
        this.f5324a = c1064de;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.f5324a.cancel(true);
    }
}
