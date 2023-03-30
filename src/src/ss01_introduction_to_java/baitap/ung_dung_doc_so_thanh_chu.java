package ss01_introduction_to_java.baitap;

import java.util.Scanner;

public class ung_dung_doc_so_thanh_chu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        String result = "";
        do {
            System.out.print("Nhập số cần đọc : ");
            number = scanner.nextInt();
        } while (number < 0 || number > 999);
        int numberThree = number % 10;
        int numberTwo = (number % 100) / 10;
        int numberOne = number / 100;
        switch (numberOne) {
            case 0:
                result += "";
                break;
            case 1:
                result += "One hundred";
                break;
            case 2:
                result += "Two hundred";
                break;
            case 3:
                result += "Three hundred";
                break;
            case 4:
                result += "Four hundred";
                break;
            case 5:
                result += "Five hundred";
                break;
            case 6:
                result += "Six hundred";
                break;
            case 7:
                result += "Seven hundred";
                break;
            case 8:
                result += "Eight hundred";
                break;
            case 9:
                result += "Nine hundred";
                break;
        }
        if (numberOne != 0 && (numberTwo != 0 || numberThree != 0)) {
            result += " and ";
        }
        switch (numberTwo) {
            case 0:
                result += "";
                break;
            case 1: {
                switch (numberThree) {
                    case 0:
                        result += "ten";
                        break;
                    case 1:
                        result += "eleven";
                        break;
                    case 2:
                        result += "twelve";
                        break;
                    case 3:
                        result += "thirteen";
                        break;
                    case 4:
                        result += "fourteen";
                        break;
                    case 5:
                        result += "fifteenth";
                        break;
                    case 6:
                        result += "sixteenth";
                        break;
                    case 7:
                        result += "seventeenth";
                        break;
                    case 8:
                        result += " eighteenth";
                        break;
                    case 9:
                        result += "nineteenth";
                        break;
                }
                break;
            }
            case 2:
                result += "twenty";
                break;
            case 3:
                result += "thirty";
                break;
            case 4:
                result += "forty";
                break;
            case 5:
                result += "fifty";
                break;
            case 6:
                result += "sixty";
                break;
            case 7:
                result += "seventy";
                break;
            case 8:
                result += "eighty";
                break;
            case 9:
                result += "ninety";
                break;
        }
        if (numberTwo != 1) {
            switch (numberThree) {
                case 0: {
                    if (numberOne == 0 && numberTwo == 0) result = "zero";
                }
                break;
                case 1:
                    result += "one";
                    break;
                case 2:
                    result += "two";
                    break;
                case 3:
                    result += "three";
                    break;
                case 4:
                    result += "four";
                    break;
                case 5:
                    result += "five";
                    break;
                case 6:
                    result += "six";
                    break;
                case 7:
                    result += "seven";
                    break;
                case 8:
                    result += "eight";
                    break;
                case 9:
                    result += "nine";
                    break;
            }
        }

        System.out.println(result);
    }
    }






