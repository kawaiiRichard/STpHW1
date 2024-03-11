public class Main {
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
}