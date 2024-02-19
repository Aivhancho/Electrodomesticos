public class lavadora extends electrodomestico{
    double peso;
    String color;
    protected double precio;
    boolean aguaCaliente;

    public lavadora(String tipo, String marca, double potencia) {
        super(tipo, marca, potencia); //llama al constructor del padre
        this.aguaCaliente=false;
    }

    public lavadora(String tipo, String marca, double potencia, double precio, boolean aguaCaliente) {
        super(tipo, marca, potencia);
        this.precio = precio;
        this.aguaCaliente = aguaCaliente;
    }
    public double getConsumo(int horas) //cuando en la clase padre es abstracto, aquí se pone el codigo
    {
        if (this.aguaCaliente==false)//agua fria
        {
            return (horas*this.potencia);
        }
        else//agua caliente
        {
            return horas*(this.potencia+this.potencia*0.2);
        }
    }
}
