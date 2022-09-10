public class Main {
    public static void main(String[] args) {
        System.out.println("task1");
        int age = 3;
        if (age >= 2 && age <= 6) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад");
        }
        else if (age >= 7 && age <= 18) {
            System.out.println("Если возраст человека равен " + ", то ему нужно ходить в школу");
        }
        else if (age >18 && age < 24){
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в университет");
        }
        else if (age >=24) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить на работу");
        }

        System.out.println("task2");
        int childAge = 18;
        if (childAge < 5) {
            System.out.println("тебе " + childAge + ", поэтому ты не можешь кататься на аттракционе");
        }
        if (childAge >= 5 && childAge < 14) {
            System.out.println("тебе " + childAge + ", поэтому ты можешь кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя");
        }
        if (childAge >= 14) {
            System.out.println("тебе " + childAge + ", поэтому ты можешь кататься без сопровождения взрослого");
        }

        System.out.println("task3");
        int one = 1;
        int two = 2;
        int free = 28;
        if (one>two && one>free) {
            System.out.println("one - бОльшее число");
        } else if (two>one && two>free) {
            System.out.println("two - бОльшее число");
        }
        else if (free>one && free>two) {
            System.out.println("free - бОльшее число");
        }
    }
}