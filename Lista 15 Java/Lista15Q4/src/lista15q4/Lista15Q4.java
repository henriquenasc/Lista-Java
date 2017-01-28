package lista15q4;
import java.util.Scanner;

public class Lista15Q4 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int max  = 20;
       
        Dados[] d = new Dados[max];
        Dados dd = new Dados();
        
        int indice = 0;
        int op;
        int contMulheres = 0;
        
        do {
            System.out.println("1 - cadastrar pessoas");
            System.out.println("2 - média salarial da população");
            System.out.println("3 - média número de filhos");
            System.out.println("4 - o maior e o menor salário");
            System.out.println("5 - mulheres salário inferior a R$ 300,00 e tenham mais de 2 filhos");
            System.out.println("6 - sair");
            System.out.print("escolha: ");
            op = scan.nextInt();
            
            switch(op){
                case 1:
                    if(indice < max){
                        dd = new Dados();
                        
                        System.out.print("nome: ");
                        String nome = scan.next();
                        dd.setNome(nome);
                        
                        System.out.print("idade: ");
                        int idade = scan.nextInt();
                        dd.setIdade(idade);
                        
                        System.out.print("sexo: (M/F)");
                        String sexo = scan.next().toLowerCase();
                        dd.setSexo(sexo);
                        
                        System.out.print("salário: ");
                        double sal = scan.nextDouble();
                        dd.setSalario(sal);
                        
                        System.out.print("filhos: ");
                        int filho = scan.nextInt();
                        dd.setQntFilhos(filho);
                        
                        d[indice] = dd;
                        indice++;
                        
                    }else{
                        System.out.println("");
                        System.out.println("número máximo de pessoas atingido!");
                        System.out.println("");
                    }
                    break;
                case 2:
                    double mediaSalario = 0;
                    double somaSalario = 0;
                    for (int i = 0; i < indice; i++) {
                        somaSalario = somaSalario + d[i].getSalario();
                    }
                    
                    mediaSalario = somaSalario / indice;
                    System.out.println("");
                    System.out.println("--------------------------------------------------");
                    System.out.println("a média salárial da população é " + mediaSalario);
                    System.out.println("--------------------------------------------------");
                    System.out.println("");
                    break;
                case 3:
                    double mediaNumeroFilhos = 0;
                    double somaFilhos = 0;
                    for (int i = 0; i < indice; i++) {
                        somaFilhos = somaFilhos + d[i].getQntFilhos();
                    }
                    mediaNumeroFilhos = somaFilhos / indice;
                    System.out.println("");
                    System.out.println("------------------------------------------------------");
                    System.out.println("a média de filhos por pessoa é " + mediaNumeroFilhos);
                    System.out.println("------------------------------------------------------");
                    System.out.println("");
                    break;
                case 4:
                    double maiorSalario = 0;
                    double menorSalario = 0;
                    for (int i = 0; i < indice; i++) {
                        
                        if(d[i].getSalario() > maiorSalario){
                            maiorSalario = d[i].getSalario();
                        }else{
                            menorSalario = d[i].getSalario();
                        }
                    }
                    
                    System.out.println("");
                    System.out.println("---------------------------------");
                    System.out.println("o maior salário: " + maiorSalario + " | menor salário: " + menorSalario);
                    System.out.println("---------------------------------");
                    System.out.println("");
                    break;
                case 5:
                    for (int i = 0; i < indice; i++) {
                        if(d[i].getSexo().equals("f") && d[i].getSalario() < 300 && d[i].getQntFilhos() > 2){
                            contMulheres++;
                        }
                    }
                    System.out.println("");
                    System.out.println("=================================================================================");
                    System.out.println("mulheres com salário menor que R$ 300,00 e com mais de 2 filhos ");
                    System.out.println("quantidade: " + contMulheres);
                    System.out.println("=================================================================================");
                    break;
                case 6:
                    break;
                default:
                    System.out.println("opção inválida");
            }
        } while (op != 6);
        
    }
    
}
