package ly.pp.addsongs;

import android.os.Bundle;
import android.os.Message;

/* renamed from: ly.pp.addsongs.hd */
final class C1171hd implements Runnable {
    /* renamed from: a */
    final /* synthetic */ C1164gx f5540a;
    /* renamed from: b */
    private final /* synthetic */ Message f5541b;
    /* renamed from: c */
    private final /* synthetic */ OLPlayRoom f5542c;

    C1171hd(C1164gx c1164gx, Message message, OLPlayRoom oLPlayRoom) {
        this.f5540a = c1164gx;
        this.f5541b = message;
        this.f5542c = oLPlayRoom;
    }

    /* renamed from: run */
    public final void run() {
        Bundle data = this.f5541b.getData();
        String string = data.getString("Ti");
        String string2 = data.getString("I");
        C1302m c1302m = new C1302m(this.f5542c);
        c1302m.mo3539b(string);
        c1302m.mo3535a(string2);
        c1302m.mo3536a("确定", new C1172he(this));
        try {
            c1302m.mo3541c();
        } catch (Exception e) {
        }
    }
}
