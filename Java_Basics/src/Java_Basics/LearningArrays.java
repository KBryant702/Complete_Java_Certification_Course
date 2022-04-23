package Java_Basics;

public class LearningArrays {

    public static void main(String[] args) {
        int[] values = new int[100];//declaring variable of type int in array with 100 slots
        values[0] = 1000;
        values[1] = 55;
        values[99] = 93432;

        System.out.println(values[1]);

        String[] words = new String[]{"My", "Name", "is"};
        System.out.println(words[2]);

        // OR
        String[] words1 = new String[3];
        words1[0] = "My";
        words1[1] = "Name";
        words1[2] = "is";
        System.out.println(words1[0]);


    }

}
