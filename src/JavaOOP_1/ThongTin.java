package JavaOOP_1;

public class ThongTin extends NhanVien {
    public static void main(String[] args) {
         NhanVien nhanVien = new NhanVien();
         nhanVien.setPhone("1234567890");
         nhanVien.setAddress("Quang Nam");
         nhanVien.getInfor();
         nhanVien.setAddress("Dien AN- Dien Ban - Quang Nam");
        System.out.println("Que quan tai VN: " + nhanVien.getAddress());
    }
}
