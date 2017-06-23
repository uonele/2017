package CreationPattern.FactoryMethod;
public class JpgReader implements ImageReader {

	@Override
	public void readImage() {
		// TODO Auto-generated method stub
			System.out.println("成功读取jpg文件");
	}
}
