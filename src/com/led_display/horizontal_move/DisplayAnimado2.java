package com.led_display.horizontal_move;

// Fig. 12.25: DrawArcs.java
// Drawing arcs.
import javax.swing.JFrame;

public class DisplayAnimado2 
{
   // execute application
   public static void main( String args[] )
   {
      // create frame for ArcsJPanel
      JFrame frame = new JFrame( "Display Animado 2" );
      frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

      DisplayJPanel2 displayJPanel2 = new DisplayJPanel2(); // create ArcsJPanel
      frame.add( displayJPanel2 ); // add displayJPanel2 to frame
		frame.setSize( 1245, 380 ); // set frame size
      //frame.setSize( 915, 290 ); // set frame size
		//frame.setResizable(false);
      frame.setVisible( true ); // display frame
   } // end main
} // end class DisplayAnimado2