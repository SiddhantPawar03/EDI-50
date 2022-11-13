import javax.swing.*;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import java.lang.Math;

public class PredictText extends JFrame implements KeyListener
{
	JPanel p = new JPanel();

	JTextArea dialog = new JTextArea(20,50);
	JTextArea input = new JTextArea(1,50);

	//Chat 
	
	String chatBot[][] = {
			//Greeting
			{"Hi", "How are you", "Is anyone there?", "Hello", "Good day", "Whats up", "how are ya", "heyy", "whatsup"},
			{"Hello!", "Good to see you again!", "Hi there, how can I help?"},
			//Goodbye
			{"cya", "see you", "bye bye", "See you later", "Goodbye", "I am Leaving", "Bye", "Have a Good day", "talk to you later", "tyyl", "i got to go", "gtg"},
			{"Sad to see you go :(", "Talk to you later", "Goodbye!","Come back soon"},
			//Creators
			{"what is the name of your developers", "what is the name of your creators", "what is the name of the developers", "what is the name of the creators", "who created you", "your developers", "your creators", "who are your developers", "developers", "you are made by", "you are made by whom", "who created you", "who create you", "creators", "who made you", "who designed you"},
			{"I was developed by team of smart people named Mandar, Maruti, Pavan, Siddhant under the guidance of GDB :)"},
			//Name
			{"name", "your name", "do you have a name", "what are you called", "what is your name", "what should I call you", "whats your name?", "what are you", "who are you", "who is this", "what am i chatting to", "who am i taking to", "what are you"},
			{"You can call me College Mitra.","I'm College Mitra","I'm College Mitra aka CMGDB's Chatbot."},
			//hours 
			{"timing of college", "what is college timing", "working days", "when are you guys open", "what are your hours", "hours of operation", "when is the college open", "college timing", "what about college timing", "is college open on saturday", "tell something about college timing", "what is the college  hours", "when should i come to college", "when should i attend college", "what is my college time", "college timing", "timing college"},
			{"College is open 9am-5pm Monday-Friday!"},
			//number
			{"more info", "contact info", "how to contact college", "college telephone number", "college number", "What is your contact no", "Contact number?", "how to call you", "College phone no?", "how can i contact you", "Can i get your phone number", "how can i call you", "phone number", "phone no", "call"},
			{"You can contact at +91-011-25318157"},
			//course
			{"list of courses", "list of courses offered", "list of courses offered in VIT", "what are the courses offered in your college?", "courses?", "courses offered", "courses offered in VIT", "courses you offer", "branches?", "courses available at VIT?", "branches available at VIT?", "what are the courses in VIT?", "what are branches in VIT?", "what are courses in VIT?", "branches available in VIT?", "can you tell me the courses available in VIT?", "can you tell me the branches available in VIT?", "Civil engineering?", "civil", "it", "IT"},
			{"VIT offers Computer Engineering, Information Technology, AI & DS, Instrumentation Engineering, Civil Engineering and Mechanical Engineering."},
			//fees
			{"information about fee", "information on fee", "tell me the fee", "college fee", "fee per semester", "what is the fee of each semester", "what is the fees of each year", "what is fee", "what is the fees", "how much is the fees", "fees for first year", "fees", "about the fees", "tell me something about the fees"},
			{"For Fee detail visit <a target=\"_blank\" href=\"https://www.vit.edu/admissions/fees-structure\"> here</a>"},
			//location
			{"where is the college located", "college is located at", "where is college", "where is college located", "address of college", "how to reach college", "college location", "college address", "wheres the college", "how can I reach college", "whats is the college address", "what is the address of college", "address", "location"},
			{"666, Upper Indiranagar, Bibwewadi,Pune, Maharashtra, INDIA - 411 037."},
			//hostel
			{"hostel facility", "hostel servive", "hostel location", "hostel address", "hostel facilities", "hostel fees", "Does college provide hostel", "Is there any hostel", "Where is hostel", "do you have hostel", "do you guys have hostel", "hostel", "hostel capacity", "what is the hostel fee", "how to get in hostel", "what is the hostel address", "how far is hostel from college", "hostel college distance", "where is the hostel", "how big is the hostel", "distance between college and hostel", "distance between hostel and college"},
			{"666, Upper Indiranagar, Bibwewadi,Pune, Maharashtra, INDIA - 411 037.", "Please find rooms else ..."},
			//event
			{"events organised", "list of events", "list of events organised in college", "list of events conducted in college", "What events are conducted in college", "Are there any event held at college", "Events?", "functions", "what are the events", "tell me about events", "what about events"},
			{"Please follow events via EPEC VIT Pune Social Media accounts."},
			//canteen
			{"food facilities", "canteen facilities", "canteen facility", "is there any canteen", "Is there a cafetaria in college", "Does college have canteen", "Where is canteen", "where is cafetaria", "canteen", "Cafetaria"},
			{"There are two major canteen facilities one being old one while other new one and NPB also in campus premises as well."},
			//placement
			{"What is college placement", "Which companies visit in college", "What is average package", "companies visit", "package", "placement", "recruitment", "companies"},
			{"Few placed in Microsoft forgetting friends :("},
			//college intake
			{"max number of students", "number of seats per branch", "number of seats in each branch", "maximum number of seats", "maximum students intake", "What is college intake", "how many stundent are taken in each branch", "seat allotment", "seats"},
			{"For CS, IT, 250 approx each branch, Civil and Mechanical 60 per branch", "Paisa deo admission leo."},
			//placement
			{"What is college placement", "Which companies visit in college", "What is average package", "companies visit", "package", "placement", "recruitment", "companies"},
			{"Few placed in Microsoft forgetting friends :("},
			//default
			{"Unable to understand."}
			
	};
	
