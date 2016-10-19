
public class Label {
	public static void main(String[] args) {
		int[][] numbers = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		int searchNum = 5;
		boolean foundNum = false;
		searchLabel: for (int i=0; i<numbers.length; i++) {
		for (int j=0; j<numbers[i].length; j++) {
		if (searchNum == numbers[i][j]) {
		foundNum = true;
		break searchLabel;
		}
		} // final do laço j
		} // final do laço i
		if (foundNum) {
		System.out.println(searchNum + " found!");
		} else {
		System.out.println(searchNum + " not found!");
		}

		String names[] = {"Beah", "Bianca", "Lance", "Beah"};
		int count = 0;
		for (int i=0; i < names.length; i++) {
		if (!names[i].equals("Beah")) {
		continue; // retorna para a próxima condição
		}
		count++;
		}
		System.out.println(count + " Beahs in the list");
		
	}
}
