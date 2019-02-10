package com.medplusrpt.view;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.web.servlet.view.document.AbstractExcelView;

import com.medplusrpt.dto.TransactionDto;

public class BankStatementXlsView extends AbstractExcelView {
	@Override
	protected void buildExcelDocument(Map<String, Object> model, HSSFWorkbook workbook, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		List<TransactionDto> transactions = null;
		HSSFSheet sheet = null;

		transactions = (List<TransactionDto>) model.get("transactions");
		sheet = workbook.createSheet("transactions");

		HSSFRow headerRow = sheet.createRow(1);
		HSSFCell cell1 = headerRow.createCell(1);
		cell1.setCellValue("transaction no");
		HSSFCell cell2 = headerRow.createCell(2);
		cell2.setCellValue("transaction date");
		HSSFCell cell3 = headerRow.createCell(3);
		cell3.setCellValue("description");
		HSSFCell cell4 = headerRow.createCell(4);
		cell4.setCellValue("amount");

		for (int i = 0; i < transactions.size(); i++) {
			TransactionDto dto = transactions.get(i);
			HSSFRow row = sheet.createRow(i + 2);
			HSSFCell c1 = row.createCell(1);
			HSSFCell c2 = row.createCell(2);
			HSSFCell c3 = row.createCell(3);
			HSSFCell c4 = row.createCell(4);

			c1.setCellValue(dto.getTransactionNo());
			c2.setCellValue(dto.getTransactionDate());
			c3.setCellValue(dto.getDescription());
			c4.setCellValue(dto.getAmount() + " " + dto.getType());
		}
	}

}
