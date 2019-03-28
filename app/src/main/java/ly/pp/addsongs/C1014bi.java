package ly.pp.addsongs;

import android.database.Cursor;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;

/* renamed from: ly.pp.addsongs.bi */
final class C1014bi implements OnItemClickListener {
    /* renamed from: a */
    final /* synthetic */ MelodySelect f5156a;

    C1014bi(MelodySelect melodySelect) {
        this.f5156a = melodySelect;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        Cursor query;
        this.f5156a.f4264t = i;
        if (this.f5156a.f4261q != null) {
            this.f5156a.f4261q.setBackgroundResource(R.color.top_background);
        }
        view.setBackgroundResource(R.color.translent);
        if (i == 0) {
            this.f5156a.f4231H = "";
            query = this.f5156a.f4252h.query("jp_data", null, "isfavo = 1 AND " + this.f5156a.f4238O, null, null, null, this.f5156a.f4260p);
        } else if (i == C1194i.f5597a.length - 1) {
            this.f5156a.f4231H = "";
            query = this.f5156a.f4252h.query("jp_data", null, "ishot = 1 AND " + this.f5156a.f4238O, null, null, null, this.f5156a.f4260p);
        } else {
            this.f5156a.f4231H = C1194i.f5597a[i];
            query = this.f5156a.f4252h.query("jp_data", null, "ishot = 0 AND " + this.f5156a.f4238O + " AND item=?", new String[]{this.f5156a.f4231H}, null, null, this.f5156a.f4260p);
        }
        this.f5156a.mo2784a(query);
        this.f5156a.f4263s = C1194i.f5597a[i];
        this.f5156a.f4261q = view;
    }
}
