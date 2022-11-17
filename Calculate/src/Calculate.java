public class Calculate {
    public static void main (String[] args){
        int x = Integer.parseInt(args[1]);
        int y = Integer.parseInt(args[2]);
        if (args[0].equals("somar")){
            sum(x , y);
        } else if (args[0].equals("subtrair")){
            minus(x , y);
        } else if (args[0].equals("dividir")) {
            divid(x , y);

        } else if (args[0].equals("multiplicar")) {
            multip(x , y);

        } else {
            System.out.println("Nenhuma alternativa encontrada para calculadora");
        }

    }
    static void sum(int x, int y){
        System.out.println(x + y);
    }
    static void minus(int x, int y){
        System.out.println(x - y);
    }
    static void divid(int x, int y){
        System.out.println(x / y);
    }
    static void multip(int x, int y){
        System.out.println(x * y);
    }


}
