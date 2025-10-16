package Chapter4_5.Ex4;

public class PassByValueDemo {
    String modify(String name){
        name = "John";
        return name;
    }
    int[] modify(int[] arr){
        if (arr.length == 0) {
            System.out.println("Array is empty");
            return arr;
        }
        arr[0] = 100;
        return arr;
    }

    static void main(String[] args){
        PassByValueDemo obj = new PassByValueDemo();

        String name = "Alice";
        System.out.println("Before modify: " + name);
        obj.modify(name);
        System.out.println("After modify: " + name);

        int[] arr = {1, 2, 3};
        System.out.println("Before modify: " + arr[0]);
        obj.modify(arr);
        System.out.println("After modify: " + arr[0]);
    }
}
