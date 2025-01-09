public class MyDate {
    int day;
    int month;
    int year;

    boolean yearOk = false;
    boolean dayOk = false;
    boolean monthOk = false;


    public MyDate(int day, int month, int year){
        System.out.println(day+"/"+month+"/"+year);
        if (isDateCorrect(day, month, year)) {
            System.out.println("Данные корректны");
            this.day = day;
            this.month = month;
            this.year = year;
        } else {
            if (!dayOk){
                System.out.println("день не корректный");
            }
            if (!monthOk){
                System.out.println("месяц не корректный");
            }
            if (!yearOk){
                System.out.println("год не корректный");
            }
            // действия если ошибка Exception
            System.out.println("Данные не корректны");
        }
    }

    public boolean isDateCorrect(int day, int month, int year){
        yearOk = isYearCorrect(year);
        monthOk = isMonthCorrect(month);
        dayOk = monthOk && isDayCorrect(day,month,year);
        return yearOk && monthOk && dayOk;
    }

    public boolean isYearCorrect(int year){
        return year>0;

    }

    public  boolean isMonthCorrect(int month){
        return month>=1 && month<=12;
    }

    public boolean isDayCorrect(int day, int month, int year){
        return   day>=1 && day <= daysInMonth(month,year);

    }

    public int daysInMonth(int month, int year){

        if(monthOk) {
            int[] daysPerMonth = new int[]{0, 31, isYearLeap(year) ? 29 : 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
            return daysPerMonth[month];
        } else {
            return -1;
        }
    }

    public boolean isYearLeap(int year){
        return (year%4==0 && year%100!=0) || (year%400==0) ;
    }

}

