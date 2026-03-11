package Week3;
class Item {
    int value;
    char id;

    Item(int value, char id) {
        this.value = value;
        this.id = id;
    }
}

public class StableSortExample {

    public static void main(String[] args) {
        Item arr[] = {
            new Item(5, 'A'),
            new Item(3, 'B'),
            new Item(5, 'C'),
            new Item(2, 'D')
        };

        int n = arr.length;

        for (int i = 1; i < n; i++) {
            Item key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j].value > key.value) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }

        System.out.println("Sorted Array:");
        for (Item item : arr) {
            System.out.println(item.value + " " + item.id);
        }
    }
}