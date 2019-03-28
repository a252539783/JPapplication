package ly.pp.addsongs;

import java.util.Comparator;
import java.util.Map;

/* renamed from: ly.pp.addsongs.it */
final class C1214it implements Comparator {
    /* renamed from: a */
    final /* synthetic */ PianoPlay f5681a;
    /* renamed from: b */
    private final /* synthetic */ String f5682b;

    C1214it(PianoPlay pianoPlay, String str) {
        this.f5681a = pianoPlay;
        this.f5682b = str;
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        return Integer.valueOf((String) ((Map) obj2).get(this.f5682b)).compareTo(Integer.valueOf((String) ((Map) obj).get(this.f5682b)));
    }
}
