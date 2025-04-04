//package InterfaceDay6;
//
//import java.io.UnsupportedEncodingException;
//import java.security.InvalidKeyException;
//import java.security.KeyPair;
//import java.security.KeyPairGenerator;
//import java.security.NoSuchAlgorithmException;
//import java.security.PublicKey;
//import java.security.Signature;
//
//import javax.crypto.BadPaddingException;
//import javax.crypto.Cipher;
//import javax.crypto.IllegalBlockSizeException;
//import javax.crypto.NoSuchPaddingException;
//
//interface EnyDeyInter{
//	public void encrypt() throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException, UnsupportedEncodingException;
//	public void decrypt() throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException, UnsupportedEncodingException;
//}
//
//class ApplyEnyDey implements EnyDeyInter{
//	public byte[]  cipherText;
//	@Override
//	public void encrypt() throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException, UnsupportedEncodingException {
//		// TODO Auto-generated method stub
//		
//		
//		 Signature sign = Signature.getInstance("Shehryar");
//	      
//	      //Creating KeyPair generator object
//	      KeyPairGenerator keyPairGen = KeyPairGenerator.getInstance("RSA");
//	      
//	      //Initializing the key pair generator
//	      keyPairGen.initialize(2048);
//	      
//	      //Generating the pair of keys
//	      KeyPair pair = keyPairGen.generateKeyPair();      
//		
//	      //Creating a Cipher object
//	      Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
//	        
//	      //Initializing a Cipher object
//	      cipher.init(Cipher.ENCRYPT_MODE, pair.getPublic());
//		  
//	      //Adding data to the cipher
//	      byte[] input = "Welcome to Tutorialspoint".getBytes();	  
//	      cipher.update(input);
//		  
//	      //encrypting the data
//	      cipherText = cipher.doFinal();	 
//	      System.out.println(new String(cipherText, "UTF8"));
//	      
//	      
//	      System.out.println(cipherText);
//		
//	}
//
//	@Override
//	public void decrypt() throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException, UnsupportedEncodingException {
//		// TODO Auto-generated method stub
//		
//		 Signature sign = Signature.getInstance(cipherText);
//	      
//	      //Creating KeyPair generator object
//	      KeyPairGenerator keyPairGen = KeyPairGenerator.getInstance("RSA");
//	      
//	      //Initializing the key pair generator
//	      keyPairGen.initialize(2048);
//	      
//	      //Generate the pair of keys
//	      KeyPair pair = keyPairGen.generateKeyPair();   
//	      
//	      //Getting the public key from the key pair
//	      PublicKey publicKey = pair.getPublic();  
//
//	      //Creating a Cipher object
//	      Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
//
//	      //Initializing a Cipher object
//	      cipher.init(Cipher.ENCRYPT_MODE, publicKey);
//		  
//	      //Add data to the cipher
//	      byte[] input = "Welcome to Tutorialspoint".getBytes();	  
//	      cipher.update(input);
//		  
//	      //encrypting the data
//	      byte[] cipherText = cipher.doFinal();	 
//	      System.out.println( new String(cipherText, "UTF8"));
//
//	      //Initializing the same cipher for decryption
//	      cipher.init(Cipher.DECRYPT_MODE, pair.getPrivate());
//	      
//	      //Decrypting the text
//	      byte[] decipheredText = cipher.doFinal(cipherText);
//	      System.out.println(new String(decipheredText));
//	      
//	      System.out.println(decipheredText);
//		
//	}}
//
//public class JavaEncryptionDecryptionMain10 {
//
//	public static void main(String[] args) throws InvalidKeyException, NoSuchAlgorithmException, NoSuchPaddingException, IllegalBlockSizeException, BadPaddingException, UnsupportedEncodingException {
//		// TODO Auto-generated method stub
//
//		ApplyEnyDey obj = new ApplyEnyDey();
////		obj.encrypt();
//		obj.decrypt();
//	}
//
//}








package InterfaceDay6;

import java.io.UnsupportedEncodingException;
import java.security.*;
import javax.crypto.*;

interface EnyDeyInter {
    void encrypt() throws Exception;
    void decrypt() throws Exception;
}

class ApplyEnyDey implements EnyDeyInter {
    private byte[] cipherText;
    private KeyPair keyPair;
    private final String plainText;
    
    public ApplyEnyDey(String name) {
        this.plainText = name;
        generateKeyPair();
    }

    private void generateKeyPair() {
        try {
            KeyPairGenerator keyPairGen = KeyPairGenerator.getInstance("RSA");
            keyPairGen.initialize(2048);
            this.keyPair = keyPairGen.generateKeyPair();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("RSA algorithm not available", e);
        }
    }

    @Override
    public void encrypt() throws Exception {
        Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
        cipher.init(Cipher.ENCRYPT_MODE, keyPair.getPublic());
        
        byte[] input = plainText.getBytes("UTF-8");
        cipherText = cipher.doFinal(input);
        System.out.println("Encrypted: " + bytesToHex(cipherText));
    }

    @Override
    public void decrypt() throws Exception {
        if (cipherText == null) {
            throw new IllegalStateException("Encrypt first before decrypting");
        }
        
        Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
        cipher.init(Cipher.DECRYPT_MODE, keyPair.getPrivate());
        
        byte[] decryptedBytes = cipher.doFinal(cipherText);
        String decryptedText = new String(decryptedBytes, "UTF-8");
        System.out.println("Decrypted: " + decryptedText);
    }

    private static String bytesToHex(byte[] bytes) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bytes) {
            sb.append(String.format("%02X", b));
        }
        return sb.toString();
    }
}

public class JavaEncryptionDecryptionMain10 {
    public static void main(String[] args) {
        try {
            String yourName = "Shehryar"; // Replace with your name
            ApplyEnyDey crypto = new ApplyEnyDey(yourName);
            
            System.out.println("Original: " + yourName);
            crypto.encrypt();
            crypto.decrypt();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}