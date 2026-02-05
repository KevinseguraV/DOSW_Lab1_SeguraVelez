package Laboratorio1.reto2;

public class  Resultado {
    private int mayor;
    private int menor;
    private int cantidad;
    private boolean esMultiploDe2;
    private boolean esDivisorDe2;
    private boolean cantidadImpar;
    private boolean cantidadPar;

    public Resultado() {}

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setMayor(int mayor) {
        this.mayor = mayor;
    }

    public void setEsDivisorDe2(boolean esDivisorDe2){
        this.esDivisorDe2 =  esDivisorDe2;   
    }
 
    public int getMayor(){
        return mayor;
    }
    
    public void setMenor(int menor) {
        this.menor = menor;
    }

    public void setMultiploDe2(boolean esMultiploDe2){
        this.esMultiploDe2 = esMultiploDe2;
    }

    public void setCantidadImpar(boolean cantidadImpar) {
        this.cantidadImpar = cantidadImpar;
    }

    public void setCantidadPar(boolean cantidadPar) {
        this.cantidadPar = cantidadPar;
    }

    public int getCantidad(){
        return cantidad;
    }

    @Override
    public String toString(){
        return "Resultados{" +
                "\n mayor=" + mayor +
                ", menor=" + menor +
                ", cantidad=" + cantidad +
                ", Mult2=" + (esMultiploDe2 ? "es Multiplo de 2" : "No es multiplo de 2" ) +
                ", div2=" + (esDivisorDe2 ? "es Divisor de 2" : "No es Divisor de 2" ) +
                ", cantidad par=" + (cantidadPar ? "es par" : "es impar" );
    }
}
