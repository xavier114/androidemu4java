import java.util.Timer;
import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class d extends Canvas {
  private Timer a;
  
  private Image a;
  
  private Display a;
  
  private Displayable a = (Displayable)new Timer();
  
  public d(Display paramDisplay, Displayable paramDisplayable) {
    this.a = null;
    this.a = (Displayable)paramDisplay;
    this.a = paramDisplayable;
    setFullScreenMode(true);
    paramDisplay.setCurrent((Displayable)this);
  }
  
  protected final void paint(Graphics paramGraphics) {
    try {
      int i = getWidth();
      int j = getHeight();
      if (this.a == null)
        this.a = (Displayable)Image.createImage("/title.png"); 
      paramGraphics.drawImage((Image)this.a, i / 2, j / 2, 3);
      return;
    } catch (Exception exception) {
      System.out.println("paint(): " + exception);
      return;
    } 
  }
  
  public final void keyPressed(int paramInt) {
    a();
  }
  
  protected final void pointerPressed(int paramInt1, int paramInt2) {
    a();
  }
  
  protected final void showNotify() {
    this.a.schedule(new c(this, null), 5000L);
  }
  
  void a() {
    this.a.cancel();
    this.a.setCurrent(this.a);
  }
}


/* Location:              I:\Java Android Emu\Android_Emu.jar!\d.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       1.1.3
 */