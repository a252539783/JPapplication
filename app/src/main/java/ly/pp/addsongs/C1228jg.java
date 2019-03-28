package ly.pp.addsongs;

import android.os.Bundle;
import android.os.Message;
import java.util.HashMap;

/* renamed from: ly.pp.addsongs.jg */
final class C1228jg implements Runnable {
    /* renamed from: a */
    final /* synthetic */ C1227jf f5703a;
    /* renamed from: b */
    private final /* synthetic */ PianoPlay f5704b;
    /* renamed from: c */
    private final /* synthetic */ Message f5705c;

    C1228jg(C1227jf c1227jf, PianoPlay pianoPlay, Message message) {
        this.f5703a = c1227jf;
        this.f5704b = pianoPlay;
        this.f5705c = message;
    }

    /* renamed from: run */
    public final void run() {
        this.f5704b.f4600S.clear();
        Bundle data = this.f5705c.getData();
        int size = data.size();
        for (int i = 0; i < size; i++) {
            HashMap hashMap = new HashMap();
            hashMap.put("U", data.getBundle(String.valueOf(i)).getString("U"));
            hashMap.put("G", data.getBundle(String.valueOf(i)).getString("G"));
            hashMap.put("M", data.getBundle(String.valueOf(i)).getString("M"));
            this.f5704b.f4600S.add(hashMap);
        }
        this.f5704b.mo2905a(this.f5704b.f4583B, this.f5704b.f4600S);
        if (this.f5705c.arg1 == 0) {
            this.f5704b.mo2906a(true);
        }
    }
}
