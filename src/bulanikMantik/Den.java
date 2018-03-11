package bulanikMantik;

import java.util.ArrayList;
public class Den {

	public static void main(String[] args) {
		int SecilenGen;
		ArrayList<ArrayList<Integer>> Genel = new ArrayList<ArrayList<Integer>>();
		for (int q = 0; q < 10; q++) {
			ArrayList<Integer> gk = new ArrayList<Integer>();
			gk.add(0, 1);
			gk.add(1, null);
			gk.add(2, null);
			gk.add(3, null);
			gk.add(4, null);
			gk.add(5, null);
			gk.add(6, 1);
			for (int i = 1; i < 6; i++) {
				do {
					int random = (int) (Math.random() * 5 + 2);
					SecilenGen = random;
				} while ((gk.contains(SecilenGen)));
				{
					gk.set(i, SecilenGen);
				}
			}
			Genel.add(q, gk);
		}
		for (int j = 0; j < 10; j++) {
			System.out.println(Genel.get(j).toString() + " ");
		}
	}
}
