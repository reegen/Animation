package com.led_display.horizontal_move;

// DisplayAnimado.java
// Display animado.
import javax.swing.JFrame;

public class DisplayAnimado 
{
   // execute application
   public static void main( String args[] )
   {
      // create frame for DisplayJPanel
      JFrame frame = new JFrame( "Display Animado" );
      frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

      DisplayJPanel displayJPanel = new DisplayJPanel(); // create DisplayJPanel
      frame.add( displayJPanel ); // add displayJPanel to frame
      frame.setSize( 915, 290 ); // set frame size
		//frame.setResizable(false);
      frame.setVisible( true ); // display frame
   } // end main
} // end class DisplayAnimado