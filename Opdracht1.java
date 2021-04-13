import java.util.Arrays;
import java.util.Scanner;
class Demo {

   //Opdracht 1
   public static void main(String[] args) {

        String str1 = "dop";
        String str2 = "erwt";
        String str3 = "en";
        String result;
        result = str1 + str2 + str3;
        System.out.println(result);
    

    // Opdracht 2    
        int count = 0;
        String stre = "testenopaantale";
        for (int i = 0; i < stre.length(); i++){
            char result2 = stre.charAt(i);
            if (result2 == 'e'){
                count += 1;
            }
        }
        System.out.println(count);
    

    // Opdracht 3
        int[] arr = {1, 2, 3, 4};
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        System.out.println(sum);
    

    // Opdracht 4
        int[] arr2 = {2,7,3,5,4,9,1,8,6,10};
        System.out.println(Arrays.toString(arr2));
        for (int i = 0; i < arr2.length; i++){
            int small = 0;
            for (int j = i+1; j < arr2.length; j++) {
                if (arr2[i] > arr2[j]){
                    small = arr2[j];
                    arr2[j] = arr2[i];
                    arr2[i] = small;
                }
            }
        }
        System.out.println(Arrays.toString(arr2));
    

    // Opdracht 5
        // Manier 1
        class Auto{
            boolean motor;
            boolean deur;
            boolean voorruit;
            boolean uitlaat;

            public Auto(boolean[] arr){
                this.motor = arr[0];
                this.deur = arr[1];
                this.voorruit = arr[2];
                this.uitlaat = arr[3];
                System.out.println("Auto heeft werkende motor: " + motor +
                    ", deur: " + deur + ", voorruit: " + voorruit + ", uitlaat: " + uitlaat);
            }
        }

        class Monteur{
            int repareren(Auto auto){
                int kosten = 0;
                if (auto.motor == false){
                    auto.motor = true;
                    kosten += 25;
                }
                if (auto.deur == false){
                    auto.deur = true;
                    kosten += 25;
                }
                if (auto.voorruit == false){
                    auto.voorruit = true;
                    kosten += 25;
                }
                if (auto.uitlaat == false){
                    auto.uitlaat = true;
                    kosten += 25;
                }
                return(kosten);
            }
        }

        boolean[] arr3 = {true,false,true,true};
        Auto auto1 = new Auto(arr3);
        System.out.println(auto1.motor);

        Monteur monteur1 = new Monteur();
        int kosten = monteur1.repareren(auto1);
        System.out.println("De reparatiekosten zijn \u20ac" + kosten);

        /* Manier 2
        class Autoarray{
            boolean[] arr;
            public Autoarray(boolean een, boolean twee,
                boolean drie, boolean vier){
                this.arr = new boolean[]{een,twee,drie,vier};
                System.out.println("Auto heeft werkende [motor, deur, voorruit, uitlaat]: "
                    + Arrays.toString(arr));
            }
        }
        boolean motor = true;
        boolean deur = true;
        boolean voorruit = true;
        boolean uitlaat = true;
        Autoarray auto2 = new Autoarray(motor,deur,voorruit,uitlaat);
        System.out.println(Arrays.toString(auto2.arr));
        */


    // Opdracht 6
    Scanner scan = new Scanner(System.in);
    System.out.println("Voer string in:");
    String input = scan.nextLine();
    char[] chararray = input.toCharArray();
    int[] asciiarray = new int[chararray.length];
    for (int i=0; i<chararray.length; i++){
        asciiarray[i] = chararray[i];
    }
    System.out.println(asciiarray[0]);

    for (int i = 0; i < asciiarray.length; i++){
        int small = 0;
        for (int j = i+1; j < asciiarray.length; j++) {
            if (asciiarray[i] > asciiarray[j]){
                small = asciiarray[j];
                asciiarray[j] = asciiarray[i];
                asciiarray[i] = small;
            }
        }
    }
    char[] alphabet = new char[asciiarray.length];
    for (int i=0; i<asciiarray.length; i++){
        alphabet[i] = (char) asciiarray[i];
    }
    String output = String.valueOf(alphabet);
    System.out.println(output);


    // Opdracht 7
    String woord = "fiets";
    char[] chararray2 = woord.toCharArray();
    for (int i=0; i<chararray2.length; i++){
        chararray2[i] = 95;
    }
    String streepjes = String.valueOf(chararray2);
    System.out.println(streepjes);

    Scanner scan2 = new Scanner(System.in);
    System.out.println("Raadt het woord:");
    String input2 = scan2.nextLine();
    System.out.println(input2.length());
    for (int i=0; i<input2.length(); i++){
        if (woord.contains(String.valueOf(input2.charAt(i))) == false){
            chararray2[i] = '0';
        }
        else if (woord.contains(String.valueOf(input2.charAt(i))) && input2.charAt(i) != woord.charAt(i)){
            chararray2[i] = '1';
        }
        else{
            chararray2[i] = '2';
        }
    }
    String output2 = String.valueOf(chararray2);
    System.out.println("output2 = " + output2);
    System.out.println("Length output2 = " + output2.length());


    // Opdracht 8
    class Boot{
        int starten(){
            return(0);
        }
    }

    class Speedboot extends Boot{
        int starten(){
            return(1);
        }
    }

    class Kapitein{
        void varen(Boot boot){
            if (boot.starten() == 1){
                System.out.println("Ik zet even mijn pet af");
            }
        }
    }

    Boot boot1 = new Boot();
    Boot boot2 = new Speedboot();
    Kapitein kapitein1 = new Kapitein();
    kapitein1.varen(boot2);

 

    // Opdracht 9

    // Opdracht 10
    String gezegd = "Gezegd is:";
    String remember = "";
    System.out.println("5 rondes ik ga op vakantie!");
    int rondes = 5;
    
    for (int i=0; i<rondes; i++){
        Scanner scan4 = new Scanner(System.in);   
        System.out.println("Ik ga op vakantie en ik neem mee:");
        String input4 = scan4.nextLine();
        if (i==0){
            gezegd = gezegd + " " + input4;
            remember = input4;
        }
        else{
            int lastchar = remember.length()-1;
            if (input4.charAt(0) == remember.charAt(lastchar)){
                gezegd = gezegd + ", " + input4;
                remember = input4;    
            }
            else{
                System.out.println("Letter komt niet overeen!");
                i -= 1;
            }
        }
        System.out.println(gezegd);
    }
    
    




    }    
}
    




