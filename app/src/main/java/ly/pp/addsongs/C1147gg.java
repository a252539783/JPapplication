package ly.pp.addsongs;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* renamed from: ly.pp.addsongs.gg */
final class C1147gg implements OnClickListener {
    /* renamed from: a */
    final /* synthetic */ C1146gf f5491a;
    /* renamed from: b */
    private final /* synthetic */ byte f5492b;
    /* renamed from: c */
    private final /* synthetic */ OLPlayHallRoom f5493c;

    C1147gg(C1146gf c1146gf, byte b, OLPlayHallRoom oLPlayHallRoom) {
        this.f5491a = c1146gf;
        this.f5492b = b;
        this.f5493c = oLPlayHallRoom;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        if (this.f5492b > (byte) 0) {
            this.f5493c.mo2839a((byte) 29, this.f5492b, "");
        }
    }
}
