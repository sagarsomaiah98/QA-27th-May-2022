import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write_To_Excel {

	public static void main(String[] args) throws FileNotFoundException, IOException {
	
		//https://poi.apache.org/components/spreadsheet/quick-guide.html
		
		Workbook wb = new XSSFWorkbook();
		
		try (OutputStream fileOut = new FileOutputStream("S:\\JANBASK\\QA-27th May 2022\\Excel_Parameterization\\src\\TEST_SUITE\\NEWFILE.xlsx")){
		        Sheet s1 = wb.createSheet("SHEET A");
				Sheet s2 = wb.createSheet("SHEET B");
				Sheet s3 = wb.createSheet("SHEET C");
				Row row = s1.createRow(0);
				row.createCell(1).setCellValue(1.2);
				row.createCell(2).setCellValue("JAVA");
				
				row.createCell(3).setCellValue(true);
				
				Row r1 = s1.createRow(1);
				r1.createCell(0).setCellValue("mark");
				r1.createCell(1).setCellValue("45");
				r1.createCell(2).setCellValue("Newyork");
				r1.createCell(3).setCellValue("mark@gmail.com");
				r1.createCell(4).setCellValue("41256");
				
				
				
		
		{
		    wb.write(fileOut);
		}

		System.out.println("COMPLETED");
		}}

}
