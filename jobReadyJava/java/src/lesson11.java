import java.util.Random;

public class lesson11 {

    public static void stilPostive() {
        int[] numbers = { 389, -447, 26, -485, 712, -884, 94, -64, 868, -776, 227, -744, 422, -109, 259, -500, 278,
                -219, 799, -311 };

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0)
                System.out.println(numbers[i]);
        }

    }

    public static void fruitBasket() {
        String[] fruitBasket = { "Orange", "Apple", "Orange", "Apple", "Orange",
                "Apple", "Orange", "Apple", "Orange", "Orange", "Orange", "Apple",
                "Orange", "Orange", "Apple", "Orange", "Orange", "Apple", "Apple",
                "Orange", "Apple", "Apple", "Orange", "Orange", "Apple", "Apple",
                "Apple", "Banana", "Apple", "Orange", "Orange", "Apple", "Apple",
                "Orange", "Orange", "Orange", "Orange", "Apple", "Apple", "Apple",
                "Apple", "Orange", "Orange", "PawPaw", "Apple", "Orange", "Orange",
                "Apple", "Orange", "Apple", "Kiwi", "Orange", "Apple", "Orange",
                "Apple", "Orange", "Orange", "Apple", "Apple", "Orange", "Orange",
                "Apple", "Orange", "Apple", "Kiwi", "Orange", "Apple", "Orange",
                "Dragonfruit", "Apple", "Orange", "Orange" };

        int apples = 0, Orange = 0, otherFruits = 0;
        for (int i = 0; i < fruitBasket.length; i++) {
            if (fruitBasket[i] == "Orange")
                Orange += 1;
            else if (fruitBasket[i] == "Apple")
                apples += 1;
            else
                otherFruits++;
        }
        System.out.println("Numbers of apples: " + apples);
        System.out.println("Numbers of Orange: " + Orange);
        System.out.println("Numbers of otherFruits: " + otherFruits);

    }

    public static void simpleCombination() {
        int[] firstHalf = { 3, 7, 9, 10, 16, 19, 20, 34, 35, 45, 47, 49 }; // 12 numbers
        int[] secondHalf = { 51, 54, 68, 71, 75, 78, 82, 84, 85, 89, 91, 100 }; // 12 numbers

        int[] wholeNumbers = new int[24];

        for (int i = 0; i < firstHalf.length; i++) {
            wholeNumbers[i] = firstHalf[i];
        }

        for (int i = 0; i < secondHalf.length; i++) {
            wholeNumbers[i + 12] = secondHalf[i];
        }

        for (int i = 0; i < wholeNumbers.length; i++) {
            System.out.println(wholeNumbers[i]);
        }
    }

    public static void summativeSums(){
        int[] array1 = { 1, 90, -33, -55, 67, -16, 28, -55, 15 };
        int[] array2 = { 999, -60, -77, 14, 160, 301 };
        int[] array3 = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130,  140, 150, 160, 170, 180, 190, 200, -99 };
        int sum1 = 0, sum2=0, sum3=0;
        for (int i = 0; i < array1.length; i++) {
            // add the value directly so negatives decrease the sum
            sum1 += array1[i];
        }

        for (int i = 0; i < array2.length; i++) {
            sum2 += array2[i];
        }

        for (int i = 0; i < array3.length; i++) {
            sum3 += array3[i];
        }

        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println(sum3);
    }

    public static void hiddenNuts() {
        String[] hidingSpots = new String[100];
        Random squirrel = new Random();
        hidingSpots[squirrel.nextInt(hidingSpots.length)] = "Nut";
        System.out.println("The nut has been hidden ...");
        for (int index = 0; index < hidingSpots.length; index++) {
            if ("Nut".equals(hidingSpots[index])) {
                System.out.println("the squirrel hid the nut inspot: " + index);
            }
        }
    }

    public static void main(String[] args) {
        // stilPostive();
        // fruitBasket();
        // simpleCombination();
        // hiddenNuts();

        summativeSums();
    }
}