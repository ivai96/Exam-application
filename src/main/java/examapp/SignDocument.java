package examapp;

import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.kernel.geom.Rectangle;
import com.itextpdf.kernel.pdf.PdfReader;
import com.itextpdf.signatures.BouncyCastleDigest;
import com.itextpdf.signatures.DigestAlgorithms;
import com.itextpdf.signatures.IExternalDigest;
import com.itextpdf.signatures.IExternalSignature;
import com.itextpdf.signatures.PdfSignatureAppearance;
import com.itextpdf.signatures.PdfSigner;
import com.itextpdf.signatures.PrivateKeySignature;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.PrivateKey;
import java.security.Security;
import java.security.cert.Certificate;
import java.util.Scanner;

import javax.swing.JFileChooser;

import org.bouncycastle.jce.provider.BouncyCastleProvider;

public class SignDocument {
//    public static final String KEYSTORE = "C:/Users/Ivana/workspace/ExamApplication/src/main/resources/ks";
//    public static final char[] PASSWORD = "password".toCharArray();
//    public static final String SRC = "results/chapter01/hello_world.pdf";
//    public static final String DEST = "results/chapter01/hello_worldCopy.pdf";
    public static char[] PASSWORD;
    public static String KEYSTORE;
    
    
    public void sign(String src, String dest,
                     Certificate[] chain,
                     PrivateKey pk, String digestAlgorithm, String provider,
                     PdfSigner.CryptoStandard subfilter, String nameSurname, boolean isStudent)
            throws GeneralSecurityException, IOException {
        // Creating the reader and the signer
    	   	
        PdfReader reader = new PdfReader(src);
        
        PdfFont cyrilic = PdfFontFactory.createFont(RegistrationForExamAppearance.FONT, "CP1251", true);
        
        PdfSigner signer = new PdfSigner(reader, new FileOutputStream(dest), false);
        // Creating the appearance
        PdfSignatureAppearance appearance = signer.getSignatureAppearance()        		
        		.setReasonCaption("")
        		.setLocationCaption("")
                .setReuseAppearance(false)
                .setLayer2Text(nameSurname)
                .setLayer2FontSize(10)
                .setLayer2Font(cyrilic);
        Rectangle rect;
        if(isStudent)
        	rect = new Rectangle(428,54, 100, 40);
        else
        	rect = new Rectangle(450, 83, 100, 40);
        appearance
                .setPageRect(rect)
                .setPageNumber(1);
        signer.setFieldName("sig");
        // Creating the signature
        IExternalSignature pks = new PrivateKeySignature(pk, digestAlgorithm, provider);
        IExternalDigest digest = new BouncyCastleDigest();
        signer.signDetached(digest, pks, chain, null, null, null, 0, subfilter);
    }

    
    public void getKeyStore()
    {    
    	System.out.println("Ве молам одеберете го вашиот сертификат");
    boolean vneseno = false;	
	while (!vneseno)
	{
		JFileChooser fileChooser = new JFileChooser();
		fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
		int result = fileChooser.showOpenDialog(null);
		if (result == JFileChooser.APPROVE_OPTION) 
		{
			File selectedFile = fileChooser.getSelectedFile();
			KEYSTORE = selectedFile.toString();
			KEYSTORE = KEYSTORE.replaceAll("\\\\", "/");		
			vneseno = true;
		}
		else{
			System.out.println("Нема одбрано документ, ве молам одберете за да продолжите!");						
		}
      }
    }
    
    public void getPassword()
    {

    	System.out.println("Внесете password од вашиот сертификат: ");
    	Scanner reader23 = new Scanner(System.in);
    	PASSWORD = reader23.nextLine().toCharArray();  
    	reader23.close();
    }

    public void execute(boolean isStudent) throws GeneralSecurityException, IOException {
    	
    	  SignDocument app = new SignDocument();
    	  Scanner sc = new Scanner(System.in);
      	System.out.println("Внесете име и презиме");
      		String nameSurname = sc.nextLine();
    	  getPassword();
    	  getKeyStore();
        BouncyCastleProvider provider = new BouncyCastleProvider();
        Security.addProvider(provider);
        KeyStore ks = KeyStore.getInstance(KeyStore.getDefaultType());
        ks.load(new FileInputStream(KEYSTORE), PASSWORD);
        String alias = ks.aliases().nextElement();
        PrivateKey pk = (PrivateKey) ks.getKey(alias, PASSWORD);
        Certificate[] chain = ks.getCertificateChain(alias);
        
        String signedDest = MainClass.DEST;
        signedDest = signedDest.substring(0, signedDest.length()-4)+"Signed"+signedDest.substring(signedDest.length()-4, signedDest.length());
                
        
        app.sign(MainClass.DEST, signedDest, chain, pk, DigestAlgorithms.SHA256, provider.getName(), PdfSigner.CryptoStandard.CMS, nameSurname, isStudent);
        System.out.println("Пријавата е генерирана");
    }

}