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
            if(number == 6){
                return "VI";
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
}
