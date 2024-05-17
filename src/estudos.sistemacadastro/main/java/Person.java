import java.io.File;

public class Person {
    private static int count = 1;

    private String fullName;
    private String email;
    private int age;
    private double height;

    public Person(String fullName, String email, int age, double height) {
        try {
            File file = new File(count + " - " + fullName);
            boolean exists = file.exists();
            if (!exists) {
                file.createNewFile();
                count++;
            }else{
                System.out.println("Pessoa " + fullName + " já existe!");
            }
        }catch(Exception e){
            e.printStackTrace();
        }
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
