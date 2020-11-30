package managementPatient;

/**
 *
 * @author KoJiHun
 */
public class SeverePatient implements Observer {

    private Management management;

    private String patientNumber; //환자의 고유번호
    private String patientName; //환자의 이름
    private String patientSex; //환자의 성별
    private String patientAge; //환자의 나이
    private String patientPsnum; //환자의 주민등록번호
    private String patientAddr; //환자의 주소
    private String patientCheck; //환자 확진 여부(확진, 비확진)
    private String patientType; //환자의 유형(중증, 경증, 보통)
    private String patientEnter; //환자의 입원 날짜 
    private String patientExit; //환자의 퇴원 날짜

    public SeverePatient(Management member, String patientNumber, String patientName, String patientSex, String patientAge, String patientPsnum, String patientAddr, String patientCheck, String patientType, String patientEnter, String patientExit) {
        management = member;
        management.registerObserver(this);

        this.patientNumber = patientNumber;
        this.patientName = patientName;
        this.patientSex = patientSex;
        this.patientAge = patientAge;
        this.patientPsnum = patientPsnum;
        this.patientAddr = patientAddr;
        this.patientCheck = patientCheck;
        this.patientType = patientType;
        this.patientEnter = patientEnter;
        this.patientExit = patientExit;

        System.out.println("-----------------------------------------");
        System.out.println(patientName + "님 신규등록이 완료되었습니다.");
        System.out.println("환자번호: " + patientNumber);
        System.out.println("이름: " + patientName);
        System.out.println("성별: " + patientSex);
        System.out.println("나이: " + patientAge);
        System.out.println("주민등록번호: " + patientPsnum);
        System.out.println("주소: " + patientAddr);
        System.out.println("확진여부: " + patientCheck);
        System.out.println("환자유형: " + patientType);
        System.out.println("입원날짜: " + patientEnter);
        System.out.println("퇴원날짜: " + patientExit);
        System.out.println("-----------------------------------------");
    }

    public void removePatient() {
        System.out.println("-----------------------------------------");
        System.out.println(patientName + "님 정보가 제거완료되었습니다.");
        System.out.println("환자번호: " + patientNumber);
        System.out.println("이름: " + patientName);
        System.out.println("성별: " + patientSex);
        System.out.println("나이: " + patientAge);
        System.out.println("주민등록번호: " + patientPsnum);
        System.out.println("주소: " + patientAddr);
        System.out.println("확진여부: " + patientCheck);
        System.out.println("환자유형: " + patientType);
        System.out.println("입원날짜: " + patientEnter);
        System.out.println("퇴원날짜: " + patientExit);
        System.out.println("-----------------------------------------");
        management.removeObserver(this);
    }

    @Override
    public void update(String patientType, String Text) {
        if (patientType.equals("중증환자")) {
            System.out.println("--------------" + patientType + "의 정기 납부일은 2020-06-30입니다.--------------");
            System.out.println("------------------" + patientType + "에게 전송되는 전체 메시지 ------------------");
            System.out.println("내용: " + Text);
        }
    }

    public String getPatientNumber() {
        return patientNumber;
    }

    public void setPatientNumber(String patientNumber) {
        this.patientNumber = patientNumber;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getPatientSex() {
        return patientSex;
    }

    public void setPatientSex(String patientSex) {
        this.patientSex = patientSex;
    }

    public String getPatientAge() {
        return patientAge;
    }

    public void setPatientAge(String patientAge) {
        this.patientAge = patientAge;
    }

    public String getPatientPsnum() {
        return patientPsnum;
    }

    public void setPatientPsnum(String patientPsnum) {
        this.patientPsnum = patientPsnum;
    }

    public String getPatientAddr() {
        return patientAddr;
    }

    public void setPatientAddr(String patientAddr) {
        this.patientAddr = patientAddr;
    }

    public String getPatientCheck() {
        return patientCheck;
    }

    public void setPatientCheck(String patientCheck) {
        this.patientCheck = patientCheck;
    }

    public String getPatientType() {
        return patientType;
    }

    public void setPatientType(String patientType) {
        this.patientType = patientType;
    }

    public String getPatientEnter() {
        return patientEnter;
    }

    public void setPatientEnter(String patientEnter) {
        this.patientEnter = patientEnter;
    }

    public String getPatientExit() {
        return patientExit;
    }

    public void setPatientExit(String patientExit) {
        this.patientExit = patientExit;
    }
}
