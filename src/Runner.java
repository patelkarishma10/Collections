import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runner name = new Runner();
		// name.arrl1();
		// name.arrl2();
		name.stream1("ff");
		System.out.println(name.stream2());
		System.out.println(name.stream3());
		// System.out.println(name.arrlCheck(5));
		// System.out.println(name.arrlCheck2("fff"));
		// System.out.println(name.arrlCheck3());
		// System.out.println(name.arrlCheck5("bat"));
	}

	private void arr1() {
		int[] array1 = new int[100];
		System.out.print("[");
		for (int i = 0; i < array1.length; i++) {
			array1[i] = i + 1;
			System.out.print(array1[i] + ",");
		}
		System.out.println("]");
	}

	private void arrl1() {
		ArrayList<Integer> intList = new ArrayList<Integer>();
		int j = 100;
		for (int i = 0; i < 900; i++) {
			intList.add(j);
			j++;
			System.out.println(intList.get(i));
		}

	}

	private ArrayList arrl2() {
		ArrayList<Integer> list10 = new ArrayList<Integer>();
		for (int i = 0; i < 11; i++) {
			list10.add(i);
			System.out.println(list10.get(i));
		}
		return list10;
	}

	private boolean arrlCheck(int value) {
		return this.arrl2().contains(value) == true;
		// System.out.prinln()
	}

	private boolean arrlCheck2(String value) {
		ArrayList<String> arrl3 = new ArrayList<String>();
		arrl3.add("fff");
		arrl3.add("ddd");
		arrl3.add("eee");
		return arrl3.contains(value) == true;
	}

	private ArrayList arrlCheck3() {
		ArrayList<Integer> list5 = new ArrayList<Integer>();
		for (int i = 0; i < 11; i++) {
			list5.add(i);
			// System.out.println(list5.get(i));
		}
		for (int j : list5) {
			if ((list5.get(j) % 5) == 0) {
				list5.set(j, list5.get(j) * 10);
			}
		}
		return list5;
	}

	private boolean arrlCheck5(String value) {
		ArrayList<String> arrl3 = new ArrayList<String>();
		arrl3.add("fff");
		arrl3.add("ddd");
		arrl3.add("eee");
		int occurrences = Collections.frequency(arrl3, value);
		System.out.print(occurrences + " ");
		return arrl3.contains(value) == true;
	}

	private long stream1(String value) {
		ArrayList<String> arrl3 = new ArrayList<String>();
		arrl3.add("fff");
		arrl3.add("ddd");
		arrl3.add("eee");
		arrl3.add("fff");
		arrl3.add("ddd");
		arrl3.add("eee");
		//
		System.out.println(value + " count: " + arrl3.stream().filter(i -> i.equals(value)).count());
		return arrl3.stream().filter(i -> arrl3.contains(i)).count();
	}

	private Integer stream2() {
		ArrayList<Integer> list6 = new ArrayList<Integer>();
		for (int i = 0; i < 11; i++) {
			list6.add(i);
		}
		return list6.stream().max(Integer::compare).get();
	}

	private List<Integer> stream3() {
		ArrayList<Integer> list7 = new ArrayList<Integer>();
		for (int i = 0; i < 11; i++) {
			list7.add(i);
		}
		// System.out.println(list7.stream().filter(i -> i %
		// 2==0).collect(Collectors.toList()));
		return list7.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());

	}

}
