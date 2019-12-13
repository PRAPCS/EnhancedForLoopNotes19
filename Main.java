class Main {
  public static void main(String[] args) {
    //enhanced for loop example

    int [] arr = {1,2,3,4,5,6,7,8,9};
    int max = 0;
    //iterates through every slot in the array temporarily setting the value to x.  Cannot change the values in the array.
    for(int x:arr)
    {
      System.out.print(x+"\t");
      if(x>max)
        max =x;
    }
    
    
    System.out.println("\n"+max);
  }
}