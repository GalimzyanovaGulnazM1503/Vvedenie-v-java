public class Main {
    public static void main(String[] args) {

        int eaters = 5; // сколько людей будут есть

        int water = 3000; // миллилитров воды
        int potatoes = 5; // картофелин
        int chicken = 6; // куриных бёдер
        int spices = 10; // ложек специй

        System.out.println("Сварили суп. На одного человека вышло:");
        System.out.println("Неправильные результаты:");
        System.out.println((water / eaters) + " миллилитров(а) воды");
        System.out.println((potatoes / eaters) + " картофелин(а/ы)");
        System.out.println((chicken / eaters) + " куриных(ое) бёдер(ро)");
        System.out.println((spices / eaters) + " ложек(ки/ка) специй");


        System.out.println("Если сложить все порции обратно, получим:");
        System.out.println((double)water / eaters + " миллилитров(а) воды");
        System.out.println((double)potatoes / eaters + " картофелин(а/ы)");
        System.out.println((double)chicken / eaters + " куриных(ое) бёдер(ро)");
        System.out.println((double)spices / eaters + " ложек(ки/ка) специй");


        System.out.println("1 куриное бедро потеряно");
    }
}
