package org.example;

public class RomainConverter {
    public String convertToRomanNumber(int number){

        if(number < 1){
            return "Invalid number";
        }else{
            if(number < 4){
                return convertOneToFour(number);
            }
            if(number == 4){
                return "IV";
            }
            if(number == 5){
                return "V";
            }
            if(number > 5 && number < 9){
                return convertFiveToNine(number);
            }
            if(number == 9){
                return "IX";
            }
            if(number == 10){
                return "X";
            }
            if(number > 10 && number < 40){
                return "X" + convertToRomanNumber(number - 10);
            }
            if(number == 40){
                return "XL";
            }
            
        } 

        

        return null;
    }

    public String convertOneToFour(int number){
        String result = "";
        for(int i = 0; i < number; i++){
            result += "I";
        }
        return result;
    }

    public String convertFiveToNine(int number){
        String result = "V";
        for(int i = 5; i < number; i++){
            result += "I";
        }
        return result;
    }
}
