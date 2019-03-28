package ly.pp.addsongs;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

/* renamed from: ly.pp.addsongs.bn */
public final class C1019bn extends BaseAdapter {
    /* renamed from: a */
    final /* synthetic */ MelodySelect f5163a;

    public C1019bn(MelodySelect melodySelect) {
        this.f5163a = melodySelect;
    }

    public final int getCount() {
        return C1194i.f5597a.length;
    }

    public final Object getItem(int i) {
        return Integer.valueOf(i);
    }

    public final long getItemId(int i) {
        return (long) i;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        View inflate = this.f5163a.f4226C.inflate(R.layout.f_view, null);
        inflate.setKeepScreenOn(true);
        ((TextView) inflate.findViewById(R.id.ol_s_p)).setText(C1194i.f5597a[i]);
        return inflate;
    }
}
