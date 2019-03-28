package ly.pp.addsongs;

import android.app.Service;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.IBinder;
import android.os.Message;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;
import java.util.Set;




/* renamed from: ly.pp.addsongs.ConnectionService */
public class ConnectionService extends Service implements Runnable {
    /* renamed from: a */
    private InetSocketAddress f4002a;
    /* renamed from: b */
    private SocketChannel f4003b = null;
    /* renamed from: c */
    private ByteBuffer f4004c;
    /* renamed from: d */
    private Thread f4005d = null;
    /* renamed from: e */
    private Selector f4006e = null;
    /* renamed from: f */
    private SelectionKey f4007f = null;
    /* renamed from: g */
    private C1167h f4008g = new C1167h(this);
    /* renamed from: h */
    private int f4009h = 256;
    /* renamed from: i */
    private ByteBuffer f4010i = ByteBuffer.allocate(this.f4009h);
    /* renamed from: j */
    private boolean f4011j = true;
    /* renamed from: k */
    private int f4012k = 0;
    /* renamed from: l */
    private Thread f4013l = null;
    /* renamed from: m */
    private String f4014m = "";
    /* renamed from: n */
    private JPApplication f4015n;
    /* renamed from: o */
    /* renamed from: p */
    private long f4017p = 0;
    /* renamed from: q */
    private long f4018q = 0;

    /* renamed from: b */
    public static void m3500b() {
    }

