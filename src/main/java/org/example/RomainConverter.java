package org.example;

public class RomainConverter {
    public String convertToRomanNumber(int number){

        if(number < 1){
            throw new IllegalArgumentException("Number too small");
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
            if(number > 40 && number < 50){
                return "XL" + convertToRomanNumber(number - 40);
            }
            if(number == 50){
                return "L";
            }
            if(number > 50 && number < 90){
                return "L" + convertToRomanNumber(number - 50);
            }
            if(number == 90){
                return "XC";
            }
            if(number > 90 && number < 100){
                return "XC" + convertToRomanNumber(number - 90);
            }
            if(number == 100){
                return "C";
            }
            if(number > 100 && number < 400){
                return "C" + convertToRomanNumber(number - 100);
            }
            if(number == 400){
                return "CD";
            }
            if(number > 400 && number < 500){
                return "CD" + convertToRomanNumber(number - 400);
            }
            if(number == 500){
                return "D";
            }
            if(number > 500 && number < 900){
                return "D" + convertToRomanNumber(number - 500);
            }
            if(number == 900){
                return "CM";
            }
            if(number > 900 && number < 1000){
                return "CM" + convertToRomanNumber(number - 900);
            }
            if(number == 1000){
                return "M";
            }
            if(number > 1000 && number < 3000){
                return "M" + convertToRomanNumber(number - 1000);
            }
            if(number > 3000){
                throw new IllegalArgumentException("Number too big");
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
