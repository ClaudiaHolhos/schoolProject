package com.example.demo.persistence.utilities;

import java.io.FileInputStream;
import java.io.IOException;

import com.example.demo.persistence.entities.Product;
import org.apache.poi.ss.usermodel.Workbook;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ProductFinder {

    private static String filePath = "C:\\Users\\Claudia\\Desktop\\Anul3sem2\\PS\\" +
            "Spring_Assig2\\spring-demo\\demo\\src\\products.xlsx";

    public List<Product> getProducts() throws IOException {

        FileInputStream excelFile = new FileInputStream(new File(filePath));
        Workbook workbook = new XSSFWorkbook(excelFile);

        org.apache.poi.ss.usermodel.Sheet sheet = workbook.getSheet("Sheet1");
        Iterator<Row> rows = sheet.iterator();

        List<Product> products = new ArrayList<Product>();

        while (rows.hasNext()) {
            Product p = new Product();
            Row currentRow = rows.next();
            Iterator<Cell> cellsInRow = currentRow.iterator();

            p.setName(String.valueOf(cellsInRow.next()));
            p.setSubcategory(String.valueOf(cellsInRow.next()));
            p.setCategory(String.valueOf(cellsInRow.next()));
            int price = Double.valueOf(String.valueOf(cellsInRow.next())).intValue();
            p.setPrice(price);
            p.setStock(Double.valueOf(String.valueOf(cellsInRow.next())).intValue());
            p.setPicture(String.valueOf(cellsInRow.next()));
            System.out.println(p);
            products.add(p);
        }
        workbook.close();
        excelFile.close();

        return products;

    }

}
