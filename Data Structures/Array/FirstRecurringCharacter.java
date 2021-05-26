//The goal of these 2 methods is to find the first repeated item of the array
//and return -1 if there are not repeated item

public class FirstRecurringCharacter {

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
