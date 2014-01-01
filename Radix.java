public class Radix {
	public static void main(String[] args) {
		String[] names = new String[] {"Dave","Beta","Zebra","Abe","Charlie","Echo","Bar","Foo","Aria","Foxtrot","Alva"};
		
		int[] count = new int[26];
		for(String s: names) {
			int pos = (int)s.charAt(0)-(int)'A';
			System.out.println(s+" "+pos);
			count[pos]++;
		}

		int sum = 0;
		for(int i=0;i<26;i++) {
			sum += count[i];
			count[i] = sum - count[i];
			System.out.println(""+count[i]);
		}

		String[] res = new String[names.length];
		for(String s: names) {
			int pos = (int)s.charAt(0)-(int)'A';
			res[count[pos]++] = s;
		}

		for(String s: res) {
			System.out.println(s);
		}

	}
}