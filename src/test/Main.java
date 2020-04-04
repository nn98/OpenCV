package test;

import java.util.ArrayList;
import java.util.List;

import org.opencv.core.Mat;
import org.opencv.core.MatOfPoint;
import org.opencv.core.Point;
import org.opencv.core.Rect;
import org.opencv.core.Scalar;
import org.opencv.imgproc.Imgproc;

public class Main {

//	static private void testContour(Mat imageMat) {  
//	    Mat rgb = new Mat();  //rgb color matrix
//	    rgb = imageMat.clone();
//	    Mat grayImage = new Mat();  //grey color matrix
//	    Imgproc.cvtColor(rgb, grayImage, Imgproc.COLOR_RGB2GRAY);
//
//	    Mat gradThresh = new Mat();  //matrix for threshold 
//	    Mat hierarchy = new Mat();    //matrix for contour hierachy
//	    List<MatOfPoint> contours = new ArrayList<MatOfPoint>();
//	    //Imgproc.threshold(grayImage,gradThresh, 127,255,0);  global threshold
//	    Imgproc.adaptiveThreshold(grayImage, gradThresh, 255, Imgproc.ADAPTIVE_THRESH_MEAN_C, Imgproc.THRESH_BINARY_INV, 3, 12);  //block size 3
//	    Imgproc.findContours(gradThresh, contours, hierarchy, Imgproc.RETR_EXTERNAL, Imgproc.CHAIN_APPROX_SIMPLE, new Point(0, 0));
//	    if(contours.size()>0) {
//	        for(int idx = 0; idx < contours.size(); idx++) {
//	            Rect rect = Imgproc.boundingRect(contours.get(idx));
//	            if (rect.height > 10 && rect.width > 40 && !(rect.width >= 512 - 5 && rect.height >= 512 - 5)){
//	                rectangle(imageMat, new Point(rect.br().x - rect.width, rect.br().y - rect.height)
//	                        , rect.br()
//	                        , new Scalar(0, 255, 0), 5);
//	            }
//
//	        }
//	        Imgcodecs.imwrite("/tmp/dev/doc_original.jpg", rgb);
//	        Imgcodecs.imwrite("/tmp/dev/doc_gray.jpg", grayImage);
//	        Imgcodecs.imwrite("/tmp/dev/doc_thresh.jpg", gradThresh);
//	        Imgcodecs.imwrite("/tmp/dev/doc_contour.jpg", imageMat);
//	    }
//	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
