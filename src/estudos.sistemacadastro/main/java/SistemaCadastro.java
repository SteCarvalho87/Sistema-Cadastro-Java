import java.io.*;
import java.util.Scanner;

public class SistemaCadastro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        File file = new File("formulario.txt");

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
            while ((line= bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e){
            e.printStackTrace();
        }

    }
}