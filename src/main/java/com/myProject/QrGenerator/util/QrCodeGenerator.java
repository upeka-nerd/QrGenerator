package com.myProject.QrGenerator.util;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;
import com.myProject.QrGenerator.model.student.Student;

import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;

public class QrCodeGenerator {


   public static void generateQrCode(Student student) throws WriterException, IOException {

      String QrCodepath="D:\\new-projects\\generated Qr codes";
      String QrCodeName=QrCodepath+student.getFirstName()+student.getId()+"QR CODE";
      var QrCodeWriter=new QRCodeWriter();
      BitMatrix bitMatrix=QrCodeWriter.encode("ID"+student.getId()+"\n"+"First:"+student.getFirstName()+
              "\n"+"lastName:"+student.getLastName()+"email:"+student.getEmail()+"\n"+"mobile:"+student.getMobile(),
              BarcodeFormat.QR_CODE,400,400);

      Path path = FileSystems.getDefault().getPath(QrCodeName);
      MatrixToImageWriter.writeToPath(bitMatrix,"PNG",path);
   }








}
