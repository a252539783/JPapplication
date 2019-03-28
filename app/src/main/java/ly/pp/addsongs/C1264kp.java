package ly.pp.addsongs;

/* renamed from: ly.pp.addsongs.kp */
public final class C1264kp {
    /* renamed from: a */
    private byte f5807a;
    /* renamed from: b */
    private String f5808b;
    /* renamed from: c */
    private int f5809c;
    /* renamed from: d */
    private int f5810d;
    /* renamed from: e */
    private int f5811e;
    /* renamed from: f */
    private int[] f5812f;
    /* renamed from: g */
    private boolean f5813g;
    /* renamed from: h */
    private int f5814h;
    /* renamed from: i */
    private int f5815i;
    /* renamed from: j */
    private int f5816j;
    /* renamed from: k */
    private int f5817k;
    /* renamed from: l */
    private int f5818l;

    public C1264kp() {
        this.f5807a = (byte) 0;
        this.f5808b = "";
        this.f5809c = 0;
        this.f5810d = 0;
        this.f5811e = 0;
        this.f5812f = new int[6];
        this.f5813g = false;
        this.f5814h = 0;
        this.f5815i = 0;
        this.f5816j = 0;
        this.f5818l = 0;
    }

    public C1264kp(byte b, String str, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        int i8;
        this.f5807a = (byte) 0;
        this.f5808b = "";
        this.f5809c = 0;
        this.f5810d = 0;
        this.f5811e = 0;
        this.f5812f = new int[6];
        this.f5813g = false;
        this.f5814h = 0;
        this.f5815i = 0;
        this.f5816j = 0;
        this.f5818l = 0;
        this.f5817k = i6;
        this.f5807a = b;
        this.f5808b = str;
        this.f5810d = i2;
        this.f5809c = i;
        this.f5811e = i3;
        this.f5815i = i4;
        this.f5818l = i7;
        this.f5814h = (i + i2) + i6;
        this.f5813g = false;
        if (this.f5814h < 6) {
            this.f5813g = false;
        } else if (this.f5814h == 6) {
            this.f5813g = true;
        }
        for (i8 = 0; i8 < i; i8++) {
            this.f5812f[i8] = 1;
        }
        while (i < this.f5814h - i6) {
            this.f5812f[i] = 0;
            i++;
        }
        for (i8 = 6 - i6; i8 < 6; i8++) {
            this.f5812f[i8] = 3;
        }
        if (!this.f5813g) {
            for (i8 = this.f5814h - i6; i8 < 6 - i6; i8++) {
                this.f5812f[i8] = 2;
            }
        }
        this.f5816j = i5;
    }

    /* renamed from: a */
    public final byte mo3442a() {
        return this.f5807a;
    }

    /* renamed from: b */
    public final String mo3443b() {
        return this.f5808b;
    }

    /* renamed from: c */
    public final int mo3444c() {
        return this.f5809c;
    }

    /* renamed from: d */
    public final int mo3445d() {
        return this.f5810d;
    }

    /* renamed from: e */
    public final int mo3446e() {
        return this.f5811e;
    }

    /* renamed from: f */
    public final int[] mo3447f() {
        return this.f5812f;
    }

    /* renamed from: g */
    public final boolean mo3448g() {
        return this.f5813g;
    }

    /* renamed from: h */
    public final int mo3449h() {
        return this.f5815i;
    }

    /* renamed from: i */
    public final int mo3450i() {
        return this.f5816j;
    }

    /* renamed from: j */
    public final int mo3451j() {
        return this.f5818l;
    }
}
