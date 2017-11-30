package sample;

public class Cola {

    private Nodo frente;//el inicial de la cola

    //constructor simple
    public Cola() {
        this.frente = null;

    }

    //metodo para insertar siguiente elemento ..
    public void insertar(int valor) {
        Nodo nuevo = new Nodo(valor);
        if (frente == null) {
            frente = nuevo;
        } else {
            Nodo temp = frente;
            while ((temp.getProximo() != null)) {
                temp = temp.getProximo();

            }
            temp.setProximo(nuevo);
        }


    }

    //metodo para mostrar los elementos de la cola
    public void mostrar() {
        if (frente != null) {
            Nodo temp = frente;
            System.out.println("Los valores de la cola son :");
            while (temp != null) {
                System.out.println(temp.getValor());
                temp = temp.getProximo();
            }
        } else {
            System.out.println("La cola esta vacia");
        }
    }

    //Metodo para extraer el elemnto del frente
    public int extraer() {
        if (frente == null) {
            return 0;
        } else {
            int valorExtraer = frente.getValor();//variable temporal
            System.out.println("Valor extraido:" + frente.getValor());
            frente = frente.getProximo();//cambiar el frente por el siguiente
            return valorExtraer;//devolver el valor extraido de la cola }
        }

    }
}
