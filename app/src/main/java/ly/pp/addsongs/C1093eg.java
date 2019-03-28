package ly.pp.addsongs;

import android.os.Bundle;
import java.util.Comparator;

/* renamed from: ly.pp.addsongs.eg */
final class C1093eg implements Comparator {
    /* renamed from: a */
    final /* synthetic */ OLPlayHall f5374a;
    /* renamed from: b */
    private final /* synthetic */ String f5375b;

    C1093eg(OLPlayHall oLPlayHall, String str) {
        this.f5374a = oLPlayHall;
        this.f5375b = str;
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        return Integer.valueOf(((Bundle) obj).getByte(this.f5375b)).compareTo(Integer.valueOf(((Bundle) obj2).getByte(this.f5375b)));
    }
}
