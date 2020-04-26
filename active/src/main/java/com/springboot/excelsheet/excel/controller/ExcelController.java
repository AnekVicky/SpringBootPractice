package com.springboot.excelsheet.excel.controller;

import com.springboot.excelsheet.excel.model.Player;
import com.springboot.excelsheet.excel.service.ReadExcelService;
import com.springboot.profiles.active.exception.ApiRequestException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@PropertySource("classpath:application-${spring.profiles.active}.properties")
public class ExcelController {

    @Autowired
    ReadExcelService readExcelService;

 @GetMapping("/excel/read")
 public String readExcel(@AuthenticationPrincipal UserDetails details){

    String uname = details.getUsername() ;

    readExcelService.readExcel();
    return "Hello "+ uname +" !!! ";

}
 @GetMapping("/excel/data")
 public List<Player> getExcelData(){

   return  readExcelService.getExcelData();
}


}