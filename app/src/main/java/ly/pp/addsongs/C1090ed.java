package ly.pp.addsongs;

import android.os.Bundle;
import java.util.Comparator;

/* renamed from: ly.pp.addsongs.ed */
final class C1090ed implements Comparator {
    /* renamed from: a */
    final /* synthetic */ OLPlayHall f5369a;

    C1090ed(OLPlayHall oLPlayHall) {
        this.f5369a = oLPlayHall;
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        return Integer.valueOf(((Bundle) obj2).getInt("O")).compareTo(Integer.valueOf(((Bundle) obj).getInt("O")));
    }
}
