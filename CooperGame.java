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
      player = new Player(50, 656);
      inputController = new InputController(player);
    }

    @Override
    public void update(GameContainer container, int delta) throws SlickException
    {
      player.checkTouchingGround();
      inputController.handleKeyboardInput(container.getInput(), delta);
      player.insertGravity(delta);
      player.checkCollision();
    }

    public void render(GameContainer container, Graphics g) throws SlickException
    {
      player.render();
      g.setBackground(new org.newdawn.slick.Color(0, 255, 0));
    }
}
