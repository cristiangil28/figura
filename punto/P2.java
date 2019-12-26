package punto;

/**
 * Esta clase representa un punto en 2D de la figura
 * @author cristian gil
 */
public class P2 {
    //Atributos
    private int x;
    private int y;

    /**
     * Crea una instancia de la clase P2
     */
    public P2(){
        this.x=this.y=0;
    }

    /**
     * Crea juna instancia de la clase P2
     * @param x Coordenada x
     * @param y Coordenada y
     */
    public P2(int x , int y){
        this.x = x;
        this.y = y;
    }

    /**
     * Crea una instancia de la clase P2
     * @param p2 es un objeto de punto de dos dimensiones (P2)
     */
    public P2(P2 p2){
        this.x = p2.getX();
        this.y = p2.getY();
    }

    /**
     * retorna el valor de la variable x
     * @return x
     */
    public int getX() {
        return x;
    }

    /**
     * Asigna el valor para la coordenada x
     * @param x coordenada x
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * retorna el valor de la variable y
     * @return y
     */
    public int getY() {
        return y;
    }

    /**
     * asigna el valor para la variable y
     * @param y coordenada y
     */
    public void setY(int y) {
        this.y = y;
    }

    /**
     * calcula la distancia entre dos puntos
     * @param x coordenada x del otro punto
     * @param y coordenada y del otro punto
     * @return distancia
     */
    public double calcularDistancia(int x, int y){
        double diferenciaCuadradosX = Math.pow(this.x - x, 2);
        double diferenciaCuadradosY = Math.pow(this.y - y, 2);
        double distancia = Math.sqrt(diferenciaCuadradosX + diferenciaCuadradosY);
        return distancia;
    }

    /**
     * calcula la distancia de dos puntos de un objeto
     * @param p2 objeto tipo p2
     * @return distancia
     */
    public double calcularDistancia(P2 p2){
       return this.calcularDistancia(p2.getX(),p2.getY());
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();

        sb.append("x: ").append(this.x).append("y: ").append(this.y);

        return sb.toString();
    }
}
