package ly.pp.addsongs;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;

/* renamed from: ly.pp.addsongs.hm */
final class C1180hm implements OnClickListener {
    /* renamed from: a */
    final /* synthetic */ C1179hl f5563a;
    /* renamed from: b */
    private final /* synthetic */ OLPlayRoom f5564b;

    C1180hm(C1179hl c1179hl, OLPlayRoom oLPlayRoom) {
        this.f5563a = c1179hl;
        this.f5564b = oLPlayRoom;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        Intent intent = new Intent(this.f5564b, OLPlayHall.class);
        Bundle bundle = new Bundle();
        bundle.putString("hallName", this.f5564b.f4478C);
        bundle.putByte("hallID", this.f5564b.f4477B);
        intent.putExtras(bundle);
        this.f5564b.startActivity(intent);
        this.f5564b.finish();
    }
}
