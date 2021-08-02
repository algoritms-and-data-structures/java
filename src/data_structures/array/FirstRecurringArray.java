package data_structures.array;

public class FirstRecurringArray {
    public int firstRecurringCharacter(int input[]) {
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
}
