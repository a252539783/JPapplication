package ly.pp.addsongs;

import android.content.Context;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/* renamed from: ly.pp.addsongs.kr */
public final class C1266kr {
    /* renamed from: a */
    Context f5826a;
    /* renamed from: b */
    String f5827b;
    /* renamed from: c */
    boolean f5828c;
    /* renamed from: d */
    public boolean f5829d = true;
    /* renamed from: e */
    private InputStream f5830e;
    /* renamed from: f */
    private int[] f5831f;
    /* renamed from: g */
    private int[] f5832g;
    /* renamed from: h */
    private int[] f5833h;
    /* renamed from: i */
    private int[] f5834i;
    /* renamed from: j */
    private float f5835j;
    /* renamed from: k */
    private int f5836k;
    /* renamed from: l */
    private String f5837l = "";
    /* renamed from: m */
    private BufferedReader f5838m;
    /* renamed from: n */
    private InputStreamReader f5839n;
    /* renamed from: o */
    private int f5840o = 0;
    /* renamed from: p */
    private float f5841p = 0.0f;
    /* renamed from: q */
    private String f5842q = "songs/list";

    public C1266kr(Context context, String str) {
        this.f5826a = context;
        this.f5827b = str;
        this.f5828c = true;
        this.f5829d = m4095i();
    }

    public C1266kr(byte[] bArr) {
        int i = 0;
        try {
            this.f5830e = new ByteArrayInputStream(bArr);
            int available = this.f5830e.available();
            this.f5839n = new InputStreamReader(this.f5830e);
            this.f5838m = new BufferedReader(this.f5839n);
            this.f5837l = this.f5838m.readLine();
            this.f5837l = this.f5837l.trim();
            this.f5840o = this.f5837l.getBytes().length;
            int i2 = (available - (this.f5840o + 4)) / 4;
            byte[] bArr2 = new byte[available];
            this.f5830e.reset();
            this.f5830e.read(bArr2);
            this.f5836k = bArr2[this.f5840o + 1];
            this.f5835j = (float) bArr2[available - 2];
            this.f5831f = new int[i2];
            this.f5832g = new int[i2];
            this.f5833h = new int[i2];
            this.f5834i = new int[i2];
            int i3 = 0;
            int i4 = 0;
            i2 = 0;
            for (int i5 = this.f5840o + 2; i5 < available - 2; i5++) {
                switch ((i5 - this.f5840o) % 4) {
                    case 0:
                        this.f5831f[i4] = Integer.valueOf(bArr2[i5]).intValue();
                        i4++;
                        break;
                    case 1:
                        this.f5834i[i2] = Integer.valueOf(bArr2[i5]).intValue();
                        i2++;
                        break;
                    case 2:
                        this.f5832g[i3] = Integer.valueOf(bArr2[i5]).intValue();
                        i3++;
                        break;
                    case 3:
                        this.f5833h[i] = Integer.valueOf(bArr2[i5]).intValue();
                        i++;
                        break;
                    default:
                        break;
                }
            }
            this.f5841p = Float.valueOf((float) bArr2[available - 1]).floatValue() / 10.0f;
            if (this.f5830e != null) {
                try {
                    this.f5830e.close();
                    this.f5839n.close();
                    this.f5838m.close();
                    this.f5838m = null;
                    this.f5839n = null;
                    this.f5830e = null;
                } catch (IOException e) {
                    e.toString();
                }
            }
        } catch (Exception e2) {
            e2.toString();
            if (this.f5830e != null) {
                try {
                    this.f5830e.close();
                    this.f5839n.close();
                    this.f5838m.close();
                    this.f5838m = null;
                    this.f5839n = null;
                    this.f5830e = null;
                } catch (IOException e3) {
                    e3.toString();
                }
            }
        } catch (Throwable th) {
            if (this.f5830e != null) {
                try {
                    this.f5830e.close();
                    this.f5839n.close();
                    this.f5838m.close();
                    this.f5838m = null;
                    this.f5839n = null;
                    this.f5830e = null;
                } catch (IOException e4) {
                    e4.toString();
                }
            }
        }
    }

