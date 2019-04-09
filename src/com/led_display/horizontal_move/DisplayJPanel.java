package com.led_display.horizontal_move;
// Display Animado.
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class DisplayJPanel extends JPanel 
{
   // draw rectangles and arcs
   public void paintComponent( Graphics g )
   {
      super.paintComponent( g ); // call superclass's paintComponent 
		
		// Desenhando o painel eletronico
		g.setColor( Color.BLACK );
		g.fillRect( 15, 35, 870, 180);

		// Coluna 1
		for ( int i = 35 ; i <= 185; i += 30 ) 
		{ 
			for ( int n = 1 ; n <= 6 ; n++ )
			{
				g.setColor( Color.RED );
				g.fillOval( 15, i, 30, 30 );
			}
		}
		
		// Coluna 29
		for ( int i = 35 ; i <= 185; i += 30 ) 
		{ 
			for ( int n = 1 ; n <= 6 ; n++ )
			{
				g.setColor( Color.RED );
				g.fillOval( 855, i, 30, 30 );
			}
		}
		
/*
      // Letra "H": Colunas 1 a 5
      
		// Coluna 1
		for ( int i = 35 ; i <= 185; i += 30 ) 
		{ 
			for ( int n = 1 ; n <= 6 ; n++ )
			{
				g.setColor( Color.RED );
				g.fillOval( 15, i, 30, 30 );
			}
		}
		
		// Coluna 2
		g.setColor( Color.BLACK );
		g.fillRect( 45, 35, 30, 30 );

		g.setColor( Color.BLACK );
		g.fillRect( 45, 65, 30, 30 );
		
		g.setColor( Color.BLACK );
		g.fillRect( 45, 95, 30, 30 );
		g.setColor( Color.RED );
		g.fillArc( 45, 95, 30, 30, 0, 360 );
		
		g.setColor( Color.BLACK );
		g.fillRect( 45, 125, 30, 30 );
		g.setColor( Color.RED );
		g.fillArc( 45, 125, 30, 30, 0, 360 );

		g.setColor( Color.BLACK );
		g.fillRect( 45, 155, 30, 30 );

		g.setColor( Color.BLACK );
		g.fillRect( 45, 185, 30, 30 );
		
      // Coluna 3
		g.setColor( Color.BLACK );
		g.fillRect( 75, 35, 30, 30 );

		g.setColor( Color.BLACK );
		g.fillRect( 75, 65, 30, 30 );
		
		g.setColor( Color.BLACK );
		g.fillRect( 75, 95, 30, 30 );
		g.setColor( Color.RED );
		g.fillArc( 75, 95, 30, 30, 0, 360 );
		
		g.setColor( Color.BLACK );
		g.fillRect( 75, 125, 30, 30 );
		g.setColor( Color.RED );
		g.fillArc( 75, 125, 30, 30, 0, 360 );

		g.setColor( Color.BLACK );
		g.fillRect( 75, 155, 30, 30 );

		g.setColor( Color.BLACK );
		g.fillRect( 75, 185, 30, 30 );

      // Coluna 4
		g.setColor( Color.BLACK );
		g.fillRect( 105, 35, 30, 30 );

		g.setColor( Color.BLACK );
		g.fillRect( 105, 65, 30, 30 );
		
		g.setColor( Color.BLACK );
		g.fillRect( 105, 95, 30, 30 );
		g.setColor( Color.RED );
		g.fillArc( 105, 95, 30, 30, 0, 360 );
		
		g.setColor( Color.BLACK );
		g.fillRect( 105, 125, 30, 30 );
		g.setColor( Color.RED );
		g.fillArc( 105, 125, 30, 30, 0, 360 );

		g.setColor( Color.BLACK );
		g.fillRect( 105, 155, 30, 30 );

		g.setColor( Color.BLACK );
		g.fillRect( 105, 185, 30, 30 );
		
      // Coluna 5
		for ( int i = 35 ; i <= 185; i += 30 ) 
		{ 
			for ( int n = 1 ; n <= 6 ; n++ )
			{
				g.setColor( Color.BLACK );
				g.fillRect( 135, i, 30, 30 );
				g.setColor( Color.RED );
				g.fillArc( 135, i, 30, 30, 0, 360 );
			}
		}
		
      // Coluna 6
		for ( int i = 35 ; i <= 185; i += 30 ) 
		{ 
			for ( int n = 1 ; n <= 6 ; n++ )
			{
				g.setColor( Color.BLACK );
				g.fillRect( 165, i, 30, 30 );
			}
		}
		
		// Letra "E": Colunas 7 a 11
		
		// Coluna 7
		for ( int i = 35 ; i <= 185; i += 30 ) 
		{ 
			for ( int n = 1 ; n <= 6 ; n++ )
			{
				g.setColor( Color.BLACK );
				g.fillRect( 195, i, 30, 30 );
				g.setColor( Color.RED );
				g.fillArc( 195, i, 30, 30, 0, 360 );
			}
		}

		// Coluna 8
		g.setColor( Color.BLACK );
		g.fillRect( 225, 35, 30, 30 );
		g.setColor( Color.RED );
		g.fillArc( 225, 35, 30, 30, 0, 360 );
		
		g.setColor( Color.BLACK );
		g.fillRect( 225, 65, 30, 30 );
		
		g.setColor( Color.BLACK );
		g.fillRect( 225, 95, 30, 30 );
		g.setColor( Color.RED );
		g.fillArc( 225, 95, 30, 30, 0, 360 );

		g.setColor( Color.BLACK );
		g.fillRect( 225, 125, 30, 30 );
		g.setColor( Color.RED );
		g.fillArc( 225, 125, 30, 30, 0, 360 );
		
		g.setColor( Color.BLACK );
		g.fillRect( 225, 155, 30, 30 );

		g.setColor( Color.BLACK );
		g.fillRect( 225, 185, 30, 30 );
		g.setColor( Color.RED );
		g.fillArc( 225, 185, 30, 30, 0, 360 );

		
      // Coluna 9
		g.setColor( Color.BLACK );
		g.fillRect( 255, 35, 30, 30 );
		g.setColor( Color.RED );
		g.fillArc( 255, 35, 30, 30, 0, 360 );
		
		g.setColor( Color.BLACK );
		g.fillRect( 255, 65, 30, 30 );
		
		g.setColor( Color.BLACK );
		g.fillRect( 255, 95, 30, 30 );
		g.setColor( Color.RED );
		g.fillArc( 255, 95, 30, 30, 0, 360 );

		g.setColor( Color.BLACK );
		g.fillRect( 255, 125, 30, 30 );
		g.setColor( Color.RED );
		g.fillArc( 255, 125, 30, 30, 0, 360 );
		
		g.setColor( Color.BLACK );
		g.fillRect( 255, 155, 30, 30 );

		g.setColor( Color.BLACK );
		g.fillRect( 255, 185, 30, 30 );
		g.setColor( Color.RED );
		g.fillArc( 255, 185, 30, 30, 0, 360 );

      // Coluna 10
		g.setColor( Color.BLACK );
		g.fillRect( 285, 35, 30, 30 );
		g.setColor( Color.RED );
		g.fillArc( 285, 35, 30, 30, 0, 360 );
		
		g.setColor( Color.BLACK );
		g.fillRect( 285, 65, 30, 30 );
		
		g.setColor( Color.BLACK );
		g.fillRect( 285, 95, 30, 30 );
		g.setColor( Color.RED );
		g.fillArc( 285, 95, 30, 30, 0, 360 );

		g.setColor( Color.BLACK );
		g.fillRect( 285, 125, 30, 30 );
		g.setColor( Color.RED );
		g.fillArc( 285, 125, 30, 30, 0, 360 );
		
		g.setColor( Color.BLACK );
		g.fillRect( 285, 155, 30, 30 );

		g.setColor( Color.BLACK );
		g.fillRect( 285, 185, 30, 30 );
		g.setColor( Color.RED );
		g.fillArc( 285, 185, 30, 30, 0, 360 );

      // Coluna 11
		g.setColor( Color.BLACK );
		g.fillRect( 315, 35, 30, 30 );
		g.setColor( Color.RED );
		g.fillArc( 315, 35, 30, 30, 0, 360 );
		
		for ( int i = 65 ; i <= 155; i += 30 ) 
		{ 
			for ( int n = 1 ; n <= 4 ; n++ )
			{
				g.setColor( Color.BLACK );
				g.fillRect( 315, i, 30, 30 );
			}
		}

		g.setColor( Color.BLACK );
		g.fillRect( 315, 185, 30, 30 );
		g.setColor( Color.RED );
		g.fillArc( 315, 185, 30, 30, 0, 360 );
		
      // Coluna 12
		for ( int i = 35 ; i <= 185; i += 30 ) 
		{ 
			for ( int n = 1 ; n <= 6 ; n++ )
			{
				g.setColor( Color.BLACK );
				g.fillRect( 345, i, 30, 30 );
			}
		}

		// Letra "L": Colunas 13 a 17
		
		// Coluna 13
		for ( int i = 35 ; i <= 185; i += 30 ) 
		{ 
			for ( int n = 1 ; n <= 6 ; n++ )
			{
				g.setColor( Color.BLACK );
				g.fillRect( 375, i, 30, 30 );
				g.setColor( Color.RED );
				g.fillArc( 375, i, 30, 30, 0, 360 );
			}
		}

		// Coluna 14
		for ( int i = 35 ; i <= 155; i += 30 ) 
		{ 
			for ( int n = 1 ; n <= 5 ; n++ )
			{
				g.setColor( Color.BLACK );
				g.fillRect( 405, i, 30, 30 );
			}
		}

		g.setColor( Color.BLACK );
		g.fillRect( 405, 185, 30, 30 );
		g.setColor( Color.RED );
		g.fillArc( 405, 185, 30, 30, 0, 360 );
				
      // Coluna 15
		for ( int i = 35 ; i <= 155; i += 30 ) 
		{ 
			for ( int n = 1 ; n <= 5 ; n++ )
			{
				g.setColor( Color.BLACK );
				g.fillRect( 435, i, 30, 30 );
			}
		}

		g.setColor( Color.BLACK );
		g.fillRect( 435, 185, 30, 30 );
		g.setColor( Color.RED );
		g.fillArc( 435, 185, 30, 30, 0, 360 );
		
		// Coluna 16
		for ( int i = 35 ; i <= 155; i += 30 ) 
		{ 
			for ( int n = 1 ; n <= 5 ; n++ )
			{
				g.setColor( Color.BLACK );
				g.fillRect( 465, i, 30, 30 );
			}
		}

		g.setColor( Color.BLACK );
		g.fillRect( 465, 185, 30, 30 );
		g.setColor( Color.RED );
		g.fillArc( 465, 185, 30, 30, 0, 360 );
				
      // Coluna 17
		for ( int i = 35 ; i <= 155; i += 30 ) 
		{ 
			for ( int n = 1 ; n <= 5 ; n++ )
			{
				g.setColor( Color.BLACK );
				g.fillRect( 495, i, 30, 30 );
			}
		}

		g.setColor( Color.BLACK );
		g.fillRect( 495, 185, 30, 30 );
		g.setColor( Color.RED );
		g.fillArc( 495, 185, 30, 30, 0, 360 );
				
		// Coluna 18
		for ( int i = 35 ; i <= 185; i += 30 ) 
		{ 
			for ( int n = 1 ; n <= 6 ; n++ )
			{
				g.setColor( Color.BLACK );
				g.fillRect( 525, i, 30, 30 );
			}
		}

		// Letra "L": Colunas 19 a 23

		// Coluna 19
		for ( int i = 35 ; i <= 185; i += 30 ) 
		{ 
			for ( int n = 1 ; n <= 6 ; n++ )
			{
				g.setColor( Color.BLACK );
				g.fillRect( 555, i, 30, 30 );
				g.setColor( Color.RED );
				g.fillArc( 555, i, 30, 30, 0, 360 );
			}
		}
				
		// Coluna 20
		for ( int i = 35 ; i <= 155; i += 30 ) 
		{ 
			for ( int n = 1 ; n <= 5 ; n++ )
			{
				g.setColor( Color.BLACK );
				g.fillRect( 585, i, 30, 30 );
			}
		}

		g.setColor( Color.BLACK );
		g.fillRect( 585, 185, 30, 30 );
		g.setColor( Color.RED );
		g.fillArc( 585, 185, 30, 30, 0, 360 );
		
      // Coluna 21
		for ( int i = 35 ; i <= 155; i += 30 ) 
		{ 
			for ( int n = 1 ; n <= 5 ; n++ )
			{
				g.setColor( Color.BLACK );
				g.fillRect( 615, i, 30, 30 );
			}
		}

		g.setColor( Color.BLACK );
		g.fillRect( 615, 185, 30, 30 );
		g.setColor( Color.RED );
		g.fillArc( 615, 185, 30, 30, 0, 360 );

      // Coluna 22
		for ( int i = 35 ; i <= 155; i += 30 ) 
		{ 
			for ( int n = 1 ; n <= 5 ; n++ )
			{
				g.setColor( Color.BLACK );
				g.fillRect( 645, i, 30, 30 );
			}
		}

		g.setColor( Color.BLACK );
		g.fillRect( 645, 185, 30, 30 );
		g.setColor( Color.RED );
		g.fillArc( 645, 185, 30, 30, 0, 360 );
		
      // Coluna 23
		for ( int i = 35 ; i <= 155; i += 30 ) 
		{ 
			for ( int n = 1 ; n <= 5 ; n++ )
			{
				g.setColor( Color.BLACK );
				g.fillRect( 675, i, 30, 30 );
			}
		}

		g.setColor( Color.BLACK );
		g.fillRect( 675, 185, 30, 30 );
		g.setColor( Color.RED );
		g.fillArc( 675, 185, 30, 30, 0, 360 );
		
      // Coluna 24
		for ( int i = 35 ; i <= 185; i += 30 ) 
		{ 
			for ( int n = 1 ; n <= 6 ; n++ )
			{
				g.setColor( Color.BLACK );
				g.fillRect( 705, i, 30, 30 );
			}
		}

		// Letra "O": Colunas 25 a 29
		
		// Coluna 25
		for ( int i = 35 ; i <= 185; i += 30 ) 
		{ 
			for ( int n = 1 ; n <= 6 ; n++ )
			{
				g.setColor( Color.BLACK );
				g.fillRect( 735, i, 30, 30 );
				g.setColor( Color.RED );
				g.fillArc( 735, i, 30, 30, 0, 360 );
			}
		}

		// Coluna 26
		g.setColor( Color.BLACK );
		g.fillRect( 765, 35, 30, 30 );
		g.setColor( Color.RED );
		g.fillArc( 765, 35, 30, 30, 0, 360 );
		
		for ( int i = 65 ; i <= 155; i += 30 ) 
		{ 
			for ( int n = 1 ; n <= 4 ; n++ )
			{
				g.setColor( Color.BLACK );
				g.fillRect( 765, i, 30, 30 );
			}
		}

		g.setColor( Color.BLACK );
		g.fillRect( 765, 185, 30, 30 );
		g.setColor( Color.RED );
		g.fillArc( 765, 185, 30, 30, 0, 360 );
		
      // Coluna 27
		g.setColor( Color.BLACK );
		g.fillRect( 795, 35, 30, 30 );
		g.setColor( Color.RED );
		g.fillArc( 795, 35, 30, 30, 0, 360 );
		
		for ( int i = 65 ; i <= 155; i += 30 ) 
		{ 
			for ( int n = 1 ; n <= 4 ; n++ )
			{
				g.setColor( Color.BLACK );
				g.fillRect( 795, i, 30, 30 );
			}
		}

		g.setColor( Color.BLACK );
		g.fillRect( 795, 185, 30, 30 );
		g.setColor( Color.RED );
		g.fillArc( 795, 185, 30, 30, 0, 360 );

      // Coluna 28
		g.setColor( Color.BLACK );
		g.fillRect( 825, 35, 30, 30 );
		g.setColor( Color.RED );
		g.fillArc( 825, 35, 30, 30, 0, 360 );
		
		for ( int i = 65 ; i <= 155; i += 30 ) 
		{ 
			for ( int n = 1 ; n <= 4 ; n++ )
			{
				g.setColor( Color.BLACK );
				g.fillRect( 825, i, 30, 30 );
			}
		}

		g.setColor( Color.BLACK );
		g.fillRect( 825, 185, 30, 30 );
		g.setColor( Color.RED );
		g.fillArc( 825, 185, 30, 30, 0, 360 );
		
      // Coluna 29
		for ( int i = 35 ; i <= 185; i += 30 ) 
		{ 
			for ( int n = 1 ; n <= 6 ; n++ )
			{
				g.setColor( Color.BLACK );
				g.fillRect( 855, i, 30, 30 );
				g.setColor( Color.RED );
				//g.fillArc( 855, i, 30, 30, 0, 360 );
				g.fillOval( 855, i, 30, 30 );
			}
		}
*/		
   } // end method paintComponent
} // end class DisplayJPanel