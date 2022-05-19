package Th;

public class FizzBuzz {

    public String fizzBuzz(int number){
        int havexx=number/10;
        int havex=number%10;
        boolean isfizzxx= havexx==3;
        boolean isfizzx=havex==3;
        boolean isBuzzxx= havexx==5;
        boolean isBuzzx=havex==5;
            boolean isFizz=number%3==0;
            boolean isBuzz=number%5==0;
            if(isFizz && isBuzz)
                return "FizzBuzz";

            if(isFizz)
                return "Fizz";

            if(isBuzz)
                return "Buzz";
            else
            if (isfizzxx||isfizzx){
                return "fizz";
            }
            else
            if (isBuzzx||isBuzzxx)
                return "buzz";
            else
                return number + "";
        }
}
