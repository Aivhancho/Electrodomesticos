//de las clases abstractas NO se pueden crear objetos
public abstract class electrodomestico {
    private String tipo;
    private String marca;
    private double potencia;

    public electrodomestico(String tipo) {
        this.tipo = tipo;
    }

    public electrodomestico(String tipo, String marca, double potencia) {
        this.tipo = tipo;
        this.marca = marca;
        this.potencia = potencia;
    }

    public electrodomestico(String marca, double potencia) {
        this.marca = marca;
        this.potencia = potencia;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    @Override
    public String toString() {
        return "electrodomestico{" +
                "tipo='" + tipo + '\'' +
                ", marca='" + marca + '\'' +
                ", potencia=" + potencia +
                '}';
    }
    // metodo abstracto --> solo se define, no tiene código
    public abstract double getConsumo(int horas);
    public abstract double getCosteConsumo(int horas, double costeHora);
}
