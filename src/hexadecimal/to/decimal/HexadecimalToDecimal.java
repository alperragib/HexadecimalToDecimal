package hexadecimal.to.decimal;

import java.util.Scanner;

/**
 * @author bilisimrehberi.net
 * Paylaşılan kodu sadece bilisimrehberi.net kullanıcıları kullanabilir.
 * bilisimrehberi.net dışında bir sitede sadece yazının bağlantısı verilerek paylaşılmasına izin verilir.
 * Kodları ticari amaçlı kullanmak yasaktır.
 * bilisimrehberi.net tüm hakları saklıdır.
 */

public class HexadecimalToDecimal {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("16 lık sistemde sayı giriniz: ");
        String sayi=null;
        try{
            
         sayi = input.nextLine();
         if(sayi==null)
         {
             throw new HexadecimalError("Hatalı değer girdiniz!");
         }
         for(int i=0;i<sayi.length();i++)
        {
            if(sayi.charAt(i)=='0' || sayi.charAt(i)=='1' || sayi.charAt(i)=='2' || sayi.charAt(i)=='3' || sayi.charAt(i)=='4' || sayi.charAt(i)=='5' || sayi.charAt(i)=='6' ||
                    sayi.charAt(i)=='7' || sayi.charAt(i)=='8' || sayi.charAt(i)=='9' || sayi.charAt(i)=='A' || sayi.charAt(i)=='B' || sayi.charAt(i)=='C' || sayi.charAt(i)=='D' || 
                        sayi.charAt(i)=='E' || sayi.charAt(i)=='F')
            {   
            }
            else
            {
                throw new HexadecimalError("Hatalı değer girdiniz!");
            }
        }
        }
        catch(HexadecimalError e)
        {
            System.out.println(e.getMessage());
            return;
        }
        
        System.out.println(sayi+"'nın 10 luk sistemde karşılığı: "+ Function(sayi));
    }
    public static int Function (String sayi)
    {
        int sonuc=0;
        int j=0;
        for(int i=(sayi.length()-1);i>=0;i--,j++)
        {
            int a=0;
            if(sayi.charAt(j)=='A')
            {
                a=10;
            }
            else if(sayi.charAt(j)=='B')
            {
                a=11;
            }
            else if(sayi.charAt(j)=='C')
            {
                a=12;
            }
            else if(sayi.charAt(j)=='D')
            {
                a=13;
            }
            else if(sayi.charAt(j)=='E')
            {
                a=14;
            }
            else if(sayi.charAt(j)=='F')
            {
                a=15;
            }
            else
            {
                a=Integer.parseInt(String.valueOf(sayi.charAt(j)));
            }
            sonuc += a*Math.pow(16,i);
            
           
        }
        return sonuc;
    }
}
