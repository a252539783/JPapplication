package ly.pp.addsongs;

import android.os.Bundle;
import android.os.Message;

/* renamed from: ly.pp.addsongs.eq */
final class C1103eq implements Runnable {
    /* renamed from: a */
    final /* synthetic */ C1101eo f5394a;
    /* renamed from: b */
    private final /* synthetic */ Message f5395b;
    /* renamed from: c */
    private final /* synthetic */ OLPlayHall f5396c;

    C1103eq(C1101eo c1101eo, Message message, OLPlayHall oLPlayHall) {
        this.f5394a = c1101eo;
        this.f5395b = message;
        this.f5396c = oLPlayHall;
    }

    /* renamed from: run */
    public final void run() {
        Bundle data = this.f5395b.getData();
        data.getInt("type");
        int i = data.getInt("result");
        String string = data.getString("info");
        String string2 = data.getString("path");
        String str = "提示";
        String str2 = null;
        switch (i) {
            case 0:
                str2 = "确定";
                break;
            case 1:
                str2 = "开始考级";
                break;
        }
        C1302m c1302m = new C1302m(this.f5396c);
        c1302m.mo3539b(str);
        c1302m.mo3535a(string);
        c1302m.mo3536a(str2, new C1104er(this, i, this.f5396c, string2));
        if (i == 1) {
            c1302m.mo3540b("取消", new C1105es(this));
        }
        try {
            c1302m.mo3541c();
        } catch (Exception e) {
        }
    }
}
