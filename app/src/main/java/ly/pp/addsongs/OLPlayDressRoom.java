package ly.pp.addsongs;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.PorterDuff.Mode;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;
import android.widget.TextView;
import android.widget.Toast;
import java.io.IOException;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;


/* renamed from: ly.pp.addsongs.OLPlayDressRoom */
public class OLPlayDressRoom extends BaseActivity implements OnClickListener {
    /* renamed from: A */
    private ImageView f4338A;
    /* renamed from: B */
    public ImageView f4339B;
    /* renamed from: C */
    public ImageView f4340C;
    /* renamed from: D */
    public ImageView f4341D;
    /* renamed from: E */
    public ImageView f4342E;
    /* renamed from: F */
    private String f4343F = "f";
    /* renamed from: G */
    private Button f4344G;
    /* renamed from: H */
    private Button f4345H;
    /* renamed from: I */
    private Bitmap f4346I;
    /* renamed from: J */
    public Bitmap f4347J;
    int Tao0 = 0;
    public ArrayList TaoArray = new ArrayList();
    private GridView TaoGrid;
    int TaoNum = 0;
    public Context context;
    /* renamed from: h */
    public ArrayList f4348h = new ArrayList();
    /* renamed from: i */
    public ArrayList f4349i = new ArrayList();
    /* renamed from: j */
    public ArrayList f4350j = new ArrayList();
    /* renamed from: k */
    public ArrayList f4351k = new ArrayList();
    /* renamed from: l */
    int f4352l = -1;
    /* renamed from: lv */
    int f4353lv = 0;
    /* renamed from: m */
    int f4354m = -1;
    /* renamed from: n */
    int f4355n = -1;
    /* renamed from: o */
    int f4356o = -1;
    /* renamed from: p */
    int f4357p = 0;
    /* renamed from: q */
    int f4358q = 0;
    /* renamed from: r */
    int f4359r = 0;
    /* renamed from: s */
    int f4360s = 0;
    /* renamed from: t */
    private ConnectionService f4361t;
    /* renamed from: u */
    private JPApplication f4362u;
    /* renamed from: v */
    public TabHost f4363v;
    /* renamed from: w */
    private GridView f4364w;
    /* renamed from: x */
    private GridView f4365x;
    /* renamed from: y */
    private GridView f4366y;
    /* renamed from: z */
    private GridView f4367z;

    /* renamed from: a */
    private void m3672a(GridView gridView, ArrayList arrayList) {
        gridView.setAdapter(new C1034cb(arrayList, this));
    }

