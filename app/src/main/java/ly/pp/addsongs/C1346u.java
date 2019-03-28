package ly.pp.addsongs;

import android.app.Activity;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;


/* renamed from: ly.pp.addsongs.u */
public final class C1346u extends Thread {
    /* renamed from: a */
    String f6041a = "F";
    /* renamed from: b */
    String f6042b = "";
    /* renamed from: c */
    String f6043c = "";
    /* renamed from: d */
    private JPApplication f6044d;

    public C1346u(Activity activity, Long l, String str, String str2) {
        this.f6044d = (JPApplication) activity.getApplication();
        this.f6042b = String.valueOf(l);
        this.f6043c = str2;
        this.f6041a = str;
    }

    /* renamed from: run */
    public final void run() {
        if (!this.f6043c.equals("")) {
            HttpUriRequest httpPost = new HttpPost("http://121.199.31.116:8910/JustPianoServer/server/AcceptFavorIn");
            List arrayList = new ArrayList();
            arrayList.add(new BasicNameValuePair("version", this.f6044d.mo2695K()));
            arrayList.add(new BasicNameValuePair("type", this.f6041a));
            arrayList.add(new BasicNameValuePair("songID", this.f6042b));
            arrayList.add(new BasicNameValuePair("user", this.f6043c));
            try {
                ((HttpPost) httpPost).setEntity(new UrlEncodedFormEntity(arrayList, "UTF-8"));
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
            try {
                new DefaultHttpClient().execute(httpPost);
            } catch (ClientProtocolException e2) {
                e2.printStackTrace();
            } catch (IOException e3) {
                e3.printStackTrace();
            }
        }
    }
}
