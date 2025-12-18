
// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
import java.awt.Color;
/**
 * Demonstrates the greyscale and morphing operation featured by Runigram.java. 
 * The program recieves three command-line arguments: a string representing the name
 * of the PPM file of a source image,and the number of morphing steps (an int). 
 * For example, to morph the thor into greyscaled thor in 50 steps, use:
 * java Editor4 thor.ppm 50
 * Note: There is no need to scale the target image to the size of the source
 * image, since Runigram.morph performs this action.
 */
public class Editor4 {
   public Editor4() {
   }

   public static void main(String[] var0) {
      String var1 = var0[0];
      int var2 = Integer.parseInt(var0[1]);
      Color[][] var3 = Runigram.read(var1);
      Color[][] var4 = Runigram.grayScaled(var3);
      Runigram.morph(var3, var4, var2);
   }
}
