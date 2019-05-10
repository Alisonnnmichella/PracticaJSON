package PrimerEjercicio;

import com.google.gson.annotations.SerializedName;

public class Employee {
    @SerializedName("age")
    private int age;
    @SerializedName("first_name")
    private String name;
    @SerializedName("mail")
    private String email;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getMail() {
        return email;
    }

    public Employee(int age, String name, String mail) {
        this.age = age;
        this.name = name;
        this.email = mail;
    }
}
