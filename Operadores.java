public class Operadores{
    public static void main (String[] args) {
        //Operadores Aritméticos
        
        int a = 10;
        int b = 5;
        System.err.println(a + b);
        System.err.println(a - b);
        System.err.println(a / b);
        System.err.println(a * b);
        System.err.println(a % b);
      
        //Operadores de Comparação
        
        int c = 20;
        int d = 15;
        System.err.println(c == d);
        System.err.println(c != d);
        System.err.println(c > d);
        System.err.println(c < d);
        System.err.println(c >= d);
        System.err.println(c <= d);

        //Operadores Lógicos

        boolean e = true;
        boolean f = false;
        System.err.println(e && f);
        System.err.println(e || f);
        System.err.println(!e);

        //Operadores de Atribuição

        int g = 10;

        g+=5; // g  = g + 5 = 15
        g-=5; // g  = g - 5 = 5
        g/=5; // g  = g / 5 = 2
        g*=5; // g  = g * 5 = 50
        g%=5; // g  = g % 5 = 0

    }
}