	JScrollPane scroll = new JScrollPane(
		dialog,
		JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
		JScrollPane.HORIZONTAL_SCROLLBAR_NEVER
	);
	
	public static void main(String[] args)
	{
		new PredictText();
	}
	
	public PredictText()
	{
		super("Predicting Chat Bot");
		setSize(600,400);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		dialog.setEditable(false);
		
		input.addKeyListener(this);
		
		p.add(scroll);
		p.add(input);
		p.setBackground(new Color(255,200,0));
		add(p);
		
		setVisible(true);
		
		//input.setText(Integer.valueOf('a').toString());
	}

	public void keyPressed(KeyEvent arg0) 
	{
		// TODO Auto-generated method stub
		if(arg0.getKeyCode() == KeyEvent.VK_ENTER)
		{
			input.setEditable(false);
			
			//-----grab quote----------
			String quote = input.getText();
			input.setText("");
			addText("\n--> You:\t "+quote);
			quote = quote.trim();
			
			while(
					quote.charAt(quote.length()-1) == '!' ||
					quote.charAt(quote.length()-1) == '.' ||
					quote.charAt(quote.length()-1) == '?'					
				)
			{
				quote = quote.substring(0,quote.length()-1);
			}
			
			quote = quote.trim();
			
			byte response =0;
			/*
			0: searching
			1: did not find
			2: found
			3: found inside
			4: found something similar
			*/
			
			//-----check for matches---
			int j = 0; //Group in ChatBot String array that we are checking
			while(response == 0)
			{
				/*
				if(inArray(quote.toLowerCase(),chatBot[j*2]))
				{
						response = 2;
						
						int r = (int) Math.floor(Math.random() * chatBot[(j*2) + 1].length);
						addText("\n--> Biggol:\t " + chatBot[ (j*2) + 1 ][r] );
				}
				
				if(response != 2)
				{
					if(insideArray(quote,chatBot[j*2]))
					{
						response = 3;
						
						int r = (int) Math.floor(Math.random() * chatBot[(j*2) + 1].length);
						addText("\n--> Biggol:\t Hmm... - " + chatBot[ (j*2) + 1 ][r] );
					}
				}
				*/
				//check for similarity
				//if(response != 2 && response!=3)
				//{
					if(similarInArray(quote,chatBot[j*2]))
					{
						response = 4;
						
						int r = (int) Math.floor(Math.random() * chatBot[(j*2) + 1].length);
						addText("\n--> Biggol:\t If you mean... - "+ chatBot[j*2][r] + "..then.." + chatBot[ (j*2) + 1 ][r] );
					}
					else
					{
						response = 0;
					}
				//}
				
				if(response != 4)
				{
					if(insideArray(quote,chatBot[j*2]))
					{
						response = 3;
						
						int r = (int) Math.floor(Math.random() * chatBot[(j*2) + 1].length);
						addText("\n--> Biggol:\t Hmm... - " + chatBot[ (j*2) + 1 ][r] );
					}
				}
				j++;
				
				//if( j*2 == chatBot.length-1 && response != 2 && response!=3 && response!=4)
				if( j*2 == chatBot.length-1 && response!=4 && response!=3 )
				{
					response = 1;	
				}
				
				//addText("\n");
			}
			
			//-----default-------------
			if( response==1 )
			{
				int r = (int) Math.floor(Math.random() * chatBot[chatBot.length-1].length);
				addText("\n--> Biggol:\t " + chatBot[ chatBot.length-1 ][r] );
			}
		}
	}

