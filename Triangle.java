// Draws triangle
class Draw {

	private char ch;
	
	Draw() {}	// Default Constructor
	
	Draw(char c) {	// Parametarized Constructor
		ch = c;
	}


	// Methods

	// 1: Right Angled Triangle
	public void rightTri(int n) {
		for(int i = 0; i < n; i++) {
			for(int j = 0; j <= i; j++)
				System.out.print(" " + ch);
			System.out.print("\n");
		}
	}
	
	// 2: Mirrored Right Angled Triangle
	public void mirrorRightTri(int n) {
		for(int i = 0; i < n; i++) {
			for(int k = n - i; k > 0; k--)
				System.out.print("  ");
			for(int j = 0; j <= i; j++)
				System.out.print(" " + ch);
			System.out.print("\n");
		}
	}

	// 3: Upside-Down Right Angled Triangle
	public void upsideDownRightTri(int n) {
		for(int i = n; i > 0; i--) {
			for(int j = 0; j < i; j++)
				System.out.print(" " + ch);
			System.out.print("\n");
		}
	}

	// 4: Mirrored Upside-Down Right Angled Triangle
	public void mirrorUpsideDownRightTri(int n, boolean flag) {
		for(int i = n; i > 0; i--) {
			if(!flag) {
				for(int k = n - i; k >= 0; k--)
					System.out.print("  ");
			} else {
				for(int k = n - i + 1; k >= 0; k--)
					System.out.print("  ");
			}
			for(int j = 0; j < i; j++)
				System.out.print(" " + ch);
			System.out.print("\n");
		}
	}

	// 5: Equilateral Triangle
	public void equiTri(int n) {
		for(int i = 0; i < n; i++) {
			for(int k = n - i; k >= 0; k--)
				System.out.print(" ");
			for(int j = 0; j <= i; j++)
				System.out.print(" " + ch);
			System.out.print("\n");
		}
	}
	
	// 6: Upside-Down Equilateral Triangle
	public void upsideDownEquiTri(int n) {
		for(int i = n; i >= 0; i--) {
			for(int k = n - i; k >= 0; k--)
				System.out.print(" ");
			for(int j = 0; j <= i; j++)
				System.out.print(" " + ch);
			System.out.print("\n");
		}
	}

	// 7: Sideways Equilateral Triangle
	public void sidewaysEquiTri(int n) {
		rightTri(n/2 + 1);
		upsideDownRightTri(n/2);
	}

	// 8: Mirrored Sideways Equilateral Triangle
	public void mirrorSidewaysEquiTri(int n) {
		mirrorRightTri(n/2 + 1);
		mirrorUpsideDownRightTri(n/2, true);
	}

}


// Main class
class Triangle extends Draw {
	
	public static void main(String args[]) {
		try {	
			if(args[0].equals("--help")) {
				System.out.println("-------------------- HELP --------------------");
				System.out.println("Syntax:\njava Triangle [choice] [height] [character]\n");

				// Choices
				System.out.println("[choice]			{REQUIRED}");
				System.out.println("1 : Right Angled Triangle");
				System.out.println("2 : Mirrored Right Angled Triangle");
				System.out.println("3 : Upside-Down Right Angled Triangle");
				System.out.println("4 : Mirrored Upside-Down Right Angled Triangle");
				System.out.println("5 : Equilateral Triangle");
				System.out.println("6 : Upside-Down Equilateral Triangle");
				System.out.println("7 : Sideways Equilateral Triangle");
				System.out.println("8 : Mirrored Sideways Equilateral Triangle\n");

				// Height
				System.out.println("[height]			{REQUIRED}");
				System.out.println("Vertical Height of the triangle or rows.\n");

				// Character
				System.out.println("[character]			{OPTIONAL}");
				System.out.println("The character that will draw the triangle");
				System.out.println("If a character doesn't print,\nPut it under qoutes\nLike:\njava Triangle 7 10 \"#\"");
				System.out.println("----------------------------------------------");
				System.out.println("----------------------------------------------");
				System.out.println("------------- Triangle  Patterns -------------");
				System.out.println("-- A Java CLI Program By Debaloy Chatterjee --");
				System.out.println("--------- Github:  github.com/Debaloy --------");
				System.out.println("------- Email: debaloy110019@gmail.com -------");
				System.out.println("----------------------------------------------");
				System.out.println("----------------------------------------------");
				System.out.println("For more info:\ngithub.com/Debaloy/java-cli-triangle-patterns.git");
				return;
			}

			int choice = Integer.parseInt(args[0]);
			int n = Integer.parseInt(args[1]);
			char ch = '*';
			if(args.length == 3)
				ch = args[2].charAt(0);
			Draw draw = new Draw(ch);

			switch(choice) {
				case 1: 
					System.out.println("Right Angled Triangle of Height " + n + " with Character " + ch + "\n");
					draw.rightTri(n); break;
				
				case 2:
					System.out.println("Mirrored Right Angled Triangle of Height " + n + " with Character " + ch + "\n");
					draw.mirrorRightTri(n); break;
				
				case 3:
					System.out.println("Upside-Down Right Angled Triangle of Height " + n + " with Character " + ch + "\n");
					draw.upsideDownRightTri(n); break;
				
				case 4:
					System.out.println("Mirrored Upside-Down Right Angled Triangle of Height " + n + " with Character " + ch + "\n");
					draw.mirrorUpsideDownRightTri(n, false); break;
				
				case 5:
					System.out.println("Equilateral Triangle of Height " + n + " with Character " + ch + "\n");
					draw.equiTri(n); break;
				
				case 6:
					System.out.println("Upside-Down Equilateral Triangle of Height " + n + " with Character " + ch + "\n");
					draw.upsideDownEquiTri(n); break;
				
				case 7:			
					System.out.println("Sideways Equilateral Triangle of Height " + n + " with Character " + ch + "\n");
					draw.sidewaysEquiTri(n); break;
				
				case 8:			
					System.out.println("Mirrored Sideways Equilateral Triangle of Height " + n + " with Character " + ch + "\n");
					draw.mirrorSidewaysEquiTri(n); break;

				default:
					System.out.println("Invalid choice");
			}

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Wrong format.\nSyntax: java Triangle [choice] [height]\nHelp: java Triangle --help");
		} catch (NumberFormatException e) {
			System.out.println("Invalid Parameters\n[choice] and [height] must be numeric.\nHelp: java Triangle --help");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
