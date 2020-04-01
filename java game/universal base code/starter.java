import pkg.*;
public class starter implements InputControl, InputKeyControl 
{
		
		static Car[] jefz;
        public static void main(String args[])
        {
		
			// following line is necessary for onMouseClick, don't change
			MouseController mC = new MouseController(Canvas.getInstance(),new starter());
			
			// please leave following line alone, necessary for keyboard input
			KeyController kC = new KeyController(Canvas.getInstance(),new starter());
			Color nk = new Color(82,190,128);
			for (int x=0; x<=5; x++)
			{
				Rectangle Jeff = new Rectangle(-1,110*x,602,110);
				Jeff.fill();
				if (x%2 == 0)
				{
					Jeff.setColor(nk);
				}
				else
				{
					Jeff.setColor(Color.WHITE);
					Jeff.draw();
				}
			}
			jefz = new Car[100];
			//int x = 0;
			
			for(int i = 0; i<jefz.length; i++)
			{
				int p = (Canvas.rand(2500)-2500);
				//int d =Canvas.rand(600);
				int pr = Canvas.rand(6);
				int d =Canvas.rand(255);
				int dt =Canvas.rand(255);
				int dty =Canvas.rand(255);
				Color ni = new Color(d,dt,dty);
				//int dr =Canvas.rand(6);
				//x = x+10;
				jefz[i] = new Car(p,(pr*110)+13.25, ""+i, ni);
				jefz[i].fill();
			}
			
			int lo=0;
			while(true)
			{
				
				for(lo =0; lo<jefz.length; lo++)
				{
					jefz[lo].setStep(1);
					Canvas.pause(1);
					jefz[lo].translate(1,0);
					jefz[lo].drive();
					
				}
				lo=0;
				
			}
			
		}
		
		public void onMouseClick(double x, double y){
			// and/or here
	
		}
		
		public void keyPress(String s)
		{
			// temp holds the enter character
			
			char done = (char)10;
			String temp = Character.toString(done);
			
		}
}
