import pkg.*;
public class starter implements InputControl, InputKeyControl 
{
		
		static happyFace joe;
        public static void main(String args[])
        {
		
			// following line is necessary for onMouseClick, don't change
			MouseController mC = new MouseController(Canvas.getInstance(),new starter());
			
			// please leave following line alone, necessary for keyboard input
			KeyController kC = new KeyController(Canvas.getInstance(),new starter());
			
			 joe = new happyFace(520,321);
			joe.fill();
			Car j = new Car(220,281,"pop");
			j.setStep(2);
			j.fill();
			while(true)
			{
				j.translate(j.getStep(),0);
				j.drive();
				Canvas.pause(10);
				if (joe.crash(j))
				{
					j.setStep(0);
					System.out.println("  CRASH!!  ");
					
				}
				System.out.println(" GG ");
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
			
			if(s.equals("wa"))
			{
				joe.translate(0,-8);
				joe.translate(-8,0);
			}
			
			
			char done = (char)10;
			String temp = Character.toString(done);
			
		}
}
