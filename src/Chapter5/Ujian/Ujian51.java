package Chapter5.Ujian;

import java.util.Scanner;

public class Ujian51 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("====Menu Aplikasi=====");
        System.out.println("1. Binary to Octal");
        System.out.println("2. Binary to Decimal");
        System.out.println("3. Binary to Hexadecimal");
        System.out.println("4. Octal to Binary");
        System.out.println("5. Octal to Decimal");
        System.out.println("6. Octal to Hexadecimal");
        System.out.println("7. Decimal to Octal");
        System.out.println("8. Decimal to Binary");
        System.out.println("9. Decimal to Hexadecimal");
        System.out.println("10. Hexadecimal to Binary");
        System.out.println("11. Hexadecimal to Octal");
        System.out.println("12. Hexadecimal to Decimal");
        System.out.println("Please choose menu with number of menu: ");
        int menu = input.nextInt();

        switch (menu) {

            // Covert Binary to Octal
            case 1 -> {
                System.out.println("Binary to Octal");
                System.out.println("Please input Binary Number : ");
                int binary = input.nextInt();
                int decimal = 0, i = 0, octal = 0;
                int Binary = binary;

                while (binary != 0) {
                    decimal = (int) (decimal + (binary % 10) * Math.pow(2, i));
                    ++i;
                    binary = binary / 10;
                }
                i = 1;
                while (decimal != 0) {
                    octal = octal + (decimal % 8) * i;
                    decimal = decimal / 8;
                    i = i * 10;
                }
                System.out.println("value of " + Binary + " in binary is a " + octal + " in octal");

            }

            // Covert Binary to Decimal
            case 2 -> {
                System.out.println("Binary to Decimal");
                System.out.println("Please input Binary Number : ");
                int binary = input.nextInt();
                int digit, decimal = 0, i = 1;
                int Binary = binary;
                while (binary != 0) {
                    digit = binary % 10;
                    decimal = decimal + (digit * i);
                    i = i * 2;
                    binary = binary / 10;
                }
                System.out.println("value of " + Binary + " in binary is a " + decimal + " in decimal");
            }


            // Covert Binary to Hexadecimal
            case 3 -> {
                System.out.println("Binary to Hexadecimal");
                System.out.println("Please input Binary Number : ");
                int binary = input.nextInt();
                int binInput = binary;
                int digit, decimal = 0, i = 1;
                while (binary != 0) {
                    digit = binary % 10;
                    decimal = decimal + (digit * i);
                    i = i * 2;
                    binary = binary / 10;
                }
                String hex = "";
                char[] hexChars = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

                while (decimal > 0) {
                    long rem = decimal % 16;
                    hex = hexChars[(int) rem] + hex;
                    decimal = decimal / 16;
                }
                System.out.println("value of " + binInput + " in binary is a " + hex + " in hexadecimal");
            }


            // Covert Octal to Binary
            case 4 -> {
                System.out.println("Octal to Binary");
                System.out.println("Please input Octal Number : ");
                int Octal = input.nextInt();
                int i, j, octnum, decimal = 0;
                int Binary = 0;
                i = 0;
                int Octnum = Octal;

                while (Octal != 0) {
                    decimal = (int) (decimal + (Octal % 10) * Math.pow(8, i));
                    ++i;
                    Octal = Octal / 10;
                }
                j = 1;
                while (decimal > 0) {
                    Binary = Binary + (decimal % 2) * j;
                    decimal = decimal / 2;
                    j = j * 10;
                }
                System.out.println("value of " + Octnum + " in Octal is a " + Binary + " in Binary");
            }

            // Covert Octal to Decimal
            case 5 -> {
                System.out.println("Octal to decimal");
                long octnum, octal, decnum = 0;
                int i = 0;
                System.out.print("Please input Octal number : ");
                octnum = input.nextLong();
                octal = octnum;
                while (octnum != 0) {
                    decnum = (long) (decnum + (octnum % 10) * Math.pow(8, i++));
                    octnum = octnum / 10;
                }
                System.out.println("Value is " + octal + " in Octal is " + decnum + " in Decimal");
            }
            // Convert Octal to Hexadecimal
            case 6 -> {
                System.out.println("Octal to Hexadecimal");
                System.out.println("Please input Octal Number : ");
                int Octal = input.nextInt();
                int Octinput = Octal;
                int digit, Decimal = 0, i = 1;

                while (Octal != 0) {
                    digit = Octal % 10;
                    Decimal = Decimal + (digit * i);
                    i = i * 2;
                    Octal = Octal / 10;
                }
                String hex = "";
                char[] hexChars = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

                while (Decimal > 0) {
                    long rem = Decimal % 16;
                    hex = hexChars[(int) rem] + hex;
                    Decimal = Decimal / 16;
                }
                System.out.println("value of " + Octinput + " in Octal is a " + hex + " in hexadecimal");
            }

            // Convert Decimal to Octal
            case 7 -> {
                System.out.println("Decimal to Binary");
                Scanner sc = new Scanner(System.in);
                System.out.print("Please input Decimal number: ");
                int n = sc.nextInt();
                int bin[]=new int[100];
                long dec;
                int i = 0;
                dec = n;

                while (n > 0)
                {
                    bin[i++] = n%2;
                    n = n/2;
                }
                System.out.print("Value of " + dec + " in Decimal is a ");
                for(int j = i-1;j >= 0;j--)
                {
                    System.out.print(bin[j]);
                }
                System.out.print(" in Binary");
            }

            // Convert Decimal to Binary
            case 8 -> {
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter a decimal number");
                int n=sc.nextInt();
                int  bin[]=new int[100];
                int i = 0;
                while(n > 0)
                {
                    bin[i++] = n%2;
                    n = n/2;
                }
                System.out.print("Binary number is : ");
                for(int j = i-1;j >= 0;j--)
                {
                    System.out.print(bin[j]);
                }
            }

            // Convert Decimal to Hexadecimal
            case 9 -> {
                System.out.println("Decimal to Hexadecimal");
                System.out.println("Please input Decimal Number : ");
                int Decimal = input.nextInt();
                int Decinput = Decimal;
                int digit, Hexadecimal = 0, i = 1;

                while (Decimal != 0) {
                    digit = Decimal % 16;
                    Hexadecimal = Hexadecimal + (digit * i);
                    i = i * 2;
                    Decimal = Decimal / 16;
                }
                String hex = "";
                char[] hexChars = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

                while (Hexadecimal > 0) {
                    long rem = Hexadecimal % 16;
                    hex = hexChars[(int) rem] + hex;
                    Hexadecimal = Hexadecimal / 16;
                }
                System.out.println("value of " + Decinput + " in Decimal is a " + hex + " in hexadecimal");
            }

            // Convert Hexadecimal to Binary
            case 10 -> {
                System.out.println("Hexadecimal to Binary");
                int i=0, len;
                String hexadecimal;

                Scanner s = new Scanner(System.in);

                System.out.println("Please input Alphabet Hexadecimal: ");
                hexadecimal = s.nextLine();

                len = hexadecimal.length();
                char[] hexDigit = hexadecimal.toCharArray();

                System.out.print("Value is " + hexadecimal + " in hexadecimal is a ");
                while (i<len)
                {
                    switch (hexDigit[i])
                    {
                        case '0':
                            System.out.print("0000"); break;
                        case '1':
                            System.out.print("0001"); break;
                        case '2':
                            System.out.print("0010"); break;
                        case '3':
                            System.out.print("0011"); break;
                        case '4':
                            System.out.print("0100"); break;
                        case '5':
                            System.out.print("0101"); break;
                        case '6':
                            System.out.print("0110"); break;
                        case '7':
                            System.out.print("0111"); break;
                        case '8':
                            System.out.print("1000"); break;
                        case '9':
                            System.out.print("1001"); break;
                        case 'A':
                        case 'a':
                            System.out.print("1010"); break;
                        case 'B':
                        case 'b':
                            System.out.print("1011"); break;
                        case 'C':
                        case 'c':
                            System.out.print("1100"); break;
                        case 'D':
                        case 'd':
                            System.out.print("1101"); break;
                        case 'E':
                        case 'e':
                            System.out.print("1110"); break;
                        case 'F':
                        case 'f':
                            System.out.print("1111"); break;
                        default:
                            System.out.println("Invalid hexadecimal digit!");
                            return;
                    }
                    i++;
                }
                System.out.print(" in binary");
            }
            // Convert to Hexadecimal to Octal
            case 11 -> {
                System.out.println("Hexadecimal to decimal");
                int decimal =0, i=0, len,rem;
                String hexadecimal;

                Scanner s = new Scanner(System.in);

                System.out.println("Please input Alphabet Hexadecimal: ");
                hexadecimal = s.nextLine();

                len =  hexadecimal.length();

                len--;
                while (len>=0) {
                    rem = hexadecimal.charAt(len);
                    if (rem > 48 && rem <= 57)
                        rem = rem - 48;
                    else if (rem >= 65 && rem <= 70)
                        rem = rem - 55;
                    else if (rem >= 97 && rem <= 102)
                        rem = rem - 87;
                    else {
                        System.out.println("\ninvalid hexadecimal digit!");
                    }
                    decimal = (int) (decimal + (rem * Math.pow(16, i)));
                    i++;
                    len--;
                }
                System.out.println("Value is " + hexadecimal + " in hexadecimal is a " + decimal + " in decimal");
            }

            //Convert to Hexadecimal to Desimal
            case 12 -> {
                System.out.println("Hexadecimal to Octal");
                {
                    int decimal=0, rem, i=0, len;
                    String hexadecimal;
                    int[] octal = new int[20];

                    Scanner s = new Scanner(System.in);

                    System.out.print("Please input Alphabet Hexadecimal: ");
                    hexadecimal = s.nextLine();

                    len = hexadecimal.length();
                    len--;

                    while(len>=0)
                    {
                        rem = hexadecimal.charAt(len);
                        if(rem>=48 && rem<=57)
                            rem = rem-48;
                        else if(rem>=65 && rem<=70)
                            rem = rem-55;
                        else if(rem>=97 && rem<=102)
                            rem = rem-87;
                        else
                        {
                            System.out.println("\nInvalid Hexadecimal Digit!");
                            return;
                        }
                        decimal = (int) (decimal + (rem*Math.pow(16, i)));
                        i++;
                        len--;
                    }

                    i=0;
                    while(decimal!=0)
                    {
                        octal[i] = decimal%8;
                        i++;
                        decimal = decimal/8;
                    }

                    System.out.print("Value is " + hexadecimal + " in hexadecimal is a ");
                    for(i=(i-1); i>=0; i--)
                        System.out.print(octal[i]);
                    System.out.print(" in octal");
                }
            }

            default -> {
                System.out.println("Sorry,your choose in wrong");
            }
        }
    }
}
