public class Main {
    public static void main(String[] args) {

        int numberRandom = 0;
        int numberMax = 0;
        int numberMin = 100;

        for(int i=1; i<=10; i++) {
            numberRandom =(int) (Math.random()*(100-1));

            if(numberRandom>numberMax){
                numberMax=numberRandom;
            }
            if(numberRandom<numberMin){
                numberMin=numberRandom;
            }
            System.out.println("Random: " + numberRandom);
        }
        System.out.println("Max number: " + numberMax);
        System.out.println("Min number: " + numberMin);
    }
}
