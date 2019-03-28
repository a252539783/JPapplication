package ly.pp.addsongs;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Handler;
import android.util.Log;
import android.widget.ImageView;
import java.io.InputStream;
import java.lang.ref.SoftReference;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;

/* renamed from: ly.pp.addsongs.a */
public final class C0978a {
    /* renamed from: a */
    public boolean f5083a = true;
    /* renamed from: b */
    private C1005b f5084b;
    /* renamed from: c */
    public HashMap f5085c = new HashMap();
    /* renamed from: d */
    public Handler f5086d;
    /* renamed from: e */
    private int f5087e = 0;
    /* renamed from: f */
    public String f5088f = ".jpg";

    public C0978a(Handler handler, int i) {
        this.f5086d = handler;
        this.f5087e = i;
    }

    /* renamed from: b */
    public Bitmap m3938b(String str) {
        if (!str.endsWith(this.f5088f)) {
            return null;
        }
        try {
            URL url;
            switch (this.f5087e) {
                case 0:
                    url = new URL("http://121.199.31.116:8910/file/NailImage/" + str);
                    break;
                case 1:
                    url = new URL("http://121.199.31.116:8910/file/Image/" + str);
                    break;
                case 2:
                    url = new URL(str);
                    break;
                default:
                    url = null;
                    break;
            }
            if (url == null) {
                return null;
            }
            Bitmap decodeStream;
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setDoInput(true);
            httpURLConnection.connect();
            InputStream inputStream = httpURLConnection.getInputStream();
            if (inputStream != null) {
                decodeStream = BitmapFactory.decodeStream(inputStream);
                return decodeStream;
            }
            //decodeStream = null;
            return null;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /* renamed from: a */
    /*public final void mo3026a() {
        if (this.f5085c != null) {
            for (Entry value : this.f5085c.entrySet()) {
                Bitmap bitmap = (Bitmap) ((SoftReference) value.getValue()).get();
                if (bitmap != null) {
                    bitmap.recycle();
                }
            }
            this.f5085c.clear();
        }
        if (this.f5084b != null) {
            this.f5084b.mo3067a();
        }
    }*/

    /* renamed from: a */
    public final void mo3027a(ImageView imageView, Bitmap bitmap) {
        String str = (String) imageView.getTag();
        if (this.f5085c.containsKey(str)) {
            Bitmap bitmap2 = (Bitmap) ((SoftReference) this.f5085c.get(str)).get();
            if (bitmap2 != null) {
                imageView.setImageBitmap(bitmap2);
                return;
            } else {
                Log.e("TAG", "cache bitmap is null");
                this.f5085c.remove(str);
            }
        }
        if (bitmap != null) {
            imageView.setImageBitmap(bitmap);
        }
        if (this.f5084b == null) {
            this.f5084b = new C1005b(this, imageView, str);
            this.f5084b.start();
            return;
        }
        this.f5084b.mo3068a(imageView, str);
    }

    /* renamed from: a */
    public final void mo3028a(String str) {
        this.f5088f = str;
    }
}
