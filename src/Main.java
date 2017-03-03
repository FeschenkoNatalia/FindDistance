import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<Integer>();
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            numbers.add(i, rand.nextInt(10));
        }

        System.out.println("The list of random numbers is the following "+ numbers);
        Set<Integer> set = new TreeSet<>(numbers);
        System.out.println("The list of sorted in ascending order numbers without repeated numbers is the following "+ set);
        List<Integer> sortedNumbers = new ArrayList<>(set);
        if (sortedNumbers.size()>1) {
            int distance = sortedNumbers.get(0) - sortedNumbers.get(1) - 1;
            System.out.println("The distance between two least numbers equals "+ distance);
        }
        else
            System.out.println("The list of numbers consists from only one number "+ sortedNumbers.get(0));
    }
}