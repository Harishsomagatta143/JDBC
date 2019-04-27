package com.cg.saloon.ui;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.cg.saloon.dto.Address;
import com.cg.saloon.dto.Customer;
import com.cg.saloon.dto.Saloon;
import com.cg.saloon.exception.SaloonNotFoundException;
import com.cg.saloon.service.SaloonService;
import com.cg.saloon.service.SaloonServiceImpl;
import com.cg.saloon.util.DBUtil;

public class MyApplication {

	public static void main(String[] args) {
		SaloonServiceImpl service =  new SaloonServiceImpl();
		Scanner scr=new Scanner(System.in);
		service=new SaloonServiceImpl();
		List<Customer>custlist=new ArrayList<Customer>();
			int choice=0;
			
	        int id;
			int saloonId = 0;
			String name;
			String address;
		//	String phnumber;

			
			System.out.println("Enter the choice");
			choice=scr.nextInt();
			do {
		
		
			switch(choice) {

			case 1:         
							//******Adding saloon*********
					List<Saloon> saloons=new ArrayList<Saloon>();
				
					System.out.println("Enter saloon id: ");
					id=scr.nextInt();
					
					System.out.println("Enter saloon Name: ");
					name=scr.next();
					/*System.out.println("Enter saloon address: ");
					address=scr.next();*/
					System.out.println("Enter saloon phonenumber: ");
					BigInteger phnumber=scr.nextBigInteger();
					System.out.println("Enter city: ");
					String city=scr.next();
					System.out.println("Enter state: ");
					String state=scr.next();
					System.out.println("Enter postalcode: ");
					Long postalcode=scr.nextLong();
					
					
					Address adr=new Address(city,state,postalcode);
					Customer cust=new Customer(11,"gh","gh",new BigInteger("423"));
					 custlist.add(cust);
					Saloon sal=new Saloon(saloonId,name,adr,phnumber,custlist);
					
					Saloon sal1=service.addSaloon(sal);
				 
					System.out.println(sal1);
					
				    break;

			case 2:     

				break;

			case 3:  

				break;
			}
		}while(choice!=4);




	}
}
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*Customer customer=new Customer(123,"harish","harish@gmail.com",new BigInteger("5454545465"));
		int choice=0;
		do {
			printDetails();
			System.out.println("enter the choice");
			choice=scr.nextInt();
				switch (choice) {
				case 1:
					
				Address adr=new Address("hyd","telangana",123654);
				List<Customer> cus=new ArrayList<Customer>();
				Customer customer=new Customer(123,"harish","harish@gmail.com",new BigInteger("5454545465"));
				cus.add(customer);
				List<Customer> cusOne=new ArrayList<Customer>();
				Customer customerOne=new Customer(124,"sai","sai@gmail.com",new BigInteger("878977"));
				cusOne.add(customerOne);
				Saloon sal=new Saloon(123,"luckme",adr,new BigInteger("123456789"),cus);
				Saloon salOne=new Saloon(111,"lakme",adr,new BigInteger("2312312312"),cusOne);
				Saloon sal=new Saloon(123,"luckme",DBUtil.adr,new BigInteger("123456789"),DBUtil.cus);
				Saloon salOne=new Saloon(111,"lakme",DBUtil.adr,new BigInteger("2312312312"),DBUtil.cusOne);
				System.out.println(service.addSaloon(sal));
				System.out.println(service.addSaloon(salOne));
			
				break;
	
				case 2:System.out.println("enter the saloon search by name");

				String sname=scr.next();

				List<Saloon>salSearch=service.searchByName(sname);
				for(Saloon salAll:salSearch) {
					System.out.println("name is "+salAll.getName());
					System.out.println("phone is "+salAll.getPhoneNumber());
					System.out.println("saloon id is "+salAll.getId());
					System.out.println("saloon address "+salAll.getAddress());
					
					}

				}}while(choice!=4);

	}
	public static void printDetails() {
		System.out.println("1.add saloon");
		System.out.println("2.search by name");
		System.out.println("3.assign customer");
	}
}
System.out.println("Enter the address Number : ");
			int addressNumber = scr.nextInt();
			System.out.println("Enter the City : ");
			String city = scr.next();
			System.out.println("Enter the State : ");
			String state = scr.next();
			System.out.println("Enter the Pincode : ");
			Long pincode = scr.nextLong(); 
List<Saloon> saloons = new ArrayList<>();
					String ch;
					do {
				System.out.println("Enter the saloon id : ");
				int id = scr.nextInt();
			System.out.println("Enter the saloon Name : ");
			String name = scr.next();
			System.out.println("Enter the saloon address : ");
			String address = scr.next();
			System.out.println("Enter the saloon phonenumber : ");
			BigInteger phoneNumber = scr.nextBigInteger();
			saloons.add(new Saloon(id,name,address,phoneNumber));
			System.out.println("Enter more saloon ? (Y or N): ");
			ch=scr.next();
			}while(ch.equals("Y") || ch.equals("y"));
			Address address=new Address(city, state, pincode);
			Saloon saloon =new Saloon(id,name,address,new BigInteger(phoneNumber));
			service.addSaloon(); 
 

				
				case 3:
					Saloon saloon=new Saloon();
					System.out.println("enter the saloon name to assign the customer");
					String salname=scr.next();
					service.searchByName(salname);
					try {
						saloon=service.assignCustomer(salname, customer);
					} catch (SaloonNotFoundException e) {
						// TODO Auto-generated catch block
						System.out.println(e.getMessage());
					}System.out.println(saloon);
					break;

				}}while(choice!=4);

	}
	public static void printDetails() {
		System.out.println("1.add saloon");
		System.out.println("2.search by name");
		System.out.println("3.assign customer");
	}


		
	


	


*/