public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int first, int second) {
        if(first < 10 || second < 10) {
            return -1;
        }

        if(first == second) {
            return first;
        }

        int lowerNumber, greaterNumber, greatestDivisor = 1;

        if(first < second) {
            lowerNumber = first;
            greaterNumber = second;
        } else {
            lowerNumber = second;
            greaterNumber = first;
        }

        if(greaterNumber % lowerNumber == 0) {
            return lowerNumber;
        }

        for(int i = 2; i <= lowerNumber/2; i++) {
            if(lowerNumber % i == 0 && greaterNumber % i == 0) {
                greatestDivisor = i;
            }
        }

        return  greatestDivisor;
    }

    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(25, 15));
        System.out.println(getGreatestCommonDivisor(12, 30));
        System.out.println(getGreatestCommonDivisor(9, 18));
        System.out.println(getGreatestCommonDivisor(81, 153));
        System.out.println(getGreatestCommonDivisor(30, 60));

    }
}
