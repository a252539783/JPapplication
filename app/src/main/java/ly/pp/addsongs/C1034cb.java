package ly.pp.addsongs;

import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import java.util.ArrayList;

/* renamed from: ly.pp.addsongs.cb */
public final class C1034cb extends BaseAdapter {
    /* renamed from: a */
    int f5241a = 0;
    /* renamed from: b */
    OLPlayDressRoom f5242b;
    /* renamed from: c */
    ArrayList f5243c;
    /* renamed from: d */
    private LayoutInflater f5244d;

    public C1034cb(ArrayList arrayList, OLPlayDressRoom oLPlayDressRoom) {
        this.f5241a = arrayList.size();
        this.f5244d = oLPlayDressRoom.getLayoutInflater();
        this.f5242b = oLPlayDressRoom;
        this.f5243c = arrayList;
    }

    public final int getCount() {
        return this.f5241a;
    }

    public final Object getItem(int i) {
        return Integer.valueOf(i);
    }

    public final long getItemId(int i) {
        return (long) i;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f5244d.inflate(R.layout.ol_dres_view, null);
        }
        view.setKeepScreenOn(true);
        ((ImageView) view.findViewById(R.id.ol_dress_img)).setImageBitmap((Bitmap) this.f5243c.get(i));
        return view;
    }
}
