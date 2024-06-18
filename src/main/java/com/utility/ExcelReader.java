package com.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.baseclass.Baseclass;

public class ExcelReader extends Baseclass {

	// Excel sheet read done
	// sheet done
	// particular cell data done
	// particular row data done
	// all data need improvement

	public static FileInputStream readExcelSheet(String excelname) throws FileNotFoundException {

		// System.out.println(projectpath+"src/test/resources/data.xlsx");
		FileInputStream fis = new FileInputStream(projectpath + "/src/test/resources/resources/Data/" + excelname);
		return fis;
		
	}

	public static Sheet getSheet(FileInputStream fis, String sheetname) throws EncryptedDocumentException, IOException {
		Sheet sh = WorkbookFactory.create(fis).getSheet(sheetname);
		return sh;
	}

	public static Object getSingleCellData(Sheet sh, int rownum, int cellnum) {

		if (sh.getRow(rownum).getCell(cellnum).getCellType().toString().equalsIgnoreCase("String"))
			return sh.getRow(rownum).getCell(cellnum).getStringCellValue();

		else
			return sh.getRow(rownum).getCell(cellnum).getNumericCellValue();
	}

	public static Map getRowData(Sheet sh, int rownum) {

		Map<String, Object> rowData = new HashMap<>();
		int cellnum = sh.getRow(rownum).getLastCellNum();
		for (int i = 0; i < cellnum; i++) {

			if (sh.getRow(rownum).getCell(i).getCellType().toString().equalsIgnoreCase("String"))
				rowData.put(sh.getRow(0).getCell(i).getStringCellValue(),
						sh.getRow(rownum).getCell(i).getStringCellValue());
			else
				rowData.put(sh.getRow(0).getCell(i).getStringCellValue(),
						sh.getRow(rownum).getCell(i).getNumericCellValue());
		}
		return rowData;
	}

	public void getAllExcelData(Sheet sh) {

		for (int row = 0; row < sh.getLastRowNum(); row++) {

			Map<String, Object> rowData = new HashMap<>();

			int cellnum = sh.getRow(row).getLastCellNum();
			for (int cell = 0; cell < cellnum; cell++) {

				if (sh.getRow(row).getCell(cellnum).getCellType().toString().equalsIgnoreCase("String"))
					rowData.put(sh.getRow(0).getCell(cell).getStringCellValue(),
							sh.getRow(row).getCell(cell).getStringCellValue());
				else
					rowData.put(sh.getRow(0).getCell(cell).getStringCellValue(),
							sh.getRow(row).getCell(cell).getNumericCellValue());
			}
		}
	}

}
