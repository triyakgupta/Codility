import java.util.Arrays;

// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {

	public static int solution(int N) {

		String binaryRep = Integer.toBinaryString(N);

		String[] zeroes = binaryRep.split("1");

		if (zeroes.length > 0) {
			if(!(binaryRep.charAt(binaryRep.length()-1) == '1')){
				zeroes[zeroes.length-1] = "";
			}
			Arrays.sort(zeroes);
			return zeroes[zeroes.length - 1].length();
		}

		return 0;
	}

	public static void main(String[] args) {
		System.out.println(solution(1073741825));
	}
}