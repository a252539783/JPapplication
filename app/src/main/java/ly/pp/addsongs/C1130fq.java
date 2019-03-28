package ly.pp.addsongs;

import android.os.Bundle;
import java.util.Comparator;

/* renamed from: ly.pp.addsongs.fq */
final class C1130fq implements Comparator {
    /* renamed from: a */
    final /* synthetic */ OLPlayHallRoom f5455a;

    C1130fq(OLPlayHallRoom oLPlayHallRoom) {
        this.f5455a = oLPlayHallRoom;
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        return Integer.valueOf(((Bundle) obj).getByte("I")).compareTo(Integer.valueOf(((Bundle) obj2).getByte("I")));
    }
}
