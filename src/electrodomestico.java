//de las clases abstractas NO se pueden crear objetos
public abstract class electrodomestico {
    protected String tipo;
    String marca;
    protected double potencia; //si hay padre e hijos los atributos serán protegidos

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
    @Override
    public String toString() {
        return "electrodomestico{" +
                "tipo='" + tipo + '\'' +
                ", marca='" + marca + '\'' +
                ", potencia=" + potencia +
                '}';
    }
    // metodo abstracto --> solo se define, no tiene código
    public abstract double getConsumo(int horas); //los get y set servirán cuando no se puedan ver desde fuera
    public double getCosteConsumo(int horas, double costeHora)
    {
        return horas*costeHora;
    }

}
