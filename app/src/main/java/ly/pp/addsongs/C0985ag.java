package ly.pp.addsongs;

import android.os.AsyncTask;
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


/* renamed from: ly.pp.addsongs.ag */
final class C0985ag extends AsyncTask {
    /* renamed from: a */
    final /* synthetic */ FriendMailPage f5108a;

    private C0985ag(FriendMailPage friendMailPage) {
        this.f5108a = friendMailPage;
    }

    /* synthetic */ C0985ag(FriendMailPage friendMailPage, byte b) {
        this(friendMailPage);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x00af A:{ExcHandler: org.apache.http.client.ClientProtocolException (r1_11 'e' org.apache.http.client.ClientProtocolException), Splitter: B:6:0x008c} */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing block: B:17:0x00af, code:
            r1 = move-exception;
     */
    /* JADX WARNING: Missing block: B:18:0x00b0, code:
            r1.printStackTrace();
     */
    /* JADX WARNING: Missing block: B:22:0x00b9, code:
            r1 = move-exception;
     */
    /* JADX WARNING: Missing block: B:23:0x00ba, code:
            r1.printStackTrace();
     */
    /* JADX WARNING: Missing block: B:26:?, code:
            return r0;
     */
    /* JADX WARNING: Missing block: B:27:?, code:
            return r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    protected String doInBackground(String... strArr) {
        String str = "";
        if (strArr[0].equals("")) {
            return str;
        }
        HttpUriRequest httpPost = new HttpPost("http://121.199.31.116:8910/JustPianoServer/server/" + strArr[1]);
        List arrayList = new ArrayList();
        arrayList.add(new BasicNameValuePair("head", "2"));
        arrayList.add(new BasicNameValuePair("version", this.f5108a.f4022d.mo2695K()));
        arrayList.add(new BasicNameValuePair("keywords", strArr[0]));
        arrayList.add(new BasicNameValuePair("userName", ""));
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
            return execute.getStatusLine().getStatusCode() == 200 ? EntityUtils.toString(execute.getEntity()) : str;
        } catch (ParseException e2) {
            e2.printStackTrace();
            return str;
        } catch (IOException e3) {
            e3.printStackTrace();
            return str;
        } //catch (ClientProtocolException e4) { }
    }

    protected final void onCancelled() {
        super.onCancelled();
    }

    protected final /* synthetic */ void onPostExecute(Object obj) {
        super.onPostExecute((String) obj);
        this.f5108a.f4023e.cancel();
    }

    @Override
    protected Object doInBackground(Object[] objects) {
        return null;
    }

    protected final void onPreExecute() {
        super.onPreExecute();
        this.f5108a.f4023e.setCancelable(true);
        this.f5108a.f4023e.setOnCancelListener(new C0986ah(this));
        this.f5108a.f4023e.show();
    }

    protected final /* bridge */ /* synthetic */ void onProgressUpdate(Object... objArr) {
        super.onProgressUpdate( objArr[0]);
    }
}
