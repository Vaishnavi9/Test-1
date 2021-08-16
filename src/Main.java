import java.sql.Struct;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        List<String> test = new ArrayList<>();

        test.add("p q r");
        test.add("p r");
        test.add("r q");
        test.add("r q");

        String[] mainInput = test.get(0).split("\\s");

        String[] validSet1 = new String[] {mainInput[0], mainInput[2]};
        String[] validSet2 = new String[] {mainInput[1], mainInput[0]};
        String[] validSet3 = new String[] {mainInput[2], mainInput[1]};

        String[] test1 = test.get(1).split("\\s");
        String[] test2 = test.get(2).split("\\s");
        String[] test3 = test.get(3).split("\\s");

        boolean firstCondition = false;
        boolean secondCondition = false;
        boolean thirdCondition = false;

        if (Arrays.equals(test1,validSet1) ||
            Arrays.equals(test1, validSet2) ||
                Arrays.equals(test1, validSet3))
        {
            //System.out.println("I am satisfied - test 1");
            firstCondition = true;}

        if (Arrays.equals(test2,validSet1) ||
                Arrays.equals(test2, validSet2) ||
                Arrays.equals(test2, validSet3)){
            //System.out.println("I am satisfied - test 2");
            secondCondition = true;}


        if (Arrays.equals(test3,validSet1) ||
                Arrays.equals(test3, validSet2) ||
                Arrays.equals(test3, validSet3)){
            //System.out.println("I am satisfied - test 3");
            thirdCondition = true;}



        if (firstCondition && secondCondition && thirdCondition){
            System.out.println("1");
        }
        else {
            System.out.println("-1");
        }
    }


}
