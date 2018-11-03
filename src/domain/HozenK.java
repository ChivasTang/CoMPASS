package domain;

public class HozenK {
    /** 工場コード KOJO-CD **/
    String kojo_cd;

    /** 設備コード SETUBI-CD **/
    String setubi_cd;

    /** 定修年月 TEISYUｰYM **/
    String teisyu_ym;

    /** 開始日時 TEISYU-KAISHI **/
    String teisyu_kaishi;

    /** 終了日時 TEISYU-SYURYO **/
    String teisyu_syuryo;

    /** 定期修理区分 TEISYU-KBN **/
    String teisyu_kbn;

    /** 定期修理区分名称 TEISYU-NM **/
    String teisyu_nm;

    /** 備考 TEISYU-BIKOU **/
    String teisyu_bikou;

    public HozenK() {
    }

    public String getKojo_cd() {
        return kojo_cd;
    }

    public void setKojo_cd(String kojo_cd) {
        this.kojo_cd = kojo_cd;
    }

    public String getSetubi_cd() {
        return setubi_cd;
    }

    public void setSetubi_cd(String setubi_cd) {
        this.setubi_cd = setubi_cd;
    }

    public String getTeisyu_ym() {
        return teisyu_ym;
    }

    public void setTeisyu_ym(String teisyu_ym) {
        this.teisyu_ym = teisyu_ym;
    }

    public String getTeisyu_kaishi() {
        return teisyu_kaishi;
    }

    public void setTeisyu_kaishi(String teisyu_kaishi) {
        this.teisyu_kaishi = teisyu_kaishi;
    }

    public String getTeisyu_syuryo() {
        return teisyu_syuryo;
    }

    public void setTeisyu_syuryo(String teisyu_syuryo) {
        this.teisyu_syuryo = teisyu_syuryo;
    }

    public String getTeisyu_kbn() {
        return teisyu_kbn;
    }

    public void setTeisyu_kbn(String teisyu_kbn) {
        this.teisyu_kbn = teisyu_kbn;
    }

    public String getTeisyu_nm() {
        return teisyu_nm;
    }

    public void setTeisyu_nm(String teisyu_nm) {
        this.teisyu_nm = teisyu_nm;
    }

    public String getTeisyu_bikou() {
        return teisyu_bikou;
    }

    public void setTeisyu_bikou(String teisyu_bikou) {
        this.teisyu_bikou = teisyu_bikou;
    }

    @Override
    public String toString() {
        return "HozenK{" +
                "kojo_cd='" + kojo_cd + '\'' +
                ", setubi_cd='" + setubi_cd + '\'' +
                ", teisyu_ym='" + teisyu_ym + '\'' +
                ", teisyu_kaishi='" + teisyu_kaishi + '\'' +
                ", teisyu_syuryo='" + teisyu_syuryo + '\'' +
                ", teisyu_kbn='" + teisyu_kbn + '\'' +
                ", teisyu_nm='" + teisyu_nm + '\'' +
                ", teisyu_bikou='" + teisyu_bikou + '\'' +
                '}';
    }
}
