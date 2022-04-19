public class Main {

    public static void main(String[] args) {
        int numeroIf = 5;
        if(numeroIf > 0 ){
            System.out.println("es positivo");
        }else if(numeroIf < 0){
            System.out.println("es negativo");
        }else System.out.println("es cero");

        System.out.println("\n**********\n");

        int numeroWhile = 0;
        while(numeroWhile < 2){
            System.out.println(numeroWhile);
            numeroWhile++;
        }

        System.out.println("\n**********\n");

        do{
            System.out.println(numeroWhile);
        }while (numeroWhile < 3);

        System.out.println("\n**********\n");

        for(int i = 0; i < 3; i++){
            System.out.println(i);
        }

        System.out.println("\n************\n");

        int estacion = 3;
        switch (estacion){
            case 1:
                System.out.println("Primavera");
                break;
            case 2:
                System.out.println("Verano");
                break;
            case 3:
                System.out.println("Otoño");
                break;
            case 4:
                System.out.println("Invierno");
            default:
                System.out.println("Numero invalido");

        }




    }
}
