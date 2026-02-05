package Laboratorio1.reto2;

public class  Resultado {
    private int mayor;
    private int menor;
    private int cantidad;
    private boolean esMultiploDe2;
    private boolean esDivisorDe2;

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

    public void setMultiploDe2(int mayor){
        this.mayor = mayor;
    }
}
