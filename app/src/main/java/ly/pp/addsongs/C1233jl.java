package ly.pp.addsongs;

import android.os.Message;

/* renamed from: ly.pp.addsongs.jl */
final class C1233jl implements Runnable {
    /* renamed from: a */
    final /* synthetic */ C1227jf f5716a;
    /* renamed from: b */
    private final /* synthetic */ PianoPlay f5717b;
    /* renamed from: c */
    private final /* synthetic */ Message f5718c;

    C1233jl(C1227jf c1227jf, PianoPlay pianoPlay, Message message) {
        this.f5716a = c1227jf;
        this.f5717b = pianoPlay;
        this.f5718c = message;
    }

    /* renamed from: run */
    public final void run() {
        this.f5717b.f4604W.mo2769a(this.f5718c.arg1);
    }
}
