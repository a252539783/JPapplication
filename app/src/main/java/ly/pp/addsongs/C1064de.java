package ly.pp.addsongs;

import android.os.AsyncTask;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
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
import org.json.JSONException;
import org.json.JSONObject;


/* renamed from: ly.pp.addsongs.de */
public final class C1064de extends AsyncTask {
    /* renamed from: a */
    String f5319a = "";
    /* renamed from: b */
    String f5320b = "";
    /* renamed from: c */
    String f5321c = "";
    /* renamed from: d */
    String f5322d = "";
    /* renamed from: e */
    final /* synthetic */ OLMainMode f5323e;

    public C1064de(OLMainMode oLMainMode) {
        this.f5323e = oLMainMode;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0093 A:{ExcHandler: org.apache.http.client.ClientProtocolException (r0_11 'e' org.apache.http.client.ClientProtocolException), Splitter: B:6:0x006c} */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0093 A:{ExcHandler: org.apache.http.client.ClientProtocolException (r0_11 'e' org.apache.http.client.ClientProtocolException), Splitter: B:6:0x006c} */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing block: B:16:0x008e, code:
            r0 = move-exception;
     */
    /* JADX WARNING: Missing block: B:18:?, code:
            r0.printStackTrace();
     */
    /* JADX WARNING: Missing block: B:19:0x0093, code:
            r0 = move-exception;
     */
    /* JADX WARNING: Missing block: B:20:0x0094, code:
            r0.printStackTrace();
     */
    /* JADX WARNING: Missing block: B:21:0x0098, code:
            r0 = move-exception;
     */
    /* JADX WARNING: Missing block: B:23:?, code:
            r0.printStackTrace();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    protected String doInBackground(String... strArr) {
        if (!this.f5323e.f4293s.equals("")) {
            HttpUriRequest httpPost = new HttpPost("http://121.199.31.116:8910/JustPianoServer/server/UserKuang");
            List arrayList = new ArrayList();
            arrayList.add(new BasicNameValuePair("version", strArr[0]));
            arrayList.add(new BasicNameValuePair("type", strArr[1]));
            arrayList.add(new BasicNameValuePair("userName", strArr[2]));
            try {
                ((HttpPost) httpPost).setEntity(new UrlEncodedFormEntity(arrayList, "UTF-8"));
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
            DefaultHttpClient defaultHttpClient = new DefaultHttpClient();
            defaultHttpClient.getParams().setParameter("http.connection.timeout", Integer.valueOf(10000));
            defaultHttpClient.getParams().setParameter("http.socket.timeout", Integer.valueOf(10000));
            try {
                HttpResponse execute = defaultHttpClient.execute(httpPost);
                if (execute.getStatusLine().getStatusCode() == 200) {
                    this.f5319a = EntityUtils.toString(execute.getEntity());
                }
            } catch (ClientProtocolException e2) {
            } catch (IOException e3) {
                e3.printStackTrace();
            }
        }
        return this.f5319a;
    }

    protected final void onCancelled() {
        super.onCancelled();
    }

    protected final /* synthetic */ void onPostExecute(Object obj) {
        super.onPostExecute((String) obj);
        try {
            JSONObject jSONObject = new JSONObject(this.f5319a);
            OLMainMode oLMainMode = this.f5323e;
            String string = jSONObject.getString("T");
            String string2 = jSONObject.getString("M");
            jSONObject.getInt("S");
            oLMainMode.mo2803a(string, string2, jSONObject.getInt("I"));
        } catch (JSONException e) {
            e.printStackTrace();
        }
        this.f5323e.f3997c.dismiss();
    }

    @Override
    protected Object doInBackground(Object[] objects) {
        return null;
    }

    protected final void onPreExecute() {
        super.onPreExecute();
        this.f5323e.f3997c.setCancelable(true);
        this.f5323e.f3997c.setOnCancelListener(new C1065df(this));
        this.f5323e.f3997c.show();
    }

    protected final /* bridge */ /* synthetic */ void onProgressUpdate(Object... objArr) {
        super.onProgressUpdate( objArr[0]);
    }
}
