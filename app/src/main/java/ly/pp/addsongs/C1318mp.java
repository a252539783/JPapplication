package ly.pp.addsongs;

import android.os.AsyncTask;
import android.widget.Toast;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.json.JSONArray;
import org.json.JSONObject;


/* renamed from: ly.pp.addsongs.mp */
public final class C1318mp extends AsyncTask {
    /* renamed from: a */
    final /* synthetic */ SoundDownload f5969a;

    public C1318mp(SoundDownload soundDownload) {
        this.f5969a = soundDownload;
    }

    /* renamed from: a */
    protected String doInBackground(String... strArr) {
        String str = "";
        try {
            this.f5969a.mo3004a();
            HttpUriRequest httpPost = new HttpPost("http://121.199.31.116:8910/JustPianoServer/server/GetSoundList");
            List arrayList = new ArrayList();
            arrayList.add(new BasicNameValuePair("head", strArr[0]));
            arrayList.add(new BasicNameValuePair("version", this.f5969a.f5030a.mo2695K()));
            arrayList.add(new BasicNameValuePair("keywords", strArr[1]));
            arrayList.add(new BasicNameValuePair("sound", strArr[2]));
            ((HttpPost) httpPost).setEntity(new UrlEncodedFormEntity(arrayList, "UTF-8"));
            DefaultHttpClient defaultHttpClient = new DefaultHttpClient();
            defaultHttpClient.getParams().setParameter("http.connection.timeout", Integer.valueOf(10000));
            defaultHttpClient.getParams().setParameter("http.socket.timeout", Integer.valueOf(10000));
            HttpResponse execute = defaultHttpClient.execute(httpPost);
            if (execute.getStatusLine().getStatusCode() != 200) {
                return str;
            }
            str = EntityUtils.toString(execute.getEntity());
            //"backmsg:" + str;
            return str;
        } catch (ClientProtocolException e) {
            e.printStackTrace();
            return str;
        } catch (IOException e2) {
            e2.printStackTrace();
            return str;
        }
    }

    protected final void onCancelled() {
        super.onCancelled();
    }

    protected final /* synthetic */ void onPostExecute(Object obj) {
        String str = (String) obj;
        super.onPostExecute(str);
        if (str.equals("")) {
            this.f5969a.f5035f.setAdapter(new C1320mr(this.f5969a, new JSONArray()));
            Toast.makeText(this.f5969a.f5030a, "网络不给力,无法连接到服务器.", Toast.LENGTH_LONG).show();
            this.f5969a.f5033d.dismiss();
            return;
        }
        try {
            this.f5969a.f5035f.setAdapter(new C1320mr(this.f5969a, new JSONArray(C1340nk.m4156b(new JSONObject(str).getString("L")))));
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.f5969a.f5033d.dismiss();
    }

    @Override
    protected Object doInBackground(Object[] objects) {
        return null;
    }

    protected final void onPreExecute() {
        super.onPreExecute();
        this.f5969a.f5033d.setCancelable(true);
        this.f5969a.f5033d.setOnCancelListener(new C1319mq(this));
        this.f5969a.f5033d.show();
    }

    protected final /* bridge */ /* synthetic */ void onProgressUpdate(Object... objArr) {
        super.onProgressUpdate(new Object[]{(Integer[]) objArr[0]});
    }
}