	public void keyReleased(KeyEvent arg0) 
	{
		// TODO Auto-generated method stub
		if(arg0.getKeyCode() == KeyEvent.VK_ENTER)
		{
			input.setEditable(true);	
		}
	}

	public void keyTyped(KeyEvent arg0) 
	{
		// TODO Auto-generated method stub
		
	}

	public void addText(String str)
	{
		dialog.setText(dialog.getText()+str);
	}

	public boolean inArray(String in, String[] str)
	{
		boolean match = false;
		//length of array is contant so it is stored in variable length unlike for String object which is done using methof length()
		for(int i=0; i < str.length; i++)
		{
				if(str[i].equals(in))
				{
					match = true;
				}
		}
		
		return match;
	}
	
	public boolean insideArray(String in, String[] str)
	{
		boolean match = false;
		String inL = in.toLowerCase();
		String strL;
		
		//length of array is contant so it is stored in variable length unlike for String object which is done using methof length()
		for(int i=0; i < str.length; i++)
		{
			strL = str[i].toLowerCase();
				if(strL.contains(inL) || inL.contains(strL))
				{
					match = true;
				}
		}
		
		return match;
	}

	public boolean similarInArray(String in, String[] str)
	{
		boolean match = false;
		String inL = in.toLowerCase();
		String strL;
		
		for(int i=0; i < str.length; i++)
		{
			strL = str[i].toLowerCase();
			if(similarity(strL,inL) > 60)
			{
				match = true;
			}
			else
			{
				continue;
			}
		}
		
		return match;
	}
	
	public double similarity(String str1, String str2)
	{
		int i,c = 0;
		Double percentageSimilarity ;
		int len_min,len_max, len1 = str1.length();
		int len2 = str2.length();
		
		if(len1>len2)
		{
			len_min = len2;
			len_max = len1;
		}
		else
		{
			len_min = len1;
			len_max = len2;
		}
		
		/*
		boolean[] simFlag = new boolean[len_max];
		
		for(i=0;i<len_max;i++)
		{
			simFlag = false;
		}
		*/
		
		for(i=0;i<len_min;i++)
		{
			if(str1.charAt(i) == str2.charAt(i))
			{
			//	simFlag[i] = true;
				c++;
			}
			else
			{
			//	simFlag[i] = false;
			}
		}
		
		percentageSimilarity = (c*100.00)/len_max;
		
		//input.setText(str1+"--||||--"+str2+"--||||--"+"sim: "+percentageSimilarity.toString());
		return percentageSimilarity;
	}
}