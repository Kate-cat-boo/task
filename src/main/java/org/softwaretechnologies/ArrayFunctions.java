package org.softwaretechnologies;

public final class ArrayFunctions {

    private ArrayFunctions() {
    }

    /**
     * Функция, меняющая порядок элементов в массиве array на обратный.
     * @param array массив, который будет перевернут.
     */
    public static void reverse(int[] array) {
        // TODO: реализуйте вышеуказанную функцию
        if (array == null) {
            return;
        }

        int left = 0;
        int right = array.length - 1;

        while (left < right) {
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;

            left++;
            right--;
        }
    }

    /**
     * Функция, заменяющая строки матрицы на столбцы матрицы. Пример:
       1  2  3     1  4  7
       4  5  6     2  5  8
       7  8  9     3  6  9
     * Функция работает только с квадратными матрицами.
     * Если матрица не квадратная, то выведете на экран сообщение:
       Матрица не квадратная
     * @param matrix матрица, в которой столбцы будут заменены на строки.
     */
    public static void rotateMatrix(int[][] matrix) {
        // TODO: реализуйте вышеуказанную функцию
        if (matrix == null || matrix.length == 0) {
            System.out.println("Матрица не квадратная.");
            return;
        }

        int n = matrix.length;

        // Проверка на квадратность матрицы
        for (int i = 0; i < n; i++) {
            if (matrix[i].length != n) {
                System.out.println("Матрица не квадратная.");
                return;
            }
        }

        // Транспонирование матрицы
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }
}
