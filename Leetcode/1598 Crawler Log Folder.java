import java.util.*;
public class Main
{
        public static int minOperations(String[] logs) {
        Stack<String> op = new Stack<String>();
        for(int i=0;i<logs.length;i++)
        {
            if(logs[i].equals("../"))
            {
                if(op.size() >= 1)
                    op.pop();
            }
            else if(logs[i].equals("./"));
            else op.add(logs[i]);
        }
        System.out.println(op);
        return op.size();
    }
	public static void main(String[] args) {
	    System.out.println(minOperations(new String[]{"./","../","./"}));
	}
}