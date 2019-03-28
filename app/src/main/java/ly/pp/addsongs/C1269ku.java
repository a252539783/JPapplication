package ly.pp.addsongs;

import android.os.AsyncTask;
import android.widget.ListAdapter;
import android.widget.Toast;
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
import org.json.JSONObject;



/* renamed from: ly.pp.addsongs.ku */
public final class C1269ku extends AsyncTask {
    /* renamed from: a */
    String f5849a = "";
    /* renamed from: b */
    final /* synthetic */ SearchSongs f5850b;

    public C1269ku(SearchSongs searchSongs) {
        this.f5850b = searchSongs;
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x00ce A:{ExcHandler: org.apache.http.client.ClientProtocolException (r0_16 'e' org.apache.http.client.ClientProtocolException), Splitter: B:9:0x00a1} */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00ce A:{ExcHandler: org.apache.http.client.ClientProtocolException (r0_16 'e' org.apache.http.client.ClientProtocolException), Splitter: B:9:0x00a1} */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing block: B:20:0x00c9, code:
            r0 = move-exception;
     */
    /* JADX WARNING: Missing block: B:22:?, code:
            r0.printStackTrace();
     */
    /* JADX WARNING: Missing block: B:23:0x00ce, code:
            r0 = move-exception;
     */
    /* JADX WARNING: Missing block: B:24:0x00cf, code:
            r0.printStackTrace();
     */
    /* JADX WARNING: Missing block: B:25:0x00d3, code:
            r0 = move-exception;
     */
    /* JADX WARNING: Missing block: B:27:?, code:
            r0.printStackTrace();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    protected String doInBackground(Object[] objects) {
        if (!this.f5850b.f4948c.equals("")) {
            String str;
            String str2;
            if (this.f5850b.f4958m == 6) {
                str = "GetTopListByKeywords";
                str2 = "6";
            } else {
                str = "GetListByKeywords";
                str2 = "0";
            }
            HttpUriRequest httpPost = new HttpPost("http://121.199.31.116:8910/JustPianoServer/server/" + str);
            List arrayList = new ArrayList();
            arrayList.add(new BasicNameValuePair("version", this.f5850b.f4959n.mo2695K()));
            arrayList.add(new BasicNameValuePair("head", str2));
            arrayList.add(new BasicNameValuePair("keywords", this.f5850b.f4948c));
            arrayList.add(new BasicNameValuePair("user", this.f5850b.f4959n.mo2701P()));
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
                    this.f5849a = EntityUtils.toString(execute.getEntity());
                }
            } catch (ClientProtocolException e2) {
            } catch (IOException e3) {
                e3.printStackTrace();
            }
        }
        return this.f5849a;
    }

    protected final void onCancelled() {
        super.onCancelled();
    }

    protected final /* synthetic */ void onPostExecute(Object obj) {
        super.onPostExecute((String) obj);
        if (this.f5849a.length() > 3) {
            if (this.f5850b.f4958m < 2) {
                this.f5850b.mo2963a(this.f5849a, this.f5850b.f4951f);
                this.f5850b.f4951f.setCacheColorHint(0);
            } else if (this.f5850b.f4958m == 6) {
                //JSONObject jSONObject = new JSONObject();
                try {
                    ListAdapter c1278lc = new C1278lc(this.f5850b, this.f5850b.f4947b, this.f5850b.m3841b(C1340nk.m4156b(new JSONObject(this.f5849a).getString("L"))));
                    if (this.f5850b.f4951f != null) {
                        this.f5850b.f4951f.setAdapter(c1278lc);
                    }
                    this.f5850b.f4951f.setCacheColorHint(0);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            this.f5850b.f4952g.cancel();
        } else if (this.f5849a.equals("[]")) {
            this.f5850b.f4952g.cancel();
            Toast.makeText(this.f5850b, "没有找到与[" + this.f5850b.f4948c + "]相关的信息", Toast.LENGTH_SHORT).show();
        } else {
            this.f5850b.f4952g.cancel();
            Toast.makeText(this.f5850b, "连接有错！请再试一遍", Toast.LENGTH_SHORT).show();
        }
    }



    protected final void onPreExecute() {
        super.onPreExecute();
        this.f5850b.f4952g.setMessage("正在搜索曲库,请稍后...");
        this.f5850b.f4952g.setCancelable(true);
        this.f5850b.f4952g.setOnCancelListener(new C1270kv(this));
        this.f5850b.f4952g.show();
    }

    protected final /* bridge */ /* synthetic */ void onProgressUpdate(Object... objArr) {
        super.onProgressUpdate(objArr[0]);
    }
}
