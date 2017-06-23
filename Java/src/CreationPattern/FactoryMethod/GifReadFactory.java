package CreationPattern.FactoryMethod;
public class GifReadFactory implements ImageReadFactory {
	@Override
	public ImageReader createImageReader() {
		// TODO Auto-generated method stub
		System.out.println("gif工厂工作中。。");
		return new GifReader();
	}
}
