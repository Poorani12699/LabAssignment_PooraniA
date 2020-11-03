/*
 * Author : Poorani A
 * Date : 23/10/2020
 * Description : Program to display car parking lot
 */
import java.util.Scanner;
 class Parking{
    private String name;
    private String reg_no;
    Parking(String name, String reg_no)
    {
        this.name = name;
        this.reg_no = reg_no;
    }
    public String getName()
    {
        return this.name;
    }
    public String getRegNo()
    {
        return this.reg_no;
    }
}
public class CarParking
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        Parking parking[][] = new Parking[5][];
        parking[0] = new Parking[100];
        parking[1] = new Parking[70];
        parking[2] = new Parking[50];
        parking[3] = new Parking[20];
        parking[4] = new Parking[10];
        int first = parking[0].length, second = parking[1].length, third = parking[2].length, fourth = parking[3].length, fifth = parking[4].length;
        while (true) 
        { 
            System.out.println("1. Park Car");
            System.out.println("2. Get Car");
            System.out.println("3. Show Available Parking Slots");
            System.out.println("Enter your Choice");
            int choice = sc.nextInt();
            switch (choice) 
            {
                case 1:
                    System.out.println("Enter Owner Name");
                    String name = sc.next();
                    System.out.println("Enter Vehicle Registered Number");
                    String reg_no = sc.next();
                    Parking p = new Parking(name, reg_no);

                    if (( first)>= 0 )  
                    {
                        parking[0][parking[0].length - first] = p;
                        first--;
                    } else if ((second) >= 0) 
                    {
                        parking[1][parking[1].length - second] = p;
                        second--;
                    } else if ((third)>= 0)
                    {
                        parking[2][parking[2].length - third] = p;
                        third--;
                    } else if (( fourth) >=0) 
                    {
                        parking[3][parking[3].length - fourth] = p;
                        fourth--;
                    } else
                    {
                        parking[4][parking[4].length - fifth] = p;
                        fifth--;
                    }
                break;
                case 2:                	
                    System.out.println("Enter Vehicle Registered Number");
                    reg_no = sc.next();
                    for(int row=0; row < parking.length; row++)
                    {
                        for (int col = 0; col < parking[row].length; col++) 
                        {
                            if (parking[row][col] != null)
                            {
                                Parking temp = parking[row][col];
                                if (temp.getRegNo().equals(reg_no))
                                {
                                    System.out.println("Vehicle was Placed at  " + row + " floor and " + col+" slot ");
                                    parking[row][col] = new Parking(null, null);                                   
                                    switch (row)
                                    {
                                        case 0: first++; break;
                                        case 1: second++; break;
                                        case 2: third++; break;
                                        case 3: fourth++; break;
                                        case 4: fifth++; break;
                                    }
                                }
                            }
                        }
                    }
                    
                    break;
                case 3:
                    System.out.println("Avaliable Spaces ");
                    System.out.println("First Floor " + first);
                    System.out.println("Second Floor " + second);
                    System.out.println("Third Floor " + third);
                    System.out.println("Fourth Floor " + fourth);
                    System.out.println("Fifth Floor " + fifth);
                            break;
            }
        }
    }
}
