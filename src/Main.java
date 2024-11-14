import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

/*int a = 16; int b = 24;
int kurang = a-b; int kali = a*b; int bagi = a/b;
System.out.println(a+b);
        System.out.println(a%b);
        System.out.println(kurang+kali);
        System.out.println(kali);
        System.out.println(bagi);

        boolean makan = true; boolean minum = false;
        boolean aturan = makan || minum;
        System.out.println(aturan);
        System.out.println(makan && minum);



        int saldo = 999999999;
        int tarik = 100;

        if (saldo>tarik){
            System.out.println ("you got " + saldo + ", you are rich");
        }else {
            System.out.println ("gembel");
        }

        for (int i = 0;i<=10;i++){
            System.out.println("for "+i);
        }

        int y=0;
        while (y<=10){
            System.out.println("while "+y);
            y++;
        }*/

        Scanner ye  = new Scanner(System.in);
        boolean cont = true;
        while (cont){
        System.out.println("angka 1 :");
        int angka1 = Integer.parseInt(ye.nextLine());
        System.out.println("angka 2 :");
        int angka2 = Integer.parseInt(ye.nextLine());
        System.out.println("operator :");
        char operator = ye.nextLine().charAt(0);

        calc(angka1,angka2,operator);
            Bio biotest=new Bio("namagw","hobigw", 999);

            biotest.yeaaah();
            System.out.println("      lanjut y/n:");
            String test = ye.nextLine();
            if (test.equals("y"))
                cont=true;
            else
                cont=false;
        }


        ye.close();
    }


    public static void calc(int angka1,int angka2, char operator){
        if (String.valueOf(operator).equals("+"))
            System.out.println(angka1+angka2);
        else if (String.valueOf(operator).equals("-"))
            System.out.println(angka1-angka2);
        else if (String.valueOf(operator).equals("/"))
            System.out.println(angka1/angka2);
        else if (String.valueOf(operator).equals("*"))
            System.out.println(angka1*angka2);
        else if (String.valueOf(operator).equals("%"))
            System.out.println(angka1%angka2);
        else
            System.out.println("suka2");
    }


}

class Bio {
    String nama, hobi;
    int umur;

    Bio(String nama2,String hobi2, int umur2){
        this.nama=nama2;
        this.hobi=hobi2;
        this.umur=umur2;
    }

    void yeaaah(){
        System.out.print("hey  "+this.nama);
    }
}