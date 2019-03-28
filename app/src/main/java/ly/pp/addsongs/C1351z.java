package ly.pp.addsongs;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: ly.pp.addsongs.z */
final class C1351z extends BaseAdapter {
    /* renamed from: a */
    int f6054a = 0;
    /* renamed from: b */
    ArrayList f6055b;
    /* renamed from: c */
    WeakReference f6056c;
    /* renamed from: d */
    FriendMailPage f6057d;
    /* renamed from: e */
    final /* synthetic */ FriendMailPage f6058e;

    public C1351z(FriendMailPage friendMailPage, ArrayList arrayList, FriendMailPage friendMailPage2) {
        this.f6058e = friendMailPage;
        this.f6055b = arrayList;
        this.f6054a = arrayList.size();
        this.f6056c = new WeakReference(friendMailPage2);
        this.f6057d = (FriendMailPage) this.f6056c.get();
    }

    /* renamed from: a */
    public final void mo3634a(ArrayList arrayList) {
        this.f6055b = arrayList;
        this.f6054a = arrayList.size();
    }

    public final int getCount() {
        return this.f6054a;
    }

    public final Object getItem(int i) {
        return Integer.valueOf(i);
    }

    public final long getItemId(int i) {
        return (long) i;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        JSONObject jSONObject;
        TextView textView;
        TextView textView2;
        Button button;
        Button button2;
        if (this.f6058e.f4024f.equals("F")) {
            if (view == null) {
                view = this.f6058e.getLayoutInflater().inflate(R.layout.friend_view, null);
            }
            jSONObject = (JSONObject) this.f6055b.get(i);
            textView = (TextView) view.findViewById(R.id.friend_name);
            textView2 = (TextView) view.findViewById(R.id.friend_level);
            ImageView imageView = (ImageView) view.findViewById(R.id.friend_sex);
            button = (Button) view.findViewById(R.id.friend_info);
            button2 = (Button) view.findViewById(R.id.friend_dele);
            Button button3 = (Button) view.findViewById(R.id.friend_send);
            try {
                String string = jSONObject.getString("N");
                textView.setText(string);
                textView2.setText("LV." + jSONObject.getInt("L"));
                if (jSONObject.getString("S").equals("f")) {
                    imageView.setImageResource(R.drawable.f);
                } else {
                    imageView.setImageResource(R.drawable.m);
                }
                button.setOnClickListener(new C0979aa(this, i, string));
                button2.setOnClickListener(new C0980ab(this, i, string));
                button3.setOnClickListener(new C0981ac(this, i, string));
            } catch (JSONException e) {
                e.printStackTrace();
            }
        } else if (this.f6058e.f4024f.equals("M")) {
            if (view == null) {
                view = this.f6058e.getLayoutInflater().inflate(R.layout.ol_mail_view, null);
            }
            jSONObject = (JSONObject) this.f6055b.get(i);
            textView = (TextView) view.findViewById(R.id.ol_from_user);
            textView2 = (TextView) view.findViewById(R.id.ol_mail_msg);
            TextView textView3 = (TextView) view.findViewById(R.id.ol_mail_time);
            button = (Button) view.findViewById(R.id.mail_send);
            button2 = (Button) view.findViewById(R.id.mail_dele);
            try {
                String string2 = jSONObject.getString("F");
                CharSequence string3 = jSONObject.getString("M");
                int i2 = jSONObject.has("type") ? jSONObject.getInt("type") : 0;
                TextView textView4 = (TextView) view.findViewById(R.id.fromTo);
                if (i2 == 0) {
                    textView4.setText("From:");
                } else if (i2 == 1) {
                    textView4.setText("To:");
                }
                CharSequence string4 = jSONObject.getString("T");
                textView.setText(string2);
                if (string3.equals("")) {
                    textView2.setText(new StringBuilder(String.valueOf(string2)).append(" 请求加你为好友").toString());
                    button.setText("同意");
                } else {
                    textView2.setText(string3);
                    button.setText("回复");
                }
                button.setOnClickListener(new C0982ad(this, i, string2, (String)string3));
                textView3.setText(string4);
                button2.setOnClickListener(new C0983ae(this, i, string2));
                textView.setOnClickListener(new C0984af(this, i, string2));
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
        return view;
    }
}
