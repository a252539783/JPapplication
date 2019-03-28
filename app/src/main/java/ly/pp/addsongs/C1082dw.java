package ly.pp.addsongs;

import android.os.Bundle;
import android.os.Message;
import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: ly.pp.addsongs.dw */
final class C1082dw implements OnClickListener {
    /* renamed from: a */
    final /* synthetic */ C1081dv f5359a;
    /* renamed from: b */
    private final /* synthetic */ String f5360b;

    C1082dw(C1081dv c1081dv, String str) {
        this.f5359a = c1081dv;
        this.f5360b = str;
    }

    public final void onClick(View view) {
        Message obtainMessage = ((OLPlayRoom) this.f5359a.f5358d).mo2868d().obtainMessage();
        Bundle bundle = new Bundle();
        bundle.putString("S", this.f5360b);
        obtainMessage.setData(bundle);
        obtainMessage.what = 1;
        ((OLPlayRoom) this.f5359a.f5358d).mo2868d().sendMessage(obtainMessage);
    }
}
