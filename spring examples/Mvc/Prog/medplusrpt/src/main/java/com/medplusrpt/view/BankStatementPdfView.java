package com.medplusrpt.view;

import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.view.document.AbstractPdfView;

import com.lowagie.text.Document;
import com.lowagie.text.Table;
import com.lowagie.text.pdf.PdfWriter;
import com.medplusrpt.dto.TransactionDto;

public class BankStatementPdfView extends AbstractPdfView {
	@Override
	protected void buildPdfDocument(Map<String, Object> model, Document document, PdfWriter writer,
			HttpServletRequest request, HttpServletResponse response) throws Exception {
		List<TransactionDto> transactions = null;

		transactions = (List<TransactionDto>) model.get("transactions");
		Table table = new Table(4);
		table.addCell("Transaction No");
		table.addCell("Transaction Date");
		table.addCell("Description");
		table.addCell("Amount");
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		for (TransactionDto dto : transactions) {
			table.addCell(dto.getTransactionNo());
			table.addCell(sdf.format(dto.getTransactionDate()));
			table.addCell(dto.getDescription());
			table.addCell(dto.getAmount() + " " + dto.getType());
		}
		document.add(table);
	}

}









