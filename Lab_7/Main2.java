package Lab_7;
// import java.io.*;
// import java.util.*;
// import java.io.BufferedReader;
// import java.io.FileReader;
// import java.io.IOException;
// import java.util.List;
// import java.util.ArrayList;

//  class Iris
//  {
//     private final double a;
//     private final double b;
//     private final double c;
//     private final double d;
//     private final String name;

//     public Iris(double a, double b, double c, double d, String name)
//     {
//         this.a = a;
//         this.b = b;
//         this.c = c;
//         this.d = d;
//         this.name = name;

//     }
//     public double a() {
//         return a;
//     }

//     public double b() {
//         return b;
//     }
//     public double c() {
//         return c;
//     }
//     public double d() {
//         return d;
//     }
//     public String name() {
//         return name;
//     }
// }

// //to read the "iris.csv" file and create an array of 150 Iris objects, we can use the following code:

// public class IrisReader {
//     private static final String FILE_PATH = "iris.csv";

//     public static void main(String[] args) {
//         List<Iris> irisList = IrisUtils.readIriscv("iris.csv");
//         double[] sepalLengths = new double[irisList.size()];
//         double[] sepalWidths = new double[irisList.size()];
//         double[] petalLengths = new double[irisList.size()];
//         double[] petalWidths = new double[irisList.size()];

//         for (int i = 0; i < irisList.size(); i++) {
//             Iris iris = irisList.get(i);
//             sepalLengths[i] = iris.a();
//             sepalWidths[i] = iris.b();
//             petalLengths[i] = iris.c();
//             petalWidths[i] = iris.d();
//         }

//         double[] sepalLengthStats = calculateStats(sepalLengths);
//         double[] sepalWidthStats = calculateStats(sepalWidths);
//         double[] petalLengthStats = calculateStats(petalLengths);
//         double[] petalWidthStats = calculateStats(petalWidths);

//         System.out.println("Sepal Length stats:");
//         System.out.println("Min: " + sepalLengthStats[0]);
//         System.out.println("Max: " + sepalLengthStats[1]);
//         System.out.println("Avg: " + sepalLengthStats[2]);
//         System.out.println("Std Dev: " + sepalLengthStats[3]);

//         System.out.println("Sepal Width stats:");
//         System.out.println("Min: " + sepalWidthStats[0]);
//         System.out.println("Max: " + sepalWidthStats[1]);
//         System.out.println("Avg: " + sepalWidthStats[2]);
//         System.out.println("Std Dev: " + sepalWidthStats[3]);

//         System.out.println("Petal Length stats:");
//         System.out.println("Min: " + petalLengthStats[0]);
//         System.out.println("Max: " + petalLengthStats[1]);
//         System.out.println("Avg: " + petalLengthStats[2]);
//         System.out.println("Std Dev: " + petalLengthStats[3]);

//         System.out.println("Petal Width stats:");
//         System.out.println("Min: " + petalWidthStats[0]);
//         System.out.println("Max: " + petalLengthStats[1]);
//         System.out.println("Avg: " + petalLengthStats[2]);
//         System.out.println("Std Dev: " + petalLengthStats[3]);
//     }
//     public class IrisUtils {
//     public static List<Iris> readIriscv(String filePath) {
//         String line = "";
//         String cvsSplitBy = ",";
//         List<Iris> irisList = new ArrayList<>();
//         try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
//             while ((line = br.readLine()) != null) {
//                 String[] irisData = line.split(cvsSplitBy);
//                 double sepalLength = Double.parseDouble(irisData[0]);
//                 double sepalWidth = Double.parseDouble(irisData[1]);
//                 double petalLength = Double.parseDouble(irisData[2]);
//                 double petalWidth = Double.parseDouble(irisData[3]);
//                 String species = irisData[4];
//                 Iris iris = new Iris(sepalLength, sepalWidth, petalLength, petalWidth, species);
//                 irisList.add(iris);
//             }
//         } catch (IOException e) {
//             e.printStackTrace();
//         }
//         return irisList;
//     }
// }
// public class IrisStats {
//     private List<Double> sepalLengthList = new ArrayList<>();
//     private List<Double> sepalWidthList = new ArrayList<>();
//     private List<Double> petalLengthList = new ArrayList<>();
//     private List<Double> petalWidthList = new ArrayList<>();

//     public void readData(String fileName) throws IOException {
//         BufferedReader br = new BufferedReader(new FileReader(fileName));
//         String line;
//         while ((line = br.readLine()) != null) {
//             String[] values = line.split(",");
//             sepalLengthList.add(Double.parseDouble(values[0]));
//             sepalWidthList.add(Double.parseDouble(values[1]));
//             petalLengthList.add(Double.parseDouble(values[2]));
//             petalWidthList.add(Double.parseDouble(values[3]));
//         }
//         br.close();
//     }

//     public double calculateMean(List<Double> values) {
//         double sum = 0;
//         for (Double value : values) {
//             sum += value;
//         }
//         return sum / values.size();
//     }

//     public double calculateStandardDeviation(List<Double> values) {
//         double mean = calculateMean(values);
//         double sum = 0;
//         for (Double value : values) {
//             sum += Math.pow(value - mean, 2);
//         }
//         double variance = sum / (values.size() - 1);
//         return Math.sqrt(variance);
//     }

//     public void calculateStats() {
//         double sepalLengthMean = calculateMean(sepalLengthList);
//         double sepalWidthMean = calculateMean(sepalWidthList);
//         double petalLengthMean = calculateMean(petalLengthList);
//         double petalWidthMean = calculateMean(petalWidthList);

