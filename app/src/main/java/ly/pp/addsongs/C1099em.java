package ly.pp.addsongs;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* renamed from: ly.pp.addsongs.em */
final class C1099em implements OnClickListener {
    /* renamed from: a */
    final /* synthetic */ OLPlayHall f5386a;
    /* renamed from: b */
    private final /* synthetic */ int f5387b;
    /* renamed from: c */
    private final /* synthetic */ int f5388c;

    C1099em(OLPlayHall oLPlayHall, int i, int i2) {
        this.f5386a = oLPlayHall;
        this.f5387b = i;
        this.f5388c = i2;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        this.f5386a.mo2826a(this.f5387b, (byte) this.f5388c);
    }
}
