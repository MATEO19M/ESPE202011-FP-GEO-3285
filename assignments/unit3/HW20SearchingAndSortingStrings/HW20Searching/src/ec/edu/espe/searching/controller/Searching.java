package ec.edu.espe.searching.controller;

public class Searching {
public static int findLaptopsBrands(String[] LaptopsBrands, String searchLaptopsBrands) {
       for (int i = 0; i < 6; i++) {
            if (searchLaptopsBrands.equals(LaptopsBrands[i])) {
                return 1;
            }
        }
    return -1;
    }
}
