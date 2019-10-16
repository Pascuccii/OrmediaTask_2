public class Lesson2Task1_2 {
    public static void main(String[] args) {
        //correct
        String[] correctBelNumbers = {"+375 (44) 543-53-90", "+375-44-543-53-90", "375445435390", "+375-(44)-543-53-90"};
        String[] correctRusNumbers = {"+8 (800) 555-35-35", "+8-(800) 555 35-35", "+8-(800 555-35-35", "7(444)555-35-35"};
        String[] correctEmails = {"skachko42@gmail.com", "exapmle@gmail.com", "example.e@gmail.com", "example@tut.by"};
        //incorrect
        String[] incorrectBelNumbers = {"+375 (44) 43-53-90", "+375--44-543-53-90", "+375o445435390", "+375-((44)-543-53-90"};
        String[] incorrectRusNumbers = {"+8 (8000) 555-35-35", "+8-(100) 555 35-35", "+8-(800 555-35", "7(444)j555-35-35"};
        String[] incorrectEmails = {"skachko42.@gmail.com", "exapmle..e@gmail.com", "example.e*@gmail.com", "example@@tut.by"};

        System.out.println("correct:");
        for(String num : correctBelNumbers) System.out.println(isBelorussianPhoneNumber(num) + " " + num);
        for(String num : correctRusNumbers) System.out.println(isRussianPhoneNumber(num) + " " + num);
        for(String email : correctEmails) System.out.println(isEmail(email) + " " + email);
        System.out.println("incorrect:");
        for(String num : incorrectBelNumbers) System.out.println(isBelorussianPhoneNumber(num) + " " + num);
        for(String num : incorrectRusNumbers) System.out.println(isRussianPhoneNumber(num) + " " + num);
        for(String email : incorrectEmails) System.out.println(isEmail(email) + " " + email);
    }
    public static boolean isBelorussianPhoneNumber(String number) {
        number = number.trim();
        return number.matches("^(\\+375|375)?[\\s\\-]?\\(?(17|29|33|44)\\)?[\\s\\-]?[0-9]{3}[\\s\\-]?[0-9]{2}[\\s\\-]?[0-9]{2}$");
    }
    public static boolean isRussianPhoneNumber(String number) {
        number = number.trim();
        return number.matches("^(\\+7|7|\\+8|8)?[\\s\\-]?\\(?[489][0-9]{2}\\)?[\\s\\-]?[0-9]{3}[\\s\\-]?[0-9]{2}[\\s\\-]?[0-9]{2}$");
    }
    public static boolean isEmail(String number) {
        number = number.trim();
        return number.matches("(?:[a-z0-9!_-]+(?:\\.[a-z0-9!_-]+)*|\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?|[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+))");
    }
}
