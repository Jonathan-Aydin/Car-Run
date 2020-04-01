import pkg.*;
public class starter implements InputControl, InputKeyControl 
{
		
		static happyFace joe;
		static Ellipse jon;
        public static void main(String args[])
        {
		
			// following line is necessary for onMouseClick, don't change
			MouseController mC = new MouseController(Canvas.getInstance(),new starter());
			
			// please leave following line alone, necessary for keyboard input
			KeyController kC = new KeyController(Canvas.getInstance(),new starter());
			
			 joe = new happyFace(120,21);
			joe.fill();
			
			//jon = new Ellipse(120,21,50,50);
			//jon.fill();
			
			Car j = new Car(520,581);
			j.setStep(5);
			j.fill();
			while(true)
			{
				j.translate(j.getStep(),0);
				j.drive();
				Canvas.pause(10);
				if (joe.crash(j))
				{
					j.setStep(0);
				}
			}
			
		}
		
		public void onMouseClick(double x, double y){
			// and/or here
	
		}
		
		public void keyPress(String s)
		{
			// temp holds the enter character
			if(s.equals("w"))
			{
				joe.translate(0,-8);
			}
			if(s.equals("a"))
			{
				joe.translate(-8,0);
			}
			if(s.equals("s"))
			{
				joe.translate(0,8);
			}
			if(s.equals("d"))
			{
				joe.translate(8,0);
			}
			
			
			char done = (char)10;
			String temp = Character.toString(done);
			
		}
}
