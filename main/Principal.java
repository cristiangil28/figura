package main;
import punto.*;
import figura.*;
public class Principal {

    public static void main(String[] args) {
        P2 p2 = new P2();
        P2 puntoDos = new P2(1,2);
        P2 puntoTres = new P2(puntoDos);

        P3 puntoCuarto = new P3();
        P3 puntoQuinto = new P3(1,2,3);
        P3 puntoSeis = new P3(puntoDos,3);
        P3 puntoSiete = new P3(puntoQuinto);

        Triangulo equilatero = new Triangulo();
        equilatero.setP1(p2);
        equilatero.setP2(puntoDos);
        equilatero.setP3(puntoTres);

        Cubo cubo = new Cubo();
        cubo.getVertices()[0]= new P3(4,5,6);
        cubo.getVertices()[1]= puntoSiete;
        cubo.getVertices()[2]= puntoSeis;
        cubo.getVertices()[3]= puntoQuinto;

        P3 [] arrgegloVertices = cubo.getVertices();

        for (P3 vertice: arrgegloVertices) {
            System.out.println(vertice);
        }

        P2 pruebaLiskov = new P3();
    }
}
