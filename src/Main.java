import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Integer> arrayList = generateRandomList(10);
        List<Integer> linkedList = generateRandomList(10);

        System.out.println("Do sarterovki:");
        System.out.println("ArrayList: " + arrayList);
        System.out.println("LinkedList: " + linkedList);

        sortList(arrayList);
        sortList(linkedList);

        System.out.println("\nposle sarterovki:");
        System.out.println("ArrayList: " + arrayList);
        System.out.println("LinkedList: " + linkedList);
    }

    private static List<Integer> generateRandomList(int size) {
        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            list.add(random.nextInt(2));
        }
        return list;
    }

    private static void sortList(List<Integer> list) {
        Collections.sort(list);
    }
}