class Computer
{
    public void playMusic()
    {
        System.out.println("Playing music...");

    }

    public String getMeAPen(int cost)
    {
        if (cost >= 10)
            return "Pen"; //the moment the method sees return it will jump out of the method, it will not execute the other statement

        return "Nothing";
    }
}

public class  javamethods
{
    public static void main (String args[])
    {
        Computer obj = new Computer(); // obj - referance variable
        obj.playMusic();
        String rightHand;
        rightHand = obj.getMeAPen(3);
        System.out.println(rightHand);
    }
}
