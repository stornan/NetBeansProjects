package Modelo;

public class Controle extends absPropriedades
{
    
    public Controle(String num1, String num2, String op)
    {
        super(num1, num2, op);
    }
    
    private void Executar()
    {
        this.mensagem = "";
        absPropriedades validacao = new Validacao(num1, num2, op);
        if(validacao.mensagem.equals(""))
        {
            absPropriedades calcular = new Calcular (op, n1 , n2);
            this.resposta = calcular.resposta;
        }
        else
        {
            this.mensagem = validacao.mensagem;
        }
    }
    
}
