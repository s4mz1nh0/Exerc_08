
package Atividade3;

public class Administrador extends Empregado {

    private double ajudaDeCusto;

    public Administrador(String nome, String endereco,
            String telefone, int codigoSetor,
            double salarioBase, double imposto,double ajudaDeCusto) {
        super(nome, endereco, telefone, codigoSetor,salarioBase, imposto);
        setAjudaDeCusto(ajudaDeCusto);
    }

    public double getAjudaDeCusto() {
        return ajudaDeCusto;
    }

    public void setAjudaDeCusto(double ajudaDeCusto) {
        this.ajudaDeCusto = ajudaDeCusto;
    }

    public double calcularSalario() {
        return super.calcularSalario() + getAjudaDeCusto();
    }
}
