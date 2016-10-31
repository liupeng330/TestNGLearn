import java.awt.*;

public class MyTest2
{
    public static void main(String[] args)
    {
        Color color = hex2Rgb("#00a2d0");
        System.out.println(String.format("rgb(%d, %d, %d)", color.getRed(), color.getGreen(), color.getBlue()));
    }

    public static Color hex2Rgb(String colorStr) {
        return new Color(
                Integer.valueOf( colorStr.substring( 1, 3 ), 16 ),
                Integer.valueOf( colorStr.substring( 3, 5 ), 16 ),
                Integer.valueOf( colorStr.substring( 5, 7 ), 16 ) );
    }
}
