package com.demoguru_kickstartoffproject;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Readexcel {

	public static void main(String[] args) throws InvalidFormatException, IOException {

		File f=new File("C:\\Users\\Dell\\eclipse-workspace\\Project_KickOff\\Excel\\Datasheet.xlsx");
		FileInputStream s=new FileInputStream(f);
		Workbook w=new XSSFWorkbook(f);
		Sheet s1=w.getSheet("Datasheet");
		Row r=s1.getRow(1);
		Cell c=r.getCell(1);
		System.out.println(c);
		
		
		
		
	}

}
