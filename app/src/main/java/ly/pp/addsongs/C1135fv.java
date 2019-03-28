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


/* renamed from: ly.pp.addsongs.fv */
final class C1135fv extends AsyncTask {
    /* renamed from: a */
    String f5463a;
    /* renamed from: b */
    final /* synthetic */ OLPlayHallRoom f5464b;

    private C1135fv(OLPlayHallRoom oLPlayHallRoom) {
        this.f5464b = oLPlayHallRoom;
        this.f5463a = "";
    }

    /* synthetic */ C1135fv(OLPlayHallRoom oLPlayHallRoom, byte b) {
        this(oLPlayHallRoom);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0098 A:{ExcHandler: org.apache.http.client.ClientProtocolException (r0_9 'e' org.apache.http.client.ClientProtocolException), Splitter: B:4:0x0071} */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0098 A:{ExcHandler: org.apache.http.client.ClientProtocolException (r0_9 'e' org.apache.http.client.ClientProtocolException), Splitter: B:4:0x0071} */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing block: B:14:0x0093, code:
            r0 = move-exception;
     */
    /* JADX WARNING: Missing block: B:16:?, code:
            r0.printStackTrace();
     */
    /* JADX WARNING: Missing block: B:17:0x0098, code:
            r0 = move-exception;
     */
    /* JADX WARNING: Missing block: B:18:0x0099, code:
            r0.printStackTrace();
     */
    /* JADX WARNING: Missing block: B:19:0x009d, code:
            r0 = move-exception;
     */
    /* JADX WARNING: Missing block: B:21:?, code:
            r0.printStackTrace();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    protected String doInBackground(String... strArr) {
        HttpUriRequest httpPost = new HttpPost("http://121.199.31.116:8910/JustPianoServer/server/GetUserInfo");
        List arrayList = new ArrayList();
        arrayList.add(new BasicNameValuePair("head", "2"));
        arrayList.add(new BasicNameValuePair("version", this.f5464b.f4470u.mo2695K()));
        arrayList.add(new BasicNameValuePair("keywords", strArr[0]));
        arrayList.add(new BasicNameValuePair("userName", strArr[1]));
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
                this.f5463a = EntityUtils.toString(execute.getEntity());
            }
        } catch (ClientProtocolException e2) {
        } catch (IOException e3) {
            e3.printStackTrace();
        }
        return this.f5463a;
    }

    protected final void onCancelled() {
        super.onCancelled();
    }

    protected final /* synthetic */ void onPostExecute(Object obj) {
        super.onPostExecute((String) obj);
        this.f5464b.f4426P.cancel();
    }

    @Override
    protected Object doInBackground(Object[] objects) {
        return null;
    }

    protected final void onPreExecute() {
        super.onPreExecute();
        this.f5464b.f4426P.setCancelable(true);
        this.f5464b.f4426P.setOnCancelListener(new C1136fw(this));
        this.f5464b.f4426P.show();
    }

    protected final /* bridge */ /* synthetic */ void onProgressUpdate(Object... objArr) {
        super.onProgressUpdate( objArr[0]);
    }
}
