package ly.pp.addsongs;

import android.os.Bundle;
import android.os.Message;
import java.util.HashMap;

/* renamed from: ly.pp.addsongs.jj */
final class C1231jj implements Runnable {
    /* renamed from: a */
    final /* synthetic */ C1227jf f5710a;
    /* renamed from: b */
    private final /* synthetic */ PianoPlay f5711b;
    /* renamed from: c */
    private final /* synthetic */ Message f5712c;

    C1231jj(C1227jf c1227jf, PianoPlay pianoPlay, Message message) {
        this.f5710a = c1227jf;
        this.f5711b = pianoPlay;
        this.f5712c = message;
    }

    /* renamed from: run */
    public final void run() {
        this.f5711b.f4600S.clear();
        Bundle data = this.f5712c.getData();
        int size = data.size();
        for (int i = 0; i < size; i++) {
            HashMap hashMap = new HashMap();
            hashMap.put("G", data.getBundle(String.valueOf(i)).getString("G"));
            hashMap.put("U", data.getBundle(String.valueOf(i)).getString("U"));
            hashMap.put("M", data.getBundle(String.valueOf(i)).getString("M"));
            hashMap.put("S", data.getBundle(String.valueOf(i)).getString("T"));
            this.f5711b.f4600S.add(hashMap);
        }
        this.f5711b.mo2905a(this.f5711b.f4583B, this.f5711b.f4600S);
    }
}
