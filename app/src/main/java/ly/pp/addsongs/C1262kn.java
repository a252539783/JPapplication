package ly.pp.addsongs;

import android.content.Intent;
import android.os.AsyncTask;
import android.util.Log;
import android.widget.Toast;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.HttpResponse;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;



/* renamed from: ly.pp.addsongs.kn */
public final class C1262kn extends AsyncTask {
    /* renamed from: a */
    String f5802a = "";
    /* renamed from: b */
    final /* synthetic */ Register f5803b;

    public C1262kn(Register register) {
        this.f5803b = register;
    }

    /* renamed from: a */
    protected String doInBackground(Object[] objects) {
        HttpUriRequest httpPost = new HttpPost("http://121.199.31.116:8910/JustPianoServer/server/RegistServlet");
        List arrayList = new ArrayList();
        arrayList.add(new BasicNameValuePair("username", this.f5803b.f4928b));
        arrayList.add(new BasicNameValuePair("password", this.f5803b.f4930d));
        arrayList.add(new BasicNameValuePair("userkitiname", this.f5803b.f4929c));
        arrayList.add(new BasicNameValuePair("sex", this.f5803b.f4927a));
        arrayList.add(new BasicNameValuePair("id_360", this.f5803b.f4942p));
        arrayList.add(new BasicNameValuePair("name_360", this.f5803b.f4942p));
        try {
            ((HttpPost) httpPost).setEntity(new UrlEncodedFormEntity(arrayList, "UTF-8"));
            DefaultHttpClient defaultHttpClient = new DefaultHttpClient();
            defaultHttpClient.getParams().setParameter("http.connection.timeout", Integer.valueOf(20000));
            defaultHttpClient.getParams().setParameter("http.socket.timeout", Integer.valueOf(20000));
            HttpResponse execute = defaultHttpClient.execute(httpPost);
            if (execute.getStatusLine().getStatusCode() == 200) {
                int read = new DataInputStream(new ByteArrayInputStream(EntityUtils.toByteArray(execute.getEntity()))).read();
                this.f5802a = String.valueOf(read);
                Log.i("服务器返回信息：", this.f5802a);
                this.f5802a = String.valueOf(read);
                return this.f5802a;
            }
        } catch (Exception e) {
            this.f5802a = "3";
            e.printStackTrace();
        }
        return this.f5802a;
    }

    protected final void onCancelled() {
        super.onCancelled();
    }

    protected final /* synthetic */ void onPostExecute(Object obj) {
        String str = (String) obj;
        super.onPostExecute(str);
        this.f5803b.f4932f.dismiss();
        switch (Integer.valueOf(str).intValue()) {
            case 0:
                Toast.makeText(this.f5803b, "注册成功！", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent();
                intent.putExtra("name", this.f5803b.f4928b);
                intent.putExtra("password", this.f5803b.f4930d);
                intent.putExtra("result", "");
                intent.setClass(this.f5803b, Login.class);
                this.f5803b.startActivity(intent);
                this.f5803b.finish();
                break;
            case 1:
                Toast.makeText(this.f5803b, "注册失败,账号已存在！", Toast.LENGTH_SHORT).show();
                break;
            case 2:
                Toast.makeText(this.f5803b, "注册失败,系统错误！", Toast.LENGTH_SHORT).show();
                break;
            case 3:
                Toast.makeText(this.f5803b, "注册失败,网络错误！", Toast.LENGTH_SHORT).show();
                break;
            case 4:
                Toast.makeText(this.f5803b, "注册失败,昵称已存在！", Toast.LENGTH_SHORT).show();
                break;
        }
        this.f5803b.f4932f.dismiss();
    }


    protected final void onPreExecute() {
        super.onPreExecute();
        this.f5803b.f4932f.setMessage("正在连接....");
        this.f5803b.f4932f.show();
    }

    protected final /* synthetic */ void onProgressUpdate(Object[] objArr) {
        Integer[] numArr = (Integer[]) objArr;
        super.onProgressUpdate(objArr);
        this.f5803b.f4932f.setMessage("正在连接...." + numArr[0].toString());
        this.f5803b.f4932f.setProgress(numArr[0]);
    }
}
