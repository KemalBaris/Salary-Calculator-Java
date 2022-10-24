public class Main {
    public static void employee1() {

        String name1 = "Yusuf Yılmaz";
        double salary1 = 8000;
        double workHours1 = 50;
        int hireYears1 = 2019;
        double taxSalary1 = 0;
        double mesaiUcreti1 = (workHours1 - 40) * 30;
        double mesaiSaati1 = (workHours1 - 40);
        double raiseSalary1 = 0;
        double totalSalary1 = 0;
        double bonusSalary1 = 0;
        double taxandbonusSalary = 0;

        if (salary1 > 1000) {
            taxSalary1 = (salary1 * 3 / 100);
        }
        if (hireYears1 > 2011 && hireYears1 <= 2021) {
            raiseSalary1 = (salary1 + (salary1 / 100 * 5));
        }
        if (hireYears1 > 2002 && hireYears1 < 2011 && hireYears1 >= 2021) {
            raiseSalary1 = (salary1 + (salary1 / 100 * 10));
        }
        if (hireYears1 < 2002 && hireYears1 >= 2021) {
            raiseSalary1 = (salary1 + (salary1 / 100 * 15));
        }
        if (workHours1 > 40) {
            bonusSalary1 = (((workHours1 - 40) * 30) + salary1);
        }
        raiseSalary1 = raiseSalary1 - salary1;
        bonusSalary1 = bonusSalary1 - salary1;
        taxandbonusSalary = (salary1 - taxSalary1) + bonusSalary1;

        totalSalary1 = (salary1 - taxSalary1) + raiseSalary1 + bonusSalary1;

        System.out.println("Employee 2");
        System.out.println("İsim Soyisim : " + name1);
        System.out.println("Maaş :" + salary1);
        System.out.println("Haftalık Çalışma Saati : " + workHours1);
        System.out.println("Başlangıç Yılı : " + hireYears1);
        System.out.println("Vergi : " + taxSalary1);
        System.out.println("Mesai Yaptığınız Saat : " + mesaiSaati1);
        System.out.println("Bonus : " + mesaiUcreti1);
        System.out.println("Maaş Artışı :" + raiseSalary1);
        System.out.println("Vergi ve Bonuslar ile birlikte maaş : " + taxandbonusSalary);
        System.out.println("Toplam Maaş : " + totalSalary1);
        System.out.println("---------------------------");
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
        employee1();
    }
}