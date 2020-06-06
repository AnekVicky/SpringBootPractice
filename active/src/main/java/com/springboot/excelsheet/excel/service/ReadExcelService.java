package com.springboot.excelsheet.excel.service;

import com.springboot.excelsheet.excel.model.Player;
import com.springboot.excelsheet.excel.repository.ExcelRepository;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
public class ReadExcelService {

    @Autowired
    private ExcelRepository excelRepository ;

    public void readExcel() {
        System.out.println("in read excel");


        try(FileInputStream fis = new FileInputStream("C:\\Users\\Abhishek\\Desktop\\ANEK\\SpringBootPractice\\active\\src\\main\\resources\\player.xlsx")){

            Workbook sheets = new XSSFWorkbook(fis);
            int numberOfSheets = sheets.getNumberOfSheets();
            System.out.println("Number of Sheets "+sheets.getNumberOfSheets());

            List<Player> list = new ArrayList<>(5);

            // iterate through the sheets
          for(int i=0 ;i<numberOfSheets ;i++){

              Sheet sheet = sheets.getSheetAt(i);

             Iterator<Row> rowIterator =  sheet.rowIterator();

             String playerName = "";
             String playerCountry = "";

             //Row Iterating
              while(rowIterator.hasNext()){

                  Row r = rowIterator.next();

                  if(r.getRowNum() == 0 ){
                      continue;
                  }

                  Iterator<Cell> cellIterator =  r.cellIterator();

                  //iterating over cells

                  while(cellIterator.hasNext()){

                     Cell cell = cellIterator.next();
                     String cellValue = cell.getStringCellValue();

                     if(cell.getColumnIndex() == 0) {

                         playerName = cellValue;

                     }else{
                         playerCountry = cellValue;
                     }

                  }//cell while

                  Player player = new Player(playerName,playerCountry);


                  list.add(player);

              } //row while
                excelRepository.saveAll(list);

          } // for sheet


            for (Player player : list) {
                System.out.println(player);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public List<Player> getExcelData() throws Exception{

       // InputStream is = getClass().getResourceAsStream("abc.txt");

        File file = new File("player.xlsx");
        FileInputStream fis = new FileInputStream(file);
        System.out.println("valu e is "+fis.toString());

       return  excelRepository.findAll();

    }
}