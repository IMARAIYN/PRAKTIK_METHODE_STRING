public class JavaString {
   public static void main(String[] args) {
       String name = "Irma Nurmalasari";
       String address = "Parungkuda, Sukabumi";

       // STRING LENGTH
       System.out.println("Panjang string 'name' adalah: " + name.length());

       // STRING SUBSTRING
       System.out.println("Hasil substring dari 'address' adalah: " + address.substring(9, 15));
       System.out.println("Hasil substring dari 'address' adalah: " + address.substring(4));

       // String charAt()
       System.out.println("Huruf di indeks 9 pada 'address' adalah: " + address.charAt(9));

       // String toLowerCase()
       String stringLower = name.toLowerCase();
       System.out.println("Sebelum menggunakan metode toLowerCase: " + name);
       System.out.println("Setelah menggunakan metode toLowerCase: " + stringLower);

       // String toUpperCase()
       String stringUpper = name.toUpperCase();
       System.out.println("Sebelum menggunakan metode toUpperCase: " + name);
       System.out.println("Setelah menggunakan metode toUpperCase: " + stringUpper);

       // String replace()
       String gantiKarakter = name.replace('i', 'o');
       String gantiKalimat = name.replace("Nurmalasari", "Cantikkk");
       System.out.println("Hasil replace karakter: " + gantiKarakter);
       System.out.println("Hasil replace kalimat: " + gantiKalimat);

       // String contains()
       System.out.println("Apakah 'name' mengandung 'Irma'? " + name.contains("Irma"));
       System.out.println("Apakah 'name' mengandung 'Nurmalasari'? " + name.contains("Nurmalasari"));

       // String equals()
       String string1 = "irma";
       String string2 = "irma";
       String string3 = "IRma";
       System.out.println("Apakah 'string1' sama dengan 'string2'? " + string1.equals(string2));
       System.out.println("Apakah 'string1' sama dengan 'string3'? " + string1.equals(string3));

       // String equalsIgnoreCase()
       System.out.println("Apakah 'string1' sama dengan 'string2' secara 'equalsIgnoreCase'? " + string1.equalsIgnoreCase(string2));
       System.out.println("Apakah 'string2' sama dengan 'string3' secara 'equalsIgnoreCase'? " + string2.equalsIgnoreCase(string3));

       // String endsWith()
       String string4 = "Irma Cantik";
       System.out.println("Apakah 'string4' diakhiri dengan 'a'? " + string4.endsWith("k"));
       System.out.println("Apakah 'string4' diakhiri dengan 'u'? " + string4.endsWith("u"));
       System.out.println("Apakah 'string4' diakhiri dengan 'Cantik'? " + string4.endsWith("Cantik"));
       System.out.println("Apakah 'string4' diakhiri dengan 'tampan'? " + string4.endsWith("tampan"));
   }
}
