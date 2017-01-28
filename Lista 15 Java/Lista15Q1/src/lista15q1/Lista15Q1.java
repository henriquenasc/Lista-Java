package lista15q1;
import java.util.Scanner;
// autor: Henrique Nascimento
public class Lista15Q1{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		int max = 50;
		Funcionarios fun[] = new Funcionarios[max];
		Funcionarios f = new Funcionarios();

		int op;
		int indice = 0;

		do{
			System.out.println("1 - cadastrar");
			System.out.println("2 - listar");
			System.out.println("3 - consultar");
			System.out.println("4 - alterar");
			System.out.println("5 - deletar");
			System.out.println("6 - sair");
			System.out.print("escolha: ");
			op = scan.nextInt();

			System.out.println("");
			
			switch(op){
				case 1:
					System.out.println("--------------------------------------------");
					if(indice < max){
						f = new Funcionarios();

						System.out.print("nome: ");
						String nome = scan.next();
						f.setNome(nome);

						System.out.print("número da matricula: ");
						String nMat = scan.next();
						f.setNumeroMatricula(nMat);

						System.out.print("grau de escolaridade: (1, 2 ou 3) ");
						int grau = scan.nextInt();
						f.setGrauEscolaridade(grau);

						System.out.print("tempo de serviço: ");
						double tempoServico = scan.nextDouble();
						f.setTempoServico(tempoServico);

						System.out.print("salário: ");
						double salario = scan.nextDouble();
						f.setSalario(salario);

						fun[indice] = f;

						indice++;
					}else{
						System.out.println("");
						System.out.println("número máximo de funcionarios cadastrados esgotado.");
						System.out.println("");
					}
					break;
				
				case 2:
				System.out.println("--------------------------------------------");
					if(indice >= 0){
						for (int i = 0; i < indice; i++){
							System.out.println("nome - " + fun[i].getNome());
							System.out.println("número da matricula - " + fun[i].getNumeroMatricula());
							System.out.println("grau de escolaridade - " + fun[i].getGrauEscolaridade());
							System.out.println("tempo de serviço - " + fun[i].getTempoServico());
							System.out.println("salário - " + fun[i].getSalario());
							System.out.println("");
						}
					}else{
						System.out.println("");
						System.out.println("nenhum funcionario cadastrado ainda!");
						System.out.println("");
					}
					break;

				case 3:
					System.out.println("--------------------------------------------");
					if(indice > 0){
						System.out.print("Digite o número de matricula: ");
						String busca  = scan.next();

						for(int i = 0; i < indice; i++){
							if(busca.equals(fun[i].getNumeroMatricula())){
								int achou = i;
								System.out.println("nome - " + fun[achou].getNome());
								System.out.println("número da matricula - " + fun[achou].getNumeroMatricula());
								System.out.println("grau de escolaridade - " + fun[achou].getGrauEscolaridade());
								System.out.println("tempo de serviço - " + fun[achou].getTempoServico());
								System.out.println("salário - " + fun[i].getSalario());
							}
						}
					}else{
						System.out.println("");
						System.out.println("lista de funcionarios esta vazia.");
						System.out.println("");
					}
					break;
				
				case 4:
					System.out.println("--------------------------------------------");
					System.out.print("Digite o número de matricula: ");
					String query  = scan.next();

					for(int i = 0; i < indice; i++){
						if(query.equals(fun[i].getNumeroMatricula())){
							System.out.print("alterar nome para: ");
							String novoNome = scan.next();
							fun[i].setNome(novoNome);

							System.out.print("mudar número da matricula: ");
							String numMat = scan.next();
							fun[i].setNumeroMatricula(numMat);

							System.out.print("atualizar grau escolar: ");
							int grauEsc = scan.nextInt();
							fun[i].setGrauEscolaridade(grauEsc);

							System.out.print("tempo de serviço: ");
							double tempoServico = scan.nextDouble();
							fun[i].setTempoServico(tempoServico);

							System.out.print("salário: ");
							double salario = scan.nextDouble();
							fun[i].setSalario(salario);

							System.out.println("dados atualizados com sucesso.");
						}
					}
					break;

				case 5:
					System.out.print("Digite o número de matricula: ");
					String go = scan.next();

					for (int i = 0; i < indice; i++) {
						if(go.equals(fun[i].getNumeroMatricula())){
							int achou = i;
							fun[achou] = fun[achou + 1];
						}
					}
					indice--;
					break;

				case 6:
					break;
				
				default:
					System.out.println("opção inválida");
			}
			System.out.println("--------------------------------------------");
		}while(op != 6);
	}
}