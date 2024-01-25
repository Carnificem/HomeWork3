public class Main {
            public static void main(String[] args){
                // Задание 1
                int oneVariable = 2_147_483_647;
                byte twoVarible = 127;
                short threeVariable = 32_767;
                long fourVariable = 9_223_372_036_854_775_807L;
                float fiveVariable = 3.40282344f;
                double sixVariable = 1.7308;
                System.out.println("Значение переменной oneVariable с типом int = " + oneVariable +
                        "\nЗначение переменной twoVariable с типом byte = " + twoVarible +
                        "\nЗначение переменной threeVariable  с типом  short = " + threeVariable +
                        "\nЗначение переменной fourVariable с типом long = " + fourVariable +
                        "\nЗначение переменной fiveVariable с типом float = " + fiveVariable +
                        "\nЗначение переменной sixVariable с типом double =" + sixVariable);
                //Задание 2
                double one = 27.12;
                long two = 987_678_965_549L;
                float three =  2.786f;
                short four = 569;
                short five = -159;
                short six = 27897;
                byte seven = 67;
                // Задание 3
                byte pavlovna = 23;
                byte sergeevna = 27;
                byte andreevna = 30;
                short papper = 480;
                float papperStudent = papper / (pavlovna + sergeevna +andreevna);
                System.out.println("\nНа каждого ученика расчитанно " + papperStudent + " листов бумаги");
                // Задание 4
                byte performance = 16 / 2;
                int producedDay = performance * 1440;
                int producedTwentyMinutes = performance * 20;
                int producedThreeDays = producedDay * 3;
                int producedMonth = producedDay * 30;
                System.out.println( "\nЗа 20 минут машина произвела " + producedTwentyMinutes +
                        "\nЗа сутки машина произвела " + producedDay +
                        "\nЗа три дня машина произвела " + producedThreeDays +
                        "\nза месяц машина произвела " + producedMonth);
                //Задание 5
                int whiteColor = 2;
                byte brownColor = 4;
                int oneClass = whiteColor + brownColor;
                byte allCans = 120;
                int allClass = allCans / oneClass;
                int allWhiteColor = allClass * whiteColor;
                int allBrownColor = allClass * brownColor;
                System.out.println("\nВ школе где " + allClass +
                        " классов,нужно " + allWhiteColor +
                        " белой краски и " + allBrownColor +
                        " банок коричневой краски");
                //Задание 6
                byte banana = 80;
                byte milk = 105;
                byte iceCream = 100;
                byte egg = 70;
                double recipe = (banana * 5) + (milk * 2) + (iceCream * 2) + (egg * 4);
                double resultKilogram = recipe / 1000;
                System.out.println( "Результат в граммах = " + recipe +
                        "\nРезультат в килограммах = " + resultKilogram);
                //Задание 7
                byte allWeight = 7;
                double diet = 0.25;
                double dietTwo = 0.5;
                double weightLossOne = allWeight / diet;
                double weightLossTwo = allWeight / dietTwo;
                double [] nums ={weightLossOne,weightLossTwo};
                int result = 0;
                for (double m : nums){
                    result +=m;
                }
                System.out.println("\nЕсли каждый день спортсмен будет терять " + diet +
                        " килограмм,то потребуется " + weightLossOne +
                        " дней,\nа если " + dietTwo + " килограмма то " + weightLossTwo +
                        ". \nв среднем потребуется " + result/ nums.length + " дней на сброс веса");
                //Задание 8
                int mariya = 67760;
                int denis = 83690;
                int kristina = 76230;
                float differenceSalaryMariya = mariya * 0.1f;
                float differenceSalaryDenis = denis * 0.1f;
                float differenceSalaryKristina = kristina * 0.1f;
                float newMariyaSalary = mariya + differenceSalaryMariya;
                float newDenisSalary = denis + differenceSalaryDenis;
                float newKristinaSalary = kristina + differenceSalaryKristina;
                float differenceYearMariya = (newMariyaSalary * 12) - (mariya * 12);
                float differenceYearDenis = (newDenisSalary * 12) - (denis * 12);
                float differenceYearKristina = (newKristinaSalary * 12) - (kristina * 12 );
                System.out.println("\nМария теперь получает " + newMariyaSalary + " рублей.Годовой доход вырос на " + differenceYearMariya +
                        "\nДенис теперь получает " + newDenisSalary + " рублей.Годовой доход вырос на " + differenceYearDenis +
                        "\nКристина теперь получает " + newKristinaSalary + "рублей.Годовой доход вырос на " + differenceYearKristina);
    }
}