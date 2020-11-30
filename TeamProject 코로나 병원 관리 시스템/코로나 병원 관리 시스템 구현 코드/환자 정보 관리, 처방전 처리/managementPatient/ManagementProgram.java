package managementPatient;

//import문 - util
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

//import문 - swing
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author KoJiHun
 */

public class ManagementProgram extends javax.swing.JFrame {

    public static String patientName; //처방전으로 넘기기 위해 정적 변수 사용
    public static String patientPsnum;
    public static String patientEnter;
    public static String patientExit;

    Control hospitalct = new Control();

    //환자의 정보를 다루기 위한 변수
    String patientnum; //환자의 고유번호
    String patientname; //환자의 이름
    String patientsex; //환자의 성별
    String patientage; //환자의 나이
    String patientpersonal; //환자의 주민등록번호
    String patientadder; //환자의 주소
    String patientcheck; //환자 감염여부
    String patienttype; //환자 유형
    String patiententer; //환자 입원 날짜
    String patientexit; //환자 퇴원 날짜

    HospitalProgram hospitalprogram = new HospitalProgram();
    private Management management;
    MildPatient MildPatient;
    SeverePatient SeverePatient;
    NonCoronaPatient NonCoronaPatient;
    private String patientType; //환자의 타입
    private String patientCheck; //환자 감염여부
    private boolean allOfPatient = false;

    ArrayList<MildPatient> mildPatientlist = new ArrayList<MildPatient>();
    ArrayList<SeverePatient> severePatientlist = new ArrayList<SeverePatient>();
    ArrayList<NonCoronaPatient> nonCoronaPatientlist = new ArrayList<NonCoronaPatient>();

    public ManagementProgram() {
        initComponents();
        initPatient();
        this.setLocationRelativeTo(null); //시작위치를 가운데 고정
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        TextField11 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        TextField12 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        TextField13 = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        TextField14 = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        TextField15 = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        TextField16 = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        TextField19 = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        TextField20 = new javax.swing.JTextField();
        TextField17 = new javax.swing.JTextField();
        TextField18 = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        TextField1 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        TextField2 = new javax.swing.JTextField();
        TextField3 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        TextField4 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        TextField9 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        TextField10 = new javax.swing.JTextField();
        TextField8 = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        TextField5 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        TextField6 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        TextField7 = new javax.swing.JComboBox<>();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel6 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton6 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(241, 241, 241));

