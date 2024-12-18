package Ejercicio_11;

public class MayorValor {
    private int numero1;
    private int numero2;
    private int numero3;

    public MayorValor(int numero1, int numero2, int numero3) {
        this.numero1 = numero1;
        this.numero2 = numero2;
        this.numero3 = numero3;
    }

    public int encontrarMayor() {
        if (numero1 > numero2 && numero1 > numero3) {
            return numero1;
        } else if (numero2 > numero3) {
            return numero2;
        } else {
            return numero3;
        }
    }
}
