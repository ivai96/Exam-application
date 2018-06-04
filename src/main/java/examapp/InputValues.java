package examapp;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

//import com.itextpdf.io.font.PdfEncodings;
//import com.itextpdf.kernel.font.PdfFont;
//import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.layout.element.Text;

public class InputValues {

	public static List<Text> inputFieldsStudent()
	{
		Scanner reader = new Scanner(System.in);
		List<Text> textFieldsStudent = new ArrayList<Text>();
		
		System.out.println("������� ��������: ");
	    String facultyName = reader.nextLine();
	    Text text1 = new Text(facultyName);
	    text1.setUnderline();
	    textFieldsStudent.add(text1);
		
		System.out.println("������� ������� �� ����������: ");
		String subjectName = reader.nextLine();
		Text text2 = new Text(subjectName);
		textFieldsStudent.add(text2);
		
	    System.out.println("������� ������� ���: ");
	    String examsPeriod = reader.nextLine();
	    Text text3 = new Text(examsPeriod);	    
	    textFieldsStudent.add(text3);
	    
	    System.out.println("�� �� ��� �� �������� �������: ");
	    String attemptsNumber = reader.nextLine();
	    Text text4 = new Text(attemptsNumber);	   
	    textFieldsStudent.add(text4);    
	    
	    System.out.println("������� ��� � �������: ");
	    String nameSurname = reader.nextLine();
	    Text text5 = new Text(nameSurname);
	    text5.setUnderline();
	    textFieldsStudent.add(text5);
	    
	    DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
	    Date date = new Date();
	    
	    Text text6 = new Text(dateFormat.format(date));
	    text6.setUnderline();
	    textFieldsStudent.add(text6);
	
	    System.out.println("������� ������� ���: ");
	    String embgNo = reader.nextLine();    
	    Text EMBG = new Text(embgNo);
	    EMBG.setUnderline();
	    textFieldsStudent.add(EMBG);   
	  
	    System.out.println("������� �����: ");
	    String city = reader.nextLine();
	    Text text7 = new Text(city);
	    textFieldsStudent.add(text7);
	    
	   
	return textFieldsStudent; 
	}
	
