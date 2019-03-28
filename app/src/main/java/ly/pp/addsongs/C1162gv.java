package ly.pp.addsongs;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;

/* renamed from: ly.pp.addsongs.gv */
final class C1162gv implements OnClickListener {
    /* renamed from: a */
    final /* synthetic */ OLPlayRoom f5523a;

    C1162gv(OLPlayRoom oLPlayRoom) {
        this.f5523a = oLPlayRoom;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f5523a.mo2857a((byte) 8, this.f5523a.f4529m, this.f5523a.f4477B, this.f5523a.f4530n);
        if (this.f5523a.f4536t != null) {
            while (this.f5523a.f4536t.isAlive()) {
                this.f5523a.f4536t.f5738b = false;
            }
            this.f5523a.f4536t = null;
        }
        Intent intent = new Intent(this.f5523a, OLPlayHall.class);
        Bundle bundle = new Bundle();
        bundle.putString("hallName", this.f5523a.f4478C);
        bundle.putByte("hallID", this.f5523a.f4477B);
        dialogInterface.dismiss();
        intent.putExtras(bundle);
        this.f5523a.startActivity(intent);
        this.f5523a.finish();
    }
}
