public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 1");
        byte cat = 3;
        short dog = 129;
        int tree = 999999;
        long box = 235699999999999L;
        float sugar = 3.5F;
        double water = 3.8976;

        System.out.println("Значение переменной cat с типом byte равно " + cat);
        System.out.println("Значение переменной dog с типом short равно " + dog);
        System.out.println("Значение переменной tree с типом int равно " + tree);
        System.out.println("Значение переменной box с типом long равно " + box);
        System.out.println("Значение переменной sugar с типом float равно " + sugar);
        System.out.println("Значение переменной water с типом double равно " + water);
        System.out.println(" ");


        System.out.println("Задача 2");
        System.out.println("");

        float donkey = 27.12f;
        long bear = 987678965549L;
        float velo = 2.786f;
        short grass = 569;
        short chocolate = -159;
        short milk = 27897;
        byte monkey = 67;

        System.out.println("Задача 3");
        short totalLists = 480;
        byte class1 = 23;
        byte class2 = 27;
        byte class3 = 30;
        byte totalPupils = (byte) (class1 + class2 + class3);
        byte listsPerPupil = (byte) (totalLists / totalPupils);
        System.out.println("На каждого ученика рассчитано " + listsPerPupil + " листов бумаги");
        System.out.println("");

        System.out.println("Задача 4");
        byte capacityPerMinute = 8;

        short minutesInDay = 60 * 24;
        short capacityIn20Min = (short) (capacityPerMinute * 20);
        short capacityInDay = (short) (minutesInDay * capacityPerMinute);
        int capacityIn3Days = (int) capacityInDay * 3;
        int capacityInMonth = (int) capacityInDay * 30;

        System.out.println("За 20 минут машина произвела " + capacityIn20Min + " штук бутылок");
        System.out.println("За сутки машина произвела " + capacityInDay + " штук бутылок");
        System.out.println("За 3 суток машина произвела " + capacityIn3Days + " штук бутылок");
        System.out.println("За месяц машина произвела " + capacityInMonth + " штук бутылок");
        System.out.println("");

        System.out.println("Задача 5");
        byte whiteColourPerClass = 2;
        byte brownColourPerClass = 4;
        byte totalColours = 120;
        byte classes = (byte) (totalColours / (whiteColourPerClass + brownColourPerClass));
        byte totalWhiteColours = (byte) (whiteColourPerClass * classes);
        byte totalBrownColours = (byte) (brownColourPerClass * classes);

        System.out.println("В школе, где " + classes + " классов, нужно " + totalWhiteColours + " банок белой краски и " + totalBrownColours + " банок коричневой краски");
        System.out.println("");

        System.out.println("Задача 6");
        short BananasGramm = 5 * 80;
        short MilkGramm = 105 / 100 * 200;
        short iceCream = 2 * 100;
        short eggs = 4 * 70;

        short weightInGramms = (short) (BananasGramm + MilkGramm + iceCream + eggs);
        float weightInKg = (float) (weightInGramms / 1000);

        System.out.println("Вес в граммах " + weightInGramms);
        System.out.println("Вес в килограммах " + weightInKg);
        System.out.println("");

        System.out.println("Задача 7");
        short totalGrammsDecrease = 7 * 1000;
        short daysIfDecrease250g = (short) (totalGrammsDecrease / 250);
        short daysIfDecrease500g = (short) (totalGrammsDecrease / 500);
        short averageDays = (short) ((daysIfDecrease250g + daysIfDecrease500g)/2);

        System.out.println("Если спортсмен будет терять в день 250 г., ему понадобится " + daysIfDecrease250g + " дней");
        System.out.println("Если спортсмен будет терять в день 500 г., ему понадобится " + daysIfDecrease500g + " дней");
        System.out.println("Если спортсмен будет терять в день 250 г., ему понадобится " + averageDays + " дней");
        System.out.println("");

        System.out.println("Задача 8");
        int MashaSalaryPerMonth = 67760;
        int DenisSalaryPerMonth = 83690;
        int KristinaSalaryPerMonth = 76230;
        int MashaYearSalary = MashaSalaryPerMonth * 12;
        int DenisYearSalary = DenisSalaryPerMonth * 12;
        int KristinaYearSalary = KristinaSalaryPerMonth * 12;

        int MashaNewMonthSalary = (int) (MashaSalaryPerMonth * 1.1);
        int DenisNewMonthSalary = (int) (DenisSalaryPerMonth *1.1);
        int KristinaNewMonthSalary = (int) (KristinaSalaryPerMonth * 1.1);
        int MashaNewYearSalary = MashaNewMonthSalary * 12;
        int DenisNewYearSalary = DenisNewMonthSalary * 12;
        int KristinaNewYearSalary = KristinaNewMonthSalary * 12;

        int diffMashaYearSalary = MashaNewYearSalary - MashaYearSalary;
        int diffDenisYearSalary = DenisNewYearSalary - DenisYearSalary;
        int diffKristinaYearSalary = KristinaNewYearSalary - KristinaYearSalary;

        System.out.println("Маша теперь получает " + MashaNewMonthSalary + " рублей. Годовой доход вырос на " + diffMashaYearSalary + " рублей");
        System.out.println("Денис теперь получает " + DenisNewMonthSalary + " рублей. Годовой доход вырос на " + diffDenisYearSalary + " рублей");
        System.out.println("Кристина теперь получает " + KristinaNewMonthSalary + " рублей. Годовой доход вырос на " + diffKristinaYearSalary + " рублей");

    }
}