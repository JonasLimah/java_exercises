
import section_10.OOP.Employer;
import section_10.OOP.Person;
import section_10.OOP.Tenant;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

//criar uma lista de empregados  solicitar o id para dar um aumento no salario do funcionario
public class Main {

    public static <e> void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Quantos empregados vão ser registrado?");
        int numberEmployers = input.nextInt();
        List<Employer> listEmployers = new ArrayList<>();
        for (int i = 0; i < numberEmployers; i++) {
            input.nextLine();
            System.out.println("Empregado #"+(i+1));
            System.out.print("nome: ");
            String name = input.nextLine();
            System.out.print("salario: ");
            double salary = input.nextDouble();
            Employer employer = new Employer(i,name,salary);
            listEmployers.add(i, employer);

        }
        System.out.println("Digite o id do funcionario que vai aumentar o salario: ");
        int id = input.nextInt();
        //a linha 35 serve para encontrar um empregado baseado no id. fazendo filtragem na lista listEmployers
        Employer findEmployer = listEmployers.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        try {
            if(findEmployer.getId() == id){
                System.out.println("Digite quantos porcento voce vai aumentar: ");
                double percent  = input.nextDouble();
                double newSalary = findEmployer.getSalary();
                newSalary = newSalary+(newSalary*percent/100);
                findEmployer.setSalary(newSalary);
                System.out.printf("o novo salalario do funcionario(a) %s é R$ %.2f",findEmployer.getName(),findEmployer.getSalary());
            }
        } catch(NullPointerException nullPointerException){
           System.out.println("Empregado não encontrado");
       }
        input.close();

    }

}

