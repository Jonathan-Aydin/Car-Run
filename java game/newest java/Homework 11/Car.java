import pkg.*;

public class Car
{
		private   Rectangle Bound;
		private   Rectangle Bod;
		private   Line window;
		private   Ellipse Bump;
		private   Ellipse Bump2;
		private   Ellipse roof;
		private   Ellipse tire;
		private   Ellipse tire2;
		private   Ellipse wheel;
		private   Ellipse wheel2;
		private   Line spoke;
		private   Line spoke2;
		private   Line spoke3;
		private   Line spoke4;
		private   Line spoke5;
		private   Line spoke6;
		private   Line spoke7;
		private   Line spoke8;
		private   int x;
		private   int y;
		private   Text word;
		private   Color po;
		private  Color o;
		//private   int u=0;
		
		public Car()
       {
		   
			word = new Text(0,0,"");
			po = new Color(255,0,0);
			roof = new Ellipse(37,4,105,65);
			roof.setColor(Color.RED);
			roof.draw();
			
			tire = new Ellipse(35,55,35,35);
			tire.fill();
			
			tire2 = new Ellipse(95,55,35,35);
			tire2.fill();
			
			wheel = new Ellipse(42,62,20,20);
			wheel.setColor(Color.WHITE);
			wheel.fill();
			
			wheel2 = new Ellipse(102,62,20,20);
			wheel2.setColor(Color.WHITE);
			wheel2.fill();
			
			spoke = new Line(52.5,62,52.5,90);
			spoke.draw();
			spoke2 = new Line(35,72,70,72);
			spoke2.draw();
			spoke3 = new Line(42,62,62,82);
			spoke3.draw();
			spoke4 = new Line(62,62,42,82);
			spoke4.draw();
			
			
			spoke5 = new Line(112,62,112,82);
			spoke5.draw();
			
			spoke6 = new Line(102,72,122,72);
			spoke6.draw();
			
			spoke7 = new Line(102,62,122,82);
			spoke7.draw();
			
			spoke8 = new Line(122,62,102,82);
			spoke8.draw();
		   
		   
		   
		   Bod = new Rectangle(30,40,105,30);
			Bod.setColor(Color.RED);
			Bod.fill();
			
			Bump = new Ellipse(15,39,30,30);
			Bump.setColor(Color.RED);
			Bump.fill();
			
			Bump2 = new Ellipse(120,39,30,30);
			Bump2.setColor(Color.RED);
			Bump2.fill();
	   }
	
	public Car(double ex, double ey)
    {
		//ex =15;
		//ey= 4;
		
		word = new Text(0,0,"");
					po = new Color(255,0,0);
			Bound = new Rectangle(ex,ey,135,83.5);
			
			Bod = new Rectangle(ex+15,ey+36,105,30);
			
			
			Bump = new Ellipse(ex,ey+35,30,30);
			
			
			Bump2 = new Ellipse(ex + 105,ey+35,30,30);
			
			
			roof = new Ellipse(ex+10,ey,105,65);
			//roof = new Ellipse(ex+22,ey,105,65);
			
			
			tire = new Ellipse(ex+20,ey+51,35,35);
			
			
			tire2 = new Ellipse(ex+80,ey+51,35,35);
			
			
			wheel = new Ellipse(ex+27,ey+58,20,20);
			
			//ex =15;
		//ey= 4;
			wheel2 = new Ellipse(ex+87,ey+58,20,20);
			
			
			spoke = new Line(ex+37.5,ey + 58,ex +37.5,ey+86);
			
			spoke2 = new Line(ex+20,ey+68,ex+55,ey+68);
			
			spoke3 = new Line(ex+27,ey+58,ex+47,ey+78);
			
			spoke4 = new Line(ex+47,ey+58,ex+27,ey+78);
			
			// spoke = new Line(52.5,62,52.5,90);
			// spoke.draw();
			// spoke2 = new Line(35,72,70,72);
			// spoke2.draw();
			// spoke3 = new Line(42,62,62,82);
			// spoke3.draw();
			// spoke4 = new Line(62,62,42,82);
			// spoke4.draw();
			//ex =15;
		//ey= 4;
			
			spoke5 = new Line(ex+97,ey+58,ex+97,ey+78);
			
			
			spoke6 = new Line(ex+87,ey+68,ex+107,ey+68);
			
			
			spoke7 = new Line(ex+87,ey+58,ex+107,ey+78);
			
			
			spoke8 = new Line(ex+107,ey+58,ex+87,ey+78);
			
    }
	
	
	public Car(double xx, double yy, String pepe)
    {
		//xx =15;
		this(xx,yy);
		//yy= 4;
		
		
			//Bound = new Rectangle(xx,yy,135,83.5);
			
			//Bod = new Rectangle(xx+15,yy+36,105,30);
			word = new Text(xx+55,yy+46,""+pepe);
			
			
			
			// Bump = new Ellipse(xx,yy+35,30,30);
			
			
			// Bump2 = new Ellipse(xx + 105,yy+35,30,30);
			
			
			// roof = new Ellipse(xx+10,yy,105,65);
			////roof = new Ellipse(ex+22,ey,105,65);
			
			
			// tire = new Ellipse(xx+20,yy+51,35,35);
			
			
			// tire2 = new Ellipse(xx+80,yy+51,35,35);
			
			
			// wheel = new Ellipse(xx+27,yy+58,20,20);
			
		//	// ex =15;
		//// ey= 4;
			// wheel2 = new Ellipse(xx+87,yy+58,20,20);
			
			
			// spoke = new Line(xx+37.5,yy + 58,xx +37.5,yy+86);
			
			// spoke2 = new Line(xx+20,yy+68,xx+55,yy+68);
			
			// spoke3 = new Line(xx+27,yy+58,xx+47,yy+78);
			
			// spoke4 = new Line(xx+47,yy+58,xx+27,yy+78);
			
			//// spoke = new Line(52.5,62,52.5,90);
			//// spoke.draw();
			//// spoke2 = new Line(35,72,70,72);
			//// spoke2.draw();
			//// spoke3 = new Line(42,62,62,82);
			//// spoke3.draw();
			//// spoke4 = new Line(62,62,42,82);
			//// spoke4.draw();
			//// ex =15;
		//// ey= 4;
			
			// spoke5 = new Line(xx+97,yy+58,xx+97,yy+78);
			
			
			// spoke6 = new Line(xx+87,yy+68,xx+107,yy+68);
			
			
			// spoke7 = new Line(xx+87,yy+58,xx+107,yy+78);
			
			
			// spoke8 = new Line(xx+107,yy+58,xx+87,yy+78);
			
    }
	public Car(double xxx, double yyy, String pepe, Color o)
    {
		//xx =15;
		this(xxx,yyy, pepe);
		po=o;
		Bod.setColor(po);
		Bump.setColor(po);
		Bump2.setColor(po);
		roof.setColor(po);
		po =o;
	}
	
