package ly.pp.addsongs;

import android.os.Bundle;
import java.util.Comparator;

/* renamed from: ly.pp.addsongs.fr */
final class C1131fr implements Comparator {
    /* renamed from: a */
    final /* synthetic */ OLPlayHallRoom f5456a;

    C1131fr(OLPlayHallRoom oLPlayHallRoom) {
        this.f5456a = oLPlayHallRoom;
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        return Integer.valueOf(((Bundle) obj2).getInt("O")).compareTo(Integer.valueOf(((Bundle) obj).getInt("O")));
    }
}
