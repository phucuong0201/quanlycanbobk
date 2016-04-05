/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.CanBo;
import Model.Luong;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DINHQUY
 */
public class PhuPhiView extends javax.swing.JFrame {
    String s ="";
    String macb ="";
    CanBo cb = new CanBo();
    ArrayList<CanBo> listcb = new ArrayList<>();
    Luong lg = new Luong();
    ArrayList<Luong> listl = new ArrayList<>();
    
    /**
     * Creates new form PhuPhiView
     */
    public PhuPhiView() {
        initComponents();
        BindingMaCB();
        BindingCbx_TG();
    }
    public PhuPhiView(String n){
        s =n;
        initComponents();
        model = new DefaultTableModel();
    }
    private DefaultTableModel model;
    
    public void BindingMaCB(){
        listcb = cb.getALL();
        for (CanBo cb : listcb) {
            Cbx_MaCB.addItem(cb.getMa_CB());
        }
    }
    
    public void BindingCbx_TG(){
        for(int years=Calendar.getInstance().get(Calendar.YEAR);years>=1950;years--){
            
            Cbx_Nam_TGBD.addItem(years);
            
        }
        
        for(int months = 12; months > 0;months --){
            Cbx_Thang_TGBD.addItem(months);
        }
    }

    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        Txt_HoVaTen = new javax.swing.JTextField();
        Txt_LCB = new javax.swing.JTextField();
        Txt_HSL = new javax.swing.JTextField();
        Txt_PCCV = new javax.swing.JTextField();
        Txt_TienChamThi = new javax.swing.JTextField();
        Txt_Luong = new javax.swing.JTextField();
        Txt_DP = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        LB_Time = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Txt_CDP = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        Cbx_MaCB = new javax.swing.JComboBox();
        Cbx_Thang_TGBD = new javax.swing.JComboBox();
        Cbx_Nam_TGBD = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        Txt_PCCDanh = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        Txt_HeSoThamLien = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        Txt_PCGD = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        TxtTienNCKH = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        TxtTienGiangDay = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Luong_Thang_TBL = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Luong_Nam_TBL = new javax.swing.JTable();
        Back_Btn = new javax.swing.JButton();
        PanelTuyChonTinh = new javax.swing.JPanel();
        RBtn_1nguoi = new javax.swing.JRadioButton();
        Rbtn_NhieuNguoi = new javax.swing.JRadioButton();
        jPanel4 = new javax.swing.JPanel();
        GetData_Btn = new javax.swing.JButton();
        Tinh_Btn = new javax.swing.JButton();
        RefreshBtn = new javax.swing.JButton();
        Save_Btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        Txt_HoVaTen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_HoVaTenActionPerformed(evt);
            }
        });

        Txt_LCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_LCBActionPerformed(evt);
            }
        });

        Txt_HSL.setEditable(false);

        jLabel1.setText("Mã cán bộ");

        jLabel2.setText("Họ và tên");

        LB_Time.setText("Thời gian");

        jLabel4.setText("Lương cơ bản");

        jLabel5.setText("Hệ số lương");

        jLabel6.setText("Phụ cấp chức vụ");

        jLabel7.setText("Tiền Chấm Thi");

        jLabel8.setText("Tổng lương");

        jLabel9.setText("Đảng phí");

        jLabel10.setText("Công đoàn phí");

        Cbx_MaCB.setEnabled(false);
        Cbx_MaCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cbx_MaCBActionPerformed(evt);
            }
        });

        Cbx_Thang_TGBD.setEditable(true);
        Cbx_Thang_TGBD.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Tháng" }));

        Cbx_Nam_TGBD.setEditable(true);
        Cbx_Nam_TGBD.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Năm" }));

        jLabel11.setText("Phụ cấp chức danh");

        jLabel12.setText("Hệ số thâm niên");

        jLabel13.setText("Phụ cấp giảng dạy");

        jLabel14.setText("Tiền NCKH");

        jLabel15.setText("Tiền Giảng Dạy");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 29, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel4)
                            .addComponent(LB_Time)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(Cbx_Thang_TGBD, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Cbx_Nam_TGBD, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(Txt_HoVaTen)
                                .addComponent(Cbx_MaCB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(Txt_LCB, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Txt_HeSoThamLien, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(Txt_HSL, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(31, 31, 31))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Txt_CDP)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Txt_PCGD, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                            .addComponent(Txt_PCCDanh)
                            .addComponent(Txt_TienChamThi, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TxtTienNCKH)
                            .addComponent(TxtTienGiangDay, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(Txt_PCCV)))
                    .addComponent(Txt_DP)
                    .addComponent(Txt_Luong, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {Txt_PCCDanh, Txt_PCGD, Txt_TienChamThi});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {TxtTienGiangDay, TxtTienNCKH, Txt_PCCV});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {Txt_CDP, Txt_DP, Txt_Luong});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cbx_MaCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel11)
                    .addComponent(Txt_PCCDanh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(Txt_PCCV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Txt_HoVaTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel13)
                    .addComponent(Txt_PCGD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(TxtTienNCKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cbx_Thang_TGBD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cbx_Nam_TGBD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LB_Time)
                    .addComponent(jLabel7)
                    .addComponent(Txt_TienChamThi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(TxtTienGiangDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Txt_Luong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(Txt_LCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Txt_DP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(Txt_HSL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel12)
                    .addComponent(Txt_HeSoThamLien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Txt_CDP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Bảng tính lương", jPanel1);

        Luong_Thang_TBL.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(Luong_Thang_TBL);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1035, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 49, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Danh Sách Lương theo Tháng", jPanel2);

        Luong_Nam_TBL.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(Luong_Nam_TBL);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1035, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 48, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Danh sách Lương theo Năm", jPanel3);

        Back_Btn.setText("Quay Lại");
        Back_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Back_BtnActionPerformed(evt);
            }
        });

        PanelTuyChonTinh.setBorder(javax.swing.BorderFactory.createTitledBorder("Tùy chọn tính lương"));
        PanelTuyChonTinh.setEnabled(false);

        RBtn_1nguoi.setText("Tính 1 người");
        RBtn_1nguoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBtn_1nguoiActionPerformed(evt);
            }
        });

        Rbtn_NhieuNguoi.setText("Tính nhiều người");
        Rbtn_NhieuNguoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Rbtn_NhieuNguoiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelTuyChonTinhLayout = new javax.swing.GroupLayout(PanelTuyChonTinh);
        PanelTuyChonTinh.setLayout(PanelTuyChonTinhLayout);
        PanelTuyChonTinhLayout.setHorizontalGroup(
            PanelTuyChonTinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTuyChonTinhLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelTuyChonTinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(RBtn_1nguoi)
                    .addComponent(Rbtn_NhieuNguoi))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        PanelTuyChonTinhLayout.setVerticalGroup(
            PanelTuyChonTinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTuyChonTinhLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(RBtn_1nguoi)
                .addGap(18, 18, 18)
                .addComponent(Rbtn_NhieuNguoi)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Chức năng"));

        GetData_Btn.setText("Xem");
        GetData_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GetData_BtnActionPerformed(evt);
            }
        });

        Tinh_Btn.setText("Tính");
        Tinh_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tinh_BtnActionPerformed(evt);
            }
        });

        RefreshBtn.setText("Tải Lại");
        RefreshBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RefreshBtnActionPerformed(evt);
            }
        });

        Save_Btn.setText("Lưu");
        Save_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Save_BtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(GetData_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(89, 89, 89)
                .addComponent(Tinh_Btn)
                .addGap(92, 92, 92)
                .addComponent(RefreshBtn)
                .addGap(87, 87, 87)
                .addComponent(Save_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67))
        );

        jPanel4Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {RefreshBtn, Save_Btn, Tinh_Btn});

        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(RefreshBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Save_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Tinh_Btn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(GetData_Btn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jPanel4Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {RefreshBtn, Save_Btn});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelTuyChonTinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Back_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(PanelTuyChonTinh, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Back_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Back_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back_BtnActionPerformed

    }//GEN-LAST:event_Back_BtnActionPerformed

    private void RefreshBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RefreshBtnActionPerformed
    }//GEN-LAST:event_RefreshBtnActionPerformed

    private void Tinh_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tinh_BtnActionPerformed
            
    }//GEN-LAST:event_Tinh_BtnActionPerformed

    private void GetData_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GetData_BtnActionPerformed

    }//GEN-LAST:event_GetData_BtnActionPerformed

    private void Txt_LCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_LCBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_LCBActionPerformed

    private void Txt_HoVaTenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_HoVaTenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_HoVaTenActionPerformed

    private void Save_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Save_BtnActionPerformed

    }//GEN-LAST:event_Save_BtnActionPerformed

    private void Cbx_MaCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cbx_MaCBActionPerformed
