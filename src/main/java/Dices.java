import java.util.Random;

public class Dices {

        int die1, die2, sum;

        public int roll(){
            Random rand = new Random();
            die1 = rand.nextInt(5) + 1;
            die2 = rand.nextInt(5) + 1;
            sum = die1 + die2;
            return sum;}










}

