package Modelo;

public class Validacao extends absPropriedades
{
    
    public Validacao(String num1, String num2, String op)
    {
        super(num1, num2, op);
        Validar();
    }
    
    private void Validar()
    {
        //digitar o codigo para validacao aqui.//
        //quando nao for encapsulamento usar =//
        this.mensagem = "";
        try
        {
            // double.parseDouble feito para verificar se o que foi digitado era
            //numero mesmo, caso faça a conversão é numero.//
            this.n1 = Double.parseDouble(this.num1);
                    
        } catch (NumberFormatException e)
        {
            //exception pega qualquer tipo de erro, o numberformat pega apenas 
            //para numeros//
            this.mensagem = "Você precisa digitar um numero.";
        }
        
        try
        {
            this.n2 = Double.parseDouble(this.num2);
            
        } catch (NumberFormatException e)
        {
            this.mensagem = "Você precisa digitar um numero.";
            
        }
    }
    
}