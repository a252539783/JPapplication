package ly.pp.addsongs;

import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;

/* renamed from: ly.pp.addsongs.ib */
public final class C1196ib extends BaseAdapter {
    /* renamed from: a */
    int f5609a = 0;
    /* renamed from: b */
    List f5610b = null;
    /* renamed from: c */
    byte f5611c;
    /* renamed from: d */
    OLPlayRoom f5612d;
    /* renamed from: e */
    private LayoutInflater f5613e;
    /* renamed from: f */
   public ConnectionService f5614f;
    /* renamed from: g */
    private int[] f5615g = new int[]{R.drawable.back_puased, R.drawable.v1_name, R.drawable.v2_name, R.drawable.v3_name, R.drawable.v4_name, R.drawable.v5_name, R.drawable.v6_name, R.drawable.v7_name, R.drawable.v8_name, R.drawable.v9_name, R.drawable.v10_name, R.drawable.v11_name, R.drawable.v12_name, R.drawable.v13_name};
    /* renamed from: h */
    private int[] f5616h = new int[]{R.drawable.filled_msg, R.drawable.filled_v1, R.drawable.filled_v2, R.drawable.filled_v3, R.drawable.filled_v4, R.drawable.filled_v5, R.drawable.filled_v6, R.drawable.filled_v7, R.drawable.filled_v8, R.drawable.filled_v9, R.drawable.filled_v10, R.drawable.filled_v11, R.drawable.filled_v12, R.drawable.filled_v13};
    private String[] hand = new String[]{"右手", "左手"};
    /* renamed from: i */
    private int[] f5617i = new int[]{R.drawable.back_puased, R.drawable.v1_name, R.drawable.v6_name};
    /* renamed from: j */
    private int[] f5618j = new int[]{R.drawable.back_puased, R.drawable.back_puased, R.drawable.v1_name, R.drawable.v1_name, R.drawable.v6_name, R.drawable.v6_name};
    /* renamed from: k */
    private int[] f5619k = new int[]{R.drawable._none, R.drawable.couple_1, R.drawable.couple_2, R.drawable.couple_3};
    /* renamed from: l */
    private String[] f5620l = new String[]{"右", "左"};
    /* renamed from: m */
    private String[] f5621m = new String[]{"蓝队", "黄队", "紅队"};
    /* renamed from: n */
    private String[] f5622n = new String[]{"情侣证书", "基友证书", "百合证书"};

