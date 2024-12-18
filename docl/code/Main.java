import src.Calculator; 
/**
 * Класс для входа в программу.
 *
 * <p>Вот изображение, которое иллюстрирует работу класса:</p>
 *
 * <img src="../images/example.png" alt="Описание изображения"/>
 *
 *
 * @author Иван Иванов
 * @version 2.0
 * @since 1.0
 */
public class Main {

/**
 * Точка входа в программу.
 *
 *
 * @param args аргументы командной строки
 */
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        
        int result = calculator.add(1, 2);
        System.out.println("calculator.add(1, 2): " + result);
        
        try {
            int deprecatedResult = calculator.sumDeprecated(1, 2);
            System.out.println("calculator.sumDeprecated(1, 2): " + deprecatedResult);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            int deprecatedResult = calculator.sumDeprecated(-1, 2);
            System.out.println("calculator.sumDeprecated(-1, 2): " + deprecatedResult);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
    * Этот метод выполняет некоторые вычисления.
    *
    * @param a первый параметр
    * @param b второй параметр
    * @return результат вычислений
    */
    public int myMethod(int a, int b) {
        // Реализация метода
        return a + b;
    }
}
