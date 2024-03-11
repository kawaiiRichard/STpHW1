public class Main {
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
}