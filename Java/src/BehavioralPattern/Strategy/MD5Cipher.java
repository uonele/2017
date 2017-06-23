package BehavioralPattern.Strategy;
import java.security.MessageDigest;

/**
 * Created by uonele on 2016/12/25.
 */
public class MD5Cipher implements Cipher {
    @Override
    public byte[] doEncrypy(byte[] key) throws Exception {
        String KEY_MD5 = "MD5";
        MessageDigest md5 = MessageDigest.getInstance(KEY_MD5);
        md5.update(key);

        return md5.digest();
    }
}
