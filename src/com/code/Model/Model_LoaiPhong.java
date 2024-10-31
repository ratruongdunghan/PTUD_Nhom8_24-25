/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.code.Model;

/**
 *
 * @author Admn
 */
public class Model_LoaiPhong {

    int maLP;
    String tenLP;
    double donGia;
    int soNguoi;
    String hinh;

    public Model_LoaiPhong() {
    }

    public Model_LoaiPhong(int maLP, String tenLP, double donGia, int soNguoi, String hinh) {
        this.maLP = maLP;
        this.tenLP = tenLP;
        this.donGia = donGia;
        this.soNguoi = soNguoi;
        this.hinh = hinh;
    }

    public int getMaLP() {
        return maLP;
    }

    public void setMaLP(int maLP) {
        this.maLP = maLP;
    }

    public String getTenLP() {
        return tenLP;
    }

    public void setTenLP(String tenLP) {
        this.tenLP = tenLP;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public int getSoNguoi() {
        return soNguoi;
    }

    public void setSoNguoi(int soNguoi) {
        this.soNguoi = soNguoi;
    }

    public String getHinh() {
        return hinh;
    }

    public void setHinh(String hinh) {
        this.hinh = hinh;
    }

}

