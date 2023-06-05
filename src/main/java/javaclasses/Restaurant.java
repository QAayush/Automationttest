package javaclasses;

import java.util.Scanner;

public class Restaurant {

	public static void main(String[] args) {

		// Normal menu
		String tea = "Tea";
		String Cold_drink = "Colddrink";
		String Coffee = "Coffee";
		String Bread_Pakoda = "BreadPakoda";
		String Quantity;
		String nc;
		String dd = "Yes";
		String df = "No";
		String kk;

		// Menu with price
		String tea1 = "Tea = 10 rs";
		String Cold_drink1 = "Cold drink =  20 rs";
		String Coffee1 = "Coffee = 30 rs";
		String Bread_Pakoda1 = "Bread Pakoda = 40 rs";

		int te = 0;
		int ch = 0;
		int sh = 0;
		int dh = 0;
		int fh = 0;
		int ee = 0;
		int v = 0;
		int n = 10;
		int m = 20;
		int l = 30;
		int x = 40;
		int tr = 0;
		int total = 0;
		int finaltotal = 0;
		int countTea = 1;
		int countcoffee = 1;
		int countcolddrink = 1;
		int countbreadpakoda = 1;
		int count = 0;
		int nh = 0;
		int jh = 0;
		int kh = 0;
		int total1 = 0;
		int total2 = 0;
		int total3 = 0;

		System.out.println("==========================================");
		System.out.println(" Welcome to the Scode Network Restaurant\n");

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your name : ");
		String Name = sc.nextLine();

		System.out.println();
		System.out.println(" If you to see menu please press 1");
		int i = sc.nextInt();
		if (i == 1) {
			System.out.println(tea);
			System.out.println();
			System.out.println(Cold_drink);
			System.out.println();
			System.out.println(Coffee);
			System.out.println();
			System.out.println(Bread_Pakoda);
			System.out.println();

		} else {
			System.out.println("Thanku for visiting " + Name + " sir");
			return;
		}

		System.out.println("============================================");
		System.out.println("If you want to know menu with price please press 1");

		int j = sc.nextInt();
		if (j == 1) {
			System.out.println();
			System.out.println(tea1);
			System.out.println();
			System.out.println(Cold_drink1);
			System.out.println();
			System.out.println(Coffee1);
			System.out.println();
			System.out.println(Bread_Pakoda1);
		} else if (j != 1) {
			System.out.println("If you want to continue without see price rate  Continue with normal  menu");
			System.out.println();
			System.out.println(tea);
			System.out.println();
			System.out.println(Cold_drink);
			System.out.println();
			System.out.println(Coffee);
			System.out.println();
			System.out.println(Bread_Pakoda);
			System.out.println();
		}

		System.out.println("==========================================");

		System.out.println("If you want to select from these items please insert 1");
		int d = sc.nextInt();
		if (d == 1) {
			System.out.println(" Now please select your menu ");

		} else {
			System.out.println("Thanku for visiting " + Name + " sir");
			return;
		}

		while (true) {

			if (count == 0) {
				System.out.println("----------------------------------------------------");
				while (true) {
					System.out.println("Plz enter your order ");
					nc = sc.next();
					System.out.println("Order  ::  " + nc);

					if (nc.equals(tea)) {
						System.out.println("Your oder sucessfully saved");
						System.out.println();
						System.out.println("Now please enter quantity");
						tr = sc.nextInt();
						System.out.println("Your quantity is " + tr);
						System.out.println();
						te = tr * n;
						System.out.println(te);
						count++;
						break;
					} else if (nc.equals(Cold_drink)) {
						System.out.println("Your oder sucessfully saved");
						System.out.println();
						System.out.println("Now please enter quantity");
						jh = sc.nextInt();
						System.out.println();
						System.out.println("Your quantity is " + jh);
						System.out.println();
						te = jh * m;
						System.out.println(te);
						count++;
						break;
					} else if (nc.equals(Coffee)) {
						System.out.println("Your oder sucessfully saved");
						System.out.println("Now please enter quantity");
						nh = sc.nextInt();
						System.out.println();
						
						System.out.println("Your quantity is " + nh);
						System.out.println();
						te = nh * l;
						System.out.println(te);
						count++;
						break;
					} else if (nc.equals(Bread_Pakoda)) {
						System.out.println("Your oder sucessfully saved");
						System.out.println();
						System.out.println("Now please enter quantity");
						kh = sc.nextInt();
						System.out.println();
						System.out.println("Your quantity is " + kh);
						System.out.println();
						te = kh * x;
						System.out.println(te);
						count++;
						break;
					} else {
						System.out.println("Please enter valid menu");
						System.out.println();
					}
				}
			} else {
				System.out.println("If you want more order please enter  YES else enter No");
				kk = sc.next();
				System.out.println(kk);
				System.out.println();
				if (kk.equals(dd)) {
					while (true) {
						System.out.println("Plz enter your order ");
						nc = sc.next();
						System.out.println("Order  ::  " + nc);

						if (nc.equals(tea)) {
							System.out.println("Your oder sucessfully saved");
							countTea++;
							System.out.println("Your total order count is " + countTea);
							System.out.println();
							System.out.println("Now please enter quantity");
							ch = sc.nextInt();
							System.out.println();
							System.out.println("Your quantity is " + ch);
							System.out.println();
							total +=  ch * n;
							System.out.println("Total " + total);
							System.out.println();
							break;
						} else if (nc.equals(Coffee)) {
							System.out.println("Your oder sucessfully saved");
							countcoffee++;
							System.out.println("Your total order count is " + countcoffee);
							System.out.println();
							System.out.println("Now please enter quantity");
							sh = sc.nextInt();
							System.out.println();
							System.out.println("Your quantity is " + sh);
							System.out.println();
							total1 += sh*l;
							System.out.println("Total " + total1);
							System.out.println();
							break;
						} else if (nc.equals(Cold_drink)) {
							System.out.println("Your oder sucessfully saved");
							countcolddrink++;
							System.out.println("Your total order count is " + countcolddrink);
							System.out.println();
							System.out.println("Now please enter quantity");
							dh = sc.nextInt();
							System.out.println();
							System.out.println("Your quantity is " + dh);
							System.out.println();
							total2 += dh * m;
							System.out.println("Total " + total2);
							System.out.println();
							break;
						} else if (nc.equals(Bread_Pakoda)) {
							System.out.println("Your oder sucessfully saved");
							countbreadpakoda++;
							System.out.println("Your total order count is " + countbreadpakoda);
							System.out.println();
							System.out.println("Now please enter quantity");
							fh = sc.nextInt();
							System.out.println();
							System.out.println("Your quantity is " + fh);
							System.out.println();
							total3 += fh * x;
							System.out.println("Total " + total3);
							System.out.println();
							break;
						} else {
							System.out.println("Please enter valid menu");
							System.out.println();
						}
					}
				}

				/*
				 * if (kk.equals(df)) { System.out.println("===============Bill Sir=========");
				 * System.out.println("Your tea bill is " + te);
				 * System.out.println("Thanku for visiting " + Name + " sir"); break;
				 * 
				 * } else
				 */

				if (kk.equals(df)) {
					System.out.println("===============Bill Sir=========");
					finaltotal = total+total1+total2+total3+te;
					System.out.println("Your bill is " + finaltotal);
					System.out.println("Thanku for visiting " + Name + " sir");
					break;
					
				}
			}
		}
	}
}
