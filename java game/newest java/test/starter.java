import pkg.*;
public class starter implements InputControl, InputKeyControl 
{
		
		
		public static void difficulty()
		{
			EasyReader input = new EasyReader();
			System.out.print("What difficulty would you like? Please type Easy or Hard: ");
			String in_put = input.readLine();
			
			if(in_put.equals("Easy"))
			{
				System.out.println("Easy Mode Activated");
			}
			
			else if(in_put.equals("Hard"))
			{
				System.out.println("Hard Mode Activated");
			}
			
			else
			{
				System.out.println("\n Error: '" + in_put + "' is not a difficulty option. \n");
				difficulty();
			}
		}
		
        public static void main(String args[])
        {
		
			// following line is necessary for onMouseClick, don't change
			MouseController mC = new MouseController(Canvas.getInstance(),new starter());
			
			// please leave following line alone, necessary for keyboard input
			KeyController kC = new KeyController(Canvas.getInstance(),new starter());
			
			System.out.println("Initializing...");
			difficulty();
			
			EasyReader jeff = new EasyReader("test.txt");
			int x = jeff.readInt();
			System.out.print("test value is: "+x);
			
			EasyWriter bobo = new EasyWriter("test.txt");
			EasyWriter bobo2 = new EasyWriter("test.txt");
			bobo2.print("11");
			bobo2.close();
			
			
			
			
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