	public void fill()
	{
		
		word.setColor(Color.WHITE);
		Bod.setColor(po);
			Bod.fill();
			Bound.draw();
			Bump.setColor(po);
			Bump.fill();
			Bump2.setColor(po);
			Bump2.fill();
			roof.setColor(po);
			roof.draw();
			tire.fill();
			tire2.fill();
			wheel.setColor(Color.WHITE);
			wheel.fill();
			wheel2.setColor(Color.WHITE);
			wheel2.fill();
			spoke.draw();
			spoke2.draw();
			spoke3.draw();
			spoke4.draw();
			spoke5.draw();
			spoke6.draw();
			spoke7.draw();
			spoke8.draw();
			
			word.grow(25,15);
			word.draw();
	}
	
	
	
	public int getX()
	{
		return Bound.getX();
	}
	
	public int getY()
	{
		return Bound.getY();
	}
	public int getWidth()
	{
		return Bound.getWidth();
	}
	
	public int getHeight()
	{
		return Bound.getHeight();
	}

	
	public void translate(double x, double y)
	{
		word.translate(x,y);
			Bod.translate(x,y);
			Bound.translate(x,y);
		  Bump.translate(x,y);
		 Bump2.translate(x,y);
		 roof.translate(x,y);
		  tire.translate(x,y);
		  tire2.translate(x,y);
		  wheel.translate(x,y);
		  wheel2.translate(x,y);
		 spoke.translate(x,y);
		 spoke2.translate(x,y);
		  spoke3.translate(x,y);
		 spoke4.translate(x,y);
		  spoke5.translate(x,y);
		  spoke6.translate(x,y);
		  spoke7.translate(x,y);
		 spoke8.translate(x,y);
	
		}
	public int getStep()
	{
		return x;
	}
	public void setStep(int st)
	{
		x = st;
	}
	
	public void drive()
	{
		
		if(Bump.getX() > 600)
		
		{
				word.translate(-750,0);
			Bod.translate(-750,0);
			Bound.translate(-750,0);
		  Bump.translate(-750,0);
		 Bump2.translate(-750,0);
		 roof.translate(-750,0);
		  tire.translate(-750,0);
		 tire2.translate(-750,0);
		  wheel.translate(-750,0);
		  wheel2.translate(-750,0);
		 spoke.translate(-750,0);
		 spoke2.translate(-750,0);
		  spoke3.translate(-750,0);
		 spoke4.translate(-750,0);
		  spoke5.translate(-750,0);
		 spoke6.translate(-750,0);
		  spoke7.translate(-750,0);
		 spoke8.translate(-750,0);
		 // if (Bound.getY()>=600)
		 // {
			 Bod.translate(0,110);
			Bound.translate(0,110);
		  Bump.translate(0,110);
		 Bump2.translate(0,110);
		 roof.translate(0,110);
		  tire.translate(0,110);
		tire2.translate(0,110);
		  wheel.translate(0,110);
		  wheel2.translate(0,110);
		 spoke.translate(0,110);
		 spoke2.translate(0,110);
		  spoke3.translate(0,110);
		 spoke4.translate(0,110);
		  spoke5.translate(0,110);
		  spoke6.translate(0,110);
		  spoke7.translate(0,110);
		 spoke8.translate(0,110);
		 word.translate(0,110);
		 }
		 if (Bound.getY()>=600)
		 {
			 Bod.translate(0,-660);
			Bound.translate(0,-660);
		  Bump.translate(0,-660);
		 Bump2.translate(0,-660);
		 roof.translate(0,-660);
		  tire.translate(0,-660);
		  tire2.translate(0,-660);
		  wheel.translate(0,-660);
		  wheel2.translate(0,-660);
		 spoke.translate(0,-660);
		 spoke2.translate(0,-660);
		  spoke3.translate(0,-660);
		 spoke4.translate(0,-660);
		  spoke5.translate(0,-660);
		  spoke6.translate(0,-660);
		  spoke7.translate(0,-660);
		 spoke8.translate(0,-660);
		 word.translate(0,-660);
		 }
		 
		//}
		
	}
	
}