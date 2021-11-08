package by.epam.learn.strings.security;

import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Base64;

public class Main {
    public static void main(String[] args) {
        String unencrypted = "very_Strong_pass7";
        byte[] bytes = null;
        byte[] bytes1;
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            messageDigest.update(unencrypted.getBytes("utf-8"));
            bytes = messageDigest.digest();
        } catch (NoSuchAlgorithmException | UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        BigInteger bigInteger = new BigInteger(1,bytes);
        String resultEncrypted = bigInteger.toString(16);
        System.out.println(resultEncrypted);
        System.out.println(Arrays.toString(bytes));
        Base64.Encoder encoder = Base64.getEncoder();
        bytes1 = encoder.encode(unencrypted.getBytes());
        System.out.println(Arrays.toString(bytes1));
    }
}
