package ly.pp.addsongs;

import android.graphics.Bitmap;
import android.widget.ImageView;
import java.lang.ref.SoftReference;
import java.util.LinkedHashMap;

/* renamed from: ly.pp.addsongs.b */
final class C1005b extends Thread {
    /* renamed from: a */
    LinkedHashMap f5145a = new LinkedHashMap();
    /* renamed from: b */
    final /* synthetic */ C0978a f5146b;
    /* renamed from: c */
    private boolean f5147c;

    public C1005b(C0978a c0978a, ImageView imageView, String str) {
        this.f5146b = c0978a;
        this.f5145a.put(str, imageView);
    }

    /* renamed from: a */
    public final void mo3067a() {
        this.f5146b.f5083a = false;
        this.f5145a.clear();
        if (this.f5147c) {
            synchronized (this) {
                notify();
            }
        }
    }

    /* renamed from: a */
    public final void mo3068a(ImageView imageView, String str) {
        this.f5145a.remove(imageView);
        if (str.endsWith(this.f5146b.f5088f)) {
            this.f5145a.put(str, imageView);
            if (this.f5147c) {
                synchronized (this) {
                    notify();
                }
            }
        }
    }

    /* renamed from: run */
    public final void run() {
        while (this.f5145a.size() > 0 && this.f5146b.f5083a) {
            //"mTaskMap.size():" + this.f5145a.size();
            this.f5147c = false;
            String str = (String) this.f5145a.keySet().iterator().next();
            ImageView imageView = (ImageView) this.f5145a.remove(str);
            if (imageView.getTag() == str) {
                Bitmap a = this.f5146b.m3938b(str);
                this.f5146b.f5085c.put(str, new SoftReference(a));
                if (str == imageView.getTag() && a != null) {
                    this.f5146b.f5086d.post(new C1032c(this, imageView, a));
                }
            }
            if (this.f5145a.isEmpty() && this.f5146b.f5083a) {
                try {
                    this.f5147c = true;
                    synchronized (this) {
                        wait();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
