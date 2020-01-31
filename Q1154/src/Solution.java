class Solution {
    public int dayOfYear(String date) {

        String[] d = date.split("-");
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int[] dateFormat = new int[3];
        int days = 0;
        for (int i = 0; i < 3; i++) {
            dateFormat[i] = Integer.parseInt(d[i]);
        }
//        System.out.println(dateFormat[0] + "\t" + dateFormat[1] + "\t" + dateFormat[2]);
        int year = dateFormat[0];
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    daysInMonth[1] = 29;
                }
            } else {
                daysInMonth[1] = 29;
            }
        }

        for (int i = 0; i < dateFormat[1] - 1; i++) {
            days += daysInMonth[i];
//            System.out.println("DD" + days);
        }
        days += dateFormat[2];

        return days;
    }
}