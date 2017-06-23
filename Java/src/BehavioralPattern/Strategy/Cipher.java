package BehavioralPattern.Strategy;

/**
 * Created by uonele on 2016/12/25.
 */
public interface Cipher {
    public byte[] doEncrypy(byte[] key) throws Exception;
}
