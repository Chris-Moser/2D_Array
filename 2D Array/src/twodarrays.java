import java.util.Scanner;

public class twodarrays
	{
		public static int counter = 0;
		public static int counter2 = 0;

		public static void main(String[] args)
			{
				chall1();
				chall2();
				chall3();
				chall4();
			}

		private static void chall1()
			{
				int[][] array = new int[3][2];
				array[0][0] = 10;
				array[0][1] = 20;
				array[1][0] = 30;
				array[1][1] = 40;
				array[2][0] = 50;
				array[2][1] = 60;

				for (int row = 0; row < array.length; row++)
					{
						for (int col = 0; col < array[row].length; col++)
							{

								System.out.print(array[row][col] + " ");
							}
						System.out.println();
					}
				System.out.println();
				System.out.println(array[2][1]);
				System.out.println();
			}

		private static void chall2()
			{
				Scanner userStringInput1 = new Scanner(System.in);

				System.out.println("What are your highschoool's three letters? ");

				String school = userStringInput1.nextLine();

				String[][] array = new String[4][3];
				array[0][0] = school;
				array[0][1] = school;
				array[0][2] = school;
				array[1][0] = school;
				array[1][1] = school;
				array[1][2] = school;
				array[2][0] = school;
				array[2][1] = school;
				array[2][2] = school;
				array[3][0] = school;
				array[3][1] = school;
				array[3][2] = school;

				for (int row = 0; row < array.length; row++)
					{
						for (int col = 0; col < array[row].length; col++)
							{

								System.out.print(array[row][col] + " ");
							}
						System.out.println();
					}

			}

		private static void chall3()
			{
				System.out.println();
				int[][] array = new int[3][3];
				array[0][0] = counter;
				array[0][1] = counter;
				array[0][2] = counter;
				array[1][0] = counter;
				array[1][1] = counter;
				array[1][2] = counter;
				array[2][0] = counter;
				array[2][1] = counter;
				array[2][2] = counter;

				for (int row = 0; row < array.length; row++)
					{
						for (int col = 0; col < array[row].length; col++)
							{

								counter++;
								array[row][col] = counter;
								System.out.print(array[row][col] + " ");

							}
						System.out.println();
					}
				System.out.println();
				int sum = array[0][0] + array[0][2] + array[2][0] + array[2][2];
				System.out.println(sum);
			}

		private static void chall4()
			{
				System.out.println();
				int[][][] array = new int[3][3][3];
				array[0][0][0] = counter2;
				array[0][0][1] = counter2;
				array[0][0][2] = counter2;
				array[0][1][0] = counter2;
				array[0][1][1] = counter2;
				array[0][1][2] = counter2;
				array[0][2][0] = counter2;
				array[0][2][1] = counter2;
				array[0][2][2] = counter2;
				array[1][0][0] = counter2;
				array[1][0][1] = counter2;
				array[1][0][2] = counter2;
				array[1][1][0] = counter2;
				array[1][1][1] = counter2;
				array[1][1][2] = counter2;
				array[1][2][0] = counter2;
				array[1][2][1] = counter2;
				array[1][2][2] = counter2;
				array[2][0][0] = counter2;
				array[2][0][1] = counter2;
				array[2][0][2] = counter2;
				array[2][1][0] = counter2;
				array[2][1][2] = counter2;
				array[2][2][0] = counter2;
				array[2][2][1] = counter2;
				array[2][2][2] = counter2;

				int sum = 0;
				for (int row = 0; row < array.length; row++)
					{
						for (int col = 0; col < array[row].length; col++)
							{
								for (int dep = 0; dep < array[row][col].length; dep++)
									{
										counter2++;
										array[row][col][dep] = counter2;
										System.out.print(array[row][col][dep] + " ");
										sum += array[row][col][dep];

									}
								System.out.println();
							}
						System.out.println();
					}
				
				System.out.println();
				System.out.println();
				System.out.println(sum);
			}

	}
