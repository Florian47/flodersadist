public class Main {


    public static void main(String[] args) {
        int klklk = 0;
        while (args.length > klklk) {
            System.out.println(args[klklk]);
            klklk++;
        }
        klklk = 0;
        do {
            System.out.println(args[klklk]);
            klklk++;

        } while (args.length != klklk);


        for (klklk = 0; klklk < args.length; klklk++) {
            System.out.println(args[klklk]);
        }

        for (String s : args) {
            System.out.println(s);


        }
    }

}
