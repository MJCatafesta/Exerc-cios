package TreinamentoInterface;

public class MultiInstrumentista extends SerHumano implements Guitarrista, Baterista, Saxofonista {
 public String horarioEstudos;
 
	
	public MultiInstrumentista (String nome, int idade, String horarioEstudos) {
		super (nome, idade);
		this.horarioEstudos = horarioEstudos;
	}
	public String getHorarioEstudos() {
		return horarioEstudos;
	}

	public void setHorarioEstudos(String horarioEstudos) {
		this.horarioEstudos = horarioEstudos;
	}
	@Override
	public void Tocar() {
		System.out.println(nome + " está tocando.");
		
	}@Override
	public void Estudar() {
		System.out.println(nome + " está estudando.");
	}@Override
	public void Compor() {
		System.out.println(nome + " está compondo.");
	}@Override
	public void Arranjar() {
		System.out.println(nome + " está arranjando.");
	}@Override
	public void Guitarra() {
		System.out.print(nome + ", você é um Guitarrista!");
	}@Override
	public void Bateria() {
		System.out.print(nome + ", você é um Baterista!");
	}@Override
	public void Saxofone() {
		System.out.print(nome + ", você é um Saxofonista!");
	}
	
}