//         double sepalLengthStdDev = calculateStandardDeviation(sepalLengthList);
//         double sepalWidthStdDev = calculateStandardDeviation(sepalWidthList);
//         double petalLengthStdDev = calculateStandardDeviation(petalLengthList);
//         double petalWidthStdDev = calculateStandardDeviation(petalWidthList);

//         System.out.println("Sepal length mean: " + sepalLengthMean);
//         System.out.println("Sepal length standard deviation: " + sepalLengthStdDev);
//         System.out.println("Sepal width mean: " + sepalWidthMean);
//         System.out.println("Sepal width standard deviation: " + sepalWidthStdDev);
//         System.out.println("Petal length mean: " + petalLengthMean);
//         System.out.println("Petal length standard deviation: " + petalLengthStdDev);
//         System.out.println("Petal width mean: " + petalWidthMean);
//         System.out.println("Petal width standard deviation: " + petalWidthStdDev);
//     }

//     public static void main(String[] args) throws IOException {
//         IrisStats irisStats = new IrisStats();
//         irisStats.readData("iris.csv");
//         irisStats.calculateStats();
//     }
// }

// }





import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Iris {
    private final double sepalLength;
    private final double sepalWidth;
    private final double petalLength;
    private final double petalWidth;
    private final String name;

    public Iris(double sepalLength, double sepalWidth, double petalLength, double petalWidth, String name) {
        this.sepalLength = sepalLength;
        this.sepalWidth = sepalWidth;
        this.petalLength = petalLength;
        this.petalWidth = petalWidth;
        this.name = name;
    }

    // getters and setters
    public double getSepalLength() {
        return sepalLength;
    }

    public double getSepalWidth() {
        return sepalWidth;
    }

    public double getPetalLength() {
        return petalLength;
    }

    public double getPetalWidth() {
        return petalWidth;
    }

    public String getName() {
        return name;
    }
}

public class Main2 {
    public static void main(String[] args) throws IOException {
        // read in csv file
        File file = new File("iris.csv");
        Scanner scanner = new Scanner(file);

        // create list to store Iris objects
        List<Iris> irisList = new ArrayList<>();

        // iterate over csv file and create Iris objects
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] values = line.split(",");
            double sepalLength = Double.parseDouble(values[0]);
            double sepalWidth = Double.parseDouble(values[1]);
            double petalLength = Double.parseDouble(values[2]);
            double petalWidth = Double.parseDouble(values[3]);
            String name = values[4];
            Iris iris = new Iris(sepalLength, sepalWidth, petalLength, petalWidth, name);
            irisList.add(iris);
        }

        // convert list to array
        Iris[] irisArray = irisList.toArray(new Iris[0]);

        // find min, max, average, and standard deviation of each column
        double[] sepalLengths = new double[irisArray.length];
        double[] sepalWidths = new double[irisArray.length];
        double[] petalLengths = new double[irisArray.length];
        double[] petalWidths = new double[irisArray.length];
        for (int i = 0; i < irisArray.length; i++) {
            sepalLengths[i] = irisArray[i].getSepalLength();
            sepalWidths[i] = irisArray[i].getSepalWidth();
            petalLengths[i] = irisArray[i].getPetalLength();
            petalWidths[i] = irisArray[i].getPetalWidth();
        }

        double minSepalLength = min(sepalLengths);
        double maxSepalLength = max(sepalLengths);
        double avgSepalLength = avg(sepalLengths);
        double stdSepalLength = std(sepalLengths);

        double minSepalWidth = min(sepalWidths);
        double maxSepalWidth = max(sepalWidths);
        double avgSepalWidth = avg(sepalWidths);
        double stdSepalWidth = std(sepalWidths);

        double minPetalLength = min(petalLengths);
        double maxPetalLength = max(petalLengths);
        double avgPetalLength = avg(petalLengths);
        double stdPetalLength = std(petalLengths);

        double minPetalWidth = min(petalWidths);
        double maxPetalWidth = max(petalWidths);
        double avgPetalWidth = avg(petalWidths);
        double stdPetalWidth = std(petalWidths);

        // print results

        System.out.println("Sepal Length");
        System.out.println("Min: " + minSepalLength);
        System.out.println("Max: " + maxSepalLength);
        System.out.println("Average: " + avgSepalLength);
        System.out.println("Standard Deviation: " + stdSepalLength);
        System.out.println();

        System.out.println("Sepal Width");
        System.out.println("Min: " + minSepalWidth);
        System.out.println("Max: " + maxSepalWidth);
        System.out.println("Average: " + avgSepalWidth);
        System.out.println("Standard Deviation: " + stdSepalWidth);
        System.out.println();

        System.out.println("Petal Length");
        System.out.println("Min: " + minPetalLength);
        System.out.println("Max: " + maxPetalLength);
        System.out.println("Average: " + avgPetalLength);
        System.out.println("Standard Deviation: " + stdPetalLength);
        System.out.println();

        System.out.println("Petal Width");
        System.out.println("Min: " + minPetalWidth);
        System.out.println("Max: " + maxPetalWidth);
        System.out.println("Average: " + avgPetalWidth);
        System.out.println("Standard Deviation: " + stdPetalWidth);
        System.out.println();

    }

    public static double min(double[] array) {
        double min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static double max(double[] array) {
        double max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static double avg(double[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum / array.length;
    }

    public static double std(double[] array) {
        double avg = avg(array);
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += Math.pow(array[i] - avg, 2);
        }
        return Math.sqrt(sum / (array.length - 1));
    }

}
