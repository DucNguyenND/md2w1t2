package QLKS;

import java.sql.Date;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class QuanLy {
    static ArrayList<KhachSan> phong=new ArrayList<KhachSan>();
    static ArrayList<Nguoi> nguoi=new ArrayList<Nguoi>();
    public static void main(String[] args) {


        Scanner sc=new Scanner(System.in);
        while (true){
        System.out.println("Menu");
        System.out.println("1.Tạo phòng mới");
        System.out.println("2.Tạo khách hàng mới");
        System.out.println("3.Hiển thị các phòng");
        System.out.println("4.Hiển thị khách hàng");
        System.out.println("5. Tìm kiếm khách hàng theo tên");
        switch (Integer.parseInt(sc.nextLine())){
            case 1:
                addKs();
                break;
            case 2:
                addNguoi();
                break;
            case 3:
                phong.sort(new SortKsByPrice());
                for (KhachSan phong:phong){
                    System.out.println(phong);;
                }
                break;
            case 4:
                System.out.println("1.Sắp xếp theo ID:");
                System.out.println("2.Sắp xếp theo năm sinh:");
                switch (Integer.parseInt(sc.nextLine())){
                    case 1:
                        nguoi.sort(new SortByid());
                        break;
                    case 2:
                        nguoi.sort(new SortByDate());
                        break;
                }
                for (Nguoi ng:nguoi) {
                    System.out.println(ng);
                }
            case 5:
                System.out.println("Nhập tên:");
                String name=sc.nextLine();
                findName(name);
        }
    }}
    public static KhachSan creat(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập loại phòng trọ");
        String loaiPhong=sc.nextLine();
        System.out.println("Nhập giá:");
        double price=Double.parseDouble(sc.nextLine());
        System.out.println("Nhập địa chỉ:");
        String anddress=sc.nextLine();
        return new KhachSan(loaiPhong,price,anddress);
    }
    public static void addKs(){
     phong.add(creat());
    }
    public static Nguoi creatNguoi(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập tên");
        String name=sc.nextLine();
        System.out.println("Nhập ngày sinh:");
        int day=Integer.parseInt(sc.nextLine());
        System.out.println("Nhập tháng sinh:");
        int mounth=Integer.parseInt(sc.nextLine());
        System.out.println("Nhập năm sinh:");
        int year=Integer.parseInt(sc.nextLine());
        System.out.println("Nhập ID:");
        int id=Integer.parseInt(sc.nextLine());
        return new Nguoi(name,new Date(year-1900,mounth-1,day),id);
    }
    public static void addNguoi(){
        nguoi.add(creatNguoi());
    }
public static void findName(String name){
        int number=0;
    for (int i = 0; i < nguoi.size(); i++) {
        if (nguoi.get(i).getName().equals(name)){
            number=i;
        }
    }
    System.out.println(nguoi.get(number).toString());
}
}
