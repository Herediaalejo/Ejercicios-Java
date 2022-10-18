public class Main {
    public static void main(String[] args) {

        int numeroIf = -5;
        if (numeroIf > 0) {
            System.out.println("El número es positivo");
        } else if (numeroIf == 0) {
            System.out.println("El número es 0");
        } else {
            System.out.println("El número es negativo");
        }

        int numeroWhile = 0;
        while(numeroWhile<3){
            System.out.println(numeroWhile);
            numeroWhile=numeroWhile+1;
        }

        do{
            System.out.println(numeroWhile);
            numeroWhile=numeroWhile+1;
        }while(numeroWhile<4);

        for(int numeroFor=0;numeroFor<=3;numeroFor=numeroFor+1){
            System.out.println(numeroFor);
        }
        var estacion = "PRIMAVERA";
        switch (estacion){
            case "OTOÑO":
                System.out.println("Es Otoño");
                break;
            case "INVIERNO":
                System.out.println("Es Invierno");
                break;
            case "PRIMAVERA":
                System.out.println("Es Primavera");
                break;
            case "VERANO":
                System.out.println("Es Verano");
                break;
            default:
                System.out.println("No es una estacion");
        }

    }
}