import java.util.LinkedList;

public class BubbleSortLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(5);
        list.add(3);
        list.add(8);
        list.add(1);
        list.add(2);
        
        System.out.println("Original List: " + list);
        bubbleSort(list);
        System.out.println("Sorted List: " + list);
    }

    public static void bubbleSort(LinkedList<Integer> list) {
        int n = list.size();
        boolean swapped;
        
        do {
            swapped = false;
            for (int i = 1; i < n; i++) {
                if (list.get(i - 1) > list.get(i)) {
                    // Swap elements
                    int temp = list.get(i - 1);
                    list.set(i - 1, list.get(i));
                    list.set(i, temp);
                    swapped = true;
                }
            }
            n--; // Decrease the range because the largest element is now at the end
        } while (swapped);
    }
}
