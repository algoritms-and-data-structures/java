package data_structures.array;

public class FirstRecurringArray {
    // The goal of this method is to find the first repeated item of the array
    // and returns -1 if there are not repeated item
    public static int firstRecurringCharacter(int input[]) {
        int x[] = new int[input.length];
        for(int i = 0; i < x.length; i++) {
            x[i] = -1;
        }
        for(int i = 0; i < input.length; i++) {
            for(int j = 0; j < x.length; j++) {
                if(input[i] == x[j])
                    return input[i];
            }
            x[i] = input[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        int array[] = {3, 6, 5, 6, 3, 2, 6};
        System.out.print(firstRecurringCharacter(array));
    }
}
