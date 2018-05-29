package Modelo;

public class Fatorial extends absPropriedades
{
    
    public Fatorial(Double n1)
    {
        super(n1);
    }
    
    public void Fatorial()
    {
        this.resultado = (double) FatorialRecursivo(this.n1.intValue());
        this.resposta = this.resultado.toString();
    }
    
    private int FatorialRecursivo(int valor)
    {
        return valor == 0 ? 1 : valor * FatorialRecursivo(valor-1);
    }
}
