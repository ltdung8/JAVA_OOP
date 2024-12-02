package JavaOOP_1;

public class NhanVien {
    public String name = "Le Thi Dung";
    public int age = 26;
    private String address;
    private String phone;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    public void getInfor() {
        System.out.println("Thong tin co ban cua nhan vien: ");
        System.out.println(name + " , age: " + age);
        System.out.println(address);
        System.out.println(phone);
    }

    public static void main(String[] args) {
        NhanVien nhanVien = new NhanVien();
        nhanVien.setAddress("Da Nang");
        nhanVien.setPhone("1234567890");
        nhanVien.getInfor();

    }

}
