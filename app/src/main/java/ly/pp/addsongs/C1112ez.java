package ly.pp.addsongs;

import android.os.Message;
import android.text.Selection;
import android.text.Spannable;

/* renamed from: ly.pp.addsongs.ez */
final class C1112ez implements Runnable {
    /* renamed from: a */
    final /* synthetic */ C1101eo f5418a;
    /* renamed from: b */
    private final /* synthetic */ OLPlayHall f5419b;
    /* renamed from: c */
    private final /* synthetic */ Message f5420c;

    C1112ez(C1101eo c1101eo, OLPlayHall oLPlayHall, Message message) {
        this.f5418a = c1101eo;
        this.f5419b = oLPlayHall;
        this.f5420c = message;
    }

    /* renamed from: run */
    public final void run() {
        this.f5419b.f4378K.setCurrentTab(1);
        String string = this.f5420c.getData().getString("U");
        if (!string.equals(this.f5419b.f4404t.mo2702Q())) {
            //this.f5419b.f4379L;
            this.f5419b.f4379L = "@" + string + ":";
            this.f5419b.f4408x.setText(this.f5419b.f4379L);
            CharSequence text = this.f5419b.f4408x.getText();
            if (text instanceof Spannable) {
                Selection.setSelection((Spannable) text, text.length());
            }
        }
    }
}