    /* renamed from: i */
    private boolean m4095i() {
        int i = 0;
        try {
            this.f5830e = this.f5826a.getResources().getAssets().open(this.f5827b);
            int available = this.f5830e.available();
            this.f5839n = new InputStreamReader(this.f5830e);
            this.f5838m = new BufferedReader(this.f5839n);
            this.f5837l = this.f5838m.readLine();
            this.f5840o = this.f5837l.getBytes().length;
            int i2 = (available - (this.f5840o + 4)) / 4;
            byte[] bArr = new byte[available];
            this.f5830e.reset();
            this.f5830e.read(bArr);
            this.f5836k = bArr[this.f5840o + 1];
            this.f5835j = (float) bArr[available - 2];
            this.f5831f = new int[i2];
            this.f5832g = new int[i2];
            this.f5833h = new int[i2];
            this.f5834i = new int[i2];
            if (this.f5828c) {
                int i3 = 0;
                int i4 = 0;
                i2 = 0;
                for (int i5 = this.f5840o + 2; i5 < available - 2; i5++) {
                    switch ((i5 - this.f5840o) % 4) {
                        case 0:
                            this.f5831f[i4] = Integer.valueOf(bArr[i5]).intValue();
                            i4++;
                            break;
                        case 1:
                            this.f5834i[i2] = Integer.valueOf(bArr[i5]).intValue();
                            i2++;
                            break;
                        case 2:
                            this.f5832g[i3] = Integer.valueOf(bArr[i5]).intValue();
                            i3++;
                            break;
                        case 3:
                            this.f5833h[i] = Integer.valueOf(bArr[i5]).intValue();
                            i++;
                            break;
                        default:
                            break;
                    }
                }
            }
            this.f5841p = Float.valueOf((float) bArr[available - 1]).floatValue() / 10.0f;
            if (this.f5830e != null) {
                try {
                    this.f5830e.close();
                    this.f5839n.close();
                    this.f5838m.close();
                    this.f5838m = null;
                    this.f5839n = null;
                    this.f5830e = null;
                } catch (IOException e) {
                    e.toString();
                }
            }
        } catch (Exception e2) {
            //"ERR4" + e2.toString();
            if (this.f5830e != null) {
                try {
                    this.f5830e.close();
                    this.f5839n.close();
                    this.f5838m.close();
                    this.f5838m = null;
                    this.f5839n = null;
                    this.f5830e = null;
                } catch (IOException e3) {
                    e3.toString();
                }
            }
        } catch (Throwable th) {
            if (this.f5830e != null) {
                try {
                    this.f5830e.close();
                    this.f5839n.close();
                    this.f5838m.close();
                    this.f5838m = null;
                    this.f5839n = null;
                    this.f5830e = null;
                } catch (IOException e4) {
                    e4.toString();
                }
            }
        }
        return this.f5829d;
    }

    /* renamed from: a */
    public final boolean mo3452a(Context context, String str) {
        boolean z;
        try {
            this.f5830e = context.getResources().getAssets().open(str);
            int available = this.f5830e.available();
            this.f5839n = new InputStreamReader(this.f5830e);
            this.f5838m = new BufferedReader(this.f5839n);
            this.f5837l = this.f5838m.readLine();
            this.f5840o = this.f5837l.getBytes().length;
            byte[] bArr = new byte[available];
            this.f5830e.reset();
            this.f5830e.read(bArr);
            this.f5841p = Float.valueOf((float) bArr[available - 1]).floatValue() / 10.0f;
            z = true;
            if (this.f5830e != null) {
                try {
                    this.f5830e.close();
                    this.f5839n.close();
                    this.f5838m.close();
                    this.f5838m = null;
                    this.f5839n = null;
                    this.f5830e = null;
                } catch (IOException e) {
                    e.toString();
                }
            }
        } catch (Exception e2) {
            //"ERR4" + e2.toString();
            z = false;
            if (this.f5830e != null) {
                try {
                    this.f5830e.close();
                    this.f5839n.close();
                    this.f5838m.close();
                    this.f5838m = null;
                    this.f5839n = null;
                    this.f5830e = null;
                } catch (IOException e3) {
                    e3.toString();
                }
            }
        } catch (Throwable th) {
            if (this.f5830e != null) {
                try {
                    this.f5830e.close();
                    this.f5839n.close();
                    this.f5838m.close();
                    this.f5838m = null;
                    this.f5839n = null;
                    this.f5830e = null;
                } catch (IOException e32) {
                    e32.toString();
                }
            }
        }
        return true;
    }

    /* renamed from: a */
    public final int[] mo3453a() {
        return this.f5831f;
    }

    /* renamed from: b */
    public final int[] mo3454b() {
        return this.f5832g;
    }

    /* renamed from: c */
    public final int[] mo3455c() {
        return this.f5833h;
    }

    /* renamed from: d */
    public final int[] mo3456d() {
        return this.f5834i;
    }

    /* renamed from: e */
    public final float mo3457e() {
        return this.f5835j;
    }

    /* renamed from: f */
    public final int mo3458f() {
        return this.f5836k;
    }

    /* renamed from: g */
    public final float mo3459g() {
        return this.f5841p;
    }

    /* renamed from: h */
    public final String mo3460h() {
        return this.f5837l;
    }
}
