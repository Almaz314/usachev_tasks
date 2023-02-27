package task_1;

public class MinMaxAvgValueOfArray {
        public static void main(String[] args){

            int[] myArr = {-1, 0, 2, 3, 4, 5};

            int maxNum = myArr[0];
            for (int j : myArr) {
                if (j > maxNum)
                    maxNum = j;
            }
            System.out.println("Максимальное значение "+maxNum);


            int minNum = myArr[0];
            for (int j : myArr) {
                if (j < minNum)
                    minNum = j;
            }
            System.out.println("Мнимальное значение "+minNum);

            double average = 0;
            if (myArr.length > 0)
            {
                double sum = 0;
                for (int i = 0; i < myArr.length; i++) {
                    sum += myArr[i];
                }
                average = sum / myArr.length;
            }
            System.out.println("Среднее значение "+average);
        }
    }

