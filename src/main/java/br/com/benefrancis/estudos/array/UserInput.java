package br.com.benefrancis.estudos.array;

public class UserInput {

	public static class TextInput {
		public String str = "";

		public void add(char a) {
			str = str.concat(String.valueOf(a)).replaceAll("\\W","");
		}

		public String getValue() {
			return str;
		}
	}

	public static class NumericInput extends TextInput {
		@Override
		public void add(char a) {
			str = str.concat(String.valueOf(a)).replaceAll("\\D", "");
		}
	}

	public static void main(String[] args) {
		TextInput input = new NumericInput();
		input.add('1');
		input.add('a');
		input.add('0');
		System.out.println(input.getValue());
	}
}