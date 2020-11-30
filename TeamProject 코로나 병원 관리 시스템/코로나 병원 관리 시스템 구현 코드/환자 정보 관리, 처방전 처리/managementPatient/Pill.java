package managementPatient;

/**
 *
 * @author KoJiHun
 */
public class Pill {

    private String pillName; //알약 이름
    private int pillCount; //알약 개수
    private String pillperiod; //알약 복용 기간
    private String pillTime; //알약 먹어야하는 시간
    private int pillPrice = 300;//알약 가격

    public Pill(String pillName, int pillCount, String pillperiod, String pillTime) {
        this.pillName = pillName;
        this.pillCount = pillCount;
        this.pillperiod = pillperiod;
        this.pillTime = pillTime;
    }

    public int getPillPrice() {
        return pillPrice;
    }

    public String getPillName() {
        return pillName;
    }

    public void setPillName(String pillName) {
        this.pillName = pillName;
    }

    public int getPillCount() {
        return pillCount;
    }

    public void setPillCount(int pillCount) {
        this.pillCount = pillCount;
    }

    public String getPillperiod() {
        return pillperiod;
    }

    public void setPillperiod(String pillperiod) {
        this.pillperiod = pillperiod;
    }

    public String getPillTime() {
        return pillTime;
    }

    public void setPillTime(String pillTime) {
        this.pillTime = pillTime;
    }

}
