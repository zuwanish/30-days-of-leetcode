class Solution {
    public int[] plusOne(int[] digits) {
        int index = digits.length-1;
        int size = index;
        int counter = 0;
        while(counter<=size){
            if(digits[index] != 9){
                digits[index]++;
                break;
            }
            else{
                digits[index--] = 0;
            }
            counter++;
        
        }
        if(counter > size){
            int[] newDigit = new int[size+2];
            System.arraycopy(digits,0,newDigit,1,size+1);
            newDigit[0] = 1;
            return newDigit;
        }
        else{
            return digits;
        }


        // String number = "";
        // int size = digits.length;
        // for(int i = 0; i<size; i++){
        //     number += digits[i];
        // }
        // int len = number.length();
        // int number2 = Integer.parseInt(number);
        // number2++;
        // number = ""+number2;
        // size = number.length();
        // if(size == len){
        //     for(int i = 0;i<size;i++){
        //         digits[i] = number.charAt(i)-48;
        //     }
        //     return digits;
        // }
        // int[] newDigit = new int[size];
        // for(int i = 0;i<size;i++){
        //         newDigit[i] = number.charAt(i)-48;
        //     }
        //     return newDigit;
        

    }
}