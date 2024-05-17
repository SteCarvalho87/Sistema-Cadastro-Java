import java.io.File;

public class Person {
    private static int count = 1;

    private String fullName;
    private String email;
    private int age;
    private double height;

    @Override
    public String toString() {
        return "Nome Completo: " + fullName + System.lineSeparator() +
                "Email: " + email + System.lineSeparator() +
                "Idade: " + age + System.lineSeparator() +
                "Altura: " + height;
    }

    public String getFullName() {
        return fullName;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
