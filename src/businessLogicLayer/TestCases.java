package businessLogicLayer;


import static org.junit.jupiter.api.Assertions.*;

import java.sql.SQLException;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestCases {

	@businessLogicLayer.before
	Student x= new Student();
	Assignment y=new Assignment();
	int a;

	//testCase # 1
	@Test                                
	public void testStudent1() { 
		x.setId(123);
		x.setName("Abdullah");
		x.setPassword("123abc");
		x.setPermissionflag(false);
		x.setUserName("AbdullahKhan");
		assertEquals(123,x.getId()); 
		assertEquals("Abdullah",x.getName()); 
		assertEquals("123abc",x.getPassword()); 
		assertEquals(false,x.isPermissionflag()); 
		assertEquals("AbdullahKhan",x.getUserName()); 
		
	}
	
	//testCase # 2
	@Test                                
	public void testStudent2() { 
		x.setId(456);
		x.setName("Narmeen");
		x.setPassword("145thg");
		x.setPermissionflag(false);
		x.setUserName("NarmeenNaqvi");
		assertNotEquals(123,x.getId()); 
		assertNotEquals("Abdullah",x.getName()); 
		assertNotEquals("123abc",x.getPassword()); 
		assertNotEquals(true,x.isPermissionflag()); 
		assertNotEquals("AbdullahKhan",x.getUserName()); 
	}
	
	//testCase # 3
	@Test                                
	public void testAssignment() throws SQLException { 
		y.setSubject("AP");
		y.setTopic("Junit");
		y.setTotalScore(100);
		y.setStatus(true);
		assertEquals("AP",y.getSubject());
		assertEquals("Junit",y.getTopic());
		assertEquals(100,y.getTotalScore());
		assertEquals(true,y.getStatus());
		assertNotEquals("SDA",y.getSubject());
		assertNotEquals("SystemSequence",y.getTopic());
		assertNotEquals(110,y.getTotalScore());
		assertNotEquals(false,y.getStatus());
	}
	
	//Uncomment during execution to show that it works fine
/*	
   //testCase # 4
	@Test                                
	public void testAddUpdateAssignment() throws SQLException { 
		y=x.addAssignment();
		assertEquals("AP",y.getSubject());
		assertEquals("J",y.getTopic());
		assertEquals(100,y.getTotalScore());
		assertEquals(true,y.getStatus());
        x.updateAssignment(y);
        assertEquals("SDA",y.getSubject());
		assertEquals("SS",y.getTopic());
		assertEquals(110,y.getTotalScore());
		assertEquals(false,y.getStatus());
	}
*/
	//testCase # 5
		@Test                                
		public void testAddingTask() throws IdInvalidException { 
			a=x.assignTask();
			assertEquals(0,a);
			assertNotEquals(1,a);
			//Uncomment to show correct working
			/*
			x.setPermissionflag(true);
			a=x.assignTask();
			assertEquals(1,a);
			*/	
		}
	
	//testCase # 6
			@Test                                
			public void testDeadline() { 
			a=x.setDeadline();
			assertEquals(0,a);
			assertNotEquals(1,a);
			//Uncomment to show correct working
			/*
			x.setPermissionflag(true);
			a=x.setDeadline();
			assertEquals(1,a);
			*/
					
				}		
}
