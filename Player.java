import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

public class Player
{
  protected float x;
  protected float y;
  protected Image sprite;

  public Player(float x, float y)
  {
    this.x = x;
    this.y = y;
    sprite = "sprite.png";
  }
  public float getX()
  {
    return x;
  }
  public float getY()
  {
    return y;
  }
  public void render()
  {
    sprite.draw(x,y);
  }
  public void moveLeft(int delta)
  {
    x = x-(delta)
  }
  public void moveRight(int delta)
  {
    x = x-(delta)
  }
  public void moveUp(int delta)
  {
    x = x-(delta)
  }
}
