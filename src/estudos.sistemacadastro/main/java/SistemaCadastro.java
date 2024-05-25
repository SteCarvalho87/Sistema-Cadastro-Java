import java.io.*;
import java.util.Scanner;

public class SistemaCadastro {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        File file = new File("formulario.txt");
        Person person = new Person();
        int options;
        int i = 0;
        do{
            System.out.println("Sistema de cadastros");
            System.out.println("Digite a opção desejada:");
            System.out.println("1 - Cadastrar o usuário");
            System.out.println("2 - Listar todos usuários cadastrados");
            System.out.println("3 - Cadastrar nova pergunta no formulário");
            System.out.println("4 - Deletar pergunta do formulário");
            System.out.println("5 - Pesquisar usuário por nome ou idade ou email");
            System.out.println("6 - Sair");

            options = input.nextInt();
            input.nextLine();

            switch (options){
                case 1:

                    try (FileReader fileReader = new FileReader(file); BufferedReader bufferedReader = new BufferedReader(fileReader)){
                        String line;
                        int count = 1;
                        while ((line= bufferedReader.readLine()) != null) {
                            System.out.println(line);
                            switch (count){
                                case 1:
                                    String fullName = input.nextLine();
                                    person.setFullName(fullName);
                                    break;
                                case 2:
                                    String email = input.next();
                                    person.setEmail(email);
                                    break;
                                case 3:
                                    int age = input.nextInt();
                                    person.setAge(age);
                                    break;
                                case 4:
                                    //TODO: fazer um tratamento de erros aqui pois o Scanner só aceita valores decimais com vírgula. Ex 1,65
                                    double height = input.nextDouble();
                                    person.setHeight(height);
                                    break;
                            }
                            count++;
                        }
                        System.out.println(person.toString());

                    } catch (IOException e){
                        e.printStackTrace();
                    }
                    File personFile = new File("C:\\Users\\ste_a\\OneDrive\\Documentos\\Java-workspace\\SistemaCadastro\\Cadastros",(i + 1)+ " - "+ person.getFullName().replaceAll("\\s","").toUpperCase() +".txt");
                    try {
                        personFile.createNewFile();
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                    try (FileWriter fileWriter = new FileWriter(personFile, true); BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)){
                        bufferedWriter.write(person.toString());

                        fileWriter.flush();

                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    i++;
                    break;

                case 2:
                    File directory = new File("C:\\Users\\ste_a\\OneDrive\\Documentos\\Java-workspace\\SistemaCadastro\\Cadastros\\");
                    File[] files = directory.listFiles((d, name)-> name.endsWith(".txt"));

                    if (files != null){
                        int j = 0;
                        for (File f : files) {
                            try (FileReader fr = new FileReader(files[j]); BufferedReader br = new BufferedReader(fr)) {
                                String line = br.readLine();
                                System.out.println((j + 1) + " - " + line);

                            } catch (IOException e) {
                                throw new RuntimeException(e);
                            }
                            j++;
                        }
                    }

                    break;

                case 3:

                    break;

                case 4:

                    break;

                case 5:

                    break;

                case 6:

                    break;

                default:
                    System.out.println("Opção inválida");
                    break;
            }

        //TODO: Colocar um press enter para continuar antes do proximo loop
        }while (options !=6);

    }
}