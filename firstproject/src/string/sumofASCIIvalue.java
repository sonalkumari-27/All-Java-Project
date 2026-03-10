package string;

public class sumofASCIIvalue {
	    public static void main(String[] args) {
	        String s = "abcde";
	        int K = 294;  
	        int result = findSubstringIndex(s, K);
	        System.out.println(result);
	    }
	    static int findSubstringIndex(String s, int K) {
	        int start = 0;
	        int sum = 0;
	        for (int end = 0; end < s.length(); end++) {
	            sum += s.charAt(end); 
	            while (sum > K && start <= end) {
	                sum -= s.charAt(start);
	                start++;
	            }
	            if (sum == K) {
	                return start;
	            }
	        }
	        return -1;
	    }
	}
