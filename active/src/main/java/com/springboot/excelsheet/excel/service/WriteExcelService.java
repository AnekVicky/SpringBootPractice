package com.springboot.excelsheet.excel.service;
/*
created by ANEK SINGH on 4/26/2020
*/

import com.springboot.excelsheet.excel.model.Player;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Service;
import javax.sql.DataSource;


import java.io.FileOutputStream;
import java.util.Arrays;
import java.util.List;

@Service
public class WriteExcelService {

public void writeData(){
    List<Player> list = Arrays.asList(

      new Player("Anek","India"),
      new Player("Lalu","Thailand"),
            new Player("Pele","Argentina")
    );

    List<String> headers = Arrays.asList("Player_Name","Player_Country");

      try {

            Workbook workbook = new XSSFWorkbook();
            Sheet sheet = workbook.createSheet("players_details");
            System.out.println("No of sheets" + workbook.getNumberOfSheets());


            // For Header
            Row rowHeader = sheet.createRow(0);
            for(int rn=0; rn < headers.size(); rn++){


                Cell cell = rowHeader.createCell(rn);
                cell.setCellValue(headers.get(rn));


            }


            int rowIndex = 0;
            for(Player player : list){

                Row row = sheet.createRow(++rowIndex);
                Cell cell0 = row.createCell(0);
                cell0.setCellValue(player.getPlayerName());

                Cell cell1 = row.createCell(1);
                cell1.setCellValue(player.getPlayerCountry());


            }


          FileOutputStream fos = new FileOutputStream("hockey_players.xlsx");
          workbook.write(fos);


        } catch (Exception ioe) {

            ioe.printStackTrace();

        }


    }
}

