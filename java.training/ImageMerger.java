import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.lang.Math;

public class ImageMerger {
    public static void main(String[] args) {
        try {
            // 加載兩張照片
            BufferedImage image1 = ImageIO.read(new File("C:/Users/USER/Pictures/128081_0.png"));
            BufferedImage image2 = ImageIO.read(new File("C:/Users/USER/Pictures/S__96698372.png"));

            // 確保兩張照片的尺寸相同
            int width = Math.max(2000,2000);
            int height = Math.max(2000,2000);

            // 創建一個新的 BufferedImage，尺寸為兩張照片的最大尺寸
            BufferedImage mergedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);

            // 將第一張照片繪製到新的 BufferedImage 上
            Graphics2D g2d = mergedImage.createGraphics();
            g2d.drawImage(image1, 0, 0, null);
            g2d.dispose();

            // 將第二張照片繪製到新的 BufferedImage 上
            g2d = mergedImage.createGraphics();
            g2d.drawImage(image2, 0, 0, null);
            g2d.dispose();

            // 將融合後的圖片保存到文件
            File output = new File("mergedImage.jpg");
            ImageIO.write(mergedImage, "jpg", output);

            System.out.println("圖片融合完成並保存到：" + output.getAbsolutePath());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
