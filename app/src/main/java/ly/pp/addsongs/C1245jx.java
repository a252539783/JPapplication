package ly.pp.addsongs;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: ly.pp.addsongs.jx */
public final class C1245jx {
    /* renamed from: a */
    private String f5749a = "";
    /* renamed from: b */
    private String f5750b = "";
    /* renamed from: c */
    private String f5751c = "";
    /* renamed from: d */
    private String f5752d = "";
    /* renamed from: e */
    private String f5753e = "";
    /* renamed from: f */
    private byte f5754f = (byte) 0;
    /* renamed from: g */
    private int f5755g = 0;
    /* renamed from: h */
    private int f5756h;
    /* renamed from: i */
    private int f5757i = 0;
    /* renamed from: j */
    private String f5758j = "";
    /* renamed from: k */
    private int f5759k;
    /* renamed from: l */
    private byte f5760l = (byte) 0;
    /* renamed from: m */
    private byte f5761m = (byte) 0;
    /* renamed from: n */
    private int f5762n = 0;
    /* renamed from: o */
    private int f5763o;
    /* renamed from: p */
    private int f5764p;
    /* renamed from: q */
    private int f5765q;
    /* renamed from: r */
    private int f5766r;
    /* renamed from: s */
    private int f5767s = 0;
    /* renamed from: t */
    private int f5768t = 0;
    /* renamed from: u */
    private int f5769u = 0;

    public C1245jx(byte b, String str, JSONObject jSONObject, String str2, String str3, String str4, int i, int i2, int i3, int i4, int i5) {
        this.f5754f = b;
        this.f5749a = str;
        this.f5751c = str2;
        this.f5752d = str3;
        this.f5753e = str4;
        m4058a(jSONObject);
        this.f5759k = i2;
        this.f5762n = i;
        this.f5766r = i3;
        this.f5767s = i4;
        this.f5768t = i5;
    }

    public C1245jx(String str, JSONObject jSONObject, String str2, int i, int i2) {
        this.f5749a = str;
        this.f5751c = str2;
        m4058a(jSONObject);
        this.f5762n = i;
        this.f5766r = i2;
    }

    /* renamed from: a */
    private void m4058a(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                this.f5751c = jSONObject.getString("S");
                this.f5763o = jSONObject.getInt("T");
                this.f5764p = jSONObject.getInt("J");
                this.f5765q = jSONObject.getInt("H");
                this.f5769u = jSONObject.getInt("O");
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public final String mo3385a() {
        return this.f5749a;
    }

    /* renamed from: a */
    public final void mo3386a(int i) {
        this.f5756h = i;
    }

    /* renamed from: a */
    public final void mo3387a(String str) {
        this.f5749a = str;
    }

    /* renamed from: b */
    public final String mo3388b() {
        return this.f5751c;
    }

    /* renamed from: b */
    public final void mo3389b(int i) {
        this.f5755g = i;
    }

    /* renamed from: b */
    public final void mo3390b(String str) {
        this.f5752d = str;
    }

    /* renamed from: c */
    public final String mo3391c() {
        return this.f5752d;
    }

    /* renamed from: c */
    public final void mo3392c(String str) {
        this.f5753e = str;
    }

    /* renamed from: d */
    public final String mo3393d() {
        return this.f5753e;
    }

    /* renamed from: e */
    public final byte mo3394e() {
        return this.f5754f;
    }

    /* renamed from: f */
    public final String mo3395f() {
        return String.valueOf(this.f5755g);
    }

    /* renamed from: g */
    public final int mo3396g() {
        return this.f5759k;
    }

    /* renamed from: h */
    public final int mo3397h() {
        return this.f5762n;
    }

    /* renamed from: i */
    public final int mo3398i() {
        return this.f5763o;
    }

    /* renamed from: j */
    public final int mo3399j() {
        return this.f5764p;
    }

    /* renamed from: k */
    public final int mo3400k() {
        return this.f5765q;
    }

    /* renamed from: l */
    public final int mo3401l() {
        return this.f5766r;
    }

    /* renamed from: m */
    public final int mo3402m() {
        return this.f5767s;
    }

    /* renamed from: n */
    public final int mo3403n() {
        return this.f5768t;
    }

    /* renamed from: o */
    public final int mo3404o() {
        return this.f5769u;
    }

    /* renamed from: p */
    public final int mo3405p() {
        return this.f5756h;
    }
}
