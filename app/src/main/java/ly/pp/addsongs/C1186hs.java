package ly.pp.addsongs;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;

/* renamed from: ly.pp.addsongs.hs */
final class C1186hs implements OnClickListener {
    /* renamed from: a */
    final /* synthetic */ C1185hr f5578a;
    /* renamed from: b */
    private final /* synthetic */ OLPlayRoom f5579b;

    C1186hs(C1185hr c1185hr, OLPlayRoom oLPlayRoom) {
        this.f5578a = c1185hr;
        this.f5579b = oLPlayRoom;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        Intent intent = new Intent(this.f5579b, OLPlayHall.class);
        Bundle bundle = new Bundle();
        bundle.putString("hallName", this.f5579b.f4478C);
        bundle.putByte("hallID", this.f5579b.f4477B);
        intent.putExtras(bundle);
        this.f5579b.startActivity(intent);
        this.f5579b.finish();
    }
}
