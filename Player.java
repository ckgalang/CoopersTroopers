import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

public enum Facing {
  LEFT, RIGHT
}

public class Player
{
  protected float x;
  protected float y;
  protected Facing facing;
  protected HashMap sprites;

  public Player(float x, float y) throws SlickException
  {
    this.x = x;
    this.y = y;
    facing = Facing.RIGHT;
    setSprite(new Image(SpriteSheet("Megaman_Sprite.png", int 5, int 10)));
  }
  protected void setSprite(Image i)
  {
    sprites = new HashMap<Facing, Image>();
    sprites.put(Facing.RIGHT, i);
    sprites.put(Facing.LEFT, i.getFlippedCopy(true, false));
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
    sprites.get(facing).draw(x,y);
  }
  public void moveLeft(int delta)
  {
    x = x-(delta);
  }
  public void moveRight(int delta)
  {
    x = x+(delta);
  }
  public void moveUp(int delta)
  {
    y = y-(delta*5);
  }
  public void checkTouchingGround()
  {
    if (y >= 656)
    {
      isTouchingGround = true;
    }
    else
    {
      isTouchingGround = false;
    }
  }
  public boolean returnTouchingGround()
  {
    return isTouchingGround;
  }
  public void checkCollision()
  {
    if (x <= 0)
    {
      x = 0;
    }
    if (x >= 1216)
    {
      x = 1216;
    }
    if (y <= 0)
    {
      y = 0;
    }
    if (y >= 656)
    {
      y = 656;
    }
  }
  public void insertGravity(int delta)
  {
    if(y <= 656)
    {
      y = y+(delta*0.05f);
    }
  }
}
