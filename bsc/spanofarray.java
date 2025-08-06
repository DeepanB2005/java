public class spanofarray {
    public static void main(String[] args) {
        
    int a[]={10,12,35,10,5,7,12};
    int max=a[0];
    int min=a[0];
    for(int i=0;i<a.length;i++)
    {
       if(a[i]>max)
       {
           max=a[i];
       }
       else if(a[i]<min)
       {
           min=a[i];
       }   
    }
    
    int span=max-min;
    System.out.println("The span of the array is: " + span);
}
}
