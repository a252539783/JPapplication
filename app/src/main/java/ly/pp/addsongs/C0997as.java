package ly.pp.addsongs;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: ly.pp.addsongs.as */
final class C0997as implements OnItemClickListener {
    /* renamed from: a */
    final /* synthetic */ Login f5126a;
    /* renamed from: b */
    private final /* synthetic */ JSONObject f5127b;
    /* renamed from: c */
    private final /* synthetic */ ArrayList f5128c;
    /* renamed from: d */
    private final /* synthetic */ C1275l f5129d;

    C0997as(Login login, JSONObject jSONObject, ArrayList arrayList, C1275l c1275l) {
        this.f5126a = login;
        this.f5127b = jSONObject;
        this.f5128c = arrayList;
        this.f5129d = c1275l;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        try {
            this.f5126a.mo2772a(this.f5127b.getString((String) this.f5128c.get(i)));
            this.f5127b.getString((String) this.f5128c.get(i));
        } catch (JSONException e) {
            e.printStackTrace();
        }
        this.f5129d.dismiss();
    }
}
