package com.example.fhw_springboot.Service;

import com.alibaba.fastjson.JSON;
import com.example.fhw_springboot.Entity.PayEntity;
import com.example.fhw_springboot.Entity.PopPayEntity;
import com.example.fhw_springboot.Entity.ZhouhuilingEntity;
import com.example.fhw_springboot.Entity.popSettleEntity;
import com.example.fhw_springboot.Tools.MoneyUtil;
import org.apache.ibatis.annotations.Param;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import javax.annotation.Resource;
import java.io.FileInputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.nio.ByteBuffer;
import java.nio.channels.*;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class ExcelService {
    private XSSFSheet sheet;
    ExcelService(String filePath, String sheetName){
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(filePath);
            XSSFWorkbook sheets = new XSSFWorkbook(fileInputStream);
            //获取sheet
            sheet = sheets.getSheet(sheetName);
            System.out.println(Objects.isNull(sheet));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    /**
     * 根据行和列的索引获取单元格的数据
     * @param row
     * @param column
     * @return
     */
    public String getExcelDateByIndex(int row,int column){
        XSSFRow row1 = sheet.getRow(row);
//        System.out.println(row1.toString());
        String cell = row1.getCell(column).toString();
        return cell;
    }

    /**
     * 根据某一列值为“******”的这一行，来获取该行第x列的值
     * @param caseName
     * @param currentColumn 当前单元格列的索引
     * @param targetColumn 目标单元格列的索引
     * @return
     */
    public String getCellByCaseName(String caseName,int currentColumn,int targetColumn){
        String operateSteps="";
        //获取行数
        int rows = sheet.getPhysicalNumberOfRows();
        for(int i=0;i<rows;i++){
            XSSFRow row = sheet.getRow(i);
            String cell = row.getCell(currentColumn).toString();
            if(cell.equals(caseName)){
                operateSteps = row.getCell(targetColumn).toString();
                break;
            }
        }
        return operateSteps;
    }
    public List<ZhouhuilingEntity> readZhouhuiling(Integer rows) {
        List<ZhouhuilingEntity> zhouhuiling = new ArrayList<>();
        for (int i = 1; i < rows; i++) {
            ZhouhuilingEntity zhl = new ZhouhuilingEntity();
            String zhlId = this.getExcelDateByIndex(i, 1);
            zhl.setId(zhlId);
            BigDecimal zhlNonTaxMoney = new BigDecimal(this.getExcelDateByIndex(i, 15));
            zhl.setNonTaxMoney(zhlNonTaxMoney);
            BigDecimal zhlTotalMoney = new BigDecimal(this.getExcelDateByIndex(i, 17));
            zhl.setTotalMoney(zhlTotalMoney);
            BigDecimal zhlTaxMoney = new BigDecimal(this.getExcelDateByIndex(i, 16));
            zhl.setTaxMoney(zhlTaxMoney);
            zhouhuiling.add(zhl);
        }
        return zhouhuiling;
    }
    public List<popSettleEntity> readPopSettle(Integer rows) {
        List<popSettleEntity> popSettle = new ArrayList<>();
        for (int i = 1; i < rows; i++) {
            popSettleEntity settle = new popSettleEntity();
            String settleId = this.getExcelDateByIndex(i, 0);
            settle.setId(settleId);
            BigDecimal settleNonTaxMoney = new BigDecimal(this.getExcelDateByIndex(i, 8));
            settleNonTaxMoney = settleNonTaxMoney.divide(new BigDecimal(100));
            settle.setNonTaxMoney(settleNonTaxMoney);
            BigDecimal settleTotalMoney = new BigDecimal(this.getExcelDateByIndex(i, 7));
            settleTotalMoney = settleTotalMoney.divide(new BigDecimal(100));
            settle.setTotalMoney(settleTotalMoney);
            BigDecimal settleTaxMoney = new BigDecimal(this.getExcelDateByIndex(i, 9));
            settleTaxMoney = settleTaxMoney.divide(new BigDecimal(100));
            settle.setTaxMoney(settleTaxMoney);
            String finalBillId = this.getExcelDateByIndex(i, 18);
            settle.setFinalBillId(finalBillId);
            String settle_Id = this.getExcelDateByIndex(i, 17);
            popSettle.add(settle);
//            if (finalBillId.equals("0")){
//                popSettle.add(settle);
//            }
        }
        return popSettle;
    }
    public List<PayEntity> readPay(Integer rows) {
        List<PayEntity> pays = new ArrayList<>();
        for (int i = 1; i < rows; i++) {
            PayEntity settle = new PayEntity();
            String settleId = this.getExcelDateByIndex(i, 6);
            settle.setId(settleId);
            BigDecimal money = new BigDecimal(this.getExcelDateByIndex(i, 3));
            settle.setMoney(money);
            Integer sourceType = Integer.valueOf(this.getExcelDateByIndex(i, 5));
            settle.setSourceType(sourceType);
            pays.add(settle);
        }
        return pays;
    }
    public List<PopPayEntity> readPopPay(Integer rows) {
        List<PopPayEntity> popSettle = new ArrayList<>();
        for (int i = 1; i < rows; i++) {
            PopPayEntity settle = new PopPayEntity();
            String settleId = this.getExcelDateByIndex(i, 0);
            settle.setId(settleId);
            String billId = this.getExcelDateByIndex(i, 2);
            settle.setBillId(billId);
            BigDecimal money = new BigDecimal(this.getExcelDateByIndex(i, 4));
            settle.setMoney(money);
            Integer status = Integer.valueOf(this.getExcelDateByIndex(i, 3));
            settle.setStatus(status);
            popSettle.add(settle);
        }
        return popSettle;
    }
    //打印excel数据
    public void readExcelData(){
        //获取行数
        int rows = sheet.getPhysicalNumberOfRows();
        for(int i=0;i<rows;i++){
            //获取列数
            XSSFRow row = sheet.getRow(i);
            int columns = row.getPhysicalNumberOfCells();
            for(int j=0;j<columns;j++){
                String cell = row.getCell(j).toString();
                System.out.println(cell);
            }
        }
    }
    public void popCompareWithPay(ExcelService popSheet, ExcelService paySheet, Integer rows) {
        List<PayEntity> pays = paySheet.readPay(rows);
        List<PopPayEntity> popPays = popSheet.readPopPay(rows);
        BigDecimal sumPOP = BigDecimal.ZERO;
        BigDecimal sumPAY = BigDecimal.ZERO;
        for (PopPayEntity e : popPays) {
            sumPOP = MoneyUtil.sum(sumPOP, e.getMoney());
        }
        for (PayEntity e : pays) {
            sumPAY = MoneyUtil.sum(sumPAY, e.getMoney());
        }
        sumPAY = MoneyUtil.scaleTwoPoint(sumPAY);
        System.out.println(sumPAY + " and " + sumPOP);
    }

    public static void main(String[] args) throws IOException {

        ServerSocketChannel server  = ServerSocketChannel.open();
        server.configureBlocking(false);
        server.bind(new InetSocketAddress(6666));
        Selector selector = Selector.open();
        server.register(selector, SelectionKey.OP_ACCEPT);

        while (selector.select() > 0) {
            Iterator<SelectionKey> iterator = selector.selectedKeys().iterator();

            while (iterator.hasNext()) {
                SelectionKey selectionKey = iterator.next();
                if (selectionKey.isAcceptable()) {
                    SocketChannel client = server.accept();
                    client.configureBlocking(false);
                    client.register(selector, SelectionKey.OP_READ);
                } else if (selectionKey.isReadable()){
                    SocketChannel client = (SocketChannel) selectionKey.channel();

                    ByteBuffer buffer = ByteBuffer.allocate(1024);

                    FileChannel outChannel = FileChannel.open(Paths.get("2.png"), StandardOpenOption.WRITE, StandardOpenOption.CREATE);

                    while (client.read(buffer) > 0) {

                        buffer.flip();
                        outChannel.write(buffer);
                        buffer.clear();
                    }


                }
                iterator.remove();
            }
        }
    }
}