package ly.pp.addsongs;

import android.os.Message;

/* renamed from: ly.pp.addsongs.fb */
final class C1115fb implements Runnable {
    /* renamed from: a */
    final /* synthetic */ C1101eo f5425a;
    /* renamed from: b */
    private final /* synthetic */ Message f5426b;
    /* renamed from: c */
    private final /* synthetic */ OLPlayHall f5427c;

    C1115fb(C1101eo c1101eo, Message message, OLPlayHall oLPlayHall) {
        this.f5425a = c1101eo;
        this.f5426b = message;
        this.f5427c = oLPlayHall;
    }

    /* renamed from: run */
    public final void run() {
        String string = this.f5426b.getData().getString("F");
        switch (this.f5426b.getData().getInt("T")) {
            case 0:
                if (!string.equals("")) {
                    C1302m c1302m = new C1302m(this.f5427c);
                    c1302m.mo3539b("好友请求");
                    c1302m.mo3535a("[" + string + "]请求加您为好友,同意吗?");
                    c1302m.mo3536a("同意", new C1116fc(this, string, this.f5427c));
                    c1302m.mo3540b("拒绝", new C1117fd(this, string, this.f5427c));
                    try {
                        c1302m.mo3541c();
                        return;
                    } catch (Exception e) {
                        return;
                    }
                }
                return;
            case 1:
                string = this.f5426b.getData().getString("F");
                int i = this.f5426b.getData().getInt("I");
                C1302m c1302m2 = new C1302m(this.f5427c);
                c1302m2.mo3539b("请求结果");
                if (i == 0) {
                    c1302m2.mo3535a("[" + string + "]同意添加您为好友！");
                } else if (i == 1) {
                    c1302m2.mo3535a("对方拒绝了你的好友请求！");
                } else if (i == 2) {
                    c1302m2.mo3535a("对方已经是你的好友！");
                } else if (i == 3) {
                    c1302m2.mo3539b(this.f5426b.getData().getString("title"));
                    c1302m2.mo3535a(this.f5426b.getData().getString("Message"));
                }
                c1302m2.mo3536a("确定", new C1118fe(this));
                try {
                    c1302m2.mo3541c();
                    return;
                } catch (Exception e2) {
                    return;
                }
            default:
                return;
        }
    }
}
