import java.util.Arrays;
import java.util.List;

public class LargestString {

    public static void main(String[] arg) {

        List stringList = Arrays.asList("Candidate", null, "BNG", "AAAA", null, "TTTTTTTTTTTTT");
        int size = 0;
        int ind = 0;
        for (int i = 0; i < stringList.size(); i++) {
            String str = (String) stringList.get(i);
            if(null != str) {
                int len = str.length();
                if (size < len) {
                    size = len;
                    ind = i;
                }
            }
        }

        System.out.println(stringList.get(ind));
    }
}
