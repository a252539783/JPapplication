package ly.pp.addsongs;

/* renamed from: ly.pp.addsongs.lt */
final class C1295lt extends Thread {
    /* renamed from: a */
    final /* synthetic */ C1294ls f5909a;
    /* renamed from: b */
    private final /* synthetic */ String f5910b;
    /* renamed from: c */
    private final /* synthetic */ String f5911c;

    C1295lt(C1294ls c1294ls, String str, String str2) {
        this.f5909a = c1294ls;
        this.f5910b = str;
        this.f5911c = str2;
    }

    /* renamed from: run */
    public final void run() {
        try {
            SkinDownload.m3895a(this.f5909a.f5905a, this.f5910b, this.f5911c);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
