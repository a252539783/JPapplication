package ly.pp.addsongs;

/* renamed from: ly.pp.addsongs.hp */
final class C1183hp implements Runnable {
    /* renamed from: a */
    final /* synthetic */ C1164gx f5571a;
    /* renamed from: b */
    private final /* synthetic */ OLPlayRoom f5572b;

    C1183hp(C1164gx c1164gx, OLPlayRoom oLPlayRoom) {
        this.f5571a = c1164gx;
        this.f5572b = oLPlayRoom;
    }

    /* renamed from: run */
    public final void run() {
        if (this.f5572b.f4535s != null) {
            this.f5572b.f4535s.setText("取消准备");
        }
    }
}
