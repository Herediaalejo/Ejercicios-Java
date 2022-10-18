public class Main {
    //Crear una funcion que reciba 3 numeros como parametro y los sume
    public static void main(String[] args) {
        int resultado;
        resultado = suma (10,50,100);
        System.out.println(resultado);
    }

    public static int suma(int a, int b, int c){
        return a + b + c;
    }
}