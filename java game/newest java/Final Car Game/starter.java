import pkg.*;
public class starter implements InputControl, InputKeyControl 
{
		
		static Car[] jefz;
		static happyFace joe;
		static Rectangle button;
		static Rectangle mouser;
		static boolean piggy;
        public static void main(String args[])
        {
		
			// following line is necessary for onMouseClick, don't change
			MouseController mC = new MouseController(Canvas.getInstance(),new starter());
			
			// please leave following line alone, necessary for keyboard input
			KeyController kC = new KeyController(Canvas.getInstance(),new starter());
			Text bob = new Text(700,332.5,"Click Here To Begin!");
			bob.setColor(Color.WHITE);
			bob.grow(150,75); 
			button = new Rectangle(500,275,450,150);
			button.setColor(Color.RED);
			
			Text bobt = new Text(700,332.5,"You Win! Click To Begin Level !");
						bobt.setColor(Color.BLUE);
						bobt.grow(250,75); 
			
			Text bobto = new Text(700,332.5,"You Lose! :( Try Not to Suck!");
			bobto.setColor(Color.BLUE);
			bobto.grow(250,75); 
			
			Text sup = new Text(70,10,"High Score: Level 8");
			//19
			sup.setColor(Color.RED);
			sup.grow(55,20); 
			sup.draw();
			
			Text sup2 = new Text(1110,10,"Your Current Score: Level 1");
			//27
			sup2.setColor(Color.BLUE);
			sup2.grow(78,20); 
			sup2.draw();
			int y =0;
			
			int nene = 1;
			//button = new Rectangle(500,275,450,150);
			//button.setColor(Color.WHITE);
			 
			
			Color nk = new Color(82,190,128);
			for (int xe=0; xe<=5; xe++)
			{
				Rectangle Jeff = new Rectangle(-1,110*xe,1404,110);
				Jeff.fill();
				if (xe%2 == 0)
				{
					Jeff.setColor(Color.BLACK);
					Jeff.draw();
				}
				else
				{
					
					Jeff.setColor(nk);
				}
			}
			joe = new happyFace(660,561);
			joe.fill();
			
			jefz = new Car[14];
			//int x = 0;
			double iy = 4.0;
			int scorer = 1;
			int tt=1;
			
			for(int i = 0; i<jefz.length; i++)
			{
				int p = (Canvas.rand(1350)-375);
				//int d =Canvas.rand(600);
				int pr = Canvas.rand(5);
				int d =Canvas.rand(255);
				int dt =Canvas.rand(255);
				int dty =Canvas.rand(255);
				Color ni = new Color(d,dt,dty);
				//int dr =Canvas.rand(6);
				//x = x+10;
				jefz[i] = new Car(p,(pr*110)+13.25, "vroom", ni);
				jefz[i].fill();
				jefz[i].setStep(iy);
			}
			button.fill(); bob.draw();
			while(!piggy)
			{
				
				Canvas.pause(1);
			}
			button.translate(-1500,-1500);
			bob.translate(-1500,-1500);
			piggy = false;
			while(true)
			{
				
				for(int lo =0; lo<jefz.length; lo++)
				{
					
					Canvas.pause(1);
					jefz[lo].translate(jefz[lo].getStep(),0);
					jefz[lo].drive();
					
					if(joe.getX() > 1400)
					{
						joe.translate(-1550,0);
					}
					
					if (joe.crash(jefz[lo]))
					{
						for(int ppp=0;ppp<jefz.length;ppp++)
						{
							jefz[ppp].setStep(0);
						}
						while (true)
						{
							int pl= 0;
							int qq=0;
							int du =Canvas.rand(255);
							int dtu =Canvas.rand(255);
							int dtyu =Canvas.rand(255);
							Color siz = new Color(du,dtu,dtyu);
							bobto.draw();
							bobto.setColor(siz);
							bobto.grow(8*pl,8*pl); 
							pl++;
							qq++;
							joe.grow(.5*qq,0.5*qq);
							
						}
					}
					
					
					if(joe.getY() < -50)
					{
						if (tt==1)
						{
							nene++;
							tt=2;
							button = new Rectangle(425,275,600,150);
							 bobt = new Text(700,332.5,"Click Here To Begin!");
							bobt.setColor(Color.BLUE);
							bobt.grow(250,75); 
						}
						
						
						//button.setColor(Color.WHITE);  
						button.fill();
						bobt.setText("You Win! Click To Begin Level "+ nene +" !");
						bobt.draw();
						jefz[lo].setStep(0);
						if (piggy)
						{
							for(int uy=0;uy<jefz.length;uy++)
							{
								jefz[uy].setStep(iy);
							}
							if (tt==2)
							{
								iy =iy+1.5;
								scorer ++;
								
								tt=1;
								joe.translate(0,800);
								button.translate(1550,1550);
								bobt.translate(1550,1550);
								//break;
								piggy=false;
								sup2.setText("Your Current Score: Level " + scorer);
							}
						}
					}
				}
			
				
			}
			
		}
		
		public void onMouseClick(double x, double y){
			// and/or here
			mouser = new Rectangle(x-12.5,y-35,10,10); //mouser.draw();
			if (button.contains(mouser))
			{
				piggy = true;
			}
			else
			{
				piggy = false;
			}
	
		}
		
		public void keyPress(String s)
		{
			
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
			
			
			// temp holds the enter character
			
			char done = (char)10;
			String temp = Character.toString(done);
			
		}
}