    public void onBackPressed() {
        finish();
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.ol_dress_ok:
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("T", "D");
                    jSONObject.put("TR", this.f4355n + 1);
                    String str = "JA";
                    int i = this.f4354m + 1;
                    int i2 = this.Tao0;
                    if (i2 == 0) {
                        jSONObject.put(str, i);
                    } else {
                        jSONObject.put(str, i2 + this.f4358q);
                    }
                    jSONObject.put("HA", this.f4352l + 1);
                    jSONObject.put("SH", this.f4356o + 1);
                    String jSONObject2 = jSONObject.toString();
                    if (this.f4361t != null) {
                        this.f4361t.mo2676a((byte) 33, (byte) 0, (byte) 0, jSONObject2, null);
                    } else {
                        Toast.makeText(this, "连接已断开", Toast.LENGTH_SHORT).show();
                    }
                    Intent intent = new Intent(this, OLPlayHallRoom.class);
                    intent.putExtra("T", this.f4355n + 1);
                    str = "J";
                    i = this.f4354m + 1;
                    i2 = this.Tao0;
                    if (i2 == 0) {
                        intent.putExtra(str, i);
                    } else {
                        intent.putExtra(str, i2 + this.f4358q);
                    }
                    intent.putExtra("H", this.f4352l + 1);
                    intent.putExtra("O", this.f4356o + 1);
                    intent.putExtra("S", this.f4343F);
                    setResult(-1, intent);
                    Toast.makeText(this, "服装保存成功！", Toast.LENGTH_SHORT).show();
                    return;
                } catch (JSONException e) {
                    e.printStackTrace();
                    return;
                }
            case R.id.ol_dress_cancel:
                finish();
                return;
            default:
                return;
        }
    }

    protected void onCreate(Bundle bundle) {
        this.context = this;
        super.onCreate(bundle);
        this.f3996b = 2;
        this.f4362u = (JPApplication) getApplication();
        Bundle extras = getIntent().getExtras();
        this.f4352l = extras.getInt("H");
        this.f4354m = extras.getInt("J");
        this.f4355n = extras.getInt("T");
        this.f4353lv = extras.getInt("Lv");
        this.f4356o = extras.getInt("O");
        this.f4343F = extras.getString("S");
        if (this.f4343F.equals("f")) {
            this.f4357p = 19;
            this.f4359r = 19;
            this.f4358q = 41;
            this.f4360s = 16;
            this.TaoNum = 2;
        } else {
            this.f4357p = 10;
            this.f4359r = 29;
            this.f4358q = 37;
            this.f4360s = 16;
            this.TaoNum = 2;
        }
        setContentView(R.layout.olplaydressroom);
        this.f4362u.mo2706a((Context) this, "ground", (LinearLayout) findViewById(R.id.layout));
        this.f4344G = (Button) findViewById(R.id.ol_dress_ok);
        this.f4345H = (Button) findViewById(R.id.ol_dress_cancel);
        this.f4344G.setOnClickListener(this);
        this.f4345H.setOnClickListener(this);
        this.f4363v = (TabHost) findViewById(R.id.tabhost);
        this.f4363v.setup();
        TabSpec newTabSpec = this.f4363v.newTabSpec("tab1");
        newTabSpec.setContent(R.id.hair_tab);
        newTabSpec.setIndicator("头发");
        this.f4363v.addTab(newTabSpec);
        newTabSpec = this.f4363v.newTabSpec("tab2");
        newTabSpec.setContent(R.id.jacket_tab);
        newTabSpec.setIndicator("上衣");
        this.f4363v.addTab(newTabSpec);
        newTabSpec = this.f4363v.newTabSpec("tab3");
        newTabSpec.setContent(R.id.trousers_tab);
        newTabSpec.setIndicator("下衣");
        this.f4363v.addTab(newTabSpec);
        newTabSpec = this.f4363v.newTabSpec("tab4");
        newTabSpec.setContent(R.id.shoes_tab);
        newTabSpec.setIndicator("鞋子");
        this.f4363v.addTab(newTabSpec);
        newTabSpec = this.f4363v.newTabSpec("tab5");
        newTabSpec.setContent(R.id.tao_tab);
        newTabSpec.setIndicator("套装");
        this.f4363v.addTab(newTabSpec);
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        for (int i = 0; i < 5; i++) {
            this.f4363v.getTabWidget().getChildTabViewAt(i).getLayoutParams().height = (displayMetrics.heightPixels * 45) / 512;
            ((TextView) this.f4363v.getTabWidget().getChildAt(i).findViewById(16908310)).setTextColor(-1);
        }
        this.f4363v.setOnTabChangedListener(new C1084dy(this));
        this.f4363v.setCurrentTab(1);
        this.f4338A = (ImageView) findViewById(R.id.ol_dress_mod);
        this.f4339B = (ImageView) findViewById(R.id.ol_dress_trousers);
        this.f4340C = (ImageView) findViewById(R.id.ol_dress_jacket);
        this.f4341D = (ImageView) findViewById(R.id.ol_dress_hair);
        this.f4342E = (ImageView) findViewById(R.id.ol_dress_shoes);
        try {
            this.f4346I = BitmapFactory.decodeStream(getResources().getAssets().open("mod/" + this.f4343F + "_m0.png"));
            this.f4347J = BitmapFactory.decodeStream(getResources().getAssets().open("mod/_none.png"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.f4338A.setImageBitmap(this.f4346I);
        this.f4338A.setColorFilter(-1, Mode.MULTIPLY);
        int i2 = 0;
        while (i2 < this.f4357p) {
            try {
                this.f4348h.add(BitmapFactory.decodeStream(getResources().getAssets().open("mod/" + this.f4343F + "_h" + i2 + ".png")));
                i2++;
            } catch (IOException e2) {
                e2.printStackTrace();
            }
        }
        for (i2 = 0; i2 < this.f4358q; i2++) {
            try {
                this.f4349i.add(BitmapFactory.decodeStream(getResources().getAssets().open("mod/" + this.f4343F + "_j" + i2 + ".png")));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        for (i2 = 0; i2 < this.TaoNum; i2++) {
            try {
                this.TaoArray.add(BitmapFactory.decodeStream(getResources().getAssets().open("mod/" + this.f4343F + "_j" + (i2 + this.f4358q) + ".png")));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        for (i2 = 0; i2 < this.f4359r; i2++) {
            try {
                this.f4350j.add(BitmapFactory.decodeStream(getResources().getAssets().open("mod/" + this.f4343F + "_t" + i2 + ".png")));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        for (i2 = 0; i2 < this.f4360s; i2++) {
            try {
                this.f4351k.add(BitmapFactory.decodeStream(getResources().getAssets().open("mod/" + this.f4343F + "_s" + i2 + ".png")));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        this.f4364w = (GridView) findViewById(R.id.ol_hair_grid);
        this.f4365x = (GridView) findViewById(R.id.ol_jacket_grid);
        this.f4366y = (GridView) findViewById(R.id.ol_trousers_grid);
        this.f4367z = (GridView) findViewById(R.id.ol_shoes_grid);
        this.TaoGrid = (GridView) findViewById(R.id.ol_tao_grid);
        m3672a(this.f4364w, this.f4348h);
        m3672a(this.f4365x, this.f4349i);
        m3672a(this.f4366y, this.f4350j);
        m3672a(this.f4367z, this.f4351k);
        m3672a(this.TaoGrid, this.TaoArray);
        if (this.f4352l < 0) {
            this.f4341D.setImageBitmap(this.f4347J);
        } else {
            this.f4341D.setImageBitmap((Bitmap) this.f4348h.get(this.f4352l));
        }
        this.f4364w.setOnItemClickListener(new C1085dz(this));
        i2 = this.f4354m;
        if (i2 < 0) {
            this.f4340C.setImageBitmap(this.f4347J);
        } else {
            int i3 = this.f4358q;
            if (i2 < i3) {
                this.f4340C.setImageBitmap((Bitmap) this.f4349i.get(this.f4354m));
            } else {
                this.f4340C.setImageBitmap((Bitmap) this.TaoArray.get(this.f4354m - i3));
            }
        }
        this.f4365x.setOnItemClickListener(new C1087ea(this));
        this.TaoGrid.setOnItemClickListener(new C0977Tao(this));
        if (this.f4355n < 0) {
            this.f4339B.setImageBitmap(this.f4347J);
        } else {
            this.f4339B.setImageBitmap((Bitmap) this.f4350j.get(this.f4355n));
        }
        this.f4366y.setOnItemClickListener(new C1088eb(this));
        if (this.f4356o < 0) {
            this.f4342E.setImageBitmap(this.f4347J);
        } else {
            this.f4342E.setImageBitmap((Bitmap) this.f4351k.get(this.f4356o));
        }
        this.f4367z.setOnItemClickListener(new C1089ec(this));
        this.f4361t = this.f4362u.mo2697M();
    }

    protected void onDestroy() {
        int i;
        int i2 = 0;
        for (i = 0; i < this.f4357p; i++) {
            ((Bitmap) this.f4348h.get(i)).recycle();
        }
        this.f4348h.clear();
        for (i = 0; i < this.TaoNum; i++) {
            ((Bitmap) this.TaoArray.get(i)).recycle();
        }
        this.TaoArray.clear();
        for (i = 0; i < this.f4358q; i++) {
            ((Bitmap) this.f4349i.get(i)).recycle();
        }
        this.f4349i.clear();
        for (i = 0; i < this.f4359r; i++) {
            ((Bitmap) this.f4350j.get(i)).recycle();
        }
        this.f4350j.clear();
        //"shoesArray.size():" + this.f4351k.size();
        while (i2 < this.f4360s) {
            ((Bitmap) this.f4351k.get(i2)).recycle();
            i2++;
        }
        this.f4351k.clear();
        this.f4346I.recycle();
        super.onDestroy();
    }

    public void onPause() {

        super.onPause();
    }

    protected void onResume() {

        super.onResume();
    }

    protected void onStop() {
        super.onStop();
    }
}
