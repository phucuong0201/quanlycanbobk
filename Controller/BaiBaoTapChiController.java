/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.BaiBaoTapChi;
import Model.GiangVien_TapChi;
import ModelDAO.BaiBaoTapChiDAO;
import View.ChangeView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 *
 * @author dinhq
 */
public class BaiBaoTapChiController extends CheckEmpty{
    BaiBaoTapChiDAO bbd = new BaiBaoTapChiDAO();
    
    public ChangeView cw;
    public BaiBaoTapChi bb;
    public GiangVien_TapChi gvtc;
    
    ArrayList<BaiBaoTapChi> listbb = new ArrayList<>();
    ArrayList<GiangVien_TapChi> listgvtc = new ArrayList<>();
    Insertlog isl = new Insertlog();
    
    public BaiBaoTapChiController(ChangeView cw, BaiBaoTapChi bb,GiangVien_TapChi gvtc, BaiBaoTapChiDAO bbd) {
        this.bb = bb;
        this.gvtc = gvtc;
        this.bbd = bbd;
        this.cw = cw;
        this.cw.AddBBBtnActionListener(new BaiBaoTapChiController.AddBaiBaoListener());
        this.cw.UpdateBBBtnActionListener(new BaiBaoTapChiController.UpdateBaiBaoListener());
        this.cw.DelBBBtnActionListener(new BaiBaoTapChiController.DelBaiBaoListener());
        BindingBaiBao();
    }

    private void BindingBaiBao(){
        cw.BindingBB(bbd.loadTabelBaiBao_TapChi());
        cw.BindingGiangVien_BBTC(bbd.loadTableGiangVien_TapChi());
    }

    private  class DelBaiBaoListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            if(cw.RBtn_CB_BB.isSelected()){
                bbd.DelCanBo_TapChi(cw.CB_BB_TBL);
                isl.theQuery(null);
                cw.BindingGiangVien_BBTC(bbd.loadTableGiangVien_TapChi());
            }
            if(cw.RBtn_BBao.isSelected()){
                bbd.DelBaiBao_TapChi(cw.BaiBao_TBL);
                isl.theQuery("INSERT INTO Log (NoiDung) value('Xóa bài báo')");
                cw.BindingBB(bbd.loadTabelBaiBao_TapChi());
            }
           
        }
           
    }
    
    
    
    private  class UpdateBaiBaoListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            listbb = bb.getALL();
            listgvtc = gvtc.getALLGVBB();
            
            int row1 = cw.BaiBao_TBL.getSelectedRow();
            int row2 = cw.CB_BB_TBL.getSelectedRow();
            
            String Ma_BB = listbb.get(row1).getMa_BaiBao();
            String TenTapChi = cw.TxtTenTapChi.getText();
            String So = cw.TxtSo.getText();
            String ThoiGianXuatBan = cw.Cbx_Nam_BB.getSelectedItem().toString();
            String ChiSoISSN = cw.TxtChiSoISSN.getText();
            String HeSoIF = cw.TxtHeSoIF.getText();
           
            String Stt = listgvtc.get(row2).getStt();
            String Ma_bb = cw.CB_MaBB.getSelectedItem().toString();
            String Ma_cb = cw.CB_MaCB_BB.getSelectedItem().toString();
            
            if(cw.RBtn_BBao.isSelected()){
                bbd.UpdateBaiBaoTapChi(Ma_BB, TenTapChi, So, ThoiGianXuatBan, ChiSoISSN, HeSoIF);
                isl.theQuery("INSERT INTO Log (NoiDung) value('Cập nhật bài báo')");
                cw.BindingBB(bbd.loadTabelBaiBao_TapChi());
            }
            if(cw.RBtn_CB_BB.isSelected()){
                bbd.UpdateCanBo_TapChi(Stt,Ma_cb, Ma_bb);
                cw.BindingGiangVien_BBTC(bbd.loadTableGiangVien_TapChi());
            }
            
            
        }
    }
    


    private class AddBaiBaoListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {

            String Ma_BB = cw.TxtMaBaiBao.getText();
            String TenTapChi = cw.TxtTenTapChi.getText();
            String So = cw.TxtSo.getText();
            String ThoiGianXuatBan = cw.Cbx_Nam_BB.getSelectedItem().toString()+"-"+cw.Cbx_Thang_baiBao.getSelectedItem().toString()+"-"+"1";
            String ChiSoISSN = cw.TxtChiSoISSN.getText();
            String HeSoIF = cw.TxtHeSoIF.getText();
           
            String Stt = cw.Txt_Stt_BB.getText();
            String Ma_bb = cw.CB_MaBB.getSelectedItem().toString();
            String Ma_cb = cw.CB_MaCB_BB.getSelectedItem().toString();
           
            if(cw.RBtn_BBao.isSelected()){
                if (!checkEmpty(cw.TxtMaBaiBao, Ma_BB, "Mã Bài Báo")) {
                    return;
                }else {
                    bbd.AddBaiBaoTapChi(Ma_BB, TenTapChi, So, ThoiGianXuatBan, ChiSoISSN, HeSoIF);
                    isl.theQuery("INSERT INTO Log (NoiDung) value('Thêm mới bài báo')");
                    cw.BindingBB(bbd.loadTabelBaiBao_TapChi());
                }
            }
            if(cw.RBtn_CB_BB.isSelected()){
                if(!checkEmpty(cw.Txt_Stt_BB , Stt, "Số thứ tự")){
                    return;
                }else{
                    bbd.AddCanBo_TapChi(Stt,Ma_cb, Ma_bb);
                    cw.BindingGiangVien_BBTC(bbd.loadTableGiangVien_TapChi());   
                }
            }
            
        
        }
        
    } 
}