	public static List<Text> inputFieldsProfeessor()
	{
		Scanner reader = new Scanner(System.in);
		List<Text> textFieldsProfessor = new ArrayList<Text>();
		
		System.out.println("�������: ");
		String facultyName = reader.nextLine();
		Text facultyNameTxt = new Text(facultyName);
		facultyNameTxt.setUnderline();
		textFieldsProfessor.add(facultyNameTxt);
		
		System.out.println("����� �� ��� ���������: ");
		String prvKolok = reader.nextLine();
		Text prvKolokTxt = new Text(prvKolok);		
		textFieldsProfessor.add(prvKolokTxt);
		
		System.out.println("����� �� ���� ���������: ");
		String vtorKolok = reader.nextLine();
		Text vtorKolokTxt = new Text(vtorKolok);		
		textFieldsProfessor.add(vtorKolokTxt);
		
		System.out.println("�������� ����� �� ���������/������� ���������: ");
		String prosecnoPoeni = reader.nextLine();
		Text prosecnoPoeniTxt = new Text(prosecnoPoeni);		
		textFieldsProfessor.add(prosecnoPoeniTxt);
		
		System.out.println("��������� � ��������� �� ���������: ");
		String prisustvoAtivnost = reader.nextLine();
		Text prisustvoAtivnostTxt = new Text(prisustvoAtivnost);		
		textFieldsProfessor.add(prisustvoAtivnostTxt);
		
		System.out.println("��������� � ��������� �� �����: ");
		String prisustvoAtivnostVezbi = reader.nextLine();
		Text prisustvoAtivnostVezbiTxt = new Text(prisustvoAtivnostVezbi);		
		textFieldsProfessor.add(prisustvoAtivnostVezbiTxt);
		
		System.out.println("��������� �� ���������� ����: ");
		String seminarskiTrud = reader.nextLine();
		Text seminarskiTrudTxt = new Text(seminarskiTrud);		
		textFieldsProfessor.add(seminarskiTrudTxt);
			
		System.out.println("��������� (�������) ������: ");
		String domasnaRabota = reader.nextLine();
		Text domasnaRabotaTxt = new Text(domasnaRabota);		
		textFieldsProfessor.add(domasnaRabotaTxt);
		
		System.out.println("���������� ��� ����������� ������� / ��������: ");
		String realiziraniProgrami = reader.nextLine();
		Text realiziraniProgramiTxt = new Text(realiziraniProgrami);		
		textFieldsProfessor.add(realiziraniProgramiTxt);
		
		System.out.println("�����: ");
		String drugo = reader.nextLine();
		Text drugoTxt = new Text(drugo);		
		textFieldsProfessor.add(drugoTxt);
		
		System.out.println("������: ");
		String vkupno = reader.nextLine();
		Text vkupnoTxt = new Text(vkupno);		
		textFieldsProfessor.add(vkupnoTxt);
		
		System.out.println("����� ��. ");
		String dosie = reader.nextLine();
		Text dosieTxt = new Text(dosie);		
		textFieldsProfessor.add(dosieTxt);
		
		System.out.println("�������� ��������: ");
		String studiskaPrograma = reader.nextLine();
		Text studiskaProgramaTxt = new Text(studiskaPrograma);		
		textFieldsProfessor.add(studiskaProgramaTxt);
		
		System.out.println("������: ");
		String ciklus = reader.nextLine();
		Text ciklusTxt = new Text(ciklus);		
		textFieldsProfessor.add(ciklusTxt);
		
		System.out.println("������: ");
		String status = reader.nextLine();
		Text statusTxt = new Text(status);		
		textFieldsProfessor.add(statusTxt);
		
		System.out.println("��������: ");
		String kandidat = reader.nextLine();
		Text kandidatTxt = new Text(kandidat);		
		textFieldsProfessor.add(kandidatTxt);
		
		System.out.println("�������: ");
		String predmet = reader.nextLine();
		Text predmetTxt = new Text(predmet);		
		textFieldsProfessor.add(predmetTxt);
		
		System.out.println("����� ��� �� �������� �� ����������� ������ �������� �����: ");
		String redenBr = reader.nextLine();
		Text redenBrTxt = new Text(redenBr);		
		textFieldsProfessor.add(redenBrTxt);
			
		System.out.println("������� ���� �� ��������: ");
		String dat�Polaganje = reader.nextLine();
		Text dat�PolaganjeTxt = new Text(dat�Polaganje);
		textFieldsProfessor.add(dat�PolaganjeTxt);
		
		System.out.println("������ �� ������ �����: ");
		String bodPismen = reader.nextLine();
		Text bodPismenTxt = new Text(bodPismen);		
		textFieldsProfessor.add(bodPismenTxt);
		
		System.out.println("������ �� ���� �����: ");
		String bodUsen = reader.nextLine();
		Text bodUsenTxt = new Text(bodUsen);		
		textFieldsProfessor.add(bodUsenTxt);
		
		System.out.println("����� ������: ");
		String opstaOcenka = reader.nextLine();
		Text opstaOcenkaTxt = new Text(opstaOcenka);		
		textFieldsProfessor.add(opstaOcenkaTxt);
		
		System.out.println("�����: ");
		String mesto = reader.nextLine();
		Text mestoTxt = new Text(mesto);		
		textFieldsProfessor.add(mestoTxt);
		
		System.out.println("������� ���� �� ������: ");
		String dataPotpis = reader.nextLine();
		Text dataPotpisTxt = new Text(dataPotpis);
		textFieldsProfessor.add(dataPotpisTxt);			    
		
	    return textFieldsProfessor;
	    
}
}