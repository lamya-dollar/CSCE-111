import  java.io.*;
  /*
  CSCE 111
  base file by Robert Lightfoot
  Writing file example, in a method.
  Creating ppm File output.ppm
  view at http://web.eecs.utk.edu/~smarz1/pgmview/ or
  other PPM viewers
  Fall 2020
  */
class LamyaEx6  {
  public static void main(String[] args) {
    //set the size of your square.
    //You can use user input, but validate that it is between 300 and 600.
    int mySize = 400;
    //build 3 parallel arrays. You can rename them if you want.
    int[][] red = new int[mySize][mySize];
    int[][] green = new int[mySize][mySize];
    int[][] blue = new int[mySize][mySize];
    //and idea for creating colors  - Maroon
    int maroonR = 88;
    int maroonG = 0;
    int maroonB = 0;
    // and here is White.
    int whiteR = 255;
    int whiteG = 255;
    int whiteB = 255;

    // your code here
    // Fill the arrays using loops, equations,
    // user input for color choices (validate data if you do this)
    // or use methods to do this.
    // Hint, fill with one color, then overwrite certain areas with
    // another color.

    System.out.println();
    for (int i=0; i<=399; i++) {
      for (int j=0; j<=399 ; j++ ) {
        red[i][j] = 255;
        green[i][j] = 140;
        blue[i][j] = 0;
      }
    }//orange

    for (int i=0; i<=150; i++) {
      for (int j=259; j<=399; j++ ) {
        red[i][j] = 255;
        green[i][j] = 250;
        blue[i][j] = 240;
      }
    }//floralwhite

    for (int i=0; i<=259; i++) {
      for (int j=0; j<=259 ; j++ ) {
        red[i][j] = 192;
        green[i][j] = 192;
        blue[i][j] = 192;
      }
    }//grey

    for (int i=260; i<=399; i++) {
      for (int j=0; j<=175 ; j++ ) {
        red[i][j] = 0;
        green[i][j] = 204;
        blue[i][j] = 102;
      }
    }//green

    for (int i=260; i<=399; i++) {
      for (int j=175; j<=258; j++ ) {
        red[i][j] = 178;
        green[i][j] = 102;
        blue[i][j] = 255;
      }
    }//light purple

    for (int i=259; i<=399; ++i) {
      for (int j=259; j<i; ++j) { //triangle
        red[i][j] = 255;
        green[i][j] = 255;
        blue[i][j] = 0;
      }
    }//yellow

    for (int i=0; i<=259; ++i) {
      for (int j=0; j<i; ++j) { //triangle
        red[i][j] = 0;
        green[i][j] = 0;
        blue[i][j] = 0;
      }
    }//black


    for (int i=150; i<=259; i++) {
      for (int j=260; j<=399; j++ ) {
        red[i][j] = 178;
        green[i][j] = 34;
        blue[i][j] = 34;
      }
    }//dark red

    //border vertical left
    for (int i=5; i<=20; i++) {
      for (int j=3; j<=8; j++ ) {
        red[i][j] = 0;
        green[i][j] = 102;
        blue[i][j] = 204;
      }
    }//shade of blue

    for (int i=25; i<=40; i++) {
      for (int j=3; j<=8; j++ ) {
        red[i][j] = 0;
        green[i][j] = 102;
        blue[i][j] = 204;
      }
    }

    for (int i=45; i<=60; i++) {
      for (int j=3; j<=8; j++ ) {
        red[i][j] = 0;
        green[i][j] = 102;
        blue[i][j] = 204;
      }
    }//shade of blue

    for (int i=65; i<=80; i++) {
      for (int j=3; j<=8; j++ ) {
        red[i][j] = 0;
        green[i][j] = 102;
        blue[i][j] = 204;
      }
    }//shade of blue

    for (int i=85; i<=100; i++) {
      for (int j=3; j<=8; j++ ) {
        red[i][j] = 0;
        green[i][j] = 102;
        blue[i][j] = 204;
      }
    }//shade of blue

    for (int i=105; i<=120; i++) {
      for (int j=3; j<=8; j++ ) {
        red[i][j] = 0;
        green[i][j] = 102;
        blue[i][j] = 204;
      }
    }//shade of blue

    for (int i=125; i<=140; i++) {
      for (int j=3; j<=8; j++ ) {
        red[i][j] = 0;
        green[i][j] = 102;
        blue[i][j] = 204;
      }
    }//shade of blue

    for (int i=145; i<=160; i++) {
      for (int j=3; j<=8; j++ ) {
        red[i][j] = 0;
        green[i][j] = 102;
        blue[i][j] = 204;
      }
    }//shade of blue

    for (int i=165; i<=180; i++) {
      for (int j=3; j<=8; j++ ) {
        red[i][j] = 0;
        green[i][j] = 102;
        blue[i][j] = 204;
      }
    }//shade of blue

    for (int i=185; i<=200; i++) {
      for (int j=3; j<=8; j++ ) {
        red[i][j] = 0;
        green[i][j] = 102;
        blue[i][j] = 204;
      }
    }//shade of blue

    for (int i=205; i<=220; i++) {
      for (int j=3; j<=8; j++ ) {
        red[i][j] = 0;
        green[i][j] = 102;
        blue[i][j] = 204;
      }
    }//shade of blue

    for (int i=225; i<=240; i++) {
      for (int j=3; j<=8; j++ ) {
        red[i][j] = 0;
        green[i][j] = 102;
        blue[i][j] = 204;
      }
    }//shade of blue

    for (int i=245; i<=260; i++) {
      for (int j=3; j<=8; j++ ) {
        red[i][j] = 0;
        green[i][j] = 102;
        blue[i][j] = 204;
      }
    }//shade of blue

    for (int i=265; i<=280; i++) {
      for (int j=3; j<=8; j++ ) {
        red[i][j] = 0;
        green[i][j] = 102;
        blue[i][j] = 204;
      }
    }//shade of blue

    for (int i=285; i<=300; i++) {
      for (int j=3; j<=8; j++ ) {
        red[i][j] = 0;
        green[i][j] = 102;
        blue[i][j] = 204;
      }
    }//shade of blue

    for (int i=305; i<=320; i++) {
      for (int j=3; j<=8; j++ ) {
        red[i][j] = 0;
        green[i][j] = 102;
        blue[i][j] = 204;
      }
    }//shade of blue

    for (int i=325; i<=340; i++) {
      for (int j=3; j<=8; j++ ) {
        red[i][j] = 0;
        green[i][j] = 102;
        blue[i][j] = 204;
      }
    }//shade of blue

    for (int i=345; i<=360; i++) {
      for (int j=3; j<=8; j++ ) {
        red[i][j] = 0;
        green[i][j] = 102;
        blue[i][j] = 204;
      }
    }//shade of blue

    for (int i=365; i<=380; i++) {
      for (int j=3; j<=8; j++ ) {
        red[i][j] = 0;
        green[i][j] = 102;
        blue[i][j] = 204;
      }
    }//shade of blue

    for (int i=385; i<=395; i++) {
      for (int j=3; j<=8; j++ ) {
        red[i][j] = 0;
        green[i][j] = 102;
        blue[i][j] = 204;
      }
    }//shade of blue

    //border vertical right

    for (int i=5; i<=20; i++) {
      for (int j=392; j<=397; j++ ) {
        red[i][j] = 0;
        green[i][j] = 102;
        blue[i][j] = 204;
      }
    }//shade of blue

    for (int i=25; i<=40; i++) {
      for (int j=392; j<=397; j++ ) {
        red[i][j] = 0;
        green[i][j] = 102;
        blue[i][j] = 204;
      }
    }//shade of blue

    for (int i=45; i<=60; i++) {
      for (int j=392; j<=397; j++ ) {
        red[i][j] = 0;
        green[i][j] = 102;
        blue[i][j] = 204;
      }
    }//shade of blue

    for (int i=65; i<=80; i++) {
      for (int j=392; j<=397; j++ ) {
        red[i][j] = 0;
        green[i][j] = 102;
        blue[i][j] = 204;
      }
    }//shade of blue

    for (int i=85; i<=100; i++) {
      for (int j=392; j<=397; j++ ) {
        red[i][j] = 0;
        green[i][j] = 102;
        blue[i][j] = 204;
      }
    }//shade of blue

    for (int i=105; i<=120; i++) {
      for (int j=392; j<=397; j++ ) {
        red[i][j] = 0;
        green[i][j] = 102;
        blue[i][j] = 204;
      }
    }//shade of blue

    for (int i=125; i<=140; i++) {
      for (int j=392; j<=397; j++ ) {
        red[i][j] = 0;
        green[i][j] = 102;
        blue[i][j] = 204;
      }
    }//shade of blue

    for (int i=145; i<=160; i++) {
      for (int j=392; j<=397; j++ ) {
        red[i][j] = 0;
        green[i][j] = 102;
        blue[i][j] = 204;
      }
    }//shade of blue

    for (int i=165; i<=180; i++) {
      for (int j=392; j<=397; j++ ) {
        red[i][j] = 0;
        green[i][j] = 102;
        blue[i][j] = 204;
      }
    }//shade of blue

    for (int i=185; i<=200; i++) {
      for (int j=392; j<=397; j++ ) {
        red[i][j] = 0;
        green[i][j] = 102;
        blue[i][j] = 204;
      }
    }//shade of blue

    for (int i=205; i<=220; i++) {
      for (int j=392; j<=397; j++ ) {
        red[i][j] = 0;
        green[i][j] = 102;
        blue[i][j] = 204;
      }
    }//shade of blue

    for (int i=225; i<=240; i++) {
      for (int j=392; j<=397; j++ ) {
        red[i][j] = 0;
        green[i][j] = 102;
        blue[i][j] = 204;
      }
    }//shade of blue

    for (int i=245; i<=260; i++) {
      for (int j=392; j<=397; j++ ) {
        red[i][j] = 0;
        green[i][j] = 102;
        blue[i][j] = 204;
      }
    }//shade of blue

    for (int i=265; i<=280; i++) {
      for (int j=392; j<=397; j++ ) {
        red[i][j] = 0;
        green[i][j] = 102;
        blue[i][j] = 204;
      }
    }//shade of blue

    for (int i=285; i<=300; i++) {
      for (int j=392; j<=397; j++ ) {
        red[i][j] = 0;
        green[i][j] = 102;
        blue[i][j] = 204;
      }
    }//shade of blue

    for (int i=305; i<=320; i++) {
      for (int j=392; j<=397; j++ ) {
        red[i][j] = 0;
        green[i][j] = 102;
        blue[i][j] = 204;
      }
    }//shade of blue

    for (int i=325; i<=340; i++) {
      for (int j=392; j<=397; j++ ) {
        red[i][j] = 0;
        green[i][j] = 102;
        blue[i][j] = 204;
      }
    }//shade of blue

    for (int i=345; i<=360; i++) {
      for (int j=392; j<=397; j++ ) {
        red[i][j] = 0;
        green[i][j] = 102;
        blue[i][j] = 204;
      }
    }//shade of blue

    for (int i=365; i<=380; i++) {
      for (int j=392; j<=397; j++ ) {
        red[i][j] = 0;
        green[i][j] = 102;
        blue[i][j] = 204;
      }
    }//shade of blue

    for (int i=385; i<=395; i++) {
      for (int j=392; j<=397; j++ ) {
        red[i][j] = 0;
        green[i][j] = 102;
        blue[i][j] = 204;
      }
    }//shade of blue

    //border horizontal up

    for (int i=3; i<=9; i++) {
      for (int j=15; j<=35; j++ ) {
        red[i][j] = 0;
        green[i][j] = 102;
        blue[i][j] = 204;
      }
    }//shade of blue

    for (int i=3; i<=9; i++) {
      for (int j=40; j<=60; j++ ) {
        red[i][j] = 0;
        green[i][j] = 102;
        blue[i][j] = 204;
      }
    }//shade of blue

    for (int i=3; i<=9; i++) {
      for (int j=65; j<=85; j++ ) {
        red[i][j] = 0;
        green[i][j] = 102;
        blue[i][j] = 204;
      }
    }//shade of blue

    for (int i=3; i<=9; i++) {
      for (int j=90; j<=110; j++ ) {
        red[i][j] = 0;
        green[i][j] = 102;
        blue[i][j] = 204;
      }
    }//shade of blue

    for (int i=3; i<=9; i++) {
      for (int j=115; j<=135; j++ ) {
        red[i][j] = 0;
        green[i][j] = 102;
        blue[i][j] = 204;
      }
    }//shade of blue

    for (int i=3; i<=9; i++) {
      for (int j=140; j<=160; j++ ) {
        red[i][j] = 0;
        green[i][j] = 102;
        blue[i][j] = 204;
      }
    }//shade of blue

    for (int i=3; i<=9; i++) {
      for (int j=165; j<=185; j++ ) {
        red[i][j] = 0;
        green[i][j] = 102;
        blue[i][j] = 204;
      }
    }//shade of blue

    for (int i=3; i<=9; i++) {
      for (int j=190; j<=210; j++ ) {
        red[i][j] = 0;
        green[i][j] = 102;
        blue[i][j] = 204;
      }
    }//shade of blue

    for (int i=3; i<=9; i++) {
      for (int j=215; j<=235; j++ ) {
        red[i][j] = 0;
        green[i][j] = 102;
        blue[i][j] = 204;
      }
    }//shade of blue

    for (int i=3; i<=9; i++) {
      for (int j=240; j<=265; j++ ) {
        red[i][j] = 0;
        green[i][j] = 102;
        blue[i][j] = 204;
      }
    }//shade of blue

    for (int i=3; i<=9; i++) {
      for (int j=270; j<=290; j++ ) {
        red[i][j] = 0;
        green[i][j] = 102;
        blue[i][j] = 204;
      }
    }//shade of blue

    for (int i=3; i<=9; i++) {
      for (int j=270; j<=290; j++ ) {
        red[i][j] = 0;
        green[i][j] = 102;
        blue[i][j] = 204;
      }
    }//shade of blue

    for (int i=3; i<=9; i++) {
      for (int j=270; j<=290; j++ ) {
        red[i][j] = 0;
        green[i][j] = 102;
        blue[i][j] = 204;
      }
    }//shade of blue

    for (int i=3; i<=9; i++) {
      for (int j=295; j<=315; j++ ) {
        red[i][j] = 0;
        green[i][j] = 102;
        blue[i][j] = 204;
      }
    }//shade of blue

    for (int i=3; i<=9; i++) {
      for (int j=320; j<=340; j++ ) {
        red[i][j] = 0;
        green[i][j] = 102;
        blue[i][j] = 204;
      }
    }//shade of blue

    for (int i=3; i<=9; i++) {
      for (int j=345; j<=365; j++ ) {
        red[i][j] = 0;
        green[i][j] = 102;
        blue[i][j] = 204;
      }
    }//shade of blue

    for (int i=3; i<=9; i++) {
      for (int j=370; j<=385; j++ ) {
        red[i][j] = 0;
        green[i][j] = 102;
        blue[i][j] = 204;
      }
    }//shade of blue

    //border horizontal down

    for (int i=392; i<=397; i++) {
      for (int j=15; j<=35; j++ ) {
        red[i][j] = 0;
        green[i][j] = 102;
        blue[i][j] = 204;
      }
    }//shade of blue

    for (int i=392; i<=397; i++) {
      for (int j=40; j<=60; j++ ) {
        red[i][j] = 0;
        green[i][j] = 102;
        blue[i][j] = 204;
      }
    }//shade of blue

    for (int i=392; i<=397; i++) {
      for (int j=65; j<=85; j++ ) {
        red[i][j] = 0;
        green[i][j] = 102;
        blue[i][j] = 204;
      }
    }//shade of blue

    for (int i=392; i<=397; i++) {
      for (int j=90; j<=110; j++ ) {
        red[i][j] = 0;
        green[i][j] = 102;
        blue[i][j] = 204;
      }
    }//shade of blue

    for (int i=392; i<=397; i++) {
      for (int j=115; j<=135; j++ ) {
        red[i][j] = 0;
        green[i][j] = 102;
        blue[i][j] = 204;
      }
    }//shade of blue

    for (int i=392; i<=397; i++) {
      for (int j=140; j<=160; j++ ) {
        red[i][j] = 0;
        green[i][j] = 102;
        blue[i][j] = 204;
      }
    }//shade of blue

    for (int i=392; i<=397; i++) {
      for (int j=165; j<=185; j++ ) {
        red[i][j] = 0;
        green[i][j] = 102;
        blue[i][j] = 204;
      }
    }//shade of blue

    for (int i=392; i<=397; i++) {
      for (int j=190; j<=210; j++ ) {
        red[i][j] = 0;
        green[i][j] = 102;
        blue[i][j] = 204;
      }
    }//shade of blue

    for (int i=392; i<=397; i++) {
      for (int j=215; j<=235; j++ ) {
        red[i][j] = 0;
        green[i][j] = 102;
        blue[i][j] = 204;
      }
    }//shade of blue

    for (int i=392; i<=397; i++) {
      for (int j=240; j<=260; j++ ) {
        red[i][j] = 0;
        green[i][j] = 102;
        blue[i][j] = 204;
      }
    }//shade of blue

    for (int i=392; i<=397; i++) {
      for (int j=265; j<=285; j++ ) {
        red[i][j] = 0;
        green[i][j] = 102;
        blue[i][j] = 204;
      }
    }//shade of blue

    for (int i=392; i<=397; i++) {
      for (int j=290; j<=310; j++ ) {
        red[i][j] = 0;
        green[i][j] = 102;
        blue[i][j] = 204;
      }
    }//shade of blue

    for (int i=392; i<=397; i++) {
      for (int j=315; j<=335; j++ ) {
        red[i][j] = 0;
        green[i][j] = 102;
        blue[i][j] = 204;
      }
    }//shade of blue

    for (int i=392; i<=397; i++) {
      for (int j=340; j<=360; j++ ) {
        red[i][j] = 0;
        green[i][j] = 102;
        blue[i][j] = 204;
      }
    }//shade of blue

    for (int i=392; i<=397; i++) {
      for (int j=365; j<=385; j++ ) {
        red[i][j] = 0;
        green[i][j] = 102;
        blue[i][j] = 204;
      }
    }//shade of blue








    // when arrays are filled, send them to writeFile
    writeFile(red, green, blue);
  }//end main


/**
 * Given 3 parallel arrays, Writefile will write an output
 * file in PPM format that can be viewed with a ppm viewer.
 * All 3 arrays must be the same size.
 * @param r 2 dimentional array of integers from 0 - 255
 * @param g 2 dimentional array of integers from 0 - 255
 * @param b 2 dimentional array of integers from 0 - 255
 * you do not need to edit this method
 */
  		public static void writeFile(int[][] r, int[][] g, int[][] b) {
        //the output will be based on the array size sent.
        int size = r.length;
        //pixel will store the color to be output to the file.
        String pixel;
        try {
          //open a file in the current directory. will overwrite
          //previous versions.
          File output = new File("output.ppm");
          FileWriter fw = new FileWriter(output);
          //create the header of PPM files.
          fw.write("P3\n"+ size + " " + size +"\n255\n");
          //write out all pixels from the RGB arrays.
          for (int i = 0; i < size ; i++) {
            for (int j = 0; j < size ; j++) {
              pixel = String.format("%d %d %d ",r[i][j], g[i][j], b[i][j]);
              fw.write(pixel);
            }//end for j
          }//end for i
          fw.close();
        } catch(Exception e) {
          System.out.println("Error writing file.");
        }//end try catch

  	} // end writeFile2
  }  // end class
