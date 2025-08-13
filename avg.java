public class avg {
    public static void main(String[] args) {
        int mark1 = 40;
        int mark2 = 55;
        int mark3 = 74;
        int mark4 = 90;
        int mark5 = 86;
        double total = (mark1+mark2+mark3+mark4+mark5);
        double avg = (total/5);
        double per = (total/500) * 100;
        System.out.println("TOTAL : " + total);
        System.out.println("AVERAGE : " + avg);
        System.out.println("PERCENTAGE : " + per +"%");
    }
}