        jLabel1.setFont(new java.awt.Font("맑은 고딕", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("환자 관리 시스템");

        jLabel2.setFont(new java.awt.Font("맑은 고딕", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("사용자:");

        jTextField1.setBackground(new java.awt.Color(203, 209, 222));
        jTextField1.setForeground(new java.awt.Color(51, 51, 51));
        jTextField1.setEnabled(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jTextField1)
                .addGap(4, 4, 4))
        );

        jPanel3.setBackground(new java.awt.Color(34, 82, 178));
        jPanel3.setPreferredSize(new java.awt.Dimension(0, 3));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "환자번호", "환자명", "성별", "나이", "주민등록번호", "주소", "감염여부", "환자유형", "입원날짜", "퇴원날짜"
            }
        ));
        jTable1.setRowHeight(23);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel12.setFont(new java.awt.Font("맑은 고딕", 1, 13)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 51, 51));
        jLabel12.setText("환자번호");

        TextField11.setBackground(new java.awt.Color(203, 209, 222));
        TextField11.setEnabled(false);

        jLabel21.setFont(new java.awt.Font("맑은 고딕", 1, 13)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(51, 51, 51));
        jLabel21.setText("환자명");

        TextField12.setBackground(new java.awt.Color(203, 209, 222));
        TextField12.setEnabled(false);

        jLabel22.setFont(new java.awt.Font("맑은 고딕", 1, 13)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(51, 51, 51));
        jLabel22.setText("성별");

        TextField13.setBackground(new java.awt.Color(203, 209, 222));
        TextField13.setEnabled(false);

        jLabel23.setFont(new java.awt.Font("맑은 고딕", 1, 13)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(51, 51, 51));
        jLabel23.setText("나이");

        TextField14.setBackground(new java.awt.Color(203, 209, 222));
        TextField14.setEnabled(false);

        jLabel24.setFont(new java.awt.Font("맑은 고딕", 1, 13)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(51, 51, 51));
        jLabel24.setText("주민등록번호");

        TextField15.setBackground(new java.awt.Color(203, 209, 222));
        TextField15.setEnabled(false);

        jLabel25.setFont(new java.awt.Font("맑은 고딕", 1, 13)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(51, 51, 51));
        jLabel25.setText("주소");

        TextField16.setBackground(new java.awt.Color(203, 209, 222));

        jLabel26.setFont(new java.awt.Font("맑은 고딕", 1, 13)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(51, 51, 51));
        jLabel26.setText("감염여부");

        jLabel27.setFont(new java.awt.Font("맑은 고딕", 1, 13)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(51, 51, 51));
        jLabel27.setText("환자유형");

        jLabel28.setFont(new java.awt.Font("맑은 고딕", 1, 13)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(51, 51, 51));
        jLabel28.setText("입원날짜");

        TextField19.setBackground(new java.awt.Color(203, 209, 222));
        TextField19.setEnabled(false);

        jLabel29.setFont(new java.awt.Font("맑은 고딕", 1, 13)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(51, 51, 51));
        jLabel29.setText("퇴원날짜");

        TextField20.setBackground(new java.awt.Color(203, 209, 222));

        TextField17.setBackground(new java.awt.Color(203, 209, 222));

        TextField18.setBackground(new java.awt.Color(203, 209, 222));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel29)
                    .addComponent(jLabel22)
                    .addComponent(jLabel21)
                    .addComponent(jLabel12)
                    .addComponent(jLabel23)
                    .addComponent(jLabel24)
                    .addComponent(jLabel25)
                    .addComponent(jLabel26)
                    .addComponent(jLabel27)
                    .addComponent(jLabel28))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TextField13, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                    .addComponent(TextField20)
                    .addComponent(TextField12, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                    .addComponent(TextField14)
                    .addComponent(TextField11)
                    .addComponent(TextField15, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TextField16)
                    .addComponent(TextField19)
                    .addComponent(TextField17)
                    .addComponent(TextField18))
                .addGap(0, 14, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(TextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextField14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextField15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextField16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(TextField17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel27)
                    .addComponent(TextField18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextField19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(TextField20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("환자정보", jPanel4);

        jLabel10.setFont(new java.awt.Font("맑은 고딕", 1, 13)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("환자번호");

        TextField1.setBackground(new java.awt.Color(203, 209, 222));

        jLabel11.setFont(new java.awt.Font("맑은 고딕", 1, 13)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setText("환자명");

        TextField2.setBackground(new java.awt.Color(203, 209, 222));

        TextField3.setBackground(new java.awt.Color(203, 209, 222));

        jLabel13.setFont(new java.awt.Font("맑은 고딕", 1, 13)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 51, 51));
        jLabel13.setText("성별");

        TextField4.setBackground(new java.awt.Color(203, 209, 222));

        jLabel14.setFont(new java.awt.Font("맑은 고딕", 1, 13)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(51, 51, 51));
        jLabel14.setText("환자유형");

        jLabel15.setFont(new java.awt.Font("맑은 고딕", 1, 13)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(51, 51, 51));
        jLabel15.setText("입원날짜");

        TextField9.setBackground(new java.awt.Color(203, 209, 222));

        jLabel16.setFont(new java.awt.Font("맑은 고딕", 1, 13)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(51, 51, 51));
        jLabel16.setText("퇴원날짜");

        TextField10.setBackground(new java.awt.Color(203, 209, 222));

        TextField8.setFont(new java.awt.Font("맑은 고딕", 1, 13)); // NOI18N
        TextField8.setForeground(new java.awt.Color(51, 51, 51));
        TextField8.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "중증환자", "경증환자", "일반환자" }));

        jLabel17.setFont(new java.awt.Font("맑은 고딕", 1, 13)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(51, 51, 51));
        jLabel17.setText("나이");

        jLabel18.setFont(new java.awt.Font("맑은 고딕", 1, 13)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(51, 51, 51));
        jLabel18.setText("주민등록번호");

        TextField5.setBackground(new java.awt.Color(203, 209, 222));

        jLabel19.setFont(new java.awt.Font("맑은 고딕", 1, 13)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(51, 51, 51));
        jLabel19.setText("주소");

        TextField6.setBackground(new java.awt.Color(203, 209, 222));

        jLabel20.setFont(new java.awt.Font("맑은 고딕", 1, 13)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(51, 51, 51));
        jLabel20.setText("감염여부");

        TextField7.setFont(new java.awt.Font("맑은 고딕", 1, 13)); // NOI18N
        TextField7.setForeground(new java.awt.Color(51, 51, 51));
        TextField7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "확진", "비확진" }));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel16)
                    .addComponent(jLabel13)
                    .addComponent(jLabel11)
                    .addComponent(jLabel10)
                    .addComponent(jLabel17)
                    .addComponent(jLabel18)
                    .addComponent(jLabel19)
                    .addComponent(jLabel20)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                    .addComponent(TextField10)
                    .addComponent(TextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                    .addComponent(TextField4)
                    .addComponent(TextField1)
                    .addComponent(TextField5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TextField6)
                    .addComponent(TextField7, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TextField8, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TextField9))
                .addGap(0, 14, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(TextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(TextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("신규환자등록", jPanel5);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 329, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("알림 전송 메시지", jPanel7);

        jButton1.setFont(new java.awt.Font("맑은 고딕", 1, 16)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 51, 51));
        jButton1.setText("환자 정보 등록");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("맑은 고딕", 1, 16)); // NOI18N
        jButton2.setForeground(new java.awt.Color(51, 51, 51));
        jButton2.setText("환자 정보 제거");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("맑은 고딕", 1, 16)); // NOI18N
        jButton3.setForeground(new java.awt.Color(51, 51, 51));
        jButton3.setText("환자 정보 수정");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("맑은 고딕", 1, 16)); // NOI18N
        jButton4.setForeground(new java.awt.Color(51, 51, 51));
        jButton4.setText("환자 알림 전송");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("맑은 고딕", 1, 16)); // NOI18N
        jButton5.setForeground(new java.awt.Color(51, 51, 51));
        jButton5.setText("환자 정보 조회");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });

        jComboBox1.setFont(new java.awt.Font("맑은 고딕", 1, 16)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(51, 51, 51));
        jComboBox1.setMaximumRowCount(4);
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "중증환자", "경증환자", "일반환자" }));
        jComboBox1.setToolTipText("");

        jButton6.setFont(new java.awt.Font("맑은 고딕", 1, 16)); // NOI18N
        jButton6.setForeground(new java.awt.Color(51, 51, 51));
        jButton6.setText("처방전 처리");
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton6MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton6)
                .addGap(35, 35, 35))
        );

        jPanel8.setBackground(new java.awt.Color(37, 76, 155));
        jPanel8.setPreferredSize(new java.awt.Dimension(0, 3));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 654, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 654, Short.MAX_VALUE)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, 654, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTabbedPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void initPatient() {
        mildPatientlist = hospitalct.getMildPatientList("경증환자", hospitalprogram);
        severePatientlist = hospitalct.getSeverePatientList("중증환자", hospitalprogram);
        nonCoronaPatientlist = hospitalct.getNonCoronaPatientList("일반환자", hospitalprogram);
    }

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        //환자 정보 조회버튼을 클릭 시 환자의 정보가 테이블에 나타난다.
        if (mildPatientlist.size() != 0 || severePatientlist.size() != 0 || nonCoronaPatientlist.size() != 0) {
            patientType = String.valueOf(jComboBox1.getSelectedItem());
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel(); //해당 GUI 테이블을 사용하기 위한 모델을 생성
            Object[] row = new Object[10]; //열의 정보를 저장하기 위한 객체를 생성
            model.setNumRows(0); //테이블 초기화

            if (patientType.equals("경증환자")) {
                for (int i = 0; i < mildPatientlist.size(); i++) { //생성한 patientlist의 크기만큼 반복문 실행
                    if (String.valueOf(mildPatientlist.get(i).getPatientType()).equals(patientType)) {
                        row[0] = mildPatientlist.get(i).getPatientNumber(); //get메서드로 호출한 i번째 값을 저장
                        row[1] = mildPatientlist.get(i).getPatientName();
                        row[2] = mildPatientlist.get(i).getPatientSex();
                        row[3] = mildPatientlist.get(i).getPatientAge();
                        row[4] = mildPatientlist.get(i).getPatientPsnum();
                        row[5] = mildPatientlist.get(i).getPatientAddr();
                        row[6] = mildPatientlist.get(i).getPatientCheck();
                        row[7] = mildPatientlist.get(i).getPatientType();
                        row[8] = mildPatientlist.get(i).getPatientEnter();
                        row[9] = mildPatientlist.get(i).getPatientExit();

                        model.addRow(row); //해당 테이블에 행 단위로 추가
                    }
                }
            } else if (patientType.equals("중증환자")) {
                for (int i = 0; i < severePatientlist.size(); i++) { //생성한 patientlist의 크기만큼 반복문 실행
                    if (String.valueOf(severePatientlist.get(i).getPatientType()).equals(patientType)) {
                        row[0] = severePatientlist.get(i).getPatientNumber(); //get메서드로 호출한 i번째 값을 저장
                        row[1] = severePatientlist.get(i).getPatientName();
                        row[2] = severePatientlist.get(i).getPatientSex();
                        row[3] = severePatientlist.get(i).getPatientAge();
                        row[4] = severePatientlist.get(i).getPatientPsnum();
                        row[5] = severePatientlist.get(i).getPatientAddr();
                        row[6] = severePatientlist.get(i).getPatientCheck();
                        row[7] = severePatientlist.get(i).getPatientType();
                        row[8] = severePatientlist.get(i).getPatientEnter();
                        row[9] = severePatientlist.get(i).getPatientExit();

                        model.addRow(row); //해당 테이블에 행 단위로 추가
                    }
                }
            } else {
                for (int i = 0; i < nonCoronaPatientlist.size(); i++) { //생성한 patientlist의 크기만큼 반복문 실행
                    if (String.valueOf(nonCoronaPatientlist.get(i).getPatientType()).equals(patientType)) {
                        row[0] = nonCoronaPatientlist.get(i).getPatientNumber(); //get메서드로 호출한 i번째 값을 저장
                        row[1] = nonCoronaPatientlist.get(i).getPatientName();
                        row[2] = nonCoronaPatientlist.get(i).getPatientSex();
                        row[3] = nonCoronaPatientlist.get(i).getPatientAge();
                        row[4] = nonCoronaPatientlist.get(i).getPatientPsnum();
                        row[5] = nonCoronaPatientlist.get(i).getPatientAddr();
                        row[6] = nonCoronaPatientlist.get(i).getPatientCheck();
                        row[7] = nonCoronaPatientlist.get(i).getPatientType();
                        row[8] = nonCoronaPatientlist.get(i).getPatientEnter();
                        row[9] = nonCoronaPatientlist.get(i).getPatientExit();

                        model.addRow(row); //해당 테이블에 행 단위로 추가
                    }
                }
            }
            if (model.getRowCount() != 0) {
                JOptionPane.showMessageDialog(null, model.getRowCount() + "건의 환자가 조회되었습니다.");
            } else {
                JOptionPane.showMessageDialog(null, "등록된 환자가 존재하지 않습니다.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "등록된 환자가 존재하지 않습니다.");
        }
    }//GEN-LAST:event_jButton5MouseClicked

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        //조회된 테이블의 정보를 클릭하게 되면 화면 하단 상세설명에 환자에 대한 정보를 확인할 수 있다.

        int selectedRow = jTable1.getSelectedRow(); //selectedRow에 테이블의 선택된 열을 저장
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel(); //해당 GUI 테이블을 사용하기 위한 모델을 생성
        TextField11.setText(model.getValueAt(selectedRow, 0).toString()); //GUI텍스트 필드에 해당 열의 정보를 저장
        TextField12.setText(model.getValueAt(selectedRow, 1).toString());
        TextField13.setText(model.getValueAt(selectedRow, 2).toString());
        TextField14.setText(model.getValueAt(selectedRow, 3).toString());
        TextField15.setText(model.getValueAt(selectedRow, 4).toString());
        TextField16.setText(model.getValueAt(selectedRow, 5).toString());
        TextField17.setText(model.getValueAt(selectedRow, 6).toString());
        TextField18.setText(model.getValueAt(selectedRow, 7).toString());
        TextField19.setText(model.getValueAt(selectedRow, 8).toString());
        TextField20.setText(model.getValueAt(selectedRow, 9).toString());
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        //환자정보를 입력한 후 등록버튼을 누를 시 데이터베이스 또는 배열에 저장된다.
        boolean check = false;

        patientType = String.valueOf(TextField8.getSelectedItem());
        patientCheck = String.valueOf(TextField7.getSelectedItem());

        patientnum = TextField1.getText(); //환자의 고유번호
        patientname = TextField2.getText(); //환자의 이름
        patientsex = TextField3.getText(); //환자의 성별
        patientage = TextField4.getText(); //환자의 나이
        patientpersonal = TextField5.getText(); //환자의 주민등록번호
        patientadder = TextField6.getText(); //환자의 주소
        patientcheck = patientCheck; //환자 감염여부
        patienttype = patientType; //환자 유형
        patiententer = TextField9.getText();; //환자 입원 날짜
        patientexit = TextField10.getText();; //환자 퇴원 날짜

        check = hospitalct.patientRegist(patientnum, patientname, patientsex, patientage, patientpersonal, patientadder, patientcheck, patienttype, patiententer, patientexit);

        if (!(TextField1.getText().equals("") || TextField2.getText().equals("") || TextField3.getText().equals("") || TextField4.getText().equals("") || TextField5.getText().equals("") || TextField6.getText().equals("") || TextField9.getText().equals("") || TextField10.getText().equals(""))) {
            if (patientType == "경증환자") {
                MildPatient = new MildPatient(hospitalprogram, patientnum, patientname, patientsex, patientage, patientpersonal, patientadder, patientcheck, patienttype, patiententer, patientexit);
                mildPatientlist.add(MildPatient); //patientlist에 생성한 MildPatient객체를 추가
                //JOptionPane.showMessageDialog(null, TextField2.getText() + "님 신규 등록이 완료되었습니다.");
            } else if (patientType == "중증환자") {
                SeverePatient = new SeverePatient(hospitalprogram, patientnum, patientname, patientsex, patientage, patientpersonal, patientadder, patientcheck, patienttype, patiententer, patientexit);
                severePatientlist.add(SeverePatient); //patientlist에 생성한 SeverePatient객체를 추가
                //JOptionPane.showMessageDialog(null, TextField2.getText() + "님 신규 등록이 완료되었습니다.");
            } else {
                NonCoronaPatient = new NonCoronaPatient(hospitalprogram, patientnum, patientname, patientsex, patientage, patientpersonal, patientadder, patientcheck, patienttype, patiententer, patientexit);
                nonCoronaPatientlist.add(NonCoronaPatient); //patientlist에 생성한 NonCoronaPatient객체를 추가
                //JOptionPane.showMessageDialog(null, TextField2.getText() + "님 신규 등록이 완료되었습니다.");
            }
        }

        if (check == true) {
            //해당 텍스트필드를 초기화하기위해 설정
            TextField1.setText("");
            TextField2.setText("");
            TextField3.setText("");
            TextField4.setText("");
            TextField5.setText("");
            TextField6.setText("");
            TextField9.setText("");
            TextField10.setText("");
        }/*else {
            JOptionPane.showMessageDialog(null, "모든 항목을 입력해주세요.");
        }*/
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        //테이블에 선택된 열의 환자 정보를 제거하기위한 버튼
        int selectedRow = jTable1.getSelectedRow();
        patientType = String.valueOf(jComboBox1.getSelectedItem());

        if (jTable1.getRowCount() != 0) {
            if (patientType == "경증환자") {
                JOptionPane.showMessageDialog(null, mildPatientlist.get(selectedRow).getPatientName() + "님 등록제거가 완료되었습니다.");
                mildPatientlist.get(selectedRow).removePatient();
                hospitalct.patientRemove(mildPatientlist.get(selectedRow).getPatientNumber());
                mildPatientlist.remove(selectedRow);

                DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                Object[] row = new Object[10];
                model.setNumRows(0); //테이블 초기화
                for (int i = 0; i < mildPatientlist.size(); i++) {
                    row[0] = mildPatientlist.get(i).getPatientNumber(); //get메서드로 호출한 i번째 값을 저장
                    row[1] = mildPatientlist.get(i).getPatientName();
                    row[2] = mildPatientlist.get(i).getPatientSex();
                    row[3] = mildPatientlist.get(i).getPatientAge();
                    row[4] = mildPatientlist.get(i).getPatientPsnum();
                    row[5] = mildPatientlist.get(i).getPatientAddr();
                    row[6] = mildPatientlist.get(i).getPatientCheck();
                    row[7] = mildPatientlist.get(i).getPatientType();
                    row[8] = mildPatientlist.get(i).getPatientEnter();
                    row[9] = mildPatientlist.get(i).getPatientExit();

                    model.addRow(row); //해당 테이블에 행 단위로 추가
                }
            } else if (patientType == "중증환자") {
                JOptionPane.showMessageDialog(null, severePatientlist.get(selectedRow).getPatientName() + "님 등록제거가 완료되었습니다.");
                severePatientlist.get(selectedRow).removePatient();
                hospitalct.patientRemove(severePatientlist.get(selectedRow).getPatientNumber());
                severePatientlist.remove(selectedRow);

                DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                Object[] row = new Object[10];
                model.setNumRows(0); //테이블 초기화
                for (int i = 0; i < severePatientlist.size(); i++) {
                    row[0] = severePatientlist.get(i).getPatientNumber(); //get메서드로 호출한 i번째 값을 저장
                    row[1] = severePatientlist.get(i).getPatientName();
                    row[2] = severePatientlist.get(i).getPatientSex();
                    row[3] = severePatientlist.get(i).getPatientAge();
                    row[4] = severePatientlist.get(i).getPatientPsnum();
                    row[5] = severePatientlist.get(i).getPatientAddr();
                    row[6] = severePatientlist.get(i).getPatientCheck();
                    row[7] = severePatientlist.get(i).getPatientType();
                    row[8] = severePatientlist.get(i).getPatientEnter();
                    row[9] = severePatientlist.get(i).getPatientExit();

                    model.addRow(row); //해당 테이블에 행 단위로 추가
                }
            } else {
                JOptionPane.showMessageDialog(null, nonCoronaPatientlist.get(selectedRow).getPatientName() + "님 등록제거가 완료되었습니다.");
                nonCoronaPatientlist.get(selectedRow).removePatient();
                hospitalct.patientRemove(nonCoronaPatientlist.get(selectedRow).getPatientNumber());
                nonCoronaPatientlist.remove(selectedRow);

                DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                Object[] row = new Object[10];
                model.setNumRows(0); //테이블 초기화
                for (int i = 0; i < nonCoronaPatientlist.size(); i++) {
                    row[0] = nonCoronaPatientlist.get(i).getPatientNumber(); //get메서드로 호출한 i번째 값을 저장
                    row[1] = nonCoronaPatientlist.get(i).getPatientName();
                    row[2] = nonCoronaPatientlist.get(i).getPatientSex();
                    row[3] = nonCoronaPatientlist.get(i).getPatientAge();
                    row[4] = nonCoronaPatientlist.get(i).getPatientPsnum();
                    row[5] = nonCoronaPatientlist.get(i).getPatientAddr();
                    row[6] = nonCoronaPatientlist.get(i).getPatientCheck();
                    row[7] = nonCoronaPatientlist.get(i).getPatientType();
                    row[8] = nonCoronaPatientlist.get(i).getPatientEnter();
                    row[9] = nonCoronaPatientlist.get(i).getPatientExit();

                    model.addRow(row); //해당 테이블에 행 단위로 추가
                }
            }

            TextField11.setText("");
            TextField12.setText("");
            TextField13.setText("");
            TextField14.setText("");
            TextField15.setText("");
            TextField16.setText("");
            TextField17.setText("");
            TextField18.setText("");
            TextField19.setText("");
            TextField20.setText("");
        } else {
            JOptionPane.showMessageDialog(null, "제거할 환자를 선택해주세요.");
        }
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        //등록된 환자들에게 공지사항과 같은 메시지를 전달할때 버튼을 클릭
        hospitalprogram.setText(jTextArea1.getText());
        hospitalprogram.setPatientType(String.valueOf(jComboBox1.getSelectedItem()));
        JOptionPane.showMessageDialog(null, String.valueOf(jComboBox1.getSelectedItem()) + "에게 전송될 메시지 내용: " + jTextArea1.getText());
        hospitalprogram.notifyToPatient();
        jTextArea1.setText("");
    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        //등록된 환자의 정보를 수정할때 해당 버튼을 클릭하면 정보를 수정할 수 있다.
        patientType = String.valueOf(jComboBox1.getSelectedItem());
        int selectedRow = jTable1.getSelectedRow(); //selectedRow에 테이블의 선택된 열을 저장

        patientnum = TextField11.getText(); //환자의 고유번호
        patientadder = TextField16.getText(); //환자의 주소
        patientcheck = TextField17.getText(); //환자 감염여부
        patienttype = TextField18.getText(); //환자 입원 병원
        patientexit = TextField20.getText(); //환자 퇴원 날짜

        if (jTable1.getRowCount() != 0) {
            if (patientType.equals("경증환자")) {
                if (!(patientadder.equals("") || patientcheck.equals("") || patienttype.equals("") || patientexit.equals(""))) {
                    mildPatientlist.get(selectedRow).setPatientAddr(patientadder);
                    mildPatientlist.get(selectedRow).setPatientCheck(patientcheck);
                    mildPatientlist.get(selectedRow).setPatientType(patienttype);
                    mildPatientlist.get(selectedRow).setPatientExit(patientexit);
                    hospitalct.patientUpdate(patientnum, patientadder, patientcheck, patienttype, patientexit);

                    JOptionPane.showMessageDialog(null, TextField12.getText() + "님 정보수정이 완료되었습니다.");

                    DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                    Object[] row = new Object[10];
                    model.setNumRows(0); //테이블 초기화
                    for (int i = 0; i < mildPatientlist.size(); i++) {
                        row[0] = mildPatientlist.get(i).getPatientNumber(); //get메서드로 호출한 i번째 값을 저장
                        row[1] = mildPatientlist.get(i).getPatientName();
                        row[2] = mildPatientlist.get(i).getPatientSex();
                        row[3] = mildPatientlist.get(i).getPatientAge();
                        row[4] = mildPatientlist.get(i).getPatientPsnum();
                        row[5] = mildPatientlist.get(i).getPatientAddr();
                        row[6] = mildPatientlist.get(i).getPatientCheck();
                        row[7] = mildPatientlist.get(i).getPatientType();
                        row[8] = mildPatientlist.get(i).getPatientEnter();
                        row[9] = mildPatientlist.get(i).getPatientExit();

                        model.addRow(row); //해당 테이블에 행 단위로 추가
                    }
                }
            } else if (patientType.equals("중증환자")) {
                if (!(patientadder.equals("") || patientcheck.equals("") || patienttype.equals("") || patientexit.equals(""))) {
                    severePatientlist.get(selectedRow).setPatientAddr(patientadder);
                    severePatientlist.get(selectedRow).setPatientCheck(patientcheck);
                    severePatientlist.get(selectedRow).setPatientType(patienttype);
                    severePatientlist.get(selectedRow).setPatientExit(patientexit);
                    hospitalct.patientUpdate(patientnum, patientadder, patientcheck, patienttype, patientexit);

                    JOptionPane.showMessageDialog(null, TextField12.getText() + "님 정보수정이 완료되었습니다.");

                    DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                    Object[] row = new Object[10];
                    model.setNumRows(0); //테이블 초기화
                    for (int i = 0; i < severePatientlist.size(); i++) {
                        row[0] = severePatientlist.get(i).getPatientNumber(); //get메서드로 호출한 i번째 값을 저장
                        row[1] = severePatientlist.get(i).getPatientName();
                        row[2] = severePatientlist.get(i).getPatientSex();
                        row[3] = severePatientlist.get(i).getPatientAge();
                        row[4] = severePatientlist.get(i).getPatientPsnum();
                        row[5] = severePatientlist.get(i).getPatientAddr();
                        row[6] = severePatientlist.get(i).getPatientCheck();
                        row[7] = severePatientlist.get(i).getPatientType();
                        row[8] = severePatientlist.get(i).getPatientEnter();
                        row[9] = severePatientlist.get(i).getPatientExit();

                        model.addRow(row); //해당 테이블에 행 단위로 추가
                    }
                }
            } else {
                if (!(patientadder.equals("") || patientcheck.equals("") || patienttype.equals("") || patientexit.equals(""))) {
                    nonCoronaPatientlist.get(selectedRow).setPatientAddr(patientadder);
                    nonCoronaPatientlist.get(selectedRow).setPatientCheck(patientcheck);
                    nonCoronaPatientlist.get(selectedRow).setPatientType(patienttype);
                    nonCoronaPatientlist.get(selectedRow).setPatientExit(patientexit);
                    hospitalct.patientUpdate(patientnum, patientadder, patientcheck, patienttype, patientexit);

                    JOptionPane.showMessageDialog(null, TextField12.getText() + "님 정보수정이 완료되었습니다.");

                    DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                    Object[] row = new Object[10];
                    model.setNumRows(0); //테이블 초기화
                    for (int i = 0; i < nonCoronaPatientlist.size(); i++) {
                        row[0] = nonCoronaPatientlist.get(i).getPatientNumber(); //get메서드로 호출한 i번째 값을 저장
                        row[1] = nonCoronaPatientlist.get(i).getPatientName();
                        row[2] = nonCoronaPatientlist.get(i).getPatientSex();
                        row[3] = nonCoronaPatientlist.get(i).getPatientAge();
                        row[4] = nonCoronaPatientlist.get(i).getPatientPsnum();
                        row[5] = nonCoronaPatientlist.get(i).getPatientAddr();
                        row[6] = nonCoronaPatientlist.get(i).getPatientCheck();
                        row[7] = nonCoronaPatientlist.get(i).getPatientType();
                        row[8] = nonCoronaPatientlist.get(i).getPatientEnter();
                        row[9] = nonCoronaPatientlist.get(i).getPatientExit();

                        model.addRow(row); //해당 테이블에 행 단위로 추가
                    }
                }
            }

            TextField11.setText("");
            TextField12.setText("");
            TextField13.setText("");
            TextField14.setText("");
            TextField15.setText("");
            TextField16.setText("");
            TextField17.setText("");
            TextField18.setText("");
            TextField19.setText("");
            TextField20.setText("");
        } else {
            JOptionPane.showMessageDialog(null, "정보를 수정할 환자를 선택해주세요.");
        }
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseClicked
        //처방전 처리를 위한 이벤트

        int selectedRow = jTable1.getSelectedRow(); //selectedRow에 테이블의 선택된 열을 저장
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel(); //해당 GUI 테이블을 사용하기 위한 모델을 생성
        patientName = (model.getValueAt(selectedRow, 1).toString()); //GUI텍스트 필드에 해당 열의 정보를 저장
        patientPsnum = (model.getValueAt(selectedRow, 4).toString()); //GUI텍스트 필드에 해당 열의 정보를 저장
        patientEnter = (model.getValueAt(selectedRow, 8).toString());
        patientExit = (model.getValueAt(selectedRow, 9).toString());
        prescriptionScene pff;
        try {
            pff = new prescriptionScene();
            pff.setVisible(true); //ProfessorForm을 화면에 띄운다.
            pff.pack();
            pff.setLocationRelativeTo(null); //화면을 가운데로 고정
            pff.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        } catch (CloneNotSupportedException ex) {
            Logger.getLogger(ManagementProgram.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButton6MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ManagementProgram.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManagementProgram.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManagementProgram.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManagementProgram.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManagementProgram().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TextField1;
    private javax.swing.JTextField TextField10;
    private javax.swing.JTextField TextField11;
    private javax.swing.JTextField TextField12;
    private javax.swing.JTextField TextField13;
    private javax.swing.JTextField TextField14;
    private javax.swing.JTextField TextField15;
    private javax.swing.JTextField TextField16;
    private javax.swing.JTextField TextField17;
    private javax.swing.JTextField TextField18;
    private javax.swing.JTextField TextField19;
    private javax.swing.JTextField TextField2;
    private javax.swing.JTextField TextField20;
    private javax.swing.JTextField TextField3;
    private javax.swing.JTextField TextField4;
    private javax.swing.JTextField TextField5;
    private javax.swing.JTextField TextField6;
    private javax.swing.JComboBox<String> TextField7;
    private javax.swing.JComboBox<String> TextField8;
    private javax.swing.JTextField TextField9;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
