

class DaysConverter {
    public static void main(String[] args) {

        int totalDays = 183;

        int years = totalDays / 365; 
        int remainingDaysAfterYears = totalDays % 365;
        int weeks = remainingDaysAfterYears / 7; 
        int days = remainingDaysAfterYears % 7;

        System.out.println("Years: " + years);
        System.out.println("Weeks: " + weeks);
        System.out.println("Days: " + days);

        
    }
}

