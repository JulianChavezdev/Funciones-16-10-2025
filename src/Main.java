public class Main {
    public static void main(String[] args) {
        bienvenida();
    }
    static void bienvenida (){
        System.out.println("Hola te doy la bienvenida a la clase de programacion ");
    }

}
public class Main {
    public static void main(String[] args) {
        bienvenida("julian");
    }
    static void bienvenida (String nombre){
        System.out.println("Hola " +nombre+  " te doy la bienvenida a la clase de programacion ");
    }

}
public class Main {
    public static void main(String[] args) {

        System.out.println(doble(7));
    }
    static int doble(int numero){
        return numero*2;
    }

}
public class Main {
    public static void main(String[] args) {

        System.out.println(precioConIva(86.98));
    }
    static double precioConIva(double precio){
        return (precio*0.21)+precio;
    }

}

public class Main {
    public static void main(String[] args) {

        System.out.println(precioCompuesto(100,0.21));
    }
    static double precioCompuesto(double precio, double impuesto){
        return (precio*impuesto) + precio;
    }

}

public class Main {
    public static void main(String[] args) {

        System.out.println(volumenCubo( 4.5));
    }
    static double volumenCubo(double lado){
        return (lado*lado*lado);
    }

}
public class Main {
    public static void main(String[] args) {

        System.out.println( tiempoEnSegundos( 10, 25, 50));
    }
    static int tiempoEnSegundos(int horas, int minutos, int segundos){
        return (horas * 3600) + (minutos * 60) + segundos;
    }

}
public class Main {
    public static void main(String[] args) {

        System.out.println(decoraTexto("Mi texto de prueba"));
    }
    static String decoraTexto(String texto1){
        return "=== " + texto1 + " ===" ;
    }

}
public class Main {
    public static void main(String[] args) {

        System.out.println(formateaNombre("Chavez Carrera" ,"julian"));
    }
    static String formateaNombre(String apellidos, String nombre){
        return apellidos+ ", " + nombre  ;
    }

}
public class Main {
    public static void main(String[] args) {
        int media1= funcionAprobado( 4, 5, 4, 7);
        boolean media= (media1 >= 5);

        System.out.println("El alumno ha aprobado? " +(media ? "si" : "no "));
    }
    static int funcionAprobado(int nota1, int nota2, int nota3, int nota4){
        return nota1 + nota2 + nota3 + nota4 /4;
    }

}
public class Main {
    public static void main(String[] args) {
        int media1= funcionAprobado( 4, 5, 4, 7);
        boolean media= (media1 >= 5);

        System.out.println(formateaNombre("chavez carrera","julian ha aprobado: ") +(media ? "si" : "no"));
    }
    static int funcionAprobado(int nota1, int nota2, int nota3, int nota4){
        return nota1 + nota2 + nota3 + nota4 /4;

    }

    static String formateaNombre(String apellidos, String nombre){
        return apellidos+ ", " + nombre  ;
    }

}