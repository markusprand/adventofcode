package main;

public class Day1 {
    static private int[] massListDay1 = {68958,82218,54333,59177,51874,100259,95468,124006,75078,113631,90315,147580,68233,81025,133084,90959,81196,92443,124832,65871,57704,140203,113053,76337,72195,115917,87843,131768,105816,131153,59714,94107,50933,139545,94969,149463,60042,66028,111190,63257,50020,88783,81428,73977,149240,137152,74738,55067,128829,56465,81962,67242,94121,92303,68477,88595,64324,82527,134717,140344,132026,137558,95643,79010,146346,86246,52341,147564,89159,66456,83190,128675,130658,122857,134538,122151,133900,117462,117791,139254,86366,66165,92897,121218,135962,143061,129220,114623,98257,76722,121014,77713,137858,133282,103595,118981,149137,101141,70765,141113};
    static private int[] massListDay2 = {68958, 82218, 54333, 59177, 51874, 100259, 95468, 124006, 75078, 113631, 90315, 147580, 68233, 81025, 133084, 90959, 81196, 92443, 124832, 65871, 57704, 140203, 113053, 76337, 72195, 115917, 87843, 131768, 105816, 131153, 59714, 94107, 50933, 139545, 94969, 149463, 60042, 66028, 111190, 63257, 50020, 88783, 81428, 73977, 149240, 137152, 74738, 55067, 128829, 56465, 81962, 67242, 94121, 92303, 68477, 88595, 64324, 82527, 134717, 140344, 132026, 137558, 95643, 79010, 146346, 86246, 52341, 147564, 89159, 66456, 83190, 128675, 130658, 122857, 134538, 122151, 133900, 117462, 117791, 139254, 86366, 66165, 92897, 121218, 135962, 143061, 129220, 114623, 98257, 76722, 121014, 77713, 137858, 133282, 103595, 118981, 149137, 101141, 70765, 141113};

    static int calculateFuel (int mass){
        return mass/3 -2;
    }

    static public int calculateFuelAll (int[] masses){
        int result = 0;
        for(int i=0; i < masses.length; i++){
            result = result + calculateFuel(masses[i]);
        }
        return result;
    }

    static public int calculateFuelRecursive (int[] masses){
        int resultAll = 0;
        for(int i = 0; i<masses.length; i++){
            int mass = masses[i];
            while(mass >= 0) {
                mass = calculateFuel(mass);
                if(mass >0){
                    //System.out.println(mass);
                    resultAll += mass;
                }
            }
        }
        return resultAll;
    }

     public static void main(String args[]){
        //Part1
        System.out.println(calculateFuel(12));
        System.out.println(calculateFuel(14));
        System.out.println(calculateFuel(1969));
        System.out.println(calculateFuel(100756));
        double result = Day1.calculateFuelAll(massListDay1);
        System.out.println(result);

        //Part2
         int[] massTest14 = {14};
         int[] massTest1969 = {1969};
         System.out.println(calculateFuelRecursive(massTest14));
         System.out.println(calculateFuelRecursive(massTest1969));
         System.out.println(calculateFuelRecursive(massListDay2));


    }
}
