public class CommandLineArgs {
    public static void main(String[] args) {
        if(args.length == 0 || args[0].equals("-h"))
            System.out.println("hello");
        else if(args[0].equals("-g"))
            System.out.println("Goodbye");
        for(int i=1; i<args.length; i++){
            System.out.print(" " + args[i]);
        }
        System.out.println("!");
    }
}
