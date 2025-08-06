
class human
{
    public void eat(String food)
    {
        System.out.println("Human is eating " + food);
    }
    void study(String subject)
    {
        System.out.println("Human is studying " + subject);
    }
}

class student extends human
{
    public void eat(String food)
    {
        System.out.println("Student is eating "+food);
    }
    
}
class main
{
    public static void main(String[] args)
    {
        human h = new student();
        h.eat("biriyani");
        h.study("Maths"); 

    }
}