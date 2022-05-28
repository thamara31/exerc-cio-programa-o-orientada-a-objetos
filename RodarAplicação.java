package diopoo;

public class RodarAplicação {

    public static void main(String[] args) {

        carro carro1 = new carro();

        carro1.setCor("Azul");
        carro1.setModelo("BMW série 3");
        carro1. setCapacidadedotanque(59);

        System.out.println(carro1.getModelo());
        System.out.println(carro1.getCor());
        System.out.println(carro1.getcapacidadedotanque());
        System.out.println(carro1.totalvalortanque( 6.39));

        carro carro2;
        carro2 = new carro( "cinza",  "Fusca",  66);

        System.out.println(carro2.getModelo());
        System.out.println(carro2.getCor());
        System.out.println(carro2.getcapacidadedotanque());
        System.out.println(carro2.totalvalortanque( 6.46));


    }
}