    /* renamed from: a */
    public final void mo2675a() {
        try {
            this.f4011j = false;
            if (this.f4003b != null) {
                if (this.f4007f != null) {
                    this.f4007f.cancel();
                }
                if (this.f4003b.isConnected()) {
                    this.f4003b.finishConnect();
                }
                if (this.f4003b.isOpen()) {
                    this.f4003b.close();
                }
                if (this.f4006e.isOpen()) {
                    this.f4006e.close();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public final void mo2676a(byte b, byte b2, byte b3, String str, byte[] bArr) {
        if (this.f4004c != null && this != null) {
            this.f4004c.clear();
            ByteBuffer byteBuffer = null;
            switch (b) {
                case (byte) 0:
                    byteBuffer = ByteBuffer.wrap(new byte[]{(byte) 0, b2, (byte) 0});
                    break;
                case (byte) 3:
                    byteBuffer = C0987ai.m3952b(b, b2, b3, str);
                    break;
                case (byte) 4:
                    byteBuffer = C0987ai.m3952b(b, b2, b3, str);
                    break;
                case (byte) 5:
                    //"CONTROL_GAMEOVER_HEAD:" + b;
                    byteBuffer = C0987ai.m3952b(b, b2, b3, str);
                    break;
                case (byte) 6:
                    byteBuffer = C0987ai.m3945a((byte) 6, b3, b2, str);
                    break;
                case (byte) 7:
                    byteBuffer = C0987ai.m3945a((byte) 7, b2, b3, str);
                    break;
                case (byte) 8:
                    byteBuffer = C0987ai.m3945a((byte) 8, b2, b3, "");
                    break;
                case (byte) 9:
                    byteBuffer = C0987ai.m3946a((byte) 9, b2, b3, bArr);
                    break;
                case (byte) 10:
                    byteBuffer = ByteBuffer.wrap(new byte[]{b, b2, b3});
                    break;
                case (byte) 13:
                    byteBuffer = C0987ai.m3952b(b, b2, b3, str);
                    break;
                case (byte) 19:
                    byteBuffer = C0987ai.m3945a((byte) 19, b2, b3, str);
                    break;
                case (byte) 21:
                    byteBuffer = C0987ai.m3945a((byte) 21, b2, b3, "");
                    break;
                case (byte) 23:
                    byteBuffer = C0987ai.m3945a((byte) 23, b2, b3, "");
                    break;
                case (byte) 24:
                    byteBuffer = C0987ai.m3945a((byte) 24, b2, b3, "");
                    break;
                case (byte) 25:
                    byteBuffer = C0987ai.m3946a((byte) 25, b2, b3, bArr);
                    break;
                case (byte) 28:
                    byteBuffer = C0987ai.m3945a((byte) 28, b2, b3, str);
                    break;
                case (byte) 29:
                    byteBuffer = C0987ai.m3945a((byte) 29, b2, b3, str);
                    break;
                case (byte) 30:
                    byteBuffer = C0987ai.m3945a((byte) 30, b2, b3, "");
                    break;
                case (byte) 31:
                    byteBuffer = C0987ai.m3945a((byte) 31, b2, b3, str);
                    break;
                case (byte) 32:
                    byteBuffer = C0987ai.m3945a((byte) 32, b2, b3, str);
                    break;
                case (byte) 33:
                    byteBuffer = C0987ai.m3945a((byte) 33, b2, b3, str);
                    break;
                case (byte) 34:
                    byteBuffer = C0987ai.m3945a((byte) 34, b2, b3, str);
                    break;
                case (byte) 35:
                    byteBuffer = C0987ai.m3945a((byte) 35, b2, b3, str);
                    break;
                case (byte) 36:
                    byteBuffer = C0987ai.m3945a((byte) 36, b2, b3, str);
                    break;
                case (byte) 37:
                    byteBuffer = C0987ai.m3945a((byte) 37, b2, b3, str);
                    break;
                case (byte) 38:
                    byteBuffer = C0987ai.m3945a((byte) 23, b2, b3, "");
                    break;
                case (byte) 40:
                    byteBuffer = C0987ai.m3945a((byte) 40, b2, b3, str);
                    break;
                case (byte) 41:
                    byteBuffer = C0987ai.m3945a((byte) 41, b2, b3, str);
                    break;
                case (byte) 42:
                    byteBuffer = C0987ai.m3946a((byte) 42, b2, b3, bArr);
                    break;
                case (byte) 43:
                    byteBuffer = C0987ai.m3945a((byte) 43, b2, b3, str);
                    break;
                case (byte) 44:
                    byteBuffer = C0987ai.m3945a((byte) 44, b2, b3, str);
                    break;
                case (byte) 45:
                    byteBuffer = C0987ai.m3945a((byte) 45, b2, b3, str);
                    break;
            }
            this.f4004c = byteBuffer;
            if (this.f4004c != null) {
                this.f4004c.flip();
                if (this.f4007f != null && this.f4007f.isValid()) {
                    this.f4007f.attach(this.f4004c);
                    this.f4007f.interestOps(SelectionKey.OP_WRITE);
                    this.f4007f.selector().wakeup();
                }
            }
        }
    }

    public IBinder onBind(Intent intent) {
        return this.f4008g;
    }

    public void onCreate() {
        super.onCreate();
        this.f4015n = (JPApplication) getApplication();
        this.f4012k = 0;
        this.f4013l = new Thread(this);
        this.f4013l.start();
    }

    public void onDestroy() {
        mo2675a();
        super.onDestroy();
    }

    public void onRebind(Intent intent) {
        super.onRebind(intent);
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        return super.onStartCommand(intent, i, i2);
    }

    /* renamed from: run */
    public void run() {
        try {
            this.f4002a = new InetSocketAddress("121.199.31.116", 8908);
            this.f4006e = Selector.open();
            this.f4003b = SocketChannel.open();
            this.f4003b.configureBlocking(false);
            this.f4003b.connect(this.f4002a);
            this.f4003b.register(this.f4006e, SelectionKey.OP_CONNECT);
            while (this.f4011j) {
                if (this.f4006e.select() != 0) {
                    Set<SelectionKey> selectedKeys = this.f4006e.selectedKeys();
                    for (SelectionKey selectionKey : selectedKeys) {
                        if (selectionKey.isConnectable() && this.f4003b.finishConnect()) {
                            if (this.f4004c != null) {
                                this.f4004c.clear();
                            }
                            try {
                                PackageInfo packageInfo = getPackageManager().getPackageInfo(getPackageName(), 0);
                                this.f4004c = C0987ai.m3947a(this.f4015n.mo2701P(), this.f4015n.mo2702Q(), "ly.pp.justpiano", "4.3", this.f4014m);
                                selectionKey.attach(this.f4004c);
                                selectionKey.interestOps(SelectionKey.OP_WRITE);
                            } catch (NameNotFoundException e) {
                                e.printStackTrace();
                            }
                        }
                        if (selectionKey.isValid() && selectionKey.isReadable()) {
                            Object obj = new byte[0];
                            this.f4010i.clear();
                            while (true) {
                                int read = this.f4003b.read(this.f4010i);
                                if (read <= 0) {
                                    break;
                                }
                                this.f4010i.flip();
                                Object array = this.f4010i.array();
                                Object obj2 = new byte[(((byte[]) obj).length + read)];

                                System.arraycopy(obj, 0, obj2, 0, ((byte[]) obj).length);
                                System.arraycopy(array, 0, obj2, ((byte[]) obj).length, read);
                                this.f4010i.clear();
                                this.f4018q += (long) read;
                                obj = obj2;
                            }
                            //"downloadBytes:" + this.f4018q;
                            String str = new String((byte[])obj, 0, ((byte[]) obj).length, "UTF-8");
                            if (str.equals("")) {
                                selectedKeys.remove(selectionKey);
                                mo2675a();
                                break;
                            }
                            //"OLDataReceiver msg:" + str;
                            C1033ca.m3976a(str, this);
                        }
                        if (selectionKey.isValid() && selectionKey.isWritable()) {
                            this.f4007f = selectionKey;
                            this.f4004c.clear();
                            this.f4004c = (ByteBuffer) selectionKey.attachment();
                            if (this.f4004c != null) {
                                selectionKey.attach(null);
                                this.f4003b.write(this.f4004c);
                                this.f4004c.flip();
                                this.f4017p += (long) this.f4004c.array().length;
                                //"head:" + this.f4004c.get(0);
                            }
                            //"uploadBytes:" + this.f4017p;
                            selectionKey.interestOps(SelectionKey.OP_READ);
                        }
                        selectedKeys.remove(selectionKey);
                    }
                }
            }
        } catch (Exception e2) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e3) {
                e3.printStackTrace();
            }
            //"uploadBytes:" + (this.f4017p / 1000) + "kb downloadBytes:" + (this.f4018q / 1000) + "kb";
            e2.printStackTrace();
            this.f4012k++;
            this.f4011j = false;
            mo2675a();
            C1268kt.m4107a();
            if (C1268kt.m4109b() instanceof BaseActivity) {
                C1268kt.m4107a();
                BaseActivity baseActivity = (BaseActivity) C1268kt.m4109b();
                Message message = new Message();
                message.what = 0;
                baseActivity.f4001g.handleMessage(message);
            }
        }
    }
}
