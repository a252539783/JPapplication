package ly.pp.addsongs;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;

/* renamed from: ly.pp.addsongs.mu */
public final class C1323mu extends Thread {
    /* renamed from: a */
    final /* synthetic */ SoundDownload f5980a;
    /* renamed from: b */
    private String f5981b = "";

    public C1323mu(SoundDownload soundDownload, String str) {
        this.f5980a = soundDownload;
        this.f5981b = str.substring(str.lastIndexOf(47) + 1, str.lastIndexOf(46));
    }

    /* renamed from: run */
    public final void run() {
        try {
            HttpUriRequest httpPost = new HttpPost("http://121.199.31.116:8910/JustPianoServer/server/DownloadSound");
            List arrayList = new ArrayList();
            arrayList.add(new BasicNameValuePair("version", this.f5980a.f5030a.mo2695K()));
            arrayList.add(new BasicNameValuePair("path", this.f5981b));
            ((HttpPost) httpPost).setEntity(new UrlEncodedFormEntity(arrayList, "UTF-8"));
            DefaultHttpClient defaultHttpClient = new DefaultHttpClient();
            defaultHttpClient.getParams().setParameter("http.connection.timeout", Integer.valueOf(10000));
            defaultHttpClient.getParams().setParameter("http.socket.timeout", Integer.valueOf(10000));
            defaultHttpClient.execute(httpPost);
        } catch (ClientProtocolException e) {
            e.printStackTrace();
        } catch (IOException e2) {
            e2.printStackTrace();
        }
    }
}
