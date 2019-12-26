package punto;

/**
 * esta clase representa un punto en 3D
 * @author crdavid
 */
public class P3 extends P2{
    // Atributos
    private int z;

    /**
     * crea un objeto de la clase P3
     */
    public P3(){
        super();
        this.z = 0;
    }

    /**
     * crear un objeto de tipo P3
     * @param x coordenada en x
     * @param y coordenada en y
     * @param z coordenada en z
     */
    public P3(int x, int y, int z){
        super(x,y);
        this.z = z;
    }

    /**
     * crear un objeto de tipo P3
     * @param p2 objeto de tipo 2
     * @param z coordenada z
     */
    public P3 (P2 p2, int z){
        super(p2);
        this.z = z;
    }

    /**
     * crea un objeto de tipo P3
     * @param p3 un obkjeto de 3 coordenadas
     */
    public P3(P3 p3){
        this(p3.getX(),p3.getY(),p3.getZ());
    }

    /**
     * obtiene el valor de la variable z
     * @return z
     */
    public int getZ() {
        return z;
    }

    /**
     * asigna el valor para la variable z
     * @param z valor de la coordenada z
     */
    public void setZ(int z) {
        this.z = z;
    }

    /**
     * calcula la distancia entre dos puntos en tres dimensiones
     * @param x coordenada x del otro punto
     * @param y coordenada y del otro punto
     * @param z coordenada z del otro punto
     * @return distancia
     */
    public double calcularDistancia(int x, int y, int z){
        double diferenciaCuadradosX = Math.pow(getX() - x, 2);
        double diferenciaCuadradosY = Math.pow(getY() - y, 2);
        double diferenciaCuadradosZ = Math.pow(getZ() - z, 2);
        double distancia = Math.sqrt(diferenciaCuadradosX + diferenciaCuadradosY + diferenciaCuadradosZ);
        return distancia;
    }

    /**
     * calcula la distancia entre dos puntos de tres dimensiones
     * @param p2 objeto de tipo P2
     * @param z coordenada en z
     * @return distancia
     */
    public double calcularDistancia(P2 p2 , int z){
        return this.calcularDistancia(p2.getX(), p2.getY(), z);
    }

    /**
     * calcula la distancia entre dos puntos de tres dimensiones
     * @param p3 objeto de tipo P3
     * @return distancia
     */
    public double calcularDistancia(P3 p3){
        return calcularDistancia(p3.getX(), p3.getY(), p3.getZ());
    }

    public String toString(){
        return super.toString()+ "z:"+this.getZ();
    }
}
