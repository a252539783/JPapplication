package ly.pp.addsongs;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import java.util.List;

/* renamed from: ly.pp.addsongs.cd */
public final class C1036cd extends BaseAdapter {
    /* renamed from: a */
    int f5251a = 0;
    /* renamed from: b */
    List f5252b = null;
    /* renamed from: c */
    JPApplication f5253c;
    /* renamed from: d */
    int f5254d = 0;
    /* renamed from: e */
    Activity f5255e;
    /* renamed from: f */
    public ConnectionService f5256f;

    public C1036cd(List list, JPApplication jPApplication, int i, Activity activity) {
        this.f5251a = list.size();
        this.f5252b = list;
        this.f5253c = jPApplication;
        this.f5256f = jPApplication.mo2697M();
        this.f5254d = i;
        if (activity instanceof OLPlayHall) {
            C1268kt.m4107a();
            this.f5255e = (OLPlayHall) C1268kt.m4109b();
        } else if (activity instanceof OLPlayRoom) {
            C1268kt.m4107a();
            this.f5255e = (OLPlayRoom) C1268kt.m4109b();
        } else if (activity instanceof OLPlayHallRoom) {
            C1268kt.m4107a();
            this.f5255e = (OLPlayHallRoom) C1268kt.m4109b();
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m3978a(C1036cd c1036cd, byte b) {
        View inflate = c1036cd.f5255e.getLayoutInflater().inflate(R.layout.message_send, (ViewGroup) c1036cd.f5255e.findViewById(R.id.dialog));
        TextView textView = (TextView) inflate.findViewById(R.id.text_2);
        TextView textView2 = (TextView) inflate.findViewById(R.id.title_1);
        ((TextView) inflate.findViewById(R.id.text_1)).setVisibility(View.GONE);
        textView2.setVisibility(View.GONE);
        textView.setSingleLine(true);
        new C1302m(c1036cd.f5255e).mo3539b("输入密码").mo3534a(inflate).mo3536a("确定", new C1042cj(c1036cd, textView, b)).mo3540b("取消", new C1043ck(c1036cd)).mo3541c();
    }

    /* renamed from: a */
    public final void mo3119a(List list) {
        this.f5252b = list;
        this.f5251a = this.f5252b.size();
    }

    public final int getCount() {
        return this.f5251a;
    }

    public final Object getItem(int i) {
        return Integer.valueOf(i);
    }

    public final long getItemId(int i) {
        return (long) i;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        boolean z = true;
        int i2;
        int i3;
        TextView textView;
        RelativeLayout relativeLayout;
        RelativeLayout relativeLayout2;
        Button button;
        int i4;
        switch (this.f5254d) {
            case 0:
                if (view == null && this.f5255e != null) {
                    view = LayoutInflater.from(this.f5255e).inflate(R.layout.ol_hall_view, null);
                }
                view.setKeepScreenOn(true);
                CharSequence string = ((Bundle) this.f5252b.get(i)).getString("N");
                byte b = ((Bundle) this.f5252b.get(i)).getByte("I");
                i2 = ((Bundle) this.f5252b.get(i)).getInt("PN");
                i3 = ((Bundle) this.f5252b.get(i)).getInt("TN");
                if (i2 < i3) {
                    z = false;
                }
                ((TextView) view.findViewById(R.id.ol_hall_name)).setText(string);
                ((TextView) view.findViewById(R.id.ol_hall_pnums)).setText(new StringBuilder(String.valueOf(i2)).append("/").append(i3).toString());
                textView = (TextView) view.findViewById(R.id.ol_getin_text);
                if (z) {
                    textView.setText("已满");
                } else {
                    textView.setText("进入");
                }
                view.setOnClickListener(new C1037ce(this, i, b));
                break;
            case 1:
                if (view == null) {
                    view = LayoutInflater.from(this.f5255e).inflate(R.layout.ol_friend_view, null);
                }
                view.setKeepScreenOn(true);
                String string2 = ((Bundle) this.f5252b.get(i)).getString("F");
                i3 = ((Bundle) this.f5252b.get(i)).getInt("O");
                String string3 = ((Bundle) this.f5252b.get(i)).getString("S");
                int i5 = ((Bundle) this.f5252b.get(i)).getInt("LV");
                relativeLayout = (RelativeLayout) view.findViewById(R.id.ol_friend_bar);
                relativeLayout2 = (RelativeLayout) view.findViewById(R.id.ol_friend_drop);
                relativeLayout2.setVisibility(View.GONE);
                relativeLayout.setOnClickListener(new C1044cl(this, relativeLayout2));
                button = (Button) view.findViewById(R.id.ol_friend_chat);
                ((TextView) view.findViewById(R.id.ol_friend_room)).setVisibility(View.GONE);
                Button button2 = (Button) view.findViewById(R.id.ol_friend_game);
                TextView textView2 = (TextView) view.findViewById(R.id.ol_friend_name);
                ImageView imageView = (ImageView) view.findViewById(R.id.ol_friend_sex);
                if (string3.equals("f")) {
                    imageView.setImageResource(R.drawable.f);
                } else {
                    imageView.setImageResource(R.drawable.m);
                }
                ((TextView) view.findViewById(R.id.ol_friend_level)).setText("LV." + i5);
                textView2.setText(string2);
                if (i3 == 0) {
                    textView2.setTextColor(this.f5253c.getResources().getColor(R.color.white));
                    button2.setTextColor(this.f5253c.getResources().getColor(R.color.white));
                    button.setTextColor(this.f5253c.getResources().getColor(R.color.white));
                } else {
                    textView2.setTextColor(this.f5253c.getResources().getColor(R.color.white1));
                    button2.setTextColor(this.f5253c.getResources().getColor(R.color.white1));
                    button.setTextColor(this.f5253c.getResources().getColor(R.color.white1));
                    button2.setOnClickListener(new C1045cm(this, relativeLayout2, string2));
                    button.setOnClickListener(new C1046cn(this, relativeLayout2, i3, string2));
                }
                ((Button) view.findViewById(R.id.ol_friend_send)).setOnClickListener(new C1047co(this, relativeLayout2, string2));
                ((Button) view.findViewById(R.id.ol_friend_dele)).setOnClickListener(new C1048cp(this, relativeLayout2, i, string2));
                break;
            case 2:
                if (view == null) {
                    view = LayoutInflater.from(this.f5255e).inflate(R.layout.ol_mail_view, null);
                }
                view.setKeepScreenOn(true);
                if (this.f5252b.size() > i) {
                    Object string4 = ((Bundle) this.f5252b.get(i)).getString("F");
                    CharSequence string5 = ((Bundle) this.f5252b.get(i)).getString("T");
                    CharSequence string6 = ((Bundle) this.f5252b.get(i)).getString("M");
                    i4 = 0;
                    if (((Bundle) this.f5252b.get(i)).containsKey("type")) {
                        i4 = ((Bundle) this.f5252b.get(i)).getInt("type");
                    }
                    textView = (TextView) view.findViewById(R.id.fromTo);
                    if (i4 == 0) {
                        textView.setText("From:");
                    } else if (i4 == 1) {
                        textView.setText("To:");
                    }
                    button = (Button) view.findViewById(R.id.mail_send);
                    Button button3 = (Button) view.findViewById(R.id.mail_dele);
                    ((TextView) view.findViewById(R.id.ol_from_user)).setText((CharSequence) string4);
                    TextView textView3 = (TextView) view.findViewById(R.id.ol_mail_msg);
                    if (string6.equals("")) {
                        textView3.setText(new StringBuilder(String.valueOf(string4)).append(" 请求加你为好友").toString());
                        button.setText("同意");
                    } else {
                        textView3.setText(string6);
                        button.setText("回复");
                    }
                    ((TextView) view.findViewById(R.id.ol_mail_time)).setText(string5);
                    button.setOnClickListener(new C1049cq(this, (String)string6, (String)string4, i));
                    button3.setOnClickListener(new C1050cr(this, i));
                    break;
                }
                break;
            case 3:
                if (view == null) {
                    view = LayoutInflater.from(this.f5255e).inflate(R.layout.ol_friend_view, null);
                }
                view.setKeepScreenOn(true);
                String string7 = ((Bundle) this.f5252b.get(i)).getString("U");
                String string8 = ((Bundle) this.f5252b.get(i)).getString("S");
                i2 = ((Bundle) this.f5252b.get(i)).getInt("LV");
                i4 = ((Bundle) this.f5252b.get(i)).getInt("R");
                relativeLayout = (RelativeLayout) view.findViewById(R.id.ol_friend_bar);
                relativeLayout2 = (RelativeLayout) view.findViewById(R.id.ol_friend_drop);
                relativeLayout2.setVisibility(View.GONE);
                relativeLayout.setOnClickListener(new C1051cs(this, relativeLayout2));
                textView = (TextView) view.findViewById(R.id.ol_friend_room);
                if (i4 == 0) {
                    textView.setText("大厅");
                } else {
                    textView.setText(new StringBuilder(String.valueOf(i4)).append("房").toString());
                }
                button = (Button) view.findViewById(R.id.ol_friend_chat);
                ImageView imageView2 = (ImageView) view.findViewById(R.id.ol_friend_sex);
                if (string8.equals("f")) {
                    imageView2.setImageResource(R.drawable.f);
                } else {
                    imageView2.setImageResource(R.drawable.m);
                }
                ((TextView) view.findViewById(R.id.ol_friend_level)).setText("LV." + i2);
                button.setOnClickListener(new C1038cf(this, relativeLayout2, string7));
                textView = (TextView) view.findViewById(R.id.ol_friend_game);
                if (this.f5255e instanceof OLPlayHall) {
                    textView.setText("找TA");
                    textView.setOnClickListener(new C1039cg(this, relativeLayout2, string7));
                } else if (this.f5255e instanceof OLPlayRoom) {
                    textView.setText("邀请");
                    textView.setOnClickListener(new C1040ch(this, relativeLayout2, string7));
                }
                ((TextView) view.findViewById(R.id.ol_friend_name)).setText(string7);
                ((Button) view.findViewById(R.id.ol_friend_send)).setVisibility(View.INVISIBLE);
                button = (Button) view.findViewById(R.id.ol_friend_dele);
                button.setText("加为好友");
                button.setOnClickListener(new C1041ci(this, relativeLayout2, string7));
                break;
        }
        return view;
    }
}
