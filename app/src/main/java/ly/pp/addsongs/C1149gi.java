package ly.pp.addsongs;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* renamed from: ly.pp.addsongs.gi */
final class C1149gi implements OnClickListener {
    /* renamed from: a */
    final /* synthetic */ C1146gf f5495a;
    /* renamed from: b */
    private final /* synthetic */ byte f5496b;
    /* renamed from: c */
    private final /* synthetic */ OLPlayHallRoom f5497c;

    C1149gi(C1146gf c1146gf, byte b, OLPlayHallRoom oLPlayHallRoom) {
        this.f5495a = c1146gf;
        this.f5496b = b;
        this.f5497c = oLPlayHallRoom;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        if (this.f5496b > (byte) 0) {
            this.f5497c.mo2839a((byte) 29, this.f5496b, "");
        }
    }
}
