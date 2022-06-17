package br.com.benefrancis.reducedphonelist;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

class Solution {

	@SuppressWarnings("removal")
	public static void main(String args[]) {
		PhoneNumber pn = new PhoneNumber(-1);

		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		for (int i = 0; i < N; i++) {
			String telephone = in.next();
			List<Integer> numbers = Arrays.asList(telephone.split("")).stream().map(Integer::new)
					.collect(Collectors.toList());
			pn.addPhoneNumber(numbers);
		}
		// Debug
		System.err.println(pn);
		// The number of elements (referencing a number) stored in the structure.
		System.out.println(pn.count() - 1);
		in.close();
	}
}

class PhoneNumber {
	public int value;
	public HashMap<Integer, PhoneNumber> childrens;

	public PhoneNumber() {
		this.childrens = new HashMap<>();
	}

	public PhoneNumber(Integer head) {
		this();
		this.value = head;
	}

	public void addPhoneNumber(List<Integer> numbers) {
		if (numbers.isEmpty())
			return;

		Integer head = numbers.get(0);
		List<Integer> queue = numbers.subList(1, numbers.size());

		if (!childrens.containsKey(head)) {
			childrens.put(head, new PhoneNumber(head));
		}

		PhoneNumber childTree = childrens.get(head);
		childTree.addPhoneNumber(queue);
	}

	@Override
	public String toString() {
		return value + (childrens.isEmpty() ? ""
				: " : (" + childrens.values().stream().map(PhoneNumber::toString).collect(Collectors.joining(",")) + ")");
	}

	@SuppressWarnings("removal")
	public int count() {
		return 1 + childrens.values().stream().map(PhoneNumber::count).mapToInt(Integer::new).sum();
	}
}
