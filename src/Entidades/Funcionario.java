package Entidades;

public class Funcionario {
	
	public String Nome ;
	public double SalarioBruto;
	public double Imposto;
	
	public double SalarioLiquido() {
		  return SalarioBruto - Imposto;
		 
	}
	
	public void AumentoSalarial(double porcentagem) {
		SalarioBruto = SalarioBruto + SalarioBruto * porcentagem / 100.0;
	}
	
	public String toString() {
		return Nome + ", $" + String.format("%.2f", SalarioLiquido());
	}
	

}
