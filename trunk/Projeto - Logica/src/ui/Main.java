package ui;

import java.util.Scanner;

import models.funcionario.Funcionario;
import models.funcionario.IFuncionario;
import models.mercadoria.IMercadoria;
import models.mercadoria.Mercadoria;
import models.venda.IVenda;
import models.venda.Venda;
import facade.Facade;

public class Main {

	private Facade facade;
	private Scanner in;

	public Main() {
		facade = new Facade(0);
	}

	private void CadastrarFuncionario() {

		System.out.println("Carregando tela Cadastro Funcionario:");

		IFuncionario funcionario = new Funcionario();

		// coleta dados
		String nome = funcionarioNome();
		String rg = setRg();
		String cpf = setCPF();
		String dataNascimento = setarData();
		String cargo = funcionarioCargo();
		double salario = funcionarioSalario();

		// seta o funcionario
		funcionario.setNome(nome);
		funcionario.setRg(rg);
		funcionario.setCpf(cpf);
		funcionario.setDataNascimento(dataNascimento);
		funcionario.setCargo(cargo);
		funcionario.setSalario(salario);

		// tenta adicionar ao banco
		System.out.println("Aguarde enquanto tentamos cadastrar.");
		facade.criarFuncionario(funcionario);

	}

	// TODO TESTAR
	private String funcionarioNome() {

		String Nome = null;
		boolean confirma = false;
		boolean valido = false;

		in = new Scanner(System.in);

		String resposta;

		while (!confirma) {
			while (!valido) {
				System.out.println("Digite nome do funcionario:");
				Nome = in.next();
				if (!(Nome.equals(""))) {
					valido = true;
				}

				System.out.println("Nome = " + Nome + "\nTem certeza? (s/n)");
				resposta = in.next();

				if (resposta.equalsIgnoreCase("s")) {
					confirma = true;
					System.out.println("Nome confirmado.");
					return Nome;
				} else {
					break;
				}
			}
		}

		in.close();

		return Nome;
	}

	// TODO TESTAR
	private String setRg() {
		String RG = null;
		boolean confirma = false;
		boolean valido = false;

		String resposta;

		in = new Scanner(System.in);

		while (!confirma) { // enquanto o usuario nao confirmar
			while (!valido) { // enquanto o RG nao for valido
				System.out
						.println("Digite RG do funcionario (nove digitos sem ponto):");
				RG = in.next();
				if (RG.length() == 9) {
					valido = true;
				}
			}

			System.out.println("RG = " + RG + "\nTem certeza? (s/n)");
			resposta = in.next();
			if (resposta.equals("s") || resposta.equals("S")) {
				confirma = true;
				return RG;
			} else {
				confirma = false;
			}
		}

		in.close();

		return RG;
	}

	// TODO TESTAR
	private String setCPF() {
		String CPF = null;
		boolean confirma = false;
		boolean valido = false;
		String resposta;

		in = new Scanner(System.in);

		while (!confirma) { // enquanto o usuario nao confirmar
			while (!valido) { // enquanto o CPF nao for valido
				System.out
						.println("Digite CPF do funcionario (onze digitos sem ponto e sem hifen):");
				CPF = in.next();
				if (CPF.length() == 11) {
					valido = true;
				}
			}

			System.out.println("CPF = " + CPF + "\nTem certeza? (s/n)");
			resposta = in.next();
			if (resposta.equals("s") || resposta.equals("S")) {
				confirma = true;
				return CPF;
			} else {
				confirma = false;
			}
		}

		in.close();

		return CPF;
	}

	// TODO TESTAR
	private String setarData() {
		String dataString = null;
		boolean confirma = false;
		boolean valido = false;

		String resposta;

		in = new Scanner(System.in);

		while (!confirma) { // enquanto o usuario nao confirmar
			while (!valido) { // enquanto o CPF nao for valido
				System.out.println("Informe a data (DD/MM/AAAA)");
				dataString = in.next();
				if (dataString.length() == 10) { // se tem o tamanho certo
					int[] dataInt = quebraData(dataString); // quebra a linha
					if ((dataInt.length == 3) && (checaData(dataInt))) { // se
																			// esta
																			// no
																			// formato
																			// certo
																			// e
																			// eh
																			// uma
																			// data
																			// valida
						valido = true;
					}
				}
			}

			System.out.println("Data de Nascimento = " + dataString
					+ "\nTem certeza? (s/n)");
			resposta = in.next();
			if (resposta.equals("s") || resposta.equals("S")) {
				confirma = true;
				return dataString;
			} else {
				confirma = false;
			}
		}

		in.close();

		return dataString;
	}

