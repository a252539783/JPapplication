package ly.pp.addsongs;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: ly.pp.addsongs.fs */
final class C1132fs implements OnClickListener {
    /* renamed from: a */
    final /* synthetic */ OLPlayHallRoom f5457a;
    /* renamed from: b */
    private final /* synthetic */ TextView f5458b;
    /* renamed from: c */
    private final /* synthetic */ int f5459c;
    /* renamed from: d */
    private final /* synthetic */ String f5460d;

    C1132fs(OLPlayHallRoom oLPlayHallRoom, TextView textView, int i, String str) {
        this.f5457a = oLPlayHallRoom;
        this.f5458b = textView;
        this.f5459c = i;
        this.f5460d = str;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        String valueOf = String.valueOf(this.f5458b.getText());
        JSONObject jSONObject = new JSONObject();
        try {
            if (valueOf.equals("")) {
                Toast.makeText(this.f5457a, "请输入内容！", Toast.LENGTH_SHORT).show();
            } else if (valueOf.length() > 1600) {
                Toast.makeText(this.f5457a, "确定在一百字之内！", Toast.LENGTH_SHORT).show();
            } else if (this.f5459c == 0 && !this.f5460d.equals("")) {
                jSONObject.put("T", this.f5460d);
                jSONObject.put("M", valueOf);
                this.f5457a.f4475z.mo2676a((byte) 35, (byte) 0, (byte) 0, jSONObject.toString(), null);
                this.f5457a.f4473x.clear();
                String format = SimpleDateFormat.getDateInstance(2, Locale.CHINESE).format(new Date());
                Bundle bundle = new Bundle();
                bundle.putString("F", this.f5460d);
                bundle.putString("M", valueOf);
                bundle.putString("T", format);
                bundle.putInt("type", 1);
                this.f5457a.f4473x.add(bundle);
                format = this.f5457a.f4432V.getString("mailsString", "[]");
                //"localMails:" + format;
                try {
                    JSONArray jSONArray = new JSONArray(format);
                    int length = jSONArray.length();
                    for (int i2 = 0; i2 < length; i2++) {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                        Bundle bundle2 = new Bundle();
                        if (jSONObject2.has("type")) {
                            bundle2.putInt("type", jSONObject2.getInt("type"));
                        }
                        bundle2.putString("F", jSONObject2.getString("F"));
                        bundle2.putString("M", jSONObject2.getString("M"));
                        bundle2.putString("T", jSONObject2.getString("T"));
                        this.f5457a.f4473x.add(bundle2);
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                this.f5457a.mo2848c();
                this.f5457a.mo2849c(this.f5457a.f4474y, this.f5457a.f4473x);
            } else if (this.f5459c == 1) {
                jSONObject.put("T", 4);
                jSONObject.put("M", valueOf);
                this.f5457a.f4456at.setText("祝语:\n" + valueOf);
                this.f5457a.f4475z.mo2676a((byte) 31, (byte) 0, (byte) 0, jSONObject.toString(), null);
            }
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }
}
