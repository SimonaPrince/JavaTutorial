package HackerRank;
import java.util.*;


class Result {

    /*
     * Complete the 'simpleArraySum' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY ar as parameter.
     */

    public static int simpleArraySum(List<Integer> ar) {
        int sum=0;
        for (Integer i:ar) {
            sum=sum+ i;
        }
        System.out.print(sum);
        return sum;
    }

}

