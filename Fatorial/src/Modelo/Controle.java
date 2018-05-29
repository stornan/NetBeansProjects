package Modelo;

public final class Controle extends absPropriedades
{
    
    public Controle(String num1)
    {
        super(num1);
        Executar();
    }
    
    private void Executar()
    {
        Validar validar = new Validar(this.num1);
        this.mensagem = validar.mensagem;
        this.n1 = validar.n1;
    }
    
    public void AreaCirculo()
    {
       absPropriedades areac = new AreaCircunferencia(this.n1);
       this.resposta = areac.toString();
    }
    
    public void Fatorial()
    {
        absPropriedades fat = new Fatorial(this.n1);
        this.resposta = fat.toString();
    }
}
