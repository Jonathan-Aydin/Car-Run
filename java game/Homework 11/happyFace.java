import pkg.*;
public class happyFace
{
	private static Ellipse jo;
	private static Ellipse eyer;
	private static Ellipse eyer2;
	private static Ellipse mouth;
	private static Rectangle screen;
	private double x;
	private double y;
	
	public happyFace(double x, double y)
    {
		//x=20
		//y=20
			jo = new Ellipse(x,y,300,300); 
			
			  
			 eyer = new Ellipse(x+80,y+55,50,50); 
			
			
			 eyer2 = new Ellipse(x+180,y+55,50,50); 
			
			
			 mouth = new Ellipse(x+102,y+130,100,100);
			
			
			 screen = new Rectangle(x+102,y+130,100,50);
			
		
	}
	public void fill()
	{
		jo.setColor(Color.YELLOW);
			jo.fill();
		eyer.setColor(Color.GREEN);
			eyer.fill();
		eyer2.setColor(Color.MAGENTA);
			eyer2.fill();
		mouth.setColor(Color.WHITE);
			mouth.fill();
		screen.setColor(Color.YELLOW);
			screen.fill();
	}
	public int getX()
	{
		return jo.getX();
	}
	
	public int getY()
	{
		return jo.getY();
	}
	public int getHeight()
	{
		return jo.getHeight();
	}
	
	public int getWidth()
	{
		return jo.getWidth();
	}
	public void translate(double xx, double yy)
	{
		jo.translate(xx,yy);
		eyer.translate(xx,yy);
		eyer2.translate(xx,yy);
		mouth.translate(xx,yy);
		screen.translate(xx,yy);
	}
	public boolean crash(Car a)
	{
		if(x < a.getX() + a.getWidth() && x + 300 > a.getX() && y < a.getY() + a.getHeight() && y + 300 > a.getY())
		{ 
			return true;
		}
		return false;
	}
	
}