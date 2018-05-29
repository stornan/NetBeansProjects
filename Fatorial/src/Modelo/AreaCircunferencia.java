package Modelo;

public final class AreaCircunferencia extends absPropriedades
{
    
    public AreaCircunferencia(Double n1)
    {
        super(n1);
        AreaCirculo();
    }
    
    public void AreaCirculo()
    {
        this.resultado = Math.pow(this.n1, 2) * Math.PI;
        this.resposta = this.resultado.toString();
    }
}
