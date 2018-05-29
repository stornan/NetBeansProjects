package Modelo;

public class absPropriedades implements intMetodos
{
    public String mensagem;
    protected String num1;
    protected Double n1;
    protected String resposta;
    protected Double resultado;

    public absPropriedades(String num1)
    {
        this.num1 = num1;
    }

    public absPropriedades(Double n1)
    {
        this.n1 = n1;
    }

    public String toString()
    {
        return this.resposta;
    }
    
    @Override
    public void Fatorial()
    {
       
    }

    @Override
    public void AreaCirculo()
    {
        
    }
    
}
