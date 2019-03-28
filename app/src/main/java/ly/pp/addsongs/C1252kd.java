package ly.pp.addsongs;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;

/* renamed from: ly.pp.addsongs.kd */
final class C1252kd implements OnCancelListener {
    /* renamed from: a */
    final /* synthetic */ C1251kc f5780a;

    C1252kd(C1251kc c1251kc) {
        this.f5780a = c1251kc;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.f5780a.cancel(true);
    }
}
