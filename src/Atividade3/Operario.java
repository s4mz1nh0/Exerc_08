package Atividade3;

public class Operario extends Empregado{
    
    private double valorProduçao;
    private double comissao;
    
    public Operario(String nome, String endereço, int telefone, int s, double x, double i, double p, double c){
        super(nome, endereço, telefone, s, x, i);
        setValorP(p);
        setComissao(c);
        
    }
    public double getValorP(){
        return this.valorProduçao;
    }
    public double getComissao(){
        return this.comissao;
    }
    public void setValorP(double p){
        this.valorProduçao=p;
    }
    public void setComissao(double c){
        this.comissao=c;
    }
    public double calcularSalario(){
        return super.calcularSalario()+((this.getValorP()*this.getComissao())/100);
    }
}