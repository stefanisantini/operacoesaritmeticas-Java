public class OperacaoAritmetica {
    public static void main(String[] args) throws Exception {
        /**int n1 = 3;
        int n2 = 5;
        float m = (n1 + n2)/2;
        System.out.println("A media é igual a: " + m);*/

        /**int numero = 5;
        numero++;
        System.out.println(numero);*/

        /**int numero = 10;
        int valor = 4 + ++numero;
        System.out.println(valor);
        System.out.println(numero);*/

        /**int x = 4;
        x += 2;  // é a mesma coisa de x = x + 2
        System.out.println(x);*/

        /**float v = 8.39f;
        int ar = (int) Math.round(v);
        System.out.println(ar);*/

        /**double ale = Math.random(); // entre o e 1
        System.out.println(ale);*/

        double ale = Math.random();
        int n = (int) (5 + ale * (10-5));
        System.out.println(n);
    }
}
