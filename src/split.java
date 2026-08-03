class split {
    public static void main(String[] args) {

        // Example 1: Splitting a string using a comma delimiter
        String cities = "Delhi,Mumbai,Chennai,Kolkata";
        String firstCity = cities.split(",")[0]; // Split by comma and get the first city
        String secondCity = cities.split(",")[1]; // Get the second city

        System.out.println("First city: " + firstCity);

        // Example 2: Limiting the number of splits
        String text = "apple-orange-grape-banana";
        String firstPart = text.split("-")[0];  // First part before the first '-'
        String secondPart = text.split("-")[1] + "-" + text.split("-")[2] + "-" + text.split("-")[3]; // Remaining string after the first split

        System.out.println("Remaining string after split: " + secondPart);  // Output: orange-grape-banana
        // Example 3: Using multiple separators
        String products = "laptop;Pc,Mobile";
        String firstProduct = products.split("[;,]")[0]; // Split using both separators and extract the first product
        String secondProduct = products.split("[;,]")[1]; // Extract the second product
        String thirdProduct = products.split("[;,]")[2]; // Extract the third product

        System.out.println("First product: " + firstProduct);
        System.out.println("Second product: " + secondProduct);
        System.out.println("Third product: " + thirdProduct);
    }
}