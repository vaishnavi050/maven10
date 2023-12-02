package datadriventesting1;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Readdatafromexcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		//to raed data from externalfile
		FileInputStream fis=new  FileInputStream("src\\test\\resources\\datadriven1.xlsx");
		//to read data from excel
		Workbook wb=WorkbookFactory.create(fis);
		//to get control from sheet
		Sheet sh= wb.getSheet ("Sheet1");
		//to get control from row
	     Row rw = sh.getRow(0);
	    //to get control from coloumn
	    Cell cl=rw.getCell(2);
	    //to get value of cell
	    String data=cl.getStringCellValue();
	    System.out.println(data);
	 
	 
	    
	    
	    
	    
		
		
		
		
		
		
		
		// TODO Auto-generated method stub

	}

}
