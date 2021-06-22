package exam;

public class ConvertToBinary {

  public String toBinary(final int n) {
    //TODO write your code here to achieve the desired result as explained in Readme file for this problem.
    int binaryNo = new int[1000];
    int i=0;
    
    while (n>0)
      binaryNo[i] = n%2;
    n = n/2 ;
    i++;
  }
  String res = "";
  for(int j = i-1 ;j >= 0; j--)
    int x=binaryNo[j];
  res += Integer.toString(x);
}
    //System.out.print(binaryNo[j]);
    return res;
}

