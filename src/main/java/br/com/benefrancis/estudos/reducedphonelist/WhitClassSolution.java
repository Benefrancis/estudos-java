package br.com.benefrancis.estudos.reducedphonelist;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * https://www.codingame.com/ide/puzzle/telephone-numbers
 * 
 * @author Francis 5 0412578440 0412199803 0468892011 112 15
 *
 *
 *
 *
 *
 *         Input 1 0467123456 Output 10 Input 2 0123456789 1123456789 Output 20
 *         Input 2 0123456789 0123 Output 10 
 *         Input 5 0412578440 0412199803
 *         0468892011 112 15 Output 28
 *
 *
 */
class WhitClassSolution {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int entries = in.nextInt();
		TrieNode root = new TrieNode();

		for (int i = 0; i < entries; i++) {
			String telephone = in.next();
			TrieNode current = root;

			for (char digit : telephone.toCharArray()) {
				current = current.add(Integer.parseInt(Character.toString(digit)));
			}
		}

		in.close();
		System.err.println(root.getLinks());
		System.out.println(root.countChildren());
	}

	static class TrieNode {

		private Map<Integer, TrieNode> links;

		TrieNode() {
			links = new HashMap<>();
		}

		TrieNode add(int key) {
			if (!links.containsKey(key)) {
				links.put(key, new TrieNode());
			}

			return links.get(key);
		}

		int countChildren() {
			int count = links.size();

			for (TrieNode link : links.values()) {
				count += link.countChildren();
			}

			return count;
		}

		public Map<Integer, TrieNode> getLinks() {
			return links;
		}
		
		public String toString(){
			String ret = "";
			for(TrieNode i: links.values()) {
				ret += i;
			}
			return ret;
		}
	}
}