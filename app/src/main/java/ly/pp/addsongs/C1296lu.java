package ly.pp.addsongs;

/* renamed from: ly.pp.addsongs.lu */
final class C1296lu extends Thread {
    /* renamed from: a */
    final /* synthetic */ C1294ls f5912a;
    /* renamed from: b */
    private final /* synthetic */ String f5913b;

    C1296lu(C1294ls c1294ls, String str) {
        this.f5912a = c1294ls;
        this.f5913b = str;
    }

    /* renamed from: run */
    public final void run() {
        try {
            this.f5912a.f5905a.mo2993a(this.f5913b + ".ps");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
