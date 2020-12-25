package com.example.hoaquaadapter;

public class HoaQua {
    private String  ten,mota;
    private float gia, chatluong;
    private int anh;

    public HoaQua(String ten, String mota, float gia, float chatluong, int anh) {
        this.ten = ten;
        this.mota = mota;
        this.gia = gia;
        this.chatluong = chatluong;
        this.anh = anh;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    public float getGia() {
        return gia;
    }

    public void setGia(float gia) {
        this.gia = gia;
    }

    public float getChatluong() {
        return chatluong;
    }

    public void setChatluong(float chatluong) {
        this.chatluong = chatluong;
    }

    public int getAnh() {
        return anh;
    }

    public void setAnh(int anh) {
        this.anh = anh;
    }
}

