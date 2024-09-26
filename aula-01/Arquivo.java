public class Arquivo {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Hello mundão!");
        } else {
            System.out.printf("\nHello %s!\n", args[0]);
        }

    }
}