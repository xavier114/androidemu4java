import java.io.IOException;
import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class a extends Canvas {
  private Image a;
  
  private Image b;
  
  private Image c;
  
  private Image d;
  
  private Image e;
  
  private Image f;
  
  private Image g;
  
  private Image h;
  
  private Image i;
  
  private Image j;
  
  private Image k;
  
  private Image l;
  
  private Image m;
  
  private Image n;
  
  private Image o;
  
  private Image p;
  
  private Image q;
  
  private Image r;
  
  private Image s;
  
  private Image t;
  
  private Image u;
  
  private int a = 101;
  
  public a() {
    try {
      this.a = Image.createImage("/mainmenu1.png");
      this.b = Image.createImage("/mainmenu2.png");
      this.c = Image.createImage("/mainmenu3.png");
      this.d = Image.createImage("/mainmenu4.png");
      this.e = Image.createImage("/mainmenu5.png");
      this.f = Image.createImage("/Searchb/searchb1.png");
      this.g = Image.createImage("/Searchb/searchb2.png");
      this.h = Image.createImage("/Preference/prefs1.png");
      this.i = Image.createImage("/Resources/resource1.png");
      this.j = Image.createImage("/Resources/resource2.png");
      this.k = Image.createImage("/Resources/resource3.png");
      this.l = Image.createImage("/Resources/resource4.png");
      this.m = Image.createImage("/Visibility/visibility1.png");
      this.n = Image.createImage("/Visibility/visibility2.png");
      this.o = Image.createImage("/Visibility/visibility3.png");
      this.p = Image.createImage("/Linkify/linkify1.png");
      this.q = Image.createImage("/Linkify/linkify2.png");
      this.r = Image.createImage("/Linkify/linkify3.png");
      this.s = Image.createImage("/Linkify/linkify4.png");
      this.t = Image.createImage("/Linkify/linkify5.png");
      this.u = Image.createImage("/Linkify/linkify6.png");
      return;
    } catch (IOException iOException) {
      throw new RuntimeException("Unable to load Image: " + iOException);
    } 
  }
  
  public final void paint(Graphics paramGraphics) {
    if (this.a == 101) {
      paramGraphics.drawImage(this.a, 0, 0, 20);
      return;
    } 
    if (this.a == 102) {
      paramGraphics.drawImage(this.b, 0, 0, 20);
      return;
    } 
    if (this.a == 103) {
      paramGraphics.drawImage(this.c, 0, 0, 20);
      return;
    } 
    if (this.a == 104) {
      paramGraphics.drawImage(this.d, 0, 0, 20);
      return;
    } 
    if (this.a == 105) {
      paramGraphics.drawImage(this.e, 0, 0, 20);
      return;
    } 
    if (this.a == 201) {
      paramGraphics.drawImage(this.f, 0, 0, 20);
      return;
    } 
    if (this.a == 202) {
      paramGraphics.drawImage(this.g, 0, 0, 20);
      return;
    } 
    if (this.a == 301) {
      paramGraphics.drawImage(this.h, 0, 0, 20);
      return;
    } 
    if (this.a == 401) {
      paramGraphics.drawImage(this.i, 0, 0, 20);
      return;
    } 
    if (this.a == 402) {
      paramGraphics.drawImage(this.j, 0, 0, 20);
      return;
    } 
    if (this.a == 403) {
      paramGraphics.drawImage(this.k, 0, 0, 20);
      return;
    } 
    if (this.a == 404) {
      paramGraphics.drawImage(this.l, 0, 0, 20);
      return;
    } 
    if (this.a == 501) {
      paramGraphics.drawImage(this.m, 0, 0, 20);
      return;
    } 
    if (this.a == 502) {
      paramGraphics.drawImage(this.n, 0, 0, 20);
      return;
    } 
    if (this.a == 503) {
      paramGraphics.drawImage(this.o, 0, 0, 20);
      return;
    } 
    if (this.a == 601) {
      paramGraphics.drawImage(this.p, 0, 0, 20);
      return;
    } 
    if (this.a == 602) {
      paramGraphics.drawImage(this.q, 0, 0, 20);
      return;
    } 
    if (this.a == 603) {
      paramGraphics.drawImage(this.r, 0, 0, 20);
      return;
    } 
    if (this.a == 604) {
      paramGraphics.drawImage(this.s, 0, 0, 20);
      return;
    } 
    if (this.a == 605) {
      paramGraphics.drawImage(this.t, 0, 0, 20);
      return;
    } 
    if (this.a == 606) {
      paramGraphics.drawImage(this.u, 0, 0, 20);
      return;
    } 
    if (this.a == 607)
      paramGraphics.drawImage(this.u, 0, 0, 20); 
  }
  
  public final void keyPressed(int paramInt) {
    switch (paramInt = getGameAction(paramInt)) {
      case 8:
        if (this.a == 101) {
          this.a = 201;
          break;
        } 
        if (this.a == 102) {
          this.a = 301;
          break;
        } 
        if (this.a == 103) {
          this.a = 401;
          break;
        } 
        if (this.a == 104) {
          this.a = 501;
          break;
        } 
        if (this.a == 105) {
          this.a = 601;
          break;
        } 
        if (this.a == 201) {
          this.a = 202;
          break;
        } 
        if (this.a == 401) {
          this.a = 403;
          break;
        } 
        if (this.a == 402) {
          this.a = 404;
          break;
        } 
        if (this.a == 602) {
          this.a = 606;
          break;
        } 
        if (this.a == 603) {
          this.a = 607;
          break;
        } 
        if (this.a == 604)
          this.a = 605; 
        break;
      case 9:
      case 10:
      case 11:
      case 12:
      case 42:
      case 50:
        if (this.a == 301) {
          this.a = 102;
          break;
        } 
        if (this.a == 201) {
          this.a = 101;
          break;
        } 
        if (this.a == 202) {
          this.a = 101;
          break;
        } 
        if (this.a == 401) {
          this.a = 103;
          break;
        } 
        if (this.a == 402) {
          this.a = 103;
          break;
        } 
        if (this.a == 403) {
          this.a = 401;
          break;
        } 
        if (this.a == 404) {
          this.a = 402;
          break;
        } 
        if (this.a == 501) {
          this.a = 104;
          break;
        } 
        if (this.a == 502) {
          this.a = 104;
          break;
        } 
        if (this.a == 503) {
          this.a = 104;
          break;
        } 
        if (this.a == 601) {
          this.a = 105;
          break;
        } 
        if (this.a == 602) {
          this.a = 105;
          break;
        } 
        if (this.a == 603) {
          this.a = 105;
          break;
        } 
        if (this.a == 604) {
          this.a = 105;
          break;
        } 
        if (this.a == 605) {
          this.a = 604;
          break;
        } 
        if (this.a == 607) {
          this.a = 603;
          break;
        } 
        if (this.a == 606)
          this.a = 602; 
        break;
      case 5:
        if (this.a == 501) {
          this.a = 502;
          break;
        } 
        if (this.a == 502)
          this.a = 503; 
        break;
      case 2:
        if (this.a == 503) {
          this.a = 502;
          break;
        } 
        if (this.a == 502)
          this.a = 501; 
        break;
      case 6:
        if (this.a == 101) {
          this.a = 102;
          break;
        } 
        if (this.a == 102) {
          this.a = 103;
          break;
        } 
        if (this.a == 103) {
          this.a = 104;
          break;
        } 
        if (this.a == 104) {
          this.a = 105;
          break;
        } 
        if (this.a == 401) {
          this.a = 402;
          break;
        } 
        if (this.a == 601) {
          this.a = 602;
          break;
        } 
        if (this.a == 602) {
          this.a = 603;
          break;
        } 
        if (this.a == 603)
          this.a = 604; 
        break;
      case 1:
        if (this.a == 102) {
          this.a = 101;
          break;
        } 
        if (this.a == 103) {
          this.a = 102;
          break;
        } 
        if (this.a == 104) {
          this.a = 103;
          break;
        } 
        if (this.a == 105) {
          this.a = 104;
          break;
        } 
        if (this.a == 402) {
          this.a = 401;
          break;
        } 
        if (this.a == 603) {
          this.a = 602;
          break;
        } 
        if (this.a == 604)
          this.a = 603; 
        break;
    } 
    repaint();
  }
}


/* Location:              I:\Java Android Emu\Android_Emu.jar!\a.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       1.1.3
 */