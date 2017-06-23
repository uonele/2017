package CreationPattern.FactoryMethod;

import java.awt.Image;
import java.awt.image.RenderedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class JpgReadFactory implements ImageReadFactory {

	@Override
	public ImageReader createImageReader() {
		// TODO Auto-generated method stub
		System.out.println("jpg工厂工作中。。");
		return new JpgReader();
	}
}
