import java.util.ArrayList;

public class Digits {
  public ArrayList<Integer> digitList;

  public Digits(int num) { /* to be implemented in part (a) */ 
    digitList = new ArrayList<Integer>();
    String n = String.valueOf(num);
    
    int t;
    for(int i = 0; i < n.length(); i++) {
      t = Integer.parseInt(n.substring(i, i+1));
      digitList.add(t);
    }
  }

  public boolean isStrictlyIncreasing() { /* to be implemented in part (b) */
    for(int i = 1; i < digitList.size(); i++) {
      if(digitList.get(i) <= digitList.get(i-1)) {
	return false;
      }
    }
    
    return true;
  }
  
  public String toString() {
    return digitList.toString();
  }
	
}