//        Cbx_TGBD.removeAllItems();
//        CBx_TGKetThuc.removeAllItems();

    }//GEN-LAST:event_Cbx_MaCBActionPerformed

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_formKeyPressed

    private void RBtn_1nguoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBtn_1nguoiActionPerformed
        Rbtn_NhieuNguoi.setSelected(false);
    }//GEN-LAST:event_RBtn_1nguoiActionPerformed

    private void Rbtn_NhieuNguoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Rbtn_NhieuNguoiActionPerformed
        RBtn_1nguoi.setSelected(false);
    }//GEN-LAST:event_Rbtn_NhieuNguoiActionPerformed

    public void CBx_MaCbActionListener(ActionListener al){
        Cbx_MaCB.addActionListener(al);
    }
    
    public void GetDataBtnActionListener(ActionListener al){
        GetData_Btn.addActionListener(al);
    }

    public void TinhBtnActionListener(ActionListener al){
        Tinh_Btn.addActionListener(al);
    }
    
    public void RefreshBtnActionListener(ActionListener al){
        RefreshBtn.addActionListener(al);
    }
    
    public void SaveBtnActionListener(ActionListener al){
        Save_Btn.addActionListener(al);
    }
    
    public void BackBtnActionListenter(ActionListener al){
        Back_Btn.addActionListener(al);
    }
    
    
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
            java.util.logging.Logger.getLogger(PhuPhiView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PhuPhiView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PhuPhiView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PhuPhiView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PhuPhiView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton Back_Btn;
    public javax.swing.JComboBox Cbx_MaCB;
    public javax.swing.JComboBox Cbx_Nam_TGBD;
    public javax.swing.JComboBox Cbx_Thang_TGBD;
    public javax.swing.JButton GetData_Btn;
    private javax.swing.JLabel LB_Time;
    private javax.swing.JTable Luong_Nam_TBL;
    private javax.swing.JTable Luong_Thang_TBL;
    public javax.swing.JPanel PanelTuyChonTinh;
    public javax.swing.JRadioButton RBtn_1nguoi;
    public javax.swing.JRadioButton Rbtn_NhieuNguoi;
    public javax.swing.JButton RefreshBtn;
    public javax.swing.JButton Save_Btn;
    public javax.swing.JButton Tinh_Btn;
    private javax.swing.JTextField TxtTienGiangDay;
    public javax.swing.JTextField TxtTienNCKH;
    public javax.swing.JTextField Txt_CDP;
    public javax.swing.JTextField Txt_DP;
    public javax.swing.JTextField Txt_HSL;
    public javax.swing.JTextField Txt_HeSoThamLien;
    public javax.swing.JTextField Txt_HoVaTen;
    public javax.swing.JTextField Txt_LCB;
    public javax.swing.JTextField Txt_Luong;
    public javax.swing.JTextField Txt_PCCDanh;
    public javax.swing.JTextField Txt_PCCV;
    public javax.swing.JTextField Txt_PCGD;
    public javax.swing.JTextField Txt_TienChamThi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
