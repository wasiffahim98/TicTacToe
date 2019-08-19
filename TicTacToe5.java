//Name: Wasif Fahim
//ID: 20291138


import java.util.Scanner;
public class TicTacToe5 {
	
	public static char[][] board = new char[3][3];
	
	public static void main(String[] args){
	
		
		
		
		 for(int i = 0; i<3; i++)
				for(int j=0; j<3; j++ )
					board[i][j] = ' ';
		 
		 
		 
		print(); 
	
	//=====================================================================================
	char player;
	player = getPlayer();
	
	//Declare string variable for User Input comparison	
	String s1 = "A1";
	String s2 = "A2";
	String s3 = "A3";
	String s4 = "B1";
	String s5 = "B2";
	String s6 = "B3";
	String s7 = "C1";
	String s8 = "C2";
	String s9 = "C3"; 
	String s;
	
	String s11 = "a1";
	String s12 = "a2";
	String s13 = "a3";
	String s14 = "b1";
	String s15 = "b2";
	String s16 = "b3";
	String s17 = "c1";
	String s18 = "c2";
	String s19 = "c3";
	
	String s21 = "1A";
	String s22 = "2A";
	String s23 = "3A";
	String s24 = "1B";
	String s25 = "2B";
	String s26 = "3B";
	String s27 = "1C";
	String s28 = "2C";
	String s29 = "3C";
	
	String s31 = "1a";
	String s32 = "2a";
	String s33 = "3a";
	String s34 = "1b";
	String s35 = "2b";
	String s36 = "3b";
	String s37 = "1c";
	String s38 = "2c";
	String s39 = "3c";
	
	
	
	
	int k = 0;
	boolean game = true;
	boolean invalidInput = false;
	
	//Game initializes
	do{
	if(player == 'X')    //Player X move
	{	
	System.out.println("You are player X! Type in grid coordinate (Ex. A1, a1, 1A, 1a): ");	
	Scanner input = new Scanner(System.in);
	
	//Player input making move
	do{
		invalidInput = false;
		s = input.next();
	
	if(s1.equals(s)&&(board [0][0] !='X' && board [0][0] !='O'))
		board [0][0] = 'X';
	else if(s2.equals(s)&&(board [0][1] !='X' && board [0][1] !='O'))
		board [0][1] = 'X';
	else if(s3.equals(s)&&(board [0][2] !='X' && board [0][2] !='O'))
		board [0][2] = 'X';
	else if(s4.equals(s)&&(board [1][0] !='X' && board [1][0] !='O'))
		board [1][0] = 'X';
	else if(s5.equals(s)&&(board [1][1] !='X' && board [1][1] !='O'))
		board [1][1] = 'X';
	else if(s6.equals(s)&&(board [1][2] !='X' && board [1][2] !='O'))
		board [1][2] = 'X';
	else if(s7.equals(s)&&(board [2][0] !='X' && board [2][0] !='O'))
		board [2][0] = 'X';
	else if(s8.equals(s)&&(board [2][1] !='X' && board [2][1] !='O'))
		board [2][1] = 'X';
	else if(s9.equals(s)&&(board [2][2] !='X' && board [2][2] !='O'))
		board [2][2] = 'X';
	
	else if(s11.equals(s)&&(board [0][0] !='X' && board [0][0] !='O'))
		board [0][0] = 'X';
	else if(s12.equals(s)&&(board [0][1] !='X' && board [0][1] !='O'))
		board [0][1] = 'X';
	else if(s13.equals(s)&&(board [0][2] !='X' && board [0][2] !='O'))
		board [0][2] = 'X';
	else if(s14.equals(s)&&(board [1][0] !='X' && board [1][0] !='O'))
		board [1][0] = 'X';
	else if(s15.equals(s)&&(board [1][1] !='X' && board [1][1] !='O'))
		board [1][1] = 'X';
	else if(s16.equals(s)&&(board [1][2] !='X' && board [1][2] !='O'))
		board [1][2] = 'X';
	else if(s17.equals(s)&&(board [2][0] !='X' && board [2][0] !='O'))
		board [2][0] = 'X';
	else if(s18.equals(s)&&(board [2][1] !='X' && board [2][1] !='O'))
		board [2][1] = 'X';
	else if(s19.equals(s)&&(board [2][2] !='X' && board [2][2] !='O'))
		board [2][2] = 'X';
	
	else if(s21.equals(s)&&(board [0][0] !='X' && board [0][0] !='O'))
		board [0][0] = 'X';
	else if(s22.equals(s)&&(board [0][1] !='X' && board [0][1] !='O'))
		board [0][1] = 'X';
	else if(s23.equals(s)&&(board [0][2] !='X' && board [0][2] !='O'))
		board [0][2] = 'X';
	else if(s24.equals(s)&&(board [1][0] !='X' && board [1][0] !='O'))
		board [1][0] = 'X';
	else if(s25.equals(s)&&(board [1][1] !='X' && board [1][1] !='O'))
		board [1][1] = 'X';
	else if(s26.equals(s)&&(board [1][2] !='X' && board [1][2] !='O'))
		board [1][2] = 'X';
	else if(s27.equals(s)&&(board [2][0] !='X' && board [2][0] !='O'))
		board [2][0] = 'X';
	else if(s28.equals(s)&&(board [2][1] !='X' && board [2][1] !='O'))
		board [2][1] = 'X';
	else if(s29.equals(s)&&(board [2][2] !='X' && board [2][2] !='O'))
		board [2][2] = 'X';
	
	else if(s31.equals(s)&&(board [0][0] !='X' && board [0][0] !='O'))
		board [0][0] = 'X';
	else if(s32.equals(s)&&(board [0][1] !='X' && board [0][1] !='O'))
		board [0][1] = 'X';
	else if(s33.equals(s)&&(board [0][2] !='X' && board [0][2] !='O'))
		board [0][2] = 'X';
	else if(s34.equals(s)&&(board [1][0] !='X' && board [1][0] !='O'))
		board [1][0] = 'X';
	else if(s35.equals(s)&&(board [1][1] !='X' && board [1][1] !='O'))
		board [1][1] = 'X';
	else if(s36.equals(s)&&(board [1][2] !='X' && board [1][2] !='O'))
		board [1][2] = 'X';
	else if(s37.equals(s)&&(board [2][0] !='X' && board [2][0] !='O'))
		board [2][0] = 'X';
	else if(s38.equals(s)&&(board [2][1] !='X' && board [2][1] !='O'))
		board [2][1] = 'X';
	else if(s39.equals(s)&&(board [2][2] !='X' && board [2][2] !='O'))
		board [2][2] = 'X';
	
	else
		{
		System.out.println("Invalid input");
		System.out.println( "Enter a valid input again");
		invalidInput = true;
		}
	}while(invalidInput);
	
	
	print();
	
	// CHeck Game X player won or not
	
	game = won();
	
	player = 'O'; //Switch player
	}
	
	
	// Player O turn
	else
	{
		System.out.println("You are player O! Type in grid coordinate (Ex. A1, a1, 1A, 1a): ");	
	Scanner input = new Scanner(System.in);
	
	do{
		invalidInput = false;
		s = input.next();
	
	if(s1.equals(s)&&(board [0][0] !='X' && board [0][0] !='O'))
		board [0][0] = 'O';
	else if(s2.equals(s)&&(board [0][1] !='X' && board [0][1] !='O'))
		board [0][1] = 'O';
	else if(s3.equals(s)&&(board [0][2] !='X' && board [0][2] !='O'))
		board [0][2] = 'O';
	else if(s4.equals(s)&&(board [1][0] !='X' && board [1][0] !='O'))
		board [1][0] = 'O';
	else if(s5.equals(s)&&(board [1][1] !='X' && board [1][1] !='O'))
		board [1][1] = 'O';
	else if(s6.equals(s)&&(board [1][2] !='X' && board [1][2] !='O'))
		board [1][2] = 'O';
	else if(s7.equals(s)&&(board [2][0] !='X' && board [2][0] !='O'))
		board [2][0] = 'O';
	else if(s8.equals(s)&&(board [2][1] !='X' && board [2][1] !='O'))
		board [2][1] = 'O';
	else if(s9.equals(s)&&(board [2][2] !='X' && board [2][2] !='O'))
		board [2][2] = 'O';
	
	else if(s11.equals(s)&&(board [0][0] !='X' && board [0][0] !='O'))
		board [0][0] = 'O';
	else if(s12.equals(s)&&(board [0][1] !='X' && board [0][1] !='O'))
		board [0][1] = 'O';
	else if(s13.equals(s)&&(board [0][2] !='X' && board [0][2] !='O'))
		board [0][2] = 'O';
	else if(s14.equals(s)&&(board [1][0] !='X' && board [1][0] !='O'))
		board [1][0] = 'O';
	else if(s15.equals(s)&&(board [1][1] !='X' && board [1][1] !='O'))
		board [1][1] = 'O';
	else if(s16.equals(s)&&(board [1][2] !='X' && board [1][2] !='O'))
		board [1][2] = 'O';
	else if(s17.equals(s)&&(board [2][0] !='X' && board [2][0] !='O'))
		board [2][0] = 'O';
	else if(s18.equals(s)&&(board [2][1] !='X' && board [2][1] !='O'))
		board [2][1] = 'O';
	else if(s19.equals(s)&&(board [2][2] !='X' && board [2][2] !='O'))
		board [2][2] = 'O';
	
	else if(s21.equals(s)&&(board [0][0] !='X' && board [0][0] !='O'))
		board [0][0] = 'O';
	else if(s22.equals(s)&&(board [0][1] !='X' && board [0][1] !='O'))
		board [0][1] = 'O';
	else if(s23.equals(s)&&(board [0][2] !='X' && board [0][2] !='O'))
		board [0][2] = 'O';
	else if(s24.equals(s)&&(board [1][0] !='X' && board [1][0] !='O'))
		board [1][0] = 'O';
	else if(s25.equals(s)&&(board [1][1] !='X' && board [1][1] !='O'))
		board [1][1] = 'O';
	else if(s26.equals(s)&&(board [1][2] !='X' && board [1][2] !='O'))
		board [1][2] = 'O';
	else if(s27.equals(s)&&(board [2][0] !='X' && board [2][0] !='O'))
		board [2][0] = 'O';
	else if(s28.equals(s)&&(board [2][1] !='X' && board [2][1] !='O'))
		board [2][1] = 'O';
	else if(s29.equals(s)&&(board [2][2] !='X' && board [2][2] !='O'))
		board [2][2] = 'O';
	
	else if(s31.equals(s)&&(board [0][0] !='X' && board [0][0] !='O'))
		board [0][0] = 'O';
	else if(s32.equals(s)&&(board [0][1] !='X' && board [0][1] !='O'))
		board [0][1] = 'O';
	else if(s33.equals(s)&&(board [0][2] !='X' && board [0][2] !='O'))
		board [0][2] = 'O';
	else if(s34.equals(s)&&(board [1][0] !='X' && board [1][0] !='O'))
		board [1][0] = 'O';
	else if(s35.equals(s)&&(board [1][1] !='X' && board [1][1] !='O'))
		board [1][1] = 'O';
	else if(s36.equals(s)&&(board [1][2] !='X' && board [1][2] !='O'))
		board [1][2] = 'O';
	else if(s37.equals(s)&&(board [2][0] !='X' && board [2][0] !='O'))
		board [2][0] = 'O';
	else if(s38.equals(s)&&(board [2][1] !='X' && board [2][1] !='O'))
		board [2][1] = 'O';
	else if(s39.equals(s)&&(board [2][2] !='X' && board [2][2] !='O'))
		board [2][2] = 'O';
	
	else
	{
		System.out.println("Invalid input");
		System.out.println( "Enter a valid input again");
		invalidInput = true;
	}
	}while(invalidInput);
	
	player = 'X'; // Switch Player
	
	print();
	
	// CHeck Game O Player won or not
	
	game = won();
	
	
	}
	
	k++;
	
	if(k == 9 && game)
		System.out.println("Stalemate!");
	
	
	}while(k < 9 && game);
	}

	
	public static boolean won(){
	
		boolean game = true;
	
	
		
		// CHeck player won or not 
		
		
		if((board[0][0] == board[1][1]) && (board [0][0] == board [2][2]) && (board[0][0] != ' ')|| (board[0][2] == board[1][1]) && (board [0][2] == board [2][0]) && (board[0][2] != ' '))
		{
			System.out.println( "Congratulations! You won the game!"  );
			game = false;
		}
		
		if(game)
		for( int i = 0; i < 3; i++)
		{
			if((board[i][0] == board[i][1] && board [i][0] == board [i][2]) && (board[i][0] != ' ')|| (board[0][i] == board[1][i] && board[0][i] == board[2][i]) && (board[0][i] != ' '))
			{
				System.out.println( "Congratulations! You won the game!"  );
				game = false;
			}
		}
		
		
		return game;
	}
	
	//Print Board
	public static void print(){
		
		System.out.println();
		System.out.println("\t  1 2 3");
		System.out.println();
		System.out.println("\tA "+board[0][0]+"|"+board[0][1]+"|"+board[0][2]);
		System.out.println("\t  -----");
		System.out.println("\tB "+board[1][0]+"|"+board[1][1]+"|"+board[1][2]);
		System.out.println("\t  "+"-----");
		System.out.println("\tC "+board[2][0]+"|"+board[2][1]+"|"+board[2][2]);
		System.out.println();
		
	}
	
	//Player Choice
	public static char getPlayer(){
		
		char player;
		System.out.println("Choose X or O");
		Scanner read = new Scanner(System.in);
		String st = read.nextLine();
		char choice = st.charAt(0);
		if(choice == 'X')
			player = 'X';
		else 
			player = 'O';
		System.out.println("You chose player to be  " + choice);
		return player;
	}
	
	
	
}
