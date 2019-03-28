package ly.pp.addsongs;

import android.os.Message;
import android.text.Selection;
import android.text.Spannable;

/* renamed from: ly.pp.addsongs.hb */
final class C1169hb implements Runnable {
    /* renamed from: a */
    final /* synthetic */ C1164gx f5534a;
    /* renamed from: b */
    private final /* synthetic */ OLPlayRoom f5535b;
    /* renamed from: c */
    private final /* synthetic */ Message f5536c;

    C1169hb(C1164gx c1164gx, OLPlayRoom oLPlayRoom, Message message) {
        this.f5534a = c1164gx;
        this.f5535b = oLPlayRoom;
        this.f5536c = message;
    }

    /* renamed from: run */
    public final void run() {
        this.f5535b.f4502aa.setCurrentTab(1);
        String string = this.f5536c.getData().getString("U");
        if (string != null && !string.equals(this.f5535b.f4531o.mo2702Q())) {
            this.f5535b.f4509ah = "@" + string + ":";
            this.f5535b.f4487L.setText(this.f5535b.f4509ah);
            CharSequence text = this.f5535b.f4487L.getText();
            if (text instanceof Spannable) {
                Selection.setSelection((Spannable) text, text.length());
            }
        }
    }
}
