package ly.pp.addsongs;

import android.os.Bundle;
import android.os.Message;
import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: ly.pp.addsongs.ir */
final class C1212ir implements OnClickListener {
    /* renamed from: a */
    final /* synthetic */ C1211iq f5678a;
    /* renamed from: b */
    private final /* synthetic */ int f5679b;

    C1212ir(C1211iq c1211iq, int i) {
        this.f5678a = c1211iq;
        this.f5679b = i;
    }

    public final void onClick(View view) {
        Message message = new Message();
        Bundle bundle = new Bundle();
        bundle.putInt("selIndex", this.f5679b);
        message.setData(bundle);
        message.what = 1;
        this.f5678a.f5677c.sendMessage(message);
    }
}
