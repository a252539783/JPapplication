package ly.pp.addsongs;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

/* renamed from: ly.pp.addsongs.ko */
public final class C1263ko extends BaseAdapter {
    /* renamed from: a */
    Context f5804a;
    /* renamed from: b */
    int[] f5805b;
    /* renamed from: c */
    private Integer[] f5806c = new Integer[]{Integer.valueOf(R.drawable.m), Integer.valueOf(R.drawable.f), Integer.valueOf(R.drawable.none), Integer.valueOf(R.drawable._none)};

    public C1263ko(Context context, int[] iArr) {
        this.f5804a = context;
        this.f5805b = iArr;
    }

    public final int getCount() {
        return this.f5805b.length;
    }

    public final Object getItem(int i) {
        return Integer.valueOf(i);
    }

    public final long getItemId(int i) {
        return (long) i;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        View imageView = new ImageView(this.f5804a);
        ((ImageView) imageView).setImageResource(this.f5806c[this.f5805b[i]].intValue());
        return imageView;
    }
}
