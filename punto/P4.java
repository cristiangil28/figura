package punto;

/**
 * esta clase representa un punto en 4D
 * @author crdavid
 */
public class P4 extends P3{
    // Atributos
    private int w;

    /**
     * crea un objeto de la clase P4
     */
    public P4(){
    super();
        this.w = 0;
    }

    /**
     * crear un objeto de tipo P4
     * @param x coordenada en x
     * @param y coordenada en y
     * @param z coordenada en z
     * @param w coordenada en w
     */
    public P4(int x, int y, int z, int w){
        super(x,y,z);
        this.w = w;
    }

    /**
     * crear un objeto de tipo P4
     * @param p3
     * @param w
     */
    public P4 (P3 p3, int w){
        super(p3);
        this.w = w;
    }

    /**
     * crea un objeto de tipo P4
     * @param p4 un objeto de 4 coordenadas
     */
    public P4(P4 p4){
        this(p4.getX(),p4.getY(),p4.getZ(),p4.getW());
    }

    /**
     * obtiene el valor de la variable z
     * @return z
     */
    public int getW() {
        return w;
    }

    /**
     * asigna el valor para la variable w
     * @param w valor de la coordenada w
     */
    public void setW(int w) {
        this.w = w;
    }

    /**
     * calcula la distancia entre dos puntos en tres dimensiones
     * @param x coordenada x del otro punto
     * @param y coordenada y del otro punto
     * @param z coordenada z del otro punto
     * @param w coordenada w del otro punto
     * @return distancia
     */
    public double calcularDistancia(int x, int y, int z,int w){
        double diferenciaCuadradosX = Math.pow(getX() - x, 2);
        double diferenciaCuadradosY = Math.pow(getY() - y, 2);
        double diferenciaCuadradosZ = Math.pow(getZ() - z, 2);
        double diferenciaCuadradosW = Math.pow(getZ() - w, 2);
        double distancia = Math.sqrt(diferenciaCuadradosX + diferenciaCuadradosY +
         diferenciaCuadradosZ + diferenciaCuadradosW);
        return distancia;
    }

    /**
     * calcula la distancia entre dos puntos de cuatro dimensiones
     * @param p3 objeto de tipo P3
     * @param w coordenada en w
     * @return distancia
     */
    public double calcularDistancia(P3 p3 , int w){
        return this.calcularDistancia(p3.getX(), p3.getY(),p3.getZ(), w);
    }

    /**
     * calcula la distancia entre dos puntos de cuatro dimensiones
     * @param p4 objeto de tipo P4
     * @return distancia
     */
    public double calcularDistancia(P4 p4){
        return calcularDistancia(p4.getX(), p4.getY(), p4.getZ(),p4.getW());
    }

    public String toString(){
        return super.toString()+ "w:"+this.getW();
    }
}
