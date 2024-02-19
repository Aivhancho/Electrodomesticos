public class lavadora   extends electrodomestico{
    double peso;
    String color;
    double precio;
    boolean aguaCaliente;

    public lavadora(String tipo, String marca, double potencia) {
        super(tipo, marca, potencia);
        this.aguaCaliente=false;
    }

    public lavadora(String tipo, String marca, double potencia, double precio, boolean aguaCaliente) {
        super(tipo, marca, potencia);
        this.precio = precio;
        this.aguaCaliente = aguaCaliente;
    }
    public double getConsumo(int horas);
    {
        if (this.aguaCaliente==false)//agua fria
        {

        }
        else//agua caliente
        {

        }
    }
}
