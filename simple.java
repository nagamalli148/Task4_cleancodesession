class SimpleandcompoundInterest
{
  public double sInterest()
  {
    double principle,rate,time,simpleintrest;

    java.util.Scanner sc=new java.util.Scanner(System.in);

//System.out.println("Enter the amount");
    principle=sc.nextDouble();
//System.out.println("Enter the number of years");
    time=sc.nextDouble();
//System.out.println("ENter the rate of intrest");
    rate=sc.nextDouble();

    simpleintrest=(principle*time*rate)/100;
    return simpleintrest;
  }
  public double cInterest()
  {
    double principle,rate,time,compoundintrest;
    java.util.Scanner sc=new java.util.Scanner(System.in);
  //System.out.println("Enter the amount");
    principle=sc.nextDouble();
  //System.out.println("Enter the number of years");
    time=sc.nextDouble();
  //System.out.println("ENter the rate of intrest");
    rate=sc.nextDouble();

    double amount=principle*((1+rate/100)*(1+rate/100)*(1+rate/100));
    compoundintrest=amount-principle;
    return compoundintrest;
  }
}

//No import statements
//No main method
//No System.out.println
