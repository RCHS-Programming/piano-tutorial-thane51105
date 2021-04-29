import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

/**
 * A piano that can be played with the computer keyboard.
 * 
 * @author: M. Kolling
 * @version: 0.1
 */
public class Piano extends World
{
    private String[]whiteKeys =
        {"a", "s", "d", "f", "g", "h", "j", "k", "l", ";", "'", "\\"};
    private String[]whiteNotes = 
        { "3c", "3d", "3e", "3f", "3g", "3a", "3b", "4c", "4d", "4e", "4f", "4g" };
    private String[]blackKeys=
        {"W", "E", "", "T", "Y", "U", "", "O", "P", "","]"};
    private String[]blackNotes=
        {"3c#", "3d#", "", "3f#", "3g#", "3a#", "", "4c#", "4d#", "", "4f#"};
    /**
     * Make the piano.
     */
    public Piano() 
    {
        super(800, 340, 1);
        makeKeys();
    }
    /**
     * create the piano keys
     */
    public void makeKeys()
    {
        int i;
        for (i=0; i < whiteKeys.length;  i++)
        {
             Key key = new Key (whiteKeys[i],  whiteNotes[i] + ".wav", "white-key.png", "white-key-down.png");
             addObject (key,  54  +  i*63,  140);
        }
        for (i=0; i < whiteKeys.length-1; i++)
        {
            if( ! blackKeys[i].equals(""))
            {
                Key key = new Key(blackKeys[i], blackNotes[i]+".wav","black-key.png","black-key-down.png");
                addObject(key, 85 + (i*63), 86);
            }
        }
    }
}