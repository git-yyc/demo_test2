package com.util;

import org.apache.poi.hssf.usermodel.*;
import org.springframework.stereotype.Component;

import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Component
public class ExcelUtil {

    public  void downLoadExcel(List<Map<String,Object>> dataList)throws Exception{
        //创建工作薄对象
        HSSFWorkbook workbook=new HSSFWorkbook();//这里也可以设置sheet的Name
        //创建工作表对象
        HSSFSheet sheet = workbook.createSheet();
        //创建工作表的行
        HSSFRow row = sheet.createRow(0);//设置第一行，从零开始
        row.createCell(2).setCellValue("aaaaaaaaaaaa");//第一行第三列为aaaaaaaaaaaa
        row.createCell(0).setCellValue(new Date());//第一行第一列为日期
        workbook.setSheetName(0,"sheet的Name");//设置sheet的Name


        //文档输出
        FileOutputStream out = new FileOutputStream("/Users/wangjun/temp/" + new SimpleDateFormat("yyyyMMddHHmmss").format(new Date()).toString() +".xlsx");
        workbook.write(out);
        out.close();

    }

}
