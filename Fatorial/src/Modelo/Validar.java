package Modelo;

public final class Validar extends absPropriedades 
{
    
    public Validar(String num1)
    {
        super(num1);
        Validar();
    }
    
    public void Validar()
    {
        this.mensagem = "";
        try
        {
            this.n1 = Double.parseDouble(this.num1);
            
        } catch (NumberFormatException e)
        {
            this.mensagem = "Erro de conversão.";
        }
    }
}
