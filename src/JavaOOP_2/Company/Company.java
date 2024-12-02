package JavaOOP_2.Company;

import JavaOOP_2.Person.Person;

public class Company {
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person.name);
        System.out.println(person.age);
        System.out.println(person.gender);
//        System.out.println(person.address); k the goi address do da khai bao protected va khac package
    }
}
