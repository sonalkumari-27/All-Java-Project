package array;
import java.util.Arrays;
public class question1 {
	public static int activitySelection(int start[],int finish[]) {  int n = start.length;
    for (int i = 0; i < n - 1; i++) {
        int min = i;
        for (int j = i + 1; j < n; j++) {
            if (finish[j] < finish[min]) {
                min = j;
            }
        }
        int temp = finish[i];
        finish[i] = finish[min];
        finish[min] = temp;
        temp = start[i];
        start[i] = start[min];
        start[min] = temp;
    }
    int count = 1;
    int lastFinish = finish[0];

    for (int i = 1; i < n; i++) {
        if (start[i] > lastFinish) {
            count++;
            lastFinish = finish[i];
        }
    }

    return count;
}
public static void main(String[] args) {
    int[] start = {5,1,8,0,3,5};
    int[] finish = {9,2,9,6,4,7};
    System.out.println(activitySelection(start, finish));
}

	}

