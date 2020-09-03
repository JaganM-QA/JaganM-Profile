package scriptsmodule09;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import basicOperations.AlertMessages;
import basicOperations.Excel;
import basicOperations.LoginOperations;
import basicOperations.Screenshots;
import pom.DynamicTable;

public class ProfileDynamicTable extends LoginOperations
{

	@Test
	public static void EmpDynamicTable() throws EncryptedDocumentException, IOException, InterruptedException
	{
		//LoginOperations.LogIn();
		DynamicTable dt = new DynamicTable(driver);
		dt.DynamicTableHome();
		
		
//		String ename = Excel.excelData("Dynamictable", 1, 0);
//		String edesig = Excel.excelData("Dynamictable", 1, 1);
//		String eexp = Excel.excelData("Dynamictable", 1, 2);
		dt.DynamicTableAddEmp();
		Thread.sleep(2000);
		
//		dt.DynamicTableAddEmpName(ename);
//		dt.DynamicTableAddEmpDesig(edesig);
//		dt.DynamicTableAddEmpExp(eexp);
//		Screenshots.screenshot();
 
		dt.DynamicTableAddEmp();
		dt.DynamicTableClear();
		dt.DynamicTableAddEmp();
		//dt.DynamicTableRemEmp();
		dt.DynamicTableSubmit();
		AlertMessages.AcceptAlert();
		dt.DynamicTableLogout();
		LoginOperations.LogOut();
		
	 
	}
}
