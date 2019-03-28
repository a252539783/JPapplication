package ly.pp.addsongs;

import java.util.Comparator;
import java.util.Map;

/* renamed from: ly.pp.addsongs.kj */
final class C1258kj implements Comparator {
    /* renamed from: a */
    final /* synthetic */ RecordFiles f5796a;

    C1258kj(RecordFiles recordFiles) {
        this.f5796a = recordFiles;
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        return (int) (((Long) ((Map) obj2).get("timelong")).longValue() - ((Long) ((Map) obj).get("timelong")).longValue());
    }
}
