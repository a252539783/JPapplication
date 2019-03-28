package ly.pp.addsongs;

import android.os.Message;

/* renamed from: ly.pp.addsongs.hl */
final class C1179hl implements Runnable {
    /* renamed from: a */
    final /* synthetic */ C1164gx f5560a;
    /* renamed from: b */
    private final /* synthetic */ Message f5561b;
    /* renamed from: c */
    private final /* synthetic */ OLPlayRoom f5562c;

    C1179hl(C1164gx c1164gx, Message message, OLPlayRoom oLPlayRoom) {
        this.f5560a = c1164gx;
        this.f5561b = message;
        this.f5562c = oLPlayRoom;
    }

    /* renamed from: run */
    public final void run() {
        String str = "songs/" + this.f5561b.getData().getString("song_path") + ".pm";
        if (!str.equals("songs/.pm")) {
            String[] a = this.f5562c.mo2864a(str);
            Object obj = a[0];
            String str2 = a[1];
            if (obj != null) {
                this.f5562c.f4486K.setText(new StringBuilder(String.valueOf(obj)).append("[难度:").append(str2).append("]").toString());
                if (this.f5562c.f4536t != null) {
                    while (this.f5562c.f4536t.isAlive()) {
                        this.f5562c.f4536t.f5738b = false;
                    }
                    this.f5562c.f4536t = null;
                }
                try {
                    this.f5562c.f4536t = new C1243jv(this.f5562c.f4531o, str, null, 0);
                    if (this.f5562c.f4536t.f5742f) {
                        this.f5562c.f4480E = str;
                        this.f5562c.f4536t.f5738b = true;
                        this.f5562c.f4536t.start();
                        return;
                    }
                    C1302m c1302m = new C1302m(this.f5562c);
                    c1302m.mo3537a();
                    c1302m.mo3539b("曲库无此歌曲,请下载最新版本!").mo3536a("確定", new C1180hm(this, this.f5562c)).mo3541c();
                } catch (Exception e) {
                }
            }
        }
    }
}
