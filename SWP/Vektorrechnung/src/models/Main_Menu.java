package models;

public class Main_Menu extends Vektorkette {

    public static void main(String[] args) {

        /*char wahl;

        switch(wahl){
            case 'a':
                vektorAddition();
                break;
            case 'b':
                vektorSubtraktion();
                break;
            case 'c':
                vektorMultiplikation();
                break;
            case 'd':
                vektorLänge();
                break;
            case 'e':
                vektorSkalarprodukt();
                break;
            case 'f':
                vektorEinheit();
                break;
        }


        System.out.println("a ... Addieren");
        System.out.println("b ... Subtrahieren");
        System.out.println("c ... Multiplizieren");
        System.out.println("d ... Länge");
        System.out.println("e ... Skalarprodukt");
        System.out.println("f ... Eiheitsvektor");
        System.out.println("Ihre Wahl: ");
        wahl = reader.nextChar();

        */

       Vektor2 vektor1 = new Vektor2(1,2);
       Vektor2 vektor2 = new Vektor2(1,2);
       Vektor2 vektor3 = new Vektor2(1,0);
       Vektor2 testvektor = Vektor2.vektorAddition(vektor1, vektor2);
       Vektor2 testvektor2 = Vektor2.vektorSubtraktion(vektor1, vektor2);
       Vektor2 testvektor3 = Vektor2.vektorMultiplikation(5, vektor1);
       System.out.println(testvektor);
       System.out.println(testvektor2);
       System.out.println(testvektor3);

       Vektorkette vKette = new Vektorkette();
       vKette.addVektor(vektor1);
       vKette.addVektor(vektor2);
       vKette.addVektor(vektor3);
       System.out.println(vKette.toString());
       System.out.println("es wurde 1 Vektor entfernt");
       vKette.removeVektor(vektor3);
       System.out.println(vKette.toString());
       Vektor2 vektor4 = new Vektor2();
       vektor4.setX(vKette.getXresultierende());
       vektor4.setY(vKette.getYresultierende());
       Vektor2 einheitsvektor = new Vektor2();
       einheitsvektor = Vektor2.vektorEinheit(vektor4);
       System.out.println("eiheitsvektor x: " + vKette.getXresultierende() + " Eiheitsvektor y: " + vKette.getYresultierende());


    }


}
