package com.cg.saloon.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


import com.cg.saloon.dto.Saloon;
import com.cg.saloon.util.DBUtil;

public class SaloonDaoImpl implements SaloonDao{

	PreparedStatement pstm;
	Statement stmt;


	@Override
	public Saloon save(Saloon sal) {
		
		
		Connection conn = DBUtil.getConnection();
		
		
 
		
		try {
		/*	pstm = conn.prepareStatement("INSERT INTO customer(customer_id,name,emailid,mobilenumber) VALUES (?,?,?,?)");
			pstm.setString(1, sal.getCustomerList().get(0).toString());
			pstm.setString(2, sal.getCustomerList().get(1).toString());
			pstm.setString(3, sal.getCustomerList().get(2).toString());
			pstm.setString(4, sal.getCustomerList().get(3).toString());
			int n=pstm.executeUpdate();
			*/
			/*if(n==1)
			{  
				pstm = conn.prepareStatement("INSERT INTO address (city,state,postalcode) VALUES (?,?,?)");
				 
				pstm.setString(1, sal.getAddress().getCity());
				pstm.setString(2, sal.getAddress().getState());
				pstm.setLong(3, sal.getAddress().getPostalcode());
				int n1=pstm.executeUpdate();
				if(n1==1)
				{*/
			
			pstm = conn.prepareStatement("INSERT INTO address (city,state,postalcode) VALUES (?,?,?)");
			 
			pstm.setString(1, sal.getAddress().getCity());
			pstm.setString(2, sal.getAddress().getState());
			pstm.setLong(3, sal.getAddress().getPostalcode());
			int n1=pstm.executeUpdate();
			if(n1==1)
			{
					pstm = conn.prepareStatement("INSERT INTO saloon (name,phonenumber) VALUES (?,?)");
					 
					pstm.setString(1, sal.getName());
					pstm.setString(2, sal.getPhoneNumber().toString());
					int n2=pstm.executeUpdate();
				if(n2==1)
					{
					int saloon_id=0;
					    String sq="select max(saloon_id)from saloon";
					pstm=conn.prepareStatement(sq);
					ResultSet rs=pstm.executeQuery();
					if(rs.next())
					{
						saloon_id=rs.getInt(1);
					}
					
						pstm = conn.prepareStatement("INSERT INTO customer(name,emailid,mobilenumber,saloon_id) VALUES (?,?,?,?)");
						
					//	pstm.setString(1, sal.getCustomerList());
						pstm.setString(1, sal.getCustomerList().toString());
						pstm.setString(2, sal.getCustomerList().toString());
						pstm.setString(3, sal.getCustomerList().toString());
						pstm.setInt(4,saloon_id);
						pstm.executeUpdate();
					}
			}
				
				
		 
				
			
             
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return sal;
		

	}
		@Override
		public List<Saloon> findByName(String name) {

			return null;
		}
		
}
		
		
		
		
		
		
		
		
		
		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//	
////		Connection conn=DBUtil.getConnection();
//		
//		/*try {
//			Connection connection = null;
//			pstm = connection.prepareStatement("INSERT INTO address (city,state,postalcode) VALUES (?,?,?)");
//			int addressId = 0;
//			
//				pstm.setString(1, sal.getAddress().getCity());
//				pstm.setString(2, sal.getAddress().getState());
//				pstm.setLong(3, sal.getAddress().getPostalcode());
//				pstm.executeUpdate();
//
//				pstm = connection.prepareStatement("select max(address_id) from address");
//				ResultSet result = pstm.executeQuery();
//				if (result.next()) {
//					addressId = result.getInt(1);
//				}			
//			int saloonId = 0;
//			try {
//				
//				pstm = connection.prepareStatement("INSERT INTO saloon(name,address_id) VALUES (?,?)");
//				pstm.setString(1,sal.getName());
//				pstm.setInt(2,addressId);
//				pstm.executeUpdate();
//
//			} catch (SQLException e) {
//				e.printStackTrace();
//			}
//		} catch (SQLException e) {
//
//		}
//		
//		return sal;
//		
//	}*/
//	
////		try {
//		// TODO Auto-generated method stub
////		PreparedStatement pstm = conn.prepareStatement("insert into address (city,state,postalcode)VALUES (?,?,?)");
//		//System.out.println(sal);
////		int addressId=0;
//		try {
//			pstm.setString(1,sal.getAddress().getCity());
//			pstm.setString(1,sal.getAddress().getState());
//			pstm.setLong(1,sal.getAddress().getPostalcode());
//			pstm.executeUpdate();
//			/*pstm=conn.prepareStatement("select max(id) from address");
//			ResultSet result=pstm.executeQuery();
//			if(result.next()) {
//				addressId=result.getInt(1);*/
//			
//		}catch(SQLException e) {
//			e.printStackTrace();
//		}finally {
//			
//		}
//		/*try (PreparedStatement pstm1=Connection.prepareStatement
//				("INSERT INTO saloon(saloon_id,saloon_name,saloon_address,saloon_phonenumber,address_id)VALUES(?,?,?,?,?)")){
//			pstm1.setInt(1, sal.getId());
//			pstm1.setString(2, sal.getString());
//			pstm1.setString(3, sal.getString());
//			pstm1.setString(4, sal.getPhoneNumber().toString());
//			pstm1.setInt(5, addressId());
//			pstm1.executeUpdate();
//		}
//		int saloonId=0;
//		try {
//			pstm=Connection.prepareStatement("select max(saloon_id) from saloon");
//		
//		ResultSet result=pstm.executeQuery();
//		if(result.next()) {
//			saloonId=result.getInt(1);
//		
//		}
//		pstm=Connection.prepareStatement
//				("INSERT INTO customer(customer_id,customer_name,customer_emailid,customer_mobilenumber,saloon_id)VALUES(?,?,?,?,?)");
//		for(Customer customers : saloon.getCustomer()) {
//			pstm.setInt(1, customers.getId());
//			pstm.setString(2, customers.getName());
//			pstm.setString(3, customers.getEmailId());
//			pstm.setString(4, customers.getMobileNumber().toString());
//			pstm.setInt(5, saloonId());
//			pstm.executeUpdate();
//		}
//		}catch(SQLException e) {
//			e.printStackTrace();
//		}
//		return conn;
//		
////			DBUtil.sal.add(sal);
////			DBUtil.sal.add(sal);
////			DBUtil.sal.add(sal);
////			DBUtil.sal.add(sal);
////		DBUtil.sal.add(sal);
////		 return sal;
//			*/
//	
//
//	@Override
//	public List<Saloon> findByName(String name) {
//		List<Saloon> saloonList = new ArrayList<>();
//		for (Saloon saloon :DBUtil.sal) {
//			if(saloon.getName().equals(name))
//			{
//				saloonList.add(saloon);
//		}
//		
//	}
//		return saloonList;
//	
//	}
//	private int saloonId() {
//	// TODO Auto-generated method stub
//	return 0;
//}
//	private int addressId() {
//		// TODO Auto-generated method stub
//		return 0;
//	}
//}
//
//

