
public static void main(String[] args) {
    //Se añadirá el enunciado del ejercicio próximamente
    Scanner sc = new Scanner(System.in);
    System.out.println("Este programa realiza el producto de los 10 primeros números impares ");
    int i;
    int multiplo = 1;
    for (i=1; i<20; i += 2) {	
        multiplo = multiplo * i;
    sc.close();
    }
    System.out.println("Este programa realiza el producto de los 10 primeros números impares, el total es: " + multiplo);
  //comentario añadido al inicio de la declaración de variables
}

