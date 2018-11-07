import java.util.Random;

public
    class S17263_zestaw04 {

    public void cwiczenie_01(){
        int[] tab = new int[10];
    }

    public void cwiczenie_02(){
        int[] tab = new int[10];

        for(int i = 0; i < tab.length; i++){

            double los = Math.random();

            if(los > 0.5){
                tab[i] = 1;
            } else {
                tab[i] = 0;
            }

            System.out.println(tab[i]);
        }
    }

    public void cwiczenie_03(){
        int[] tab = new int[10];

        int licznikZer = 0;
        int licznikJedynek = 0;

        for(int i = 0; i < tab.length; i++){

            double los = Math.random();

            if(los > 0.5){
                tab[i] = 1;
                licznikJedynek++;
            } else {
                tab[i] = 0;
                licznikZer++;
            }

            System.out.print(tab[i] + " ");
        }

        System.out.println("\nJedynki: " + licznikJedynek + " Zera: " + licznikZer);
    }

    public void cwiczenie_04(){
        double[] tab = new double[10];

        for(int i = 0; i < tab.length; i++){
            Random los = new Random();
            tab[i] = los.nextInt();
        }

        for(int i = 0; i < tab.length; i++){
            System.out.println(i + ": " + tab[i]);
        }

        System.out.println();

        for(int i = 0; i < tab.length; i++){
            if(i%2 == 0){
                System.out.println(i + ": " + tab[i]);
            }
        }

        System.out.println();

        for(int i = 0; i < tab.length; i++){
            if((int)tab[i]%2 != 0){
                System.out.println(i + ": " + tab[i]);
            }
        }
    }

    public void cwiczenie_05(){
        /*
        int tab[];
        System.out.println(tab);

        Program nie skompiluje się

        */
    }

    public void cwiczenie_06(){
        int tab[] = {789, 678, 567};

        for(int i = 0; i < tab.length; i++){
            for(int j = i; j < tab.length; j++){
                System.out.println(tab[i] - tab[j]);
            }
        }

        // 0, 111, 222, 0, 111, 0
    }

    public void cwiczenie_07(){
        String[] slowa = {"Ala", "kota", "ma", "ma", "a", "kot", "Ale"};

        System.out.print(slowa[0] + " " + slowa[2] + " " + slowa[1] + " " + slowa[4] + " " + slowa[5] + " " + slowa[2] + " " + slowa[6]);
    }
}
