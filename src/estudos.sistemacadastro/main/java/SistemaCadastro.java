import java.io.*;
import java.util.Scanner;

public class SistemaCadastro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        File file = new File("formulario.txt");
        Person person = new Person();

        /* Estrutura para escrever no arquivo
        try (FileWriter fileWriter = new FileWriter(file, true); BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)){
            bufferedWriter.write("Qual o seu nome completo?");

            fileWriter.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
        */

        try (FileReader fileReader = new FileReader(file); BufferedReader bufferedReader = new BufferedReader(fileReader)){
            String line;
            int count = 1;
            while ((line= bufferedReader.readLine()) != null) {
                System.out.println(line);
                switch (count){
                    case 1:
                        String fullName = scanner.nextLine();
                        person.setFullName(fullName);
                        break;
                    case 2:
                        String email = scanner.next();
                        person.setEmail(email);
                        break;
                    case 3:
                        int age = scanner.nextInt();
                        person.setAge(age);
                        break;
                    case 4:
                        //TODO: fazer um tratamento de erros aqui pois o Scanner só aceita valores decimais com vírgula. Ex 1,65
                        double height = scanner.nextDouble();
                        person.setHeight(height);
                        break;
                }
                count++;
            }
            System.out.println(person.toString());

        } catch (IOException e){
            e.printStackTrace();
        }

    }
}