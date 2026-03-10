package string;

public class checkpattern {
		    static boolean isPatternPresent(String text, String pattern) {
		        int n = text.length();
		        int m = pattern.length();
		        int j;
		        for (int i = 0; i <= n - m; i++) {
		            for ( j = 0; j < m; j++) {
		                if (text.charAt(i + j) != pattern.charAt(j))
		                    break;
		            }
		            if (j == m)
		                return true;
		        }
		        return false;
		    }
		    public static void main(String[] args) {
		        String text = "iloveiem";
		        String pattern = "evi";
		        if (isPatternPresent(text, pattern))
		            System.out.println("Pattern Found");
		        else
		            System.out.println("Pattern not found");
		    }
		}
