public class Ders {

public static void main(String[] args) {
java.util.Scanner scan = new
java.util.Scanner(System.in);
System.out.print("Sayi girisi : ");
double val = Double.parseDouble(scan.nextLine());
for (int i = 2; i <= val; i++)
if(isPrime(i))
System.out.println(i);
System.out.println("Program Sonlandı...");
}
public static boolean isPrime(int val) {
if (val % 2 == 0)
return val == 2;
if (val % 3 == 0)
return val == 3;
if (val % 5 == 0)
return val == 5;
if (val % 7 == 0)
return val == 7;
if (val % 11 == 0)
return val == 11;
for (int i = 3; i * i <= val; i += 2)
if (val % i == 0)
return false;
return true;
}
}
