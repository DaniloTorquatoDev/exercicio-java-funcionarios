package entities;

public class Pessoas {
	private int id;
	private String name;
	private double salary;

	public Pessoas(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void aumento(double porcentagem) {
		salary += salary * porcentagem / 100;
	}


	public String toString() {
		return "ID: " + id + ", NOME: " + name + ", SALARIO: R$ " + String.format("%.2f", salary);
	}

}
