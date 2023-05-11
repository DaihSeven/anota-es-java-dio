public class RodarAplicacap {
    //* */ criei um newfile com o nome rodar.... e na associalão com o carro uniu as duas classes
    public static void main(String[] args) {
        carro carro1 = new carro();
        //é preciso especificar bem

        carro1.setCor("Azul");
        carro1.setModelo("BMW Série 3");
        carro1.setcapacidadeTanque(59);

        System.out.println(carro1.getModelo());
        System.out.println(carro1.getCor());
        System.out.println(carro1.getCapacidadeTanque());
        System.out.println(carro1.totalValorTanque(6.39));
        //necessito acrescemtar cor:, etc.
        carro carro2 = new carro("Cinza", "Mercedes-Benz Classe C ", 66);

        System.out.println(carro2.getModelo());
        System.out.println(carro2.getCor());
        System.out.println(carro2.getCapacidadeTanque());
        System.out.println(carro2.totalValorTanque(6.46));

    }
}
