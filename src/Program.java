import java.util.Scanner;
import java.util.Stack;

public class Program {
//    public static void main(String[] args) {
//        System.out.println("Зайцев Виктор 4исип221");
//    }
//    Задача№1
//public static void main(String[] args) {
//
//    Scanner scanner = new Scanner(System.in);
//
//
//    System.out.print("Введите целое число: ");
//    int number = scanner.nextInt();
//
//
//    if (number % 2 == 0) {
//        System.out.println("Число " + number + " является четным");
//    } else {
//        System.out.println("Число " + number + " является нечетным");
//    }
//
//
//    scanner.close();
//}
//    Задача№2
//public static void main(String[] args) {
//
//    Scanner scanner = new Scanner(System.in);
//
//    System.out.print("Введите первое число: ");
//    int num1 = scanner.nextInt();
//    System.out.print("Введите второе число: ");
//    int num2 = scanner.nextInt();
//    System.out.print("Введите третье число: ");
//    int num3 = scanner.nextInt();
//
//    int min = num1;
//    if (num2 < min) {
//        min = num2;
//    }
//
//    if (num3 < min) {
//        min = num3;
//    }
//
//    System.out.println("Минимальное число: " + min);
//
//    scanner.close();
//}
//    Задача№3
//public static void main(String[] args) {
//
//    int multiplier = 5;
//
//
//    System.out.println("Таблица умножения на " + multiplier + ":");
//
//
//    for (int i = 1; i <= 10; i++) {
//
//        System.out.println(multiplier + " x " + i + " = " + (multiplier * i));
//    }
//}
//    Задача№4
//public static void main(String[] args) {
//
//    Scanner scanner = new Scanner(System.in);
//
//
//    System.out.print("Введите целое число N: ");
//    int N = scanner.nextInt();
//
//
//    int sum = 0;
//
//
//    for (int i = 1; i <= N; i++) {
//        sum += i;
//    }
//
//
//    System.out.println("Сумма всех чисел от 1 до " + N + " равна: " + sum);
//
//
//    scanner.close();
//}
//    Задача№5
//public static void main(String[] args) {
//    Scanner scanner = new Scanner(System.in);
//
//    System.out.print("Введите количество чисел Фибоначчи, которые вы хотите вывести: ");
//    int N = scanner.nextInt();
//
//    if (N <= 0) {
//        System.out.println("Количество чисел должно быть положительным числом.");
//    } else {
//        System.out.println("Первые " + N + " чисел Фибоначчи:");
//
//        int first = 0;
//        int second = 1;
//
//        for (int i = 1; i <= N; i++) {
//            System.out.print(first + " ");
//
//            int next = first + second;
//            first = second;
//            second = next;
//        }
//
//        System.out.println();
//    }
//
//    scanner.close();
//}
//    Задача№6
//public static void main(String[] args) {
//    Scanner scanner = new Scanner(System.in);
//
//    System.out.print("Введите целое число: ");
//    int number = scanner.nextInt();
//
//    if (number <= 1) {
//        System.out.println(number + " не является простым числом.");
//    } else {
//        boolean isPrime = true;
//
//        for (int i = 2; i <= Math.sqrt(number); i++) {
//            if (number % i == 0) {
//                isPrime = false;
//                break;
//            }
//        }
//
//        if (isPrime) {
//            System.out.println(number + " является простым числом.");
//        } else {
//            System.out.println(number + " не является простым числом.");
//        }
//    }
//
//    scanner.close();
//}
//    Задача№7
//public static void main(String[] args) {
//    Scanner scanner = new Scanner(System.in);
//
//    System.out.print("Введите целое число N: ");
//    int N = scanner.nextInt();
//
//    if (N <= 0) {
//        System.out.println("Введите положительное число.");
//    } else {
//        System.out.println("Числа от " + N + " до 1 в обратном порядке:");
//
//        for (int i = N; i >= 1; i--) {
//            System.out.print(i + " ");
//        }
//
//        System.out.println();
//    }
//
//    scanner.close();
//}
//    Задача№8
//public static void main(String[] args) {
//
//    Scanner scanner = new Scanner(System.in);
//
//    System.out.print("Введите целое число A: ");
//    int A = scanner.nextInt();
//    System.out.print("Введите целое число B: ");
//    int B = scanner.nextInt();
//
//    int sum = 0;
//
//    if (A > B) {
//        System.out.println("A должно быть меньше или равно B.");
//    } else {
//
//        if (A % 2 != 0) {
//            A++;
//        }
//
//        for (int i = A; i <= B; i += 2) {
//            sum += i;
//        }
//
//
//        System.out.println("Сумма четных чисел от A до B: " + sum);
//    }
//
//
//    scanner.close();
//}
//    Задача№9
//public static void main(String[] args) {
//    Scanner scanner = new Scanner(System.in);
//
//    System.out.print("Введите строку: ");
//    String input = scanner.nextLine();
//
//    String reversed = "";
//
//    for (int i = input.length() - 1; i >= 0; i--) {
//        reversed += input.charAt(i);
//    }
//
//    System.out.println("Обратный порядок строки: " + reversed);
//
//    scanner.close();
//}
//    Задача№10
//public static void main(String[] args) {
//    Scanner scanner = new Scanner(System.in);
//
//    System.out.print("Введите целое число: ");
//    int number = scanner.nextInt();
//
//    String numberStr = Integer.toString(number);
//    int numberOfDigits = numberStr.length();
//
//    if (number < 0) {
//        numberOfDigits--;
//    }
//
//    System.out.println("Количество цифр в числе: " + numberOfDigits);
//
//    scanner.close();
//}
//    Задача№11
//public static void main(String[] args) {
//    Scanner scanner = new Scanner(System.in);
//
//    System.out.print("Введите целое число N: ");
//    int N = scanner.nextInt();
//
//    if (N < 0) {
//        System.out.println("Факториал не определён для отрицательных чисел.");
//    } else {
//        long factorial = 1;
//        for (int i = 1; i <= N; i++) {
//            factorial *= i;
//        }
//
//        System.out.println("Факториал числа " + N + " равен: " + factorial);
//    }
//
//    scanner.close();
//}
//    Задача№12
//public static void main(String[] args) {
//    Scanner scanner = new Scanner(System.in);
//
//    System.out.print("Введите целое число: ");
//    int number = scanner.nextInt();
//
//    int absNumber = Math.abs(number);
//
//
//    int sum = 0;
//
//
//    while (absNumber > 0) {
//        sum += absNumber % 10;
//        absNumber /= 10;
//    }
//
//    System.out.println("Сумма всех цифр числа: " + sum);
//
//    scanner.close();
//}
//    Задача№13
//public static void main(String[] args) {
//    Scanner scanner = new Scanner(System.in);
//
//    System.out.print("Введите строку: ");
//    String input = scanner.nextLine();
//
//    String cleanedInput = input.replaceAll("\\W", "").toLowerCase();
//    String reversedInput = new StringBuilder(cleanedInput).reverse().toString();
//
//    if (cleanedInput.equals(reversedInput)) {
//        System.out.println("Строка является палиндромом");
//    } else {
//        System.out.println("Строка не является палиндромом.");
//    }
//
//    scanner.close();
//}
//    Задача№14
//public static void main(String[] args) {
//    Scanner scanner = new Scanner(System.in);
//
//    System.out.print("Введите размер массива: ");
//    int size = scanner.nextInt();
//
//    int[] array = new int[size];
//
//    System.out.println("Введите элементы массива:");
//    for (int i = 0; i < size; i++) {
//        array[i] = scanner.nextInt();
//    }
//
//    int max = array[0];
//    for (int i = 1; i < size; i++) {
//        if (array[i] > max) {
//            max = array[i];
//        }
//    }
//
//    System.out.println("Максимальное число в массиве: " + max);
//
//    scanner.close();
//}
//    Задача№15
//public static void main(String[] args) {
//    Scanner scanner = new Scanner(System.in);
//
//    System.out.print("Введите размер массива: ");
//    int size = scanner.nextInt();
//
//    int[] array = new int[size];
//
//    System.out.println("Введите элементы массива:");
//    int sum = 0;
//    for (int i = 0; i < size; i++) {
//        array[i] = scanner.nextInt();
//        sum += array[i];
//    }
//
//    System.out.println("Сумма всех элементов массива: " + sum);
//
//    scanner.close();
//}
//    Задача№16
//public static void main(String[] args) {
//    Scanner scanner = new Scanner(System.in);
//
//    System.out.print("Введите размер массива: ");
//    int size = scanner.nextInt();
//
//    int[] array = new int[size];
//
//    System.out.println("Введите элементы массива:");
//    int positiveCount = 0;
//    int negativeCount = 0;
//
//    for (int i = 0; i < size; i++) {
//        int number = scanner.nextInt();
//        array[i] = number;
//        if (number > 0) {
//            positiveCount++;
//        } else if (number < 0) {
//            negativeCount++;
//        }
//    }
//
//    System.out.println("Количество положительных чисел: " + positiveCount);
//    System.out.println("Количество отрицательных чисел: " + negativeCount);
//
//    scanner.close();
//}
//    Задача№17
//public static void main(String[] args) {
//    Scanner scanner = new Scanner(System.in);
//
//    System.out.print("Введите число A: ");
//    int A = scanner.nextInt();
//
//    System.out.print("Введите число B: ");
//    int B = scanner.nextInt();
//
//    if (A > B) {
//        System.out.println("Неверный диапазон. A должно быть меньше или равно B.");
//    } else {
//        System.out.println("Простые числа в диапазоне от " + A + " до " + B + ":");
//        for (int i = A; i <= B; i++) {
//            if (isPrime(i)) {
//                System.out.print(i + " ");
//            }
//        }
//        System.out.println();
//    }
//
//    scanner.close();
//}
//
//    private static boolean isPrime(int number) {
//        if (number <= 1) {
//            return false;
//        }
//        if (number == 2) {
//            return true; // 2 - единственное четное простое число
//        }
//        if (number % 2 == 0) {
//            return false; // Четные числа больше 2 не простые
//        }
//        for (int i = 3; i * i <= number; i += 2) {
//            if (number % i == 0) {
//                return false;
//            }
//        }
//        return true;
//    }
//    Задача№18
//public static void main(String[] args) {
//    Scanner scanner = new Scanner(System.in);
//
//    System.out.print("Введите строку: ");
//    String input = scanner.nextLine();
//
//    int vowelsCount = 0;
//    int consonantsCount = 0;
//
//    for (char ch : input.toLowerCase().toCharArray()) {
//        if (Character.isLetter(ch)) {
//            if (isVowel(ch)) {
//                vowelsCount++;
//            } else {
//                consonantsCount++;
//            }
//        }
//    }
//
//    System.out.println("Количество гласных: " + vowelsCount);
//    System.out.println("Количество согласных: " + consonantsCount);
//
//    scanner.close();
//}
//
//    private static boolean isVowel(char ch) {
//        return "aeiouаеёиоуыэюя".indexOf(ch) != -1;
//    }
//    Задача№19
//public static void main(String[] args) {
//    Scanner scanner = new Scanner(System.in);
//
//    System.out.print("Введите строку: ");
//    String input = scanner.nextLine();
//
//    // Разбиваем строку на слова по пробелам
//    String[] words = input.split("\\s+");
//
//    // Используем стек для хранения слов в обратном порядке
//    Stack<String> stack = new Stack<>();
//    for (String word : words) {
//        stack.push(word);
//    }
//
//    // Выводим слова из стека, тем самым переворачивая их порядок
//    System.out.println("Строка со словами в обратном порядке:");
//    while (!stack.isEmpty()) {
//        System.out.print(stack.pop());
//        if (!stack.isEmpty()) {
//            System.out.print(" ");
//        }
//    }
//
//    scanner.close();
//}
//    Задача№20
//public static void main(String[] args) {
//    Scanner scanner = new Scanner(System.in);
//
//    System.out.print("Введите целое число: ");
//    int number = scanner.nextInt();
//
//    // Копируем исходное число для проверки
//    int originalNumber = number;
//    int sum = 0;
//
//    // Определяем количество цифр в числе
//    int numberOfDigits = String.valueOf(number).length();
//
//    // Суммируем степени цифр
//    while (number > 0) {
//        int digit = number % 10;
//        sum += Math.pow(digit, numberOfDigits);
//        number /= 10;
//    }
//
//    // Проверяем, является ли число числом Армстронга
//    if (sum == originalNumber) {
//        System.out.println(originalNumber + " является числом Армстронга.");
//    } else {
//        System.out.println(originalNumber + " не является числом Армстронга.");
//    }
//
//    scanner.close();
//}
}
