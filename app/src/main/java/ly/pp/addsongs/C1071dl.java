package ly.pp.addsongs;

import java.text.Collator;
import java.util.Comparator;
import java.util.Locale;
import java.util.Map;


/* renamed from: ly.pp.addsongs.dl */
final class C1071dl implements Comparator {
    /* renamed from: a */
    Collator f5332a = Collator.getInstance(Locale.CHINA);
    /* renamed from: b */
    final /* synthetic */ OLMelodySelect f5333b;
    /* renamed from: c */
    private final /* synthetic */ int f5334c;

    C1071dl(OLMelodySelect oLMelodySelect, int i) {
        this.f5333b = oLMelodySelect;
        this.f5334c = i;
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        Map map = (Map) obj;
        Map map2 = (Map) obj2;
        switch (this.f5334c) {
            case 0:
                return this.f5333b.f4331t ? 0 - ((String) map.get("update")).compareTo((String) map2.get("update")) : ((String) map.get("update")).compareTo((String) map2.get("update"));
            case 1:
                return this.f5333b.f4332u ? ((Double) map.get("degree")).compareTo((Double) map2.get("degree")) : 0 - ((Double) map.get("degree")).compareTo((Double) map2.get("degree"));
            case 2:
                return this.f5333b.f4333v ? this.f5332a.compare((String) map.get("songName"), (String) map2.get("songName")) : 0 - this.f5332a.compare((String) map.get("songName"), (String) map2.get("songName"));
            case 3:
                return this.f5333b.f4334w ? this.f5332a.compare((String) map.get("artist"), (String) map2.get("artist")) : 0 - this.f5332a.compare((String) map.get("artist"), (String) map2.get("artist"));
            case 4:
                return this.f5333b.f4335x ? 0 - this.f5332a.compare((String) map.get("playCount"), (String) map2.get("playCount")) : this.f5332a.compare((String) map.get("playCount"), (String) map2.get("playCount"));
            default:
                return 0;
        }
    }
}
