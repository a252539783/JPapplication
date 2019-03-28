package ly.pp.addsongs;

import android.os.Bundle;
import java.util.Comparator;

/* renamed from: ly.pp.addsongs.gt */
final class C1160gt implements Comparator {
    /* renamed from: a */
    final /* synthetic */ OLPlayRoom f5520a;
    /* renamed from: b */
    private final /* synthetic */ String f5521b;

    C1160gt(OLPlayRoom oLPlayRoom, String str) {
        this.f5520a = oLPlayRoom;
        this.f5521b = str;
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        return Integer.valueOf(((Bundle) obj).getByte(this.f5521b)).compareTo(Integer.valueOf(((Bundle) obj2).getByte(this.f5521b)));
    }
}
