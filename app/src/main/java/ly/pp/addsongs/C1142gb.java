package ly.pp.addsongs;

import android.content.Intent;
import android.os.Bundle;
import android.os.Message;

/* renamed from: ly.pp.addsongs.gb */
final class C1142gb implements Runnable {
    /* renamed from: a */
    final /* synthetic */ C1137fx f5477a;
    /* renamed from: b */
    private final /* synthetic */ Message f5478b;
    /* renamed from: c */
    private final /* synthetic */ OLPlayHallRoom f5479c;

    C1142gb(C1137fx c1137fx, Message message, OLPlayHallRoom oLPlayHallRoom) {
        this.f5477a = c1137fx;
        this.f5478b = message;
        this.f5479c = oLPlayHallRoom;
    }

    /* renamed from: run */
    public final void run() {
        Bundle data = this.f5478b.getData();
        Integer.valueOf(data.getInt("T"));
        if (data.getInt("T") == 0) {
            Intent intent = new Intent(this.f5479c, OLPlayHall.class);
            intent.putExtras(data);
            this.f5479c.startActivity(intent);
            this.f5479c.finish();
            return;
        }
        this.f5479c.mo2841a(data.getInt("T"), data.getString("N"), data.getString("I"));
    }
}
