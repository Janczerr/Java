public
    class S17263_zestaw02 {

    public void cwiczenie_01(){

        byte lowByte = -128, highByte = 127;
        short lowShort = -32768, highShort = 32767;
        int lowInt = -2147483648, highInt = 2147483647;
        //long lowLong = –9223372036854775808L, highLong = 9223372036854775807L;
        boolean lowBoolean = false, highBoolean = true;
        float lowFloat1 = -3.4028234663852886E38f, lowFloat2 = 1.401298464324817E-45f;
        float highFloat1 = -1.401298464324817E-45f, highFloat2 = 3.4028234663852886E38f;
        double lowDouble1 = -1.7976931348623157E308, lowDouble2 = 4.9E-324;
        double highDouble1 = -4.9E-324, highDouble2 = 1.7976931348623157E308;
        char lowChar = 0, highChar = (char) 65556;

    }

    public void cwiczenie_02(){

        boolean varBoolean = true;
        int varInt = 50;
        double varDouble = 50;
        char varChar = 50;

        /*

        if(varBoolean == varInt){
            System.out.print("Boolean == Int");
        }

        if(varBoolean == varDouble){
            System.out.print("Boolean == Double");
        }

        if(varBoolean == varChar){
            System.out.print("Boolean == Char");
        }

        */

        if (varInt == varDouble){
            System.out.println("Int == Double");
        }

        if (varInt == varChar){
            System.out.println("Int == Char");
        }

        if (varDouble == varChar){
            System.out.println("Double == Char");
        }

    }

    public void cwiczenie_03(){

        int a = 250;
        double b = 30.7;

        a = (int) b;
        b = a;

    }

    public void cwiczenie_04(){
        char a = 15;
        int b = 20;
        float c = 16.2F;
        double d = 16.5;
        byte e = 18;

        System.out.println(a+b);
        System.out.println(b+a);
        System.out.println(c+d);
        System.out.println(e+b);
    }

    public void cwiczenie_05(){
        int x = 2 * (((5 + 3) * 4) - 8);
    }

    public void cwiczenie_06(){

        int x = 2 * (((5 + 3) * 4) - 8);
        // A
        if(x >= 0) {
            System.out.println("Wartosc nalezy do przedzialu");
        }
        else {
            System.out.println("Wartosc nie nalezy do przedzialu");
        }
        //B
        if(x <= 1) {
            System.out.println("Wartosc nalezy do przedzialu");
        }
        else {
            System.out.println("Wartosc nie nalezy do przedzialu");
        }
        //C
        if(x <= 1 & x >=0) {
            System.out.println("Wartosc nalezy do przedzialu");
        }
        else {
            System.out.println("Wartosc nie nalezy do przedzialu");
        }
    }

    public void cwiczenie_07(){
        int wrt = 8;

        //Polecenie nie bylo dla mnie jednoznaczne wiec przygotowalem dwa rozwiazania

        //Sposob 1

        //A
        if((wrt > -15 & wrt <= -10) || (wrt > -5 & wrt < 0) || (wrt > 5 & wrt < 10)) {
            System.out.println("Wartosc nalezy do przedzialu");
        }
        else {
            System.out.println("Wartosc nie nalezy do przedzialu");
        }
        //B
        if((wrt <= -13) || (wrt > -8 & wrt <= -3)) {
            System.out.println("Wartosc nalezy do przedzialu");
        }
        else {
            System.out.println("Wartosc nie nalezy do przedzialu");
        }
        //C
        if(wrt >= -4) {
            System.out.println("Wartosc nalezy do przedzialu");
        }
        else {
            System.out.println("Wartosc nie nalezy do przedzialu");
        }

        //Sposob 2
        if(((wrt > -15 & wrt <= -10) || (wrt > -5 & wrt < 0) || (wrt > 5 & wrt < 10)) || ((wrt <= -13) || (wrt > -8 & wrt <= -3)) || (wrt >= -4)) {
            System.out.println("Wartosc nalezy do przedzialu");
        }
        else {
            System.out.println("Wartosc nie nalezy do przedzialu");
        }
    }

    public void cwiczenie_08(){

        int wrt = -14;

        if ((wrt > -15 & wrt < -10) | (wrt < -13)) {
            if ((wrt > -15 & wrt < -10) ^ (wrt < -13)) {
                System.out.println("Wartosc nalezy do tylko jednego przedzialu");
            } else {
                System.out.println("Wartosc nalezy do dwoch przedzialow");
            }
        } else {
            System.out.println("Wartosc nie nalezy do zadnego przedzialu");
        }
    }
}
