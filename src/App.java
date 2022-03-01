import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        //menu start

        String choice;

        // switchcase (do whileba)

        do {
            System.out.println("---------------------");
            System.out.println("(1) Program inditasa\n");
            System.out.println("(2) Nevjegy\n");
            System.out.println("(3) Kilepes\n");
    
            System.out.print("Valasztas > ");
            choice = sc.nextLine();

            switch (choice) {
                case "1":
                    // program start
                    double szam = 0;

                    do {
                        System.out.print("Szam: ");
                        szam = sc.nextInt();
                        if (szam != 0) {
                            double gyok = Math.sqrt(szam);
                            System.out.println("Gyök: " + gyok);
                        }
                    } while (szam != 0);
                    System.out.println("press enter");
                    sc.nextLine();
                    sc.nextLine();
                    break;
                case "2":
                    System.out.println("____Nevjegy____\n");
                    System.out.println("Balogh Csenge");
                    System.out.println("Szoft_I_N");
                    System.out.println("2022.03.01");
                    System.out.println("_______________\n");
                    System.out.println("Gyokszamito program");
                    break;
                case "3":
                    System.out.println("Kilepes");
                    break;
            }

        } while ( !choice.equals("3") );

        // menu end



        sc.close();

        /* 
            double szam = -1;

            while (szam != 0) {
                System.out.print("Szam: ");
                szam = sc.nextInt();

                double gyok = Math.sqrt(szam);
                System.out.println(gyok);
            }

            sc.close();
        */


        /*  
            
        */
    }
}
