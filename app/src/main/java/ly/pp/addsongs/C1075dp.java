package ly.pp.addsongs;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;

/* renamed from: ly.pp.addsongs.dp */
final class C1075dp implements OnCancelListener {
    /* renamed from: a */
    final /* synthetic */ C1074do f5339a;

    C1075dp(C1074do c1074do) {
        this.f5339a = c1074do;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.f5339a.cancel(true);
    }
}
