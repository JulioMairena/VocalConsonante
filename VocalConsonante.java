public class VocalConsonante {
    public static void main(String[] args) {
        char c = args[0].charAt(0);

        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' )
            System.out.println(c + " es una vocal");
        else 
            System.out.println(c + " es una consonante");
    }
}