    public C1196ib(List list, OLPlayRoom oLPlayRoom) {
        this.f5613e = oLPlayRoom.getLayoutInflater();
        this.f5611c = oLPlayRoom.f4529m;
        if (this.f5609a == 1) {
            oLPlayRoom.f4533q = oLPlayRoom.f4524h;
        }
        this.f5610b = list;
        this.f5609a = list.size();
        this.f5612d = oLPlayRoom;
        this.f5614f = oLPlayRoom.f4531o.mo2697M();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:10:0x00c6
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.modifyBlocksTree(BlockProcessor.java:360)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:56)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:38)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:32)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:293)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        */
    /* renamed from: a */
    static /* synthetic */ android.widget.PopupWindow m4034a(ly.pp.addsongs.C1196ib r13, ly.pp.addsongs.OLPlayRoom r14, ly.pp.addsongs.C1245jx r15) {
        /*
        r5 = 0;
        r12 = 3;
        r11 = -2;
        r10 = 1;
        r9 = 0;
        r6 = new android.widget.PopupWindow;
        r6.<init>(r14);
        r0 = android.view.LayoutInflater.from(r14);
        r1 = 2130903057; // 0x7f030011 float:1.7412921E38 double:1.052805995E-314;
        r7 = r0.inflate(r1, r5);
        r0 = 2131427460; // 0x7f0b0084 float:1.8476537E38 double:1.0530650846E-314;
        r0 = r7.findViewById(r0);
        r0 = (android.widget.Button) r0;
        r1 = 2131427461; // 0x7f0b0085 float:1.8476539E38 double:1.053065085E-314;
        r1 = r7.findViewById(r1);
        r1 = (android.widget.Button) r1;
        r2 = 2131427463; // 0x7f0b0087 float:1.8476543E38 double:1.053065086E-314;
        r2 = r7.findViewById(r2);
        r2 = (android.widget.Button) r2;
        r3 = 2131427464; // 0x7f0b0088 float:1.8476545E38 double:1.0530650866E-314;
        r3 = r7.findViewById(r3);
        r3 = (android.widget.Button) r3;
        r4 = 2131427462; // 0x7f0b0086 float:1.847654E38 double:1.0530650856E-314;
        r4 = r7.findViewById(r4);
        r4 = (android.widget.Button) r4;
        r6.setContentView(r7);
        r7 = r14.getResources();
        r8 = 2130837563; // 0x7f02003b float:1.7280084E38 double:1.0527736367E-314;
        r7 = r7.getDrawable(r8);
        r6.setBackgroundDrawable(r7);
        r6.setWidth(r11);
        r6.setHeight(r11);
        r6.setFocusable(r10);
        r6.setTouchable(r10);
        r6.setOutsideTouchable(r10);
        r5 = new ly.pp.addsongs.ic;
        r5.<init>(r13, r6, r15, r14);
        r4.setOnClickListener(r5);
        r5 = new ly.pp.addsongs.id;
        r5.<init>(r13, r6, r15, r14);
        r4.setOnClickListener(r5);
        r4 = r15.mo3393d();
        r5 = r14.f4527k;
        r4 = r4.equals(r5);
        if (r4 != 0) goto L_0x008b;
    L_0x007f:
        r4 = r15.mo3393d();
        r5 = r14.f4526j;
        r4 = r4.equals(r5);
        if (r4 == 0) goto L_0x0148;
    L_0x008b:
        r0 = r15.mo3393d();
        r1 = r14.f4526j;
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x00a9;
    L_0x0097:
        r0 = "关闭空位";
        r3.setText(r0);
        r2.setVisibility(r9);
        r0 = new ly.pp.addsongs.ih;
        r0.<init>(r13, r6, r15, r14);
        r3.setOnClickListener(r0);
        goto L_0x00b9;
    L_0x00a9:
        r0 = "打开空位";
        r3.setText(r0);
        r2.setVisibility(r9);
        r0 = new ly.pp.addsongs.ig;
        r0.<init>(r13, r6, r15, r14);
        r3.setOnClickListener(r0);
    L_0x00b9:
        r3.setVisibility(r9);
        r0 = new ly.pp.addsongs.ii;
        r0.<init>(r13, r6, r15, r14);
        r2.setOnClickListener(r0);
        r0 = r6;
        return r0;
        r7 = r15.mo3385a();
        r8 = r14.f4531o;
        r8 = r8.mo2702Q();
        r7 = r7.equals(r8);
        if (r7 == 0) goto L_0x00fd;
    L_0x00d6:
        r7 = r15.mo3403n();
        if (r7 <= 0) goto L_0x00fb;
    L_0x00dc:
        r7 = r15.mo3403n();
        if (r7 > r12) goto L_0x00fb;
    L_0x00e2:
        r5 = r13.f5622n;
        r7 = r15.mo3403n();
        r7 = r7 + -1;
        r5 = r5[r7];
        r4.setText(r5);
        r0.setVisibility(r9);
        r1.setVisibility(r9);
        r2.setVisibility(r9);
        r3.setVisibility(r9);
    L_0x00fb:
        r0 = r5;
        goto L_0x00b9;
    L_0x00fd:
        r5 = r15.mo3403n();
        if (r5 <= 0) goto L_0x0144;
    L_0x0103:
        r5 = r15.mo3403n();
        if (r5 > r12) goto L_0x0144;
    L_0x0109:
        r5 = r13.f5622n;
        r7 = r15.mo3403n();
        r7 = r7 + -1;
        r5 = r5[r7];
        r4.setText(r5);
    L_0x0116:
        r4 = r15.mo3393d();
        r5 = r14.f4527k;
        r4 = r4.equals(r5);
        if (r4 != 0) goto L_0x012e;
    L_0x0122:
        r4 = r15.mo3393d();
        r5 = r14.f4526j;
        r4 = r4.equals(r5);
        if (r4 == 0) goto L_0x0148;
    L_0x012e:
        r1.setVisibility(r9);
        r0.setVisibility(r9);
        r0 = r14.f4533q;
        r1 = "H";
        r0 = r0.equals(r1);
        r2.setVisibility(r9);
        r3.setVisibility(r9);
        goto L_0x00b9;
    L_0x0144:
        r4.setVisibility(r9);
        goto L_0x0116;
    L_0x0148:
        r4 = new ly.pp.addsongs.ie;
        r4.<init>(r13, r6, r15, r14);
        r0.setOnClickListener(r4);
        r0 = new ly.pp.addsongs.if;
        r0.<init>(r13, r6, r14, r15);
        r1.setOnClickListener(r0);
        goto L_0x008b;
        */
        throw new UnsupportedOperationException("Method not decompiled: ly.pp.addsongs.ib.a(ly.pp.addsongs.ib, ly.pp.addsongs.OLPlayRoom, ly.pp.addsongs.jx):android.widget.PopupWindow");
    }

    public final int getCount() {
        return this.f5609a;
    }

    public final Object getItem(int i) {
        return Integer.valueOf(i);
    }

    public final long getItemId(int i) {
        return (long) i;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        TextView textView;
        if (view == null) {
            view = this.f5613e.inflate(R.layout.ol_player_view, null);
        }
        view.setKeepScreenOn(true);
        String string = ((Bundle) this.f5610b.get(i)).getString("N");
        String string2 = ((Bundle) this.f5610b.get(i)).getString("S");
        String str = !string2.equals("m") ? "f" : string2;
        byte b = ((Bundle) this.f5610b.get(i)).getByte("PI");
        String string3 = ((Bundle) this.f5610b.get(i)).getString("IR");
        String string4 = ((Bundle) this.f5610b.get(i)).getString("IH");
        int i2 = ((Bundle) this.f5610b.get(i)).getInt("IV");
        ImageView imageView = (ImageView) view.findViewById(R.id.ol_player_mod);
        imageView.setOnClickListener(new C1204ij(this, b, imageView));
        TextView textView2 = (TextView) view.findViewById(R.id.ol_ready_text);
        ImageView imageView2 = (ImageView) view.findViewById(R.id.ol_player_trousers);
        ImageView imageView3 = (ImageView) view.findViewById(R.id.ol_player_jacket);
        ImageView imageView4 = (ImageView) view.findViewById(R.id.ol_player_shoes);
        ImageView imageView5 = (ImageView) view.findViewById(R.id.ol_player_hair);
        ImageView imageView6 = (ImageView) view.findViewById(R.id.ol_player_couple);
        int i3 = ((Bundle) this.f5610b.get(i)).getInt("LV");
        int i4 = ((Bundle) this.f5610b.get(i)).getInt("CL");
        int i5 = ((Bundle) this.f5610b.get(i)).getInt("CP");
        if (i5 >= 0 && i5 <= 3) {
            imageView6.setImageResource(this.f5619k[i5]);
        }
        TextView textView3 = (TextView) view.findViewById(R.id.ol_player_level);
        TextView textView4 = (TextView) view.findViewById(R.id.ol_player_class);
        TextView textView5 = (TextView) view.findViewById(R.id.ol_player_clname);
        if (string != null && string.equals(this.f5612d.f4531o.mo2702Q())) {
            this.f5612d.f4533q = string4;
            if (this.f5612d.mo2871g() == 2) {
                this.f5612d.mo2859a((((Bundle) this.f5610b.get(i)).getInt("GR") + 12) % 2);
            } else if (this.f5612d.mo2871g() == 0) {
                this.f5612d.mo2859a(((Bundle) this.f5610b.get(i)).getInt("GR"));
            }
            this.f5612d.f4528l = (C1245jx) this.f5612d.f4531o.mo2700O().get(Byte.valueOf(b));
            if (this.f5612d.f4533q.equals("H")) {
                this.f5612d.f4535s.setText("开始");
                this.f5612d.f4533q = "H";
            } else {
                if (string3.equals("R")) {
                    this.f5612d.f4535s.setText("取消准备");
                } else {
                    this.f5612d.f4535s.setText("准备");
                }
                this.f5612d.f4533q = "G";
            }
        }
        if (!string4.equals(this.f5612d.f4524h)) {
            if (!string4.equals(this.f5612d.f4525i)) {
                if (!string4.equals(this.f5612d.f4526j)) {
                    string4.equals(this.f5612d.f4527k);
                }
            } else if (string3.equals("R")) {
                textView2.setText("准备");
                textView2.setBackgroundColor(this.f5612d.getResources().getColor(R.color.online));
            } else if (string3.equals("N")) {
                textView2.setText("");
                textView2.setBackgroundColor(this.f5612d.getResources().getColor(R.color.online));
            } else if (string3.equals("P")) {
                textView2.setText("弹奏中");
                textView2.setBackgroundColor(this.f5612d.getResources().getColor(R.color.online));
            } else if (string3.equals("F")) {
                textView2.setText("查看成绩");
                textView2.setBackgroundColor(this.f5612d.getResources().getColor(R.color.online));
            }
        } else if (string3.equals("P")) {
            textView2.setText("弹奏中");
            textView2.setBackgroundColor(this.f5612d.getResources().getColor(R.color.online));
        } else if (string3.equals("F")) {
            textView2.setText("查看成绩");
            textView2.setBackgroundColor(this.f5612d.getResources().getColor(R.color.online));
        } else {
            textView2.setText("房主");
            textView2.setBackgroundColor(this.f5612d.getResources().getColor(R.color.exit));
        }
        try {
            if (!string4.equals(this.f5612d.f4525i)) {
                if (!string4.equals(this.f5612d.f4524h)) {
                    if (string4.equals(this.f5612d.f4526j)) {
                        imageView.setImageBitmap(BitmapFactory.decodeStream(this.f5612d.getResources().getAssets().open("mod/_none.png")));
                    } else {
                        if (string4.equals(this.f5612d.f4527k)) {
                            imageView.setImageBitmap(BitmapFactory.decodeStream(this.f5612d.getResources().getAssets().open("mod/_close.png")));
                        }
                    }
                    textView2 = (TextView) view.findViewById(R.id.ol_player_name);
                    textView2.setText(string);
                    if (this.f5612d.mo2871g() != 2 && !string.equals("") && ((Bundle) this.f5610b.get(i)).getInt("GR") > 0) {
                        textView = (TextView) view.findViewById(R.id.ol_player_hand);
                        textView.setText(this.f5620l[((Bundle) this.f5610b.get(i)).getInt("GR") % 2]);
                        textView.setBackgroundResource(this.f5618j[((Bundle) this.f5610b.get(i)).getInt("GR") - 1]);
                    } else if (this.f5612d.mo2871g() != 1 && !string.equals("") && ((Bundle) this.f5610b.get(i)).getInt("GR") > 0) {
                        textView = (TextView) view.findViewById(R.id.ol_player_hand);
                        textView.setText(this.f5621m[((Bundle) this.f5610b.get(i)).getInt("GR") - 1]);
                        textView.setBackgroundResource(this.f5617i[((Bundle) this.f5610b.get(i)).getInt("GR") - 1]);
                    } else if (this.f5612d.mo2871g() == 0 && !string.equals("") && ((Bundle) this.f5610b.get(i)).getInt("GR") >= 0) {
                        textView = (TextView) view.findViewById(R.id.ol_player_hand);
                        textView.setText(this.hand[(((Bundle) this.f5610b.get(i)).getInt("GR") + 12) % 2]);
                        this.f5612d.f4534r.setText(new StringBuilder(this.f5620l[(((Bundle) this.f5610b.get(i)).getInt("GR") + 12) % 2]).append(this.f5612d.getdiao()).toString());
                        textView.setBackgroundResource(this.f5617i[0]);
                    }
                    textView2.setBackgroundResource(this.f5615g[i2]);
                    imageView.setBackgroundResource(this.f5616h[i2]);
                    return view;
                }
            }
            int i6 = ((Bundle) this.f5610b.get(i)).getInt("TR") - 1;
            int i7 = ((Bundle) this.f5610b.get(i)).getInt("JA") - 1;
            int i8 = ((Bundle) this.f5610b.get(i)).getInt("HA") - 1;
            int i9 = ((Bundle) this.f5610b.get(i)).getInt("SH") - 1;
            textView3.setText("LV." + i3);
            textView4.setText("CL." + i4);
            textView4.setTextColor(this.f5612d.getResources().getColor(C1194i.f5606j[i4]));
            textView5.setText(C1194i.f5602f[i4]);
            textView5.setTextColor(this.f5612d.getResources().getColor(C1194i.f5606j[i4]));
            imageView.setImageBitmap(BitmapFactory.decodeStream(this.f5612d.getResources().getAssets().open("mod/" + str + "_m0.png")));
            if (i6 < 0) {
                imageView2.setImageBitmap(BitmapFactory.decodeStream(this.f5612d.getResources().getAssets().open("mod/_none.png")));
            } else {
                imageView2.setImageBitmap(BitmapFactory.decodeStream(this.f5612d.getResources().getAssets().open("mod/" + str + "_t" + i6 + ".png")));
            }
            if (i7 < 0) {
                imageView3.setImageBitmap(BitmapFactory.decodeStream(this.f5612d.getResources().getAssets().open("mod/_none.png")));
            } else {
                imageView3.setImageBitmap(BitmapFactory.decodeStream(this.f5612d.getResources().getAssets().open("mod/" + str + "_j" + i7 + ".png")));
            }
            if (i9 < 0) {
                imageView4.setImageBitmap(BitmapFactory.decodeStream(this.f5612d.getResources().getAssets().open("mod/_none.png")));
            } else {
                imageView4.setImageBitmap(BitmapFactory.decodeStream(this.f5612d.getResources().getAssets().open("mod/" + str + "_s" + i9 + ".png")));
            }
            if (i8 < 0) {
                imageView5.setImageBitmap(BitmapFactory.decodeStream(this.f5612d.getResources().getAssets().open("mod/_none.png")));
            } else {
                imageView5.setImageBitmap(BitmapFactory.decodeStream(this.f5612d.getResources().getAssets().open("mod/" + str + "_h" + i8 + ".png")));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        textView2 = (TextView) view.findViewById(R.id.ol_player_name);
        textView2.setText(string);
        if (this.f5612d.mo2871g() != 2) {
        }
        if (this.f5612d.mo2871g() != 1) {
        }
        textView = (TextView) view.findViewById(R.id.ol_player_hand);
        textView.setText(this.hand[(((Bundle) this.f5610b.get(i)).getInt("GR") + 12) % 2]);
        this.f5612d.f4534r.setText(new StringBuilder(this.f5620l[(((Bundle) this.f5610b.get(i)).getInt("GR") + 12) % 2]).append(this.f5612d.getdiao()).toString());
        textView.setBackgroundResource(this.f5617i[0]);
        textView2.setBackgroundResource(this.f5615g[i2]);
        imageView.setBackgroundResource(this.f5616h[i2]);
        return view;
    }
}
