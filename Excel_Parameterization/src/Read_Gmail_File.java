
public class Read_Gmail_File {

	public static void main(String[] args) {
		
	Xls_Reader xls = new Xls_Reader("S:\\JANBASK\\QA-27th May 2022\\Excel_Parameterization\\src\\TEST_SUITE\\TESTSUITE.xlsx");	

	
	int rowCount=xls.getRowCount("GMAIL");
	System.out.println(rowCount);
	
	//String value1=xls.getCellData("GMAIL", "TCID", 4);
	//System.out.println(value1);
	
	for(int i=1;i<=rowCount;i++) 
	{
		String value1=xls.getCellData("GMAIL", "TCID", i);
		String value2=xls.getCellData("GMAIL", "TESTCASE", i);
		String value3=xls.getCellData("GMAIL", "STATUS", i);
		
		System.out.println(value1 +" | "+value2+" | "+value3);
		
		
	}
	
	
	}

}
