public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }
    public static void task1 () {
        System.out.println("Задача 1");
        byte varByte = 1;
        short varShort = 11;
        int varInt = -111;
        long varLong = 1111L;
        float varFloat = 111.111f;
        double varDouble = -1111.1111;
        System.out.println("Значение переменной varByte с типом byte равно " + varByte);
        System.out.println("Значение переменной varShort с типом short равно " + varShort);
        System.out.println("Значение переменной varInt с типом int равно " + varInt);
        System.out.println("Значение переменной varLong с типом long равно " + varLong);
        System.out.println("Значение переменной varFloat с типом float равно " + varFloat);
        System.out.println("Значение переменной varDouble с типом double равно " + varDouble);
    }
    public static void task2 () {
        System.out.println("Задача 2");
        float f = 27.12f;
        long l = 987678965549L;
        double d = 2.786;
        short s = 569;
        int i1 = -159;
        int i2 = 27897;
        byte b = 67;
    }
    public static void task3() {
        System.out.println("Задача 3");
        byte pupilCountLudmila = 23;
        short pupilCountAnna = 27;
        int pupilCountEkaterina = 30;
        int pupilCountTotal = pupilCountLudmila + pupilCountAnna + pupilCountEkaterina;
        int paperCount = 480;
        int paperPerPupil = paperCount / pupilCountTotal;
        System.out.println("На каждого ученика рассчитано " + paperPerPupil + " листов бумаги");
    }
    public static void task4() {
        System.out.println("Задача 4");
        short bottles = 16;
        short timeOriginal = 2;
        int bottlesPerMin = bottles / timeOriginal; // кол-во бутылок в минуту
        short time20Min = 20;
        int bottles20Min = bottlesPerMin * time20Min; // кол-во бутылок за 20 мин
        short timeHour = 60;
        int timeDay = 24 * timeHour; // кол-во минут в сутках
        int bottlesDay = bottlesPerMin * timeDay; // кол-во бутылок за сутки
        int time3Days = timeDay * 3;
        int bottles3Days = bottlesPerMin * time3Days; // кол-во бутылок за 3 дня
        int timeMonth = 30 * timeDay;
        int bottlesMonth = bottlesPerMin * timeMonth; // кол-во бутылок за 1 месяц
        System.out.println("За 20 минут машина произвела " + bottles20Min + " штук бутылок");
        System.out.println("За сутки машина произвела " + bottlesDay + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + bottles3Days + " штук бутылок");
        System.out.println("За месяц машина произвела " + bottlesMonth + " штук бутылок");
    }
    public static void task5 () {
        System.out.println("Задача 5");
        short canWhite = 2;
        short canBrown = 4;
        short allCans = 120;
        int canPerClass = canWhite + canBrown; // количество банок на 1 класс
        int classCount = allCans / canPerClass; // количество классов
        int totalWhite = canWhite * classCount; // общее кол-во белой краски
        int totalBrown = canBrown * classCount; // общее кол-во коричневой краски
        System.out.println("В школе, где " + classCount + " классов, нужно " + totalWhite + " банок белой краски и " + totalBrown + " банок коричневой краски");
    }
    public static void task6 () {
        System.out.println("Задача 6");
        short countBanana = 5; // кол-во бананов
        short weightBanana = 80; // вес 1 банана
        int totalWeightBanana = countBanana * weightBanana; // обший вес бананов
        short countMilkMl = 200; // кол-во молока в мл
        int countMilk = countMilkMl / 100; // кол-во молока в штуках
        short weightMilk = 105; // вес 100 мл молока
        int totalWeightMilk = countMilk * weightMilk; // общий вес молока
        short countIceCream = 2; // кол-во мороженого
        short weightIceCream = 100; // вес 1 мороженого
        int totalWeightIceCream = countIceCream * weightIceCream; // общий вес мороженого
        short countEgg = 4; // кол-во яиц
        short weightEgg = 70; // вес 1 яйца
        int totalWeightEgg = countEgg * weightEgg; // общий вес яиц
        int breakfastGr = totalWeightBanana + totalWeightMilk + totalWeightIceCream + totalWeightEgg; // вес завтрака в граммах
        int grPerKg = 1000; // кол-во гр в кг
        float breakfastKl = breakfastGr / (float)grPerKg; // вес завтрака в килограммах
        System.out.println("Вес завтрака в граммах - "+ breakfastGr + " ,а в килограммах - " + breakfastKl);
    }
    public static void task7 () {
        System.out.println("Задача 7");
        short deltaWeight = 7000; // вес, который нужно сбросить
        short weightGrPerDayVar1 = 250; // вес за 1 день в гр (вар 1)
        //int grPerKg = 1000; // кол-во гр в кг
        //float weightKgPerDayVar1 = weightGrPerDayVar1 / (float)grPerKg; // вес за 1 день в кг (вар 1)
        float daysLostWeightVar1 = deltaWeight / weightGrPerDayVar1;
        System.out.println("За " + daysLostWeightVar1 + " дней спортсмен потеряет 7 кг, если за 1 день будет сбрасывать " + weightGrPerDayVar1 + " грамм");
        short weightGrPerDayVar2 = 500; // вес за 1 день в гр (вар 2)
        //float weightKgPerDayVar2 = weightGrPerDayVar2 / (float)grPerKg; // вес за 1 день в кг (вар 2)
        float daysLostWeightVar2 = deltaWeight / weightGrPerDayVar2;
        System.out.println("За " + daysLostWeightVar2 + " дней спортсмен потеряет 7 кг, если за 1 день будет сбрасывать " + weightGrPerDayVar2 + " грамм");
        double lostWeightPerDayAverage = (weightGrPerDayVar1 + weightGrPerDayVar2) / 2D;
        double averageDaysLostWeight = deltaWeight / lostWeightPerDayAverage;
        System.out.println("Среднее количество дней похудения составит " + averageDaysLostWeight + " дней");
    }
    public static void task8 () {
        System.out.println("Задача 8");
        int salaryMasha = 67760;
        int salaryDenis = 83690;
        int salaryCristina = 76230;
        System.out.println("Зарплата Маши до повышения составляла " + salaryMasha + " рублей в месяц");
        System.out.println("Зарплата Дениса до повышения составляла " + salaryDenis + " рублей в месяц");
        System.out.println("Зарплата Кристины до повышения составляла " + salaryCristina + " рублей в месяц");
        int salaryMashaPerYear = salaryMasha * 12; // зарплата Маши за 1 год
        int salaryDenisPerYear = salaryDenis * 12; // зарплата Дениса за 1 год
        int salaryCristinaPerYear = salaryCristina * 12; // зарплата Кристины за 1 год
        double deltaSalaryMasha = salaryMasha + (salaryMasha * 0.1); // увеличенная зарплата Маши
        double deltaSalaryMashaPerYear = deltaSalaryMasha * 12; // увеличенная зарплата Маши за 1 год
        double deltaSalaryDenis = salaryDenis + (salaryDenis * 0.1); // увеличенная зарплата Дениса
        double deltaSalaryDenisPerYear = deltaSalaryDenis * 12; // увеличенная зарплата Дениса за 1 год
        double deltaSalaryCristina = salaryCristina + (salaryCristina * 0.1); // увеличенная зарплата Кристины
        double deltaSalaryCristinaPerYear = deltaSalaryCristina * 12; // увеличенная зарплата Кристины за 1 год
        double diffSalaryMashaPerYear = deltaSalaryMashaPerYear - salaryMashaPerYear; // разница зарплаты Маши за год
        double diffSalaryDenisPerYear = deltaSalaryDenisPerYear - salaryDenisPerYear; // разница зарплаты Дениса за год
        double diffSalaryCristinaPerYear = deltaSalaryCristinaPerYear - salaryCristinaPerYear; // разница зарплаты Кристины за год
        System.out.println("Маша теперь получает " + deltaSalaryMasha + " рублей в месяц. Годовой доход вырос на " + diffSalaryMashaPerYear + " рублей");
        System.out.println("Денис теперь получает " + deltaSalaryDenis + " рублей в месяц. Годовой доход вырос на " + diffSalaryDenisPerYear + " рублей");
        System.out.println("Кристина теперь получает " + deltaSalaryCristina + " рублей в месяц. Годовой доход вырос на " + diffSalaryCristinaPerYear + " рублей");
    }
}