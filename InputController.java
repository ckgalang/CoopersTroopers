import org.newdawn.slick.Input;

public class InputController
{
  protected Player player;
  InputController(Player player)
  {
    this.player = player;
  }
  public void handleKeyboardInput(Input i, int delta)
  {
    if(i.isKeyDown(Input.KEY_A) || i.isKeyDown(i.KEY_LEFT))
    {
      player.moveLeft(delta);
    }
    else if(i.isKeyDown(Input.KEY_D) || i.isKeyDown(Input.KEY_RIGHT))
    {
      player.moveRight(delta);
    }
    if(((i.isKeyDown(Input.KEY_W) || i.isKeyDown(Input.KEY_UP)) & player.returnTouchingGround() == true))
    {
      player.moveUp(delta);
    }
  }
}
