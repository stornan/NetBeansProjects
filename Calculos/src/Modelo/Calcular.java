package Modelo;

public class Calcular extends absPropriedades implements intMetodos
{
    
    public Calcular(String op, Double n1, Double n2)
    {
        //colocar Executar para que ele possa chamar e poder fazer as equacoes.
        //caso contrario ele so vai chamar as variaveis.//
        super(op, n1, n2);
        Executar();
    }
   
    public void Executar()
    {
        //identifica o que foi selecionado para que possa ser calculado.//
        if(this.op.equals("+"))
        {
            Somar(this.n1, this.n2);
        }
        else if(this.op.equals("-"))
        {
            Subtrair(this.n1, this.n2);
        }
        else if(this.op.equals("*"))
        {
            Multiplicar(this.n1, this.n2);
        }
        else if(this.op.equals("/"))
        {
            Dividir(this.n1, this.n2);
        }
    }
    
    @Override
    public void Somar(Double n1, Double n2)
    {
        this.resultado = this.n1 + this.n2;
    }
    
    @Override
    public void Subtrair(Double n1, Double n2)
    {
        this.resultado = this.n1 - this.n2;
    }
    
    @Override
    public void Multiplicar(Double n1, Double n2)
    {
        this.resultado = this.n1 * this.n2;
    }
    
    @Override
    public void Dividir(Double n1, Double n2)
    {
        this.resultado = this.n1 / this.n2;
    }
}
