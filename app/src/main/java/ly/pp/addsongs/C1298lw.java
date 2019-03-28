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


/* renamed from: ly.pp.addsongs.lw */
public final class C1298lw extends AsyncTask {
    /* renamed from: a */
    final /* synthetic */ SkinDownload f5915a;

    public C1298lw(SkinDownload skinDownload) {
        this.f5915a = skinDownload;
    }

    /* renamed from: a */
    protected String doInBackground(String... strArr) {
        try {
            this.f5915a.mo2991a();
            HttpUriRequest httpPost = new HttpPost("http://121.199.31.116:8910/JustPianoServer/server/GetSkinList");
            List arrayList = new ArrayList();
            arrayList.add(new BasicNameValuePair("head", strArr[0]));
            arrayList.add(new BasicNameValuePair("version", this.f5915a.f5005a.mo2695K()));
            arrayList.add(new BasicNameValuePair("keywords", strArr[1]));
            arrayList.add(new BasicNameValuePair("skin", strArr[2]));
            ((HttpPost) httpPost).setEntity(new UrlEncodedFormEntity(arrayList, "UTF-8"));
            DefaultHttpClient defaultHttpClient = new DefaultHttpClient();
            defaultHttpClient.getParams().setParameter("http.connection.timeout", Integer.valueOf(10000));
            defaultHttpClient.getParams().setParameter("http.socket.timeout", Integer.valueOf(10000));
            HttpResponse execute = defaultHttpClient.execute(httpPost);
            if (execute.getStatusLine().getStatusCode() != 200) {
                return "err001";
            }
            String entityUtils = EntityUtils.toString(execute.getEntity());
            //"backmsg:" + entityUtils;
            return entityUtils;
        } catch (ClientProtocolException e) {
            e.printStackTrace();
            return "err001";
        } catch (IOException e2) {
            e2.printStackTrace();
            return "err001";
        }
    }

    protected final void onCancelled() {
        super.onCancelled();
    }

    protected final /* synthetic */ void onPostExecute(Object obj) {
        String str = (String) obj;
        super.onPostExecute(str);
        if (str.equals("err001")) {
            this.f5915a.f5010f.setAdapter(new C1300ly(this.f5915a, new JSONArray()));
            Toast.makeText(this.f5915a.f5005a, "网络不给力,无法连接到服务器.", Toast.LENGTH_LONG).show();
            this.f5915a.f5008d.dismiss();
            return;
        }
        try {
            this.f5915a.f5010f.setAdapter(new C1300ly(this.f5915a, new JSONArray(C1340nk.m4156b(new JSONObject(str).getString("L")))));
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.f5915a.f5008d.dismiss();
    }

    @Override
    protected Object doInBackground(Object[] objects) {
        return null;
    }

    protected final void onPreExecute() {
        super.onPreExecute();
        this.f5915a.f5008d.setCancelable(true);
        this.f5915a.f5008d.setOnCancelListener(new C1299lx(this));
        this.f5915a.f5008d.show();
    }

    protected final /* bridge */ /* synthetic */ void onProgressUpdate(Object... objArr) {
        super.onProgressUpdate(new Object[]{(Integer[]) objArr[0]});
    }
}
