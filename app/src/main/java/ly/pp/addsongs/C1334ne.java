package ly.pp.addsongs;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;

/* renamed from: ly.pp.addsongs.ne */
final class C1334ne implements OnCancelListener {
    /* renamed from: a */
    final /* synthetic */ C1333nd f6006a;

    C1334ne(C1333nd c1333nd) {
        this.f6006a = c1333nd;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.f6006a.cancel(true);
    }
}
