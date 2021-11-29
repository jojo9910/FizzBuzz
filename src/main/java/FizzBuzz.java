public class FizzBuzz {

    public String of(int givenNumber) {
        if(givenNumber>200 || givenNumber<1){
            throw new IllegalArgumentException("Given Number Is Not In Range:");
        }

        boolean [] arr=checkRequiredDigit(givenNumber);
        if(givenNumber%3==0 && givenNumber%5==0 && arr[0] && arr[1]){
            return "LegendaryGrandMasterFizzBuzz";
        }

        else if((givenNumber%3==0 && givenNumber%5==0 && (arr[0] || arr[1]))
                || (arr[0] && arr[1] && (givenNumber%3==0 || givenNumber%5==0))){
            return "GrandMasterFizzBuzz";
        }

        else if((arr[0] && arr[1]) || (givenNumber%3==0 && givenNumber%5==0)){
            return "MasterFizzBuzz";
        }

        else if((givenNumber%3==0 && arr[1]) || (givenNumber%5==0 && arr[0])){
            return "FizzBuzz";
        }
        else if(givenNumber%3==0 || arr[0]){
            return "Fizz";
        }

        else if(givenNumber%5==0 || arr[1]){
            return "Buzz";
        }

        return String.valueOf(givenNumber);
    }

    public boolean[] checkRequiredDigit(int givenNumber) {
        boolean digitThree=false,digitFive=false;
        while(givenNumber>0){
            if(givenNumber%10==3) digitThree=true;
            if(givenNumber%10==5) digitFive=true;
            givenNumber/=10;
        }
        return new boolean[]{digitThree, digitFive};
    }

}
