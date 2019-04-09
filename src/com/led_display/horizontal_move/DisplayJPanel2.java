package com.led_display.horizontal_move;

// Display Animado.
//import java.awt.Color;
//import java.awt.Graphics;
//import javax.swing.JPanel;
//import java.awt.event.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.Stack;
import java.util.EmptyStackException;

public class DisplayJPanel2 extends JPanel 
{

   private int squareX = 15;
   private Stack<Integer> right_buffer = new Stack<Integer>();
   private int left_limit = 15;
	private int right_limit = 1185;
//   private int squareW = 15;
//   private int squareH = 60;
	
	DisplayJPanel2() {
      //... Create components
      JButton moveToRight = new JButton("Translate to Right");        
      JButton moveToLeft  = new JButton("Translate to Left");
        
      //... Add Listeners
      moveToRight.addActionListener(new MoveToRight());
      moveToLeft.addActionListener(new MoveToLeft());
        
      //... Layout inner panel with two buttons horizontally
      JPanel buttonPanel = new JPanel();
      buttonPanel.setLayout(new FlowLayout());
      buttonPanel.add(moveToLeft);
      buttonPanel.add(moveToRight);		
        
 	   //... Layout outer panel with button panel above bouncing ball
      this.setLayout(new BorderLayout());
	   this.add(buttonPanel, BorderLayout.NORTH);

    }//end constructor
    
    
   //////////////// inner listener class MoveToRight
   class MoveToRight implements ActionListener {
      public void actionPerformed(ActionEvent e) {
			int OFFSET = 30;
			if ( squareX <= right_limit ) {
				//repaint();
				squareX = squareX + OFFSET;
				repaint();
			}	
//			} else if ( squareX > 885 ) {
//				  buffer_size = right_buffer.size();
//				  if ( buffer_size < 5 ) { 
//			        right_buffer.push( squareX + OFFSET );
//				  }
//			}
			//moveLetra( 45, 65 );
      }
   }	

   //////////////// inner listener class MoveToRight
   class MoveToLeft implements ActionListener {
      public void actionPerformed(ActionEvent e) {
			int OFFSET = 30;
			if ( squareX >= left_limit - 2810 ) {
				//repaint();
				squareX = squareX - OFFSET;
				repaint();
			}	

//			int limite;
//			int buffer_size = right_buffer.size();
//			if ( buffer_size > 0 ) {
//				limite = right_buffer.pop();
//				if ( limite == 885 ) {
//					squareX = squareX - OFFSET;
//					repaint();
//				}
//			} else {
//        squareX = squareX - OFFSET;
//			repaint();
//			}
			//moveLetra( 45, 65 );
      }
   }	

/*
	public void moveLetra(int x, int y) {
		int OFFSET = 30;
		if ((squareX != x) || (squareY != y)) {
			repaint(squareX, squareY, squareW + OFFSET, squareH + OFFSET);
			squareX = x;
			squareY = y;
			repaint(squareX, squareY, squareW + OFFSET, squareH + OFFSET);
		} 
   }	
	
   public void desenhaLetraI() {
//        g.fillOval(m_x, m_y, DIAMETER, DIAMETER);
		for ( int i = squareY ; i <= 185; i += 30 ) 
		{ 
			for ( int n = 1 ; n <= 6 ; n++ )
			{
//				g.setColor( Color.BLACK );
//				g.fillRect( 15, i, 30, 30 );
				g.setColor( Color.RED );
				g.fillArc( squareX, i, 30, 30, 0, 360 );
			}
		}
    }

*/	
	
