package pro.sky.lesson3;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Main {

    public static void main(String[] args) {
        System.out.println("Задание 1");

        var box = 16;
        System.out.println(box);

        byte eggs = 126;
        System.out.println(eggs);

        short socks = 32_766;
        System.out.println(socks);

        int noodle = 112_542_4;
        System.out.println(noodle);

        long road = 8_925_423L;
        System.out.println(road);

        float nuts = 5.56f;
        System.out.println(nuts);

        double parts = 5.56674;
        System.out.println(parts);


        System.out.println("Задание 2 ");

        float firstBoxer = 78.2f;

        float secondBoxer = 82.7f;

        float totalBoxersWeight = firstBoxer + secondBoxer;

        System.out.println("Общий вес бокёров " + totalBoxersWeight + "кг ");

        float inequality = secondBoxer - firstBoxer;

        System.out.println("Разница в весе боксёров " + inequality + "кг ");



        System.out.println("Задание 3");

        int bananas = 80 * 5;

        System.out.println("Вес бананов " + bananas + " грамм");


        int milkPortionWeight = 105 * 2;

        System.out.println("Вес молока " + milkPortionWeight + " грамм");


        short iceCream = 2 * 100;

        System.out.println("Вес мороженого " + iceCream + " грамм");


        short uncookedEggs = 4 * 70;

        System.out.println("Вес яиц " + uncookedEggs + " грамм");


        int totalIngridientsWeight = bananas + milkPortionWeight + iceCream + uncookedEggs;


        System.out.println("Общий вес завтрака " + totalIngridientsWeight + " грамм");


        float weightKilo = 1090 * 0.001f;

        System.out.println("Общий вес завтрака в килограммах " + weightKilo + " кг");


        System.out.println("Задание 4");


        int weightRequired = 7 * 1000;

        int ration250 = 250;

        int ration500 = 500;

        int requiredDays250 = weightRequired / ration250;

        int requiredDays500 = weightRequired / ration500;

        int averageDays = (requiredDays250 + requiredDays500) / 2;


        System.out.println("Потребуется дней на похудение при 250гр. - " + requiredDays250);

        System.out.println("Потребуется дней на похудение при 500гр. - " + requiredDays500);

        System.out.println("Среднее количество дней на похудение " + averageDays);

        System.out.println("Задание 5 ");

        int mashaPerMonth = 67_760;
        System.out.println("Старая зарплата Маши " + mashaPerMonth + " рублей");
        float mashaSalaryIncrease = mashaPerMonth + (mashaPerMonth * 0.10f);
        System.out.println("Маша теперь получает " + mashaSalaryIncrease + " рублей");

        int denisPerMonth = 83_690;
        System.out.println("Старая зарплата Дениса " + denisPerMonth + " рублей");
        float denisSalaryIncrease = denisPerMonth + (denisPerMonth * 0.10f);
        System.out.println("Денис теперь получает " + denisSalaryIncrease + " рублей");

        int kristinaPerMonth = 76_230;
        System.out.println("Старая зарплата Кристины " + kristinaPerMonth + " рублей");
        float kristinaSalaryIncrease = kristinaPerMonth + (kristinaPerMonth * 0.10f);
        System.out.println("Кристина теперь полуает " + kristinaSalaryIncrease + " рублей");

        int oldSalaryMashaAmount = (mashaPerMonth * 12);
        float newSalaryMashaAmount = (mashaSalaryIncrease * 12);
        float mashaDifference = newSalaryMashaAmount - oldSalaryMashaAmount;

        System.out.println("Старый годовой доход " + oldSalaryMashaAmount + " рублей");
        System.out.println("Новый годовой доход " + newSalaryMashaAmount + " рублей");
        System.out.println("Разница дохода " + mashaDifference + " рублей");












    }
}
