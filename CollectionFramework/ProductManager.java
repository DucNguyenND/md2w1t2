package CollectionFramework;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductManager {
    ArrayList<SanPham> sanpham=new ArrayList<SanPham>();
    Scanner sc=new Scanner(System.in);
    public void menu(){

        while (true) {
            System.out.println("1.Thêm sản phẩm");
            System.out.println("2. Sửa thông tin sản phẩm");
            System.out.println("3. Xóa sản phẩm");
            System.out.println("4. Hiển thị danh sách sản phẩm");
            System.out.println("5. Tìm kiếm sản phẩm");
            System.out.println("6. Sắp xếp sản phẩm");
            switch (Integer.parseInt(sc.nextLine())){
                case 1:
                    addSP();
                    break;
                case 2:
                    edit();
                    break;
                case 3:
                    delete();
                    break;
                case 4:
                    show();
                    break;
                case 5:
                    showsp();
                    break;
                case 6:
                    sort();
                    break;
            }
        }
    }
public SanPham creatSP(){
    System.out.println("Nhập ID sản phẩm:");
    int id=Integer.parseInt(sc.nextLine());
    System.out.println("Nhập tên sản phẩm:");
    String name=sc.nextLine();
    System.out.println("Nhập giá sản phẩm:");
    double price=Double.parseDouble(sc.nextLine());
    return new SanPham(id,name,price);
}
public void addSP(){
        sanpham.add(creatSP());
}
public int findidSP(int id){
        int index=-1;
    for (int i = 0; i < sanpham.size(); i++) {
        if (sanpham.get(i).getID()==id){
            index=i;
        }
    }
    return index;
}
public void edit(){
    System.out.println("Nhập ID sản phẩm:");
    int id=Integer.parseInt(sc.nextLine());
    if (findidSP(id)>=0){
        System.out.println("Nhập ID sản phẩm mới:");
        int newid=Integer.parseInt(sc.nextLine());
        System.out.println("Nhập tên sản phẩm mới:");
        String newname=sc.nextLine();
        System.out.println("Nhập giá sản phẩm mới:");
        double newprice=Double.parseDouble(sc.nextLine());
        sanpham.set(findidSP(id),new SanPham(newid,newname,newprice));
    }else System.out.println("Không có sản phẩm này");
}
public void delete(){
    System.out.println("Nhập ID sản phẩm cần xóa:");
    int id=Integer.parseInt(sc.nextLine());
    if (findidSP(id)>=0){
    sanpham.remove(findidSP(id));
    } else {
        System.out.println("Không có sản phẩm này");
    }
    }
public void show(){
    for (SanPham sp:sanpham) {
        System.out.println(sp);
    }
}
public int findNameSp() {
    System.out.println("Nhập tên sản phẩm:");
    String name = sc.nextLine();
    int check = -1;
    for (int i = 0; i < sanpham.size(); i++) {
        if (sanpham.get(i).getName().equals(name)) {
            check = i;
        }
    }
    return check;
}
public void showsp(){
        if (findNameSp()>=0){
            System.out.println(sanpham.get(findNameSp()));
        }else System.out.println("Không có sản phẩm này");
    }
    public void sort(){
        System.out.println("Menu:");
        System.out.println("1.Sắp xếp theo giá tăng dần");
        System.out.println("2.Sắp xếp theo giá giảm dần");
        switch (Integer.parseInt(sc.nextLine())){
            case 1:
                sanpham.sort(new SortMinToMax());
                break;
            case 2:
                sanpham.sort(new SortMaxToMin());
                break;
        }
        show();
    }
}
