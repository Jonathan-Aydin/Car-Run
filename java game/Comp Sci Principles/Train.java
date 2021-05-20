import pkg.*;
import java.util.ArrayList;
import java.util.List;
public class Train 
{
	private Tractor maker;
	private Tractor makers;
	private Tractor makerss;
	private Tractor makersss;
	private Tractor makerssss;
	private Tractor makersssss;
	private Tractor makerssssss; 
	private Tractor makersssssss;
	private Tractor makerssssssss;
	private Tractor makersssssssss;
	private int counter;
	private Ellipse smoke;
	private Ellipse smoke2;
	private Ellipse smoke3;
	private List tractors;
	public Train(int x,int y)
	{

		maker = new Tractor(x,y);
		x=x+40;
		makers = new Tractor(x,y);
		x=x+40;
		makerss = new Tractor(x,y);
		x=x+40;
		makersss = new Tractor(x,y);
		x=x+40;
		makerssss = new Tractor(x,y);
		x=x+40;
		makersssss = new Tractor(x,y);
		x=x+40;
		makerssssss = new Tractor(x,y);
		x=x+40;
		makersssssss = new Tractor(x,y);
		x=x+40;
		makerssssssss = new Tractor(x,y);
		x=x+40;
		makersssssssss = new Tractor(x,y);
		smoke = new Ellipse(x+15,y-10,5,5);
		smoke.setColor(Color.LIGHT_GRAY);
		smoke.fill();
		smoke2 = new Ellipse(x,y-25,8,8);
		smoke2.setColor(Color.LIGHT_GRAY);
		smoke2.fill();
		smoke3 = new Ellipse(x+25,y-15,5,5);
		smoke3.setColor(Color.LIGHT_GRAY);
		smoke3.fill();
		// while (true)
		// {	
			// maker = new Tractor(x,y);
			// x=x+40;
			// if (maker.getX()>350)
			// {
				// break;
			// }
		// }
			// counter=0;
			// Tractor[] trains = new Tractor[9];
			// while (true)
			// {
				// x=x+40;
				// trains[counter] = new Tractor(x,y);
				// counter ++;
				// if (counter == trains.length)
				// {
					// break;
				// }
			// }		
	}
	public double getX()
			{
				return maker.getX();
			}
			public void translate(int xx, int yy)
			{
				maker.translate(xx,yy);
				makers.translate(xx,yy);
				makerss.translate(xx,yy);
				makersss.translate(xx,yy);
				makerssss.translate(xx,yy);
				makersssss.translate(xx,yy);
				makerssssss.translate(xx,yy);
				makersssssss.translate(xx,yy);
				makerssssssss.translate(xx,yy);
				makersssssssss.translate(xx,yy);
				smoke.translate(xx,yy);
				smoke2.translate(xx,yy);
				smoke3.translate(xx,yy);
				
			}
			
}

