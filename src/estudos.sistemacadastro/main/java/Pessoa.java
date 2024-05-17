import java.io.File;

public class Pessoa {
    private static int count = 1;

    private String nomeCompleto;
    private String email;
    private int idade;
    private double altura;

    public Pessoa(String nomeCompleto, String email, int idade, double altura) {
        this.nomeCompleto = nomeCompleto;
        this.email = email;
        this.idade = idade;
        this.altura = altura;

        try {
            File file = new File(count + " - " + nomeCompleto);
            boolean exists = file.exists();
            if (!exists) {
                file.createNewFile();
                count++;
            }else{
                System.out.println("Pessoa " + nomeCompleto + " já existe!");
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public String getEmail() {
        return email;
    }

    public int getIdade() {
        return idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
