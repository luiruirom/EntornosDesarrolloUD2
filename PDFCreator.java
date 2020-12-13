package es.iessoterohernandez.endes.HelloWorldPdf;

import java.io.FileNotFoundException;

import com.itextpdf.*;
import com.itextpdf.kernel.geom.PageSize;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;

public class PDFCreator {
	
	public static final String DEST = "HolaMundo.pdf";
	
    public static void main( String[] args ) throws FileNotFoundException{
    	
    	
    	PdfDocument pdf = new PdfDocument(new PdfWriter(DEST));
        Document document = new Document(pdf);
        String line = "Hola Mundo";
        document.add(new Paragraph(line));
        document.close();

    }
}
