public
    class S17263_zestaw03 {

    public void cwiczenie_01(){
        for(int i = 1; i<=10; i++){
            System.out.println(i);
        }
    }

    public void cwiczenie_02(){
        int s = 0;
        int i = 1;
        while(i <=10){
            s = s + i++;
            System.out.println(s);
        }
    }

    public void cwiczenie_03(){

        int s = 0;
        int i = 1;

        while(i < 0){
            s = s + i++;
            System.out.println(s);

        }

        do{
            s = s + i++;
            System.out.println(s);
        } while(i < 0);

        // Pętla do while wykona się przynajmniej jeden raz.
    }

    public void cwiczenie_04(){

        double a = 1;

        for(int i = 0; i < 10; i++){
            a *= 2;
            System.out.println(1/a);
        }
    }

    public void cwiczenie_05(){

        double a = 1;

        for(int i = 0; i < 10; i++){
            a *= 2;
            double b = (int)1/a;
            int wrt = 0;
            System.out.println(b * b);
        }
    }

    public void cwiczenie_06(){

        for(int i = -1500; i <= 1500; i++){
            if(i%2 == 0){
                if(i%3 == 0){
                    System.out.println(i);
                }
            }
        }
    }

    public void cwiczenie_07(){

        for(int i = 0; i < 5; i++){
            for(int j = 0; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
