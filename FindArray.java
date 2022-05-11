import java.util.Scanner;

public class FindArray {
    public static void main(String[] args) {
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhập tên học sinh: ");
        String name=sc.nextLine();
        boolean check=false;
        for (int i = 0; i < students.length; i++) {
            if (name.equals(students[i])){
                System.out.println("Học sinh ở vị trí số: "+ (i+1));
                check=true;
                break;
            }
        }
        if (!check) System.out.println("Không có học sinh này");
    }
}
