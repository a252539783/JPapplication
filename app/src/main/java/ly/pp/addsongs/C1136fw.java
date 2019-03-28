package ly.pp.addsongs;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;

/* renamed from: ly.pp.addsongs.fw */
final class C1136fw implements OnCancelListener {
    /* renamed from: a */
    final /* synthetic */ C1135fv f5465a;

    C1136fw(C1135fv c1135fv) {
        this.f5465a = c1135fv;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.f5465a.cancel(true);
    }
}
