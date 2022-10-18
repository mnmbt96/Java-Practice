public class Switch {
    public static void main(String[] args) throws Exception {
        //enumを使わないとたくさん宣言する必要がある
        // String day1 = "MONDAY";
        // String day2 = "TUESDAY";
        // String day3 = "WEDNESDAY";
        // String day4 = "THURSDAY";
        // String day5 = "FRIDAY";
        
        Day day = Switch.Day.MONDAY;
        // String day = "MONDAY";
        switch(day){
            case MONDAY:
                System.out.println("Boring Monday");
                break;
            case TUESDAY:
                System.out.println("It's OK Tuesday");
                break;
            case WEDNESDAY:
                System.out.println("Middle of the week");
                break;
            case THURSDAY:
                System.out.println("Almost there");
                break;
            case FRIDAY:
                System.out.println("YEAH it's Friday");
                break;
            default:
                System.out.println("Default");
        }
    }

    public enum Day{
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY, 
    };
}

