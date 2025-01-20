package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

class Project
{
	private String vehicleName;
	private String vehicleBrand;
	private String vehicleColour;
	private double vehicleCost;
	private String engineType;
	
	//mandatory methods...
}


//create a factory class (intermediate class i.e class_name _ factory) all the logic in this class and called by main class 
class Vehicle_Factory
{
	Scanner s = new Scanner(System.in);
	List<Project> list = new ArrayList<Project>();
	
	public void login()
	{
		System.out.println("Enter the 10 digit Mobile Number..");
		long mobileNumber = s.nextLong();
		if(mobileNumber > 6000000001l && mobileNumber < 9999999991l)
		{
			int generatedOTP = generateOTP();
			System.out.println("Your OTP : " + generatedOTP);
			
			System.out.println("Enter the OTP");
			int enteredOTP = s.nextInt();
			if(enteredOTP == generatedOTP)
			{
				System.out.println("Login Successfull..👍👍");
			}
			else
			{
				System.out.println("Invalid OTP..👎👎");
			}
		}
		else
		{
			System.out.println("Invalid Mobile Number..");
			System.out.println("The Number Must Contain 10 digits..");
		}
	}
	
	public int generateOTP()
	{
		Random random = new Random();
		int otp = random.nextInt(9999); // random.nextInt(1000, 9999);
		return otp;
	}
}

public class ProjectMain 
{
	public static void main(String[] args) 
	{
		Vehicle_Factory factory = new Vehicle_Factory();
		
		System.out.println("Welcome....to Automobile services... ");
		System.out.println("Login to the Application");
		factory.login();
	}
}
