public class carro {
    String cor;
    String modelo;
    int capacidadeTanque;
    //2comstrutores
    //1set/get
    /**
     * 
     */
    carro(){
        
    }
    carro(String cor, String modelo, int capacidadeTanque){
        this.cor = cor;
        this.modelo = modelo;
        this.capacidadeTanque = capacidadeTanque;
    }

    void setCor(String cor){
        this.cor = cor;
    }
    public String getCor() {
        return cor;
    }
    void setModelo(String modelo){
        this.modelo = modelo;
    }
    public String getModelo() {
        return modelo;
    }
    void setcapacidadeTanque(int capacidadeTanque){
        this.capacidadeTanque = capacidadeTanque;
    }
    public int getCapacidadeTanque() {
        return capacidadeTanque;
    }
    //metodo para calcular o enchimento do tanque
    double totalValorTanque(double valorCombustivel){
        return capacidadeTanque * valorCombustivel;
    }

}
