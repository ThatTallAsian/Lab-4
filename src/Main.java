import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a hexadecimal number: ");
        String hex_num = scanner.next();
        //convert to decimal
        long dec_num = Main.hexToDecimal(removePrefix(hex_num));
        System.out.println("Your number is " + dec_num + " in decimal");

    }

    public static String removePrefix(String hex) {
        if(hex.contains("0x")||(hex.contains("0X"))){
            String newString = hex.substring(2);
            return newString;
        }
        else {
            return hex;
        }
    }

    public static long hexToDecimal(String hex){
        long dec_num = 0;
        int stringLength = hex.length();
        for(int i = stringLength; i > 0; i--){
            char c = Character.toUpperCase(hex.charAt(i-1));
            switch (c){
                case 'A':
                    dec_num += 10 * Math.pow(16, stringLength - i);
                    break;
                case 'B':
                    dec_num += 11 * Math.pow(16, stringLength - i);
                    break;
                case 'C':
                    dec_num += 12 * Math.pow(16, stringLength - i);
                    break;
                case 'D':
                    dec_num += 13 * Math.pow(16, stringLength - i);
                    break;
                case 'E':
                    dec_num += 14 * Math.pow(16, stringLength - i);
                    break;
                case 'F':
                    dec_num += 15 * Math.pow(16, stringLength - i);
                    break;
                case 'G':
                    dec_num += 16 * Math.pow(16, stringLength - i);
                    break;
                default:
                    dec_num += Character.getNumericValue(c) * Math.pow(16, stringLength - i);
                    break; //Possibilities of hexadecimal
            }
        }
        return dec_num;
    }
}
