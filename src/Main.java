public class Main {
    public static void main(String[] args) {

        System.out.println("task1");
        int age = 17;
        if (age >= 18) {
            System.out.println("Поздравляем с совершеннолетием");
        }
        if (age < 18) {
                System.out.println("Нужно еще немного подождать");
        }

        System.out.println("task2");
        int humanAge = 7;
        if (humanAge >= 7 && humanAge < 18) {
            System.out.println("Ребенок ходит в школу");
        }
        if (humanAge >= 18 && humanAge < 24) {
            System.out.println("человек уже закончил школу и может отправляться в университет");
        }
        if (humanAge >= 24) {
            System.out.println("человек окончил университет и ему пора искать первую работу");
        }

        System.out.println("task3");
        int passengers = 124;
        if (passengers <= 60) {
            System.out.println("есть сидячее место в вагоне");
        }
        if (passengers > 60 && passengers <= 102) {
            System.out.println("есть стоячее место в вагоне");
        }
        if (passengers > 102) {
            System.out.println("вагон уже полностью забит");
        }
    }
}