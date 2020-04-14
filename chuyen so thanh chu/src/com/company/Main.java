package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    int number_int;
	    String announce ="";
	    String number_str ;
	    do{
            System.out.print("Nhập số cần chuyển đổi: ");
            number_int = in.nextInt();
        }while(number_int> 999);
            number_str= String.valueOf(number_int);

	    switch (number_str.length()){
            case 1:
               announce= docSo1ChuSo(number_str);
                System.out.printf("Số %s đổi sang chữ là %s",number_str,announce);
                break;
            case 2:
                if(number_int<20){
                    announce = docSoTu10Den20(number_str);
                    System.out.printf("Số %s đổi sang chữ là %s",number_str,announce);
                }else{
                    announce= docSo2ChuSoLonHon20(number_str);
                    System.out.printf("Số %s đổi sang chữ là %s",number_str,announce);
                }
                break;
            case 3:
                announce=docSo3ChuSo(number_str);
                System.out.printf("Số %s đổi sang chữ là %s",number_str,announce);
                break;
            default :
                System.out.printf("Không thể chuyển đổi số lớn hơn 1000",number_str);

        }



    }

    public static String docSo1ChuSo(String no){
        if (no.length()>1){
            no=no.substring(1,2);

        }
        String result="";
        switch (no){
            case "1":
                result="one";
                break;
            case "2":
                result="two";
                break;
            case "3":
                result="third";
                break;
            case "4":
                result="four";
                break;
            case "5":
                result="five";
                break;
            case "6":
                result="six";
                break;
            case "7":
                result="seven";
                break;
            case "8":
                result="eight";
                break;
            case "9":
                result="nine";
                break;
            case "0":
                result="zero";
                break;
            default:
                result="không phải số";
                break;
        }
        return result;
    } //end docSo1ChuSo

    public static String docSoTu10Den20(String no){
        char first_no = no.charAt(0);
        char second_no = no.charAt(1);
        String first_str=" teen";
        String second_str;
        String total_str ="";
        switch (second_no){
            case '0':
                total_str= "ten";
                break;
            case '1':
                total_str="eleven";
                break;
            case '2':
                total_str="twelve";
                break;
            case '3':
                second_str="third";
                total_str=second_str+first_str;
                break;
            case '4':
                second_str="four";
                total_str=second_str+first_str;
                break;
            case '5':
                second_str="fifth";
                total_str=second_str+first_str;
                break;
            case '6':
                second_str="six";
                total_str=second_str+first_str;
                break;
            case '7':
                second_str="seven";
                total_str=second_str+first_str;
                break;
            case '8':
                second_str="eight";
                total_str=second_str+first_str;
                break;
            case '9':
                second_str="nine";
                total_str=second_str+first_str;
                break;
        }

        return total_str;
    }// end

    public static String docSo2ChuSoLonHon20(String no){
        String result ="";
        char first_no = no.charAt(0);
        char second_no =no.charAt(1);

        String first_str= String.valueOf(first_no);
        String second_str=String.valueOf(second_no);

        if (first_str.equals("2")){
           first_str="twenty";

        }else{
            first_str=docSo1ChuSo(first_str)+ "ty";

        }

        if (second_str.equals("0") ){
            result=first_str;
            return result;
        }else{
            second_str=docSo1ChuSo(second_str);
        }

        result= first_str+" "+second_str;
        return result;
    }//end

    public static String docSo3ChuSo(String no){
      String result="";
      String first_str= no.substring(0,1);
      String second_and_first_str= no.substring(1,3);
      first_str=docSo1ChuSo(first_str)+" hundred";

      int second_and_first_int = Integer.parseInt(second_and_first_str);
      if(second_and_first_int<10){
          second_and_first_str=docSo1ChuSo(second_and_first_str);
      }else if(second_and_first_int <20 ){
          second_and_first_str=docSoTu10Den20(second_and_first_str);
      }else{
          second_and_first_str=docSo2ChuSoLonHon20(second_and_first_str);
      }
      result= first_str +" and "+second_and_first_str;
      return result;
    }
}
