import java.util.Scanner;

public class Crud{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		int max = 4;
		
		Conta conta[] = new Conta[max];
		Conta c = new Conta();
		
		int op;
		int indice = 0;

		do{
			System.out.println("1 - criar conta");
			System.out.println("2 - consultar conta");
			System.out.println("3 - sacar");
			System.out.println("4 - depositar");
			System.out.println("5 - sair");
			System.out.print("escolha: ");
			op = scan.nextInt();

			switch(op){
				case 1:
					if(indice < max){
                    	c = new Conta();
                    	System.out.println("Número da conta: ");
                    	String num = scan.next();
                    	c.setNumero(num);

                    	scan.nextLine();

                    	System.out.println("Saldo: ");
                    	double saldo = scan.nextDouble();
                    	c.setSaldo(saldo);

                    	conta[indice] = c;
                    	indice++;
					}else{
						System.out.println("");
						System.out.println("Número limite total de contas atingido!");
						System.out.println("");
					}
					System.out.println("");
					break;
				
				case 2:
					if(indice >= 0){
						System.out.println("------------------------");
                    	System.out.print("Digite o número da conta por favor: ");
                    	String busca = scan.next();

                    	for(int i = 0; i < indice; i++){

                        	if(busca.equals(conta[i].getNumero())){
                            	int achou = i;
                            	System.out.println("número - " + conta[achou].getNumero());
                            	System.out.println("saldo - " + conta[achou].getSaldo());
                        	}
                    	}
					}else{
						System.out.println("");
						System.out.println("Nenhuma conta cadastrada no momento...");
						System.out.println("");
					}
					break;
				
				case 3:
					System.out.println("------------------------");
					System.out.print("Digite o número da conta: ");
					String busca = scan.next();

					for (int i = 0; i < indice; i++) {
						if(busca.equals(conta[i].getNumero())){
							System.out.print("valor do saque: ");
							double valor = scan.nextDouble();

							int achou = i;
							conta[achou].sacar(valor);
						}	
					}
					break;
				
				case 4:
					System.out.println("------------------------");
					System.out.print("Digite o número da conta: ");
					String find = scan.next();

					for (int i = 0; i < indice; i++){
						if(find.equals(conta[i].getNumero())){
							System.out.print("valor do deposito: ");
							double valor = scan.nextDouble();

							int achou = i;
							conta[achou].depositar(valor);
						}
					}
					break;
				
				default:
					System.out.println("Opção inválida");
			}
			System.out.println("------------------------");
		}while(op != 5);
	}
}