import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
/**
 * @author panos
 */
public class CooperGame extends BasicGame
{
    private InputController inputController;
    private Player player;
    public CooperGame()
    {
        super("The Legend of Cooper");
    }

    public static void main(String[] arguments)
    {
        try
        {
            AppGameContainer app = new AppGameContainer(new CooperGame());
            app.setDisplayMode(1280, 720, false);
            app.setTargetFrameRate(60);
            app.setVSync(true);
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
      inputController = new InputController();
      player = new Player(3, 3);
    }

    @Override
    public void update(GameContainer container, int delta) throws SlickException
    {
    }

    public void render(GameContainer container, Graphics g) throws SlickException
    {
    }
}
