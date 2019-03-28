package ly.pp.addsongs;

import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

/* renamed from: ly.pp.addsongs.m */
public final class C1302m {
    /* renamed from: a */
    private Context f5921a;
    /* renamed from: b */
    private String f5922b;
    /* renamed from: c */
    private String f5923c;
    /* renamed from: d */
    private String f5924d;
    /* renamed from: e */
    private String f5925e;
    /* renamed from: f */
    private View f5926f;
    /* renamed from: g */
    private boolean f5927g = true;
    /* renamed from: h */
    public OnClickListener f5928h;
    /* renamed from: i */
    public OnClickListener f5929i;

    public C1302m(Context context) {
        this.f5921a = context;
    }

    /* renamed from: a */
    public final C1302m mo3534a(View view) {
        this.f5926f = view;
        return this;
    }

    /* renamed from: a */
    public final C1302m mo3535a(String str) {
        this.f5923c = str;
        return this;
    }

    /* renamed from: a */
    public final C1302m mo3536a(String str, OnClickListener onClickListener) {
        this.f5924d = str;
        this.f5928h = onClickListener;
        return this;
    }

    /* renamed from: a */
    public final void mo3537a() {
        this.f5927g = false;
    }

    /* renamed from: b */
    public final C1275l mo3538b() {
        LayoutInflater layoutInflater = (LayoutInflater) this.f5921a.getSystemService("layout_inflater");
        C1275l c1275l = new C1275l(this.f5921a);
        View inflate = layoutInflater.inflate(R.layout.mydialog, null);
        c1275l.addContentView(inflate, new LayoutParams(-1, -2));
        ((TextView) inflate.findViewById(R.id.title)).setText(this.f5922b);
        if (this.f5924d != null) {
            ((Button) inflate.findViewById(R.id.positiveButton)).setText(this.f5924d);
            if (this.f5928h != null) {
                ((Button) inflate.findViewById(R.id.positiveButton)).setOnClickListener(new C1329n(this, c1275l));
            }
        } else {
            inflate.findViewById(R.id.positiveButton).setVisibility(View.GONE);
        }
        if (this.f5925e != null) {
            ((Button) inflate.findViewById(R.id.negativeButton)).setText(this.f5925e);
            if (this.f5929i != null) {
                ((Button) inflate.findViewById(R.id.negativeButton)).setOnClickListener(new C1341o(this, c1275l));
            }
        } else {
            inflate.findViewById(R.id.negativeButton).setVisibility(View.GONE);
        }
        if (this.f5923c != null) {
            ((TextView) inflate.findViewById(R.id.message)).setText(this.f5923c);
        } else if (this.f5926f != null) {
            ((LinearLayout) inflate.findViewById(R.id.content)).removeAllViews();
            ((LinearLayout) inflate.findViewById(R.id.content)).addView(this.f5926f, new LayoutParams(-2, -2));
        }
        c1275l.setContentView(inflate);
        c1275l.setCanceledOnTouchOutside(false);
        c1275l.setCancelable(this.f5927g);
        this.f5927g = true;
        return c1275l;
    }

    /* renamed from: b */
    public final C1302m mo3539b(String str) {
        this.f5922b = str;
        return this;
    }

    /* renamed from: b */
    public final C1302m mo3540b(String str, OnClickListener onClickListener) {
        this.f5925e = str;
        this.f5929i = onClickListener;
        return this;
    }

    /* renamed from: c */
    public final void mo3541c() {
        mo3538b().show();
    }
}
