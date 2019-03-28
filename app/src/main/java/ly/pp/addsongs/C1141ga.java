package ly.pp.addsongs;

import android.os.Bundle;
import android.os.Message;

/* renamed from: ly.pp.addsongs.ga */
final class C1141ga implements Runnable {
    /* renamed from: a */
    final /* synthetic */ C1137fx f5474a;
    /* renamed from: b */
    private final /* synthetic */ Message f5475b;
    /* renamed from: c */
    private final /* synthetic */ OLPlayHallRoom f5476c;

    C1141ga(C1137fx c1137fx, Message message, OLPlayHallRoom oLPlayHallRoom) {
        this.f5474a = c1137fx;
        this.f5475b = message;
        this.f5476c = oLPlayHallRoom;
    }

    /* renamed from: run */
    public final void run() {
        Bundle data = this.f5475b.getData();
        this.f5476c.f4456at.setText(data.getString("IN"));
        this.f5476c.f4438ab.setText(data.getString("U"));
        this.f5476c.f4441ae.setText("LV." + data.getInt("LV"));
        this.f5476c.f4442af.setText("祝福点数:" + data.getInt("CP"));
        int i = data.getInt("CL");
        this.f5476c.f4443ag.setText("CL." + i);
        this.f5476c.f4443ag.setTextColor(this.f5476c.getResources().getColor(C1194i.f5606j[i]));
        this.f5476c.f4444ah.setText(C1194i.f5602f[i]);
        this.f5476c.f4444ah.setTextColor(this.f5476c.getResources().getColor(C1194i.f5606j[i]));
        this.f5476c.mo2847b(data.getString("DR"));
    }
}
