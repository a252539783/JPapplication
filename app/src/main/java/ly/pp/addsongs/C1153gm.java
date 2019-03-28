package ly.pp.addsongs;

import android.os.Bundle;
import java.util.Comparator;

/* renamed from: ly.pp.addsongs.gm */
final class C1153gm implements Comparator {
    /* renamed from: a */
    final /* synthetic */ OLPlayRoom f5506a;

    C1153gm(OLPlayRoom oLPlayRoom) {
        this.f5506a = oLPlayRoom;
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        return Integer.valueOf(((Bundle) obj2).getInt("O")).compareTo(Integer.valueOf(((Bundle) obj).getInt("O")));
    }
}
