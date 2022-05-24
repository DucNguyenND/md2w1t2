package QLKS;

public class KhachSan {
    private String loaiPhong;
    private double price;
    private String address;

    public KhachSan(String loaiPhong, double price, String address) {
        this.loaiPhong = loaiPhong;
        this.price = price;
        this.address = address;
    }

    public KhachSan() {
    }

    public String getLoaiPhong() {
        return loaiPhong;
    }

    public void setLoaiPhong(String loaiPhong) {
        this.loaiPhong = loaiPhong;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "KhachSan{" +
                "loaiPhong='" + loaiPhong + '\'' +
                ", price=" + price +
                ", address='" + address + '\'' +
                '}';
    }
}
