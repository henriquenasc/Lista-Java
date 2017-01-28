package lista15q02;
import java.util.Scanner;

public class Lista15Q02 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int max = 100;
        Produtos p[] = new Produtos[max];
        Produtos pro = new Produtos();
        
        int op;
        int indice = 0;
        
        do {
            System.out.println("1 - cadastrar");
            System.out.println("2 - listar");
            System.out.println("3 - consultar");
            System.out.println("4 - alterar");
            System.out.println("5 - remover");
            System.out.println("6 - sair");
            System.out.print("escolha: ");
            op = scan.nextInt();
            
            switch(op){
                case 1:
                    if(indice < max){
                        pro = new Produtos();
                        
                        System.out.print("código do produto: ");
                        String cod = scan.next();
                        pro.setCodigo(cod);
                        
                        System.out.print("nome do fornecedor: ");
                        String nFornecedor = scan.next();
                        pro.setNomeFornecedor(nFornecedor);
                        
                        System.out.print("descrição: ");
                        String desc = scan.next();
                        pro.setDescricao(desc);
                        
                        System.out.print("quantidade mínima: ");
                        int qntMin = scan.nextInt();
                        pro.setQntMinima(qntMin);
                        
                        System.out.print("quantidade real: ");
                        int qntReal = scan.nextInt();
                        pro.setQntReal(qntReal);
                        
                        p[indice] = pro;
                        indice++;
                    }else{
                        System.out.println("");
                        System.out.println("lista de produtos cheia");
                        System.out.println("");
                    }
                    break;
                case 2:
                    if(indice > 0){
                        for(int i = 0; i < indice; i++){
                            System.out.println("código - " + p[i].getCodigo());
                            System.out.println("nome do fornecedor - " + p[i].getNomeFornecedor());
                            System.out.println("descrição - " + p[i].getDescricao());
                            System.out.println("quantidade mínima - " + p[i].getQntMinima());
                            System.out.println("quantidade real - " + p[i].getQntReal());
                        }
                    }else{
                        System.out.println("");
                        System.out.println("lista de produtos vazia");
                        System.out.println(""); 
                    }
                    break;
                case 3:
                    if(indice > 0){
                        System.out.print("digite o código do produto: ");
                        String codigo = scan.next();
                        
                        for (int i = 0; i < indice; i++) {
                            if(codigo.equals(p[i].getCodigo())){
                                int find = i;
                                
                                System.out.println("código - " + p[find].getCodigo());
                                System.out.println("nome do fornecedor - " + p[find].getNomeFornecedor());
                                System.out.println("descrição - " + p[find].getDescricao());
                                System.out.println("quantidade mínima - " + p[find].getQntMinima());
                                System.out.println("quantidade real - " + p[find].getQntReal());
                            }
                        }
                    }else{
                        System.out.println("");
                        System.out.println("lista de produtos vazia");
                        System.out.println(""); 
                    }
                    break;
                case 4:
                    if(indice > 0){
                        System.out.print("digite o código do produto: ");
                        String codigo = scan.next();
                        
                        for (int i = 0; i < indice; i++) {
                            if(codigo.equals(p[i].getCodigo())){
                                
                                System.out.print("código do produto: ");
                                String cod = scan.next();
                                pro.setCodigo(cod);

                                System.out.print("nome do fornecedor: ");
                                String nFornecedor = scan.next();
                                pro.setNomeFornecedor(nFornecedor);

                                System.out.print("descrição: ");
                                String desc = scan.next();
                                pro.setDescricao(desc);

                                System.out.print("quantidade mínima: ");
                                int qntMin = scan.nextInt();
                                pro.setQntMinima(qntMin);

                                System.out.print("quantidade real: ");
                                int qntReal = scan.nextInt();
                                pro.setQntReal(qntReal);
                                
                                System.out.println("dados modificados com sucesso");
                            }
                        }
                    }else{
                        System.out.println("");
                        System.out.println("lista de produtos vazia");
                        System.out.println(""); 
                    }
                    break;
                case 5:
                    if(indice > 0){
                        System.out.print("digite o código do produto para remove-lo: ");
                        String cod = scan.next();
                        
                        for (int i = 0; i < indice; i++) {
                            if(cod.equals(p[i].getCodigo())){
                                p[i] = p[i + 1];
                            }
                        }
                        indice--;
                    }else{
                        System.out.println("");
                        System.out.println("lista de produtos vazia");
                        System.out.println(""); 
                    }
                    break;
                case 6:
                    break;
                default:
                    System.out.println("opção inválida");
            }
        } while (op != 6);
        
    }
    
}
