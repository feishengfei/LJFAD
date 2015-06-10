package listing5_1;

public class Lotto649
{
	public static void main(String[] args) {
		//Lotto 649 requires that six unique numbers be chosen.
		int[] selectedNumbers = new int[6];
		
		//Assign a unique random number from 1 to 49(inclusive) to 
		//each slot in the selectedNumbers array.
		for (int slot = 0; slot < selectedNumbers.length; slot++) {
			int num;
			try_again:
			do {
				num = rnd(49) + 1;
				for (int i = 0; i < slot; i++) {
					if (selectedNumbers[i] == num)
						continue try_again;
				}
				break;
			}while (true);
			selectedNumbers[slot] = num;
		}
		sort(selectedNumbers);
		for (int i = 0; i < selectedNumbers.length; i++)
			System.out.print(selectedNumbers[i] + " ");
	}
	
	private static int rnd(int limit) {
		assert limit > 1:"limit = " + limit;
		return (int)(Math.random()*limit);
	}
	
	private static void sort(int[] x) {
		for (int pass = 0; pass < x.length-1; pass++) {
			for(int i = x.length-1; i > pass; i--) {
				if (x[i] < x[pass]) {
					int temp = x[i];
					x[i] = x[pass];
					x[pass] = temp;
				}
			}
		}
	}
}
