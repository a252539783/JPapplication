package ly.pp.addsongs;

import android.os.AsyncTask;
import android.widget.ListView;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.HttpResponse;
import org.apache.http.ParseException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;


/* renamed from: ly.pp.addsongs.x */
public final class C1349x extends AsyncTask {
    /* renamed from: a */
    final /* synthetic */ FriendMailPage f6052a;

    public C1349x(FriendMailPage friendMailPage) {
        this.f6052a = friendMailPage;
    }

    /* renamed from: a */
    protected String doInBackground(String... strArr) {
        String str = "";
        if (this.f6052a.f4024f.equals("")) {
            return str;
        }
        HttpUriRequest httpPost = new HttpPost("http://121.199.31.116:8910/JustPianoServer/server/" + strArr[1]);
        List arrayList = new ArrayList();
        arrayList.add(new BasicNameValuePair("version", this.f6052a.f4022d.mo2695K()));
        arrayList.add(new BasicNameValuePair("T", strArr[0]));
        arrayList.add(new BasicNameValuePair("U", this.f6052a.f4022d.mo2701P()));
        try {
            ((HttpPost) httpPost).setEntity(new UrlEncodedFormEntity(arrayList, "UTF-8"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        try {
            DefaultHttpClient defaultHttpClient = new DefaultHttpClient();
            defaultHttpClient.getParams().setParameter("http.connection.timeout", Integer.valueOf(10000));
            defaultHttpClient.getParams().setParameter("http.socket.timeout", Integer.valueOf(10000));
            HttpResponse execute = defaultHttpClient.execute(httpPost);
            if (execute.getStatusLine().getStatusCode() != 200) {
                return str;
            }
            try {
                String entityUtils = EntityUtils.toString(execute.getEntity());
                JSONObject jSONObject = new JSONObject();
                return C1340nk.m4156b(new JSONObject(entityUtils).getString("L"));
            } catch (ParseException e2) {
                e2.printStackTrace();
                return str;
            } catch (Exception e3) {
                e3.printStackTrace();
                return str;
            }
        } catch (ClientProtocolException e4) {
            e4.printStackTrace();
            return str;
        } catch (IOException e5) {
            e5.printStackTrace();
            return str;
        }
    }

    protected final void onCancelled() {
        super.onCancelled();
    }

    protected final /* synthetic */ void onPostExecute(Object obj) {
        String str = (String) obj;
        super.onPostExecute(str);
        FriendMailPage friendMailPage = this.f6052a;
        ListView b = this.f6052a.f4019a;
        //this.f6052a.f4024f;
        FriendMailPage.m3506a(friendMailPage, b, str);
        this.f6052a.f4023e.cancel();
    }

    @Override
    protected Object doInBackground(Object[] objects) {
        return null;
    }

    protected final void onPreExecute() {
        super.onPreExecute();
        this.f6052a.f4023e.setOnCancelListener(new C1350y(this));
        this.f6052a.f4023e.show();
    }

    protected final /* bridge */ /* synthetic */ void onProgressUpdate(Object... objArr) {
        super.onProgressUpdate(objArr[0]);
    }
}
