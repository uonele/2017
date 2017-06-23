package BehavioralPattern.Strategy;

/**
 * Created by uonele on 2016/12/25.
 */
public class DataOperation {
    private Cipher cipher;
    public void setCipher(Cipher cipher){
        this.cipher = cipher;
    }
    public byte[] deEncrypt(byte[] key) throws Exception{
        return this.cipher.doEncrypy(key);
    }
}
