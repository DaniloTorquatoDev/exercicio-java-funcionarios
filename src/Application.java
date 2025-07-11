import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Pessoas;

public class Application {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas vão ser cadastradas ? ");
		int n = sc.nextInt();

		List<Pessoas> list = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			System.out.println("Funcionario #" + (i + 1));
			System.out.print("Id: ");
			Integer id = sc.nextInt();

			sc.nextLine();
			System.out.print("Nome: ");
			String name = sc.nextLine();

			System.out.print("Salario: ");
			Double salary = sc.nextDouble();

			Pessoas dadosPessoas = new Pessoas(id, name, salary);
			list.add(dadosPessoas);
		}

		System.out.print("Digite o id do funcionario que irá receber o aumento: ");
		int idFunc = sc.nextInt();

		Integer pos = positionId(list, idFunc);

		if (pos == null) {
			System.out.print("Id não existe!");
		} else {
			System.out.print("Qual a porcentagem de aumento?");
			double porcentagem = sc.nextDouble();
			list.get(pos).aumento(porcentagem);
			System.out.println();

		}

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		sc.close();

	}

	public static Integer positionId(List<Pessoas> list, int id) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId() == id) {
				return i;
			}

		}
		return null;
	}

}
