package ly.pp.addsongs;

import android.os.Bundle;
import android.os.Message;
import java.util.HashMap;

/* renamed from: ly.pp.addsongs.jk */
final class C1232jk implements Runnable {
    /* renamed from: a */
    final /* synthetic */ C1227jf f5713a;
    /* renamed from: b */
    private final /* synthetic */ PianoPlay f5714b;
    /* renamed from: c */
    private final /* synthetic */ Message f5715c;

    C1232jk(C1227jf c1227jf, PianoPlay pianoPlay, Message message) {
        this.f5713a = c1227jf;
        this.f5714b = pianoPlay;
        this.f5715c = message;
    }

    /* renamed from: run */
    public final void run() {
        this.f5714b.f4600S.clear();
        Bundle data = this.f5715c.getData();
        int size = data.size();
        for (int i = 0; i < size; i++) {
            HashMap hashMap = new HashMap();
            hashMap.put("I", data.getBundle(String.valueOf(i)).getString("I"));
            hashMap.put("N", data.getBundle(String.valueOf(i)).getString("N"));
            hashMap.put("S", data.getBundle(String.valueOf(i)).getString("S"));
            hashMap.put("SC", data.getBundle(String.valueOf(i)).getString("SC"));
            hashMap.put("P", data.getBundle(String.valueOf(i)).getString("P"));
            hashMap.put("C", data.getBundle(String.valueOf(i)).getString("C"));
            hashMap.put("G", data.getBundle(String.valueOf(i)).getString("G"));
            hashMap.put("B", data.getBundle(String.valueOf(i)).getString("B"));
            hashMap.put("M", data.getBundle(String.valueOf(i)).getString("M"));
            hashMap.put("T", data.getBundle(String.valueOf(i)).getString("T"));
            hashMap.put("E", data.getBundle(String.valueOf(i)).getString("E"));
            hashMap.put("GR", data.getBundle(String.valueOf(i)).getString("GR"));
            this.f5714b.f4600S.add(hashMap);
        }
        this.f5714b.mo2907b(this.f5714b.f4598Q, this.f5714b.f4600S);
    }
}
