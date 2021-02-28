package com.teavuihuang;

import a;
import javax.microedition.lcdui.Alert;
import javax.microedition.lcdui.AlertType;
import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.midlet.MIDlet;

public class ApiDemos extends MIDlet implements CommandListener {
  private Display a;
  
  private Canvas a = (Canvas)Display.getDisplay(this);
  
  private static final Command a = new Command("About Android Emu...", 5, 1);
  
  private static final Command b = new Command("Exit", 7, 2);
  
  public ApiDemos() {
    this.a = (Command)new a();
    this.a.setFullScreenMode(true);
    this.a.addCommand(a);
    this.a.addCommand(b);
    this.a.setCommandListener(this);
  }
  
  public void startApp() {
    Display display = Display.getDisplay(this);
    this.a.repaint();
  }
  
  public void commandAction(Command paramCommand, Displayable paramDisplayable) {
    Alert alert;
    if (paramCommand == a) {
      (alert = new Alert("Android Emu V1.0.32", "Android Emu for Java created by Xavier Bissonnette - http://androidemujava.com/download", null, AlertType.INFO)).setTimeout(-2);
      this.a.setCurrent((Displayable)alert);
      return;
    } 
    if (alert == b) {
      destroyApp(false);
      notifyDestroyed();
    } 
  }
  
  public void pauseApp() {}
  
  public void destroyApp(boolean paramBoolean) {}
}


/* Location:              I:\Java Android Emu\Android_Emu.jar!\com\teavuihuang\ApiDemos.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       1.1.3
 */