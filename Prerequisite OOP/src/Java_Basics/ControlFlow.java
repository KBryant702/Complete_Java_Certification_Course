package Java_Basics;

public class ControlFlow {

    public static void main(String[] args) {

        boolean hungry = true;

        if (hungry) {
            System.out.println("I'm starving...");
        } else {
            System.out.println("I'm not hungry");
        }

        int hungerRating = 5;
        if (hungerRating < 6) {
            System.out.println("Not hungry");
        } else {
            System.out.println("I'm VERY hungry...");
        }
        int favoriteTemp = 75;
        int currentTemp = 60;
        String opinion;

        if (currentTemp < favoriteTemp - 30) {
            opinion = "It's pretty darn cold";
        } else if (currentTemp < favoriteTemp - 20) {
            opinion = "It's kinda cold out";
        } else if (currentTemp > favoriteTemp + 10) {
            opinion = "It's a little hot out";
        } else {
            opinion = "It's a beautiful day...";
        }

        System.out.println(opinion);

        //Switch statement
        //use switch when there are many decisions
        int month = 4;
        String monthString;

        switch (month) {
            case 1:
                monthString = "January";
                break;
            case 2:
                monthString = "February";
                break;
            case 3:
                monthString = "March";
                break;
            case 4:
                monthString = "April";
                break;
            default:
                monthString = "Uknown month";
                break;
        }
        System.out.println(monthString);
    }
}