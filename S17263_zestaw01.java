public
    class S17263_zestaw01 {

    public void cwiczenie_03() {

        boolean logiczna;
        logiczna = true;

        byte calkowitaByte;
        calkowitaByte = 15;

        short calkowitaShort;
        calkowitaShort = 19;

        int calkowitaInt;
        calkowitaInt = 30;

        long calkowitaLong;
        calkowitaLong = 70;

        char calkowitaChar;
        calkowitaChar = 15;

        float rzeczywistaFloat;
        rzeczywistaFloat = 18;

        double rzeczywistaDouble;
        rzeczywistaDouble = 22;

        char znak;
        znak = 'a';

    }

    public void cwiczenie_04() {

        int a1234;

        //int 1abcd;

        //int @abcd;

        //int public;

        //int null;

    }

    public void cwiczenie_05() {

        char charValue = 'a';

        char charvalue = 'a';

        /*
        Program skompiluje się,
         ponieważ nazwy różnią się od siebie
          wielkością liter
          */

    }

    public void cwiczenie_06() {

        int wrt = 3; //zmienna globalna

        {
            wrt = 5; //mozna uzyc jako zmienna lokalna
        }

        /*{
            int wrt2 = 7; //zmiennej lokalnej nie mozemy uzyc jako globalnej

        }

        wrt2 = 8;

      */

        {
            boolean czyPrawda = false; //zmienna lokalna moze nazywac się tak samo jak globalna
        }

        boolean czyPrawda = true;

    }
}
