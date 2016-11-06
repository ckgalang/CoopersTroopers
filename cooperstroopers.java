import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
/**
 * @author panos
 */
public class cooperstroopers extends BasicGame
{
    public cooperstroopers()
    {
        super("Wizard game");
    }

    public static void main(String[] arguments)
    {
        try
        {
            AppGameContainer app = new AppGameContainer(new cooperstroopers());
            app.setDisplayMode(500, 400, false);
            app.start();
        }
        catch (SlickException e)
        {
            e.printStackTrace();
        }
    }

    @Override
    public void init(GameContainer container) throws SlickException
    {
    }

    @Override
    public void update(GameContainer container, int delta) throws SlickException
    {
    }

    public void render(GameContainer container, Graphics g) throws SlickException
    {
    }
}
