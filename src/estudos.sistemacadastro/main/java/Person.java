import java.io.File;

public class Person {
    private static int count = 1;

    private String fullName;
    private String email;
    private int age;
    private double height;

    public Person() {

        //TODO: queria criar o arquivo logo assim que fosse criado o objeto, verificar melhor forma de fazer isso
        try {
            File file = new File(count + " - " + this.fullName);
            file.createNewFile();
            count++;

        }catch(Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", height=" + height +
                '}';
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