	private int[] quebraData(String dataString) {
		String[] aux = dataString.split("/");
		int[] dataInt = new int[3];
		for (int i = 0; i < 3; i++) {
			dataInt[i] = Integer.parseInt(aux[i]);

		}
		return dataInt;
	}

	private boolean checaData(int[] dataInt) {
		int dia = dataInt[0];
		int mes = dataInt[1];
		int ano = dataInt[2];
		boolean bissexto = false;
		if (ano >= 1896 && ano <= 2020) { // se for um ano v�lido
			if (((ano % 4 == 0) && (ano % 100 != 0)) || (ano % 400 == 0)) { // se
																			// for
																			// bissexto
				bissexto = true;
			}

			if (mes >= 1 && mes <= 12) { // se for um mes valido

				if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8
						|| mes == 10 || mes == 12) { // se for um mes com 31
														// dias
					if (dia >= 1 && dia <= 31) { // se tiver 31 dias
						return true;
					}
				} else

				if (mes == 4 || mes == 6 || mes == 9 || mes == 11) { // se for
																		// um
																		// mes
																		// com
																		// 30
																		// dias
					if (dia >= 1 && dia <= 30) { // se tiver ate 30 dias
						return true;
					}
				} else

				if (mes == 2) { // se for o mes 2
					if (bissexto) { // se for bissexto
						if (dia >= 1 && dia <= 29) { // se tem ate 29 dias
							return true;
						}
					} else { // se nao for bissexto
						if (dia >= 1 && dia <= 28) { // se tem ate 28 dias
							return true;
						}
					}
				}
			}

		}
		return false;
	}

	// TODO TESTAR
	private String funcionarioCargo() {
		String cargo = null;
		int opcao = 0;
		boolean confirma = false;
		boolean valido = false;
		String resposta;

		in = new Scanner(System.in);

		while (!confirma) { // enquanto o usuario nao confirmar
			System.out.println("Selecione Cargo do funcionario:");
			while (!valido) { // enquanto o Cargo nao for valido
				System.out.println("1-Caixa");
				System.out.println("2-Estoquista");
				System.out.println("3-Gerente");
				System.out.println("4-Vendedor");
				opcao = in.nextInt();
				switch (opcao) {
				case 1:
					cargo = "Caixa";
					valido = true;
					break;
				case 2:
					cargo = "Estoquista";
					valido = true;
					break;
				case 3:
					cargo = "Gerente";
					valido = true;
					break;
				case 4:
					cargo = "Vendedor";
					valido = true;
					break;
				default:
					System.out
							.println("Comando invalido.\nPor favor responda \"1\", \"2\", \"3\" ou \"4\".\n\n");
					valido = false;
					break;
				}
			}

			System.out.println("Cargo = " + cargo + "\nTem certeza? (s/n)");
			resposta = in.next();
			if (resposta.equals("s") || resposta.equals("S")) {
				confirma = true;
				return cargo;
			} else {
				confirma = false;
			}
		}

		in.close();

		return cargo;
	}

	// TODO Implementar
	private double funcionarioSalario() {
		
		double salario = -1;
		boolean confirma = false;
		boolean valido = false;
		String resposta;

		in = new Scanner(System.in);

		while (!confirma) { // enquanto o usuario nao confirmar
			while (!valido) { // enquanto o Salario nao for valido
				System.out.println("Digite Salario do funcionario:");
				salario = in.nextDouble();
				if (salario > 0) {
					valido = true;
				}
			}

			System.out.println("Salario = " + salario + "\nTem certeza? (s/n)");
			resposta = in.next();
			if (resposta.equals("s") || resposta.equals("S")) {
				confirma = true;
				return salario;
			} else {
				confirma = false;
			}
		}

		in.close();

		return salario;
	}

	public void MenuFuncionarios() {

		int opcao = -1;
		boolean voltar = false;

		in = new Scanner(System.in);

		while (!voltar) {
			System.out.println("~~~~~ Menu Funcionarios ~~~~~");
			System.out.println("O que gostaria de fazer?");
			System.out.println("0 - Voltar");
			System.out.println("1 - Cadastrar novo Funcionario");
			System.out.println("2 - Atualizar salário");

			opcao = in.nextInt();
			switch (opcao) {
			case 0:
				Main.main(null);
				break;
			case 1:
				CadastrarFuncionario();
				break;
			case 2: 
				AtualizarSalario();
			default:
				System.out.println("Opcao nao reconhecida.");
				break;
			}
		}

		in.close();
	}

	private void AtualizarSalario() {
		
		System.out.println("Carregando tela Atualizar salário:");

		IFuncionario funcionario = new Funcionario();

		// coleta dados
		String rg = setRg();
		double salario = funcionarioSalario();

		// seta o funcionario;
		funcionario.setRg(rg);
		funcionario.setSalario(salario);

		// tenta adicionar ao banco
		System.out.println("Aguarde enquanto tentamos atualizar o salario.");
		facade.atualizarSalario(funcionario);
		
	}

	public void MenuMercadoria() {

		int opcao = -1;
		boolean voltar = false;

		in = new Scanner(System.in);

		while (!voltar) {
			System.out.println("~~~~~ Menu Mercadorias ~~~~~");
			System.out.println("O que gostaria de fazer?");
			System.out.println("0 - Voltar");
			System.out.println("1 - Cadastrar nova Mercadoria");

			opcao = in.nextInt();
			switch (opcao) {
			case 0:
				Main.main(null);
				break;
			case 1:
				CadastrarMercadoria();
				break;
			default:
				System.out.println("Opcao nao reconhecida.");
				break;
			}
		}

		in.close();
	}

	private void CadastrarMercadoria() {

		System.out.println("Carregando tela Cadastro Mercadoria:");

		IMercadoria mercadoria = new Mercadoria();

		// coleta dados
		String nome = mercadoriaNome();
		double preco = mercadoriaPreco();
		String cor = mercadoriaCor();
		String tamanho = mercadoriaTamanho();
		String produto = mercadoriaProduto();

		// seta a mercadoria
		mercadoria.setNome(nome);
		mercadoria.setPreco(preco);
		mercadoria.setCor(cor);
		mercadoria.setTamanho(tamanho);
		mercadoria.setProduto(produto);

		// tenta adicionar ao banco
		System.out.println("Aguarde enquanto tentamos cadastrar.");
		facade.criarMercadoria(mercadoria);

	}

	private String mercadoriaProduto() {

		String produto = null;
		boolean confirma = false;
		boolean valido = false;

		in = new Scanner(System.in);

		String resposta;

		while (!confirma) {
			while (!valido) {
				System.out.println("Digite nome do produto:");
				produto = in.next();
				if (!(produto.equals(""))) {
					valido = true;
				}

				System.out.println("Produto = " + produto
						+ "\nTem certeza? (s/n)");
				resposta = in.next();

				if (resposta.equalsIgnoreCase("s")) {
					confirma = true;
					System.out.println("Nome confirmado.");
					return produto;
				} else {
					break;
				}
			}
		}

		in.close();

		return produto;
	}

	private String mercadoriaTamanho() {

		String tamanho = null;
		boolean confirma = false;
		boolean valido = false;

		in = new Scanner(System.in);

		String resposta;

		while (!confirma) {
			while (!valido) {
				System.out.println("Digite o tamanho da mercadoria:");
				tamanho = in.next();
				if (!(tamanho.equals(""))) {
					valido = true;
				}

				System.out.println("Tamanho = " + tamanho
						+ "\nTem certeza? (s/n)");
				resposta = in.next();

				if (resposta.equalsIgnoreCase("s")) {
					confirma = true;
					System.out.println("Tamanho confirmado.");
					return tamanho;
				} else {
					break;
				}
			}
		}

		in.close();

		return tamanho;

	}

	private String mercadoriaCor() {

		String cor = null;
		boolean confirma = false;
		boolean valido = false;

		in = new Scanner(System.in);

		String resposta;

		while (!confirma) {
			while (!valido) {
				System.out.println("Informe a cor da mercadoria:");
				cor = in.next();
				if (!(cor.equals(""))) {
					valido = true;
				}

				System.out.println("Cor = " + cor + "\nTem certeza? (s/n)");
				resposta = in.next();

				if (resposta.equalsIgnoreCase("s")) {
					confirma = true;
					System.out.println("Cor confirmada.");
					return cor;
				} else {
					break;
				}
			}
		}

		in.close();

		return cor;
	}

	private double mercadoriaPreco() {

		double preco = -1.0;
		boolean confirma = false;
		boolean valido = false;

		in = new Scanner(System.in);

		String resposta;

		while (!confirma) {
			while (!valido) {
				System.out.println("Digite o preco da mercadoria:");
				preco = in.nextDouble();
				if (!(preco > 0.0)) {
					valido = true;
				}

				System.out.println("Preco = " + preco + "\nTem certeza? (s/n)");
				resposta = in.next();

				if (resposta.equalsIgnoreCase("s")) {
					confirma = true;
					System.out.println("Preco confirmado.");
					return preco;
				} else {
					break;
				}
			}
		}

		in.close();

		return preco;

	}

	private String mercadoriaNome() {

		String Nome = null;
		boolean confirma = false;
		boolean valido = false;

		in = new Scanner(System.in);

		String resposta;

		while (!confirma) {
			while (!valido) {
				System.out.println("Digite o nome da mercadoria:");
				Nome = in.next();
				if (!(Nome.equals(""))) {
					valido = true;
				}

				System.out.println("Nome = " + Nome + "\nTem certeza? (s/n)");
				resposta = in.next();

				if (resposta.equalsIgnoreCase("s")) {
					confirma = true;
					System.out.println("Nome confirmado.");
					return Nome;
				} else {
					break;
				}
			}
		}

		in.close();

		return Nome;
	}

	public static void main(String[] args) {
		System.out.println("iniciando...");
		Scanner local = new Scanner(System.in);
		Main main = new Main();
		int opcao = -1;
		boolean sair = false;

		while (!sair) {
			System.out.println("~~~~~ Menu Principal ~~~~~");
			System.out
					.println("Digite o numero correspondente a opcao desejada.");
			System.out.println("1- Menu Funcionarios");
			System.out.println("2- Menu Mercadorias");
			System.out.println("3- Menu Vendas");
			opcao = local.nextInt();
			switch (opcao) {

			case 1:
				main.MenuFuncionarios();
				break;
			case 2:
				main.MenuMercadoria();
				break;
			case 3: 
				main.MenuVendas();
				break;
			default:
				System.out
						.println("Opcao nao reconhecida. Finalizando programa.");
				sair = true;
				break;
			}
		}

		local.close();

	}

	private void MenuVendas() {
		
		int opcao = -1;
		boolean voltar = false;

		in = new Scanner(System.in);

		while (!voltar) {
			System.out.println("~~~~~ Menu Vendas ~~~~~");
			System.out.println("O que gostaria de fazer?");
			System.out.println("0 - Voltar");
			System.out.println("1 - Efetuar venda");

			opcao = in.nextInt();
			switch (opcao) {
			case 0:
				Main.main(null);
				break;
			case 1:
				CadastrarVenda();
				break;
			default:
				System.out.println("Opcao nao reconhecida.");
				break;
			}
		}

		in.close();
	}

	private void CadastrarVenda() {
		
		System.out.println("Carregando tela Cadastro Venda:");

		IVenda venda = new Venda();

		// coleta dados
		double subtotal = mercadoriaSubtotal();
		String vendedorRg = setRg();
		String dataVenda = setarData();
		int qtdVenda = mercadoriaQtdVenda();

		// seta a mercadoria
		venda.setSubtotal(subtotal);
		venda.setVendedorRG(vendedorRg);
		venda.setDataVenda(dataVenda);
		venda.setQtdVendas(qtdVenda);

		// tenta adicionar ao banco
		System.out.println("Aguarde enquanto tentamos cadastrar.");
		facade.criarVenda(venda);
		
	}

	private int mercadoriaQtdVenda() {
		int qtdVenda = -1;
		boolean confirma = false;
		boolean valido = false;

		in = new Scanner(System.in);

		String resposta;

		while (!confirma) {
			while (!valido) {
				System.out.println("Digite a quantidade da venda:");
				qtdVenda = in.nextInt();
				if (qtdVenda > 0) {
					valido = true;
				}

				System.out.println("Quantidade = " + qtdVenda + "\nTem certeza? (s/n)");
				resposta = in.next();

				if (resposta.equalsIgnoreCase("s")) {
					confirma = true;
					System.out.println("Quantidade confirmads.");
					return qtdVenda;
				} else {
					break;
				}
			}
		}

		in.close();

		return qtdVenda;
		
	}

	private double mercadoriaSubtotal() {
		
		double subtotal = -1.0;
		boolean confirma = false;
		boolean valido = false;

		in = new Scanner(System.in);

		String resposta;

		while (!confirma) {
			while (!valido) {
				System.out.println("Digite o subtotal:");
				subtotal = in.nextDouble();
				if ( subtotal > 0.0) {
					valido = true;
				}

				System.out.println("Nome = " + subtotal + "\nTem certeza? (s/n)");
				resposta = in.next();

				if (resposta.equalsIgnoreCase("s")) {
					confirma = true;
					System.out.println("Subtotal confirmado.");
					return subtotal;
				} else {
					break;
				}
			}
		}

		in.close();

		return subtotal;
	}

}
