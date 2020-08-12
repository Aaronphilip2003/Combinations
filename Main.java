import java.io.*;
class Main {
  static int fact (int n)throws IOException
  {
    int f=1;
    for (int i=1;i<=n;i++)
    {
      f*=i;
    }
    return f;
  }
  
  public static void main(String[] args)throws IOException
  {
    BufferedReader br=new BufferedReader(new InputStreamReader(System. in));
    int n=0,r=0,nfact=0,nmrfact=0,rfact=0,nmr=0,ans=0;
    System.out.println("Enter the value of n");
    n=Integer.parseInt(br.readLine());
    nfact=fact(n);
    System.out.println("Enter the value of r");
    r=Integer.parseInt(br.readLine());
    rfact=fact(r);
    nmr=n-r;
    if(nmr>0)
    {
      nmrfact=fact(nmr);
    }
    else if (nmr==0)
    {
      nmrfact=1;
    }
    else{
      System.out.println("NOT DEFINED");
    }
    ans=(nfact)/(rfact*nmrfact);
    System.out.println("The number of combinations are: "+ans);
    

  
  }
}