package SdNgoaiLe;
public class IllegalTriangleException {
    public void check(int a,int b, int c) throws TriangleEdgesException {
        if ( a+b<c||a+c<b||b+c<a){
            throw new TriangleEdgesException("Có lỗi xảy ra - Tổng 2 cạnh nhỏ hơn cạnh còn lại ");
        }
        else System.out.println(a + " " + b + " " + c + " là 3 cạnh của tam giác");
    }
}
