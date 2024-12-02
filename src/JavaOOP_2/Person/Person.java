package JavaOOP_2.Person;

public class Person {
    public String name;
    public int age;
    public String gender;
    protected String address;
    protected String phone;

    public Person() {
        name = "Dung";
        age = 26;
        gender = "Female";
        address = "Danang";
        phone = "123123123";
    }
    public void getInformation() {
        System.out.println("The " + name + "'s information are below: ");
        System.out.println("name: " + name);
        System.out.println("age :" + age);
        System.out.println("gender: " + gender);
        System.out.println("Add: " + address);
        System.out.println("phone: " + phone);
    }

    private void getAddress() {
        System.out.println(address);
    }
    private void getAddressAndPhone() {
        System.out.println("add: " + address + ", phone: " +phone);
    }

    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person.name);
        System.out.println(person.age);
        System.out.println(person.phone);

        person.getAddress();
        person.getAddressAndPhone();
    }

}
