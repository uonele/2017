package BehavioralPattern.Strategy;
import java.security.MessageDigest;

import javax.crypto.KeyGenerator;
import javax.crypto.Mac;
import javax.crypto.SecretKey;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;
/**
 * Created by uonele on 2016/12/25.
 */
public class SHACipher implements Cipher{
    /**
     * SHA加密
     *
     * @param key
     * @return
     * @throws Exception
     */
    @Override
    public byte[] doEncrypy(byte[] key) throws Exception{
        String KEY_SHA = "SHA";
        MessageDigest sha = MessageDigest.getInstance(KEY_SHA);
        sha.update(key);
        return sha.digest();
    }
}
