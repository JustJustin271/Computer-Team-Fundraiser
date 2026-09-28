/*
 Created by JC
 Created on the 28th of September, 2026
 Learning how to use classes in Java :))
*/

public class ComputerTeamFundraiser {
	private String name;
	private int boxesSold;
	private int stickersSold;
	private int tShirtsSold;
	
	ComputerTeamFundraiser() {
		name = "New member";
		boxesSold = 0;
		stickersSold = 0;
		tShirtsSold = 0;
	}
	
	ComputerTeamFundraiser(String name) {
		this.name = name;
		boxesSold = 0;
		stickersSold = 0;
		tShirtsSold = 0;
	}
	
	ComputerTeamFundraiser(String name, int boxesSold) {
		this.name = name;
		this.boxesSold  = boxesSold;
		stickersSold = 0;
		tShirtsSold = 0;
	}
	
	ComputerTeamFundraiser(String name, int boxesSold, int stickersSold, int tShirtsSold) {
		this.name = name;
		this.boxesSold  = boxesSold;
		this.stickersSold = stickersSold;
		this.tShirtsSold = tShirtsSold;
	}
	
	public String toString() {
		return name + ":  " + boxesSold + " boxes, " + stickersSold + " stickers, " + tShirtsSold + " t-shirts";
	}
	
	public static void main(String[] args) {
		
		System.out.println("Test Case 1");
		ComputerTeamFundraiser member1 = new ComputerTeamFundraiser();
		System.out.println(member1);
		System.out.println();
		
		System.out.println("Test Case 2");
		ComputerTeamFundraiser member2 = new ComputerTeamFundraiser("Joe", 16);
		System.out.println(member2);
		System.out.println();
		
		System.out.println("Test Case 3");
		ComputerTeamFundraiser member3 = new ComputerTeamFundraiser("Grace", 12, 20, 3);
		System.out.println(member3);
		System.out.println();
		
		System.out.println("Test Case 4");
		ComputerTeamFundraiser member4 = new ComputerTeamFundraiser("Alan");
		System.out.println(member4);
	}
}

