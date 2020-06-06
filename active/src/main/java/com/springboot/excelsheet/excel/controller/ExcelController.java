package com.springboot.excelsheet.excel.controller;

import com.springboot.excelsheet.excel.model.Player;
import com.springboot.excelsheet.excel.service.ReadExcelService;
import com.springboot.excelsheet.excel.service.WriteExcelService;
import com.springboot.profiles.active.exception.ApiRequestException;
import org.apache.poi.ss.usermodel.Workbook;
import org.hibernate.jdbc.Work;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.List;

@RestController
public class ExcelController {

    @Autowired
    ReadExcelService readExcelService;

    @Autowired
    WriteExcelService writeExcelService;

    @GetMapping("/excel/read")
    public String readExcel(@AuthenticationPrincipal UserDetails details){

    String uname = details.getUsername() ;
    writeExcelService.writeData();

    readExcelService.readExcel();
    return "Hello "+ uname +" !!! ";

    }

    @GetMapping("/excel/data")
    public List<Player> getExcelData() throws Exception {

    return  readExcelService.getExcelData();

    }

    @GetMapping("/download/excel")
    public ResponseEntity<byte[]> downloadExcel() throws Exception{

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        Workbook workbook = writeExcelService.writeData();

        workbook.write(baos);

        HttpHeaders httpHeaders = new HttpHeaders();
                    httpHeaders.set("Content-Disposition" , "attachment;filename=export_data.xlsx");
                    httpHeaders.setContentLength(baos.size());

        return new ResponseEntity<>(baos.toByteArray(),httpHeaders, HttpStatus.OK);

    }


}
