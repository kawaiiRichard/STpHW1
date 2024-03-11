public class Main {
    public static void firstTask()
    {
        System.out.println("7 14 21 28 35 42 49 56 63 70 77 84 91 98");
    }
    public static void secondTask()
    {
        int n = 100;
        double[] array = new double[n];
        for (int count = 0; count < array.length; count++)
        {
            array[count] = Math.random();
        }
        double max = array[0];
        double min = array[0];
        double avg = 0;
        for (int count = 0; count < array.length; count++)
        {
            if (max < array[count])
            {
                max = array[count];
            }
            if (min > array[count])
            {
                min = array[count];
            }
            avg += array[count] / array.length;
        }

        System.out.println("max = " + max);
        System.out.println("min = " + min);
        System.out.println("avg = " + avg);
    }

    public static void thridTask() {
        for (int number = 2; number <= 100; number++)
        {
            boolean primeCheck = true;
            for (int divider = 2; divider < Math.sqrt(number); divider++)
            {
                if ((number % divider) == 0)
                {
                    primeCheck = false;
                }
            }
            if (primeCheck)
            {
                System.out.println(number + " - простое число");
            }
        }
    }
    public static void fourthTask()
    {
        for (int string = 0; string < 3; string++)
        {
            for (int column = 0; column < 5; column++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        System.out.println("Первое задание: ");
        firstTask();
        System.out.println();

        System.out.println("Второе задание: ");
        secondTask();
        System.out.println();

        System.out.println("Третье задание: ");
        thridTask();
        System.out.println();

        System.out.println("Четвёртое задание: ");
        fourthTask();
        System.out.println();
    }
}