   // draw rectangles and arcs
   public void paintComponent( Graphics g )
   {
      super.paintComponent( g ); // call superclass's paintComponent 
		
		// Desenhando o painel eletronico
		g.setColor( Color.BLACK );
		g.fillRect( 15, 35, 1200, 270);
		//g.fillRect( 15, 35, 870, 180);

      // Letra "B": Colunas 1 a 6
      
		// Coluna 1
		if ( squareX >= left_limit && squareX <= right_limit ) {
			for ( int i = 35 ; i <= 275; i += 30 ) 
			{ 
				g.setColor( Color.RED );
				g.fillOval( squareX, i, 30, 30 );
			}
		}

		// Coluna 2
		if ( ( squareX + 30 ) >= left_limit && ( squareX + 30 ) <= right_limit ) {
			g.setColor( Color.RED );
			g.fillOval( squareX + 30, 35, 30, 30 );
			
			g.setColor( Color.RED );
			g.fillOval( squareX + 30, 155, 30, 30 );

			g.setColor( Color.RED );
			g.fillOval( squareX + 30, 275, 30, 30 );
		}

      // Coluna 3
		if ( ( squareX + 60 ) >= left_limit && ( squareX + 60 ) <= right_limit ) {
			g.setColor( Color.RED );
			g.fillOval( squareX + 60, 35, 30, 30 );
			
			g.setColor( Color.RED );
			g.fillOval( squareX + 60, 155, 30, 30 );

			g.setColor( Color.RED );
			g.fillOval( squareX + 60, 275, 30, 30 );
		}
		
      // Coluna 4
		if ( ( squareX + 90 ) >= left_limit && ( squareX + 90 ) <= right_limit ) {
			g.setColor( Color.RED );
			g.fillOval( squareX + 90, 35, 30, 30 );
			
			g.setColor( Color.RED );
			g.fillOval( squareX + 90, 155, 30, 30 );
			
			g.setColor( Color.RED );
			g.fillOval( squareX + 90, 275, 30, 30 );			
		}

      // Coluna 5
		if ( ( squareX + 120 ) >= left_limit && ( squareX + 120 ) <= right_limit ) {
			g.setColor( Color.RED );
			g.fillOval( squareX + 120, 65, 30, 30 );
			
			g.setColor( Color.RED );
			g.fillOval( squareX + 120, 125, 30, 30 );
			
			g.setColor( Color.RED );
			g.fillOval( squareX + 120, 185, 30, 30 );
			
			g.setColor( Color.RED );
			g.fillOval( squareX + 120, 245, 30, 30 );			
		}

      // Coluna 6
		if ( ( squareX + 135 ) >= left_limit && ( squareX + 150 ) <= right_limit ) {
			g.setColor( Color.RED );
			g.fillOval( squareX + 150, 95, 30, 30 );
			
			g.setColor( Color.RED );
			g.fillOval( squareX + 150, 215, 30, 30 );
		}

      // Letra "E": Colunas 1 a 5
      
		// Coluna 1
		if ( ( squareX + 210 ) >= left_limit && ( squareX + 210 ) <= right_limit ) {
			for ( int i = 35 ; i <= 275; i += 30 ) 
			{ 
				g.setColor( Color.RED );
				g.fillOval( squareX + 210, i, 30, 30 );
			}
		}
		
		// Coluna 2
		if ( ( squareX + 240 ) >= left_limit && ( squareX + 240 ) <= right_limit ) {
			g.setColor( Color.RED );
			g.fillOval( squareX + 240, 35, 30, 30 );
			
			g.setColor( Color.RED );
			g.fillOval( squareX + 240, 155, 30, 30 );

			g.setColor( Color.RED );
			g.fillOval( squareX + 240, 275, 30, 30 );
		}

      // Coluna 3
		if ( ( squareX + 270 ) >= left_limit && ( squareX + 270 ) <= right_limit ) {
			g.setColor( Color.RED );
			g.fillOval( squareX + 270, 35, 30, 30 );
			
			g.setColor( Color.RED );
			g.fillOval( squareX + 270, 155, 30, 30 );

			g.setColor( Color.RED );
			g.fillOval( squareX + 270, 275, 30, 30 );
		}
		
      // Coluna 4
		if ( ( squareX + 300 ) >= left_limit && ( squareX + 300 ) <= right_limit ) {
			g.setColor( Color.RED );
			g.fillOval( squareX + 300, 35, 30, 30 );
			
			g.setColor( Color.RED );
			g.fillOval( squareX + 300, 155, 30, 30 );
			
			g.setColor( Color.RED );
			g.fillOval( squareX + 300, 275, 30, 30 );			
		}
		
      // Coluna 5
		if ( ( squareX + 330 ) >= left_limit && ( squareX + 330 ) <= right_limit ) {
			g.setColor( Color.RED );
			g.fillOval( squareX + 330, 35, 30, 30 );
			
			g.setColor( Color.RED );
			g.fillOval( squareX + 330, 155, 30, 30 );
			
			g.setColor( Color.RED );
			g.fillOval( squareX + 330, 275, 30, 30 );			
		}

      // Letra "M": Colunas 1 a 7
      
		// Coluna 1
		if ( ( squareX + 390 ) >= left_limit && ( squareX + 390 ) <= right_limit ) {
			for ( int i = 35 ; i <= 275; i += 30 ) 
			{ 
				g.setColor( Color.RED );
				g.fillOval( squareX + 390, i, 30, 30 );
			}
		}
		
      // Coluna 2
		if ( ( squareX + 420 ) >= left_limit && ( squareX + 420 ) <= right_limit ) {
			g.setColor( Color.RED );
			g.fillOval( squareX + 420, 65, 30, 30 );
		}

      // Coluna 3
		if ( ( squareX + 450 ) >= left_limit && ( squareX + 450 ) <= right_limit ) {
			g.setColor( Color.RED );
			g.fillOval( squareX + 450, 95, 30, 30 );
		}

      // Coluna 4
		if ( ( squareX + 480 ) >= left_limit && ( squareX + 480 ) <= right_limit ) {
			g.setColor( Color.RED );
			g.fillOval( squareX + 480, 125, 30, 30 );
		}
		
      // Coluna 5
		if ( ( squareX + 510 ) >= left_limit && ( squareX + 510 ) <= right_limit ) {
			g.setColor( Color.RED );
			g.fillOval( squareX + 510, 95, 30, 30 );
		}

      // Coluna 6
		if ( ( squareX + 540 ) >= left_limit && ( squareX + 540 ) <= right_limit ) {
			g.setColor( Color.RED );
			g.fillOval( squareX + 540, 65, 30, 30 );
		}
		
		// Coluna 7
		if ( ( squareX + 570 ) >= left_limit && ( squareX + 570 ) <= right_limit ) {
			for ( int i = 35 ; i <= 275; i += 30 ) 
			{ 
				g.setColor( Color.RED );
				g.fillOval( squareX + 570, i, 30, 30 );
			}
		}
		
      // Letra "V": Colunas 1 a 7
		
      // Coluna 1
		if ( ( squareX + 630 ) >= left_limit && ( squareX + 630 ) <= right_limit ) {
			g.setColor( Color.RED );
			g.fillOval( squareX + 630, 35, 30, 30 );
			
			g.setColor( Color.RED );
			g.fillOval( squareX + 630, 65, 30, 30 );
			
			g.setColor( Color.RED );
			g.fillOval( squareX + 630, 95, 30, 30 );
		}

      // Coluna 2
		if ( ( squareX + 660 ) >= left_limit && ( squareX + 660 ) <= right_limit ) {
			g.setColor( Color.RED );
			g.fillOval( squareX + 660, 125, 30, 30 );
			
			g.setColor( Color.RED );
			g.fillOval( squareX + 660, 155, 30, 30 );

			g.setColor( Color.RED );
			g.fillOval( squareX + 660, 185, 30, 30 );
		}
		
      // Coluna 3
		if ( ( squareX + 690 ) >= left_limit && ( squareX + 690 ) <= right_limit ) {
			g.setColor( Color.RED );
			g.fillOval( squareX + 690, 215, 30, 30 );
			
			g.setColor( Color.RED );
			g.fillOval( squareX + 690, 245, 30, 30 );
		}
		
      // Coluna 4
		if ( ( squareX + 720 ) >= left_limit && ( squareX + 720 ) <= right_limit ) {
			g.setColor( Color.RED );
			g.fillOval( squareX + 720, 275, 30, 30 );
		}
		
      // Coluna 5
		if ( ( squareX + 750 ) >= left_limit && ( squareX + 750 ) <= right_limit ) {
			g.setColor( Color.RED );
			g.fillOval( squareX + 750, 245, 30, 30 );
			
			g.setColor( Color.RED );
			g.fillOval( squareX + 750, 215, 30, 30 );
		}
		
      // Coluna 6
		if ( ( squareX + 780 ) >= left_limit && ( squareX + 780 ) <= right_limit ) {
			g.setColor( Color.RED );
			g.fillOval( squareX + 780, 185, 30, 30 );

			g.setColor( Color.RED );
			g.fillOval( squareX + 780, 155, 30, 30 );
			
			g.setColor( Color.RED );
			g.fillOval( squareX + 780, 125, 30, 30 );
		}
		
      // Coluna 7
		if ( ( squareX + 810 ) >= left_limit && ( squareX + 810 ) <= right_limit ) {
			g.setColor( Color.RED );
			g.fillOval( squareX + 810, 95, 30, 30 );
		
			g.setColor( Color.RED );
			g.fillOval( squareX + 810, 65, 30, 30 );
			
			g.setColor( Color.RED );
			g.fillOval( squareX + 810, 35, 30, 30 );
		}
		
      // Letra "I": Coluna 1
      
		// Coluna 1
		if ( ( squareX + 870 ) >= left_limit && ( squareX + 870 ) <= right_limit ) {
			for ( int i = 35 ; i <= 275; i += 30 ) 
			{ 
				g.setColor( Color.RED );
				g.fillOval( squareX + 870, i, 30, 30 );
			}
		}

      // Letra "N": Colunas 1 a 7
      
		// Coluna 1
		if ( ( squareX + 930 ) >= left_limit && ( squareX + 930 ) <= right_limit ) {
			for ( int i = 35 ; i <= 275; i += 30 ) 
			{ 
				g.setColor( Color.RED );
				g.fillOval( squareX + 930, i, 30, 30 );
			}
		}
		
      // Coluna 2
		if ( ( squareX + 960 ) >= left_limit && ( squareX + 960 ) <= right_limit ) {
			g.setColor( Color.RED );
			g.fillOval( squareX + 960, 95, 30, 30 );
		}

      // Coluna 3
		if ( ( squareX + 990 ) >= left_limit && ( squareX + 990 ) <= right_limit ) {
			g.setColor( Color.RED );
			g.fillOval( squareX + 990, 125, 30, 30 );
		}

      // Coluna 4
		if ( ( squareX + 1020 ) >= left_limit && ( squareX + 1020 ) <= right_limit ) {
			g.setColor( Color.RED );
			g.fillOval( squareX + 1020, 155, 30, 30 );
		}
		
      // Coluna 5
		if ( ( squareX + 1050 ) >= left_limit && ( squareX + 1050 ) <= right_limit ) {
			g.setColor( Color.RED );
			g.fillOval( squareX + 1050, 185, 30, 30 );
		}

      // Coluna 6
		if ( ( squareX + 1080 ) >= left_limit && ( squareX + 1080 ) <= right_limit ) {
			g.setColor( Color.RED );
			g.fillOval( squareX + 1080, 215, 30, 30 );
		}

		// Coluna 7
		if ( ( squareX + 1110 ) >= left_limit && ( squareX + 1110 ) <= right_limit ) {
			for ( int i = 35 ; i <= 275; i += 30 ) 
			{ 
				g.setColor( Color.RED );
				g.fillOval( squareX + 1110, i, 30, 30 );
			}
		}

      // Letra "D": Colunas 1 a 6
      
		// Coluna 1
		if ( ( squareX + 1170 ) >= left_limit && ( squareX + 1170 ) <= right_limit ) {
			for ( int i = 35 ; i <= 275; i += 30 ) 
			{ 
				g.setColor( Color.RED );
				g.fillOval( squareX + 1170, i, 30, 30 );
			}
		}

		// Coluna 2
		if ( ( squareX + 1200 ) >= left_limit && ( squareX + 1200 ) <= right_limit ) {
			g.setColor( Color.RED );
			g.fillOval( squareX + 1200, 35, 30, 30 );

			g.setColor( Color.RED );
			g.fillOval( squareX + 1200, 275, 30, 30 );
		}

      // Coluna 3
		if ( ( squareX + 1230 ) >= left_limit && ( squareX + 1230 ) <= right_limit ) {
			g.setColor( Color.RED );
			g.fillOval( squareX + 1230, 35, 30, 30 );

			g.setColor( Color.RED );
			g.fillOval( squareX + 1230, 275, 30, 30 );
		}
		
      // Coluna 4
		if ( ( squareX + 1260 ) >= left_limit && ( squareX + 1260 ) <= right_limit ) {
			g.setColor( Color.RED );
			g.fillOval( squareX + 1260, 35, 30, 30 );
			
			g.setColor( Color.RED );
			g.fillOval( squareX + 1260, 275, 30, 30 );			
		}

      // Coluna 5
		if ( ( squareX + 1290 ) >= left_limit && ( squareX + 1290 ) <= right_limit ) {
			g.setColor( Color.RED );
			g.fillOval( squareX + 1290, 65, 30, 30 );
			
			g.setColor( Color.RED );
			g.fillOval( squareX + 1290, 245, 30, 30 );
		}

      // Coluna 6
		if ( ( squareX + 1320 ) >= left_limit && ( squareX + 1320 ) <= right_limit ) {
			g.setColor( Color.RED );
			g.fillOval( squareX + 1320, 95, 30, 30 );
			
			g.setColor( Color.RED );
			g.fillOval( squareX + 1320, 215, 30, 30 );
		}
		
      // Coluna 7
		if ( ( squareX + 1350 ) >= left_limit && ( squareX + 1350 ) <= right_limit ) {
			g.setColor( Color.RED );
			g.fillOval( squareX + 1350, 125, 30, 30 );

   		g.setColor( Color.RED );
			g.fillOval( squareX + 1350, 155, 30, 30 );
			
			g.setColor( Color.RED );
			g.fillOval( squareX + 1350, 185, 30, 30 );
		}

      // Letra "O": Colunas 1 a 7
      
		// Coluna 1
		if ( ( squareX + 1410 ) >= left_limit && ( squareX + 1410 ) <= right_limit ) {
			for ( int i = 65 ; i <= 245; i += 30 ) 
			{ 
				g.setColor( Color.RED );
				g.fillOval( squareX + 1410, i, 30, 30 );
			}
		}
		
		// Coluna 2
		if ( ( squareX + 1440 ) >= left_limit && ( squareX + 1440 ) <= right_limit ) {
			g.setColor( Color.RED );
			g.fillOval( squareX + 1440, 35, 30, 30 );
			
			g.setColor( Color.RED );
			g.fillOval( squareX + 1440, 275, 30, 30 );
		}

      // Coluna 3
		if ( ( squareX + 1470 ) >= left_limit && ( squareX + 1470 ) <= right_limit ) {
			g.setColor( Color.RED );
			g.fillOval( squareX + 1470, 35, 30, 30 );
			
			g.setColor( Color.RED );
			g.fillOval( squareX + 1470, 275, 30, 30 );
		}
		
      // Coluna 4
		if ( ( squareX + 1500 ) >= left_limit && ( squareX + 1500 ) <= right_limit ) {
			g.setColor( Color.RED );
			g.fillOval( squareX + 1500, 35, 30, 30 );
			
			g.setColor( Color.RED );
			g.fillOval( squareX + 1500, 275, 30, 30 );			
		}
		
      // Coluna 5
		if ( ( squareX + 1530 ) >= left_limit && ( squareX + 1530 ) <= right_limit ) {
			g.setColor( Color.RED );
			g.fillOval( squareX + 1530, 35, 30, 30 );

			g.setColor( Color.RED );
			g.fillOval( squareX + 1530, 275, 30, 30 );			
		}
		
      // Coluna 6
		if ( ( squareX + 1560 ) >= left_limit && ( squareX + 1560 ) <= right_limit ) {
			g.setColor( Color.RED );
			g.fillOval( squareX + 1560, 35, 30, 30 );

			g.setColor( Color.RED );
			g.fillOval( squareX + 1560, 275, 30, 30 );			
		}
		
		// Coluna 7
		if ( ( squareX + 1590 ) >= left_limit && ( squareX + 1590 ) <= right_limit ) {
			for ( int i = 65 ; i <= 245; i += 30 ) 
			{ 
				g.setColor( Color.RED );
				g.fillOval( squareX + 1590, i, 30, 30 );
			}
		}
		
      // Letra "J": Colunas 1 a 7
      
		// Coluna 1
		if ( ( squareX + 1830 ) >= left_limit && ( squareX + 1830 ) <= right_limit ) {
			for ( int i = 185 ; i <= 245; i += 30 ) 
			{ 
				g.setColor( Color.RED );
				g.fillOval( squareX + 1830, i, 30, 30 );
			}
		}
		
		// Coluna 2
		if ( ( squareX + 1860 ) >= left_limit && ( squareX + 1860 ) <= right_limit ) {
			g.setColor( Color.RED );
			g.fillOval( squareX + 1860, 275, 30, 30 );
		}

      // Coluna 3
		if ( ( squareX + 1890 ) >= left_limit && ( squareX + 1890 ) <= right_limit ) {
			g.setColor( Color.RED );
			g.fillOval( squareX + 1890, 275, 30, 30 );
		}
		
      // Coluna 4
		if ( ( squareX + 1920 ) >= left_limit && ( squareX + 1920 ) <= right_limit ) {
			g.setColor( Color.RED );
			g.fillOval( squareX + 1920, 275, 30, 30 );
		}
		
      // Coluna 5
		if ( ( squareX + 1950 ) >= left_limit && ( squareX + 1950 ) <= right_limit ) {
			g.setColor( Color.RED );
			g.fillOval( squareX + 1950, 275, 30, 30 );
		}
		
      // Coluna 6
		if ( ( squareX + 1980 ) >= left_limit && ( squareX + 1980 ) <= right_limit ) {
			g.setColor( Color.RED );
			g.fillOval( squareX + 1980, 275, 30, 30 );
		}
		
		// Coluna 7
		if ( ( squareX + 2010 ) >= left_limit && ( squareX + 2010 ) <= right_limit ) {
			for ( int i = 35 ; i <= 245; i += 30 ) 
			{ 
				g.setColor( Color.RED );
				g.fillOval( squareX + 2010, i, 30, 30 );
			}
		}
		
      // Letra "A": Colunas 1 a 7
      
		// Coluna 1
		if ( ( squareX + 2070 ) >= left_limit && ( squareX + 2070 ) <= right_limit ) {
			for ( int i = 65 ; i <= 275; i += 30 ) 
			{ 
				g.setColor( Color.RED );
				g.fillOval( squareX + 2070, i, 30, 30 );
			}
		}
		
		// Coluna 2
		if ( ( squareX + 2100 ) >= left_limit && ( squareX + 2100 ) <= right_limit ) {
			g.setColor( Color.RED );
			g.fillOval( squareX + 2100, 35, 30, 30 );
			
			g.setColor( Color.RED );
			g.fillOval( squareX + 2100, 155, 30, 30 );
		}

      // Coluna 3
		if ( ( squareX + 2130 ) >= left_limit && ( squareX + 2130 ) <= right_limit ) {
			g.setColor( Color.RED );
			g.fillOval( squareX + 2130, 35, 30, 30 );

			g.setColor( Color.RED );
			g.fillOval( squareX + 2130, 155, 30, 30 );
		}
		
      // Coluna 4
		if ( ( squareX + 2160 ) >= left_limit && ( squareX + 2160 ) <= right_limit ) {
			g.setColor( Color.RED );
			g.fillOval( squareX + 2160, 35, 30, 30 );

			g.setColor( Color.RED );
			g.fillOval( squareX + 2160, 155, 30, 30 );
		}
		
      // Coluna 5
		if ( ( squareX + 2190 ) >= left_limit && ( squareX + 2190 ) <= right_limit ) {
			g.setColor( Color.RED );
			g.fillOval( squareX + 2190, 35, 30, 30 );

			g.setColor( Color.RED );
			g.fillOval( squareX + 2190, 155, 30, 30 );
		}
		
      // Coluna 6
		if ( ( squareX + 2220 ) >= left_limit && ( squareX + 2220 ) <= right_limit ) {
			g.setColor( Color.RED );
			g.fillOval( squareX + 2220, 35, 30, 30 );

			g.setColor( Color.RED );
			g.fillOval( squareX + 2220, 155, 30, 30 );
		}
		
		// Coluna 7
		if ( ( squareX + 2250 ) >= left_limit && ( squareX + 2250 ) <= right_limit ) {
			for ( int i = 65 ; i <= 275; i += 30 ) 
			{ 
				g.setColor( Color.RED );
				g.fillOval( squareX + 2250, i, 30, 30 );
			}
		}
		
      // Letra "N": Colunas 1 a 7
      
		// Coluna 1
		if ( ( squareX + 2310 ) >= left_limit && ( squareX + 2310 ) <= right_limit ) {
			for ( int i = 35 ; i <= 275; i += 30 ) 
			{ 
				g.setColor( Color.RED );
				g.fillOval( squareX + 2310, i, 30, 30 );
			}
		}
		
      // Coluna 2
		if ( ( squareX + 2340 ) >= left_limit && ( squareX + 2340 ) <= right_limit ) {
			g.setColor( Color.RED );
			g.fillOval( squareX + 2340, 95, 30, 30 );
		}

      // Coluna 3
		if ( ( squareX + 2370 ) >= left_limit && ( squareX + 2370 ) <= right_limit ) {
			g.setColor( Color.RED );
			g.fillOval( squareX + 2370, 125, 30, 30 );
		}

      // Coluna 4
		if ( ( squareX + 2400 ) >= left_limit && ( squareX + 2400 ) <= right_limit ) {
			g.setColor( Color.RED );
			g.fillOval( squareX + 2400, 155, 30, 30 );
		}
		
      // Coluna 5
		if ( ( squareX + 2430 ) >= left_limit && ( squareX + 2430 ) <= right_limit ) {
			g.setColor( Color.RED );
			g.fillOval( squareX + 2430, 185, 30, 30 );
		}

      // Coluna 6
		if ( ( squareX + 2460 ) >= left_limit && ( squareX + 2460 ) <= right_limit ) {
			g.setColor( Color.RED );
			g.fillOval( squareX + 2460, 215, 30, 30 );
		}

		// Coluna 7
		if ( ( squareX + 2490 ) >= left_limit && ( squareX + 2490 ) <= right_limit ) {
			for ( int i = 35 ; i <= 275; i += 30 ) 
			{ 
				g.setColor( Color.RED );
				g.fillOval( squareX + 2490, i, 30, 30 );
			}
		}

      // Primeiro ponto de Exclamação "!": Colunas 1 e 2
      
		// Coluna 1
		if ( ( squareX + 2580 ) >= left_limit && ( squareX + 2580 ) <= right_limit ) {
			for ( int i = 35 ; i <= 185; i += 30 ) 
			{ 
				g.setColor( Color.RED );
				g.fillOval( squareX + 2580, i, 30, 30 );
			}
		}

		if ( ( squareX + 2580 ) >= left_limit && ( squareX + 2580 ) <= right_limit ) {
			for ( int i = 245 ; i <= 275; i += 30 ) 
			{ 
				g.setColor( Color.RED );
				g.fillOval( squareX + 2580, i, 30, 30 );
			}
		}
		
		// Coluna 2
		if ( ( squareX + 2610 ) >= left_limit && ( squareX + 2610 ) <= right_limit ) {
			for ( int i = 35 ; i <= 185; i += 30 ) 
			{ 
				g.setColor( Color.RED );
				g.fillOval( squareX + 2610, i, 30, 30 );
			}
		}

		if ( ( squareX + 2610 ) >= left_limit && ( squareX + 2610 ) <= right_limit ) {
			for ( int i = 245 ; i <= 275; i += 30 ) 
			{ 
				g.setColor( Color.RED );
				g.fillOval( squareX + 2610, i, 30, 30 );
			}
		}
		
      // Segundo Ponto de Exclamação "!": Colunas 1 e 2
      
		// Coluna 1
		if ( ( squareX + 2670 ) >= left_limit && ( squareX + 2670 ) <= right_limit ) {
			for ( int i = 35 ; i <= 185; i += 30 ) 
			{ 
				g.setColor( Color.RED );
				g.fillOval( squareX + 2670, i, 30, 30 );
			}
		}

		if ( ( squareX + 2670 ) >= left_limit && ( squareX + 2670 ) <= right_limit ) {
			for ( int i = 245 ; i <= 275; i += 30 ) 
			{ 
				g.setColor( Color.RED );
				g.fillOval( squareX + 2670, i, 30, 30 );
			}
		}
		
		// Coluna 2
		if ( ( squareX + 2700 ) >= left_limit && ( squareX + 2700 ) <= right_limit ) {
			for ( int i = 35 ; i <= 185; i += 30 ) 
			{ 
				g.setColor( Color.RED );
				g.fillOval( squareX + 2700, i, 30, 30 );
			}
		}

		if ( ( squareX + 2700 ) >= left_limit && ( squareX + 2700 ) <= right_limit ) {
			for ( int i = 245 ; i <= 275; i += 30 ) 
			{ 
				g.setColor( Color.RED );
				g.fillOval( squareX + 2700, i, 30, 30 );
			}
		}
		
      // Terceiro Ponto de Exclamação "!": Colunas 1 e 2
      
		// Coluna 1
		if ( ( squareX + 2760 ) >= left_limit && ( squareX + 2760 ) <= right_limit ) {
			for ( int i = 35 ; i <= 185; i += 30 ) 
			{ 
				g.setColor( Color.RED );
				g.fillOval( squareX + 2760, i, 30, 30 );
			}
		}

		if ( ( squareX + 2760 ) >= left_limit && ( squareX + 2760 ) <= right_limit ) {
			for ( int i = 245 ; i <= 275; i += 30 ) 
			{ 
				g.setColor( Color.RED );
				g.fillOval( squareX + 2760, i, 30, 30 );
			}
		}
		
		// Coluna 2
		if ( ( squareX + 2790 ) >= left_limit && ( squareX + 2790 ) <= right_limit ) {
			for ( int i = 35 ; i <= 185; i += 30 ) 
			{ 
				g.setColor( Color.RED );
				g.fillOval( squareX + 2790, i, 30, 30 );
			}
		}

		if ( ( squareX + 2790 ) >= left_limit && ( squareX + 2790 ) <= right_limit ) {
			for ( int i = 245 ; i <= 275; i += 30 ) 
			{ 
				g.setColor( Color.RED );
				g.fillOval( squareX + 2790, i, 30, 30 );
			}
		}
		
   } // end method paintComponent
	
} // end class DisplayJPanel2