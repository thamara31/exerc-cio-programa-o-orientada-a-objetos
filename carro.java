package diopoo;

public class carro {

    String cor;
    String modelo;
    int capacidadedotanque;

    carro(){

    }
    carro(String cor, String modelo, int capacidadedotanque){
        this.cor = cor;
        this.modelo = modelo;
        this.capacidadedotanque = capacidadedotanque;

    }
    void setCor(String cor) {
        this.cor = cor;
    }
    String getCor() {
        return cor;
    }
void setModelo(String modelo) {
    this.modelo = modelo;
    }
 String getModelo() {
    return modelo;
 }
 void setCapacidadedotanque(int capacidadedotanque) {
    this.capacidadedotanque = capacidadedotanque;
    }

   int getcapacidadedotanque() {
   return capacidadedotanque;
    }
    double totalvalortanque(double valorcombustivel) {
return capacidadedotanque * valorcombustivel;
    }
}