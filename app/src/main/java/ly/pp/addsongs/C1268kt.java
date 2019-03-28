package ly.pp.addsongs;

import android.app.Activity;
import java.util.Iterator;
import java.util.Stack;

/* renamed from: ly.pp.addsongs.kt */
public final class C1268kt {
    /* renamed from: a */
    private static Stack f5847a;
    /* renamed from: b */
    private static C1268kt f5848b;

    private C1268kt() {
    }

    /* renamed from: a */
    public static C1268kt m4107a() {
        if (f5848b == null) {
            f5848b = new C1268kt();
        }
        return f5848b;
    }

    /* renamed from: a */
    public static void m4108a(Activity activity) {
        if (activity != null && activity != null) {
            //f5847a.size();
            f5847a.remove(activity);
            //"remove:" + activity.getClass() + "size:" + f5847a.size();
        }
    }

    /* renamed from: b */
    public static Activity m4109b() {
        return !f5847a.empty() ? (Activity) f5847a.lastElement() : null;
    }

    /* renamed from: b */
    public static void m4110b(Activity activity) {
        if (activity != null) {
            if (f5847a == null) {
                f5847a = new Stack();
            }
            f5847a.add(activity);
            Iterator it = f5847a.iterator();
            while (it.hasNext()) {
                ((Activity) it.next()).getClass();
            }
        }
    }

    /* renamed from: c */
    public static void m4111c() {
        while (f5847a != null && !f5847a.empty()) {
            C1268kt.m4108a(C1268kt.m4109b());
        }
    }
}
