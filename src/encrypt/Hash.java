package encrypt;
/*
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.SecureRandom; */
/*
public class Hash {
    public static void main(String[] args) throws NoSuchAlgorithmException, NoSuchProviderException{
        String password = Prompt.getInfo();
        String saltVal = generateSalt();

        String hashedPassword = generateHash(password, saltVal);
        System.out.println(hashedPassword);
    }
*/ /*
    private static String generateSalt() throws NoSuchAlgorithmException, NoSuchProviderException {
        SecureRandom secureRandom = SecureRandom.getInstance("SHA1PRNG", "SUN");
        byte[] saltValue = new byte[16];

        secureRandom.nextBytes(saltValue);

        return saltValue.toString();
    }
*/ /*
    private static String generateHash(String password, String salt) throws NoSuchAlgorithmException {
        String hashedPassword = null;

        try {
            MessageDigest md = MessageDigest.getInstance("SHA-512");
            md.update(salt.getBytes());

            byte[] pWToBytes = md.digest(password.getBytes());
            StringBuilder sb = new StringBuilder();

            for (byte pWToByte : pWToBytes) {
                sb.append(Integer.toString((pWToByte & 0xff) + 0x100, 16).substring(1));
            }

            hashedPassword = sb.toString();
        }
        catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return hashedPassword;
    }
} */