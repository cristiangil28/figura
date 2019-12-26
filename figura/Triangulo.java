package figura;
import punto.P2;
public class Triangulo {
    //Atributos
    private String colorLinea;
    private String colorFondo;

    private P2 p1= new P2();
    private P2 p2= new P2();
    private P2 p3= new P2();

    public String getColorLinea() {
        return colorLinea;
    }

    public void setColorLinea(String colorLinea) {
        this.colorLinea = colorLinea;
    }

    public String getColorFondo() {
        return colorFondo;
    }

    public void setColorFondo(String colorFondo) {
        this.colorFondo = colorFondo;
    }

    public P2 getP1() {
        return p1;
    }

    public void setP1(P2 p1) {
        this.p1 = p1;
    }

    public P2 getP2() {
        return p2;
    }

    public void setP2(P2 p2) {
        this.p2 = p2;
    }

    public P2 getP3() {
        return p3;
    }

    public void setP3(P2 p3) {
        this.p3 = p3;
    }

    public void dibujar(){
        System.out.println("dibujando un triángulo");
    }
}
